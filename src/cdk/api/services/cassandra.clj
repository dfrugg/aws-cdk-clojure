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


(defn cfn-keyspace-builder>
  "The cfn-keyspace-builder> function updates a CfnKeyspace$Builder instance using the provided configuration.
  The function takes the CfnKeyspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `replicationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKeyspace$Builder builder id config]
  (when-some [data (lookup-entry config id :keyspace-name)]
    (. builder keyspaceName data))
  (when-some [data (lookup-entry config id :replication-specification)]
    (. builder replicationSpecification data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-keyspace-builder
  "Creates a  `CfnKeyspace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-keyspace-builder> (CfnKeyspace$Builder/create scope (name id)) id config))


(defn cfn-keyspace-props-builder>
  "The cfn-keyspace-props-builder> function updates a CfnKeyspaceProps$Builder instance using the provided configuration.
  The function takes the CfnKeyspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyspaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyspace-name` |
| `replicationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKeyspaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :keyspace-name)]
    (. builder keyspaceName data))
  (when-some [data (lookup-entry config id :replication-specification)]
    (. builder replicationSpecification data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-keyspace-props-builder
  "Creates a  `CfnKeyspaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-keyspace-props-builder> (new CfnKeyspaceProps$Builder) id config))


(defn cfn-keyspace-replication-specification-property-builder>
  "The cfn-keyspace-replication-specification-property-builder> function updates a CfnKeyspace$ReplicationSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnKeyspace$ReplicationSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regionList` | java.util.List | [[cdk.support/lookup-entry]] | `:region-list` |
| `replicationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-strategy` |
"
  [^CfnKeyspace$ReplicationSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :region-list)]
    (. builder regionList data))
  (when-some [data (lookup-entry config id :replication-strategy)]
    (. builder replicationStrategy data))
  (.build builder))


(defn cfn-keyspace-replication-specification-property-builder
  "Creates a  `CfnKeyspace$ReplicationSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-keyspace-replication-specification-property-builder> (new CfnKeyspace$ReplicationSpecificationProperty$Builder) id config))


(defn cfn-table-auto-scaling-setting-property-builder>
  "The cfn-table-auto-scaling-setting-property-builder> function updates a CfnTable$AutoScalingSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$AutoScalingSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-scaling-disabled` |
| `maximumUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-units` |
| `minimumUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-units` |
| `scalingPolicy` | software.amazon.awscdk.services.cassandra.CfnTable$ScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:scaling-policy` |
"
  [^CfnTable$AutoScalingSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-disabled)]
    (. builder autoScalingDisabled data))
  (when-some [data (lookup-entry config id :maximum-units)]
    (. builder maximumUnits data))
  (when-some [data (lookup-entry config id :minimum-units)]
    (. builder minimumUnits data))
  (when-some [data (lookup-entry config id :scaling-policy)]
    (. builder scalingPolicy data))
  (.build builder))


(defn cfn-table-auto-scaling-setting-property-builder
  "Creates a  `CfnTable$AutoScalingSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-auto-scaling-setting-property-builder> (new CfnTable$AutoScalingSettingProperty$Builder) id config))


(defn cfn-table-auto-scaling-specification-property-builder>
  "The cfn-table-auto-scaling-specification-property-builder> function updates a CfnTable$AutoScalingSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$AutoScalingSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-capacity-auto-scaling` |
| `writeCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-capacity-auto-scaling` |
"
  [^CfnTable$AutoScalingSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :read-capacity-auto-scaling)]
    (. builder readCapacityAutoScaling data))
  (when-some [data (lookup-entry config id :write-capacity-auto-scaling)]
    (. builder writeCapacityAutoScaling data))
  (.build builder))


(defn cfn-table-auto-scaling-specification-property-builder
  "Creates a  `CfnTable$AutoScalingSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-auto-scaling-specification-property-builder> (new CfnTable$AutoScalingSpecificationProperty$Builder) id config))


(defn cfn-table-billing-mode-property-builder>
  "The cfn-table-billing-mode-property-builder> function updates a CfnTable$BillingModeProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$BillingModeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `provisionedThroughput` | software.amazon.awscdk.services.cassandra.CfnTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
"
  [^CfnTable$BillingModeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :provisioned-throughput)]
    (. builder provisionedThroughput data))
  (.build builder))


