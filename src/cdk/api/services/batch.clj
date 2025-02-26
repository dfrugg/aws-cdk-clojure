(ns cdk.api.services.batch
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.batch package. "
  (:require [cdk.api.services.ecs :refer [fargate-platform-version]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.batch Action
                                                  AllocationStrategy
                                                  CfnComputeEnvironment$Builder
                                                  CfnComputeEnvironment$ComputeResourcesProperty$Builder
                                                  CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder
                                                  CfnComputeEnvironment$EksConfigurationProperty$Builder
                                                  CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder
                                                  CfnComputeEnvironment$UpdatePolicyProperty$Builder
                                                  CfnComputeEnvironmentProps$Builder
                                                  CfnJobDefinition$AuthorizationConfigProperty$Builder
                                                  CfnJobDefinition$Builder
                                                  CfnJobDefinition$ContainerPropertiesProperty$Builder
                                                  CfnJobDefinition$DeviceProperty$Builder
                                                  CfnJobDefinition$EcsPropertiesProperty$Builder
                                                  CfnJobDefinition$EcsTaskPropertiesProperty$Builder
                                                  CfnJobDefinition$EfsVolumeConfigurationProperty$Builder
                                                  CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder
                                                  CfnJobDefinition$EksContainerProperty$Builder
                                                  CfnJobDefinition$EksContainerVolumeMountProperty$Builder
                                                  CfnJobDefinition$EksPropertiesProperty$Builder
                                                  CfnJobDefinition$EksSecretProperty$Builder
                                                  CfnJobDefinition$EksVolumeProperty$Builder
                                                  CfnJobDefinition$EmptyDirProperty$Builder
                                                  CfnJobDefinition$EnvironmentProperty$Builder
                                                  CfnJobDefinition$EphemeralStorageProperty$Builder
                                                  CfnJobDefinition$EvaluateOnExitProperty$Builder
                                                  CfnJobDefinition$FargatePlatformConfigurationProperty$Builder
                                                  CfnJobDefinition$HostPathProperty$Builder
                                                  CfnJobDefinition$ImagePullSecretProperty$Builder
                                                  CfnJobDefinition$LinuxParametersProperty$Builder
                                                  CfnJobDefinition$LogConfigurationProperty$Builder
                                                  CfnJobDefinition$MetadataProperty$Builder
                                                  CfnJobDefinition$MountPointsProperty$Builder
                                                  CfnJobDefinition$NetworkConfigurationProperty$Builder
                                                  CfnJobDefinition$NodePropertiesProperty$Builder
                                                  CfnJobDefinition$NodeRangePropertyProperty$Builder
                                                  CfnJobDefinition$PodPropertiesProperty$Builder
                                                  CfnJobDefinition$RepositoryCredentialsProperty$Builder
                                                  CfnJobDefinition$ResourceRequirementProperty$Builder
                                                  CfnJobDefinition$ResourcesProperty$Builder
                                                  CfnJobDefinition$RetryStrategyProperty$Builder
                                                  CfnJobDefinition$RuntimePlatformProperty$Builder
                                                  CfnJobDefinition$SecretProperty$Builder
                                                  CfnJobDefinition$SecurityContextProperty$Builder
                                                  CfnJobDefinition$TaskContainerDependencyProperty$Builder
                                                  CfnJobDefinition$TaskContainerPropertiesProperty$Builder
                                                  CfnJobDefinition$TimeoutProperty$Builder
                                                  CfnJobDefinition$TmpfsProperty$Builder
                                                  CfnJobDefinition$UlimitProperty$Builder
                                                  CfnJobDefinition$VolumesHostProperty$Builder
                                                  CfnJobDefinition$VolumesProperty$Builder
                                                  CfnJobDefinitionProps$Builder
                                                  CfnJobQueue$Builder
                                                  CfnJobQueue$ComputeEnvironmentOrderProperty$Builder
                                                  CfnJobQueue$JobStateTimeLimitActionProperty$Builder
                                                  CfnJobQueueProps$Builder
                                                  CfnSchedulingPolicy$Builder
                                                  CfnSchedulingPolicy$FairsharePolicyProperty$Builder
                                                  CfnSchedulingPolicy$ShareAttributesProperty$Builder
                                                  CfnSchedulingPolicyProps$Builder
                                                  ComputeEnvironmentProps$Builder
                                                  CustomReason$Builder
                                                  Device$Builder
                                                  DevicePermission
                                                  DnsPolicy
                                                  EcsContainerDefinitionProps$Builder
                                                  EcsEc2ContainerDefinition$Builder
                                                  EcsEc2ContainerDefinitionProps$Builder
                                                  EcsFargateContainerDefinition$Builder
                                                  EcsFargateContainerDefinitionProps$Builder
                                                  EcsJobDefinition$Builder
                                                  EcsJobDefinitionProps$Builder
                                                  EcsMachineImage$Builder
                                                  EcsMachineImageType
                                                  EcsVolumeOptions$Builder
                                                  EfsVolume$Builder
                                                  EfsVolumeOptions$Builder
                                                  EksContainerDefinition$Builder
                                                  EksContainerDefinitionProps$Builder
                                                  EksJobDefinition$Builder
                                                  EksJobDefinitionProps$Builder
                                                  EksMachineImage$Builder
                                                  EksMachineImageType
                                                  EksVolumeOptions$Builder
                                                  EmptyDirMediumType
                                                  EmptyDirVolume$Builder
                                                  EmptyDirVolumeOptions$Builder
                                                  FairshareSchedulingPolicy$Builder
                                                  FairshareSchedulingPolicyProps$Builder
                                                  FargateComputeEnvironment$Builder
                                                  FargateComputeEnvironmentProps$Builder
                                                  HostPathVolume$Builder
                                                  HostPathVolumeOptions$Builder
                                                  HostVolume$Builder
                                                  HostVolumeOptions$Builder
                                                  ImagePullPolicy
                                                  JobDefinitionProps$Builder
                                                  JobQueue$Builder
                                                  JobQueueProps$Builder
                                                  JobStateTimeLimitAction$Builder
                                                  JobStateTimeLimitActionsAction
                                                  JobStateTimeLimitActionsReason
                                                  JobStateTimeLimitActionsState
                                                  LinuxParameters$Builder
                                                  LinuxParametersProps$Builder
                                                  ManagedComputeEnvironmentProps$Builder
                                                  ManagedEc2EcsComputeEnvironment$Builder
                                                  ManagedEc2EcsComputeEnvironmentProps$Builder
                                                  ManagedEc2EksComputeEnvironment$Builder
                                                  ManagedEc2EksComputeEnvironmentProps$Builder
                                                  MultiNodeContainer$Builder
                                                  MultiNodeJobDefinition$Builder
                                                  MultiNodeJobDefinitionProps$Builder
                                                  OrderedComputeEnvironment$Builder
                                                  SecretPathVolume$Builder
                                                  SecretPathVolumeOptions$Builder
                                                  SecretVersionInfo$Builder
                                                  Share$Builder
                                                  Tmpfs$Builder
                                                  TmpfsMountOption
                                                  Ulimit$Builder
                                                  UlimitName
                                                  UnmanagedComputeEnvironment$Builder
                                                  UnmanagedComputeEnvironmentProps$Builder]))


(defn action
  "The `action` function data interprets values in the provided config data into a 
`Action` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Action` - the value is returned.
* is `:retry` - `Action/RETRY` is returned
* is `:exit` - `Action/EXIT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Action data) data
      (= :retry data) Action/RETRY
      (= :exit data) Action/EXIT)))


(defn allocation-strategy
  "The `allocation-strategy` function data interprets values in the provided config data into a 
`AllocationStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AllocationStrategy` - the value is returned.
* is `:spot-capacity-optimized` - `AllocationStrategy/SPOT_CAPACITY_OPTIMIZED` is returned
* is `:best-fit-progressive` - `AllocationStrategy/BEST_FIT_PROGRESSIVE` is returned
* is `:best-fit` - `AllocationStrategy/BEST_FIT` is returned
* is `:spot-price-capacity-optimized` - `AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AllocationStrategy data) data
      (= :spot-capacity-optimized data) AllocationStrategy/SPOT_CAPACITY_OPTIMIZED
      (= :best-fit-progressive data) AllocationStrategy/BEST_FIT_PROGRESSIVE
      (= :best-fit data) AllocationStrategy/BEST_FIT
      (= :spot-price-capacity-optimized data) AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED)))


(defn device-permission
  "The `device-permission` function data interprets values in the provided config data into a 
`DevicePermission` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DevicePermission` - the value is returned.
* is `:read` - `DevicePermission/READ` is returned
* is `:write` - `DevicePermission/WRITE` is returned
* is `:mknod` - `DevicePermission/MKNOD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DevicePermission data) data
      (= :read data) DevicePermission/READ
      (= :write data) DevicePermission/WRITE
      (= :mknod data) DevicePermission/MKNOD)))


(defn dns-policy
  "The `dns-policy` function data interprets values in the provided config data into a 
`DnsPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DnsPolicy` - the value is returned.
* is `:cluster-first-with-host-net` - `DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET` is returned
* is `:cluster-first` - `DnsPolicy/CLUSTER_FIRST` is returned
* is `:default` - `DnsPolicy/DEFAULT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DnsPolicy data) data
      (= :cluster-first-with-host-net data) DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET
      (= :cluster-first data) DnsPolicy/CLUSTER_FIRST
      (= :default data) DnsPolicy/DEFAULT)))


(defn ecs-machine-image-type
  "The `ecs-machine-image-type` function data interprets values in the provided config data into a 
`EcsMachineImageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EcsMachineImageType` - the value is returned.
* is `:ecs-al2-nvidia` - `EcsMachineImageType/ECS_AL2_NVIDIA` is returned
* is `:ecs-al2` - `EcsMachineImageType/ECS_AL2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EcsMachineImageType data) data
      (= :ecs-al2-nvidia data) EcsMachineImageType/ECS_AL2_NVIDIA
      (= :ecs-al2 data) EcsMachineImageType/ECS_AL2)))


(defn eks-machine-image-type
  "The `eks-machine-image-type` function data interprets values in the provided config data into a 
`EksMachineImageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EksMachineImageType` - the value is returned.
* is `:eks-al2-nvidia` - `EksMachineImageType/EKS_AL2_NVIDIA` is returned
* is `:eks-al2` - `EksMachineImageType/EKS_AL2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EksMachineImageType data) data
      (= :eks-al2-nvidia data) EksMachineImageType/EKS_AL2_NVIDIA
      (= :eks-al2 data) EksMachineImageType/EKS_AL2)))


(defn empty-dir-medium-type
  "The `empty-dir-medium-type` function data interprets values in the provided config data into a 
`EmptyDirMediumType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmptyDirMediumType` - the value is returned.
* is `:disk` - `EmptyDirMediumType/DISK` is returned
* is `:memory` - `EmptyDirMediumType/MEMORY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmptyDirMediumType data) data
      (= :disk data) EmptyDirMediumType/DISK
      (= :memory data) EmptyDirMediumType/MEMORY)))


(defn image-pull-policy
  "The `image-pull-policy` function data interprets values in the provided config data into a 
`ImagePullPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ImagePullPolicy` - the value is returned.
* is `:never` - `ImagePullPolicy/NEVER` is returned
* is `:if-not-present` - `ImagePullPolicy/IF_NOT_PRESENT` is returned
* is `:always` - `ImagePullPolicy/ALWAYS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ImagePullPolicy data) data
      (= :never data) ImagePullPolicy/NEVER
      (= :if-not-present data) ImagePullPolicy/IF_NOT_PRESENT
      (= :always data) ImagePullPolicy/ALWAYS)))


(defn job-state-time-limit-actions-action
  "The `job-state-time-limit-actions-action` function data interprets values in the provided config data into a 
`JobStateTimeLimitActionsAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JobStateTimeLimitActionsAction` - the value is returned.
* is `:cancel` - `JobStateTimeLimitActionsAction/CANCEL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JobStateTimeLimitActionsAction data) data
      (= :cancel data) JobStateTimeLimitActionsAction/CANCEL)))


(defn job-state-time-limit-actions-reason
  "The `job-state-time-limit-actions-reason` function data interprets values in the provided config data into a 
`JobStateTimeLimitActionsReason` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JobStateTimeLimitActionsReason` - the value is returned.
* is `:compute-environment-max-resource` - `JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE` is returned
* is `:insufficient-instance-capacity` - `JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY` is returned
* is `:job-resource-requirement` - `JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JobStateTimeLimitActionsReason data) data
      (= :compute-environment-max-resource data) JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE
      (= :insufficient-instance-capacity data) JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY
      (= :job-resource-requirement data) JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT)))


(defn job-state-time-limit-actions-state
  "The `job-state-time-limit-actions-state` function data interprets values in the provided config data into a 
`JobStateTimeLimitActionsState` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `JobStateTimeLimitActionsState` - the value is returned.
* is `:runnable` - `JobStateTimeLimitActionsState/RUNNABLE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? JobStateTimeLimitActionsState data) data
      (= :runnable data) JobStateTimeLimitActionsState/RUNNABLE)))


