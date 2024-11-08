(ns cdk.api.services.emrserverless
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.emrserverless package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.emrserverless CfnApplication$AutoStartConfigurationProperty$Builder
                                                          CfnApplication$AutoStopConfigurationProperty$Builder
                                                          CfnApplication$Builder
                                                          CfnApplication$CloudWatchLoggingConfigurationProperty$Builder
                                                          CfnApplication$ConfigurationObjectProperty$Builder
                                                          CfnApplication$ImageConfigurationInputProperty$Builder
                                                          CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder
                                                          CfnApplication$InitialCapacityConfigProperty$Builder
                                                          CfnApplication$LogTypeMapKeyValuePairProperty$Builder
                                                          CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder
                                                          CfnApplication$MaximumAllowedResourcesProperty$Builder
                                                          CfnApplication$MonitoringConfigurationProperty$Builder
                                                          CfnApplication$NetworkConfigurationProperty$Builder
                                                          CfnApplication$S3MonitoringConfigurationProperty$Builder
                                                          CfnApplication$WorkerConfigurationProperty$Builder
                                                          CfnApplication$WorkerTypeSpecificationInputProperty$Builder
                                                          CfnApplicationProps$Builder]))


(defn cfn-application-auto-start-configuration-property-builder
  "The cfn-application-auto-start-configuration-property-builder function buildes out new instances of 
CfnApplication$AutoStartConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnApplication$AutoStartConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-application-auto-stop-configuration-property-builder
  "The cfn-application-auto-stop-configuration-property-builder function buildes out new instances of 
CfnApplication$AutoStopConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `idleTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout-minutes` |"
  [stack id config]
  (let [builder (CfnApplication$AutoStopConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :idle-timeout-minutes)]
      (. builder idleTimeoutMinutes data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `autoStartConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-start-configuration` |
| `autoStopConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$AutoStopConfigurationProperty | [[cdk.support/lookup-entry]] | `:auto-stop-configuration` |
| `imageConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$ImageConfigurationInputProperty | [[cdk.support/lookup-entry]] | `:image-configuration` |
| `initialCapacity` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-capacity` |
| `maximumCapacity` | software.amazon.awscdk.services.emrserverless.CfnApplication$MaximumAllowedResourcesProperty | [[cdk.support/lookup-entry]] | `:maximum-capacity` |
| `monitoringConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$MonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `runtimeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `workerTypeSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-type-specifications` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :auto-start-configuration)]
      (. builder autoStartConfiguration data))
    (when-let [data (lookup-entry config id :auto-stop-configuration)]
      (. builder autoStopConfiguration data))
    (when-let [data (lookup-entry config id :image-configuration)]
      (. builder imageConfiguration data))
    (when-let [data (lookup-entry config id :initial-capacity)]
      (. builder initialCapacity data))
    (when-let [data (lookup-entry config id :maximum-capacity)]
      (. builder maximumCapacity data))
    (when-let [data (lookup-entry config id :monitoring-configuration)]
      (. builder monitoringConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :runtime-configuration)]
      (. builder runtimeConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :worker-type-specifications)]
      (. builder workerTypeSpecifications data))
    (.build builder)))


(defn cfn-application-cloud-watch-logging-configuration-property-builder
  "The cfn-application-cloud-watch-logging-configuration-property-builder function buildes out new instances of 
CfnApplication$CloudWatchLoggingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name-prefix` |
| `logTypeMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-type-map` |"
  [stack id config]
  (let [builder (CfnApplication$CloudWatchLoggingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-stream-name-prefix)]
      (. builder logStreamNamePrefix data))
    (when-let [data (lookup-entry config id :log-type-map)]
      (. builder logTypeMap data))
    (.build builder)))


(defn cfn-application-configuration-object-property-builder
  "The cfn-application-configuration-object-property-builder function buildes out new instances of 
CfnApplication$ConfigurationObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |"
  [stack id config]
  (let [builder (CfnApplication$ConfigurationObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (.build builder)))


(defn cfn-application-image-configuration-input-property-builder
  "The cfn-application-image-configuration-input-property-builder function buildes out new instances of 
CfnApplication$ImageConfigurationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |"
  [stack id config]
  (let [builder (CfnApplication$ImageConfigurationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (.build builder)))


(defn cfn-application-initial-capacity-config-key-value-pair-property-builder
  "The cfn-application-initial-capacity-config-key-value-pair-property-builder function buildes out new instances of 
CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.emrserverless.CfnApplication$InitialCapacityConfigProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-application-initial-capacity-config-property-builder
  "The cfn-application-initial-capacity-config-property-builder function buildes out new instances of 
CfnApplication$InitialCapacityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workerConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |
| `workerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:worker-count` |"
  [stack id config]
  (let [builder (CfnApplication$InitialCapacityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :worker-configuration)]
      (. builder workerConfiguration data))
    (when-let [data (lookup-entry config id :worker-count)]
      (. builder workerCount data))
    (.build builder)))


(defn cfn-application-log-type-map-key-value-pair-property-builder
  "The cfn-application-log-type-map-key-value-pair-property-builder function buildes out new instances of 
CfnApplication$LogTypeMapKeyValuePairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnApplication$LogTypeMapKeyValuePairProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-application-managed-persistence-monitoring-configuration-property-builder
  "The cfn-application-managed-persistence-monitoring-configuration-property-builder function buildes out new instances of 
CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |"
  [stack id config]
  (let [builder (CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (.build builder)))


(defn cfn-application-maximum-allowed-resources-property-builder
  "The cfn-application-maximum-allowed-resources-property-builder function buildes out new instances of 
CfnApplication$MaximumAllowedResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `disk` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |"
  [stack id config]
  (let [builder (CfnApplication$MaximumAllowedResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :disk)]
      (. builder disk data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (.build builder)))


(defn cfn-application-monitoring-configuration-property-builder
  "The cfn-application-monitoring-configuration-property-builder function buildes out new instances of 
CfnApplication$MonitoringConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLoggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-configuration` |
| `managedPersistenceMonitoringConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-persistence-monitoring-configuration` |
| `s3MonitoringConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$S3MonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-monitoring-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$MonitoringConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logging-configuration)]
      (. builder cloudWatchLoggingConfiguration data))
    (when-let [data (lookup-entry config id :managed-persistence-monitoring-configuration)]
      (. builder managedPersistenceMonitoringConfiguration data))
    (when-let [data (lookup-entry config id :s3-monitoring-configuration)]
      (. builder s3MonitoringConfiguration data))
    (.build builder)))


(defn cfn-application-network-configuration-property-builder
  "The cfn-application-network-configuration-property-builder function buildes out new instances of 
CfnApplication$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnApplication$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `autoStartConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-start-configuration` |
| `autoStopConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$AutoStopConfigurationProperty | [[cdk.support/lookup-entry]] | `:auto-stop-configuration` |
| `imageConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$ImageConfigurationInputProperty | [[cdk.support/lookup-entry]] | `:image-configuration` |
| `initialCapacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-capacity` |
| `maximumCapacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maximum-capacity` |
| `monitoringConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$MonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:monitoring-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `runtimeConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:runtime-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `workerTypeSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-type-specifications` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :auto-start-configuration)]
      (. builder autoStartConfiguration data))
    (when-let [data (lookup-entry config id :auto-stop-configuration)]
      (. builder autoStopConfiguration data))
    (when-let [data (lookup-entry config id :image-configuration)]
      (. builder imageConfiguration data))
    (when-let [data (lookup-entry config id :initial-capacity)]
      (. builder initialCapacity data))
    (when-let [data (lookup-entry config id :maximum-capacity)]
      (. builder maximumCapacity data))
    (when-let [data (lookup-entry config id :monitoring-configuration)]
      (. builder monitoringConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :runtime-configuration)]
      (. builder runtimeConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :worker-type-specifications)]
      (. builder workerTypeSpecifications data))
    (.build builder)))


(defn cfn-application-s3-monitoring-configuration-property-builder
  "The cfn-application-s3-monitoring-configuration-property-builder function buildes out new instances of 
CfnApplication$S3MonitoringConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |"
  [stack id config]
  (let [builder (CfnApplication$S3MonitoringConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :log-uri)]
      (. builder logUri data))
    (.build builder)))


(defn cfn-application-worker-configuration-property-builder
  "The cfn-application-worker-configuration-property-builder function buildes out new instances of 
CfnApplication$WorkerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `disk` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |"
  [stack id config]
  (let [builder (CfnApplication$WorkerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :disk)]
      (. builder disk data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (.build builder)))


(defn cfn-application-worker-type-specification-input-property-builder
  "The cfn-application-worker-type-specification-input-property-builder function buildes out new instances of 
CfnApplication$WorkerTypeSpecificationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-configuration` |"
  [stack id config]
  (let [builder (CfnApplication$WorkerTypeSpecificationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-configuration)]
      (. builder imageConfiguration data))
    (.build builder)))