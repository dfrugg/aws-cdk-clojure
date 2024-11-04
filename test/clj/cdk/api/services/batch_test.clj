(ns cdk.api.services.batch-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.batch package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.batch :refer [action
                                            allocation-strategy
                                            device-permission
                                            dns-policy
                                            ecs-machine-image-type
                                            eks-machine-image-type
                                            empty-dir-medium-type
                                            image-pull-policy
                                            job-state-time-limit-actions-action
                                            job-state-time-limit-actions-reason
                                            job-state-time-limit-actions-state
                                            tmpfs-mount-option
                                            ulimit-name]])
  (:import [software.amazon.awscdk.services.batch Action
                                                  AllocationStrategy
                                                  DevicePermission
                                                  DnsPolicy
                                                  EcsMachineImageType
                                                  EksMachineImageType
                                                  EmptyDirMediumType
                                                  ImagePullPolicy
                                                  JobStateTimeLimitActionsAction
                                                  JobStateTimeLimitActionsReason
                                                  JobStateTimeLimitActionsState
                                                  TmpfsMountOption
                                                  UlimitName]))


(deftest action-test
  (testing "Testing enum function action"
    (is (= Action/RETRY (action {:item Action/RETRY} "test" :item)))
    (is (= Action/RETRY (action {:test/item Action/RETRY} "test" :item)))
    (is (= Action/EXIT (action {:item Action/EXIT} "test" :item)))
    (is (= Action/EXIT (action {:test/item Action/EXIT} "test" :item)))
    (is (= Action/RETRY (action {:item :retry} "test" :item)))
    (is (= Action/RETRY (action {:test/item :retry} "test" :item)))
    (is (= Action/EXIT (action {:item :exit} "test" :item)))
    (is (= Action/EXIT (action {:test/item :exit} "test" :item)))))


