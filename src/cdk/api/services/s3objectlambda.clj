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


(defn build-cfn-access-point-alias-property-builder
  "The build-cfn-access-point-alias-property-builder function updates a CfnAccessPoint$AliasProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$AliasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAccessPoint$AliasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-access-point-alias-property-builder
  "Creates a  `CfnAccessPoint$AliasProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-alias-property-builder (new CfnAccessPoint$AliasProperty$Builder) id config))


(defn build-cfn-access-point-aws-lambda-property-builder
  "The build-cfn-access-point-aws-lambda-property-builder function updates a CfnAccessPoint$AwsLambdaProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$AwsLambdaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionPayload` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-payload` |
"
  [^CfnAccessPoint$AwsLambdaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-let [data (lookup-entry config id :function-payload)]
    (. builder functionPayload data))
  (.build builder))


(defn cfn-access-point-aws-lambda-property-builder
  "Creates a  `CfnAccessPoint$AwsLambdaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-aws-lambda-property-builder (new CfnAccessPoint$AwsLambdaProperty$Builder) id config))


(defn build-cfn-access-point-builder
  "The build-cfn-access-point-builder function updates a CfnAccessPoint$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectLambdaConfiguration` | software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint$ObjectLambdaConfigurationProperty | [[cdk.support/lookup-entry]] | `:object-lambda-configuration` |
"
  [^CfnAccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :object-lambda-configuration)]
    (. builder objectLambdaConfiguration data))
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


(defn build-cfn-access-point-content-transformation-property-builder
  "The build-cfn-access-point-content-transformation-property-builder function updates a CfnAccessPoint$ContentTransformationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$ContentTransformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLambda` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-lambda` |
"
  [^CfnAccessPoint$ContentTransformationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-lambda)]
    (. builder awsLambda data))
  (.build builder))


(defn cfn-access-point-content-transformation-property-builder
  "Creates a  `CfnAccessPoint$ContentTransformationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-content-transformation-property-builder (new CfnAccessPoint$ContentTransformationProperty$Builder) id config))


(defn build-cfn-access-point-object-lambda-configuration-property-builder
  "The build-cfn-access-point-object-lambda-configuration-property-builder function updates a CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedFeatures` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-features` |
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `supportingAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:supporting-access-point` |
| `transformationConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:transformation-configurations` |
"
  [^CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-features)]
    (. builder allowedFeatures data))
  (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
    (. builder cloudWatchMetricsEnabled data))
  (when-let [data (lookup-entry config id :supporting-access-point)]
    (. builder supportingAccessPoint data))
  (when-let [data (lookup-entry config id :transformation-configurations)]
    (. builder transformationConfigurations data))
  (.build builder))


(defn cfn-access-point-object-lambda-configuration-property-builder
  "Creates a  `CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-object-lambda-configuration-property-builder (new CfnAccessPoint$ObjectLambdaConfigurationProperty$Builder) id config))


(defn build-cfn-access-point-policy-builder
  "The build-cfn-access-point-policy-builder function updates a CfnAccessPointPolicy$Builder instance using the provided configuration.
  The function takes the CfnAccessPointPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectLambdaAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-lambda-access-point` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnAccessPointPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :object-lambda-access-point)]
    (. builder objectLambdaAccessPoint data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn cfn-access-point-policy-builder
  "Creates a  `CfnAccessPointPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-access-point-policy-builder (CfnAccessPointPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-access-point-policy-props-builder
  "The build-cfn-access-point-policy-props-builder function updates a CfnAccessPointPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPointPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectLambdaAccessPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-lambda-access-point` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnAccessPointPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :object-lambda-access-point)]
    (. builder objectLambdaAccessPoint data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn cfn-access-point-policy-props-builder
  "Creates a  `CfnAccessPointPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-policy-props-builder (new CfnAccessPointPolicyProps$Builder) id config))


(defn build-cfn-access-point-policy-status-property-builder
  "The build-cfn-access-point-policy-status-property-builder function updates a CfnAccessPoint$PolicyStatusProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$PolicyStatusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPublic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-public` |
"
  [^CfnAccessPoint$PolicyStatusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-public)]
    (. builder isPublic data))
  (.build builder))


(defn cfn-access-point-policy-status-property-builder
  "Creates a  `CfnAccessPoint$PolicyStatusProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-policy-status-property-builder (new CfnAccessPoint$PolicyStatusProperty$Builder) id config))


(defn build-cfn-access-point-props-builder
  "The build-cfn-access-point-props-builder function updates a CfnAccessPointProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectLambdaConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-lambda-configuration` |
"
  [^CfnAccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :object-lambda-configuration)]
    (. builder objectLambdaConfiguration data))
  (.build builder))


(defn cfn-access-point-props-builder
  "Creates a  `CfnAccessPointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-props-builder (new CfnAccessPointProps$Builder) id config))


(defn build-cfn-access-point-public-access-block-configuration-property-builder
  "The build-cfn-access-point-public-access-block-configuration-property-builder function updates a CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn cfn-access-point-public-access-block-configuration-property-builder
  "Creates a  `CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-public-access-block-configuration-property-builder (new CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder) id config))


(defn build-cfn-access-point-transformation-configuration-property-builder
  "The build-cfn-access-point-transformation-configuration-property-builder function updates a CfnAccessPoint$TransformationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$TransformationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `contentTransformation` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content-transformation` |
"
  [^CfnAccessPoint$TransformationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :content-transformation)]
    (. builder contentTransformation data))
  (.build builder))


(defn cfn-access-point-transformation-configuration-property-builder
  "Creates a  `CfnAccessPoint$TransformationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-access-point-transformation-configuration-property-builder (new CfnAccessPoint$TransformationConfigurationProperty$Builder) id config))