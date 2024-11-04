(ns cdk.api.services.kinesis-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.kinesis package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.kinesis :refer [stream-encryption
                                              stream-mode]])
  (:import [software.amazon.awscdk.services.kinesis StreamEncryption
                                                    StreamMode]))


(deftest stream-encryption-test
  (testing "Testing enum function stream-encryption"
    (is (= StreamEncryption/KMS (stream-encryption {:item StreamEncryption/KMS} "test" :item)))
    (is (= StreamEncryption/KMS (stream-encryption {:test/item StreamEncryption/KMS} "test" :item)))
    (is (= StreamEncryption/UNENCRYPTED (stream-encryption {:item StreamEncryption/UNENCRYPTED} "test" :item)))
    (is (= StreamEncryption/UNENCRYPTED (stream-encryption {:test/item StreamEncryption/UNENCRYPTED} "test" :item)))
    (is (= StreamEncryption/MANAGED (stream-encryption {:item StreamEncryption/MANAGED} "test" :item)))
    (is (= StreamEncryption/MANAGED (stream-encryption {:test/item StreamEncryption/MANAGED} "test" :item)))
    (is (= StreamEncryption/KMS (stream-encryption {:item :kms} "test" :item)))
    (is (= StreamEncryption/KMS (stream-encryption {:test/item :kms} "test" :item)))
    (is (= StreamEncryption/UNENCRYPTED (stream-encryption {:item :unencrypted} "test" :item)))
    (is (= StreamEncryption/UNENCRYPTED (stream-encryption {:test/item :unencrypted} "test" :item)))
    (is (= StreamEncryption/MANAGED (stream-encryption {:item :managed} "test" :item)))
    (is (= StreamEncryption/MANAGED (stream-encryption {:test/item :managed} "test" :item)))))


(deftest stream-mode-test
  (testing "Testing enum function stream-mode"
    (is (= StreamMode/PROVISIONED (stream-mode {:item StreamMode/PROVISIONED} "test" :item)))
    (is (= StreamMode/PROVISIONED (stream-mode {:test/item StreamMode/PROVISIONED} "test" :item)))
    (is (= StreamMode/ON_DEMAND (stream-mode {:item StreamMode/ON_DEMAND} "test" :item)))
    (is (= StreamMode/ON_DEMAND (stream-mode {:test/item StreamMode/ON_DEMAND} "test" :item)))
    (is (= StreamMode/PROVISIONED (stream-mode {:item :provisioned} "test" :item)))
    (is (= StreamMode/PROVISIONED (stream-mode {:test/item :provisioned} "test" :item)))
    (is (= StreamMode/ON_DEMAND (stream-mode {:item :on-demand} "test" :item)))
    (is (= StreamMode/ON_DEMAND (stream-mode {:test/item :on-demand} "test" :item)))))