(ns cdk.api.services.synthetics
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.synthetics package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.synthetics ArtifactsBucketLocation$Builder
                                                       AssetCode$Builder
                                                       Canary$Builder
                                                       CanaryProps$Builder
                                                       CfnCanary$ArtifactConfigProperty$Builder
                                                       CfnCanary$BaseScreenshotProperty$Builder
                                                       CfnCanary$Builder
                                                       CfnCanary$CodeProperty$Builder
                                                       CfnCanary$RunConfigProperty$Builder
                                                       CfnCanary$S3EncryptionProperty$Builder
                                                       CfnCanary$ScheduleProperty$Builder
                                                       CfnCanary$VPCConfigProperty$Builder
                                                       CfnCanary$VisualReferenceProperty$Builder
                                                       CfnCanaryProps$Builder
                                                       CfnGroup$Builder
                                                       CfnGroupProps$Builder
                                                       Cleanup
                                                       CodeConfig$Builder
                                                       CronOptions$Builder
                                                       CustomTestOptions$Builder
                                                       RuntimeFamily]))


(defn cleanup
  "The `cleanup` function data interprets values in the provided config data into a 
`Cleanup` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Cleanup` - the value is returned.
* is `:nothing` - `Cleanup/NOTHING` is returned
* is `:lambda` - `Cleanup/LAMBDA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Cleanup data) data
      (= :nothing data) Cleanup/NOTHING
      (= :lambda data) Cleanup/LAMBDA)))


(defn runtime-family
  "The `runtime-family` function data interprets values in the provided config data into a 
`RuntimeFamily` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RuntimeFamily` - the value is returned.
* is `:nodejs` - `RuntimeFamily/NODEJS` is returned
* is `:python` - `RuntimeFamily/PYTHON` is returned
* is `:other` - `RuntimeFamily/OTHER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RuntimeFamily data) data
      (= :nodejs data) RuntimeFamily/NODEJS
      (= :python data) RuntimeFamily/PYTHON
      (= :other data) RuntimeFamily/OTHER)))


