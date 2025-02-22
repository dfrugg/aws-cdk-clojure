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


(defn alb-controller-builder
  "The alb-controller-builder function buildes out new instances of 
AlbController$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AlbController$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn alb-controller-options-builder
  "The alb-controller-options-builder function buildes out new instances of 
AlbControllerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AlbControllerOptions$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn alb-controller-props-builder
  "The alb-controller-props-builder function buildes out new instances of 
AlbControllerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `version` | software.amazon.awscdk.services.eks.AlbControllerVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AlbControllerProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn auto-scaling-group-capacity-options-builder
  "The auto-scaling-group-capacity-options-builder function buildes out new instances of 
AutoScalingGroupCapacityOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (AutoScalingGroupCapacityOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :bootstrap-enabled)]
      (. builder bootstrapEnabled data))
    (when-let [data (lookup-entry config id :bootstrap-options)]
      (. builder bootstrapOptions data))
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :default-instance-warmup)]
      (. builder defaultInstanceWarmup data))
    (when-let [data (lookup-entry config id :desired-capacity)]
      (. builder desiredCapacity data))
    (when-let [data (lookup-entry config id :group-metrics)]
      (. builder groupMetrics data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :ignore-unmodified-size-properties)]
      (. builder ignoreUnmodifiedSizeProperties data))
    (when-let [data (monitoring config id :instance-monitoring)]
      (. builder instanceMonitoring data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
    (when-let [data (lookup-entry config id :map-role)]
      (. builder mapRole data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :max-instance-lifetime)]
      (. builder maxInstanceLifetime data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :new-instances-protected-from-scale-in)]
      (. builder newInstancesProtectedFromScaleIn data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (when-let [data (lookup-entry config id :signals)]
      (. builder signals data))
    (when-let [data (lookup-entry config id :spot-interrupt-handler)]
      (. builder spotInterruptHandler data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
      (. builder terminationPolicyCustomLambdaFunctionArn data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn auto-scaling-group-options-builder
  "The auto-scaling-group-options-builder function buildes out new instances of 
AutoScalingGroupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bootstrap-enabled` |
| `bootstrapOptions` | software.amazon.awscdk.services.eks.BootstrapOptions | [[cdk.support/lookup-entry]] | `:bootstrap-options` |
| `machineImageType` | software.amazon.awscdk.services.eks.MachineImageType | [[cdk.api.services.eks/machine-image-type]] | `:machine-image-type` |
| `mapRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-role` |
| `spotInterruptHandler` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-interrupt-handler` |"
  [stack id config]
  (let [builder (AutoScalingGroupOptions$Builder.)]
    (when-let [data (lookup-entry config id :bootstrap-enabled)]
      (. builder bootstrapEnabled data))
    (when-let [data (lookup-entry config id :bootstrap-options)]
      (. builder bootstrapOptions data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
    (when-let [data (lookup-entry config id :map-role)]
      (. builder mapRole data))
    (when-let [data (lookup-entry config id :spot-interrupt-handler)]
      (. builder spotInterruptHandler data))
    (.build builder)))


(defn aws-auth-builder
  "The aws-auth-builder function buildes out new instances of 
AwsAuth$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |"
  [stack id config]
  (let [builder (AwsAuth$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (.build builder)))


(defn aws-auth-mapping-builder
  "The aws-auth-mapping-builder function buildes out new instances of 
AwsAuthMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (AwsAuthMapping$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn aws-auth-props-builder
  "The aws-auth-props-builder function buildes out new instances of 
AwsAuthProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |"
  [stack id config]
  (let [builder (AwsAuthProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (.build builder)))


(defn bootstrap-options-builder
  "The bootstrap-options-builder function buildes out new instances of 
BootstrapOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-args` |
| `awsApiRetryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:aws-api-retry-attempts` |
| `dnsClusterIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-cluster-ip` |
| `dockerConfigJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-config-json` |
| `enableDockerBridge` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-docker-bridge` |
| `kubeletExtraArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubelet-extra-args` |
| `useMaxPods` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-max-pods` |"
  [stack id config]
  (let [builder (BootstrapOptions$Builder.)]
    (when-let [data (lookup-entry config id :additional-args)]
      (. builder additionalArgs data))
    (when-let [data (lookup-entry config id :aws-api-retry-attempts)]
      (. builder awsApiRetryAttempts data))
    (when-let [data (lookup-entry config id :dns-cluster-ip)]
      (. builder dnsClusterIp data))
    (when-let [data (lookup-entry config id :docker-config-json)]
      (. builder dockerConfigJson data))
    (when-let [data (lookup-entry config id :enable-docker-bridge)]
      (. builder enableDockerBridge data))
    (when-let [data (lookup-entry config id :kubelet-extra-args)]
      (. builder kubeletExtraArgs data))
    (when-let [data (lookup-entry config id :use-max-pods)]
      (. builder useMaxPods data))
    (.build builder)))


(defn cfn-access-entry-access-policy-property-builder
  "The cfn-access-entry-access-policy-property-builder function buildes out new instances of 
CfnAccessEntry$AccessPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessScope` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-scope` |
| `policyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-arn` |"
  [stack id config]
  (let [builder (CfnAccessEntry$AccessPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-scope)]
      (. builder accessScope data))
    (when-let [data (lookup-entry config id :policy-arn)]
      (. builder policyArn data))
    (.build builder)))


(defn cfn-access-entry-access-scope-property-builder
  "The cfn-access-entry-access-scope-property-builder function buildes out new instances of 
CfnAccessEntry$AccessScopeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaces` | java.util.List | [[cdk.support/lookup-entry]] | `:namespaces` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAccessEntry$AccessScopeProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespaces)]
      (. builder namespaces data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-access-entry-builder
  "The cfn-access-entry-builder function buildes out new instances of 
CfnAccessEntry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policies` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kubernetesGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:kubernetes-groups` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnAccessEntry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-policies)]
      (. builder accessPolicies data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :kubernetes-groups)]
      (. builder kubernetesGroups data))
    (when-let [data (lookup-entry config id :principal-arn)]
      (. builder principalArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-access-entry-props-builder
  "The cfn-access-entry-props-builder function buildes out new instances of 
CfnAccessEntryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:access-policies` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `kubernetesGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:kubernetes-groups` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnAccessEntryProps$Builder.)]
    (when-let [data (lookup-entry config id :access-policies)]
      (. builder accessPolicies data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :kubernetes-groups)]
      (. builder kubernetesGroups data))
    (when-let [data (lookup-entry config id :principal-arn)]
      (. builder principalArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-addon-builder
  "The cfn-addon-builder function buildes out new instances of 
CfnAddon$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-name` |
| `addonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-version` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-values` |
| `preserveOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-on-delete` |
| `resolveConflicts` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolve-conflicts` |
| `serviceAccountRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAddon$Builder/create stack id)]
    (when-let [data (lookup-entry config id :addon-name)]
      (. builder addonName data))
    (when-let [data (lookup-entry config id :addon-version)]
      (. builder addonVersion data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :configuration-values)]
      (. builder configurationValues data))
    (when-let [data (lookup-entry config id :preserve-on-delete)]
      (. builder preserveOnDelete data))
    (when-let [data (lookup-entry config id :resolve-conflicts)]
      (. builder resolveConflicts data))
    (when-let [data (lookup-entry config id :service-account-role-arn)]
      (. builder serviceAccountRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-addon-props-builder
  "The cfn-addon-props-builder function buildes out new instances of 
CfnAddonProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-name` |
| `addonVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:addon-version` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `configurationValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-values` |
| `preserveOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-on-delete` |
| `resolveConflicts` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolve-conflicts` |
| `serviceAccountRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAddonProps$Builder.)]
    (when-let [data (lookup-entry config id :addon-name)]
      (. builder addonName data))
    (when-let [data (lookup-entry config id :addon-version)]
      (. builder addonVersion data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :configuration-values)]
      (. builder configurationValues data))
    (when-let [data (lookup-entry config id :preserve-on-delete)]
      (. builder preserveOnDelete data))
    (when-let [data (lookup-entry config id :resolve-conflicts)]
      (. builder resolveConflicts data))
    (when-let [data (lookup-entry config id :service-account-role-arn)]
      (. builder serviceAccountRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-access-config-property-builder
  "The cfn-cluster-access-config-property-builder function buildes out new instances of 
CfnCluster$AccessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-mode` |
| `bootstrapClusterCreatorAdminPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bootstrap-cluster-creator-admin-permissions` |"
  [stack id config]
  (let [builder (CfnCluster$AccessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-mode)]
      (. builder authenticationMode data))
    (when-let [data (lookup-entry config id :bootstrap-cluster-creator-admin-permissions)]
      (. builder bootstrapClusterCreatorAdminPermissions data))
    (.build builder)))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-config)]
      (. builder accessConfig data))
    (when-let [data (lookup-entry config id :encryption-config)]
      (. builder encryptionConfig data))
    (when-let [data (lookup-entry config id :kubernetes-network-config)]
      (. builder kubernetesNetworkConfig data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outpost-config)]
      (. builder outpostConfig data))
    (when-let [data (lookup-entry config id :resources-vpc-config)]
      (. builder resourcesVpcConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-cluster-cluster-logging-property-builder
  "The cfn-cluster-cluster-logging-property-builder function buildes out new instances of 
CfnCluster$ClusterLoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabledTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled-types` |"
  [stack id config]
  (let [builder (CfnCluster$ClusterLoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled-types)]
      (. builder enabledTypes data))
    (.build builder)))


(defn cfn-cluster-control-plane-placement-property-builder
  "The cfn-cluster-control-plane-placement-property-builder function buildes out new instances of 
CfnCluster$ControlPlanePlacementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |"
  [stack id config]
  (let [builder (CfnCluster$ControlPlanePlacementProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (.build builder)))


(defn cfn-cluster-encryption-config-property-builder
  "The cfn-cluster-encryption-config-property-builder function buildes out new instances of 
CfnCluster$EncryptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provider` | software.amazon.awscdk.services.eks.CfnCluster$ProviderProperty | [[cdk.support/lookup-entry]] | `:provider` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |"
  [stack id config]
  (let [builder (CfnCluster$EncryptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (.build builder)))


(defn cfn-cluster-kubernetes-network-config-property-builder
  "The cfn-cluster-kubernetes-network-config-property-builder function buildes out new instances of 
CfnCluster$KubernetesNetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-family` |
| `serviceIpv4Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv4-cidr` |
| `serviceIpv6Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-ipv6-cidr` |"
  [stack id config]
  (let [builder (CfnCluster$KubernetesNetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :service-ipv6-cidr)]
      (. builder serviceIpv6Cidr data))
    (.build builder)))


(defn cfn-cluster-logging-property-builder
  "The cfn-cluster-logging-property-builder function buildes out new instances of 
CfnCluster$LoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterLogging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-logging` |"
  [stack id config]
  (let [builder (CfnCluster$LoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (.build builder)))


(defn cfn-cluster-logging-type-config-property-builder
  "The cfn-cluster-logging-type-config-property-builder function buildes out new instances of 
CfnCluster$LoggingTypeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCluster$LoggingTypeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-cluster-outpost-config-property-builder
  "The cfn-cluster-outpost-config-property-builder function buildes out new instances of 
CfnCluster$OutpostConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlPlaneInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-plane-instance-type` |
| `controlPlanePlacement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:control-plane-placement` |
| `outpostArns` | java.util.List | [[cdk.support/lookup-entry]] | `:outpost-arns` |"
  [stack id config]
  (let [builder (CfnCluster$OutpostConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :control-plane-instance-type)]
      (. builder controlPlaneInstanceType data))
    (when-let [data (lookup-entry config id :control-plane-placement)]
      (. builder controlPlanePlacement data))
    (when-let [data (lookup-entry config id :outpost-arns)]
      (. builder outpostArns data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :access-config)]
      (. builder accessConfig data))
    (when-let [data (lookup-entry config id :encryption-config)]
      (. builder encryptionConfig data))
    (when-let [data (lookup-entry config id :kubernetes-network-config)]
      (. builder kubernetesNetworkConfig data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outpost-config)]
      (. builder outpostConfig data))
    (when-let [data (lookup-entry config id :resources-vpc-config)]
      (. builder resourcesVpcConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-cluster-provider-property-builder
  "The cfn-cluster-provider-property-builder function buildes out new instances of 
CfnCluster$ProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |"
  [stack id config]
  (let [builder (CfnCluster$ProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (.build builder)))


(defn cfn-cluster-resources-vpc-config-property-builder
  "The cfn-cluster-resources-vpc-config-property-builder function buildes out new instances of 
CfnCluster$ResourcesVpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointPrivateAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:endpoint-private-access` |
| `endpointPublicAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-public-access` |
| `publicAccessCidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:public-access-cidrs` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnCluster$ResourcesVpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-private-access)]
      (. builder endpointPrivateAccess data))
    (when-let [data (lookup-entry config id :endpoint-public-access)]
      (. builder endpointPublicAccess data))
    (when-let [data (lookup-entry config id :public-access-cidrs)]
      (. builder publicAccessCidrs data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-fargate-profile-builder
  "The cfn-fargate-profile-builder function buildes out new instances of 
CfnFargateProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pod-execution-role-arn` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFargateProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :fargate-profile-name)]
      (. builder fargateProfileName data))
    (when-let [data (lookup-entry config id :pod-execution-role-arn)]
      (. builder podExecutionRoleArn data))
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fargate-profile-label-property-builder
  "The cfn-fargate-profile-label-property-builder function buildes out new instances of 
CfnFargateProfile$LabelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFargateProfile$LabelProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-fargate-profile-props-builder
  "The cfn-fargate-profile-props-builder function buildes out new instances of 
CfnFargateProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:pod-execution-role-arn` |
| `selectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFargateProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :fargate-profile-name)]
      (. builder fargateProfileName data))
    (when-let [data (lookup-entry config id :pod-execution-role-arn)]
      (. builder podExecutionRoleArn data))
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fargate-profile-selector-property-builder
  "The cfn-fargate-profile-selector-property-builder function buildes out new instances of 
CfnFargateProfile$SelectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnFargateProfile$SelectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-identity-provider-config-builder
  "The cfn-identity-provider-config-builder function buildes out new instances of 
CfnIdentityProviderConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `identityProviderConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-config-name` |
| `oidc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIdentityProviderConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :identity-provider-config-name)]
      (. builder identityProviderConfigName data))
    (when-let [data (lookup-entry config id :oidc)]
      (. builder oidc data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-identity-provider-config-oidc-identity-provider-config-property-builder
  "The cfn-identity-provider-config-oidc-identity-provider-config-property-builder function buildes out new instances of 
CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `groupsClaim` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups-claim` |
| `groupsPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups-prefix` |
| `issuerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer-url` |
| `requiredClaims` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required-claims` |
| `usernameClaim` | java.lang.String | [[cdk.support/lookup-entry]] | `:username-claim` |
| `usernamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:username-prefix` |"
  [stack id config]
  (let [builder (CfnIdentityProviderConfig$OidcIdentityProviderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :groups-claim)]
      (. builder groupsClaim data))
    (when-let [data (lookup-entry config id :groups-prefix)]
      (. builder groupsPrefix data))
    (when-let [data (lookup-entry config id :issuer-url)]
      (. builder issuerUrl data))
    (when-let [data (lookup-entry config id :required-claims)]
      (. builder requiredClaims data))
    (when-let [data (lookup-entry config id :username-claim)]
      (. builder usernameClaim data))
    (when-let [data (lookup-entry config id :username-prefix)]
      (. builder usernamePrefix data))
    (.build builder)))


(defn cfn-identity-provider-config-props-builder
  "The cfn-identity-provider-config-props-builder function buildes out new instances of 
CfnIdentityProviderConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `identityProviderConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-provider-config-name` |
| `oidc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIdentityProviderConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :identity-provider-config-name)]
      (. builder identityProviderConfigName data))
    (when-let [data (lookup-entry config id :oidc)]
      (. builder oidc data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-identity-provider-config-required-claim-property-builder
  "The cfn-identity-provider-config-required-claim-property-builder function buildes out new instances of 
CfnIdentityProviderConfig$RequiredClaimProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnIdentityProviderConfig$RequiredClaimProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-nodegroup-builder
  "The cfn-nodegroup-builder function buildes out new instances of 
CfnNodegroup$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnNodegroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ami-type)]
      (. builder amiType data))
    (when-let [data (lookup-entry config id :capacity-type)]
      (. builder capacityType data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :disk-size)]
      (. builder diskSize data))
    (when-let [data (lookup-entry config id :force-update-enabled)]
      (. builder forceUpdateEnabled data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :node-role)]
      (. builder nodeRole data))
    (when-let [data (lookup-entry config id :nodegroup-name)]
      (. builder nodegroupName data))
    (when-let [data (lookup-entry config id :release-version)]
      (. builder releaseVersion data))
    (when-let [data (lookup-entry config id :remote-access)]
      (. builder remoteAccess data))
    (when-let [data (lookup-entry config id :scaling-config)]
      (. builder scalingConfig data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :taints)]
      (. builder taints data))
    (when-let [data (lookup-entry config id :update-config)]
      (. builder updateConfig data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-nodegroup-launch-template-specification-property-builder
  "The cfn-nodegroup-launch-template-specification-property-builder function buildes out new instances of 
CfnNodegroup$LaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnNodegroup$LaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-nodegroup-props-builder
  "The cfn-nodegroup-props-builder function buildes out new instances of 
CfnNodegroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnNodegroupProps$Builder.)]
    (when-let [data (lookup-entry config id :ami-type)]
      (. builder amiType data))
    (when-let [data (lookup-entry config id :capacity-type)]
      (. builder capacityType data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :disk-size)]
      (. builder diskSize data))
    (when-let [data (lookup-entry config id :force-update-enabled)]
      (. builder forceUpdateEnabled data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :node-role)]
      (. builder nodeRole data))
    (when-let [data (lookup-entry config id :nodegroup-name)]
      (. builder nodegroupName data))
    (when-let [data (lookup-entry config id :release-version)]
      (. builder releaseVersion data))
    (when-let [data (lookup-entry config id :remote-access)]
      (. builder remoteAccess data))
    (when-let [data (lookup-entry config id :scaling-config)]
      (. builder scalingConfig data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :taints)]
      (. builder taints data))
    (when-let [data (lookup-entry config id :update-config)]
      (. builder updateConfig data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-nodegroup-remote-access-property-builder
  "The cfn-nodegroup-remote-access-property-builder function buildes out new instances of 
CfnNodegroup$RemoteAccessProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2SshKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-ssh-key` |
| `sourceSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:source-security-groups` |"
  [stack id config]
  (let [builder (CfnNodegroup$RemoteAccessProperty$Builder.)]
    (when-let [data (lookup-entry config id :ec2-ssh-key)]
      (. builder ec2SshKey data))
    (when-let [data (lookup-entry config id :source-security-groups)]
      (. builder sourceSecurityGroups data))
    (.build builder)))


(defn cfn-nodegroup-scaling-config-property-builder
  "The cfn-nodegroup-scaling-config-property-builder function buildes out new instances of 
CfnNodegroup$ScalingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-size` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |"
  [stack id config]
  (let [builder (CfnNodegroup$ScalingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-size)]
      (. builder desiredSize data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (.build builder)))


(defn cfn-nodegroup-taint-property-builder
  "The cfn-nodegroup-taint-property-builder function buildes out new instances of 
CfnNodegroup$TaintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnNodegroup$TaintProperty$Builder.)]
    (when-let [data (lookup-entry config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-nodegroup-update-config-property-builder
  "The cfn-nodegroup-update-config-property-builder function buildes out new instances of 
CfnNodegroup$UpdateConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxUnavailable` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable` |
| `maxUnavailablePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-unavailable-percentage` |"
  [stack id config]
  (let [builder (CfnNodegroup$UpdateConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-unavailable)]
      (. builder maxUnavailable data))
    (when-let [data (lookup-entry config id :max-unavailable-percentage)]
      (. builder maxUnavailablePercentage data))
    (.build builder)))


(defn cfn-pod-identity-association-builder
  "The cfn-pod-identity-association-builder function buildes out new instances of 
CfnPodIdentityAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPodIdentityAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :service-account)]
      (. builder serviceAccount data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-pod-identity-association-props-builder
  "The cfn-pod-identity-association-props-builder function buildes out new instances of 
CfnPodIdentityAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPodIdentityAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :service-account)]
      (. builder serviceAccount data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cluster-attributes-builder
  "The cluster-attributes-builder function buildes out new instances of 
ClusterAttributes$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ClusterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-certificate-authority-data)]
      (. builder clusterCertificateAuthorityData data))
    (when-let [data (lookup-entry config id :cluster-encryption-config-key-arn)]
      (. builder clusterEncryptionConfigKeyArn data))
    (when-let [data (lookup-entry config id :cluster-endpoint)]
      (. builder clusterEndpoint data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group-id)]
      (. builder clusterHandlerSecurityGroupId data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :cluster-security-group-id)]
      (. builder clusterSecurityGroupId data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-lambda-role)]
      (. builder kubectlLambdaRole data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :kubectl-private-subnet-ids)]
      (. builder kubectlPrivateSubnetIds data))
    (when-let [data (lookup-entry config id :kubectl-provider)]
      (. builder kubectlProvider data))
    (when-let [data (lookup-entry config id :kubectl-role-arn)]
      (. builder kubectlRoleArn data))
    (when-let [data (lookup-entry config id :kubectl-security-group-id)]
      (. builder kubectlSecurityGroupId data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :open-id-connect-provider)]
      (. builder openIdConnectProvider data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cluster-builder
  "The cluster-builder function buildes out new instances of 
Cluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (Cluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alb-controller)]
      (. builder albController data))
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-handler-environment)]
      (. builder clusterHandlerEnvironment data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group)]
      (. builder clusterHandlerSecurityGroup data))
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (core-dns-compute-type config id :core-dns-compute-type)]
      (. builder coreDnsComputeType data))
    (when-let [data (lookup-entry config id :default-capacity)]
      (. builder defaultCapacity data))
    (when-let [data (lookup-entry config id :default-capacity-instance)]
      (. builder defaultCapacityInstance data))
    (when-let [data (default-capacity-type config id :default-capacity-type)]
      (. builder defaultCapacityType data))
    (when-let [data (lookup-entry config id :endpoint-access)]
      (. builder endpointAccess data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-lambda-role)]
      (. builder kubectlLambdaRole data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :masters-role)]
      (. builder mastersRole data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :output-masters-role-arn)]
      (. builder outputMastersRoleArn data))
    (when-let [data (lookup-entry config id :place-cluster-handler-in-vpc)]
      (. builder placeClusterHandlerInVpc data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets-encryption-key)]
      (. builder secretsEncryptionKey data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn cluster-options-builder
  "The cluster-options-builder function buildes out new instances of 
ClusterOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ClusterOptions$Builder.)]
    (when-let [data (lookup-entry config id :alb-controller)]
      (. builder albController data))
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-handler-environment)]
      (. builder clusterHandlerEnvironment data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group)]
      (. builder clusterHandlerSecurityGroup data))
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (core-dns-compute-type config id :core-dns-compute-type)]
      (. builder coreDnsComputeType data))
    (when-let [data (lookup-entry config id :endpoint-access)]
      (. builder endpointAccess data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :masters-role)]
      (. builder mastersRole data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :output-masters-role-arn)]
      (. builder outputMastersRoleArn data))
    (when-let [data (lookup-entry config id :place-cluster-handler-in-vpc)]
      (. builder placeClusterHandlerInVpc data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets-encryption-key)]
      (. builder secretsEncryptionKey data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn cluster-props-builder
  "The cluster-props-builder function buildes out new instances of 
ClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :alb-controller)]
      (. builder albController data))
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-handler-environment)]
      (. builder clusterHandlerEnvironment data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group)]
      (. builder clusterHandlerSecurityGroup data))
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (core-dns-compute-type config id :core-dns-compute-type)]
      (. builder coreDnsComputeType data))
    (when-let [data (lookup-entry config id :default-capacity)]
      (. builder defaultCapacity data))
    (when-let [data (lookup-entry config id :default-capacity-instance)]
      (. builder defaultCapacityInstance data))
    (when-let [data (default-capacity-type config id :default-capacity-type)]
      (. builder defaultCapacityType data))
    (when-let [data (lookup-entry config id :endpoint-access)]
      (. builder endpointAccess data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-lambda-role)]
      (. builder kubectlLambdaRole data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :masters-role)]
      (. builder mastersRole data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :output-masters-role-arn)]
      (. builder outputMastersRoleArn data))
    (when-let [data (lookup-entry config id :place-cluster-handler-in-vpc)]
      (. builder placeClusterHandlerInVpc data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets-encryption-key)]
      (. builder secretsEncryptionKey data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn common-cluster-options-builder
  "The common-cluster-options-builder function buildes out new instances of 
CommonClusterOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `outputClusterName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-cluster-name` |
| `outputConfigCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:output-config-command` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `version` | software.amazon.awscdk.services.eks.KubernetesVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (CommonClusterOptions$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn eks-optimized-image-builder
  "The eks-optimized-image-builder function buildes out new instances of 
EksOptimizedImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArch` | software.amazon.awscdk.services.eks.CpuArch | [[cdk.api.services.eks/cpu-arch]] | `:cpu-arch` |
| `kubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-version` |
| `nodeType` | software.amazon.awscdk.services.eks.NodeType | [[cdk.api.services.eks/node-type]] | `:node-type` |"
  [stack id config]
  (let [builder (EksOptimizedImage$Builder/create)]
    (when-let [data (cpu-arch config id :cpu-arch)]
      (. builder cpuArch data))
    (when-let [data (lookup-entry config id :kubernetes-version)]
      (. builder kubernetesVersion data))
    (when-let [data (node-type config id :node-type)]
      (. builder nodeType data))
    (.build builder)))


(defn eks-optimized-image-props-builder
  "The eks-optimized-image-props-builder function buildes out new instances of 
EksOptimizedImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArch` | software.amazon.awscdk.services.eks.CpuArch | [[cdk.api.services.eks/cpu-arch]] | `:cpu-arch` |
| `kubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-version` |
| `nodeType` | software.amazon.awscdk.services.eks.NodeType | [[cdk.api.services.eks/node-type]] | `:node-type` |"
  [stack id config]
  (let [builder (EksOptimizedImageProps$Builder.)]
    (when-let [data (cpu-arch config id :cpu-arch)]
      (. builder cpuArch data))
    (when-let [data (lookup-entry config id :kubernetes-version)]
      (. builder kubernetesVersion data))
    (when-let [data (node-type config id :node-type)]
      (. builder nodeType data))
    (.build builder)))


(defn fargate-cluster-builder
  "The fargate-cluster-builder function buildes out new instances of 
FargateCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alb-controller)]
      (. builder albController data))
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-handler-environment)]
      (. builder clusterHandlerEnvironment data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group)]
      (. builder clusterHandlerSecurityGroup data))
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (core-dns-compute-type config id :core-dns-compute-type)]
      (. builder coreDnsComputeType data))
    (when-let [data (lookup-entry config id :default-profile)]
      (. builder defaultProfile data))
    (when-let [data (lookup-entry config id :endpoint-access)]
      (. builder endpointAccess data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :masters-role)]
      (. builder mastersRole data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :output-masters-role-arn)]
      (. builder outputMastersRoleArn data))
    (when-let [data (lookup-entry config id :place-cluster-handler-in-vpc)]
      (. builder placeClusterHandlerInVpc data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets-encryption-key)]
      (. builder secretsEncryptionKey data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn fargate-cluster-props-builder
  "The fargate-cluster-props-builder function buildes out new instances of 
FargateClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :alb-controller)]
      (. builder albController data))
    (when-let [data (lookup-entry config id :awscli-layer)]
      (. builder awscliLayer data))
    (when-let [data (lookup-entry config id :cluster-handler-environment)]
      (. builder clusterHandlerEnvironment data))
    (when-let [data (lookup-entry config id :cluster-handler-security-group)]
      (. builder clusterHandlerSecurityGroup data))
    (when-let [data (lookup-entry config id :cluster-logging)]
      (. builder clusterLogging data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (core-dns-compute-type config id :core-dns-compute-type)]
      (. builder coreDnsComputeType data))
    (when-let [data (lookup-entry config id :default-profile)]
      (. builder defaultProfile data))
    (when-let [data (lookup-entry config id :endpoint-access)]
      (. builder endpointAccess data))
    (when-let [data (ip-family config id :ip-family)]
      (. builder ipFamily data))
    (when-let [data (lookup-entry config id :kubectl-environment)]
      (. builder kubectlEnvironment data))
    (when-let [data (lookup-entry config id :kubectl-layer)]
      (. builder kubectlLayer data))
    (when-let [data (lookup-entry config id :kubectl-memory)]
      (. builder kubectlMemory data))
    (when-let [data (lookup-entry config id :masters-role)]
      (. builder mastersRole data))
    (when-let [data (lookup-entry config id :on-event-layer)]
      (. builder onEventLayer data))
    (when-let [data (lookup-entry config id :output-cluster-name)]
      (. builder outputClusterName data))
    (when-let [data (lookup-entry config id :output-config-command)]
      (. builder outputConfigCommand data))
    (when-let [data (lookup-entry config id :output-masters-role-arn)]
      (. builder outputMastersRoleArn data))
    (when-let [data (lookup-entry config id :place-cluster-handler-in-vpc)]
      (. builder placeClusterHandlerInVpc data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets-encryption-key)]
      (. builder secretsEncryptionKey data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :service-ipv4-cidr)]
      (. builder serviceIpv4Cidr data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn fargate-profile-builder
  "The fargate-profile-builder function buildes out new instances of 
FargateProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (FargateProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :fargate-profile-name)]
      (. builder fargateProfileName data))
    (when-let [data (lookup-entry config id :pod-execution-role)]
      (. builder podExecutionRole data))
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn fargate-profile-options-builder
  "The fargate-profile-options-builder function buildes out new instances of 
FargateProfileOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (FargateProfileOptions$Builder.)]
    (when-let [data (lookup-entry config id :fargate-profile-name)]
      (. builder fargateProfileName data))
    (when-let [data (lookup-entry config id :pod-execution-role)]
      (. builder podExecutionRole data))
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn fargate-profile-props-builder
  "The fargate-profile-props-builder function buildes out new instances of 
FargateProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.Cluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `fargateProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fargate-profile-name` |
| `podExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:pod-execution-role` |
| `selectors` | java.util.List | [[cdk.support/lookup-entry]] | `:selectors` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (FargateProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :fargate-profile-name)]
      (. builder fargateProfileName data))
    (when-let [data (lookup-entry config id :pod-execution-role)]
      (. builder podExecutionRole data))
    (when-let [data (lookup-entry config id :selectors)]
      (. builder selectors data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn helm-chart-builder
  "The helm-chart-builder function buildes out new instances of 
HelmChart$Builder using the provided configuration.  Each field is set as follows:

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
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |"
  [stack id config]
  (let [builder (HelmChart$Builder/create stack id)]
    (when-let [data (lookup-entry config id :atomic)]
      (. builder atomic data))
    (when-let [data (lookup-entry config id :chart)]
      (. builder chart data))
    (when-let [data (lookup-entry config id :chart-asset)]
      (. builder chartAsset data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :create-namespace)]
      (. builder createNamespace data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :release)]
      (. builder release data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :skip-crds)]
      (. builder skipCrds data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :wait)]
      (. builder wait data))
    (.build builder)))