(defn tmpfs-mount-option
  "The `tmpfs-mount-option` function data interprets values in the provided config data into a 
`TmpfsMountOption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TmpfsMountOption` - the value is returned.
* is `:rbind` - `TmpfsMountOption/RBIND` is returned
* is `:strictatime` - `TmpfsMountOption/STRICTATIME` is returned
* is `:slave` - `TmpfsMountOption/SLAVE` is returned
* is `:rslave` - `TmpfsMountOption/RSLAVE` is returned
* is `:nosuid` - `TmpfsMountOption/NOSUID` is returned
* is `:nomand` - `TmpfsMountOption/NOMAND` is returned
* is `:rshared` - `TmpfsMountOption/RSHARED` is returned
* is `:nr-blocks` - `TmpfsMountOption/NR_BLOCKS` is returned
* is `:atime` - `TmpfsMountOption/ATIME` is returned
* is `:shared` - `TmpfsMountOption/SHARED` is returned
* is `:norelatime` - `TmpfsMountOption/NORELATIME` is returned
* is `:mode` - `TmpfsMountOption/MODE` is returned
* is `:noexec` - `TmpfsMountOption/NOEXEC` is returned
* is `:sync` - `TmpfsMountOption/SYNC` is returned
* is `:uid` - `TmpfsMountOption/UID` is returned
* is `:suid` - `TmpfsMountOption/SUID` is returned
* is `:defaults` - `TmpfsMountOption/DEFAULTS` is returned
* is `:rprivate` - `TmpfsMountOption/RPRIVATE` is returned
* is `:exec` - `TmpfsMountOption/EXEC` is returned
* is `:nostrictatime` - `TmpfsMountOption/NOSTRICTATIME` is returned
* is `:noatime` - `TmpfsMountOption/NOATIME` is returned
* is `:nodev` - `TmpfsMountOption/NODEV` is returned
* is `:unbindable` - `TmpfsMountOption/UNBINDABLE` is returned
* is `:mpol` - `TmpfsMountOption/MPOL` is returned
* is `:ro` - `TmpfsMountOption/RO` is returned
* is `:dirsync` - `TmpfsMountOption/DIRSYNC` is returned
* is `:nodiratime` - `TmpfsMountOption/NODIRATIME` is returned
* is `:remount` - `TmpfsMountOption/REMOUNT` is returned
* is `:mand` - `TmpfsMountOption/MAND` is returned
* is `:async` - `TmpfsMountOption/ASYNC` is returned
* is `:relatime` - `TmpfsMountOption/RELATIME` is returned
* is `:private` - `TmpfsMountOption/PRIVATE` is returned
* is `:runbindable` - `TmpfsMountOption/RUNBINDABLE` is returned
* is `:bind` - `TmpfsMountOption/BIND` is returned
* is `:dev` - `TmpfsMountOption/DEV` is returned
* is `:diratime` - `TmpfsMountOption/DIRATIME` is returned
* is `:nr-inodes` - `TmpfsMountOption/NR_INODES` is returned
* is `:rw` - `TmpfsMountOption/RW` is returned
* is `:gid` - `TmpfsMountOption/GID` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TmpfsMountOption data) data
      (= :rbind data) TmpfsMountOption/RBIND
      (= :strictatime data) TmpfsMountOption/STRICTATIME
      (= :slave data) TmpfsMountOption/SLAVE
      (= :rslave data) TmpfsMountOption/RSLAVE
      (= :nosuid data) TmpfsMountOption/NOSUID
      (= :nomand data) TmpfsMountOption/NOMAND
      (= :rshared data) TmpfsMountOption/RSHARED
      (= :nr-blocks data) TmpfsMountOption/NR_BLOCKS
      (= :atime data) TmpfsMountOption/ATIME
      (= :shared data) TmpfsMountOption/SHARED
      (= :norelatime data) TmpfsMountOption/NORELATIME
      (= :mode data) TmpfsMountOption/MODE
      (= :noexec data) TmpfsMountOption/NOEXEC
      (= :sync data) TmpfsMountOption/SYNC
      (= :uid data) TmpfsMountOption/UID
      (= :suid data) TmpfsMountOption/SUID
      (= :defaults data) TmpfsMountOption/DEFAULTS
      (= :rprivate data) TmpfsMountOption/RPRIVATE
      (= :exec data) TmpfsMountOption/EXEC
      (= :nostrictatime data) TmpfsMountOption/NOSTRICTATIME
      (= :noatime data) TmpfsMountOption/NOATIME
      (= :nodev data) TmpfsMountOption/NODEV
      (= :unbindable data) TmpfsMountOption/UNBINDABLE
      (= :mpol data) TmpfsMountOption/MPOL
      (= :ro data) TmpfsMountOption/RO
      (= :dirsync data) TmpfsMountOption/DIRSYNC
      (= :nodiratime data) TmpfsMountOption/NODIRATIME
      (= :remount data) TmpfsMountOption/REMOUNT
      (= :mand data) TmpfsMountOption/MAND
      (= :async data) TmpfsMountOption/ASYNC
      (= :relatime data) TmpfsMountOption/RELATIME
      (= :private data) TmpfsMountOption/PRIVATE
      (= :runbindable data) TmpfsMountOption/RUNBINDABLE
      (= :bind data) TmpfsMountOption/BIND
      (= :dev data) TmpfsMountOption/DEV
      (= :diratime data) TmpfsMountOption/DIRATIME
      (= :nr-inodes data) TmpfsMountOption/NR_INODES
      (= :rw data) TmpfsMountOption/RW
      (= :gid data) TmpfsMountOption/GID)))


(defn ulimit-name
  "The `ulimit-name` function data interprets values in the provided config data into a 
`UlimitName` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `UlimitName` - the value is returned.
* is `:data` - `UlimitName/DATA` is returned
* is `:rttime` - `UlimitName/RTTIME` is returned
* is `:locks` - `UlimitName/LOCKS` is returned
* is `:msgqueue` - `UlimitName/MSGQUEUE` is returned
* is `:nice` - `UlimitName/NICE` is returned
* is `:memlock` - `UlimitName/MEMLOCK` is returned
* is `:nproc` - `UlimitName/NPROC` is returned
* is `:stack` - `UlimitName/STACK` is returned
* is `:sigpending` - `UlimitName/SIGPENDING` is returned
* is `:core` - `UlimitName/CORE` is returned
* is `:fsize` - `UlimitName/FSIZE` is returned
* is `:nofile` - `UlimitName/NOFILE` is returned
* is `:rtprio` - `UlimitName/RTPRIO` is returned
* is `:cpu` - `UlimitName/CPU` is returned
* is `:rss` - `UlimitName/RSS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? UlimitName data) data
      (= :data data) UlimitName/DATA
      (= :rttime data) UlimitName/RTTIME
      (= :locks data) UlimitName/LOCKS
      (= :msgqueue data) UlimitName/MSGQUEUE
      (= :nice data) UlimitName/NICE
      (= :memlock data) UlimitName/MEMLOCK
      (= :nproc data) UlimitName/NPROC
      (= :stack data) UlimitName/STACK
      (= :sigpending data) UlimitName/SIGPENDING
      (= :core data) UlimitName/CORE
      (= :fsize data) UlimitName/FSIZE
      (= :nofile data) UlimitName/NOFILE
      (= :rtprio data) UlimitName/RTPRIO
      (= :cpu data) UlimitName/CPU
      (= :rss data) UlimitName/RSS)))


(defn build-cfn-compute-environment-builder
  "The build-cfn-compute-environment-builder function updates a CfnComputeEnvironment$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `computeResources` | software.amazon.awscdk.services.batch.CfnComputeEnvironment$ComputeResourcesProperty | [[cdk.support/lookup-entry]] | `:compute-resources` |
| `eksConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eks-configuration` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |
| `updatePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-policy` |
"
  [^CfnComputeEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :compute-resources)]
    (. builder computeResources data))
  (when-some [data (lookup-entry config id :eks-configuration)]
    (. builder eksConfiguration data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :unmanagedv-cpus)]
    (. builder unmanagedvCpus data))
  (when-some [data (lookup-entry config id :update-policy)]
    (. builder updatePolicy data))
  (.build builder))


(defn cfn-compute-environment-builder
  "Creates a  `CfnComputeEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-compute-environment-builder (CfnComputeEnvironment$Builder/create scope (name id)) id config))


(defn build-cfn-compute-environment-compute-resources-property-builder
  "The build-cfn-compute-environment-compute-resources-property-builder function updates a CfnComputeEnvironment$ComputeResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$ComputeResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `bidPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-percentage` |
| `desiredvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desiredv-cpus` |
| `ec2Configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-configuration` |
| `ec2KeyPair` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-key-pair` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `minvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minv-cpus` |
| `placementGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `spotIamFleetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-iam-fleet-role` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
"
  [^CfnComputeEnvironment$ComputeResourcesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :bid-percentage)]
    (. builder bidPercentage data))
  (when-some [data (lookup-entry config id :desiredv-cpus)]
    (. builder desiredvCpus data))
  (when-some [data (lookup-entry config id :ec2-configuration)]
    (. builder ec2Configuration data))
  (when-some [data (lookup-entry config id :ec2-key-pair)]
    (. builder ec2KeyPair data))
  (when-some [data (lookup-entry config id :image-id)]
    (. builder imageId data))
  (when-some [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :minv-cpus)]
    (. builder minvCpus data))
  (when-some [data (lookup-entry config id :placement-group)]
    (. builder placementGroup data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :spot-iam-fleet-role)]
    (. builder spotIamFleetRole data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (.build builder))


(defn cfn-compute-environment-compute-resources-property-builder
  "Creates a  `CfnComputeEnvironment$ComputeResourcesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-compute-resources-property-builder (new CfnComputeEnvironment$ComputeResourcesProperty$Builder) id config))


(defn build-cfn-compute-environment-ec2-configuration-object-property-builder
  "The build-cfn-compute-environment-ec2-configuration-object-property-builder function updates a CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageIdOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id-override` |
| `imageKubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-kubernetes-version` |
| `imageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-type` |
"
  [^CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-id-override)]
    (. builder imageIdOverride data))
  (when-some [data (lookup-entry config id :image-kubernetes-version)]
    (. builder imageKubernetesVersion data))
  (when-some [data (lookup-entry config id :image-type)]
    (. builder imageType data))
  (.build builder))


(defn cfn-compute-environment-ec2-configuration-object-property-builder
  "Creates a  `CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-ec2-configuration-object-property-builder (new CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder) id config))


(defn build-cfn-compute-environment-eks-configuration-property-builder
  "The build-cfn-compute-environment-eks-configuration-property-builder function updates a CfnComputeEnvironment$EksConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$EksConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-cluster-arn` |
| `kubernetesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-namespace` |
"
  [^CfnComputeEnvironment$EksConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eks-cluster-arn)]
    (. builder eksClusterArn data))
  (when-some [data (lookup-entry config id :kubernetes-namespace)]
    (. builder kubernetesNamespace data))
  (.build builder))


(defn cfn-compute-environment-eks-configuration-property-builder
  "Creates a  `CfnComputeEnvironment$EksConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-eks-configuration-property-builder (new CfnComputeEnvironment$EksConfigurationProperty$Builder) id config))


(defn build-cfn-compute-environment-launch-template-specification-property-builder
  "The build-cfn-compute-environment-launch-template-specification-property-builder function updates a CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :launch-template-id)]
    (. builder launchTemplateId data))
  (when-some [data (lookup-entry config id :launch-template-name)]
    (. builder launchTemplateName data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-compute-environment-launch-template-specification-property-builder
  "Creates a  `CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-launch-template-specification-property-builder (new CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder) id config))


(defn build-cfn-compute-environment-props-builder
  "The build-cfn-compute-environment-props-builder function updates a CfnComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `computeResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-resources` |
| `eksConfiguration` | software.amazon.awscdk.services.batch.CfnComputeEnvironment$EksConfigurationProperty | [[cdk.support/lookup-entry]] | `:eks-configuration` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `serviceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |
| `updatePolicy` | software.amazon.awscdk.services.batch.CfnComputeEnvironment$UpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:update-policy` |
"
  [^CfnComputeEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :compute-resources)]
    (. builder computeResources data))
  (when-some [data (lookup-entry config id :eks-configuration)]
    (. builder eksConfiguration data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :unmanagedv-cpus)]
    (. builder unmanagedvCpus data))
  (when-some [data (lookup-entry config id :update-policy)]
    (. builder updatePolicy data))
  (.build builder))


