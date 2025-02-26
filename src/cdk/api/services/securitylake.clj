(ns cdk.api.services.securitylake
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.securitylake package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.securitylake CfnAwsLogSource$Builder
                                                         CfnAwsLogSourceProps$Builder
                                                         CfnDataLake$Builder
                                                         CfnDataLake$EncryptionConfigurationProperty$Builder
                                                         CfnDataLake$ExpirationProperty$Builder
                                                         CfnDataLake$LifecycleConfigurationProperty$Builder
                                                         CfnDataLake$ReplicationConfigurationProperty$Builder
                                                         CfnDataLake$TransitionsProperty$Builder
                                                         CfnDataLakeProps$Builder
                                                         CfnSubscriber$AwsLogSourceProperty$Builder
                                                         CfnSubscriber$Builder
                                                         CfnSubscriber$CustomLogSourceProperty$Builder
                                                         CfnSubscriber$SourceProperty$Builder
                                                         CfnSubscriber$SubscriberIdentityProperty$Builder
                                                         CfnSubscriberProps$Builder]))


(defn build-cfn-aws-log-source-builder
  "The build-cfn-aws-log-source-builder function updates a CfnAwsLogSource$Builder instance using the provided configuration.
  The function takes the CfnAwsLogSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^CfnAwsLogSource$Builder builder id config]
  (when-some [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-some [data (lookup-entry config id :data-lake-arn)]
    (. builder dataLakeArn data))
  (when-some [data (lookup-entry config id :source-name)]
    (. builder sourceName data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn cfn-aws-log-source-builder
  "Creates a  `CfnAwsLogSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-aws-log-source-builder (CfnAwsLogSource$Builder/create scope (name id)) id config))


(defn build-cfn-aws-log-source-props-builder
  "The build-cfn-aws-log-source-props-builder function updates a CfnAwsLogSourceProps$Builder instance using the provided configuration.
  The function takes the CfnAwsLogSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^CfnAwsLogSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-some [data (lookup-entry config id :data-lake-arn)]
    (. builder dataLakeArn data))
  (when-some [data (lookup-entry config id :source-name)]
    (. builder sourceName data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn cfn-aws-log-source-props-builder
  "Creates a  `CfnAwsLogSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-aws-log-source-props-builder (new CfnAwsLogSourceProps$Builder) id config))


(defn build-cfn-data-lake-builder
  "The build-cfn-data-lake-builder function updates a CfnDataLake$Builder instance using the provided configuration.
  The function takes the CfnDataLake$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `metaStoreManagerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:meta-store-manager-role-arn` |
| `replicationConfiguration` | software.amazon.awscdk.services.securitylake.CfnDataLake$ReplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataLake$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-some [data (lookup-entry config id :meta-store-manager-role-arn)]
    (. builder metaStoreManagerRoleArn data))
  (when-some [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-lake-builder
  "Creates a  `CfnDataLake$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-data-lake-builder (CfnDataLake$Builder/create scope (name id)) id config))


(defn build-cfn-data-lake-encryption-configuration-property-builder
  "The build-cfn-data-lake-encryption-configuration-property-builder function updates a CfnDataLake$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLake$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnDataLake$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-data-lake-encryption-configuration-property-builder
  "Creates a  `CfnDataLake$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-encryption-configuration-property-builder (new CfnDataLake$EncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-data-lake-expiration-property-builder
  "The build-cfn-data-lake-expiration-property-builder function updates a CfnDataLake$ExpirationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLake$ExpirationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |
"
  [^CfnDataLake$ExpirationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :days)]
    (. builder days data))
  (.build builder))


(defn cfn-data-lake-expiration-property-builder
  "Creates a  `CfnDataLake$ExpirationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-expiration-property-builder (new CfnDataLake$ExpirationProperty$Builder) id config))


(defn build-cfn-data-lake-lifecycle-configuration-property-builder
  "The build-cfn-data-lake-lifecycle-configuration-property-builder function updates a CfnDataLake$LifecycleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLake$LifecycleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiration` | software.amazon.awscdk.services.securitylake.CfnDataLake$ExpirationProperty | [[cdk.support/lookup-entry]] | `:expiration` |
| `transitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transitions` |
"
  [^CfnDataLake$LifecycleConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :expiration)]
    (. builder expiration data))
  (when-some [data (lookup-entry config id :transitions)]
    (. builder transitions data))
  (.build builder))


(defn cfn-data-lake-lifecycle-configuration-property-builder
  "Creates a  `CfnDataLake$LifecycleConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-lifecycle-configuration-property-builder (new CfnDataLake$LifecycleConfigurationProperty$Builder) id config))


(defn build-cfn-data-lake-props-builder
  "The build-cfn-data-lake-props-builder function updates a CfnDataLakeProps$Builder instance using the provided configuration.
  The function takes the CfnDataLakeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `metaStoreManagerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:meta-store-manager-role-arn` |
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataLakeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-some [data (lookup-entry config id :meta-store-manager-role-arn)]
    (. builder metaStoreManagerRoleArn data))
  (when-some [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-lake-props-builder
  "Creates a  `CfnDataLakeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-props-builder (new CfnDataLakeProps$Builder) id config))


(defn build-cfn-data-lake-replication-configuration-property-builder
  "The build-cfn-data-lake-replication-configuration-property-builder function updates a CfnDataLake$ReplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLake$ReplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDataLake$ReplicationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-data-lake-replication-configuration-property-builder
  "Creates a  `CfnDataLake$ReplicationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-replication-configuration-property-builder (new CfnDataLake$ReplicationConfigurationProperty$Builder) id config))


(defn build-cfn-data-lake-transitions-property-builder
  "The build-cfn-data-lake-transitions-property-builder function updates a CfnDataLake$TransitionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLake$TransitionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |
| `storageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-class` |
"
  [^CfnDataLake$TransitionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :days)]
    (. builder days data))
  (when-some [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (.build builder))


(defn cfn-data-lake-transitions-property-builder
  "Creates a  `CfnDataLake$TransitionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-data-lake-transitions-property-builder (new CfnDataLake$TransitionsProperty$Builder) id config))


(defn build-cfn-subscriber-aws-log-source-property-builder
  "The build-cfn-subscriber-aws-log-source-property-builder function updates a CfnSubscriber$AwsLogSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriber$AwsLogSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^CfnSubscriber$AwsLogSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-name)]
    (. builder sourceName data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn cfn-subscriber-aws-log-source-property-builder
  "Creates a  `CfnSubscriber$AwsLogSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscriber-aws-log-source-property-builder (new CfnSubscriber$AwsLogSourceProperty$Builder) id config))


(defn build-cfn-subscriber-builder
  "The build-cfn-subscriber-builder function updates a CfnSubscriber$Builder instance using the provided configuration.
  The function takes the CfnSubscriber$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-types` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `subscriberDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-description` |
| `subscriberIdentity` | software.amazon.awscdk.services.securitylake.CfnSubscriber$SubscriberIdentityProperty | [[cdk.support/lookup-entry]] | `:subscriber-identity` |
| `subscriberName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubscriber$Builder builder id config]
  (when-some [data (lookup-entry config id :access-types)]
    (. builder accessTypes data))
  (when-some [data (lookup-entry config id :data-lake-arn)]
    (. builder dataLakeArn data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :subscriber-description)]
    (. builder subscriberDescription data))
  (when-some [data (lookup-entry config id :subscriber-identity)]
    (. builder subscriberIdentity data))
  (when-some [data (lookup-entry config id :subscriber-name)]
    (. builder subscriberName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subscriber-builder
  "Creates a  `CfnSubscriber$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-subscriber-builder (CfnSubscriber$Builder/create scope (name id)) id config))


(defn build-cfn-subscriber-custom-log-source-property-builder
  "The build-cfn-subscriber-custom-log-source-property-builder function updates a CfnSubscriber$CustomLogSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriber$CustomLogSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |
"
  [^CfnSubscriber$CustomLogSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-name)]
    (. builder sourceName data))
  (when-some [data (lookup-entry config id :source-version)]
    (. builder sourceVersion data))
  (.build builder))


(defn cfn-subscriber-custom-log-source-property-builder
  "Creates a  `CfnSubscriber$CustomLogSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscriber-custom-log-source-property-builder (new CfnSubscriber$CustomLogSourceProperty$Builder) id config))


(defn build-cfn-subscriber-props-builder
  "The build-cfn-subscriber-props-builder function updates a CfnSubscriberProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriberProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-types` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `subscriberDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-description` |
| `subscriberIdentity` | software.amazon.awscdk.services.securitylake.CfnSubscriber$SubscriberIdentityProperty | [[cdk.support/lookup-entry]] | `:subscriber-identity` |
| `subscriberName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubscriberProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-types)]
    (. builder accessTypes data))
  (when-some [data (lookup-entry config id :data-lake-arn)]
    (. builder dataLakeArn data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :subscriber-description)]
    (. builder subscriberDescription data))
  (when-some [data (lookup-entry config id :subscriber-identity)]
    (. builder subscriberIdentity data))
  (when-some [data (lookup-entry config id :subscriber-name)]
    (. builder subscriberName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subscriber-props-builder
  "Creates a  `CfnSubscriberProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscriber-props-builder (new CfnSubscriberProps$Builder) id config))


(defn build-cfn-subscriber-source-property-builder
  "The build-cfn-subscriber-source-property-builder function updates a CfnSubscriber$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriber$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLogSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-log-source` |
| `customLogSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-log-source` |
"
  [^CfnSubscriber$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-log-source)]
    (. builder awsLogSource data))
  (when-some [data (lookup-entry config id :custom-log-source)]
    (. builder customLogSource data))
  (.build builder))


(defn cfn-subscriber-source-property-builder
  "Creates a  `CfnSubscriber$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscriber-source-property-builder (new CfnSubscriber$SourceProperty$Builder) id config))


(defn build-cfn-subscriber-subscriber-identity-property-builder
  "The build-cfn-subscriber-subscriber-identity-property-builder function updates a CfnSubscriber$SubscriberIdentityProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriber$SubscriberIdentityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnSubscriber$SubscriberIdentityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-subscriber-subscriber-identity-property-builder
  "Creates a  `CfnSubscriber$SubscriberIdentityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscriber-subscriber-identity-property-builder (new CfnSubscriber$SubscriberIdentityProperty$Builder) id config))