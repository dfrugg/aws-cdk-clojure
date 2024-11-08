(ns cdk.api.services.batch
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.batch package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.ecs :refer [fargate-platform-version]])
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


(defn cfn-compute-environment-builder
  "The cfn-compute-environment-builder function buildes out new instances of 
CfnComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `updatePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-policy` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :compute-resources)]
      (. builder computeResources data))
    (when-let [data (lookup-entry config id :eks-configuration)]
      (. builder eksConfiguration data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unmanagedv-cpus)]
      (. builder unmanagedvCpus data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (.build builder)))


(defn cfn-compute-environment-compute-resources-property-builder
  "The cfn-compute-environment-compute-resources-property-builder function buildes out new instances of 
CfnComputeEnvironment$ComputeResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `updateToLatestImageVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-to-latest-image-version` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$ComputeResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :bid-percentage)]
      (. builder bidPercentage data))
    (when-let [data (lookup-entry config id :desiredv-cpus)]
      (. builder desiredvCpus data))
    (when-let [data (lookup-entry config id :ec2-configuration)]
      (. builder ec2Configuration data))
    (when-let [data (lookup-entry config id :ec2-key-pair)]
      (. builder ec2KeyPair data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :minv-cpus)]
      (. builder minvCpus data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :spot-iam-fleet-role)]
      (. builder spotIamFleetRole data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (.build builder)))


(defn cfn-compute-environment-ec2-configuration-object-property-builder
  "The cfn-compute-environment-ec2-configuration-object-property-builder function buildes out new instances of 
CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageIdOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id-override` |
| `imageKubernetesVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-kubernetes-version` |
| `imageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-type` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$Ec2ConfigurationObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-id-override)]
      (. builder imageIdOverride data))
    (when-let [data (lookup-entry config id :image-kubernetes-version)]
      (. builder imageKubernetesVersion data))
    (when-let [data (lookup-entry config id :image-type)]
      (. builder imageType data))
    (.build builder)))


(defn cfn-compute-environment-eks-configuration-property-builder
  "The cfn-compute-environment-eks-configuration-property-builder function buildes out new instances of 
CfnComputeEnvironment$EksConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-cluster-arn` |
| `kubernetesNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:kubernetes-namespace` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$EksConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :eks-cluster-arn)]
      (. builder eksClusterArn data))
    (when-let [data (lookup-entry config id :kubernetes-namespace)]
      (. builder kubernetesNamespace data))
    (.build builder)))


(defn cfn-compute-environment-launch-template-specification-property-builder
  "The cfn-compute-environment-launch-template-specification-property-builder function buildes out new instances of 
CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$LaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-compute-environment-props-builder
  "The cfn-compute-environment-props-builder function buildes out new instances of 
CfnComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `updatePolicy` | software.amazon.awscdk.services.batch.CfnComputeEnvironment$UpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:update-policy` |"
  [stack id config]
  (let [builder (CfnComputeEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :compute-resources)]
      (. builder computeResources data))
    (when-let [data (lookup-entry config id :eks-configuration)]
      (. builder eksConfiguration data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unmanagedv-cpus)]
      (. builder unmanagedvCpus data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (.build builder)))


(defn cfn-compute-environment-update-policy-property-builder
  "The cfn-compute-environment-update-policy-property-builder function buildes out new instances of 
CfnComputeEnvironment$UpdatePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobExecutionTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:job-execution-timeout-minutes` |
| `terminateJobsOnUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:terminate-jobs-on-update` |"
  [stack id config]
  (let [builder (CfnComputeEnvironment$UpdatePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :job-execution-timeout-minutes)]
      (. builder jobExecutionTimeoutMinutes data))
    (when-let [data (lookup-entry config id :terminate-jobs-on-update)]
      (. builder terminateJobsOnUpdate data))
    (.build builder)))


(defn cfn-job-definition-authorization-config-property-builder
  "The cfn-job-definition-authorization-config-property-builder function buildes out new instances of 
CfnJobDefinition$AuthorizationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |"
  [stack id config]
  (let [builder (CfnJobDefinition$AuthorizationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-point-id)]
      (. builder accessPointId data))
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (.build builder)))


(defn cfn-job-definition-builder
  "The cfn-job-definition-builder function buildes out new instances of 
CfnJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnJobDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-properties)]
      (. builder containerProperties data))
    (when-let [data (lookup-entry config id :ecs-properties)]
      (. builder ecsProperties data))
    (when-let [data (lookup-entry config id :eks-properties)]
      (. builder eksProperties data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :node-properties)]
      (. builder nodeProperties data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :platform-capabilities)]
      (. builder platformCapabilities data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-strategy)]
      (. builder retryStrategy data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-job-definition-container-properties-property-builder
  "The cfn-job-definition-container-properties-property-builder function buildes out new instances of 
CfnJobDefinition$ContainerPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnJobDefinition$ContainerPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :fargate-platform-configuration)]
      (. builder fargatePlatformConfiguration data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :job-role-arn)]
      (. builder jobRoleArn data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :mount-points)]
      (. builder mountPoints data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :repository-credentials)]
      (. builder repositoryCredentials data))
    (when-let [data (lookup-entry config id :resource-requirements)]
      (. builder resourceRequirements data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :vcpus)]
      (. builder vcpus data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-job-definition-device-property-builder
  "The cfn-job-definition-device-property-builder function buildes out new instances of 
CfnJobDefinition$DeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |"
  [stack id config]
  (let [builder (CfnJobDefinition$DeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (.build builder)))


(defn cfn-job-definition-ecs-properties-property-builder
  "The cfn-job-definition-ecs-properties-property-builder function buildes out new instances of 
CfnJobDefinition$EcsPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-properties` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EcsPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :task-properties)]
      (. builder taskProperties data))
    (.build builder)))


(defn cfn-job-definition-ecs-task-properties-property-builder
  "The cfn-job-definition-ecs-task-properties-property-builder function buildes out new instances of 
CfnJobDefinition$EcsTaskPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EcsTaskPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-role-arn)]
      (. builder taskRoleArn data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-job-definition-efs-volume-configuration-property-builder
  "The cfn-job-definition-efs-volume-configuration-property-builder function buildes out new instances of 
CfnJobDefinition$EfsVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EfsVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :root-directory)]
      (. builder rootDirectory data))
    (when-let [data (lookup-entry config id :transit-encryption)]
      (. builder transitEncryption data))
    (when-let [data (lookup-entry config id :transit-encryption-port)]
      (. builder transitEncryptionPort data))
    (.build builder)))


(defn cfn-job-definition-eks-container-environment-variable-property-builder
  "The cfn-job-definition-eks-container-environment-variable-property-builder function buildes out new instances of 
CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksContainerEnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-job-definition-eks-container-property-builder
  "The cfn-job-definition-eks-container-property-builder function buildes out new instances of 
CfnJobDefinition$EksContainerProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumeMounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-mounts` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksContainerProperty$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :image-pull-policy)]
      (. builder imagePullPolicy data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :security-context)]
      (. builder securityContext data))
    (when-let [data (lookup-entry config id :volume-mounts)]
      (. builder volumeMounts data))
    (.build builder)))


