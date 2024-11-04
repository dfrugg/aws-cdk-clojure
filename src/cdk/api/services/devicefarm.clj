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


(defn cfn-device-pool-builder
  "The cfn-device-pool-builder function buildes out new instances of 
CfnDevicePool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxDevices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-devices` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDevicePool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-devices)]
      (. builder maxDevices data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-arn)]
      (. builder projectArn data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-pool-props-builder
  "The cfn-device-pool-props-builder function buildes out new instances of 
CfnDevicePoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `maxDevices` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-devices` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-arn` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDevicePoolProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :max-devices)]
      (. builder maxDevices data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-arn)]
      (. builder projectArn data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-pool-rule-property-builder
  "The cfn-device-pool-rule-property-builder function buildes out new instances of 
CfnDevicePool$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDevicePool$RuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :operator)]
      (. builder operator data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-instance-profile-builder
  "The cfn-instance-profile-builder function buildes out new instances of 
CfnInstanceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `excludeAppPackagesFromCleanup` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-app-packages-from-cleanup` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageCleanup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:package-cleanup` |
| `rebootAfterUse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reboot-after-use` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :exclude-app-packages-from-cleanup)]
      (. builder excludeAppPackagesFromCleanup data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :package-cleanup)]
      (. builder packageCleanup data))
    (when-let [data (lookup-entry config id :reboot-after-use)]
      (. builder rebootAfterUse data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-profile-props-builder
  "The cfn-instance-profile-props-builder function buildes out new instances of 
CfnInstanceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `excludeAppPackagesFromCleanup` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-app-packages-from-cleanup` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packageCleanup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:package-cleanup` |
| `rebootAfterUse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reboot-after-use` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :exclude-app-packages-from-cleanup)]
      (. builder excludeAppPackagesFromCleanup data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :package-cleanup)]
      (. builder packageCleanup data))
    (when-let [data (lookup-entry config id :reboot-after-use)]
      (. builder rebootAfterUse data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-profile-builder
  "The cfn-network-profile-builder function buildes out new instances of 
CfnNetworkProfile$Builder using the provided configuration.  Each field is set as follows:

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
| `uplinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-loss-percent` |"
  [stack id config]
  (let [builder (CfnNetworkProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :downlink-bandwidth-bits)]
      (. builder downlinkBandwidthBits data))
    (when-let [data (lookup-entry config id :downlink-delay-ms)]
      (. builder downlinkDelayMs data))
    (when-let [data (lookup-entry config id :downlink-jitter-ms)]
      (. builder downlinkJitterMs data))
    (when-let [data (lookup-entry config id :downlink-loss-percent)]
      (. builder downlinkLossPercent data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-arn)]
      (. builder projectArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uplink-bandwidth-bits)]
      (. builder uplinkBandwidthBits data))
    (when-let [data (lookup-entry config id :uplink-delay-ms)]
      (. builder uplinkDelayMs data))
    (when-let [data (lookup-entry config id :uplink-jitter-ms)]
      (. builder uplinkJitterMs data))
    (when-let [data (lookup-entry config id :uplink-loss-percent)]
      (. builder uplinkLossPercent data))
    (.build builder)))


(defn cfn-network-profile-props-builder
  "The cfn-network-profile-props-builder function buildes out new instances of 
CfnNetworkProfileProps$Builder using the provided configuration.  Each field is set as follows:

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
| `uplinkLossPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uplink-loss-percent` |"
  [stack id config]
  (let [builder (CfnNetworkProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :downlink-bandwidth-bits)]
      (. builder downlinkBandwidthBits data))
    (when-let [data (lookup-entry config id :downlink-delay-ms)]
      (. builder downlinkDelayMs data))
    (when-let [data (lookup-entry config id :downlink-jitter-ms)]
      (. builder downlinkJitterMs data))
    (when-let [data (lookup-entry config id :downlink-loss-percent)]
      (. builder downlinkLossPercent data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-arn)]
      (. builder projectArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uplink-bandwidth-bits)]
      (. builder uplinkBandwidthBits data))
    (when-let [data (lookup-entry config id :uplink-delay-ms)]
      (. builder uplinkDelayMs data))
    (when-let [data (lookup-entry config id :uplink-jitter-ms)]
      (. builder uplinkJitterMs data))
    (when-let [data (lookup-entry config id :uplink-loss-percent)]
      (. builder uplinkLossPercent data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultJobTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-job-timeout-minutes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.devicefarm.CfnProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-job-timeout-minutes)]
      (. builder defaultJobTimeoutMinutes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultJobTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-job-timeout-minutes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :default-job-timeout-minutes)]
      (. builder defaultJobTimeoutMinutes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-project-vpc-config-property-builder
  "The cfn-project-vpc-config-property-builder function buildes out new instances of 
CfnProject$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnProject$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-test-grid-project-builder
  "The cfn-test-grid-project-builder function buildes out new instances of 
CfnTestGridProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.devicefarm.CfnTestGridProject$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnTestGridProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-test-grid-project-props-builder
  "The cfn-test-grid-project-props-builder function buildes out new instances of 
CfnTestGridProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnTestGridProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-test-grid-project-vpc-config-property-builder
  "The cfn-test-grid-project-vpc-config-property-builder function buildes out new instances of 
CfnTestGridProject$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTestGridProject$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpce-configuration-builder
  "The cfn-vpce-configuration-builder function buildes out new instances of 
CfnVPCEConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-dns-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpceConfigurationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-description` |
| `vpceConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-name` |
| `vpceServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-service-name` |"
  [stack id config]
  (let [builder (CfnVPCEConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :service-dns-name)]
      (. builder serviceDnsName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpce-configuration-description)]
      (. builder vpceConfigurationDescription data))
    (when-let [data (lookup-entry config id :vpce-configuration-name)]
      (. builder vpceConfigurationName data))
    (when-let [data (lookup-entry config id :vpce-service-name)]
      (. builder vpceServiceName data))
    (.build builder)))


(defn cfn-vpce-configuration-props-builder
  "The cfn-vpce-configuration-props-builder function buildes out new instances of 
CfnVPCEConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-dns-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpceConfigurationDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-description` |
| `vpceConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-configuration-name` |
| `vpceServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-service-name` |"
  [stack id config]
  (let [builder (CfnVPCEConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :service-dns-name)]
      (. builder serviceDnsName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpce-configuration-description)]
      (. builder vpceConfigurationDescription data))
    (when-let [data (lookup-entry config id :vpce-configuration-name)]
      (. builder vpceConfigurationName data))
    (when-let [data (lookup-entry config id :vpce-service-name)]
      (. builder vpceServiceName data))
    (.build builder)))