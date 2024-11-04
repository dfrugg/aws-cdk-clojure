(ns cdk.api.services.kafkaconnect
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kafkaconnect package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.kafkaconnect CfnConnector$ApacheKafkaClusterProperty$Builder
                                                         CfnConnector$AutoScalingProperty$Builder
                                                         CfnConnector$Builder
                                                         CfnConnector$CapacityProperty$Builder
                                                         CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder
                                                         CfnConnector$CustomPluginProperty$Builder
                                                         CfnConnector$FirehoseLogDeliveryProperty$Builder
                                                         CfnConnector$KafkaClusterClientAuthenticationProperty$Builder
                                                         CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder
                                                         CfnConnector$KafkaClusterProperty$Builder
                                                         CfnConnector$LogDeliveryProperty$Builder
                                                         CfnConnector$PluginProperty$Builder
                                                         CfnConnector$ProvisionedCapacityProperty$Builder
                                                         CfnConnector$S3LogDeliveryProperty$Builder
                                                         CfnConnector$ScaleInPolicyProperty$Builder
                                                         CfnConnector$ScaleOutPolicyProperty$Builder
                                                         CfnConnector$VpcProperty$Builder
                                                         CfnConnector$WorkerConfigurationProperty$Builder
                                                         CfnConnector$WorkerLogDeliveryProperty$Builder
                                                         CfnConnectorProps$Builder
                                                         CfnCustomPlugin$Builder
                                                         CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder
                                                         CfnCustomPlugin$CustomPluginLocationProperty$Builder
                                                         CfnCustomPlugin$S3LocationProperty$Builder
                                                         CfnCustomPluginProps$Builder
                                                         CfnWorkerConfiguration$Builder
                                                         CfnWorkerConfigurationProps$Builder]))


(defn cfn-connector-apache-kafka-cluster-property-builder
  "The cfn-connector-apache-kafka-cluster-property-builder function buildes out new instances of 
CfnConnector$ApacheKafkaClusterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapServers` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-servers` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CfnConnector$ApacheKafkaClusterProperty$Builder.)]
    (when-let [data (lookup-entry config id :bootstrap-servers)]
      (. builder bootstrapServers data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cfn-connector-auto-scaling-property-builder
  "The cfn-connector-auto-scaling-property-builder function buildes out new instances of 
CfnConnector$AutoScalingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `mcuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mcu-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `scaleInPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scale-in-policy` |
| `scaleOutPolicy` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$ScaleOutPolicyProperty | [[cdk.support/lookup-entry]] | `:scale-out-policy` |"
  [stack id config]
  (let [builder (CfnConnector$AutoScalingProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-worker-count)]
      (. builder maxWorkerCount data))
    (when-let [data (lookup-entry config id :mcu-count)]
      (. builder mcuCount data))
    (when-let [data (lookup-entry config id :min-worker-count)]
      (. builder minWorkerCount data))
    (when-let [data (lookup-entry config id :scale-in-policy)]
      (. builder scaleInPolicy data))
    (when-let [data (lookup-entry config id :scale-out-policy)]
      (. builder scaleOutPolicy data))
    (.build builder)))


(defn cfn-connector-builder
  "The cfn-connector-builder function buildes out new instances of 
CfnConnector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$CapacityProperty | [[cdk.support/lookup-entry]] | `:capacity` |
| `connectorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-configuration` |
| `connectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-description` |
| `connectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-name` |
| `kafkaCluster` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$KafkaClusterProperty | [[cdk.support/lookup-entry]] | `:kafka-cluster` |
| `kafkaClusterClientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-cluster-client-authentication` |
| `kafkaClusterEncryptionInTransit` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$KafkaClusterEncryptionInTransitProperty | [[cdk.support/lookup-entry]] | `:kafka-cluster-encryption-in-transit` |
| `kafkaConnectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-connect-version` |
| `logDelivery` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-delivery` |
| `plugins` | java.util.List | [[cdk.support/lookup-entry]] | `:plugins` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-configuration` |"
  [stack id config]
  (let [builder (CfnConnector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :connector-configuration)]
      (. builder connectorConfiguration data))
    (when-let [data (lookup-entry config id :connector-description)]
      (. builder connectorDescription data))
    (when-let [data (lookup-entry config id :connector-name)]
      (. builder connectorName data))
    (when-let [data (lookup-entry config id :kafka-cluster)]
      (. builder kafkaCluster data))
    (when-let [data (lookup-entry config id :kafka-cluster-client-authentication)]
      (. builder kafkaClusterClientAuthentication data))
    (when-let [data (lookup-entry config id :kafka-cluster-encryption-in-transit)]
      (. builder kafkaClusterEncryptionInTransit data))
    (when-let [data (lookup-entry config id :kafka-connect-version)]
      (. builder kafkaConnectVersion data))
    (when-let [data (lookup-entry config id :log-delivery)]
      (. builder logDelivery data))
    (when-let [data (lookup-entry config id :plugins)]
      (. builder plugins data))
    (when-let [data (lookup-entry config id :service-execution-role-arn)]
      (. builder serviceExecutionRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :worker-configuration)]
      (. builder workerConfiguration data))
    (.build builder)))


(defn cfn-connector-capacity-property-builder
  "The cfn-connector-capacity-property-builder function buildes out new instances of 
CfnConnector$CapacityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScaling` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$AutoScalingProperty | [[cdk.support/lookup-entry]] | `:auto-scaling` |
| `provisionedCapacity` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$ProvisionedCapacityProperty | [[cdk.support/lookup-entry]] | `:provisioned-capacity` |"
  [stack id config]
  (let [builder (CfnConnector$CapacityProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling)]
      (. builder autoScaling data))
    (when-let [data (lookup-entry config id :provisioned-capacity)]
      (. builder provisionedCapacity data))
    (.build builder)))