(defn helm-chart-options-builder
  "The helm-chart-options-builder function buildes out new instances of 
HelmChartOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |"
  [stack id config]
  (let [builder (HelmChartOptions$Builder.)]
    (when-let [data (lookup-entry config id :atomic)]
      (. builder atomic data))
    (when-let [data (lookup-entry config id :chart)]
      (. builder chart data))
    (when-let [data (lookup-entry config id :chart-asset)]
      (. builder chartAsset data))
    (when-let [data (lookup-entry config id :create-namespace)]
      (. builder createNamespace data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :release)]
      (. builder release data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :skip-crds)]
      (. builder skipCrds data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :wait)]
      (. builder wait data))
    (.build builder)))


(defn helm-chart-props-builder
  "The helm-chart-props-builder function buildes out new instances of 
HelmChartProps$Builder using the provided configuration.  Each field is set as follows:

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
| `wait` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait` |"
  [stack id config]
  (let [builder (HelmChartProps$Builder.)]
    (when-let [data (lookup-entry config id :atomic)]
      (. builder atomic data))
    (when-let [data (lookup-entry config id :chart)]
      (. builder chart data))
    (when-let [data (lookup-entry config id :chart-asset)]
      (. builder chartAsset data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :create-namespace)]
      (. builder createNamespace data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :release)]
      (. builder release data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :skip-crds)]
      (. builder skipCrds data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :wait)]
      (. builder wait data))
    (.build builder)))


(defn ingress-load-balancer-address-options-builder
  "The ingress-load-balancer-address-options-builder function buildes out new instances of 
IngressLoadBalancerAddressOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (IngressLoadBalancerAddressOptions$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn kubectl-provider-attributes-builder
  "The kubectl-provider-attributes-builder function buildes out new instances of 
KubectlProviderAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `handlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:handler-role` |
| `kubectlRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubectl-role-arn` |"
  [stack id config]
  (let [builder (KubectlProviderAttributes$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :handler-role)]
      (. builder handlerRole data))
    (when-let [data (lookup-entry config id :kubectl-role-arn)]
      (. builder kubectlRoleArn data))
    (.build builder)))


(defn kubectl-provider-builder
  "The kubectl-provider-builder function buildes out new instances of 
KubectlProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |"
  [stack id config]
  (let [builder (KubectlProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (.build builder)))


(defn kubectl-provider-props-builder
  "The kubectl-provider-props-builder function buildes out new instances of 
KubectlProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |"
  [stack id config]
  (let [builder (KubectlProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (.build builder)))


(defn kubernetes-manifest-builder
  "The kubernetes-manifest-builder function buildes out new instances of 
KubernetesManifest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `manifest` | java.util.List | [[cdk.support/lookup-entry]] | `:manifest` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |"
  [stack id config]
  (let [builder (KubernetesManifest$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :ingress-alb)]
      (. builder ingressAlb data))
    (when-let [data (alb-scheme config id :ingress-alb-scheme)]
      (. builder ingressAlbScheme data))
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :overwrite)]
      (. builder overwrite data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :skip-validation)]
      (. builder skipValidation data))
    (.build builder)))


(defn kubernetes-manifest-options-builder
  "The kubernetes-manifest-options-builder function buildes out new instances of 
KubernetesManifestOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |"
  [stack id config]
  (let [builder (KubernetesManifestOptions$Builder.)]
    (when-let [data (lookup-entry config id :ingress-alb)]
      (. builder ingressAlb data))
    (when-let [data (alb-scheme config id :ingress-alb-scheme)]
      (. builder ingressAlbScheme data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :skip-validation)]
      (. builder skipValidation data))
    (.build builder)))


(defn kubernetes-manifest-props-builder
  "The kubernetes-manifest-props-builder function buildes out new instances of 
KubernetesManifestProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `ingressAlb` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ingress-alb` |
| `ingressAlbScheme` | software.amazon.awscdk.services.eks.AlbScheme | [[cdk.api.services.eks/alb-scheme]] | `:ingress-alb-scheme` |
| `manifest` | java.util.List | [[cdk.support/lookup-entry]] | `:manifest` |
| `overwrite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:overwrite` |
| `prune` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prune` |
| `skipValidation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-validation` |"
  [stack id config]
  (let [builder (KubernetesManifestProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :ingress-alb)]
      (. builder ingressAlb data))
    (when-let [data (alb-scheme config id :ingress-alb-scheme)]
      (. builder ingressAlbScheme data))
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :overwrite)]
      (. builder overwrite data))
    (when-let [data (lookup-entry config id :prune)]
      (. builder prune data))
    (when-let [data (lookup-entry config id :skip-validation)]
      (. builder skipValidation data))
    (.build builder)))


(defn kubernetes-object-value-builder
  "The kubernetes-object-value-builder function buildes out new instances of 
KubernetesObjectValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `objectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-name` |
| `objectNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-namespace` |
| `objectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (KubernetesObjectValue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :json-path)]
      (. builder jsonPath data))
    (when-let [data (lookup-entry config id :object-name)]
      (. builder objectName data))
    (when-let [data (lookup-entry config id :object-namespace)]
      (. builder objectNamespace data))
    (when-let [data (lookup-entry config id :object-type)]
      (. builder objectType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn kubernetes-object-value-props-builder
  "The kubernetes-object-value-props-builder function buildes out new instances of 
KubernetesObjectValueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `jsonPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-path` |
| `objectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-name` |
| `objectNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-namespace` |
| `objectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (KubernetesObjectValueProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :json-path)]
      (. builder jsonPath data))
    (when-let [data (lookup-entry config id :object-name)]
      (. builder objectName data))
    (when-let [data (lookup-entry config id :object-namespace)]
      (. builder objectNamespace data))
    (when-let [data (lookup-entry config id :object-type)]
      (. builder objectType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn kubernetes-patch-builder
  "The kubernetes-patch-builder function buildes out new instances of 
KubernetesPatch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyPatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:apply-patch` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `patchType` | software.amazon.awscdk.services.eks.PatchType | [[cdk.api.services.eks/patch-type]] | `:patch-type` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `resourceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-namespace` |
| `restorePatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-patch` |"
  [stack id config]
  (let [builder (KubernetesPatch$Builder/create stack id)]
    (when-let [data (lookup-entry config id :apply-patch)]
      (. builder applyPatch data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (patch-type config id :patch-type)]
      (. builder patchType data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :resource-namespace)]
      (. builder resourceNamespace data))
    (when-let [data (lookup-entry config id :restore-patch)]
      (. builder restorePatch data))
    (.build builder)))


