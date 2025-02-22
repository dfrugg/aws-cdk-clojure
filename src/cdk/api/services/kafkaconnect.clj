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


(defn build-cfn-connector-apache-kafka-cluster-property-builder
  "The build-cfn-connector-apache-kafka-cluster-property-builder function updates a CfnConnector$ApacheKafkaClusterProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$ApacheKafkaClusterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapServers` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-servers` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnConnector$ApacheKafkaClusterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bootstrap-servers)]
    (. builder bootstrapServers data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn build-cfn-connector-auto-scaling-property-builder
  "The build-cfn-connector-auto-scaling-property-builder function updates a CfnConnector$AutoScalingProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$AutoScalingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-worker-count` |
| `mcuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mcu-count` |
| `minWorkerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-worker-count` |
| `scaleInPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scale-in-policy` |
| `scaleOutPolicy` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$ScaleOutPolicyProperty | [[cdk.support/lookup-entry]] | `:scale-out-policy` |
"
  [^CfnConnector$AutoScalingProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-connector-builder
  "The build-cfn-connector-builder function updates a CfnConnector$Builder instance using the provided configuration.
  The function takes the CfnConnector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-configuration` |
"
  [^CfnConnector$Builder builder id config]
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
  (.build builder))


(defn build-cfn-connector-capacity-property-builder
  "The build-cfn-connector-capacity-property-builder function updates a CfnConnector$CapacityProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$CapacityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScaling` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$AutoScalingProperty | [[cdk.support/lookup-entry]] | `:auto-scaling` |
| `provisionedCapacity` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$ProvisionedCapacityProperty | [[cdk.support/lookup-entry]] | `:provisioned-capacity` |
"
  [^CfnConnector$CapacityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling)]
    (. builder autoScaling data))
  (when-let [data (lookup-entry config id :provisioned-capacity)]
    (. builder provisionedCapacity data))
  (.build builder))


(defn build-cfn-connector-cloud-watch-logs-log-delivery-property-builder
  "The build-cfn-connector-cloud-watch-logs-log-delivery-property-builder function updates a CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
"
  [^CfnConnector$CloudWatchLogsLogDeliveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (.build builder))


(defn build-cfn-connector-custom-plugin-property-builder
  "The build-cfn-connector-custom-plugin-property-builder function updates a CfnConnector$CustomPluginProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$CustomPluginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPluginArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-plugin-arn` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnConnector$CustomPluginProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-plugin-arn)]
    (. builder customPluginArn data))
  (when-let [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn build-cfn-connector-firehose-log-delivery-property-builder
  "The build-cfn-connector-firehose-log-delivery-property-builder function updates a CfnConnector$FirehoseLogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$FirehoseLogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnConnector$FirehoseLogDeliveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-stream)]
    (. builder deliveryStream data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn build-cfn-connector-kafka-cluster-client-authentication-property-builder
  "The build-cfn-connector-kafka-cluster-client-authentication-property-builder function updates a CfnConnector$KafkaClusterClientAuthenticationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$KafkaClusterClientAuthenticationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
"
  [^CfnConnector$KafkaClusterClientAuthenticationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (.build builder))


(defn build-cfn-connector-kafka-cluster-encryption-in-transit-property-builder
  "The build-cfn-connector-kafka-cluster-encryption-in-transit-property-builder function updates a CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
"
  [^CfnConnector$KafkaClusterEncryptionInTransitProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (.build builder))


(defn build-cfn-connector-kafka-cluster-property-builder
  "The build-cfn-connector-kafka-cluster-property-builder function updates a CfnConnector$KafkaClusterProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$KafkaClusterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apacheKafkaCluster` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apache-kafka-cluster` |
"
  [^CfnConnector$KafkaClusterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :apache-kafka-cluster)]
    (. builder apacheKafkaCluster data))
  (.build builder))


(defn build-cfn-connector-log-delivery-property-builder
  "The build-cfn-connector-log-delivery-property-builder function updates a CfnConnector$LogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$LogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workerLogDelivery` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$WorkerLogDeliveryProperty | [[cdk.support/lookup-entry]] | `:worker-log-delivery` |
"
  [^CfnConnector$LogDeliveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :worker-log-delivery)]
    (. builder workerLogDelivery data))
  (.build builder))


(defn build-cfn-connector-plugin-property-builder
  "The build-cfn-connector-plugin-property-builder function updates a CfnConnector$PluginProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$PluginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPlugin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-plugin` |
"
  [^CfnConnector$PluginProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-plugin)]
    (. builder customPlugin data))
  (.build builder))


