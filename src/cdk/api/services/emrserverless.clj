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


(defn cfn-application-auto-start-configuration-property-builder>
  "The cfn-application-auto-start-configuration-property-builder> function updates a CfnApplication$AutoStartConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$AutoStartConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnApplication$AutoStartConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-application-auto-start-configuration-property-builder
  "Creates a  `CfnApplication$AutoStartConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-auto-start-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-auto-start-configuration-property-builder> (new CfnApplication$AutoStartConfigurationProperty$Builder) id config))


(defn cfn-application-auto-stop-configuration-property-builder>
  "The cfn-application-auto-stop-configuration-property-builder> function updates a CfnApplication$AutoStopConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$AutoStopConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `idleTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout-minutes` |
"
  [^CfnApplication$AutoStopConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :idle-timeout-minutes)]
    (. builder idleTimeoutMinutes data))
  (.build builder))


(defn cfn-application-auto-stop-configuration-property-builder
  "Creates a  `CfnApplication$AutoStopConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-auto-stop-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-auto-stop-configuration-property-builder> (new CfnApplication$AutoStopConfigurationProperty$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerTypeSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-type-specifications` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :auto-start-configuration)]
    (. builder autoStartConfiguration data))
  (when-some [data (lookup-entry config id :auto-stop-configuration)]
    (. builder autoStopConfiguration data))
  (when-some [data (lookup-entry config id :image-configuration)]
    (. builder imageConfiguration data))
  (when-some [data (lookup-entry config id :initial-capacity)]
    (. builder initialCapacity data))
  (when-some [data (lookup-entry config id :maximum-capacity)]
    (. builder maximumCapacity data))
  (when-some [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :runtime-configuration)]
    (. builder runtimeConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :worker-type-specifications)]
    (. builder workerTypeSpecifications data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-application-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-cloud-watch-logging-configuration-property-builder>
  "The cfn-application-cloud-watch-logging-configuration-property-builder> function updates a CfnApplication$CloudWatchLoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CloudWatchLoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logStreamNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name-prefix` |
| `logTypeMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-type-map` |
"
  [^CfnApplication$CloudWatchLoggingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-stream-name-prefix)]
    (. builder logStreamNamePrefix data))
  (when-some [data (lookup-entry config id :log-type-map)]
    (. builder logTypeMap data))
  (.build builder))


