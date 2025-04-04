(ns cdk.api.services.codeguruprofiler
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeguruprofiler package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codeguruprofiler CfnProfilingGroup$AgentPermissionsProperty$Builder
                                                             CfnProfilingGroup$Builder
                                                             CfnProfilingGroup$ChannelProperty$Builder
                                                             CfnProfilingGroupProps$Builder
                                                             ComputePlatform
                                                             ProfilingGroup$Builder
                                                             ProfilingGroupProps$Builder]))


(defn compute-platform
  "The `compute-platform` function data interprets values in the provided config data into a 
`ComputePlatform` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ComputePlatform` - the value is returned.
* is `:aws-lambda` - `ComputePlatform/AWS_LAMBDA` is returned
* is `:default` - `ComputePlatform/DEFAULT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ComputePlatform data) data
      (= :aws-lambda data) ComputePlatform/AWS_LAMBDA
      (= :default data) ComputePlatform/DEFAULT)))


(defn cfn-profiling-group-agent-permissions-property-builder>
  "The cfn-profiling-group-agent-permissions-property-builder> function updates a CfnProfilingGroup$AgentPermissionsProperty$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroup$AgentPermissionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
"
  [^CfnProfilingGroup$AgentPermissionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :principals)]
    (. builder principals data))
  (.build builder))


(defn cfn-profiling-group-agent-permissions-property-builder
  "Creates a  `CfnProfilingGroup$AgentPermissionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profiling-group-agent-permissions-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profiling-group-agent-permissions-property-builder> (new CfnProfilingGroup$AgentPermissionsProperty$Builder) id config))


(defn cfn-profiling-group-builder>
  "The cfn-profiling-group-builder> function updates a CfnProfilingGroup$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentPermissions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:agent-permissions` |
| `anomalyDetectionNotificationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anomaly-detection-notification-configuration` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfilingGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-permissions)]
    (. builder agentPermissions data))
  (when-some [data (lookup-entry config id :anomaly-detection-notification-configuration)]
    (. builder anomalyDetectionNotificationConfiguration data))
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profiling-group-builder
  "Creates a  `CfnProfilingGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-profiling-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-profiling-group-builder> (CfnProfilingGroup$Builder/create scope (name id)) id config))


(defn cfn-profiling-group-channel-property-builder>
  "The cfn-profiling-group-channel-property-builder> function updates a CfnProfilingGroup$ChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroup$ChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-uri` |
"
  [^CfnProfilingGroup$ChannelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-some [data (lookup-entry config id :channel-uri)]
    (. builder channelUri data))
  (.build builder))


(defn cfn-profiling-group-channel-property-builder
  "Creates a  `CfnProfilingGroup$ChannelProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profiling-group-channel-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profiling-group-channel-property-builder> (new CfnProfilingGroup$ChannelProperty$Builder) id config))


(defn cfn-profiling-group-props-builder>
  "The cfn-profiling-group-props-builder> function updates a CfnProfilingGroupProps$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentPermissions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:agent-permissions` |
| `anomalyDetectionNotificationConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:anomaly-detection-notification-configuration` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProfilingGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-permissions)]
    (. builder agentPermissions data))
  (when-some [data (lookup-entry config id :anomaly-detection-notification-configuration)]
    (. builder anomalyDetectionNotificationConfiguration data))
  (when-some [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-profiling-group-props-builder
  "Creates a  `CfnProfilingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-profiling-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-profiling-group-props-builder> (new CfnProfilingGroupProps$Builder) id config))


(defn profiling-group-builder>
  "The profiling-group-builder> function updates a ProfilingGroup$Builder instance using the provided configuration.
  The function takes the ProfilingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
"
  [^ProfilingGroup$Builder builder id config]
  (when-some [data (compute-platform config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (.build builder))


(defn profiling-group-builder
  "Creates a  `ProfilingGroup$Builder` instance using a scope and ID, applies the data configuration using the [[profiling-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (profiling-group-builder> (ProfilingGroup$Builder/create scope (name id)) id config))


(defn profiling-group-props-builder>
  "The profiling-group-props-builder> function updates a ProfilingGroupProps$Builder instance using the provided configuration.
  The function takes the ProfilingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
"
  [^ProfilingGroupProps$Builder builder id config]
  (when-some [data (compute-platform config id :compute-platform)]
    (. builder computePlatform data))
  (when-some [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (.build builder))


(defn profiling-group-props-builder
  "Creates a  `ProfilingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[profiling-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (profiling-group-props-builder> (new ProfilingGroupProps$Builder) id config))