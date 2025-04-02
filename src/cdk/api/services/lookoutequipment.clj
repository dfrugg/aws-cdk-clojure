(ns cdk.api.services.lookoutequipment
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lookoutequipment package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lookoutequipment CfnInferenceScheduler$Builder
                                                             CfnInferenceScheduler$DataInputConfigurationProperty$Builder
                                                             CfnInferenceScheduler$DataOutputConfigurationProperty$Builder
                                                             CfnInferenceScheduler$InputNameConfigurationProperty$Builder
                                                             CfnInferenceScheduler$S3InputConfigurationProperty$Builder
                                                             CfnInferenceScheduler$S3OutputConfigurationProperty$Builder
                                                             CfnInferenceSchedulerProps$Builder]))


(defn cfn-inference-scheduler-builder>
  "The cfn-inference-scheduler-builder> function updates a CfnInferenceScheduler$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDelayOffsetInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-delay-offset-in-minutes` |
| `dataInputConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-input-configuration` |
| `dataOutputConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-output-configuration` |
| `dataUploadFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-upload-frequency` |
| `inferenceSchedulerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-scheduler-name` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serverSideKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInferenceScheduler$Builder builder id config]
  (when-some [data (lookup-entry config id :data-delay-offset-in-minutes)]
    (. builder dataDelayOffsetInMinutes data))
  (when-some [data (lookup-entry config id :data-input-configuration)]
    (. builder dataInputConfiguration data))
  (when-some [data (lookup-entry config id :data-output-configuration)]
    (. builder dataOutputConfiguration data))
  (when-some [data (lookup-entry config id :data-upload-frequency)]
    (. builder dataUploadFrequency data))
  (when-some [data (lookup-entry config id :inference-scheduler-name)]
    (. builder inferenceSchedulerName data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :server-side-kms-key-id)]
    (. builder serverSideKmsKeyId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-inference-scheduler-builder
  "Creates a  `CfnInferenceScheduler$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-inference-scheduler-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-inference-scheduler-builder> (CfnInferenceScheduler$Builder/create scope (name id)) id config))


(defn cfn-inference-scheduler-data-input-configuration-property-builder>
  "The cfn-inference-scheduler-data-input-configuration-property-builder> function updates a CfnInferenceScheduler$DataInputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$DataInputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inferenceInputNameConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-input-name-configuration` |
| `inputTimeZoneOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-time-zone-offset` |
| `s3InputConfiguration` | software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler$S3InputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-input-configuration` |
"
  [^CfnInferenceScheduler$DataInputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :inference-input-name-configuration)]
    (. builder inferenceInputNameConfiguration data))
  (when-some [data (lookup-entry config id :input-time-zone-offset)]
    (. builder inputTimeZoneOffset data))
  (when-some [data (lookup-entry config id :s3-input-configuration)]
    (. builder s3InputConfiguration data))
  (.build builder))


(defn cfn-inference-scheduler-data-input-configuration-property-builder
  "Creates a  `CfnInferenceScheduler$DataInputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-data-input-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-data-input-configuration-property-builder> (new CfnInferenceScheduler$DataInputConfigurationProperty$Builder) id config))


(defn cfn-inference-scheduler-data-output-configuration-property-builder>
  "The cfn-inference-scheduler-data-output-configuration-property-builder> function updates a CfnInferenceScheduler$DataOutputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$DataOutputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputConfiguration` | software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler$S3OutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-output-configuration` |
"
  [^CfnInferenceScheduler$DataOutputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :s3-output-configuration)]
    (. builder s3OutputConfiguration data))
  (.build builder))


(defn cfn-inference-scheduler-data-output-configuration-property-builder
  "Creates a  `CfnInferenceScheduler$DataOutputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-data-output-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-data-output-configuration-property-builder> (new CfnInferenceScheduler$DataOutputConfigurationProperty$Builder) id config))


(defn cfn-inference-scheduler-input-name-configuration-property-builder>
  "The cfn-inference-scheduler-input-name-configuration-property-builder> function updates a CfnInferenceScheduler$InputNameConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$InputNameConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTimestampDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-timestamp-delimiter` |
| `timestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-format` |
"
  [^CfnInferenceScheduler$InputNameConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-timestamp-delimiter)]
    (. builder componentTimestampDelimiter data))
  (when-some [data (lookup-entry config id :timestamp-format)]
    (. builder timestampFormat data))
  (.build builder))


(defn cfn-inference-scheduler-input-name-configuration-property-builder
  "Creates a  `CfnInferenceScheduler$InputNameConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-input-name-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-input-name-configuration-property-builder> (new CfnInferenceScheduler$InputNameConfigurationProperty$Builder) id config))


(defn cfn-inference-scheduler-props-builder>
  "The cfn-inference-scheduler-props-builder> function updates a CfnInferenceSchedulerProps$Builder instance using the provided configuration.
  The function takes the CfnInferenceSchedulerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDelayOffsetInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-delay-offset-in-minutes` |
| `dataInputConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-input-configuration` |
| `dataOutputConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-output-configuration` |
| `dataUploadFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-upload-frequency` |
| `inferenceSchedulerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-scheduler-name` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serverSideKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-kms-key-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInferenceSchedulerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-delay-offset-in-minutes)]
    (. builder dataDelayOffsetInMinutes data))
  (when-some [data (lookup-entry config id :data-input-configuration)]
    (. builder dataInputConfiguration data))
  (when-some [data (lookup-entry config id :data-output-configuration)]
    (. builder dataOutputConfiguration data))
  (when-some [data (lookup-entry config id :data-upload-frequency)]
    (. builder dataUploadFrequency data))
  (when-some [data (lookup-entry config id :inference-scheduler-name)]
    (. builder inferenceSchedulerName data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :server-side-kms-key-id)]
    (. builder serverSideKmsKeyId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-inference-scheduler-props-builder
  "Creates a  `CfnInferenceSchedulerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-props-builder> (new CfnInferenceSchedulerProps$Builder) id config))


(defn cfn-inference-scheduler-s3-input-configuration-property-builder>
  "The cfn-inference-scheduler-s3-input-configuration-property-builder> function updates a CfnInferenceScheduler$S3InputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$S3InputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnInferenceScheduler$S3InputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-inference-scheduler-s3-input-configuration-property-builder
  "Creates a  `CfnInferenceScheduler$S3InputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-s3-input-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-s3-input-configuration-property-builder> (new CfnInferenceScheduler$S3InputConfigurationProperty$Builder) id config))


(defn cfn-inference-scheduler-s3-output-configuration-property-builder>
  "The cfn-inference-scheduler-s3-output-configuration-property-builder> function updates a CfnInferenceScheduler$S3OutputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceScheduler$S3OutputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnInferenceScheduler$S3OutputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-inference-scheduler-s3-output-configuration-property-builder
  "Creates a  `CfnInferenceScheduler$S3OutputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-inference-scheduler-s3-output-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-inference-scheduler-s3-output-configuration-property-builder> (new CfnInferenceScheduler$S3OutputConfigurationProperty$Builder) id config))