(defn build-artifacts-bucket-location-builder
  "The build-artifacts-bucket-location-builder function updates a ArtifactsBucketLocation$Builder instance using the provided configuration.
  The function takes the ArtifactsBucketLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^ArtifactsBucketLocation$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn artifacts-bucket-location-builder
  "Creates a  `ArtifactsBucketLocation$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-artifacts-bucket-location-builder (new ArtifactsBucketLocation$Builder) id config))


(defn build-asset-code-builder
  "The build-asset-code-builder function updates a AssetCode$Builder instance using the provided configuration.
  The function takes the AssetCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^AssetCode$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-let [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-let [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-let [data (lookup-entry config id :deploy-time)]
    (. builder deployTime data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-let [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-let [data (lookup-entry config id :readers)]
    (. builder readers data))
  (.build builder))


(defn asset-code-builder
  "Creates a  `AssetCode$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| path | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String path id config]
  (build-asset-code-builder (AssetCode$Builder/create path) id config))


(defn build-canary-builder
  "The build-canary-builder function updates a Canary$Builder instance using the provided configuration.
  The function takes the Canary$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactsBucketLifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:artifacts-bucket-lifecycle-rules` |
| `artifactsBucketLocation` | software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation | [[cdk.support/lookup-entry]] | `:artifacts-bucket-location` |
| `canaryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:canary-name` |
| `cleanup` | software.amazon.awscdk.services.synthetics.Cleanup | [[cdk.api.services.synthetics/cleanup]] | `:cleanup` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `failureRetentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:failure-retention-period` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.synthetics.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `schedule` | software.amazon.awscdk.services.synthetics.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `startAfterCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-after-creation` |
| `successRetentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:success-retention-period` |
| `test` | software.amazon.awscdk.services.synthetics.Test | [[cdk.support/lookup-entry]] | `:test` |
| `timeToLive` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:time-to-live` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^Canary$Builder builder id config]
  (when-let [data (lookup-entry config id :artifacts-bucket-lifecycle-rules)]
    (. builder artifactsBucketLifecycleRules data))
  (when-let [data (lookup-entry config id :artifacts-bucket-location)]
    (. builder artifactsBucketLocation data))
  (when-let [data (lookup-entry config id :canary-name)]
    (. builder canaryName data))
  (when-let [data (cleanup config id :cleanup)]
    (. builder cleanup data))
  (when-let [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-let [data (lookup-entry config id :failure-retention-period)]
    (. builder failureRetentionPeriod data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :start-after-creation)]
    (. builder startAfterCreation data))
  (when-let [data (lookup-entry config id :success-retention-period)]
    (. builder successRetentionPeriod data))
  (when-let [data (lookup-entry config id :test)]
    (. builder test data))
  (when-let [data (lookup-entry config id :time-to-live)]
    (. builder timeToLive data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn canary-builder
  "Creates a  `Canary$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-canary-builder (Canary$Builder/create scope (name id)) id config))


(defn build-canary-props-builder
  "The build-canary-props-builder function updates a CanaryProps$Builder instance using the provided configuration.
  The function takes the CanaryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactsBucketLifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:artifacts-bucket-lifecycle-rules` |
| `artifactsBucketLocation` | software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation | [[cdk.support/lookup-entry]] | `:artifacts-bucket-location` |
| `canaryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:canary-name` |
| `cleanup` | software.amazon.awscdk.services.synthetics.Cleanup | [[cdk.api.services.synthetics/cleanup]] | `:cleanup` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `failureRetentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:failure-retention-period` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.synthetics.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `schedule` | software.amazon.awscdk.services.synthetics.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `startAfterCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-after-creation` |
| `successRetentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:success-retention-period` |
| `test` | software.amazon.awscdk.services.synthetics.Test | [[cdk.support/lookup-entry]] | `:test` |
| `timeToLive` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:time-to-live` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^CanaryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :artifacts-bucket-lifecycle-rules)]
    (. builder artifactsBucketLifecycleRules data))
  (when-let [data (lookup-entry config id :artifacts-bucket-location)]
    (. builder artifactsBucketLocation data))
  (when-let [data (lookup-entry config id :canary-name)]
    (. builder canaryName data))
  (when-let [data (cleanup config id :cleanup)]
    (. builder cleanup data))
  (when-let [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-let [data (lookup-entry config id :failure-retention-period)]
    (. builder failureRetentionPeriod data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :start-after-creation)]
    (. builder startAfterCreation data))
  (when-let [data (lookup-entry config id :success-retention-period)]
    (. builder successRetentionPeriod data))
  (when-let [data (lookup-entry config id :test)]
    (. builder test data))
  (when-let [data (lookup-entry config id :time-to-live)]
    (. builder timeToLive data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn canary-props-builder
  "Creates a  `CanaryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-canary-props-builder (new CanaryProps$Builder) id config))


(defn build-cfn-canary-artifact-config-property-builder
  "The build-cfn-canary-artifact-config-property-builder function updates a CfnCanary$ArtifactConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$ArtifactConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-encryption` |
"
  [^CfnCanary$ArtifactConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-encryption)]
    (. builder s3Encryption data))
  (.build builder))


(defn cfn-canary-artifact-config-property-builder
  "Creates a  `CfnCanary$ArtifactConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-artifact-config-property-builder (new CfnCanary$ArtifactConfigProperty$Builder) id config))


(defn build-cfn-canary-base-screenshot-property-builder
  "The build-cfn-canary-base-screenshot-property-builder function updates a CfnCanary$BaseScreenshotProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$BaseScreenshotProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ignoreCoordinates` | java.util.List | [[cdk.support/lookup-entry]] | `:ignore-coordinates` |
| `screenshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:screenshot-name` |
"
  [^CfnCanary$BaseScreenshotProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ignore-coordinates)]
    (. builder ignoreCoordinates data))
  (when-let [data (lookup-entry config id :screenshot-name)]
    (. builder screenshotName data))
  (.build builder))


(defn cfn-canary-base-screenshot-property-builder
  "Creates a  `CfnCanary$BaseScreenshotProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-base-screenshot-property-builder (new CfnCanary$BaseScreenshotProperty$Builder) id config))


(defn build-cfn-canary-builder
  "The build-cfn-canary-builder function updates a CfnCanary$Builder instance using the provided configuration.
  The function takes the CfnCanary$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactConfig` | software.amazon.awscdk.services.synthetics.CfnCanary$ArtifactConfigProperty | [[cdk.support/lookup-entry]] | `:artifact-config` |
| `artifactS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-s3-location` |
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `deleteLambdaResourcesOnCanaryDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-lambda-resources-on-canary-deletion` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `failureRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-retention-period` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-config` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `startCanaryAfterCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:start-canary-after-creation` |
| `successRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:success-retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visualReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visual-reference` |
| `vpcConfig` | software.amazon.awscdk.services.synthetics.CfnCanary$VPCConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnCanary$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-config)]
    (. builder artifactConfig data))
  (when-let [data (lookup-entry config id :artifact-s3-location)]
    (. builder artifactS3Location data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :delete-lambda-resources-on-canary-deletion)]
    (. builder deleteLambdaResourcesOnCanaryDeletion data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :failure-retention-period)]
    (. builder failureRetentionPeriod data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :run-config)]
    (. builder runConfig data))
  (when-let [data (lookup-entry config id :runtime-version)]
    (. builder runtimeVersion data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :start-canary-after-creation)]
    (. builder startCanaryAfterCreation data))
  (when-let [data (lookup-entry config id :success-retention-period)]
    (. builder successRetentionPeriod data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visual-reference)]
    (. builder visualReference data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-canary-builder
  "Creates a  `CfnCanary$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-canary-builder (CfnCanary$Builder/create scope (name id)) id config))


(defn build-cfn-canary-code-property-builder
  "The build-cfn-canary-code-property-builder function updates a CfnCanary$CodeProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$CodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
| `script` | java.lang.String | [[cdk.support/lookup-entry]] | `:script` |
| `sourceLocationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-arn` |
"
  [^CfnCanary$CodeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (when-let [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (when-let [data (lookup-entry config id :script)]
    (. builder script data))
  (when-let [data (lookup-entry config id :source-location-arn)]
    (. builder sourceLocationArn data))
  (.build builder))


(defn cfn-canary-code-property-builder
  "Creates a  `CfnCanary$CodeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-code-property-builder (new CfnCanary$CodeProperty$Builder) id config))


(defn build-cfn-canary-props-builder
  "The build-cfn-canary-props-builder function updates a CfnCanaryProps$Builder instance using the provided configuration.
  The function takes the CfnCanaryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactConfig` | software.amazon.awscdk.services.synthetics.CfnCanary$ArtifactConfigProperty | [[cdk.support/lookup-entry]] | `:artifact-config` |
| `artifactS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-s3-location` |
| `code` | software.amazon.awscdk.services.synthetics.CfnCanary$CodeProperty | [[cdk.support/lookup-entry]] | `:code` |
| `deleteLambdaResourcesOnCanaryDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-lambda-resources-on-canary-deletion` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `failureRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-retention-period` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-config` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `startCanaryAfterCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-canary-after-creation` |
| `successRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:success-retention-period` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visualReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visual-reference` |
| `vpcConfig` | software.amazon.awscdk.services.synthetics.CfnCanary$VPCConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnCanaryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-config)]
    (. builder artifactConfig data))
  (when-let [data (lookup-entry config id :artifact-s3-location)]
    (. builder artifactS3Location data))
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :delete-lambda-resources-on-canary-deletion)]
    (. builder deleteLambdaResourcesOnCanaryDeletion data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :failure-retention-period)]
    (. builder failureRetentionPeriod data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :run-config)]
    (. builder runConfig data))
  (when-let [data (lookup-entry config id :runtime-version)]
    (. builder runtimeVersion data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :start-canary-after-creation)]
    (. builder startCanaryAfterCreation data))
  (when-let [data (lookup-entry config id :success-retention-period)]
    (. builder successRetentionPeriod data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visual-reference)]
    (. builder visualReference data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-canary-props-builder
  "Creates a  `CfnCanaryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-props-builder (new CfnCanaryProps$Builder) id config))


(defn build-cfn-canary-run-config-property-builder
  "The build-cfn-canary-run-config-property-builder function updates a CfnCanary$RunConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$RunConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeTracing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active-tracing` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `memoryInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-in-mb` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnCanary$RunConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active-tracing)]
    (. builder activeTracing data))
  (when-let [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-let [data (lookup-entry config id :memory-in-mb)]
    (. builder memoryInMb data))
  (when-let [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-canary-run-config-property-builder
  "Creates a  `CfnCanary$RunConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-run-config-property-builder (new CfnCanary$RunConfigProperty$Builder) id config))


(defn build-cfn-canary-s3-encryption-property-builder
  "The build-cfn-canary-s3-encryption-property-builder function updates a CfnCanary$S3EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$S3EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-mode` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnCanary$S3EncryptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :encryption-mode)]
    (. builder encryptionMode data))
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-canary-s3-encryption-property-builder
  "Creates a  `CfnCanary$S3EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-s3-encryption-property-builder (new CfnCanary$S3EncryptionProperty$Builder) id config))


(defn build-cfn-canary-schedule-property-builder
  "The build-cfn-canary-schedule-property-builder function updates a CfnCanary$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
"
  [^CfnCanary$ScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (.build builder))


(defn cfn-canary-schedule-property-builder
  "Creates a  `CfnCanary$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-schedule-property-builder (new CfnCanary$ScheduleProperty$Builder) id config))


(defn build-cfn-canary-visual-reference-property-builder
  "The build-cfn-canary-visual-reference-property-builder function updates a CfnCanary$VisualReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$VisualReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCanaryRunId` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-canary-run-id` |
| `baseScreenshots` | java.util.List | [[cdk.support/lookup-entry]] | `:base-screenshots` |
"
  [^CfnCanary$VisualReferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-canary-run-id)]
    (. builder baseCanaryRunId data))
  (when-let [data (lookup-entry config id :base-screenshots)]
    (. builder baseScreenshots data))
  (.build builder))


(defn cfn-canary-visual-reference-property-builder
  "Creates a  `CfnCanary$VisualReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-visual-reference-property-builder (new CfnCanary$VisualReferenceProperty$Builder) id config))


(defn build-cfn-canary-vpc-config-property-builder
  "The build-cfn-canary-vpc-config-property-builder function updates a CfnCanary$VPCConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCanary$VPCConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnCanary$VPCConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-canary-vpc-config-property-builder
  "Creates a  `CfnCanary$VPCConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-canary-vpc-config-property-builder (new CfnCanary$VPCConfigProperty$Builder) id config))


(defn build-cfn-group-builder
  "The build-cfn-group-builder function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-builder
  "Creates a  `CfnGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-group-builder (CfnGroup$Builder/create scope (name id)) id config))


(defn build-cfn-group-props-builder
  "The build-cfn-group-props-builder function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-props-builder
  "Creates a  `CfnGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-group-props-builder (new CfnGroupProps$Builder) id config))


(defn build-code-config-builder
  "The build-code-config-builder function updates a CodeConfig$Builder instance using the provided configuration.
  The function takes the CodeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CodeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :inline-code)]
    (. builder inlineCode data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn code-config-builder
  "Creates a  `CodeConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-config-builder (new CodeConfig$Builder) id config))


(defn build-cron-options-builder
  "The build-cron-options-builder function updates a CronOptions$Builder instance using the provided configuration.
  The function takes the CronOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `hour` | java.lang.String | [[cdk.support/lookup-entry]] | `:hour` |
| `minute` | java.lang.String | [[cdk.support/lookup-entry]] | `:minute` |
| `month` | java.lang.String | [[cdk.support/lookup-entry]] | `:month` |
| `weekDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:week-day` |
"
  [^CronOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :day)]
    (. builder day data))
  (when-let [data (lookup-entry config id :hour)]
    (. builder hour data))
  (when-let [data (lookup-entry config id :minute)]
    (. builder minute data))
  (when-let [data (lookup-entry config id :month)]
    (. builder month data))
  (when-let [data (lookup-entry config id :week-day)]
    (. builder weekDay data))
  (.build builder))


(defn cron-options-builder
  "Creates a  `CronOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cron-options-builder (new CronOptions$Builder) id config))


(defn build-custom-test-options-builder
  "The build-custom-test-options-builder function updates a CustomTestOptions$Builder instance using the provided configuration.
  The function takes the CustomTestOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.synthetics.Code | [[cdk.support/lookup-entry]] | `:code` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
"
  [^CustomTestOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (.build builder))


(defn custom-test-options-builder
  "Creates a  `CustomTestOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-test-options-builder (new CustomTestOptions$Builder) id config))