(defn cfn-job-definition-eks-container-volume-mount-property-builder
  "The cfn-job-definition-eks-container-volume-mount-property-builder function buildes out new instances of 
CfnJobDefinition$EksContainerVolumeMountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksContainerVolumeMountProperty$Builder.)]
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (.build builder)))


(defn cfn-job-definition-eks-properties-property-builder
  "The cfn-job-definition-eks-properties-property-builder function buildes out new instances of 
CfnJobDefinition$EksPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `podProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$PodPropertiesProperty | [[cdk.support/lookup-entry]] | `:pod-properties` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :pod-properties)]
      (. builder podProperties data))
    (.build builder)))


(defn cfn-job-definition-eks-secret-property-builder
  "The cfn-job-definition-eks-secret-property-builder function buildes out new instances of 
CfnJobDefinition$EksSecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksSecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :optional)]
      (. builder optional data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn cfn-job-definition-eks-volume-property-builder
  "The cfn-job-definition-eks-volume-property-builder function buildes out new instances of 
CfnJobDefinition$EksVolumeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emptyDir` | software.amazon.awscdk.services.batch.CfnJobDefinition$EmptyDirProperty | [[cdk.support/lookup-entry]] | `:empty-dir` |
| `hostPath` | software.amazon.awscdk.services.batch.CfnJobDefinition$HostPathProperty | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secret` | software.amazon.awscdk.services.batch.CfnJobDefinition$EksSecretProperty | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EksVolumeProperty$Builder.)]
    (when-let [data (lookup-entry config id :empty-dir)]
      (. builder emptyDir data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))


(defn cfn-job-definition-empty-dir-property-builder
  "The cfn-job-definition-empty-dir-property-builder function buildes out new instances of 
CfnJobDefinition$EmptyDirProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | java.lang.String | [[cdk.support/lookup-entry]] | `:medium` |
| `sizeLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-limit` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EmptyDirProperty$Builder.)]
    (when-let [data (lookup-entry config id :medium)]
      (. builder medium data))
    (when-let [data (lookup-entry config id :size-limit)]
      (. builder sizeLimit data))
    (.build builder)))


(defn cfn-job-definition-environment-property-builder
  "The cfn-job-definition-environment-property-builder function buildes out new instances of 
CfnJobDefinition$EnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-job-definition-ephemeral-storage-property-builder
  "The cfn-job-definition-ephemeral-storage-property-builder function buildes out new instances of 
CfnJobDefinition$EphemeralStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EphemeralStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :size-in-gi-b)]
      (. builder sizeInGiB data))
    (.build builder)))


(defn cfn-job-definition-evaluate-on-exit-property-builder
  "The cfn-job-definition-evaluate-on-exit-property-builder function buildes out new instances of 
CfnJobDefinition$EvaluateOnExitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `onExitCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-exit-code` |
| `onReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-reason` |
| `onStatusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-status-reason` |"
  [stack id config]
  (let [builder (CfnJobDefinition$EvaluateOnExitProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :on-exit-code)]
      (. builder onExitCode data))
    (when-let [data (lookup-entry config id :on-reason)]
      (. builder onReason data))
    (when-let [data (lookup-entry config id :on-status-reason)]
      (. builder onStatusReason data))
    (.build builder)))


(defn cfn-job-definition-fargate-platform-configuration-property-builder
  "The cfn-job-definition-fargate-platform-configuration-property-builder function buildes out new instances of 
CfnJobDefinition$FargatePlatformConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |"
  [stack id config]
  (let [builder (CfnJobDefinition$FargatePlatformConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (.build builder)))


(defn cfn-job-definition-host-path-property-builder
  "The cfn-job-definition-host-path-property-builder function buildes out new instances of 
CfnJobDefinition$HostPathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnJobDefinition$HostPathProperty$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-job-definition-image-pull-secret-property-builder
  "The cfn-job-definition-image-pull-secret-property-builder function buildes out new instances of 
CfnJobDefinition$ImagePullSecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnJobDefinition$ImagePullSecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-job-definition-linux-parameters-property-builder
  "The cfn-job-definition-linux-parameters-property-builder function buildes out new instances of 
CfnJobDefinition$LinuxParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
| `tmpfs` | java.util.List | [[cdk.support/lookup-entry]] | `:tmpfs` |"
  [stack id config]
  (let [builder (CfnJobDefinition$LinuxParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :devices)]
      (. builder devices data))
    (when-let [data (lookup-entry config id :init-process-enabled)]
      (. builder initProcessEnabled data))
    (when-let [data (lookup-entry config id :max-swap)]
      (. builder maxSwap data))
    (when-let [data (lookup-entry config id :shared-memory-size)]
      (. builder sharedMemorySize data))
    (when-let [data (lookup-entry config id :swappiness)]
      (. builder swappiness data))
    (when-let [data (lookup-entry config id :tmpfs)]
      (. builder tmpfs data))
    (.build builder)))


(defn cfn-job-definition-log-configuration-property-builder
  "The cfn-job-definition-log-configuration-property-builder function buildes out new instances of 
CfnJobDefinition$LogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (CfnJobDefinition$LogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn cfn-job-definition-metadata-property-builder
  "The cfn-job-definition-metadata-property-builder function buildes out new instances of 
CfnJobDefinition$MetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labels` | java.lang.Object | [[cdk.support/lookup-entry]] | `:labels` |"
  [stack id config]
  (let [builder (CfnJobDefinition$MetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (.build builder)))


(defn cfn-job-definition-mount-points-property-builder
  "The cfn-job-definition-mount-points-property-builder function buildes out new instances of 
CfnJobDefinition$MountPointsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |"
  [stack id config]
  (let [builder (CfnJobDefinition$MountPointsProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-volume)]
      (. builder sourceVolume data))
    (.build builder)))


(defn cfn-job-definition-network-configuration-property-builder
  "The cfn-job-definition-network-configuration-property-builder function buildes out new instances of 
CfnJobDefinition$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |"
  [stack id config]
  (let [builder (CfnJobDefinition$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (.build builder)))


(defn cfn-job-definition-node-properties-property-builder
  "The cfn-job-definition-node-properties-property-builder function buildes out new instances of 
CfnJobDefinition$NodePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mainNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:main-node` |
| `nodeRangeProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:node-range-properties` |
| `numNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:num-nodes` |"
  [stack id config]
  (let [builder (CfnJobDefinition$NodePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :main-node)]
      (. builder mainNode data))
    (when-let [data (lookup-entry config id :node-range-properties)]
      (. builder nodeRangeProperties data))
    (when-let [data (lookup-entry config id :num-nodes)]
      (. builder numNodes data))
    (.build builder)))


(defn cfn-job-definition-node-range-property-property-builder
  "The cfn-job-definition-node-range-property-property-builder function buildes out new instances of 
CfnJobDefinition$NodeRangePropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.CfnJobDefinition$ContainerPropertiesProperty | [[cdk.support/lookup-entry]] | `:container` |
| `ecsProperties` | software.amazon.awscdk.services.batch.CfnJobDefinition$EcsPropertiesProperty | [[cdk.support/lookup-entry]] | `:ecs-properties` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `targetNodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-nodes` |"
  [stack id config]
  (let [builder (CfnJobDefinition$NodeRangePropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :ecs-properties)]
      (. builder ecsProperties data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :target-nodes)]
      (. builder targetNodes data))
    (.build builder)))


(defn cfn-job-definition-pod-properties-property-builder
  "The cfn-job-definition-pod-properties-property-builder function buildes out new instances of 
CfnJobDefinition$PodPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnJobDefinition$PodPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :dns-policy)]
      (. builder dnsPolicy data))
    (when-let [data (lookup-entry config id :host-network)]
      (. builder hostNetwork data))
    (when-let [data (lookup-entry config id :image-pull-secrets)]
      (. builder imagePullSecrets data))
    (when-let [data (lookup-entry config id :init-containers)]
      (. builder initContainers data))
    (when-let [data (lookup-entry config id :metadata)]
      (. builder metadata data))
    (when-let [data (lookup-entry config id :service-account-name)]
      (. builder serviceAccountName data))
    (when-let [data (lookup-entry config id :share-process-namespace)]
      (. builder shareProcessNamespace data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-job-definition-props-builder
  "The cfn-job-definition-props-builder function buildes out new instances of 
CfnJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnJobDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :container-properties)]
      (. builder containerProperties data))
    (when-let [data (lookup-entry config id :ecs-properties)]
      (. builder ecsProperties data))
    (when-let [data (lookup-entry config id :eks-properties)]
      (. builder eksProperties data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :node-properties)]
      (. builder nodeProperties data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :platform-capabilities)]
      (. builder platformCapabilities data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-strategy)]
      (. builder retryStrategy data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-job-definition-repository-credentials-property-builder
  "The cfn-job-definition-repository-credentials-property-builder function buildes out new instances of 
CfnJobDefinition$RepositoryCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |"
  [stack id config]
  (let [builder (CfnJobDefinition$RepositoryCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials-parameter)]
      (. builder credentialsParameter data))
    (.build builder)))


(defn cfn-job-definition-resource-requirement-property-builder
  "The cfn-job-definition-resource-requirement-property-builder function buildes out new instances of 
CfnJobDefinition$ResourceRequirementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnJobDefinition$ResourceRequirementProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-job-definition-resources-property-builder
  "The cfn-job-definition-resources-property-builder function buildes out new instances of 
CfnJobDefinition$ResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `limits` | java.lang.Object | [[cdk.support/lookup-entry]] | `:limits` |
| `requests` | java.lang.Object | [[cdk.support/lookup-entry]] | `:requests` |"
  [stack id config]
  (let [builder (CfnJobDefinition$ResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :limits)]
      (. builder limits data))
    (when-let [data (lookup-entry config id :requests)]
      (. builder requests data))
    (.build builder)))


(defn cfn-job-definition-retry-strategy-property-builder
  "The cfn-job-definition-retry-strategy-property-builder function buildes out new instances of 
CfnJobDefinition$RetryStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `evaluateOnExit` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluate-on-exit` |"
  [stack id config]
  (let [builder (CfnJobDefinition$RetryStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :attempts)]
      (. builder attempts data))
    (when-let [data (lookup-entry config id :evaluate-on-exit)]
      (. builder evaluateOnExit data))
    (.build builder)))


(defn cfn-job-definition-runtime-platform-property-builder
  "The cfn-job-definition-runtime-platform-property-builder function buildes out new instances of 
CfnJobDefinition$RuntimePlatformProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system-family` |"
  [stack id config]
  (let [builder (CfnJobDefinition$RuntimePlatformProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-architecture)]
      (. builder cpuArchitecture data))
    (when-let [data (lookup-entry config id :operating-system-family)]
      (. builder operatingSystemFamily data))
    (.build builder)))


(defn cfn-job-definition-secret-property-builder
  "The cfn-job-definition-secret-property-builder function buildes out new instances of 
CfnJobDefinition$SecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |"
  [stack id config]
  (let [builder (CfnJobDefinition$SecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value-from)]
      (. builder valueFrom data))
    (.build builder)))


(defn cfn-job-definition-security-context-property-builder
  "The cfn-job-definition-security-context-property-builder function buildes out new instances of 
CfnJobDefinition$SecurityContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowPrivilegeEscalation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-privilege-escalation` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `readOnlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-root-filesystem` |
| `runAsGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-group` |
| `runAsNonRoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:run-as-non-root` |
| `runAsUser` | java.lang.Number | [[cdk.support/lookup-entry]] | `:run-as-user` |"
  [stack id config]
  (let [builder (CfnJobDefinition$SecurityContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-privilege-escalation)]
      (. builder allowPrivilegeEscalation data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :read-only-root-filesystem)]
      (. builder readOnlyRootFilesystem data))
    (when-let [data (lookup-entry config id :run-as-group)]
      (. builder runAsGroup data))
    (when-let [data (lookup-entry config id :run-as-non-root)]
      (. builder runAsNonRoot data))
    (when-let [data (lookup-entry config id :run-as-user)]
      (. builder runAsUser data))
    (.build builder)))