(defn cfn-connector-cloud-watch-logs-log-delivery-property-builder
  "The cfn-connector-cloud-watch-logs-log-delivery-property-builder function buildes out new instances of 
CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))


(defn cfn-connector-custom-plugin-property-builder
  "The cfn-connector-custom-plugin-property-builder function buildes out new instances of 
CfnConnector$CustomPluginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPluginArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-plugin-arn` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnConnector$CustomPluginProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-plugin-arn)]
      (. builder customPluginArn data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-connector-firehose-log-delivery-property-builder
  "The cfn-connector-firehose-log-delivery-property-builder function buildes out new instances of 
CfnConnector$FirehoseLogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnConnector$FirehoseLogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream)]
      (. builder deliveryStream data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-connector-kafka-cluster-client-authentication-property-builder
  "The cfn-connector-kafka-cluster-client-authentication-property-builder function buildes out new instances of 
CfnConnector$KafkaClusterClientAuthenticationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |"
  [stack id config]
  (let [builder (CfnConnector$KafkaClusterClientAuthenticationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (.build builder)))


(defn cfn-connector-kafka-cluster-encryption-in-transit-property-builder
  "The cfn-connector-kafka-cluster-encryption-in-transit-property-builder function buildes out new instances of 
CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |"
  [stack id config]
  (let [builder (CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (.build builder)))


(defn cfn-connector-kafka-cluster-property-builder
  "The cfn-connector-kafka-cluster-property-builder function buildes out new instances of 
CfnConnector$KafkaClusterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apacheKafkaCluster` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apache-kafka-cluster` |"
  [stack id config]
  (let [builder (CfnConnector$KafkaClusterProperty$Builder.)]
    (when-let [data (lookup-entry config id :apache-kafka-cluster)]
      (. builder apacheKafkaCluster data))
    (.build builder)))


(defn cfn-connector-log-delivery-property-builder
  "The cfn-connector-log-delivery-property-builder function buildes out new instances of 
CfnConnector$LogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workerLogDelivery` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$WorkerLogDeliveryProperty | [[cdk.support/lookup-entry]] | `:worker-log-delivery` |"
  [stack id config]
  (let [builder (CfnConnector$LogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :worker-log-delivery)]
      (. builder workerLogDelivery data))
    (.build builder)))


(defn cfn-connector-plugin-property-builder
  "The cfn-connector-plugin-property-builder function buildes out new instances of 
CfnConnector$PluginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPlugin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-plugin` |"
  [stack id config]
  (let [builder (CfnConnector$PluginProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-plugin)]
      (. builder customPlugin data))
    (.build builder)))


(defn cfn-connector-props-builder
  "The cfn-connector-props-builder function buildes out new instances of 
CfnConnectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity` |
| `connectorConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connector-configuration` |
| `connectorDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-description` |
| `connectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-name` |
| `kafkaCluster` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-cluster` |
| `kafkaClusterClientAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-cluster-client-authentication` |
| `kafkaClusterEncryptionInTransit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kafka-cluster-encryption-in-transit` |
| `kafkaConnectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kafka-connect-version` |
| `logDelivery` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$LogDeliveryProperty | [[cdk.support/lookup-entry]] | `:log-delivery` |
| `plugins` | java.util.List | [[cdk.support/lookup-entry]] | `:plugins` |
| `serviceExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-execution-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workerConfiguration` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |"
  [stack id config]
  (let [builder (CfnConnectorProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :connector-configuration)]
      (. builder connectorConfiguration data))
    (when-let [data (lookup-entry config id :connector-description)]
      (. builder connectorDescription data))
    (when-let [data (lookup-entry config id :connector-name)]
      (. builder connectorName data))
    (when-let [data (lookup-entry config id :kafka-cluster)]
      (. builder kafkaCluster data))
    (when-let [data (lookup-entry config id :kafka-cluster-client-authentication)]
      (. builder kafkaClusterClientAuthentication data))
    (when-let [data (lookup-entry config id :kafka-cluster-encryption-in-transit)]
      (. builder kafkaClusterEncryptionInTransit data))
    (when-let [data (lookup-entry config id :kafka-connect-version)]
      (. builder kafkaConnectVersion data))
    (when-let [data (lookup-entry config id :log-delivery)]
      (. builder logDelivery data))
    (when-let [data (lookup-entry config id :plugins)]
      (. builder plugins data))
    (when-let [data (lookup-entry config id :service-execution-role-arn)]
      (. builder serviceExecutionRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :worker-configuration)]
      (. builder workerConfiguration data))
    (.build builder)))


(defn cfn-connector-provisioned-capacity-property-builder
  "The cfn-connector-provisioned-capacity-property-builder function buildes out new instances of 
CfnConnector$ProvisionedCapacityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mcuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mcu-count` |
| `workerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:worker-count` |"
  [stack id config]
  (let [builder (CfnConnector$ProvisionedCapacityProperty$Builder.)]
    (when-let [data (lookup-entry config id :mcu-count)]
      (. builder mcuCount data))
    (when-let [data (lookup-entry config id :worker-count)]
      (. builder workerCount data))
    (.build builder)))


