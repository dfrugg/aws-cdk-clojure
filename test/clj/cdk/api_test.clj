(ns cdk.api-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api :refer [arn-format
                             asset-hash-type
                             bundling-file-access
                             bundling-output
                             cfn-capabilities
                             cfn-deletion-policy
                             cfn-dynamic-reference-service
                             cfn-traffic-routing-type
                             custom-resource-provider-runtime
                             docker-volume-consistency
                             file-asset-packaging
                             ignore-mode
                             policy-validation-report-status-beta1
                             removal-policy
                             resolution-type-hint
                             size-rounding-behavior
                             symlink-follow-mode
                             tag-type]])
  (:import [software.amazon.awscdk ArnFormat
                                   AssetHashType
                                   BundlingFileAccess
                                   BundlingOutput
                                   CfnCapabilities
                                   CfnDeletionPolicy
                                   CfnDynamicReferenceService
                                   CfnTrafficRoutingType
                                   CustomResourceProviderRuntime
                                   DockerVolumeConsistency
                                   FileAssetPackaging
                                   IgnoreMode
                                   PolicyValidationReportStatusBeta1
                                   RemovalPolicy
                                   ResolutionTypeHint
                                   SizeRoundingBehavior
                                   SymlinkFollowMode
                                   TagType]))


(deftest arn-format-test
  (testing "Testing enum function arn-format"
    (is (= ArnFormat/SLASH_RESOURCE_NAME (arn-format {:item ArnFormat/SLASH_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_NAME (arn-format {:test/item ArnFormat/SLASH_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/NO_RESOURCE_NAME (arn-format {:item ArnFormat/NO_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/NO_RESOURCE_NAME (arn-format {:test/item ArnFormat/NO_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME (arn-format {:item ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME (arn-format {:test/item ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/COLON_RESOURCE_NAME (arn-format {:item ArnFormat/COLON_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/COLON_RESOURCE_NAME (arn-format {:test/item ArnFormat/COLON_RESOURCE_NAME} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_NAME (arn-format {:item :slash-resource-name} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_NAME (arn-format {:test/item :slash-resource-name} "test" :item)))
    (is (= ArnFormat/NO_RESOURCE_NAME (arn-format {:item :no-resource-name} "test" :item)))
    (is (= ArnFormat/NO_RESOURCE_NAME (arn-format {:test/item :no-resource-name} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME (arn-format {:item :slash-resource-slash-resource-name} "test" :item)))
    (is (= ArnFormat/SLASH_RESOURCE_SLASH_RESOURCE_NAME (arn-format {:test/item :slash-resource-slash-resource-name} "test" :item)))
    (is (= ArnFormat/COLON_RESOURCE_NAME (arn-format {:item :colon-resource-name} "test" :item)))
    (is (= ArnFormat/COLON_RESOURCE_NAME (arn-format {:test/item :colon-resource-name} "test" :item)))))


(deftest asset-hash-type-test
  (testing "Testing enum function asset-hash-type"
    (is (= AssetHashType/OUTPUT (asset-hash-type {:item AssetHashType/OUTPUT} "test" :item)))
    (is (= AssetHashType/OUTPUT (asset-hash-type {:test/item AssetHashType/OUTPUT} "test" :item)))
    (is (= AssetHashType/SOURCE (asset-hash-type {:item AssetHashType/SOURCE} "test" :item)))
    (is (= AssetHashType/SOURCE (asset-hash-type {:test/item AssetHashType/SOURCE} "test" :item)))
    (is (= AssetHashType/CUSTOM (asset-hash-type {:item AssetHashType/CUSTOM} "test" :item)))
    (is (= AssetHashType/CUSTOM (asset-hash-type {:test/item AssetHashType/CUSTOM} "test" :item)))
    (is (= AssetHashType/OUTPUT (asset-hash-type {:item :output} "test" :item)))
    (is (= AssetHashType/OUTPUT (asset-hash-type {:test/item :output} "test" :item)))
    (is (= AssetHashType/SOURCE (asset-hash-type {:item :source} "test" :item)))
    (is (= AssetHashType/SOURCE (asset-hash-type {:test/item :source} "test" :item)))
    (is (= AssetHashType/CUSTOM (asset-hash-type {:item :custom} "test" :item)))
    (is (= AssetHashType/CUSTOM (asset-hash-type {:test/item :custom} "test" :item)))))


(deftest bundling-file-access-test
  (testing "Testing enum function bundling-file-access"
    (is (= BundlingFileAccess/BIND_MOUNT (bundling-file-access {:item BundlingFileAccess/BIND_MOUNT} "test" :item)))
    (is (= BundlingFileAccess/BIND_MOUNT (bundling-file-access {:test/item BundlingFileAccess/BIND_MOUNT} "test" :item)))
    (is (= BundlingFileAccess/VOLUME_COPY (bundling-file-access {:item BundlingFileAccess/VOLUME_COPY} "test" :item)))
    (is (= BundlingFileAccess/VOLUME_COPY (bundling-file-access {:test/item BundlingFileAccess/VOLUME_COPY} "test" :item)))
    (is (= BundlingFileAccess/BIND_MOUNT (bundling-file-access {:item :bind-mount} "test" :item)))
    (is (= BundlingFileAccess/BIND_MOUNT (bundling-file-access {:test/item :bind-mount} "test" :item)))
    (is (= BundlingFileAccess/VOLUME_COPY (bundling-file-access {:item :volume-copy} "test" :item)))
    (is (= BundlingFileAccess/VOLUME_COPY (bundling-file-access {:test/item :volume-copy} "test" :item)))))


(deftest bundling-output-test
  (testing "Testing enum function bundling-output"
    (is (= BundlingOutput/AUTO_DISCOVER (bundling-output {:item BundlingOutput/AUTO_DISCOVER} "test" :item)))
    (is (= BundlingOutput/AUTO_DISCOVER (bundling-output {:test/item BundlingOutput/AUTO_DISCOVER} "test" :item)))
    (is (= BundlingOutput/SINGLE_FILE (bundling-output {:item BundlingOutput/SINGLE_FILE} "test" :item)))
    (is (= BundlingOutput/SINGLE_FILE (bundling-output {:test/item BundlingOutput/SINGLE_FILE} "test" :item)))
    (is (= BundlingOutput/ARCHIVED (bundling-output {:item BundlingOutput/ARCHIVED} "test" :item)))
    (is (= BundlingOutput/ARCHIVED (bundling-output {:test/item BundlingOutput/ARCHIVED} "test" :item)))
    (is (= BundlingOutput/NOT_ARCHIVED (bundling-output {:item BundlingOutput/NOT_ARCHIVED} "test" :item)))
    (is (= BundlingOutput/NOT_ARCHIVED (bundling-output {:test/item BundlingOutput/NOT_ARCHIVED} "test" :item)))
    (is (= BundlingOutput/AUTO_DISCOVER (bundling-output {:item :auto-discover} "test" :item)))
    (is (= BundlingOutput/AUTO_DISCOVER (bundling-output {:test/item :auto-discover} "test" :item)))
    (is (= BundlingOutput/SINGLE_FILE (bundling-output {:item :single-file} "test" :item)))
    (is (= BundlingOutput/SINGLE_FILE (bundling-output {:test/item :single-file} "test" :item)))
    (is (= BundlingOutput/ARCHIVED (bundling-output {:item :archived} "test" :item)))
    (is (= BundlingOutput/ARCHIVED (bundling-output {:test/item :archived} "test" :item)))
    (is (= BundlingOutput/NOT_ARCHIVED (bundling-output {:item :not-archived} "test" :item)))
    (is (= BundlingOutput/NOT_ARCHIVED (bundling-output {:test/item :not-archived} "test" :item)))))


(deftest cfn-capabilities-test
  (testing "Testing enum function cfn-capabilities"
    (is (= CfnCapabilities/AUTO_EXPAND (cfn-capabilities {:item CfnCapabilities/AUTO_EXPAND} "test" :item)))
    (is (= CfnCapabilities/AUTO_EXPAND (cfn-capabilities {:test/item CfnCapabilities/AUTO_EXPAND} "test" :item)))
    (is (= CfnCapabilities/NONE (cfn-capabilities {:item CfnCapabilities/NONE} "test" :item)))
    (is (= CfnCapabilities/NONE (cfn-capabilities {:test/item CfnCapabilities/NONE} "test" :item)))
    (is (= CfnCapabilities/NAMED_IAM (cfn-capabilities {:item CfnCapabilities/NAMED_IAM} "test" :item)))
    (is (= CfnCapabilities/NAMED_IAM (cfn-capabilities {:test/item CfnCapabilities/NAMED_IAM} "test" :item)))
    (is (= CfnCapabilities/ANONYMOUS_IAM (cfn-capabilities {:item CfnCapabilities/ANONYMOUS_IAM} "test" :item)))
    (is (= CfnCapabilities/ANONYMOUS_IAM (cfn-capabilities {:test/item CfnCapabilities/ANONYMOUS_IAM} "test" :item)))
    (is (= CfnCapabilities/AUTO_EXPAND (cfn-capabilities {:item :auto-expand} "test" :item)))
    (is (= CfnCapabilities/AUTO_EXPAND (cfn-capabilities {:test/item :auto-expand} "test" :item)))
    (is (= CfnCapabilities/NONE (cfn-capabilities {:item :none} "test" :item)))
    (is (= CfnCapabilities/NONE (cfn-capabilities {:test/item :none} "test" :item)))
    (is (= CfnCapabilities/NAMED_IAM (cfn-capabilities {:item :named-iam} "test" :item)))
    (is (= CfnCapabilities/NAMED_IAM (cfn-capabilities {:test/item :named-iam} "test" :item)))
    (is (= CfnCapabilities/ANONYMOUS_IAM (cfn-capabilities {:item :anonymous-iam} "test" :item)))
    (is (= CfnCapabilities/ANONYMOUS_IAM (cfn-capabilities {:test/item :anonymous-iam} "test" :item)))))


(deftest cfn-deletion-policy-test
  (testing "Testing enum function cfn-deletion-policy"
    (is (= CfnDeletionPolicy/DELETE (cfn-deletion-policy {:item CfnDeletionPolicy/DELETE} "test" :item)))
    (is (= CfnDeletionPolicy/DELETE (cfn-deletion-policy {:test/item CfnDeletionPolicy/DELETE} "test" :item)))
    (is (= CfnDeletionPolicy/SNAPSHOT (cfn-deletion-policy {:item CfnDeletionPolicy/SNAPSHOT} "test" :item)))
    (is (= CfnDeletionPolicy/SNAPSHOT (cfn-deletion-policy {:test/item CfnDeletionPolicy/SNAPSHOT} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN (cfn-deletion-policy {:item CfnDeletionPolicy/RETAIN} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN (cfn-deletion-policy {:test/item CfnDeletionPolicy/RETAIN} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE (cfn-deletion-policy {:item CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE (cfn-deletion-policy {:test/item CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE} "test" :item)))
    (is (= CfnDeletionPolicy/DELETE (cfn-deletion-policy {:item :delete} "test" :item)))
    (is (= CfnDeletionPolicy/DELETE (cfn-deletion-policy {:test/item :delete} "test" :item)))
    (is (= CfnDeletionPolicy/SNAPSHOT (cfn-deletion-policy {:item :snapshot} "test" :item)))
    (is (= CfnDeletionPolicy/SNAPSHOT (cfn-deletion-policy {:test/item :snapshot} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN (cfn-deletion-policy {:item :retain} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN (cfn-deletion-policy {:test/item :retain} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE (cfn-deletion-policy {:item :retain-except-on-create} "test" :item)))
    (is (= CfnDeletionPolicy/RETAIN_EXCEPT_ON_CREATE (cfn-deletion-policy {:test/item :retain-except-on-create} "test" :item)))))


(deftest cfn-dynamic-reference-service-test
  (testing "Testing enum function cfn-dynamic-reference-service"
    (is (= CfnDynamicReferenceService/SECRETS_MANAGER (cfn-dynamic-reference-service {:item CfnDynamicReferenceService/SECRETS_MANAGER} "test" :item)))
    (is (= CfnDynamicReferenceService/SECRETS_MANAGER (cfn-dynamic-reference-service {:test/item CfnDynamicReferenceService/SECRETS_MANAGER} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM (cfn-dynamic-reference-service {:item CfnDynamicReferenceService/SSM} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM (cfn-dynamic-reference-service {:test/item CfnDynamicReferenceService/SSM} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM_SECURE (cfn-dynamic-reference-service {:item CfnDynamicReferenceService/SSM_SECURE} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM_SECURE (cfn-dynamic-reference-service {:test/item CfnDynamicReferenceService/SSM_SECURE} "test" :item)))
    (is (= CfnDynamicReferenceService/SECRETS_MANAGER (cfn-dynamic-reference-service {:item :secrets-manager} "test" :item)))
    (is (= CfnDynamicReferenceService/SECRETS_MANAGER (cfn-dynamic-reference-service {:test/item :secrets-manager} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM (cfn-dynamic-reference-service {:item :ssm} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM (cfn-dynamic-reference-service {:test/item :ssm} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM_SECURE (cfn-dynamic-reference-service {:item :ssm-secure} "test" :item)))
    (is (= CfnDynamicReferenceService/SSM_SECURE (cfn-dynamic-reference-service {:test/item :ssm-secure} "test" :item)))))


(deftest cfn-traffic-routing-type-test
  (testing "Testing enum function cfn-traffic-routing-type"
    (is (= CfnTrafficRoutingType/TIME_BASED_LINEAR (cfn-traffic-routing-type {:item CfnTrafficRoutingType/TIME_BASED_LINEAR} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_LINEAR (cfn-traffic-routing-type {:test/item CfnTrafficRoutingType/TIME_BASED_LINEAR} "test" :item)))
    (is (= CfnTrafficRoutingType/ALL_AT_ONCE (cfn-traffic-routing-type {:item CfnTrafficRoutingType/ALL_AT_ONCE} "test" :item)))
    (is (= CfnTrafficRoutingType/ALL_AT_ONCE (cfn-traffic-routing-type {:test/item CfnTrafficRoutingType/ALL_AT_ONCE} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_CANARY (cfn-traffic-routing-type {:item CfnTrafficRoutingType/TIME_BASED_CANARY} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_CANARY (cfn-traffic-routing-type {:test/item CfnTrafficRoutingType/TIME_BASED_CANARY} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_LINEAR (cfn-traffic-routing-type {:item :time-based-linear} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_LINEAR (cfn-traffic-routing-type {:test/item :time-based-linear} "test" :item)))
    (is (= CfnTrafficRoutingType/ALL_AT_ONCE (cfn-traffic-routing-type {:item :all-at-once} "test" :item)))
    (is (= CfnTrafficRoutingType/ALL_AT_ONCE (cfn-traffic-routing-type {:test/item :all-at-once} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_CANARY (cfn-traffic-routing-type {:item :time-based-canary} "test" :item)))
    (is (= CfnTrafficRoutingType/TIME_BASED_CANARY (cfn-traffic-routing-type {:test/item :time-based-canary} "test" :item)))))


(deftest custom-resource-provider-runtime-test
  (testing "Testing enum function custom-resource-provider-runtime"
    (is (= CustomResourceProviderRuntime/NODEJS_14_X (custom-resource-provider-runtime {:item CustomResourceProviderRuntime/NODEJS_14_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_14_X (custom-resource-provider-runtime {:test/item CustomResourceProviderRuntime/NODEJS_14_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_12_X (custom-resource-provider-runtime {:item CustomResourceProviderRuntime/NODEJS_12_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_12_X (custom-resource-provider-runtime {:test/item CustomResourceProviderRuntime/NODEJS_12_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_16_X (custom-resource-provider-runtime {:item CustomResourceProviderRuntime/NODEJS_16_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_16_X (custom-resource-provider-runtime {:test/item CustomResourceProviderRuntime/NODEJS_16_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_18_X (custom-resource-provider-runtime {:item CustomResourceProviderRuntime/NODEJS_18_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_18_X (custom-resource-provider-runtime {:test/item CustomResourceProviderRuntime/NODEJS_18_X} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_14_X (custom-resource-provider-runtime {:item :nodejs-14-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_14_X (custom-resource-provider-runtime {:test/item :nodejs-14-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_12_X (custom-resource-provider-runtime {:item :nodejs-12-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_12_X (custom-resource-provider-runtime {:test/item :nodejs-12-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_16_X (custom-resource-provider-runtime {:item :nodejs-16-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_16_X (custom-resource-provider-runtime {:test/item :nodejs-16-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_18_X (custom-resource-provider-runtime {:item :nodejs-18-x} "test" :item)))
    (is (= CustomResourceProviderRuntime/NODEJS_18_X (custom-resource-provider-runtime {:test/item :nodejs-18-x} "test" :item)))))


(deftest docker-volume-consistency-test
  (testing "Testing enum function docker-volume-consistency"
    (is (= DockerVolumeConsistency/CONSISTENT (docker-volume-consistency {:item DockerVolumeConsistency/CONSISTENT} "test" :item)))
    (is (= DockerVolumeConsistency/CONSISTENT (docker-volume-consistency {:test/item DockerVolumeConsistency/CONSISTENT} "test" :item)))
    (is (= DockerVolumeConsistency/DELEGATED (docker-volume-consistency {:item DockerVolumeConsistency/DELEGATED} "test" :item)))
    (is (= DockerVolumeConsistency/DELEGATED (docker-volume-consistency {:test/item DockerVolumeConsistency/DELEGATED} "test" :item)))
    (is (= DockerVolumeConsistency/CACHED (docker-volume-consistency {:item DockerVolumeConsistency/CACHED} "test" :item)))
    (is (= DockerVolumeConsistency/CACHED (docker-volume-consistency {:test/item DockerVolumeConsistency/CACHED} "test" :item)))
    (is (= DockerVolumeConsistency/CONSISTENT (docker-volume-consistency {:item :consistent} "test" :item)))
    (is (= DockerVolumeConsistency/CONSISTENT (docker-volume-consistency {:test/item :consistent} "test" :item)))
    (is (= DockerVolumeConsistency/DELEGATED (docker-volume-consistency {:item :delegated} "test" :item)))
    (is (= DockerVolumeConsistency/DELEGATED (docker-volume-consistency {:test/item :delegated} "test" :item)))
    (is (= DockerVolumeConsistency/CACHED (docker-volume-consistency {:item :cached} "test" :item)))
    (is (= DockerVolumeConsistency/CACHED (docker-volume-consistency {:test/item :cached} "test" :item)))))


(deftest file-asset-packaging-test
  (testing "Testing enum function file-asset-packaging"
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:item FileAssetPackaging/ZIP_DIRECTORY} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:test/item FileAssetPackaging/ZIP_DIRECTORY} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:item FileAssetPackaging/FILE} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:test/item FileAssetPackaging/FILE} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:item :zip-directory} "test" :item)))
    (is (= FileAssetPackaging/ZIP_DIRECTORY (file-asset-packaging {:test/item :zip-directory} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:item :file} "test" :item)))
    (is (= FileAssetPackaging/FILE (file-asset-packaging {:test/item :file} "test" :item)))))


(deftest ignore-mode-test
  (testing "Testing enum function ignore-mode"
    (is (= IgnoreMode/DOCKER (ignore-mode {:item IgnoreMode/DOCKER} "test" :item)))
    (is (= IgnoreMode/DOCKER (ignore-mode {:test/item IgnoreMode/DOCKER} "test" :item)))
    (is (= IgnoreMode/GIT (ignore-mode {:item IgnoreMode/GIT} "test" :item)))
    (is (= IgnoreMode/GIT (ignore-mode {:test/item IgnoreMode/GIT} "test" :item)))
    (is (= IgnoreMode/GLOB (ignore-mode {:item IgnoreMode/GLOB} "test" :item)))
    (is (= IgnoreMode/GLOB (ignore-mode {:test/item IgnoreMode/GLOB} "test" :item)))
    (is (= IgnoreMode/DOCKER (ignore-mode {:item :docker} "test" :item)))
    (is (= IgnoreMode/DOCKER (ignore-mode {:test/item :docker} "test" :item)))
    (is (= IgnoreMode/GIT (ignore-mode {:item :git} "test" :item)))
    (is (= IgnoreMode/GIT (ignore-mode {:test/item :git} "test" :item)))
    (is (= IgnoreMode/GLOB (ignore-mode {:item :glob} "test" :item)))
    (is (= IgnoreMode/GLOB (ignore-mode {:test/item :glob} "test" :item)))))


(deftest policy-validation-report-status-beta1-test
  (testing "Testing enum function policy-validation-report-status-beta1"
    (is (= PolicyValidationReportStatusBeta1/SUCCESS (policy-validation-report-status-beta1 {:item PolicyValidationReportStatusBeta1/SUCCESS} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/SUCCESS (policy-validation-report-status-beta1 {:test/item PolicyValidationReportStatusBeta1/SUCCESS} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/FAILURE (policy-validation-report-status-beta1 {:item PolicyValidationReportStatusBeta1/FAILURE} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/FAILURE (policy-validation-report-status-beta1 {:test/item PolicyValidationReportStatusBeta1/FAILURE} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/SUCCESS (policy-validation-report-status-beta1 {:item :success} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/SUCCESS (policy-validation-report-status-beta1 {:test/item :success} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/FAILURE (policy-validation-report-status-beta1 {:item :failure} "test" :item)))
    (is (= PolicyValidationReportStatusBeta1/FAILURE (policy-validation-report-status-beta1 {:test/item :failure} "test" :item)))))


(deftest removal-policy-test
  (testing "Testing enum function removal-policy"
    (is (= RemovalPolicy/SNAPSHOT (removal-policy {:item RemovalPolicy/SNAPSHOT} "test" :item)))
    (is (= RemovalPolicy/SNAPSHOT (removal-policy {:test/item RemovalPolicy/SNAPSHOT} "test" :item)))
    (is (= RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE (removal-policy {:item RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE} "test" :item)))
    (is (= RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE (removal-policy {:test/item RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE} "test" :item)))
    (is (= RemovalPolicy/DESTROY (removal-policy {:item RemovalPolicy/DESTROY} "test" :item)))
    (is (= RemovalPolicy/DESTROY (removal-policy {:test/item RemovalPolicy/DESTROY} "test" :item)))
    (is (= RemovalPolicy/RETAIN (removal-policy {:item RemovalPolicy/RETAIN} "test" :item)))
    (is (= RemovalPolicy/RETAIN (removal-policy {:test/item RemovalPolicy/RETAIN} "test" :item)))
    (is (= RemovalPolicy/SNAPSHOT (removal-policy {:item :snapshot} "test" :item)))
    (is (= RemovalPolicy/SNAPSHOT (removal-policy {:test/item :snapshot} "test" :item)))
    (is (= RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE (removal-policy {:item :retain-on-update-or-delete} "test" :item)))
    (is (= RemovalPolicy/RETAIN_ON_UPDATE_OR_DELETE (removal-policy {:test/item :retain-on-update-or-delete} "test" :item)))
    (is (= RemovalPolicy/DESTROY (removal-policy {:item :destroy} "test" :item)))
    (is (= RemovalPolicy/DESTROY (removal-policy {:test/item :destroy} "test" :item)))
    (is (= RemovalPolicy/RETAIN (removal-policy {:item :retain} "test" :item)))
    (is (= RemovalPolicy/RETAIN (removal-policy {:test/item :retain} "test" :item)))))


(deftest resolution-type-hint-test
  (testing "Testing enum function resolution-type-hint"
    (is (= ResolutionTypeHint/STRING (resolution-type-hint {:item ResolutionTypeHint/STRING} "test" :item)))
    (is (= ResolutionTypeHint/STRING (resolution-type-hint {:test/item ResolutionTypeHint/STRING} "test" :item)))
    (is (= ResolutionTypeHint/NUMBER (resolution-type-hint {:item ResolutionTypeHint/NUMBER} "test" :item)))
    (is (= ResolutionTypeHint/NUMBER (resolution-type-hint {:test/item ResolutionTypeHint/NUMBER} "test" :item)))
    (is (= ResolutionTypeHint/STRING_LIST (resolution-type-hint {:item ResolutionTypeHint/STRING_LIST} "test" :item)))
    (is (= ResolutionTypeHint/STRING_LIST (resolution-type-hint {:test/item ResolutionTypeHint/STRING_LIST} "test" :item)))
    (is (= ResolutionTypeHint/STRING (resolution-type-hint {:item :string} "test" :item)))
    (is (= ResolutionTypeHint/STRING (resolution-type-hint {:test/item :string} "test" :item)))
    (is (= ResolutionTypeHint/NUMBER (resolution-type-hint {:item :number} "test" :item)))
    (is (= ResolutionTypeHint/NUMBER (resolution-type-hint {:test/item :number} "test" :item)))
    (is (= ResolutionTypeHint/STRING_LIST (resolution-type-hint {:item :string-list} "test" :item)))
    (is (= ResolutionTypeHint/STRING_LIST (resolution-type-hint {:test/item :string-list} "test" :item)))))


(deftest size-rounding-behavior-test
  (testing "Testing enum function size-rounding-behavior"
    (is (= SizeRoundingBehavior/FLOOR (size-rounding-behavior {:item SizeRoundingBehavior/FLOOR} "test" :item)))
    (is (= SizeRoundingBehavior/FLOOR (size-rounding-behavior {:test/item SizeRoundingBehavior/FLOOR} "test" :item)))
    (is (= SizeRoundingBehavior/FAIL (size-rounding-behavior {:item SizeRoundingBehavior/FAIL} "test" :item)))
    (is (= SizeRoundingBehavior/FAIL (size-rounding-behavior {:test/item SizeRoundingBehavior/FAIL} "test" :item)))
    (is (= SizeRoundingBehavior/NONE (size-rounding-behavior {:item SizeRoundingBehavior/NONE} "test" :item)))
    (is (= SizeRoundingBehavior/NONE (size-rounding-behavior {:test/item SizeRoundingBehavior/NONE} "test" :item)))
    (is (= SizeRoundingBehavior/FLOOR (size-rounding-behavior {:item :floor} "test" :item)))
    (is (= SizeRoundingBehavior/FLOOR (size-rounding-behavior {:test/item :floor} "test" :item)))
    (is (= SizeRoundingBehavior/FAIL (size-rounding-behavior {:item :fail} "test" :item)))
    (is (= SizeRoundingBehavior/FAIL (size-rounding-behavior {:test/item :fail} "test" :item)))
    (is (= SizeRoundingBehavior/NONE (size-rounding-behavior {:item :none} "test" :item)))
    (is (= SizeRoundingBehavior/NONE (size-rounding-behavior {:test/item :none} "test" :item)))))


(deftest symlink-follow-mode-test
  (testing "Testing enum function symlink-follow-mode"
    (is (= SymlinkFollowMode/NEVER (symlink-follow-mode {:item SymlinkFollowMode/NEVER} "test" :item)))
    (is (= SymlinkFollowMode/NEVER (symlink-follow-mode {:test/item SymlinkFollowMode/NEVER} "test" :item)))
    (is (= SymlinkFollowMode/BLOCK_EXTERNAL (symlink-follow-mode {:item SymlinkFollowMode/BLOCK_EXTERNAL} "test" :item)))
    (is (= SymlinkFollowMode/BLOCK_EXTERNAL (symlink-follow-mode {:test/item SymlinkFollowMode/BLOCK_EXTERNAL} "test" :item)))
    (is (= SymlinkFollowMode/ALWAYS (symlink-follow-mode {:item SymlinkFollowMode/ALWAYS} "test" :item)))
    (is (= SymlinkFollowMode/ALWAYS (symlink-follow-mode {:test/item SymlinkFollowMode/ALWAYS} "test" :item)))
    (is (= SymlinkFollowMode/EXTERNAL (symlink-follow-mode {:item SymlinkFollowMode/EXTERNAL} "test" :item)))
    (is (= SymlinkFollowMode/EXTERNAL (symlink-follow-mode {:test/item SymlinkFollowMode/EXTERNAL} "test" :item)))
    (is (= SymlinkFollowMode/NEVER (symlink-follow-mode {:item :never} "test" :item)))
    (is (= SymlinkFollowMode/NEVER (symlink-follow-mode {:test/item :never} "test" :item)))
    (is (= SymlinkFollowMode/BLOCK_EXTERNAL (symlink-follow-mode {:item :block-external} "test" :item)))
    (is (= SymlinkFollowMode/BLOCK_EXTERNAL (symlink-follow-mode {:test/item :block-external} "test" :item)))
    (is (= SymlinkFollowMode/ALWAYS (symlink-follow-mode {:item :always} "test" :item)))
    (is (= SymlinkFollowMode/ALWAYS (symlink-follow-mode {:test/item :always} "test" :item)))
    (is (= SymlinkFollowMode/EXTERNAL (symlink-follow-mode {:item :external} "test" :item)))
    (is (= SymlinkFollowMode/EXTERNAL (symlink-follow-mode {:test/item :external} "test" :item)))))


(deftest tag-type-test
  (testing "Testing enum function tag-type"
    (is (= TagType/MAP (tag-type {:item TagType/MAP} "test" :item)))
    (is (= TagType/MAP (tag-type {:test/item TagType/MAP} "test" :item)))
    (is (= TagType/STANDARD (tag-type {:item TagType/STANDARD} "test" :item)))
    (is (= TagType/STANDARD (tag-type {:test/item TagType/STANDARD} "test" :item)))
    (is (= TagType/NOT_TAGGABLE (tag-type {:item TagType/NOT_TAGGABLE} "test" :item)))
    (is (= TagType/NOT_TAGGABLE (tag-type {:test/item TagType/NOT_TAGGABLE} "test" :item)))
    (is (= TagType/KEY_VALUE (tag-type {:item TagType/KEY_VALUE} "test" :item)))
    (is (= TagType/KEY_VALUE (tag-type {:test/item TagType/KEY_VALUE} "test" :item)))
    (is (= TagType/AUTOSCALING_GROUP (tag-type {:item TagType/AUTOSCALING_GROUP} "test" :item)))
    (is (= TagType/AUTOSCALING_GROUP (tag-type {:test/item TagType/AUTOSCALING_GROUP} "test" :item)))
    (is (= TagType/MAP (tag-type {:item :map} "test" :item)))
    (is (= TagType/MAP (tag-type {:test/item :map} "test" :item)))
    (is (= TagType/STANDARD (tag-type {:item :standard} "test" :item)))
    (is (= TagType/STANDARD (tag-type {:test/item :standard} "test" :item)))
    (is (= TagType/NOT_TAGGABLE (tag-type {:item :not-taggable} "test" :item)))
    (is (= TagType/NOT_TAGGABLE (tag-type {:test/item :not-taggable} "test" :item)))
    (is (= TagType/KEY_VALUE (tag-type {:item :key-value} "test" :item)))
    (is (= TagType/KEY_VALUE (tag-type {:test/item :key-value} "test" :item)))
    (is (= TagType/AUTOSCALING_GROUP (tag-type {:item :autoscaling-group} "test" :item)))
    (is (= TagType/AUTOSCALING_GROUP (tag-type {:test/item :autoscaling-group} "test" :item)))))