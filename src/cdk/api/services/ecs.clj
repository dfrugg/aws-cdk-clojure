(ns cdk.api.services.ecs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.api.services.ec2 :refer [ebs-device-volume-type
                                          instance-architecture]]
            [cdk.api.services.servicediscovery :refer [dns-record-type
                                                       namespace-type]]
            [cdk.api.services.applicationautoscaling :refer [service-namespace]]
            [cdk.api.services.autoscaling :refer [monitoring]]
            [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]])
  (:import [software.amazon.awscdk.services.ecs AddAutoScalingGroupCapacityOptions$Builder
                                                AddCapacityOptions$Builder
                                                AlarmBehavior
                                                AmiHardwareType
                                                AppMeshProxyConfiguration$Builder
                                                AppMeshProxyConfigurationConfigProps$Builder
                                                AppMeshProxyConfigurationProps$Builder
                                                AsgCapacityProvider$Builder
                                                AsgCapacityProviderProps$Builder
                                                AssetEnvironmentFile$Builder
                                                AssetImage$Builder
                                                AssetImageProps$Builder
                                                AssociateCloudMapServiceOptions$Builder
                                                AuthorizationConfig$Builder
                                                AwsLogDriver$Builder
                                                AwsLogDriverMode
                                                AwsLogDriverProps$Builder
                                                BaseLogDriverProps$Builder
                                                BaseMountPoint$Builder
                                                BaseServiceOptions$Builder
                                                BaseServiceProps$Builder
                                                BinPackResource
                                                BottleRocketImage$Builder
                                                BottleRocketImageProps$Builder
                                                BottlerocketEcsVariant
                                                Capability
                                                CapacityProviderStrategy$Builder
                                                CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder
                                                CfnCapacityProvider$Builder
                                                CfnCapacityProvider$ManagedScalingProperty$Builder
                                                CfnCapacityProviderProps$Builder
                                                CfnCluster$Builder
                                                CfnCluster$CapacityProviderStrategyItemProperty$Builder
                                                CfnCluster$ClusterConfigurationProperty$Builder
                                                CfnCluster$ClusterSettingsProperty$Builder
                                                CfnCluster$ExecuteCommandConfigurationProperty$Builder
                                                CfnCluster$ExecuteCommandLogConfigurationProperty$Builder
                                                CfnCluster$ServiceConnectDefaultsProperty$Builder
                                                CfnClusterCapacityProviderAssociations$Builder
                                                CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder
                                                CfnClusterCapacityProviderAssociationsProps$Builder
                                                CfnClusterProps$Builder
                                                CfnPrimaryTaskSet$Builder
                                                CfnPrimaryTaskSetProps$Builder
                                                CfnService$AwsVpcConfigurationProperty$Builder
                                                CfnService$Builder
                                                CfnService$CapacityProviderStrategyItemProperty$Builder
                                                CfnService$DeploymentAlarmsProperty$Builder
                                                CfnService$DeploymentCircuitBreakerProperty$Builder
                                                CfnService$DeploymentConfigurationProperty$Builder
                                                CfnService$DeploymentControllerProperty$Builder
                                                CfnService$EBSTagSpecificationProperty$Builder
                                                CfnService$LoadBalancerProperty$Builder
                                                CfnService$LogConfigurationProperty$Builder
                                                CfnService$NetworkConfigurationProperty$Builder
                                                CfnService$PlacementConstraintProperty$Builder
                                                CfnService$PlacementStrategyProperty$Builder
                                                CfnService$SecretProperty$Builder
                                                CfnService$ServiceConnectClientAliasProperty$Builder
                                                CfnService$ServiceConnectConfigurationProperty$Builder
                                                CfnService$ServiceConnectServiceProperty$Builder
                                                CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder
                                                CfnService$ServiceConnectTlsConfigurationProperty$Builder
                                                CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder
                                                CfnService$ServiceRegistryProperty$Builder
                                                CfnService$ServiceVolumeConfigurationProperty$Builder
                                                CfnService$TimeoutConfigurationProperty$Builder
                                                CfnServiceProps$Builder
                                                CfnTaskDefinition$AuthorizationConfigProperty$Builder
                                                CfnTaskDefinition$Builder
                                                CfnTaskDefinition$ContainerDefinitionProperty$Builder
                                                CfnTaskDefinition$ContainerDependencyProperty$Builder
                                                CfnTaskDefinition$DeviceProperty$Builder
                                                CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder
                                                CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder
                                                CfnTaskDefinition$EnvironmentFileProperty$Builder
                                                CfnTaskDefinition$EphemeralStorageProperty$Builder
                                                CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder
                                                CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder
                                                CfnTaskDefinition$FirelensConfigurationProperty$Builder
                                                CfnTaskDefinition$HealthCheckProperty$Builder
                                                CfnTaskDefinition$HostEntryProperty$Builder
                                                CfnTaskDefinition$HostVolumePropertiesProperty$Builder
                                                CfnTaskDefinition$InferenceAcceleratorProperty$Builder
                                                CfnTaskDefinition$KernelCapabilitiesProperty$Builder
                                                CfnTaskDefinition$KeyValuePairProperty$Builder
                                                CfnTaskDefinition$LinuxParametersProperty$Builder
                                                CfnTaskDefinition$LogConfigurationProperty$Builder
                                                CfnTaskDefinition$MountPointProperty$Builder
                                                CfnTaskDefinition$PortMappingProperty$Builder
                                                CfnTaskDefinition$ProxyConfigurationProperty$Builder
                                                CfnTaskDefinition$RepositoryCredentialsProperty$Builder
                                                CfnTaskDefinition$ResourceRequirementProperty$Builder
                                                CfnTaskDefinition$RuntimePlatformProperty$Builder
                                                CfnTaskDefinition$SecretProperty$Builder
                                                CfnTaskDefinition$SystemControlProperty$Builder
                                                CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder
                                                CfnTaskDefinition$TmpfsProperty$Builder
                                                CfnTaskDefinition$UlimitProperty$Builder
                                                CfnTaskDefinition$VolumeFromProperty$Builder
                                                CfnTaskDefinition$VolumeProperty$Builder
                                                CfnTaskDefinitionProps$Builder
                                                CfnTaskSet$AwsVpcConfigurationProperty$Builder
                                                CfnTaskSet$Builder
                                                CfnTaskSet$LoadBalancerProperty$Builder
                                                CfnTaskSet$NetworkConfigurationProperty$Builder
                                                CfnTaskSet$ScaleProperty$Builder
                                                CfnTaskSet$ServiceRegistryProperty$Builder
                                                CfnTaskSetProps$Builder
                                                CloudMapNamespaceOptions$Builder
                                                CloudMapOptions$Builder
                                                Cluster$Builder
                                                ClusterAttributes$Builder
                                                ClusterProps$Builder
                                                CommonTaskDefinitionAttributes$Builder
                                                CommonTaskDefinitionProps$Builder
                                                Compatibility
                                                ContainerDefinition$Builder
                                                ContainerDefinitionOptions$Builder
                                                ContainerDefinitionProps$Builder
                                                ContainerDependency$Builder
                                                ContainerDependencyCondition
                                                ContainerImageConfig$Builder
                                                ContainerMountPoint$Builder
                                                CpuUtilizationScalingProps$Builder
                                                CredentialSpecConfig$Builder
                                                DeploymentAlarmConfig$Builder
                                                DeploymentAlarmOptions$Builder
                                                DeploymentCircuitBreaker$Builder
                                                DeploymentController$Builder
                                                DeploymentControllerType
                                                Device$Builder
                                                DevicePermission
                                                DockerVolumeConfiguration$Builder
                                                EBSTagSpecification$Builder
                                                EbsPropagatedTagSource
                                                Ec2Service$Builder
                                                Ec2ServiceAttributes$Builder
                                                Ec2ServiceProps$Builder
                                                Ec2TaskDefinition$Builder
                                                Ec2TaskDefinitionAttributes$Builder
                                                Ec2TaskDefinitionProps$Builder
                                                EcsOptimizedImageOptions$Builder
                                                EcsTarget$Builder
                                                EfsVolumeConfiguration$Builder
                                                EnvironmentFileConfig$Builder
                                                EnvironmentFileType
                                                ExecuteCommandConfiguration$Builder
                                                ExecuteCommandLogConfiguration$Builder
                                                ExecuteCommandLogging
                                                ExternalService$Builder
                                                ExternalServiceAttributes$Builder
                                                ExternalServiceProps$Builder
                                                ExternalTaskDefinition$Builder
                                                ExternalTaskDefinitionAttributes$Builder
                                                ExternalTaskDefinitionProps$Builder
                                                FargatePlatformVersion
                                                FargateService$Builder
                                                FargateServiceAttributes$Builder
                                                FargateServiceProps$Builder
                                                FargateTaskDefinition$Builder
                                                FargateTaskDefinitionAttributes$Builder
                                                FargateTaskDefinitionProps$Builder
                                                FileSystemType
                                                FireLensLogDriver$Builder
                                                FireLensLogDriverProps$Builder
                                                FirelensConfig$Builder
                                                FirelensConfigFileType
                                                FirelensLogRouter$Builder
                                                FirelensLogRouterDefinitionOptions$Builder
                                                FirelensLogRouterProps$Builder
                                                FirelensLogRouterType
                                                FirelensOptions$Builder
                                                FluentdLogDriver$Builder
                                                FluentdLogDriverProps$Builder
                                                GelfCompressionType
                                                GelfLogDriver$Builder
                                                GelfLogDriverProps$Builder
                                                GenericLogDriver$Builder
                                                GenericLogDriverProps$Builder
                                                HealthCheck$Builder
                                                Host$Builder
                                                InferenceAccelerator$Builder
                                                IpcMode
                                                JournaldLogDriver$Builder
                                                JournaldLogDriverProps$Builder
                                                JsonFileLogDriver$Builder
                                                JsonFileLogDriverProps$Builder
                                                LaunchType
                                                LinuxParameters$Builder
                                                LinuxParametersProps$Builder
                                                LoadBalancerTargetOptions$Builder
                                                LogDriverConfig$Builder
                                                MachineImageType
                                                MemoryUtilizationScalingProps$Builder
                                                MountPoint$Builder
                                                NetworkMode
                                                PidMode
                                                PortMap$Builder
                                                PortMapping$Builder
                                                PropagatedTagSource
                                                Protocol
                                                RepositoryImage$Builder
                                                RepositoryImageProps$Builder
                                                RequestCountScalingProps$Builder
                                                RuntimePlatform$Builder
                                                ScalableTaskCount$Builder
                                                ScalableTaskCountProps$Builder
                                                Scope
                                                ScratchSpace$Builder
                                                SecretVersionInfo$Builder
                                                ServiceConnect$Builder
                                                ServiceConnectProps$Builder
                                                ServiceConnectService$Builder
                                                ServiceManagedEBSVolumeConfiguration$Builder
                                                ServiceManagedVolume$Builder
                                                ServiceManagedVolumeProps$Builder
                                                SplunkLogDriver$Builder
                                                SplunkLogDriverProps$Builder
                                                SplunkLogFormat
                                                SyslogLogDriver$Builder
                                                SyslogLogDriverProps$Builder
                                                SystemControl$Builder
                                                TaskDefinition$Builder
                                                TaskDefinitionAttributes$Builder
                                                TaskDefinitionProps$Builder
                                                Tmpfs$Builder
                                                TmpfsMountOption
                                                TrackCustomMetricProps$Builder
                                                Ulimit$Builder
                                                UlimitName
                                                Volume$Builder
                                                VolumeFrom$Builder
                                                WindowsOptimizedVersion]))


(defn alarm-behavior
  "The `alarm-behavior` function data interprets values in the provided config data into a 
`AlarmBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AlarmBehavior` - the value is returned.
* is `:fail-on-alarm` - `AlarmBehavior/FAIL_ON_ALARM` is returned
* is `:rollback-on-alarm` - `AlarmBehavior/ROLLBACK_ON_ALARM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AlarmBehavior data) data
      (= :fail-on-alarm data) AlarmBehavior/FAIL_ON_ALARM
      (= :rollback-on-alarm data) AlarmBehavior/ROLLBACK_ON_ALARM)))


(defn ami-hardware-type
  "The `ami-hardware-type` function data interprets values in the provided config data into a 
`AmiHardwareType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmiHardwareType` - the value is returned.
* is `:gpu` - `AmiHardwareType/GPU` is returned
* is `:standard` - `AmiHardwareType/STANDARD` is returned
* is `:arm` - `AmiHardwareType/ARM` is returned
* is `:neuron` - `AmiHardwareType/NEURON` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmiHardwareType data) data
      (= :gpu data) AmiHardwareType/GPU
      (= :standard data) AmiHardwareType/STANDARD
      (= :arm data) AmiHardwareType/ARM
      (= :neuron data) AmiHardwareType/NEURON)))


(defn aws-log-driver-mode
  "The `aws-log-driver-mode` function data interprets values in the provided config data into a 
`AwsLogDriverMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AwsLogDriverMode` - the value is returned.
* is `:non-blocking` - `AwsLogDriverMode/NON_BLOCKING` is returned
* is `:blocking` - `AwsLogDriverMode/BLOCKING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AwsLogDriverMode data) data
      (= :non-blocking data) AwsLogDriverMode/NON_BLOCKING
      (= :blocking data) AwsLogDriverMode/BLOCKING)))


