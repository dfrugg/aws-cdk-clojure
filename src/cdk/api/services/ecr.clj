(ns cdk.api.services.ecr
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecr package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
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


(defn cfn-public-repository-builder>
  "The cfn-public-repository-builder> function updates a CfnPublicRepository$Builder instance using the provided configuration.
  The function takes the CfnPublicRepository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCatalogData` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-catalog-data` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPublicRepository$Builder builder id config]
  (when-some [data (lookup-entry config id :repository-catalog-data)]
    (. builder repositoryCatalogData data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :repository-policy-text)]
    (. builder repositoryPolicyText data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-public-repository-builder
  "Creates a  `CfnPublicRepository$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-public-repository-builder> (CfnPublicRepository$Builder/create scope (name id)) id config))


(defn cfn-public-repository-props-builder>
  "The cfn-public-repository-props-builder> function updates a CfnPublicRepositoryProps$Builder instance using the provided configuration.
  The function takes the CfnPublicRepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCatalogData` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-catalog-data` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPublicRepositoryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :repository-catalog-data)]
    (. builder repositoryCatalogData data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :repository-policy-text)]
    (. builder repositoryPolicyText data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-public-repository-props-builder
  "Creates a  `CfnPublicRepositoryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-public-repository-props-builder> (new CfnPublicRepositoryProps$Builder) id config))


(defn cfn-public-repository-repository-catalog-data-property-builder>
  "The cfn-public-repository-repository-catalog-data-property-builder> function updates a CfnPublicRepository$RepositoryCatalogDataProperty$Builder instance using the provided configuration.
  The function takes the CfnPublicRepository$RepositoryCatalogDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aboutText` | java.lang.String | [[cdk.support/lookup-entry]] | `:about-text` |
| `architectures` | java.util.List | [[cdk.support/lookup-entry]] | `:architectures` |
| `operatingSystems` | java.util.List | [[cdk.support/lookup-entry]] | `:operating-systems` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `usageText` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-text` |
"
  [^CfnPublicRepository$RepositoryCatalogDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :about-text)]
    (. builder aboutText data))
  (when-some [data (lookup-entry config id :architectures)]
    (. builder architectures data))
  (when-some [data (lookup-entry config id :operating-systems)]
    (. builder operatingSystems data))
  (when-some [data (lookup-entry config id :repository-description)]
    (. builder repositoryDescription data))
  (when-some [data (lookup-entry config id :usage-text)]
    (. builder usageText data))
  (.build builder))


(defn cfn-public-repository-repository-catalog-data-property-builder
  "Creates a  `CfnPublicRepository$RepositoryCatalogDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-public-repository-repository-catalog-data-property-builder> (new CfnPublicRepository$RepositoryCatalogDataProperty$Builder) id config))


(defn cfn-pull-through-cache-rule-builder>
  "The cfn-pull-through-cache-rule-builder> function updates a CfnPullThroughCacheRule$Builder instance using the provided configuration.
  The function takes the CfnPullThroughCacheRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-arn` |
| `ecrRepositoryPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecr-repository-prefix` |
| `upstreamRegistry` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry` |
| `upstreamRegistryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry-url` |
"
  [^CfnPullThroughCacheRule$Builder builder id config]
  (when-some [data (lookup-entry config id :credential-arn)]
    (. builder credentialArn data))
  (when-some [data (lookup-entry config id :ecr-repository-prefix)]
    (. builder ecrRepositoryPrefix data))
  (when-some [data (lookup-entry config id :upstream-registry)]
    (. builder upstreamRegistry data))
  (when-some [data (lookup-entry config id :upstream-registry-url)]
    (. builder upstreamRegistryUrl data))
  (.build builder))


(defn cfn-pull-through-cache-rule-builder
  "Creates a  `CfnPullThroughCacheRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-pull-through-cache-rule-builder> (CfnPullThroughCacheRule$Builder/create scope (name id)) id config))


(defn cfn-pull-through-cache-rule-props-builder>
  "The cfn-pull-through-cache-rule-props-builder> function updates a CfnPullThroughCacheRuleProps$Builder instance using the provided configuration.
  The function takes the CfnPullThroughCacheRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-arn` |
| `ecrRepositoryPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecr-repository-prefix` |
| `upstreamRegistry` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry` |
| `upstreamRegistryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:upstream-registry-url` |
"
  [^CfnPullThroughCacheRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :credential-arn)]
    (. builder credentialArn data))
  (when-some [data (lookup-entry config id :ecr-repository-prefix)]
    (. builder ecrRepositoryPrefix data))
  (when-some [data (lookup-entry config id :upstream-registry)]
    (. builder upstreamRegistry data))
  (when-some [data (lookup-entry config id :upstream-registry-url)]
    (. builder upstreamRegistryUrl data))
  (.build builder))


