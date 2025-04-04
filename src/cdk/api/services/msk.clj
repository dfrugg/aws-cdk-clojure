(ns cdk.api.services.msk
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.msk package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.msk CfnBatchScramSecret$Builder
                                                CfnBatchScramSecretProps$Builder
                                                CfnCluster$BrokerLogsProperty$Builder
                                                CfnCluster$BrokerNodeGroupInfoProperty$Builder
                                                CfnCluster$Builder
                                                CfnCluster$ClientAuthenticationProperty$Builder
                                                CfnCluster$CloudWatchLogsProperty$Builder
                                                CfnCluster$ConfigurationInfoProperty$Builder
                                                CfnCluster$ConnectivityInfoProperty$Builder
                                                CfnCluster$EBSStorageInfoProperty$Builder
                                                CfnCluster$EncryptionAtRestProperty$Builder
                                                CfnCluster$EncryptionInTransitProperty$Builder
                                                CfnCluster$EncryptionInfoProperty$Builder
                                                CfnCluster$FirehoseProperty$Builder
                                                CfnCluster$IamProperty$Builder
                                                CfnCluster$JmxExporterProperty$Builder
                                                CfnCluster$LoggingInfoProperty$Builder
                                                CfnCluster$NodeExporterProperty$Builder
                                                CfnCluster$OpenMonitoringProperty$Builder
                                                CfnCluster$PrometheusProperty$Builder
                                                CfnCluster$ProvisionedThroughputProperty$Builder
                                                CfnCluster$PublicAccessProperty$Builder
                                                CfnCluster$S3Property$Builder
                                                CfnCluster$SaslProperty$Builder
                                                CfnCluster$ScramProperty$Builder
                                                CfnCluster$StorageInfoProperty$Builder
                                                CfnCluster$TlsProperty$Builder
                                                CfnCluster$UnauthenticatedProperty$Builder
                                                CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder
                                                CfnCluster$VpcConnectivityIamProperty$Builder
                                                CfnCluster$VpcConnectivityProperty$Builder
                                                CfnCluster$VpcConnectivitySaslProperty$Builder
                                                CfnCluster$VpcConnectivityScramProperty$Builder
                                                CfnCluster$VpcConnectivityTlsProperty$Builder
                                                CfnClusterPolicy$Builder
                                                CfnClusterPolicyProps$Builder
                                                CfnClusterProps$Builder
                                                CfnConfiguration$Builder
                                                CfnConfiguration$LatestRevisionProperty$Builder
                                                CfnConfigurationProps$Builder
                                                CfnReplicator$AmazonMskClusterProperty$Builder
                                                CfnReplicator$Builder
                                                CfnReplicator$ConsumerGroupReplicationProperty$Builder
                                                CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder
                                                CfnReplicator$KafkaClusterProperty$Builder
                                                CfnReplicator$ReplicationInfoProperty$Builder
                                                CfnReplicator$ReplicationStartingPositionProperty$Builder
                                                CfnReplicator$TopicReplicationProperty$Builder
                                                CfnReplicatorProps$Builder
                                                CfnServerlessCluster$Builder
                                                CfnServerlessCluster$ClientAuthenticationProperty$Builder
                                                CfnServerlessCluster$IamProperty$Builder
                                                CfnServerlessCluster$SaslProperty$Builder
                                                CfnServerlessCluster$VpcConfigProperty$Builder
                                                CfnServerlessClusterProps$Builder
                                                CfnVpcConnection$Builder
                                                CfnVpcConnectionProps$Builder]))


(defn cfn-batch-scram-secret-builder>
  "The cfn-batch-scram-secret-builder> function updates a CfnBatchScramSecret$Builder instance using the provided configuration.
  The function takes the CfnBatchScramSecret$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `secretArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-arn-list` |
"
  [^CfnBatchScramSecret$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :secret-arn-list)]
    (. builder secretArnList data))
  (.build builder))


(defn cfn-batch-scram-secret-builder
  "Creates a  `CfnBatchScramSecret$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-batch-scram-secret-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-batch-scram-secret-builder> (CfnBatchScramSecret$Builder/create scope (name id)) id config))


(defn cfn-batch-scram-secret-props-builder>
  "The cfn-batch-scram-secret-props-builder> function updates a CfnBatchScramSecretProps$Builder instance using the provided configuration.
  The function takes the CfnBatchScramSecretProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `secretArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-arn-list` |
"
  [^CfnBatchScramSecretProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :secret-arn-list)]
    (. builder secretArnList data))
  (.build builder))


(defn cfn-batch-scram-secret-props-builder
  "Creates a  `CfnBatchScramSecretProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-batch-scram-secret-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-batch-scram-secret-props-builder> (new CfnBatchScramSecretProps$Builder) id config))


(defn cfn-cluster-broker-logs-property-builder>
  "The cfn-cluster-broker-logs-property-builder> function updates a CfnCluster$BrokerLogsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$BrokerLogsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.msk.CfnCluster$FirehoseProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnCluster$BrokerLogsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logs)]
    (. builder cloudWatchLogs data))
  (when-some [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-cluster-broker-logs-property-builder
  "Creates a  `CfnCluster$BrokerLogsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-broker-logs-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-broker-logs-property-builder> (new CfnCluster$BrokerLogsProperty$Builder) id config))


(defn cfn-cluster-broker-node-group-info-property-builder>
  "The cfn-cluster-broker-node-group-info-property-builder> function updates a CfnCluster$BrokerNodeGroupInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$BrokerNodeGroupInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerAzDistribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker-az-distribution` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `connectivityInfo` | software.amazon.awscdk.services.msk.CfnCluster$ConnectivityInfoProperty | [[cdk.support/lookup-entry]] | `:connectivity-info` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-info` |
"
  [^CfnCluster$BrokerNodeGroupInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :broker-az-distribution)]
    (. builder brokerAzDistribution data))
  (when-some [data (lookup-entry config id :client-subnets)]
    (. builder clientSubnets data))
  (when-some [data (lookup-entry config id :connectivity-info)]
    (. builder connectivityInfo data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-info)]
    (. builder storageInfo data))
  (.build builder))


