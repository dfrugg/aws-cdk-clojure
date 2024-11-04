(ns cdk.api.services.s3objectlambda
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3objectlambda package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3objectlambda CfnAccessPoint$AliasProperty$Builder
                                                           CfnAccessPoint$AwsLambdaProperty$Builder
                                                           CfnAccessPoint$Builder
                                                           CfnAccessPoint$ContentTransformationProperty$Builder
                                                           CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder
                                                           CfnAccessPoint$PolicyStatusProperty$Builder
                                                           CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder
                                                           CfnAccessPoint$TransformationConfigurationProperty$Builder
                                                           CfnAccessPointPolicy$Builder
                                                           CfnAccessPointPolicyProps$Builder
                                                           CfnAccessPointProps$Builder]))


(defn cfn-access-point-alias-property-builder
  "The cfn-access-point-alias-property-builder function buildes out new instances of 
CfnAccessPoint$AliasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAccessPoint$AliasProperty$Builder.)]
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-access-point-aws-lambda-property-builder
  "The cfn-access-point-aws-lambda-property-builder function buildes out new instances of 
CfnAccessPoint$AwsLambdaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionPayload` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-payload` |"
  [stack id config]
  (let [builder (CfnAccessPoint$AwsLambdaProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :function-payload)]
      (. builder functionPayload data))
    (.build builder)))


(defn cfn-access-point-builder
  "The cfn-access-point-builder function buildes out new instances of 
CfnAccessPoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectLambdaConfiguration` | software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint$ObjectLambdaConfigurationProperty | [[cdk.support/lookup-entry]] | `:object-lambda-configuration` |"
  [stack id config]
  (let [builder (CfnAccessPoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-lambda-configuration)]
      (. builder objectLambdaConfiguration data))
    (.build builder)))


(defn cfn-access-point-content-transformation-property-builder
  "The cfn-access-point-content-transformation-property-builder function buildes out new instances of 
CfnAccessPoint$ContentTransformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLambda` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-lambda` |"
  [stack id config]
  (let [builder (CfnAccessPoint$ContentTransformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-lambda)]
      (. builder awsLambda data))
    (.build builder)))


(defn cfn-access-point-object-lambda-configuration-property-builder
  "The cfn-access-point-object-lambda-configuration-property-builder function buildes out new instances of 
CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedFeatures` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-features` |
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `supportingAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:supporting-access-point` |
| `transformationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:transformation-configurations` |"
  [stack id config]
  (let [builder (CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-features)]
      (. builder allowedFeatures data))
    (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
      (. builder cloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :supporting-access-point)]
      (. builder supportingAccessPoint data))
    (when-let [data (lookup-entry config id :transformation-configurations)]
      (. builder transformationConfigurations data))
    (.build builder)))


(defn cfn-access-point-policy-builder
  "The cfn-access-point-policy-builder function buildes out new instances of 
CfnAccessPointPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectLambdaAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-lambda-access-point` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnAccessPointPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :object-lambda-access-point)]
      (. builder objectLambdaAccessPoint data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-access-point-policy-props-builder
  "The cfn-access-point-policy-props-builder function buildes out new instances of 
CfnAccessPointPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectLambdaAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-lambda-access-point` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnAccessPointPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :object-lambda-access-point)]
      (. builder objectLambdaAccessPoint data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-access-point-policy-status-property-builder
  "The cfn-access-point-policy-status-property-builder function buildes out new instances of 
CfnAccessPoint$PolicyStatusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPublic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-public` |"
  [stack id config]
  (let [builder (CfnAccessPoint$PolicyStatusProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-public)]
      (. builder isPublic data))
    (.build builder)))


(defn cfn-access-point-props-builder
  "The cfn-access-point-props-builder function buildes out new instances of 
CfnAccessPointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectLambdaConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-lambda-configuration` |"
  [stack id config]
  (let [builder (CfnAccessPointProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-lambda-configuration)]
      (. builder objectLambdaConfiguration data))
    (.build builder)))


(defn cfn-access-point-public-access-block-configuration-property-builder
  "The cfn-access-point-public-access-block-configuration-property-builder function buildes out new instances of 
CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |"
  [stack id config]
  (let [builder (CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-public-acls)]
      (. builder blockPublicAcls data))
    (when-let [data (lookup-entry config id :block-public-policy)]
      (. builder blockPublicPolicy data))
    (when-let [data (lookup-entry config id :ignore-public-acls)]
      (. builder ignorePublicAcls data))
    (when-let [data (lookup-entry config id :restrict-public-buckets)]
      (. builder restrictPublicBuckets data))
    (.build builder)))


(defn cfn-access-point-transformation-configuration-property-builder
  "The cfn-access-point-transformation-configuration-property-builder function buildes out new instances of 
CfnAccessPoint$TransformationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `contentTransformation` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content-transformation` |"
  [stack id config]
  (let [builder (CfnAccessPoint$TransformationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :content-transformation)]
      (. builder contentTransformation data))
    (.build builder)))