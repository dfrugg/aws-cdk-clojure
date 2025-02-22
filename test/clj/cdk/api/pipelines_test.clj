(ns cdk.api.pipelines-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.pipelines package. "
  (:require [cdk.api.pipelines :refer [asset-type
                                       docker-credential-usage]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.pipelines AssetType
                                             DockerCredentialUsage]))


(deftest asset-type-test
  (testing "Testing enum function asset-type"
    (is (= AssetType/DOCKER_IMAGE (asset-type {:item AssetType/DOCKER_IMAGE} "test" :item)))
    (is (= AssetType/DOCKER_IMAGE (asset-type {:test/item AssetType/DOCKER_IMAGE} "test" :item)))
    (is (= AssetType/FILE (asset-type {:item AssetType/FILE} "test" :item)))
    (is (= AssetType/FILE (asset-type {:test/item AssetType/FILE} "test" :item)))
    (is (= AssetType/DOCKER_IMAGE (asset-type {:item :docker-image} "test" :item)))
    (is (= AssetType/DOCKER_IMAGE (asset-type {:test/item :docker-image} "test" :item)))
    (is (= AssetType/FILE (asset-type {:item :file} "test" :item)))
    (is (= AssetType/FILE (asset-type {:test/item :file} "test" :item)))))


(deftest docker-credential-usage-test
  (testing "Testing enum function docker-credential-usage"
    (is (= DockerCredentialUsage/SELF_UPDATE (docker-credential-usage {:item DockerCredentialUsage/SELF_UPDATE} "test" :item)))
    (is (= DockerCredentialUsage/SELF_UPDATE (docker-credential-usage {:test/item DockerCredentialUsage/SELF_UPDATE} "test" :item)))
    (is (= DockerCredentialUsage/SYNTH (docker-credential-usage {:item DockerCredentialUsage/SYNTH} "test" :item)))
    (is (= DockerCredentialUsage/SYNTH (docker-credential-usage {:test/item DockerCredentialUsage/SYNTH} "test" :item)))
    (is (= DockerCredentialUsage/ASSET_PUBLISHING (docker-credential-usage {:item DockerCredentialUsage/ASSET_PUBLISHING} "test" :item)))
    (is (= DockerCredentialUsage/ASSET_PUBLISHING (docker-credential-usage {:test/item DockerCredentialUsage/ASSET_PUBLISHING} "test" :item)))
    (is (= DockerCredentialUsage/SELF_UPDATE (docker-credential-usage {:item :self-update} "test" :item)))
    (is (= DockerCredentialUsage/SELF_UPDATE (docker-credential-usage {:test/item :self-update} "test" :item)))
    (is (= DockerCredentialUsage/SYNTH (docker-credential-usage {:item :synth} "test" :item)))
    (is (= DockerCredentialUsage/SYNTH (docker-credential-usage {:test/item :synth} "test" :item)))
    (is (= DockerCredentialUsage/ASSET_PUBLISHING (docker-credential-usage {:item :asset-publishing} "test" :item)))
    (is (= DockerCredentialUsage/ASSET_PUBLISHING (docker-credential-usage {:test/item :asset-publishing} "test" :item)))))