(deftest allocation-strategy-test
  (testing "Testing enum function allocation-strategy"
    (is (= AllocationStrategy/SPOT_CAPACITY_OPTIMIZED (allocation-strategy {:item AllocationStrategy/SPOT_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= AllocationStrategy/SPOT_CAPACITY_OPTIMIZED (allocation-strategy {:test/item AllocationStrategy/SPOT_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT_PROGRESSIVE (allocation-strategy {:item AllocationStrategy/BEST_FIT_PROGRESSIVE} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT_PROGRESSIVE (allocation-strategy {:test/item AllocationStrategy/BEST_FIT_PROGRESSIVE} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT (allocation-strategy {:item AllocationStrategy/BEST_FIT} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT (allocation-strategy {:test/item AllocationStrategy/BEST_FIT} "test" :item)))
    (is (= AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED (allocation-strategy {:item AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED (allocation-strategy {:test/item AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= AllocationStrategy/SPOT_CAPACITY_OPTIMIZED (allocation-strategy {:item :spot-capacity-optimized} "test" :item)))
    (is (= AllocationStrategy/SPOT_CAPACITY_OPTIMIZED (allocation-strategy {:test/item :spot-capacity-optimized} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT_PROGRESSIVE (allocation-strategy {:item :best-fit-progressive} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT_PROGRESSIVE (allocation-strategy {:test/item :best-fit-progressive} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT (allocation-strategy {:item :best-fit} "test" :item)))
    (is (= AllocationStrategy/BEST_FIT (allocation-strategy {:test/item :best-fit} "test" :item)))
    (is (= AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED (allocation-strategy {:item :spot-price-capacity-optimized} "test" :item)))
    (is (= AllocationStrategy/SPOT_PRICE_CAPACITY_OPTIMIZED (allocation-strategy {:test/item :spot-price-capacity-optimized} "test" :item)))))


(deftest device-permission-test
  (testing "Testing enum function device-permission"
    (is (= DevicePermission/READ (device-permission {:item DevicePermission/READ} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:test/item DevicePermission/READ} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:item DevicePermission/WRITE} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:test/item DevicePermission/WRITE} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:item DevicePermission/MKNOD} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:test/item DevicePermission/MKNOD} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:item :read} "test" :item)))
    (is (= DevicePermission/READ (device-permission {:test/item :read} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:item :write} "test" :item)))
    (is (= DevicePermission/WRITE (device-permission {:test/item :write} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:item :mknod} "test" :item)))
    (is (= DevicePermission/MKNOD (device-permission {:test/item :mknod} "test" :item)))))


(deftest dns-policy-test
  (testing "Testing enum function dns-policy"
    (is (= DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET (dns-policy {:item DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET (dns-policy {:test/item DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST (dns-policy {:item DnsPolicy/CLUSTER_FIRST} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST (dns-policy {:test/item DnsPolicy/CLUSTER_FIRST} "test" :item)))
    (is (= DnsPolicy/DEFAULT (dns-policy {:item DnsPolicy/DEFAULT} "test" :item)))
    (is (= DnsPolicy/DEFAULT (dns-policy {:test/item DnsPolicy/DEFAULT} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET (dns-policy {:item :cluster-first-with-host-net} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST_WITH_HOST_NET (dns-policy {:test/item :cluster-first-with-host-net} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST (dns-policy {:item :cluster-first} "test" :item)))
    (is (= DnsPolicy/CLUSTER_FIRST (dns-policy {:test/item :cluster-first} "test" :item)))
    (is (= DnsPolicy/DEFAULT (dns-policy {:item :default} "test" :item)))
    (is (= DnsPolicy/DEFAULT (dns-policy {:test/item :default} "test" :item)))))


(deftest ecs-machine-image-type-test
  (testing "Testing enum function ecs-machine-image-type"
    (is (= EcsMachineImageType/ECS_AL2_NVIDIA (ecs-machine-image-type {:item EcsMachineImageType/ECS_AL2_NVIDIA} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2_NVIDIA (ecs-machine-image-type {:test/item EcsMachineImageType/ECS_AL2_NVIDIA} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2 (ecs-machine-image-type {:item EcsMachineImageType/ECS_AL2} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2 (ecs-machine-image-type {:test/item EcsMachineImageType/ECS_AL2} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2_NVIDIA (ecs-machine-image-type {:item :ecs-al2-nvidia} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2_NVIDIA (ecs-machine-image-type {:test/item :ecs-al2-nvidia} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2 (ecs-machine-image-type {:item :ecs-al2} "test" :item)))
    (is (= EcsMachineImageType/ECS_AL2 (ecs-machine-image-type {:test/item :ecs-al2} "test" :item)))))


(deftest eks-machine-image-type-test
  (testing "Testing enum function eks-machine-image-type"
    (is (= EksMachineImageType/EKS_AL2_NVIDIA (eks-machine-image-type {:item EksMachineImageType/EKS_AL2_NVIDIA} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2_NVIDIA (eks-machine-image-type {:test/item EksMachineImageType/EKS_AL2_NVIDIA} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2 (eks-machine-image-type {:item EksMachineImageType/EKS_AL2} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2 (eks-machine-image-type {:test/item EksMachineImageType/EKS_AL2} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2_NVIDIA (eks-machine-image-type {:item :eks-al2-nvidia} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2_NVIDIA (eks-machine-image-type {:test/item :eks-al2-nvidia} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2 (eks-machine-image-type {:item :eks-al2} "test" :item)))
    (is (= EksMachineImageType/EKS_AL2 (eks-machine-image-type {:test/item :eks-al2} "test" :item)))))


(deftest empty-dir-medium-type-test
  (testing "Testing enum function empty-dir-medium-type"
    (is (= EmptyDirMediumType/DISK (empty-dir-medium-type {:item EmptyDirMediumType/DISK} "test" :item)))
    (is (= EmptyDirMediumType/DISK (empty-dir-medium-type {:test/item EmptyDirMediumType/DISK} "test" :item)))
    (is (= EmptyDirMediumType/MEMORY (empty-dir-medium-type {:item EmptyDirMediumType/MEMORY} "test" :item)))
    (is (= EmptyDirMediumType/MEMORY (empty-dir-medium-type {:test/item EmptyDirMediumType/MEMORY} "test" :item)))
    (is (= EmptyDirMediumType/DISK (empty-dir-medium-type {:item :disk} "test" :item)))
    (is (= EmptyDirMediumType/DISK (empty-dir-medium-type {:test/item :disk} "test" :item)))
    (is (= EmptyDirMediumType/MEMORY (empty-dir-medium-type {:item :memory} "test" :item)))
    (is (= EmptyDirMediumType/MEMORY (empty-dir-medium-type {:test/item :memory} "test" :item)))))


(deftest image-pull-policy-test
  (testing "Testing enum function image-pull-policy"
    (is (= ImagePullPolicy/NEVER (image-pull-policy {:item ImagePullPolicy/NEVER} "test" :item)))
    (is (= ImagePullPolicy/NEVER (image-pull-policy {:test/item ImagePullPolicy/NEVER} "test" :item)))
    (is (= ImagePullPolicy/IF_NOT_PRESENT (image-pull-policy {:item ImagePullPolicy/IF_NOT_PRESENT} "test" :item)))
    (is (= ImagePullPolicy/IF_NOT_PRESENT (image-pull-policy {:test/item ImagePullPolicy/IF_NOT_PRESENT} "test" :item)))
    (is (= ImagePullPolicy/ALWAYS (image-pull-policy {:item ImagePullPolicy/ALWAYS} "test" :item)))
    (is (= ImagePullPolicy/ALWAYS (image-pull-policy {:test/item ImagePullPolicy/ALWAYS} "test" :item)))
    (is (= ImagePullPolicy/NEVER (image-pull-policy {:item :never} "test" :item)))
    (is (= ImagePullPolicy/NEVER (image-pull-policy {:test/item :never} "test" :item)))
    (is (= ImagePullPolicy/IF_NOT_PRESENT (image-pull-policy {:item :if-not-present} "test" :item)))
    (is (= ImagePullPolicy/IF_NOT_PRESENT (image-pull-policy {:test/item :if-not-present} "test" :item)))
    (is (= ImagePullPolicy/ALWAYS (image-pull-policy {:item :always} "test" :item)))
    (is (= ImagePullPolicy/ALWAYS (image-pull-policy {:test/item :always} "test" :item)))))


(deftest job-state-time-limit-actions-action-test
  (testing "Testing enum function job-state-time-limit-actions-action"
    (is (= JobStateTimeLimitActionsAction/CANCEL (job-state-time-limit-actions-action {:item JobStateTimeLimitActionsAction/CANCEL} "test" :item)))
    (is (= JobStateTimeLimitActionsAction/CANCEL (job-state-time-limit-actions-action {:test/item JobStateTimeLimitActionsAction/CANCEL} "test" :item)))
    (is (= JobStateTimeLimitActionsAction/CANCEL (job-state-time-limit-actions-action {:item :cancel} "test" :item)))
    (is (= JobStateTimeLimitActionsAction/CANCEL (job-state-time-limit-actions-action {:test/item :cancel} "test" :item)))))


(deftest job-state-time-limit-actions-reason-test
  (testing "Testing enum function job-state-time-limit-actions-reason"
    (is (= JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE (job-state-time-limit-actions-reason {:item JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE (job-state-time-limit-actions-reason {:test/item JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY (job-state-time-limit-actions-reason {:item JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY (job-state-time-limit-actions-reason {:test/item JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT (job-state-time-limit-actions-reason {:item JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT (job-state-time-limit-actions-reason {:test/item JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE (job-state-time-limit-actions-reason {:item :compute-environment-max-resource} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/COMPUTE_ENVIRONMENT_MAX_RESOURCE (job-state-time-limit-actions-reason {:test/item :compute-environment-max-resource} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY (job-state-time-limit-actions-reason {:item :insufficient-instance-capacity} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/INSUFFICIENT_INSTANCE_CAPACITY (job-state-time-limit-actions-reason {:test/item :insufficient-instance-capacity} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT (job-state-time-limit-actions-reason {:item :job-resource-requirement} "test" :item)))
    (is (= JobStateTimeLimitActionsReason/JOB_RESOURCE_REQUIREMENT (job-state-time-limit-actions-reason {:test/item :job-resource-requirement} "test" :item)))))


(deftest job-state-time-limit-actions-state-test
  (testing "Testing enum function job-state-time-limit-actions-state"
    (is (= JobStateTimeLimitActionsState/RUNNABLE (job-state-time-limit-actions-state {:item JobStateTimeLimitActionsState/RUNNABLE} "test" :item)))
    (is (= JobStateTimeLimitActionsState/RUNNABLE (job-state-time-limit-actions-state {:test/item JobStateTimeLimitActionsState/RUNNABLE} "test" :item)))
    (is (= JobStateTimeLimitActionsState/RUNNABLE (job-state-time-limit-actions-state {:item :runnable} "test" :item)))
    (is (= JobStateTimeLimitActionsState/RUNNABLE (job-state-time-limit-actions-state {:test/item :runnable} "test" :item)))))


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