(defn cfn-compute-environment-props-builder
  "Creates a  `CfnComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-props-builder (new CfnComputeEnvironmentProps$Builder) id config))


(defn build-cfn-compute-environment-update-policy-property-builder
  "The build-cfn-compute-environment-update-policy-property-builder function updates a CfnComputeEnvironment$UpdatePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnComputeEnvironment$UpdatePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobExecutionTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:job-execution-timeout-minutes` |
| `terminateJobsOnUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:terminate-jobs-on-update` |
"
  [^CfnComputeEnvironment$UpdatePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :job-execution-timeout-minutes)]
    (. builder jobExecutionTimeoutMinutes data))
  (when-some [data (lookup-entry config id :terminate-jobs-on-update)]
    (. builder terminateJobsOnUpdate data))
  (.build builder))


(defn cfn-compute-environment-update-policy-property-builder
  "Creates a  `CfnComputeEnvironment$UpdatePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-compute-environment-update-policy-property-builder (new CfnComputeEnvironment$UpdatePolicyProperty$Builder) id config))


(defn build-cfn-job-definition-authorization-config-property-builder
  "The build-cfn-job-definition-authorization-config-property-builder function updates a CfnJobDefinition$AuthorizationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$AuthorizationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |
"
  [^CfnJobDefinition$AuthorizationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-some [data (lookup-entry config id :iam)]
    (. builder iam data))
  (.build builder))


(defn cfn-job-definition-authorization-config-property-builder
  "Creates a  `CfnJobDefinition$AuthorizationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-authorization-config-property-builder (new CfnJobDefinition$AuthorizationConfigProperty$Builder) id config))


(defn build-cfn-job-definition-builder
  "The build-cfn-job-definition-builder function updates a CfnJobDefinition$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$ContainerPropertiesProperty | [[cdk.support/lookup-entry]] | `:container-properties` |
| `ecsProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$EcsPropertiesProperty | [[cdk.support/lookup-entry]] | `:ecs-properties` |
| `eksProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eks-properties` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `nodeProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$NodePropertiesProperty | [[cdk.support/lookup-entry]] | `:node-properties` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `platformCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:platform-capabilities` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-strategy` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | software.amazon.awscdk.services.batch.CfnJobDefinition$TimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnJobDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :container-properties)]
    (. builder containerProperties data))
  (when-some [data (lookup-entry config id :ecs-properties)]
    (. builder ecsProperties data))
  (when-some [data (lookup-entry config id :eks-properties)]
    (. builder eksProperties data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :node-properties)]
    (. builder nodeProperties data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :platform-capabilities)]
    (. builder platformCapabilities data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-strategy)]
    (. builder retryStrategy data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-job-definition-builder
  "Creates a  `CfnJobDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-job-definition-builder (CfnJobDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-job-definition-container-properties-property-builder
  "The build-cfn-job-definition-container-properties-property-builder function updates a CfnJobDefinition$ContainerPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$ContainerPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorage` | software.amazon.awscdk.services.batch.CfnJobDefinition$EphemeralStorageProperty | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `fargatePlatformConfiguration` | software.amazon.awscdk.services.batch.CfnJobDefinition$FargatePlatformConfigurationProperty | [[cdk.support/lookup-entry]] | `:fargate-platform-configuration` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `jobRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-role-arn` |
| `linuxParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logConfiguration` | software.amazon.awscdk.services.batch.CfnJobDefinition$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `mountPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-points` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `privileged` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `repositoryCredentials` | software.amazon.awscdk.services.batch.CfnJobDefinition$RepositoryCredentialsProperty | [[cdk.support/lookup-entry]] | `:repository-credentials` |
| `resourceRequirements` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-requirements` |
| `runtimePlatform` | software.amazon.awscdk.services.batch.CfnJobDefinition$RuntimePlatformProperty | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `secrets` | java.util.List | [[cdk.support/lookup-entry]] | `:secrets` |
| `ulimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `vcpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vcpus` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnJobDefinition$ContainerPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :fargate-platform-configuration)]
    (. builder fargatePlatformConfiguration data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :job-role-arn)]
    (. builder jobRoleArn data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :mount-points)]
    (. builder mountPoints data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :repository-credentials)]
    (. builder repositoryCredentials data))
  (when-some [data (lookup-entry config id :resource-requirements)]
    (. builder resourceRequirements data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :ulimits)]
    (. builder ulimits data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :vcpus)]
    (. builder vcpus data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-job-definition-container-properties-property-builder
  "Creates a  `CfnJobDefinition$ContainerPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-container-properties-property-builder (new CfnJobDefinition$ContainerPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-device-property-builder
  "The build-cfn-job-definition-device-property-builder function updates a CfnJobDefinition$DeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$DeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
"
  [^CfnJobDefinition$DeviceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn cfn-job-definition-device-property-builder
  "Creates a  `CfnJobDefinition$DeviceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-device-property-builder (new CfnJobDefinition$DeviceProperty$Builder) id config))


(defn build-cfn-job-definition-ecs-properties-property-builder
  "The build-cfn-job-definition-ecs-properties-property-builder function updates a CfnJobDefinition$EcsPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EcsPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-properties` |
"
  [^CfnJobDefinition$EcsPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :task-properties)]
    (. builder taskProperties data))
  (.build builder))


(defn cfn-job-definition-ecs-properties-property-builder
  "Creates a  `CfnJobDefinition$EcsPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-ecs-properties-property-builder (new CfnJobDefinition$EcsPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-ecs-task-properties-property-builder
  "The build-cfn-job-definition-ecs-task-properties-property-builder function updates a CfnJobDefinition$EcsTaskPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EcsTaskPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:containers` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `ipcMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipc-mode` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `pidMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-mode` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `runtimePlatform` | software.amazon.awscdk.services.batch.CfnJobDefinition$RuntimePlatformProperty | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-role-arn` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnJobDefinition$EcsTaskPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :ephemeral-storage)]
    (. builder ephemeralStorage data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :ipc-mode)]
    (. builder ipcMode data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :pid-mode)]
    (. builder pidMode data))
  (when-some [data (lookup-entry config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :task-role-arn)]
    (. builder taskRoleArn data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-job-definition-ecs-task-properties-property-builder
  "Creates a  `CfnJobDefinition$EcsTaskPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-ecs-task-properties-property-builder (new CfnJobDefinition$EcsTaskPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-efs-volume-configuration-property-builder
  "The build-cfn-job-definition-efs-volume-configuration-property-builder function updates a CfnJobDefinition$EfsVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EfsVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |
"
  [^CfnJobDefinition$EfsVolumeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authorization-config)]
    (. builder authorizationConfig data))
  (when-some [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-some [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (when-some [data (lookup-entry config id :transit-encryption)]
    (. builder transitEncryption data))
  (when-some [data (lookup-entry config id :transit-encryption-port)]
    (. builder transitEncryptionPort data))
  (.build builder))


(defn cfn-job-definition-efs-volume-configuration-property-builder
  "Creates a  `CfnJobDefinition$EfsVolumeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-efs-volume-configuration-property-builder (new CfnJobDefinition$EfsVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-job-definition-eks-container-environment-variable-property-builder
  "The build-cfn-job-definition-eks-container-environment-variable-property-builder function updates a CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-job-definition-eks-container-environment-variable-property-builder
  "Creates a  `CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-container-environment-variable-property-builder (new CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder) id config))


(defn build-cfn-job-definition-eks-container-property-builder
  "The build-cfn-job-definition-eks-container-property-builder function updates a CfnJobDefinition$EksContainerProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksContainerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `env` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:env` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `imagePullPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-pull-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
| `securityContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-context` |
| `volumeMounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-mounts` |
"
  [^CfnJobDefinition$EksContainerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :image-pull-policy)]
    (. builder imagePullPolicy data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :security-context)]
    (. builder securityContext data))
  (when-some [data (lookup-entry config id :volume-mounts)]
    (. builder volumeMounts data))
  (.build builder))


(defn cfn-job-definition-eks-container-property-builder
  "Creates a  `CfnJobDefinition$EksContainerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-container-property-builder (new CfnJobDefinition$EksContainerProperty$Builder) id config))


(defn build-cfn-job-definition-eks-container-volume-mount-property-builder
  "The build-cfn-job-definition-eks-container-volume-mount-property-builder function updates a CfnJobDefinition$EksContainerVolumeMountProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksContainerVolumeMountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
"
  [^CfnJobDefinition$EksContainerVolumeMountProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (.build builder))


(defn cfn-job-definition-eks-container-volume-mount-property-builder
  "Creates a  `CfnJobDefinition$EksContainerVolumeMountProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-container-volume-mount-property-builder (new CfnJobDefinition$EksContainerVolumeMountProperty$Builder) id config))


(defn build-cfn-job-definition-eks-properties-property-builder
  "The build-cfn-job-definition-eks-properties-property-builder function updates a CfnJobDefinition$EksPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `podProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$PodPropertiesProperty | [[cdk.support/lookup-entry]] | `:pod-properties` |
"
  [^CfnJobDefinition$EksPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pod-properties)]
    (. builder podProperties data))
  (.build builder))


(defn cfn-job-definition-eks-properties-property-builder
  "Creates a  `CfnJobDefinition$EksPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-properties-property-builder (new CfnJobDefinition$EksPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-eks-secret-property-builder
  "The build-cfn-job-definition-eks-secret-property-builder function updates a CfnJobDefinition$EksSecretProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksSecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CfnJobDefinition$EksSecretProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :optional)]
    (. builder optional data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn cfn-job-definition-eks-secret-property-builder
  "Creates a  `CfnJobDefinition$EksSecretProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-secret-property-builder (new CfnJobDefinition$EksSecretProperty$Builder) id config))


(defn build-cfn-job-definition-eks-volume-property-builder
  "The build-cfn-job-definition-eks-volume-property-builder function updates a CfnJobDefinition$EksVolumeProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EksVolumeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyDir` | software.amazon.awscdk.services.batch.CfnJobDefinition$EmptyDirProperty | [[cdk.support/lookup-entry]] | `:empty-dir` |
| `hostPath` | software.amazon.awscdk.services.batch.CfnJobDefinition$HostPathProperty | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secret` | software.amazon.awscdk.services.batch.CfnJobDefinition$EksSecretProperty | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^CfnJobDefinition$EksVolumeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :empty-dir)]
    (. builder emptyDir data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn cfn-job-definition-eks-volume-property-builder
  "Creates a  `CfnJobDefinition$EksVolumeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-eks-volume-property-builder (new CfnJobDefinition$EksVolumeProperty$Builder) id config))


(defn build-cfn-job-definition-empty-dir-property-builder
  "The build-cfn-job-definition-empty-dir-property-builder function updates a CfnJobDefinition$EmptyDirProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EmptyDirProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | java.lang.String | [[cdk.support/lookup-entry]] | `:medium` |
| `sizeLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-limit` |
"
  [^CfnJobDefinition$EmptyDirProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :medium)]
    (. builder medium data))
  (when-some [data (lookup-entry config id :size-limit)]
    (. builder sizeLimit data))
  (.build builder))


(defn cfn-job-definition-empty-dir-property-builder
  "Creates a  `CfnJobDefinition$EmptyDirProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-empty-dir-property-builder (new CfnJobDefinition$EmptyDirProperty$Builder) id config))


(defn build-cfn-job-definition-environment-property-builder
  "The build-cfn-job-definition-environment-property-builder function updates a CfnJobDefinition$EnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJobDefinition$EnvironmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-job-definition-environment-property-builder
  "Creates a  `CfnJobDefinition$EnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-environment-property-builder (new CfnJobDefinition$EnvironmentProperty$Builder) id config))


(defn build-cfn-job-definition-ephemeral-storage-property-builder
  "The build-cfn-job-definition-ephemeral-storage-property-builder function updates a CfnJobDefinition$EphemeralStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EphemeralStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |
"
  [^CfnJobDefinition$EphemeralStorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :size-in-gi-b)]
    (. builder sizeInGiB data))
  (.build builder))


(defn cfn-job-definition-ephemeral-storage-property-builder
  "Creates a  `CfnJobDefinition$EphemeralStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-ephemeral-storage-property-builder (new CfnJobDefinition$EphemeralStorageProperty$Builder) id config))


(defn build-cfn-job-definition-evaluate-on-exit-property-builder
  "The build-cfn-job-definition-evaluate-on-exit-property-builder function updates a CfnJobDefinition$EvaluateOnExitProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$EvaluateOnExitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `onExitCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-exit-code` |
| `onReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-reason` |
| `onStatusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-status-reason` |
"
  [^CfnJobDefinition$EvaluateOnExitProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :on-exit-code)]
    (. builder onExitCode data))
  (when-some [data (lookup-entry config id :on-reason)]
    (. builder onReason data))
  (when-some [data (lookup-entry config id :on-status-reason)]
    (. builder onStatusReason data))
  (.build builder))