(defn bin-pack-resource
  "The `bin-pack-resource` function data interprets values in the provided config data into a 
`BinPackResource` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BinPackResource` - the value is returned.
* is `:memory` - `BinPackResource/MEMORY` is returned
* is `:cpu` - `BinPackResource/CPU` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BinPackResource data) data
      (= :memory data) BinPackResource/MEMORY
      (= :cpu data) BinPackResource/CPU)))


(defn bottlerocket-ecs-variant
  "The `bottlerocket-ecs-variant` function data interprets values in the provided config data into a 
`BottlerocketEcsVariant` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BottlerocketEcsVariant` - the value is returned.
* is `:aws-ecs-2-nvidia` - `BottlerocketEcsVariant/AWS_ECS_2_NVIDIA` is returned
* is `:aws-ecs-1` - `BottlerocketEcsVariant/AWS_ECS_1` is returned
* is `:aws-ecs-2` - `BottlerocketEcsVariant/AWS_ECS_2` is returned
* is `:aws-ecs-1-nvidia` - `BottlerocketEcsVariant/AWS_ECS_1_NVIDIA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BottlerocketEcsVariant data) data
      (= :aws-ecs-2-nvidia data) BottlerocketEcsVariant/AWS_ECS_2_NVIDIA
      (= :aws-ecs-1 data) BottlerocketEcsVariant/AWS_ECS_1
      (= :aws-ecs-2 data) BottlerocketEcsVariant/AWS_ECS_2
      (= :aws-ecs-1-nvidia data) BottlerocketEcsVariant/AWS_ECS_1_NVIDIA)))


(defn capability
  "The `capability` function data interprets values in the provided config data into a 
`Capability` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Capability` - the value is returned.
* is `:sys-pacct` - `Capability/SYS_PACCT` is returned
* is `:sys-ptrace` - `Capability/SYS_PTRACE` is returned
* is `:sys-tty-config` - `Capability/SYS_TTY_CONFIG` is returned
* is `:sys-admin` - `Capability/SYS_ADMIN` is returned
* is `:net-admin` - `Capability/NET_ADMIN` is returned
* is `:sys-boot` - `Capability/SYS_BOOT` is returned
* is `:dac-read-search` - `Capability/DAC_READ_SEARCH` is returned
* is `:syslog` - `Capability/SYSLOG` is returned
* is `:setfcap` - `Capability/SETFCAP` is returned
* is `:linux-immutable` - `Capability/LINUX_IMMUTABLE` is returned
* is `:wake-alarm` - `Capability/WAKE_ALARM` is returned
* is `:audit-write` - `Capability/AUDIT_WRITE` is returned
* is `:sys-module` - `Capability/SYS_MODULE` is returned
* is `:sys-nice` - `Capability/SYS_NICE` is returned
* is `:lease` - `Capability/LEASE` is returned
* is `:audit-control` - `Capability/AUDIT_CONTROL` is returned
* is `:ipc-lock` - `Capability/IPC_LOCK` is returned
* is `:mac-admin` - `Capability/MAC_ADMIN` is returned
* is `:block-suspend` - `Capability/BLOCK_SUSPEND` is returned
* is `:sys-chroot` - `Capability/SYS_CHROOT` is returned
* is `:sys-resource` - `Capability/SYS_RESOURCE` is returned
* is `:kill` - `Capability/KILL` is returned
* is `:chown` - `Capability/CHOWN` is returned
* is `:net-bind-service` - `Capability/NET_BIND_SERVICE` is returned
* is `:sys-rawio` - `Capability/SYS_RAWIO` is returned
* is `:fsetid` - `Capability/FSETID` is returned
* is `:setuid` - `Capability/SETUID` is returned
* is `:mac-override` - `Capability/MAC_OVERRIDE` is returned
* is `:net-broadcast` - `Capability/NET_BROADCAST` is returned
* is `:sys-time` - `Capability/SYS_TIME` is returned
* is `:setgid` - `Capability/SETGID` is returned
* is `:dac-override` - `Capability/DAC_OVERRIDE` is returned
* is `:fowner` - `Capability/FOWNER` is returned
* is `:net-raw` - `Capability/NET_RAW` is returned
* is `:ipc-owner` - `Capability/IPC_OWNER` is returned
* is `:mknod` - `Capability/MKNOD` is returned
* is `:setpcap` - `Capability/SETPCAP` is returned
* is `:all` - `Capability/ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Capability data) data
      (= :sys-pacct data) Capability/SYS_PACCT
      (= :sys-ptrace data) Capability/SYS_PTRACE
      (= :sys-tty-config data) Capability/SYS_TTY_CONFIG
      (= :sys-admin data) Capability/SYS_ADMIN
      (= :net-admin data) Capability/NET_ADMIN
      (= :sys-boot data) Capability/SYS_BOOT
      (= :dac-read-search data) Capability/DAC_READ_SEARCH
      (= :syslog data) Capability/SYSLOG
      (= :setfcap data) Capability/SETFCAP
      (= :linux-immutable data) Capability/LINUX_IMMUTABLE
      (= :wake-alarm data) Capability/WAKE_ALARM
      (= :audit-write data) Capability/AUDIT_WRITE
      (= :sys-module data) Capability/SYS_MODULE
      (= :sys-nice data) Capability/SYS_NICE
      (= :lease data) Capability/LEASE
      (= :audit-control data) Capability/AUDIT_CONTROL
      (= :ipc-lock data) Capability/IPC_LOCK
      (= :mac-admin data) Capability/MAC_ADMIN
      (= :block-suspend data) Capability/BLOCK_SUSPEND
      (= :sys-chroot data) Capability/SYS_CHROOT
      (= :sys-resource data) Capability/SYS_RESOURCE
      (= :kill data) Capability/KILL
      (= :chown data) Capability/CHOWN
      (= :net-bind-service data) Capability/NET_BIND_SERVICE
      (= :sys-rawio data) Capability/SYS_RAWIO
      (= :fsetid data) Capability/FSETID
      (= :setuid data) Capability/SETUID
      (= :mac-override data) Capability/MAC_OVERRIDE
      (= :net-broadcast data) Capability/NET_BROADCAST
      (= :sys-time data) Capability/SYS_TIME
      (= :setgid data) Capability/SETGID
      (= :dac-override data) Capability/DAC_OVERRIDE
      (= :fowner data) Capability/FOWNER
      (= :net-raw data) Capability/NET_RAW
      (= :ipc-owner data) Capability/IPC_OWNER
      (= :mknod data) Capability/MKNOD
      (= :setpcap data) Capability/SETPCAP
      (= :all data) Capability/ALL)))


(defn compatibility
  "The `compatibility` function data interprets values in the provided config data into a 
`Compatibility` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Compatibility` - the value is returned.
* is `:fargate` - `Compatibility/FARGATE` is returned
* is `:external` - `Compatibility/EXTERNAL` is returned
* is `:ec2` - `Compatibility/EC2` is returned
* is `:ec2-and-fargate` - `Compatibility/EC2_AND_FARGATE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Compatibility data) data
      (= :fargate data) Compatibility/FARGATE
      (= :external data) Compatibility/EXTERNAL
      (= :ec2 data) Compatibility/EC2
      (= :ec2-and-fargate data) Compatibility/EC2_AND_FARGATE)))


(defn container-dependency-condition
  "The `container-dependency-condition` function data interprets values in the provided config data into a 
`ContainerDependencyCondition` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ContainerDependencyCondition` - the value is returned.
* is `:complete` - `ContainerDependencyCondition/COMPLETE` is returned
* is `:start` - `ContainerDependencyCondition/START` is returned
* is `:healthy` - `ContainerDependencyCondition/HEALTHY` is returned
* is `:success` - `ContainerDependencyCondition/SUCCESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ContainerDependencyCondition data) data
      (= :complete data) ContainerDependencyCondition/COMPLETE
      (= :start data) ContainerDependencyCondition/START
      (= :healthy data) ContainerDependencyCondition/HEALTHY
      (= :success data) ContainerDependencyCondition/SUCCESS)))


(defn deployment-controller-type
  "The `deployment-controller-type` function data interprets values in the provided config data into a 
`DeploymentControllerType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DeploymentControllerType` - the value is returned.
* is `:ecs` - `DeploymentControllerType/ECS` is returned
* is `:external` - `DeploymentControllerType/EXTERNAL` is returned
* is `:code-deploy` - `DeploymentControllerType/CODE_DEPLOY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DeploymentControllerType data) data
      (= :ecs data) DeploymentControllerType/ECS
      (= :external data) DeploymentControllerType/EXTERNAL
      (= :code-deploy data) DeploymentControllerType/CODE_DEPLOY)))


(defn device-permission
  "The `device-permission` function data interprets values in the provided config data into a 
`DevicePermission` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DevicePermission` - the value is returned.
* is `:mknod` - `DevicePermission/MKNOD` is returned
* is `:read` - `DevicePermission/READ` is returned
* is `:write` - `DevicePermission/WRITE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DevicePermission data) data
      (= :mknod data) DevicePermission/MKNOD
      (= :read data) DevicePermission/READ
      (= :write data) DevicePermission/WRITE)))


(defn ebs-propagated-tag-source
  "The `ebs-propagated-tag-source` function data interprets values in the provided config data into a 
`EbsPropagatedTagSource` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EbsPropagatedTagSource` - the value is returned.
* is `:task-definition` - `EbsPropagatedTagSource/TASK_DEFINITION` is returned
* is `:service` - `EbsPropagatedTagSource/SERVICE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EbsPropagatedTagSource data) data
      (= :task-definition data) EbsPropagatedTagSource/TASK_DEFINITION
      (= :service data) EbsPropagatedTagSource/SERVICE)))


(defn environment-file-type
  "The `environment-file-type` function data interprets values in the provided config data into a 
`EnvironmentFileType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EnvironmentFileType` - the value is returned.
* is `:s3` - `EnvironmentFileType/S3` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EnvironmentFileType data) data
      (= :s3 data) EnvironmentFileType/S3)))


(defn execute-command-logging
  "The `execute-command-logging` function data interprets values in the provided config data into a 
`ExecuteCommandLogging` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ExecuteCommandLogging` - the value is returned.
* is `:default` - `ExecuteCommandLogging/DEFAULT` is returned
* is `:override` - `ExecuteCommandLogging/OVERRIDE` is returned
* is `:none` - `ExecuteCommandLogging/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ExecuteCommandLogging data) data
      (= :default data) ExecuteCommandLogging/DEFAULT
      (= :override data) ExecuteCommandLogging/OVERRIDE
      (= :none data) ExecuteCommandLogging/NONE)))


(defn fargate-platform-version
  "The `fargate-platform-version` function data interprets values in the provided config data into a 
`FargatePlatformVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FargatePlatformVersion` - the value is returned.
* is `:version1-1` - `FargatePlatformVersion/VERSION1_1` is returned
* is `:version1-2` - `FargatePlatformVersion/VERSION1_2` is returned
* is `:version1-3` - `FargatePlatformVersion/VERSION1_3` is returned
* is `:version1-4` - `FargatePlatformVersion/VERSION1_4` is returned
* is `:version1-0` - `FargatePlatformVersion/VERSION1_0` is returned
* is `:latest` - `FargatePlatformVersion/LATEST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FargatePlatformVersion data) data
      (= :version1-1 data) FargatePlatformVersion/VERSION1_1
      (= :version1-2 data) FargatePlatformVersion/VERSION1_2
      (= :version1-3 data) FargatePlatformVersion/VERSION1_3
      (= :version1-4 data) FargatePlatformVersion/VERSION1_4
      (= :version1-0 data) FargatePlatformVersion/VERSION1_0
      (= :latest data) FargatePlatformVersion/LATEST)))


(defn file-system-type
  "The `file-system-type` function data interprets values in the provided config data into a 
`FileSystemType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FileSystemType` - the value is returned.
* is `:xfs` - `FileSystemType/XFS` is returned
* is `:ext3` - `FileSystemType/EXT3` is returned
* is `:ext4` - `FileSystemType/EXT4` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FileSystemType data) data
      (= :xfs data) FileSystemType/XFS
      (= :ext3 data) FileSystemType/EXT3
      (= :ext4 data) FileSystemType/EXT4)))


(defn firelens-config-file-type
  "The `firelens-config-file-type` function data interprets values in the provided config data into a 
`FirelensConfigFileType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FirelensConfigFileType` - the value is returned.
* is `:s3` - `FirelensConfigFileType/S3` is returned
* is `:file` - `FirelensConfigFileType/FILE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FirelensConfigFileType data) data
      (= :s3 data) FirelensConfigFileType/S3
      (= :file data) FirelensConfigFileType/FILE)))


(defn firelens-log-router-type
  "The `firelens-log-router-type` function data interprets values in the provided config data into a 
`FirelensLogRouterType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FirelensLogRouterType` - the value is returned.
* is `:fluentd` - `FirelensLogRouterType/FLUENTD` is returned
* is `:fluentbit` - `FirelensLogRouterType/FLUENTBIT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FirelensLogRouterType data) data
      (= :fluentd data) FirelensLogRouterType/FLUENTD
      (= :fluentbit data) FirelensLogRouterType/FLUENTBIT)))


(defn gelf-compression-type
  "The `gelf-compression-type` function data interprets values in the provided config data into a 
`GelfCompressionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GelfCompressionType` - the value is returned.
* is `:none` - `GelfCompressionType/NONE` is returned
* is `:gzip` - `GelfCompressionType/GZIP` is returned
* is `:zlib` - `GelfCompressionType/ZLIB` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GelfCompressionType data) data
      (= :none data) GelfCompressionType/NONE
      (= :gzip data) GelfCompressionType/GZIP
      (= :zlib data) GelfCompressionType/ZLIB)))


(defn ipc-mode
  "The `ipc-mode` function data interprets values in the provided config data into a 
`IpcMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpcMode` - the value is returned.
* is `:task` - `IpcMode/TASK` is returned
* is `:host` - `IpcMode/HOST` is returned
* is `:none` - `IpcMode/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpcMode data) data
      (= :task data) IpcMode/TASK
      (= :host data) IpcMode/HOST
      (= :none data) IpcMode/NONE)))


(defn launch-type
  "The `launch-type` function data interprets values in the provided config data into a 
`LaunchType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LaunchType` - the value is returned.
* is `:fargate` - `LaunchType/FARGATE` is returned
* is `:ec2` - `LaunchType/EC2` is returned
* is `:external` - `LaunchType/EXTERNAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LaunchType data) data
      (= :fargate data) LaunchType/FARGATE
      (= :ec2 data) LaunchType/EC2
      (= :external data) LaunchType/EXTERNAL)))


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


(defn network-mode
  "The `network-mode` function data interprets values in the provided config data into a 
`NetworkMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NetworkMode` - the value is returned.
* is `:nat` - `NetworkMode/NAT` is returned
* is `:none` - `NetworkMode/NONE` is returned
* is `:bridge` - `NetworkMode/BRIDGE` is returned
* is `:host` - `NetworkMode/HOST` is returned
* is `:aws-vpc` - `NetworkMode/AWS_VPC` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NetworkMode data) data
      (= :nat data) NetworkMode/NAT
      (= :none data) NetworkMode/NONE
      (= :bridge data) NetworkMode/BRIDGE
      (= :host data) NetworkMode/HOST
      (= :aws-vpc data) NetworkMode/AWS_VPC)))


(defn pid-mode
  "The `pid-mode` function data interprets values in the provided config data into a 
`PidMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PidMode` - the value is returned.
* is `:host` - `PidMode/HOST` is returned
* is `:task` - `PidMode/TASK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PidMode data) data
      (= :host data) PidMode/HOST
      (= :task data) PidMode/TASK)))


