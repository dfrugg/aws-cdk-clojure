(ns cdk.api.services.s3.deployment-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3.deployment package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.s3.deployment :refer [server-side-encryption
                                                    storage-class]])
  (:import [software.amazon.awscdk.services.s3.deployment ServerSideEncryption
                                                          StorageClass]))


(deftest server-side-encryption-test
  (testing "Testing enum function server-side-encryption"
    (is (= ServerSideEncryption/AES_256 (server-side-encryption {:item ServerSideEncryption/AES_256} "test" :item)))
    (is (= ServerSideEncryption/AES_256 (server-side-encryption {:test/item ServerSideEncryption/AES_256} "test" :item)))
    (is (= ServerSideEncryption/AWS_KMS (server-side-encryption {:item ServerSideEncryption/AWS_KMS} "test" :item)))
    (is (= ServerSideEncryption/AWS_KMS (server-side-encryption {:test/item ServerSideEncryption/AWS_KMS} "test" :item)))
    (is (= ServerSideEncryption/AES_256 (server-side-encryption {:item :aes-256} "test" :item)))
    (is (= ServerSideEncryption/AES_256 (server-side-encryption {:test/item :aes-256} "test" :item)))
    (is (= ServerSideEncryption/AWS_KMS (server-side-encryption {:item :aws-kms} "test" :item)))
    (is (= ServerSideEncryption/AWS_KMS (server-side-encryption {:test/item :aws-kms} "test" :item)))))


(deftest storage-class-test
  (testing "Testing enum function storage-class"
    (is (= StorageClass/GLACIER (storage-class {:item StorageClass/GLACIER} "test" :item)))
    (is (= StorageClass/GLACIER (storage-class {:test/item StorageClass/GLACIER} "test" :item)))
    (is (= StorageClass/REDUCED_REDUNDANCY (storage-class {:item StorageClass/REDUCED_REDUNDANCY} "test" :item)))
    (is (= StorageClass/REDUCED_REDUNDANCY (storage-class {:test/item StorageClass/REDUCED_REDUNDANCY} "test" :item)))
    (is (= StorageClass/ONEZONE_IA (storage-class {:item StorageClass/ONEZONE_IA} "test" :item)))
    (is (= StorageClass/ONEZONE_IA (storage-class {:test/item StorageClass/ONEZONE_IA} "test" :item)))
    (is (= StorageClass/STANDARD_IA (storage-class {:item StorageClass/STANDARD_IA} "test" :item)))
    (is (= StorageClass/STANDARD_IA (storage-class {:test/item StorageClass/STANDARD_IA} "test" :item)))
    (is (= StorageClass/STANDARD (storage-class {:item StorageClass/STANDARD} "test" :item)))
    (is (= StorageClass/STANDARD (storage-class {:test/item StorageClass/STANDARD} "test" :item)))
    (is (= StorageClass/INTELLIGENT_TIERING (storage-class {:item StorageClass/INTELLIGENT_TIERING} "test" :item)))
    (is (= StorageClass/INTELLIGENT_TIERING (storage-class {:test/item StorageClass/INTELLIGENT_TIERING} "test" :item)))
    (is (= StorageClass/DEEP_ARCHIVE (storage-class {:item StorageClass/DEEP_ARCHIVE} "test" :item)))
    (is (= StorageClass/DEEP_ARCHIVE (storage-class {:test/item StorageClass/DEEP_ARCHIVE} "test" :item)))
    (is (= StorageClass/GLACIER (storage-class {:item :glacier} "test" :item)))
    (is (= StorageClass/GLACIER (storage-class {:test/item :glacier} "test" :item)))
    (is (= StorageClass/REDUCED_REDUNDANCY (storage-class {:item :reduced-redundancy} "test" :item)))
    (is (= StorageClass/REDUCED_REDUNDANCY (storage-class {:test/item :reduced-redundancy} "test" :item)))
    (is (= StorageClass/ONEZONE_IA (storage-class {:item :onezone-ia} "test" :item)))
    (is (= StorageClass/ONEZONE_IA (storage-class {:test/item :onezone-ia} "test" :item)))
    (is (= StorageClass/STANDARD_IA (storage-class {:item :standard-ia} "test" :item)))
    (is (= StorageClass/STANDARD_IA (storage-class {:test/item :standard-ia} "test" :item)))
    (is (= StorageClass/STANDARD (storage-class {:item :standard} "test" :item)))
    (is (= StorageClass/STANDARD (storage-class {:test/item :standard} "test" :item)))
    (is (= StorageClass/INTELLIGENT_TIERING (storage-class {:item :intelligent-tiering} "test" :item)))
    (is (= StorageClass/INTELLIGENT_TIERING (storage-class {:test/item :intelligent-tiering} "test" :item)))
    (is (= StorageClass/DEEP_ARCHIVE (storage-class {:item :deep-archive} "test" :item)))
    (is (= StorageClass/DEEP_ARCHIVE (storage-class {:test/item :deep-archive} "test" :item)))))