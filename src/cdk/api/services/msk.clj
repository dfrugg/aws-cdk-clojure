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


(defn cfn-batch-scram-secret-builder
  "The cfn-batch-scram-secret-builder function buildes out new instances of 
CfnBatchScramSecret$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `secretArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-arn-list` |"
  [stack id config]
  (let [builder (CfnBatchScramSecret$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :secret-arn-list)]
      (. builder secretArnList data))
    (.build builder)))


(defn cfn-batch-scram-secret-props-builder
  "The cfn-batch-scram-secret-props-builder function buildes out new instances of 
CfnBatchScramSecretProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `secretArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-arn-list` |"
  [stack id config]
  (let [builder (CfnBatchScramSecretProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :secret-arn-list)]
      (. builder secretArnList data))
    (.build builder)))


(defn cfn-cluster-broker-logs-property-builder
  "The cfn-cluster-broker-logs-property-builder function buildes out new instances of 
CfnCluster$BrokerLogsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.msk.CfnCluster$FirehoseProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnCluster$BrokerLogsProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs)]
      (. builder cloudWatchLogs data))
    (when-let [data (lookup-entry config id :firehose)]
      (. builder firehose data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-cluster-broker-node-group-info-property-builder
  "The cfn-cluster-broker-node-group-info-property-builder function buildes out new instances of 
CfnCluster$BrokerNodeGroupInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerAzDistribution` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker-az-distribution` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `connectivityInfo` | software.amazon.awscdk.services.msk.CfnCluster$ConnectivityInfoProperty | [[cdk.support/lookup-entry]] | `:connectivity-info` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-info` |"
  [stack id config]
  (let [builder (CfnCluster$BrokerNodeGroupInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :broker-az-distribution)]
      (. builder brokerAzDistribution data))
    (when-let [data (lookup-entry config id :client-subnets)]
      (. builder clientSubnets data))
    (when-let [data (lookup-entry config id :connectivity-info)]
      (. builder connectivityInfo data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-info)]
      (. builder storageInfo data))
    (.build builder)))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :broker-node-group-info)]
      (. builder brokerNodeGroupInfo data))
    (when-let [data (lookup-entry config id :client-authentication)]
      (. builder clientAuthentication data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :configuration-info)]
      (. builder configurationInfo data))
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :encryption-info)]
      (. builder encryptionInfo data))
    (when-let [data (lookup-entry config id :enhanced-monitoring)]
      (. builder enhancedMonitoring data))
    (when-let [data (lookup-entry config id :kafka-version)]
      (. builder kafkaVersion data))
    (when-let [data (lookup-entry config id :logging-info)]
      (. builder loggingInfo data))
    (when-let [data (lookup-entry config id :number-of-broker-nodes)]
      (. builder numberOfBrokerNodes data))
    (when-let [data (lookup-entry config id :open-monitoring)]
      (. builder openMonitoring data))
    (when-let [data (lookup-entry config id :storage-mode)]
      (. builder storageMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-client-authentication-property-builder
  "The cfn-cluster-client-authentication-property-builder function buildes out new instances of 
CfnCluster$ClientAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnCluster$SaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |
| `tls` | software.amazon.awscdk.services.msk.CfnCluster$TlsProperty | [[cdk.support/lookup-entry]] | `:tls` |
| `unauthenticated` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unauthenticated` |"
  [stack id config]
  (let [builder (CfnCluster$ClientAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sasl)]
      (. builder sasl data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (when-let [data (lookup-entry config id :unauthenticated)]
      (. builder unauthenticated data))
    (.build builder)))


(defn cfn-cluster-cloud-watch-logs-property-builder
  "The cfn-cluster-cloud-watch-logs-property-builder function buildes out new instances of 
CfnCluster$CloudWatchLogsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (CfnCluster$CloudWatchLogsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))


(defn cfn-cluster-configuration-info-property-builder
  "The cfn-cluster-configuration-info-property-builder function buildes out new instances of 
CfnCluster$ConfigurationInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnCluster$ConfigurationInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-cluster-connectivity-info-property-builder
  "The cfn-cluster-connectivity-info-property-builder function buildes out new instances of 
CfnCluster$ConnectivityInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access` |
| `vpcConnectivity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-connectivity` |"
  [stack id config]
  (let [builder (CfnCluster$ConnectivityInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :public-access)]
      (. builder publicAccess data))
    (when-let [data (lookup-entry config id :vpc-connectivity)]
      (. builder vpcConnectivity data))
    (.build builder)))


(defn cfn-cluster-ebs-storage-info-property-builder
  "The cfn-cluster-ebs-storage-info-property-builder function buildes out new instances of 
CfnCluster$EBSStorageInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |"
  [stack id config]
  (let [builder (CfnCluster$EBSStorageInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-throughput)]
      (. builder provisionedThroughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (.build builder)))


(defn cfn-cluster-encryption-at-rest-property-builder
  "The cfn-cluster-encryption-at-rest-property-builder function buildes out new instances of 
CfnCluster$EncryptionAtRestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataVolumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-volume-kms-key-id` |"
  [stack id config]
  (let [builder (CfnCluster$EncryptionAtRestProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-volume-kms-key-id)]
      (. builder dataVolumeKmsKeyId data))
    (.build builder)))


(defn cfn-cluster-encryption-in-transit-property-builder
  "The cfn-cluster-encryption-in-transit-property-builder function buildes out new instances of 
CfnCluster$EncryptionInTransitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientBroker` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-broker` |
| `inCluster` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:in-cluster` |"
  [stack id config]
  (let [builder (CfnCluster$EncryptionInTransitProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-broker)]
      (. builder clientBroker data))
    (when-let [data (lookup-entry config id :in-cluster)]
      (. builder inCluster data))
    (.build builder)))


(defn cfn-cluster-encryption-info-property-builder
  "The cfn-cluster-encryption-info-property-builder function buildes out new instances of 
CfnCluster$EncryptionInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionAtRest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |
| `encryptionInTransit` | software.amazon.awscdk.services.msk.CfnCluster$EncryptionInTransitProperty | [[cdk.support/lookup-entry]] | `:encryption-in-transit` |"
  [stack id config]
  (let [builder (CfnCluster$EncryptionInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-at-rest)]
      (. builder encryptionAtRest data))
    (when-let [data (lookup-entry config id :encryption-in-transit)]
      (. builder encryptionInTransit data))
    (.build builder)))


(defn cfn-cluster-firehose-property-builder
  "The cfn-cluster-firehose-property-builder function buildes out new instances of 
CfnCluster$FirehoseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$FirehoseProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream)]
      (. builder deliveryStream data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-iam-property-builder
  "The cfn-cluster-iam-property-builder function buildes out new instances of 
CfnCluster$IamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$IamProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-jmx-exporter-property-builder
  "The cfn-cluster-jmx-exporter-property-builder function buildes out new instances of 
CfnCluster$JmxExporterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledInBroker` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled-in-broker` |"
  [stack id config]
  (let [builder (CfnCluster$JmxExporterProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled-in-broker)]
      (. builder enabledInBroker data))
    (.build builder)))


(defn cfn-cluster-logging-info-property-builder
  "The cfn-cluster-logging-info-property-builder function buildes out new instances of 
CfnCluster$LoggingInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `brokerLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:broker-logs` |"
  [stack id config]
  (let [builder (CfnCluster$LoggingInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :broker-logs)]
      (. builder brokerLogs data))
    (.build builder)))


(defn cfn-cluster-node-exporter-property-builder
  "The cfn-cluster-node-exporter-property-builder function buildes out new instances of 
CfnCluster$NodeExporterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledInBroker` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled-in-broker` |"
  [stack id config]
  (let [builder (CfnCluster$NodeExporterProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled-in-broker)]
      (. builder enabledInBroker data))
    (.build builder)))


(defn cfn-cluster-open-monitoring-property-builder
  "The cfn-cluster-open-monitoring-property-builder function buildes out new instances of 
CfnCluster$OpenMonitoringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prometheus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prometheus` |"
  [stack id config]
  (let [builder (CfnCluster$OpenMonitoringProperty$Builder.)]
    (when-let [data (lookup-entry config id :prometheus)]
      (. builder prometheus data))
    (.build builder)))


(defn cfn-cluster-policy-builder
  "The cfn-cluster-policy-builder function buildes out new instances of 
CfnClusterPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnClusterPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-cluster-policy-props-builder
  "The cfn-cluster-policy-props-builder function buildes out new instances of 
CfnClusterPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |"
  [stack id config]
  (let [builder (CfnClusterPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (.build builder)))


(defn cfn-cluster-prometheus-property-builder
  "The cfn-cluster-prometheus-property-builder function buildes out new instances of 
CfnCluster$PrometheusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jmxExporter` | software.amazon.awscdk.services.msk.CfnCluster$JmxExporterProperty | [[cdk.support/lookup-entry]] | `:jmx-exporter` |
| `nodeExporter` | software.amazon.awscdk.services.msk.CfnCluster$NodeExporterProperty | [[cdk.support/lookup-entry]] | `:node-exporter` |"
  [stack id config]
  (let [builder (CfnCluster$PrometheusProperty$Builder.)]
    (when-let [data (lookup-entry config id :jmx-exporter)]
      (. builder jmxExporter data))
    (when-let [data (lookup-entry config id :node-exporter)]
      (. builder nodeExporter data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :broker-node-group-info)]
      (. builder brokerNodeGroupInfo data))
    (when-let [data (lookup-entry config id :client-authentication)]
      (. builder clientAuthentication data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :configuration-info)]
      (. builder configurationInfo data))
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :encryption-info)]
      (. builder encryptionInfo data))
    (when-let [data (lookup-entry config id :enhanced-monitoring)]
      (. builder enhancedMonitoring data))
    (when-let [data (lookup-entry config id :kafka-version)]
      (. builder kafkaVersion data))
    (when-let [data (lookup-entry config id :logging-info)]
      (. builder loggingInfo data))
    (when-let [data (lookup-entry config id :number-of-broker-nodes)]
      (. builder numberOfBrokerNodes data))
    (when-let [data (lookup-entry config id :open-monitoring)]
      (. builder openMonitoring data))
    (when-let [data (lookup-entry config id :storage-mode)]
      (. builder storageMode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-provisioned-throughput-property-builder
  "The cfn-cluster-provisioned-throughput-property-builder function buildes out new instances of 
CfnCluster$ProvisionedThroughputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `volumeThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-throughput` |"
  [stack id config]
  (let [builder (CfnCluster$ProvisionedThroughputProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :volume-throughput)]
      (. builder volumeThroughput data))
    (.build builder)))


(defn cfn-cluster-public-access-property-builder
  "The cfn-cluster-public-access-property-builder function buildes out new instances of 
CfnCluster$PublicAccessProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCluster$PublicAccessProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-cluster-s3-property-builder
  "The cfn-cluster-s3-property-builder function buildes out new instances of 
CfnCluster$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnCluster$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-cluster-sasl-property-builder
  "The cfn-cluster-sasl-property-builder function buildes out new instances of 
CfnCluster$SaslProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam` |
| `scram` | software.amazon.awscdk.services.msk.CfnCluster$ScramProperty | [[cdk.support/lookup-entry]] | `:scram` |"
  [stack id config]
  (let [builder (CfnCluster$SaslProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (when-let [data (lookup-entry config id :scram)]
      (. builder scram data))
    (.build builder)))


(defn cfn-cluster-scram-property-builder
  "The cfn-cluster-scram-property-builder function buildes out new instances of 
CfnCluster$ScramProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$ScramProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-storage-info-property-builder
  "The cfn-cluster-storage-info-property-builder function buildes out new instances of 
CfnCluster$StorageInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsStorageInfo` | software.amazon.awscdk.services.msk.CfnCluster$EBSStorageInfoProperty | [[cdk.support/lookup-entry]] | `:ebs-storage-info` |"
  [stack id config]
  (let [builder (CfnCluster$StorageInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-storage-info)]
      (. builder ebsStorageInfo data))
    (.build builder)))


(defn cfn-cluster-tls-property-builder
  "The cfn-cluster-tls-property-builder function buildes out new instances of 
CfnCluster$TlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArnList` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-authority-arn-list` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$TlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arn-list)]
      (. builder certificateAuthorityArnList data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-unauthenticated-property-builder
  "The cfn-cluster-unauthenticated-property-builder function buildes out new instances of 
CfnCluster$UnauthenticatedProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$UnauthenticatedProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-client-authentication-property-builder
  "The cfn-cluster-vpc-connectivity-client-authentication-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivitySaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivityClientAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sasl)]
      (. builder sasl data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-iam-property-builder
  "The cfn-cluster-vpc-connectivity-iam-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivityIamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivityIamProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-property-builder
  "The cfn-cluster-vpc-connectivity-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-authentication` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivityProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-authentication)]
      (. builder clientAuthentication data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-sasl-property-builder
  "The cfn-cluster-vpc-connectivity-sasl-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivitySaslProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivityIamProperty | [[cdk.support/lookup-entry]] | `:iam` |
| `scram` | software.amazon.awscdk.services.msk.CfnCluster$VpcConnectivityScramProperty | [[cdk.support/lookup-entry]] | `:scram` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivitySaslProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (when-let [data (lookup-entry config id :scram)]
      (. builder scram data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-scram-property-builder
  "The cfn-cluster-vpc-connectivity-scram-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivityScramProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivityScramProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-cluster-vpc-connectivity-tls-property-builder
  "The cfn-cluster-vpc-connectivity-tls-property-builder function buildes out new instances of 
CfnCluster$VpcConnectivityTlsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnCluster$VpcConnectivityTlsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-configuration-builder
  "The cfn-configuration-builder function buildes out new instances of 
CfnConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaVersionsList` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-versions-list` |
| `latestRevision` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:latest-revision` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-properties` |"
  [stack id config]
  (let [builder (CfnConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kafka-versions-list)]
      (. builder kafkaVersionsList data))
    (when-let [data (lookup-entry config id :latest-revision)]
      (. builder latestRevision data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-properties)]
      (. builder serverProperties data))
    (.build builder)))


(defn cfn-configuration-latest-revision-property-builder
  "The cfn-configuration-latest-revision-property-builder function buildes out new instances of 
CfnConfiguration$LatestRevisionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnConfiguration$LatestRevisionProperty$Builder.)]
    (when-let [data (lookup-entry config id :creation-time)]
      (. builder creationTime data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-configuration-props-builder
  "The cfn-configuration-props-builder function buildes out new instances of 
CfnConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaVersionsList` | java.util.List | [[cdk.support/lookup-entry]] | `:kafka-versions-list` |
| `latestRevision` | software.amazon.awscdk.services.msk.CfnConfiguration$LatestRevisionProperty | [[cdk.support/lookup-entry]] | `:latest-revision` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverProperties` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-properties` |"
  [stack id config]
  (let [builder (CfnConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kafka-versions-list)]
      (. builder kafkaVersionsList data))
    (when-let [data (lookup-entry config id :latest-revision)]
      (. builder latestRevision data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-properties)]
      (. builder serverProperties data))
    (.build builder)))


(defn cfn-replicator-amazon-msk-cluster-property-builder
  "The cfn-replicator-amazon-msk-cluster-property-builder function buildes out new instances of 
CfnReplicator$AmazonMskClusterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mskClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:msk-cluster-arn` |"
  [stack id config]
  (let [builder (CfnReplicator$AmazonMskClusterProperty$Builder.)]
    (when-let [data (lookup-entry config id :msk-cluster-arn)]
      (. builder mskClusterArn data))
    (.build builder)))


(defn cfn-replicator-builder
  "The cfn-replicator-builder function buildes out new instances of 
CfnReplicator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaClusters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-clusters` |
| `replicationInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-info-list` |
| `replicatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicator-name` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReplicator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kafka-clusters)]
      (. builder kafkaClusters data))
    (when-let [data (lookup-entry config id :replication-info-list)]
      (. builder replicationInfoList data))
    (when-let [data (lookup-entry config id :replicator-name)]
      (. builder replicatorName data))
    (when-let [data (lookup-entry config id :service-execution-role-arn)]
      (. builder serviceExecutionRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-replicator-consumer-group-replication-property-builder
  "The cfn-replicator-consumer-group-replication-property-builder function buildes out new instances of 
CfnReplicator$ConsumerGroupReplicationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupsToExclude` | java.util.List | [[cdk.support/lookup-entry]] | `:consumer-groups-to-exclude` |
| `consumerGroupsToReplicate` | java.util.List | [[cdk.support/lookup-entry]] | `:consumer-groups-to-replicate` |
| `detectAndCopyNewConsumerGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detect-and-copy-new-consumer-groups` |
| `synchroniseConsumerGroupOffsets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:synchronise-consumer-group-offsets` |"
  [stack id config]
  (let [builder (CfnReplicator$ConsumerGroupReplicationProperty$Builder.)]
    (when-let [data (lookup-entry config id :consumer-groups-to-exclude)]
      (. builder consumerGroupsToExclude data))
    (when-let [data (lookup-entry config id :consumer-groups-to-replicate)]
      (. builder consumerGroupsToReplicate data))
    (when-let [data (lookup-entry config id :detect-and-copy-new-consumer-groups)]
      (. builder detectAndCopyNewConsumerGroups data))
    (when-let [data (lookup-entry config id :synchronise-consumer-group-offsets)]
      (. builder synchroniseConsumerGroupOffsets data))
    (.build builder)))


(defn cfn-replicator-kafka-cluster-client-vpc-config-property-builder
  "The cfn-replicator-kafka-cluster-client-vpc-config-property-builder function buildes out new instances of 
CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnReplicator$KafkaClusterClientVpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-replicator-kafka-cluster-property-builder
  "The cfn-replicator-kafka-cluster-property-builder function buildes out new instances of 
CfnReplicator$KafkaClusterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonMskCluster` | software.amazon.awscdk.services.msk.CfnReplicator$AmazonMskClusterProperty | [[cdk.support/lookup-entry]] | `:amazon-msk-cluster` |
| `vpcConfig` | software.amazon.awscdk.services.msk.CfnReplicator$KafkaClusterClientVpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnReplicator$KafkaClusterProperty$Builder.)]
    (when-let [data (lookup-entry config id :amazon-msk-cluster)]
      (. builder amazonMskCluster data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-replicator-props-builder
  "The cfn-replicator-props-builder function buildes out new instances of 
CfnReplicatorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kafkaClusters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-clusters` |
| `replicationInfoList` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-info-list` |
| `replicatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicator-name` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnReplicatorProps$Builder.)]
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kafka-clusters)]
      (. builder kafkaClusters data))
    (when-let [data (lookup-entry config id :replication-info-list)]
      (. builder replicationInfoList data))
    (when-let [data (lookup-entry config id :replicator-name)]
      (. builder replicatorName data))
    (when-let [data (lookup-entry config id :service-execution-role-arn)]
      (. builder serviceExecutionRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-replicator-replication-info-property-builder
  "The cfn-replicator-replication-info-property-builder function buildes out new instances of 
CfnReplicator$ReplicationInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerGroupReplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:consumer-group-replication` |
| `sourceKafkaClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-kafka-cluster-arn` |
| `targetCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-compression-type` |
| `targetKafkaClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-kafka-cluster-arn` |
| `topicReplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topic-replication` |"
  [stack id config]
  (let [builder (CfnReplicator$ReplicationInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :consumer-group-replication)]
      (. builder consumerGroupReplication data))
    (when-let [data (lookup-entry config id :source-kafka-cluster-arn)]
      (. builder sourceKafkaClusterArn data))
    (when-let [data (lookup-entry config id :target-compression-type)]
      (. builder targetCompressionType data))
    (when-let [data (lookup-entry config id :target-kafka-cluster-arn)]
      (. builder targetKafkaClusterArn data))
    (when-let [data (lookup-entry config id :topic-replication)]
      (. builder topicReplication data))
    (.build builder)))


(defn cfn-replicator-replication-starting-position-property-builder
  "The cfn-replicator-replication-starting-position-property-builder function buildes out new instances of 
CfnReplicator$ReplicationStartingPositionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnReplicator$ReplicationStartingPositionProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-replicator-topic-replication-property-builder
  "The cfn-replicator-topic-replication-property-builder function buildes out new instances of 
CfnReplicator$TopicReplicationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyAccessControlListsForTopics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-access-control-lists-for-topics` |
| `copyTopicConfigurations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-topic-configurations` |
| `detectAndCopyNewTopics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-and-copy-new-topics` |
| `startingPosition` | software.amazon.awscdk.services.msk.CfnReplicator$ReplicationStartingPositionProperty | [[cdk.support/lookup-entry]] | `:starting-position` |
| `topicsToExclude` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-to-exclude` |
| `topicsToReplicate` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-to-replicate` |"
  [stack id config]
  (let [builder (CfnReplicator$TopicReplicationProperty$Builder.)]
    (when-let [data (lookup-entry config id :copy-access-control-lists-for-topics)]
      (. builder copyAccessControlListsForTopics data))
    (when-let [data (lookup-entry config id :copy-topic-configurations)]
      (. builder copyTopicConfigurations data))
    (when-let [data (lookup-entry config id :detect-and-copy-new-topics)]
      (. builder detectAndCopyNewTopics data))
    (when-let [data (lookup-entry config id :starting-position)]
      (. builder startingPosition data))
    (when-let [data (lookup-entry config id :topics-to-exclude)]
      (. builder topicsToExclude data))
    (when-let [data (lookup-entry config id :topics-to-replicate)]
      (. builder topicsToReplicate data))
    (.build builder)))


(defn cfn-serverless-cluster-builder
  "The cfn-serverless-cluster-builder function buildes out new instances of 
CfnServerlessCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.services.msk.CfnServerlessCluster$ClientAuthenticationProperty | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-configs` |"
  [stack id config]
  (let [builder (CfnServerlessCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-authentication)]
      (. builder clientAuthentication data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-configs)]
      (. builder vpcConfigs data))
    (.build builder)))


(defn cfn-serverless-cluster-client-authentication-property-builder
  "The cfn-serverless-cluster-client-authentication-property-builder function buildes out new instances of 
CfnServerlessCluster$ClientAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sasl` | software.amazon.awscdk.services.msk.CfnServerlessCluster$SaslProperty | [[cdk.support/lookup-entry]] | `:sasl` |"
  [stack id config]
  (let [builder (CfnServerlessCluster$ClientAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sasl)]
      (. builder sasl data))
    (.build builder)))


(defn cfn-serverless-cluster-iam-property-builder
  "The cfn-serverless-cluster-iam-property-builder function buildes out new instances of 
CfnServerlessCluster$IamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnServerlessCluster$IamProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-serverless-cluster-props-builder
  "The cfn-serverless-cluster-props-builder function buildes out new instances of 
CfnServerlessClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-authentication` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configs` |"
  [stack id config]
  (let [builder (CfnServerlessClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :client-authentication)]
      (. builder clientAuthentication data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-configs)]
      (. builder vpcConfigs data))
    (.build builder)))


(defn cfn-serverless-cluster-sasl-property-builder
  "The cfn-serverless-cluster-sasl-property-builder function buildes out new instances of 
CfnServerlessCluster$SaslProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.services.msk.CfnServerlessCluster$IamProperty | [[cdk.support/lookup-entry]] | `:iam` |"
  [stack id config]
  (let [builder (CfnServerlessCluster$SaslProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (.build builder)))


(defn cfn-serverless-cluster-vpc-config-property-builder
  "The cfn-serverless-cluster-vpc-config-property-builder function buildes out new instances of 
CfnServerlessCluster$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnServerlessCluster$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-vpc-connection-builder
  "The cfn-vpc-connection-builder function buildes out new instances of 
CfnVpcConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-cluster-arn` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVpcConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication)]
      (. builder authentication data))
    (when-let [data (lookup-entry config id :client-subnets)]
      (. builder clientSubnets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-cluster-arn)]
      (. builder targetClusterArn data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-connection-props-builder
  "The cfn-vpc-connection-props-builder function buildes out new instances of 
CfnVpcConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authentication` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication` |
| `clientSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:client-subnets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-cluster-arn` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVpcConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication)]
      (. builder authentication data))
    (when-let [data (lookup-entry config id :client-subnets)]
      (. builder clientSubnets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-cluster-arn)]
      (. builder targetClusterArn data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))