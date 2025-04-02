(ns cdk.api.services.s3express
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3express package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3express CfnBucketPolicy$Builder
                                                      CfnBucketPolicyProps$Builder
                                                      CfnDirectoryBucket$Builder
                                                      CfnDirectoryBucketProps$Builder]))


(defn cfn-bucket-policy-builder>
  "The cfn-bucket-policy-builder> function updates a CfnBucketPolicy$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn cfn-bucket-policy-builder
  "Creates a  `CfnBucketPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-bucket-policy-builder> (CfnBucketPolicy$Builder/create scope (name id)) id config))


(defn cfn-bucket-policy-props-builder>
  "The cfn-bucket-policy-props-builder> function updates a CfnBucketPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn cfn-bucket-policy-props-builder
  "Creates a  `CfnBucketPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-bucket-policy-props-builder> (new CfnBucketPolicyProps$Builder) id config))


(defn cfn-directory-bucket-builder>
  "The cfn-directory-bucket-builder> function updates a CfnDirectoryBucket$Builder instance using the provided configuration.
  The function takes the CfnDirectoryBucket$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `dataRedundancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-redundancy` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
"
  [^CfnDirectoryBucket$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :data-redundancy)]
    (. builder dataRedundancy data))
  (when-some [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (.build builder))


(defn cfn-directory-bucket-builder
  "Creates a  `CfnDirectoryBucket$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-directory-bucket-builder> (CfnDirectoryBucket$Builder/create scope (name id)) id config))


(defn cfn-directory-bucket-props-builder>
  "The cfn-directory-bucket-props-builder> function updates a CfnDirectoryBucketProps$Builder instance using the provided configuration.
  The function takes the CfnDirectoryBucketProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `dataRedundancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-redundancy` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
"
  [^CfnDirectoryBucketProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :data-redundancy)]
    (. builder dataRedundancy data))
  (when-some [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (.build builder))


(defn cfn-directory-bucket-props-builder
  "Creates a  `CfnDirectoryBucketProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-directory-bucket-props-builder> (new CfnDirectoryBucketProps$Builder) id config))