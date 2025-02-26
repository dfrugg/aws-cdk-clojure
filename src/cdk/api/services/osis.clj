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


(defn build-cfn-pipeline-buffer-options-property-builder
  "The build-cfn-pipeline-buffer-options-property-builder function updates a CfnPipeline$BufferOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$BufferOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `persistentBufferEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:persistent-buffer-enabled` |
"
  [^CfnPipeline$BufferOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :persistent-buffer-enabled)]
    (. builder persistentBufferEnabled data))
  (.build builder))


(defn cfn-pipeline-buffer-options-property-builder
  "Creates a  `CfnPipeline$BufferOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-buffer-options-property-builder (new CfnPipeline$BufferOptionsProperty$Builder) id config))


(defn build-cfn-pipeline-builder
  "The build-cfn-pipeline-builder function updates a CfnPipeline$Builder instance using the provided configuration.
  The function takes the CfnPipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcOptions` | software.amazon.awscdk.services.osis.CfnPipeline$VpcOptionsProperty | [[cdk.support/lookup-entry]] | `:vpc-options` |
"
  [^CfnPipeline$Builder builder id config]
  (when-some [data (lookup-entry config id :buffer-options)]
    (. builder bufferOptions data))
  (when-some [data (lookup-entry config id :encryption-at-rest-options)]
    (. builder encryptionAtRestOptions data))
  (when-some [data (lookup-entry config id :log-publishing-options)]
    (. builder logPublishingOptions data))
  (when-some [data (lookup-entry config id :max-units)]
    (. builder maxUnits data))
  (when-some [data (lookup-entry config id :min-units)]
    (. builder minUnits data))
  (when-some [data (lookup-entry config id :pipeline-configuration-body)]
    (. builder pipelineConfigurationBody data))
  (when-some [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-options)]
    (. builder vpcOptions data))
  (.build builder))


(defn cfn-pipeline-builder
  "Creates a  `CfnPipeline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-pipeline-builder (CfnPipeline$Builder/create scope (name id)) id config))


(defn build-cfn-pipeline-cloud-watch-log-destination-property-builder
  "The build-cfn-pipeline-cloud-watch-log-destination-property-builder function updates a CfnPipeline$CloudWatchLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$CloudWatchLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^CfnPipeline$CloudWatchLogDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn cfn-pipeline-cloud-watch-log-destination-property-builder
  "Creates a  `CfnPipeline$CloudWatchLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-cloud-watch-log-destination-property-builder (new CfnPipeline$CloudWatchLogDestinationProperty$Builder) id config))


(defn build-cfn-pipeline-encryption-at-rest-options-property-builder
  "The build-cfn-pipeline-encryption-at-rest-options-property-builder function updates a CfnPipeline$EncryptionAtRestOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$EncryptionAtRestOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnPipeline$EncryptionAtRestOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-pipeline-encryption-at-rest-options-property-builder
  "Creates a  `CfnPipeline$EncryptionAtRestOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-encryption-at-rest-options-property-builder (new CfnPipeline$EncryptionAtRestOptionsProperty$Builder) id config))


(defn build-cfn-pipeline-log-publishing-options-property-builder
  "The build-cfn-pipeline-log-publishing-options-property-builder function updates a CfnPipeline$LogPublishingOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$LogPublishingOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogDestination` | software.amazon.awscdk.services.osis.CfnPipeline$CloudWatchLogDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-log-destination` |
| `isLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-logging-enabled` |
"
  [^CfnPipeline$LogPublishingOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-log-destination)]
    (. builder cloudWatchLogDestination data))
  (when-some [data (lookup-entry config id :is-logging-enabled)]
    (. builder isLoggingEnabled data))
  (.build builder))


(defn cfn-pipeline-log-publishing-options-property-builder
  "Creates a  `CfnPipeline$LogPublishingOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-log-publishing-options-property-builder (new CfnPipeline$LogPublishingOptionsProperty$Builder) id config))


(defn build-cfn-pipeline-props-builder
  "The build-cfn-pipeline-props-builder function updates a CfnPipelineProps$Builder instance using the provided configuration.
  The function takes the CfnPipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |
"
  [^CfnPipelineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :buffer-options)]
    (. builder bufferOptions data))
  (when-some [data (lookup-entry config id :encryption-at-rest-options)]
    (. builder encryptionAtRestOptions data))
  (when-some [data (lookup-entry config id :log-publishing-options)]
    (. builder logPublishingOptions data))
  (when-some [data (lookup-entry config id :max-units)]
    (. builder maxUnits data))
  (when-some [data (lookup-entry config id :min-units)]
    (. builder minUnits data))
  (when-some [data (lookup-entry config id :pipeline-configuration-body)]
    (. builder pipelineConfigurationBody data))
  (when-some [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-options)]
    (. builder vpcOptions data))
  (.build builder))


(defn cfn-pipeline-props-builder
  "Creates a  `CfnPipelineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-props-builder (new CfnPipelineProps$Builder) id config))


(defn build-cfn-pipeline-vpc-endpoint-property-builder
  "The build-cfn-pipeline-vpc-endpoint-property-builder function updates a CfnPipeline$VpcEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$VpcEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpcOptions` | software.amazon.awscdk.services.osis.CfnPipeline$VpcOptionsProperty | [[cdk.support/lookup-entry]] | `:vpc-options` |
"
  [^CfnPipeline$VpcEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (when-some [data (lookup-entry config id :vpc-options)]
    (. builder vpcOptions data))
  (.build builder))


(defn cfn-pipeline-vpc-endpoint-property-builder
  "Creates a  `CfnPipeline$VpcEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-vpc-endpoint-property-builder (new CfnPipeline$VpcEndpointProperty$Builder) id config))


(defn build-cfn-pipeline-vpc-options-property-builder
  "The build-cfn-pipeline-vpc-options-property-builder function updates a CfnPipeline$VpcOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$VpcOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnPipeline$VpcOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-pipeline-vpc-options-property-builder
  "Creates a  `CfnPipeline$VpcOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-pipeline-vpc-options-property-builder (new CfnPipeline$VpcOptionsProperty$Builder) id config))