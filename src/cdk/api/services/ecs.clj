(ns cdk.api.services.ecs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]]
            [cdk.api.services.applicationautoscaling :refer [service-namespace]]
            [cdk.api.services.autoscaling :refer [monitoring]]
            [cdk.api.services.ec2 :refer [ebs-device-volume-type
                                          instance-architecture]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.api.services.servicediscovery :refer [dns-record-type
                                                       namespace-type]]
            [cdk.support :refer [lookup-entry]])
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


(defn build-add-auto-scaling-group-capacity-options-builder
  "The build-add-auto-scaling-group-capacity-options-builder function updates a AddAutoScalingGroupCapacityOptions$Builder instance using the provided configuration.
  The function takes the AddAutoScalingGroupCapacityOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canContainersAccessInstanceRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:can-containers-access-instance-role` |
| `machineImageType` | software.amazon.awscdk.services.ecs.MachineImageType | [[cdk.api.services.ecs/machine-image-type]] | `:machine-image-type` |
| `spotInstanceDraining` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:spot-instance-draining` |
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |
"
  [^AddAutoScalingGroupCapacityOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :can-containers-access-instance-role)]
    (. builder canContainersAccessInstanceRole data))
  (when-let [data (machine-image-type config id :machine-image-type)]
    (. builder machineImageType data))
  (when-let [data (lookup-entry config id :spot-instance-draining)]
    (. builder spotInstanceDraining data))
  (when-let [data (lookup-entry config id :topic-encryption-key)]
    (. builder topicEncryptionKey data))
  (.build builder))


(defn add-auto-scaling-group-capacity-options-builder
  ""
  [id config]
  (build-add-auto-scaling-group-capacity-options-builder (new AddAutoScalingGroupCapacityOptions$Builder) id config))


(defn build-add-capacity-options-builder
  "The build-add-capacity-options-builder function updates a AddCapacityOptions$Builder instance using the provided configuration.
  The function takes the AddCapacityOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^AddCapacityOptions$Builder builder id config]
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
  (.build builder))


(defn add-capacity-options-builder
  ""
  [id config]
  (build-add-capacity-options-builder (new AddCapacityOptions$Builder) id config))


(defn build-app-mesh-proxy-configuration-builder
  "The build-app-mesh-proxy-configuration-builder function updates a AppMeshProxyConfiguration$Builder instance using the provided configuration.
  The function takes the AppMeshProxyConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `properties` | software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps | [[cdk.support/lookup-entry]] | `:properties` |
"
  [^AppMeshProxyConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (.build builder))


(defn app-mesh-proxy-configuration-builder
  ""
  [id config]
  (build-app-mesh-proxy-configuration-builder (AppMeshProxyConfiguration$Builder/create) id config))


(defn build-app-mesh-proxy-configuration-config-props-builder
  "The build-app-mesh-proxy-configuration-config-props-builder function updates a AppMeshProxyConfigurationConfigProps$Builder instance using the provided configuration.
  The function takes the AppMeshProxyConfigurationConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `properties` | software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps | [[cdk.support/lookup-entry]] | `:properties` |
"
  [^AppMeshProxyConfigurationConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (.build builder))


(defn app-mesh-proxy-configuration-config-props-builder
  ""
  [id config]
  (build-app-mesh-proxy-configuration-config-props-builder (new AppMeshProxyConfigurationConfigProps$Builder) id config))


(defn build-app-mesh-proxy-configuration-props-builder
  "The build-app-mesh-proxy-configuration-props-builder function updates a AppMeshProxyConfigurationProps$Builder instance using the provided configuration.
  The function takes the AppMeshProxyConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:app-ports` |
| `egressIgnoredIPs` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-ignored-i-ps` |
| `egressIgnoredPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-ignored-ports` |
| `ignoredGid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignored-gid` |
| `ignoredUid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignored-uid` |
| `proxyEgressPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proxy-egress-port` |
| `proxyIngressPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:proxy-ingress-port` |
"
  [^AppMeshProxyConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn app-mesh-proxy-configuration-props-builder
  ""
  [id config]
  (build-app-mesh-proxy-configuration-props-builder (new AppMeshProxyConfigurationProps$Builder) id config))


(defn build-asg-capacity-provider-builder
  "The build-asg-capacity-provider-builder function updates a AsgCapacityProvider$Builder instance using the provided configuration.
  The function takes the AsgCapacityProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |
"
  [^AsgCapacityProvider$Builder builder id config]
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
  (.build builder))


(defn asg-capacity-provider-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-asg-capacity-provider-builder (AsgCapacityProvider$Builder/create scope (name id)) id config))


(defn build-asg-capacity-provider-props-builder
  "The build-asg-capacity-provider-props-builder function updates a AsgCapacityProviderProps$Builder instance using the provided configuration.
  The function takes the AsgCapacityProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `topicEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:topic-encryption-key` |
"
  [^AsgCapacityProviderProps$Builder builder id config]
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
  (.build builder))


(defn asg-capacity-provider-props-builder
  ""
  [id config]
  (build-asg-capacity-provider-props-builder (new AsgCapacityProviderProps$Builder) id config))


(defn build-asset-environment-file-builder
  "The build-asset-environment-file-builder function updates a AssetEnvironmentFile$Builder instance using the provided configuration.
  The function takes the AssetEnvironmentFile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^AssetEnvironmentFile$Builder builder id config]
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
  (.build builder))


(defn build-asset-image-builder
  "The build-asset-image-builder function updates a AssetImage$Builder instance using the provided configuration.
  The function takes the AssetImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^AssetImage$Builder builder id config]
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
  (.build builder))


(defn build-asset-image-props-builder
  "The build-asset-image-props-builder function updates a AssetImageProps$Builder instance using the provided configuration.
  The function takes the AssetImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^AssetImageProps$Builder builder id config]
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
  (.build builder))


(defn asset-image-props-builder
  ""
  [id config]
  (build-asset-image-props-builder (new AssetImageProps$Builder) id config))


(defn build-associate-cloud-map-service-options-builder
  "The build-associate-cloud-map-service-options-builder function updates a AssociateCloudMapServiceOptions$Builder instance using the provided configuration.
  The function takes the AssociateCloudMapServiceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AssociateCloudMapServiceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :container)]
    (. builder container data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn associate-cloud-map-service-options-builder
  ""
  [id config]
  (build-associate-cloud-map-service-options-builder (new AssociateCloudMapServiceOptions$Builder) id config))


(defn build-authorization-config-builder
  "The build-authorization-config-builder function updates a AuthorizationConfig$Builder instance using the provided configuration.
  The function takes the AuthorizationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |
"
  [^AuthorizationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-let [data (lookup-entry config id :iam)]
    (. builder iam data))
  (.build builder))


(defn authorization-config-builder
  ""
  [id config]
  (build-authorization-config-builder (new AuthorizationConfig$Builder) id config))


(defn build-aws-log-driver-builder
  "The build-aws-log-driver-builder function updates a AwsLogDriver$Builder instance using the provided configuration.
  The function takes the AwsLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `maxBufferSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-buffer-size` |
| `mode` | software.amazon.awscdk.services.ecs.AwsLogDriverMode | [[cdk.api.services.ecs/aws-log-driver-mode]] | `:mode` |
| `multilinePattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiline-pattern` |
| `streamPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-prefix` |
"
  [^AwsLogDriver$Builder builder id config]
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
  (.build builder))


(defn aws-log-driver-builder
  ""
  [id config]
  (build-aws-log-driver-builder (AwsLogDriver$Builder/create) id config))


(defn build-aws-log-driver-props-builder
  "The build-aws-log-driver-props-builder function updates a AwsLogDriverProps$Builder instance using the provided configuration.
  The function takes the AwsLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datetimeFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:datetime-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `maxBufferSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-buffer-size` |
| `mode` | software.amazon.awscdk.services.ecs.AwsLogDriverMode | [[cdk.api.services.ecs/aws-log-driver-mode]] | `:mode` |
| `multilinePattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:multiline-pattern` |
| `streamPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-prefix` |
"
  [^AwsLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn aws-log-driver-props-builder
  ""
  [id config]
  (build-aws-log-driver-props-builder (new AwsLogDriverProps$Builder) id config))


(defn build-base-log-driver-props-builder
  "The build-base-log-driver-props-builder function updates a BaseLogDriverProps$Builder instance using the provided configuration.
  The function takes the BaseLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^BaseLogDriverProps$Builder builder id config]
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-regex)]
    (. builder envRegex data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (.build builder))


(defn base-log-driver-props-builder
  ""
  [id config]
  (build-base-log-driver-props-builder (new BaseLogDriverProps$Builder) id config))


(defn build-base-mount-point-builder
  "The build-base-mount-point-builder function updates a BaseMountPoint$Builder instance using the provided configuration.
  The function takes the BaseMountPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
"
  [^BaseMountPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (.build builder))


(defn base-mount-point-builder
  ""
  [id config]
  (build-base-mount-point-builder (new BaseMountPoint$Builder) id config))


(defn build-base-service-options-builder
  "The build-base-service-options-builder function updates a BaseServiceOptions$Builder instance using the provided configuration.
  The function takes the BaseServiceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^BaseServiceOptions$Builder builder id config]
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
  (.build builder))


(defn base-service-options-builder
  ""
  [id config]
  (build-base-service-options-builder (new BaseServiceOptions$Builder) id config))


(defn build-base-service-props-builder
  "The build-base-service-props-builder function updates a BaseServiceProps$Builder instance using the provided configuration.
  The function takes the BaseServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^BaseServiceProps$Builder builder id config]
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
  (.build builder))


(defn base-service-props-builder
  ""
  [id config]
  (build-base-service-props-builder (new BaseServiceProps$Builder) id config))


(defn build-bottle-rocket-image-builder
  "The build-bottle-rocket-image-builder function updates a BottleRocketImage$Builder instance using the provided configuration.
  The function takes the BottleRocketImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.ec2.InstanceArchitecture | [[cdk.api.services.ec2/instance-architecture]] | `:architecture` |
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `variant` | software.amazon.awscdk.services.ecs.BottlerocketEcsVariant | [[cdk.api.services.ecs/bottlerocket-ecs-variant]] | `:variant` |
"
  [^BottleRocketImage$Builder builder id config]
  (when-let [data (instance-architecture config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :cached-in-context)]
    (. builder cachedInContext data))
  (when-let [data (bottlerocket-ecs-variant config id :variant)]
    (. builder variant data))
  (.build builder))


(defn bottle-rocket-image-builder
  ""
  [id config]
  (build-bottle-rocket-image-builder (BottleRocketImage$Builder/create) id config))


(defn build-bottle-rocket-image-props-builder
  "The build-bottle-rocket-image-props-builder function updates a BottleRocketImageProps$Builder instance using the provided configuration.
  The function takes the BottleRocketImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | software.amazon.awscdk.services.ec2.InstanceArchitecture | [[cdk.api.services.ec2/instance-architecture]] | `:architecture` |
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `variant` | software.amazon.awscdk.services.ecs.BottlerocketEcsVariant | [[cdk.api.services.ecs/bottlerocket-ecs-variant]] | `:variant` |
"
  [^BottleRocketImageProps$Builder builder id config]
  (when-let [data (instance-architecture config id :architecture)]
    (. builder architecture data))
  (when-let [data (lookup-entry config id :cached-in-context)]
    (. builder cachedInContext data))
  (when-let [data (bottlerocket-ecs-variant config id :variant)]
    (. builder variant data))
  (.build builder))


(defn bottle-rocket-image-props-builder
  ""
  [id config]
  (build-bottle-rocket-image-props-builder (new BottleRocketImageProps$Builder) id config))


(defn build-capacity-provider-strategy-builder
  "The build-capacity-provider-strategy-builder function updates a CapacityProviderStrategy$Builder instance using the provided configuration.
  The function takes the CapacityProviderStrategy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CapacityProviderStrategy$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn capacity-provider-strategy-builder
  ""
  [id config]
  (build-capacity-provider-strategy-builder (new CapacityProviderStrategy$Builder) id config))


