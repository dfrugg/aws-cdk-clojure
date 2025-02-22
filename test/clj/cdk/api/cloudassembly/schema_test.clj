(ns cdk.api.cloudassembly.schema-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cloudassembly.schema package. "
  (:require [cdk.api.cloudassembly.schema :refer [artifact-metadata-entry-type
                                                  artifact-type
                                                  context-provider
                                                  file-asset-packaging
                                                  load-balancer-listener-protocol
                                                  load-balancer-type
                                                  require-approval]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.cloudassembly.schema ArtifactMetadataEntryType
                                                        ArtifactType
                                                        ContextProvider
                                                        FileAssetPackaging
                                                        LoadBalancerListenerProtocol
                                                        LoadBalancerType
                                                        RequireApproval]))


(deftest artifact-metadata-entry-type-test
  (testing "Testing enum function artifact-metadata-entry-type"
    (is (= ArtifactMetadataEntryType/LOGICAL_ID (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/LOGICAL_ID} "test" :item)))
    (is (= ArtifactMetadataEntryType/LOGICAL_ID (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/LOGICAL_ID} "test" :item)))
    (is (= ArtifactMetadataEntryType/INFO (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/INFO} "test" :item)))
    (is (= ArtifactMetadataEntryType/INFO (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/INFO} "test" :item)))
    (is (= ArtifactMetadataEntryType/ERROR (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/ERROR} "test" :item)))
    (is (= ArtifactMetadataEntryType/ERROR (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/ERROR} "test" :item)))
    (is (= ArtifactMetadataEntryType/WARN (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/WARN} "test" :item)))
    (is (= ArtifactMetadataEntryType/WARN (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/WARN} "test" :item)))
    (is (= ArtifactMetadataEntryType/ASSET (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/ASSET} "test" :item)))
    (is (= ArtifactMetadataEntryType/ASSET (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/ASSET} "test" :item)))
    (is (= ArtifactMetadataEntryType/STACK_TAGS (artifact-metadata-entry-type {:item ArtifactMetadataEntryType/STACK_TAGS} "test" :item)))
    (is (= ArtifactMetadataEntryType/STACK_TAGS (artifact-metadata-entry-type {:test/item ArtifactMetadataEntryType/STACK_TAGS} "test" :item)))
    (is (= ArtifactMetadataEntryType/LOGICAL_ID (artifact-metadata-entry-type {:item :logical-id} "test" :item)))
    (is (= ArtifactMetadataEntryType/LOGICAL_ID (artifact-metadata-entry-type {:test/item :logical-id} "test" :item)))
    (is (= ArtifactMetadataEntryType/INFO (artifact-metadata-entry-type {:item :info} "test" :item)))
    (is (= ArtifactMetadataEntryType/INFO (artifact-metadata-entry-type {:test/item :info} "test" :item)))
    (is (= ArtifactMetadataEntryType/ERROR (artifact-metadata-entry-type {:item :error} "test" :item)))
    (is (= ArtifactMetadataEntryType/ERROR (artifact-metadata-entry-type {:test/item :error} "test" :item)))
    (is (= ArtifactMetadataEntryType/WARN (artifact-metadata-entry-type {:item :warn} "test" :item)))
    (is (= ArtifactMetadataEntryType/WARN (artifact-metadata-entry-type {:test/item :warn} "test" :item)))
    (is (= ArtifactMetadataEntryType/ASSET (artifact-metadata-entry-type {:item :asset} "test" :item)))
    (is (= ArtifactMetadataEntryType/ASSET (artifact-metadata-entry-type {:test/item :asset} "test" :item)))
    (is (= ArtifactMetadataEntryType/STACK_TAGS (artifact-metadata-entry-type {:item :stack-tags} "test" :item)))
    (is (= ArtifactMetadataEntryType/STACK_TAGS (artifact-metadata-entry-type {:test/item :stack-tags} "test" :item)))))