(defn cfn-job-definition-task-container-dependency-property-builder
  "The cfn-job-definition-task-container-dependency-property-builder function buildes out new instances of 
CfnJobDefinition$TaskContainerDependencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |"
  [stack id config]
  (let [builder (CfnJobDefinition$TaskContainerDependencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (.build builder)))


(defn cfn-job-definition-task-container-properties-property-builder
  "The cfn-job-definition-task-container-properties-property-builder function buildes out new instances of 
CfnJobDefinition$TaskContainerPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnJobDefinition$TaskContainerPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :depends-on)]
      (. builder dependsOn data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :mount-points)]
      (. builder mountPoints data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :repository-credentials)]
      (. builder repositoryCredentials data))
    (when-let [data (lookup-entry config id :resource-requirements)]
      (. builder resourceRequirements data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-job-definition-timeout-property-builder
  "The cfn-job-definition-timeout-property-builder function buildes out new instances of 
CfnJobDefinition$TimeoutProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attemptDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempt-duration-seconds` |"
  [stack id config]
  (let [builder (CfnJobDefinition$TimeoutProperty$Builder.)]
    (when-let [data (lookup-entry config id :attempt-duration-seconds)]
      (. builder attemptDurationSeconds data))
    (.build builder)))


(defn cfn-job-definition-tmpfs-property-builder
  "The cfn-job-definition-tmpfs-property-builder function buildes out new instances of 
CfnJobDefinition$TmpfsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnJobDefinition$TmpfsProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-job-definition-ulimit-property-builder
  "The cfn-job-definition-ulimit-property-builder function buildes out new instances of 
CfnJobDefinition$UlimitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |"
  [stack id config]
  (let [builder (CfnJobDefinition$UlimitProperty$Builder.)]
    (when-let [data (lookup-entry config id :hard-limit)]
      (. builder hardLimit data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :soft-limit)]
      (. builder softLimit data))
    (.build builder)))


(defn cfn-job-definition-volumes-host-property-builder
  "The cfn-job-definition-volumes-host-property-builder function buildes out new instances of 
CfnJobDefinition$VolumesHostProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnJobDefinition$VolumesHostProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-job-definition-volumes-property-builder
  "The cfn-job-definition-volumes-property-builder function buildes out new instances of 
CfnJobDefinition$VolumesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `host` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnJobDefinition$VolumesProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs-volume-configuration)]
      (. builder efsVolumeConfiguration data))
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-job-queue-builder
  "The cfn-job-queue-builder function buildes out new instances of 
CfnJobQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environment-order` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-arn` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnJobQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-environment-order)]
      (. builder computeEnvironmentOrder data))
    (when-let [data (lookup-entry config id :job-queue-name)]
      (. builder jobQueueName data))
    (when-let [data (lookup-entry config id :job-state-time-limit-actions)]
      (. builder jobStateTimeLimitActions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :scheduling-policy-arn)]
      (. builder schedulingPolicyArn data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-job-queue-compute-environment-order-property-builder
  "The cfn-job-queue-compute-environment-order-property-builder function buildes out new instances of 
CfnJobQueue$ComputeEnvironmentOrderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironment` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |"
  [stack id config]
  (let [builder (CfnJobQueue$ComputeEnvironmentOrderProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment)]
      (. builder computeEnvironment data))
    (when-let [data (lookup-entry config id :order)]
      (. builder order data))
    (.build builder)))