(defn kubernetes-patch-props-builder
  "The kubernetes-patch-props-builder function buildes out new instances of 
KubernetesPatchProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyPatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:apply-patch` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `patchType` | software.amazon.awscdk.services.eks.PatchType | [[cdk.api.services.eks/patch-type]] | `:patch-type` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `resourceNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-namespace` |
| `restorePatch` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-patch` |"
  [stack id config]
  (let [builder (KubernetesPatchProps$Builder.)]
    (when-let [data (lookup-entry config id :apply-patch)]
      (. builder applyPatch data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (patch-type config id :patch-type)]
      (. builder patchType data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :resource-namespace)]
      (. builder resourceNamespace data))
    (when-let [data (lookup-entry config id :restore-patch)]
      (. builder restorePatch data))
    (.build builder)))


(defn launch-template-spec-builder
  "The launch-template-spec-builder function buildes out new instances of 
LaunchTemplateSpec$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (LaunchTemplateSpec$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn nodegroup-builder
  "The nodegroup-builder function buildes out new instances of 
Nodegroup$Builder using the provided configuration.  Each field is set as follows:

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
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |"
  [stack id config]
  (let [builder (Nodegroup$Builder/create stack id)]
    (when-let [data (nodegroup-ami-type config id :ami-type)]
      (. builder amiType data))
    (when-let [data (capacity-type config id :capacity-type)]
      (. builder capacityType data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-size)]
      (. builder desiredSize data))
    (when-let [data (lookup-entry config id :disk-size)]
      (. builder diskSize data))
    (when-let [data (lookup-entry config id :force-update)]
      (. builder forceUpdate data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :launch-template-spec)]
      (. builder launchTemplateSpec data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :max-unavailable)]
      (. builder maxUnavailable data))
    (when-let [data (lookup-entry config id :max-unavailable-percentage)]
      (. builder maxUnavailablePercentage data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :node-role)]
      (. builder nodeRole data))
    (when-let [data (lookup-entry config id :nodegroup-name)]
      (. builder nodegroupName data))
    (when-let [data (lookup-entry config id :release-version)]
      (. builder releaseVersion data))
    (when-let [data (lookup-entry config id :remote-access)]
      (. builder remoteAccess data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :taints)]
      (. builder taints data))
    (.build builder)))