(defn cfn-job-definition-evaluate-on-exit-property-builder
  "Creates a  `CfnJobDefinition$EvaluateOnExitProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-evaluate-on-exit-property-builder (new CfnJobDefinition$EvaluateOnExitProperty$Builder) id config))


(defn build-cfn-job-definition-fargate-platform-configuration-property-builder
  "The build-cfn-job-definition-fargate-platform-configuration-property-builder function updates a CfnJobDefinition$FargatePlatformConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$FargatePlatformConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
"
  [^CfnJobDefinition$FargatePlatformConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :platform-version)]
    (. builder platformVersion data))
  (.build builder))


(defn cfn-job-definition-fargate-platform-configuration-property-builder
  "Creates a  `CfnJobDefinition$FargatePlatformConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-fargate-platform-configuration-property-builder (new CfnJobDefinition$FargatePlatformConfigurationProperty$Builder) id config))


(defn build-cfn-job-definition-host-path-property-builder
  "The build-cfn-job-definition-host-path-property-builder function updates a CfnJobDefinition$HostPathProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$HostPathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnJobDefinition$HostPathProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-job-definition-host-path-property-builder
  "Creates a  `CfnJobDefinition$HostPathProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-host-path-property-builder (new CfnJobDefinition$HostPathProperty$Builder) id config))


(defn build-cfn-job-definition-image-pull-secret-property-builder
  "The build-cfn-job-definition-image-pull-secret-property-builder function updates a CfnJobDefinition$ImagePullSecretProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$ImagePullSecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnJobDefinition$ImagePullSecretProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-job-definition-image-pull-secret-property-builder
  "Creates a  `CfnJobDefinition$ImagePullSecretProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-image-pull-secret-property-builder (new CfnJobDefinition$ImagePullSecretProperty$Builder) id config))


(defn build-cfn-job-definition-linux-parameters-property-builder
  "The build-cfn-job-definition-linux-parameters-property-builder function updates a CfnJobDefinition$LinuxParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$LinuxParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
| `tmpfs` | java.util.List | [[cdk.support/lookup-entry]] | `:tmpfs` |
"
  [^CfnJobDefinition$LinuxParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :devices)]
    (. builder devices data))
  (when-some [data (lookup-entry config id :init-process-enabled)]
    (. builder initProcessEnabled data))
  (when-some [data (lookup-entry config id :max-swap)]
    (. builder maxSwap data))
  (when-some [data (lookup-entry config id :shared-memory-size)]
    (. builder sharedMemorySize data))
  (when-some [data (lookup-entry config id :swappiness)]
    (. builder swappiness data))
  (when-some [data (lookup-entry config id :tmpfs)]
    (. builder tmpfs data))
  (.build builder))


(defn cfn-job-definition-linux-parameters-property-builder
  "Creates a  `CfnJobDefinition$LinuxParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-linux-parameters-property-builder (new CfnJobDefinition$LinuxParametersProperty$Builder) id config))


(defn build-cfn-job-definition-log-configuration-property-builder
  "The build-cfn-job-definition-log-configuration-property-builder function updates a CfnJobDefinition$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^CfnJobDefinition$LogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (when-some [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn cfn-job-definition-log-configuration-property-builder
  "Creates a  `CfnJobDefinition$LogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-log-configuration-property-builder (new CfnJobDefinition$LogConfigurationProperty$Builder) id config))


(defn build-cfn-job-definition-metadata-property-builder
  "The build-cfn-job-definition-metadata-property-builder function updates a CfnJobDefinition$MetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$MetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:labels` |
"
  [^CfnJobDefinition$MetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :labels)]
    (. builder labels data))
  (.build builder))


(defn cfn-job-definition-metadata-property-builder
  "Creates a  `CfnJobDefinition$MetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-metadata-property-builder (new CfnJobDefinition$MetadataProperty$Builder) id config))


(defn build-cfn-job-definition-mount-points-property-builder
  "The build-cfn-job-definition-mount-points-property-builder function updates a CfnJobDefinition$MountPointsProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$MountPointsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |
"
  [^CfnJobDefinition$MountPointsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-some [data (lookup-entry config id :source-volume)]
    (. builder sourceVolume data))
  (.build builder))


(defn cfn-job-definition-mount-points-property-builder
  "Creates a  `CfnJobDefinition$MountPointsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-mount-points-property-builder (new CfnJobDefinition$MountPointsProperty$Builder) id config))


(defn build-cfn-job-definition-network-configuration-property-builder
  "The build-cfn-job-definition-network-configuration-property-builder function updates a CfnJobDefinition$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
"
  [^CfnJobDefinition$NetworkConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (.build builder))


(defn cfn-job-definition-network-configuration-property-builder
  "Creates a  `CfnJobDefinition$NetworkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-network-configuration-property-builder (new CfnJobDefinition$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-job-definition-node-properties-property-builder
  "The build-cfn-job-definition-node-properties-property-builder function updates a CfnJobDefinition$NodePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$NodePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mainNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:main-node` |
| `nodeRangeProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:node-range-properties` |
| `numNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-nodes` |
"
  [^CfnJobDefinition$NodePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :main-node)]
    (. builder mainNode data))
  (when-some [data (lookup-entry config id :node-range-properties)]
    (. builder nodeRangeProperties data))
  (when-some [data (lookup-entry config id :num-nodes)]
    (. builder numNodes data))
  (.build builder))


(defn cfn-job-definition-node-properties-property-builder
  "Creates a  `CfnJobDefinition$NodePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-node-properties-property-builder (new CfnJobDefinition$NodePropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-node-range-property-property-builder
  "The build-cfn-job-definition-node-range-property-property-builder function updates a CfnJobDefinition$NodeRangePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$NodeRangePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.CfnJobDefinition$ContainerPropertiesProperty | [[cdk.support/lookup-entry]] | `:container` |
| `ecsProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$EcsPropertiesProperty | [[cdk.support/lookup-entry]] | `:ecs-properties` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `targetNodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-nodes` |
"
  [^CfnJobDefinition$NodeRangePropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (lookup-entry config id :ecs-properties)]
    (. builder ecsProperties data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :target-nodes)]
    (. builder targetNodes data))
  (.build builder))


(defn cfn-job-definition-node-range-property-property-builder
  "Creates a  `CfnJobDefinition$NodeRangePropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-node-range-property-property-builder (new CfnJobDefinition$NodeRangePropertyProperty$Builder) id config))


(defn build-cfn-job-definition-pod-properties-property-builder
  "The build-cfn-job-definition-pod-properties-property-builder function updates a CfnJobDefinition$PodPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$PodPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `dnsPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-policy` |
| `hostNetwork` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host-network` |
| `imagePullSecrets` | java.util.List | [[cdk.support/lookup-entry]] | `:image-pull-secrets` |
| `initContainers` | java.util.List | [[cdk.support/lookup-entry]] | `:init-containers` |
| `metadata` | software.amazon.awscdk.services.batch.CfnJobDefinition$MetadataProperty | [[cdk.support/lookup-entry]] | `:metadata` |
| `serviceAccountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-name` |
| `shareProcessNamespace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-process-namespace` |
| `volumes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnJobDefinition$PodPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :dns-policy)]
    (. builder dnsPolicy data))
  (when-some [data (lookup-entry config id :host-network)]
    (. builder hostNetwork data))
  (when-some [data (lookup-entry config id :image-pull-secrets)]
    (. builder imagePullSecrets data))
  (when-some [data (lookup-entry config id :init-containers)]
    (. builder initContainers data))
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :service-account-name)]
    (. builder serviceAccountName data))
  (when-some [data (lookup-entry config id :share-process-namespace)]
    (. builder shareProcessNamespace data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-job-definition-pod-properties-property-builder
  "Creates a  `CfnJobDefinition$PodPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-pod-properties-property-builder (new CfnJobDefinition$PodPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-props-builder
  "The build-cfn-job-definition-props-builder function updates a CfnJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-properties` |
| `ecsProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$EcsPropertiesProperty | [[cdk.support/lookup-entry]] | `:ecs-properties` |
| `eksProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:eks-properties` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `nodeProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-properties` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `platformCapabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:platform-capabilities` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryStrategy` | software.amazon.awscdk.services.batch.CfnJobDefinition$RetryStrategyProperty | [[cdk.support/lookup-entry]] | `:retry-strategy` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `timeout` | software.amazon.awscdk.services.batch.CfnJobDefinition$TimeoutProperty | [[cdk.support/lookup-entry]] | `:timeout` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnJobDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-properties)]
    (. builder containerProperties data))
  (when-some [data (lookup-entry config id :ecs-properties)]
    (. builder ecsProperties data))
  (when-some [data (lookup-entry config id :eks-properties)]
    (. builder eksProperties data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :node-properties)]
    (. builder nodeProperties data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :platform-capabilities)]
    (. builder platformCapabilities data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-strategy)]
    (. builder retryStrategy data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-job-definition-props-builder
  "Creates a  `CfnJobDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-props-builder (new CfnJobDefinitionProps$Builder) id config))


(defn build-cfn-job-definition-repository-credentials-property-builder
  "The build-cfn-job-definition-repository-credentials-property-builder function updates a CfnJobDefinition$RepositoryCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$RepositoryCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |
"
  [^CfnJobDefinition$RepositoryCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :credentials-parameter)]
    (. builder credentialsParameter data))
  (.build builder))


(defn cfn-job-definition-repository-credentials-property-builder
  "Creates a  `CfnJobDefinition$RepositoryCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-repository-credentials-property-builder (new CfnJobDefinition$RepositoryCredentialsProperty$Builder) id config))


(defn build-cfn-job-definition-resource-requirement-property-builder
  "The build-cfn-job-definition-resource-requirement-property-builder function updates a CfnJobDefinition$ResourceRequirementProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$ResourceRequirementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnJobDefinition$ResourceRequirementProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-job-definition-resource-requirement-property-builder
  "Creates a  `CfnJobDefinition$ResourceRequirementProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-resource-requirement-property-builder (new CfnJobDefinition$ResourceRequirementProperty$Builder) id config))


(defn build-cfn-job-definition-resources-property-builder
  "The build-cfn-job-definition-resources-property-builder function updates a CfnJobDefinition$ResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$ResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limits` | java.lang.Object | [[cdk.support/lookup-entry]] | `:limits` |
| `requests` | java.lang.Object | [[cdk.support/lookup-entry]] | `:requests` |
"
  [^CfnJobDefinition$ResourcesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :limits)]
    (. builder limits data))
  (when-some [data (lookup-entry config id :requests)]
    (. builder requests data))
  (.build builder))


(defn cfn-job-definition-resources-property-builder
  "Creates a  `CfnJobDefinition$ResourcesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-resources-property-builder (new CfnJobDefinition$ResourcesProperty$Builder) id config))


(defn build-cfn-job-definition-retry-strategy-property-builder
  "The build-cfn-job-definition-retry-strategy-property-builder function updates a CfnJobDefinition$RetryStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$RetryStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `evaluateOnExit` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluate-on-exit` |
"
  [^CfnJobDefinition$RetryStrategyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-some [data (lookup-entry config id :evaluate-on-exit)]
    (. builder evaluateOnExit data))
  (.build builder))


(defn cfn-job-definition-retry-strategy-property-builder
  "Creates a  `CfnJobDefinition$RetryStrategyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-retry-strategy-property-builder (new CfnJobDefinition$RetryStrategyProperty$Builder) id config))


(defn build-cfn-job-definition-runtime-platform-property-builder
  "The build-cfn-job-definition-runtime-platform-property-builder function updates a CfnJobDefinition$RuntimePlatformProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$RuntimePlatformProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system-family` |
"
  [^CfnJobDefinition$RuntimePlatformProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu-architecture)]
    (. builder cpuArchitecture data))
  (when-some [data (lookup-entry config id :operating-system-family)]
    (. builder operatingSystemFamily data))
  (.build builder))


(defn cfn-job-definition-runtime-platform-property-builder
  "Creates a  `CfnJobDefinition$RuntimePlatformProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-runtime-platform-property-builder (new CfnJobDefinition$RuntimePlatformProperty$Builder) id config))


(defn build-cfn-job-definition-secret-property-builder
  "The build-cfn-job-definition-secret-property-builder function updates a CfnJobDefinition$SecretProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$SecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |
"
  [^CfnJobDefinition$SecretProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value-from)]
    (. builder valueFrom data))
  (.build builder))