(defn cfn-cluster-broker-node-group-info-property-builder
  "Creates a  `CfnCluster$BrokerNodeGroupInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-broker-node-group-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-broker-node-group-info-property-builder> (new CfnCluster$BrokerNodeGroupInfoProperty$Builder) id config))


(defn cfn-cluster-builder>
  "The cfn-cluster-builder> function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerNodeGroupInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:broker-node-group-info` |
| `clientAuthentication` | software.amazon.awscdk.services.msk.CfnCluster$ClientAuthenticationProperty | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationInfo` | software.amazon.awscdk.services.msk.CfnCluster$ConfigurationInfoProperty | [[cdk.support/lookup-entry]] | `:configuration-info` |
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `encryptionInfo` | software.amazon.awscdk.services.msk.CfnCluster$EncryptionInfoProperty | [[cdk.support/lookup-entry]] | `:encryption-info` |
| `enhancedMonitoring` | java.lang.String | [[cdk.support/lookup-entry]] | `:enhanced-monitoring` |
| `kafkaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-version` |
| `loggingInfo` | software.amazon.awscdk.services.msk.CfnCluster$LoggingInfoProperty | [[cdk.support/lookup-entry]] | `:logging-info` |
| `numberOfBrokerNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-broker-nodes` |
| `openMonitoring` | software.amazon.awscdk.services.msk.CfnCluster$OpenMonitoringProperty | [[cdk.support/lookup-entry]] | `:open-monitoring` |
| `storageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-mode` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :broker-node-group-info)]
    (. builder brokerNodeGroupInfo data))
  (when-some [data (lookup-entry config id :client-authentication)]
    (. builder clientAuthentication data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :configuration-info)]
    (. builder configurationInfo data))
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :encryption-info)]
    (. builder encryptionInfo data))
  (when-some [data (lookup-entry config id :enhanced-monitoring)]
    (. builder enhancedMonitoring data))
  (when-some [data (lookup-entry config id :kafka-version)]
    (. builder kafkaVersion data))
  (when-some [data (lookup-entry config id :logging-info)]
    (. builder loggingInfo data))
  (when-some [data (lookup-entry config id :number-of-broker-nodes)]
    (. builder numberOfBrokerNodes data))
  (when-some [data (lookup-entry config id :open-monitoring)]
    (. builder openMonitoring data))
  (when-some [data (lookup-entry config id :storage-mode)]
    (. builder storageMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-builder> (CfnCluster$Builder/create scope (name id)) id config))


(defn cfn-cluster-client-authentication-property-builder>
  "The cfn-cluster-client-authentication-property-builder> function updates a CfnCluster$ClientAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ClientAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnCluster$SaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |
| `tls` | software.amazon.awscdk.services.msk.CfnCluster$TlsProperty | [[cdk.support/lookup-entry]] | `:tls` |
| `unauthenticated` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unauthenticated` |
"
  [^CfnCluster$ClientAuthenticationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sasl)]
    (. builder sasl data))
  (when-some [data (lookup-entry config id :tls)]
    (. builder tls data))
  (when-some [data (lookup-entry config id :unauthenticated)]
    (. builder unauthenticated data))
  (.build builder))