(defn propagated-tag-source
  "The `propagated-tag-source` function data interprets values in the provided config data into a 
`PropagatedTagSource` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PropagatedTagSource` - the value is returned.
* is `:none` - `PropagatedTagSource/NONE` is returned
* is `:task-definition` - `PropagatedTagSource/TASK_DEFINITION` is returned
* is `:service` - `PropagatedTagSource/SERVICE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PropagatedTagSource data) data
      (= :none data) PropagatedTagSource/NONE
      (= :task-definition data) PropagatedTagSource/TASK_DEFINITION
      (= :service data) PropagatedTagSource/SERVICE)))


(defn protocol
  "The `protocol` function data interprets values in the provided config data into a 
`Protocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Protocol` - the value is returned.
* is `:udp` - `Protocol/UDP` is returned
* is `:tcp` - `Protocol/TCP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Protocol data) data
      (= :udp data) Protocol/UDP
      (= :tcp data) Protocol/TCP)))


(defn scope
  "The `scope` function data interprets values in the provided config data into a 
`Scope` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Scope` - the value is returned.
* is `:task` - `Scope/TASK` is returned
* is `:shared` - `Scope/SHARED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Scope data) data
      (= :task data) Scope/TASK
      (= :shared data) Scope/SHARED)))


(defn splunk-log-format
  "The `splunk-log-format` function data interprets values in the provided config data into a 
`SplunkLogFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SplunkLogFormat` - the value is returned.
* is `:inline` - `SplunkLogFormat/INLINE` is returned
* is `:json` - `SplunkLogFormat/JSON` is returned
* is `:raw` - `SplunkLogFormat/RAW` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SplunkLogFormat data) data
      (= :inline data) SplunkLogFormat/INLINE
      (= :json data) SplunkLogFormat/JSON
      (= :raw data) SplunkLogFormat/RAW)))


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


(defn windows-optimized-version
  "The `windows-optimized-version` function data interprets values in the provided config data into a 
`WindowsOptimizedVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WindowsOptimizedVersion` - the value is returned.
* is `:server-2022` - `WindowsOptimizedVersion/SERVER_2022` is returned
* is `:server-2019` - `WindowsOptimizedVersion/SERVER_2019` is returned
* is `:server-2016` - `WindowsOptimizedVersion/SERVER_2016` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WindowsOptimizedVersion data) data
      (= :server-2022 data) WindowsOptimizedVersion/SERVER_2022
      (= :server-2019 data) WindowsOptimizedVersion/SERVER_2019
      (= :server-2016 data) WindowsOptimizedVersion/SERVER_2016)))


(defn add-auto-scaling-group-capacity-options-builder
  "The add-auto-scaling-group-capacity-options-builder function buildes out new instances of 
AddAutoScalingGroupCapacityOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canContainersAccessInstanceRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:can-containers-access-instance-role` |
| `machineImageType` | software.amazon.awscdk.services.ecs.MachineImageType | [[cdk.api.services.ecs/machine-image-type]] | `:machine-image-type` |
| `spotInstanceDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-instance-draining` |
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |"
  [stack id config]
  (let [builder (AddAutoScalingGroupCapacityOptions$Builder.)]
    (when-let [data (lookup-entry config id :can-containers-access-instance-role)]
      (. builder canContainersAccessInstanceRole data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
    (when-let [data (lookup-entry config id :spot-instance-draining)]
      (. builder spotInstanceDraining data))
    (when-let [data (lookup-entry config id :topic-encryption-key)]
      (. builder topicEncryptionKey data))
    (.build builder)))


(defn add-capacity-options-builder
  "The add-capacity-options-builder function buildes out new instances of 
AddCapacityOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `autoScalingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-name` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `canContainersAccessInstanceRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:can-containers-access-instance-role` |
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
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `machineImageType` | software.amazon.awscdk.services.ecs.MachineImageType | [[cdk.api.services.ecs/machine-image-type]] | `:machine-image-type` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `maxInstanceLifetime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-instance-lifetime` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `newInstancesProtectedFromScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:new-instances-protected-from-scale-in` |
| `notifications` | java.util.List | [[cdk.support/lookup-entry]] | `:notifications` |
| `signals` | software.amazon.awscdk.services.autoscaling.Signals | [[cdk.support/lookup-entry]] | `:signals` |
| `spotInstanceDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-instance-draining` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `terminationPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:termination-policies` |
| `terminationPolicyCustomLambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:termination-policy-custom-lambda-function-arn` |
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |
| `updatePolicy` | software.amazon.awscdk.services.autoscaling.UpdatePolicy | [[cdk.support/lookup-entry]] | `:update-policy` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (AddCapacityOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :auto-scaling-group-name)]
      (. builder autoScalingGroupName data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :can-containers-access-instance-role)]
      (. builder canContainersAccessInstanceRole data))
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
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
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
    (when-let [data (lookup-entry config id :spot-instance-draining)]
      (. builder spotInstanceDraining data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :termination-policies)]
      (. builder terminationPolicies data))
    (when-let [data (lookup-entry config id :termination-policy-custom-lambda-function-arn)]
      (. builder terminationPolicyCustomLambdaFunctionArn data))
    (when-let [data (lookup-entry config id :topic-encryption-key)]
      (. builder topicEncryptionKey data))
    (when-let [data (lookup-entry config id :update-policy)]
      (. builder updatePolicy data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn app-mesh-proxy-configuration-builder
  "The app-mesh-proxy-configuration-builder function buildes out new instances of 
AppMeshProxyConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `properties` | software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps | [[cdk.support/lookup-entry]] | `:properties` |"
  [stack id config]
  (let [builder (AppMeshProxyConfiguration$Builder/create)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (.build builder)))


(defn app-mesh-proxy-configuration-config-props-builder
  "The app-mesh-proxy-configuration-config-props-builder function buildes out new instances of 
AppMeshProxyConfigurationConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `properties` | software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps | [[cdk.support/lookup-entry]] | `:properties` |"
  [stack id config]
  (let [builder (AppMeshProxyConfigurationConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (.build builder)))


(defn app-mesh-proxy-configuration-props-builder
  "The app-mesh-proxy-configuration-props-builder function buildes out new instances of 
AppMeshProxyConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:app-ports` |
| `egressIgnoredIPs` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-ignored-i-ps` |
| `egressIgnoredPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-ignored-ports` |
| `ignoredGid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignored-gid` |
| `ignoredUid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignored-uid` |
| `proxyEgressPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proxy-egress-port` |
| `proxyIngressPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proxy-ingress-port` |"
  [stack id config]
  (let [builder (AppMeshProxyConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :app-ports)]
      (. builder appPorts data))
    (when-let [data (lookup-entry config id :egress-ignored-i-ps)]
      (. builder egressIgnoredIPs data))
    (when-let [data (lookup-entry config id :egress-ignored-ports)]
      (. builder egressIgnoredPorts data))
    (when-let [data (lookup-entry config id :ignored-gid)]
      (. builder ignoredGid data))
    (when-let [data (lookup-entry config id :ignored-uid)]
      (. builder ignoredUid data))
    (when-let [data (lookup-entry config id :proxy-egress-port)]
      (. builder proxyEgressPort data))
    (when-let [data (lookup-entry config id :proxy-ingress-port)]
      (. builder proxyIngressPort data))
    (.build builder)))


(defn asg-capacity-provider-builder
  "The asg-capacity-provider-builder function buildes out new instances of 
AsgCapacityProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `canContainersAccessInstanceRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:can-containers-access-instance-role` |
| `capacityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider-name` |
| `enableManagedDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-draining` |
| `enableManagedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-scaling` |
| `enableManagedTerminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-termination-protection` |
| `instanceWarmupPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-warmup-period` |
| `machineImageType` | software.amazon.awscdk.services.ecs.MachineImageType | [[cdk.api.services.ecs/machine-image-type]] | `:machine-image-type` |
| `maximumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-scaling-step-size` |
| `minimumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-scaling-step-size` |
| `spotInstanceDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-instance-draining` |
| `targetCapacityPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-capacity-percent` |
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |"
  [stack id config]
  (let [builder (AsgCapacityProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :can-containers-access-instance-role)]
      (. builder canContainersAccessInstanceRole data))
    (when-let [data (lookup-entry config id :capacity-provider-name)]
      (. builder capacityProviderName data))
    (when-let [data (lookup-entry config id :enable-managed-draining)]
      (. builder enableManagedDraining data))
    (when-let [data (lookup-entry config id :enable-managed-scaling)]
      (. builder enableManagedScaling data))
    (when-let [data (lookup-entry config id :enable-managed-termination-protection)]
      (. builder enableManagedTerminationProtection data))
    (when-let [data (lookup-entry config id :instance-warmup-period)]
      (. builder instanceWarmupPeriod data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
    (when-let [data (lookup-entry config id :maximum-scaling-step-size)]
      (. builder maximumScalingStepSize data))
    (when-let [data (lookup-entry config id :minimum-scaling-step-size)]
      (. builder minimumScalingStepSize data))
    (when-let [data (lookup-entry config id :spot-instance-draining)]
      (. builder spotInstanceDraining data))
    (when-let [data (lookup-entry config id :target-capacity-percent)]
      (. builder targetCapacityPercent data))
    (when-let [data (lookup-entry config id :topic-encryption-key)]
      (. builder topicEncryptionKey data))
    (.build builder)))


(defn asg-capacity-provider-props-builder
  "The asg-capacity-provider-props-builder function buildes out new instances of 
AsgCapacityProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:auto-scaling-group` |
| `canContainersAccessInstanceRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:can-containers-access-instance-role` |
| `capacityProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider-name` |
| `enableManagedDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-draining` |
| `enableManagedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-scaling` |
| `enableManagedTerminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-managed-termination-protection` |
| `instanceWarmupPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-warmup-period` |
| `machineImageType` | software.amazon.awscdk.services.ecs.MachineImageType | [[cdk.api.services.ecs/machine-image-type]] | `:machine-image-type` |
| `maximumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-scaling-step-size` |
| `minimumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-scaling-step-size` |
| `spotInstanceDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-instance-draining` |
| `targetCapacityPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-capacity-percent` |
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |"
  [stack id config]
  (let [builder (AsgCapacityProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group)]
      (. builder autoScalingGroup data))
    (when-let [data (lookup-entry config id :can-containers-access-instance-role)]
      (. builder canContainersAccessInstanceRole data))
    (when-let [data (lookup-entry config id :capacity-provider-name)]
      (. builder capacityProviderName data))
    (when-let [data (lookup-entry config id :enable-managed-draining)]
      (. builder enableManagedDraining data))
    (when-let [data (lookup-entry config id :enable-managed-scaling)]
      (. builder enableManagedScaling data))
    (when-let [data (lookup-entry config id :enable-managed-termination-protection)]
      (. builder enableManagedTerminationProtection data))
    (when-let [data (lookup-entry config id :instance-warmup-period)]
      (. builder instanceWarmupPeriod data))
    (when-let [data (machine-image-type config id :machine-image-type)]
      (. builder machineImageType data))
    (when-let [data (lookup-entry config id :maximum-scaling-step-size)]
      (. builder maximumScalingStepSize data))
    (when-let [data (lookup-entry config id :minimum-scaling-step-size)]
      (. builder minimumScalingStepSize data))
    (when-let [data (lookup-entry config id :spot-instance-draining)]
      (. builder spotInstanceDraining data))
    (when-let [data (lookup-entry config id :target-capacity-percent)]
      (. builder targetCapacityPercent data))
    (when-let [data (lookup-entry config id :topic-encryption-key)]
      (. builder topicEncryptionKey data))
    (.build builder)))


(defn asset-environment-file-builder
  "The asset-environment-file-builder function buildes out new instances of 
AssetEnvironmentFile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config ^java.lang.String path]
  (let [builder (AssetEnvironmentFile$Builder/create ^java.lang.String path)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (.build builder)))


(defn asset-image-builder
  "The asset-image-builder function buildes out new instances of 
AssetImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config ^java.lang.String directory]
  (let [builder (AssetImage$Builder/create ^java.lang.String directory)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :cache-disabled)]
      (. builder cacheDisabled data))
    (when-let [data (lookup-entry config id :cache-from)]
      (. builder cacheFrom data))
    (when-let [data (lookup-entry config id :cache-to)]
      (. builder cacheTo data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :invalidation)]
      (. builder invalidation data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn asset-image-props-builder
  "The asset-image-props-builder function buildes out new instances of 
AssetImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (AssetImageProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :cache-disabled)]
      (. builder cacheDisabled data))
    (when-let [data (lookup-entry config id :cache-from)]
      (. builder cacheFrom data))
    (when-let [data (lookup-entry config id :cache-to)]
      (. builder cacheTo data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :invalidation)]
      (. builder invalidation data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn associate-cloud-map-service-options-builder
  "The associate-cloud-map-service-options-builder function buildes out new instances of 
AssociateCloudMapServiceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AssociateCloudMapServiceOptions$Builder.)]
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn authorization-config-builder
  "The authorization-config-builder function buildes out new instances of 
AuthorizationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |"
  [stack id config]
  (let [builder (AuthorizationConfig$Builder.)]
    (when-let [data (lookup-entry config id :access-point-id)]
      (. builder accessPointId data))
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (.build builder)))


(defn aws-log-driver-builder
  "The aws-log-driver-builder function buildes out new instances of 
AwsLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `maxBufferSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-buffer-size` |
| `mode` | software.amazon.awscdk.services.ecs.AwsLogDriverMode | [[cdk.api.services.ecs/aws-log-driver-mode]] | `:mode` |
| `multilinePattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiline-pattern` |
| `streamPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-prefix` |"
  [stack id config]
  (let [builder (AwsLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :datetime-format)]
      (. builder datetimeFormat data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (retention-days config id :log-retention)]
      (. builder logRetention data))
    (when-let [data (lookup-entry config id :max-buffer-size)]
      (. builder maxBufferSize data))
    (when-let [data (aws-log-driver-mode config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :multiline-pattern)]
      (. builder multilinePattern data))
    (when-let [data (lookup-entry config id :stream-prefix)]
      (. builder streamPrefix data))
    (.build builder)))


(defn aws-log-driver-props-builder
  "The aws-log-driver-props-builder function buildes out new instances of 
AwsLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `maxBufferSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-buffer-size` |
| `mode` | software.amazon.awscdk.services.ecs.AwsLogDriverMode | [[cdk.api.services.ecs/aws-log-driver-mode]] | `:mode` |
| `multilinePattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiline-pattern` |
| `streamPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-prefix` |"
  [stack id config]
  (let [builder (AwsLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :datetime-format)]
      (. builder datetimeFormat data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (retention-days config id :log-retention)]
      (. builder logRetention data))
    (when-let [data (lookup-entry config id :max-buffer-size)]
      (. builder maxBufferSize data))
    (when-let [data (aws-log-driver-mode config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :multiline-pattern)]
      (. builder multilinePattern data))
    (when-let [data (lookup-entry config id :stream-prefix)]
      (. builder streamPrefix data))
    (.build builder)))


(defn base-log-driver-props-builder
  "The base-log-driver-props-builder function buildes out new instances of 
BaseLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (BaseLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn base-mount-point-builder
  "The base-mount-point-builder function buildes out new instances of 
BaseMountPoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |"
  [stack id config]
  (let [builder (BaseMountPoint$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (.build builder)))


(defn base-service-options-builder
  "The base-service-options-builder function buildes out new instances of 
BaseServiceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (BaseServiceOptions$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn base-service-props-builder
  "The base-service-props-builder function buildes out new instances of 
BaseServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `launchType` | software.amazon.awscdk.services.ecs.LaunchType | [[cdk.api.services.ecs/launch-type]] | `:launch-type` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (BaseServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (launch-type config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn bottle-rocket-image-builder
  "The bottle-rocket-image-builder function buildes out new instances of 
BottleRocketImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.ec2.InstanceArchitecture | [[cdk.api.services.ec2/instance-architecture]] | `:architecture` |
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `variant` | software.amazon.awscdk.services.ecs.BottlerocketEcsVariant | [[cdk.api.services.ecs/bottlerocket-ecs-variant]] | `:variant` |"
  [stack id config]
  (let [builder (BottleRocketImage$Builder/create)]
    (when-let [data (instance-architecture config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (bottlerocket-ecs-variant config id :variant)]
      (. builder variant data))
    (.build builder)))


(defn bottle-rocket-image-props-builder
  "The bottle-rocket-image-props-builder function buildes out new instances of 
BottleRocketImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.ec2.InstanceArchitecture | [[cdk.api.services.ec2/instance-architecture]] | `:architecture` |
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `variant` | software.amazon.awscdk.services.ecs.BottlerocketEcsVariant | [[cdk.api.services.ecs/bottlerocket-ecs-variant]] | `:variant` |"
  [stack id config]
  (let [builder (BottleRocketImageProps$Builder.)]
    (when-let [data (instance-architecture config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (bottlerocket-ecs-variant config id :variant)]
      (. builder variant data))
    (.build builder)))


(defn capacity-provider-strategy-builder
  "The capacity-provider-strategy-builder function buildes out new instances of 
CapacityProviderStrategy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CapacityProviderStrategy$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-capacity-provider-auto-scaling-group-provider-property-builder
  "The cfn-capacity-provider-auto-scaling-group-provider-property-builder function buildes out new instances of 
CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-arn` |
| `managedDraining` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-draining` |
| `managedScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-scaling` |
| `managedTerminationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-termination-protection` |"
  [stack id config]
  (let [builder (CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-arn)]
      (. builder autoScalingGroupArn data))
    (when-let [data (lookup-entry config id :managed-draining)]
      (. builder managedDraining data))
    (when-let [data (lookup-entry config id :managed-scaling)]
      (. builder managedScaling data))
    (when-let [data (lookup-entry config id :managed-termination-protection)]
      (. builder managedTerminationProtection data))
    (.build builder)))


(defn cfn-capacity-provider-builder
  "The cfn-capacity-provider-builder function buildes out new instances of 
CfnCapacityProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-group-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCapacityProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-group-provider)]
      (. builder autoScalingGroupProvider data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-capacity-provider-managed-scaling-property-builder
  "The cfn-capacity-provider-managed-scaling-property-builder function buildes out new instances of 
CfnCapacityProvider$ManagedScalingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceWarmupPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-warmup-period` |
| `maximumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-scaling-step-size` |
| `minimumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-scaling-step-size` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `targetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-capacity` |"
  [stack id config]
  (let [builder (CfnCapacityProvider$ManagedScalingProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-warmup-period)]
      (. builder instanceWarmupPeriod data))
    (when-let [data (lookup-entry config id :maximum-scaling-step-size)]
      (. builder maximumScalingStepSize data))
    (when-let [data (lookup-entry config id :minimum-scaling-step-size)]
      (. builder minimumScalingStepSize data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :target-capacity)]
      (. builder targetCapacity data))
    (.build builder)))


(defn cfn-capacity-provider-props-builder
  "The cfn-capacity-provider-props-builder function buildes out new instances of 
CfnCapacityProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-group-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCapacityProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-group-provider)]
      (. builder autoScalingGroupProvider data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `clusterSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-settings` |
| `configuration` | software.amazon.awscdk.services.ecs.CfnCluster$ClusterConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `defaultCapacityProviderStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
| `serviceConnectDefaults` | software.amazon.awscdk.services.ecs.CfnCluster$ServiceConnectDefaultsProperty | [[cdk.support/lookup-entry]] | `:service-connect-defaults` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-providers)]
      (. builder capacityProviders data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :cluster-settings)]
      (. builder clusterSettings data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
      (. builder defaultCapacityProviderStrategy data))
    (when-let [data (lookup-entry config id :service-connect-defaults)]
      (. builder serviceConnectDefaults data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-capacity-provider-associations-builder
  "The cfn-cluster-capacity-provider-associations-builder function buildes out new instances of 
CfnClusterCapacityProviderAssociations$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `defaultCapacityProviderStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |"
  [stack id config]
  (let [builder (CfnClusterCapacityProviderAssociations$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-providers)]
      (. builder capacityProviders data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
      (. builder defaultCapacityProviderStrategy data))
    (.build builder)))


(defn cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder
  "The cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder function buildes out new instances of 
CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-cluster-capacity-provider-associations-props-builder
  "The cfn-cluster-capacity-provider-associations-props-builder function buildes out new instances of 
CfnClusterCapacityProviderAssociationsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `defaultCapacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |"
  [stack id config]
  (let [builder (CfnClusterCapacityProviderAssociationsProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-providers)]
      (. builder capacityProviders data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
      (. builder defaultCapacityProviderStrategy data))
    (.build builder)))


(defn cfn-cluster-capacity-provider-strategy-item-property-builder
  "The cfn-cluster-capacity-provider-strategy-item-property-builder function buildes out new instances of 
CfnCluster$CapacityProviderStrategyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnCluster$CapacityProviderStrategyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-cluster-cluster-configuration-property-builder
  "The cfn-cluster-cluster-configuration-property-builder function buildes out new instances of 
CfnCluster$ClusterConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeCommandConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |"
  [stack id config]
  (let [builder (CfnCluster$ClusterConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :execute-command-configuration)]
      (. builder executeCommandConfiguration data))
    (.build builder)))


(defn cfn-cluster-cluster-settings-property-builder
  "The cfn-cluster-cluster-settings-property-builder function buildes out new instances of 
CfnCluster$ClusterSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCluster$ClusterSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-cluster-execute-command-configuration-property-builder
  "The cfn-cluster-execute-command-configuration-property-builder function buildes out new instances of 
CfnCluster$ExecuteCommandConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |"
  [stack id config]
  (let [builder (CfnCluster$ExecuteCommandConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (.build builder)))


(defn cfn-cluster-execute-command-log-configuration-property-builder
  "The cfn-cluster-execute-command-log-configuration-property-builder function buildes out new instances of 
CfnCluster$ExecuteCommandLogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-enabled` |
| `cloudWatchLogGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3EncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-encryption-enabled` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (CfnCluster$ExecuteCommandLogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-encryption-enabled)]
      (. builder cloudWatchEncryptionEnabled data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group-name)]
      (. builder cloudWatchLogGroupName data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-encryption-enabled)]
      (. builder s3EncryptionEnabled data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `clusterSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-settings` |
| `configuration` | software.amazon.awscdk.services.ecs.CfnCluster$ClusterConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `defaultCapacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
| `serviceConnectDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-connect-defaults` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-providers)]
      (. builder capacityProviders data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :cluster-settings)]
      (. builder clusterSettings data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
      (. builder defaultCapacityProviderStrategy data))
    (when-let [data (lookup-entry config id :service-connect-defaults)]
      (. builder serviceConnectDefaults data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-service-connect-defaults-property-builder
  "The cfn-cluster-service-connect-defaults-property-builder function buildes out new instances of 
CfnCluster$ServiceConnectDefaultsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnCluster$ServiceConnectDefaultsProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-primary-task-set-builder
  "The cfn-primary-task-set-builder function buildes out new instances of 
CfnPrimaryTaskSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `taskSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-set-id` |"
  [stack id config]
  (let [builder (CfnPrimaryTaskSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :task-set-id)]
      (. builder taskSetId data))
    (.build builder)))


(defn cfn-primary-task-set-props-builder
  "The cfn-primary-task-set-props-builder function buildes out new instances of 
CfnPrimaryTaskSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `taskSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-set-id` |"
  [stack id config]
  (let [builder (CfnPrimaryTaskSetProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :task-set-id)]
      (. builder taskSetId data))
    (.build builder)))


(defn cfn-service-aws-vpc-configuration-property-builder
  "The cfn-service-aws-vpc-configuration-property-builder function buildes out new instances of 
CfnService$AwsVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnService$AwsVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-service-builder
  "The cfn-service-builder function buildes out new instances of 
CfnService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategy` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentConfiguration` | software.amazon.awscdk.services.ecs.CfnService$DeploymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:deployment-configuration` |
| `deploymentController` | software.amazon.awscdk.services.ecs.CfnService$DeploymentControllerProperty | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-grace-period-seconds` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `loadBalancers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `placementConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.CfnService$ServiceConnectConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `serviceRegistries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-registries` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (CfnService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-provider-strategy)]
      (. builder capacityProviderStrategy data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-configuration)]
      (. builder deploymentConfiguration data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period-seconds)]
      (. builder healthCheckGracePeriodSeconds data))
    (when-let [data (lookup-entry config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :scheduling-strategy)]
      (. builder schedulingStrategy data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :service-registries)]
      (. builder serviceRegistries data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn cfn-service-capacity-provider-strategy-item-property-builder
  "The cfn-service-capacity-provider-strategy-item-property-builder function buildes out new instances of 
CfnService$CapacityProviderStrategyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnService$CapacityProviderStrategyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :base)]
      (. builder base data))
    (when-let [data (lookup-entry config id :capacity-provider)]
      (. builder capacityProvider data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-service-deployment-alarms-property-builder
  "The cfn-service-deployment-alarms-property-builder function buildes out new instances of 
CfnService$DeploymentAlarmsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmNames` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-names` |
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rollback` |"
  [stack id config]
  (let [builder (CfnService$DeploymentAlarmsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-names)]
      (. builder alarmNames data))
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :rollback)]
      (. builder rollback data))
    (.build builder)))


