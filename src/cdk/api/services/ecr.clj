(ns cdk.api.services.ecr
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecr package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [removal-policy]])
  (:import [software.amazon.awscdk.services.ecr CfnPublicRepository$Builder
                                                CfnPublicRepository$RepositoryCatalogDataProperty$Builder
                                                CfnPublicRepositoryProps$Builder
                                                CfnPullThroughCacheRule$Builder
                                                CfnPullThroughCacheRuleProps$Builder
                                                CfnRegistryPolicy$Builder
                                                CfnRegistryPolicyProps$Builder
                                                CfnReplicationConfiguration$Builder
                                                CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder
                                                CfnReplicationConfiguration$ReplicationDestinationProperty$Builder
                                                CfnReplicationConfiguration$ReplicationRuleProperty$Builder
                                                CfnReplicationConfiguration$RepositoryFilterProperty$Builder
                                                CfnReplicationConfigurationProps$Builder
                                                CfnRepository$Builder
                                                CfnRepository$EncryptionConfigurationProperty$Builder
                                                CfnRepository$ImageScanningConfigurationProperty$Builder
                                                CfnRepository$LifecyclePolicyProperty$Builder
                                                CfnRepositoryCreationTemplate$Builder
                                                CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder
                                                CfnRepositoryCreationTemplateProps$Builder
                                                CfnRepositoryProps$Builder
                                                LifecycleRule$Builder
                                                OnCloudTrailImagePushedOptions$Builder
                                                OnImageScanCompletedOptions$Builder
                                                Repository$Builder
                                                RepositoryAttributes$Builder
                                                RepositoryProps$Builder
                                                TagMutability
                                                TagStatus]))


(defn tag-mutability
  "The `tag-mutability` function data interprets values in the provided config data into a 
`TagMutability` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TagMutability` - the value is returned.
* is `:mutable` - `TagMutability/MUTABLE` is returned
* is `:immutable` - `TagMutability/IMMUTABLE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TagMutability data) data
      (= :mutable data) TagMutability/MUTABLE
      (= :immutable data) TagMutability/IMMUTABLE)))


(defn tag-status
  "The `tag-status` function data interprets values in the provided config data into a 
`TagStatus` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TagStatus` - the value is returned.
* is `:tagged` - `TagStatus/TAGGED` is returned
* is `:untagged` - `TagStatus/UNTAGGED` is returned
* is `:any` - `TagStatus/ANY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TagStatus data) data
      (= :tagged data) TagStatus/TAGGED
      (= :untagged data) TagStatus/UNTAGGED
      (= :any data) TagStatus/ANY)))


(defn cfn-public-repository-builder
  "The cfn-public-repository-builder function buildes out new instances of 
CfnPublicRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCatalogData` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-catalog-data` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPublicRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :repository-catalog-data)]
      (. builder repositoryCatalogData data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-policy-text)]
      (. builder repositoryPolicyText data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-public-repository-props-builder
  "The cfn-public-repository-props-builder function buildes out new instances of 
CfnPublicRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCatalogData` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-catalog-data` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPublicRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :repository-catalog-data)]
      (. builder repositoryCatalogData data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-policy-text)]
      (. builder repositoryPolicyText data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-public-repository-repository-catalog-data-property-builder
  "The cfn-public-repository-repository-catalog-data-property-builder function buildes out new instances of 
CfnPublicRepository$RepositoryCatalogDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aboutText` | java.lang.String | [[cdk.support/lookup-entry]] | `:about-text` |
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `operatingSystems` | java.util.List | [[cdk.support/lookup-entry]] | `:operating-systems` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `usageText` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-text` |"
  [stack id config]
  (let [builder (CfnPublicRepository$RepositoryCatalogDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :about-text)]
      (. builder aboutText data))
    (when-let [data (lookup-entry config id :architectures)]
      (. builder architectures data))
    (when-let [data (lookup-entry config id :operating-systems)]
      (. builder operatingSystems data))
    (when-let [data (lookup-entry config id :repository-description)]
      (. builder repositoryDescription data))
    (when-let [data (lookup-entry config id :usage-text)]
      (. builder usageText data))
    (.build builder)))


(defn cfn-pull-through-cache-rule-builder
  "The cfn-pull-through-cache-rule-builder function buildes out new instances of 
CfnPullThroughCacheRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-arn` |
| `ecrRepositoryPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecr-repository-prefix` |
| `upstreamRegistry` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry` |
| `upstreamRegistryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry-url` |"
  [stack id config]
  (let [builder (CfnPullThroughCacheRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :credential-arn)]
      (. builder credentialArn data))
    (when-let [data (lookup-entry config id :ecr-repository-prefix)]
      (. builder ecrRepositoryPrefix data))
    (when-let [data (lookup-entry config id :upstream-registry)]
      (. builder upstreamRegistry data))
    (when-let [data (lookup-entry config id :upstream-registry-url)]
      (. builder upstreamRegistryUrl data))
    (.build builder)))


