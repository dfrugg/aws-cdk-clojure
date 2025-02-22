(ns cdk.api.services.eks-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.eks package. "
  (:require [cdk.api.services.eks :refer [alb-scheme
                                          capacity-type
                                          cluster-logging-types
                                          core-dns-compute-type
                                          cpu-arch
                                          default-capacity-type
                                          ip-family
                                          machine-image-type
                                          node-type
                                          nodegroup-ami-type
                                          patch-type
                                          taint-effect]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.eks AlbScheme
                                                CapacityType
                                                ClusterLoggingTypes
                                                CoreDnsComputeType
                                                CpuArch
                                                DefaultCapacityType
                                                IpFamily
                                                MachineImageType
                                                NodeType
                                                NodegroupAmiType
                                                PatchType
                                                TaintEffect]))


(deftest alb-scheme-test
  (testing "Testing enum function alb-scheme"
    (is (= AlbScheme/INTERNAL (alb-scheme {:item AlbScheme/INTERNAL} "test" :item)))
    (is (= AlbScheme/INTERNAL (alb-scheme {:test/item AlbScheme/INTERNAL} "test" :item)))
    (is (= AlbScheme/INTERNET_FACING (alb-scheme {:item AlbScheme/INTERNET_FACING} "test" :item)))
    (is (= AlbScheme/INTERNET_FACING (alb-scheme {:test/item AlbScheme/INTERNET_FACING} "test" :item)))
    (is (= AlbScheme/INTERNAL (alb-scheme {:item :internal} "test" :item)))
    (is (= AlbScheme/INTERNAL (alb-scheme {:test/item :internal} "test" :item)))
    (is (= AlbScheme/INTERNET_FACING (alb-scheme {:item :internet-facing} "test" :item)))
    (is (= AlbScheme/INTERNET_FACING (alb-scheme {:test/item :internet-facing} "test" :item)))))


(deftest capacity-type-test
  (testing "Testing enum function capacity-type"
    (is (= CapacityType/ON_DEMAND (capacity-type {:item CapacityType/ON_DEMAND} "test" :item)))
    (is (= CapacityType/ON_DEMAND (capacity-type {:test/item CapacityType/ON_DEMAND} "test" :item)))
    (is (= CapacityType/SPOT (capacity-type {:item CapacityType/SPOT} "test" :item)))
    (is (= CapacityType/SPOT (capacity-type {:test/item CapacityType/SPOT} "test" :item)))
    (is (= CapacityType/ON_DEMAND (capacity-type {:item :on-demand} "test" :item)))
    (is (= CapacityType/ON_DEMAND (capacity-type {:test/item :on-demand} "test" :item)))
    (is (= CapacityType/SPOT (capacity-type {:item :spot} "test" :item)))
    (is (= CapacityType/SPOT (capacity-type {:test/item :spot} "test" :item)))))


