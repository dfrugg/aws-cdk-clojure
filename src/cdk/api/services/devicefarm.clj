(ns cdk.api.services.devicefarm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.devicefarm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.devicefarm CfnDevicePool$Builder
                                                       CfnDevicePool$RuleProperty$Builder
                                                       CfnDevicePoolProps$Builder
                                                       CfnInstanceProfile$Builder
                                                       CfnInstanceProfileProps$Builder
                                                       CfnNetworkProfile$Builder
                                                       CfnNetworkProfileProps$Builder
                                                       CfnProject$Builder
                                                       CfnProject$VpcConfigProperty$Builder
                                                       CfnProjectProps$Builder
                                                       CfnTestGridProject$Builder
                                                       CfnTestGridProject$VpcConfigProperty$Builder
                                                       CfnTestGridProjectProps$Builder
                                                       CfnVPCEConfiguration$Builder
                                                       CfnVPCEConfigurationProps$Builder]))


(defn cfn-device-pool-builder>
  "The cfn-device-pool-builder> function updates a CfnDevicePool$Builder instance using the provided configuration.
  The function takes the CfnDevicePool$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxDevices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-devices` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDevicePool$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-devices)]
    (. builder maxDevices data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :project-arn)]
    (. builder projectArn data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-pool-builder
  "Creates a  `CfnDevicePool$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-device-pool-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-device-pool-builder> (CfnDevicePool$Builder/create scope (name id)) id config))


(defn cfn-device-pool-props-builder>
  "The cfn-device-pool-props-builder> function updates a CfnDevicePoolProps$Builder instance using the provided configuration.
  The function takes the CfnDevicePoolProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxDevices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-devices` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDevicePoolProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :max-devices)]
    (. builder maxDevices data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :project-arn)]
    (. builder projectArn data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-pool-props-builder
  "Creates a  `CfnDevicePoolProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-device-pool-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-device-pool-props-builder> (new CfnDevicePoolProps$Builder) id config))


(defn cfn-device-pool-rule-property-builder>
  "The cfn-device-pool-rule-property-builder> function updates a CfnDevicePool$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnDevicePool$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDevicePool$RuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :operator)]
    (. builder operator data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-device-pool-rule-property-builder
  "Creates a  `CfnDevicePool$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-device-pool-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-device-pool-rule-property-builder> (new CfnDevicePool$RuleProperty$Builder) id config))


(defn cfn-instance-profile-builder>
  "The cfn-instance-profile-builder> function updates a CfnInstanceProfile$Builder instance using the provided configuration.
  The function takes the CfnInstanceProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `excludeAppPackagesFromCleanup` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-app-packages-from-cleanup` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageCleanup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:package-cleanup` |
| `rebootAfterUse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reboot-after-use` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstanceProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :exclude-app-packages-from-cleanup)]
    (. builder excludeAppPackagesFromCleanup data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :package-cleanup)]
    (. builder packageCleanup data))
  (when-some [data (lookup-entry config id :reboot-after-use)]
    (. builder rebootAfterUse data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-profile-builder
  "Creates a  `CfnInstanceProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-instance-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-profile-builder> (CfnInstanceProfile$Builder/create scope (name id)) id config))


(defn cfn-instance-profile-props-builder>
  "The cfn-instance-profile-props-builder> function updates a CfnInstanceProfileProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `excludeAppPackagesFromCleanup` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-app-packages-from-cleanup` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageCleanup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:package-cleanup` |
| `rebootAfterUse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reboot-after-use` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstanceProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :exclude-app-packages-from-cleanup)]
    (. builder excludeAppPackagesFromCleanup data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :package-cleanup)]
    (. builder packageCleanup data))
  (when-some [data (lookup-entry config id :reboot-after-use)]
    (. builder rebootAfterUse data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-profile-props-builder
  "Creates a  `CfnInstanceProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-profile-props-builder> (new CfnInstanceProfileProps$Builder) id config))


(defn cfn-network-profile-builder>
  "The cfn-network-profile-builder> function updates a CfnNetworkProfile$Builder instance using the provided configuration.
  The function takes the CfnNetworkProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `downlinkBandwidthBits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-bandwidth-bits` |
| `downlinkDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-delay-ms` |
| `downlinkJitterMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-jitter-ms` |
| `downlinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-loss-percent` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uplinkBandwidthBits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-bandwidth-bits` |
| `uplinkDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-delay-ms` |
| `uplinkJitterMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-jitter-ms` |
| `uplinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-loss-percent` |
"
  [^CfnNetworkProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :downlink-bandwidth-bits)]
    (. builder downlinkBandwidthBits data))
  (when-some [data (lookup-entry config id :downlink-delay-ms)]
    (. builder downlinkDelayMs data))
  (when-some [data (lookup-entry config id :downlink-jitter-ms)]
    (. builder downlinkJitterMs data))
  (when-some [data (lookup-entry config id :downlink-loss-percent)]
    (. builder downlinkLossPercent data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :project-arn)]
    (. builder projectArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uplink-bandwidth-bits)]
    (. builder uplinkBandwidthBits data))
  (when-some [data (lookup-entry config id :uplink-delay-ms)]
    (. builder uplinkDelayMs data))
  (when-some [data (lookup-entry config id :uplink-jitter-ms)]
    (. builder uplinkJitterMs data))
  (when-some [data (lookup-entry config id :uplink-loss-percent)]
    (. builder uplinkLossPercent data))
  (.build builder))


(defn cfn-network-profile-builder
  "Creates a  `CfnNetworkProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-network-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-network-profile-builder> (CfnNetworkProfile$Builder/create scope (name id)) id config))


(defn cfn-network-profile-props-builder>
  "The cfn-network-profile-props-builder> function updates a CfnNetworkProfileProps$Builder instance using the provided configuration.
  The function takes the CfnNetworkProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `downlinkBandwidthBits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-bandwidth-bits` |
| `downlinkDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-delay-ms` |
| `downlinkJitterMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-jitter-ms` |
| `downlinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:downlink-loss-percent` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uplinkBandwidthBits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-bandwidth-bits` |
| `uplinkDelayMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-delay-ms` |
| `uplinkJitterMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-jitter-ms` |
| `uplinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-loss-percent` |
"
  [^CfnNetworkProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :downlink-bandwidth-bits)]
    (. builder downlinkBandwidthBits data))
  (when-some [data (lookup-entry config id :downlink-delay-ms)]
    (. builder downlinkDelayMs data))
  (when-some [data (lookup-entry config id :downlink-jitter-ms)]
    (. builder downlinkJitterMs data))
  (when-some [data (lookup-entry config id :downlink-loss-percent)]
    (. builder downlinkLossPercent data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :project-arn)]
    (. builder projectArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uplink-bandwidth-bits)]
    (. builder uplinkBandwidthBits data))
  (when-some [data (lookup-entry config id :uplink-delay-ms)]
    (. builder uplinkDelayMs data))
  (when-some [data (lookup-entry config id :uplink-jitter-ms)]
    (. builder uplinkJitterMs data))
  (when-some [data (lookup-entry config id :uplink-loss-percent)]
    (. builder uplinkLossPercent data))
  (.build builder))


(defn cfn-network-profile-props-builder
  "Creates a  `CfnNetworkProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-network-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-network-profile-props-builder> (new CfnNetworkProfileProps$Builder) id config))


