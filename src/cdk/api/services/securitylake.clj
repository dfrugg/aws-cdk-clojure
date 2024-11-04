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


(defn cfn-aws-log-source-builder
  "The cfn-aws-log-source-builder function buildes out new instances of 
CfnAwsLogSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (CfnAwsLogSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accounts)]
      (. builder accounts data))
    (when-let [data (lookup-entry config id :data-lake-arn)]
      (. builder dataLakeArn data))
    (when-let [data (lookup-entry config id :source-name)]
      (. builder sourceName data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn cfn-aws-log-source-props-builder
  "The cfn-aws-log-source-props-builder function buildes out new instances of 
CfnAwsLogSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (CfnAwsLogSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :accounts)]
      (. builder accounts data))
    (when-let [data (lookup-entry config id :data-lake-arn)]
      (. builder dataLakeArn data))
    (when-let [data (lookup-entry config id :source-name)]
      (. builder sourceName data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn cfn-data-lake-builder
  "The cfn-data-lake-builder function buildes out new instances of 
CfnDataLake$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `metaStoreManagerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:meta-store-manager-role-arn` |
| `replicationConfiguration` | software.amazon.awscdk.services.securitylake.CfnDataLake$ReplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataLake$Builder/create stack id)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :lifecycle-configuration)]
      (. builder lifecycleConfiguration data))
    (when-let [data (lookup-entry config id :meta-store-manager-role-arn)]
      (. builder metaStoreManagerRoleArn data))
    (when-let [data (lookup-entry config id :replication-configuration)]
      (. builder replicationConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-lake-encryption-configuration-property-builder
  "The cfn-data-lake-encryption-configuration-property-builder function buildes out new instances of 
CfnDataLake$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnDataLake$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-data-lake-expiration-property-builder
  "The cfn-data-lake-expiration-property-builder function buildes out new instances of 
CfnDataLake$ExpirationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |"
  [stack id config]
  (let [builder (CfnDataLake$ExpirationProperty$Builder.)]
    (when-let [data (lookup-entry config id :days)]
      (. builder days data))
    (.build builder)))


(defn cfn-data-lake-lifecycle-configuration-property-builder
  "The cfn-data-lake-lifecycle-configuration-property-builder function buildes out new instances of 
CfnDataLake$LifecycleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiration` | software.amazon.awscdk.services.securitylake.CfnDataLake$ExpirationProperty | [[cdk.support/lookup-entry]] | `:expiration` |
| `transitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transitions` |"
  [stack id config]
  (let [builder (CfnDataLake$LifecycleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :expiration)]
      (. builder expiration data))
    (when-let [data (lookup-entry config id :transitions)]
      (. builder transitions data))
    (.build builder)))


(defn cfn-data-lake-props-builder
  "The cfn-data-lake-props-builder function buildes out new instances of 
CfnDataLakeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `metaStoreManagerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:meta-store-manager-role-arn` |
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataLakeProps$Builder.)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :lifecycle-configuration)]
      (. builder lifecycleConfiguration data))
    (when-let [data (lookup-entry config id :meta-store-manager-role-arn)]
      (. builder metaStoreManagerRoleArn data))
    (when-let [data (lookup-entry config id :replication-configuration)]
      (. builder replicationConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-lake-replication-configuration-property-builder
  "The cfn-data-lake-replication-configuration-property-builder function buildes out new instances of 
CfnDataLake$ReplicationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDataLake$ReplicationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :regions)]
      (. builder regions data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-data-lake-transitions-property-builder
  "The cfn-data-lake-transitions-property-builder function buildes out new instances of 
CfnDataLake$TransitionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |
| `storageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-class` |"
  [stack id config]
  (let [builder (CfnDataLake$TransitionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :days)]
      (. builder days data))
    (when-let [data (lookup-entry config id :storage-class)]
      (. builder storageClass data))
    (.build builder)))


(defn cfn-subscriber-aws-log-source-property-builder
  "The cfn-subscriber-aws-log-source-property-builder function buildes out new instances of 
CfnSubscriber$AwsLogSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (CfnSubscriber$AwsLogSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-name)]
      (. builder sourceName data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn cfn-subscriber-builder
  "The cfn-subscriber-builder function buildes out new instances of 
CfnSubscriber$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-types` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `subscriberDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-description` |
| `subscriberIdentity` | software.amazon.awscdk.services.securitylake.CfnSubscriber$SubscriberIdentityProperty | [[cdk.support/lookup-entry]] | `:subscriber-identity` |
| `subscriberName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubscriber$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-types)]
      (. builder accessTypes data))
    (when-let [data (lookup-entry config id :data-lake-arn)]
      (. builder dataLakeArn data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :subscriber-description)]
      (. builder subscriberDescription data))
    (when-let [data (lookup-entry config id :subscriber-identity)]
      (. builder subscriberIdentity data))
    (when-let [data (lookup-entry config id :subscriber-name)]
      (. builder subscriberName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-subscriber-custom-log-source-property-builder
  "The cfn-subscriber-custom-log-source-property-builder function buildes out new instances of 
CfnSubscriber$CustomLogSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-name` |
| `sourceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-version` |"
  [stack id config]
  (let [builder (CfnSubscriber$CustomLogSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-name)]
      (. builder sourceName data))
    (when-let [data (lookup-entry config id :source-version)]
      (. builder sourceVersion data))
    (.build builder)))


(defn cfn-subscriber-props-builder
  "The cfn-subscriber-props-builder function buildes out new instances of 
CfnSubscriberProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-types` |
| `dataLakeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-arn` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `subscriberDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-description` |
| `subscriberIdentity` | software.amazon.awscdk.services.securitylake.CfnSubscriber$SubscriberIdentityProperty | [[cdk.support/lookup-entry]] | `:subscriber-identity` |
| `subscriberName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscriber-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubscriberProps$Builder.)]
    (when-let [data (lookup-entry config id :access-types)]
      (. builder accessTypes data))
    (when-let [data (lookup-entry config id :data-lake-arn)]
      (. builder dataLakeArn data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :subscriber-description)]
      (. builder subscriberDescription data))
    (when-let [data (lookup-entry config id :subscriber-identity)]
      (. builder subscriberIdentity data))
    (when-let [data (lookup-entry config id :subscriber-name)]
      (. builder subscriberName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-subscriber-source-property-builder
  "The cfn-subscriber-source-property-builder function buildes out new instances of 
CfnSubscriber$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLogSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-log-source` |
| `customLogSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-log-source` |"
  [stack id config]
  (let [builder (CfnSubscriber$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-log-source)]
      (. builder awsLogSource data))
    (when-let [data (lookup-entry config id :custom-log-source)]
      (. builder customLogSource data))
    (.build builder)))


(defn cfn-subscriber-subscriber-identity-property-builder
  "The cfn-subscriber-subscriber-identity-property-builder function buildes out new instances of 
CfnSubscriber$SubscriberIdentityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnSubscriber$SubscriberIdentityProperty$Builder.)]
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))