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


(defn build-cfn-alert-action-property-builder
  "The build-cfn-alert-action-property-builder function updates a CfnAlert$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnAlert$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-configuration` |
| `snsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns-configuration` |
"
  [^CfnAlert$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-configuration)]
    (. builder lambdaConfiguration data))
  (when-some [data (lookup-entry config id :sns-configuration)]
    (. builder snsConfiguration data))
  (.build builder))


(defn cfn-alert-action-property-builder
  "Creates a  `CfnAlert$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alert-action-property-builder (new CfnAlert$ActionProperty$Builder) id config))


(defn build-cfn-alert-builder
  "The build-cfn-alert-builder function updates a CfnAlert$Builder instance using the provided configuration.
  The function takes the CfnAlert$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `alertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-description` |
| `alertName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-name` |
| `alertSensitivityThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:alert-sensitivity-threshold` |
| `anomalyDetectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-arn` |
"
  [^CfnAlert$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :alert-description)]
    (. builder alertDescription data))
  (when-some [data (lookup-entry config id :alert-name)]
    (. builder alertName data))
  (when-some [data (lookup-entry config id :alert-sensitivity-threshold)]
    (. builder alertSensitivityThreshold data))
  (when-some [data (lookup-entry config id :anomaly-detector-arn)]
    (. builder anomalyDetectorArn data))
  (.build builder))


(defn cfn-alert-builder
  "Creates a  `CfnAlert$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-alert-builder (CfnAlert$Builder/create scope (name id)) id config))


(defn build-cfn-alert-lambda-configuration-property-builder
  "The build-cfn-alert-lambda-configuration-property-builder function updates a CfnAlert$LambdaConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAlert$LambdaConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnAlert$LambdaConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-alert-lambda-configuration-property-builder
  "Creates a  `CfnAlert$LambdaConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alert-lambda-configuration-property-builder (new CfnAlert$LambdaConfigurationProperty$Builder) id config))


(defn build-cfn-alert-props-builder
  "The build-cfn-alert-props-builder function updates a CfnAlertProps$Builder instance using the provided configuration.
  The function takes the CfnAlertProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `alertDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-description` |
| `alertName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-name` |
| `alertSensitivityThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:alert-sensitivity-threshold` |
| `anomalyDetectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-arn` |
"
  [^CfnAlertProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :alert-description)]
    (. builder alertDescription data))
  (when-some [data (lookup-entry config id :alert-name)]
    (. builder alertName data))
  (when-some [data (lookup-entry config id :alert-sensitivity-threshold)]
    (. builder alertSensitivityThreshold data))
  (when-some [data (lookup-entry config id :anomaly-detector-arn)]
    (. builder anomalyDetectorArn data))
  (.build builder))


(defn cfn-alert-props-builder
  "Creates a  `CfnAlertProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alert-props-builder (new CfnAlertProps$Builder) id config))


(defn build-cfn-alert-sns-configuration-property-builder
  "The build-cfn-alert-sns-configuration-property-builder function updates a CfnAlert$SNSConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAlert$SNSConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnAlert$SNSConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn cfn-alert-sns-configuration-property-builder
  "Creates a  `CfnAlert$SNSConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-alert-sns-configuration-property-builder (new CfnAlert$SNSConfigurationProperty$Builder) id config))


(defn build-cfn-anomaly-detector-anomaly-detector-config-property-builder
  "The build-cfn-anomaly-detector-anomaly-detector-config-property-builder function updates a CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-frequency` |
"
  [^CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :anomaly-detector-frequency)]
    (. builder anomalyDetectorFrequency data))
  (.build builder))