(defn cfn-job-definition-secret-property-builder
  "Creates a  `CfnJobDefinition$SecretProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-secret-property-builder (new CfnJobDefinition$SecretProperty$Builder) id config))


(defn build-cfn-job-definition-security-context-property-builder
  "The build-cfn-job-definition-security-context-property-builder function updates a CfnJobDefinition$SecurityContextProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$SecurityContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowPrivilegeEscalation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-privilege-escalation` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readOnlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-root-filesystem` |
| `runAsGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-group` |
| `runAsNonRoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:run-as-non-root` |
| `runAsUser` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-user` |
"
  [^CfnJobDefinition$SecurityContextProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-privilege-escalation)]
    (. builder allowPrivilegeEscalation data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :read-only-root-filesystem)]
    (. builder readOnlyRootFilesystem data))
  (when-some [data (lookup-entry config id :run-as-group)]
    (. builder runAsGroup data))
  (when-some [data (lookup-entry config id :run-as-non-root)]
    (. builder runAsNonRoot data))
  (when-some [data (lookup-entry config id :run-as-user)]
    (. builder runAsUser data))
  (.build builder))


(defn cfn-job-definition-security-context-property-builder
  "Creates a  `CfnJobDefinition$SecurityContextProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-security-context-property-builder (new CfnJobDefinition$SecurityContextProperty$Builder) id config))


(defn build-cfn-job-definition-task-container-dependency-property-builder
  "The build-cfn-job-definition-task-container-dependency-property-builder function updates a CfnJobDefinition$TaskContainerDependencyProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$TaskContainerDependencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
"
  [^CfnJobDefinition$TaskContainerDependencyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (.build builder))


(defn cfn-job-definition-task-container-dependency-property-builder
  "Creates a  `CfnJobDefinition$TaskContainerDependencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-task-container-dependency-property-builder (new CfnJobDefinition$TaskContainerDependencyProperty$Builder) id config))


(defn build-cfn-job-definition-task-container-properties-property-builder
  "The build-cfn-job-definition-task-container-properties-property-builder function updates a CfnJobDefinition$TaskContainerPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$TaskContainerPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `dependsOn` | java.util.List | [[cdk.support/lookup-entry]] | `:depends-on` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `essential` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:essential` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `linuxParameters` | software.amazon.awscdk.services.batch.CfnJobDefinition$LinuxParametersProperty | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logConfiguration` | software.amazon.awscdk.services.batch.CfnJobDefinition$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `mountPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-points` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `privileged` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `repositoryCredentials` | software.amazon.awscdk.services.batch.CfnJobDefinition$RepositoryCredentialsProperty | [[cdk.support/lookup-entry]] | `:repository-credentials` |
| `resourceRequirements` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-requirements` |
| `secrets` | java.util.List | [[cdk.support/lookup-entry]] | `:secrets` |
| `ulimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnJobDefinition$TaskContainerPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :depends-on)]
    (. builder dependsOn data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :essential)]
    (. builder essential data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :mount-points)]
    (. builder mountPoints data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :repository-credentials)]
    (. builder repositoryCredentials data))
  (when-some [data (lookup-entry config id :resource-requirements)]
    (. builder resourceRequirements data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :ulimits)]
    (. builder ulimits data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-job-definition-task-container-properties-property-builder
  "Creates a  `CfnJobDefinition$TaskContainerPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-task-container-properties-property-builder (new CfnJobDefinition$TaskContainerPropertiesProperty$Builder) id config))


(defn build-cfn-job-definition-timeout-property-builder
  "The build-cfn-job-definition-timeout-property-builder function updates a CfnJobDefinition$TimeoutProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$TimeoutProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attemptDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempt-duration-seconds` |
"
  [^CfnJobDefinition$TimeoutProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attempt-duration-seconds)]
    (. builder attemptDurationSeconds data))
  (.build builder))


(defn cfn-job-definition-timeout-property-builder
  "Creates a  `CfnJobDefinition$TimeoutProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-timeout-property-builder (new CfnJobDefinition$TimeoutProperty$Builder) id config))


(defn build-cfn-job-definition-tmpfs-property-builder
  "The build-cfn-job-definition-tmpfs-property-builder function updates a CfnJobDefinition$TmpfsProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$TmpfsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnJobDefinition$TmpfsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn cfn-job-definition-tmpfs-property-builder
  "Creates a  `CfnJobDefinition$TmpfsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-tmpfs-property-builder (new CfnJobDefinition$TmpfsProperty$Builder) id config))


(defn build-cfn-job-definition-ulimit-property-builder
  "The build-cfn-job-definition-ulimit-property-builder function updates a CfnJobDefinition$UlimitProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$UlimitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |
"
  [^CfnJobDefinition$UlimitProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hard-limit)]
    (. builder hardLimit data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :soft-limit)]
    (. builder softLimit data))
  (.build builder))


(defn cfn-job-definition-ulimit-property-builder
  "Creates a  `CfnJobDefinition$UlimitProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-ulimit-property-builder (new CfnJobDefinition$UlimitProperty$Builder) id config))


(defn build-cfn-job-definition-volumes-host-property-builder
  "The build-cfn-job-definition-volumes-host-property-builder function updates a CfnJobDefinition$VolumesHostProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$VolumesHostProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnJobDefinition$VolumesHostProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-job-definition-volumes-host-property-builder
  "Creates a  `CfnJobDefinition$VolumesHostProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-volumes-host-property-builder (new CfnJobDefinition$VolumesHostProperty$Builder) id config))


(defn build-cfn-job-definition-volumes-property-builder
  "The build-cfn-job-definition-volumes-property-builder function updates a CfnJobDefinition$VolumesProperty$Builder instance using the provided configuration.
  The function takes the CfnJobDefinition$VolumesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `host` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnJobDefinition$VolumesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :efs-volume-configuration)]
    (. builder efsVolumeConfiguration data))
  (when-some [data (lookup-entry config id :host)]
    (. builder host data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-job-definition-volumes-property-builder
  "Creates a  `CfnJobDefinition$VolumesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-definition-volumes-property-builder (new CfnJobDefinition$VolumesProperty$Builder) id config))


(defn build-cfn-job-queue-builder
  "The build-cfn-job-queue-builder function updates a CfnJobQueue$Builder instance using the provided configuration.
  The function takes the CfnJobQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environment-order` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-arn` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnJobQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-order)]
    (. builder computeEnvironmentOrder data))
  (when-some [data (lookup-entry config id :job-queue-name)]
    (. builder jobQueueName data))
  (when-some [data (lookup-entry config id :job-state-time-limit-actions)]
    (. builder jobStateTimeLimitActions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :scheduling-policy-arn)]
    (. builder schedulingPolicyArn data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-job-queue-builder
  "Creates a  `CfnJobQueue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-job-queue-builder (CfnJobQueue$Builder/create scope (name id)) id config))


(defn build-cfn-job-queue-compute-environment-order-property-builder
  "The build-cfn-job-queue-compute-environment-order-property-builder function updates a CfnJobQueue$ComputeEnvironmentOrderProperty$Builder instance using the provided configuration.
  The function takes the CfnJobQueue$ComputeEnvironmentOrderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
"
  [^CfnJobQueue$ComputeEnvironmentOrderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment)]
    (. builder computeEnvironment data))
  (when-some [data (lookup-entry config id :order)]
    (. builder order data))
  (.build builder))


(defn cfn-job-queue-compute-environment-order-property-builder
  "Creates a  `CfnJobQueue$ComputeEnvironmentOrderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-queue-compute-environment-order-property-builder (new CfnJobQueue$ComputeEnvironmentOrderProperty$Builder) id config))


(defn build-cfn-job-queue-job-state-time-limit-action-property-builder
  "The build-cfn-job-queue-job-state-time-limit-action-property-builder function updates a CfnJobQueue$JobStateTimeLimitActionProperty$Builder instance using the provided configuration.
  The function takes the CfnJobQueue$JobStateTimeLimitActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `maxTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-seconds` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnJobQueue$JobStateTimeLimitActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :max-time-seconds)]
    (. builder maxTimeSeconds data))
  (when-some [data (lookup-entry config id :reason)]
    (. builder reason data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-job-queue-job-state-time-limit-action-property-builder
  "Creates a  `CfnJobQueue$JobStateTimeLimitActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-queue-job-state-time-limit-action-property-builder (new CfnJobQueue$JobStateTimeLimitActionProperty$Builder) id config))


(defn build-cfn-job-queue-props-builder
  "The build-cfn-job-queue-props-builder function updates a CfnJobQueueProps$Builder instance using the provided configuration.
  The function takes the CfnJobQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentOrder` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-environment-order` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-arn` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnJobQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-order)]
    (. builder computeEnvironmentOrder data))
  (when-some [data (lookup-entry config id :job-queue-name)]
    (. builder jobQueueName data))
  (when-some [data (lookup-entry config id :job-state-time-limit-actions)]
    (. builder jobStateTimeLimitActions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :scheduling-policy-arn)]
    (. builder schedulingPolicyArn data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-job-queue-props-builder
  "Creates a  `CfnJobQueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-job-queue-props-builder (new CfnJobQueueProps$Builder) id config))


(defn build-cfn-scheduling-policy-builder
  "The build-cfn-scheduling-policy-builder function updates a CfnSchedulingPolicy$Builder instance using the provided configuration.
  The function takes the CfnSchedulingPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fairsharePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fairshare-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchedulingPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :fairshare-policy)]
    (. builder fairsharePolicy data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-scheduling-policy-builder
  "Creates a  `CfnSchedulingPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-scheduling-policy-builder (CfnSchedulingPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-scheduling-policy-fairshare-policy-property-builder
  "The build-cfn-scheduling-policy-fairshare-policy-property-builder function updates a CfnSchedulingPolicy$FairsharePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedulingPolicy$FairsharePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `shareDecaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:share-decay-seconds` |
| `shareDistribution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:share-distribution` |
"
  [^CfnSchedulingPolicy$FairsharePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-reservation)]
    (. builder computeReservation data))
  (when-some [data (lookup-entry config id :share-decay-seconds)]
    (. builder shareDecaySeconds data))
  (when-some [data (lookup-entry config id :share-distribution)]
    (. builder shareDistribution data))
  (.build builder))