(defn build-cfn-capacity-provider-auto-scaling-group-provider-property-builder
  "The build-cfn-capacity-provider-auto-scaling-group-provider-property-builder function updates a CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-group-arn` |
| `managedDraining` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-draining` |
| `managedScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-scaling` |
| `managedTerminationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-termination-protection` |
"
  [^CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-group-arn)]
    (. builder autoScalingGroupArn data))
  (when-let [data (lookup-entry config id :managed-draining)]
    (. builder managedDraining data))
  (when-let [data (lookup-entry config id :managed-scaling)]
    (. builder managedScaling data))
  (when-let [data (lookup-entry config id :managed-termination-protection)]
    (. builder managedTerminationProtection data))
  (.build builder))


(defn cfn-capacity-provider-auto-scaling-group-provider-property-builder
  ""
  [id config]
  (build-cfn-capacity-provider-auto-scaling-group-provider-property-builder (new CfnCapacityProvider$AutoScalingGroupProviderProperty$Builder) id config))


(defn build-cfn-capacity-provider-builder
  "The build-cfn-capacity-provider-builder function updates a CfnCapacityProvider$Builder instance using the provided configuration.
  The function takes the CfnCapacityProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-group-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCapacityProvider$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-group-provider)]
    (. builder autoScalingGroupProvider data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-capacity-provider-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-capacity-provider-builder (CfnCapacityProvider$Builder/create scope (name id)) id config))


(defn build-cfn-capacity-provider-managed-scaling-property-builder
  "The build-cfn-capacity-provider-managed-scaling-property-builder function updates a CfnCapacityProvider$ManagedScalingProperty$Builder instance using the provided configuration.
  The function takes the CfnCapacityProvider$ManagedScalingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceWarmupPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-warmup-period` |
| `maximumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-scaling-step-size` |
| `minimumScalingStepSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-scaling-step-size` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `targetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-capacity` |
"
  [^CfnCapacityProvider$ManagedScalingProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-capacity-provider-managed-scaling-property-builder
  ""
  [id config]
  (build-cfn-capacity-provider-managed-scaling-property-builder (new CfnCapacityProvider$ManagedScalingProperty$Builder) id config))


(defn build-cfn-capacity-provider-props-builder
  "The build-cfn-capacity-provider-props-builder function updates a CfnCapacityProviderProps$Builder instance using the provided configuration.
  The function takes the CfnCapacityProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingGroupProvider` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-group-provider` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCapacityProviderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-scaling-group-provider)]
    (. builder autoScalingGroupProvider data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-capacity-provider-props-builder
  ""
  [id config]
  (build-cfn-capacity-provider-props-builder (new CfnCapacityProviderProps$Builder) id config))


(defn build-cfn-cluster-builder
  "The build-cfn-cluster-builder function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `clusterSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-settings` |
| `configuration` | software.amazon.awscdk.services.ecs.CfnCluster$ClusterConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `defaultCapacityProviderStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
| `serviceConnectDefaults` | software.amazon.awscdk.services.ecs.CfnCluster$ServiceConnectDefaultsProperty | [[cdk.support/lookup-entry]] | `:service-connect-defaults` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCluster$Builder builder id config]
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
  (.build builder))


(defn cfn-cluster-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-cluster-builder (CfnCluster$Builder/create scope (name id)) id config))


(defn build-cfn-cluster-capacity-provider-associations-builder
  "The build-cfn-cluster-capacity-provider-associations-builder function updates a CfnClusterCapacityProviderAssociations$Builder instance using the provided configuration.
  The function takes the CfnClusterCapacityProviderAssociations$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `defaultCapacityProviderStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
"
  [^CfnClusterCapacityProviderAssociations$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-providers)]
    (. builder capacityProviders data))
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
    (. builder defaultCapacityProviderStrategy data))
  (.build builder))


(defn cfn-cluster-capacity-provider-associations-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-cluster-capacity-provider-associations-builder (CfnClusterCapacityProviderAssociations$Builder/create scope (name id)) id config))


(defn build-cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder
  "The build-cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder function updates a CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder
  ""
  [id config]
  (build-cfn-cluster-capacity-provider-associations-capacity-provider-strategy-property-builder (new CfnClusterCapacityProviderAssociations$CapacityProviderStrategyProperty$Builder) id config))


(defn build-cfn-cluster-capacity-provider-associations-props-builder
  "The build-cfn-cluster-capacity-provider-associations-props-builder function updates a CfnClusterCapacityProviderAssociationsProps$Builder instance using the provided configuration.
  The function takes the CfnClusterCapacityProviderAssociationsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `defaultCapacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
"
  [^CfnClusterCapacityProviderAssociationsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity-providers)]
    (. builder capacityProviders data))
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :default-capacity-provider-strategy)]
    (. builder defaultCapacityProviderStrategy data))
  (.build builder))


(defn cfn-cluster-capacity-provider-associations-props-builder
  ""
  [id config]
  (build-cfn-cluster-capacity-provider-associations-props-builder (new CfnClusterCapacityProviderAssociationsProps$Builder) id config))


(defn build-cfn-cluster-capacity-provider-strategy-item-property-builder
  "The build-cfn-cluster-capacity-provider-strategy-item-property-builder function updates a CfnCluster$CapacityProviderStrategyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$CapacityProviderStrategyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnCluster$CapacityProviderStrategyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-cluster-capacity-provider-strategy-item-property-builder
  ""
  [id config]
  (build-cfn-cluster-capacity-provider-strategy-item-property-builder (new CfnCluster$CapacityProviderStrategyItemProperty$Builder) id config))


(defn build-cfn-cluster-cluster-configuration-property-builder
  "The build-cfn-cluster-cluster-configuration-property-builder function updates a CfnCluster$ClusterConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ClusterConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeCommandConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
"
  [^CfnCluster$ClusterConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :execute-command-configuration)]
    (. builder executeCommandConfiguration data))
  (.build builder))


(defn cfn-cluster-cluster-configuration-property-builder
  ""
  [id config]
  (build-cfn-cluster-cluster-configuration-property-builder (new CfnCluster$ClusterConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-cluster-settings-property-builder
  "The build-cfn-cluster-cluster-settings-property-builder function updates a CfnCluster$ClusterSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ClusterSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCluster$ClusterSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-cluster-cluster-settings-property-builder
  ""
  [id config]
  (build-cfn-cluster-cluster-settings-property-builder (new CfnCluster$ClusterSettingsProperty$Builder) id config))


(defn build-cfn-cluster-execute-command-configuration-property-builder
  "The build-cfn-cluster-execute-command-configuration-property-builder function updates a CfnCluster$ExecuteCommandConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ExecuteCommandConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `logging` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging` |
"
  [^CfnCluster$ExecuteCommandConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (.build builder))


(defn cfn-cluster-execute-command-configuration-property-builder
  ""
  [id config]
  (build-cfn-cluster-execute-command-configuration-property-builder (new CfnCluster$ExecuteCommandConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-execute-command-log-configuration-property-builder
  "The build-cfn-cluster-execute-command-log-configuration-property-builder function updates a CfnCluster$ExecuteCommandLogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ExecuteCommandLogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-enabled` |
| `cloudWatchLogGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-name` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3EncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-encryption-enabled` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
"
  [^CfnCluster$ExecuteCommandLogConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-cluster-execute-command-log-configuration-property-builder
  ""
  [id config]
  (build-cfn-cluster-execute-command-log-configuration-property-builder (new CfnCluster$ExecuteCommandLogConfigurationProperty$Builder) id config))


(defn build-cfn-cluster-props-builder
  "The build-cfn-cluster-props-builder function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-providers` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `clusterSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-settings` |
| `configuration` | software.amazon.awscdk.services.ecs.CfnCluster$ClusterConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `defaultCapacityProviderStrategy` | java.util.List | [[cdk.support/lookup-entry]] | `:default-capacity-provider-strategy` |
| `serviceConnectDefaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-connect-defaults` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterProps$Builder builder id config]
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
  (.build builder))


(defn cfn-cluster-props-builder
  ""
  [id config]
  (build-cfn-cluster-props-builder (new CfnClusterProps$Builder) id config))


(defn build-cfn-cluster-service-connect-defaults-property-builder
  "The build-cfn-cluster-service-connect-defaults-property-builder function updates a CfnCluster$ServiceConnectDefaultsProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$ServiceConnectDefaultsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnCluster$ServiceConnectDefaultsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-cluster-service-connect-defaults-property-builder
  ""
  [id config]
  (build-cfn-cluster-service-connect-defaults-property-builder (new CfnCluster$ServiceConnectDefaultsProperty$Builder) id config))


(defn build-cfn-primary-task-set-builder
  "The build-cfn-primary-task-set-builder function updates a CfnPrimaryTaskSet$Builder instance using the provided configuration.
  The function takes the CfnPrimaryTaskSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `taskSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-set-id` |
"
  [^CfnPrimaryTaskSet$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (when-let [data (lookup-entry config id :task-set-id)]
    (. builder taskSetId data))
  (.build builder))


(defn cfn-primary-task-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-primary-task-set-builder (CfnPrimaryTaskSet$Builder/create scope (name id)) id config))


(defn build-cfn-primary-task-set-props-builder
  "The build-cfn-primary-task-set-props-builder function updates a CfnPrimaryTaskSetProps$Builder instance using the provided configuration.
  The function takes the CfnPrimaryTaskSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `taskSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-set-id` |
"
  [^CfnPrimaryTaskSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (when-let [data (lookup-entry config id :task-set-id)]
    (. builder taskSetId data))
  (.build builder))


(defn cfn-primary-task-set-props-builder
  ""
  [id config]
  (build-cfn-primary-task-set-props-builder (new CfnPrimaryTaskSetProps$Builder) id config))


(defn build-cfn-service-aws-vpc-configuration-property-builder
  "The build-cfn-service-aws-vpc-configuration-property-builder function updates a CfnService$AwsVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$AwsVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnService$AwsVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-service-aws-vpc-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-aws-vpc-configuration-property-builder (new CfnService$AwsVpcConfigurationProperty$Builder) id config))


(defn build-cfn-service-builder
  "The build-cfn-service-builder function updates a CfnService$Builder instance using the provided configuration.
  The function takes the CfnService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^CfnService$Builder builder id config]
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
  (.build builder))


(defn cfn-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-service-builder (CfnService$Builder/create scope (name id)) id config))


(defn build-cfn-service-capacity-provider-strategy-item-property-builder
  "The build-cfn-service-capacity-provider-strategy-item-property-builder function updates a CfnService$CapacityProviderStrategyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnService$CapacityProviderStrategyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base` |
| `capacityProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-provider` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnService$CapacityProviderStrategyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base)]
    (. builder base data))
  (when-let [data (lookup-entry config id :capacity-provider)]
    (. builder capacityProvider data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-service-capacity-provider-strategy-item-property-builder
  ""
  [id config]
  (build-cfn-service-capacity-provider-strategy-item-property-builder (new CfnService$CapacityProviderStrategyItemProperty$Builder) id config))


(defn build-cfn-service-deployment-alarms-property-builder
  "The build-cfn-service-deployment-alarms-property-builder function updates a CfnService$DeploymentAlarmsProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DeploymentAlarmsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmNames` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-names` |
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rollback` |
"
  [^CfnService$DeploymentAlarmsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-names)]
    (. builder alarmNames data))
  (when-let [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-let [data (lookup-entry config id :rollback)]
    (. builder rollback data))
  (.build builder))


(defn cfn-service-deployment-alarms-property-builder
  ""
  [id config]
  (build-cfn-service-deployment-alarms-property-builder (new CfnService$DeploymentAlarmsProperty$Builder) id config))


(defn build-cfn-service-deployment-circuit-breaker-property-builder
  "The build-cfn-service-deployment-circuit-breaker-property-builder function updates a CfnService$DeploymentCircuitBreakerProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DeploymentCircuitBreakerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rollback` |
"
  [^CfnService$DeploymentCircuitBreakerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-let [data (lookup-entry config id :rollback)]
    (. builder rollback data))
  (.build builder))


(defn cfn-service-deployment-circuit-breaker-property-builder
  ""
  [id config]
  (build-cfn-service-deployment-circuit-breaker-property-builder (new CfnService$DeploymentCircuitBreakerProperty$Builder) id config))


(defn build-cfn-service-deployment-configuration-property-builder
  "The build-cfn-service-deployment-configuration-property-builder function updates a CfnService$DeploymentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DeploymentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | software.amazon.awscdk.services.ecs.CfnService$DeploymentAlarmsProperty | [[cdk.support/lookup-entry]] | `:alarms` |
| `deploymentCircuitBreaker` | software.amazon.awscdk.services.ecs.CfnService$DeploymentCircuitBreakerProperty | [[cdk.support/lookup-entry]] | `:deployment-circuit-breaker` |
| `maximumPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-percent` |
| `minimumHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-healthy-percent` |
"
  [^CfnService$DeploymentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-let [data (lookup-entry config id :deployment-circuit-breaker)]
    (. builder deploymentCircuitBreaker data))
  (when-let [data (lookup-entry config id :maximum-percent)]
    (. builder maximumPercent data))
  (when-let [data (lookup-entry config id :minimum-healthy-percent)]
    (. builder minimumHealthyPercent data))
  (.build builder))


(defn cfn-service-deployment-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-deployment-configuration-property-builder (new CfnService$DeploymentConfigurationProperty$Builder) id config))