(defn cfn-anomaly-detector-anomaly-detector-config-property-builder
  "Creates a  `CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-anomaly-detector-config-property-builder (new CfnAnomalyDetector$AnomalyDetectorConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-app-flow-config-property-builder
  "The build-cfn-anomaly-detector-app-flow-config-property-builder function updates a CfnAnomalyDetector$AppFlowConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$AppFlowConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnAnomalyDetector$AppFlowConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-name)]
    (. builder flowName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-anomaly-detector-app-flow-config-property-builder
  "Creates a  `CfnAnomalyDetector$AppFlowConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-app-flow-config-property-builder (new CfnAnomalyDetector$AppFlowConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-builder
  "The build-cfn-anomaly-detector-builder function updates a CfnAnomalyDetector$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anomaly-detector-config` |
| `anomalyDetectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-description` |
| `anomalyDetectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `metricSetList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-set-list` |
"
  [^CfnAnomalyDetector$Builder builder id config]
  (when-some [data (lookup-entry config id :anomaly-detector-config)]
    (. builder anomalyDetectorConfig data))
  (when-some [data (lookup-entry config id :anomaly-detector-description)]
    (. builder anomalyDetectorDescription data))
  (when-some [data (lookup-entry config id :anomaly-detector-name)]
    (. builder anomalyDetectorName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :metric-set-list)]
    (. builder metricSetList data))
  (.build builder))


(defn cfn-anomaly-detector-builder
  "Creates a  `CfnAnomalyDetector$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-anomaly-detector-builder (CfnAnomalyDetector$Builder/create scope (name id)) id config))


(defn build-cfn-anomaly-detector-cloudwatch-config-property-builder
  "The build-cfn-anomaly-detector-cloudwatch-config-property-builder function updates a CfnAnomalyDetector$CloudwatchConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$CloudwatchConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnAnomalyDetector$CloudwatchConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-anomaly-detector-cloudwatch-config-property-builder
  "Creates a  `CfnAnomalyDetector$CloudwatchConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-cloudwatch-config-property-builder (new CfnAnomalyDetector$CloudwatchConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-csv-format-descriptor-property-builder
  "The build-cfn-anomaly-detector-csv-format-descriptor-property-builder function updates a CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `charset` | java.lang.String | [[cdk.support/lookup-entry]] | `:charset` |
| `containsHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contains-header` |
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `fileCompression` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-compression` |
| `headerList` | java.util.List | [[cdk.support/lookup-entry]] | `:header-list` |
| `quoteSymbol` | java.lang.String | [[cdk.support/lookup-entry]] | `:quote-symbol` |
"
  [^CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :charset)]
    (. builder charset data))
  (when-some [data (lookup-entry config id :contains-header)]
    (. builder containsHeader data))
  (when-some [data (lookup-entry config id :delimiter)]
    (. builder delimiter data))
  (when-some [data (lookup-entry config id :file-compression)]
    (. builder fileCompression data))
  (when-some [data (lookup-entry config id :header-list)]
    (. builder headerList data))
  (when-some [data (lookup-entry config id :quote-symbol)]
    (. builder quoteSymbol data))
  (.build builder))


(defn cfn-anomaly-detector-csv-format-descriptor-property-builder
  "Creates a  `CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-csv-format-descriptor-property-builder (new CfnAnomalyDetector$CsvFormatDescriptorProperty$Builder) id config))


(defn build-cfn-anomaly-detector-file-format-descriptor-property-builder
  "The build-cfn-anomaly-detector-file-format-descriptor-property-builder function updates a CfnAnomalyDetector$FileFormatDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$FileFormatDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvFormatDescriptor` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv-format-descriptor` |
| `jsonFormatDescriptor` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$JsonFormatDescriptorProperty | [[cdk.support/lookup-entry]] | `:json-format-descriptor` |
"
  [^CfnAnomalyDetector$FileFormatDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :csv-format-descriptor)]
    (. builder csvFormatDescriptor data))
  (when-some [data (lookup-entry config id :json-format-descriptor)]
    (. builder jsonFormatDescriptor data))
  (.build builder))


