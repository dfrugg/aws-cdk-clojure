(ns cdk.api.services.eks
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.eks package. "
  (:require [cdk.api.services.autoscaling :refer [monitoring]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.eks AlbController$Builder
                                                AlbControllerOptions$Builder
                                                AlbControllerProps$Builder
                                                AlbScheme
                                                AutoScalingGroupCapacityOptions$Builder
                                                AutoScalingGroupOptions$Builder
                                                AwsAuth$Builder
                                                AwsAuthMapping$Builder
                                                AwsAuthProps$Builder
                                                BootstrapOptions$Builder
                                                CapacityType
                                                CfnAccessEntry$AccessPolicyProperty$Builder
                                                CfnAccessEntry$AccessScopeProperty$Builder
                                                CfnAccessEntry$Builder
                                                CfnAccessEntryProps$Builder
                                                CfnAddon$Builder
                                                CfnAddonProps$Builder
                                                CfnCluster$AccessConfigProperty$Builder
                                                CfnCluster$Builder
                                                CfnCluster$ClusterLoggingProperty$Builder
                                                CfnCluster$ControlPlanePlacementProperty$Builder
                                                CfnCluster$EncryptionConfigProperty$Builder
                                                CfnCluster$KubernetesNetworkConfigProperty$Builder
                                                CfnCluster$LoggingProperty$Builder
                                                CfnCluster$LoggingTypeConfigProperty$Builder
                                                CfnCluster$OutpostConfigProperty$Builder
                                                CfnCluster$ProviderProperty$Builder
                                                CfnCluster$ResourcesVpcConfigProperty$Builder
                                                CfnClusterProps$Builder
                                                CfnFargateProfile$Builder
                                                CfnFargateProfile$LabelProperty$Builder
                                                CfnFargateProfile$SelectorProperty$Builder
                                                CfnFargateProfileProps$Builder
                                                CfnIdentityProviderConfig$Builder
                                                CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder
                                                CfnIdentityProviderConfig$RequiredClaimProperty$Builder
                                                CfnIdentityProviderConfigProps$Builder
                                                CfnNodegroup$Builder
                                                CfnNodegroup$LaunchTemplateSpecificationProperty$Builder
                                                CfnNodegroup$RemoteAccessProperty$Builder
                                                CfnNodegroup$ScalingConfigProperty$Builder
                                                CfnNodegroup$TaintProperty$Builder
                                                CfnNodegroup$UpdateConfigProperty$Builder
                                                CfnNodegroupProps$Builder
                                                CfnPodIdentityAssociation$Builder
                                                CfnPodIdentityAssociationProps$Builder
                                                Cluster$Builder
                                                ClusterAttributes$Builder
                                                ClusterLoggingTypes
                                                ClusterOptions$Builder
                                                ClusterProps$Builder
                                                CommonClusterOptions$Builder
                                                CoreDnsComputeType
                                                CpuArch
                                                DefaultCapacityType
                                                EksOptimizedImage$Builder
                                                EksOptimizedImageProps$Builder
                                                FargateCluster$Builder
                                                FargateClusterProps$Builder
                                                FargateProfile$Builder
                                                FargateProfileOptions$Builder
                                                FargateProfileProps$Builder
                                                HelmChart$Builder
                                                HelmChartOptions$Builder
                                                HelmChartProps$Builder
                                                IngressLoadBalancerAddressOptions$Builder
                                                IpFamily
                                                KubectlProvider$Builder
                                                KubectlProviderAttributes$Builder
                                                KubectlProviderProps$Builder
                                                KubernetesManifest$Builder
                                                KubernetesManifestOptions$Builder
                                                KubernetesManifestProps$Builder
                                                KubernetesObjectValue$Builder
                                                KubernetesObjectValueProps$Builder
                                                KubernetesPatch$Builder
                                                KubernetesPatchProps$Builder
                                                LaunchTemplateSpec$Builder
                                                MachineImageType
                                                NodeType
                                                Nodegroup$Builder
                                                NodegroupAmiType
                                                NodegroupOptions$Builder
                                                NodegroupProps$Builder
                                                NodegroupRemoteAccess$Builder
                                                OpenIdConnectProvider$Builder
                                                OpenIdConnectProviderProps$Builder
                                                PatchType
                                                Selector$Builder
                                                ServiceAccount$Builder
                                                ServiceAccountOptions$Builder
                                                ServiceAccountProps$Builder
                                                ServiceLoadBalancerAddressOptions$Builder
                                                TaintEffect
                                                TaintSpec$Builder]))


(defn alb-scheme
  "The `alb-scheme` function data interprets values in the provided config data into a 
`AlbScheme` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AlbScheme` - the value is returned.
* is `:internal` - `AlbScheme/INTERNAL` is returned
* is `:internet-facing` - `AlbScheme/INTERNET_FACING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AlbScheme data) data
      (= :internal data) AlbScheme/INTERNAL
      (= :internet-facing data) AlbScheme/INTERNET_FACING)))


(defn capacity-type
  "The `capacity-type` function data interprets values in the provided config data into a 
`CapacityType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CapacityType` - the value is returned.
* is `:on-demand` - `CapacityType/ON_DEMAND` is returned
* is `:spot` - `CapacityType/SPOT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CapacityType data) data
      (= :on-demand data) CapacityType/ON_DEMAND
      (= :spot data) CapacityType/SPOT)))


(defn cluster-logging-types
  "The `cluster-logging-types` function data interprets values in the provided config data into a 
`ClusterLoggingTypes` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ClusterLoggingTypes` - the value is returned.
* is `:authenticator` - `ClusterLoggingTypes/AUTHENTICATOR` is returned
* is `:audit` - `ClusterLoggingTypes/AUDIT` is returned
* is `:api` - `ClusterLoggingTypes/API` is returned
* is `:scheduler` - `ClusterLoggingTypes/SCHEDULER` is returned
* is `:controller-manager` - `ClusterLoggingTypes/CONTROLLER_MANAGER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ClusterLoggingTypes data) data
      (= :authenticator data) ClusterLoggingTypes/AUTHENTICATOR
      (= :audit data) ClusterLoggingTypes/AUDIT
      (= :api data) ClusterLoggingTypes/API
      (= :scheduler data) ClusterLoggingTypes/SCHEDULER
      (= :controller-manager data) ClusterLoggingTypes/CONTROLLER_MANAGER)))


(defn core-dns-compute-type
  "The `core-dns-compute-type` function data interprets values in the provided config data into a 
`CoreDnsComputeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CoreDnsComputeType` - the value is returned.
* is `:fargate` - `CoreDnsComputeType/FARGATE` is returned
* is `:ec2` - `CoreDnsComputeType/EC2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CoreDnsComputeType data) data
      (= :fargate data) CoreDnsComputeType/FARGATE
      (= :ec2 data) CoreDnsComputeType/EC2)))


(defn cpu-arch
  "The `cpu-arch` function data interprets values in the provided config data into a 
`CpuArch` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CpuArch` - the value is returned.
* is `:x86-64` - `CpuArch/X86_64` is returned
* is `:arm-64` - `CpuArch/ARM_64` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CpuArch data) data
      (= :x86-64 data) CpuArch/X86_64
      (= :arm-64 data) CpuArch/ARM_64)))


(defn default-capacity-type
  "The `default-capacity-type` function data interprets values in the provided config data into a 
`DefaultCapacityType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DefaultCapacityType` - the value is returned.
* is `:ec2` - `DefaultCapacityType/EC2` is returned
* is `:nodegroup` - `DefaultCapacityType/NODEGROUP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DefaultCapacityType data) data
      (= :ec2 data) DefaultCapacityType/EC2
      (= :nodegroup data) DefaultCapacityType/NODEGROUP)))


(defn ip-family
  "The `ip-family` function data interprets values in the provided config data into a 
`IpFamily` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpFamily` - the value is returned.
* is `:ip-v4` - `IpFamily/IP_V4` is returned
* is `:ip-v6` - `IpFamily/IP_V6` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpFamily data) data
      (= :ip-v4 data) IpFamily/IP_V4
      (= :ip-v6 data) IpFamily/IP_V6)))


(defn machine-image-type
  "The `machine-image-type` function data interprets values in the provided config data into a 
`MachineImageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MachineImageType` - the value is returned.
* is `:amazon-linux-2` - `MachineImageType/AMAZON_LINUX_2` is returned
* is `:bottlerocket` - `MachineImageType/BOTTLEROCKET` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MachineImageType data) data
      (= :amazon-linux-2 data) MachineImageType/AMAZON_LINUX_2
      (= :bottlerocket data) MachineImageType/BOTTLEROCKET)))


(defn node-type
  "The `node-type` function data interprets values in the provided config data into a 
`NodeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NodeType` - the value is returned.
* is `:trainium` - `NodeType/TRAINIUM` is returned
* is `:gpu` - `NodeType/GPU` is returned
* is `:inferentia` - `NodeType/INFERENTIA` is returned
* is `:standard` - `NodeType/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NodeType data) data
      (= :trainium data) NodeType/TRAINIUM
      (= :gpu data) NodeType/GPU
      (= :inferentia data) NodeType/INFERENTIA
      (= :standard data) NodeType/STANDARD)))


(defn nodegroup-ami-type
  "The `nodegroup-ami-type` function data interprets values in the provided config data into a 
`NodegroupAmiType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NodegroupAmiType` - the value is returned.
* is `:windows-core-2019-x86-64` - `NodegroupAmiType/WINDOWS_CORE_2019_X86_64` is returned
* is `:bottlerocket-arm-64` - `NodegroupAmiType/BOTTLEROCKET_ARM_64` is returned
* is `:bottlerocket-x86-64-nvidia` - `NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA` is returned
* is `:windows-full-2022-x86-64` - `NodegroupAmiType/WINDOWS_FULL_2022_X86_64` is returned
* is `:windows-core-2022-x86-64` - `NodegroupAmiType/WINDOWS_CORE_2022_X86_64` is returned
* is `:al2023-arm-64-standard` - `NodegroupAmiType/AL2023_ARM_64_STANDARD` is returned
* is `:bottlerocket-x86-64` - `NodegroupAmiType/BOTTLEROCKET_X86_64` is returned
* is `:al2-x86-64` - `NodegroupAmiType/AL2_X86_64` is returned
* is `:al2023-x86-64-standard` - `NodegroupAmiType/AL2023_X86_64_STANDARD` is returned
* is `:windows-full-2019-x86-64` - `NodegroupAmiType/WINDOWS_FULL_2019_X86_64` is returned
* is `:al2-x86-64-gpu` - `NodegroupAmiType/AL2_X86_64_GPU` is returned
* is `:bottlerocket-arm-64-nvidia` - `NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA` is returned
* is `:al2-arm-64` - `NodegroupAmiType/AL2_ARM_64` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NodegroupAmiType data) data
      (= :windows-core-2019-x86-64 data) NodegroupAmiType/WINDOWS_CORE_2019_X86_64
      (= :bottlerocket-arm-64 data) NodegroupAmiType/BOTTLEROCKET_ARM_64
      (= :bottlerocket-x86-64-nvidia data) NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA
      (= :windows-full-2022-x86-64 data) NodegroupAmiType/WINDOWS_FULL_2022_X86_64
      (= :windows-core-2022-x86-64 data) NodegroupAmiType/WINDOWS_CORE_2022_X86_64
      (= :al2023-arm-64-standard data) NodegroupAmiType/AL2023_ARM_64_STANDARD
      (= :bottlerocket-x86-64 data) NodegroupAmiType/BOTTLEROCKET_X86_64
      (= :al2-x86-64 data) NodegroupAmiType/AL2_X86_64
      (= :al2023-x86-64-standard data) NodegroupAmiType/AL2023_X86_64_STANDARD
      (= :windows-full-2019-x86-64 data) NodegroupAmiType/WINDOWS_FULL_2019_X86_64
      (= :al2-x86-64-gpu data) NodegroupAmiType/AL2_X86_64_GPU
      (= :bottlerocket-arm-64-nvidia data) NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA
      (= :al2-arm-64 data) NodegroupAmiType/AL2_ARM_64)))