(defn build-cfn-service-deployment-controller-property-builder
  "The build-cfn-service-deployment-controller-property-builder function updates a CfnService$DeploymentControllerProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DeploymentControllerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$DeploymentControllerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-deployment-controller-property-builder
  ""
  [id config]
  (build-cfn-service-deployment-controller-property-builder (new CfnService$DeploymentControllerProperty$Builder) id config))


(defn build-cfn-service-ebs-tag-specification-property-builder
  "The build-cfn-service-ebs-tag-specification-property-builder function updates a CfnService$EBSTagSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$EBSTagSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propagateTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagate-tags` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnService$EBSTagSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :propagate-tags)]
    (. builder propagateTags data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-ebs-tag-specification-property-builder
  ""
  [id config]
  (build-cfn-service-ebs-tag-specification-property-builder (new CfnService$EBSTagSpecificationProperty$Builder) id config))


(defn build-cfn-service-load-balancer-property-builder
  "The build-cfn-service-load-balancer-property-builder function updates a CfnService$LoadBalancerProperty$Builder instance using the provided configuration.
  The function takes the CfnService$LoadBalancerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
"
  [^CfnService$LoadBalancerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-let [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (.build builder))


(defn cfn-service-load-balancer-property-builder
  ""
  [id config]
  (build-cfn-service-load-balancer-property-builder (new CfnService$LoadBalancerProperty$Builder) id config))


(defn build-cfn-service-log-configuration-property-builder
  "The build-cfn-service-log-configuration-property-builder function updates a CfnService$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^CfnService$LogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn cfn-service-log-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-log-configuration-property-builder (new CfnService$LogConfigurationProperty$Builder) id config))


(defn build-cfn-service-network-configuration-property-builder
  "The build-cfn-service-network-configuration-property-builder function updates a CfnService$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsvpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:awsvpc-configuration` |
"
  [^CfnService$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :awsvpc-configuration)]
    (. builder awsvpcConfiguration data))
  (.build builder))


(defn cfn-service-network-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-network-configuration-property-builder (new CfnService$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-service-placement-constraint-property-builder
  "The build-cfn-service-placement-constraint-property-builder function updates a CfnService$PlacementConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnService$PlacementConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$PlacementConstraintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-placement-constraint-property-builder
  ""
  [id config]
  (build-cfn-service-placement-constraint-property-builder (new CfnService$PlacementConstraintProperty$Builder) id config))


(defn build-cfn-service-placement-strategy-property-builder
  "The build-cfn-service-placement-strategy-property-builder function updates a CfnService$PlacementStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnService$PlacementStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$PlacementStrategyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-placement-strategy-property-builder
  ""
  [id config]
  (build-cfn-service-placement-strategy-property-builder (new CfnService$PlacementStrategyProperty$Builder) id config))


(defn build-cfn-service-props-builder
  "The build-cfn-service-props-builder function updates a CfnServiceProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^CfnServiceProps$Builder builder id config]
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
  (.build builder))


(defn cfn-service-props-builder
  ""
  [id config]
  (build-cfn-service-props-builder (new CfnServiceProps$Builder) id config))


(defn build-cfn-service-secret-property-builder
  "The build-cfn-service-secret-property-builder function updates a CfnService$SecretProperty$Builder instance using the provided configuration.
  The function takes the CfnService$SecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |
"
  [^CfnService$SecretProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value-from)]
    (. builder valueFrom data))
  (.build builder))


(defn cfn-service-secret-property-builder
  ""
  [id config]
  (build-cfn-service-secret-property-builder (new CfnService$SecretProperty$Builder) id config))


(defn build-cfn-service-service-connect-client-alias-property-builder
  "The build-cfn-service-service-connect-client-alias-property-builder function updates a CfnService$ServiceConnectClientAliasProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceConnectClientAliasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnService$ServiceConnectClientAliasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-service-service-connect-client-alias-property-builder
  ""
  [id config]
  (build-cfn-service-service-connect-client-alias-property-builder (new CfnService$ServiceConnectClientAliasProperty$Builder) id config))


(defn build-cfn-service-service-connect-configuration-property-builder
  "The build-cfn-service-service-connect-configuration-property-builder function updates a CfnService$ServiceConnectConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceConnectConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logConfiguration` | software.amazon.awscdk.services.ecs.CfnService$LogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `services` | java.util.List | [[cdk.support/lookup-entry]] | `:services` |
"
  [^CfnService$ServiceConnectConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :services)]
    (. builder services data))
  (.build builder))


(defn cfn-service-service-connect-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-service-connect-configuration-property-builder (new CfnService$ServiceConnectConfigurationProperty$Builder) id config))


(defn build-cfn-service-service-connect-service-property-builder
  "The build-cfn-service-service-connect-service-property-builder function updates a CfnService$ServiceConnectServiceProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceConnectServiceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientAliases` | java.util.List | [[cdk.support/lookup-entry]] | `:client-aliases` |
| `discoveryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-name` |
| `ingressPortOverride` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingress-port-override` |
| `portName` | java.lang.String | [[cdk.support/lookup-entry]] | `:port-name` |
| `timeout` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout` |
| `tls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls` |
"
  [^CfnService$ServiceConnectServiceProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-service-service-connect-service-property-builder
  ""
  [id config]
  (build-cfn-service-service-connect-service-property-builder (new CfnService$ServiceConnectServiceProperty$Builder) id config))


(defn build-cfn-service-service-connect-tls-certificate-authority-property-builder
  "The build-cfn-service-service-connect-tls-certificate-authority-property-builder function updates a CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsPcaAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-pca-authority-arn` |
"
  [^CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-pca-authority-arn)]
    (. builder awsPcaAuthorityArn data))
  (.build builder))


(defn cfn-service-service-connect-tls-certificate-authority-property-builder
  ""
  [id config]
  (build-cfn-service-service-connect-tls-certificate-authority-property-builder (new CfnService$ServiceConnectTlsCertificateAuthorityProperty$Builder) id config))


(defn build-cfn-service-service-connect-tls-configuration-property-builder
  "The build-cfn-service-service-connect-tls-configuration-property-builder function updates a CfnService$ServiceConnectTlsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceConnectTlsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `issuerCertificateAuthority` | software.amazon.awscdk.services.ecs.CfnService$ServiceConnectTlsCertificateAuthorityProperty | [[cdk.support/lookup-entry]] | `:issuer-certificate-authority` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnService$ServiceConnectTlsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :issuer-certificate-authority)]
    (. builder issuerCertificateAuthority data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-service-service-connect-tls-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-service-connect-tls-configuration-property-builder (new CfnService$ServiceConnectTlsConfigurationProperty$Builder) id config))


(defn build-cfn-service-service-managed-ebs-volume-configuration-property-builder
  "The build-cfn-service-service-managed-ebs-volume-configuration-property-builder function updates a CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-service-service-managed-ebs-volume-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-service-managed-ebs-volume-configuration-property-builder (new CfnService$ServiceManagedEBSVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-service-service-registry-property-builder
  "The build-cfn-service-service-registry-property-builder function updates a CfnService$ServiceRegistryProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceRegistryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `registryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-arn` |
"
  [^CfnService$ServiceRegistryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :registry-arn)]
    (. builder registryArn data))
  (.build builder))


(defn cfn-service-service-registry-property-builder
  ""
  [id config]
  (build-cfn-service-service-registry-property-builder (new CfnService$ServiceRegistryProperty$Builder) id config))


(defn build-cfn-service-service-volume-configuration-property-builder
  "The build-cfn-service-service-volume-configuration-property-builder function updates a CfnService$ServiceVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.CfnService$ServiceManagedEBSVolumeConfigurationProperty | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnService$ServiceVolumeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :managed-ebs-volume)]
    (. builder managedEbsVolume data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-service-service-volume-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-service-volume-configuration-property-builder (new CfnService$ServiceVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-service-timeout-configuration-property-builder
  "The build-cfn-service-timeout-configuration-property-builder function updates a CfnService$TimeoutConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$TimeoutConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout-seconds` |
| `perRequestTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:per-request-timeout-seconds` |
"
  [^CfnService$TimeoutConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :idle-timeout-seconds)]
    (. builder idleTimeoutSeconds data))
  (when-let [data (lookup-entry config id :per-request-timeout-seconds)]
    (. builder perRequestTimeoutSeconds data))
  (.build builder))


(defn cfn-service-timeout-configuration-property-builder
  ""
  [id config]
  (build-cfn-service-timeout-configuration-property-builder (new CfnService$TimeoutConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-authorization-config-property-builder
  "The build-cfn-task-definition-authorization-config-property-builder function updates a CfnTaskDefinition$AuthorizationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$AuthorizationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-id` |
| `iam` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam` |
"
  [^CfnTaskDefinition$AuthorizationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-id)]
    (. builder accessPointId data))
  (when-let [data (lookup-entry config id :iam)]
    (. builder iam data))
  (.build builder))


(defn cfn-task-definition-authorization-config-property-builder
  ""
  [id config]
  (build-cfn-task-definition-authorization-config-property-builder (new CfnTaskDefinition$AuthorizationConfigProperty$Builder) id config))


(defn build-cfn-task-definition-builder
  "The build-cfn-task-definition-builder function updates a CfnTaskDefinition$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnTaskDefinition$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-task-definition-builder (CfnTaskDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-task-definition-container-definition-property-builder
  "The build-cfn-task-definition-container-definition-property-builder function updates a CfnTaskDefinition$ContainerDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$ContainerDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnTaskDefinition$ContainerDefinitionProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-container-definition-property-builder
  ""
  [id config]
  (build-cfn-task-definition-container-definition-property-builder (new CfnTaskDefinition$ContainerDefinitionProperty$Builder) id config))


(defn build-cfn-task-definition-container-dependency-property-builder
  "The build-cfn-task-definition-container-dependency-property-builder function updates a CfnTaskDefinition$ContainerDependencyProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$ContainerDependencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
"
  [^CfnTaskDefinition$ContainerDependencyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (.build builder))


(defn cfn-task-definition-container-dependency-property-builder
  ""
  [id config]
  (build-cfn-task-definition-container-dependency-property-builder (new CfnTaskDefinition$ContainerDependencyProperty$Builder) id config))


(defn build-cfn-task-definition-device-property-builder
  "The build-cfn-task-definition-device-property-builder function updates a CfnTaskDefinition$DeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$DeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `hostPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-path` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
"
  [^CfnTaskDefinition$DeviceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn cfn-task-definition-device-property-builder
  ""
  [id config]
  (build-cfn-task-definition-device-property-builder (new CfnTaskDefinition$DeviceProperty$Builder) id config))


(defn build-cfn-task-definition-docker-volume-configuration-property-builder
  "The build-cfn-task-definition-docker-volume-configuration-property-builder function updates a CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoprovision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:autoprovision` |
| `driver` | java.lang.String | [[cdk.support/lookup-entry]] | `:driver` |
| `driverOpts` | java.util.Map | [[cdk.support/lookup-entry]] | `:driver-opts` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-docker-volume-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-docker-volume-configuration-property-builder (new CfnTaskDefinition$DockerVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-efs-volume-configuration-property-builder
  "The build-cfn-task-definition-efs-volume-configuration-property-builder function updates a CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `filesystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:filesystem-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |
"
  [^CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-efs-volume-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-efs-volume-configuration-property-builder (new CfnTaskDefinition$EFSVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-environment-file-property-builder
  "The build-cfn-task-definition-environment-file-property-builder function updates a CfnTaskDefinition$EnvironmentFileProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$EnvironmentFileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTaskDefinition$EnvironmentFileProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-definition-environment-file-property-builder
  ""
  [id config]
  (build-cfn-task-definition-environment-file-property-builder (new CfnTaskDefinition$EnvironmentFileProperty$Builder) id config))


(defn build-cfn-task-definition-ephemeral-storage-property-builder
  "The build-cfn-task-definition-ephemeral-storage-property-builder function updates a CfnTaskDefinition$EphemeralStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$EphemeralStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sizeInGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gi-b` |
"
  [^CfnTaskDefinition$EphemeralStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :size-in-gi-b)]
    (. builder sizeInGiB data))
  (.build builder))


(defn cfn-task-definition-ephemeral-storage-property-builder
  ""
  [id config]
  (build-cfn-task-definition-ephemeral-storage-property-builder (new CfnTaskDefinition$EphemeralStorageProperty$Builder) id config))


(defn build-cfn-task-definition-f-sx-authorization-config-property-builder
  "The build-cfn-task-definition-f-sx-authorization-config-property-builder function updates a CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
"
  [^CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials-parameter)]
    (. builder credentialsParameter data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (.build builder))


(defn cfn-task-definition-f-sx-authorization-config-property-builder
  ""
  [id config]
  (build-cfn-task-definition-f-sx-authorization-config-property-builder (new CfnTaskDefinition$FSxAuthorizationConfigProperty$Builder) id config))


(defn build-cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder
  "The build-cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder function updates a CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$FSxAuthorizationConfigProperty | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
"
  [^CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-config)]
    (. builder authorizationConfig data))
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :root-directory)]
    (. builder rootDirectory data))
  (.build builder))