(defn cfn-table-billing-mode-property-builder
  "Creates a  `CfnTable$BillingModeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-billing-mode-property-builder> (new CfnTable$BillingModeProperty$Builder) id config))


(defn cfn-table-builder>
  "The cfn-table-builder> function updates a CfnTable$Builder instance using the provided configuration.
  The function takes the CfnTable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTable$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-specifications)]
    (. builder autoScalingSpecifications data))
  (when-some [data (lookup-entry config id :billing-mode)]
    (. builder billingMode data))
  (when-some [data (lookup-entry config id :client-side-timestamps-enabled)]
    (. builder clientSideTimestampsEnabled data))
  (when-some [data (lookup-entry config id :clustering-key-columns)]
    (. builder clusteringKeyColumns data))
  (when-some [data (lookup-entry config id :default-time-to-live)]
    (. builder defaultTimeToLive data))
  (when-some [data (lookup-entry config id :encryption-specification)]
    (. builder encryptionSpecification data))
  (when-some [data (lookup-entry config id :keyspace-name)]
    (. builder keyspaceName data))
  (when-some [data (lookup-entry config id :partition-key-columns)]
    (. builder partitionKeyColumns data))
  (when-some [data (lookup-entry config id :point-in-time-recovery-enabled)]
    (. builder pointInTimeRecoveryEnabled data))
  (when-some [data (lookup-entry config id :regular-columns)]
    (. builder regularColumns data))
  (when-some [data (lookup-entry config id :replica-specifications)]
    (. builder replicaSpecifications data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-table-builder
  "Creates a  `CfnTable$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-table-builder> (CfnTable$Builder/create scope (name id)) id config))


(defn cfn-table-clustering-key-column-property-builder>
  "The cfn-table-clustering-key-column-property-builder> function updates a CfnTable$ClusteringKeyColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ClusteringKeyColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `column` | software.amazon.awscdk.services.cassandra.CfnTable$ColumnProperty | [[cdk.support/lookup-entry]] | `:column` |
| `orderBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:order-by` |
"
  [^CfnTable$ClusteringKeyColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column)]
    (. builder column data))
  (when-some [data (lookup-entry config id :order-by)]
    (. builder orderBy data))
  (.build builder))


(defn cfn-table-clustering-key-column-property-builder
  "Creates a  `CfnTable$ClusteringKeyColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-clustering-key-column-property-builder> (new CfnTable$ClusteringKeyColumnProperty$Builder) id config))


(defn cfn-table-column-property-builder>
  "The cfn-table-column-property-builder> function updates a CfnTable$ColumnProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ColumnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnName` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-name` |
| `columnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:column-type` |
"
  [^CfnTable$ColumnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :column-name)]
    (. builder columnName data))
  (when-some [data (lookup-entry config id :column-type)]
    (. builder columnType data))
  (.build builder))