(defn cfn-job-queue-job-state-time-limit-action-property-builder
  "The cfn-job-queue-job-state-time-limit-action-property-builder function buildes out new instances of 
CfnJobQueue$JobStateTimeLimitActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `maxTimeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-time-seconds` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnJobQueue$JobStateTimeLimitActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :max-time-seconds)]
      (. builder maxTimeSeconds data))
    (when-let [data (lookup-entry config id :reason)]
      (. builder reason data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-job-queue-props-builder
  "The cfn-job-queue-props-builder function buildes out new instances of 
CfnJobQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentOrder` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-environment-order` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-arn` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnJobQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-order)]
      (. builder computeEnvironmentOrder data))
    (when-let [data (lookup-entry config id :job-queue-name)]
      (. builder jobQueueName data))
    (when-let [data (lookup-entry config id :job-state-time-limit-actions)]
      (. builder jobStateTimeLimitActions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :scheduling-policy-arn)]
      (. builder schedulingPolicyArn data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scheduling-policy-builder
  "The cfn-scheduling-policy-builder function buildes out new instances of 
CfnSchedulingPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fairsharePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fairshare-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchedulingPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :fairshare-policy)]
      (. builder fairsharePolicy data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scheduling-policy-fairshare-policy-property-builder
  "The cfn-scheduling-policy-fairshare-policy-property-builder function buildes out new instances of 
CfnSchedulingPolicy$FairsharePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `shareDecaySeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:share-decay-seconds` |
| `shareDistribution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:share-distribution` |"
  [stack id config]
  (let [builder (CfnSchedulingPolicy$FairsharePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-reservation)]
      (. builder computeReservation data))
    (when-let [data (lookup-entry config id :share-decay-seconds)]
      (. builder shareDecaySeconds data))
    (when-let [data (lookup-entry config id :share-distribution)]
      (. builder shareDistribution data))
    (.build builder)))


(defn cfn-scheduling-policy-props-builder
  "The cfn-scheduling-policy-props-builder function buildes out new instances of 
CfnSchedulingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fairsharePolicy` | software.amazon.awscdk.services.batch.CfnSchedulingPolicy$FairsharePolicyProperty | [[cdk.support/lookup-entry]] | `:fairshare-policy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchedulingPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :fairshare-policy)]
      (. builder fairsharePolicy data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scheduling-policy-share-attributes-property-builder
  "The cfn-scheduling-policy-share-attributes-property-builder function buildes out new instances of 
CfnSchedulingPolicy$ShareAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shareIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-identifier` |
| `weightFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight-factor` |"
  [stack id config]
  (let [builder (CfnSchedulingPolicy$ShareAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :share-identifier)]
      (. builder shareIdentifier data))
    (when-let [data (lookup-entry config id :weight-factor)]
      (. builder weightFactor data))
    (.build builder)))