(defn cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-f-sx-windows-file-server-volume-configuration-property-builder (new CfnTaskDefinition$FSxWindowsFileServerVolumeConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-firelens-configuration-property-builder
  "The build-cfn-task-definition-firelens-configuration-property-builder function updates a CfnTaskDefinition$FirelensConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$FirelensConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTaskDefinition$FirelensConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-task-definition-firelens-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-firelens-configuration-property-builder (new CfnTaskDefinition$FirelensConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-health-check-property-builder
  "The build-cfn-task-definition-health-check-property-builder function updates a CfnTaskDefinition$HealthCheckProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$HealthCheckProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnTaskDefinition$HealthCheckProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-health-check-property-builder
  ""
  [id config]
  (build-cfn-task-definition-health-check-property-builder (new CfnTaskDefinition$HealthCheckProperty$Builder) id config))


(defn build-cfn-task-definition-host-entry-property-builder
  "The build-cfn-task-definition-host-entry-property-builder function updates a CfnTaskDefinition$HostEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$HostEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
"
  [^CfnTaskDefinition$HostEntryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-let [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (.build builder))


(defn cfn-task-definition-host-entry-property-builder
  ""
  [id config]
  (build-cfn-task-definition-host-entry-property-builder (new CfnTaskDefinition$HostEntryProperty$Builder) id config))


(defn build-cfn-task-definition-host-volume-properties-property-builder
  "The build-cfn-task-definition-host-volume-properties-property-builder function updates a CfnTaskDefinition$HostVolumePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$HostVolumePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnTaskDefinition$HostVolumePropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-task-definition-host-volume-properties-property-builder
  ""
  [id config]
  (build-cfn-task-definition-host-volume-properties-property-builder (new CfnTaskDefinition$HostVolumePropertiesProperty$Builder) id config))


(defn build-cfn-task-definition-inference-accelerator-property-builder
  "The build-cfn-task-definition-inference-accelerator-property-builder function updates a CfnTaskDefinition$InferenceAcceleratorProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$InferenceAcceleratorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |
"
  [^CfnTaskDefinition$InferenceAcceleratorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :device-type)]
    (. builder deviceType data))
  (.build builder))


(defn cfn-task-definition-inference-accelerator-property-builder
  ""
  [id config]
  (build-cfn-task-definition-inference-accelerator-property-builder (new CfnTaskDefinition$InferenceAcceleratorProperty$Builder) id config))


(defn build-cfn-task-definition-kernel-capabilities-property-builder
  "The build-cfn-task-definition-kernel-capabilities-property-builder function updates a CfnTaskDefinition$KernelCapabilitiesProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$KernelCapabilitiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `add` | java.util.List | [[cdk.support/lookup-entry]] | `:add` |
| `drop` | java.util.List | [[cdk.support/lookup-entry]] | `:drop` |
"
  [^CfnTaskDefinition$KernelCapabilitiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :add)]
    (. builder add data))
  (when-let [data (lookup-entry config id :drop)]
    (. builder drop data))
  (.build builder))


(defn cfn-task-definition-kernel-capabilities-property-builder
  ""
  [id config]
  (build-cfn-task-definition-kernel-capabilities-property-builder (new CfnTaskDefinition$KernelCapabilitiesProperty$Builder) id config))


(defn build-cfn-task-definition-key-value-pair-property-builder
  "The build-cfn-task-definition-key-value-pair-property-builder function updates a CfnTaskDefinition$KeyValuePairProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$KeyValuePairProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTaskDefinition$KeyValuePairProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-definition-key-value-pair-property-builder
  ""
  [id config]
  (build-cfn-task-definition-key-value-pair-property-builder (new CfnTaskDefinition$KeyValuePairProperty$Builder) id config))


(defn build-cfn-task-definition-linux-parameters-property-builder
  "The build-cfn-task-definition-linux-parameters-property-builder function updates a CfnTaskDefinition$LinuxParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$LinuxParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$KernelCapabilitiesProperty | [[cdk.support/lookup-entry]] | `:capabilities` |
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
| `tmpfs` | java.util.List | [[cdk.support/lookup-entry]] | `:tmpfs` |
"
  [^CfnTaskDefinition$LinuxParametersProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-linux-parameters-property-builder
  ""
  [id config]
  (build-cfn-task-definition-linux-parameters-property-builder (new CfnTaskDefinition$LinuxParametersProperty$Builder) id config))


(defn build-cfn-task-definition-log-configuration-property-builder
  "The build-cfn-task-definition-log-configuration-property-builder function updates a CfnTaskDefinition$LogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$LogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^CfnTaskDefinition$LogConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn cfn-task-definition-log-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-log-configuration-property-builder (new CfnTaskDefinition$LogConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-mount-point-property-builder
  "The build-cfn-task-definition-mount-point-property-builder function updates a CfnTaskDefinition$MountPointProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$MountPointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |
"
  [^CfnTaskDefinition$MountPointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :source-volume)]
    (. builder sourceVolume data))
  (.build builder))


(defn cfn-task-definition-mount-point-property-builder
  ""
  [id config]
  (build-cfn-task-definition-mount-point-property-builder (new CfnTaskDefinition$MountPointProperty$Builder) id config))


(defn build-cfn-task-definition-port-mapping-property-builder
  "The build-cfn-task-definition-port-mapping-property-builder function updates a CfnTaskDefinition$PortMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$PortMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnTaskDefinition$PortMappingProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-port-mapping-property-builder
  ""
  [id config]
  (build-cfn-task-definition-port-mapping-property-builder (new CfnTaskDefinition$PortMappingProperty$Builder) id config))


(defn build-cfn-task-definition-props-builder
  "The build-cfn-task-definition-props-builder function updates a CfnTaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnTaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-props-builder
  ""
  [id config]
  (build-cfn-task-definition-props-builder (new CfnTaskDefinitionProps$Builder) id config))


(defn build-cfn-task-definition-proxy-configuration-property-builder
  "The build-cfn-task-definition-proxy-configuration-property-builder function updates a CfnTaskDefinition$ProxyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$ProxyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `proxyConfigurationProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proxy-configuration-properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTaskDefinition$ProxyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :proxy-configuration-properties)]
    (. builder proxyConfigurationProperties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-task-definition-proxy-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-definition-proxy-configuration-property-builder (new CfnTaskDefinition$ProxyConfigurationProperty$Builder) id config))


(defn build-cfn-task-definition-repository-credentials-property-builder
  "The build-cfn-task-definition-repository-credentials-property-builder function updates a CfnTaskDefinition$RepositoryCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$RepositoryCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-parameter` |
"
  [^CfnTaskDefinition$RepositoryCredentialsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials-parameter)]
    (. builder credentialsParameter data))
  (.build builder))


(defn cfn-task-definition-repository-credentials-property-builder
  ""
  [id config]
  (build-cfn-task-definition-repository-credentials-property-builder (new CfnTaskDefinition$RepositoryCredentialsProperty$Builder) id config))


(defn build-cfn-task-definition-resource-requirement-property-builder
  "The build-cfn-task-definition-resource-requirement-property-builder function updates a CfnTaskDefinition$ResourceRequirementProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$ResourceRequirementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTaskDefinition$ResourceRequirementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-definition-resource-requirement-property-builder
  ""
  [id config]
  (build-cfn-task-definition-resource-requirement-property-builder (new CfnTaskDefinition$ResourceRequirementProperty$Builder) id config))


(defn build-cfn-task-definition-runtime-platform-property-builder
  "The build-cfn-task-definition-runtime-platform-property-builder function updates a CfnTaskDefinition$RuntimePlatformProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$RuntimePlatformProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system-family` |
"
  [^CfnTaskDefinition$RuntimePlatformProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cpu-architecture)]
    (. builder cpuArchitecture data))
  (when-let [data (lookup-entry config id :operating-system-family)]
    (. builder operatingSystemFamily data))
  (.build builder))


(defn cfn-task-definition-runtime-platform-property-builder
  ""
  [id config]
  (build-cfn-task-definition-runtime-platform-property-builder (new CfnTaskDefinition$RuntimePlatformProperty$Builder) id config))


(defn build-cfn-task-definition-secret-property-builder
  "The build-cfn-task-definition-secret-property-builder function updates a CfnTaskDefinition$SecretProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$SecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `valueFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-from` |
"
  [^CfnTaskDefinition$SecretProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value-from)]
    (. builder valueFrom data))
  (.build builder))


(defn cfn-task-definition-secret-property-builder
  ""
  [id config]
  (build-cfn-task-definition-secret-property-builder (new CfnTaskDefinition$SecretProperty$Builder) id config))


(defn build-cfn-task-definition-system-control-property-builder
  "The build-cfn-task-definition-system-control-property-builder function updates a CfnTaskDefinition$SystemControlProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$SystemControlProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTaskDefinition$SystemControlProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-definition-system-control-property-builder
  ""
  [id config]
  (build-cfn-task-definition-system-control-property-builder (new CfnTaskDefinition$SystemControlProperty$Builder) id config))


(defn build-cfn-task-definition-task-definition-placement-constraint-property-builder
  "The build-cfn-task-definition-task-definition-placement-constraint-property-builder function updates a CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-task-definition-task-definition-placement-constraint-property-builder
  ""
  [id config]
  (build-cfn-task-definition-task-definition-placement-constraint-property-builder (new CfnTaskDefinition$TaskDefinitionPlacementConstraintProperty$Builder) id config))


(defn build-cfn-task-definition-tmpfs-property-builder
  "The build-cfn-task-definition-tmpfs-property-builder function updates a CfnTaskDefinition$TmpfsProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$TmpfsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^CfnTaskDefinition$TmpfsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn cfn-task-definition-tmpfs-property-builder
  ""
  [id config]
  (build-cfn-task-definition-tmpfs-property-builder (new CfnTaskDefinition$TmpfsProperty$Builder) id config))


(defn build-cfn-task-definition-ulimit-property-builder
  "The build-cfn-task-definition-ulimit-property-builder function updates a CfnTaskDefinition$UlimitProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$UlimitProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |
"
  [^CfnTaskDefinition$UlimitProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hard-limit)]
    (. builder hardLimit data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :soft-limit)]
    (. builder softLimit data))
  (.build builder))


(defn cfn-task-definition-ulimit-property-builder
  ""
  [id config]
  (build-cfn-task-definition-ulimit-property-builder (new CfnTaskDefinition$UlimitProperty$Builder) id config))


(defn build-cfn-task-definition-volume-from-property-builder
  "The build-cfn-task-definition-volume-from-property-builder function updates a CfnTaskDefinition$VolumeFromProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$VolumeFromProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceContainer` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-container` |
"
  [^CfnTaskDefinition$VolumeFromProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :source-container)]
    (. builder sourceContainer data))
  (.build builder))


(defn cfn-task-definition-volume-from-property-builder
  ""
  [id config]
  (build-cfn-task-definition-volume-from-property-builder (new CfnTaskDefinition$VolumeFromProperty$Builder) id config))


(defn build-cfn-task-definition-volume-property-builder
  "The build-cfn-task-definition-volume-property-builder function updates a CfnTaskDefinition$VolumeProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$VolumeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredAtLaunch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configured-at-launch` |
| `dockerVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:docker-volume-configuration` |
| `efsVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `fSxWindowsFileServerVolumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:f-sx-windows-file-server-volume-configuration` |
| `host` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnTaskDefinition$VolumeProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-task-definition-volume-property-builder
  ""
  [id config]
  (build-cfn-task-definition-volume-property-builder (new CfnTaskDefinition$VolumeProperty$Builder) id config))


(defn build-cfn-task-set-aws-vpc-configuration-property-builder
  "The build-cfn-task-set-aws-vpc-configuration-property-builder function updates a CfnTaskSet$AwsVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$AwsVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnTaskSet$AwsVpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-task-set-aws-vpc-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-set-aws-vpc-configuration-property-builder (new CfnTaskSet$AwsVpcConfigurationProperty$Builder) id config))


(defn build-cfn-task-set-builder
  "The build-cfn-task-set-builder function updates a CfnTaskSet$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^CfnTaskSet$Builder builder id config]
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
  (.build builder))


(defn cfn-task-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-task-set-builder (CfnTaskSet$Builder/create scope (name id)) id config))


(defn build-cfn-task-set-load-balancer-property-builder
  "The build-cfn-task-set-load-balancer-property-builder function updates a CfnTaskSet$LoadBalancerProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$LoadBalancerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `targetGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-arn` |
"
  [^CfnTaskSet$LoadBalancerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (lookup-entry config id :target-group-arn)]
    (. builder targetGroupArn data))
  (.build builder))


(defn cfn-task-set-load-balancer-property-builder
  ""
  [id config]
  (build-cfn-task-set-load-balancer-property-builder (new CfnTaskSet$LoadBalancerProperty$Builder) id config))


(defn build-cfn-task-set-network-configuration-property-builder
  "The build-cfn-task-set-network-configuration-property-builder function updates a CfnTaskSet$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsVpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-vpc-configuration` |
"
  [^CfnTaskSet$NetworkConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-vpc-configuration)]
    (. builder awsVpcConfiguration data))
  (.build builder))