(deftest cluster-logging-types-test
  (testing "Testing enum function cluster-logging-types"
    (is (= ClusterLoggingTypes/AUTHENTICATOR (cluster-logging-types {:item ClusterLoggingTypes/AUTHENTICATOR} "test" :item)))
    (is (= ClusterLoggingTypes/AUTHENTICATOR (cluster-logging-types {:test/item ClusterLoggingTypes/AUTHENTICATOR} "test" :item)))
    (is (= ClusterLoggingTypes/AUDIT (cluster-logging-types {:item ClusterLoggingTypes/AUDIT} "test" :item)))
    (is (= ClusterLoggingTypes/AUDIT (cluster-logging-types {:test/item ClusterLoggingTypes/AUDIT} "test" :item)))
    (is (= ClusterLoggingTypes/API (cluster-logging-types {:item ClusterLoggingTypes/API} "test" :item)))
    (is (= ClusterLoggingTypes/API (cluster-logging-types {:test/item ClusterLoggingTypes/API} "test" :item)))
    (is (= ClusterLoggingTypes/SCHEDULER (cluster-logging-types {:item ClusterLoggingTypes/SCHEDULER} "test" :item)))
    (is (= ClusterLoggingTypes/SCHEDULER (cluster-logging-types {:test/item ClusterLoggingTypes/SCHEDULER} "test" :item)))
    (is (= ClusterLoggingTypes/CONTROLLER_MANAGER (cluster-logging-types {:item ClusterLoggingTypes/CONTROLLER_MANAGER} "test" :item)))
    (is (= ClusterLoggingTypes/CONTROLLER_MANAGER (cluster-logging-types {:test/item ClusterLoggingTypes/CONTROLLER_MANAGER} "test" :item)))
    (is (= ClusterLoggingTypes/AUTHENTICATOR (cluster-logging-types {:item :authenticator} "test" :item)))
    (is (= ClusterLoggingTypes/AUTHENTICATOR (cluster-logging-types {:test/item :authenticator} "test" :item)))
    (is (= ClusterLoggingTypes/AUDIT (cluster-logging-types {:item :audit} "test" :item)))
    (is (= ClusterLoggingTypes/AUDIT (cluster-logging-types {:test/item :audit} "test" :item)))
    (is (= ClusterLoggingTypes/API (cluster-logging-types {:item :api} "test" :item)))
    (is (= ClusterLoggingTypes/API (cluster-logging-types {:test/item :api} "test" :item)))
    (is (= ClusterLoggingTypes/SCHEDULER (cluster-logging-types {:item :scheduler} "test" :item)))
    (is (= ClusterLoggingTypes/SCHEDULER (cluster-logging-types {:test/item :scheduler} "test" :item)))
    (is (= ClusterLoggingTypes/CONTROLLER_MANAGER (cluster-logging-types {:item :controller-manager} "test" :item)))
    (is (= ClusterLoggingTypes/CONTROLLER_MANAGER (cluster-logging-types {:test/item :controller-manager} "test" :item)))))


(deftest core-dns-compute-type-test
  (testing "Testing enum function core-dns-compute-type"
    (is (= CoreDnsComputeType/FARGATE (core-dns-compute-type {:item CoreDnsComputeType/FARGATE} "test" :item)))
    (is (= CoreDnsComputeType/FARGATE (core-dns-compute-type {:test/item CoreDnsComputeType/FARGATE} "test" :item)))
    (is (= CoreDnsComputeType/EC2 (core-dns-compute-type {:item CoreDnsComputeType/EC2} "test" :item)))
    (is (= CoreDnsComputeType/EC2 (core-dns-compute-type {:test/item CoreDnsComputeType/EC2} "test" :item)))
    (is (= CoreDnsComputeType/FARGATE (core-dns-compute-type {:item :fargate} "test" :item)))
    (is (= CoreDnsComputeType/FARGATE (core-dns-compute-type {:test/item :fargate} "test" :item)))
    (is (= CoreDnsComputeType/EC2 (core-dns-compute-type {:item :ec2} "test" :item)))
    (is (= CoreDnsComputeType/EC2 (core-dns-compute-type {:test/item :ec2} "test" :item)))))


(deftest cpu-arch-test
  (testing "Testing enum function cpu-arch"
    (is (= CpuArch/X86_64 (cpu-arch {:item CpuArch/X86_64} "test" :item)))
    (is (= CpuArch/X86_64 (cpu-arch {:test/item CpuArch/X86_64} "test" :item)))
    (is (= CpuArch/ARM_64 (cpu-arch {:item CpuArch/ARM_64} "test" :item)))
    (is (= CpuArch/ARM_64 (cpu-arch {:test/item CpuArch/ARM_64} "test" :item)))
    (is (= CpuArch/X86_64 (cpu-arch {:item :x86-64} "test" :item)))
    (is (= CpuArch/X86_64 (cpu-arch {:test/item :x86-64} "test" :item)))
    (is (= CpuArch/ARM_64 (cpu-arch {:item :arm-64} "test" :item)))
    (is (= CpuArch/ARM_64 (cpu-arch {:test/item :arm-64} "test" :item)))))