(defn patch-type
  "The `patch-type` function data interprets values in the provided config data into a 
`PatchType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PatchType` - the value is returned.
* is `:strategic` - `PatchType/STRATEGIC` is returned
* is `:json` - `PatchType/JSON` is returned
* is `:merge` - `PatchType/MERGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PatchType data) data
      (= :strategic data) PatchType/STRATEGIC
      (= :json data) PatchType/JSON
      (= :merge data) PatchType/MERGE)))


(defn taint-effect
  "The `taint-effect` function data interprets values in the provided config data into a 
`TaintEffect` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TaintEffect` - the value is returned.
* is `:prefer-no-schedule` - `TaintEffect/PREFER_NO_SCHEDULE` is returned
* is `:no-execute` - `TaintEffect/NO_EXECUTE` is returned
* is `:no-schedule` - `TaintEffect/NO_SCHEDULE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TaintEffect data) data
      (= :prefer-no-schedule data) TaintEffect/PREFER_NO_SCHEDULE
      (= :no-execute data) TaintEffect/NO_EXECUTE
      (= :no-schedule data) TaintEffect/NO_SCHEDULE)))


(defn alb-controller-builder>
  "The alb-controller-builder> function updates a AlbController$Builder instance using the provided configuration.
  The function takes the AlbController$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AlbController$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn alb-controller-builder
  "Creates a  `AlbController$Builder` instance using a scope and ID, applies the data configuration using the [[alb-controller-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (alb-controller-builder> (AlbController$Builder/create scope (name id)) id config))


(defn alb-controller-options-builder>
  "The alb-controller-options-builder> function updates a AlbControllerOptions$Builder instance using the provided configuration.
  The function takes the AlbControllerOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AlbControllerOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn alb-controller-options-builder
  "Creates a  `AlbControllerOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[alb-controller-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alb-controller-options-builder> (new AlbControllerOptions$Builder) id config))


(defn alb-controller-props-builder>
  "The alb-controller-props-builder> function updates a AlbControllerProps$Builder instance using the provided configuration.
  The function takes the AlbControllerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AlbControllerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn alb-controller-props-builder
  "Creates a  `AlbControllerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[alb-controller-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (alb-controller-props-builder> (new AlbControllerProps$Builder) id config))


(defn auto-scaling-group-capacity-options-builder>
  "The auto-scaling-group-capacity-options-builder> function updates a AutoScalingGroupCapacityOptions$Builder instance using the provided configuration.
  The function takes the AutoScalingGroupCapacityOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `bootstrapEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bootstrap-enabled` |
| `bootstrapOptions` | software.amazon.awscdk.services.eks.BootstrapOptions | [[cdk.support/lookup-entry]] | `:bootstrap-options` |
| `capacityRebalance` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `defaultInstanceWarmup` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-instance-warmup` |
| `desiredCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-capacity` |
| `groupMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:group-metrics` |
| `healthCheck` | software.amazon.awscdk.services.autoscaling.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `ignoreUnmodifiedSizeProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-unmodified-size-properties` |
| `instanceMonitoring` | software.amazon.awscdk.services.autoscaling.Monitoring | [[cdk.api.services.autoscaling/monitoring]] | `:instance-monitoring` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `machineImageType` | software.amazon.awscdk.services.eks.MachineImageType | [[cdk.api.services.eks/machine-image-type]] | `:machine-image-type` |
| `mapRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-role` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxInstanceLifetime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `newInstancesProtectedFromScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notifications` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications` |
| `signals` | software.amazon.awscdk.services.autoscaling.Signals | [[cdk.support/lookup-entry]] | `:signals` |
| `spotInterruptHandler` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-interrupt-handler` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `terminationPolicyCustomLambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:termination-policy-custom-lambda-function-arn` |
| `updatePolicy` | software.amazon.awscdk.services.autoscaling.UpdatePolicy | [[cdk.support/lookup-entry]] | `:update-policy` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^AutoScalingGroupCapacityOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-some [data (lookup-entry config id :associate-public-ip-address)]
    (. builder associatePublicIpAddress data))
  (when-some [data (lookup-entry config id :auto-scaling-group-name)]
    (. builder autoScalingGroupName data))
  (when-some [data (lookup-entry config id :block-devices)]
    (. builder blockDevices data))
  (when-some [data (lookup-entry config id :bootstrap-enabled)]
    (. builder bootstrapEnabled data))
  (when-some [data (lookup-entry config id :bootstrap-options)]
    (. builder bootstrapOptions data))
  (when-some [data (lookup-entry config id :capacity-rebalance)]
    (. builder capacityRebalance data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :default-instance-warmup)]
    (. builder defaultInstanceWarmup data))
  (when-some [data (lookup-entry config id :desired-capacity)]
    (. builder desiredCapacity data))
  (when-some [data (lookup-entry config id :group-metrics)]
    (. builder groupMetrics data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :ignore-unmodified-size-properties)]
    (. builder ignoreUnmodifiedSizeProperties data))
  (when-some [data (monitoring config id :instance-monitoring)]
    (. builder instanceMonitoring data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :key-name)]
    (. builder keyName data))
  (when-some [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-some [data (machine-image-type config id :machine-image-type)]
    (. builder machineImageType data))
  (when-some [data (lookup-entry config id :map-role)]
    (. builder mapRole data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :max-instance-lifetime)]
    (. builder maxInstanceLifetime data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-some [data (lookup-entry config id :new-instances-protected-from-scale-in)]
    (. builder newInstancesProtectedFromScaleIn data))
  (when-some [data (lookup-entry config id :notifications)]
    (. builder notifications data))
  (when-some [data (lookup-entry config id :signals)]
    (. builder signals data))
  (when-some [data (lookup-entry config id :spot-interrupt-handler)]
    (. builder spotInterruptHandler data))
  (when-some [data (lookup-entry config id :spot-price)]
    (. builder spotPrice data))
  (when-some [data (lookup-entry config id :ssm-session-permissions)]
    (. builder ssmSessionPermissions data))
  (when-some [data (lookup-entry config id :termination-policies)]
    (. builder terminationPolicies data))
  (when-some [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
    (. builder terminationPolicyCustomLambdaFunctionArn data))
  (when-some [data (lookup-entry config id :update-policy)]
    (. builder updatePolicy data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn auto-scaling-group-capacity-options-builder
  "Creates a  `AutoScalingGroupCapacityOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[auto-scaling-group-capacity-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (auto-scaling-group-capacity-options-builder> (new AutoScalingGroupCapacityOptions$Builder) id config))


(defn auto-scaling-group-options-builder>
  "The auto-scaling-group-options-builder> function updates a AutoScalingGroupOptions$Builder instance using the provided configuration.
  The function takes the AutoScalingGroupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bootstrap-enabled` |
| `bootstrapOptions` | software.amazon.awscdk.services.eks.BootstrapOptions | [[cdk.support/lookup-entry]] | `:bootstrap-options` |
| `machineImageType` | software.amazon.awscdk.services.eks.MachineImageType | [[cdk.api.services.eks/machine-image-type]] | `:machine-image-type` |
| `mapRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-role` |
| `spotInterruptHandler` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-interrupt-handler` |
"
  [^AutoScalingGroupOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :bootstrap-enabled)]
    (. builder bootstrapEnabled data))
  (when-some [data (lookup-entry config id :bootstrap-options)]
    (. builder bootstrapOptions data))
  (when-some [data (machine-image-type config id :machine-image-type)]
    (. builder machineImageType data))
  (when-some [data (lookup-entry config id :map-role)]
    (. builder mapRole data))
  (when-some [data (lookup-entry config id :spot-interrupt-handler)]
    (. builder spotInterruptHandler data))
  (.build builder))