(defn cfn-pull-through-cache-rule-props-builder
  "Creates a  `CfnPullThroughCacheRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-pull-through-cache-rule-props-builder> (new CfnPullThroughCacheRuleProps$Builder) id config))


(defn cfn-registry-policy-builder>
  "The cfn-registry-policy-builder> function updates a CfnRegistryPolicy$Builder instance using the provided configuration.
  The function takes the CfnRegistryPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-text` |
"
  [^CfnRegistryPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-text)]
    (. builder policyText data))
  (.build builder))


(defn cfn-registry-policy-builder
  "Creates a  `CfnRegistryPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-registry-policy-builder> (CfnRegistryPolicy$Builder/create scope (name id)) id config))


(defn cfn-registry-policy-props-builder>
  "The cfn-registry-policy-props-builder> function updates a CfnRegistryPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnRegistryPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-text` |
"
  [^CfnRegistryPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-text)]
    (. builder policyText data))
  (.build builder))


(defn cfn-registry-policy-props-builder
  "Creates a  `CfnRegistryPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-registry-policy-props-builder> (new CfnRegistryPolicyProps$Builder) id config))


(defn cfn-replication-configuration-builder>
  "The cfn-replication-configuration-builder> function updates a CfnReplicationConfiguration$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
"
  [^CfnReplicationConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (.build builder))


(defn cfn-replication-configuration-builder
  "Creates a  `CfnReplicationConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-replication-configuration-builder> (CfnReplicationConfiguration$Builder/create scope (name id)) id config))


(defn cfn-replication-configuration-props-builder>
  "The cfn-replication-configuration-props-builder> function updates a CfnReplicationConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
"
  [^CfnReplicationConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (.build builder))


(defn cfn-replication-configuration-props-builder
  "Creates a  `CfnReplicationConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replication-configuration-props-builder> (new CfnReplicationConfigurationProps$Builder) id config))


(defn cfn-replication-configuration-replication-configuration-property-builder>
  "The cfn-replication-configuration-replication-configuration-property-builder> function updates a CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-replication-configuration-replication-configuration-property-builder
  "Creates a  `CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replication-configuration-replication-configuration-property-builder> (new CfnReplicationConfiguration$ReplicationConfigurationProperty$Builder) id config))


(defn cfn-replication-configuration-replication-destination-property-builder>
  "The cfn-replication-configuration-replication-destination-property-builder> function updates a CfnReplicationConfiguration$ReplicationDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfiguration$ReplicationDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |
"
  [^CfnReplicationConfiguration$ReplicationDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :registry-id)]
    (. builder registryId data))
  (.build builder))


(defn cfn-replication-configuration-replication-destination-property-builder
  "Creates a  `CfnReplicationConfiguration$ReplicationDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replication-configuration-replication-destination-property-builder> (new CfnReplicationConfiguration$ReplicationDestinationProperty$Builder) id config))


(defn cfn-replication-configuration-replication-rule-property-builder>
  "The cfn-replication-configuration-replication-rule-property-builder> function updates a CfnReplicationConfiguration$ReplicationRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfiguration$ReplicationRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `repositoryFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:repository-filters` |
"
  [^CfnReplicationConfiguration$ReplicationRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :repository-filters)]
    (. builder repositoryFilters data))
  (.build builder))


(defn cfn-replication-configuration-replication-rule-property-builder
  "Creates a  `CfnReplicationConfiguration$ReplicationRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replication-configuration-replication-rule-property-builder> (new CfnReplicationConfiguration$ReplicationRuleProperty$Builder) id config))


(defn cfn-replication-configuration-repository-filter-property-builder>
  "The cfn-replication-configuration-repository-filter-property-builder> function updates a CfnReplicationConfiguration$RepositoryFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationConfiguration$RepositoryFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter` |
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |
"
  [^CfnReplicationConfiguration$RepositoryFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :filter-type)]
    (. builder filterType data))
  (.build builder))


(defn cfn-replication-configuration-repository-filter-property-builder
  "Creates a  `CfnReplicationConfiguration$RepositoryFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-replication-configuration-repository-filter-property-builder> (new CfnReplicationConfiguration$RepositoryFilterProperty$Builder) id config))


(defn cfn-repository-builder>
  "The cfn-repository-builder> function updates a CfnRepository$Builder instance using the provided configuration.
  The function takes the CfnRepository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageScanningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | software.amazon.awscdk.services.ecr.CfnRepository$LifecyclePolicyProperty | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRepository$Builder builder id config]
  (when-some [data (lookup-entry config id :empty-on-delete)]
    (. builder emptyOnDelete data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :repository-policy-text)]
    (. builder repositoryPolicyText data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-repository-builder
  "Creates a  `CfnRepository$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-repository-builder> (CfnRepository$Builder/create scope (name id)) id config))


(defn cfn-repository-creation-template-builder>
  "The cfn-repository-creation-template-builder> function updates a CfnRepositoryCreationTemplate$Builder instance using the provided configuration.
  The function takes the CfnRepositoryCreationTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appliedFor` | java.util.List | [[cdk.support/lookup-entry]] | `:applied-for` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `repositoryPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-policy` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnRepositoryCreationTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :applied-for)]
    (. builder appliedFor data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :repository-policy)]
    (. builder repositoryPolicy data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-repository-creation-template-builder
  "Creates a  `CfnRepositoryCreationTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-repository-creation-template-builder> (CfnRepositoryCreationTemplate$Builder/create scope (name id)) id config))


(defn cfn-repository-creation-template-encryption-configuration-property-builder>
  "The cfn-repository-creation-template-encryption-configuration-property-builder> function updates a CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-repository-creation-template-encryption-configuration-property-builder
  "Creates a  `CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-creation-template-encryption-configuration-property-builder> (new CfnRepositoryCreationTemplate$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-repository-creation-template-props-builder>
  "The cfn-repository-creation-template-props-builder> function updates a CfnRepositoryCreationTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnRepositoryCreationTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appliedFor` | java.util.List | [[cdk.support/lookup-entry]] | `:applied-for` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionConfiguration` | software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `repositoryPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-policy` |
| `resourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-tags` |
"
  [^CfnRepositoryCreationTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :applied-for)]
    (. builder appliedFor data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :repository-policy)]
    (. builder repositoryPolicy data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (.build builder))


(defn cfn-repository-creation-template-props-builder
  "Creates a  `CfnRepositoryCreationTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-creation-template-props-builder> (new CfnRepositoryCreationTemplateProps$Builder) id config))


(defn cfn-repository-encryption-configuration-property-builder>
  "The cfn-repository-encryption-configuration-property-builder> function updates a CfnRepository$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRepository$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnRepository$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-repository-encryption-configuration-property-builder
  "Creates a  `CfnRepository$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-encryption-configuration-property-builder> (new CfnRepository$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-repository-image-scanning-configuration-property-builder>
  "The cfn-repository-image-scanning-configuration-property-builder> function updates a CfnRepository$ImageScanningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRepository$ImageScanningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scanOnPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scan-on-push` |
"
  [^CfnRepository$ImageScanningConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :scan-on-push)]
    (. builder scanOnPush data))
  (.build builder))


(defn cfn-repository-image-scanning-configuration-property-builder
  "Creates a  `CfnRepository$ImageScanningConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-image-scanning-configuration-property-builder> (new CfnRepository$ImageScanningConfigurationProperty$Builder) id config))


(defn cfn-repository-lifecycle-policy-property-builder>
  "The cfn-repository-lifecycle-policy-property-builder> function updates a CfnRepository$LifecyclePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnRepository$LifecyclePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lifecyclePolicyText` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy-text` |
| `registryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-id` |
"
  [^CfnRepository$LifecyclePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lifecycle-policy-text)]
    (. builder lifecyclePolicyText data))
  (when-some [data (lookup-entry config id :registry-id)]
    (. builder registryId data))
  (.build builder))