(deftest default-capacity-type-test
  (testing "Testing enum function default-capacity-type"
    (is (= DefaultCapacityType/EC2 (default-capacity-type {:item DefaultCapacityType/EC2} "test" :item)))
    (is (= DefaultCapacityType/EC2 (default-capacity-type {:test/item DefaultCapacityType/EC2} "test" :item)))
    (is (= DefaultCapacityType/NODEGROUP (default-capacity-type {:item DefaultCapacityType/NODEGROUP} "test" :item)))
    (is (= DefaultCapacityType/NODEGROUP (default-capacity-type {:test/item DefaultCapacityType/NODEGROUP} "test" :item)))
    (is (= DefaultCapacityType/EC2 (default-capacity-type {:item :ec2} "test" :item)))
    (is (= DefaultCapacityType/EC2 (default-capacity-type {:test/item :ec2} "test" :item)))
    (is (= DefaultCapacityType/NODEGROUP (default-capacity-type {:item :nodegroup} "test" :item)))
    (is (= DefaultCapacityType/NODEGROUP (default-capacity-type {:test/item :nodegroup} "test" :item)))))


(deftest ip-family-test
  (testing "Testing enum function ip-family"
    (is (= IpFamily/IP_V4 (ip-family {:item IpFamily/IP_V4} "test" :item)))
    (is (= IpFamily/IP_V4 (ip-family {:test/item IpFamily/IP_V4} "test" :item)))
    (is (= IpFamily/IP_V6 (ip-family {:item IpFamily/IP_V6} "test" :item)))
    (is (= IpFamily/IP_V6 (ip-family {:test/item IpFamily/IP_V6} "test" :item)))
    (is (= IpFamily/IP_V4 (ip-family {:item :ip-v4} "test" :item)))
    (is (= IpFamily/IP_V4 (ip-family {:test/item :ip-v4} "test" :item)))
    (is (= IpFamily/IP_V6 (ip-family {:item :ip-v6} "test" :item)))
    (is (= IpFamily/IP_V6 (ip-family {:test/item :ip-v6} "test" :item)))))


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


(deftest node-type-test
  (testing "Testing enum function node-type"
    (is (= NodeType/TRAINIUM (node-type {:item NodeType/TRAINIUM} "test" :item)))
    (is (= NodeType/TRAINIUM (node-type {:test/item NodeType/TRAINIUM} "test" :item)))
    (is (= NodeType/GPU (node-type {:item NodeType/GPU} "test" :item)))
    (is (= NodeType/GPU (node-type {:test/item NodeType/GPU} "test" :item)))
    (is (= NodeType/INFERENTIA (node-type {:item NodeType/INFERENTIA} "test" :item)))
    (is (= NodeType/INFERENTIA (node-type {:test/item NodeType/INFERENTIA} "test" :item)))
    (is (= NodeType/STANDARD (node-type {:item NodeType/STANDARD} "test" :item)))
    (is (= NodeType/STANDARD (node-type {:test/item NodeType/STANDARD} "test" :item)))
    (is (= NodeType/TRAINIUM (node-type {:item :trainium} "test" :item)))
    (is (= NodeType/TRAINIUM (node-type {:test/item :trainium} "test" :item)))
    (is (= NodeType/GPU (node-type {:item :gpu} "test" :item)))
    (is (= NodeType/GPU (node-type {:test/item :gpu} "test" :item)))
    (is (= NodeType/INFERENTIA (node-type {:item :inferentia} "test" :item)))
    (is (= NodeType/INFERENTIA (node-type {:test/item :inferentia} "test" :item)))
    (is (= NodeType/STANDARD (node-type {:item :standard} "test" :item)))
    (is (= NodeType/STANDARD (node-type {:test/item :standard} "test" :item)))))