(defn cfn-anomaly-detector-file-format-descriptor-property-builder
  "Creates a  `CfnAnomalyDetector$FileFormatDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-file-format-descriptor-property-builder (new CfnAnomalyDetector$FileFormatDescriptorProperty$Builder) id config))


(defn build-cfn-anomaly-detector-json-format-descriptor-property-builder
  "The build-cfn-anomaly-detector-json-format-descriptor-property-builder function updates a CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `charset` | java.lang.String | [[cdk.support/lookup-entry]] | `:charset` |
| `fileCompression` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-compression` |
"
  [^CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :charset)]
    (. builder charset data))
  (when-some [data (lookup-entry config id :file-compression)]
    (. builder fileCompression data))
  (.build builder))


(defn cfn-anomaly-detector-json-format-descriptor-property-builder
  "Creates a  `CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-json-format-descriptor-property-builder (new CfnAnomalyDetector$JsonFormatDescriptorProperty$Builder) id config))


(defn build-cfn-anomaly-detector-metric-property-builder
  "The build-cfn-anomaly-detector-metric-property-builder function updates a CfnAnomalyDetector$MetricProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationFunction` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-function` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnAnomalyDetector$MetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-function)]
    (. builder aggregationFunction data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-anomaly-detector-metric-property-builder
  "Creates a  `CfnAnomalyDetector$MetricProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-metric-property-builder (new CfnAnomalyDetector$MetricProperty$Builder) id config))


(defn build-cfn-anomaly-detector-metric-set-property-builder
  "The build-cfn-anomaly-detector-metric-set-property-builder function updates a CfnAnomalyDetector$MetricSetProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^CfnAnomalyDetector$MetricSetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimension-list)]
    (. builder dimensionList data))
  (when-some [data (lookup-entry config id :metric-list)]
    (. builder metricList data))
  (when-some [data (lookup-entry config id :metric-set-description)]
    (. builder metricSetDescription data))
  (when-some [data (lookup-entry config id :metric-set-frequency)]
    (. builder metricSetFrequency data))
  (when-some [data (lookup-entry config id :metric-set-name)]
    (. builder metricSetName data))
  (when-some [data (lookup-entry config id :metric-source)]
    (. builder metricSource data))
  (when-some [data (lookup-entry config id :offset)]
    (. builder offset data))
  (when-some [data (lookup-entry config id :timestamp-column)]
    (. builder timestampColumn data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn cfn-anomaly-detector-metric-set-property-builder
  "Creates a  `CfnAnomalyDetector$MetricSetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-metric-set-property-builder (new CfnAnomalyDetector$MetricSetProperty$Builder) id config))


(defn build-cfn-anomaly-detector-metric-source-property-builder
  "The build-cfn-anomaly-detector-metric-source-property-builder function updates a CfnAnomalyDetector$MetricSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$MetricSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appFlowConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-flow-config` |
| `cloudwatchConfig` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$CloudwatchConfigProperty | [[cdk.support/lookup-entry]] | `:cloudwatch-config` |
| `rdsSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rds-source-config` |
| `redshiftSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-source-config` |
| `s3SourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-source-config` |
"
  [^CfnAnomalyDetector$MetricSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :app-flow-config)]
    (. builder appFlowConfig data))
  (when-some [data (lookup-entry config id :cloudwatch-config)]
    (. builder cloudwatchConfig data))
  (when-some [data (lookup-entry config id :rds-source-config)]
    (. builder rdsSourceConfig data))
  (when-some [data (lookup-entry config id :redshift-source-config)]
    (. builder redshiftSourceConfig data))
  (when-some [data (lookup-entry config id :s3-source-config)]
    (. builder s3SourceConfig data))
  (.build builder))


(defn cfn-anomaly-detector-metric-source-property-builder
  "Creates a  `CfnAnomalyDetector$MetricSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-metric-source-property-builder (new CfnAnomalyDetector$MetricSourceProperty$Builder) id config))


(defn build-cfn-anomaly-detector-props-builder
  "The build-cfn-anomaly-detector-props-builder function updates a CfnAnomalyDetectorProps$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anomalyDetectorConfig` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$AnomalyDetectorConfigProperty | [[cdk.support/lookup-entry]] | `:anomaly-detector-config` |
| `anomalyDetectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-description` |
| `anomalyDetectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:anomaly-detector-name` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `metricSetList` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-set-list` |
"
  [^CfnAnomalyDetectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :anomaly-detector-config)]
    (. builder anomalyDetectorConfig data))
  (when-some [data (lookup-entry config id :anomaly-detector-description)]
    (. builder anomalyDetectorDescription data))
  (when-some [data (lookup-entry config id :anomaly-detector-name)]
    (. builder anomalyDetectorName data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :metric-set-list)]
    (. builder metricSetList data))
  (.build builder))


(defn cfn-anomaly-detector-props-builder
  "Creates a  `CfnAnomalyDetectorProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-props-builder (new CfnAnomalyDetectorProps$Builder) id config))


(defn build-cfn-anomaly-detector-rds-source-config-property-builder
  "The build-cfn-anomaly-detector-rds-source-config-property-builder function updates a CfnAnomalyDetector$RDSSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$RDSSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAnomalyDetector$RDSSourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-host)]
    (. builder databaseHost data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :database-port)]
    (. builder databasePort data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-manager-arn)]
    (. builder secretManagerArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-anomaly-detector-rds-source-config-property-builder
  "Creates a  `CfnAnomalyDetector$RDSSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-rds-source-config-property-builder (new CfnAnomalyDetector$RDSSourceConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-redshift-source-config-property-builder
  "The build-cfn-anomaly-detector-redshift-source-config-property-builder function updates a CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `databaseHost` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-host` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `databasePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:database-port` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :database-host)]
    (. builder databaseHost data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :database-port)]
    (. builder databasePort data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-manager-arn)]
    (. builder secretManagerArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-anomaly-detector-redshift-source-config-property-builder
  "Creates a  `CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-redshift-source-config-property-builder (new CfnAnomalyDetector$RedshiftSourceConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-s3-source-config-property-builder
  "The build-cfn-anomaly-detector-s3-source-config-property-builder function updates a CfnAnomalyDetector$S3SourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$S3SourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileFormatDescriptor` | software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector$FileFormatDescriptorProperty | [[cdk.support/lookup-entry]] | `:file-format-descriptor` |
| `historicalDataPathList` | java.util.List | [[cdk.support/lookup-entry]] | `:historical-data-path-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `templatedPathList` | java.util.List | [[cdk.support/lookup-entry]] | `:templated-path-list` |
"
  [^CfnAnomalyDetector$S3SourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :file-format-descriptor)]
    (. builder fileFormatDescriptor data))
  (when-some [data (lookup-entry config id :historical-data-path-list)]
    (. builder historicalDataPathList data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :templated-path-list)]
    (. builder templatedPathList data))
  (.build builder))


(defn cfn-anomaly-detector-s3-source-config-property-builder
  "Creates a  `CfnAnomalyDetector$S3SourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-s3-source-config-property-builder (new CfnAnomalyDetector$S3SourceConfigProperty$Builder) id config))