(defn cfn-cluster-client-authentication-property-builder
  "Creates a  `CfnCluster$ClientAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-client-authentication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-client-authentication-property-builder> (new CfnCluster$ClientAuthenticationProperty$Builder) id config))


(defn cfn-cluster-cloud-watch-logs-property-builder>
  "The cfn-cluster-cloud-watch-logs-property-builder> function updates a CfnCluster$CloudWatchLogsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$CloudWatchLogsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^CfnCluster$CloudWatchLogsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn cfn-cluster-cloud-watch-logs-property-builder
  "Creates a  `CfnCluster$CloudWatchLogsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-cloud-watch-logs-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-cloud-watch-logs-property-builder> (new CfnCluster$CloudWatchLogsProperty$Builder) id config))


(defn cfn-cluster-configuration-info-property-builder>
  "The cfn-cluster-configuration-info-property-builder> function updates a CfnCluster$ConfigurationInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ConfigurationInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnCluster$ConfigurationInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn cfn-cluster-configuration-info-property-builder
  "Creates a  `CfnCluster$ConfigurationInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-configuration-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-configuration-info-property-builder> (new CfnCluster$ConfigurationInfoProperty$Builder) id config))


(defn cfn-cluster-connectivity-info-property-builder>
  "The cfn-cluster-connectivity-info-property-builder> function updates a CfnCluster$ConnectivityInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ConnectivityInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access` |
| `vpcConnectivity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-connectivity` |
"
  [^CfnCluster$ConnectivityInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :public-access)]
    (. builder publicAccess data))
  (when-some [data (lookup-entry config id :vpc-connectivity)]
    (. builder vpcConnectivity data))
  (.build builder))


(defn cfn-cluster-connectivity-info-property-builder
  "Creates a  `CfnCluster$ConnectivityInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-connectivity-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-connectivity-info-property-builder> (new CfnCluster$ConnectivityInfoProperty$Builder) id config))


(defn cfn-cluster-ebs-storage-info-property-builder>
  "The cfn-cluster-ebs-storage-info-property-builder> function updates a CfnCluster$EBSStorageInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EBSStorageInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
"
  [^CfnCluster$EBSStorageInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :provisioned-throughput)]
    (. builder provisionedThroughput data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (.build builder))


(defn cfn-cluster-ebs-storage-info-property-builder
  "Creates a  `CfnCluster$EBSStorageInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-ebs-storage-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-ebs-storage-info-property-builder> (new CfnCluster$EBSStorageInfoProperty$Builder) id config))


(defn cfn-cluster-encryption-at-rest-property-builder>
  "The cfn-cluster-encryption-at-rest-property-builder> function updates a CfnCluster$EncryptionAtRestProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EncryptionAtRestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataVolumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-volume-kms-key-id` |
"
  [^CfnCluster$EncryptionAtRestProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-volume-kms-key-id)]
    (. builder dataVolumeKmsKeyId data))
  (.build builder))


(defn cfn-cluster-encryption-at-rest-property-builder
  "Creates a  `CfnCluster$EncryptionAtRestProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-encryption-at-rest-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-encryption-at-rest-property-builder> (new CfnCluster$EncryptionAtRestProperty$Builder) id config))


(defn cfn-cluster-encryption-in-transit-property-builder>
  "The cfn-cluster-encryption-in-transit-property-builder> function updates a CfnCluster$EncryptionInTransitProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EncryptionInTransitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientBroker` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-broker` |
| `inCluster` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:in-cluster` |
"
  [^CfnCluster$EncryptionInTransitProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-broker)]
    (. builder clientBroker data))
  (when-some [data (lookup-entry config id :in-cluster)]
    (. builder inCluster data))
  (.build builder))


(defn cfn-cluster-encryption-in-transit-property-builder
  "Creates a  `CfnCluster$EncryptionInTransitProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-encryption-in-transit-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-encryption-in-transit-property-builder> (new CfnCluster$EncryptionInTransitProperty$Builder) id config))


(defn cfn-cluster-encryption-info-property-builder>
  "The cfn-cluster-encryption-info-property-builder> function updates a CfnCluster$EncryptionInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EncryptionInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionAtRest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |
| `encryptionInTransit` | software.amazon.awscdk.services.msk.CfnCluster$EncryptionInTransitProperty | [[cdk.support/lookup-entry]] | `:encryption-in-transit` |
"
  [^CfnCluster$EncryptionInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-at-rest)]
    (. builder encryptionAtRest data))
  (when-some [data (lookup-entry config id :encryption-in-transit)]
    (. builder encryptionInTransit data))
  (.build builder))


(defn cfn-cluster-encryption-info-property-builder
  "Creates a  `CfnCluster$EncryptionInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-encryption-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-encryption-info-property-builder> (new CfnCluster$EncryptionInfoProperty$Builder) id config))


(defn cfn-cluster-firehose-property-builder>
  "The cfn-cluster-firehose-property-builder> function updates a CfnCluster$FirehoseProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$FirehoseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$FirehoseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delivery-stream)]
    (. builder deliveryStream data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-firehose-property-builder
  "Creates a  `CfnCluster$FirehoseProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-firehose-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-firehose-property-builder> (new CfnCluster$FirehoseProperty$Builder) id config))


(defn cfn-cluster-iam-property-builder>
  "The cfn-cluster-iam-property-builder> function updates a CfnCluster$IamProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$IamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$IamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-iam-property-builder
  "Creates a  `CfnCluster$IamProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-iam-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-iam-property-builder> (new CfnCluster$IamProperty$Builder) id config))


(defn cfn-cluster-jmx-exporter-property-builder>
  "The cfn-cluster-jmx-exporter-property-builder> function updates a CfnCluster$JmxExporterProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$JmxExporterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledInBroker` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled-in-broker` |
"
  [^CfnCluster$JmxExporterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled-in-broker)]
    (. builder enabledInBroker data))
  (.build builder))


(defn cfn-cluster-jmx-exporter-property-builder
  "Creates a  `CfnCluster$JmxExporterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-jmx-exporter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-jmx-exporter-property-builder> (new CfnCluster$JmxExporterProperty$Builder) id config))


(defn cfn-cluster-logging-info-property-builder>
  "The cfn-cluster-logging-info-property-builder> function updates a CfnCluster$LoggingInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$LoggingInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:broker-logs` |
"
  [^CfnCluster$LoggingInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :broker-logs)]
    (. builder brokerLogs data))
  (.build builder))


(defn cfn-cluster-logging-info-property-builder
  "Creates a  `CfnCluster$LoggingInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-logging-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-logging-info-property-builder> (new CfnCluster$LoggingInfoProperty$Builder) id config))


(defn cfn-cluster-node-exporter-property-builder>
  "The cfn-cluster-node-exporter-property-builder> function updates a CfnCluster$NodeExporterProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$NodeExporterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledInBroker` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled-in-broker` |
"
  [^CfnCluster$NodeExporterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled-in-broker)]
    (. builder enabledInBroker data))
  (.build builder))