(defn cfn-task-set-network-configuration-property-builder
  ""
  [id config]
  (build-cfn-task-set-network-configuration-property-builder (new CfnTaskSet$NetworkConfigurationProperty$Builder) id config))


(defn build-cfn-task-set-props-builder
  "The build-cfn-task-set-props-builder function updates a CfnTaskSetProps$Builder instance using the provided configuration.
  The function takes the CfnTaskSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^CfnTaskSetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-task-set-props-builder
  ""
  [id config]
  (build-cfn-task-set-props-builder (new CfnTaskSetProps$Builder) id config))


(defn build-cfn-task-set-scale-property-builder
  "The build-cfn-task-set-scale-property-builder function updates a CfnTaskSet$ScaleProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$ScaleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTaskSet$ScaleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-set-scale-property-builder
  ""
  [id config]
  (build-cfn-task-set-scale-property-builder (new CfnTaskSet$ScaleProperty$Builder) id config))


(defn build-cfn-task-set-service-registry-property-builder
  "The build-cfn-task-set-service-registry-property-builder function updates a CfnTaskSet$ServiceRegistryProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskSet$ServiceRegistryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `registryArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-arn` |
"
  [^CfnTaskSet$ServiceRegistryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :registry-arn)]
    (. builder registryArn data))
  (.build builder))


(defn cfn-task-set-service-registry-property-builder
  ""
  [id config]
  (build-cfn-task-set-service-registry-property-builder (new CfnTaskSet$ServiceRegistryProperty$Builder) id config))


(defn build-cloud-map-namespace-options-builder
  "The build-cloud-map-namespace-options-builder function updates a CloudMapNamespaceOptions$Builder instance using the provided configuration.
  The function takes the CloudMapNamespaceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.servicediscovery.NamespaceType | [[cdk.api.services.servicediscovery/namespace-type]] | `:type` |
| `useForServiceConnect` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-for-service-connect` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CloudMapNamespaceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (namespace-type config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :use-for-service-connect)]
    (. builder useForServiceConnect data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn cloud-map-namespace-options-builder
  ""
  [id config]
  (build-cloud-map-namespace-options-builder (new CloudMapNamespaceOptions$Builder) id config))


(defn build-cloud-map-options-builder
  "The build-cloud-map-options-builder function updates a CloudMapOptions$Builder instance using the provided configuration.
  The function takes the CloudMapOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapNamespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:cloud-map-namespace` |
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `dnsTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:dns-ttl` |
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CloudMapOptions$Builder builder id config]
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
  (.build builder))


(defn cloud-map-options-builder
  ""
  [id config]
  (build-cloud-map-options-builder (new CloudMapOptions$Builder) id config))


(defn build-cluster-attributes-builder
  "The build-cluster-attributes-builder function updates a ClusterAttributes$Builder instance using the provided configuration.
  The function takes the ClusterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoscalingGroup` | software.amazon.awscdk.services.autoscaling.IAutoScalingGroup | [[cdk.support/lookup-entry]] | `:autoscaling-group` |
| `clusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-arn` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `hasEc2Capacity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:has-ec2-capacity` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ClusterAttributes$Builder builder id config]
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
  (.build builder))


(defn cluster-attributes-builder
  ""
  [id config]
  (build-cluster-attributes-builder (new ClusterAttributes$Builder) id config))


(defn build-cluster-builder
  "The build-cluster-builder function updates a Cluster$Builder instance using the provided configuration.
  The function takes the Cluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.services.ecs.AddCapacityOptions | [[cdk.support/lookup-entry]] | `:capacity` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `containerInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:container-insights` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `enableFargateCapacityProviders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-fargate-capacity-providers` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^Cluster$Builder builder id config]
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
  (.build builder))


(defn cluster-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cluster-builder (Cluster$Builder/create scope (name id)) id config))


(defn build-cluster-props-builder
  "The build-cluster-props-builder function updates a ClusterProps$Builder instance using the provided configuration.
  The function takes the ClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | software.amazon.awscdk.services.ecs.AddCapacityOptions | [[cdk.support/lookup-entry]] | `:capacity` |
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
| `containerInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:container-insights` |
| `defaultCloudMapNamespace` | software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions | [[cdk.support/lookup-entry]] | `:default-cloud-map-namespace` |
| `enableFargateCapacityProviders` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-fargate-capacity-providers` |
| `executeCommandConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration | [[cdk.support/lookup-entry]] | `:execute-command-configuration` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ClusterProps$Builder builder id config]
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
  (.build builder))


(defn cluster-props-builder
  ""
  [id config]
  (build-cluster-props-builder (new ClusterProps$Builder) id config))


(defn build-common-task-definition-attributes-builder
  "The build-common-task-definition-attributes-builder function updates a CommonTaskDefinitionAttributes$Builder instance using the provided configuration.
  The function takes the CommonTaskDefinitionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^CommonTaskDefinitionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (network-mode config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :task-definition-arn)]
    (. builder taskDefinitionArn data))
  (when-let [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn common-task-definition-attributes-builder
  ""
  [id config]
  (build-common-task-definition-attributes-builder (new CommonTaskDefinitionAttributes$Builder) id config))


(defn build-common-task-definition-props-builder
  "The build-common-task-definition-props-builder function updates a CommonTaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the CommonTaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CommonTaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn common-task-definition-props-builder
  ""
  [id config]
  (build-common-task-definition-props-builder (new CommonTaskDefinitionProps$Builder) id config))


(defn build-container-definition-builder
  "The build-container-definition-builder function updates a ContainerDefinition$Builder instance using the provided configuration.
  The function takes the ContainerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^ContainerDefinition$Builder builder id config]
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
  (.build builder))


(defn container-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-container-definition-builder (ContainerDefinition$Builder/create scope (name id)) id config))


(defn build-container-definition-options-builder
  "The build-container-definition-options-builder function updates a ContainerDefinitionOptions$Builder instance using the provided configuration.
  The function takes the ContainerDefinitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^ContainerDefinitionOptions$Builder builder id config]
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
  (.build builder))


(defn container-definition-options-builder
  ""
  [id config]
  (build-container-definition-options-builder (new ContainerDefinitionOptions$Builder) id config))


(defn build-container-definition-props-builder
  "The build-container-definition-props-builder function updates a ContainerDefinitionProps$Builder instance using the provided configuration.
  The function takes the ContainerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^ContainerDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn container-definition-props-builder
  ""
  [id config]
  (build-container-definition-props-builder (new ContainerDefinitionProps$Builder) id config))


(defn build-container-dependency-builder
  "The build-container-dependency-builder function updates a ContainerDependency$Builder instance using the provided configuration.
  The function takes the ContainerDependency$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.services.ecs.ContainerDependencyCondition | [[cdk.api.services.ecs/container-dependency-condition]] | `:condition` |
| `container` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container` |
"
  [^ContainerDependency$Builder builder id config]
  (when-let [data (container-dependency-condition config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :container)]
    (. builder container data))
  (.build builder))


(defn container-dependency-builder
  ""
  [id config]
  (build-container-dependency-builder (new ContainerDependency$Builder) id config))


(defn build-container-image-config-builder
  "The build-container-image-config-builder function updates a ContainerImageConfig$Builder instance using the provided configuration.
  The function takes the ContainerImageConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `repositoryCredentials` | software.amazon.awscdk.services.ecs.CfnTaskDefinition$RepositoryCredentialsProperty | [[cdk.support/lookup-entry]] | `:repository-credentials` |
"
  [^ContainerImageConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :repository-credentials)]
    (. builder repositoryCredentials data))
  (.build builder))


(defn container-image-config-builder
  ""
  [id config]
  (build-container-image-config-builder (new ContainerImageConfig$Builder) id config))


(defn build-container-mount-point-builder
  "The build-container-mount-point-builder function updates a ContainerMountPoint$Builder instance using the provided configuration.
  The function takes the ContainerMountPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
"
  [^ContainerMountPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (.build builder))


(defn container-mount-point-builder
  ""
  [id config]
  (build-container-mount-point-builder (new ContainerMountPoint$Builder) id config))


(defn build-cpu-utilization-scaling-props-builder
  "The build-cpu-utilization-scaling-props-builder function updates a CpuUtilizationScalingProps$Builder instance using the provided configuration.
  The function takes the CpuUtilizationScalingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |
"
  [^CpuUtilizationScalingProps$Builder builder id config]
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
  (.build builder))


(defn cpu-utilization-scaling-props-builder
  ""
  [id config]
  (build-cpu-utilization-scaling-props-builder (new CpuUtilizationScalingProps$Builder) id config))


(defn build-credential-spec-config-builder
  "The build-credential-spec-config-builder function updates a CredentialSpecConfig$Builder instance using the provided configuration.
  The function takes the CredentialSpecConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `typePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-prefix` |
"
  [^CredentialSpecConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :type-prefix)]
    (. builder typePrefix data))
  (.build builder))


(defn credential-spec-config-builder
  ""
  [id config]
  (build-credential-spec-config-builder (new CredentialSpecConfig$Builder) id config))


(defn build-deployment-alarm-config-builder
  "The build-deployment-alarm-config-builder function updates a DeploymentAlarmConfig$Builder instance using the provided configuration.
  The function takes the DeploymentAlarmConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmNames` | java.util.List | [[cdk.support/lookup-entry]] | `:alarm-names` |
| `behavior` | software.amazon.awscdk.services.ecs.AlarmBehavior | [[cdk.api.services.ecs/alarm-behavior]] | `:behavior` |
"
  [^DeploymentAlarmConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-names)]
    (. builder alarmNames data))
  (when-let [data (alarm-behavior config id :behavior)]
    (. builder behavior data))
  (.build builder))


(defn deployment-alarm-config-builder
  ""
  [id config]
  (build-deployment-alarm-config-builder (new DeploymentAlarmConfig$Builder) id config))


(defn build-deployment-alarm-options-builder
  "The build-deployment-alarm-options-builder function updates a DeploymentAlarmOptions$Builder instance using the provided configuration.
  The function takes the DeploymentAlarmOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | software.amazon.awscdk.services.ecs.AlarmBehavior | [[cdk.api.services.ecs/alarm-behavior]] | `:behavior` |
"
  [^DeploymentAlarmOptions$Builder builder id config]
  (when-let [data (alarm-behavior config id :behavior)]
    (. builder behavior data))
  (.build builder))


(defn deployment-alarm-options-builder
  ""
  [id config]
  (build-deployment-alarm-options-builder (new DeploymentAlarmOptions$Builder) id config))


(defn build-deployment-circuit-breaker-builder
  "The build-deployment-circuit-breaker-builder function updates a DeploymentCircuitBreaker$Builder instance using the provided configuration.
  The function takes the DeploymentCircuitBreaker$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `rollback` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rollback` |
"
  [^DeploymentCircuitBreaker$Builder builder id config]
  (when-let [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-let [data (lookup-entry config id :rollback)]
    (. builder rollback data))
  (.build builder))


(defn deployment-circuit-breaker-builder
  ""
  [id config]
  (build-deployment-circuit-breaker-builder (new DeploymentCircuitBreaker$Builder) id config))


(defn build-deployment-controller-builder
  "The build-deployment-controller-builder function updates a DeploymentController$Builder instance using the provided configuration.
  The function takes the DeploymentController$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | software.amazon.awscdk.services.ecs.DeploymentControllerType | [[cdk.api.services.ecs/deployment-controller-type]] | `:type` |
"
  [^DeploymentController$Builder builder id config]
  (when-let [data (deployment-controller-type config id :type)]
    (. builder type data))
  (.build builder))


(defn deployment-controller-builder
  ""
  [id config]
  (build-deployment-controller-builder (new DeploymentController$Builder) id config))


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
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :host-path)]
    (. builder hostPath data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (.build builder))


(defn device-builder
  ""
  [id config]
  (build-device-builder (new Device$Builder) id config))