(defn compute-environment-props-builder
  "The compute-environment-props-builder function buildes out new instances of 
ComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (ComputeEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn custom-reason-builder
  "The custom-reason-builder function buildes out new instances of 
CustomReason$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onExitCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-exit-code` |
| `onReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-reason` |
| `onStatusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-status-reason` |"
  [stack id config]
  (let [builder (CustomReason$Builder.)]
    (when-let [data (lookup-entry config id :on-exit-code)]
      (. builder onExitCode data))
    (when-let [data (lookup-entry config id :on-reason)]
      (. builder onReason data))
    (when-let [data (lookup-entry config id :on-status-reason)]
      (. builder onStatusReason data))
    (.build builder)))


(defn device-builder
  "The device-builder function buildes out new instances of 
Device$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |"
  [stack id config]
  (let [builder (Device$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (.build builder)))


(defn ecs-container-definition-props-builder
  "The ecs-container-definition-props-builder function buildes out new instances of 
EcsContainerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EcsContainerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :job-role)]
      (. builder jobRole data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-ec2-container-definition-builder
  "The ecs-ec2-container-definition-builder function buildes out new instances of 
EcsEc2ContainerDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EcsEc2ContainerDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :gpu)]
      (. builder gpu data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :job-role)]
      (. builder jobRole data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-ec2-container-definition-props-builder
  "The ecs-ec2-container-definition-props-builder function buildes out new instances of 
EcsEc2ContainerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EcsEc2ContainerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :gpu)]
      (. builder gpu data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :job-role)]
      (. builder jobRole data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-fargate-container-definition-builder
  "The ecs-fargate-container-definition-builder function buildes out new instances of 
EcsFargateContainerDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EcsFargateContainerDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage-size)]
      (. builder ephemeralStorageSize data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :fargate-cpu-architecture)]
      (. builder fargateCpuArchitecture data))
    (when-let [data (lookup-entry config id :fargate-operating-system-family)]
      (. builder fargateOperatingSystemFamily data))
    (when-let [data (fargate-platform-version config id :fargate-platform-version)]
      (. builder fargatePlatformVersion data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :job-role)]
      (. builder jobRole data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-fargate-container-definition-props-builder
  "The ecs-fargate-container-definition-props-builder function buildes out new instances of 
EcsFargateContainerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EcsFargateContainerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage-size)]
      (. builder ephemeralStorageSize data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :fargate-cpu-architecture)]
      (. builder fargateCpuArchitecture data))
    (when-let [data (lookup-entry config id :fargate-operating-system-family)]
      (. builder fargateOperatingSystemFamily data))
    (when-let [data (fargate-platform-version config id :fargate-platform-version)]
      (. builder fargatePlatformVersion data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :job-role)]
      (. builder jobRole data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-job-definition-builder
  "The ecs-job-definition-builder function buildes out new instances of 
EcsJobDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EcsJobDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn ecs-job-definition-props-builder
  "The ecs-job-definition-props-builder function buildes out new instances of 
EcsJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `propagateTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EcsJobDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn ecs-machine-image-builder
  "The ecs-machine-image-builder function buildes out new instances of 
EcsMachineImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:image` |
| `imageType` | software.amazon.awscdk.services.batch.EcsMachineImageType | [[cdk.api.services.batch/ecs-machine-image-type]] | `:image-type` |"
  [stack id config]
  (let [builder (EcsMachineImage$Builder.)]
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (ecs-machine-image-type config id :image-type)]
      (. builder imageType data))
    (.build builder)))


(defn ecs-volume-options-builder
  "The ecs-volume-options-builder function buildes out new instances of 
EcsVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (EcsVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn efs-volume-builder
  "The efs-volume-builder function buildes out new instances of 
EfsVolume$Builder using the provided configuration.  Each field is set as follows:

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
| `useJobRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-job-role` |"
  [stack id config]
  (let [builder (EfsVolume$Builder/create)]
    (when-let [data (lookup-entry config id :access-point-id)]
      (. builder accessPointId data))
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :enable-transit-encryption)]
      (. builder enableTransitEncryption data))
    (when-let [data (lookup-entry config id :file-system)]
      (. builder fileSystem data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :root-directory)]
      (. builder rootDirectory data))
    (when-let [data (lookup-entry config id :transit-encryption-port)]
      (. builder transitEncryptionPort data))
    (when-let [data (lookup-entry config id :use-job-role)]
      (. builder useJobRole data))
    (.build builder)))


(defn efs-volume-options-builder
  "The efs-volume-options-builder function buildes out new instances of 
EfsVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `useJobRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-job-role` |"
  [stack id config]
  (let [builder (EfsVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :access-point-id)]
      (. builder accessPointId data))
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :enable-transit-encryption)]
      (. builder enableTransitEncryption data))
    (when-let [data (lookup-entry config id :file-system)]
      (. builder fileSystem data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :root-directory)]
      (. builder rootDirectory data))
    (when-let [data (lookup-entry config id :transit-encryption-port)]
      (. builder transitEncryptionPort data))
    (when-let [data (lookup-entry config id :use-job-role)]
      (. builder useJobRole data))
    (.build builder)))


(defn eks-container-definition-builder
  "The eks-container-definition-builder function buildes out new instances of 
EksContainerDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EksContainerDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu-limit)]
      (. builder cpuLimit data))
    (when-let [data (lookup-entry config id :cpu-reservation)]
      (. builder cpuReservation data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :gpu-limit)]
      (. builder gpuLimit data))
    (when-let [data (lookup-entry config id :gpu-reservation)]
      (. builder gpuReservation data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (image-pull-policy config id :image-pull-policy)]
      (. builder imagePullPolicy data))
    (when-let [data (lookup-entry config id :memory-limit)]
      (. builder memoryLimit data))
    (when-let [data (lookup-entry config id :memory-reservation)]
      (. builder memoryReservation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :run-as-group)]
      (. builder runAsGroup data))
    (when-let [data (lookup-entry config id :run-as-root)]
      (. builder runAsRoot data))
    (when-let [data (lookup-entry config id :run-as-user)]
      (. builder runAsUser data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn eks-container-definition-props-builder
  "The eks-container-definition-props-builder function buildes out new instances of 
EksContainerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (EksContainerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu-limit)]
      (. builder cpuLimit data))
    (when-let [data (lookup-entry config id :cpu-reservation)]
      (. builder cpuReservation data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :gpu-limit)]
      (. builder gpuLimit data))
    (when-let [data (lookup-entry config id :gpu-reservation)]
      (. builder gpuReservation data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (image-pull-policy config id :image-pull-policy)]
      (. builder imagePullPolicy data))
    (when-let [data (lookup-entry config id :memory-limit)]
      (. builder memoryLimit data))
    (when-let [data (lookup-entry config id :memory-reservation)]
      (. builder memoryReservation data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :run-as-group)]
      (. builder runAsGroup data))
    (when-let [data (lookup-entry config id :run-as-root)]
      (. builder runAsRoot data))
    (when-let [data (lookup-entry config id :run-as-user)]
      (. builder runAsUser data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn eks-job-definition-builder
  "The eks-job-definition-builder function buildes out new instances of 
EksJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `useHostNetwork` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-host-network` |"
  [stack id config]
  (let [builder (EksJobDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (dns-policy config id :dns-policy)]
      (. builder dnsPolicy data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :service-account)]
      (. builder serviceAccount data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-host-network)]
      (. builder useHostNetwork data))
    (.build builder)))