(defn cfn-scheduling-policy-fairshare-policy-property-builder
  "Creates a  `CfnSchedulingPolicy$FairsharePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduling-policy-fairshare-policy-property-builder (new CfnSchedulingPolicy$FairsharePolicyProperty$Builder) id config))


(defn build-cfn-scheduling-policy-props-builder
  "The build-cfn-scheduling-policy-props-builder function updates a CfnSchedulingPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnSchedulingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fairsharePolicy` | software.amazon.awscdk.services.batch.CfnSchedulingPolicy$FairsharePolicyProperty | [[cdk.support/lookup-entry]] | `:fairshare-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchedulingPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :fairshare-policy)]
    (. builder fairsharePolicy data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-scheduling-policy-props-builder
  "Creates a  `CfnSchedulingPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduling-policy-props-builder (new CfnSchedulingPolicyProps$Builder) id config))


(defn build-cfn-scheduling-policy-share-attributes-property-builder
  "The build-cfn-scheduling-policy-share-attributes-property-builder function updates a CfnSchedulingPolicy$ShareAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnSchedulingPolicy$ShareAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shareIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-identifier` |
| `weightFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight-factor` |
"
  [^CfnSchedulingPolicy$ShareAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :share-identifier)]
    (. builder shareIdentifier data))
  (when-some [data (lookup-entry config id :weight-factor)]
    (. builder weightFactor data))
  (.build builder))


(defn cfn-scheduling-policy-share-attributes-property-builder
  "Creates a  `CfnSchedulingPolicy$ShareAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scheduling-policy-share-attributes-property-builder (new CfnSchedulingPolicy$ShareAttributesProperty$Builder) id config))


(defn build-compute-environment-props-builder
  "The build-compute-environment-props-builder function updates a ComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the ComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^ComputeEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (.build builder))


(defn compute-environment-props-builder
  "Creates a  `ComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-compute-environment-props-builder (new ComputeEnvironmentProps$Builder) id config))


(defn build-custom-reason-builder
  "The build-custom-reason-builder function updates a CustomReason$Builder instance using the provided configuration.
  The function takes the CustomReason$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onExitCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-exit-code` |
| `onReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-reason` |
| `onStatusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-status-reason` |
"
  [^CustomReason$Builder builder id config]
  (when-some [data (lookup-entry config id :on-exit-code)]
    (. builder onExitCode data))
  (when-some [data (lookup-entry config id :on-reason)]
    (. builder onReason data))
  (when-some [data (lookup-entry config id :on-status-reason)]
    (. builder onStatusReason data))
  (.build builder))


(defn custom-reason-builder
  "Creates a  `CustomReason$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-custom-reason-builder (new CustomReason$Builder) id config))


(defn build-device-builder
  "The build-device-builder function updates a Device$Builder instance using the provided configuration.
  The function takes the Device$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
"
  [^Device$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn device-builder
  "Creates a  `Device$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-device-builder (new Device$Builder) id config))


(defn build-ecs-container-definition-props-builder
  "The build-ecs-container-definition-props-builder function updates a EcsContainerDefinitionProps$Builder instance using the provided configuration.
  The function takes the EcsContainerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `jobRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:job-role` |
| `linuxParameters` | software.amazon.awscdk.services.batch.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EcsContainerDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :job-role)]
    (. builder jobRole data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn ecs-container-definition-props-builder
  "Creates a  `EcsContainerDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-container-definition-props-builder (new EcsContainerDefinitionProps$Builder) id config))


(defn build-ecs-ec2-container-definition-builder
  "The build-ecs-ec2-container-definition-builder function updates a EcsEc2ContainerDefinition$Builder instance using the provided configuration.
  The function takes the EcsEc2ContainerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `gpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `jobRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:job-role` |
| `linuxParameters` | software.amazon.awscdk.services.batch.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EcsEc2ContainerDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :gpu)]
    (. builder gpu data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :job-role)]
    (. builder jobRole data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :ulimits)]
    (. builder ulimits data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn ecs-ec2-container-definition-builder
  "Creates a  `EcsEc2ContainerDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ecs-ec2-container-definition-builder (EcsEc2ContainerDefinition$Builder/create scope (name id)) id config))


(defn build-ecs-ec2-container-definition-props-builder
  "The build-ecs-ec2-container-definition-props-builder function updates a EcsEc2ContainerDefinitionProps$Builder instance using the provided configuration.
  The function takes the EcsEc2ContainerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `gpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `jobRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:job-role` |
| `linuxParameters` | software.amazon.awscdk.services.batch.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EcsEc2ContainerDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :gpu)]
    (. builder gpu data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :job-role)]
    (. builder jobRole data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :ulimits)]
    (. builder ulimits data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn ecs-ec2-container-definition-props-builder
  "Creates a  `EcsEc2ContainerDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-ec2-container-definition-props-builder (new EcsEc2ContainerDefinitionProps$Builder) id config))


(defn build-ecs-fargate-container-definition-builder
  "The build-ecs-fargate-container-definition-builder function updates a EcsFargateContainerDefinition$Builder instance using the provided configuration.
  The function takes the EcsFargateContainerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `fargateCpuArchitecture` | software.amazon.awscdk.services.ecs.CpuArchitecture | [[cdk.support/lookup-entry]] | `:fargate-cpu-architecture` |
| `fargateOperatingSystemFamily` | software.amazon.awscdk.services.ecs.OperatingSystemFamily | [[cdk.support/lookup-entry]] | `:fargate-operating-system-family` |
| `fargatePlatformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:fargate-platform-version` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `jobRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:job-role` |
| `linuxParameters` | software.amazon.awscdk.services.batch.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EcsFargateContainerDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :fargate-cpu-architecture)]
    (. builder fargateCpuArchitecture data))
  (when-some [data (lookup-entry config id :fargate-operating-system-family)]
    (. builder fargateOperatingSystemFamily data))
  (when-some [data (fargate-platform-version config id :fargate-platform-version)]
    (. builder fargatePlatformVersion data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :job-role)]
    (. builder jobRole data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn ecs-fargate-container-definition-builder
  "Creates a  `EcsFargateContainerDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ecs-fargate-container-definition-builder (EcsFargateContainerDefinition$Builder/create scope (name id)) id config))


(defn build-ecs-fargate-container-definition-props-builder
  "The build-ecs-fargate-container-definition-props-builder function updates a EcsFargateContainerDefinitionProps$Builder instance using the provided configuration.
  The function takes the EcsFargateContainerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `fargateCpuArchitecture` | software.amazon.awscdk.services.ecs.CpuArchitecture | [[cdk.support/lookup-entry]] | `:fargate-cpu-architecture` |
| `fargateOperatingSystemFamily` | software.amazon.awscdk.services.ecs.OperatingSystemFamily | [[cdk.support/lookup-entry]] | `:fargate-operating-system-family` |
| `fargatePlatformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:fargate-platform-version` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `jobRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:job-role` |
| `linuxParameters` | software.amazon.awscdk.services.batch.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EcsFargateContainerDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :fargate-cpu-architecture)]
    (. builder fargateCpuArchitecture data))
  (when-some [data (lookup-entry config id :fargate-operating-system-family)]
    (. builder fargateOperatingSystemFamily data))
  (when-some [data (fargate-platform-version config id :fargate-platform-version)]
    (. builder fargatePlatformVersion data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :job-role)]
    (. builder jobRole data))
  (when-some [data (lookup-entry config id :linux-parameters)]
    (. builder linuxParameters data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn ecs-fargate-container-definition-props-builder
  "Creates a  `EcsFargateContainerDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-fargate-container-definition-props-builder (new EcsFargateContainerDefinitionProps$Builder) id config))


(defn build-ecs-job-definition-builder
  "The build-ecs-job-definition-builder function updates a EcsJobDefinition$Builder instance using the provided configuration.
  The function takes the EcsJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EcsJobDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn ecs-job-definition-builder
  "Creates a  `EcsJobDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ecs-job-definition-builder (EcsJobDefinition$Builder/create scope (name id)) id config))


(defn build-ecs-job-definition-props-builder
  "The build-ecs-job-definition-props-builder function updates a EcsJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the EcsJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EcsJobDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn ecs-job-definition-props-builder
  "Creates a  `EcsJobDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-job-definition-props-builder (new EcsJobDefinitionProps$Builder) id config))


(defn build-ecs-machine-image-builder
  "The build-ecs-machine-image-builder function updates a EcsMachineImage$Builder instance using the provided configuration.
  The function takes the EcsMachineImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:image` |
| `imageType` | software.amazon.awscdk.services.batch.EcsMachineImageType | [[cdk.api.services.batch/ecs-machine-image-type]] | `:image-type` |
"
  [^EcsMachineImage$Builder builder id config]
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (ecs-machine-image-type config id :image-type)]
    (. builder imageType data))
  (.build builder))


(defn ecs-machine-image-builder
  "Creates a  `EcsMachineImage$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-machine-image-builder (new EcsMachineImage$Builder) id config))


(defn build-ecs-volume-options-builder
  "The build-ecs-volume-options-builder function updates a EcsVolumeOptions$Builder instance using the provided configuration.
  The function takes the EcsVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^EcsVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn ecs-volume-options-builder
  "Creates a  `EcsVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-volume-options-builder (new EcsVolumeOptions$Builder) id config))


(defn build-efs-volume-builder
  "The build-efs-volume-builder function updates a EfsVolume$Builder instance using the provided configuration.
  The function takes the EfsVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `enableTransitEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-transit-encryption` |
| `fileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:file-system` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |
| `useJobRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-job-role` |
"
  [^EfsVolume$Builder builder id config]
  (when-some [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :enable-transit-encryption)]
    (. builder enableTransitEncryption data))
  (when-some [data (lookup-entry config id :file-system)]
    (. builder fileSystem data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (when-some [data (lookup-entry config id :transit-encryption-port)]
    (. builder transitEncryptionPort data))
  (when-some [data (lookup-entry config id :use-job-role)]
    (. builder useJobRole data))
  (.build builder))


(defn efs-volume-builder
  "Creates a  `EfsVolume$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-efs-volume-builder (EfsVolume$Builder/create) id config))


(defn build-efs-volume-options-builder
  "The build-efs-volume-options-builder function updates a EfsVolumeOptions$Builder instance using the provided configuration.
  The function takes the EfsVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `enableTransitEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-transit-encryption` |
| `fileSystem` | software.amazon.awscdk.services.efs.IFileSystem | [[cdk.support/lookup-entry]] | `:file-system` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |
| `useJobRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-job-role` |
"
  [^EfsVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :enable-transit-encryption)]
    (. builder enableTransitEncryption data))
  (when-some [data (lookup-entry config id :file-system)]
    (. builder fileSystem data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (when-some [data (lookup-entry config id :transit-encryption-port)]
    (. builder transitEncryptionPort data))
  (when-some [data (lookup-entry config id :use-job-role)]
    (. builder useJobRole data))
  (.build builder))


(defn efs-volume-options-builder
  "Creates a  `EfsVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-efs-volume-options-builder (new EfsVolumeOptions$Builder) id config))


(defn build-eks-container-definition-builder
  "The build-eks-container-definition-builder function updates a EksContainerDefinition$Builder instance using the provided configuration.
  The function takes the EksContainerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-limit` |
| `cpuReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-reservation` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `gpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-limit` |
| `gpuReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-reservation` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `imagePullPolicy` | software.amazon.awscdk.services.batch.ImagePullPolicy | [[cdk.api.services.batch/image-pull-policy]] | `:image-pull-policy` |
| `memoryLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-reservation` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `runAsGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-group` |
| `runAsRoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:run-as-root` |
| `runAsUser` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EksContainerDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu-limit)]
    (. builder cpuLimit data))
  (when-some [data (lookup-entry config id :cpu-reservation)]
    (. builder cpuReservation data))
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :gpu-limit)]
    (. builder gpuLimit data))
  (when-some [data (lookup-entry config id :gpu-reservation)]
    (. builder gpuReservation data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (image-pull-policy config id :image-pull-policy)]
    (. builder imagePullPolicy data))
  (when-some [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-some [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :run-as-group)]
    (. builder runAsGroup data))
  (when-some [data (lookup-entry config id :run-as-root)]
    (. builder runAsRoot data))
  (when-some [data (lookup-entry config id :run-as-user)]
    (. builder runAsUser data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn eks-container-definition-builder
  "Creates a  `EksContainerDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-eks-container-definition-builder (EksContainerDefinition$Builder/create scope (name id)) id config))


(defn build-eks-container-definition-props-builder
  "The build-eks-container-definition-props-builder function updates a EksContainerDefinitionProps$Builder instance using the provided configuration.
  The function takes the EksContainerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-limit` |
| `cpuReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-reservation` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `gpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-limit` |
| `gpuReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-reservation` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `imagePullPolicy` | software.amazon.awscdk.services.batch.ImagePullPolicy | [[cdk.api.services.batch/image-pull-policy]] | `:image-pull-policy` |
| `memoryLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory-reservation` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `runAsGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-group` |
| `runAsRoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:run-as-root` |
| `runAsUser` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^EksContainerDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cpu-limit)]
    (. builder cpuLimit data))
  (when-some [data (lookup-entry config id :cpu-reservation)]
    (. builder cpuReservation data))
  (when-some [data (lookup-entry config id :env)]
    (. builder env data))
  (when-some [data (lookup-entry config id :gpu-limit)]
    (. builder gpuLimit data))
  (when-some [data (lookup-entry config id :gpu-reservation)]
    (. builder gpuReservation data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (image-pull-policy config id :image-pull-policy)]
    (. builder imagePullPolicy data))
  (when-some [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-some [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :privileged)]
    (. builder privileged data))
  (when-some [data (lookup-entry config id :readonly-root-filesystem)]
    (. builder readonlyRootFilesystem data))
  (when-some [data (lookup-entry config id :run-as-group)]
    (. builder runAsGroup data))
  (when-some [data (lookup-entry config id :run-as-root)]
    (. builder runAsRoot data))
  (when-some [data (lookup-entry config id :run-as-user)]
    (. builder runAsUser data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn eks-container-definition-props-builder
  "Creates a  `EksContainerDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-eks-container-definition-props-builder (new EksContainerDefinitionProps$Builder) id config))


(defn build-eks-job-definition-builder
  "The build-eks-job-definition-builder function updates a EksJobDefinition$Builder instance using the provided configuration.
  The function takes the EksJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.EksContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `dnsPolicy` | software.amazon.awscdk.services.batch.DnsPolicy | [[cdk.api.services.batch/dns-policy]] | `:dns-policy` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useHostNetwork` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-host-network` |
"
  [^EksJobDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (dns-policy config id :dns-policy)]
    (. builder dnsPolicy data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :service-account)]
    (. builder serviceAccount data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :use-host-network)]
    (. builder useHostNetwork data))
  (.build builder))


(defn eks-job-definition-builder
  "Creates a  `EksJobDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-eks-job-definition-builder (EksJobDefinition$Builder/create scope (name id)) id config))


(defn build-eks-job-definition-props-builder
  "The build-eks-job-definition-props-builder function updates a EksJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the EksJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.EksContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `dnsPolicy` | software.amazon.awscdk.services.batch.DnsPolicy | [[cdk.api.services.batch/dns-policy]] | `:dns-policy` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `serviceAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `useHostNetwork` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-host-network` |
"
  [^EksJobDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (dns-policy config id :dns-policy)]
    (. builder dnsPolicy data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :service-account)]
    (. builder serviceAccount data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :use-host-network)]
    (. builder useHostNetwork data))
  (.build builder))