(defn build-cfn-anomaly-detector-timestamp-column-property-builder
  "The build-cfn-anomaly-detector-timestamp-column-property-builder function updates a CfnAnomalyDetector$TimestampColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$TimestampColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-format` |
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
"
  [^CfnAnomalyDetector$TimestampColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column-format)]
    (. builder columnFormat data))
  (when-some [data (lookup-entry config id :column-name)]
    (. builder columnName data))
  (.build builder))


(defn cfn-anomaly-detector-timestamp-column-property-builder
  "Creates a  `CfnAnomalyDetector$TimestampColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-timestamp-column-property-builder (new CfnAnomalyDetector$TimestampColumnProperty$Builder) id config))


(defn build-cfn-anomaly-detector-vpc-configuration-property-builder
  "The build-cfn-anomaly-detector-vpc-configuration-property-builder function updates a CfnAnomalyDetector$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnomalyDetector$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-id-list` |
| `subnetIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-id-list` |
"
  [^CfnAnomalyDetector$VpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-id-list)]
    (. builder securityGroupIdList data))
  (when-some [data (lookup-entry config id :subnet-id-list)]
    (. builder subnetIdList data))
  (.build builder))


(defn cfn-anomaly-detector-vpc-configuration-property-builder
  "Creates a  `CfnAnomalyDetector$VpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-anomaly-detector-vpc-configuration-property-builder (new CfnAnomalyDetector$VpcConfigurationProperty$Builder) id config))