(defn cfn-service-deployment-circuit-breaker-property-builder
  "The cfn-service-deployment-circuit-breaker-property-builder function buildes out new instances of 
CfnService$DeploymentCircuitBreakerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rollback` |"
  [stack id config]
  (let [builder (CfnService$DeploymentCircuitBreakerProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :rollback)]
      (. builder rollback data))
    (.build builder)))


(defn cfn-service-deployment-configuration-property-builder
  "The cfn-service-deployment-configuration-property-builder function buildes out new instances of 
CfnService$DeploymentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | software.amazon.awscdk.services.ecs.CfnService$DeploymentAlarmsProperty | [[cdk.support/lookup-entry]] | `:alarms` |
| `deploymentCircuitBreaker` | software.amazon.awscdk.services.ecs.CfnService$DeploymentCircuitBreakerProperty | [[cdk.support/lookup-entry]] | `:deployment-circuit-breaker` |
| `maximumPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-percent` |
| `minimumHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-healthy-percent` |"
  [stack id config]
  (let [builder (CfnService$DeploymentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :deployment-circuit-breaker)]
      (. builder deploymentCircuitBreaker data))
    (when-let [data (lookup-entry config id :maximum-percent)]
      (. builder maximumPercent data))
    (when-let [data (lookup-entry config id :minimum-healthy-percent)]
      (. builder minimumHealthyPercent data))
    (.build builder)))


(defn cfn-service-deployment-controller-property-builder
  "The cfn-service-deployment-controller-property-builder function buildes out new instances of 
CfnService$DeploymentControllerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$DeploymentControllerProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-ebs-tag-specification-property-builder
  "The cfn-service-ebs-tag-specification-property-builder function buildes out new instances of 
CfnService$EBSTagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnService$EBSTagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-load-balancer-property-builder
  "The cfn-service-load-balancer-property-builder function buildes out new instances of 
CfnService$LoadBalancerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |"
  [stack id config]
  (let [builder (CfnService$LoadBalancerProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (.build builder)))


(defn cfn-service-log-configuration-property-builder
  "The cfn-service-log-configuration-property-builder function buildes out new instances of 
CfnService$LogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (CfnService$LogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn cfn-service-network-configuration-property-builder
  "The cfn-service-network-configuration-property-builder function buildes out new instances of 
CfnService$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |"
  [stack id config]
  (let [builder (CfnService$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :awsvpc-configuration)]
      (. builder awsvpcConfiguration data))
    (.build builder)))


(defn cfn-service-placement-constraint-property-builder
  "The cfn-service-placement-constraint-property-builder function buildes out new instances of 
CfnService$PlacementConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$PlacementConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-placement-strategy-property-builder
  "The cfn-service-placement-strategy-property-builder function buildes out new instances of 
CfnService$PlacementStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$PlacementStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :field)]
      (. builder field data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-props-builder
  "The cfn-service-props-builder function buildes out new instances of 
CfnServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategy` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentConfiguration` | software.amazon.awscdk.services.ecs.CfnService$DeploymentConfigurationProperty | [[cdk.support/lookup-entry]] | `:deployment-configuration` |
| `deploymentController` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriodSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-check-grace-period-seconds` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `placementConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.CfnService$ServiceConnectConfigurationProperty | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `serviceRegistries` | java.util.List | [[cdk.support/lookup-entry]] | `:service-registries` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (CfnServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategy)]
      (. builder capacityProviderStrategy data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-configuration)]
      (. builder deploymentConfiguration data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period-seconds)]
      (. builder healthCheckGracePeriodSeconds data))
    (when-let [data (lookup-entry config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :scheduling-strategy)]
      (. builder schedulingStrategy data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :service-registries)]
      (. builder serviceRegistries data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn cfn-service-secret-property-builder
  "The cfn-service-secret-property-builder function buildes out new instances of 
CfnService$SecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |"
  [stack id config]
  (let [builder (CfnService$SecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value-from)]
      (. builder valueFrom data))
    (.build builder)))


(defn cfn-service-service-connect-client-alias-property-builder
  "The cfn-service-service-connect-client-alias-property-builder function buildes out new instances of 
CfnService$ServiceConnectClientAliasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnService$ServiceConnectClientAliasProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-service-service-connect-configuration-property-builder
  "The cfn-service-service-connect-configuration-property-builder function buildes out new instances of 
CfnService$ServiceConnectConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logConfiguration` | software.amazon.awscdk.services.ecs.CfnService$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `services` | java.util.List | [[cdk.support/lookup-entry]] | `:services` |"
  [stack id config]
  (let [builder (CfnService$ServiceConnectConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :services)]
      (. builder services data))
    (.build builder)))