(defn cfn-application-cloud-watch-logging-configuration-property-builder
  "Creates a  `CfnApplication$CloudWatchLoggingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-cloud-watch-logging-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-cloud-watch-logging-configuration-property-builder> (new CfnApplication$CloudWatchLoggingConfigurationProperty$Builder) id config))


(defn cfn-application-configuration-object-property-builder>
  "The cfn-application-configuration-object-property-builder> function updates a CfnApplication$ConfigurationObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ConfigurationObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
"
  [^CfnApplication$ConfigurationObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (.build builder))


(defn cfn-application-configuration-object-property-builder
  "Creates a  `CfnApplication$ConfigurationObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-configuration-object-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-configuration-object-property-builder> (new CfnApplication$ConfigurationObjectProperty$Builder) id config))


(defn cfn-application-image-configuration-input-property-builder>
  "The cfn-application-image-configuration-input-property-builder> function updates a CfnApplication$ImageConfigurationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ImageConfigurationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
"
  [^CfnApplication$ImageConfigurationInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (.build builder))


(defn cfn-application-image-configuration-input-property-builder
  "Creates a  `CfnApplication$ImageConfigurationInputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-image-configuration-input-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-image-configuration-input-property-builder> (new CfnApplication$ImageConfigurationInputProperty$Builder) id config))


(defn cfn-application-initial-capacity-config-key-value-pair-property-builder>
  "The cfn-application-initial-capacity-config-key-value-pair-property-builder> function updates a CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.emrserverless.CfnApplication$InitialCapacityConfigProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-application-initial-capacity-config-key-value-pair-property-builder
  "Creates a  `CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-initial-capacity-config-key-value-pair-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-initial-capacity-config-key-value-pair-property-builder> (new CfnApplication$InitialCapacityConfigKeyValuePairProperty$Builder) id config))


(defn cfn-application-initial-capacity-config-property-builder>
  "The cfn-application-initial-capacity-config-property-builder> function updates a CfnApplication$InitialCapacityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$InitialCapacityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workerConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |
| `workerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:worker-count` |
"
  [^CfnApplication$InitialCapacityConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :worker-configuration)]
    (. builder workerConfiguration data))
  (when-some [data (lookup-entry config id :worker-count)]
    (. builder workerCount data))
  (.build builder))


(defn cfn-application-initial-capacity-config-property-builder
  "Creates a  `CfnApplication$InitialCapacityConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-initial-capacity-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-initial-capacity-config-property-builder> (new CfnApplication$InitialCapacityConfigProperty$Builder) id config))


(defn cfn-application-log-type-map-key-value-pair-property-builder>
  "The cfn-application-log-type-map-key-value-pair-property-builder> function updates a CfnApplication$LogTypeMapKeyValuePairProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$LogTypeMapKeyValuePairProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnApplication$LogTypeMapKeyValuePairProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-application-log-type-map-key-value-pair-property-builder
  "Creates a  `CfnApplication$LogTypeMapKeyValuePairProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-log-type-map-key-value-pair-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-log-type-map-key-value-pair-property-builder> (new CfnApplication$LogTypeMapKeyValuePairProperty$Builder) id config))


(defn cfn-application-managed-persistence-monitoring-configuration-property-builder>
  "The cfn-application-managed-persistence-monitoring-configuration-property-builder> function updates a CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
"
  [^CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (.build builder))


(defn cfn-application-managed-persistence-monitoring-configuration-property-builder
  "Creates a  `CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-managed-persistence-monitoring-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-managed-persistence-monitoring-configuration-property-builder> (new CfnApplication$ManagedPersistenceMonitoringConfigurationProperty$Builder) id config))


(defn cfn-application-maximum-allowed-resources-property-builder>
  "The cfn-application-maximum-allowed-resources-property-builder> function updates a CfnApplication$MaximumAllowedResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MaximumAllowedResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `disk` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
"
  [^CfnApplication$MaximumAllowedResourcesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :disk)]
    (. builder disk data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (.build builder))


(defn cfn-application-maximum-allowed-resources-property-builder
  "Creates a  `CfnApplication$MaximumAllowedResourcesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-maximum-allowed-resources-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-maximum-allowed-resources-property-builder> (new CfnApplication$MaximumAllowedResourcesProperty$Builder) id config))


(defn cfn-application-monitoring-configuration-property-builder>
  "The cfn-application-monitoring-configuration-property-builder> function updates a CfnApplication$MonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$MonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLoggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-logging-configuration` |
| `managedPersistenceMonitoringConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-persistence-monitoring-configuration` |
| `s3MonitoringConfiguration` | software.amazon.awscdk.services.emrserverless.CfnApplication$S3MonitoringConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-monitoring-configuration` |
"
  [^CfnApplication$MonitoringConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logging-configuration)]
    (. builder cloudWatchLoggingConfiguration data))
  (when-some [data (lookup-entry config id :managed-persistence-monitoring-configuration)]
    (. builder managedPersistenceMonitoringConfiguration data))
  (when-some [data (lookup-entry config id :s3-monitoring-configuration)]
    (. builder s3MonitoringConfiguration data))
  (.build builder))


(defn cfn-application-monitoring-configuration-property-builder
  "Creates a  `CfnApplication$MonitoringConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-monitoring-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-monitoring-configuration-property-builder> (new CfnApplication$MonitoringConfigurationProperty$Builder) id config))


(defn cfn-application-network-configuration-property-builder>
  "The cfn-application-network-configuration-property-builder> function updates a CfnApplication$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnApplication$NetworkConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-application-network-configuration-property-builder
  "Creates a  `CfnApplication$NetworkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-network-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-network-configuration-property-builder> (new CfnApplication$NetworkConfigurationProperty$Builder) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workerTypeSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:worker-type-specifications` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :auto-start-configuration)]
    (. builder autoStartConfiguration data))
  (when-some [data (lookup-entry config id :auto-stop-configuration)]
    (. builder autoStopConfiguration data))
  (when-some [data (lookup-entry config id :image-configuration)]
    (. builder imageConfiguration data))
  (when-some [data (lookup-entry config id :initial-capacity)]
    (. builder initialCapacity data))
  (when-some [data (lookup-entry config id :maximum-capacity)]
    (. builder maximumCapacity data))
  (when-some [data (lookup-entry config id :monitoring-configuration)]
    (. builder monitoringConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :runtime-configuration)]
    (. builder runtimeConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :worker-type-specifications)]
    (. builder workerTypeSpecifications data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-application-s3-monitoring-configuration-property-builder>
  "The cfn-application-s3-monitoring-configuration-property-builder> function updates a CfnApplication$S3MonitoringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$S3MonitoringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
"
  [^CfnApplication$S3MonitoringConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-some [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (.build builder))


(defn cfn-application-s3-monitoring-configuration-property-builder
  "Creates a  `CfnApplication$S3MonitoringConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-s3-monitoring-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-s3-monitoring-configuration-property-builder> (new CfnApplication$S3MonitoringConfigurationProperty$Builder) id config))


(defn cfn-application-worker-configuration-property-builder>
  "The cfn-application-worker-configuration-property-builder> function updates a CfnApplication$WorkerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$WorkerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `disk` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
"
  [^CfnApplication$WorkerConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :disk)]
    (. builder disk data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (.build builder))


(defn cfn-application-worker-configuration-property-builder
  "Creates a  `CfnApplication$WorkerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-worker-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-worker-configuration-property-builder> (new CfnApplication$WorkerConfigurationProperty$Builder) id config))


(defn cfn-application-worker-type-specification-input-property-builder>
  "The cfn-application-worker-type-specification-input-property-builder> function updates a CfnApplication$WorkerTypeSpecificationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$WorkerTypeSpecificationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-configuration` |
"
  [^CfnApplication$WorkerTypeSpecificationInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-configuration)]
    (. builder imageConfiguration data))
  (.build builder))


(defn cfn-application-worker-type-specification-input-property-builder
  "Creates a  `CfnApplication$WorkerTypeSpecificationInputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-worker-type-specification-input-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-worker-type-specification-input-property-builder> (new CfnApplication$WorkerTypeSpecificationInputProperty$Builder) id config))