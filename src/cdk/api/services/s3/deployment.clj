(ns cdk.api.services.s3.deployment
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3.deployment package. "
  (:require [cdk.api.services.logs :refer [retention-days]]
            [cdk.api.services.s3 :refer [bucket-access-control]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3.deployment BucketDeployment$Builder
                                                          BucketDeploymentProps$Builder
                                                          DeployTimeSubstitutedFile$Builder
                                                          DeployTimeSubstitutedFileProps$Builder
                                                          DeploymentSourceContext$Builder
                                                          ServerSideEncryption
                                                          SourceConfig$Builder
                                                          StorageClass]))


(defn server-side-encryption
  "The `server-side-encryption` function data interprets values in the provided config data into a 
`ServerSideEncryption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ServerSideEncryption` - the value is returned.
* is `:aes-256` - `ServerSideEncryption/AES_256` is returned
* is `:aws-kms` - `ServerSideEncryption/AWS_KMS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ServerSideEncryption data) data
      (= :aes-256 data) ServerSideEncryption/AES_256
      (= :aws-kms data) ServerSideEncryption/AWS_KMS)))


(defn storage-class
  "The `storage-class` function data interprets values in the provided config data into a 
`StorageClass` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StorageClass` - the value is returned.
* is `:glacier` - `StorageClass/GLACIER` is returned
* is `:reduced-redundancy` - `StorageClass/REDUCED_REDUNDANCY` is returned
* is `:onezone-ia` - `StorageClass/ONEZONE_IA` is returned
* is `:standard-ia` - `StorageClass/STANDARD_IA` is returned
* is `:standard` - `StorageClass/STANDARD` is returned
* is `:intelligent-tiering` - `StorageClass/INTELLIGENT_TIERING` is returned
* is `:deep-archive` - `StorageClass/DEEP_ARCHIVE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StorageClass data) data
      (= :glacier data) StorageClass/GLACIER
      (= :reduced-redundancy data) StorageClass/REDUCED_REDUNDANCY
      (= :onezone-ia data) StorageClass/ONEZONE_IA
      (= :standard-ia data) StorageClass/STANDARD_IA
      (= :standard data) StorageClass/STANDARD
      (= :intelligent-tiering data) StorageClass/INTELLIGENT_TIERING
      (= :deep-archive data) StorageClass/DEEP_ARCHIVE)))


(defn build-bucket-deployment-builder
  "The build-bucket-deployment-builder function updates a BucketDeployment$Builder instance using the provided configuration.
  The function takes the BucketDeployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `cacheControl` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-control` |
| `contentDisposition` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-disposition` |
| `contentEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-encoding` |
| `contentLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-language` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `destinationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:destination-bucket` |
| `destinationKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-key-prefix` |
| `distribution` | software.amazon.awscdk.services.cloudfront.IDistribution | [[cdk.support/lookup-entry]] | `:distribution` |
| `distributionPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:distribution-paths` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `expires` | software.amazon.awscdk.Expiration | [[cdk.support/lookup-entry]] | `:expires` |
| `extract` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extract` |
| `include` | java.util.List | [[cdk.support/lookup-entry]] | `:include` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `retainOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-on-delete` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |
| `serverSideEncryptionCustomerAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-customer-algorithm` |
| `signContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign-content` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `storageClass` | software.amazon.awscdk.services.s3.deployment.StorageClass | [[cdk.api.services.s3.deployment/storage-class]] | `:storage-class` |
| `useEfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-efs` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `websiteRedirectLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-redirect-location` |
"
  [^BucketDeployment$Builder builder id config]
  (when-let [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :cache-control)]
    (. builder cacheControl data))
  (when-let [data (lookup-entry config id :content-disposition)]
    (. builder contentDisposition data))
  (when-let [data (lookup-entry config id :content-encoding)]
    (. builder contentEncoding data))
  (when-let [data (lookup-entry config id :content-language)]
    (. builder contentLanguage data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :destination-bucket)]
    (. builder destinationBucket data))
  (when-let [data (lookup-entry config id :destination-key-prefix)]
    (. builder destinationKeyPrefix data))
  (when-let [data (lookup-entry config id :distribution)]
    (. builder distribution data))
  (when-let [data (lookup-entry config id :distribution-paths)]
    (. builder distributionPaths data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :expires)]
    (. builder expires data))
  (when-let [data (lookup-entry config id :extract)]
    (. builder extract data))
  (when-let [data (lookup-entry config id :include)]
    (. builder include data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-let [data (lookup-entry config id :retain-on-delete)]
    (. builder retainOnDelete data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (server-side-encryption config id :server-side-encryption)]
    (. builder serverSideEncryption data))
  (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
    (. builder serverSideEncryptionAwsKmsKeyId data))
  (when-let [data (lookup-entry config id :server-side-encryption-customer-algorithm)]
    (. builder serverSideEncryptionCustomerAlgorithm data))
  (when-let [data (lookup-entry config id :sign-content)]
    (. builder signContent data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-let [data (storage-class config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :use-efs)]
    (. builder useEfs data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-let [data (lookup-entry config id :website-redirect-location)]
    (. builder websiteRedirectLocation data))
  (.build builder))


(defn build-bucket-deployment-props-builder
  "The build-bucket-deployment-props-builder function updates a BucketDeploymentProps$Builder instance using the provided configuration.
  The function takes the BucketDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `cacheControl` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-control` |
| `contentDisposition` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-disposition` |
| `contentEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-encoding` |
| `contentLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-language` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `destinationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:destination-bucket` |
| `destinationKeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-key-prefix` |
| `distribution` | software.amazon.awscdk.services.cloudfront.IDistribution | [[cdk.support/lookup-entry]] | `:distribution` |
| `distributionPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:distribution-paths` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `expires` | software.amazon.awscdk.Expiration | [[cdk.support/lookup-entry]] | `:expires` |
| `extract` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extract` |
| `include` | java.util.List | [[cdk.support/lookup-entry]] | `:include` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `retainOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-on-delete` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |
| `serverSideEncryptionCustomerAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-customer-algorithm` |
| `signContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sign-content` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `storageClass` | software.amazon.awscdk.services.s3.deployment.StorageClass | [[cdk.api.services.s3.deployment/storage-class]] | `:storage-class` |
| `useEfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-efs` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `websiteRedirectLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-redirect-location` |
"
  [^BucketDeploymentProps$Builder builder id config]
  (when-let [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :cache-control)]
    (. builder cacheControl data))
  (when-let [data (lookup-entry config id :content-disposition)]
    (. builder contentDisposition data))
  (when-let [data (lookup-entry config id :content-encoding)]
    (. builder contentEncoding data))
  (when-let [data (lookup-entry config id :content-language)]
    (. builder contentLanguage data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :destination-bucket)]
    (. builder destinationBucket data))
  (when-let [data (lookup-entry config id :destination-key-prefix)]
    (. builder destinationKeyPrefix data))
  (when-let [data (lookup-entry config id :distribution)]
    (. builder distribution data))
  (when-let [data (lookup-entry config id :distribution-paths)]
    (. builder distributionPaths data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :expires)]
    (. builder expires data))
  (when-let [data (lookup-entry config id :extract)]
    (. builder extract data))
  (when-let [data (lookup-entry config id :include)]
    (. builder include data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-let [data (lookup-entry config id :retain-on-delete)]
    (. builder retainOnDelete data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (server-side-encryption config id :server-side-encryption)]
    (. builder serverSideEncryption data))
  (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
    (. builder serverSideEncryptionAwsKmsKeyId data))
  (when-let [data (lookup-entry config id :server-side-encryption-customer-algorithm)]
    (. builder serverSideEncryptionCustomerAlgorithm data))
  (when-let [data (lookup-entry config id :sign-content)]
    (. builder signContent data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-let [data (storage-class config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :use-efs)]
    (. builder useEfs data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-let [data (lookup-entry config id :website-redirect-location)]
    (. builder websiteRedirectLocation data))
  (.build builder))


(defn build-deploy-time-substituted-file-builder
  "The build-deploy-time-substituted-file-builder function updates a DeployTimeSubstitutedFile$Builder instance using the provided configuration.
  The function takes the DeployTimeSubstitutedFile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:destination-bucket` |
| `destinationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-key` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `substitutions` | java.util.Map | [[cdk.support/lookup-entry]] | `:substitutions` |
"
  [^DeployTimeSubstitutedFile$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-bucket)]
    (. builder destinationBucket data))
  (when-let [data (lookup-entry config id :destination-key)]
    (. builder destinationKey data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :substitutions)]
    (. builder substitutions data))
  (.build builder))


