(ns cdk.api.services.simspaceweaver
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.simspaceweaver package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.simspaceweaver CfnSimulation$Builder
                                                           CfnSimulation$S3LocationProperty$Builder
                                                           CfnSimulationProps$Builder]))


(defn build-cfn-simulation-builder
  "The build-cfn-simulation-builder function updates a CfnSimulation$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :maximum-duration)]
    (. builder maximumDuration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schema-s3-location)]
    (. builder schemaS3Location data))
  (when-let [data (lookup-entry config id :snapshot-s3-location)]
    (. builder snapshotS3Location data))
  (.build builder))


(defn build-cfn-simulation-props-builder
  "The build-cfn-simulation-props-builder function updates a CfnSimulationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :maximum-duration)]
    (. builder maximumDuration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schema-s3-location)]
    (. builder schemaS3Location data))
  (when-let [data (lookup-entry config id :snapshot-s3-location)]
    (. builder snapshotS3Location data))
  (.build builder))


(defn build-cfn-simulation-s3-location-property-builder
  "The build-cfn-simulation-s3-location-property-builder function updates a CfnSimulation$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulation$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
"
  [^CfnSimulation$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (.build builder))