(defn cfn-connector-s3-log-delivery-property-builder
  "The cfn-connector-s3-log-delivery-property-builder function buildes out new instances of 
CfnConnector$S3LogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnConnector$S3LogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-connector-scale-in-policy-property-builder
  "The cfn-connector-scale-in-policy-property-builder function buildes out new instances of 
CfnConnector$ScaleInPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuUtilizationPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-utilization-percentage` |"
  [stack id config]
  (let [builder (CfnConnector$ScaleInPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-utilization-percentage)]
      (. builder cpuUtilizationPercentage data))
    (.build builder)))


(defn cfn-connector-scale-out-policy-property-builder
  "The cfn-connector-scale-out-policy-property-builder function buildes out new instances of 
CfnConnector$ScaleOutPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuUtilizationPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-utilization-percentage` |"
  [stack id config]
  (let [builder (CfnConnector$ScaleOutPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-utilization-percentage)]
      (. builder cpuUtilizationPercentage data))
    (.build builder)))


(defn cfn-connector-vpc-property-builder
  "The cfn-connector-vpc-property-builder function buildes out new instances of 
CfnConnector$VpcProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnConnector$VpcProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-connector-worker-configuration-property-builder
  "The cfn-connector-worker-configuration-property-builder function buildes out new instances of 
CfnConnector$WorkerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
| `workerConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-configuration-arn` |"
  [stack id config]
  (let [builder (CfnConnector$WorkerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (when-let [data (lookup-entry config id :worker-configuration-arn)]
      (. builder workerConfigurationArn data))
    (.build builder)))


(defn cfn-connector-worker-log-delivery-property-builder
  "The cfn-connector-worker-log-delivery-property-builder function buildes out new instances of 
CfnConnector$WorkerLogDeliveryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$FirehoseLogDeliveryProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$S3LogDeliveryProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnConnector$WorkerLogDeliveryProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs)]
      (. builder cloudWatchLogs data))
    (when-let [data (lookup-entry config id :firehose)]
      (. builder firehose data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-custom-plugin-builder
  "The cfn-custom-plugin-builder function buildes out new instances of 
CfnCustomPlugin$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin$CustomPluginLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomPlugin$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-plugin-custom-plugin-file-description-property-builder
  "The cfn-custom-plugin-custom-plugin-file-description-property-builder function buildes out new instances of 
CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileMd5` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-md5` |
| `fileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:file-size` |"
  [stack id config]
  (let [builder (CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-md5)]
      (. builder fileMd5 data))
    (when-let [data (lookup-entry config id :file-size)]
      (. builder fileSize data))
    (.build builder)))


(defn cfn-custom-plugin-custom-plugin-location-property-builder
  "The cfn-custom-plugin-custom-plugin-location-property-builder function buildes out new instances of 
CfnCustomPlugin$CustomPluginLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin$S3LocationProperty | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (CfnCustomPlugin$CustomPluginLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn cfn-custom-plugin-props-builder
  "The cfn-custom-plugin-props-builder function buildes out new instances of 
CfnCustomPluginProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomPluginProps$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-plugin-s3-location-property-builder
  "The cfn-custom-plugin-s3-location-property-builder function buildes out new instances of 
CfnCustomPlugin$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |"
  [stack id config]
  (let [builder (CfnCustomPlugin$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :file-key)]
      (. builder fileKey data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (.build builder)))


(defn cfn-worker-configuration-builder
  "The cfn-worker-configuration-builder function buildes out new instances of 
CfnWorkerConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `propertiesFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties-file-content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkerConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties-file-content)]
      (. builder propertiesFileContent data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-worker-configuration-props-builder
  "The cfn-worker-configuration-props-builder function buildes out new instances of 
CfnWorkerConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `propertiesFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties-file-content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnWorkerConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties-file-content)]
      (. builder propertiesFileContent data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))