(defn cfn-cluster-node-exporter-property-builder
  "Creates a  `CfnCluster$NodeExporterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-node-exporter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-node-exporter-property-builder> (new CfnCluster$NodeExporterProperty$Builder) id config))


(defn cfn-cluster-open-monitoring-property-builder>
  "The cfn-cluster-open-monitoring-property-builder> function updates a CfnCluster$OpenMonitoringProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$OpenMonitoringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prometheus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prometheus` |
"
  [^CfnCluster$OpenMonitoringProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :prometheus)]
    (. builder prometheus data))
  (.build builder))


(defn cfn-cluster-open-monitoring-property-builder
  "Creates a  `CfnCluster$OpenMonitoringProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-open-monitoring-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-open-monitoring-property-builder> (new CfnCluster$OpenMonitoringProperty$Builder) id config))


(defn cfn-cluster-policy-builder>
  "The cfn-cluster-policy-builder> function updates a CfnClusterPolicy$Builder instance using the provided configuration.
  The function takes the CfnClusterPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnClusterPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-cluster-policy-builder
  "Creates a  `CfnClusterPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-policy-builder> (CfnClusterPolicy$Builder/create scope (name id)) id config))


(defn cfn-cluster-policy-props-builder>
  "The cfn-cluster-policy-props-builder> function updates a CfnClusterPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnClusterPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnClusterPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-arn)]
    (. builder clusterArn data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn cfn-cluster-policy-props-builder
  "Creates a  `CfnClusterPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-policy-props-builder> (new CfnClusterPolicyProps$Builder) id config))


(defn cfn-cluster-prometheus-property-builder>
  "The cfn-cluster-prometheus-property-builder> function updates a CfnCluster$PrometheusProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$PrometheusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jmxExporter` | software.amazon.awscdk.services.msk.CfnCluster$JmxExporterProperty | [[cdk.support/lookup-entry]] | `:jmx-exporter` |
| `nodeExporter` | software.amazon.awscdk.services.msk.CfnCluster$NodeExporterProperty | [[cdk.support/lookup-entry]] | `:node-exporter` |
"
  [^CfnCluster$PrometheusProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :jmx-exporter)]
    (. builder jmxExporter data))
  (when-some [data (lookup-entry config id :node-exporter)]
    (. builder nodeExporter data))
  (.build builder))


(defn cfn-cluster-prometheus-property-builder
  "Creates a  `CfnCluster$PrometheusProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-prometheus-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-prometheus-property-builder> (new CfnCluster$PrometheusProperty$Builder) id config))


(defn cfn-cluster-props-builder>
  "The cfn-cluster-props-builder> function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerNodeGroupInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:broker-node-group-info` |
| `clientAuthentication` | software.amazon.awscdk.services.msk.CfnCluster$ClientAuthenticationProperty | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationInfo` | software.amazon.awscdk.services.msk.CfnCluster$ConfigurationInfoProperty | [[cdk.support/lookup-entry]] | `:configuration-info` |
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `encryptionInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-info` |
| `enhancedMonitoring` | java.lang.String | [[cdk.support/lookup-entry]] | `:enhanced-monitoring` |
| `kafkaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-version` |
| `loggingInfo` | software.amazon.awscdk.services.msk.CfnCluster$LoggingInfoProperty | [[cdk.support/lookup-entry]] | `:logging-info` |
| `numberOfBrokerNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-broker-nodes` |
| `openMonitoring` | software.amazon.awscdk.services.msk.CfnCluster$OpenMonitoringProperty | [[cdk.support/lookup-entry]] | `:open-monitoring` |
| `storageMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-mode` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :broker-node-group-info)]
    (. builder brokerNodeGroupInfo data))
  (when-some [data (lookup-entry config id :client-authentication)]
    (. builder clientAuthentication data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :configuration-info)]
    (. builder configurationInfo data))
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :encryption-info)]
    (. builder encryptionInfo data))
  (when-some [data (lookup-entry config id :enhanced-monitoring)]
    (. builder enhancedMonitoring data))
  (when-some [data (lookup-entry config id :kafka-version)]
    (. builder kafkaVersion data))
  (when-some [data (lookup-entry config id :logging-info)]
    (. builder loggingInfo data))
  (when-some [data (lookup-entry config id :number-of-broker-nodes)]
    (. builder numberOfBrokerNodes data))
  (when-some [data (lookup-entry config id :open-monitoring)]
    (. builder openMonitoring data))
  (when-some [data (lookup-entry config id :storage-mode)]
    (. builder storageMode data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-props-builder> (new CfnClusterProps$Builder) id config))


(defn cfn-cluster-provisioned-throughput-property-builder>
  "The cfn-cluster-provisioned-throughput-property-builder> function updates a CfnCluster$ProvisionedThroughputProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ProvisionedThroughputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `volumeThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-throughput` |
"
  [^CfnCluster$ProvisionedThroughputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :volume-throughput)]
    (. builder volumeThroughput data))
  (.build builder))


(defn cfn-cluster-provisioned-throughput-property-builder
  "Creates a  `CfnCluster$ProvisionedThroughputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-provisioned-throughput-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-provisioned-throughput-property-builder> (new CfnCluster$ProvisionedThroughputProperty$Builder) id config))


(defn cfn-cluster-public-access-property-builder>
  "The cfn-cluster-public-access-property-builder> function updates a CfnCluster$PublicAccessProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$PublicAccessProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCluster$PublicAccessProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-cluster-public-access-property-builder
  "Creates a  `CfnCluster$PublicAccessProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-public-access-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-public-access-property-builder> (new CfnCluster$PublicAccessProperty$Builder) id config))


(defn cfn-cluster-s3-property-builder>
  "The cfn-cluster-s3-property-builder> function updates a CfnCluster$S3Property$Builder instance using the provided configuration.
  The function takes the CfnCluster$S3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnCluster$S3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-cluster-s3-property-builder
  "Creates a  `CfnCluster$S3Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-s3-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-s3-property-builder> (new CfnCluster$S3Property$Builder) id config))


(defn cfn-cluster-sasl-property-builder>
  "The cfn-cluster-sasl-property-builder> function updates a CfnCluster$SaslProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$SaslProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam` |
| `scram` | software.amazon.awscdk.services.msk.CfnCluster$ScramProperty | [[cdk.support/lookup-entry]] | `:scram` |
"
  [^CfnCluster$SaslProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iam)]
    (. builder iam data))
  (when-some [data (lookup-entry config id :scram)]
    (. builder scram data))
  (.build builder))


(defn cfn-cluster-sasl-property-builder
  "Creates a  `CfnCluster$SaslProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-sasl-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-sasl-property-builder> (new CfnCluster$SaslProperty$Builder) id config))


(defn cfn-cluster-scram-property-builder>
  "The cfn-cluster-scram-property-builder> function updates a CfnCluster$ScramProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ScramProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$ScramProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-scram-property-builder
  "Creates a  `CfnCluster$ScramProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-scram-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-scram-property-builder> (new CfnCluster$ScramProperty$Builder) id config))


(defn cfn-cluster-storage-info-property-builder>
  "The cfn-cluster-storage-info-property-builder> function updates a CfnCluster$StorageInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$StorageInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsStorageInfo` | software.amazon.awscdk.services.msk.CfnCluster$EBSStorageInfoProperty | [[cdk.support/lookup-entry]] | `:ebs-storage-info` |
"
  [^CfnCluster$StorageInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ebs-storage-info)]
    (. builder ebsStorageInfo data))
  (.build builder))


(defn cfn-cluster-storage-info-property-builder
  "Creates a  `CfnCluster$StorageInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-storage-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-storage-info-property-builder> (new CfnCluster$StorageInfoProperty$Builder) id config))


(defn cfn-cluster-tls-property-builder>
  "The cfn-cluster-tls-property-builder> function updates a CfnCluster$TlsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$TlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arn-list` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$TlsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-authority-arn-list)]
    (. builder certificateAuthorityArnList data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-tls-property-builder
  "Creates a  `CfnCluster$TlsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-tls-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-tls-property-builder> (new CfnCluster$TlsProperty$Builder) id config))


(defn cfn-cluster-unauthenticated-property-builder>
  "The cfn-cluster-unauthenticated-property-builder> function updates a CfnCluster$UnauthenticatedProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$UnauthenticatedProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$UnauthenticatedProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-unauthenticated-property-builder
  "Creates a  `CfnCluster$UnauthenticatedProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-unauthenticated-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-unauthenticated-property-builder> (new CfnCluster$UnauthenticatedProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-client-authentication-property-builder>
  "The cfn-cluster-vpc-connectivity-client-authentication-property-builder> function updates a CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivitySaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sasl)]
    (. builder sasl data))
  (when-some [data (lookup-entry config id :tls)]
    (. builder tls data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-client-authentication-property-builder
  "Creates a  `CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-client-authentication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-client-authentication-property-builder> (new CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-iam-property-builder>
  "The cfn-cluster-vpc-connectivity-iam-property-builder> function updates a CfnCluster$VpcConnectivityIamProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivityIamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$VpcConnectivityIamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-iam-property-builder
  "Creates a  `CfnCluster$VpcConnectivityIamProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-iam-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-iam-property-builder> (new CfnCluster$VpcConnectivityIamProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-property-builder>
  "The cfn-cluster-vpc-connectivity-property-builder> function updates a CfnCluster$VpcConnectivityProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-authentication` |
"
  [^CfnCluster$VpcConnectivityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-authentication)]
    (. builder clientAuthentication data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-property-builder
  "Creates a  `CfnCluster$VpcConnectivityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-property-builder> (new CfnCluster$VpcConnectivityProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-sasl-property-builder>
  "The cfn-cluster-vpc-connectivity-sasl-property-builder> function updates a CfnCluster$VpcConnectivitySaslProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivitySaslProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivityIamProperty | [[cdk.support/lookup-entry]] | `:iam` |
| `scram` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivityScramProperty | [[cdk.support/lookup-entry]] | `:scram` |
"
  [^CfnCluster$VpcConnectivitySaslProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iam)]
    (. builder iam data))
  (when-some [data (lookup-entry config id :scram)]
    (. builder scram data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-sasl-property-builder
  "Creates a  `CfnCluster$VpcConnectivitySaslProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-sasl-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-sasl-property-builder> (new CfnCluster$VpcConnectivitySaslProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-scram-property-builder>
  "The cfn-cluster-vpc-connectivity-scram-property-builder> function updates a CfnCluster$VpcConnectivityScramProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivityScramProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$VpcConnectivityScramProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-scram-property-builder
  "Creates a  `CfnCluster$VpcConnectivityScramProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-scram-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-scram-property-builder> (new CfnCluster$VpcConnectivityScramProperty$Builder) id config))


(defn cfn-cluster-vpc-connectivity-tls-property-builder>
  "The cfn-cluster-vpc-connectivity-tls-property-builder> function updates a CfnCluster$VpcConnectivityTlsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$VpcConnectivityTlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnCluster$VpcConnectivityTlsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-cluster-vpc-connectivity-tls-property-builder
  "Creates a  `CfnCluster$VpcConnectivityTlsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-vpc-connectivity-tls-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-vpc-connectivity-tls-property-builder> (new CfnCluster$VpcConnectivityTlsProperty$Builder) id config))


(defn cfn-configuration-builder>
  "The cfn-configuration-builder> function updates a CfnConfiguration$Builder instance using the provided configuration.
  The function takes the CfnConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaVersionsList` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-versions-list` |
| `latestRevision` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:latest-revision` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-properties` |
"
  [^CfnConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kafka-versions-list)]
    (. builder kafkaVersionsList data))
  (when-some [data (lookup-entry config id :latest-revision)]
    (. builder latestRevision data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-properties)]
    (. builder serverProperties data))
  (.build builder))


(defn cfn-configuration-builder
  "Creates a  `CfnConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-configuration-builder> (CfnConfiguration$Builder/create scope (name id)) id config))


(defn cfn-configuration-latest-revision-property-builder>
  "The cfn-configuration-latest-revision-property-builder> function updates a CfnConfiguration$LatestRevisionProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguration$LatestRevisionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnConfiguration$LatestRevisionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :creation-time)]
    (. builder creationTime data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn cfn-configuration-latest-revision-property-builder
  "Creates a  `CfnConfiguration$LatestRevisionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-configuration-latest-revision-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-configuration-latest-revision-property-builder> (new CfnConfiguration$LatestRevisionProperty$Builder) id config))


(defn cfn-configuration-props-builder>
  "The cfn-configuration-props-builder> function updates a CfnConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaVersionsList` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-versions-list` |
| `latestRevision` | software.amazon.awscdk.services.msk.CfnConfiguration$LatestRevisionProperty | [[cdk.support/lookup-entry]] | `:latest-revision` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-properties` |
"
  [^CfnConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kafka-versions-list)]
    (. builder kafkaVersionsList data))
  (when-some [data (lookup-entry config id :latest-revision)]
    (. builder latestRevision data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-properties)]
    (. builder serverProperties data))
  (.build builder))


(defn cfn-configuration-props-builder
  "Creates a  `CfnConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-configuration-props-builder> (new CfnConfigurationProps$Builder) id config))


(defn cfn-replicator-amazon-msk-cluster-property-builder>
  "The cfn-replicator-amazon-msk-cluster-property-builder> function updates a CfnReplicator$AmazonMskClusterProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$AmazonMskClusterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mskClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:msk-cluster-arn` |
"
  [^CfnReplicator$AmazonMskClusterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :msk-cluster-arn)]
    (. builder mskClusterArn data))
  (.build builder))


(defn cfn-replicator-amazon-msk-cluster-property-builder
  "Creates a  `CfnReplicator$AmazonMskClusterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-amazon-msk-cluster-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-amazon-msk-cluster-property-builder> (new CfnReplicator$AmazonMskClusterProperty$Builder) id config))


(defn cfn-replicator-builder>
  "The cfn-replicator-builder> function updates a CfnReplicator$Builder instance using the provided configuration.
  The function takes the CfnReplicator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaClusters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-clusters` |
| `replicationInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-info-list` |
| `replicatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicator-name` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicator$Builder builder id config]
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kafka-clusters)]
    (. builder kafkaClusters data))
  (when-some [data (lookup-entry config id :replication-info-list)]
    (. builder replicationInfoList data))
  (when-some [data (lookup-entry config id :replicator-name)]
    (. builder replicatorName data))
  (when-some [data (lookup-entry config id :service-execution-role-arn)]
    (. builder serviceExecutionRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-replicator-builder
  "Creates a  `CfnReplicator$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-replicator-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-replicator-builder> (CfnReplicator$Builder/create scope (name id)) id config))


(defn cfn-replicator-consumer-group-replication-property-builder>
  "The cfn-replicator-consumer-group-replication-property-builder> function updates a CfnReplicator$ConsumerGroupReplicationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$ConsumerGroupReplicationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupsToExclude` | java.util.List | [[cdk.support/lookup-entry]] | `:consumer-groups-to-exclude` |
| `consumerGroupsToReplicate` | java.util.List | [[cdk.support/lookup-entry]] | `:consumer-groups-to-replicate` |
| `detectAndCopyNewConsumerGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detect-and-copy-new-consumer-groups` |
| `synchroniseConsumerGroupOffsets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:synchronise-consumer-group-offsets` |
"
  [^CfnReplicator$ConsumerGroupReplicationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-groups-to-exclude)]
    (. builder consumerGroupsToExclude data))
  (when-some [data (lookup-entry config id :consumer-groups-to-replicate)]
    (. builder consumerGroupsToReplicate data))
  (when-some [data (lookup-entry config id :detect-and-copy-new-consumer-groups)]
    (. builder detectAndCopyNewConsumerGroups data))
  (when-some [data (lookup-entry config id :synchronise-consumer-group-offsets)]
    (. builder synchroniseConsumerGroupOffsets data))
  (.build builder))


(defn cfn-replicator-consumer-group-replication-property-builder
  "Creates a  `CfnReplicator$ConsumerGroupReplicationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-consumer-group-replication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-consumer-group-replication-property-builder> (new CfnReplicator$ConsumerGroupReplicationProperty$Builder) id config))


(defn cfn-replicator-kafka-cluster-client-vpc-config-property-builder>
  "The cfn-replicator-kafka-cluster-client-vpc-config-property-builder> function updates a CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-replicator-kafka-cluster-client-vpc-config-property-builder
  "Creates a  `CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-kafka-cluster-client-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-kafka-cluster-client-vpc-config-property-builder> (new CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder) id config))


(defn cfn-replicator-kafka-cluster-property-builder>
  "The cfn-replicator-kafka-cluster-property-builder> function updates a CfnReplicator$KafkaClusterProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$KafkaClusterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonMskCluster` | software.amazon.awscdk.services.msk.CfnReplicator$AmazonMskClusterProperty | [[cdk.support/lookup-entry]] | `:amazon-msk-cluster` |
| `vpcConfig` | software.amazon.awscdk.services.msk.CfnReplicator$KafkaClusterClientVpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnReplicator$KafkaClusterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amazon-msk-cluster)]
    (. builder amazonMskCluster data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-replicator-kafka-cluster-property-builder
  "Creates a  `CfnReplicator$KafkaClusterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-kafka-cluster-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-kafka-cluster-property-builder> (new CfnReplicator$KafkaClusterProperty$Builder) id config))


(defn cfn-replicator-props-builder>
  "The cfn-replicator-props-builder> function updates a CfnReplicatorProps$Builder instance using the provided configuration.
  The function takes the CfnReplicatorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaClusters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-clusters` |
| `replicationInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-info-list` |
| `replicatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicator-name` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicatorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kafka-clusters)]
    (. builder kafkaClusters data))
  (when-some [data (lookup-entry config id :replication-info-list)]
    (. builder replicationInfoList data))
  (when-some [data (lookup-entry config id :replicator-name)]
    (. builder replicatorName data))
  (when-some [data (lookup-entry config id :service-execution-role-arn)]
    (. builder serviceExecutionRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-replicator-props-builder
  "Creates a  `CfnReplicatorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-props-builder> (new CfnReplicatorProps$Builder) id config))


(defn cfn-replicator-replication-info-property-builder>
  "The cfn-replicator-replication-info-property-builder> function updates a CfnReplicator$ReplicationInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$ReplicationInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupReplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:consumer-group-replication` |
| `sourceKafkaClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-kafka-cluster-arn` |
| `targetCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-compression-type` |
| `targetKafkaClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-kafka-cluster-arn` |
| `topicReplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topic-replication` |
"
  [^CfnReplicator$ReplicationInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-group-replication)]
    (. builder consumerGroupReplication data))
  (when-some [data (lookup-entry config id :source-kafka-cluster-arn)]
    (. builder sourceKafkaClusterArn data))
  (when-some [data (lookup-entry config id :target-compression-type)]
    (. builder targetCompressionType data))
  (when-some [data (lookup-entry config id :target-kafka-cluster-arn)]
    (. builder targetKafkaClusterArn data))
  (when-some [data (lookup-entry config id :topic-replication)]
    (. builder topicReplication data))
  (.build builder))


(defn cfn-replicator-replication-info-property-builder
  "Creates a  `CfnReplicator$ReplicationInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-replication-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-replication-info-property-builder> (new CfnReplicator$ReplicationInfoProperty$Builder) id config))


(defn cfn-replicator-replication-starting-position-property-builder>
  "The cfn-replicator-replication-starting-position-property-builder> function updates a CfnReplicator$ReplicationStartingPositionProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$ReplicationStartingPositionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnReplicator$ReplicationStartingPositionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-replicator-replication-starting-position-property-builder
  "Creates a  `CfnReplicator$ReplicationStartingPositionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-replication-starting-position-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-replication-starting-position-property-builder> (new CfnReplicator$ReplicationStartingPositionProperty$Builder) id config))


(defn cfn-replicator-topic-replication-property-builder>
  "The cfn-replicator-topic-replication-property-builder> function updates a CfnReplicator$TopicReplicationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicator$TopicReplicationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyAccessControlListsForTopics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-access-control-lists-for-topics` |
| `copyTopicConfigurations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-topic-configurations` |
| `detectAndCopyNewTopics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-and-copy-new-topics` |
| `startingPosition` | software.amazon.awscdk.services.msk.CfnReplicator$ReplicationStartingPositionProperty | [[cdk.support/lookup-entry]] | `:starting-position` |
| `topicsToExclude` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-to-exclude` |
| `topicsToReplicate` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-to-replicate` |
"
  [^CfnReplicator$TopicReplicationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :copy-access-control-lists-for-topics)]
    (. builder copyAccessControlListsForTopics data))
  (when-some [data (lookup-entry config id :copy-topic-configurations)]
    (. builder copyTopicConfigurations data))
  (when-some [data (lookup-entry config id :detect-and-copy-new-topics)]
    (. builder detectAndCopyNewTopics data))
  (when-some [data (lookup-entry config id :starting-position)]
    (. builder startingPosition data))
  (when-some [data (lookup-entry config id :topics-to-exclude)]
    (. builder topicsToExclude data))
  (when-some [data (lookup-entry config id :topics-to-replicate)]
    (. builder topicsToReplicate data))
  (.build builder))


(defn cfn-replicator-topic-replication-property-builder
  "Creates a  `CfnReplicator$TopicReplicationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-replicator-topic-replication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-replicator-topic-replication-property-builder> (new CfnReplicator$TopicReplicationProperty$Builder) id config))


(defn cfn-serverless-cluster-builder>
  "The cfn-serverless-cluster-builder> function updates a CfnServerlessCluster$Builder instance using the provided configuration.
  The function takes the CfnServerlessCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.services.msk.CfnServerlessCluster$ClientAuthenticationProperty | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-configs` |
"
  [^CfnServerlessCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :client-authentication)]
    (. builder clientAuthentication data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-configs)]
    (. builder vpcConfigs data))
  (.build builder))


(defn cfn-serverless-cluster-builder
  "Creates a  `CfnServerlessCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-serverless-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-serverless-cluster-builder> (CfnServerlessCluster$Builder/create scope (name id)) id config))


(defn cfn-serverless-cluster-client-authentication-property-builder>
  "The cfn-serverless-cluster-client-authentication-property-builder> function updates a CfnServerlessCluster$ClientAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCluster$ClientAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnServerlessCluster$SaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |
"
  [^CfnServerlessCluster$ClientAuthenticationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sasl)]
    (. builder sasl data))
  (.build builder))


