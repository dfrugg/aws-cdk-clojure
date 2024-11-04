(ns cdk.api.services.ecs-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.ecs :refer [alarm-behavior
                                          ami-hardware-type
                                          aws-log-driver-mode
                                          bin-pack-resource
                                          bottlerocket-ecs-variant
                                          capability
                                          compatibility
                                          container-dependency-condition
                                          deployment-controller-type
                                          device-permission
                                          ebs-propagated-tag-source
                                          environment-file-type
                                          execute-command-logging
                                          fargate-platform-version
                                          file-system-type
                                          firelens-config-file-type
                                          firelens-log-router-type
                                          gelf-compression-type
                                          ipc-mode
                                          launch-type
                                          machine-image-type
                                          network-mode
                                          pid-mode
                                          propagated-tag-source
                                          protocol
                                          scope
                                          splunk-log-format
                                          tmpfs-mount-option
                                          ulimit-name
                                          windows-optimized-version]])
  (:import [software.amazon.awscdk.services.ecs AlarmBehavior
                                                AmiHardwareType
                                                AwsLogDriverMode
                                                BinPackResource
                                                BottlerocketEcsVariant
                                                Capability
                                                Compatibility
                                                ContainerDependencyCondition
                                                DeploymentControllerType
                                                DevicePermission
                                                EbsPropagatedTagSource
                                                EnvironmentFileType
                                                ExecuteCommandLogging
                                                FargatePlatformVersion
                                                FileSystemType
                                                FirelensConfigFileType
                                                FirelensLogRouterType
                                                GelfCompressionType
                                                IpcMode
                                                LaunchType
                                                MachineImageType
                                                NetworkMode
                                                PidMode
                                                PropagatedTagSource
                                                Protocol
                                                Scope
                                                SplunkLogFormat
                                                TmpfsMountOption
                                                UlimitName
                                                WindowsOptimizedVersion]))


(deftest alarm-behavior-test
  (testing "Testing enum function alarm-behavior"
    (is (= AlarmBehavior/FAIL_ON_ALARM (alarm-behavior {:item AlarmBehavior/FAIL_ON_ALARM} "test" :item)))
    (is (= AlarmBehavior/FAIL_ON_ALARM (alarm-behavior {:test/item AlarmBehavior/FAIL_ON_ALARM} "test" :item)))
    (is (= AlarmBehavior/ROLLBACK_ON_ALARM (alarm-behavior {:item AlarmBehavior/ROLLBACK_ON_ALARM} "test" :item)))
    (is (= AlarmBehavior/ROLLBACK_ON_ALARM (alarm-behavior {:test/item AlarmBehavior/ROLLBACK_ON_ALARM} "test" :item)))
    (is (= AlarmBehavior/FAIL_ON_ALARM (alarm-behavior {:item :fail-on-alarm} "test" :item)))
    (is (= AlarmBehavior/FAIL_ON_ALARM (alarm-behavior {:test/item :fail-on-alarm} "test" :item)))
    (is (= AlarmBehavior/ROLLBACK_ON_ALARM (alarm-behavior {:item :rollback-on-alarm} "test" :item)))
    (is (= AlarmBehavior/ROLLBACK_ON_ALARM (alarm-behavior {:test/item :rollback-on-alarm} "test" :item)))))


(deftest ami-hardware-type-test
  (testing "Testing enum function ami-hardware-type"
    (is (= AmiHardwareType/GPU (ami-hardware-type {:item AmiHardwareType/GPU} "test" :item)))
    (is (= AmiHardwareType/GPU (ami-hardware-type {:test/item AmiHardwareType/GPU} "test" :item)))
    (is (= AmiHardwareType/STANDARD (ami-hardware-type {:item AmiHardwareType/STANDARD} "test" :item)))
    (is (= AmiHardwareType/STANDARD (ami-hardware-type {:test/item AmiHardwareType/STANDARD} "test" :item)))
    (is (= AmiHardwareType/ARM (ami-hardware-type {:item AmiHardwareType/ARM} "test" :item)))
    (is (= AmiHardwareType/ARM (ami-hardware-type {:test/item AmiHardwareType/ARM} "test" :item)))
    (is (= AmiHardwareType/NEURON (ami-hardware-type {:item AmiHardwareType/NEURON} "test" :item)))
    (is (= AmiHardwareType/NEURON (ami-hardware-type {:test/item AmiHardwareType/NEURON} "test" :item)))
    (is (= AmiHardwareType/GPU (ami-hardware-type {:item :gpu} "test" :item)))
    (is (= AmiHardwareType/GPU (ami-hardware-type {:test/item :gpu} "test" :item)))
    (is (= AmiHardwareType/STANDARD (ami-hardware-type {:item :standard} "test" :item)))
    (is (= AmiHardwareType/STANDARD (ami-hardware-type {:test/item :standard} "test" :item)))
    (is (= AmiHardwareType/ARM (ami-hardware-type {:item :arm} "test" :item)))
    (is (= AmiHardwareType/ARM (ami-hardware-type {:test/item :arm} "test" :item)))
    (is (= AmiHardwareType/NEURON (ami-hardware-type {:item :neuron} "test" :item)))
    (is (= AmiHardwareType/NEURON (ami-hardware-type {:test/item :neuron} "test" :item)))))


(deftest aws-log-driver-mode-test
  (testing "Testing enum function aws-log-driver-mode"
    (is (= AwsLogDriverMode/NON_BLOCKING (aws-log-driver-mode {:item AwsLogDriverMode/NON_BLOCKING} "test" :item)))
    (is (= AwsLogDriverMode/NON_BLOCKING (aws-log-driver-mode {:test/item AwsLogDriverMode/NON_BLOCKING} "test" :item)))
    (is (= AwsLogDriverMode/BLOCKING (aws-log-driver-mode {:item AwsLogDriverMode/BLOCKING} "test" :item)))
    (is (= AwsLogDriverMode/BLOCKING (aws-log-driver-mode {:test/item AwsLogDriverMode/BLOCKING} "test" :item)))
    (is (= AwsLogDriverMode/NON_BLOCKING (aws-log-driver-mode {:item :non-blocking} "test" :item)))
    (is (= AwsLogDriverMode/NON_BLOCKING (aws-log-driver-mode {:test/item :non-blocking} "test" :item)))
    (is (= AwsLogDriverMode/BLOCKING (aws-log-driver-mode {:item :blocking} "test" :item)))
    (is (= AwsLogDriverMode/BLOCKING (aws-log-driver-mode {:test/item :blocking} "test" :item)))))


(deftest bin-pack-resource-test
  (testing "Testing enum function bin-pack-resource"
    (is (= BinPackResource/MEMORY (bin-pack-resource {:item BinPackResource/MEMORY} "test" :item)))
    (is (= BinPackResource/MEMORY (bin-pack-resource {:test/item BinPackResource/MEMORY} "test" :item)))
    (is (= BinPackResource/CPU (bin-pack-resource {:item BinPackResource/CPU} "test" :item)))
    (is (= BinPackResource/CPU (bin-pack-resource {:test/item BinPackResource/CPU} "test" :item)))
    (is (= BinPackResource/MEMORY (bin-pack-resource {:item :memory} "test" :item)))
    (is (= BinPackResource/MEMORY (bin-pack-resource {:test/item :memory} "test" :item)))
    (is (= BinPackResource/CPU (bin-pack-resource {:item :cpu} "test" :item)))
    (is (= BinPackResource/CPU (bin-pack-resource {:test/item :cpu} "test" :item)))))


