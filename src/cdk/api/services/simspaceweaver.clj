(ns cdk.api.services.simspaceweaver
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.simspaceweaver package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.simspaceweaver CfnSimulation$Builder
                                                           CfnSimulation$S3LocationProperty$Builder
                                                           CfnSimulationProps$Builder]))


(defn cfn-simulation-builder>
  "The cfn-simulation-builder> function updates a CfnSimulation$Builder instance using the provided configuration.
  The function takes the CfnSimulation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schemaS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-s3-location` |
| `snapshotS3Location` | software.amazon.awscdk.services.simspaceweaver.CfnSimulation$S3LocationProperty | [[cdk.support/lookup-entry]] | `:snapshot-s3-location` |
"
  [^CfnSimulation$Builder builder id config]
  (when-some [data (lookup-entry config id :maximum-duration)]
    (. builder maximumDuration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :schema-s3-location)]
    (. builder schemaS3Location data))
  (when-some [data (lookup-entry config id :snapshot-s3-location)]
    (. builder snapshotS3Location data))
  (.build builder))


(defn cfn-simulation-builder
  "Creates a  `CfnSimulation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-simulation-builder> (CfnSimulation$Builder/create scope (name id)) id config))


(defn cfn-simulation-props-builder>
  "The cfn-simulation-props-builder> function updates a CfnSimulationProps$Builder instance using the provided configuration.
  The function takes the CfnSimulationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schemaS3Location` | software.amazon.awscdk.services.simspaceweaver.CfnSimulation$S3LocationProperty | [[cdk.support/lookup-entry]] | `:schema-s3-location` |
| `snapshotS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-s3-location` |
"
  [^CfnSimulationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :maximum-duration)]
    (. builder maximumDuration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :schema-s3-location)]
    (. builder schemaS3Location data))
  (when-some [data (lookup-entry config id :snapshot-s3-location)]
    (. builder snapshotS3Location data))
  (.build builder))


(defn cfn-simulation-props-builder
  "Creates a  `CfnSimulationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-props-builder> (new CfnSimulationProps$Builder) id config))


(defn cfn-simulation-s3-location-property-builder>
  "The cfn-simulation-s3-location-property-builder> function updates a CfnSimulation$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulation$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
"
  [^CfnSimulation$S3LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (.build builder))


(defn cfn-simulation-s3-location-property-builder
  "Creates a  `CfnSimulation$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-s3-location-property-builder> (new CfnSimulation$S3LocationProperty$Builder) id config))