(defn build-deploy-time-substituted-file-props-builder
  "The build-deploy-time-substituted-file-props-builder function updates a DeployTimeSubstitutedFileProps$Builder instance using the provided configuration.
  The function takes the DeployTimeSubstitutedFileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:destination-bucket` |
| `destinationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-key` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `substitutions` | java.util.Map | [[cdk.support/lookup-entry]] | `:substitutions` |
"
  [^DeployTimeSubstitutedFileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-bucket)]
    (. builder destinationBucket data))
  (when-let [data (lookup-entry config id :destination-key)]
    (. builder destinationKey data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :substitutions)]
    (. builder substitutions data))
  (.build builder))


(defn build-deployment-source-context-builder
  "The build-deployment-source-context-builder function updates a DeploymentSourceContext$Builder instance using the provided configuration.
  The function takes the DeploymentSourceContext$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `handlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:handler-role` |
"
  [^DeploymentSourceContext$Builder builder id config]
  (when-let [data (lookup-entry config id :handler-role)]
    (. builder handlerRole data))
  (.build builder))


(defn build-source-config-builder
  "The build-source-config-builder function updates a SourceConfig$Builder instance using the provided configuration.
  The function takes the SourceConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `markers` | java.util.Map | [[cdk.support/lookup-entry]] | `:markers` |
| `zipObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:zip-object-key` |
"
  [^SourceConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :markers)]
    (. builder markers data))
  (when-let [data (lookup-entry config id :zip-object-key)]
    (. builder zipObjectKey data))
  (.build builder))