(deftest nodegroup-ami-type-test
  (testing "Testing enum function nodegroup-ami-type"
    (is (= NodegroupAmiType/WINDOWS_CORE_2019_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/WINDOWS_CORE_2019_X86_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2019_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/WINDOWS_CORE_2019_X86_64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64 (nodegroup-ami-type {:item NodegroupAmiType/BOTTLEROCKET_ARM_64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64 (nodegroup-ami-type {:test/item NodegroupAmiType/BOTTLEROCKET_ARM_64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA (nodegroup-ami-type {:item NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA (nodegroup-ami-type {:test/item NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2022_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/WINDOWS_FULL_2022_X86_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2022_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/WINDOWS_FULL_2022_X86_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2022_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/WINDOWS_CORE_2022_X86_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2022_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/WINDOWS_CORE_2022_X86_64} "test" :item)))
    (is (= NodegroupAmiType/AL2023_ARM_64_STANDARD (nodegroup-ami-type {:item NodegroupAmiType/AL2023_ARM_64_STANDARD} "test" :item)))
    (is (= NodegroupAmiType/AL2023_ARM_64_STANDARD (nodegroup-ami-type {:test/item NodegroupAmiType/AL2023_ARM_64_STANDARD} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/BOTTLEROCKET_X86_64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/BOTTLEROCKET_X86_64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/AL2_X86_64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/AL2_X86_64} "test" :item)))
    (is (= NodegroupAmiType/AL2023_X86_64_STANDARD (nodegroup-ami-type {:item NodegroupAmiType/AL2023_X86_64_STANDARD} "test" :item)))
    (is (= NodegroupAmiType/AL2023_X86_64_STANDARD (nodegroup-ami-type {:test/item NodegroupAmiType/AL2023_X86_64_STANDARD} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2019_X86_64 (nodegroup-ami-type {:item NodegroupAmiType/WINDOWS_FULL_2019_X86_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2019_X86_64 (nodegroup-ami-type {:test/item NodegroupAmiType/WINDOWS_FULL_2019_X86_64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64_GPU (nodegroup-ami-type {:item NodegroupAmiType/AL2_X86_64_GPU} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64_GPU (nodegroup-ami-type {:test/item NodegroupAmiType/AL2_X86_64_GPU} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA (nodegroup-ami-type {:item NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA (nodegroup-ami-type {:test/item NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA} "test" :item)))
    (is (= NodegroupAmiType/AL2_ARM_64 (nodegroup-ami-type {:item NodegroupAmiType/AL2_ARM_64} "test" :item)))
    (is (= NodegroupAmiType/AL2_ARM_64 (nodegroup-ami-type {:test/item NodegroupAmiType/AL2_ARM_64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2019_X86_64 (nodegroup-ami-type {:item :windows-core-2019-x86-64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2019_X86_64 (nodegroup-ami-type {:test/item :windows-core-2019-x86-64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64 (nodegroup-ami-type {:item :bottlerocket-arm-64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64 (nodegroup-ami-type {:test/item :bottlerocket-arm-64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA (nodegroup-ami-type {:item :bottlerocket-x86-64-nvidia} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64_NVIDIA (nodegroup-ami-type {:test/item :bottlerocket-x86-64-nvidia} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2022_X86_64 (nodegroup-ami-type {:item :windows-full-2022-x86-64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2022_X86_64 (nodegroup-ami-type {:test/item :windows-full-2022-x86-64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2022_X86_64 (nodegroup-ami-type {:item :windows-core-2022-x86-64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_CORE_2022_X86_64 (nodegroup-ami-type {:test/item :windows-core-2022-x86-64} "test" :item)))
    (is (= NodegroupAmiType/AL2023_ARM_64_STANDARD (nodegroup-ami-type {:item :al2023-arm-64-standard} "test" :item)))
    (is (= NodegroupAmiType/AL2023_ARM_64_STANDARD (nodegroup-ami-type {:test/item :al2023-arm-64-standard} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64 (nodegroup-ami-type {:item :bottlerocket-x86-64} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_X86_64 (nodegroup-ami-type {:test/item :bottlerocket-x86-64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64 (nodegroup-ami-type {:item :al2-x86-64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64 (nodegroup-ami-type {:test/item :al2-x86-64} "test" :item)))
    (is (= NodegroupAmiType/AL2023_X86_64_STANDARD (nodegroup-ami-type {:item :al2023-x86-64-standard} "test" :item)))
    (is (= NodegroupAmiType/AL2023_X86_64_STANDARD (nodegroup-ami-type {:test/item :al2023-x86-64-standard} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2019_X86_64 (nodegroup-ami-type {:item :windows-full-2019-x86-64} "test" :item)))
    (is (= NodegroupAmiType/WINDOWS_FULL_2019_X86_64 (nodegroup-ami-type {:test/item :windows-full-2019-x86-64} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64_GPU (nodegroup-ami-type {:item :al2-x86-64-gpu} "test" :item)))
    (is (= NodegroupAmiType/AL2_X86_64_GPU (nodegroup-ami-type {:test/item :al2-x86-64-gpu} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA (nodegroup-ami-type {:item :bottlerocket-arm-64-nvidia} "test" :item)))
    (is (= NodegroupAmiType/BOTTLEROCKET_ARM_64_NVIDIA (nodegroup-ami-type {:test/item :bottlerocket-arm-64-nvidia} "test" :item)))
    (is (= NodegroupAmiType/AL2_ARM_64 (nodegroup-ami-type {:item :al2-arm-64} "test" :item)))
    (is (= NodegroupAmiType/AL2_ARM_64 (nodegroup-ami-type {:test/item :al2-arm-64} "test" :item)))))


(deftest patch-type-test
  (testing "Testing enum function patch-type"
    (is (= PatchType/STRATEGIC (patch-type {:item PatchType/STRATEGIC} "test" :item)))
    (is (= PatchType/STRATEGIC (patch-type {:test/item PatchType/STRATEGIC} "test" :item)))
    (is (= PatchType/JSON (patch-type {:item PatchType/JSON} "test" :item)))
    (is (= PatchType/JSON (patch-type {:test/item PatchType/JSON} "test" :item)))
    (is (= PatchType/MERGE (patch-type {:item PatchType/MERGE} "test" :item)))
    (is (= PatchType/MERGE (patch-type {:test/item PatchType/MERGE} "test" :item)))
    (is (= PatchType/STRATEGIC (patch-type {:item :strategic} "test" :item)))
    (is (= PatchType/STRATEGIC (patch-type {:test/item :strategic} "test" :item)))
    (is (= PatchType/JSON (patch-type {:item :json} "test" :item)))
    (is (= PatchType/JSON (patch-type {:test/item :json} "test" :item)))
    (is (= PatchType/MERGE (patch-type {:item :merge} "test" :item)))
    (is (= PatchType/MERGE (patch-type {:test/item :merge} "test" :item)))))


(deftest taint-effect-test
  (testing "Testing enum function taint-effect"
    (is (= TaintEffect/PREFER_NO_SCHEDULE (taint-effect {:item TaintEffect/PREFER_NO_SCHEDULE} "test" :item)))
    (is (= TaintEffect/PREFER_NO_SCHEDULE (taint-effect {:test/item TaintEffect/PREFER_NO_SCHEDULE} "test" :item)))
    (is (= TaintEffect/NO_EXECUTE (taint-effect {:item TaintEffect/NO_EXECUTE} "test" :item)))
    (is (= TaintEffect/NO_EXECUTE (taint-effect {:test/item TaintEffect/NO_EXECUTE} "test" :item)))
    (is (= TaintEffect/NO_SCHEDULE (taint-effect {:item TaintEffect/NO_SCHEDULE} "test" :item)))
    (is (= TaintEffect/NO_SCHEDULE (taint-effect {:test/item TaintEffect/NO_SCHEDULE} "test" :item)))
    (is (= TaintEffect/PREFER_NO_SCHEDULE (taint-effect {:item :prefer-no-schedule} "test" :item)))
    (is (= TaintEffect/PREFER_NO_SCHEDULE (taint-effect {:test/item :prefer-no-schedule} "test" :item)))
    (is (= TaintEffect/NO_EXECUTE (taint-effect {:item :no-execute} "test" :item)))
    (is (= TaintEffect/NO_EXECUTE (taint-effect {:test/item :no-execute} "test" :item)))
    (is (= TaintEffect/NO_SCHEDULE (taint-effect {:item :no-schedule} "test" :item)))
    (is (= TaintEffect/NO_SCHEDULE (taint-effect {:test/item :no-schedule} "test" :item)))))