(deftest artifact-type-test
  (testing "Testing enum function artifact-type"
    (is (= ArtifactType/CDK_TREE (artifact-type {:item ArtifactType/CDK_TREE} "test" :item)))
    (is (= ArtifactType/CDK_TREE (artifact-type {:test/item ArtifactType/CDK_TREE} "test" :item)))
    (is (= ArtifactType/AWS_CLOUDFORMATION_STACK (artifact-type {:item ArtifactType/AWS_CLOUDFORMATION_STACK} "test" :item)))
    (is (= ArtifactType/AWS_CLOUDFORMATION_STACK (artifact-type {:test/item ArtifactType/AWS_CLOUDFORMATION_STACK} "test" :item)))
    (is (= ArtifactType/ASSET_MANIFEST (artifact-type {:item ArtifactType/ASSET_MANIFEST} "test" :item)))
    (is (= ArtifactType/ASSET_MANIFEST (artifact-type {:test/item ArtifactType/ASSET_MANIFEST} "test" :item)))
    (is (= ArtifactType/NONE (artifact-type {:item ArtifactType/NONE} "test" :item)))
    (is (= ArtifactType/NONE (artifact-type {:test/item ArtifactType/NONE} "test" :item)))
    (is (= ArtifactType/NESTED_CLOUD_ASSEMBLY (artifact-type {:item ArtifactType/NESTED_CLOUD_ASSEMBLY} "test" :item)))
    (is (= ArtifactType/NESTED_CLOUD_ASSEMBLY (artifact-type {:test/item ArtifactType/NESTED_CLOUD_ASSEMBLY} "test" :item)))
    (is (= ArtifactType/CDK_TREE (artifact-type {:item :cdk-tree} "test" :item)))
    (is (= ArtifactType/CDK_TREE (artifact-type {:test/item :cdk-tree} "test" :item)))
    (is (= ArtifactType/AWS_CLOUDFORMATION_STACK (artifact-type {:item :aws-cloudformation-stack} "test" :item)))
    (is (= ArtifactType/AWS_CLOUDFORMATION_STACK (artifact-type {:test/item :aws-cloudformation-stack} "test" :item)))
    (is (= ArtifactType/ASSET_MANIFEST (artifact-type {:item :asset-manifest} "test" :item)))
    (is (= ArtifactType/ASSET_MANIFEST (artifact-type {:test/item :asset-manifest} "test" :item)))
    (is (= ArtifactType/NONE (artifact-type {:item :none} "test" :item)))
    (is (= ArtifactType/NONE (artifact-type {:test/item :none} "test" :item)))
    (is (= ArtifactType/NESTED_CLOUD_ASSEMBLY (artifact-type {:item :nested-cloud-assembly} "test" :item)))
    (is (= ArtifactType/NESTED_CLOUD_ASSEMBLY (artifact-type {:test/item :nested-cloud-assembly} "test" :item)))))