(defn nodegroup-options-builder
  "The nodegroup-options-builder function buildes out new instances of 
NodegroupOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |"
  [stack id config]
  (let [builder (NodegroupOptions$Builder.)]
    (when-let [data (nodegroup-ami-type config id :ami-type)]
      (. builder amiType data))
    (when-let [data (capacity-type config id :capacity-type)]
      (. builder capacityType data))
    (when-let [data (lookup-entry config id :desired-size)]
      (. builder desiredSize data))
    (when-let [data (lookup-entry config id :disk-size)]
      (. builder diskSize data))
    (when-let [data (lookup-entry config id :force-update)]
      (. builder forceUpdate data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :launch-template-spec)]
      (. builder launchTemplateSpec data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :max-unavailable)]
      (. builder maxUnavailable data))
    (when-let [data (lookup-entry config id :max-unavailable-percentage)]
      (. builder maxUnavailablePercentage data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :node-role)]
      (. builder nodeRole data))
    (when-let [data (lookup-entry config id :nodegroup-name)]
      (. builder nodegroupName data))
    (when-let [data (lookup-entry config id :release-version)]
      (. builder releaseVersion data))
    (when-let [data (lookup-entry config id :remote-access)]
      (. builder remoteAccess data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :taints)]
      (. builder taints data))
    (.build builder)))