(defn auto-scaling-group-options-builder
  "Creates a  `AutoScalingGroupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[auto-scaling-group-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (auto-scaling-group-options-builder> (new AutoScalingGroupOptions$Builder) id config))


(defn aws-auth-builder>
  "The aws-auth-builder> function updates a AwsAuth$Builder instance using the provided configuration.
  The function takes the AwsAuth$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
"
  [^AwsAuth$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (.build builder))


(defn aws-auth-builder
  "Creates a  `AwsAuth$Builder` instance using a scope and ID, applies the data configuration using the [[aws-auth-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (aws-auth-builder> (AwsAuth$Builder/create scope (name id)) id config))


(defn aws-auth-mapping-builder>
  "The aws-auth-mapping-builder> function updates a AwsAuthMapping$Builder instance using the provided configuration.
  The function takes the AwsAuthMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^AwsAuthMapping$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn aws-auth-mapping-builder
  "Creates a  `AwsAuthMapping$Builder` instance using a no-argument constructor, applies the data configuration using the [[aws-auth-mapping-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aws-auth-mapping-builder> (new AwsAuthMapping$Builder) id config))


(defn aws-auth-props-builder>
  "The aws-auth-props-builder> function updates a AwsAuthProps$Builder instance using the provided configuration.
  The function takes the AwsAuthProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
"
  [^AwsAuthProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (.build builder))


(defn aws-auth-props-builder
  "Creates a  `AwsAuthProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[aws-auth-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aws-auth-props-builder> (new AwsAuthProps$Builder) id config))


(defn bootstrap-options-builder>
  "The bootstrap-options-builder> function updates a BootstrapOptions$Builder instance using the provided configuration.
  The function takes the BootstrapOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-args` |
| `awsApiRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:aws-api-retry-attempts` |
| `dnsClusterIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-cluster-ip` |
| `dockerConfigJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-config-json` |
| `enableDockerBridge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-docker-bridge` |
| `kubeletExtraArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubelet-extra-args` |
| `useMaxPods` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-max-pods` |
"
  [^BootstrapOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-args)]
    (. builder additionalArgs data))
  (when-some [data (lookup-entry config id :aws-api-retry-attempts)]
    (. builder awsApiRetryAttempts data))
  (when-some [data (lookup-entry config id :dns-cluster-ip)]
    (. builder dnsClusterIp data))
  (when-some [data (lookup-entry config id :docker-config-json)]
    (. builder dockerConfigJson data))
  (when-some [data (lookup-entry config id :enable-docker-bridge)]
    (. builder enableDockerBridge data))
  (when-some [data (lookup-entry config id :kubelet-extra-args)]
    (. builder kubeletExtraArgs data))
  (when-some [data (lookup-entry config id :use-max-pods)]
    (. builder useMaxPods data))
  (.build builder))


(defn bootstrap-options-builder
  "Creates a  `BootstrapOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[bootstrap-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (bootstrap-options-builder> (new BootstrapOptions$Builder) id config))


(defn cfn-access-entry-access-policy-property-builder>
  "The cfn-access-entry-access-policy-property-builder> function updates a CfnAccessEntry$AccessPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessEntry$AccessPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessScope` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-scope` |
| `policyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-arn` |
"
  [^CfnAccessEntry$AccessPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-scope)]
    (. builder accessScope data))
  (when-some [data (lookup-entry config id :policy-arn)]
    (. builder policyArn data))
  (.build builder))


(defn cfn-access-entry-access-policy-property-builder
  "Creates a  `CfnAccessEntry$AccessPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-entry-access-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-entry-access-policy-property-builder> (new CfnAccessEntry$AccessPolicyProperty$Builder) id config))


(defn cfn-access-entry-access-scope-property-builder>
  "The cfn-access-entry-access-scope-property-builder> function updates a CfnAccessEntry$AccessScopeProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessEntry$AccessScopeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaces` | java.util.List | [[cdk.support/lookup-entry]] | `:namespaces` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAccessEntry$AccessScopeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :namespaces)]
    (. builder namespaces data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-access-entry-access-scope-property-builder
  "Creates a  `CfnAccessEntry$AccessScopeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-entry-access-scope-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-entry-access-scope-property-builder> (new CfnAccessEntry$AccessScopeProperty$Builder) id config))


(defn cfn-access-entry-builder>
  "The cfn-access-entry-builder> function updates a CfnAccessEntry$Builder instance using the provided configuration.
  The function takes the CfnAccessEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policies` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kubernetesGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:kubernetes-groups` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnAccessEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policies)]
    (. builder accessPolicies data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :kubernetes-groups)]
    (. builder kubernetesGroups data))
  (when-some [data (lookup-entry config id :principal-arn)]
    (. builder principalArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-access-entry-builder
  "Creates a  `CfnAccessEntry$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-access-entry-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-access-entry-builder> (CfnAccessEntry$Builder/create scope (name id)) id config))


(defn cfn-access-entry-props-builder>
  "The cfn-access-entry-props-builder> function updates a CfnAccessEntryProps$Builder instance using the provided configuration.
  The function takes the CfnAccessEntryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:access-policies` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kubernetesGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:kubernetes-groups` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnAccessEntryProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policies)]
    (. builder accessPolicies data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :kubernetes-groups)]
    (. builder kubernetesGroups data))
  (when-some [data (lookup-entry config id :principal-arn)]
    (. builder principalArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-access-entry-props-builder
  "Creates a  `CfnAccessEntryProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-entry-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-entry-props-builder> (new CfnAccessEntryProps$Builder) id config))


(defn cfn-addon-builder>
  "The cfn-addon-builder> function updates a CfnAddon$Builder instance using the provided configuration.
  The function takes the CfnAddon$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-name` |
| `addonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-version` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-values` |
| `preserveOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-on-delete` |
| `resolveConflicts` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolve-conflicts` |
| `serviceAccountRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAddon$Builder builder id config]
  (when-some [data (lookup-entry config id :addon-name)]
    (. builder addonName data))
  (when-some [data (lookup-entry config id :addon-version)]
    (. builder addonVersion data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :configuration-values)]
    (. builder configurationValues data))
  (when-some [data (lookup-entry config id :preserve-on-delete)]
    (. builder preserveOnDelete data))
  (when-some [data (lookup-entry config id :resolve-conflicts)]
    (. builder resolveConflicts data))
  (when-some [data (lookup-entry config id :service-account-role-arn)]
    (. builder serviceAccountRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-addon-builder
  "Creates a  `CfnAddon$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-addon-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-addon-builder> (CfnAddon$Builder/create scope (name id)) id config))


(defn cfn-addon-props-builder>
  "The cfn-addon-props-builder> function updates a CfnAddonProps$Builder instance using the provided configuration.
  The function takes the CfnAddonProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-name` |
| `addonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-version` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-values` |
| `preserveOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-on-delete` |
| `resolveConflicts` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolve-conflicts` |
| `serviceAccountRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAddonProps$Builder builder id config]
  (when-some [data (lookup-entry config id :addon-name)]
    (. builder addonName data))
  (when-some [data (lookup-entry config id :addon-version)]
    (. builder addonVersion data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :configuration-values)]
    (. builder configurationValues data))
  (when-some [data (lookup-entry config id :preserve-on-delete)]
    (. builder preserveOnDelete data))
  (when-some [data (lookup-entry config id :resolve-conflicts)]
    (. builder resolveConflicts data))
  (when-some [data (lookup-entry config id :service-account-role-arn)]
    (. builder serviceAccountRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-addon-props-builder
  "Creates a  `CfnAddonProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-addon-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-addon-props-builder> (new CfnAddonProps$Builder) id config))


(defn cfn-cluster-access-config-property-builder>
  "The cfn-cluster-access-config-property-builder> function updates a CfnCluster$AccessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$AccessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `bootstrapClusterCreatorAdminPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bootstrap-cluster-creator-admin-permissions` |
"
  [^CfnCluster$AccessConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-mode)]
    (. builder authenticationMode data))
  (when-some [data (lookup-entry config id :bootstrap-cluster-creator-admin-permissions)]
    (. builder bootstrapClusterCreatorAdminPermissions data))
  (.build builder))


(defn cfn-cluster-access-config-property-builder
  "Creates a  `CfnCluster$AccessConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-access-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-access-config-property-builder> (new CfnCluster$AccessConfigProperty$Builder) id config))


(defn cfn-cluster-builder>
  "The cfn-cluster-builder> function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfig` | software.amazon.awscdk.services.eks.CfnCluster$AccessConfigProperty | [[cdk.support/lookup-entry]] | `:access-config` |
| `encryptionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `kubernetesNetworkConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kubernetes-network-config` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostConfig` | software.amazon.awscdk.services.eks.CfnCluster$OutpostConfigProperty | [[cdk.support/lookup-entry]] | `:outpost-config` |
| `resourcesVpcConfig` | software.amazon.awscdk.services.eks.CfnCluster$ResourcesVpcConfigProperty | [[cdk.support/lookup-entry]] | `:resources-vpc-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :access-config)]
    (. builder accessConfig data))
  (when-some [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (when-some [data (lookup-entry config id :kubernetes-network-config)]
    (. builder kubernetesNetworkConfig data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outpost-config)]
    (. builder outpostConfig data))
  (when-some [data (lookup-entry config id :resources-vpc-config)]
    (. builder resourcesVpcConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-builder> (CfnCluster$Builder/create scope (name id)) id config))


(defn cfn-cluster-cluster-logging-property-builder>
  "The cfn-cluster-cluster-logging-property-builder> function updates a CfnCluster$ClusterLoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ClusterLoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled-types` |
"
  [^CfnCluster$ClusterLoggingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled-types)]
    (. builder enabledTypes data))
  (.build builder))


(defn cfn-cluster-cluster-logging-property-builder
  "Creates a  `CfnCluster$ClusterLoggingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-cluster-logging-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-cluster-logging-property-builder> (new CfnCluster$ClusterLoggingProperty$Builder) id config))


(defn cfn-cluster-control-plane-placement-property-builder>
  "The cfn-cluster-control-plane-placement-property-builder> function updates a CfnCluster$ControlPlanePlacementProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ControlPlanePlacementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
"
  [^CfnCluster$ControlPlanePlacementProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (.build builder))


(defn cfn-cluster-control-plane-placement-property-builder
  "Creates a  `CfnCluster$ControlPlanePlacementProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-control-plane-placement-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-control-plane-placement-property-builder> (new CfnCluster$ControlPlanePlacementProperty$Builder) id config))


(defn cfn-cluster-encryption-config-property-builder>
  "The cfn-cluster-encryption-config-property-builder> function updates a CfnCluster$EncryptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EncryptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provider` | software.amazon.awscdk.services.eks.CfnCluster$ProviderProperty | [[cdk.support/lookup-entry]] | `:provider` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
"
  [^CfnCluster$EncryptionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :provider)]
    (. builder provider data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (.build builder))


(defn cfn-cluster-encryption-config-property-builder
  "Creates a  `CfnCluster$EncryptionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-encryption-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-encryption-config-property-builder> (new CfnCluster$EncryptionConfigProperty$Builder) id config))


(defn cfn-cluster-kubernetes-network-config-property-builder>
  "The cfn-cluster-kubernetes-network-config-property-builder> function updates a CfnCluster$KubernetesNetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$KubernetesNetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-family` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `serviceIpv6Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv6-cidr` |
"
  [^CfnCluster$KubernetesNetworkConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :service-ipv6-cidr)]
    (. builder serviceIpv6Cidr data))
  (.build builder))


(defn cfn-cluster-kubernetes-network-config-property-builder
  "Creates a  `CfnCluster$KubernetesNetworkConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-kubernetes-network-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-kubernetes-network-config-property-builder> (new CfnCluster$KubernetesNetworkConfigProperty$Builder) id config))


(defn cfn-cluster-logging-property-builder>
  "The cfn-cluster-logging-property-builder> function updates a CfnCluster$LoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$LoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterLogging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-logging` |
"
  [^CfnCluster$LoggingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (.build builder))


(defn cfn-cluster-logging-property-builder
  "Creates a  `CfnCluster$LoggingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-logging-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-logging-property-builder> (new CfnCluster$LoggingProperty$Builder) id config))


(defn cfn-cluster-logging-type-config-property-builder>
  "The cfn-cluster-logging-type-config-property-builder> function updates a CfnCluster$LoggingTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$LoggingTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCluster$LoggingTypeConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-cluster-logging-type-config-property-builder
  "Creates a  `CfnCluster$LoggingTypeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-logging-type-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-logging-type-config-property-builder> (new CfnCluster$LoggingTypeConfigProperty$Builder) id config))


(defn cfn-cluster-outpost-config-property-builder>
  "The cfn-cluster-outpost-config-property-builder> function updates a CfnCluster$OutpostConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$OutpostConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlPlaneInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-plane-instance-type` |
| `controlPlanePlacement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:control-plane-placement` |
| `outpostArns` | java.util.List | [[cdk.support/lookup-entry]] | `:outpost-arns` |
"
  [^CfnCluster$OutpostConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :control-plane-instance-type)]
    (. builder controlPlaneInstanceType data))
  (when-some [data (lookup-entry config id :control-plane-placement)]
    (. builder controlPlanePlacement data))
  (when-some [data (lookup-entry config id :outpost-arns)]
    (. builder outpostArns data))
  (.build builder))


(defn cfn-cluster-outpost-config-property-builder
  "Creates a  `CfnCluster$OutpostConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-outpost-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-outpost-config-property-builder> (new CfnCluster$OutpostConfigProperty$Builder) id config))


(defn cfn-cluster-props-builder>
  "The cfn-cluster-props-builder> function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessConfig` | software.amazon.awscdk.services.eks.CfnCluster$AccessConfigProperty | [[cdk.support/lookup-entry]] | `:access-config` |
| `encryptionConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `kubernetesNetworkConfig` | software.amazon.awscdk.services.eks.CfnCluster$KubernetesNetworkConfigProperty | [[cdk.support/lookup-entry]] | `:kubernetes-network-config` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostConfig` | software.amazon.awscdk.services.eks.CfnCluster$OutpostConfigProperty | [[cdk.support/lookup-entry]] | `:outpost-config` |
| `resourcesVpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources-vpc-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-config)]
    (. builder accessConfig data))
  (when-some [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (when-some [data (lookup-entry config id :kubernetes-network-config)]
    (. builder kubernetesNetworkConfig data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outpost-config)]
    (. builder outpostConfig data))
  (when-some [data (lookup-entry config id :resources-vpc-config)]
    (. builder resourcesVpcConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-props-builder> (new CfnClusterProps$Builder) id config))


(defn cfn-cluster-provider-property-builder>
  "The cfn-cluster-provider-property-builder> function updates a CfnCluster$ProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
"
  [^CfnCluster$ProviderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (.build builder))


(defn cfn-cluster-provider-property-builder
  "Creates a  `CfnCluster$ProviderProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-provider-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-provider-property-builder> (new CfnCluster$ProviderProperty$Builder) id config))


(defn cfn-cluster-resources-vpc-config-property-builder>
  "The cfn-cluster-resources-vpc-config-property-builder> function updates a CfnCluster$ResourcesVpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ResourcesVpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPrivateAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:endpoint-private-access` |
| `endpointPublicAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-public-access` |
| `publicAccessCidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:public-access-cidrs` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnCluster$ResourcesVpcConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint-private-access)]
    (. builder endpointPrivateAccess data))
  (when-some [data (lookup-entry config id :endpoint-public-access)]
    (. builder endpointPublicAccess data))
  (when-some [data (lookup-entry config id :public-access-cidrs)]
    (. builder publicAccessCidrs data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-cluster-resources-vpc-config-property-builder
  "Creates a  `CfnCluster$ResourcesVpcConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-resources-vpc-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-resources-vpc-config-property-builder> (new CfnCluster$ResourcesVpcConfigProperty$Builder) id config))


(defn cfn-fargate-profile-builder>
  "The cfn-fargate-profile-builder> function updates a CfnFargateProfile$Builder instance using the provided configuration.
  The function takes the CfnFargateProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pod-execution-role-arn` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFargateProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :fargate-profile-name)]
    (. builder fargateProfileName data))
  (when-some [data (lookup-entry config id :pod-execution-role-arn)]
    (. builder podExecutionRoleArn data))
  (when-some [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fargate-profile-builder
  "Creates a  `CfnFargateProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-fargate-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fargate-profile-builder> (CfnFargateProfile$Builder/create scope (name id)) id config))


(defn cfn-fargate-profile-label-property-builder>
  "The cfn-fargate-profile-label-property-builder> function updates a CfnFargateProfile$LabelProperty$Builder instance using the provided configuration.
  The function takes the CfnFargateProfile$LabelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFargateProfile$LabelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-fargate-profile-label-property-builder
  "Creates a  `CfnFargateProfile$LabelProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fargate-profile-label-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fargate-profile-label-property-builder> (new CfnFargateProfile$LabelProperty$Builder) id config))


(defn cfn-fargate-profile-props-builder>
  "The cfn-fargate-profile-props-builder> function updates a CfnFargateProfileProps$Builder instance using the provided configuration.
  The function takes the CfnFargateProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pod-execution-role-arn` |
| `selectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFargateProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :fargate-profile-name)]
    (. builder fargateProfileName data))
  (when-some [data (lookup-entry config id :pod-execution-role-arn)]
    (. builder podExecutionRoleArn data))
  (when-some [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fargate-profile-props-builder
  "Creates a  `CfnFargateProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fargate-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fargate-profile-props-builder> (new CfnFargateProfileProps$Builder) id config))


(defn cfn-fargate-profile-selector-property-builder>
  "The cfn-fargate-profile-selector-property-builder> function updates a CfnFargateProfile$SelectorProperty$Builder instance using the provided configuration.
  The function takes the CfnFargateProfile$SelectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnFargateProfile$SelectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-fargate-profile-selector-property-builder
  "Creates a  `CfnFargateProfile$SelectorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fargate-profile-selector-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fargate-profile-selector-property-builder> (new CfnFargateProfile$SelectorProperty$Builder) id config))


(defn cfn-identity-provider-config-builder>
  "The cfn-identity-provider-config-builder> function updates a CfnIdentityProviderConfig$Builder instance using the provided configuration.
  The function takes the CfnIdentityProviderConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `identityProviderConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-config-name` |
| `oidc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdentityProviderConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :identity-provider-config-name)]
    (. builder identityProviderConfigName data))
  (when-some [data (lookup-entry config id :oidc)]
    (. builder oidc data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-identity-provider-config-builder
  "Creates a  `CfnIdentityProviderConfig$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-identity-provider-config-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-identity-provider-config-builder> (CfnIdentityProviderConfig$Builder/create scope (name id)) id config))


(defn cfn-identity-provider-config-oidc-identity-provider-config-property-builder>
  "The cfn-identity-provider-config-oidc-identity-provider-config-property-builder> function updates a CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `groupsClaim` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups-claim` |
| `groupsPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups-prefix` |
| `issuerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer-url` |
| `requiredClaims` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required-claims` |
| `usernameClaim` | java.lang.String | [[cdk.support/lookup-entry]] | `:username-claim` |
| `usernamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:username-prefix` |
"
  [^CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-some [data (lookup-entry config id :groups-claim)]
    (. builder groupsClaim data))
  (when-some [data (lookup-entry config id :groups-prefix)]
    (. builder groupsPrefix data))
  (when-some [data (lookup-entry config id :issuer-url)]
    (. builder issuerUrl data))
  (when-some [data (lookup-entry config id :required-claims)]
    (. builder requiredClaims data))
  (when-some [data (lookup-entry config id :username-claim)]
    (. builder usernameClaim data))
  (when-some [data (lookup-entry config id :username-prefix)]
    (. builder usernamePrefix data))
  (.build builder))


(defn cfn-identity-provider-config-oidc-identity-provider-config-property-builder
  "Creates a  `CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-identity-provider-config-oidc-identity-provider-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-identity-provider-config-oidc-identity-provider-config-property-builder> (new CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder) id config))


(defn cfn-identity-provider-config-props-builder>
  "The cfn-identity-provider-config-props-builder> function updates a CfnIdentityProviderConfigProps$Builder instance using the provided configuration.
  The function takes the CfnIdentityProviderConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `identityProviderConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-config-name` |
| `oidc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdentityProviderConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :identity-provider-config-name)]
    (. builder identityProviderConfigName data))
  (when-some [data (lookup-entry config id :oidc)]
    (. builder oidc data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-identity-provider-config-props-builder
  "Creates a  `CfnIdentityProviderConfigProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-identity-provider-config-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-identity-provider-config-props-builder> (new CfnIdentityProviderConfigProps$Builder) id config))


(defn cfn-identity-provider-config-required-claim-property-builder>
  "The cfn-identity-provider-config-required-claim-property-builder> function updates a CfnIdentityProviderConfig$RequiredClaimProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentityProviderConfig$RequiredClaimProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnIdentityProviderConfig$RequiredClaimProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-identity-provider-config-required-claim-property-builder
  "Creates a  `CfnIdentityProviderConfig$RequiredClaimProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-identity-provider-config-required-claim-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-identity-provider-config-required-claim-property-builder> (new CfnIdentityProviderConfig$RequiredClaimProperty$Builder) id config))


(defn cfn-nodegroup-builder>
  "The cfn-nodegroup-builder> function updates a CfnNodegroup$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ami-type` |
| `capacityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-type` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `diskSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disk-size` |
| `forceUpdateEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force-update-enabled` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `labels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:labels` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `nodeRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-role` |
| `nodegroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nodegroup-name` |
| `releaseVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-version` |
| `remoteAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remote-access` |
| `scalingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scaling-config` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |
| `updateConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-config` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnNodegroup$Builder builder id config]
  (when-some [data (lookup-entry config id :ami-type)]
    (. builder amiType data))
  (when-some [data (lookup-entry config id :capacity-type)]
    (. builder capacityType data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :disk-size)]
    (. builder diskSize data))
  (when-some [data (lookup-entry config id :force-update-enabled)]
    (. builder forceUpdateEnabled data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :node-role)]
    (. builder nodeRole data))
  (when-some [data (lookup-entry config id :nodegroup-name)]
    (. builder nodegroupName data))
  (when-some [data (lookup-entry config id :release-version)]
    (. builder releaseVersion data))
  (when-some [data (lookup-entry config id :remote-access)]
    (. builder remoteAccess data))
  (when-some [data (lookup-entry config id :scaling-config)]
    (. builder scalingConfig data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :taints)]
    (. builder taints data))
  (when-some [data (lookup-entry config id :update-config)]
    (. builder updateConfig data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-nodegroup-builder
  "Creates a  `CfnNodegroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-nodegroup-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-nodegroup-builder> (CfnNodegroup$Builder/create scope (name id)) id config))


(defn cfn-nodegroup-launch-template-specification-property-builder>
  "The cfn-nodegroup-launch-template-specification-property-builder> function updates a CfnNodegroup$LaunchTemplateSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$LaunchTemplateSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnNodegroup$LaunchTemplateSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-nodegroup-launch-template-specification-property-builder
  "Creates a  `CfnNodegroup$LaunchTemplateSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-launch-template-specification-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-launch-template-specification-property-builder> (new CfnNodegroup$LaunchTemplateSpecificationProperty$Builder) id config))


(defn cfn-nodegroup-props-builder>
  "The cfn-nodegroup-props-builder> function updates a CfnNodegroupProps$Builder instance using the provided configuration.
  The function takes the CfnNodegroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ami-type` |
| `capacityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-type` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `diskSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disk-size` |
| `forceUpdateEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update-enabled` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `launchTemplate` | software.amazon.awscdk.services.eks.CfnNodegroup$LaunchTemplateSpecificationProperty | [[cdk.support/lookup-entry]] | `:launch-template` |
| `nodeRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-role` |
| `nodegroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nodegroup-name` |
| `releaseVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-version` |
| `remoteAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remote-access` |
| `scalingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scaling-config` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |
| `updateConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-config` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnNodegroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ami-type)]
    (. builder amiType data))
  (when-some [data (lookup-entry config id :capacity-type)]
    (. builder capacityType data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :disk-size)]
    (. builder diskSize data))
  (when-some [data (lookup-entry config id :force-update-enabled)]
    (. builder forceUpdateEnabled data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :node-role)]
    (. builder nodeRole data))
  (when-some [data (lookup-entry config id :nodegroup-name)]
    (. builder nodegroupName data))
  (when-some [data (lookup-entry config id :release-version)]
    (. builder releaseVersion data))
  (when-some [data (lookup-entry config id :remote-access)]
    (. builder remoteAccess data))
  (when-some [data (lookup-entry config id :scaling-config)]
    (. builder scalingConfig data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :taints)]
    (. builder taints data))
  (when-some [data (lookup-entry config id :update-config)]
    (. builder updateConfig data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-nodegroup-props-builder
  "Creates a  `CfnNodegroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-props-builder> (new CfnNodegroupProps$Builder) id config))


(defn cfn-nodegroup-remote-access-property-builder>
  "The cfn-nodegroup-remote-access-property-builder> function updates a CfnNodegroup$RemoteAccessProperty$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$RemoteAccessProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2SshKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-ssh-key` |
| `sourceSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:source-security-groups` |
"
  [^CfnNodegroup$RemoteAccessProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ec2-ssh-key)]
    (. builder ec2SshKey data))
  (when-some [data (lookup-entry config id :source-security-groups)]
    (. builder sourceSecurityGroups data))
  (.build builder))


(defn cfn-nodegroup-remote-access-property-builder
  "Creates a  `CfnNodegroup$RemoteAccessProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-remote-access-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-remote-access-property-builder> (new CfnNodegroup$RemoteAccessProperty$Builder) id config))


(defn cfn-nodegroup-scaling-config-property-builder>
  "The cfn-nodegroup-scaling-config-property-builder> function updates a CfnNodegroup$ScalingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$ScalingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-size` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
"
  [^CfnNodegroup$ScalingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-size)]
    (. builder desiredSize data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (.build builder))


(defn cfn-nodegroup-scaling-config-property-builder
  "Creates a  `CfnNodegroup$ScalingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-scaling-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-scaling-config-property-builder> (new CfnNodegroup$ScalingConfigProperty$Builder) id config))


(defn cfn-nodegroup-taint-property-builder>
  "The cfn-nodegroup-taint-property-builder> function updates a CfnNodegroup$TaintProperty$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$TaintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnNodegroup$TaintProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-nodegroup-taint-property-builder
  "Creates a  `CfnNodegroup$TaintProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-taint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-taint-property-builder> (new CfnNodegroup$TaintProperty$Builder) id config))


(defn cfn-nodegroup-update-config-property-builder>
  "The cfn-nodegroup-update-config-property-builder> function updates a CfnNodegroup$UpdateConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnNodegroup$UpdateConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxUnavailable` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable` |
| `maxUnavailablePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable-percentage` |
"
  [^CfnNodegroup$UpdateConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-unavailable)]
    (. builder maxUnavailable data))
  (when-some [data (lookup-entry config id :max-unavailable-percentage)]
    (. builder maxUnavailablePercentage data))
  (.build builder))


(defn cfn-nodegroup-update-config-property-builder
  "Creates a  `CfnNodegroup$UpdateConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-nodegroup-update-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-nodegroup-update-config-property-builder> (new CfnNodegroup$UpdateConfigProperty$Builder) id config))


(defn cfn-pod-identity-association-builder>
  "The cfn-pod-identity-association-builder> function updates a CfnPodIdentityAssociation$Builder instance using the provided configuration.
  The function takes the CfnPodIdentityAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPodIdentityAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :service-account)]
    (. builder serviceAccount data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pod-identity-association-builder
  "Creates a  `CfnPodIdentityAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-pod-identity-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-pod-identity-association-builder> (CfnPodIdentityAssociation$Builder/create scope (name id)) id config))


(defn cfn-pod-identity-association-props-builder>
  "The cfn-pod-identity-association-props-builder> function updates a CfnPodIdentityAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnPodIdentityAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPodIdentityAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :service-account)]
    (. builder serviceAccount data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pod-identity-association-props-builder
  "Creates a  `CfnPodIdentityAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-pod-identity-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-pod-identity-association-props-builder> (new CfnPodIdentityAssociationProps$Builder) id config))


(defn cluster-attributes-builder>
  "The cluster-attributes-builder> function updates a ClusterAttributes$Builder instance using the provided configuration.
  The function takes the ClusterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterCertificateAuthorityData` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-certificate-authority-data` |
| `clusterEncryptionConfigKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-encryption-config-key-arn` |
| `clusterEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint` |
| `clusterHandlerSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group-id` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `clusterSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-security-group-id` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLambdaRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:kubectl-lambda-role` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `kubectlPrivateSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:kubectl-private-subnet-ids` |
| `kubectlProvider` | software.amazon.awscdk.services.eks.IKubectlProvider | [[cdk.support/lookup-entry]] | `:kubectl-provider` |
| `kubectlRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubectl-role-arn` |
| `kubectlSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubectl-security-group-id` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `openIdConnectProvider` | software.amazon.awscdk.services.iam.IOpenIdConnectProvider | [[cdk.support/lookup-entry]] | `:open-id-connect-provider` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ClusterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-certificate-authority-data)]
    (. builder clusterCertificateAuthorityData data))
  (when-some [data (lookup-entry config id :cluster-encryption-config-key-arn)]
    (. builder clusterEncryptionConfigKeyArn data))
  (when-some [data (lookup-entry config id :cluster-endpoint)]
    (. builder clusterEndpoint data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group-id)]
    (. builder clusterHandlerSecurityGroupId data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :cluster-security-group-id)]
    (. builder clusterSecurityGroupId data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-lambda-role)]
    (. builder kubectlLambdaRole data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :kubectl-private-subnet-ids)]
    (. builder kubectlPrivateSubnetIds data))
  (when-some [data (lookup-entry config id :kubectl-provider)]
    (. builder kubectlProvider data))
  (when-some [data (lookup-entry config id :kubectl-role-arn)]
    (. builder kubectlRoleArn data))
  (when-some [data (lookup-entry config id :kubectl-security-group-id)]
    (. builder kubectlSecurityGroupId data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :open-id-connect-provider)]
    (. builder openIdConnectProvider data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn cluster-attributes-builder
  "Creates a  `ClusterAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-attributes-builder> (new ClusterAttributes$Builder) id config))


(defn cluster-builder>
  "The cluster-builder> function updates a Cluster$Builder instance using the provided configuration.
  The function takes the Cluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `albController` | software.amazon.awscdk.services.eks.AlbControllerOptions | [[cdk.support/lookup-entry]] | `:alb-controller` |
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterHandlerEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:cluster-handler-environment` |
| `clusterHandlerSecurityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group` |
| `clusterLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-logging` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `coreDnsComputeType` | software.amazon.awscdk.services.eks.CoreDnsComputeType | [[cdk.api.services.eks/core-dns-compute-type]] | `:core-dns-compute-type` |
| `defaultCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-capacity` |
| `defaultCapacityInstance` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:default-capacity-instance` |
| `defaultCapacityType` | software.amazon.awscdk.services.eks.DefaultCapacityType | [[cdk.api.services.eks/default-capacity-type]] | `:default-capacity-type` |
| `endpointAccess` | software.amazon.awscdk.services.eks.EndpointAccess | [[cdk.support/lookup-entry]] | `:endpoint-access` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLambdaRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:kubectl-lambda-role` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `mastersRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:masters-role` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `outputMastersRoleArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-masters-role-arn` |
| `placeClusterHandlerInVpc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:place-cluster-handler-in-vpc` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secretsEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:secrets-encryption-key` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^Cluster$Builder builder id config]
  (when-some [data (lookup-entry config id :alb-controller)]
    (. builder albController data))
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-handler-environment)]
    (. builder clusterHandlerEnvironment data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group)]
    (. builder clusterHandlerSecurityGroup data))
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (core-dns-compute-type config id :core-dns-compute-type)]
    (. builder coreDnsComputeType data))
  (when-some [data (lookup-entry config id :default-capacity)]
    (. builder defaultCapacity data))
  (when-some [data (lookup-entry config id :default-capacity-instance)]
    (. builder defaultCapacityInstance data))
  (when-some [data (default-capacity-type config id :default-capacity-type)]
    (. builder defaultCapacityType data))
  (when-some [data (lookup-entry config id :endpoint-access)]
    (. builder endpointAccess data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-lambda-role)]
    (. builder kubectlLambdaRole data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :masters-role)]
    (. builder mastersRole data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :output-masters-role-arn)]
    (. builder outputMastersRoleArn data))
  (when-some [data (lookup-entry config id :place-cluster-handler-in-vpc)]
    (. builder placeClusterHandlerInVpc data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets-encryption-key)]
    (. builder secretsEncryptionKey data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn cluster-builder
  "Creates a  `Cluster$Builder` instance using a scope and ID, applies the data configuration using the [[cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cluster-builder> (Cluster$Builder/create scope (name id)) id config))


(defn cluster-options-builder>
  "The cluster-options-builder> function updates a ClusterOptions$Builder instance using the provided configuration.
  The function takes the ClusterOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `albController` | software.amazon.awscdk.services.eks.AlbControllerOptions | [[cdk.support/lookup-entry]] | `:alb-controller` |
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterHandlerEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:cluster-handler-environment` |
| `clusterHandlerSecurityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group` |
| `clusterLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-logging` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `coreDnsComputeType` | software.amazon.awscdk.services.eks.CoreDnsComputeType | [[cdk.api.services.eks/core-dns-compute-type]] | `:core-dns-compute-type` |
| `endpointAccess` | software.amazon.awscdk.services.eks.EndpointAccess | [[cdk.support/lookup-entry]] | `:endpoint-access` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `mastersRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:masters-role` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `outputMastersRoleArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-masters-role-arn` |
| `placeClusterHandlerInVpc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:place-cluster-handler-in-vpc` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secretsEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:secrets-encryption-key` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ClusterOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :alb-controller)]
    (. builder albController data))
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-handler-environment)]
    (. builder clusterHandlerEnvironment data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group)]
    (. builder clusterHandlerSecurityGroup data))
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (core-dns-compute-type config id :core-dns-compute-type)]
    (. builder coreDnsComputeType data))
  (when-some [data (lookup-entry config id :endpoint-access)]
    (. builder endpointAccess data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :masters-role)]
    (. builder mastersRole data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :output-masters-role-arn)]
    (. builder outputMastersRoleArn data))
  (when-some [data (lookup-entry config id :place-cluster-handler-in-vpc)]
    (. builder placeClusterHandlerInVpc data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets-encryption-key)]
    (. builder secretsEncryptionKey data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn cluster-options-builder
  "Creates a  `ClusterOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-options-builder> (new ClusterOptions$Builder) id config))


(defn cluster-props-builder>
  "The cluster-props-builder> function updates a ClusterProps$Builder instance using the provided configuration.
  The function takes the ClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `albController` | software.amazon.awscdk.services.eks.AlbControllerOptions | [[cdk.support/lookup-entry]] | `:alb-controller` |
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterHandlerEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:cluster-handler-environment` |
| `clusterHandlerSecurityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group` |
| `clusterLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-logging` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `coreDnsComputeType` | software.amazon.awscdk.services.eks.CoreDnsComputeType | [[cdk.api.services.eks/core-dns-compute-type]] | `:core-dns-compute-type` |
| `defaultCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-capacity` |
| `defaultCapacityInstance` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:default-capacity-instance` |
| `defaultCapacityType` | software.amazon.awscdk.services.eks.DefaultCapacityType | [[cdk.api.services.eks/default-capacity-type]] | `:default-capacity-type` |
| `endpointAccess` | software.amazon.awscdk.services.eks.EndpointAccess | [[cdk.support/lookup-entry]] | `:endpoint-access` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLambdaRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:kubectl-lambda-role` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `mastersRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:masters-role` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `outputMastersRoleArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-masters-role-arn` |
| `placeClusterHandlerInVpc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:place-cluster-handler-in-vpc` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secretsEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:secrets-encryption-key` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alb-controller)]
    (. builder albController data))
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-handler-environment)]
    (. builder clusterHandlerEnvironment data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group)]
    (. builder clusterHandlerSecurityGroup data))
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (core-dns-compute-type config id :core-dns-compute-type)]
    (. builder coreDnsComputeType data))
  (when-some [data (lookup-entry config id :default-capacity)]
    (. builder defaultCapacity data))
  (when-some [data (lookup-entry config id :default-capacity-instance)]
    (. builder defaultCapacityInstance data))
  (when-some [data (default-capacity-type config id :default-capacity-type)]
    (. builder defaultCapacityType data))
  (when-some [data (lookup-entry config id :endpoint-access)]
    (. builder endpointAccess data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-lambda-role)]
    (. builder kubectlLambdaRole data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :masters-role)]
    (. builder mastersRole data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :output-masters-role-arn)]
    (. builder outputMastersRoleArn data))
  (when-some [data (lookup-entry config id :place-cluster-handler-in-vpc)]
    (. builder placeClusterHandlerInVpc data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets-encryption-key)]
    (. builder secretsEncryptionKey data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn cluster-props-builder
  "Creates a  `ClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-props-builder> (new ClusterProps$Builder) id config))


(defn common-cluster-options-builder>
  "The common-cluster-options-builder> function updates a CommonClusterOptions$Builder instance using the provided configuration.
  The function takes the CommonClusterOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^CommonClusterOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn common-cluster-options-builder
  "Creates a  `CommonClusterOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[common-cluster-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (common-cluster-options-builder> (new CommonClusterOptions$Builder) id config))


(defn eks-optimized-image-builder>
  "The eks-optimized-image-builder> function updates a EksOptimizedImage$Builder instance using the provided configuration.
  The function takes the EksOptimizedImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArch` | software.amazon.awscdk.services.eks.CpuArch | [[cdk.api.services.eks/cpu-arch]] | `:cpu-arch` |
| `kubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-version` |
| `nodeType` | software.amazon.awscdk.services.eks.NodeType | [[cdk.api.services.eks/node-type]] | `:node-type` |
"
  [^EksOptimizedImage$Builder builder id config]
  (when-some [data (cpu-arch config id :cpu-arch)]
    (. builder cpuArch data))
  (when-some [data (lookup-entry config id :kubernetes-version)]
    (. builder kubernetesVersion data))
  (when-some [data (node-type config id :node-type)]
    (. builder nodeType data))
  (.build builder))


(defn eks-optimized-image-builder
  "Creates a  `EksOptimizedImage$Builder` instance using a no-argument create, applies the data configuration using the [[eks-optimized-image-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (eks-optimized-image-builder> (EksOptimizedImage$Builder/create) id config))


(defn eks-optimized-image-props-builder>
  "The eks-optimized-image-props-builder> function updates a EksOptimizedImageProps$Builder instance using the provided configuration.
  The function takes the EksOptimizedImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArch` | software.amazon.awscdk.services.eks.CpuArch | [[cdk.api.services.eks/cpu-arch]] | `:cpu-arch` |
| `kubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-version` |
| `nodeType` | software.amazon.awscdk.services.eks.NodeType | [[cdk.api.services.eks/node-type]] | `:node-type` |
"
  [^EksOptimizedImageProps$Builder builder id config]
  (when-some [data (cpu-arch config id :cpu-arch)]
    (. builder cpuArch data))
  (when-some [data (lookup-entry config id :kubernetes-version)]
    (. builder kubernetesVersion data))
  (when-some [data (node-type config id :node-type)]
    (. builder nodeType data))
  (.build builder))


(defn eks-optimized-image-props-builder
  "Creates a  `EksOptimizedImageProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[eks-optimized-image-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (eks-optimized-image-props-builder> (new EksOptimizedImageProps$Builder) id config))


(defn fargate-cluster-builder>
  "The fargate-cluster-builder> function updates a FargateCluster$Builder instance using the provided configuration.
  The function takes the FargateCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `albController` | software.amazon.awscdk.services.eks.AlbControllerOptions | [[cdk.support/lookup-entry]] | `:alb-controller` |
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterHandlerEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:cluster-handler-environment` |
| `clusterHandlerSecurityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group` |
| `clusterLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-logging` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `coreDnsComputeType` | software.amazon.awscdk.services.eks.CoreDnsComputeType | [[cdk.api.services.eks/core-dns-compute-type]] | `:core-dns-compute-type` |
| `defaultProfile` | software.amazon.awscdk.services.eks.FargateProfileOptions | [[cdk.support/lookup-entry]] | `:default-profile` |
| `endpointAccess` | software.amazon.awscdk.services.eks.EndpointAccess | [[cdk.support/lookup-entry]] | `:endpoint-access` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `mastersRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:masters-role` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `outputMastersRoleArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-masters-role-arn` |
| `placeClusterHandlerInVpc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:place-cluster-handler-in-vpc` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secretsEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:secrets-encryption-key` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :alb-controller)]
    (. builder albController data))
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-handler-environment)]
    (. builder clusterHandlerEnvironment data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group)]
    (. builder clusterHandlerSecurityGroup data))
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (core-dns-compute-type config id :core-dns-compute-type)]
    (. builder coreDnsComputeType data))
  (when-some [data (lookup-entry config id :default-profile)]
    (. builder defaultProfile data))
  (when-some [data (lookup-entry config id :endpoint-access)]
    (. builder endpointAccess data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :masters-role)]
    (. builder mastersRole data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :output-masters-role-arn)]
    (. builder outputMastersRoleArn data))
  (when-some [data (lookup-entry config id :place-cluster-handler-in-vpc)]
    (. builder placeClusterHandlerInVpc data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets-encryption-key)]
    (. builder secretsEncryptionKey data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn fargate-cluster-builder
  "Creates a  `FargateCluster$Builder` instance using a scope and ID, applies the data configuration using the [[fargate-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (fargate-cluster-builder> (FargateCluster$Builder/create scope (name id)) id config))


(defn fargate-cluster-props-builder>
  "The fargate-cluster-props-builder> function updates a FargateClusterProps$Builder instance using the provided configuration.
  The function takes the FargateClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `albController` | software.amazon.awscdk.services.eks.AlbControllerOptions | [[cdk.support/lookup-entry]] | `:alb-controller` |
| `awscliLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:awscli-layer` |
| `clusterHandlerEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:cluster-handler-environment` |
| `clusterHandlerSecurityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:cluster-handler-security-group` |
| `clusterLogging` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-logging` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `coreDnsComputeType` | software.amazon.awscdk.services.eks.CoreDnsComputeType | [[cdk.api.services.eks/core-dns-compute-type]] | `:core-dns-compute-type` |
| `defaultProfile` | software.amazon.awscdk.services.eks.FargateProfileOptions | [[cdk.support/lookup-entry]] | `:default-profile` |
| `endpointAccess` | software.amazon.awscdk.services.eks.EndpointAccess | [[cdk.support/lookup-entry]] | `:endpoint-access` |
| `ipFamily` | software.amazon.awscdk.services.eks.IpFamily | [[cdk.api.services.eks/ip-family]] | `:ip-family` |
| `kubectlEnvironment` | java.util.Map | [[cdk.support/lookup-entry]] | `:kubectl-environment` |
| `kubectlLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:kubectl-layer` |
| `kubectlMemory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:kubectl-memory` |
| `mastersRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:masters-role` |
| `onEventLayer` | software.amazon.awscdk.services.lambda.ILayerVersion | [[cdk.support/lookup-entry]] | `:on-event-layer` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `outputMastersRoleArn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-masters-role-arn` |
| `placeClusterHandlerInVpc` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:place-cluster-handler-in-vpc` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secretsEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:secrets-encryption-key` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alb-controller)]
    (. builder albController data))
  (when-some [data (lookup-entry config id :awscli-layer)]
    (. builder awscliLayer data))
  (when-some [data (lookup-entry config id :cluster-handler-environment)]
    (. builder clusterHandlerEnvironment data))
  (when-some [data (lookup-entry config id :cluster-handler-security-group)]
    (. builder clusterHandlerSecurityGroup data))
  (when-some [data (lookup-entry config id :cluster-logging)]
    (. builder clusterLogging data))
  (when-some [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (when-some [data (core-dns-compute-type config id :core-dns-compute-type)]
    (. builder coreDnsComputeType data))
  (when-some [data (lookup-entry config id :default-profile)]
    (. builder defaultProfile data))
  (when-some [data (lookup-entry config id :endpoint-access)]
    (. builder endpointAccess data))
  (when-some [data (ip-family config id :ip-family)]
    (. builder ipFamily data))
  (when-some [data (lookup-entry config id :kubectl-environment)]
    (. builder kubectlEnvironment data))
  (when-some [data (lookup-entry config id :kubectl-layer)]
    (. builder kubectlLayer data))
  (when-some [data (lookup-entry config id :kubectl-memory)]
    (. builder kubectlMemory data))
  (when-some [data (lookup-entry config id :masters-role)]
    (. builder mastersRole data))
  (when-some [data (lookup-entry config id :on-event-layer)]
    (. builder onEventLayer data))
  (when-some [data (lookup-entry config id :output-cluster-name)]
    (. builder outputClusterName data))
  (when-some [data (lookup-entry config id :output-config-command)]
    (. builder outputConfigCommand data))
  (when-some [data (lookup-entry config id :output-masters-role-arn)]
    (. builder outputMastersRoleArn data))
  (when-some [data (lookup-entry config id :place-cluster-handler-in-vpc)]
    (. builder placeClusterHandlerInVpc data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets-encryption-key)]
    (. builder secretsEncryptionKey data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :service-ipv4-cidr)]
    (. builder serviceIpv4Cidr data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn fargate-cluster-props-builder
  "Creates a  `FargateClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[fargate-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (fargate-cluster-props-builder> (new FargateClusterProps$Builder) id config))


(defn fargate-profile-builder>
  "The fargate-profile-builder> function updates a FargateProfile$Builder instance using the provided configuration.
  The function takes the FargateProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^FargateProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :fargate-profile-name)]
    (. builder fargateProfileName data))
  (when-some [data (lookup-entry config id :pod-execution-role)]
    (. builder podExecutionRole data))
  (when-some [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn fargate-profile-builder
  "Creates a  `FargateProfile$Builder` instance using a scope and ID, applies the data configuration using the [[fargate-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (fargate-profile-builder> (FargateProfile$Builder/create scope (name id)) id config))


(defn fargate-profile-options-builder>
  "The fargate-profile-options-builder> function updates a FargateProfileOptions$Builder instance using the provided configuration.
  The function takes the FargateProfileOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^FargateProfileOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :fargate-profile-name)]
    (. builder fargateProfileName data))
  (when-some [data (lookup-entry config id :pod-execution-role)]
    (. builder podExecutionRole data))
  (when-some [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn fargate-profile-options-builder
  "Creates a  `FargateProfileOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[fargate-profile-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (fargate-profile-options-builder> (new FargateProfileOptions$Builder) id config))


(defn fargate-profile-props-builder>
  "The fargate-profile-props-builder> function updates a FargateProfileProps$Builder instance using the provided configuration.
  The function takes the FargateProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^FargateProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :fargate-profile-name)]
    (. builder fargateProfileName data))
  (when-some [data (lookup-entry config id :pod-execution-role)]
    (. builder podExecutionRole data))
  (when-some [data (lookup-entry config id :selectors)]
    (. builder selectors data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn fargate-profile-props-builder
  "Creates a  `FargateProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[fargate-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (fargate-profile-props-builder> (new FargateProfileProps$Builder) id config))


(defn helm-chart-builder>
  "The helm-chart-builder> function updates a HelmChart$Builder instance using the provided configuration.
  The function takes the HelmChart$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atomic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:atomic` |
| `chart` | java.lang.String | [[cdk.support/lookup-entry]] | `:chart` |
| `chartAsset` | software.amazon.awscdk.services.s3.assets.Asset | [[cdk.support/lookup-entry]] | `:chart-asset` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `createNamespace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-namespace` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `release` | java.lang.String | [[cdk.support/lookup-entry]] | `:release` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `skipCrds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-crds` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `values` | java.util.Map | [[cdk.support/lookup-entry]] | `:values` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |
"
  [^HelmChart$Builder builder id config]
  (when-some [data (lookup-entry config id :atomic)]
    (. builder atomic data))
  (when-some [data (lookup-entry config id :chart)]
    (. builder chart data))
  (when-some [data (lookup-entry config id :chart-asset)]
    (. builder chartAsset data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :create-namespace)]
    (. builder createNamespace data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :release)]
    (. builder release data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :skip-crds)]
    (. builder skipCrds data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :wait)]
    (. builder wait data))
  (.build builder))


(defn helm-chart-builder
  "Creates a  `HelmChart$Builder` instance using a scope and ID, applies the data configuration using the [[helm-chart-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (helm-chart-builder> (HelmChart$Builder/create scope (name id)) id config))


(defn helm-chart-options-builder>
  "The helm-chart-options-builder> function updates a HelmChartOptions$Builder instance using the provided configuration.
  The function takes the HelmChartOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atomic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:atomic` |
| `chart` | java.lang.String | [[cdk.support/lookup-entry]] | `:chart` |
| `chartAsset` | software.amazon.awscdk.services.s3.assets.Asset | [[cdk.support/lookup-entry]] | `:chart-asset` |
| `createNamespace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-namespace` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `release` | java.lang.String | [[cdk.support/lookup-entry]] | `:release` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `skipCrds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-crds` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `values` | java.util.Map | [[cdk.support/lookup-entry]] | `:values` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |
"
  [^HelmChartOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :atomic)]
    (. builder atomic data))
  (when-some [data (lookup-entry config id :chart)]
    (. builder chart data))
  (when-some [data (lookup-entry config id :chart-asset)]
    (. builder chartAsset data))
  (when-some [data (lookup-entry config id :create-namespace)]
    (. builder createNamespace data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :release)]
    (. builder release data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :skip-crds)]
    (. builder skipCrds data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :wait)]
    (. builder wait data))
  (.build builder))