(defn cfn-serverless-cluster-client-authentication-property-builder
  "Creates a  `CfnServerlessCluster$ClientAuthenticationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-serverless-cluster-client-authentication-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-serverless-cluster-client-authentication-property-builder> (new CfnServerlessCluster$ClientAuthenticationProperty$Builder) id config))


(defn cfn-serverless-cluster-iam-property-builder>
  "The cfn-serverless-cluster-iam-property-builder> function updates a CfnServerlessCluster$IamProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCluster$IamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnServerlessCluster$IamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-serverless-cluster-iam-property-builder
  "Creates a  `CfnServerlessCluster$IamProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-serverless-cluster-iam-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-serverless-cluster-iam-property-builder> (new CfnServerlessCluster$IamProperty$Builder) id config))


(defn cfn-serverless-cluster-props-builder>
  "The cfn-serverless-cluster-props-builder> function updates a CfnServerlessClusterProps$Builder instance using the provided configuration.
  The function takes the CfnServerlessClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configs` |
"
  [^CfnServerlessClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-authentication)]
    (. builder clientAuthentication data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-configs)]
    (. builder vpcConfigs data))
  (.build builder))


(defn cfn-serverless-cluster-props-builder
  "Creates a  `CfnServerlessClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-serverless-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-serverless-cluster-props-builder> (new CfnServerlessClusterProps$Builder) id config))


(defn cfn-serverless-cluster-sasl-property-builder>
  "The cfn-serverless-cluster-sasl-property-builder> function updates a CfnServerlessCluster$SaslProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCluster$SaslProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.services.msk.CfnServerlessCluster$IamProperty | [[cdk.support/lookup-entry]] | `:iam` |
"
  [^CfnServerlessCluster$SaslProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iam)]
    (. builder iam data))
  (.build builder))


