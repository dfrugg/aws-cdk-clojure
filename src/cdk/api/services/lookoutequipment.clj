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


(defn cfn-inference-scheduler-builder
  "The cfn-inference-scheduler-builder function buildes out new instances of 
CfnInferenceScheduler$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-delay-offset-in-minutes)]
      (. builder dataDelayOffsetInMinutes data))
    (when-let [data (lookup-entry config id :data-input-configuration)]
      (. builder dataInputConfiguration data))
    (when-let [data (lookup-entry config id :data-output-configuration)]
      (. builder dataOutputConfiguration data))
    (when-let [data (lookup-entry config id :data-upload-frequency)]
      (. builder dataUploadFrequency data))
    (when-let [data (lookup-entry config id :inference-scheduler-name)]
      (. builder inferenceSchedulerName data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :server-side-kms-key-id)]
      (. builder serverSideKmsKeyId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-inference-scheduler-data-input-configuration-property-builder
  "The cfn-inference-scheduler-data-input-configuration-property-builder function buildes out new instances of 
CfnInferenceScheduler$DataInputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inferenceInputNameConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-input-name-configuration` |
| `inputTimeZoneOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-time-zone-offset` |
| `s3InputConfiguration` | software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler$S3InputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-input-configuration` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$DataInputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :inference-input-name-configuration)]
      (. builder inferenceInputNameConfiguration data))
    (when-let [data (lookup-entry config id :input-time-zone-offset)]
      (. builder inputTimeZoneOffset data))
    (when-let [data (lookup-entry config id :s3-input-configuration)]
      (. builder s3InputConfiguration data))
    (.build builder)))


(defn cfn-inference-scheduler-data-output-configuration-property-builder
  "The cfn-inference-scheduler-data-output-configuration-property-builder function buildes out new instances of 
CfnInferenceScheduler$DataOutputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputConfiguration` | software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler$S3OutputConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-output-configuration` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$DataOutputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-output-configuration)]
      (. builder s3OutputConfiguration data))
    (.build builder)))


(defn cfn-inference-scheduler-input-name-configuration-property-builder
  "The cfn-inference-scheduler-input-name-configuration-property-builder function buildes out new instances of 
CfnInferenceScheduler$InputNameConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTimestampDelimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-timestamp-delimiter` |
| `timestampFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:timestamp-format` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$InputNameConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-timestamp-delimiter)]
      (. builder componentTimestampDelimiter data))
    (when-let [data (lookup-entry config id :timestamp-format)]
      (. builder timestampFormat data))
    (.build builder)))


(defn cfn-inference-scheduler-props-builder
  "The cfn-inference-scheduler-props-builder function buildes out new instances of 
CfnInferenceSchedulerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInferenceSchedulerProps$Builder.)]
    (when-let [data (lookup-entry config id :data-delay-offset-in-minutes)]
      (. builder dataDelayOffsetInMinutes data))
    (when-let [data (lookup-entry config id :data-input-configuration)]
      (. builder dataInputConfiguration data))
    (when-let [data (lookup-entry config id :data-output-configuration)]
      (. builder dataOutputConfiguration data))
    (when-let [data (lookup-entry config id :data-upload-frequency)]
      (. builder dataUploadFrequency data))
    (when-let [data (lookup-entry config id :inference-scheduler-name)]
      (. builder inferenceSchedulerName data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :server-side-kms-key-id)]
      (. builder serverSideKmsKeyId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-inference-scheduler-s3-input-configuration-property-builder
  "The cfn-inference-scheduler-s3-input-configuration-property-builder function buildes out new instances of 
CfnInferenceScheduler$S3InputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$S3InputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-inference-scheduler-s3-output-configuration-property-builder
  "The cfn-inference-scheduler-s3-output-configuration-property-builder function buildes out new instances of 
CfnInferenceScheduler$S3OutputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnInferenceScheduler$S3OutputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))