(defn helm-chart-options-builder
  "Creates a  `HelmChartOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[helm-chart-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (helm-chart-options-builder> (new HelmChartOptions$Builder) id config))


(defn helm-chart-props-builder>
  "The helm-chart-props-builder> function updates a HelmChartProps$Builder instance using the provided configuration.
  The function takes the HelmChartProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atomic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:atomic` |
| `chart` | java.lang.String | [[cdk.support/lookup-entry]] | `:chart` |
| `chartAsset` | software.amazon.awscdk.services.s3.assets.Asset | [[cdk.support/lookup-entry]] | `:chart-asset` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `createNamespace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-namespace` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `release` | java.lang.String | [[cdk.support/lookup-entry]] | `:release` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `skipCrds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-crds` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `values` | java.util.Map | [[cdk.support/lookup-entry]] | `:values` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |
"
  [^HelmChartProps$Builder builder id config]
  (when-some [data (lookup-entry config id :atomic)]
    (. builder atomic data))
  (when-some [data (lookup-entry config id :chart)]
    (. builder chart data))
  (when-some [data (lookup-entry config id :chart-asset)]
    (. builder chartAsset data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :create-namespace)]
    (. builder createNamespace data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :release)]
    (. builder release data))
  (when-some [data (lookup-entry config id :repository)]
    (. builder repository data))
  (when-some [data (lookup-entry config id :skip-crds)]
    (. builder skipCrds data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :wait)]
    (. builder wait data))
  (.build builder))


(defn helm-chart-props-builder
  "Creates a  `HelmChartProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[helm-chart-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (helm-chart-props-builder> (new HelmChartProps$Builder) id config))


(defn ingress-load-balancer-address-options-builder>
  "The ingress-load-balancer-address-options-builder> function updates a IngressLoadBalancerAddressOptions$Builder instance using the provided configuration.
  The function takes the IngressLoadBalancerAddressOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^IngressLoadBalancerAddressOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn ingress-load-balancer-address-options-builder
  "Creates a  `IngressLoadBalancerAddressOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[ingress-load-balancer-address-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (ingress-load-balancer-address-options-builder> (new IngressLoadBalancerAddressOptions$Builder) id config))


(defn kubectl-provider-attributes-builder>
  "The kubectl-provider-attributes-builder> function updates a KubectlProviderAttributes$Builder instance using the provided configuration.
  The function takes the KubectlProviderAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `handlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:handler-role` |
| `kubectlRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubectl-role-arn` |
"
  [^KubectlProviderAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :handler-role)]
    (. builder handlerRole data))
  (when-some [data (lookup-entry config id :kubectl-role-arn)]
    (. builder kubectlRoleArn data))
  (.build builder))


(defn kubectl-provider-attributes-builder
  "Creates a  `KubectlProviderAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubectl-provider-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubectl-provider-attributes-builder> (new KubectlProviderAttributes$Builder) id config))


(defn kubectl-provider-builder>
  "The kubectl-provider-builder> function updates a KubectlProvider$Builder instance using the provided configuration.
  The function takes the KubectlProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
"
  [^KubectlProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (.build builder))


(defn kubectl-provider-builder
  "Creates a  `KubectlProvider$Builder` instance using a scope and ID, applies the data configuration using the [[kubectl-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (kubectl-provider-builder> (KubectlProvider$Builder/create scope (name id)) id config))


(defn kubectl-provider-props-builder>
  "The kubectl-provider-props-builder> function updates a KubectlProviderProps$Builder instance using the provided configuration.
  The function takes the KubectlProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
"
  [^KubectlProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (.build builder))


(defn kubectl-provider-props-builder
  "Creates a  `KubectlProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubectl-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubectl-provider-props-builder> (new KubectlProviderProps$Builder) id config))


(defn kubernetes-manifest-builder>
  "The kubernetes-manifest-builder> function updates a KubernetesManifest$Builder instance using the provided configuration.
  The function takes the KubernetesManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `manifest` | java.util.List | [[cdk.support/lookup-entry]] | `:manifest` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |
"
  [^KubernetesManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :ingress-alb)]
    (. builder ingressAlb data))
  (when-some [data (alb-scheme config id :ingress-alb-scheme)]
    (. builder ingressAlbScheme data))
  (when-some [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-some [data (lookup-entry config id :overwrite)]
    (. builder overwrite data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :skip-validation)]
    (. builder skipValidation data))
  (.build builder))


(defn kubernetes-manifest-builder
  "Creates a  `KubernetesManifest$Builder` instance using a scope and ID, applies the data configuration using the [[kubernetes-manifest-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (kubernetes-manifest-builder> (KubernetesManifest$Builder/create scope (name id)) id config))


(defn kubernetes-manifest-options-builder>
  "The kubernetes-manifest-options-builder> function updates a KubernetesManifestOptions$Builder instance using the provided configuration.
  The function takes the KubernetesManifestOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |
"
  [^KubernetesManifestOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :ingress-alb)]
    (. builder ingressAlb data))
  (when-some [data (alb-scheme config id :ingress-alb-scheme)]
    (. builder ingressAlbScheme data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :skip-validation)]
    (. builder skipValidation data))
  (.build builder))


(defn kubernetes-manifest-options-builder
  "Creates a  `KubernetesManifestOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubernetes-manifest-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubernetes-manifest-options-builder> (new KubernetesManifestOptions$Builder) id config))


(defn kubernetes-manifest-props-builder>
  "The kubernetes-manifest-props-builder> function updates a KubernetesManifestProps$Builder instance using the provided configuration.
  The function takes the KubernetesManifestProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `manifest` | java.util.List | [[cdk.support/lookup-entry]] | `:manifest` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |
"
  [^KubernetesManifestProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :ingress-alb)]
    (. builder ingressAlb data))
  (when-some [data (alb-scheme config id :ingress-alb-scheme)]
    (. builder ingressAlbScheme data))
  (when-some [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-some [data (lookup-entry config id :overwrite)]
    (. builder overwrite data))
  (when-some [data (lookup-entry config id :prune)]
    (. builder prune data))
  (when-some [data (lookup-entry config id :skip-validation)]
    (. builder skipValidation data))
  (.build builder))


(defn kubernetes-manifest-props-builder
  "Creates a  `KubernetesManifestProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubernetes-manifest-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubernetes-manifest-props-builder> (new KubernetesManifestProps$Builder) id config))


(defn kubernetes-object-value-builder>
  "The kubernetes-object-value-builder> function updates a KubernetesObjectValue$Builder instance using the provided configuration.
  The function takes the KubernetesObjectValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `objectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-name` |
| `objectNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-namespace` |
| `objectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^KubernetesObjectValue$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :json-path)]
    (. builder jsonPath data))
  (when-some [data (lookup-entry config id :object-name)]
    (. builder objectName data))
  (when-some [data (lookup-entry config id :object-namespace)]
    (. builder objectNamespace data))
  (when-some [data (lookup-entry config id :object-type)]
    (. builder objectType data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn kubernetes-object-value-builder
  "Creates a  `KubernetesObjectValue$Builder` instance using a scope and ID, applies the data configuration using the [[kubernetes-object-value-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (kubernetes-object-value-builder> (KubernetesObjectValue$Builder/create scope (name id)) id config))


(defn kubernetes-object-value-props-builder>
  "The kubernetes-object-value-props-builder> function updates a KubernetesObjectValueProps$Builder instance using the provided configuration.
  The function takes the KubernetesObjectValueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `objectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-name` |
| `objectNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-namespace` |
| `objectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^KubernetesObjectValueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :json-path)]
    (. builder jsonPath data))
  (when-some [data (lookup-entry config id :object-name)]
    (. builder objectName data))
  (when-some [data (lookup-entry config id :object-namespace)]
    (. builder objectNamespace data))
  (when-some [data (lookup-entry config id :object-type)]
    (. builder objectType data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn kubernetes-object-value-props-builder
  "Creates a  `KubernetesObjectValueProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubernetes-object-value-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubernetes-object-value-props-builder> (new KubernetesObjectValueProps$Builder) id config))


(defn kubernetes-patch-builder>
  "The kubernetes-patch-builder> function updates a KubernetesPatch$Builder instance using the provided configuration.
  The function takes the KubernetesPatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyPatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:apply-patch` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `patchType` | software.amazon.awscdk.services.eks.PatchType | [[cdk.api.services.eks/patch-type]] | `:patch-type` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `resourceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-namespace` |
| `restorePatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-patch` |
"
  [^KubernetesPatch$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-patch)]
    (. builder applyPatch data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (patch-type config id :patch-type)]
    (. builder patchType data))
  (when-some [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-some [data (lookup-entry config id :resource-namespace)]
    (. builder resourceNamespace data))
  (when-some [data (lookup-entry config id :restore-patch)]
    (. builder restorePatch data))
  (.build builder))


(defn kubernetes-patch-builder
  "Creates a  `KubernetesPatch$Builder` instance using a scope and ID, applies the data configuration using the [[kubernetes-patch-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (kubernetes-patch-builder> (KubernetesPatch$Builder/create scope (name id)) id config))


(defn kubernetes-patch-props-builder>
  "The kubernetes-patch-props-builder> function updates a KubernetesPatchProps$Builder instance using the provided configuration.
  The function takes the KubernetesPatchProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyPatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:apply-patch` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `patchType` | software.amazon.awscdk.services.eks.PatchType | [[cdk.api.services.eks/patch-type]] | `:patch-type` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `resourceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-namespace` |
| `restorePatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-patch` |
"
  [^KubernetesPatchProps$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-patch)]
    (. builder applyPatch data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (patch-type config id :patch-type)]
    (. builder patchType data))
  (when-some [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-some [data (lookup-entry config id :resource-namespace)]
    (. builder resourceNamespace data))
  (when-some [data (lookup-entry config id :restore-patch)]
    (. builder restorePatch data))
  (.build builder))


(defn kubernetes-patch-props-builder
  "Creates a  `KubernetesPatchProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[kubernetes-patch-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (kubernetes-patch-props-builder> (new KubernetesPatchProps$Builder) id config))


(defn launch-template-spec-builder>
  "The launch-template-spec-builder> function updates a LaunchTemplateSpec$Builder instance using the provided configuration.
  The function takes the LaunchTemplateSpec$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^LaunchTemplateSpec$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn launch-template-spec-builder
  "Creates a  `LaunchTemplateSpec$Builder` instance using a no-argument constructor, applies the data configuration using the [[launch-template-spec-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (launch-template-spec-builder> (new LaunchTemplateSpec$Builder) id config))


(defn nodegroup-builder>
  "The nodegroup-builder> function updates a Nodegroup$Builder instance using the provided configuration.
  The function takes the Nodegroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiType` | software.amazon.awscdk.services.eks.NodegroupAmiType | [[cdk.api.services.eks/nodegroup-ami-type]] | `:ami-type` |
| `capacityType` | software.amazon.awscdk.services.eks.CapacityType | [[cdk.api.services.eks/capacity-type]] | `:capacity-type` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-size` |
| `diskSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disk-size` |
| `forceUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `launchTemplateSpec` | software.amazon.awscdk.services.eks.LaunchTemplateSpec | [[cdk.support/lookup-entry]] | `:launch-template-spec` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `maxUnavailable` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable` |
| `maxUnavailablePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable-percentage` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `nodeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:node-role` |
| `nodegroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nodegroup-name` |
| `releaseVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-version` |
| `remoteAccess` | software.amazon.awscdk.services.eks.NodegroupRemoteAccess | [[cdk.support/lookup-entry]] | `:remote-access` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |
"
  [^Nodegroup$Builder builder id config]
  (when-some [data (nodegroup-ami-type config id :ami-type)]
    (. builder amiType data))
  (when-some [data (capacity-type config id :capacity-type)]
    (. builder capacityType data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-size)]
    (. builder desiredSize data))
  (when-some [data (lookup-entry config id :disk-size)]
    (. builder diskSize data))
  (when-some [data (lookup-entry config id :force-update)]
    (. builder forceUpdate data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :launch-template-spec)]
    (. builder launchTemplateSpec data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :max-unavailable)]
    (. builder maxUnavailable data))
  (when-some [data (lookup-entry config id :max-unavailable-percentage)]
    (. builder maxUnavailablePercentage data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :node-role)]
    (. builder nodeRole data))
  (when-some [data (lookup-entry config id :nodegroup-name)]
    (. builder nodegroupName data))
  (when-some [data (lookup-entry config id :release-version)]
    (. builder releaseVersion data))
  (when-some [data (lookup-entry config id :remote-access)]
    (. builder remoteAccess data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :taints)]
    (. builder taints data))
  (.build builder))


