(ns cdk.api.services.simspaceweaver
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.simspaceweaver package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.simspaceweaver CfnSimulation$Builder
                                                           CfnSimulation$S3LocationProperty$Builder
                                                           CfnSimulationProps$Builder]))


(defn cfn-simulation-builder
  "The cfn-simulation-builder function buildes out new instances of 
CfnSimulation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schemaS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schema-s3-location` |
| `snapshotS3Location` | software.amazon.awscdk.services.simspaceweaver.CfnSimulation$S3LocationProperty | [[cdk.support/lookup-entry]] | `:snapshot-s3-location` |"
  [stack id config]
  (let [builder (CfnSimulation$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-simulation-props-builder
  "The cfn-simulation-props-builder function buildes out new instances of 
CfnSimulationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schemaS3Location` | software.amazon.awscdk.services.simspaceweaver.CfnSimulation$S3LocationProperty | [[cdk.support/lookup-entry]] | `:schema-s3-location` |
| `snapshotS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-s3-location` |"
  [stack id config]
  (let [builder (CfnSimulationProps$Builder.)]
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
    (.build builder)))


(defn cfn-simulation-s3-location-property-builder
  "The cfn-simulation-s3-location-property-builder function buildes out new instances of 
CfnSimulation$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |"
  [stack id config]
  (let [builder (CfnSimulation$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (.build builder)))