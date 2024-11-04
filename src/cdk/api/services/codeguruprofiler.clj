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


(defn cfn-profiling-group-agent-permissions-property-builder
  "The cfn-profiling-group-agent-permissions-property-builder function buildes out new instances of 
CfnProfilingGroup$AgentPermissionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |"
  [stack id config]
  (let [builder (CfnProfilingGroup$AgentPermissionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (.build builder)))


(defn cfn-profiling-group-builder
  "The cfn-profiling-group-builder function buildes out new instances of 
CfnProfilingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentPermissions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:agent-permissions` |
| `anomalyDetectionNotificationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anomaly-detection-notification-configuration` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfilingGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-profiling-group-channel-property-builder
  "The cfn-profiling-group-channel-property-builder function buildes out new instances of 
CfnProfilingGroup$ChannelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-uri` |"
  [stack id config]
  (let [builder (CfnProfilingGroup$ChannelProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-id)]
      (. builder channelId data))
    (when-let [data (lookup-entry config id :channel-uri)]
      (. builder channelUri data))
    (.build builder)))


(defn cfn-profiling-group-props-builder
  "The cfn-profiling-group-props-builder function buildes out new instances of 
CfnProfilingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentPermissions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:agent-permissions` |
| `anomalyDetectionNotificationConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:anomaly-detection-notification-configuration` |
| `computePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProfilingGroupProps$Builder.)]
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
    (.build builder)))


(defn profiling-group-builder
  "The profiling-group-builder function buildes out new instances of 
ProfilingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |"
  [stack id config]
  (let [builder (ProfilingGroup$Builder/create stack id)]
    (when-let [data (compute-platform config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :profiling-group-name)]
      (. builder profilingGroupName data))
    (.build builder)))


(defn profiling-group-props-builder
  "The profiling-group-props-builder function buildes out new instances of 
ProfilingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computePlatform` | software.amazon.awscdk.services.codeguruprofiler.ComputePlatform | [[cdk.api.services.codeguruprofiler/compute-platform]] | `:compute-platform` |
| `profilingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profiling-group-name` |"
  [stack id config]
  (let [builder (ProfilingGroupProps$Builder.)]
    (when-let [data (compute-platform config id :compute-platform)]
      (. builder computePlatform data))
    (when-let [data (lookup-entry config id :profiling-group-name)]
      (. builder profilingGroupName data))
    (.build builder)))