(defn nodegroup-builder
  "Creates a  `Nodegroup$Builder` instance using a scope and ID, applies the data configuration using the [[nodegroup-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (nodegroup-builder> (Nodegroup$Builder/create scope (name id)) id config))


(defn nodegroup-options-builder>
  "The nodegroup-options-builder> function updates a NodegroupOptions$Builder instance using the provided configuration.
  The function takes the NodegroupOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiType` | software.amazon.awscdk.services.eks.NodegroupAmiType | [[cdk.api.services.eks/nodegroup-ami-type]] | `:ami-type` |
| `capacityType` | software.amazon.awscdk.services.eks.CapacityType | [[cdk.api.services.eks/capacity-type]] | `:capacity-type` |
| `desiredSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-size` |
| `diskSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disk-size` |
| `forceUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `launchTemplateSpec` | software.amazon.awscdk.services.eks.LaunchTemplateSpec | [[cdk.support/lookup-entry]] | `:launch-template-spec` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `maxUnavailable` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable` |
| `maxUnavailablePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable-percentage` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `nodeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:node-role` |
| `nodegroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nodegroup-name` |
| `releaseVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-version` |
| `remoteAccess` | software.amazon.awscdk.services.eks.NodegroupRemoteAccess | [[cdk.support/lookup-entry]] | `:remote-access` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |
"
  [^NodegroupOptions$Builder builder id config]
  (when-some [data (nodegroup-ami-type config id :ami-type)]
    (. builder amiType data))
  (when-some [data (capacity-type config id :capacity-type)]
    (. builder capacityType data))
  (when-some [data (lookup-entry config id :desired-size)]
    (. builder desiredSize data))
  (when-some [data (lookup-entry config id :disk-size)]
    (. builder diskSize data))
  (when-some [data (lookup-entry config id :force-update)]
    (. builder forceUpdate data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :launch-template-spec)]
    (. builder launchTemplateSpec data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :max-unavailable)]
    (. builder maxUnavailable data))
  (when-some [data (lookup-entry config id :max-unavailable-percentage)]
    (. builder maxUnavailablePercentage data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :node-role)]
    (. builder nodeRole data))
  (when-some [data (lookup-entry config id :nodegroup-name)]
    (. builder nodegroupName data))
  (when-some [data (lookup-entry config id :release-version)]
    (. builder releaseVersion data))
  (when-some [data (lookup-entry config id :remote-access)]
    (. builder remoteAccess data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :taints)]
    (. builder taints data))
  (.build builder))


(defn nodegroup-options-builder
  "Creates a  `NodegroupOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[nodegroup-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (nodegroup-options-builder> (new NodegroupOptions$Builder) id config))


(defn nodegroup-props-builder>
  "The nodegroup-props-builder> function updates a NodegroupProps$Builder instance using the provided configuration.
  The function takes the NodegroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiType` | software.amazon.awscdk.services.eks.NodegroupAmiType | [[cdk.api.services.eks/nodegroup-ami-type]] | `:ami-type` |
| `capacityType` | software.amazon.awscdk.services.eks.CapacityType | [[cdk.api.services.eks/capacity-type]] | `:capacity-type` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-size` |
| `diskSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disk-size` |
| `forceUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `launchTemplateSpec` | software.amazon.awscdk.services.eks.LaunchTemplateSpec | [[cdk.support/lookup-entry]] | `:launch-template-spec` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `maxUnavailable` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable` |
| `maxUnavailablePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable-percentage` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `nodeRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:node-role` |
| `nodegroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nodegroup-name` |
| `releaseVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-version` |
| `remoteAccess` | software.amazon.awscdk.services.eks.NodegroupRemoteAccess | [[cdk.support/lookup-entry]] | `:remote-access` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |
"
  [^NodegroupProps$Builder builder id config]
  (when-some [data (nodegroup-ami-type config id :ami-type)]
    (. builder amiType data))
  (when-some [data (capacity-type config id :capacity-type)]
    (. builder capacityType data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-size)]
    (. builder desiredSize data))
  (when-some [data (lookup-entry config id :disk-size)]
    (. builder diskSize data))
  (when-some [data (lookup-entry config id :force-update)]
    (. builder forceUpdate data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :launch-template-spec)]
    (. builder launchTemplateSpec data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :max-unavailable)]
    (. builder maxUnavailable data))
  (when-some [data (lookup-entry config id :max-unavailable-percentage)]
    (. builder maxUnavailablePercentage data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :node-role)]
    (. builder nodeRole data))
  (when-some [data (lookup-entry config id :nodegroup-name)]
    (. builder nodegroupName data))
  (when-some [data (lookup-entry config id :release-version)]
    (. builder releaseVersion data))
  (when-some [data (lookup-entry config id :remote-access)]
    (. builder remoteAccess data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :taints)]
    (. builder taints data))
  (.build builder))