(defn cfn-table-column-property-builder
  "Creates a  `CfnTable$ColumnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-column-property-builder> (new CfnTable$ColumnProperty$Builder) id config))


(defn cfn-table-encryption-specification-property-builder>
  "The cfn-table-encryption-specification-property-builder> function updates a CfnTable$EncryptionSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$EncryptionSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
"
  [^CfnTable$EncryptionSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-some [data (lookup-entry config id :kms-key-identifier)]
    (. builder kmsKeyIdentifier data))
  (.build builder))


(defn cfn-table-encryption-specification-property-builder
  "Creates a  `CfnTable$EncryptionSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-encryption-specification-property-builder> (new CfnTable$EncryptionSpecificationProperty$Builder) id config))


(defn cfn-table-props-builder>
  "The cfn-table-props-builder> function updates a CfnTableProps$Builder instance using the provided configuration.
  The function takes the CfnTableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTableProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-specifications)]
    (. builder autoScalingSpecifications data))
  (when-some [data (lookup-entry config id :billing-mode)]
    (. builder billingMode data))
  (when-some [data (lookup-entry config id :client-side-timestamps-enabled)]
    (. builder clientSideTimestampsEnabled data))
  (when-some [data (lookup-entry config id :clustering-key-columns)]
    (. builder clusteringKeyColumns data))
  (when-some [data (lookup-entry config id :default-time-to-live)]
    (. builder defaultTimeToLive data))
  (when-some [data (lookup-entry config id :encryption-specification)]
    (. builder encryptionSpecification data))
  (when-some [data (lookup-entry config id :keyspace-name)]
    (. builder keyspaceName data))
  (when-some [data (lookup-entry config id :partition-key-columns)]
    (. builder partitionKeyColumns data))
  (when-some [data (lookup-entry config id :point-in-time-recovery-enabled)]
    (. builder pointInTimeRecoveryEnabled data))
  (when-some [data (lookup-entry config id :regular-columns)]
    (. builder regularColumns data))
  (when-some [data (lookup-entry config id :replica-specifications)]
    (. builder replicaSpecifications data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-table-props-builder
  "Creates a  `CfnTableProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-props-builder> (new CfnTableProps$Builder) id config))


(defn cfn-table-provisioned-throughput-property-builder>
  "The cfn-table-provisioned-throughput-property-builder> function updates a CfnTable$ProvisionedThroughputProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ProvisionedThroughputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `writeCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity-units` |
"
  [^CfnTable$ProvisionedThroughputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :read-capacity-units)]
    (. builder readCapacityUnits data))
  (when-some [data (lookup-entry config id :write-capacity-units)]
    (. builder writeCapacityUnits data))
  (.build builder))


(defn cfn-table-provisioned-throughput-property-builder
  "Creates a  `CfnTable$ProvisionedThroughputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-provisioned-throughput-property-builder> (new CfnTable$ProvisionedThroughputProperty$Builder) id config))


(defn cfn-table-replica-specification-property-builder>
  "The cfn-table-replica-specification-property-builder> function updates a CfnTable$ReplicaSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ReplicaSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-capacity-auto-scaling` |
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnTable$ReplicaSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :read-capacity-auto-scaling)]
    (. builder readCapacityAutoScaling data))
  (when-some [data (lookup-entry config id :read-capacity-units)]
    (. builder readCapacityUnits data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-table-replica-specification-property-builder
  "Creates a  `CfnTable$ReplicaSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-replica-specification-property-builder> (new CfnTable$ReplicaSpecificationProperty$Builder) id config))


(defn cfn-table-scaling-policy-property-builder>
  "The cfn-table-scaling-policy-property-builder> function updates a CfnTable$ScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$ScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetTrackingScalingPolicyConfiguration` | software.amazon.awscdk.services.cassandra.CfnTable$TargetTrackingScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:target-tracking-scaling-policy-configuration` |
"
  [^CfnTable$ScalingPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-tracking-scaling-policy-configuration)]
    (. builder targetTrackingScalingPolicyConfiguration data))
  (.build builder))


(defn cfn-table-scaling-policy-property-builder
  "Creates a  `CfnTable$ScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-scaling-policy-property-builder> (new CfnTable$ScalingPolicyProperty$Builder) id config))


(defn cfn-table-target-tracking-scaling-policy-configuration-property-builder>
  "The cfn-table-target-tracking-scaling-policy-configuration-property-builder> function updates a CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :disable-scale-in)]
    (. builder disableScaleIn data))
  (when-some [data (lookup-entry config id :scale-in-cooldown)]
    (. builder scaleInCooldown data))
  (when-some [data (lookup-entry config id :scale-out-cooldown)]
    (. builder scaleOutCooldown data))
  (when-some [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn cfn-table-target-tracking-scaling-policy-configuration-property-builder
  "Creates a  `CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-table-target-tracking-scaling-policy-configuration-property-builder> (new CfnTable$TargetTrackingScalingPolicyConfigurationProperty$Builder) id config))