(deftest bottlerocket-ecs-variant-test
  (testing "Testing enum function bottlerocket-ecs-variant"
    (is (= BottlerocketEcsVariant/AWS_ECS_2_NVIDIA (bottlerocket-ecs-variant {:item BottlerocketEcsVariant/AWS_ECS_2_NVIDIA} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2_NVIDIA (bottlerocket-ecs-variant {:test/item BottlerocketEcsVariant/AWS_ECS_2_NVIDIA} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1 (bottlerocket-ecs-variant {:item BottlerocketEcsVariant/AWS_ECS_1} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1 (bottlerocket-ecs-variant {:test/item BottlerocketEcsVariant/AWS_ECS_1} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2 (bottlerocket-ecs-variant {:item BottlerocketEcsVariant/AWS_ECS_2} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2 (bottlerocket-ecs-variant {:test/item BottlerocketEcsVariant/AWS_ECS_2} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1_NVIDIA (bottlerocket-ecs-variant {:item BottlerocketEcsVariant/AWS_ECS_1_NVIDIA} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1_NVIDIA (bottlerocket-ecs-variant {:test/item BottlerocketEcsVariant/AWS_ECS_1_NVIDIA} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2_NVIDIA (bottlerocket-ecs-variant {:item :aws-ecs-2-nvidia} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2_NVIDIA (bottlerocket-ecs-variant {:test/item :aws-ecs-2-nvidia} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1 (bottlerocket-ecs-variant {:item :aws-ecs-1} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1 (bottlerocket-ecs-variant {:test/item :aws-ecs-1} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2 (bottlerocket-ecs-variant {:item :aws-ecs-2} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_2 (bottlerocket-ecs-variant {:test/item :aws-ecs-2} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1_NVIDIA (bottlerocket-ecs-variant {:item :aws-ecs-1-nvidia} "test" :item)))
    (is (= BottlerocketEcsVariant/AWS_ECS_1_NVIDIA (bottlerocket-ecs-variant {:test/item :aws-ecs-1-nvidia} "test" :item)))))


(deftest capability-test
  (testing "Testing enum function capability"
    (is (= Capability/SYS_PACCT (capability {:item Capability/SYS_PACCT} "test" :item)))
    (is (= Capability/SYS_PACCT (capability {:test/item Capability/SYS_PACCT} "test" :item)))
    (is (= Capability/SYS_PTRACE (capability {:item Capability/SYS_PTRACE} "test" :item)))
    (is (= Capability/SYS_PTRACE (capability {:test/item Capability/SYS_PTRACE} "test" :item)))
    (is (= Capability/SYS_TTY_CONFIG (capability {:item Capability/SYS_TTY_CONFIG} "test" :item)))
    (is (= Capability/SYS_TTY_CONFIG (capability {:test/item Capability/SYS_TTY_CONFIG} "test" :item)))
    (is (= Capability/SYS_ADMIN (capability {:item Capability/SYS_ADMIN} "test" :item)))
    (is (= Capability/SYS_ADMIN (capability {:test/item Capability/SYS_ADMIN} "test" :item)))
    (is (= Capability/NET_ADMIN (capability {:item Capability/NET_ADMIN} "test" :item)))
    (is (= Capability/NET_ADMIN (capability {:test/item Capability/NET_ADMIN} "test" :item)))
    (is (= Capability/SYS_BOOT (capability {:item Capability/SYS_BOOT} "test" :item)))
    (is (= Capability/SYS_BOOT (capability {:test/item Capability/SYS_BOOT} "test" :item)))
    (is (= Capability/DAC_READ_SEARCH (capability {:item Capability/DAC_READ_SEARCH} "test" :item)))
    (is (= Capability/DAC_READ_SEARCH (capability {:test/item Capability/DAC_READ_SEARCH} "test" :item)))
    (is (= Capability/SYSLOG (capability {:item Capability/SYSLOG} "test" :item)))
    (is (= Capability/SYSLOG (capability {:test/item Capability/SYSLOG} "test" :item)))
    (is (= Capability/SETFCAP (capability {:item Capability/SETFCAP} "test" :item)))
    (is (= Capability/SETFCAP (capability {:test/item Capability/SETFCAP} "test" :item)))
    (is (= Capability/LINUX_IMMUTABLE (capability {:item Capability/LINUX_IMMUTABLE} "test" :item)))
    (is (= Capability/LINUX_IMMUTABLE (capability {:test/item Capability/LINUX_IMMUTABLE} "test" :item)))
    (is (= Capability/WAKE_ALARM (capability {:item Capability/WAKE_ALARM} "test" :item)))
    (is (= Capability/WAKE_ALARM (capability {:test/item Capability/WAKE_ALARM} "test" :item)))
    (is (= Capability/AUDIT_WRITE (capability {:item Capability/AUDIT_WRITE} "test" :item)))
    (is (= Capability/AUDIT_WRITE (capability {:test/item Capability/AUDIT_WRITE} "test" :item)))
    (is (= Capability/SYS_MODULE (capability {:item Capability/SYS_MODULE} "test" :item)))
    (is (= Capability/SYS_MODULE (capability {:test/item Capability/SYS_MODULE} "test" :item)))
    (is (= Capability/SYS_NICE (capability {:item Capability/SYS_NICE} "test" :item)))
    (is (= Capability/SYS_NICE (capability {:test/item Capability/SYS_NICE} "test" :item)))
    (is (= Capability/LEASE (capability {:item Capability/LEASE} "test" :item)))
    (is (= Capability/LEASE (capability {:test/item Capability/LEASE} "test" :item)))
    (is (= Capability/AUDIT_CONTROL (capability {:item Capability/AUDIT_CONTROL} "test" :item)))
    (is (= Capability/AUDIT_CONTROL (capability {:test/item Capability/AUDIT_CONTROL} "test" :item)))
    (is (= Capability/IPC_LOCK (capability {:item Capability/IPC_LOCK} "test" :item)))
    (is (= Capability/IPC_LOCK (capability {:test/item Capability/IPC_LOCK} "test" :item)))
    (is (= Capability/MAC_ADMIN (capability {:item Capability/MAC_ADMIN} "test" :item)))
    (is (= Capability/MAC_ADMIN (capability {:test/item Capability/MAC_ADMIN} "test" :item)))
    (is (= Capability/BLOCK_SUSPEND (capability {:item Capability/BLOCK_SUSPEND} "test" :item)))
    (is (= Capability/BLOCK_SUSPEND (capability {:test/item Capability/BLOCK_SUSPEND} "test" :item)))
    (is (= Capability/SYS_CHROOT (capability {:item Capability/SYS_CHROOT} "test" :item)))
    (is (= Capability/SYS_CHROOT (capability {:test/item Capability/SYS_CHROOT} "test" :item)))
    (is (= Capability/SYS_RESOURCE (capability {:item Capability/SYS_RESOURCE} "test" :item)))
    (is (= Capability/SYS_RESOURCE (capability {:test/item Capability/SYS_RESOURCE} "test" :item)))
    (is (= Capability/KILL (capability {:item Capability/KILL} "test" :item)))
    (is (= Capability/KILL (capability {:test/item Capability/KILL} "test" :item)))
    (is (= Capability/CHOWN (capability {:item Capability/CHOWN} "test" :item)))
    (is (= Capability/CHOWN (capability {:test/item Capability/CHOWN} "test" :item)))
    (is (= Capability/NET_BIND_SERVICE (capability {:item Capability/NET_BIND_SERVICE} "test" :item)))
    (is (= Capability/NET_BIND_SERVICE (capability {:test/item Capability/NET_BIND_SERVICE} "test" :item)))
    (is (= Capability/SYS_RAWIO (capability {:item Capability/SYS_RAWIO} "test" :item)))
    (is (= Capability/SYS_RAWIO (capability {:test/item Capability/SYS_RAWIO} "test" :item)))
    (is (= Capability/FSETID (capability {:item Capability/FSETID} "test" :item)))
    (is (= Capability/FSETID (capability {:test/item Capability/FSETID} "test" :item)))
    (is (= Capability/SETUID (capability {:item Capability/SETUID} "test" :item)))
    (is (= Capability/SETUID (capability {:test/item Capability/SETUID} "test" :item)))
    (is (= Capability/MAC_OVERRIDE (capability {:item Capability/MAC_OVERRIDE} "test" :item)))
    (is (= Capability/MAC_OVERRIDE (capability {:test/item Capability/MAC_OVERRIDE} "test" :item)))
    (is (= Capability/NET_BROADCAST (capability {:item Capability/NET_BROADCAST} "test" :item)))
    (is (= Capability/NET_BROADCAST (capability {:test/item Capability/NET_BROADCAST} "test" :item)))
    (is (= Capability/SYS_TIME (capability {:item Capability/SYS_TIME} "test" :item)))
    (is (= Capability/SYS_TIME (capability {:test/item Capability/SYS_TIME} "test" :item)))
    (is (= Capability/SETGID (capability {:item Capability/SETGID} "test" :item)))
    (is (= Capability/SETGID (capability {:test/item Capability/SETGID} "test" :item)))
    (is (= Capability/DAC_OVERRIDE (capability {:item Capability/DAC_OVERRIDE} "test" :item)))
    (is (= Capability/DAC_OVERRIDE (capability {:test/item Capability/DAC_OVERRIDE} "test" :item)))
    (is (= Capability/FOWNER (capability {:item Capability/FOWNER} "test" :item)))
    (is (= Capability/FOWNER (capability {:test/item Capability/FOWNER} "test" :item)))
    (is (= Capability/NET_RAW (capability {:item Capability/NET_RAW} "test" :item)))
    (is (= Capability/NET_RAW (capability {:test/item Capability/NET_RAW} "test" :item)))
    (is (= Capability/IPC_OWNER (capability {:item Capability/IPC_OWNER} "test" :item)))
    (is (= Capability/IPC_OWNER (capability {:test/item Capability/IPC_OWNER} "test" :item)))
    (is (= Capability/MKNOD (capability {:item Capability/MKNOD} "test" :item)))
    (is (= Capability/MKNOD (capability {:test/item Capability/MKNOD} "test" :item)))
    (is (= Capability/SETPCAP (capability {:item Capability/SETPCAP} "test" :item)))
    (is (= Capability/SETPCAP (capability {:test/item Capability/SETPCAP} "test" :item)))
    (is (= Capability/ALL (capability {:item Capability/ALL} "test" :item)))
    (is (= Capability/ALL (capability {:test/item Capability/ALL} "test" :item)))
    (is (= Capability/SYS_PACCT (capability {:item :sys-pacct} "test" :item)))
    (is (= Capability/SYS_PACCT (capability {:test/item :sys-pacct} "test" :item)))
    (is (= Capability/SYS_PTRACE (capability {:item :sys-ptrace} "test" :item)))
    (is (= Capability/SYS_PTRACE (capability {:test/item :sys-ptrace} "test" :item)))
    (is (= Capability/SYS_TTY_CONFIG (capability {:item :sys-tty-config} "test" :item)))
    (is (= Capability/SYS_TTY_CONFIG (capability {:test/item :sys-tty-config} "test" :item)))
    (is (= Capability/SYS_ADMIN (capability {:item :sys-admin} "test" :item)))
    (is (= Capability/SYS_ADMIN (capability {:test/item :sys-admin} "test" :item)))
    (is (= Capability/NET_ADMIN (capability {:item :net-admin} "test" :item)))
    (is (= Capability/NET_ADMIN (capability {:test/item :net-admin} "test" :item)))
    (is (= Capability/SYS_BOOT (capability {:item :sys-boot} "test" :item)))
    (is (= Capability/SYS_BOOT (capability {:test/item :sys-boot} "test" :item)))
    (is (= Capability/DAC_READ_SEARCH (capability {:item :dac-read-search} "test" :item)))
    (is (= Capability/DAC_READ_SEARCH (capability {:test/item :dac-read-search} "test" :item)))
    (is (= Capability/SYSLOG (capability {:item :syslog} "test" :item)))
    (is (= Capability/SYSLOG (capability {:test/item :syslog} "test" :item)))
    (is (= Capability/SETFCAP (capability {:item :setfcap} "test" :item)))
    (is (= Capability/SETFCAP (capability {:test/item :setfcap} "test" :item)))
    (is (= Capability/LINUX_IMMUTABLE (capability {:item :linux-immutable} "test" :item)))
    (is (= Capability/LINUX_IMMUTABLE (capability {:test/item :linux-immutable} "test" :item)))
    (is (= Capability/WAKE_ALARM (capability {:item :wake-alarm} "test" :item)))
    (is (= Capability/WAKE_ALARM (capability {:test/item :wake-alarm} "test" :item)))
    (is (= Capability/AUDIT_WRITE (capability {:item :audit-write} "test" :item)))
    (is (= Capability/AUDIT_WRITE (capability {:test/item :audit-write} "test" :item)))
    (is (= Capability/SYS_MODULE (capability {:item :sys-module} "test" :item)))
    (is (= Capability/SYS_MODULE (capability {:test/item :sys-module} "test" :item)))
    (is (= Capability/SYS_NICE (capability {:item :sys-nice} "test" :item)))
    (is (= Capability/SYS_NICE (capability {:test/item :sys-nice} "test" :item)))
    (is (= Capability/LEASE (capability {:item :lease} "test" :item)))
    (is (= Capability/LEASE (capability {:test/item :lease} "test" :item)))
    (is (= Capability/AUDIT_CONTROL (capability {:item :audit-control} "test" :item)))
    (is (= Capability/AUDIT_CONTROL (capability {:test/item :audit-control} "test" :item)))
    (is (= Capability/IPC_LOCK (capability {:item :ipc-lock} "test" :item)))
    (is (= Capability/IPC_LOCK (capability {:test/item :ipc-lock} "test" :item)))
    (is (= Capability/MAC_ADMIN (capability {:item :mac-admin} "test" :item)))
    (is (= Capability/MAC_ADMIN (capability {:test/item :mac-admin} "test" :item)))
    (is (= Capability/BLOCK_SUSPEND (capability {:item :block-suspend} "test" :item)))
    (is (= Capability/BLOCK_SUSPEND (capability {:test/item :block-suspend} "test" :item)))
    (is (= Capability/SYS_CHROOT (capability {:item :sys-chroot} "test" :item)))
    (is (= Capability/SYS_CHROOT (capability {:test/item :sys-chroot} "test" :item)))
    (is (= Capability/SYS_RESOURCE (capability {:item :sys-resource} "test" :item)))
    (is (= Capability/SYS_RESOURCE (capability {:test/item :sys-resource} "test" :item)))
    (is (= Capability/KILL (capability {:item :kill} "test" :item)))
    (is (= Capability/KILL (capability {:test/item :kill} "test" :item)))
    (is (= Capability/CHOWN (capability {:item :chown} "test" :item)))
    (is (= Capability/CHOWN (capability {:test/item :chown} "test" :item)))
    (is (= Capability/NET_BIND_SERVICE (capability {:item :net-bind-service} "test" :item)))
    (is (= Capability/NET_BIND_SERVICE (capability {:test/item :net-bind-service} "test" :item)))
    (is (= Capability/SYS_RAWIO (capability {:item :sys-rawio} "test" :item)))
    (is (= Capability/SYS_RAWIO (capability {:test/item :sys-rawio} "test" :item)))
    (is (= Capability/FSETID (capability {:item :fsetid} "test" :item)))
    (is (= Capability/FSETID (capability {:test/item :fsetid} "test" :item)))
    (is (= Capability/SETUID (capability {:item :setuid} "test" :item)))
    (is (= Capability/SETUID (capability {:test/item :setuid} "test" :item)))
    (is (= Capability/MAC_OVERRIDE (capability {:item :mac-override} "test" :item)))
    (is (= Capability/MAC_OVERRIDE (capability {:test/item :mac-override} "test" :item)))
    (is (= Capability/NET_BROADCAST (capability {:item :net-broadcast} "test" :item)))
    (is (= Capability/NET_BROADCAST (capability {:test/item :net-broadcast} "test" :item)))
    (is (= Capability/SYS_TIME (capability {:item :sys-time} "test" :item)))
    (is (= Capability/SYS_TIME (capability {:test/item :sys-time} "test" :item)))
    (is (= Capability/SETGID (capability {:item :setgid} "test" :item)))
    (is (= Capability/SETGID (capability {:test/item :setgid} "test" :item)))
    (is (= Capability/DAC_OVERRIDE (capability {:item :dac-override} "test" :item)))
    (is (= Capability/DAC_OVERRIDE (capability {:test/item :dac-override} "test" :item)))
    (is (= Capability/FOWNER (capability {:item :fowner} "test" :item)))
    (is (= Capability/FOWNER (capability {:test/item :fowner} "test" :item)))
    (is (= Capability/NET_RAW (capability {:item :net-raw} "test" :item)))
    (is (= Capability/NET_RAW (capability {:test/item :net-raw} "test" :item)))
    (is (= Capability/IPC_OWNER (capability {:item :ipc-owner} "test" :item)))
    (is (= Capability/IPC_OWNER (capability {:test/item :ipc-owner} "test" :item)))
    (is (= Capability/MKNOD (capability {:item :mknod} "test" :item)))
    (is (= Capability/MKNOD (capability {:test/item :mknod} "test" :item)))
    (is (= Capability/SETPCAP (capability {:item :setpcap} "test" :item)))
    (is (= Capability/SETPCAP (capability {:test/item :setpcap} "test" :item)))
    (is (= Capability/ALL (capability {:item :all} "test" :item)))
    (is (= Capability/ALL (capability {:test/item :all} "test" :item)))))


(deftest compatibility-test
  (testing "Testing enum function compatibility"
    (is (= Compatibility/FARGATE (compatibility {:item Compatibility/FARGATE} "test" :item)))
    (is (= Compatibility/FARGATE (compatibility {:test/item Compatibility/FARGATE} "test" :item)))
    (is (= Compatibility/EXTERNAL (compatibility {:item Compatibility/EXTERNAL} "test" :item)))
    (is (= Compatibility/EXTERNAL (compatibility {:test/item Compatibility/EXTERNAL} "test" :item)))
    (is (= Compatibility/EC2 (compatibility {:item Compatibility/EC2} "test" :item)))
    (is (= Compatibility/EC2 (compatibility {:test/item Compatibility/EC2} "test" :item)))
    (is (= Compatibility/EC2_AND_FARGATE (compatibility {:item Compatibility/EC2_AND_FARGATE} "test" :item)))
    (is (= Compatibility/EC2_AND_FARGATE (compatibility {:test/item Compatibility/EC2_AND_FARGATE} "test" :item)))
    (is (= Compatibility/FARGATE (compatibility {:item :fargate} "test" :item)))
    (is (= Compatibility/FARGATE (compatibility {:test/item :fargate} "test" :item)))
    (is (= Compatibility/EXTERNAL (compatibility {:item :external} "test" :item)))
    (is (= Compatibility/EXTERNAL (compatibility {:test/item :external} "test" :item)))
    (is (= Compatibility/EC2 (compatibility {:item :ec2} "test" :item)))
    (is (= Compatibility/EC2 (compatibility {:test/item :ec2} "test" :item)))
    (is (= Compatibility/EC2_AND_FARGATE (compatibility {:item :ec2-and-fargate} "test" :item)))
    (is (= Compatibility/EC2_AND_FARGATE (compatibility {:test/item :ec2-and-fargate} "test" :item)))))


(deftest container-dependency-condition-test
  (testing "Testing enum function container-dependency-condition"
    (is (= ContainerDependencyCondition/COMPLETE (container-dependency-condition {:item ContainerDependencyCondition/COMPLETE} "test" :item)))
    (is (= ContainerDependencyCondition/COMPLETE (container-dependency-condition {:test/item ContainerDependencyCondition/COMPLETE} "test" :item)))
    (is (= ContainerDependencyCondition/START (container-dependency-condition {:item ContainerDependencyCondition/START} "test" :item)))
    (is (= ContainerDependencyCondition/START (container-dependency-condition {:test/item ContainerDependencyCondition/START} "test" :item)))
    (is (= ContainerDependencyCondition/HEALTHY (container-dependency-condition {:item ContainerDependencyCondition/HEALTHY} "test" :item)))
    (is (= ContainerDependencyCondition/HEALTHY (container-dependency-condition {:test/item ContainerDependencyCondition/HEALTHY} "test" :item)))
    (is (= ContainerDependencyCondition/SUCCESS (container-dependency-condition {:item ContainerDependencyCondition/SUCCESS} "test" :item)))
    (is (= ContainerDependencyCondition/SUCCESS (container-dependency-condition {:test/item ContainerDependencyCondition/SUCCESS} "test" :item)))
    (is (= ContainerDependencyCondition/COMPLETE (container-dependency-condition {:item :complete} "test" :item)))
    (is (= ContainerDependencyCondition/COMPLETE (container-dependency-condition {:test/item :complete} "test" :item)))
    (is (= ContainerDependencyCondition/START (container-dependency-condition {:item :start} "test" :item)))
    (is (= ContainerDependencyCondition/START (container-dependency-condition {:test/item :start} "test" :item)))
    (is (= ContainerDependencyCondition/HEALTHY (container-dependency-condition {:item :healthy} "test" :item)))
    (is (= ContainerDependencyCondition/HEALTHY (container-dependency-condition {:test/item :healthy} "test" :item)))
    (is (= ContainerDependencyCondition/SUCCESS (container-dependency-condition {:item :success} "test" :item)))
    (is (= ContainerDependencyCondition/SUCCESS (container-dependency-condition {:test/item :success} "test" :item)))))


(deftest deployment-controller-type-test
  (testing "Testing enum function deployment-controller-type"
    (is (= DeploymentControllerType/ECS (deployment-controller-type {:item DeploymentControllerType/ECS} "test" :item)))
    (is (= DeploymentControllerType/ECS (deployment-controller-type {:test/item DeploymentControllerType/ECS} "test" :item)))
    (is (= DeploymentControllerType/EXTERNAL (deployment-controller-type {:item DeploymentControllerType/EXTERNAL} "test" :item)))
    (is (= DeploymentControllerType/EXTERNAL (deployment-controller-type {:test/item DeploymentControllerType/EXTERNAL} "test" :item)))
    (is (= DeploymentControllerType/CODE_DEPLOY (deployment-controller-type {:item DeploymentControllerType/CODE_DEPLOY} "test" :item)))
    (is (= DeploymentControllerType/CODE_DEPLOY (deployment-controller-type {:test/item DeploymentControllerType/CODE_DEPLOY} "test" :item)))
    (is (= DeploymentControllerType/ECS (deployment-controller-type {:item :ecs} "test" :item)))
    (is (= DeploymentControllerType/ECS (deployment-controller-type {:test/item :ecs} "test" :item)))
    (is (= DeploymentControllerType/EXTERNAL (deployment-controller-type {:item :external} "test" :item)))
    (is (= DeploymentControllerType/EXTERNAL (deployment-controller-type {:test/item :external} "test" :item)))
    (is (= DeploymentControllerType/CODE_DEPLOY (deployment-controller-type {:item :code-deploy} "test" :item)))
    (is (= DeploymentControllerType/CODE_DEPLOY (deployment-controller-type {:test/item :code-deploy} "test" :item)))))


(deftest device-permission-test
  (testing "Testing enum function device-permission"
    (is (= DevicePermission/MKNOD (device-permission {:item DevicePermission/MKNOD} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:test/item DevicePermission/MKNOD} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:item DevicePermission/READ} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:test/item DevicePermission/READ} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:item DevicePermission/WRITE} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:test/item DevicePermission/WRITE} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:item :mknod} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:test/item :mknod} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:item :read} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:test/item :read} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:item :write} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:test/item :write} "test" :item)))))


(deftest ebs-propagated-tag-source-test
  (testing "Testing enum function ebs-propagated-tag-source"
    (is (= EbsPropagatedTagSource/TASK_DEFINITION (ebs-propagated-tag-source {:item EbsPropagatedTagSource/TASK_DEFINITION} "test" :item)))
    (is (= EbsPropagatedTagSource/TASK_DEFINITION (ebs-propagated-tag-source {:test/item EbsPropagatedTagSource/TASK_DEFINITION} "test" :item)))
    (is (= EbsPropagatedTagSource/SERVICE (ebs-propagated-tag-source {:item EbsPropagatedTagSource/SERVICE} "test" :item)))
    (is (= EbsPropagatedTagSource/SERVICE (ebs-propagated-tag-source {:test/item EbsPropagatedTagSource/SERVICE} "test" :item)))
    (is (= EbsPropagatedTagSource/TASK_DEFINITION (ebs-propagated-tag-source {:item :task-definition} "test" :item)))
    (is (= EbsPropagatedTagSource/TASK_DEFINITION (ebs-propagated-tag-source {:test/item :task-definition} "test" :item)))
    (is (= EbsPropagatedTagSource/SERVICE (ebs-propagated-tag-source {:item :service} "test" :item)))
    (is (= EbsPropagatedTagSource/SERVICE (ebs-propagated-tag-source {:test/item :service} "test" :item)))))


(deftest environment-file-type-test
  (testing "Testing enum function environment-file-type"
    (is (= EnvironmentFileType/S3 (environment-file-type {:item EnvironmentFileType/S3} "test" :item)))
    (is (= EnvironmentFileType/S3 (environment-file-type {:test/item EnvironmentFileType/S3} "test" :item)))
    (is (= EnvironmentFileType/S3 (environment-file-type {:item :s3} "test" :item)))
    (is (= EnvironmentFileType/S3 (environment-file-type {:test/item :s3} "test" :item)))))


(deftest execute-command-logging-test
  (testing "Testing enum function execute-command-logging"
    (is (= ExecuteCommandLogging/DEFAULT (execute-command-logging {:item ExecuteCommandLogging/DEFAULT} "test" :item)))
    (is (= ExecuteCommandLogging/DEFAULT (execute-command-logging {:test/item ExecuteCommandLogging/DEFAULT} "test" :item)))
    (is (= ExecuteCommandLogging/OVERRIDE (execute-command-logging {:item ExecuteCommandLogging/OVERRIDE} "test" :item)))
    (is (= ExecuteCommandLogging/OVERRIDE (execute-command-logging {:test/item ExecuteCommandLogging/OVERRIDE} "test" :item)))
    (is (= ExecuteCommandLogging/NONE (execute-command-logging {:item ExecuteCommandLogging/NONE} "test" :item)))
    (is (= ExecuteCommandLogging/NONE (execute-command-logging {:test/item ExecuteCommandLogging/NONE} "test" :item)))
    (is (= ExecuteCommandLogging/DEFAULT (execute-command-logging {:item :default} "test" :item)))
    (is (= ExecuteCommandLogging/DEFAULT (execute-command-logging {:test/item :default} "test" :item)))
    (is (= ExecuteCommandLogging/OVERRIDE (execute-command-logging {:item :override} "test" :item)))
    (is (= ExecuteCommandLogging/OVERRIDE (execute-command-logging {:test/item :override} "test" :item)))
    (is (= ExecuteCommandLogging/NONE (execute-command-logging {:item :none} "test" :item)))
    (is (= ExecuteCommandLogging/NONE (execute-command-logging {:test/item :none} "test" :item)))))


(deftest fargate-platform-version-test
  (testing "Testing enum function fargate-platform-version"
    (is (= FargatePlatformVersion/VERSION1_1 (fargate-platform-version {:item FargatePlatformVersion/VERSION1_1} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_1 (fargate-platform-version {:test/item FargatePlatformVersion/VERSION1_1} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_2 (fargate-platform-version {:item FargatePlatformVersion/VERSION1_2} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_2 (fargate-platform-version {:test/item FargatePlatformVersion/VERSION1_2} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_3 (fargate-platform-version {:item FargatePlatformVersion/VERSION1_3} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_3 (fargate-platform-version {:test/item FargatePlatformVersion/VERSION1_3} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_4 (fargate-platform-version {:item FargatePlatformVersion/VERSION1_4} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_4 (fargate-platform-version {:test/item FargatePlatformVersion/VERSION1_4} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_0 (fargate-platform-version {:item FargatePlatformVersion/VERSION1_0} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_0 (fargate-platform-version {:test/item FargatePlatformVersion/VERSION1_0} "test" :item)))
    (is (= FargatePlatformVersion/LATEST (fargate-platform-version {:item FargatePlatformVersion/LATEST} "test" :item)))
    (is (= FargatePlatformVersion/LATEST (fargate-platform-version {:test/item FargatePlatformVersion/LATEST} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_1 (fargate-platform-version {:item :version1-1} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_1 (fargate-platform-version {:test/item :version1-1} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_2 (fargate-platform-version {:item :version1-2} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_2 (fargate-platform-version {:test/item :version1-2} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_3 (fargate-platform-version {:item :version1-3} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_3 (fargate-platform-version {:test/item :version1-3} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_4 (fargate-platform-version {:item :version1-4} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_4 (fargate-platform-version {:test/item :version1-4} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_0 (fargate-platform-version {:item :version1-0} "test" :item)))
    (is (= FargatePlatformVersion/VERSION1_0 (fargate-platform-version {:test/item :version1-0} "test" :item)))
    (is (= FargatePlatformVersion/LATEST (fargate-platform-version {:item :latest} "test" :item)))
    (is (= FargatePlatformVersion/LATEST (fargate-platform-version {:test/item :latest} "test" :item)))))


(deftest file-system-type-test
  (testing "Testing enum function file-system-type"
    (is (= FileSystemType/XFS (file-system-type {:item FileSystemType/XFS} "test" :item)))
    (is (= FileSystemType/XFS (file-system-type {:test/item FileSystemType/XFS} "test" :item)))
    (is (= FileSystemType/EXT3 (file-system-type {:item FileSystemType/EXT3} "test" :item)))
    (is (= FileSystemType/EXT3 (file-system-type {:test/item FileSystemType/EXT3} "test" :item)))
    (is (= FileSystemType/EXT4 (file-system-type {:item FileSystemType/EXT4} "test" :item)))
    (is (= FileSystemType/EXT4 (file-system-type {:test/item FileSystemType/EXT4} "test" :item)))
    (is (= FileSystemType/XFS (file-system-type {:item :xfs} "test" :item)))
    (is (= FileSystemType/XFS (file-system-type {:test/item :xfs} "test" :item)))
    (is (= FileSystemType/EXT3 (file-system-type {:item :ext3} "test" :item)))
    (is (= FileSystemType/EXT3 (file-system-type {:test/item :ext3} "test" :item)))
    (is (= FileSystemType/EXT4 (file-system-type {:item :ext4} "test" :item)))
    (is (= FileSystemType/EXT4 (file-system-type {:test/item :ext4} "test" :item)))))


(deftest firelens-config-file-type-test
  (testing "Testing enum function firelens-config-file-type"
    (is (= FirelensConfigFileType/S3 (firelens-config-file-type {:item FirelensConfigFileType/S3} "test" :item)))
    (is (= FirelensConfigFileType/S3 (firelens-config-file-type {:test/item FirelensConfigFileType/S3} "test" :item)))
    (is (= FirelensConfigFileType/FILE (firelens-config-file-type {:item FirelensConfigFileType/FILE} "test" :item)))
    (is (= FirelensConfigFileType/FILE (firelens-config-file-type {:test/item FirelensConfigFileType/FILE} "test" :item)))
    (is (= FirelensConfigFileType/S3 (firelens-config-file-type {:item :s3} "test" :item)))
    (is (= FirelensConfigFileType/S3 (firelens-config-file-type {:test/item :s3} "test" :item)))
    (is (= FirelensConfigFileType/FILE (firelens-config-file-type {:item :file} "test" :item)))
    (is (= FirelensConfigFileType/FILE (firelens-config-file-type {:test/item :file} "test" :item)))))


(deftest firelens-log-router-type-test
  (testing "Testing enum function firelens-log-router-type"
    (is (= FirelensLogRouterType/FLUENTD (firelens-log-router-type {:item FirelensLogRouterType/FLUENTD} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTD (firelens-log-router-type {:test/item FirelensLogRouterType/FLUENTD} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTBIT (firelens-log-router-type {:item FirelensLogRouterType/FLUENTBIT} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTBIT (firelens-log-router-type {:test/item FirelensLogRouterType/FLUENTBIT} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTD (firelens-log-router-type {:item :fluentd} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTD (firelens-log-router-type {:test/item :fluentd} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTBIT (firelens-log-router-type {:item :fluentbit} "test" :item)))
    (is (= FirelensLogRouterType/FLUENTBIT (firelens-log-router-type {:test/item :fluentbit} "test" :item)))))


(deftest gelf-compression-type-test
  (testing "Testing enum function gelf-compression-type"
    (is (= GelfCompressionType/NONE (gelf-compression-type {:item GelfCompressionType/NONE} "test" :item)))
    (is (= GelfCompressionType/NONE (gelf-compression-type {:test/item GelfCompressionType/NONE} "test" :item)))
    (is (= GelfCompressionType/GZIP (gelf-compression-type {:item GelfCompressionType/GZIP} "test" :item)))
    (is (= GelfCompressionType/GZIP (gelf-compression-type {:test/item GelfCompressionType/GZIP} "test" :item)))
    (is (= GelfCompressionType/ZLIB (gelf-compression-type {:item GelfCompressionType/ZLIB} "test" :item)))
    (is (= GelfCompressionType/ZLIB (gelf-compression-type {:test/item GelfCompressionType/ZLIB} "test" :item)))
    (is (= GelfCompressionType/NONE (gelf-compression-type {:item :none} "test" :item)))
    (is (= GelfCompressionType/NONE (gelf-compression-type {:test/item :none} "test" :item)))
    (is (= GelfCompressionType/GZIP (gelf-compression-type {:item :gzip} "test" :item)))
    (is (= GelfCompressionType/GZIP (gelf-compression-type {:test/item :gzip} "test" :item)))
    (is (= GelfCompressionType/ZLIB (gelf-compression-type {:item :zlib} "test" :item)))
    (is (= GelfCompressionType/ZLIB (gelf-compression-type {:test/item :zlib} "test" :item)))))


(deftest ipc-mode-test
  (testing "Testing enum function ipc-mode"
    (is (= IpcMode/TASK (ipc-mode {:item IpcMode/TASK} "test" :item)))
    (is (= IpcMode/TASK (ipc-mode {:test/item IpcMode/TASK} "test" :item)))
    (is (= IpcMode/HOST (ipc-mode {:item IpcMode/HOST} "test" :item)))
    (is (= IpcMode/HOST (ipc-mode {:test/item IpcMode/HOST} "test" :item)))
    (is (= IpcMode/NONE (ipc-mode {:item IpcMode/NONE} "test" :item)))
    (is (= IpcMode/NONE (ipc-mode {:test/item IpcMode/NONE} "test" :item)))
    (is (= IpcMode/TASK (ipc-mode {:item :task} "test" :item)))
    (is (= IpcMode/TASK (ipc-mode {:test/item :task} "test" :item)))
    (is (= IpcMode/HOST (ipc-mode {:item :host} "test" :item)))
    (is (= IpcMode/HOST (ipc-mode {:test/item :host} "test" :item)))
    (is (= IpcMode/NONE (ipc-mode {:item :none} "test" :item)))
    (is (= IpcMode/NONE (ipc-mode {:test/item :none} "test" :item)))))


(deftest launch-type-test
  (testing "Testing enum function launch-type"
    (is (= LaunchType/FARGATE (launch-type {:item LaunchType/FARGATE} "test" :item)))
    (is (= LaunchType/FARGATE (launch-type {:test/item LaunchType/FARGATE} "test" :item)))
    (is (= LaunchType/EC2 (launch-type {:item LaunchType/EC2} "test" :item)))
    (is (= LaunchType/EC2 (launch-type {:test/item LaunchType/EC2} "test" :item)))
    (is (= LaunchType/EXTERNAL (launch-type {:item LaunchType/EXTERNAL} "test" :item)))
    (is (= LaunchType/EXTERNAL (launch-type {:test/item LaunchType/EXTERNAL} "test" :item)))
    (is (= LaunchType/FARGATE (launch-type {:item :fargate} "test" :item)))
    (is (= LaunchType/FARGATE (launch-type {:test/item :fargate} "test" :item)))
    (is (= LaunchType/EC2 (launch-type {:item :ec2} "test" :item)))
    (is (= LaunchType/EC2 (launch-type {:test/item :ec2} "test" :item)))
    (is (= LaunchType/EXTERNAL (launch-type {:item :external} "test" :item)))
    (is (= LaunchType/EXTERNAL (launch-type {:test/item :external} "test" :item)))))


(deftest machine-image-type-test
  (testing "Testing enum function machine-image-type"
    (is (= MachineImageType/AMAZON_LINUX_2 (machine-image-type {:item MachineImageType/AMAZON_LINUX_2} "test" :item)))
    (is (= MachineImageType/AMAZON_LINUX_2 (machine-image-type {:test/item MachineImageType/AMAZON_LINUX_2} "test" :item)))
    (is (= MachineImageType/BOTTLEROCKET (machine-image-type {:item MachineImageType/BOTTLEROCKET} "test" :item)))
    (is (= MachineImageType/BOTTLEROCKET (machine-image-type {:test/item MachineImageType/BOTTLEROCKET} "test" :item)))
    (is (= MachineImageType/AMAZON_LINUX_2 (machine-image-type {:item :amazon-linux-2} "test" :item)))
    (is (= MachineImageType/AMAZON_LINUX_2 (machine-image-type {:test/item :amazon-linux-2} "test" :item)))
    (is (= MachineImageType/BOTTLEROCKET (machine-image-type {:item :bottlerocket} "test" :item)))
    (is (= MachineImageType/BOTTLEROCKET (machine-image-type {:test/item :bottlerocket} "test" :item)))))


(deftest network-mode-test
  (testing "Testing enum function network-mode"
    (is (= NetworkMode/NAT (network-mode {:item NetworkMode/NAT} "test" :item)))
    (is (= NetworkMode/NAT (network-mode {:test/item NetworkMode/NAT} "test" :item)))
    (is (= NetworkMode/NONE (network-mode {:item NetworkMode/NONE} "test" :item)))
    (is (= NetworkMode/NONE (network-mode {:test/item NetworkMode/NONE} "test" :item)))
    (is (= NetworkMode/BRIDGE (network-mode {:item NetworkMode/BRIDGE} "test" :item)))
    (is (= NetworkMode/BRIDGE (network-mode {:test/item NetworkMode/BRIDGE} "test" :item)))
    (is (= NetworkMode/HOST (network-mode {:item NetworkMode/HOST} "test" :item)))
    (is (= NetworkMode/HOST (network-mode {:test/item NetworkMode/HOST} "test" :item)))
    (is (= NetworkMode/AWS_VPC (network-mode {:item NetworkMode/AWS_VPC} "test" :item)))
    (is (= NetworkMode/AWS_VPC (network-mode {:test/item NetworkMode/AWS_VPC} "test" :item)))
    (is (= NetworkMode/NAT (network-mode {:item :nat} "test" :item)))
    (is (= NetworkMode/NAT (network-mode {:test/item :nat} "test" :item)))
    (is (= NetworkMode/NONE (network-mode {:item :none} "test" :item)))
    (is (= NetworkMode/NONE (network-mode {:test/item :none} "test" :item)))
    (is (= NetworkMode/BRIDGE (network-mode {:item :bridge} "test" :item)))
    (is (= NetworkMode/BRIDGE (network-mode {:test/item :bridge} "test" :item)))
    (is (= NetworkMode/HOST (network-mode {:item :host} "test" :item)))
    (is (= NetworkMode/HOST (network-mode {:test/item :host} "test" :item)))
    (is (= NetworkMode/AWS_VPC (network-mode {:item :aws-vpc} "test" :item)))
    (is (= NetworkMode/AWS_VPC (network-mode {:test/item :aws-vpc} "test" :item)))))


(deftest pid-mode-test
  (testing "Testing enum function pid-mode"
    (is (= PidMode/HOST (pid-mode {:item PidMode/HOST} "test" :item)))
    (is (= PidMode/HOST (pid-mode {:test/item PidMode/HOST} "test" :item)))
    (is (= PidMode/TASK (pid-mode {:item PidMode/TASK} "test" :item)))
    (is (= PidMode/TASK (pid-mode {:test/item PidMode/TASK} "test" :item)))
    (is (= PidMode/HOST (pid-mode {:item :host} "test" :item)))
    (is (= PidMode/HOST (pid-mode {:test/item :host} "test" :item)))
    (is (= PidMode/TASK (pid-mode {:item :task} "test" :item)))
    (is (= PidMode/TASK (pid-mode {:test/item :task} "test" :item)))))


(deftest propagated-tag-source-test
  (testing "Testing enum function propagated-tag-source"
    (is (= PropagatedTagSource/NONE (propagated-tag-source {:item PropagatedTagSource/NONE} "test" :item)))
    (is (= PropagatedTagSource/NONE (propagated-tag-source {:test/item PropagatedTagSource/NONE} "test" :item)))
    (is (= PropagatedTagSource/TASK_DEFINITION (propagated-tag-source {:item PropagatedTagSource/TASK_DEFINITION} "test" :item)))
    (is (= PropagatedTagSource/TASK_DEFINITION (propagated-tag-source {:test/item PropagatedTagSource/TASK_DEFINITION} "test" :item)))
    (is (= PropagatedTagSource/SERVICE (propagated-tag-source {:item PropagatedTagSource/SERVICE} "test" :item)))
    (is (= PropagatedTagSource/SERVICE (propagated-tag-source {:test/item PropagatedTagSource/SERVICE} "test" :item)))
    (is (= PropagatedTagSource/NONE (propagated-tag-source {:item :none} "test" :item)))
    (is (= PropagatedTagSource/NONE (propagated-tag-source {:test/item :none} "test" :item)))
    (is (= PropagatedTagSource/TASK_DEFINITION (propagated-tag-source {:item :task-definition} "test" :item)))
    (is (= PropagatedTagSource/TASK_DEFINITION (propagated-tag-source {:test/item :task-definition} "test" :item)))
    (is (= PropagatedTagSource/SERVICE (propagated-tag-source {:item :service} "test" :item)))
    (is (= PropagatedTagSource/SERVICE (propagated-tag-source {:test/item :service} "test" :item)))))


(deftest protocol-test
  (testing "Testing enum function protocol"
    (is (= Protocol/UDP (protocol {:item Protocol/UDP} "test" :item)))
    (is (= Protocol/UDP (protocol {:test/item Protocol/UDP} "test" :item)))
    (is (= Protocol/TCP (protocol {:item Protocol/TCP} "test" :item)))
    (is (= Protocol/TCP (protocol {:test/item Protocol/TCP} "test" :item)))
    (is (= Protocol/UDP (protocol {:item :udp} "test" :item)))
    (is (= Protocol/UDP (protocol {:test/item :udp} "test" :item)))
    (is (= Protocol/TCP (protocol {:item :tcp} "test" :item)))
    (is (= Protocol/TCP (protocol {:test/item :tcp} "test" :item)))))


(deftest scope-test
  (testing "Testing enum function scope"
    (is (= Scope/TASK (scope {:item Scope/TASK} "test" :item)))
    (is (= Scope/TASK (scope {:test/item Scope/TASK} "test" :item)))
    (is (= Scope/SHARED (scope {:item Scope/SHARED} "test" :item)))
    (is (= Scope/SHARED (scope {:test/item Scope/SHARED} "test" :item)))
    (is (= Scope/TASK (scope {:item :task} "test" :item)))
    (is (= Scope/TASK (scope {:test/item :task} "test" :item)))
    (is (= Scope/SHARED (scope {:item :shared} "test" :item)))
    (is (= Scope/SHARED (scope {:test/item :shared} "test" :item)))))


(deftest splunk-log-format-test
  (testing "Testing enum function splunk-log-format"
    (is (= SplunkLogFormat/INLINE (splunk-log-format {:item SplunkLogFormat/INLINE} "test" :item)))
    (is (= SplunkLogFormat/INLINE (splunk-log-format {:test/item SplunkLogFormat/INLINE} "test" :item)))
    (is (= SplunkLogFormat/JSON (splunk-log-format {:item SplunkLogFormat/JSON} "test" :item)))
    (is (= SplunkLogFormat/JSON (splunk-log-format {:test/item SplunkLogFormat/JSON} "test" :item)))
    (is (= SplunkLogFormat/RAW (splunk-log-format {:item SplunkLogFormat/RAW} "test" :item)))
    (is (= SplunkLogFormat/RAW (splunk-log-format {:test/item SplunkLogFormat/RAW} "test" :item)))
    (is (= SplunkLogFormat/INLINE (splunk-log-format {:item :inline} "test" :item)))
    (is (= SplunkLogFormat/INLINE (splunk-log-format {:test/item :inline} "test" :item)))
    (is (= SplunkLogFormat/JSON (splunk-log-format {:item :json} "test" :item)))
    (is (= SplunkLogFormat/JSON (splunk-log-format {:test/item :json} "test" :item)))
    (is (= SplunkLogFormat/RAW (splunk-log-format {:item :raw} "test" :item)))
    (is (= SplunkLogFormat/RAW (splunk-log-format {:test/item :raw} "test" :item)))))


(deftest tmpfs-mount-option-test
  (testing "Testing enum function tmpfs-mount-option"
    (is (= TmpfsMountOption/RBIND (tmpfs-mount-option {:item TmpfsMountOption/RBIND} "test" :item)))
    (is (= TmpfsMountOption/RBIND (tmpfs-mount-option {:test/item TmpfsMountOption/RBIND} "test" :item)))
    (is (= TmpfsMountOption/STRICTATIME (tmpfs-mount-option {:item TmpfsMountOption/STRICTATIME} "test" :item)))
    (is (= TmpfsMountOption/STRICTATIME (tmpfs-mount-option {:test/item TmpfsMountOption/STRICTATIME} "test" :item)))
    (is (= TmpfsMountOption/SLAVE (tmpfs-mount-option {:item TmpfsMountOption/SLAVE} "test" :item)))
    (is (= TmpfsMountOption/SLAVE (tmpfs-mount-option {:test/item TmpfsMountOption/SLAVE} "test" :item)))
    (is (= TmpfsMountOption/RSLAVE (tmpfs-mount-option {:item TmpfsMountOption/RSLAVE} "test" :item)))
    (is (= TmpfsMountOption/RSLAVE (tmpfs-mount-option {:test/item TmpfsMountOption/RSLAVE} "test" :item)))
    (is (= TmpfsMountOption/NOSUID (tmpfs-mount-option {:item TmpfsMountOption/NOSUID} "test" :item)))
    (is (= TmpfsMountOption/NOSUID (tmpfs-mount-option {:test/item TmpfsMountOption/NOSUID} "test" :item)))
    (is (= TmpfsMountOption/NOMAND (tmpfs-mount-option {:item TmpfsMountOption/NOMAND} "test" :item)))
    (is (= TmpfsMountOption/NOMAND (tmpfs-mount-option {:test/item TmpfsMountOption/NOMAND} "test" :item)))
    (is (= TmpfsMountOption/RSHARED (tmpfs-mount-option {:item TmpfsMountOption/RSHARED} "test" :item)))
    (is (= TmpfsMountOption/RSHARED (tmpfs-mount-option {:test/item TmpfsMountOption/RSHARED} "test" :item)))
    (is (= TmpfsMountOption/NR_BLOCKS (tmpfs-mount-option {:item TmpfsMountOption/NR_BLOCKS} "test" :item)))
    (is (= TmpfsMountOption/NR_BLOCKS (tmpfs-mount-option {:test/item TmpfsMountOption/NR_BLOCKS} "test" :item)))
    (is (= TmpfsMountOption/ATIME (tmpfs-mount-option {:item TmpfsMountOption/ATIME} "test" :item)))
    (is (= TmpfsMountOption/ATIME (tmpfs-mount-option {:test/item TmpfsMountOption/ATIME} "test" :item)))
    (is (= TmpfsMountOption/SHARED (tmpfs-mount-option {:item TmpfsMountOption/SHARED} "test" :item)))
    (is (= TmpfsMountOption/SHARED (tmpfs-mount-option {:test/item TmpfsMountOption/SHARED} "test" :item)))
    (is (= TmpfsMountOption/NORELATIME (tmpfs-mount-option {:item TmpfsMountOption/NORELATIME} "test" :item)))
    (is (= TmpfsMountOption/NORELATIME (tmpfs-mount-option {:test/item TmpfsMountOption/NORELATIME} "test" :item)))
    (is (= TmpfsMountOption/MODE (tmpfs-mount-option {:item TmpfsMountOption/MODE} "test" :item)))
    (is (= TmpfsMountOption/MODE (tmpfs-mount-option {:test/item TmpfsMountOption/MODE} "test" :item)))
    (is (= TmpfsMountOption/NOEXEC (tmpfs-mount-option {:item TmpfsMountOption/NOEXEC} "test" :item)))
    (is (= TmpfsMountOption/NOEXEC (tmpfs-mount-option {:test/item TmpfsMountOption/NOEXEC} "test" :item)))
    (is (= TmpfsMountOption/SYNC (tmpfs-mount-option {:item TmpfsMountOption/SYNC} "test" :item)))
    (is (= TmpfsMountOption/SYNC (tmpfs-mount-option {:test/item TmpfsMountOption/SYNC} "test" :item)))
    (is (= TmpfsMountOption/UID (tmpfs-mount-option {:item TmpfsMountOption/UID} "test" :item)))
    (is (= TmpfsMountOption/UID (tmpfs-mount-option {:test/item TmpfsMountOption/UID} "test" :item)))
    (is (= TmpfsMountOption/SUID (tmpfs-mount-option {:item TmpfsMountOption/SUID} "test" :item)))
    (is (= TmpfsMountOption/SUID (tmpfs-mount-option {:test/item TmpfsMountOption/SUID} "test" :item)))
    (is (= TmpfsMountOption/DEFAULTS (tmpfs-mount-option {:item TmpfsMountOption/DEFAULTS} "test" :item)))
    (is (= TmpfsMountOption/DEFAULTS (tmpfs-mount-option {:test/item TmpfsMountOption/DEFAULTS} "test" :item)))
    (is (= TmpfsMountOption/RPRIVATE (tmpfs-mount-option {:item TmpfsMountOption/RPRIVATE} "test" :item)))
    (is (= TmpfsMountOption/RPRIVATE (tmpfs-mount-option {:test/item TmpfsMountOption/RPRIVATE} "test" :item)))
    (is (= TmpfsMountOption/EXEC (tmpfs-mount-option {:item TmpfsMountOption/EXEC} "test" :item)))
    (is (= TmpfsMountOption/EXEC (tmpfs-mount-option {:test/item TmpfsMountOption/EXEC} "test" :item)))
    (is (= TmpfsMountOption/NOSTRICTATIME (tmpfs-mount-option {:item TmpfsMountOption/NOSTRICTATIME} "test" :item)))
    (is (= TmpfsMountOption/NOSTRICTATIME (tmpfs-mount-option {:test/item TmpfsMountOption/NOSTRICTATIME} "test" :item)))
    (is (= TmpfsMountOption/NOATIME (tmpfs-mount-option {:item TmpfsMountOption/NOATIME} "test" :item)))
    (is (= TmpfsMountOption/NOATIME (tmpfs-mount-option {:test/item TmpfsMountOption/NOATIME} "test" :item)))
    (is (= TmpfsMountOption/NODEV (tmpfs-mount-option {:item TmpfsMountOption/NODEV} "test" :item)))
    (is (= TmpfsMountOption/NODEV (tmpfs-mount-option {:test/item TmpfsMountOption/NODEV} "test" :item)))
    (is (= TmpfsMountOption/UNBINDABLE (tmpfs-mount-option {:item TmpfsMountOption/UNBINDABLE} "test" :item)))
    (is (= TmpfsMountOption/UNBINDABLE (tmpfs-mount-option {:test/item TmpfsMountOption/UNBINDABLE} "test" :item)))
    (is (= TmpfsMountOption/MPOL (tmpfs-mount-option {:item TmpfsMountOption/MPOL} "test" :item)))
    (is (= TmpfsMountOption/MPOL (tmpfs-mount-option {:test/item TmpfsMountOption/MPOL} "test" :item)))
    (is (= TmpfsMountOption/RO (tmpfs-mount-option {:item TmpfsMountOption/RO} "test" :item)))
    (is (= TmpfsMountOption/RO (tmpfs-mount-option {:test/item TmpfsMountOption/RO} "test" :item)))
    (is (= TmpfsMountOption/DIRSYNC (tmpfs-mount-option {:item TmpfsMountOption/DIRSYNC} "test" :item)))
    (is (= TmpfsMountOption/DIRSYNC (tmpfs-mount-option {:test/item TmpfsMountOption/DIRSYNC} "test" :item)))
    (is (= TmpfsMountOption/NODIRATIME (tmpfs-mount-option {:item TmpfsMountOption/NODIRATIME} "test" :item)))
    (is (= TmpfsMountOption/NODIRATIME (tmpfs-mount-option {:test/item TmpfsMountOption/NODIRATIME} "test" :item)))
    (is (= TmpfsMountOption/REMOUNT (tmpfs-mount-option {:item TmpfsMountOption/REMOUNT} "test" :item)))
    (is (= TmpfsMountOption/REMOUNT (tmpfs-mount-option {:test/item TmpfsMountOption/REMOUNT} "test" :item)))
    (is (= TmpfsMountOption/MAND (tmpfs-mount-option {:item TmpfsMountOption/MAND} "test" :item)))
    (is (= TmpfsMountOption/MAND (tmpfs-mount-option {:test/item TmpfsMountOption/MAND} "test" :item)))
    (is (= TmpfsMountOption/ASYNC (tmpfs-mount-option {:item TmpfsMountOption/ASYNC} "test" :item)))
    (is (= TmpfsMountOption/ASYNC (tmpfs-mount-option {:test/item TmpfsMountOption/ASYNC} "test" :item)))
    (is (= TmpfsMountOption/RELATIME (tmpfs-mount-option {:item TmpfsMountOption/RELATIME} "test" :item)))
    (is (= TmpfsMountOption/RELATIME (tmpfs-mount-option {:test/item TmpfsMountOption/RELATIME} "test" :item)))
    (is (= TmpfsMountOption/PRIVATE (tmpfs-mount-option {:item TmpfsMountOption/PRIVATE} "test" :item)))
    (is (= TmpfsMountOption/PRIVATE (tmpfs-mount-option {:test/item TmpfsMountOption/PRIVATE} "test" :item)))
    (is (= TmpfsMountOption/RUNBINDABLE (tmpfs-mount-option {:item TmpfsMountOption/RUNBINDABLE} "test" :item)))
    (is (= TmpfsMountOption/RUNBINDABLE (tmpfs-mount-option {:test/item TmpfsMountOption/RUNBINDABLE} "test" :item)))
    (is (= TmpfsMountOption/BIND (tmpfs-mount-option {:item TmpfsMountOption/BIND} "test" :item)))
    (is (= TmpfsMountOption/BIND (tmpfs-mount-option {:test/item TmpfsMountOption/BIND} "test" :item)))
    (is (= TmpfsMountOption/DEV (tmpfs-mount-option {:item TmpfsMountOption/DEV} "test" :item)))
    (is (= TmpfsMountOption/DEV (tmpfs-mount-option {:test/item TmpfsMountOption/DEV} "test" :item)))
    (is (= TmpfsMountOption/DIRATIME (tmpfs-mount-option {:item TmpfsMountOption/DIRATIME} "test" :item)))
    (is (= TmpfsMountOption/DIRATIME (tmpfs-mount-option {:test/item TmpfsMountOption/DIRATIME} "test" :item)))
    (is (= TmpfsMountOption/NR_INODES (tmpfs-mount-option {:item TmpfsMountOption/NR_INODES} "test" :item)))
    (is (= TmpfsMountOption/NR_INODES (tmpfs-mount-option {:test/item TmpfsMountOption/NR_INODES} "test" :item)))
    (is (= TmpfsMountOption/RW (tmpfs-mount-option {:item TmpfsMountOption/RW} "test" :item)))
    (is (= TmpfsMountOption/RW (tmpfs-mount-option {:test/item TmpfsMountOption/RW} "test" :item)))
    (is (= TmpfsMountOption/GID (tmpfs-mount-option {:item TmpfsMountOption/GID} "test" :item)))
    (is (= TmpfsMountOption/GID (tmpfs-mount-option {:test/item TmpfsMountOption/GID} "test" :item)))
    (is (= TmpfsMountOption/RBIND (tmpfs-mount-option {:item :rbind} "test" :item)))
    (is (= TmpfsMountOption/RBIND (tmpfs-mount-option {:test/item :rbind} "test" :item)))
    (is (= TmpfsMountOption/STRICTATIME (tmpfs-mount-option {:item :strictatime} "test" :item)))
    (is (= TmpfsMountOption/STRICTATIME (tmpfs-mount-option {:test/item :strictatime} "test" :item)))
    (is (= TmpfsMountOption/SLAVE (tmpfs-mount-option {:item :slave} "test" :item)))
    (is (= TmpfsMountOption/SLAVE (tmpfs-mount-option {:test/item :slave} "test" :item)))
    (is (= TmpfsMountOption/RSLAVE (tmpfs-mount-option {:item :rslave} "test" :item)))
    (is (= TmpfsMountOption/RSLAVE (tmpfs-mount-option {:test/item :rslave} "test" :item)))
    (is (= TmpfsMountOption/NOSUID (tmpfs-mount-option {:item :nosuid} "test" :item)))
    (is (= TmpfsMountOption/NOSUID (tmpfs-mount-option {:test/item :nosuid} "test" :item)))
    (is (= TmpfsMountOption/NOMAND (tmpfs-mount-option {:item :nomand} "test" :item)))
    (is (= TmpfsMountOption/NOMAND (tmpfs-mount-option {:test/item :nomand} "test" :item)))
    (is (= TmpfsMountOption/RSHARED (tmpfs-mount-option {:item :rshared} "test" :item)))
    (is (= TmpfsMountOption/RSHARED (tmpfs-mount-option {:test/item :rshared} "test" :item)))
    (is (= TmpfsMountOption/NR_BLOCKS (tmpfs-mount-option {:item :nr-blocks} "test" :item)))
    (is (= TmpfsMountOption/NR_BLOCKS (tmpfs-mount-option {:test/item :nr-blocks} "test" :item)))
    (is (= TmpfsMountOption/ATIME (tmpfs-mount-option {:item :atime} "test" :item)))
    (is (= TmpfsMountOption/ATIME (tmpfs-mount-option {:test/item :atime} "test" :item)))
    (is (= TmpfsMountOption/SHARED (tmpfs-mount-option {:item :shared} "test" :item)))
    (is (= TmpfsMountOption/SHARED (tmpfs-mount-option {:test/item :shared} "test" :item)))
    (is (= TmpfsMountOption/NORELATIME (tmpfs-mount-option {:item :norelatime} "test" :item)))
    (is (= TmpfsMountOption/NORELATIME (tmpfs-mount-option {:test/item :norelatime} "test" :item)))
    (is (= TmpfsMountOption/MODE (tmpfs-mount-option {:item :mode} "test" :item)))
    (is (= TmpfsMountOption/MODE (tmpfs-mount-option {:test/item :mode} "test" :item)))
    (is (= TmpfsMountOption/NOEXEC (tmpfs-mount-option {:item :noexec} "test" :item)))
    (is (= TmpfsMountOption/NOEXEC (tmpfs-mount-option {:test/item :noexec} "test" :item)))
    (is (= TmpfsMountOption/SYNC (tmpfs-mount-option {:item :sync} "test" :item)))
    (is (= TmpfsMountOption/SYNC (tmpfs-mount-option {:test/item :sync} "test" :item)))
    (is (= TmpfsMountOption/UID (tmpfs-mount-option {:item :uid} "test" :item)))
    (is (= TmpfsMountOption/UID (tmpfs-mount-option {:test/item :uid} "test" :item)))
    (is (= TmpfsMountOption/SUID (tmpfs-mount-option {:item :suid} "test" :item)))
    (is (= TmpfsMountOption/SUID (tmpfs-mount-option {:test/item :suid} "test" :item)))
    (is (= TmpfsMountOption/DEFAULTS (tmpfs-mount-option {:item :defaults} "test" :item)))
    (is (= TmpfsMountOption/DEFAULTS (tmpfs-mount-option {:test/item :defaults} "test" :item)))
    (is (= TmpfsMountOption/RPRIVATE (tmpfs-mount-option {:item :rprivate} "test" :item)))
    (is (= TmpfsMountOption/RPRIVATE (tmpfs-mount-option {:test/item :rprivate} "test" :item)))
    (is (= TmpfsMountOption/EXEC (tmpfs-mount-option {:item :exec} "test" :item)))
    (is (= TmpfsMountOption/EXEC (tmpfs-mount-option {:test/item :exec} "test" :item)))
    (is (= TmpfsMountOption/NOSTRICTATIME (tmpfs-mount-option {:item :nostrictatime} "test" :item)))
    (is (= TmpfsMountOption/NOSTRICTATIME (tmpfs-mount-option {:test/item :nostrictatime} "test" :item)))
    (is (= TmpfsMountOption/NOATIME (tmpfs-mount-option {:item :noatime} "test" :item)))
    (is (= TmpfsMountOption/NOATIME (tmpfs-mount-option {:test/item :noatime} "test" :item)))
    (is (= TmpfsMountOption/NODEV (tmpfs-mount-option {:item :nodev} "test" :item)))
    (is (= TmpfsMountOption/NODEV (tmpfs-mount-option {:test/item :nodev} "test" :item)))
    (is (= TmpfsMountOption/UNBINDABLE (tmpfs-mount-option {:item :unbindable} "test" :item)))
    (is (= TmpfsMountOption/UNBINDABLE (tmpfs-mount-option {:test/item :unbindable} "test" :item)))
    (is (= TmpfsMountOption/MPOL (tmpfs-mount-option {:item :mpol} "test" :item)))
    (is (= TmpfsMountOption/MPOL (tmpfs-mount-option {:test/item :mpol} "test" :item)))
    (is (= TmpfsMountOption/RO (tmpfs-mount-option {:item :ro} "test" :item)))
    (is (= TmpfsMountOption/RO (tmpfs-mount-option {:test/item :ro} "test" :item)))
    (is (= TmpfsMountOption/DIRSYNC (tmpfs-mount-option {:item :dirsync} "test" :item)))
    (is (= TmpfsMountOption/DIRSYNC (tmpfs-mount-option {:test/item :dirsync} "test" :item)))
    (is (= TmpfsMountOption/NODIRATIME (tmpfs-mount-option {:item :nodiratime} "test" :item)))
    (is (= TmpfsMountOption/NODIRATIME (tmpfs-mount-option {:test/item :nodiratime} "test" :item)))
    (is (= TmpfsMountOption/REMOUNT (tmpfs-mount-option {:item :remount} "test" :item)))
    (is (= TmpfsMountOption/REMOUNT (tmpfs-mount-option {:test/item :remount} "test" :item)))
    (is (= TmpfsMountOption/MAND (tmpfs-mount-option {:item :mand} "test" :item)))
    (is (= TmpfsMountOption/MAND (tmpfs-mount-option {:test/item :mand} "test" :item)))
    (is (= TmpfsMountOption/ASYNC (tmpfs-mount-option {:item :async} "test" :item)))
    (is (= TmpfsMountOption/ASYNC (tmpfs-mount-option {:test/item :async} "test" :item)))
    (is (= TmpfsMountOption/RELATIME (tmpfs-mount-option {:item :relatime} "test" :item)))
    (is (= TmpfsMountOption/RELATIME (tmpfs-mount-option {:test/item :relatime} "test" :item)))
    (is (= TmpfsMountOption/PRIVATE (tmpfs-mount-option {:item :private} "test" :item)))
    (is (= TmpfsMountOption/PRIVATE (tmpfs-mount-option {:test/item :private} "test" :item)))
    (is (= TmpfsMountOption/RUNBINDABLE (tmpfs-mount-option {:item :runbindable} "test" :item)))
    (is (= TmpfsMountOption/RUNBINDABLE (tmpfs-mount-option {:test/item :runbindable} "test" :item)))
    (is (= TmpfsMountOption/BIND (tmpfs-mount-option {:item :bind} "test" :item)))
    (is (= TmpfsMountOption/BIND (tmpfs-mount-option {:test/item :bind} "test" :item)))
    (is (= TmpfsMountOption/DEV (tmpfs-mount-option {:item :dev} "test" :item)))
    (is (= TmpfsMountOption/DEV (tmpfs-mount-option {:test/item :dev} "test" :item)))
    (is (= TmpfsMountOption/DIRATIME (tmpfs-mount-option {:item :diratime} "test" :item)))
    (is (= TmpfsMountOption/DIRATIME (tmpfs-mount-option {:test/item :diratime} "test" :item)))
    (is (= TmpfsMountOption/NR_INODES (tmpfs-mount-option {:item :nr-inodes} "test" :item)))
    (is (= TmpfsMountOption/NR_INODES (tmpfs-mount-option {:test/item :nr-inodes} "test" :item)))
    (is (= TmpfsMountOption/RW (tmpfs-mount-option {:item :rw} "test" :item)))
    (is (= TmpfsMountOption/RW (tmpfs-mount-option {:test/item :rw} "test" :item)))
    (is (= TmpfsMountOption/GID (tmpfs-mount-option {:item :gid} "test" :item)))
    (is (= TmpfsMountOption/GID (tmpfs-mount-option {:test/item :gid} "test" :item)))))


(deftest ulimit-name-test
  (testing "Testing enum function ulimit-name"
    (is (= UlimitName/DATA (ulimit-name {:item UlimitName/DATA} "test" :item)))
    (is (= UlimitName/DATA (ulimit-name {:test/item UlimitName/DATA} "test" :item)))
    (is (= UlimitName/RTTIME (ulimit-name {:item UlimitName/RTTIME} "test" :item)))
    (is (= UlimitName/RTTIME (ulimit-name {:test/item UlimitName/RTTIME} "test" :item)))
    (is (= UlimitName/LOCKS (ulimit-name {:item UlimitName/LOCKS} "test" :item)))
    (is (= UlimitName/LOCKS (ulimit-name {:test/item UlimitName/LOCKS} "test" :item)))
    (is (= UlimitName/MSGQUEUE (ulimit-name {:item UlimitName/MSGQUEUE} "test" :item)))
    (is (= UlimitName/MSGQUEUE (ulimit-name {:test/item UlimitName/MSGQUEUE} "test" :item)))
    (is (= UlimitName/NICE (ulimit-name {:item UlimitName/NICE} "test" :item)))
    (is (= UlimitName/NICE (ulimit-name {:test/item UlimitName/NICE} "test" :item)))
    (is (= UlimitName/MEMLOCK (ulimit-name {:item UlimitName/MEMLOCK} "test" :item)))
    (is (= UlimitName/MEMLOCK (ulimit-name {:test/item UlimitName/MEMLOCK} "test" :item)))
    (is (= UlimitName/NPROC (ulimit-name {:item UlimitName/NPROC} "test" :item)))
    (is (= UlimitName/NPROC (ulimit-name {:test/item UlimitName/NPROC} "test" :item)))
    (is (= UlimitName/STACK (ulimit-name {:item UlimitName/STACK} "test" :item)))
    (is (= UlimitName/STACK (ulimit-name {:test/item UlimitName/STACK} "test" :item)))
    (is (= UlimitName/SIGPENDING (ulimit-name {:item UlimitName/SIGPENDING} "test" :item)))
    (is (= UlimitName/SIGPENDING (ulimit-name {:test/item UlimitName/SIGPENDING} "test" :item)))
    (is (= UlimitName/CORE (ulimit-name {:item UlimitName/CORE} "test" :item)))
    (is (= UlimitName/CORE (ulimit-name {:test/item UlimitName/CORE} "test" :item)))
    (is (= UlimitName/FSIZE (ulimit-name {:item UlimitName/FSIZE} "test" :item)))
    (is (= UlimitName/FSIZE (ulimit-name {:test/item UlimitName/FSIZE} "test" :item)))
    (is (= UlimitName/NOFILE (ulimit-name {:item UlimitName/NOFILE} "test" :item)))
    (is (= UlimitName/NOFILE (ulimit-name {:test/item UlimitName/NOFILE} "test" :item)))
    (is (= UlimitName/RTPRIO (ulimit-name {:item UlimitName/RTPRIO} "test" :item)))
    (is (= UlimitName/RTPRIO (ulimit-name {:test/item UlimitName/RTPRIO} "test" :item)))
    (is (= UlimitName/CPU (ulimit-name {:item UlimitName/CPU} "test" :item)))
    (is (= UlimitName/CPU (ulimit-name {:test/item UlimitName/CPU} "test" :item)))
    (is (= UlimitName/RSS (ulimit-name {:item UlimitName/RSS} "test" :item)))
    (is (= UlimitName/RSS (ulimit-name {:test/item UlimitName/RSS} "test" :item)))
    (is (= UlimitName/DATA (ulimit-name {:item :data} "test" :item)))
    (is (= UlimitName/DATA (ulimit-name {:test/item :data} "test" :item)))
    (is (= UlimitName/RTTIME (ulimit-name {:item :rttime} "test" :item)))
    (is (= UlimitName/RTTIME (ulimit-name {:test/item :rttime} "test" :item)))
    (is (= UlimitName/LOCKS (ulimit-name {:item :locks} "test" :item)))
    (is (= UlimitName/LOCKS (ulimit-name {:test/item :locks} "test" :item)))
    (is (= UlimitName/MSGQUEUE (ulimit-name {:item :msgqueue} "test" :item)))
    (is (= UlimitName/MSGQUEUE (ulimit-name {:test/item :msgqueue} "test" :item)))
    (is (= UlimitName/NICE (ulimit-name {:item :nice} "test" :item)))
    (is (= UlimitName/NICE (ulimit-name {:test/item :nice} "test" :item)))
    (is (= UlimitName/MEMLOCK (ulimit-name {:item :memlock} "test" :item)))
    (is (= UlimitName/MEMLOCK (ulimit-name {:test/item :memlock} "test" :item)))
    (is (= UlimitName/NPROC (ulimit-name {:item :nproc} "test" :item)))
    (is (= UlimitName/NPROC (ulimit-name {:test/item :nproc} "test" :item)))
    (is (= UlimitName/STACK (ulimit-name {:item :stack} "test" :item)))
    (is (= UlimitName/STACK (ulimit-name {:test/item :stack} "test" :item)))
    (is (= UlimitName/SIGPENDING (ulimit-name {:item :sigpending} "test" :item)))
    (is (= UlimitName/SIGPENDING (ulimit-name {:test/item :sigpending} "test" :item)))
    (is (= UlimitName/CORE (ulimit-name {:item :core} "test" :item)))
    (is (= UlimitName/CORE (ulimit-name {:test/item :core} "test" :item)))
    (is (= UlimitName/FSIZE (ulimit-name {:item :fsize} "test" :item)))
    (is (= UlimitName/FSIZE (ulimit-name {:test/item :fsize} "test" :item)))
    (is (= UlimitName/NOFILE (ulimit-name {:item :nofile} "test" :item)))
    (is (= UlimitName/NOFILE (ulimit-name {:test/item :nofile} "test" :item)))
    (is (= UlimitName/RTPRIO (ulimit-name {:item :rtprio} "test" :item)))
    (is (= UlimitName/RTPRIO (ulimit-name {:test/item :rtprio} "test" :item)))
    (is (= UlimitName/CPU (ulimit-name {:item :cpu} "test" :item)))
    (is (= UlimitName/CPU (ulimit-name {:test/item :cpu} "test" :item)))
    (is (= UlimitName/RSS (ulimit-name {:item :rss} "test" :item)))
    (is (= UlimitName/RSS (ulimit-name {:test/item :rss} "test" :item)))))


(deftest windows-optimized-version-test
  (testing "Testing enum function windows-optimized-version"
    (is (= WindowsOptimizedVersion/SERVER_2022 (windows-optimized-version {:item WindowsOptimizedVersion/SERVER_2022} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2022 (windows-optimized-version {:test/item WindowsOptimizedVersion/SERVER_2022} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2019 (windows-optimized-version {:item WindowsOptimizedVersion/SERVER_2019} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2019 (windows-optimized-version {:test/item WindowsOptimizedVersion/SERVER_2019} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2016 (windows-optimized-version {:item WindowsOptimizedVersion/SERVER_2016} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2016 (windows-optimized-version {:test/item WindowsOptimizedVersion/SERVER_2016} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2022 (windows-optimized-version {:item :server-2022} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2022 (windows-optimized-version {:test/item :server-2022} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2019 (windows-optimized-version {:item :server-2019} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2019 (windows-optimized-version {:test/item :server-2019} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2016 (windows-optimized-version {:item :server-2016} "test" :item)))
    (is (= WindowsOptimizedVersion/SERVER_2016 (windows-optimized-version {:test/item :server-2016} "test" :item)))))