(defn cfn-repository-lifecycle-policy-property-builder
  "Creates a  `CfnRepository$LifecyclePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-lifecycle-policy-property-builder> (new CfnRepository$LifecyclePolicyProperty$Builder) id config))


(defn cfn-repository-props-builder>
  "The cfn-repository-props-builder> function updates a CfnRepositoryProps$Builder instance using the provided configuration.
  The function takes the CfnRepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:empty-on-delete` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `imageScanningConfiguration` | software.amazon.awscdk.services.ecr.CfnRepository$ImageScanningConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTagMutability` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag-mutability` |
| `lifecyclePolicy` | software.amazon.awscdk.services.ecr.CfnRepository$LifecyclePolicyProperty | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryPolicyText` | java.lang.Object | [[cdk.support/lookup-entry]] | `:repository-policy-text` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRepositoryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :empty-on-delete)]
    (. builder emptyOnDelete data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-policy)]
    (. builder lifecyclePolicy data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :repository-policy-text)]
    (. builder repositoryPolicyText data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-repository-props-builder
  "Creates a  `CfnRepositoryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-repository-props-builder> (new CfnRepositoryProps$Builder) id config))


(defn lifecycle-rule-builder>
  "The lifecycle-rule-builder> function updates a LifecycleRule$Builder instance using the provided configuration.
  The function takes the LifecycleRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxImageAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-image-age` |
| `maxImageCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-image-count` |
| `rulePriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-priority` |
| `tagPatternList` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-pattern-list` |
| `tagPrefixList` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-prefix-list` |
| `tagStatus` | software.amazon.awscdk.services.ecr.TagStatus | [[cdk.api.services.ecr/tag-status]] | `:tag-status` |
"
  [^LifecycleRule$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-image-age)]
    (. builder maxImageAge data))
  (when-some [data (lookup-entry config id :max-image-count)]
    (. builder maxImageCount data))
  (when-some [data (lookup-entry config id :rule-priority)]
    (. builder rulePriority data))
  (when-some [data (lookup-entry config id :tag-pattern-list)]
    (. builder tagPatternList data))
  (when-some [data (lookup-entry config id :tag-prefix-list)]
    (. builder tagPrefixList data))
  (when-some [data (tag-status config id :tag-status)]
    (. builder tagStatus data))
  (.build builder))


(defn lifecycle-rule-builder
  "Creates a  `LifecycleRule$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lifecycle-rule-builder> (new LifecycleRule$Builder) id config))