(defn nodegroup-props-builder
  "The nodegroup-props-builder function buildes out new instances of 
NodegroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `taints` | java.util.List | [[cdk.support/lookup-entry]] | `:taints` |"
  [stack id config]
  (let [builder (NodegroupProps$Builder.)]
    (when-let [data (nodegroup-ami-type config id :ami-type)]
      (. builder amiType data))
    (when-let [data (capacity-type config id :capacity-type)]
      (. builder capacityType data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-size)]
      (. builder desiredSize data))
    (when-let [data (lookup-entry config id :disk-size)]
      (. builder diskSize data))
    (when-let [data (lookup-entry config id :force-update)]
      (. builder forceUpdate data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :launch-template-spec)]
      (. builder launchTemplateSpec data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :max-unavailable)]
      (. builder maxUnavailable data))
    (when-let [data (lookup-entry config id :max-unavailable-percentage)]
      (. builder maxUnavailablePercentage data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :node-role)]
      (. builder nodeRole data))
    (when-let [data (lookup-entry config id :nodegroup-name)]
      (. builder nodegroupName data))
    (when-let [data (lookup-entry config id :release-version)]
      (. builder releaseVersion data))
    (when-let [data (lookup-entry config id :remote-access)]
      (. builder remoteAccess data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :taints)]
      (. builder taints data))
    (.build builder)))