(defn build-docker-volume-configuration-builder
  "The build-docker-volume-configuration-builder function updates a DockerVolumeConfiguration$Builder instance using the provided configuration.
  The function takes the DockerVolumeConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoprovision` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:autoprovision` |
| `driver` | java.lang.String | [[cdk.support/lookup-entry]] | `:driver` |
| `driverOpts` | java.util.Map | [[cdk.support/lookup-entry]] | `:driver-opts` |
| `labels` | java.util.Map | [[cdk.support/lookup-entry]] | `:labels` |
| `scope` | software.amazon.awscdk.services.ecs.Scope | [[cdk.api.services.ecs/scope]] | `:scope` |
"
  [^DockerVolumeConfiguration$Builder builder id config]
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
  (.build builder))


(defn docker-volume-configuration-builder
  ""
  [id config]
  (build-docker-volume-configuration-builder (new DockerVolumeConfiguration$Builder) id config))


(defn build-ebs-tag-specification-builder
  "The build-ebs-tag-specification-builder function updates a EBSTagSpecification$Builder instance using the provided configuration.
  The function takes the EBSTagSpecification$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propagateTags` | software.amazon.awscdk.services.ecs.EbsPropagatedTagSource | [[cdk.api.services.ecs/ebs-propagated-tag-source]] | `:propagate-tags` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^EBSTagSpecification$Builder builder id config]
  (when-let [data (ebs-propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn ebs-tag-specification-builder
  ""
  [id config]
  (build-ebs-tag-specification-builder (new EBSTagSpecification$Builder) id config))


(defn build-ec2-service-attributes-builder
  "The build-ec2-service-attributes-builder function updates a Ec2ServiceAttributes$Builder instance using the provided configuration.
  The function takes the Ec2ServiceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^Ec2ServiceAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn ec2-service-attributes-builder
  ""
  [id config]
  (build-ec2-service-attributes-builder (new Ec2ServiceAttributes$Builder) id config))


(defn build-ec2-service-builder
  "The build-ec2-service-builder function updates a Ec2Service$Builder instance using the provided configuration.
  The function takes the Ec2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^Ec2Service$Builder builder id config]
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
  (.build builder))


(defn ec2-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-ec2-service-builder (Ec2Service$Builder/create scope (name id)) id config))


(defn build-ec2-service-props-builder
  "The build-ec2-service-props-builder function updates a Ec2ServiceProps$Builder instance using the provided configuration.
  The function takes the Ec2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^Ec2ServiceProps$Builder builder id config]
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
  (.build builder))


(defn ec2-service-props-builder
  ""
  [id config]
  (build-ec2-service-props-builder (new Ec2ServiceProps$Builder) id config))


(defn build-ec2-task-definition-attributes-builder
  "The build-ec2-task-definition-attributes-builder function updates a Ec2TaskDefinitionAttributes$Builder instance using the provided configuration.
  The function takes the Ec2TaskDefinitionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^Ec2TaskDefinitionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (network-mode config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :task-definition-arn)]
    (. builder taskDefinitionArn data))
  (when-let [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn ec2-task-definition-attributes-builder
  ""
  [id config]
  (build-ec2-task-definition-attributes-builder (new Ec2TaskDefinitionAttributes$Builder) id config))


(defn build-ec2-task-definition-builder
  "The build-ec2-task-definition-builder function updates a Ec2TaskDefinition$Builder instance using the provided configuration.
  The function takes the Ec2TaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^Ec2TaskDefinition$Builder builder id config]
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
  (.build builder))


(defn ec2-task-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-ec2-task-definition-builder (Ec2TaskDefinition$Builder/create scope (name id)) id config))


(defn build-ec2-task-definition-props-builder
  "The build-ec2-task-definition-props-builder function updates a Ec2TaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the Ec2TaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^Ec2TaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn ec2-task-definition-props-builder
  ""
  [id config]
  (build-ec2-task-definition-props-builder (new Ec2TaskDefinitionProps$Builder) id config))


(defn build-ecs-optimized-image-options-builder
  "The build-ecs-optimized-image-options-builder function updates a EcsOptimizedImageOptions$Builder instance using the provided configuration.
  The function takes the EcsOptimizedImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
"
  [^EcsOptimizedImageOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :cached-in-context)]
    (. builder cachedInContext data))
  (.build builder))


(defn ecs-optimized-image-options-builder
  ""
  [id config]
  (build-ecs-optimized-image-options-builder (new EcsOptimizedImageOptions$Builder) id config))


(defn build-ecs-target-builder
  "The build-ecs-target-builder function updates a EcsTarget$Builder instance using the provided configuration.
  The function takes the EcsTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `listener` | software.amazon.awscdk.services.ecs.ListenerConfig | [[cdk.support/lookup-entry]] | `:listener` |
| `newTargetGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:new-target-group-id` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^EcsTarget$Builder builder id config]
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
  (.build builder))


(defn ecs-target-builder
  ""
  [id config]
  (build-ecs-target-builder (new EcsTarget$Builder) id config))


(defn build-efs-volume-configuration-builder
  "The build-efs-volume-configuration-builder function updates a EfsVolumeConfiguration$Builder instance using the provided configuration.
  The function takes the EfsVolumeConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.ecs.AuthorizationConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `rootDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-directory` |
| `transitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-encryption` |
| `transitEncryptionPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transit-encryption-port` |
"
  [^EfsVolumeConfiguration$Builder builder id config]
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
  (.build builder))


(defn efs-volume-configuration-builder
  ""
  [id config]
  (build-efs-volume-configuration-builder (new EfsVolumeConfiguration$Builder) id config))


(defn build-environment-file-config-builder
  "The build-environment-file-config-builder function updates a EnvironmentFileConfig$Builder instance using the provided configuration.
  The function takes the EnvironmentFileConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileType` | software.amazon.awscdk.services.ecs.EnvironmentFileType | [[cdk.api.services.ecs/environment-file-type]] | `:file-type` |
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^EnvironmentFileConfig$Builder builder id config]
  (when-let [data (environment-file-type config id :file-type)]
    (. builder fileType data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn environment-file-config-builder
  ""
  [id config]
  (build-environment-file-config-builder (new EnvironmentFileConfig$Builder) id config))


(defn build-execute-command-configuration-builder
  "The build-execute-command-configuration-builder function updates a ExecuteCommandConfiguration$Builder instance using the provided configuration.
  The function takes the ExecuteCommandConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `logConfiguration` | software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `logging` | software.amazon.awscdk.services.ecs.ExecuteCommandLogging | [[cdk.api.services.ecs/execute-command-logging]] | `:logging` |
"
  [^ExecuteCommandConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-let [data (execute-command-logging config id :logging)]
    (. builder logging data))
  (.build builder))


(defn execute-command-configuration-builder
  ""
  [id config]
  (build-execute-command-configuration-builder (new ExecuteCommandConfiguration$Builder) id config))


(defn build-execute-command-log-configuration-builder
  "The build-execute-command-log-configuration-builder function updates a ExecuteCommandLogConfiguration$Builder instance using the provided configuration.
  The function takes the ExecuteCommandLogConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-encryption-enabled` |
| `cloudWatchLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group` |
| `s3Bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3EncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-encryption-enabled` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
"
  [^ExecuteCommandLogConfiguration$Builder builder id config]
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
  (.build builder))


(defn execute-command-log-configuration-builder
  ""
  [id config]
  (build-execute-command-log-configuration-builder (new ExecuteCommandLogConfiguration$Builder) id config))


(defn build-external-service-attributes-builder
  "The build-external-service-attributes-builder function updates a ExternalServiceAttributes$Builder instance using the provided configuration.
  The function takes the ExternalServiceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^ExternalServiceAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn external-service-attributes-builder
  ""
  [id config]
  (build-external-service-attributes-builder (new ExternalServiceAttributes$Builder) id config))


(defn build-external-service-builder
  "The build-external-service-builder function updates a ExternalService$Builder instance using the provided configuration.
  The function takes the ExternalService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^ExternalService$Builder builder id config]
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
  (.build builder))


(defn external-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-external-service-builder (ExternalService$Builder/create scope (name id)) id config))


(defn build-external-service-props-builder
  "The build-external-service-props-builder function updates a ExternalServiceProps$Builder instance using the provided configuration.
  The function takes the ExternalServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^ExternalServiceProps$Builder builder id config]
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
  (.build builder))


(defn external-service-props-builder
  ""
  [id config]
  (build-external-service-props-builder (new ExternalServiceProps$Builder) id config))


(defn build-external-task-definition-attributes-builder
  "The build-external-task-definition-attributes-builder function updates a ExternalTaskDefinitionAttributes$Builder instance using the provided configuration.
  The function takes the ExternalTaskDefinitionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^ExternalTaskDefinitionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (network-mode config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :task-definition-arn)]
    (. builder taskDefinitionArn data))
  (when-let [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn external-task-definition-attributes-builder
  ""
  [id config]
  (build-external-task-definition-attributes-builder (new ExternalTaskDefinitionAttributes$Builder) id config))


(defn build-external-task-definition-builder
  "The build-external-task-definition-builder function updates a ExternalTaskDefinition$Builder instance using the provided configuration.
  The function takes the ExternalTaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^ExternalTaskDefinition$Builder builder id config]
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
  (.build builder))


(defn external-task-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-external-task-definition-builder (ExternalTaskDefinition$Builder/create scope (name id)) id config))


(defn build-external-task-definition-props-builder
  "The build-external-task-definition-props-builder function updates a ExternalTaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the ExternalTaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `proxyConfiguration` | software.amazon.awscdk.services.ecs.ProxyConfiguration | [[cdk.support/lookup-entry]] | `:proxy-configuration` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^ExternalTaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn external-task-definition-props-builder
  ""
  [id config]
  (build-external-task-definition-props-builder (new ExternalTaskDefinitionProps$Builder) id config))


(defn build-fargate-service-attributes-builder
  "The build-fargate-service-attributes-builder function updates a FargateServiceAttributes$Builder instance using the provided configuration.
  The function takes the FargateServiceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^FargateServiceAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-let [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn fargate-service-attributes-builder
  ""
  [id config]
  (build-fargate-service-attributes-builder (new FargateServiceAttributes$Builder) id config))


(defn build-fargate-service-builder
  "The build-fargate-service-builder function updates a FargateService$Builder instance using the provided configuration.
  The function takes the FargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateService$Builder builder id config]
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
  (.build builder))


(defn fargate-service-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-fargate-service-builder (FargateService$Builder/create scope (name id)) id config))


(defn build-fargate-service-props-builder
  "The build-fargate-service-props-builder function updates a FargateServiceProps$Builder instance using the provided configuration.
  The function takes the FargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^FargateServiceProps$Builder builder id config]
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
  (.build builder))


(defn fargate-service-props-builder
  ""
  [id config]
  (build-fargate-service-props-builder (new FargateServiceProps$Builder) id config))


(defn build-fargate-task-definition-attributes-builder
  "The build-fargate-task-definition-attributes-builder function updates a FargateTaskDefinitionAttributes$Builder instance using the provided configuration.
  The function takes the FargateTaskDefinitionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^FargateTaskDefinitionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (network-mode config id :network-mode)]
    (. builder networkMode data))
  (when-let [data (lookup-entry config id :task-definition-arn)]
    (. builder taskDefinitionArn data))
  (when-let [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn fargate-task-definition-attributes-builder
  ""
  [id config]
  (build-fargate-task-definition-attributes-builder (new FargateTaskDefinitionAttributes$Builder) id config))


(defn build-fargate-task-definition-builder
  "The build-fargate-task-definition-builder function updates a FargateTaskDefinition$Builder instance using the provided configuration.
  The function takes the FargateTaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^FargateTaskDefinition$Builder builder id config]
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
  (.build builder))


(defn fargate-task-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-fargate-task-definition-builder (FargateTaskDefinition$Builder/create scope (name id)) id config))


(defn build-fargate-task-definition-props-builder
  "The build-fargate-task-definition-props-builder function updates a FargateTaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the FargateTaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^FargateTaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn fargate-task-definition-props-builder
  ""
  [id config]
  (build-fargate-task-definition-props-builder (new FargateTaskDefinitionProps$Builder) id config))


(defn build-fire-lens-log-driver-builder
  "The build-fire-lens-log-driver-builder function updates a FireLensLogDriver$Builder instance using the provided configuration.
  The function takes the FireLensLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^FireLensLogDriver$Builder builder id config]
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
  (.build builder))


(defn fire-lens-log-driver-builder
  ""
  [id config]
  (build-fire-lens-log-driver-builder (FireLensLogDriver$Builder/create) id config))


(defn build-fire-lens-log-driver-props-builder
  "The build-fire-lens-log-driver-props-builder function updates a FireLensLogDriverProps$Builder instance using the provided configuration.
  The function takes the FireLensLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^FireLensLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn fire-lens-log-driver-props-builder
  ""
  [id config]
  (build-fire-lens-log-driver-props-builder (new FireLensLogDriverProps$Builder) id config))


(defn build-firelens-config-builder
  "The build-firelens-config-builder function updates a FirelensConfig$Builder instance using the provided configuration.
  The function takes the FirelensConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | software.amazon.awscdk.services.ecs.FirelensOptions | [[cdk.support/lookup-entry]] | `:options` |
| `type` | software.amazon.awscdk.services.ecs.FirelensLogRouterType | [[cdk.api.services.ecs/firelens-log-router-type]] | `:type` |
"
  [^FirelensConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (firelens-log-router-type config id :type)]
    (. builder type data))
  (.build builder))


(defn firelens-config-builder
  ""
  [id config]
  (build-firelens-config-builder (new FirelensConfig$Builder) id config))


(defn build-firelens-log-router-builder
  "The build-firelens-log-router-builder function updates a FirelensLogRouter$Builder instance using the provided configuration.
  The function takes the FirelensLogRouter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^FirelensLogRouter$Builder builder id config]
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
  (.build builder))


(defn firelens-log-router-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-firelens-log-router-builder (FirelensLogRouter$Builder/create scope (name id)) id config))


(defn build-firelens-log-router-definition-options-builder
  "The build-firelens-log-router-definition-options-builder function updates a FirelensLogRouterDefinitionOptions$Builder instance using the provided configuration.
  The function takes the FirelensLogRouterDefinitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^FirelensLogRouterDefinitionOptions$Builder builder id config]
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
  (.build builder))


(defn firelens-log-router-definition-options-builder
  ""
  [id config]
  (build-firelens-log-router-definition-options-builder (new FirelensLogRouterDefinitionOptions$Builder) id config))


(defn build-firelens-log-router-props-builder
  "The build-firelens-log-router-props-builder function updates a FirelensLogRouterProps$Builder instance using the provided configuration.
  The function takes the FirelensLogRouterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^FirelensLogRouterProps$Builder builder id config]
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
  (.build builder))


(defn firelens-log-router-props-builder
  ""
  [id config]
  (build-firelens-log-router-props-builder (new FirelensLogRouterProps$Builder) id config))


(defn build-firelens-options-builder
  "The build-firelens-options-builder function updates a FirelensOptions$Builder instance using the provided configuration.
  The function takes the FirelensOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFileType` | software.amazon.awscdk.services.ecs.FirelensConfigFileType | [[cdk.api.services.ecs/firelens-config-file-type]] | `:config-file-type` |
| `configFileValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-file-value` |
| `enableEcsLogMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-log-metadata` |
"
  [^FirelensOptions$Builder builder id config]
  (when-let [data (firelens-config-file-type config id :config-file-type)]
    (. builder configFileType data))
  (when-let [data (lookup-entry config id :config-file-value)]
    (. builder configFileValue data))
  (when-let [data (lookup-entry config id :enable-ecs-log-metadata)]
    (. builder enableEcsLogMetadata data))
  (.build builder))


(defn firelens-options-builder
  ""
  [id config]
  (build-firelens-options-builder (new FirelensOptions$Builder) id config))


(defn build-fluentd-log-driver-builder
  "The build-fluentd-log-driver-builder function updates a FluentdLogDriver$Builder instance using the provided configuration.
  The function takes the FluentdLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^FluentdLogDriver$Builder builder id config]
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
  (.build builder))