(defn cfn-pull-through-cache-rule-props-builder
  "The cfn-pull-through-cache-rule-props-builder function buildes out new instances of 
CfnPullThroughCacheRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-arn` |
| `ecrRepositoryPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecr-repository-prefix` |
| `upstreamRegistry` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry` |
| `upstreamRegistryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry-url` |"
  [stack id config]
  (let [builder (CfnPullThroughCacheRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :credential-arn)]
      (. builder credentialArn data))
    (when-let [data (lookup-entry config id :ecr-repository-prefix)]
      (. builder ecrRepositoryPrefix data))
    (when-let [data (lookup-entry config id :upstream-registry)]
      (. builder upstreamRegistry data))
    (when-let [data (lookup-entry config id :upstream-registry-url)]
      (. builder upstreamRegistryUrl data))
    (.build builder)))


(defn cfn-registry-policy-builder
  "The cfn-registry-policy-builder function buildes out new instances of 
CfnRegistryPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-text` |"
  [stack id config]
  (let [builder (CfnRegistryPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (.build builder)))


(defn cfn-registry-policy-props-builder
  "The cfn-registry-policy-props-builder function buildes out new instances of 
CfnRegistryPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-text` |"
  [stack id config]
  (let [builder (CfnRegistryPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-text)]
      (. builder policyText data))
    (.build builder)))


(defn cfn-replication-configuration-builder
  "The cfn-replication-configuration-builder function buildes out new instances of 
CfnReplicationConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |"
  [stack id config]
  (let [builder (CfnReplicationConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :replication-configuration)]
      (. builder replicationConfiguration data))
    (.build builder)))


(defn cfn-replication-configuration-props-builder
  "The cfn-replication-configuration-props-builder function buildes out new instances of 
CfnReplicationConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |"
  [stack id config]
  (let [builder (CfnReplicationConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :replication-configuration)]
      (. builder replicationConfiguration data))
    (.build builder)))


(defn cfn-replication-configuration-replication-configuration-property-builder
  "The cfn-replication-configuration-replication-configuration-property-builder function buildes out new instances of 
CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-replication-configuration-replication-destination-property-builder
  "The cfn-replication-configuration-replication-destination-property-builder function buildes out new instances of 
CfnReplicationConfiguration$ReplicationDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |"
  [stack id config]
  (let [builder (CfnReplicationConfiguration$ReplicationDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :registry-id)]
      (. builder registryId data))
    (.build builder)))


(defn cfn-replication-configuration-replication-rule-property-builder
  "The cfn-replication-configuration-replication-rule-property-builder function buildes out new instances of 
CfnReplicationConfiguration$ReplicationRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `repositoryFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:repository-filters` |"
  [stack id config]
  (let [builder (CfnReplicationConfiguration$ReplicationRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :repository-filters)]
      (. builder repositoryFilters data))
    (.build builder)))


(defn cfn-replication-configuration-repository-filter-property-builder
  "The cfn-replication-configuration-repository-filter-property-builder function buildes out new instances of 
CfnReplicationConfiguration$RepositoryFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |"
  [stack id config]
  (let [builder (CfnReplicationConfiguration$RepositoryFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :filter-type)]
      (. builder filterType data))
    (.build builder)))


(defn cfn-repository-builder
  "The cfn-repository-builder function buildes out new instances of 
CfnRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageScanningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | software.amazon.awscdk.services.ecr.CfnRepository$LifecyclePolicyProperty | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :empty-on-delete)]
      (. builder emptyOnDelete data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-policy-text)]
      (. builder repositoryPolicyText data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-repository-creation-template-builder
  "The cfn-repository-creation-template-builder function buildes out new instances of 
CfnRepositoryCreationTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appliedFor` | java.util.List | [[cdk.support/lookup-entry]] | `:applied-for` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `repositoryPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-policy` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnRepositoryCreationTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :applied-for)]
      (. builder appliedFor data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :repository-policy)]
      (. builder repositoryPolicy data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-repository-creation-template-encryption-configuration-property-builder
  "The cfn-repository-creation-template-encryption-configuration-property-builder function buildes out new instances of 
CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-repository-creation-template-props-builder
  "The cfn-repository-creation-template-props-builder function buildes out new instances of 
CfnRepositoryCreationTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appliedFor` | java.util.List | [[cdk.support/lookup-entry]] | `:applied-for` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionConfiguration` | software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `repositoryPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-policy` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |"
  [stack id config]
  (let [builder (CfnRepositoryCreationTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :applied-for)]
      (. builder appliedFor data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :repository-policy)]
      (. builder repositoryPolicy data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (.build builder)))


(defn cfn-repository-encryption-configuration-property-builder
  "The cfn-repository-encryption-configuration-property-builder function buildes out new instances of 
CfnRepository$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnRepository$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-repository-image-scanning-configuration-property-builder
  "The cfn-repository-image-scanning-configuration-property-builder function buildes out new instances of 
CfnRepository$ImageScanningConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-on-push` |"
  [stack id config]
  (let [builder (CfnRepository$ImageScanningConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :scan-on-push)]
      (. builder scanOnPush data))
    (.build builder)))