(defn cfn-service-service-connect-service-property-builder
  "The cfn-service-service-connect-service-property-builder function buildes out new instances of 
CfnService$ServiceConnectServiceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAliases` | java.util.List | [[cdk.support/lookup-entry]] | `:client-aliases` |
| `discoveryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-name` |
| `ingressPortOverride` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingress-port-override` |
| `portName` | java.lang.String | [[cdk.support/lookup-entry]] | `:port-name` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |"
  [stack id config]
  (let [builder (CfnService$ServiceConnectServiceProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-aliases)]
      (. builder clientAliases data))
    (when-let [data (lookup-entry config id :discovery-name)]
      (. builder discoveryName data))
    (when-let [data (lookup-entry config id :ingress-port-override)]
      (. builder ingressPortOverride data))
    (when-let [data (lookup-entry config id :port-name)]
      (. builder portName data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :tls)]
      (. builder tls data))
    (.build builder)))


(defn cfn-service-service-connect-tls-certificate-authority-property-builder
  "The cfn-service-service-connect-tls-certificate-authority-property-builder function buildes out new instances of 
CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsPcaAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-pca-authority-arn` |"
  [stack id config]
  (let [builder (CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-pca-authority-arn)]
      (. builder awsPcaAuthorityArn data))
    (.build builder)))


(defn cfn-service-service-connect-tls-configuration-property-builder
  "The cfn-service-service-connect-tls-configuration-property-builder function buildes out new instances of 
CfnService$ServiceConnectTlsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `issuerCertificateAuthority` | software.amazon.awscdk.services.ecs.CfnService$ServiceConnectTlsCertificateAuthorityProperty | [[cdk.support/lookup-entry]] | `:issuer-certificate-authority` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnService$ServiceConnectTlsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :issuer-certificate-authority)]
      (. builder issuerCertificateAuthority data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-service-service-managed-ebs-volume-configuration-property-builder
  "The cfn-service-service-managed-ebs-volume-configuration-property-builder function buildes out new instances of 
CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `filesystemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filesystem-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :filesystem-type)]
      (. builder filesystemType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :size-in-gi-b)]
      (. builder sizeInGiB data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-service-service-registry-property-builder
  "The cfn-service-service-registry-property-builder function buildes out new instances of 
CfnService$ServiceRegistryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `registryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-arn` |"
  [stack id config]
  (let [builder (CfnService$ServiceRegistryProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :registry-arn)]
      (. builder registryArn data))
    (.build builder)))


(defn cfn-service-service-volume-configuration-property-builder
  "The cfn-service-service-volume-configuration-property-builder function buildes out new instances of 
CfnService$ServiceVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.CfnService$ServiceManagedEBSVolumeConfigurationProperty | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnService$ServiceVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :managed-ebs-volume)]
      (. builder managedEbsVolume data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-service-timeout-configuration-property-builder
  "The cfn-service-timeout-configuration-property-builder function buildes out new instances of 
CfnService$TimeoutConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout-seconds` |
| `perRequestTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:per-request-timeout-seconds` |"
  [stack id config]
  (let [builder (CfnService$TimeoutConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle-timeout-seconds)]
      (. builder idleTimeoutSeconds data))
    (when-let [data (lookup-entry config id :per-request-timeout-seconds)]
      (. builder perRequestTimeoutSeconds data))
    (.build builder)))


(defn cfn-task-definition-authorization-config-property-builder
  "The cfn-task-definition-authorization-config-property-builder function buildes out new instances of 
CfnTaskDefinition$AuthorizationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$AuthorizationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-point-id)]
      (. builder accessPointId data))
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (.build builder)))


(defn cfn-task-definition-builder
  "The cfn-task-definition-builder function buildes out new instances of 
CfnTaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorage` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$EphemeralStorageProperty | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipc-mode` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
| `networkMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-mode` |
| `pidMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$ProxyConfigurationProperty | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `requiresCompatibilities` | java.util.List | [[cdk.support/lookup-entry]] | `:requires-compatibilities` |
| `runtimePlatform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-role-arn` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-definitions)]
      (. builder containerDefinitions data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (lookup-entry config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :requires-compatibilities)]
      (. builder requiresCompatibilities data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-role-arn)]
      (. builder taskRoleArn data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-task-definition-container-definition-property-builder
  "The cfn-task-definition-container-definition-property-builder function buildes out new instances of 
CfnTaskDefinition$ContainerDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `dependsOn` | java.util.List | [[cdk.support/lookup-entry]] | `:depends-on` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.List | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `firelensConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firelens-configuration` |
| `healthCheck` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$HealthCheckProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `links` | java.util.List | [[cdk.support/lookup-entry]] | `:links` |
| `linuxParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |
| `mountPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-points` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `repositoryCredentials` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$RepositoryCredentialsProperty | [[cdk.support/lookup-entry]] | `:repository-credentials` |
| `resourceRequirements` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-requirements` |
| `secrets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumesFrom` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volumes-from` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$ContainerDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :depends-on)]
      (. builder dependsOn data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :firelens-configuration)]
      (. builder firelensConfiguration data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :links)]
      (. builder links data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :memory-reservation)]
      (. builder memoryReservation data))
    (when-let [data (lookup-entry config id :mount-points)]
      (. builder mountPoints data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :repository-credentials)]
      (. builder repositoryCredentials data))
    (when-let [data (lookup-entry config id :resource-requirements)]
      (. builder resourceRequirements data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :volumes-from)]
      (. builder volumesFrom data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-task-definition-container-dependency-property-builder
  "The cfn-task-definition-container-dependency-property-builder function buildes out new instances of 
CfnTaskDefinition$ContainerDependencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$ContainerDependencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (.build builder)))


(defn cfn-task-definition-device-property-builder
  "The cfn-task-definition-device-property-builder function buildes out new instances of 
CfnTaskDefinition$DeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$DeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :host-path)]
      (. builder hostPath data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (.build builder)))


(defn cfn-task-definition-docker-volume-configuration-property-builder
  "The cfn-task-definition-docker-volume-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoprovision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:autoprovision` |
| `driver` | java.lang.String | [[cdk.support/lookup-entry]] | `:driver` |
| `driverOpts` | java.util.Map | [[cdk.support/lookup-entry]] | `:driver-opts` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :autoprovision)]
      (. builder autoprovision data))
    (when-let [data (lookup-entry config id :driver)]
      (. builder driver data))
    (when-let [data (lookup-entry config id :driver-opts)]
      (. builder driverOpts data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn cfn-task-definition-efs-volume-configuration-property-builder
  "The cfn-task-definition-efs-volume-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `filesystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:filesystem-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :filesystem-id)]
      (. builder filesystemId data))
    (when-let [data (lookup-entry config id :root-directory)]
      (. builder rootDirectory data))
    (when-let [data (lookup-entry config id :transit-encryption)]
      (. builder transitEncryption data))
    (when-let [data (lookup-entry config id :transit-encryption-port)]
      (. builder transitEncryptionPort data))
    (.build builder)))


(defn cfn-task-definition-environment-file-property-builder
  "The cfn-task-definition-environment-file-property-builder function buildes out new instances of 
CfnTaskDefinition$EnvironmentFileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$EnvironmentFileProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-definition-ephemeral-storage-property-builder
  "The cfn-task-definition-ephemeral-storage-property-builder function buildes out new instances of 
CfnTaskDefinition$EphemeralStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$EphemeralStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :size-in-gi-b)]
      (. builder sizeInGiB data))
    (.build builder)))


(defn cfn-task-definition-f-sx-authorization-config-property-builder
  "The cfn-task-definition-f-sx-authorization-config-property-builder function buildes out new instances of 
CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials-parameter)]
      (. builder credentialsParameter data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (.build builder)))


(defn cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder
  "The cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$FSxAuthorizationConfigProperty | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :root-directory)]
      (. builder rootDirectory data))
    (.build builder)))


(defn cfn-task-definition-firelens-configuration-property-builder
  "The cfn-task-definition-firelens-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$FirelensConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$FirelensConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-task-definition-health-check-property-builder
  "The cfn-task-definition-health-check-property-builder function buildes out new instances of 
CfnTaskDefinition$HealthCheckProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$HealthCheckProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :retries)]
      (. builder retries data))
    (when-let [data (lookup-entry config id :start-period)]
      (. builder startPeriod data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-task-definition-host-entry-property-builder
  "The cfn-task-definition-host-entry-property-builder function buildes out new instances of 
CfnTaskDefinition$HostEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$HostEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (.build builder)))


(defn cfn-task-definition-host-volume-properties-property-builder
  "The cfn-task-definition-host-volume-properties-property-builder function buildes out new instances of 
CfnTaskDefinition$HostVolumePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$HostVolumePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-task-definition-inference-accelerator-property-builder
  "The cfn-task-definition-inference-accelerator-property-builder function buildes out new instances of 
CfnTaskDefinition$InferenceAcceleratorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$InferenceAcceleratorProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :device-type)]
      (. builder deviceType data))
    (.build builder)))


(defn cfn-task-definition-kernel-capabilities-property-builder
  "The cfn-task-definition-kernel-capabilities-property-builder function buildes out new instances of 
CfnTaskDefinition$KernelCapabilitiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `add` | java.util.List | [[cdk.support/lookup-entry]] | `:add` |
| `drop` | java.util.List | [[cdk.support/lookup-entry]] | `:drop` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$KernelCapabilitiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :add)]
      (. builder add data))
    (when-let [data (lookup-entry config id :drop)]
      (. builder drop data))
    (.build builder)))


(defn cfn-task-definition-key-value-pair-property-builder
  "The cfn-task-definition-key-value-pair-property-builder function buildes out new instances of 
CfnTaskDefinition$KeyValuePairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$KeyValuePairProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-definition-linux-parameters-property-builder
  "The cfn-task-definition-linux-parameters-property-builder function buildes out new instances of 
CfnTaskDefinition$LinuxParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$KernelCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:capabilities` |
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
| `tmpfs` | java.util.List | [[cdk.support/lookup-entry]] | `:tmpfs` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$LinuxParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
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


(defn cfn-task-definition-log-configuration-property-builder
  "The cfn-task-definition-log-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$LogConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$LogConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn cfn-task-definition-mount-point-property-builder
  "The cfn-task-definition-mount-point-property-builder function buildes out new instances of 
CfnTaskDefinition$MountPointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$MountPointProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-volume)]
      (. builder sourceVolume data))
    (.build builder)))


(defn cfn-task-definition-port-mapping-property-builder
  "The cfn-task-definition-port-mapping-property-builder function buildes out new instances of 
CfnTaskDefinition$PortMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$PortMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-protocol)]
      (. builder appProtocol data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :container-port-range)]
      (. builder containerPortRange data))
    (when-let [data (lookup-entry config id :host-port)]
      (. builder hostPort data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-task-definition-props-builder
  "The cfn-task-definition-props-builder function buildes out new instances of 
CfnTaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipc-mode` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
| `networkMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-mode` |
| `pidMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `requiresCompatibilities` | java.util.List | [[cdk.support/lookup-entry]] | `:requires-compatibilities` |
| `runtimePlatform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-role-arn` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnTaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :container-definitions)]
      (. builder containerDefinitions data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (lookup-entry config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :requires-compatibilities)]
      (. builder requiresCompatibilities data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-role-arn)]
      (. builder taskRoleArn data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-task-definition-proxy-configuration-property-builder
  "The cfn-task-definition-proxy-configuration-property-builder function buildes out new instances of 
CfnTaskDefinition$ProxyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `proxyConfigurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proxy-configuration-properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$ProxyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :proxy-configuration-properties)]
      (. builder proxyConfigurationProperties data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-task-definition-repository-credentials-property-builder
  "The cfn-task-definition-repository-credentials-property-builder function buildes out new instances of 
CfnTaskDefinition$RepositoryCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$RepositoryCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials-parameter)]
      (. builder credentialsParameter data))
    (.build builder)))


