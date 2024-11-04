(ns cdk.api.services.osis
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.osis package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.osis CfnPipeline$BufferOptionsProperty$Builder
                                                 CfnPipeline$Builder
                                                 CfnPipeline$CloudWatchLogDestinationProperty$Builder
                                                 CfnPipeline$EncryptionAtRestOptionsProperty$Builder
                                                 CfnPipeline$LogPublishingOptionsProperty$Builder
                                                 CfnPipeline$VpcEndpointProperty$Builder
                                                 CfnPipeline$VpcOptionsProperty$Builder
                                                 CfnPipelineProps$Builder]))


(defn cfn-pipeline-buffer-options-property-builder
  "The cfn-pipeline-buffer-options-property-builder function buildes out new instances of 
CfnPipeline$BufferOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `persistentBufferEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:persistent-buffer-enabled` |"
  [stack id config]
  (let [builder (CfnPipeline$BufferOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :persistent-buffer-enabled)]
      (. builder persistentBufferEnabled data))
    (.build builder)))


(defn cfn-pipeline-builder
  "The cfn-pipeline-builder function buildes out new instances of 
CfnPipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferOptions` | software.amazon.awscdk.services.osis.CfnPipeline$BufferOptionsProperty | [[cdk.support/lookup-entry]] | `:buffer-options` |
| `encryptionAtRestOptions` | software.amazon.awscdk.services.osis.CfnPipeline$EncryptionAtRestOptionsProperty | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `logPublishingOptions` | software.amazon.awscdk.services.osis.CfnPipeline$LogPublishingOptionsProperty | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `maxUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-units` |
| `minUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-units` |
| `pipelineConfigurationBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-configuration-body` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcOptions` | software.amazon.awscdk.services.osis.CfnPipeline$VpcOptionsProperty | [[cdk.support/lookup-entry]] | `:vpc-options` |"
  [stack id config]
  (let [builder (CfnPipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :buffer-options)]
      (. builder bufferOptions data))
    (when-let [data (lookup-entry config id :encryption-at-rest-options)]
      (. builder encryptionAtRestOptions data))
    (when-let [data (lookup-entry config id :log-publishing-options)]
      (. builder logPublishingOptions data))
    (when-let [data (lookup-entry config id :max-units)]
      (. builder maxUnits data))
    (when-let [data (lookup-entry config id :min-units)]
      (. builder minUnits data))
    (when-let [data (lookup-entry config id :pipeline-configuration-body)]
      (. builder pipelineConfigurationBody data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-options)]
      (. builder vpcOptions data))
    (.build builder)))


(defn cfn-pipeline-cloud-watch-log-destination-property-builder
  "The cfn-pipeline-cloud-watch-log-destination-property-builder function buildes out new instances of 
CfnPipeline$CloudWatchLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (CfnPipeline$CloudWatchLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))


(defn cfn-pipeline-encryption-at-rest-options-property-builder
  "The cfn-pipeline-encryption-at-rest-options-property-builder function buildes out new instances of 
CfnPipeline$EncryptionAtRestOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnPipeline$EncryptionAtRestOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-pipeline-log-publishing-options-property-builder
  "The cfn-pipeline-log-publishing-options-property-builder function buildes out new instances of 
CfnPipeline$LogPublishingOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogDestination` | software.amazon.awscdk.services.osis.CfnPipeline$CloudWatchLogDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-log-destination` |
| `isLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-logging-enabled` |"
  [stack id config]
  (let [builder (CfnPipeline$LogPublishingOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-log-destination)]
      (. builder cloudWatchLogDestination data))
    (when-let [data (lookup-entry config id :is-logging-enabled)]
      (. builder isLoggingEnabled data))
    (.build builder)))


(defn cfn-pipeline-props-builder
  "The cfn-pipeline-props-builder function buildes out new instances of 
CfnPipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bufferOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:buffer-options` |
| `encryptionAtRestOptions` | software.amazon.awscdk.services.osis.CfnPipeline$EncryptionAtRestOptionsProperty | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `logPublishingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `maxUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-units` |
| `minUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-units` |
| `pipelineConfigurationBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-configuration-body` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |"
  [stack id config]
  (let [builder (CfnPipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :buffer-options)]
      (. builder bufferOptions data))
    (when-let [data (lookup-entry config id :encryption-at-rest-options)]
      (. builder encryptionAtRestOptions data))
    (when-let [data (lookup-entry config id :log-publishing-options)]
      (. builder logPublishingOptions data))
    (when-let [data (lookup-entry config id :max-units)]
      (. builder maxUnits data))
    (when-let [data (lookup-entry config id :min-units)]
      (. builder minUnits data))
    (when-let [data (lookup-entry config id :pipeline-configuration-body)]
      (. builder pipelineConfigurationBody data))
    (when-let [data (lookup-entry config id :pipeline-name)]
      (. builder pipelineName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-options)]
      (. builder vpcOptions data))
    (.build builder)))


(defn cfn-pipeline-vpc-endpoint-property-builder
  "The cfn-pipeline-vpc-endpoint-property-builder function buildes out new instances of 
CfnPipeline$VpcEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpcOptions` | software.amazon.awscdk.services.osis.CfnPipeline$VpcOptionsProperty | [[cdk.support/lookup-entry]] | `:vpc-options` |"
  [stack id config]
  (let [builder (CfnPipeline$VpcEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpc-options)]
      (. builder vpcOptions data))
    (.build builder)))


(defn cfn-pipeline-vpc-options-property-builder
  "The cfn-pipeline-vpc-options-property-builder function buildes out new instances of 
CfnPipeline$VpcOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnPipeline$VpcOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))