(defn cfn-repository-lifecycle-policy-property-builder
  "The cfn-repository-lifecycle-policy-property-builder function buildes out new instances of 
CfnRepository$LifecyclePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lifecyclePolicyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy-text` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |"
  [stack id config]
  (let [builder (CfnRepository$LifecyclePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :lifecycle-policy-text)]
      (. builder lifecyclePolicyText data))
    (when-let [data (lookup-entry config id :registry-id)]
      (. builder registryId data))
    (.build builder)))


(defn cfn-repository-props-builder
  "The cfn-repository-props-builder function buildes out new instances of 
CfnRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageScanningConfiguration` | software.amazon.awscdk.services.ecr.CfnRepository$ImageScanningConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | software.amazon.awscdk.services.ecr.CfnRepository$LifecyclePolicyProperty | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :empty-on-delete)]
      (. builder emptyOnDelete data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-policy-text)]
      (. builder repositoryPolicyText data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn lifecycle-rule-builder
  "The lifecycle-rule-builder function buildes out new instances of 
LifecycleRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxImageAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-image-age` |
| `maxImageCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-image-count` |
| `rulePriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-priority` |
| `tagPatternList` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-pattern-list` |
| `tagPrefixList` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-prefix-list` |
| `tagStatus` | software.amazon.awscdk.services.ecr.TagStatus | [[cdk.api.services.ecr/tag-status]] | `:tag-status` |"
  [stack id config]
  (let [builder (LifecycleRule$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-image-age)]
      (. builder maxImageAge data))
    (when-let [data (lookup-entry config id :max-image-count)]
      (. builder maxImageCount data))
    (when-let [data (lookup-entry config id :rule-priority)]
      (. builder rulePriority data))
    (when-let [data (lookup-entry config id :tag-pattern-list)]
      (. builder tagPatternList data))
    (when-let [data (lookup-entry config id :tag-prefix-list)]
      (. builder tagPrefixList data))
    (when-let [data (tag-status config id :tag-status)]
      (. builder tagStatus data))
    (.build builder)))


(defn on-cloud-trail-image-pushed-options-builder
  "The on-cloud-trail-image-pushed-options-builder function buildes out new instances of 
OnCloudTrailImagePushedOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (OnCloudTrailImagePushedOptions$Builder.)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :image-tag)]
      (. builder imageTag data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn on-image-scan-completed-options-builder
  "The on-image-scan-completed-options-builder function buildes out new instances of 
OnImageScanCompletedOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `imageTags` | java.util.List | [[cdk.support/lookup-entry]] | `:image-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (OnImageScanCompletedOptions$Builder.)]
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :image-tags)]
      (. builder imageTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn repository-attributes-builder
  "The repository-attributes-builder function buildes out new instances of 
RepositoryAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-arn` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (RepositoryAttributes$Builder.)]
    (when-let [data (lookup-entry config id :repository-arn)]
      (. builder repositoryArn data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn repository-builder
  "The repository-builder function buildes out new instances of 
Repository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeleteImages` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-delete-images` |
| `emptyOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryption` | software.amazon.awscdk.services.ecr.RepositoryEncryption | [[cdk.support/lookup-entry]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `imageScanOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:image-scan-on-push` |
| `imageTagMutability` | software.amazon.awscdk.services.ecr.TagMutability | [[cdk.api.services.ecr/tag-mutability]] | `:image-tag-mutability` |
| `lifecycleRegistryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-registry-id` |
| `lifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-rules` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (Repository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-delete-images)]
      (. builder autoDeleteImages data))
    (when-let [data (lookup-entry config id :empty-on-delete)]
      (. builder emptyOnDelete data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :image-scan-on-push)]
      (. builder imageScanOnPush data))
    (when-let [data (tag-mutability config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-registry-id)]
      (. builder lifecycleRegistryId data))
    (when-let [data (lookup-entry config id :lifecycle-rules)]
      (. builder lifecycleRules data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn repository-props-builder
  "The repository-props-builder function buildes out new instances of 
RepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoDeleteImages` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-delete-images` |
| `emptyOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryption` | software.amazon.awscdk.services.ecr.RepositoryEncryption | [[cdk.support/lookup-entry]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `imageScanOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:image-scan-on-push` |
| `imageTagMutability` | software.amazon.awscdk.services.ecr.TagMutability | [[cdk.api.services.ecr/tag-mutability]] | `:image-tag-mutability` |
| `lifecycleRegistryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-registry-id` |
| `lifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-rules` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (RepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-delete-images)]
      (. builder autoDeleteImages data))
    (when-let [data (lookup-entry config id :empty-on-delete)]
      (. builder emptyOnDelete data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :image-scan-on-push)]
      (. builder imageScanOnPush data))
    (when-let [data (tag-mutability config id :image-tag-mutability)]
      (. builder imageTagMutability data))
    (when-let [data (lookup-entry config id :lifecycle-registry-id)]
      (. builder lifecycleRegistryId data))
    (when-let [data (lookup-entry config id :lifecycle-rules)]
      (. builder lifecycleRules data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))