(deftest context-provider-test
  (testing "Testing enum function context-provider"
    (is (= ContextProvider/VPC_PROVIDER (context-provider {:item ContextProvider/VPC_PROVIDER} "test" :item)))
    (is (= ContextProvider/VPC_PROVIDER (context-provider {:test/item ContextProvider/VPC_PROVIDER} "test" :item)))
    (is (= ContextProvider/HOSTED_ZONE_PROVIDER (context-provider {:item ContextProvider/HOSTED_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/HOSTED_ZONE_PROVIDER (context-provider {:test/item ContextProvider/HOSTED_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/KEY_PROVIDER (context-provider {:item ContextProvider/KEY_PROVIDER} "test" :item)))
    (is (= ContextProvider/KEY_PROVIDER (context-provider {:test/item ContextProvider/KEY_PROVIDER} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER (context-provider {:item ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER (context-provider {:test/item ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER} "test" :item)))
    (is (= ContextProvider/SECURITY_GROUP_PROVIDER (context-provider {:item ContextProvider/SECURITY_GROUP_PROVIDER} "test" :item)))
    (is (= ContextProvider/SECURITY_GROUP_PROVIDER (context-provider {:test/item ContextProvider/SECURITY_GROUP_PROVIDER} "test" :item)))
    (is (= ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER (context-provider {:item ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER (context-provider {:test/item ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/AMI_PROVIDER (context-provider {:item ContextProvider/AMI_PROVIDER} "test" :item)))
    (is (= ContextProvider/AMI_PROVIDER (context-provider {:test/item ContextProvider/AMI_PROVIDER} "test" :item)))
    (is (= ContextProvider/PLUGIN (context-provider {:item ContextProvider/PLUGIN} "test" :item)))
    (is (= ContextProvider/PLUGIN (context-provider {:test/item ContextProvider/PLUGIN} "test" :item)))
    (is (= ContextProvider/AVAILABILITY_ZONE_PROVIDER (context-provider {:item ContextProvider/AVAILABILITY_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/AVAILABILITY_ZONE_PROVIDER (context-provider {:test/item ContextProvider/AVAILABILITY_ZONE_PROVIDER} "test" :item)))
    (is (= ContextProvider/SSM_PARAMETER_PROVIDER (context-provider {:item ContextProvider/SSM_PARAMETER_PROVIDER} "test" :item)))
    (is (= ContextProvider/SSM_PARAMETER_PROVIDER (context-provider {:test/item ContextProvider/SSM_PARAMETER_PROVIDER} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_PROVIDER (context-provider {:item ContextProvider/LOAD_BALANCER_PROVIDER} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_PROVIDER (context-provider {:test/item ContextProvider/LOAD_BALANCER_PROVIDER} "test" :item)))
    (is (= ContextProvider/VPC_PROVIDER (context-provider {:item :vpc-provider} "test" :item)))
    (is (= ContextProvider/VPC_PROVIDER (context-provider {:test/item :vpc-provider} "test" :item)))
    (is (= ContextProvider/HOSTED_ZONE_PROVIDER (context-provider {:item :hosted-zone-provider} "test" :item)))
    (is (= ContextProvider/HOSTED_ZONE_PROVIDER (context-provider {:test/item :hosted-zone-provider} "test" :item)))
    (is (= ContextProvider/KEY_PROVIDER (context-provider {:item :key-provider} "test" :item)))
    (is (= ContextProvider/KEY_PROVIDER (context-provider {:test/item :key-provider} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER (context-provider {:item :load-balancer-listener-provider} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER (context-provider {:test/item :load-balancer-listener-provider} "test" :item)))
    (is (= ContextProvider/SECURITY_GROUP_PROVIDER (context-provider {:item :security-group-provider} "test" :item)))
    (is (= ContextProvider/SECURITY_GROUP_PROVIDER (context-provider {:test/item :security-group-provider} "test" :item)))
    (is (= ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER (context-provider {:item :endpoint-service-availability-zone-provider} "test" :item)))
    (is (= ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER (context-provider {:test/item :endpoint-service-availability-zone-provider} "test" :item)))
    (is (= ContextProvider/AMI_PROVIDER (context-provider {:item :ami-provider} "test" :item)))
    (is (= ContextProvider/AMI_PROVIDER (context-provider {:test/item :ami-provider} "test" :item)))
    (is (= ContextProvider/PLUGIN (context-provider {:item :plugin} "test" :item)))
    (is (= ContextProvider/PLUGIN (context-provider {:test/item :plugin} "test" :item)))
    (is (= ContextProvider/AVAILABILITY_ZONE_PROVIDER (context-provider {:item :availability-zone-provider} "test" :item)))
    (is (= ContextProvider/AVAILABILITY_ZONE_PROVIDER (context-provider {:test/item :availability-zone-provider} "test" :item)))
    (is (= ContextProvider/SSM_PARAMETER_PROVIDER (context-provider {:item :ssm-parameter-provider} "test" :item)))
    (is (= ContextProvider/SSM_PARAMETER_PROVIDER (context-provider {:test/item :ssm-parameter-provider} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_PROVIDER (context-provider {:item :load-balancer-provider} "test" :item)))
    (is (= ContextProvider/LOAD_BALANCER_PROVIDER (context-provider {:test/item :load-balancer-provider} "test" :item)))))


(deftest file-asset-packaging-test
  (testing "Testing enum function file-asset-packaging"
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:item FileAssetPackaging/FILE} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:test/item FileAssetPackaging/FILE} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:item FileAssetPackaging/ZIP_DIRECTORY} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:test/item FileAssetPackaging/ZIP_DIRECTORY} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:item :file} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:test/item :file} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:item :zip-directory} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:test/item :zip-directory} "test" :item)))))


(deftest load-balancer-listener-protocol-test
  (testing "Testing enum function load-balancer-listener-protocol"
    (is (= LoadBalancerListenerProtocol/HTTP (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/HTTP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTP (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/HTTP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TLS (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/TLS} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TLS (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/TLS} "test" :item)))
    (is (= LoadBalancerListenerProtocol/UDP (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/UDP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/UDP (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/UDP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTPS (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/HTTPS} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTPS (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/HTTPS} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/TCP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/TCP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP_UDP (load-balancer-listener-protocol {:item LoadBalancerListenerProtocol/TCP_UDP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP_UDP (load-balancer-listener-protocol {:test/item LoadBalancerListenerProtocol/TCP_UDP} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTP (load-balancer-listener-protocol {:item :http} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTP (load-balancer-listener-protocol {:test/item :http} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TLS (load-balancer-listener-protocol {:item :tls} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TLS (load-balancer-listener-protocol {:test/item :tls} "test" :item)))
    (is (= LoadBalancerListenerProtocol/UDP (load-balancer-listener-protocol {:item :udp} "test" :item)))
    (is (= LoadBalancerListenerProtocol/UDP (load-balancer-listener-protocol {:test/item :udp} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTPS (load-balancer-listener-protocol {:item :https} "test" :item)))
    (is (= LoadBalancerListenerProtocol/HTTPS (load-balancer-listener-protocol {:test/item :https} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP (load-balancer-listener-protocol {:item :tcp} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP (load-balancer-listener-protocol {:test/item :tcp} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP_UDP (load-balancer-listener-protocol {:item :tcp-udp} "test" :item)))
    (is (= LoadBalancerListenerProtocol/TCP_UDP (load-balancer-listener-protocol {:test/item :tcp-udp} "test" :item)))))


(deftest load-balancer-type-test
  (testing "Testing enum function load-balancer-type"
    (is (= LoadBalancerType/NETWORK (load-balancer-type {:item LoadBalancerType/NETWORK} "test" :item)))
    (is (= LoadBalancerType/NETWORK (load-balancer-type {:test/item LoadBalancerType/NETWORK} "test" :item)))
    (is (= LoadBalancerType/APPLICATION (load-balancer-type {:item LoadBalancerType/APPLICATION} "test" :item)))
    (is (= LoadBalancerType/APPLICATION (load-balancer-type {:test/item LoadBalancerType/APPLICATION} "test" :item)))
    (is (= LoadBalancerType/NETWORK (load-balancer-type {:item :network} "test" :item)))
    (is (= LoadBalancerType/NETWORK (load-balancer-type {:test/item :network} "test" :item)))
    (is (= LoadBalancerType/APPLICATION (load-balancer-type {:item :application} "test" :item)))
    (is (= LoadBalancerType/APPLICATION (load-balancer-type {:test/item :application} "test" :item)))))


(deftest require-approval-test
  (testing "Testing enum function require-approval"
    (is (= RequireApproval/ANYCHANGE (require-approval {:item RequireApproval/ANYCHANGE} "test" :item)))
    (is (= RequireApproval/ANYCHANGE (require-approval {:test/item RequireApproval/ANYCHANGE} "test" :item)))
    (is (= RequireApproval/BROADENING (require-approval {:item RequireApproval/BROADENING} "test" :item)))
    (is (= RequireApproval/BROADENING (require-approval {:test/item RequireApproval/BROADENING} "test" :item)))
    (is (= RequireApproval/NEVER (require-approval {:item RequireApproval/NEVER} "test" :item)))
    (is (= RequireApproval/NEVER (require-approval {:test/item RequireApproval/NEVER} "test" :item)))
    (is (= RequireApproval/ANYCHANGE (require-approval {:item :anychange} "test" :item)))
    (is (= RequireApproval/ANYCHANGE (require-approval {:test/item :anychange} "test" :item)))
    (is (= RequireApproval/BROADENING (require-approval {:item :broadening} "test" :item)))
    (is (= RequireApproval/BROADENING (require-approval {:test/item :broadening} "test" :item)))
    (is (= RequireApproval/NEVER (require-approval {:item :never} "test" :item)))
    (is (= RequireApproval/NEVER (require-approval {:test/item :never} "test" :item)))))