(defn cfn-project-builder>
  "The cfn-project-builder> function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultJobTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-job-timeout-minutes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.devicefarm.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnProject$Builder builder id config]
  (when-some [data (lookup-entry config id :default-job-timeout-minutes)]
    (. builder defaultJobTimeoutMinutes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-project-builder> (CfnProject$Builder/create scope (name id)) id config))


(defn cfn-project-props-builder>
  "The cfn-project-props-builder> function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultJobTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-job-timeout-minutes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-job-timeout-minutes)]
    (. builder defaultJobTimeoutMinutes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-props-builder> (new CfnProjectProps$Builder) id config))


(defn cfn-project-vpc-config-property-builder>
  "The cfn-project-vpc-config-property-builder> function updates a CfnProject$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnProject$VpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-project-vpc-config-property-builder
  "Creates a  `CfnProject$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-vpc-config-property-builder> (new CfnProject$VpcConfigProperty$Builder) id config))


(defn cfn-test-grid-project-builder>
  "The cfn-test-grid-project-builder> function updates a CfnTestGridProject$Builder instance using the provided configuration.
  The function takes the CfnTestGridProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.devicefarm.CfnTestGridProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnTestGridProject$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-test-grid-project-builder
  "Creates a  `CfnTestGridProject$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-test-grid-project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-test-grid-project-builder> (CfnTestGridProject$Builder/create scope (name id)) id config))


(defn cfn-test-grid-project-props-builder>
  "The cfn-test-grid-project-props-builder> function updates a CfnTestGridProjectProps$Builder instance using the provided configuration.
  The function takes the CfnTestGridProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnTestGridProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-test-grid-project-props-builder
  "Creates a  `CfnTestGridProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-test-grid-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-test-grid-project-props-builder> (new CfnTestGridProjectProps$Builder) id config))


(defn cfn-test-grid-project-vpc-config-property-builder>
  "The cfn-test-grid-project-vpc-config-property-builder> function updates a CfnTestGridProject$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTestGridProject$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnTestGridProject$VpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-test-grid-project-vpc-config-property-builder
  "Creates a  `CfnTestGridProject$VpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-test-grid-project-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-test-grid-project-vpc-config-property-builder> (new CfnTestGridProject$VpcConfigProperty$Builder) id config))


(defn cfn-vpce-configuration-builder>
  "The cfn-vpce-configuration-builder> function updates a CfnVPCEConfiguration$Builder instance using the provided configuration.
  The function takes the CfnVPCEConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-dns-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpceConfigurationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-description` |
| `vpceConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-name` |
| `vpceServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-service-name` |
"
  [^CfnVPCEConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :service-dns-name)]
    (. builder serviceDnsName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpce-configuration-description)]
    (. builder vpceConfigurationDescription data))
  (when-some [data (lookup-entry config id :vpce-configuration-name)]
    (. builder vpceConfigurationName data))
  (when-some [data (lookup-entry config id :vpce-service-name)]
    (. builder vpceServiceName data))
  (.build builder))


(defn cfn-vpce-configuration-builder
  "Creates a  `CfnVPCEConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-vpce-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-vpce-configuration-builder> (CfnVPCEConfiguration$Builder/create scope (name id)) id config))


(defn cfn-vpce-configuration-props-builder>
  "The cfn-vpce-configuration-props-builder> function updates a CfnVPCEConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnVPCEConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-dns-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpceConfigurationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-description` |
| `vpceConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-name` |
| `vpceServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-service-name` |
"
  [^CfnVPCEConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :service-dns-name)]
    (. builder serviceDnsName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpce-configuration-description)]
    (. builder vpceConfigurationDescription data))
  (when-some [data (lookup-entry config id :vpce-configuration-name)]
    (. builder vpceConfigurationName data))
  (when-some [data (lookup-entry config id :vpce-service-name)]
    (. builder vpceServiceName data))
  (.build builder))


(defn cfn-vpce-configuration-props-builder
  "Creates a  `CfnVPCEConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpce-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpce-configuration-props-builder> (new CfnVPCEConfigurationProps$Builder) id config))