(defn on-cloud-trail-image-pushed-options-builder>
  "The on-cloud-trail-image-pushed-options-builder> function updates a OnCloudTrailImagePushedOptions$Builder instance using the provided configuration.
  The function takes the OnCloudTrailImagePushedOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^OnCloudTrailImagePushedOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cross-stack-scope)]
    (. builder crossStackScope data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn on-cloud-trail-image-pushed-options-builder
  "Creates a  `OnCloudTrailImagePushedOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (on-cloud-trail-image-pushed-options-builder> (new OnCloudTrailImagePushedOptions$Builder) id config))


(defn on-image-scan-completed-options-builder>
  "The on-image-scan-completed-options-builder> function updates a OnImageScanCompletedOptions$Builder instance using the provided configuration.
  The function takes the OnImageScanCompletedOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `imageTags` | java.util.List | [[cdk.support/lookup-entry]] | `:image-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^OnImageScanCompletedOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cross-stack-scope)]
    (. builder crossStackScope data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-some [data (lookup-entry config id :image-tags)]
    (. builder imageTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn on-image-scan-completed-options-builder
  "Creates a  `OnImageScanCompletedOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (on-image-scan-completed-options-builder> (new OnImageScanCompletedOptions$Builder) id config))


(defn repository-attributes-builder>
  "The repository-attributes-builder> function updates a RepositoryAttributes$Builder instance using the provided configuration.
  The function takes the RepositoryAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-arn` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^RepositoryAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :repository-arn)]
    (. builder repositoryArn data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn repository-attributes-builder
  "Creates a  `RepositoryAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (repository-attributes-builder> (new RepositoryAttributes$Builder) id config))


(defn repository-builder>
  "The repository-builder> function updates a Repository$Builder instance using the provided configuration.
  The function takes the Repository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^Repository$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-delete-images)]
    (. builder autoDeleteImages data))
  (when-some [data (lookup-entry config id :empty-on-delete)]
    (. builder emptyOnDelete data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :image-scan-on-push)]
    (. builder imageScanOnPush data))
  (when-some [data (tag-mutability config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-registry-id)]
    (. builder lifecycleRegistryId data))
  (when-some [data (lookup-entry config id :lifecycle-rules)]
    (. builder lifecycleRules data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn repository-builder
  "Creates a  `Repository$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (repository-builder> (Repository$Builder/create scope (name id)) id config))


(defn repository-props-builder>
  "The repository-props-builder> function updates a RepositoryProps$Builder instance using the provided configuration.
  The function takes the RepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^RepositoryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-delete-images)]
    (. builder autoDeleteImages data))
  (when-some [data (lookup-entry config id :empty-on-delete)]
    (. builder emptyOnDelete data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :image-scan-on-push)]
    (. builder imageScanOnPush data))
  (when-some [data (tag-mutability config id :image-tag-mutability)]
    (. builder imageTagMutability data))
  (when-some [data (lookup-entry config id :lifecycle-registry-id)]
    (. builder lifecycleRegistryId data))
  (when-some [data (lookup-entry config id :lifecycle-rules)]
    (. builder lifecycleRules data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn repository-props-builder
  "Creates a  `RepositoryProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (repository-props-builder> (new RepositoryProps$Builder) id config))