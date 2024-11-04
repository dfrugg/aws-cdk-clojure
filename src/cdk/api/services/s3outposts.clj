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


(defn cfn-access-point-builder
  "The cfn-access-point-builder function buildes out new instances of 
CfnAccessPoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `vpcConfiguration` | software.amazon.awscdk.services.s3outposts.CfnAccessPoint$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnAccessPoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-access-point-props-builder
  "The cfn-access-point-props-builder function buildes out new instances of 
CfnAccessPointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnAccessPointProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-access-point-vpc-configuration-property-builder
  "The cfn-access-point-vpc-configuration-property-builder function buildes out new instances of 
CfnAccessPoint$VpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnAccessPoint$VpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-bucket-abort-incomplete-multipart-upload-property-builder
  "The cfn-bucket-abort-incomplete-multipart-upload-property-builder function buildes out new instances of 
CfnBucket$AbortIncompleteMultipartUploadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysAfterInitiation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-after-initiation` |"
  [stack id config]
  (let [builder (CfnBucket$AbortIncompleteMultipartUploadProperty$Builder.)]
    (when-let [data (lookup-entry config id :days-after-initiation)]
      (. builder daysAfterInitiation data))
    (.build builder)))


(defn cfn-bucket-builder
  "The cfn-bucket-builder function buildes out new instances of 
CfnBucket$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `lifecycleConfiguration` | software.amazon.awscdk.services.s3outposts.CfnBucket$LifecycleConfigurationProperty | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBucket$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :lifecycle-configuration)]
      (. builder lifecycleConfiguration data))
    (when-let [data (lookup-entry config id :outpost-id)]
      (. builder outpostId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-bucket-filter-and-operator-property-builder
  "The cfn-bucket-filter-and-operator-property-builder function buildes out new instances of 
CfnBucket$FilterAndOperatorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBucket$FilterAndOperatorProperty$Builder.)]
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-bucket-filter-property-builder
  "The cfn-bucket-filter-property-builder function buildes out new instances of 
CfnBucket$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `andOperator` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and-operator` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (CfnBucket$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :and-operator)]
      (. builder andOperator data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn cfn-bucket-filter-tag-property-builder
  "The cfn-bucket-filter-tag-property-builder function buildes out new instances of 
CfnBucket$FilterTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBucket$FilterTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bucket-lifecycle-configuration-property-builder
  "The cfn-bucket-lifecycle-configuration-property-builder function buildes out new instances of 
CfnBucket$LifecycleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnBucket$LifecycleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


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


(defn cfn-bucket-props-builder
  "The cfn-bucket-props-builder function buildes out new instances of 
CfnBucketProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBucketProps$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :lifecycle-configuration)]
      (. builder lifecycleConfiguration data))
    (when-let [data (lookup-entry config id :outpost-id)]
      (. builder outpostId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-bucket-rule-property-builder
  "The cfn-bucket-rule-property-builder function buildes out new instances of 
CfnBucket$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortIncompleteMultipartUpload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abort-incomplete-multipart-upload` |
| `expirationDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:expiration-date` |
| `expirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-in-days` |
| `filter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filter` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnBucket$RuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-builder
  "The cfn-endpoint-builder function buildes out new instances of 
CfnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `customerOwnedIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-owned-ipv4-pool` |
| `failedReason` | software.amazon.awscdk.services.s3outposts.CfnEndpoint$FailedReasonProperty | [[cdk.support/lookup-entry]] | `:failed-reason` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnEndpoint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-endpoint-failed-reason-property-builder
  "The cfn-endpoint-failed-reason-property-builder function buildes out new instances of 
CfnEndpoint$FailedReasonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnEndpoint$FailedReasonProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-code)]
      (. builder errorCode data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn cfn-endpoint-network-interface-property-builder
  "The cfn-endpoint-network-interface-property-builder function buildes out new instances of 
CfnEndpoint$NetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |"
  [stack id config]
  (let [builder (CfnEndpoint$NetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (.build builder)))


(defn cfn-endpoint-props-builder
  "The cfn-endpoint-props-builder function buildes out new instances of 
CfnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `customerOwnedIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-owned-ipv4-pool` |
| `failedReason` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failed-reason` |
| `outpostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-id` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnEndpointProps$Builder.)]
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
    (.build builder)))