(defn eks-job-definition-props-builder
  "The eks-job-definition-props-builder function buildes out new instances of 
EksJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `useHostNetwork` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-host-network` |"
  [stack id config]
  (let [builder (EksJobDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (dns-policy config id :dns-policy)]
      (. builder dnsPolicy data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :service-account)]
      (. builder serviceAccount data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :use-host-network)]
      (. builder useHostNetwork data))
    (.build builder)))


(defn eks-machine-image-builder
  "The eks-machine-image-builder function buildes out new instances of 
EksMachineImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:image` |
| `imageType` | software.amazon.awscdk.services.batch.EksMachineImageType | [[cdk.api.services.batch/eks-machine-image-type]] | `:image-type` |"
  [stack id config]
  (let [builder (EksMachineImage$Builder.)]
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (eks-machine-image-type config id :image-type)]
      (. builder imageType data))
    (.build builder)))


(defn eks-volume-options-builder
  "The eks-volume-options-builder function buildes out new instances of 
EksVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (EksVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn empty-dir-volume-builder
  "The empty-dir-volume-builder function buildes out new instances of 
EmptyDirVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | software.amazon.awscdk.services.batch.EmptyDirMediumType | [[cdk.api.services.batch/empty-dir-medium-type]] | `:medium` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `sizeLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size-limit` |"
  [stack id config]
  (let [builder (EmptyDirVolume$Builder/create)]
    (when-let [data (empty-dir-medium-type config id :medium)]
      (. builder medium data))
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :size-limit)]
      (. builder sizeLimit data))
    (.build builder)))


(defn empty-dir-volume-options-builder
  "The empty-dir-volume-options-builder function buildes out new instances of 
EmptyDirVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `medium` | software.amazon.awscdk.services.batch.EmptyDirMediumType | [[cdk.api.services.batch/empty-dir-medium-type]] | `:medium` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `sizeLimit` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size-limit` |"
  [stack id config]
  (let [builder (EmptyDirVolumeOptions$Builder.)]
    (when-let [data (empty-dir-medium-type config id :medium)]
      (. builder medium data))
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :size-limit)]
      (. builder sizeLimit data))
    (.build builder)))


(defn fairshare-scheduling-policy-builder
  "The fairshare-scheduling-policy-builder function buildes out new instances of 
FairshareSchedulingPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `schedulingPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-name` |
| `shareDecay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:share-decay` |
| `shares` | java.util.List | [[cdk.support/lookup-entry]] | `:shares` |"
  [stack id config]
  (let [builder (FairshareSchedulingPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-reservation)]
      (. builder computeReservation data))
    (when-let [data (lookup-entry config id :scheduling-policy-name)]
      (. builder schedulingPolicyName data))
    (when-let [data (lookup-entry config id :share-decay)]
      (. builder shareDecay data))
    (when-let [data (lookup-entry config id :shares)]
      (. builder shares data))
    (.build builder)))


(defn fairshare-scheduling-policy-props-builder
  "The fairshare-scheduling-policy-props-builder function buildes out new instances of 
FairshareSchedulingPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compute-reservation` |
| `schedulingPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-policy-name` |
| `shareDecay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:share-decay` |
| `shares` | java.util.List | [[cdk.support/lookup-entry]] | `:shares` |"
  [stack id config]
  (let [builder (FairshareSchedulingPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-reservation)]
      (. builder computeReservation data))
    (when-let [data (lookup-entry config id :scheduling-policy-name)]
      (. builder schedulingPolicyName data))
    (when-let [data (lookup-entry config id :share-decay)]
      (. builder shareDecay data))
    (when-let [data (lookup-entry config id :shares)]
      (. builder shares data))
    (.build builder)))


(defn fargate-compute-environment-builder
  "The fargate-compute-environment-builder function buildes out new instances of 
FargateComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateComputeEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn fargate-compute-environment-props-builder
  "The fargate-compute-environment-props-builder function buildes out new instances of 
FargateComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateComputeEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn host-path-volume-builder
  "The host-path-volume-builder function buildes out new instances of 
HostPathVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (HostPathVolume$Builder/create)]
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn host-path-volume-options-builder
  "The host-path-volume-options-builder function buildes out new instances of 
HostPathVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (HostPathVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn host-volume-builder
  "The host-volume-builder function buildes out new instances of 
HostVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (HostVolume$Builder/create)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn host-volume-options-builder
  "The host-volume-options-builder function buildes out new instances of 
HostVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |"
  [stack id config]
  (let [builder (HostVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (.build builder)))


(defn job-definition-props-builder
  "The job-definition-props-builder function buildes out new instances of 
JobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `retryStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:retry-strategies` |
| `schedulingPriority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scheduling-priority` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (JobDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn job-queue-builder
  "The job-queue-builder function buildes out new instances of 
JobQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironments` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environments` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicy` | software.amazon.awscdk.services.batch.ISchedulingPolicy | [[cdk.support/lookup-entry]] | `:scheduling-policy` |"
  [stack id config]
  (let [builder (JobQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-environments)]
      (. builder computeEnvironments data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :job-queue-name)]
      (. builder jobQueueName data))
    (when-let [data (lookup-entry config id :job-state-time-limit-actions)]
      (. builder jobStateTimeLimitActions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :scheduling-policy)]
      (. builder schedulingPolicy data))
    (.build builder)))


(defn job-queue-props-builder
  "The job-queue-props-builder function buildes out new instances of 
JobQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironments` | java.util.List | [[cdk.support/lookup-entry]] | `:compute-environments` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `jobQueueName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-name` |
| `jobStateTimeLimitActions` | java.util.List | [[cdk.support/lookup-entry]] | `:job-state-time-limit-actions` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedulingPolicy` | software.amazon.awscdk.services.batch.ISchedulingPolicy | [[cdk.support/lookup-entry]] | `:scheduling-policy` |"
  [stack id config]
  (let [builder (JobQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environments)]
      (. builder computeEnvironments data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :job-queue-name)]
      (. builder jobQueueName data))
    (when-let [data (lookup-entry config id :job-state-time-limit-actions)]
      (. builder jobStateTimeLimitActions data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :scheduling-policy)]
      (. builder schedulingPolicy data))
    (.build builder)))


(defn job-state-time-limit-action-builder
  "The job-state-time-limit-action-builder function buildes out new instances of 
JobStateTimeLimitAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction | [[cdk.api.services.batch/job-state-time-limit-actions-action]] | `:action` |
| `maxTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-time` |
| `reason` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason | [[cdk.api.services.batch/job-state-time-limit-actions-reason]] | `:reason` |
| `state` | software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState | [[cdk.api.services.batch/job-state-time-limit-actions-state]] | `:state` |"
  [stack id config]
  (let [builder (JobStateTimeLimitAction$Builder.)]
    (when-let [data (job-state-time-limit-actions-action config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :max-time)]
      (. builder maxTime data))
    (when-let [data (job-state-time-limit-actions-reason config id :reason)]
      (. builder reason data))
    (when-let [data (job-state-time-limit-actions-state config id :state)]
      (. builder state data))
    (.build builder)))


(defn linux-parameters-builder
  "The linux-parameters-builder function buildes out new instances of 
LinuxParameters$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |"
  [stack id config]
  (let [builder (LinuxParameters$Builder/create stack id)]
    (when-let [data (lookup-entry config id :init-process-enabled)]
      (. builder initProcessEnabled data))
    (when-let [data (lookup-entry config id :max-swap)]
      (. builder maxSwap data))
    (when-let [data (lookup-entry config id :shared-memory-size)]
      (. builder sharedMemorySize data))
    (when-let [data (lookup-entry config id :swappiness)]
      (. builder swappiness data))
    (.build builder)))


(defn linux-parameters-props-builder
  "The linux-parameters-props-builder function buildes out new instances of 
LinuxParametersProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |"
  [stack id config]
  (let [builder (LinuxParametersProps$Builder.)]
    (when-let [data (lookup-entry config id :init-process-enabled)]
      (. builder initProcessEnabled data))
    (when-let [data (lookup-entry config id :max-swap)]
      (. builder maxSwap data))
    (when-let [data (lookup-entry config id :shared-memory-size)]
      (. builder sharedMemorySize data))
    (when-let [data (lookup-entry config id :swappiness)]
      (. builder swappiness data))
    (.build builder)))


(defn managed-compute-environment-props-builder
  "The managed-compute-environment-props-builder function buildes out new instances of 
ManagedComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ManagedComputeEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn managed-ec2-ecs-compute-environment-builder
  "The managed-ec2-ecs-compute-environment-builder function buildes out new instances of 
ManagedEc2EcsComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ManagedEc2EcsComputeEnvironment$Builder/create stack id)]
    (when-let [data (allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :images)]
      (. builder images data))
    (when-let [data (lookup-entry config id :instance-classes)]
      (. builder instanceClasses data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :minv-cpus)]
      (. builder minvCpus data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :spot-bid-percentage)]
      (. builder spotBidPercentage data))
    (when-let [data (lookup-entry config id :spot-fleet-role)]
      (. builder spotFleetRole data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :use-optimal-instance-classes)]
      (. builder useOptimalInstanceClasses data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn managed-ec2-ecs-compute-environment-props-builder
  "The managed-ec2-ecs-compute-environment-props-builder function buildes out new instances of 
ManagedEc2EcsComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ManagedEc2EcsComputeEnvironmentProps$Builder.)]
    (when-let [data (allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :images)]
      (. builder images data))
    (when-let [data (lookup-entry config id :instance-classes)]
      (. builder instanceClasses data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :minv-cpus)]
      (. builder minvCpus data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :spot-bid-percentage)]
      (. builder spotBidPercentage data))
    (when-let [data (lookup-entry config id :spot-fleet-role)]
      (. builder spotFleetRole data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :use-optimal-instance-classes)]
      (. builder useOptimalInstanceClasses data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn managed-ec2-eks-compute-environment-builder
  "The managed-ec2-eks-compute-environment-builder function buildes out new instances of 
ManagedEc2EksComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ManagedEc2EksComputeEnvironment$Builder/create stack id)]
    (when-let [data (allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :eks-cluster)]
      (. builder eksCluster data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :images)]
      (. builder images data))
    (when-let [data (lookup-entry config id :instance-classes)]
      (. builder instanceClasses data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :kubernetes-namespace)]
      (. builder kubernetesNamespace data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :minv-cpus)]
      (. builder minvCpus data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :spot-bid-percentage)]
      (. builder spotBidPercentage data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :use-optimal-instance-classes)]
      (. builder useOptimalInstanceClasses data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn managed-ec2-eks-compute-environment-props-builder
  "The managed-ec2-eks-compute-environment-props-builder function buildes out new instances of 
ManagedEc2EksComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ManagedEc2EksComputeEnvironmentProps$Builder.)]
    (when-let [data (allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :eks-cluster)]
      (. builder eksCluster data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :images)]
      (. builder images data))
    (when-let [data (lookup-entry config id :instance-classes)]
      (. builder instanceClasses data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :kubernetes-namespace)]
      (. builder kubernetesNamespace data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :maxv-cpus)]
      (. builder maxvCpus data))
    (when-let [data (lookup-entry config id :minv-cpus)]
      (. builder minvCpus data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :replace-compute-environment)]
      (. builder replaceComputeEnvironment data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :spot)]
      (. builder spot data))
    (when-let [data (lookup-entry config id :spot-bid-percentage)]
      (. builder spotBidPercentage data))
    (when-let [data (lookup-entry config id :terminate-on-update)]
      (. builder terminateOnUpdate data))
    (when-let [data (lookup-entry config id :update-timeout)]
      (. builder updateTimeout data))
    (when-let [data (lookup-entry config id :update-to-latest-image-version)]
      (. builder updateToLatestImageVersion data))
    (when-let [data (lookup-entry config id :use-optimal-instance-classes)]
      (. builder useOptimalInstanceClasses data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn multi-node-container-builder
  "The multi-node-container-builder function buildes out new instances of 
MultiNodeContainer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.batch.IEcsContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `endNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-node` |
| `startNode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-node` |"
  [stack id config]
  (let [builder (MultiNodeContainer$Builder.)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :end-node)]
      (. builder endNode data))
    (when-let [data (lookup-entry config id :start-node)]
      (. builder startNode data))
    (.build builder)))


(defn multi-node-job-definition-builder
  "The multi-node-job-definition-builder function buildes out new instances of 
MultiNodeJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (MultiNodeJobDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :main-node)]
      (. builder mainNode data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn multi-node-job-definition-props-builder
  "The multi-node-job-definition-props-builder function buildes out new instances of 
MultiNodeJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (MultiNodeJobDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :job-definition-name)]
      (. builder jobDefinitionName data))
    (when-let [data (lookup-entry config id :main-node)]
      (. builder mainNode data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :retry-strategies)]
      (. builder retryStrategies data))
    (when-let [data (lookup-entry config id :scheduling-priority)]
      (. builder schedulingPriority data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn ordered-compute-environment-builder
  "The ordered-compute-environment-builder function buildes out new instances of 
OrderedComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironment` | software.amazon.awscdk.services.batch.IComputeEnvironment | [[cdk.support/lookup-entry]] | `:compute-environment` |
| `order` | java.lang.Number | [[cdk.support/lookup-entry]] | `:order` |"
  [stack id config]
  (let [builder (OrderedComputeEnvironment$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment)]
      (. builder computeEnvironment data))
    (when-let [data (lookup-entry config id :order)]
      (. builder order data))
    (.build builder)))


(defn secret-path-volume-builder
  "The secret-path-volume-builder function buildes out new instances of 
SecretPathVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (SecretPathVolume$Builder/create)]
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :optional)]
      (. builder optional data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn secret-path-volume-options-builder
  "The secret-path-volume-options-builder function buildes out new instances of 
SecretPathVolumeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `optional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional` |
| `readonly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (SecretPathVolumeOptions$Builder.)]
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :optional)]
      (. builder optional data))
    (when-let [data (lookup-entry config id :readonly)]
      (. builder readonly data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn secret-version-info-builder
  "The secret-version-info-builder function buildes out new instances of 
SecretVersionInfo$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
| `versionStage` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-stage` |"
  [stack id config]
  (let [builder (SecretVersionInfo$Builder.)]
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (when-let [data (lookup-entry config id :version-stage)]
      (. builder versionStage data))
    (.build builder)))