(defn cfn-serverless-cluster-sasl-property-builder
  "Creates a  `CfnServerlessCluster$SaslProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-serverless-cluster-sasl-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-serverless-cluster-sasl-property-builder> (new CfnServerlessCluster$SaslProperty$Builder) id config))


(defn cfn-serverless-cluster-vpc-config-property-builder>
  "The cfn-serverless-cluster-vpc-config-property-builder> function updates a CfnServerlessCluster$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnServerlessCluster$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnServerlessCluster$VpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-serverless-cluster-vpc-config-property-builder
  "Creates a  `CfnServerlessCluster$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-serverless-cluster-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-serverless-cluster-vpc-config-property-builder> (new CfnServerlessCluster$VpcConfigProperty$Builder) id config))


(defn cfn-vpc-connection-builder>
  "The cfn-vpc-connection-builder> function updates a CfnVpcConnection$Builder instance using the provided configuration.
  The function takes the CfnVpcConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-cluster-arn` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnVpcConnection$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication)]
    (. builder authentication data))
  (when-some [data (lookup-entry config id :client-subnets)]
    (. builder clientSubnets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-cluster-arn)]
    (. builder targetClusterArn data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-vpc-connection-builder
  "Creates a  `CfnVpcConnection$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-vpc-connection-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-vpc-connection-builder> (CfnVpcConnection$Builder/create scope (name id)) id config))


(defn cfn-vpc-connection-props-builder>
  "The cfn-vpc-connection-props-builder> function updates a CfnVpcConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnVpcConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-cluster-arn` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnVpcConnectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication)]
    (. builder authentication data))
  (when-some [data (lookup-entry config id :client-subnets)]
    (. builder clientSubnets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-cluster-arn)]
    (. builder targetClusterArn data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-vpc-connection-props-builder
  "Creates a  `CfnVpcConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpc-connection-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpc-connection-props-builder> (new CfnVpcConnectionProps$Builder) id config))