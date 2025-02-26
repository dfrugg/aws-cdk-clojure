(ns cdk.api.services.s3outposts
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3outposts package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3outposts CfnAccessPoint$Builder
                                                       CfnAccessPoint$VpcConfigurationProperty$Builder
                                                       CfnAccessPointProps$Builder
                                                       CfnBucket$AbortIncompleteMultipartUploadProperty$Builder
                                                       CfnBucket$Builder
                                                       CfnBucket$FilterAndOperatorProperty$Builder
                                                       CfnBucket$FilterProperty$Builder
                                                       CfnBucket$FilterTagProperty$Builder
                                                       CfnBucket$LifecycleConfigurationProperty$Builder
                                                       CfnBucket$RuleProperty$Builder
                                                       CfnBucketPolicy$Builder
                                                       CfnBucketPolicyProps$Builder
                                                       CfnBucketProps$Builder
                                                       CfnEndpoint$Builder
                                                       CfnEndpoint$FailedReasonProperty$Builder
                                                       CfnEndpoint$NetworkInterfaceProperty$Builder
                                                       CfnEndpointProps$Builder]))


(defn build-cfn-access-point-builder
  "The build-cfn-access-point-builder function updates a CfnAccessPoint$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `vpcConfiguration` | software.amazon.awscdk.services.s3outposts.CfnAccessPoint$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-access-point-builder
  "Creates a  `CfnAccessPoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-access-point-builder (CfnAccessPoint$Builder/create scope (name id)) id config))


(defn build-cfn-access-point-props-builder
  "The build-cfn-access-point-props-builder function updates a CfnAccessPointProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-access-point-props-builder
  "Creates a  `CfnAccessPointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-props-builder (new CfnAccessPointProps$Builder) id config))


(defn build-cfn-access-point-vpc-configuration-property-builder
  "The build-cfn-access-point-vpc-configuration-property-builder function updates a CfnAccessPoint$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnAccessPoint$VpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-access-point-vpc-configuration-property-builder
  "Creates a  `CfnAccessPoint$VpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-vpc-configuration-property-builder (new CfnAccessPoint$VpcConfigurationProperty$Builder) id config))


(defn build-cfn-bucket-abort-incomplete-multipart-upload-property-builder
  "The build-cfn-bucket-abort-incomplete-multipart-upload-property-builder function updates a CfnBucket$AbortIncompleteMultipartUploadProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AbortIncompleteMultipartUploadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysAfterInitiation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-after-initiation` |
"
  [^CfnBucket$AbortIncompleteMultipartUploadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days-after-initiation)]
    (. builder daysAfterInitiation data))
  (.build builder))


(defn cfn-bucket-abort-incomplete-multipart-upload-property-builder
  "Creates a  `CfnBucket$AbortIncompleteMultipartUploadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-abort-incomplete-multipart-upload-property-builder (new CfnBucket$AbortIncompleteMultipartUploadProperty$Builder) id config))


(defn build-cfn-bucket-builder
  "The build-cfn-bucket-builder function updates a CfnBucket$Builder instance using the provided configuration.
  The function takes the CfnBucket$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `lifecycleConfiguration` | software.amazon.awscdk.services.s3outposts.CfnBucket$LifecycleConfigurationProperty | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBucket$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-let [data (lookup-entry config id :outpost-id)]
    (. builder outpostId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-bucket-builder
  "Creates a  `CfnBucket$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-bucket-builder (CfnBucket$Builder/create scope (name id)) id config))


(defn build-cfn-bucket-filter-and-operator-property-builder
  "The build-cfn-bucket-filter-and-operator-property-builder function updates a CfnBucket$FilterAndOperatorProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$FilterAndOperatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBucket$FilterAndOperatorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-bucket-filter-and-operator-property-builder
  "Creates a  `CfnBucket$FilterAndOperatorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-filter-and-operator-property-builder (new CfnBucket$FilterAndOperatorProperty$Builder) id config))


(defn build-cfn-bucket-filter-property-builder
  "The build-cfn-bucket-filter-property-builder function updates a CfnBucket$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `andOperator` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and-operator` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^CfnBucket$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and-operator)]
    (. builder andOperator data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (.build builder))


(defn cfn-bucket-filter-property-builder
  "Creates a  `CfnBucket$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-filter-property-builder (new CfnBucket$FilterProperty$Builder) id config))


(defn build-cfn-bucket-filter-tag-property-builder
  "The build-cfn-bucket-filter-tag-property-builder function updates a CfnBucket$FilterTagProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$FilterTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBucket$FilterTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bucket-filter-tag-property-builder
  "Creates a  `CfnBucket$FilterTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-filter-tag-property-builder (new CfnBucket$FilterTagProperty$Builder) id config))


(defn build-cfn-bucket-lifecycle-configuration-property-builder
  "The build-cfn-bucket-lifecycle-configuration-property-builder function updates a CfnBucket$LifecycleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$LifecycleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnBucket$LifecycleConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-bucket-lifecycle-configuration-property-builder
  "Creates a  `CfnBucket$LifecycleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-lifecycle-configuration-property-builder (new CfnBucket$LifecycleConfigurationProperty$Builder) id config))


(defn build-cfn-bucket-policy-builder
  "The build-cfn-bucket-policy-builder function updates a CfnBucketPolicy$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :policy-document)]
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
  (build-cfn-bucket-policy-builder (CfnBucketPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-bucket-policy-props-builder
  "The build-cfn-bucket-policy-props-builder function updates a CfnBucketPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn cfn-bucket-policy-props-builder
  "Creates a  `CfnBucketPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-policy-props-builder (new CfnBucketPolicyProps$Builder) id config))


(defn build-cfn-bucket-props-builder
  "The build-cfn-bucket-props-builder function updates a CfnBucketProps$Builder instance using the provided configuration.
  The function takes the CfnBucketProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBucketProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-let [data (lookup-entry config id :outpost-id)]
    (. builder outpostId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-bucket-props-builder
  "Creates a  `CfnBucketProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-props-builder (new CfnBucketProps$Builder) id config))


(defn build-cfn-bucket-rule-property-builder
  "The build-cfn-bucket-rule-property-builder function updates a CfnBucket$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortIncompleteMultipartUpload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abort-incomplete-multipart-upload` |
| `expirationDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:expiration-date` |
| `expirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-in-days` |
| `filter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filter` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$RuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :abort-incomplete-multipart-upload)]
    (. builder abortIncompleteMultipartUpload data))
  (when-let [data (lookup-entry config id :expiration-date)]
    (. builder expirationDate data))
  (when-let [data (lookup-entry config id :expiration-in-days)]
    (. builder expirationInDays data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-bucket-rule-property-builder
  "Creates a  `CfnBucket$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bucket-rule-property-builder (new CfnBucket$RuleProperty$Builder) id config))


(defn build-cfn-endpoint-builder
  "The build-cfn-endpoint-builder function updates a CfnEndpoint$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `customerOwnedIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-owned-ipv4-pool` |
| `failedReason` | software.amazon.awscdk.services.s3outposts.CfnEndpoint$FailedReasonProperty | [[cdk.support/lookup-entry]] | `:failed-reason` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :access-type)]
    (. builder accessType data))
  (when-let [data (lookup-entry config id :customer-owned-ipv4-pool)]
    (. builder customerOwnedIpv4Pool data))
  (when-let [data (lookup-entry config id :failed-reason)]
    (. builder failedReason data))
  (when-let [data (lookup-entry config id :outpost-id)]
    (. builder outpostId data))
  (when-let [data (lookup-entry config id :security-group-id)]
    (. builder securityGroupId data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-endpoint-builder
  "Creates a  `CfnEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-endpoint-builder (CfnEndpoint$Builder/create scope (name id)) id config))


(defn build-cfn-endpoint-failed-reason-property-builder
  "The build-cfn-endpoint-failed-reason-property-builder function updates a CfnEndpoint$FailedReasonProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$FailedReasonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
"
  [^CfnEndpoint$FailedReasonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error-code)]
    (. builder errorCode data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn cfn-endpoint-failed-reason-property-builder
  "Creates a  `CfnEndpoint$FailedReasonProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-endpoint-failed-reason-property-builder (new CfnEndpoint$FailedReasonProperty$Builder) id config))


(defn build-cfn-endpoint-network-interface-property-builder
  "The build-cfn-endpoint-network-interface-property-builder function updates a CfnEndpoint$NetworkInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$NetworkInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
"
  [^CfnEndpoint$NetworkInterfaceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :network-interface-id)]
    (. builder networkInterfaceId data))
  (.build builder))


(defn cfn-endpoint-network-interface-property-builder
  "Creates a  `CfnEndpoint$NetworkInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-endpoint-network-interface-property-builder (new CfnEndpoint$NetworkInterfaceProperty$Builder) id config))


(defn build-cfn-endpoint-props-builder
  "The build-cfn-endpoint-props-builder function updates a CfnEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `customerOwnedIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-owned-ipv4-pool` |
| `failedReason` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failed-reason` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-type)]
    (. builder accessType data))
  (when-let [data (lookup-entry config id :customer-owned-ipv4-pool)]
    (. builder customerOwnedIpv4Pool data))
  (when-let [data (lookup-entry config id :failed-reason)]
    (. builder failedReason data))
  (when-let [data (lookup-entry config id :outpost-id)]
    (. builder outpostId data))
  (when-let [data (lookup-entry config id :security-group-id)]
    (. builder securityGroupId data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-endpoint-props-builder
  "Creates a  `CfnEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-endpoint-props-builder (new CfnEndpointProps$Builder) id config))