(defn eks-job-definition-props-builder
  "Creates a  `EksJobDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-eks-job-definition-props-builder (new EksJobDefinitionProps$Builder) id config))


(defn build-eks-machine-image-builder
  "The build-eks-machine-image-builder function updates a EksMachineImage$Builder instance using the provided configuration.
  The function takes the EksMachineImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:image` |
| `imageType` | software.amazon.awscdk.services.batch.EksMachineImageType | [[cdk.api.services.batch/eks-machine-image-type]] | `:image-type` |
"
  [^EksMachineImage$Builder builder id config]
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (eks-machine-image-type config id :image-type)]
    (. builder imageType data))
  (.build builder))


(defn eks-machine-image-builder
  "Creates a  `EksMachineImage$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-eks-machine-image-builder (new EksMachineImage$Builder) id config))


(defn build-eks-volume-options-builder
  "The build-eks-volume-options-builder function updates a EksVolumeOptions$Builder instance using the provided configuration.
  The function takes the EksVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^EksVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn eks-volume-options-builder
  "Creates a  `EksVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-eks-volume-options-builder (new EksVolumeOptions$Builder) id config))


(defn build-empty-dir-volume-builder
  "The build-empty-dir-volume-builder function updates a EmptyDirVolume$Builder instance using the provided configuration.
  The function takes the EmptyDirVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | software.amazon.awscdk.services.batch.EmptyDirMediumType | [[cdk.api.services.batch/empty-dir-medium-type]] | `:medium` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `sizeLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size-limit` |
"
  [^EmptyDirVolume$Builder builder id config]
  (when-some [data (empty-dir-medium-type config id :medium)]
    (. builder medium data))
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :size-limit)]
    (. builder sizeLimit data))
  (.build builder))


(defn empty-dir-volume-builder
  "Creates a  `EmptyDirVolume$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-empty-dir-volume-builder (EmptyDirVolume$Builder/create) id config))


(defn build-empty-dir-volume-options-builder
  "The build-empty-dir-volume-options-builder function updates a EmptyDirVolumeOptions$Builder instance using the provided configuration.
  The function takes the EmptyDirVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | software.amazon.awscdk.services.batch.EmptyDirMediumType | [[cdk.api.services.batch/empty-dir-medium-type]] | `:medium` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `sizeLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size-limit` |
"
  [^EmptyDirVolumeOptions$Builder builder id config]
  (when-some [data (empty-dir-medium-type config id :medium)]
    (. builder medium data))
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :size-limit)]
    (. builder sizeLimit data))
  (.build builder))


(defn empty-dir-volume-options-builder
  "Creates a  `EmptyDirVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-empty-dir-volume-options-builder (new EmptyDirVolumeOptions$Builder) id config))


(defn build-fairshare-scheduling-policy-builder
  "The build-fairshare-scheduling-policy-builder function updates a FairshareSchedulingPolicy$Builder instance using the provided configuration.
  The function takes the FairshareSchedulingPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `schedulingPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-name` |
| `shareDecay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:share-decay` |
| `shares` | java.util.List | [[cdk.support/lookup-entry]] | `:shares` |
"
  [^FairshareSchedulingPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-reservation)]
    (. builder computeReservation data))
  (when-some [data (lookup-entry config id :scheduling-policy-name)]
    (. builder schedulingPolicyName data))
  (when-some [data (lookup-entry config id :share-decay)]
    (. builder shareDecay data))
  (when-some [data (lookup-entry config id :shares)]
    (. builder shares data))
  (.build builder))


(defn fairshare-scheduling-policy-builder
  "Creates a  `FairshareSchedulingPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-fairshare-scheduling-policy-builder (FairshareSchedulingPolicy$Builder/create scope (name id)) id config))


(defn build-fairshare-scheduling-policy-props-builder
  "The build-fairshare-scheduling-policy-props-builder function updates a FairshareSchedulingPolicyProps$Builder instance using the provided configuration.
  The function takes the FairshareSchedulingPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `schedulingPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-name` |
| `shareDecay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:share-decay` |
| `shares` | java.util.List | [[cdk.support/lookup-entry]] | `:shares` |
"
  [^FairshareSchedulingPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-reservation)]
    (. builder computeReservation data))
  (when-some [data (lookup-entry config id :scheduling-policy-name)]
    (. builder schedulingPolicyName data))
  (when-some [data (lookup-entry config id :share-decay)]
    (. builder shareDecay data))
  (when-some [data (lookup-entry config id :shares)]
    (. builder shares data))
  (.build builder))