(defn share-builder
  "The share-builder function buildes out new instances of 
Share$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shareIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-identifier` |
| `weightFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight-factor` |"
  [stack id config]
  (let [builder (Share$Builder.)]
    (when-let [data (lookup-entry config id :share-identifier)]
      (. builder shareIdentifier data))
    (when-let [data (lookup-entry config id :weight-factor)]
      (. builder weightFactor data))
    (.build builder)))


(defn tmpfs-builder
  "The tmpfs-builder function buildes out new instances of 
Tmpfs$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (Tmpfs$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn ulimit-builder
  "The ulimit-builder function buildes out new instances of 
Ulimit$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | software.amazon.awscdk.services.batch.UlimitName | [[cdk.api.services.batch/ulimit-name]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |"
  [stack id config]
  (let [builder (Ulimit$Builder.)]
    (when-let [data (lookup-entry config id :hard-limit)]
      (. builder hardLimit data))
    (when-let [data (ulimit-name config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :soft-limit)]
      (. builder softLimit data))
    (.build builder)))


(defn unmanaged-compute-environment-builder
  "The unmanaged-compute-environment-builder function buildes out new instances of 
UnmanagedComputeEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |"
  [stack id config]
  (let [builder (UnmanagedComputeEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :unmanagedv-cpus)]
      (. builder unmanagedvCpus data))
    (.build builder)))


(defn unmanaged-compute-environment-props-builder
  "The unmanaged-compute-environment-props-builder function buildes out new instances of 
UnmanagedComputeEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-environment-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `unmanagedvCpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unmanagedv-cpus` |"
  [stack id config]
  (let [builder (UnmanagedComputeEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-environment-name)]
      (. builder computeEnvironmentName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :unmanagedv-cpus)]
      (. builder unmanagedvCpus data))
    (.build builder)))