(defn fluentd-log-driver-builder
  ""
  [id config]
  (build-fluentd-log-driver-builder (FluentdLogDriver$Builder/create) id config))


(defn build-fluentd-log-driver-props-builder
  "The build-fluentd-log-driver-props-builder function updates a FluentdLogDriverProps$Builder instance using the provided configuration.
  The function takes the FluentdLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^FluentdLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn fluentd-log-driver-props-builder
  ""
  [id config]
  (build-fluentd-log-driver-props-builder (new FluentdLogDriverProps$Builder) id config))


(defn build-gelf-log-driver-builder
  "The build-gelf-log-driver-builder function updates a GelfLogDriver$Builder instance using the provided configuration.
  The function takes the GelfLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tcpReconnectDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tcp-reconnect-delay` |
"
  [^GelfLogDriver$Builder builder id config]
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
  (.build builder))


(defn gelf-log-driver-builder
  ""
  [id config]
  (build-gelf-log-driver-builder (GelfLogDriver$Builder/create) id config))


(defn build-gelf-log-driver-props-builder
  "The build-gelf-log-driver-props-builder function updates a GelfLogDriverProps$Builder instance using the provided configuration.
  The function takes the GelfLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tcpReconnectDelay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:tcp-reconnect-delay` |
"
  [^GelfLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn gelf-log-driver-props-builder
  ""
  [id config]
  (build-gelf-log-driver-props-builder (new GelfLogDriverProps$Builder) id config))


(defn build-generic-log-driver-builder
  "The build-generic-log-driver-builder function updates a GenericLogDriver$Builder instance using the provided configuration.
  The function takes the GenericLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^GenericLogDriver$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn generic-log-driver-builder
  ""
  [id config]
  (build-generic-log-driver-builder (GenericLogDriver$Builder/create) id config))


(defn build-generic-log-driver-props-builder
  "The build-generic-log-driver-props-builder function updates a GenericLogDriverProps$Builder instance using the provided configuration.
  The function takes the GenericLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^GenericLogDriverProps$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn generic-log-driver-props-builder
  ""
  [id config]
  (build-generic-log-driver-props-builder (new GenericLogDriverProps$Builder) id config))


(defn build-health-check-builder
  "The build-health-check-builder function updates a HealthCheck$Builder instance using the provided configuration.
  The function takes the HealthCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^HealthCheck$Builder builder id config]
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
  (.build builder))


(defn health-check-builder
  ""
  [id config]
  (build-health-check-builder (new HealthCheck$Builder) id config))


(defn build-host-builder
  "The build-host-builder function updates a Host$Builder instance using the provided configuration.
  The function takes the Host$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^Host$Builder builder id config]
  (when-let [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn host-builder
  ""
  [id config]
  (build-host-builder (new Host$Builder) id config))


(defn build-inference-accelerator-builder
  "The build-inference-accelerator-builder function updates a InferenceAccelerator$Builder instance using the provided configuration.
  The function takes the InferenceAccelerator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `deviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-type` |
"
  [^InferenceAccelerator$Builder builder id config]
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :device-type)]
    (. builder deviceType data))
  (.build builder))


(defn inference-accelerator-builder
  ""
  [id config]
  (build-inference-accelerator-builder (new InferenceAccelerator$Builder) id config))


(defn build-journald-log-driver-builder
  "The build-journald-log-driver-builder function updates a JournaldLogDriver$Builder instance using the provided configuration.
  The function takes the JournaldLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^JournaldLogDriver$Builder builder id config]
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-regex)]
    (. builder envRegex data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (.build builder))


(defn journald-log-driver-builder
  ""
  [id config]
  (build-journald-log-driver-builder (JournaldLogDriver$Builder/create) id config))


(defn build-journald-log-driver-props-builder
  "The build-journald-log-driver-props-builder function updates a JournaldLogDriverProps$Builder instance using the provided configuration.
  The function takes the JournaldLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^JournaldLogDriverProps$Builder builder id config]
  (when-let [data (lookup-entry config id :env)]
    (. builder env data))
  (when-let [data (lookup-entry config id :env-regex)]
    (. builder envRegex data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :tag)]
    (. builder tag data))
  (.build builder))


(defn journald-log-driver-props-builder
  ""
  [id config]
  (build-journald-log-driver-props-builder (new JournaldLogDriverProps$Builder) id config))


