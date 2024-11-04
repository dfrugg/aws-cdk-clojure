(ns cdk.api.services.cassandra
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cassandra package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cassandra CfnKeyspace$Builder
                                                      CfnKeyspace$ReplicationSpecificationProperty$Builder
                                                      CfnKeyspaceProps$Builder
                                                      CfnTable$AutoScalingSettingProperty$Builder
                                                      CfnTable$AutoScalingSpecificationProperty$Builder
                                                      CfnTable$BillingModeProperty$Builder
                                                      CfnTable$Builder
                                                      CfnTable$ClusteringKeyColumnProperty$Builder
                                                      CfnTable$ColumnProperty$Builder
                                                      CfnTable$EncryptionSpecificationProperty$Builder
                                                      CfnTable$ProvisionedThroughputProperty$Builder
                                                      CfnTable$ReplicaSpecificationProperty$Builder
                                                      CfnTable$ScalingPolicyProperty$Builder
                                                      CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder
                                                      CfnTableProps$Builder]))


(defn cfn-keyspace-builder
  "The cfn-keyspace-builder function buildes out new instances of 
CfnKeyspace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `replicationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKeyspace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :keyspace-name)]
      (. builder keyspaceName data))
    (when-let [data (lookup-entry config id :replication-specification)]
      (. builder replicationSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-keyspace-props-builder
  "The cfn-keyspace-props-builder function buildes out new instances of 
CfnKeyspaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `replicationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKeyspaceProps$Builder.)]
    (when-let [data (lookup-entry config id :keyspace-name)]
      (. builder keyspaceName data))
    (when-let [data (lookup-entry config id :replication-specification)]
      (. builder replicationSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-keyspace-replication-specification-property-builder
  "The cfn-keyspace-replication-specification-property-builder function buildes out new instances of 
CfnKeyspace$ReplicationSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regionList` | java.util.List | [[cdk.support/lookup-entry]] | `:region-list` |
| `replicationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-strategy` |"
  [stack id config]
  (let [builder (CfnKeyspace$ReplicationSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :region-list)]
      (. builder regionList data))
    (when-let [data (lookup-entry config id :replication-strategy)]
      (. builder replicationStrategy data))
    (.build builder)))


(defn cfn-table-auto-scaling-setting-property-builder
  "The cfn-table-auto-scaling-setting-property-builder function buildes out new instances of 
CfnTable$AutoScalingSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-scaling-disabled` |
| `maximumUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-units` |
| `minimumUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-units` |
| `scalingPolicy` | software.amazon.awscdk.services.cassandra.CfnTable$ScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:scaling-policy` |"
  [stack id config]
  (let [builder (CfnTable$AutoScalingSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-disabled)]
      (. builder autoScalingDisabled data))
    (when-let [data (lookup-entry config id :maximum-units)]
      (. builder maximumUnits data))
    (when-let [data (lookup-entry config id :minimum-units)]
      (. builder minimumUnits data))
    (when-let [data (lookup-entry config id :scaling-policy)]
      (. builder scalingPolicy data))
    (.build builder)))


(defn cfn-table-auto-scaling-specification-property-builder
  "The cfn-table-auto-scaling-specification-property-builder function buildes out new instances of 
CfnTable$AutoScalingSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-capacity-auto-scaling` |
| `writeCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-capacity-auto-scaling` |"
  [stack id config]
  (let [builder (CfnTable$AutoScalingSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-auto-scaling)]
      (. builder readCapacityAutoScaling data))
    (when-let [data (lookup-entry config id :write-capacity-auto-scaling)]
      (. builder writeCapacityAutoScaling data))
    (.build builder)))


(defn cfn-table-billing-mode-property-builder
  "The cfn-table-billing-mode-property-builder function buildes out new instances of 
CfnTable$BillingModeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `provisionedThroughput` | software.amazon.awscdk.services.cassandra.CfnTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |"
  [stack id config]
  (let [builder (CfnTable$BillingModeProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :provisioned-throughput)]
      (. builder provisionedThroughput data))
    (.build builder)))