(defn cfn-task-definition-resource-requirement-property-builder
  "The cfn-task-definition-resource-requirement-property-builder function buildes out new instances of 
CfnTaskDefinition$ResourceRequirementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$ResourceRequirementProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-definition-runtime-platform-property-builder
  "The cfn-task-definition-runtime-platform-property-builder function buildes out new instances of 
CfnTaskDefinition$RuntimePlatformProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system-family` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$RuntimePlatformProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-architecture)]
      (. builder cpuArchitecture data))
    (when-let [data (lookup-entry config id :operating-system-family)]
      (. builder operatingSystemFamily data))
    (.build builder)))


(defn cfn-task-definition-secret-property-builder
  "The cfn-task-definition-secret-property-builder function buildes out new instances of 
CfnTaskDefinition$SecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$SecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value-from)]
      (. builder valueFrom data))
    (.build builder)))


(defn cfn-task-definition-system-control-property-builder
  "The cfn-task-definition-system-control-property-builder function buildes out new instances of 
CfnTaskDefinition$SystemControlProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$SystemControlProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-definition-task-definition-placement-constraint-property-builder
  "The cfn-task-definition-task-definition-placement-constraint-property-builder function buildes out new instances of 
CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-task-definition-tmpfs-property-builder
  "The cfn-task-definition-tmpfs-property-builder function buildes out new instances of 
CfnTaskDefinition$TmpfsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$TmpfsProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn cfn-task-definition-ulimit-property-builder
  "The cfn-task-definition-ulimit-property-builder function buildes out new instances of 
CfnTaskDefinition$UlimitProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$UlimitProperty$Builder.)]
    (when-let [data (lookup-entry config id :hard-limit)]
      (. builder hardLimit data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :soft-limit)]
      (. builder softLimit data))
    (.build builder)))


(defn cfn-task-definition-volume-from-property-builder
  "The cfn-task-definition-volume-from-property-builder function buildes out new instances of 
CfnTaskDefinition$VolumeFromProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceContainer` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-container` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$VolumeFromProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-container)]
      (. builder sourceContainer data))
    (.build builder)))


(defn cfn-task-definition-volume-property-builder
  "The cfn-task-definition-volume-property-builder function buildes out new instances of 
CfnTaskDefinition$VolumeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredAtLaunch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configured-at-launch` |
| `dockerVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:docker-volume-configuration` |
| `efsVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `fSxWindowsFileServerVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:f-sx-windows-file-server-volume-configuration` |
| `host` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnTaskDefinition$VolumeProperty$Builder.)]
    (when-let [data (lookup-entry config id :configured-at-launch)]
      (. builder configuredAtLaunch data))
    (when-let [data (lookup-entry config id :docker-volume-configuration)]
      (. builder dockerVolumeConfiguration data))
    (when-let [data (lookup-entry config id :efs-volume-configuration)]
      (. builder efsVolumeConfiguration data))
    (when-let [data (lookup-entry config id :f-sx-windows-file-server-volume-configuration)]
      (. builder fSxWindowsFileServerVolumeConfiguration data))
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-task-set-aws-vpc-configuration-property-builder
  "The cfn-task-set-aws-vpc-configuration-property-builder function buildes out new instances of 
CfnTaskSet$AwsVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnTaskSet$AwsVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-task-set-builder
  "The cfn-task-set-builder function buildes out new instances of 
CfnTaskSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `loadBalancers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `networkConfiguration` | software.amazon.awscdk.services.ecs.CfnTaskSet$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `scale` | software.amazon.awscdk.services.ecs.CfnTaskSet$ScaleProperty | [[cdk.support/lookup-entry]] | `:scale` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `serviceRegistries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-registries` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (CfnTaskSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :scale)]
      (. builder scale data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :service-registries)]
      (. builder serviceRegistries data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn cfn-task-set-load-balancer-property-builder
  "The cfn-task-set-load-balancer-property-builder function buildes out new instances of 
CfnTaskSet$LoadBalancerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |"
  [stack id config]
  (let [builder (CfnTaskSet$LoadBalancerProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :target-group-arn)]
      (. builder targetGroupArn data))
    (.build builder)))