(defn nodegroup-props-builder
  "Creates a  `NodegroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[nodegroup-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (nodegroup-props-builder> (new NodegroupProps$Builder) id config))


(defn nodegroup-remote-access-builder>
  "The nodegroup-remote-access-builder> function updates a NodegroupRemoteAccess$Builder instance using the provided configuration.
  The function takes the NodegroupRemoteAccess$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:source-security-groups` |
| `sshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key-name` |
"
  [^NodegroupRemoteAccess$Builder builder id config]
  (when-some [data (lookup-entry config id :source-security-groups)]
    (. builder sourceSecurityGroups data))
  (when-some [data (lookup-entry config id :ssh-key-name)]
    (. builder sshKeyName data))
  (.build builder))


(defn nodegroup-remote-access-builder
  "Creates a  `NodegroupRemoteAccess$Builder` instance using a no-argument constructor, applies the data configuration using the [[nodegroup-remote-access-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (nodegroup-remote-access-builder> (new NodegroupRemoteAccess$Builder) id config))


(defn open-id-connect-provider-builder>
  "The open-id-connect-provider-builder> function updates a OpenIdConnectProvider$Builder instance using the provided configuration.
  The function takes the OpenIdConnectProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^OpenIdConnectProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn open-id-connect-provider-builder
  "Creates a  `OpenIdConnectProvider$Builder` instance using a scope and ID, applies the data configuration using the [[open-id-connect-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (open-id-connect-provider-builder> (OpenIdConnectProvider$Builder/create scope (name id)) id config))


(defn open-id-connect-provider-props-builder>
  "The open-id-connect-provider-props-builder> function updates a OpenIdConnectProviderProps$Builder instance using the provided configuration.
  The function takes the OpenIdConnectProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^OpenIdConnectProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn open-id-connect-provider-props-builder
  "Creates a  `OpenIdConnectProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[open-id-connect-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (open-id-connect-provider-props-builder> (new OpenIdConnectProviderProps$Builder) id config))


(defn selector-builder>
  "The selector-builder> function updates a Selector$Builder instance using the provided configuration.
  The function takes the Selector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^Selector$Builder builder id config]
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn selector-builder
  "Creates a  `Selector$Builder` instance using a no-argument constructor, applies the data configuration using the [[selector-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (selector-builder> (new Selector$Builder) id config))


(defn service-account-builder>
  "The service-account-builder> function updates a ServiceAccount$Builder instance using the provided configuration.
  The function takes the ServiceAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^ServiceAccount$Builder builder id config]
  (when-some [data (lookup-entry config id :annotations)]
    (. builder annotations data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn service-account-builder
  "Creates a  `ServiceAccount$Builder` instance using a scope and ID, applies the data configuration using the [[service-account-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (service-account-builder> (ServiceAccount$Builder/create scope (name id)) id config))


(defn service-account-options-builder>
  "The service-account-options-builder> function updates a ServiceAccountOptions$Builder instance using the provided configuration.
  The function takes the ServiceAccountOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^ServiceAccountOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :annotations)]
    (. builder annotations data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn service-account-options-builder
  "Creates a  `ServiceAccountOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[service-account-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (service-account-options-builder> (new ServiceAccountOptions$Builder) id config))


(defn service-account-props-builder>
  "The service-account-props-builder> function updates a ServiceAccountProps$Builder instance using the provided configuration.
  The function takes the ServiceAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^ServiceAccountProps$Builder builder id config]
  (when-some [data (lookup-entry config id :annotations)]
    (. builder annotations data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn service-account-props-builder
  "Creates a  `ServiceAccountProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[service-account-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (service-account-props-builder> (new ServiceAccountProps$Builder) id config))


(defn service-load-balancer-address-options-builder>
  "The service-load-balancer-address-options-builder> function updates a ServiceLoadBalancerAddressOptions$Builder instance using the provided configuration.
  The function takes the ServiceLoadBalancerAddressOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^ServiceLoadBalancerAddressOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn service-load-balancer-address-options-builder
  "Creates a  `ServiceLoadBalancerAddressOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[service-load-balancer-address-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (service-load-balancer-address-options-builder> (new ServiceLoadBalancerAddressOptions$Builder) id config))


(defn taint-spec-builder>
  "The taint-spec-builder> function updates a TaintSpec$Builder instance using the provided configuration.
  The function takes the TaintSpec$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effect` | software.amazon.awscdk.services.eks.TaintEffect | [[cdk.api.services.eks/taint-effect]] | `:effect` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^TaintSpec$Builder builder id config]
  (when-some [data (taint-effect config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn taint-spec-builder
  "Creates a  `TaintSpec$Builder` instance using a no-argument constructor, applies the data configuration using the [[taint-spec-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (taint-spec-builder> (new TaintSpec$Builder) id config))