(defn build-json-file-log-driver-builder
  "The build-json-file-log-driver-builder function updates a JsonFileLogDriver$Builder instance using the provided configuration.
  The function takes the JsonFileLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxFile` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^JsonFileLogDriver$Builder builder id config]
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
  (.build builder))


(defn json-file-log-driver-builder
  ""
  [id config]
  (build-json-file-log-driver-builder (JsonFileLogDriver$Builder/create) id config))


(defn build-json-file-log-driver-props-builder
  "The build-json-file-log-driver-props-builder function updates a JsonFileLogDriverProps$Builder instance using the provided configuration.
  The function takes the JsonFileLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `env` | java.util.List | [[cdk.support/lookup-entry]] | `:env` |
| `envRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:env-regex` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `maxFile` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file` |
| `maxSize` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-size` |
| `tag` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag` |
"
  [^JsonFileLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn json-file-log-driver-props-builder
  ""
  [id config]
  (build-json-file-log-driver-props-builder (new JsonFileLogDriverProps$Builder) id config))


(defn build-linux-parameters-builder
  "The build-linux-parameters-builder function updates a LinuxParameters$Builder instance using the provided configuration.
  The function takes the LinuxParameters$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initProcessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:init-process-enabled` |
| `maxSwap` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-swap` |
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
"
  [^LinuxParameters$Builder builder id config]
  (when-let [data (lookup-entry config id :init-process-enabled)]
    (. builder initProcessEnabled data))
  (when-let [data (lookup-entry config id :max-swap)]
    (. builder maxSwap data))
  (when-let [data (lookup-entry config id :shared-memory-size)]
    (. builder sharedMemorySize data))
  (when-let [data (lookup-entry config id :swappiness)]
    (. builder swappiness data))
  (.build builder))


(defn linux-parameters-builder
  ""
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
| `sharedMemorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:shared-memory-size` |
| `swappiness` | java.lang.Number | [[cdk.support/lookup-entry]] | `:swappiness` |
"
  [^LinuxParametersProps$Builder builder id config]
  (when-let [data (lookup-entry config id :init-process-enabled)]
    (. builder initProcessEnabled data))
  (when-let [data (lookup-entry config id :max-swap)]
    (. builder maxSwap data))
  (when-let [data (lookup-entry config id :shared-memory-size)]
    (. builder sharedMemorySize data))
  (when-let [data (lookup-entry config id :swappiness)]
    (. builder swappiness data))
  (.build builder))


(defn linux-parameters-props-builder
  ""
  [id config]
  (build-linux-parameters-props-builder (new LinuxParametersProps$Builder) id config))


(defn build-load-balancer-target-options-builder
  "The build-load-balancer-target-options-builder function updates a LoadBalancerTargetOptions$Builder instance using the provided configuration.
  The function takes the LoadBalancerTargetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^LoadBalancerTargetOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-let [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-let [data (protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn load-balancer-target-options-builder
  ""
  [id config]
  (build-load-balancer-target-options-builder (new LoadBalancerTargetOptions$Builder) id config))


(defn build-log-driver-config-builder
  "The build-log-driver-config-builder function updates a LogDriverConfig$Builder instance using the provided configuration.
  The function takes the LogDriverConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-driver` |
| `options` | java.util.Map | [[cdk.support/lookup-entry]] | `:options` |
| `secretOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:secret-options` |
"
  [^LogDriverConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :secret-options)]
    (. builder secretOptions data))
  (.build builder))


(defn log-driver-config-builder
  ""
  [id config]
  (build-log-driver-config-builder (new LogDriverConfig$Builder) id config))


(defn build-memory-utilization-scaling-props-builder
  "The build-memory-utilization-scaling-props-builder function updates a MemoryUtilizationScalingProps$Builder instance using the provided configuration.
  The function takes the MemoryUtilizationScalingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |
"
  [^MemoryUtilizationScalingProps$Builder builder id config]
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
  (.build builder))


(defn memory-utilization-scaling-props-builder
  ""
  [id config]
  (build-memory-utilization-scaling-props-builder (new MemoryUtilizationScalingProps$Builder) id config))


(defn build-mount-point-builder
  "The build-mount-point-builder function updates a MountPoint$Builder instance using the provided configuration.
  The function takes the MountPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceVolume` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-volume` |
"
  [^MountPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :source-volume)]
    (. builder sourceVolume data))
  (.build builder))


(defn mount-point-builder
  ""
  [id config]
  (build-mount-point-builder (new MountPoint$Builder) id config))


(defn build-port-map-builder
  "The build-port-map-builder function updates a PortMap$Builder instance using the provided configuration.
  The function takes the PortMap$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^PortMap$Builder builder id config]
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
  (.build builder))


(defn build-port-mapping-builder
  "The build-port-mapping-builder function updates a PortMapping$Builder instance using the provided configuration.
  The function takes the PortMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^PortMapping$Builder builder id config]
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
  (.build builder))


(defn port-mapping-builder
  ""
  [id config]
  (build-port-mapping-builder (new PortMapping$Builder) id config))


(defn build-repository-image-builder
  "The build-repository-image-builder function updates a RepositoryImage$Builder instance using the provided configuration.
  The function takes the RepositoryImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:credentials` |
"
  [^RepositoryImage$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (.build builder))


(defn build-repository-image-props-builder
  "The build-repository-image-props-builder function updates a RepositoryImageProps$Builder instance using the provided configuration.
  The function takes the RepositoryImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentials` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:credentials` |
"
  [^RepositoryImageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (.build builder))


(defn repository-image-props-builder
  ""
  [id config]
  (build-repository-image-props-builder (new RepositoryImageProps$Builder) id config))


(defn build-request-count-scaling-props-builder
  "The build-request-count-scaling-props-builder function updates a RequestCountScalingProps$Builder instance using the provided configuration.
  The function takes the RequestCountScalingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `requestsPerTarget` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requests-per-target` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetGroup` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup | [[cdk.support/lookup-entry]] | `:target-group` |
"
  [^RequestCountScalingProps$Builder builder id config]
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
  (.build builder))


(defn request-count-scaling-props-builder
  ""
  [id config]
  (build-request-count-scaling-props-builder (new RequestCountScalingProps$Builder) id config))


(defn build-runtime-platform-builder
  "The build-runtime-platform-builder function updates a RuntimePlatform$Builder instance using the provided configuration.
  The function takes the RuntimePlatform$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuArchitecture` | software.amazon.awscdk.services.ecs.CpuArchitecture | [[cdk.support/lookup-entry]] | `:cpu-architecture` |
| `operatingSystemFamily` | software.amazon.awscdk.services.ecs.OperatingSystemFamily | [[cdk.support/lookup-entry]] | `:operating-system-family` |
"
  [^RuntimePlatform$Builder builder id config]
  (when-let [data (lookup-entry config id :cpu-architecture)]
    (. builder cpuArchitecture data))
  (when-let [data (lookup-entry config id :operating-system-family)]
    (. builder operatingSystemFamily data))
  (.build builder))


(defn runtime-platform-builder
  ""
  [id config]
  (build-runtime-platform-builder (new RuntimePlatform$Builder) id config))


(defn build-scalable-task-count-builder
  "The build-scalable-task-count-builder function updates a ScalableTaskCount$Builder instance using the provided configuration.
  The function takes the ScalableTaskCount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |
"
  [^ScalableTaskCount$Builder builder id config]
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
  (.build builder))


(defn scalable-task-count-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-scalable-task-count-builder (ScalableTaskCount$Builder/create scope (name id)) id config))


(defn build-scalable-task-count-props-builder
  "The build-scalable-task-count-props-builder function updates a ScalableTaskCountProps$Builder instance using the provided configuration.
  The function takes the ScalableTaskCountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimension` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `serviceNamespace` | software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace | [[cdk.api.services.applicationautoscaling/service-namespace]] | `:service-namespace` |
"
  [^ScalableTaskCountProps$Builder builder id config]
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
  (.build builder))


(defn scalable-task-count-props-builder
  ""
  [id config]
  (build-scalable-task-count-props-builder (new ScalableTaskCountProps$Builder) id config))


(defn build-scratch-space-builder
  "The build-scratch-space-builder function updates a ScratchSpace$Builder instance using the provided configuration.
  The function takes the ScratchSpace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^ScratchSpace$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn scratch-space-builder
  ""
  [id config]
  (build-scratch-space-builder (new ScratchSpace$Builder) id config))


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
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (when-let [data (lookup-entry config id :version-stage)]
    (. builder versionStage data))
  (.build builder))


(defn secret-version-info-builder
  ""
  [id config]
  (build-secret-version-info-builder (new SecretVersionInfo$Builder) id config))


(defn build-service-connect-builder
  "The build-service-connect-builder function updates a ServiceConnect$Builder instance using the provided configuration.
  The function takes the ServiceConnect$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appProtocol` | software.amazon.awscdk.services.ecs.AppProtocol | [[cdk.support/lookup-entry]] | `:app-protocol` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `containerPortRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-port-range` |
| `hostPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:host-port` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^ServiceConnect$Builder builder id config]
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
  (.build builder))


(defn build-service-connect-props-builder
  "The build-service-connect-props-builder function updates a ServiceConnectProps$Builder instance using the provided configuration.
  The function takes the ServiceConnectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `services` | java.util.List | [[cdk.support/lookup-entry]] | `:services` |
"
  [^ServiceConnectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :services)]
    (. builder services data))
  (.build builder))


(defn service-connect-props-builder
  ""
  [id config]
  (build-service-connect-props-builder (new ServiceConnectProps$Builder) id config))


(defn build-service-connect-service-builder
  "The build-service-connect-service-builder function updates a ServiceConnectService$Builder instance using the provided configuration.
  The function takes the ServiceConnectService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `discoveryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-name` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `ingressPortOverride` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingress-port-override` |
| `perRequestTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:per-request-timeout` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `portMappingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:port-mapping-name` |
"
  [^ServiceConnectService$Builder builder id config]
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
  (.build builder))


(defn service-connect-service-builder
  ""
  [id config]
  (build-service-connect-service-builder (new ServiceConnectService$Builder) id config))


(defn build-service-managed-ebs-volume-configuration-builder
  "The build-service-managed-ebs-volume-configuration-builder function updates a ServiceManagedEBSVolumeConfiguration$Builder instance using the provided configuration.
  The function takes the ServiceManagedEBSVolumeConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |
"
  [^ServiceManagedEBSVolumeConfiguration$Builder builder id config]
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
  (.build builder))


(defn service-managed-ebs-volume-configuration-builder
  ""
  [id config]
  (build-service-managed-ebs-volume-configuration-builder (new ServiceManagedEBSVolumeConfiguration$Builder) id config))


(defn build-service-managed-volume-builder
  "The build-service-managed-volume-builder function updates a ServiceManagedVolume$Builder instance using the provided configuration.
  The function takes the ServiceManagedVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ServiceManagedVolume$Builder builder id config]
  (when-let [data (lookup-entry config id :managed-ebs-volume)]
    (. builder managedEbsVolume data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn service-managed-volume-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-service-managed-volume-builder (ServiceManagedVolume$Builder/create scope (name id)) id config))


(defn build-service-managed-volume-props-builder
  "The build-service-managed-volume-props-builder function updates a ServiceManagedVolumeProps$Builder instance using the provided configuration.
  The function takes the ServiceManagedVolumeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedEbsVolume` | software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration | [[cdk.support/lookup-entry]] | `:managed-ebs-volume` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ServiceManagedVolumeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :managed-ebs-volume)]
    (. builder managedEbsVolume data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn service-managed-volume-props-builder
  ""
  [id config]
  (build-service-managed-volume-props-builder (new ServiceManagedVolumeProps$Builder) id config))


(defn build-splunk-log-driver-builder
  "The build-splunk-log-driver-builder function updates a SplunkLogDriver$Builder instance using the provided configuration.
  The function takes the SplunkLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `verifyConnection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verify-connection` |
"
  [^SplunkLogDriver$Builder builder id config]
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
  (.build builder))


(defn splunk-log-driver-builder
  ""
  [id config]
  (build-splunk-log-driver-builder (SplunkLogDriver$Builder/create) id config))


(defn build-splunk-log-driver-props-builder
  "The build-splunk-log-driver-props-builder function updates a SplunkLogDriverProps$Builder instance using the provided configuration.
  The function takes the SplunkLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `verifyConnection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verify-connection` |
"
  [^SplunkLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn splunk-log-driver-props-builder
  ""
  [id config]
  (build-splunk-log-driver-props-builder (new SplunkLogDriverProps$Builder) id config))


(defn build-syslog-log-driver-builder
  "The build-syslog-log-driver-builder function updates a SyslogLogDriver$Builder instance using the provided configuration.
  The function takes the SyslogLogDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tlsSkipVerify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-skip-verify` |
"
  [^SyslogLogDriver$Builder builder id config]
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
  (.build builder))


(defn syslog-log-driver-builder
  ""
  [id config]
  (build-syslog-log-driver-builder (SyslogLogDriver$Builder/create) id config))


(defn build-syslog-log-driver-props-builder
  "The build-syslog-log-driver-props-builder function updates a SyslogLogDriverProps$Builder instance using the provided configuration.
  The function takes the SyslogLogDriverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tlsSkipVerify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:tls-skip-verify` |
"
  [^SyslogLogDriverProps$Builder builder id config]
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
  (.build builder))


(defn syslog-log-driver-props-builder
  ""
  [id config]
  (build-syslog-log-driver-props-builder (new SyslogLogDriverProps$Builder) id config))


(defn build-system-control-builder
  "The build-system-control-builder function updates a SystemControl$Builder instance using the provided configuration.
  The function takes the SystemControl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^SystemControl$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn system-control-builder
  ""
  [id config]
  (build-system-control-builder (new SystemControl$Builder) id config))


(defn build-task-definition-attributes-builder
  "The build-task-definition-attributes-builder function updates a TaskDefinitionAttributes$Builder instance using the provided configuration.
  The function takes the TaskDefinitionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibility` | software.amazon.awscdk.services.ecs.Compatibility | [[cdk.api.services.ecs/compatibility]] | `:compatibility` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `networkMode` | software.amazon.awscdk.services.ecs.NetworkMode | [[cdk.api.services.ecs/network-mode]] | `:network-mode` |
| `taskDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-arn` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^TaskDefinitionAttributes$Builder builder id config]
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
  (.build builder))


(defn task-definition-attributes-builder
  ""
  [id config]
  (build-task-definition-attributes-builder (new TaskDefinitionAttributes$Builder) id config))


(defn build-task-definition-builder
  "The build-task-definition-builder function updates a TaskDefinition$Builder instance using the provided configuration.
  The function takes the TaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^TaskDefinition$Builder builder id config]
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
  (.build builder))


(defn task-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-task-definition-builder (TaskDefinition$Builder/create scope (name id)) id config))


(defn build-task-definition-props-builder
  "The build-task-definition-props-builder function updates a TaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the TaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^TaskDefinitionProps$Builder builder id config]
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
  (.build builder))


(defn task-definition-props-builder
  ""
  [id config]
  (build-task-definition-props-builder (new TaskDefinitionProps$Builder) id config))


(defn build-tmpfs-builder
  "The build-tmpfs-builder function updates a Tmpfs$Builder instance using the provided configuration.
  The function takes the Tmpfs$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-path` |
| `mountOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:mount-options` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
"
  [^Tmpfs$Builder builder id config]
  (when-let [data (lookup-entry config id :container-path)]
    (. builder containerPath data))
  (when-let [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (.build builder))


(defn tmpfs-builder
  ""
  [id config]
  (build-tmpfs-builder (new Tmpfs$Builder) id config))


(defn build-track-custom-metric-props-builder
  "The build-track-custom-metric-props-builder function updates a TrackCustomMetricProps$Builder instance using the provided configuration.
  The function takes the TrackCustomMetricProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `metric` | software.amazon.awscdk.services.cloudwatch.IMetric | [[cdk.support/lookup-entry]] | `:metric` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^TrackCustomMetricProps$Builder builder id config]
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
  (.build builder))


(defn track-custom-metric-props-builder
  ""
  [id config]
  (build-track-custom-metric-props-builder (new TrackCustomMetricProps$Builder) id config))


(defn build-ulimit-builder
  "The build-ulimit-builder function updates a Ulimit$Builder instance using the provided configuration.
  The function takes the Ulimit$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `name` | software.amazon.awscdk.services.ecs.UlimitName | [[cdk.api.services.ecs/ulimit-name]] | `:name` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |
"
  [^Ulimit$Builder builder id config]
  (when-let [data (lookup-entry config id :hard-limit)]
    (. builder hardLimit data))
  (when-let [data (ulimit-name config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :soft-limit)]
    (. builder softLimit data))
  (.build builder))


(defn ulimit-builder
  ""
  [id config]
  (build-ulimit-builder (new Ulimit$Builder) id config))


(defn build-volume-builder
  "The build-volume-builder function updates a Volume$Builder instance using the provided configuration.
  The function takes the Volume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuredAtLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configured-at-launch` |
| `dockerVolumeConfiguration` | software.amazon.awscdk.services.ecs.DockerVolumeConfiguration | [[cdk.support/lookup-entry]] | `:docker-volume-configuration` |
| `efsVolumeConfiguration` | software.amazon.awscdk.services.ecs.EfsVolumeConfiguration | [[cdk.support/lookup-entry]] | `:efs-volume-configuration` |
| `host` | software.amazon.awscdk.services.ecs.Host | [[cdk.support/lookup-entry]] | `:host` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^Volume$Builder builder id config]
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
  (.build builder))


(defn volume-builder
  ""
  [id config]
  (build-volume-builder (new Volume$Builder) id config))


(defn build-volume-from-builder
  "The build-volume-from-builder function updates a VolumeFrom$Builder instance using the provided configuration.
  The function takes the VolumeFrom$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `sourceContainer` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-container` |
"
  [^VolumeFrom$Builder builder id config]
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :source-container)]
    (. builder sourceContainer data))
  (.build builder))


(defn volume-from-builder
  ""
  [id config]
  (build-volume-from-builder (new VolumeFrom$Builder) id config))