(defn cfn-table-builder
  "The cfn-table-builder function buildes out new instances of 
CfnTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingSpecifications` | software.amazon.awscdk.services.cassandra.CfnTable$AutoScalingSpecificationProperty | [[cdk.support/lookup-entry]] | `:auto-scaling-specifications` |
| `billingMode` | software.amazon.awscdk.services.cassandra.CfnTable$BillingModeProperty | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `clientSideTimestampsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:client-side-timestamps-enabled` |
| `clusteringKeyColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:clustering-key-columns` |
| `defaultTimeToLive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-time-to-live` |
| `encryptionSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-specification` |
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `partitionKeyColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-key-columns` |
| `pointInTimeRecoveryEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-enabled` |
| `regularColumns` | java.util.List | [[cdk.support/lookup-entry]] | `:regular-columns` |
| `replicaSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-specifications` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-specifications)]
      (. builder autoScalingSpecifications data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :client-side-timestamps-enabled)]
      (. builder clientSideTimestampsEnabled data))
    (when-let [data (lookup-entry config id :clustering-key-columns)]
      (. builder clusteringKeyColumns data))
    (when-let [data (lookup-entry config id :default-time-to-live)]
      (. builder defaultTimeToLive data))
    (when-let [data (lookup-entry config id :encryption-specification)]
      (. builder encryptionSpecification data))
    (when-let [data (lookup-entry config id :keyspace-name)]
      (. builder keyspaceName data))
    (when-let [data (lookup-entry config id :partition-key-columns)]
      (. builder partitionKeyColumns data))
    (when-let [data (lookup-entry config id :point-in-time-recovery-enabled)]
      (. builder pointInTimeRecoveryEnabled data))
    (when-let [data (lookup-entry config id :regular-columns)]
      (. builder regularColumns data))
    (when-let [data (lookup-entry config id :replica-specifications)]
      (. builder replicaSpecifications data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-table-clustering-key-column-property-builder
  "The cfn-table-clustering-key-column-property-builder function buildes out new instances of 
CfnTable$ClusteringKeyColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | software.amazon.awscdk.services.cassandra.CfnTable$ColumnProperty | [[cdk.support/lookup-entry]] | `:column` |
| `orderBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:order-by` |"
  [stack id config]
  (let [builder (CfnTable$ClusteringKeyColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :column)]
      (. builder column data))
    (when-let [data (lookup-entry config id :order-by)]
      (. builder orderBy data))
    (.build builder)))


(defn cfn-table-column-property-builder
  "The cfn-table-column-property-builder function buildes out new instances of 
CfnTable$ColumnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `columnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-type` |"
  [stack id config]
  (let [builder (CfnTable$ColumnProperty$Builder.)]
    (when-let [data (lookup-entry config id :column-name)]
      (. builder columnName data))
    (when-let [data (lookup-entry config id :column-type)]
      (. builder columnType data))
    (.build builder)))


(defn cfn-table-encryption-specification-property-builder
  "The cfn-table-encryption-specification-property-builder function buildes out new instances of 
CfnTable$EncryptionSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |"
  [stack id config]
  (let [builder (CfnTable$EncryptionSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (.build builder)))


(defn cfn-table-props-builder
  "The cfn-table-props-builder function buildes out new instances of 
CfnTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-specifications` |
| `billingMode` | software.amazon.awscdk.services.cassandra.CfnTable$BillingModeProperty | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `clientSideTimestampsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-side-timestamps-enabled` |
| `clusteringKeyColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:clustering-key-columns` |
| `defaultTimeToLive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-time-to-live` |
| `encryptionSpecification` | software.amazon.awscdk.services.cassandra.CfnTable$EncryptionSpecificationProperty | [[cdk.support/lookup-entry]] | `:encryption-specification` |
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `partitionKeyColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partition-key-columns` |
| `pointInTimeRecoveryEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-enabled` |
| `regularColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regular-columns` |
| `replicaSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-specifications` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTableProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-specifications)]
      (. builder autoScalingSpecifications data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :client-side-timestamps-enabled)]
      (. builder clientSideTimestampsEnabled data))
    (when-let [data (lookup-entry config id :clustering-key-columns)]
      (. builder clusteringKeyColumns data))
    (when-let [data (lookup-entry config id :default-time-to-live)]
      (. builder defaultTimeToLive data))
    (when-let [data (lookup-entry config id :encryption-specification)]
      (. builder encryptionSpecification data))
    (when-let [data (lookup-entry config id :keyspace-name)]
      (. builder keyspaceName data))
    (when-let [data (lookup-entry config id :partition-key-columns)]
      (. builder partitionKeyColumns data))
    (when-let [data (lookup-entry config id :point-in-time-recovery-enabled)]
      (. builder pointInTimeRecoveryEnabled data))
    (when-let [data (lookup-entry config id :regular-columns)]
      (. builder regularColumns data))
    (when-let [data (lookup-entry config id :replica-specifications)]
      (. builder replicaSpecifications data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-table-provisioned-throughput-property-builder
  "The cfn-table-provisioned-throughput-property-builder function buildes out new instances of 
CfnTable$ProvisionedThroughputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `writeCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity-units` |"
  [stack id config]
  (let [builder (CfnTable$ProvisionedThroughputProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-units)]
      (. builder readCapacityUnits data))
    (when-let [data (lookup-entry config id :write-capacity-units)]
      (. builder writeCapacityUnits data))
    (.build builder)))


(defn cfn-table-replica-specification-property-builder
  "The cfn-table-replica-specification-property-builder function buildes out new instances of 
CfnTable$ReplicaSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-capacity-auto-scaling` |
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnTable$ReplicaSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-auto-scaling)]
      (. builder readCapacityAutoScaling data))
    (when-let [data (lookup-entry config id :read-capacity-units)]
      (. builder readCapacityUnits data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-table-scaling-policy-property-builder
  "The cfn-table-scaling-policy-property-builder function buildes out new instances of 
CfnTable$ScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetTrackingScalingPolicyConfiguration` | software.amazon.awscdk.services.cassandra.CfnTable$TargetTrackingScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-scaling-policy-configuration` |"
  [stack id config]
  (let [builder (CfnTable$ScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-tracking-scaling-policy-configuration)]
      (. builder targetTrackingScalingPolicyConfiguration data))
    (.build builder)))


(defn cfn-table-target-tracking-scaling-policy-configuration-property-builder
  "The cfn-table-target-tracking-scaling-policy-configuration-property-builder function buildes out new instances of 
CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))