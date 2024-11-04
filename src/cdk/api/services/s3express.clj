(ns cdk.api.services.s3express
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3express package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3express CfnBucketPolicy$Builder
                                                      CfnBucketPolicyProps$Builder
                                                      CfnDirectoryBucket$Builder
                                                      CfnDirectoryBucketProps$Builder]))


(defn cfn-bucket-policy-builder
  "The cfn-bucket-policy-builder function buildes out new instances of 
CfnBucketPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnBucketPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-bucket-policy-props-builder
  "The cfn-bucket-policy-props-builder function buildes out new instances of 
CfnBucketPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnBucketPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-directory-bucket-builder
  "The cfn-directory-bucket-builder function buildes out new instances of 
CfnDirectoryBucket$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `dataRedundancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-redundancy` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |"
  [stack id config]
  (let [builder (CfnDirectoryBucket$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :data-redundancy)]
      (. builder dataRedundancy data))
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (.build builder)))


(defn cfn-directory-bucket-props-builder
  "The cfn-directory-bucket-props-builder function buildes out new instances of 
CfnDirectoryBucketProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `dataRedundancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-redundancy` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |"
  [stack id config]
  (let [builder (CfnDirectoryBucketProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :data-redundancy)]
      (. builder dataRedundancy data))
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (.build builder)))