(defn fairshare-scheduling-policy-props-builder
  "Creates a  `FairshareSchedulingPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-fairshare-scheduling-policy-props-builder (new FairshareSchedulingPolicyProps$Builder) id config))


(defn build-fargate-compute-environment-builder
  "The build-fargate-compute-environment-builder function updates a FargateComputeEnvironment$Builder instance using the provided configuration.
  The function takes the FargateComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateComputeEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn fargate-compute-environment-builder
  "Creates a  `FargateComputeEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-fargate-compute-environment-builder (FargateComputeEnvironment$Builder/create scope (name id)) id config))


(defn build-fargate-compute-environment-props-builder
  "The build-fargate-compute-environment-props-builder function updates a FargateComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the FargateComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateComputeEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn fargate-compute-environment-props-builder
  "Creates a  `FargateComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-fargate-compute-environment-props-builder (new FargateComputeEnvironmentProps$Builder) id config))


(defn build-host-path-volume-builder
  "The build-host-path-volume-builder function updates a HostPathVolume$Builder instance using the provided configuration.
  The function takes the HostPathVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^HostPathVolume$Builder builder id config]
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn host-path-volume-builder
  "Creates a  `HostPathVolume$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-host-path-volume-builder (HostPathVolume$Builder/create) id config))


(defn build-host-path-volume-options-builder
  "The build-host-path-volume-options-builder function updates a HostPathVolumeOptions$Builder instance using the provided configuration.
  The function takes the HostPathVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^HostPathVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn host-path-volume-options-builder
  "Creates a  `HostPathVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-host-path-volume-options-builder (new HostPathVolumeOptions$Builder) id config))


(defn build-host-volume-builder
  "The build-host-volume-builder function updates a HostVolume$Builder instance using the provided configuration.
  The function takes the HostVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^HostVolume$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn host-volume-builder
  "Creates a  `HostVolume$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-host-volume-builder (HostVolume$Builder/create) id config))


(defn build-host-volume-options-builder
  "The build-host-volume-options-builder function updates a HostVolumeOptions$Builder instance using the provided configuration.
  The function takes the HostVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
"
  [^HostVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (.build builder))


(defn host-volume-options-builder
  "Creates a  `HostVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-host-volume-options-builder (new HostVolumeOptions$Builder) id config))


(defn build-job-definition-props-builder
  "The build-job-definition-props-builder function updates a JobDefinitionProps$Builder instance using the provided configuration.
  The function takes the JobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^JobDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn job-definition-props-builder
  "Creates a  `JobDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-job-definition-props-builder (new JobDefinitionProps$Builder) id config))


(defn build-job-queue-builder
  "The build-job-queue-builder function updates a JobQueue$Builder instance using the provided configuration.
  The function takes the JobQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironments` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environments` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicy` | software.amazon.awscdk.services.batch.ISchedulingPolicy | [[cdk.support/lookup-entry]] | `:scheduling-policy` |
"
  [^JobQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environments)]
    (. builder computeEnvironments data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :job-queue-name)]
    (. builder jobQueueName data))
  (when-some [data (lookup-entry config id :job-state-time-limit-actions)]
    (. builder jobStateTimeLimitActions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :scheduling-policy)]
    (. builder schedulingPolicy data))
  (.build builder))


(defn job-queue-builder
  "Creates a  `JobQueue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-job-queue-builder (JobQueue$Builder/create scope (name id)) id config))


(defn build-job-queue-props-builder
  "The build-job-queue-props-builder function updates a JobQueueProps$Builder instance using the provided configuration.
  The function takes the JobQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironments` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environments` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicy` | software.amazon.awscdk.services.batch.ISchedulingPolicy | [[cdk.support/lookup-entry]] | `:scheduling-policy` |
"
  [^JobQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environments)]
    (. builder computeEnvironments data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :job-queue-name)]
    (. builder jobQueueName data))
  (when-some [data (lookup-entry config id :job-state-time-limit-actions)]
    (. builder jobStateTimeLimitActions data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :scheduling-policy)]
    (. builder schedulingPolicy data))
  (.build builder))


(defn job-queue-props-builder
  "Creates a  `JobQueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-job-queue-props-builder (new JobQueueProps$Builder) id config))


(defn build-job-state-time-limit-action-builder
  "The build-job-state-time-limit-action-builder function updates a JobStateTimeLimitAction$Builder instance using the provided configuration.
  The function takes the JobStateTimeLimitAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction | [[cdk.api.services.batch/job-state-time-limit-actions-action]] | `:action` |
| `maxTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-time` |
| `reason` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason | [[cdk.api.services.batch/job-state-time-limit-actions-reason]] | `:reason` |
| `state` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState | [[cdk.api.services.batch/job-state-time-limit-actions-state]] | `:state` |
"
  [^JobStateTimeLimitAction$Builder builder id config]
  (when-some [data (job-state-time-limit-actions-action config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :max-time)]
    (. builder maxTime data))
  (when-some [data (job-state-time-limit-actions-reason config id :reason)]
    (. builder reason data))
  (when-some [data (job-state-time-limit-actions-state config id :state)]
    (. builder state data))
  (.build builder))


(defn job-state-time-limit-action-builder
  "Creates a  `JobStateTimeLimitAction$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-job-state-time-limit-action-builder (new JobStateTimeLimitAction$Builder) id config))


(defn build-linux-parameters-builder
  "The build-linux-parameters-builder function updates a LinuxParameters$Builder instance using the provided configuration.
  The function takes the LinuxParameters$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
"
  [^LinuxParameters$Builder builder id config]
  (when-some [data (lookup-entry config id :init-process-enabled)]
    (. builder initProcessEnabled data))
  (when-some [data (lookup-entry config id :max-swap)]
    (. builder maxSwap data))
  (when-some [data (lookup-entry config id :shared-memory-size)]
    (. builder sharedMemorySize data))
  (when-some [data (lookup-entry config id :swappiness)]
    (. builder swappiness data))
  (.build builder))


(defn linux-parameters-builder
  "Creates a  `LinuxParameters$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-linux-parameters-builder (LinuxParameters$Builder/create scope (name id)) id config))


(defn build-linux-parameters-props-builder
  "The build-linux-parameters-props-builder function updates a LinuxParametersProps$Builder instance using the provided configuration.
  The function takes the LinuxParametersProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
"
  [^LinuxParametersProps$Builder builder id config]
  (when-some [data (lookup-entry config id :init-process-enabled)]
    (. builder initProcessEnabled data))
  (when-some [data (lookup-entry config id :max-swap)]
    (. builder maxSwap data))
  (when-some [data (lookup-entry config id :shared-memory-size)]
    (. builder sharedMemorySize data))
  (when-some [data (lookup-entry config id :swappiness)]
    (. builder swappiness data))
  (.build builder))


(defn linux-parameters-props-builder
  "Creates a  `LinuxParametersProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-linux-parameters-props-builder (new LinuxParametersProps$Builder) id config))


(defn build-managed-compute-environment-props-builder
  "The build-managed-compute-environment-props-builder function updates a ManagedComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the ManagedComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ManagedComputeEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn managed-compute-environment-props-builder
  "Creates a  `ManagedComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-managed-compute-environment-props-builder (new ManagedComputeEnvironmentProps$Builder) id config))


(defn build-managed-ec2-ecs-compute-environment-builder
  "The build-managed-ec2-ecs-compute-environment-builder function updates a ManagedEc2EcsComputeEnvironment$Builder instance using the provided configuration.
  The function takes the ManagedEc2EcsComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.batch.AllocationStrategy | [[cdk.api.services.batch/allocation-strategy]] | `:allocation-strategy` |
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `images` | java.util.List | [[cdk.support/lookup-entry]] | `:images` |
| `instanceClasses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-classes` |
| `instanceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `minvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minv-cpus` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `spotBidPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-bid-percentage` |
| `spotFleetRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:spot-fleet-role` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `useOptimalInstanceClasses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-optimal-instance-classes` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ManagedEc2EcsComputeEnvironment$Builder builder id config]
  (when-some [data (allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :images)]
    (. builder images data))
  (when-some [data (lookup-entry config id :instance-classes)]
    (. builder instanceClasses data))
  (when-some [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :minv-cpus)]
    (. builder minvCpus data))
  (when-some [data (lookup-entry config id :placement-group)]
    (. builder placementGroup data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :spot-bid-percentage)]
    (. builder spotBidPercentage data))
  (when-some [data (lookup-entry config id :spot-fleet-role)]
    (. builder spotFleetRole data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :use-optimal-instance-classes)]
    (. builder useOptimalInstanceClasses data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn managed-ec2-ecs-compute-environment-builder
  "Creates a  `ManagedEc2EcsComputeEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-managed-ec2-ecs-compute-environment-builder (ManagedEc2EcsComputeEnvironment$Builder/create scope (name id)) id config))


(defn build-managed-ec2-ecs-compute-environment-props-builder
  "The build-managed-ec2-ecs-compute-environment-props-builder function updates a ManagedEc2EcsComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the ManagedEc2EcsComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.batch.AllocationStrategy | [[cdk.api.services.batch/allocation-strategy]] | `:allocation-strategy` |
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `images` | java.util.List | [[cdk.support/lookup-entry]] | `:images` |
| `instanceClasses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-classes` |
| `instanceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `minvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minv-cpus` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `spotBidPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-bid-percentage` |
| `spotFleetRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:spot-fleet-role` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `useOptimalInstanceClasses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-optimal-instance-classes` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ManagedEc2EcsComputeEnvironmentProps$Builder builder id config]
  (when-some [data (allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :images)]
    (. builder images data))
  (when-some [data (lookup-entry config id :instance-classes)]
    (. builder instanceClasses data))
  (when-some [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :minv-cpus)]
    (. builder minvCpus data))
  (when-some [data (lookup-entry config id :placement-group)]
    (. builder placementGroup data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :spot-bid-percentage)]
    (. builder spotBidPercentage data))
  (when-some [data (lookup-entry config id :spot-fleet-role)]
    (. builder spotFleetRole data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :use-optimal-instance-classes)]
    (. builder useOptimalInstanceClasses data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn managed-ec2-ecs-compute-environment-props-builder
  "Creates a  `ManagedEc2EcsComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-managed-ec2-ecs-compute-environment-props-builder (new ManagedEc2EcsComputeEnvironmentProps$Builder) id config))


(defn build-managed-ec2-eks-compute-environment-builder
  "The build-managed-ec2-eks-compute-environment-builder function updates a ManagedEc2EksComputeEnvironment$Builder instance using the provided configuration.
  The function takes the ManagedEc2EksComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.batch.AllocationStrategy | [[cdk.api.services.batch/allocation-strategy]] | `:allocation-strategy` |
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `eksCluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:eks-cluster` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `images` | java.util.List | [[cdk.support/lookup-entry]] | `:images` |
| `instanceClasses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-classes` |
| `instanceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `kubernetesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-namespace` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `minvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minv-cpus` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `spotBidPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-bid-percentage` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `useOptimalInstanceClasses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-optimal-instance-classes` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ManagedEc2EksComputeEnvironment$Builder builder id config]
  (when-some [data (allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :eks-cluster)]
    (. builder eksCluster data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :images)]
    (. builder images data))
  (when-some [data (lookup-entry config id :instance-classes)]
    (. builder instanceClasses data))
  (when-some [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :kubernetes-namespace)]
    (. builder kubernetesNamespace data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :minv-cpus)]
    (. builder minvCpus data))
  (when-some [data (lookup-entry config id :placement-group)]
    (. builder placementGroup data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :spot-bid-percentage)]
    (. builder spotBidPercentage data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :use-optimal-instance-classes)]
    (. builder useOptimalInstanceClasses data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn managed-ec2-eks-compute-environment-builder
  "Creates a  `ManagedEc2EksComputeEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-managed-ec2-eks-compute-environment-builder (ManagedEc2EksComputeEnvironment$Builder/create scope (name id)) id config))


(defn build-managed-ec2-eks-compute-environment-props-builder
  "The build-managed-ec2-eks-compute-environment-props-builder function updates a ManagedEc2EksComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the ManagedEc2EksComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.batch.AllocationStrategy | [[cdk.api.services.batch/allocation-strategy]] | `:allocation-strategy` |
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `eksCluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:eks-cluster` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `images` | java.util.List | [[cdk.support/lookup-entry]] | `:images` |
| `instanceClasses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-classes` |
| `instanceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:instance-role` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `kubernetesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-namespace` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.ILaunchTemplate | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maxv-cpus` |
| `minvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minv-cpus` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `replaceComputeEnvironment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-compute-environment` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `spot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot` |
| `spotBidPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-bid-percentage` |
| `terminateOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-on-update` |
| `updateTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:update-timeout` |
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |
| `useOptimalInstanceClasses` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-optimal-instance-classes` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ManagedEc2EksComputeEnvironmentProps$Builder builder id config]
  (when-some [data (allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :eks-cluster)]
    (. builder eksCluster data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :images)]
    (. builder images data))
  (when-some [data (lookup-entry config id :instance-classes)]
    (. builder instanceClasses data))
  (when-some [data (lookup-entry config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :kubernetes-namespace)]
    (. builder kubernetesNamespace data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :maxv-cpus)]
    (. builder maxvCpus data))
  (when-some [data (lookup-entry config id :minv-cpus)]
    (. builder minvCpus data))
  (when-some [data (lookup-entry config id :placement-group)]
    (. builder placementGroup data))
  (when-some [data (lookup-entry config id :replace-compute-environment)]
    (. builder replaceComputeEnvironment data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :spot)]
    (. builder spot data))
  (when-some [data (lookup-entry config id :spot-bid-percentage)]
    (. builder spotBidPercentage data))
  (when-some [data (lookup-entry config id :terminate-on-update)]
    (. builder terminateOnUpdate data))
  (when-some [data (lookup-entry config id :update-timeout)]
    (. builder updateTimeout data))
  (when-some [data (lookup-entry config id :update-to-latest-image-version)]
    (. builder updateToLatestImageVersion data))
  (when-some [data (lookup-entry config id :use-optimal-instance-classes)]
    (. builder useOptimalInstanceClasses data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn managed-ec2-eks-compute-environment-props-builder
  "Creates a  `ManagedEc2EksComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-managed-ec2-eks-compute-environment-props-builder (new ManagedEc2EksComputeEnvironmentProps$Builder) id config))


(defn build-multi-node-container-builder
  "The build-multi-node-container-builder function updates a MultiNodeContainer$Builder instance using the provided configuration.
  The function takes the MultiNodeContainer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `endNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-node` |
| `startNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-node` |
"
  [^MultiNodeContainer$Builder builder id config]
  (when-some [data (lookup-entry config id :container)]
    (. builder container data))
  (when-some [data (lookup-entry config id :end-node)]
    (. builder endNode data))
  (when-some [data (lookup-entry config id :start-node)]
    (. builder startNode data))
  (.build builder))


(defn multi-node-container-builder
  "Creates a  `MultiNodeContainer$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-multi-node-container-builder (new MultiNodeContainer$Builder) id config))


(defn build-multi-node-job-definition-builder
  "The build-multi-node-job-definition-builder function updates a MultiNodeJobDefinition$Builder instance using the provided configuration.
  The function takes the MultiNodeJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `mainNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:main-node` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^MultiNodeJobDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :main-node)]
    (. builder mainNode data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn multi-node-job-definition-builder
  "Creates a  `MultiNodeJobDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-multi-node-job-definition-builder (MultiNodeJobDefinition$Builder/create scope (name id)) id config))


(defn build-multi-node-job-definition-props-builder
  "The build-multi-node-job-definition-props-builder function updates a MultiNodeJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the MultiNodeJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `mainNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:main-node` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^MultiNodeJobDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-some [data (lookup-entry config id :main-node)]
    (. builder mainNode data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :retry-attempts)]
    (. builder retryAttempts data))
  (when-some [data (lookup-entry config id :retry-strategies)]
    (. builder retryStrategies data))
  (when-some [data (lookup-entry config id :scheduling-priority)]
    (. builder schedulingPriority data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn multi-node-job-definition-props-builder
  "Creates a  `MultiNodeJobDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-multi-node-job-definition-props-builder (new MultiNodeJobDefinitionProps$Builder) id config))


(defn build-ordered-compute-environment-builder
  "The build-ordered-compute-environment-builder function updates a OrderedComputeEnvironment$Builder instance using the provided configuration.
  The function takes the OrderedComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironment` | software.amazon.awscdk.services.batch.IComputeEnvironment | [[cdk.support/lookup-entry]] | `:compute-environment` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |
"
  [^OrderedComputeEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment)]
    (. builder computeEnvironment data))
  (when-some [data (lookup-entry config id :order)]
    (. builder order data))
  (.build builder))


(defn ordered-compute-environment-builder
  "Creates a  `OrderedComputeEnvironment$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ordered-compute-environment-builder (new OrderedComputeEnvironment$Builder) id config))


(defn build-secret-path-volume-builder
  "The build-secret-path-volume-builder function updates a SecretPathVolume$Builder instance using the provided configuration.
  The function takes the SecretPathVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^SecretPathVolume$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :optional)]
    (. builder optional data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn secret-path-volume-builder
  "Creates a  `SecretPathVolume$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-secret-path-volume-builder (SecretPathVolume$Builder/create) id config))


(defn build-secret-path-volume-options-builder
  "The build-secret-path-volume-options-builder function updates a SecretPathVolumeOptions$Builder instance using the provided configuration.
  The function takes the SecretPathVolumeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^SecretPathVolumeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :optional)]
    (. builder optional data))
  (when-some [data (lookup-entry config id :readonly)]
    (. builder readonly data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn secret-path-volume-options-builder
  "Creates a  `SecretPathVolumeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-secret-path-volume-options-builder (new SecretPathVolumeOptions$Builder) id config))


(defn build-secret-version-info-builder
  "The build-secret-version-info-builder function updates a SecretVersionInfo$Builder instance using the provided configuration.
  The function takes the SecretVersionInfo$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
| `versionStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-stage` |
"
  [^SecretVersionInfo$Builder builder id config]
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (when-some [data (lookup-entry config id :version-stage)]
    (. builder versionStage data))
  (.build builder))


(defn secret-version-info-builder
  "Creates a  `SecretVersionInfo$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-secret-version-info-builder (new SecretVersionInfo$Builder) id config))


(defn build-share-builder
  "The build-share-builder function updates a Share$Builder instance using the provided configuration.
  The function takes the Share$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shareIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-identifier` |
| `weightFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight-factor` |
"
  [^Share$Builder builder id config]
  (when-some [data (lookup-entry config id :share-identifier)]
    (. builder shareIdentifier data))
  (when-some [data (lookup-entry config id :weight-factor)]
    (. builder weightFactor data))
  (.build builder))


(defn share-builder
  "Creates a  `Share$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-share-builder (new Share$Builder) id config))


(defn build-tmpfs-builder
  "The build-tmpfs-builder function updates a Tmpfs$Builder instance using the provided configuration.
  The function takes the Tmpfs$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size` |
"
  [^Tmpfs$Builder builder id config]
  (when-some [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn tmpfs-builder
  "Creates a  `Tmpfs$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-tmpfs-builder (new Tmpfs$Builder) id config))


(defn build-ulimit-builder
  "The build-ulimit-builder function updates a Ulimit$Builder instance using the provided configuration.
  The function takes the Ulimit$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | software.amazon.awscdk.services.batch.UlimitName | [[cdk.api.services.batch/ulimit-name]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |
"
  [^Ulimit$Builder builder id config]
  (when-some [data (lookup-entry config id :hard-limit)]
    (. builder hardLimit data))
  (when-some [data (ulimit-name config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :soft-limit)]
    (. builder softLimit data))
  (.build builder))


(defn ulimit-builder
  "Creates a  `Ulimit$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ulimit-builder (new Ulimit$Builder) id config))


(defn build-unmanaged-compute-environment-builder
  "The build-unmanaged-compute-environment-builder function updates a UnmanagedComputeEnvironment$Builder instance using the provided configuration.
  The function takes the UnmanagedComputeEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |
"
  [^UnmanagedComputeEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :unmanagedv-cpus)]
    (. builder unmanagedvCpus data))
  (.build builder))


(defn unmanaged-compute-environment-builder
  "Creates a  `UnmanagedComputeEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-unmanaged-compute-environment-builder (UnmanagedComputeEnvironment$Builder/create scope (name id)) id config))


(defn build-unmanaged-compute-environment-props-builder
  "The build-unmanaged-compute-environment-props-builder function updates a UnmanagedComputeEnvironmentProps$Builder instance using the provided configuration.
  The function takes the UnmanagedComputeEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |
"
  [^UnmanagedComputeEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compute-environment-name)]
    (. builder computeEnvironmentName data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :unmanagedv-cpus)]
    (. builder unmanagedvCpus data))
  (.build builder))


(defn unmanaged-compute-environment-props-builder
  "Creates a  `UnmanagedComputeEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-unmanaged-compute-environment-props-builder (new UnmanagedComputeEnvironmentProps$Builder) id config))