(defn cfn-task-set-network-configuration-property-builder
  "The cfn-task-set-network-configuration-property-builder function buildes out new instances of 
CfnTaskSet$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsVpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-vpc-configuration` |"
  [stack id config]
  (let [builder (CfnTaskSet$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-vpc-configuration)]
      (. builder awsVpcConfiguration data))
    (.build builder)))


(defn cfn-task-set-props-builder
  "The cfn-task-set-props-builder function buildes out new instances of 
CfnTaskSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `launchType` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-type` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `networkConfiguration` | software.amazon.awscdk.services.ecs.CfnTaskSet$NetworkConfigurationProperty | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `platformVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-version` |
| `scale` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scale` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `serviceRegistries` | java.util.List | [[cdk.support/lookup-entry]] | `:service-registries` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (CfnTaskSetProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :launch-type)]
      (. builder launchType data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :scale)]
      (. builder scale data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :service-registries)]
      (. builder serviceRegistries data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn cfn-task-set-scale-property-builder
  "The cfn-task-set-scale-property-builder function buildes out new instances of 
CfnTaskSet$ScaleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTaskSet$ScaleProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-set-service-registry-property-builder
  "The cfn-task-set-service-registry-property-builder function buildes out new instances of 
CfnTaskSet$ServiceRegistryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `registryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-arn` |"
  [stack id config]
  (let [builder (CfnTaskSet$ServiceRegistryProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :registry-arn)]
      (. builder registryArn data))
    (.build builder)))


(defn cloud-map-namespace-options-builder
  "The cloud-map-namespace-options-builder function buildes out new instances of 
CloudMapNamespaceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.servicediscovery.NamespaceType | [[cdk.api.services.servicediscovery/namespace-type]] | `:type` |
| `useForServiceConnect` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-for-service-connect` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CloudMapNamespaceOptions$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (namespace-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :use-for-service-connect)]
      (. builder useForServiceConnect data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cloud-map-options-builder
  "The cloud-map-options-builder function buildes out new instances of 
CloudMapOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapNamespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:cloud-map-namespace` |
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `dnsTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:dns-ttl` |
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CloudMapOptions$Builder.)]
    (when-let [data (lookup-entry config id :cloud-map-namespace)]
      (. builder cloudMapNamespace data))
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (dns-record-type config id :dns-record-type)]
      (. builder dnsRecordType data))
    (when-let [data (lookup-entry config id :dns-ttl)]
      (. builder dnsTtl data))
    (when-let [data (lookup-entry config id :failure-threshold)]
      (. builder failureThreshold data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cluster-attributes-builder
  "The cluster-attributes-builder function buildes out new instances of 
ClusterAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoscalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:autoscaling-group` |
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `hasEc2Capacity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:has-ec2-capacity` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ClusterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :autoscaling-group)]
      (. builder autoscalingGroup data))
    (when-let [data (lookup-entry config id :cluster-arn)]
      (. builder clusterArn data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :default-cloud-map-namespace)]
      (. builder defaultCloudMapNamespace data))
    (when-let [data (lookup-entry config id :execute-command-configuration)]
      (. builder executeCommandConfiguration data))
    (when-let [data (lookup-entry config id :has-ec2-capacity)]
      (. builder hasEc2Capacity data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cluster-builder
  "The cluster-builder function buildes out new instances of 
Cluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.services.ecs.AddCapacityOptions | [[cdk.support/lookup-entry]] | `:capacity` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `containerInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:container-insights` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `enableFargateCapacityProviders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-fargate-capacity-providers` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (Cluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :container-insights)]
      (. builder containerInsights data))
    (when-let [data (lookup-entry config id :default-cloud-map-namespace)]
      (. builder defaultCloudMapNamespace data))
    (when-let [data (lookup-entry config id :enable-fargate-capacity-providers)]
      (. builder enableFargateCapacityProviders data))
    (when-let [data (lookup-entry config id :execute-command-configuration)]
      (. builder executeCommandConfiguration data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cluster-props-builder
  "The cluster-props-builder function buildes out new instances of 
ClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.services.ecs.AddCapacityOptions | [[cdk.support/lookup-entry]] | `:capacity` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `containerInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:container-insights` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `enableFargateCapacityProviders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-fargate-capacity-providers` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (when-let [data (lookup-entry config id :container-insights)]
      (. builder containerInsights data))
    (when-let [data (lookup-entry config id :default-cloud-map-namespace)]
      (. builder defaultCloudMapNamespace data))
    (when-let [data (lookup-entry config id :enable-fargate-capacity-providers)]
      (. builder enableFargateCapacityProviders data))
    (when-let [data (lookup-entry config id :execute-command-configuration)]
      (. builder executeCommandConfiguration data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn common-task-definition-attributes-builder
  "The common-task-definition-attributes-builder function buildes out new instances of 
CommonTaskDefinitionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (CommonTaskDefinitionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn common-task-definition-props-builder
  "The common-task-definition-props-builder function buildes out new instances of 
CommonTaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CommonTaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn container-definition-builder
  "The container-definition-builder function buildes out new instances of 
ContainerDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (ContainerDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn container-definition-options-builder
  "The container-definition-options-builder function buildes out new instances of 
ContainerDefinitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (ContainerDefinitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn container-definition-props-builder
  "The container-definition-props-builder function buildes out new instances of 
ContainerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (ContainerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn container-dependency-builder
  "The container-dependency-builder function buildes out new instances of 
ContainerDependency$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.services.ecs.ContainerDependencyCondition | [[cdk.api.services.ecs/container-dependency-condition]] | `:condition` |
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |"
  [stack id config]
  (let [builder (ContainerDependency$Builder.)]
    (when-let [data (container-dependency-condition config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (.build builder)))


(defn container-image-config-builder
  "The container-image-config-builder function buildes out new instances of 
ContainerImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `repositoryCredentials` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$RepositoryCredentialsProperty | [[cdk.support/lookup-entry]] | `:repository-credentials` |"
  [stack id config]
  (let [builder (ContainerImageConfig$Builder.)]
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :repository-credentials)]
      (. builder repositoryCredentials data))
    (.build builder)))


(defn container-mount-point-builder
  "The container-mount-point-builder function buildes out new instances of 
ContainerMountPoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |"
  [stack id config]
  (let [builder (ContainerMountPoint$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (.build builder)))


(defn cpu-utilization-scaling-props-builder
  "The cpu-utilization-scaling-props-builder function buildes out new instances of 
CpuUtilizationScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |"
  [stack id config]
  (let [builder (CpuUtilizationScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-utilization-percent)]
      (. builder targetUtilizationPercent data))
    (.build builder)))


(defn credential-spec-config-builder
  "The credential-spec-config-builder function buildes out new instances of 
CredentialSpecConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `typePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-prefix` |"
  [stack id config]
  (let [builder (CredentialSpecConfig$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :type-prefix)]
      (. builder typePrefix data))
    (.build builder)))


(defn deployment-alarm-config-builder
  "The deployment-alarm-config-builder function buildes out new instances of 
DeploymentAlarmConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmNames` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-names` |
| `behavior` | software.amazon.awscdk.services.ecs.AlarmBehavior | [[cdk.api.services.ecs/alarm-behavior]] | `:behavior` |"
  [stack id config]
  (let [builder (DeploymentAlarmConfig$Builder.)]
    (when-let [data (lookup-entry config id :alarm-names)]
      (. builder alarmNames data))
    (when-let [data (alarm-behavior config id :behavior)]
      (. builder behavior data))
    (.build builder)))


(defn deployment-alarm-options-builder
  "The deployment-alarm-options-builder function buildes out new instances of 
DeploymentAlarmOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | software.amazon.awscdk.services.ecs.AlarmBehavior | [[cdk.api.services.ecs/alarm-behavior]] | `:behavior` |"
  [stack id config]
  (let [builder (DeploymentAlarmOptions$Builder.)]
    (when-let [data (alarm-behavior config id :behavior)]
      (. builder behavior data))
    (.build builder)))


(defn deployment-circuit-breaker-builder
  "The deployment-circuit-breaker-builder function buildes out new instances of 
DeploymentCircuitBreaker$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rollback` |"
  [stack id config]
  (let [builder (DeploymentCircuitBreaker$Builder.)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :rollback)]
      (. builder rollback data))
    (.build builder)))


(defn deployment-controller-builder
  "The deployment-controller-builder function buildes out new instances of 
DeploymentController$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.ecs.DeploymentControllerType | [[cdk.api.services.ecs/deployment-controller-type]] | `:type` |"
  [stack id config]
  (let [builder (DeploymentController$Builder.)]
    (when-let [data (deployment-controller-type config id :type)]
      (. builder type data))
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


(defn docker-volume-configuration-builder
  "The docker-volume-configuration-builder function buildes out new instances of 
DockerVolumeConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoprovision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:autoprovision` |
| `driver` | java.lang.String | [[cdk.support/lookup-entry]] | `:driver` |
| `driverOpts` | java.util.Map | [[cdk.support/lookup-entry]] | `:driver-opts` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `scope` | software.amazon.awscdk.services.ecs.Scope | [[cdk.api.services.ecs/scope]] | `:scope` |"
  [stack id config]
  (let [builder (DockerVolumeConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :autoprovision)]
      (. builder autoprovision data))
    (when-let [data (lookup-entry config id :driver)]
      (. builder driver data))
    (when-let [data (lookup-entry config id :driver-opts)]
      (. builder driverOpts data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (scope config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn ebs-tag-specification-builder
  "The ebs-tag-specification-builder function buildes out new instances of 
EBSTagSpecification$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propagateTags` | software.amazon.awscdk.services.ecs.EbsPropagatedTagSource | [[cdk.api.services.ecs/ebs-propagated-tag-source]] | `:propagate-tags` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (EBSTagSpecification$Builder.)]
    (when-let [data (ebs-propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn ec2-service-attributes-builder
  "The ec2-service-attributes-builder function buildes out new instances of 
Ec2ServiceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (Ec2ServiceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn ec2-service-builder
  "The ec2-service-builder function buildes out new instances of 
Ec2Service$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `daemon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:daemon` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (Ec2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :daemon)]
      (. builder daemon data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn ec2-service-props-builder
  "The ec2-service-props-builder function buildes out new instances of 
Ec2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `daemon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:daemon` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (Ec2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :daemon)]
      (. builder daemon data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn ec2-task-definition-attributes-builder
  "The ec2-task-definition-attributes-builder function buildes out new instances of 
Ec2TaskDefinitionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (Ec2TaskDefinitionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn ec2-task-definition-builder
  "The ec2-task-definition-builder function buildes out new instances of 
Ec2TaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | software.amazon.awscdk.services.ecs.IpcMode | [[cdk.api.services.ecs/ipc-mode]] | `:ipc-mode` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (Ec2TaskDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (ipc-mode config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ec2-task-definition-props-builder
  "The ec2-task-definition-props-builder function buildes out new instances of 
Ec2TaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | software.amazon.awscdk.services.ecs.IpcMode | [[cdk.api.services.ecs/ipc-mode]] | `:ipc-mode` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (Ec2TaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (ipc-mode config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn ecs-optimized-image-options-builder
  "The ecs-optimized-image-options-builder function buildes out new instances of 
EcsOptimizedImageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |"
  [stack id config]
  (let [builder (EcsOptimizedImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (.build builder)))


(defn ecs-target-builder
  "The ecs-target-builder function buildes out new instances of 
EcsTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `listener` | software.amazon.awscdk.services.ecs.ListenerConfig | [[cdk.support/lookup-entry]] | `:listener` |
| `newTargetGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:new-target-group-id` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (EcsTarget$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (when-let [data (lookup-entry config id :new-target-group-id)]
      (. builder newTargetGroupId data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn efs-volume-configuration-builder
  "The efs-volume-configuration-builder function buildes out new instances of 
EfsVolumeConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.ecs.AuthorizationConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |"
  [stack id config]
  (let [builder (EfsVolumeConfiguration$Builder.)]
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


(defn environment-file-config-builder
  "The environment-file-config-builder function buildes out new instances of 
EnvironmentFileConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileType` | software.amazon.awscdk.services.ecs.EnvironmentFileType | [[cdk.api.services.ecs/environment-file-type]] | `:file-type` |
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (EnvironmentFileConfig$Builder.)]
    (when-let [data (environment-file-type config id :file-type)]
      (. builder fileType data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn execute-command-configuration-builder
  "The execute-command-configuration-builder function buildes out new instances of 
ExecuteCommandConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `logConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `logging` | software.amazon.awscdk.services.ecs.ExecuteCommandLogging | [[cdk.api.services.ecs/execute-command-logging]] | `:logging` |"
  [stack id config]
  (let [builder (ExecuteCommandConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :log-configuration)]
      (. builder logConfiguration data))
    (when-let [data (execute-command-logging config id :logging)]
      (. builder logging data))
    (.build builder)))


(defn execute-command-log-configuration-builder
  "The execute-command-log-configuration-builder function buildes out new instances of 
ExecuteCommandLogConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-enabled` |
| `cloudWatchLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group` |
| `s3Bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3EncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-encryption-enabled` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (ExecuteCommandLogConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-encryption-enabled)]
      (. builder cloudWatchEncryptionEnabled data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group)]
      (. builder cloudWatchLogGroup data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-encryption-enabled)]
      (. builder s3EncryptionEnabled data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn external-service-attributes-builder
  "The external-service-attributes-builder function buildes out new instances of 
ExternalServiceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (ExternalServiceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn external-service-builder
  "The external-service-builder function buildes out new instances of 
ExternalService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (ExternalService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn external-service-props-builder
  "The external-service-props-builder function buildes out new instances of 
ExternalServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |"
  [stack id config]
  (let [builder (ExternalServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (.build builder)))


(defn external-task-definition-attributes-builder
  "The external-task-definition-attributes-builder function buildes out new instances of 
ExternalTaskDefinitionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (ExternalTaskDefinitionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn external-task-definition-builder
  "The external-task-definition-builder function buildes out new instances of 
ExternalTaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (ExternalTaskDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn external-task-definition-props-builder
  "The external-task-definition-props-builder function buildes out new instances of 
ExternalTaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (ExternalTaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn fargate-service-attributes-builder
  "The fargate-service-attributes-builder function buildes out new instances of 
FargateServiceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (FargateServiceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn fargate-service-builder
  "The fargate-service-builder function buildes out new instances of 
FargateService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn fargate-service-props-builder
  "The fargate-service-props-builder function buildes out new instances of 
FargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentAlarms` | software.amazon.awscdk.services.ecs.DeploymentAlarmConfig | [[cdk.support/lookup-entry]] | `:deployment-alarms` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceConnectConfiguration` | software.amazon.awscdk.services.ecs.ServiceConnectProps | [[cdk.support/lookup-entry]] | `:service-connect-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskDefinitionRevision` | software.amazon.awscdk.services.ecs.TaskDefinitionRevision | [[cdk.support/lookup-entry]] | `:task-definition-revision` |
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (FargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-alarms)]
      (. builder deploymentAlarms data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-connect-configuration)]
      (. builder serviceConnectConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-definition-revision)]
      (. builder taskDefinitionRevision data))
    (when-let [data (lookup-entry config id :volume-configurations)]
      (. builder volumeConfigurations data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn fargate-task-definition-attributes-builder
  "The fargate-task-definition-attributes-builder function buildes out new instances of 
FargateTaskDefinitionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (FargateTaskDefinitionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn fargate-task-definition-builder
  "The fargate-task-definition-builder function buildes out new instances of 
FargateTaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (FargateTaskDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn fargate-task-definition-props-builder
  "The fargate-task-definition-props-builder function buildes out new instances of 
FargateTaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (FargateTaskDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn fire-lens-log-driver-builder
  "The fire-lens-log-driver-builder function buildes out new instances of 
FireLensLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (FireLensLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn fire-lens-log-driver-props-builder
  "The fire-lens-log-driver-props-builder function buildes out new instances of 
FireLensLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (FireLensLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn firelens-config-builder
  "The firelens-config-builder function buildes out new instances of 
FirelensConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | software.amazon.awscdk.services.ecs.FirelensOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.ecs.FirelensLogRouterType | [[cdk.api.services.ecs/firelens-log-router-type]] | `:type` |"
  [stack id config]
  (let [builder (FirelensConfig$Builder.)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (firelens-log-router-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn firelens-log-router-builder
  "The firelens-log-router-builder function buildes out new instances of 
FirelensLogRouter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `firelensConfig` | software.amazon.awscdk.services.ecs.FirelensConfig | [[cdk.support/lookup-entry]] | `:firelens-config` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (FirelensLogRouter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :firelens-config)]
      (. builder firelensConfig data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn firelens-log-router-definition-options-builder
  "The firelens-log-router-definition-options-builder function buildes out new instances of 
FirelensLogRouterDefinitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `firelensConfig` | software.amazon.awscdk.services.ecs.FirelensConfig | [[cdk.support/lookup-entry]] | `:firelens-config` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (FirelensLogRouterDefinitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :firelens-config)]
      (. builder firelensConfig data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn firelens-log-router-props-builder
  "The firelens-log-router-props-builder function buildes out new instances of 
FirelensLogRouterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `credentialSpecs` | java.util.List | [[cdk.support/lookup-entry]] | `:credential-specs` |
| `disableNetworking` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-networking` |
| `dnsSearchDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-search-domains` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `dockerSecurityOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-security-options` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `extraHosts` | java.util.Map | [[cdk.support/lookup-entry]] | `:extra-hosts` |
| `firelensConfig` | software.amazon.awscdk.services.ecs.FirelensConfig | [[cdk.support/lookup-entry]] | `:firelens-config` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `inferenceAcceleratorResources` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerator-resources` |
| `interactive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:interactive` |
| `linuxParameters` | software.amazon.awscdk.services.ecs.LinuxParameters | [[cdk.support/lookup-entry]] | `:linux-parameters` |
| `logging` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:logging` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `portMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:port-mappings` |
| `privileged` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:privileged` |
| `pseudoTerminal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pseudo-terminal` |
| `readonlyRootFilesystem` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:readonly-root-filesystem` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `startTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-timeout` |
| `stopTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:stop-timeout` |
| `systemControls` | java.util.List | [[cdk.support/lookup-entry]] | `:system-controls` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `ulimits` | java.util.List | [[cdk.support/lookup-entry]] | `:ulimits` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (FirelensLogRouterProps$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :credential-specs)]
      (. builder credentialSpecs data))
    (when-let [data (lookup-entry config id :disable-networking)]
      (. builder disableNetworking data))
    (when-let [data (lookup-entry config id :dns-search-domains)]
      (. builder dnsSearchDomains data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :docker-security-options)]
      (. builder dockerSecurityOptions data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :extra-hosts)]
      (. builder extraHosts data))
    (when-let [data (lookup-entry config id :firelens-config)]
      (. builder firelensConfig data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :inference-accelerator-resources)]
      (. builder inferenceAcceleratorResources data))
    (when-let [data (lookup-entry config id :interactive)]
      (. builder interactive data))
    (when-let [data (lookup-entry config id :linux-parameters)]
      (. builder linuxParameters data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :port-mappings)]
      (. builder portMappings data))
    (when-let [data (lookup-entry config id :privileged)]
      (. builder privileged data))
    (when-let [data (lookup-entry config id :pseudo-terminal)]
      (. builder pseudoTerminal data))
    (when-let [data (lookup-entry config id :readonly-root-filesystem)]
      (. builder readonlyRootFilesystem data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :start-timeout)]
      (. builder startTimeout data))
    (when-let [data (lookup-entry config id :stop-timeout)]
      (. builder stopTimeout data))
    (when-let [data (lookup-entry config id :system-controls)]
      (. builder systemControls data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :ulimits)]
      (. builder ulimits data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn firelens-options-builder
  "The firelens-options-builder function buildes out new instances of 
FirelensOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFileType` | software.amazon.awscdk.services.ecs.FirelensConfigFileType | [[cdk.api.services.ecs/firelens-config-file-type]] | `:config-file-type` |
| `configFileValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file-value` |
| `enableEcsLogMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-log-metadata` |"
  [stack id config]
  (let [builder (FirelensOptions$Builder.)]
    (when-let [data (firelens-config-file-type config id :config-file-type)]
      (. builder configFileType data))
    (when-let [data (lookup-entry config id :config-file-value)]
      (. builder configFileValue data))
    (when-let [data (lookup-entry config id :enable-ecs-log-metadata)]
      (. builder enableEcsLogMetadata data))
    (.build builder)))


(defn fluentd-log-driver-builder
  "The fluentd-log-driver-builder function buildes out new instances of 
FluentdLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `asyncConnect` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:async-connect` |
| `bufferLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buffer-limit` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `retryWait` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-wait` |
| `subSecondPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sub-second-precision` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (FluentdLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :async-connect)]
      (. builder asyncConnect data))
    (when-let [data (lookup-entry config id :buffer-limit)]
      (. builder bufferLimit data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :retry-wait)]
      (. builder retryWait data))
    (when-let [data (lookup-entry config id :sub-second-precision)]
      (. builder subSecondPrecision data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn fluentd-log-driver-props-builder
  "The fluentd-log-driver-props-builder function buildes out new instances of 
FluentdLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `asyncConnect` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:async-connect` |
| `bufferLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:buffer-limit` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `retryWait` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retry-wait` |
| `subSecondPrecision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sub-second-precision` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (FluentdLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :async-connect)]
      (. builder asyncConnect data))
    (when-let [data (lookup-entry config id :buffer-limit)]
      (. builder bufferLimit data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :max-retries)]
      (. builder maxRetries data))
    (when-let [data (lookup-entry config id :retry-wait)]
      (. builder retryWait data))
    (when-let [data (lookup-entry config id :sub-second-precision)]
      (. builder subSecondPrecision data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn gelf-log-driver-builder
  "The gelf-log-driver-builder function buildes out new instances of 
GelfLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `compressionLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compression-level` |
| `compressionType` | software.amazon.awscdk.services.ecs.GelfCompressionType | [[cdk.api.services.ecs/gelf-compression-type]] | `:compression-type` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tcpMaxReconnect` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tcp-max-reconnect` |
| `tcpReconnectDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tcp-reconnect-delay` |"
  [stack id config]
  (let [builder (GelfLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :compression-level)]
      (. builder compressionLevel data))
    (when-let [data (gelf-compression-type config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :tcp-max-reconnect)]
      (. builder tcpMaxReconnect data))
    (when-let [data (lookup-entry config id :tcp-reconnect-delay)]
      (. builder tcpReconnectDelay data))
    (.build builder)))


(defn gelf-log-driver-props-builder
  "The gelf-log-driver-props-builder function buildes out new instances of 
GelfLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `compressionLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compression-level` |
| `compressionType` | software.amazon.awscdk.services.ecs.GelfCompressionType | [[cdk.api.services.ecs/gelf-compression-type]] | `:compression-type` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tcpMaxReconnect` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tcp-max-reconnect` |
| `tcpReconnectDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tcp-reconnect-delay` |"
  [stack id config]
  (let [builder (GelfLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :compression-level)]
      (. builder compressionLevel data))
    (when-let [data (gelf-compression-type config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :tcp-max-reconnect)]
      (. builder tcpMaxReconnect data))
    (when-let [data (lookup-entry config id :tcp-reconnect-delay)]
      (. builder tcpReconnectDelay data))
    (.build builder)))


(defn generic-log-driver-builder
  "The generic-log-driver-builder function buildes out new instances of 
GenericLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (GenericLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn generic-log-driver-props-builder
  "The generic-log-driver-props-builder function buildes out new instances of 
GenericLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (GenericLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn health-check-builder
  "The health-check-builder function buildes out new instances of 
HealthCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (HealthCheck$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :retries)]
      (. builder retries data))
    (when-let [data (lookup-entry config id :start-period)]
      (. builder startPeriod data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn host-builder
  "The host-builder function buildes out new instances of 
Host$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (Host$Builder.)]
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn inference-accelerator-builder
  "The inference-accelerator-builder function buildes out new instances of 
InferenceAccelerator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |"
  [stack id config]
  (let [builder (InferenceAccelerator$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :device-type)]
      (. builder deviceType data))
    (.build builder)))


(defn journald-log-driver-builder
  "The journald-log-driver-builder function buildes out new instances of 
JournaldLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (JournaldLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn journald-log-driver-props-builder
  "The journald-log-driver-props-builder function buildes out new instances of 
JournaldLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (JournaldLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn json-file-log-driver-builder
  "The json-file-log-driver-builder function buildes out new instances of 
JsonFileLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxFile` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (JsonFileLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :max-file)]
      (. builder maxFile data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn json-file-log-driver-props-builder
  "The json-file-log-driver-props-builder function buildes out new instances of 
JsonFileLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxFile` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |"
  [stack id config]
  (let [builder (JsonFileLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :max-file)]
      (. builder maxFile data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (.build builder)))


(defn linux-parameters-builder
  "The linux-parameters-builder function buildes out new instances of 
LinuxParameters$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
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
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
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


(defn load-balancer-target-options-builder
  "The load-balancer-target-options-builder function buildes out new instances of 
LoadBalancerTargetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (LoadBalancerTargetOptions$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn log-driver-config-builder
  "The log-driver-config-builder function buildes out new instances of 
LogDriverConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |"
  [stack id config]
  (let [builder (LogDriverConfig$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :secret-options)]
      (. builder secretOptions data))
    (.build builder)))


(defn memory-utilization-scaling-props-builder
  "The memory-utilization-scaling-props-builder function buildes out new instances of 
MemoryUtilizationScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |"
  [stack id config]
  (let [builder (MemoryUtilizationScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-utilization-percent)]
      (. builder targetUtilizationPercent data))
    (.build builder)))


(defn mount-point-builder
  "The mount-point-builder function buildes out new instances of 
MountPoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |"
  [stack id config]
  (let [builder (MountPoint$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-volume)]
      (. builder sourceVolume data))
    (.build builder)))


(defn port-map-builder
  "The port-map-builder function buildes out new instances of 
PortMap$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config ^software.amazon.awscdk.services.ecs.NetworkMode network-mode]
  (let [builder (PortMap$Builder/create ^software.amazon.awscdk.services.ecs.NetworkMode network-mode)]
    (when-let [data (lookup-entry config id :app-protocol)]
      (. builder appProtocol data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :container-port-range)]
      (. builder containerPortRange data))
    (when-let [data (lookup-entry config id :host-port)]
      (. builder hostPort data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn port-mapping-builder
  "The port-mapping-builder function buildes out new instances of 
PortMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (PortMapping$Builder.)]
    (when-let [data (lookup-entry config id :app-protocol)]
      (. builder appProtocol data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :container-port-range)]
      (. builder containerPortRange data))
    (when-let [data (lookup-entry config id :host-port)]
      (. builder hostPort data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn repository-image-builder
  "The repository-image-builder function buildes out new instances of 
RepositoryImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:credentials` |"
  [stack id config ^java.lang.String image-name]
  (let [builder (RepositoryImage$Builder/create ^java.lang.String image-name)]
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (.build builder)))


(defn repository-image-props-builder
  "The repository-image-props-builder function buildes out new instances of 
RepositoryImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:credentials` |"
  [stack id config]
  (let [builder (RepositoryImageProps$Builder.)]
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (.build builder)))


(defn request-count-scaling-props-builder
  "The request-count-scaling-props-builder function buildes out new instances of 
RequestCountScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `requestsPerTarget` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requests-per-target` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |"
  [stack id config]
  (let [builder (RequestCountScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :requests-per-target)]
      (. builder requestsPerTarget data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-group)]
      (. builder targetGroup data))
    (.build builder)))


(defn runtime-platform-builder
  "The runtime-platform-builder function buildes out new instances of 
RuntimePlatform$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | software.amazon.awscdk.services.ecs.CpuArchitecture | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | software.amazon.awscdk.services.ecs.OperatingSystemFamily | [[cdk.support/lookup-entry]] | `:operating-system-family` |"
  [stack id config]
  (let [builder (RuntimePlatform$Builder.)]
    (when-let [data (lookup-entry config id :cpu-architecture)]
      (. builder cpuArchitecture data))
    (when-let [data (lookup-entry config id :operating-system-family)]
      (. builder operatingSystemFamily data))
    (.build builder)))


(defn scalable-task-count-builder
  "The scalable-task-count-builder function buildes out new instances of 
ScalableTaskCount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |"
  [stack id config]
  (let [builder (ScalableTaskCount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dimension)]
      (. builder dimension data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (service-namespace config id :service-namespace)]
      (. builder serviceNamespace data))
    (.build builder)))


(defn scalable-task-count-props-builder
  "The scalable-task-count-props-builder function buildes out new instances of 
ScalableTaskCountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |"
  [stack id config]
  (let [builder (ScalableTaskCountProps$Builder.)]
    (when-let [data (lookup-entry config id :dimension)]
      (. builder dimension data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (service-namespace config id :service-namespace)]
      (. builder serviceNamespace data))
    (.build builder)))


(defn scratch-space-builder
  "The scratch-space-builder function buildes out new instances of 
ScratchSpace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (ScratchSpace$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
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


(defn service-connect-builder
  "The service-connect-builder function buildes out new instances of 
ServiceConnect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config ^software.amazon.awscdk.services.ecs.NetworkMode network-mode]
  (let [builder (ServiceConnect$Builder/create ^software.amazon.awscdk.services.ecs.NetworkMode network-mode)]
    (when-let [data (lookup-entry config id :app-protocol)]
      (. builder appProtocol data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :container-port-range)]
      (. builder containerPortRange data))
    (when-let [data (lookup-entry config id :host-port)]
      (. builder hostPort data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn service-connect-props-builder
  "The service-connect-props-builder function buildes out new instances of 
ServiceConnectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `services` | java.util.List | [[cdk.support/lookup-entry]] | `:services` |"
  [stack id config]
  (let [builder (ServiceConnectProps$Builder.)]
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :services)]
      (. builder services data))
    (.build builder)))


(defn service-connect-service-builder
  "The service-connect-service-builder function buildes out new instances of 
ServiceConnectService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `discoveryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `ingressPortOverride` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingress-port-override` |
| `perRequestTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request-timeout` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `portMappingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:port-mapping-name` |"
  [stack id config]
  (let [builder (ServiceConnectService$Builder.)]
    (when-let [data (lookup-entry config id :discovery-name)]
      (. builder discoveryName data))
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :ingress-port-override)]
      (. builder ingressPortOverride data))
    (when-let [data (lookup-entry config id :per-request-timeout)]
      (. builder perRequestTimeout data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :port-mapping-name)]
      (. builder portMappingName data))
    (.build builder)))


(defn service-managed-ebs-volume-configuration-builder
  "The service-managed-ebs-volume-configuration-builder function buildes out new instances of 
ServiceManagedEBSVolumeConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `fileSystemType` | software.amazon.awscdk.services.ecs.FileSystemType | [[cdk.api.services.ecs/file-system-type]] | `:file-system-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `size` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size` |
| `snapShotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snap-shot-id` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (ServiceManagedEBSVolumeConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (file-system-type config id :file-system-type)]
      (. builder fileSystemType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :snap-shot-id)]
      (. builder snapShotId data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn service-managed-volume-builder
  "The service-managed-volume-builder function buildes out new instances of 
ServiceManagedVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ServiceManagedVolume$Builder/create stack id)]
    (when-let [data (lookup-entry config id :managed-ebs-volume)]
      (. builder managedEbsVolume data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn service-managed-volume-props-builder
  "The service-managed-volume-props-builder function buildes out new instances of 
ServiceManagedVolumeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ServiceManagedVolumeProps$Builder.)]
    (when-let [data (lookup-entry config id :managed-ebs-volume)]
      (. builder managedEbsVolume data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn splunk-log-driver-builder
  "The splunk-log-driver-builder function buildes out new instances of 
SplunkLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-name` |
| `caPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-path` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `format` | software.amazon.awscdk.services.ecs.SplunkLogFormat | [[cdk.api.services.ecs/splunk-log-format]] | `:format` |
| `gzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:gzip` |
| `gzipLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gzip-level` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `insecureSkipVerify` | java.lang.String | [[cdk.support/lookup-entry]] | `:insecure-skip-verify` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `secretToken` | software.amazon.awscdk.services.ecs.Secret | [[cdk.support/lookup-entry]] | `:secret-token` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `verifyConnection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verify-connection` |"
  [stack id config]
  (let [builder (SplunkLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :ca-name)]
      (. builder caName data))
    (when-let [data (lookup-entry config id :ca-path)]
      (. builder caPath data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (splunk-log-format config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :gzip)]
      (. builder gzip data))
    (when-let [data (lookup-entry config id :gzip-level)]
      (. builder gzipLevel data))
    (when-let [data (lookup-entry config id :index)]
      (. builder index data))
    (when-let [data (lookup-entry config id :insecure-skip-verify)]
      (. builder insecureSkipVerify data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :secret-token)]
      (. builder secretToken data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (when-let [data (lookup-entry config id :verify-connection)]
      (. builder verifyConnection data))
    (.build builder)))


(defn splunk-log-driver-props-builder
  "The splunk-log-driver-props-builder function buildes out new instances of 
SplunkLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-name` |
| `caPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-path` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `format` | software.amazon.awscdk.services.ecs.SplunkLogFormat | [[cdk.api.services.ecs/splunk-log-format]] | `:format` |
| `gzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:gzip` |
| `gzipLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gzip-level` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `insecureSkipVerify` | java.lang.String | [[cdk.support/lookup-entry]] | `:insecure-skip-verify` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `secretToken` | software.amazon.awscdk.services.ecs.Secret | [[cdk.support/lookup-entry]] | `:secret-token` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `verifyConnection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verify-connection` |"
  [stack id config]
  (let [builder (SplunkLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :ca-name)]
      (. builder caName data))
    (when-let [data (lookup-entry config id :ca-path)]
      (. builder caPath data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (splunk-log-format config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :gzip)]
      (. builder gzip data))
    (when-let [data (lookup-entry config id :gzip-level)]
      (. builder gzipLevel data))
    (when-let [data (lookup-entry config id :index)]
      (. builder index data))
    (when-let [data (lookup-entry config id :insecure-skip-verify)]
      (. builder insecureSkipVerify data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :secret-token)]
      (. builder secretToken data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (when-let [data (lookup-entry config id :verify-connection)]
      (. builder verifyConnection data))
    (.build builder)))


(defn syslog-log-driver-builder
  "The syslog-log-driver-builder function buildes out new instances of 
SyslogLogDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `facility` | java.lang.String | [[cdk.support/lookup-entry]] | `:facility` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tlsCaCert` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-ca-cert` |
| `tlsCert` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-cert` |
| `tlsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-key` |
| `tlsSkipVerify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-skip-verify` |"
  [stack id config]
  (let [builder (SyslogLogDriver$Builder/create)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :facility)]
      (. builder facility data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :tls-ca-cert)]
      (. builder tlsCaCert data))
    (when-let [data (lookup-entry config id :tls-cert)]
      (. builder tlsCert data))
    (when-let [data (lookup-entry config id :tls-key)]
      (. builder tlsKey data))
    (when-let [data (lookup-entry config id :tls-skip-verify)]
      (. builder tlsSkipVerify data))
    (.build builder)))


(defn syslog-log-driver-props-builder
  "The syslog-log-driver-props-builder function buildes out new instances of 
SyslogLogDriverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `facility` | java.lang.String | [[cdk.support/lookup-entry]] | `:facility` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
| `tlsCaCert` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-ca-cert` |
| `tlsCert` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-cert` |
| `tlsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-key` |
| `tlsSkipVerify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-skip-verify` |"
  [stack id config]
  (let [builder (SyslogLogDriverProps$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :env-regex)]
      (. builder envRegex data))
    (when-let [data (lookup-entry config id :facility)]
      (. builder facility data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :labels)]
      (. builder labels data))
    (when-let [data (lookup-entry config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :tls-ca-cert)]
      (. builder tlsCaCert data))
    (when-let [data (lookup-entry config id :tls-cert)]
      (. builder tlsCert data))
    (when-let [data (lookup-entry config id :tls-key)]
      (. builder tlsKey data))
    (when-let [data (lookup-entry config id :tls-skip-verify)]
      (. builder tlsSkipVerify data))
    (.build builder)))


(defn system-control-builder
  "The system-control-builder function buildes out new instances of 
SystemControl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (SystemControl$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn task-definition-attributes-builder
  "The task-definition-attributes-builder function buildes out new instances of 
TaskDefinitionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibility` | software.amazon.awscdk.services.ecs.Compatibility | [[cdk.api.services.ecs/compatibility]] | `:compatibility` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (TaskDefinitionAttributes$Builder.)]
    (when-let [data (compatibility config id :compatibility)]
      (. builder compatibility data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :task-definition-arn)]
      (. builder taskDefinitionArn data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn task-definition-builder
  "The task-definition-builder function buildes out new instances of 
TaskDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibility` | software.amazon.awscdk.services.ecs.Compatibility | [[cdk.api.services.ecs/compatibility]] | `:compatibility` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | software.amazon.awscdk.services.ecs.IpcMode | [[cdk.api.services.ecs/ipc-mode]] | `:ipc-mode` |
| `memoryMiB` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (TaskDefinition$Builder/create stack id)]
    (when-let [data (compatibility config id :compatibility)]
      (. builder compatibility data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (ipc-mode config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn task-definition-props-builder
  "The task-definition-props-builder function buildes out new instances of 
TaskDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibility` | software.amazon.awscdk.services.ecs.Compatibility | [[cdk.api.services.ecs/compatibility]] | `:compatibility` |
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `inferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:inference-accelerators` |
| `ipcMode` | software.amazon.awscdk.services.ecs.IpcMode | [[cdk.api.services.ecs/ipc-mode]] | `:ipc-mode` |
| `memoryMiB` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `pidMode` | software.amazon.awscdk.services.ecs.PidMode | [[cdk.api.services.ecs/pid-mode]] | `:pid-mode` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (TaskDefinitionProps$Builder.)]
    (when-let [data (compatibility config id :compatibility)]
      (. builder compatibility data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :inference-accelerators)]
      (. builder inferenceAccelerators data))
    (when-let [data (ipc-mode config id :ipc-mode)]
      (. builder ipcMode data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (network-mode config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (pid-mode config id :pid-mode)]
      (. builder pidMode data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :proxy-configuration)]
      (. builder proxyConfiguration data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn tmpfs-builder
  "The tmpfs-builder function buildes out new instances of 
Tmpfs$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |"
  [stack id config]
  (let [builder (Tmpfs$Builder.)]
    (when-let [data (lookup-entry config id :container-path)]
      (. builder containerPath data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (.build builder)))


(defn track-custom-metric-props-builder
  "The track-custom-metric-props-builder function buildes out new instances of 
TrackCustomMetricProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (TrackCustomMetricProps$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn ulimit-builder
  "The ulimit-builder function buildes out new instances of 
Ulimit$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | software.amazon.awscdk.services.ecs.UlimitName | [[cdk.api.services.ecs/ulimit-name]] | `:name` |
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


(defn volume-builder
  "The volume-builder function buildes out new instances of 
Volume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredAtLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configured-at-launch` |
| `dockerVolumeConfiguration` | software.amazon.awscdk.services.ecs.DockerVolumeConfiguration | [[cdk.support/lookup-entry]] | `:docker-volume-configuration` |
| `efsVolumeConfiguration` | software.amazon.awscdk.services.ecs.EfsVolumeConfiguration | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `host` | software.amazon.awscdk.services.ecs.Host | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (Volume$Builder.)]
    (when-let [data (lookup-entry config id :configured-at-launch)]
      (. builder configuredAtLaunch data))
    (when-let [data (lookup-entry config id :docker-volume-configuration)]
      (. builder dockerVolumeConfiguration data))
    (when-let [data (lookup-entry config id :efs-volume-configuration)]
      (. builder efsVolumeConfiguration data))
    (when-let [data (lookup-entry config id :host)]
      (. builder host data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn volume-from-builder
  "The volume-from-builder function buildes out new instances of 
VolumeFrom$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceContainer` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-container` |"
  [stack id config]
  (let [builder (VolumeFrom$Builder.)]
    (when-let [data (lookup-entry config id :read-only)]
      (. builder readOnly data))
    (when-let [data (lookup-entry config id :source-container)]
      (. builder sourceContainer data))
    (.build builder)))