(defn nodegroup-remote-access-builder
  "The nodegroup-remote-access-builder function buildes out new instances of 
NodegroupRemoteAccess$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:source-security-groups` |
| `sshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key-name` |"
  [stack id config]
  (let [builder (NodegroupRemoteAccess$Builder.)]
    (when-let [data (lookup-entry config id :source-security-groups)]
      (. builder sourceSecurityGroups data))
    (when-let [data (lookup-entry config id :ssh-key-name)]
      (. builder sshKeyName data))
    (.build builder)))


(defn open-id-connect-provider-builder
  "The open-id-connect-provider-builder function buildes out new instances of 
OpenIdConnectProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (OpenIdConnectProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn open-id-connect-provider-props-builder
  "The open-id-connect-provider-props-builder function buildes out new instances of 
OpenIdConnectProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (OpenIdConnectProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn selector-builder
  "The selector-builder function buildes out new instances of 
Selector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (Selector$Builder.)]
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn service-account-builder
  "The service-account-builder function buildes out new instances of 
ServiceAccount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (ServiceAccount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :annotations)]
      (. builder annotations data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn service-account-options-builder
  "The service-account-options-builder function buildes out new instances of 
ServiceAccountOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (ServiceAccountOptions$Builder.)]
    (when-let [data (lookup-entry config id :annotations)]
      (. builder annotations data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn service-account-props-builder
  "The service-account-props-builder function buildes out new instances of 
ServiceAccountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `annotations` | java.util.Map | [[cdk.support/lookup-entry]] | `:annotations` |
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (ServiceAccountProps$Builder.)]
    (when-let [data (lookup-entry config id :annotations)]
      (. builder annotations data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn service-load-balancer-address-options-builder
  "The service-load-balancer-address-options-builder function buildes out new instances of 
ServiceLoadBalancerAddressOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (ServiceLoadBalancerAddressOptions$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn taint-spec-builder
  "The taint-spec-builder function buildes out new instances of 
TaintSpec$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `effect` | software.amazon.awscdk.services.eks.TaintEffect | [[cdk.api.services.eks/taint-effect]] | `:effect` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (TaintSpec$Builder.)]
    (when-let [data (taint-effect config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))