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


(defn build-cfn-profiling-group-agent-permissions-property-builder
  "The build-cfn-profiling-group-agent-permissions-property-builder function updates a CfnProfilingGroup$AgentPermissionsProperty$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroup$AgentPermissionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
"
  [^CfnProfilingGroup$AgentPermissionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :principals)]
    (. builder principals data))
  (.build builder))


(defn build-cfn-profiling-group-builder
  "The build-cfn-profiling-group-builder function updates a CfnProfilingGroup$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :agent-permissions)]
    (. builder agentPermissions data))
  (when-let [data (lookup-entry config id :anomaly-detection-notification-configuration)]
    (. builder anomalyDetectionNotificationConfiguration data))
  (when-let [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-let [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-profiling-group-channel-property-builder
  "The build-cfn-profiling-group-channel-property-builder function updates a CfnProfilingGroup$ChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnProfilingGroup$ChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-uri` |
"
  [^CfnProfilingGroup$ChannelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :channel-uri)]
    (. builder channelUri data))
  (.build builder))


(defn build-cfn-profiling-group-props-builder
  "The build-cfn-profiling-group-props-builder function updates a CfnProfilingGroupProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :agent-permissions)]
    (. builder agentPermissions data))
  (when-let [data (lookup-entry config id :anomaly-detection-notification-configuration)]
    (. builder anomalyDetectionNotificationConfiguration data))
  (when-let [data (lookup-entry config id :compute-platform)]
    (. builder computePlatform data))
  (when-let [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-profiling-group-builder
  "The build-profiling-group-builder function updates a ProfilingGroup$Builder instance using the provided configuration.
  The function takes the ProfilingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
"
  [^ProfilingGroup$Builder builder id config]
  (when-let [data (compute-platform config id :compute-platform)]
    (. builder computePlatform data))
  (when-let [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (.build builder))


(defn build-profiling-group-props-builder
  "The build-profiling-group-props-builder function updates a ProfilingGroupProps$Builder instance using the provided configuration.
  The function takes the ProfilingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
"
  [^ProfilingGroupProps$Builder builder id config]
  (when-let [data (compute-platform config id :compute-platform)]
    (. builder computePlatform data))
  (when-let [data (lookup-entry config id :profiling-group-name)]
    (. builder profilingGroupName data))
  (.build builder))