(defn build-cfn-connector-props-builder
  "The build-cfn-connector-props-builder function updates a CfnConnectorProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerConfiguration` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |
"
  [^CfnConnectorProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-connector-provisioned-capacity-property-builder
  "The build-cfn-connector-provisioned-capacity-property-builder function updates a CfnConnector$ProvisionedCapacityProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$ProvisionedCapacityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mcuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mcu-count` |
| `workerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:worker-count` |
"
  [^CfnConnector$ProvisionedCapacityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mcu-count)]
    (. builder mcuCount data))
  (when-let [data (lookup-entry config id :worker-count)]
    (. builder workerCount data))
  (.build builder))


(defn build-cfn-connector-s3-log-delivery-property-builder
  "The build-cfn-connector-s3-log-delivery-property-builder function updates a CfnConnector$S3LogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$S3LogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnConnector$S3LogDeliveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn build-cfn-connector-scale-in-policy-property-builder
  "The build-cfn-connector-scale-in-policy-property-builder function updates a CfnConnector$ScaleInPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$ScaleInPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuUtilizationPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-utilization-percentage` |
"
  [^CfnConnector$ScaleInPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cpu-utilization-percentage)]
    (. builder cpuUtilizationPercentage data))
  (.build builder))


(defn build-cfn-connector-scale-out-policy-property-builder
  "The build-cfn-connector-scale-out-policy-property-builder function updates a CfnConnector$ScaleOutPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$ScaleOutPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuUtilizationPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-utilization-percentage` |
"
  [^CfnConnector$ScaleOutPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cpu-utilization-percentage)]
    (. builder cpuUtilizationPercentage data))
  (.build builder))


(defn build-cfn-connector-vpc-property-builder
  "The build-cfn-connector-vpc-property-builder function updates a CfnConnector$VpcProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$VpcProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnConnector$VpcProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn build-cfn-connector-worker-configuration-property-builder
  "The build-cfn-connector-worker-configuration-property-builder function updates a CfnConnector$WorkerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$WorkerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
| `workerConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:worker-configuration-arn` |
"
  [^CfnConnector$WorkerConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :revision)]
    (. builder revision data))
  (when-let [data (lookup-entry config id :worker-configuration-arn)]
    (. builder workerConfigurationArn data))
  (.build builder))


(defn build-cfn-connector-worker-log-delivery-property-builder
  "The build-cfn-connector-worker-log-delivery-property-builder function updates a CfnConnector$WorkerLogDeliveryProperty$Builder instance using the provided configuration.
  The function takes the CfnConnector$WorkerLogDeliveryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `firehose` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$FirehoseLogDeliveryProperty | [[cdk.support/lookup-entry]] | `:firehose` |
| `s3` | software.amazon.awscdk.services.kafkaconnect.CfnConnector$S3LogDeliveryProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnConnector$WorkerLogDeliveryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs)]
    (. builder cloudWatchLogs data))
  (when-let [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn build-cfn-custom-plugin-builder
  "The build-cfn-custom-plugin-builder function updates a CfnCustomPlugin$Builder instance using the provided configuration.
  The function takes the CfnCustomPlugin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin$CustomPluginLocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomPlugin$Builder builder id config]
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
  (.build builder))


(defn build-cfn-custom-plugin-custom-plugin-file-description-property-builder
  "The build-cfn-custom-plugin-custom-plugin-file-description-property-builder function updates a CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileMd5` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-md5` |
| `fileSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:file-size` |
"
  [^CfnCustomPlugin$CustomPluginFileDescriptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-md5)]
    (. builder fileMd5 data))
  (when-let [data (lookup-entry config id :file-size)]
    (. builder fileSize data))
  (.build builder))


(defn build-cfn-custom-plugin-custom-plugin-location-property-builder
  "The build-cfn-custom-plugin-custom-plugin-location-property-builder function updates a CfnCustomPlugin$CustomPluginLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomPlugin$CustomPluginLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.kafkaconnect.CfnCustomPlugin$S3LocationProperty | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CfnCustomPlugin$CustomPluginLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn build-cfn-custom-plugin-props-builder
  "The build-cfn-custom-plugin-props-builder function updates a CfnCustomPluginProps$Builder instance using the provided configuration.
  The function takes the CfnCustomPluginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomPluginProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-custom-plugin-s3-location-property-builder
  "The build-cfn-custom-plugin-s3-location-property-builder function updates a CfnCustomPlugin$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnCustomPlugin$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `fileKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
"
  [^CfnCustomPlugin$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-let [data (lookup-entry config id :file-key)]
    (. builder fileKey data))
  (when-let [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (.build builder))


(defn build-cfn-worker-configuration-builder
  "The build-cfn-worker-configuration-builder function updates a CfnWorkerConfiguration$Builder instance using the provided configuration.
  The function takes the CfnWorkerConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `propertiesFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties-file-content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkerConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :properties-file-content)]
    (. builder propertiesFileContent data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-worker-configuration-props-builder
  "The build-cfn-worker-configuration-props-builder function updates a CfnWorkerConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnWorkerConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `propertiesFileContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:properties-file-content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWorkerConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :properties-file-content)]
    (. builder propertiesFileContent data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))