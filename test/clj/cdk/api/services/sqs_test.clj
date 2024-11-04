(ns cdk.api.services.sqs-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sqs package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.sqs :refer [deduplication-scope
                                          fifo-throughput-limit
                                          queue-encryption
                                          redrive-permission]])
  (:import [software.amazon.awscdk.services.sqs DeduplicationScope
                                                FifoThroughputLimit
                                                QueueEncryption
                                                RedrivePermission]))


(deftest deduplication-scope-test
  (testing "Testing enum function deduplication-scope"
    (is (= DeduplicationScope/MESSAGE_GROUP (deduplication-scope {:item DeduplicationScope/MESSAGE_GROUP} "test" :item)))
    (is (= DeduplicationScope/MESSAGE_GROUP (deduplication-scope {:test/item DeduplicationScope/MESSAGE_GROUP} "test" :item)))
    (is (= DeduplicationScope/QUEUE (deduplication-scope {:item DeduplicationScope/QUEUE} "test" :item)))
    (is (= DeduplicationScope/QUEUE (deduplication-scope {:test/item DeduplicationScope/QUEUE} "test" :item)))
    (is (= DeduplicationScope/MESSAGE_GROUP (deduplication-scope {:item :message-group} "test" :item)))
    (is (= DeduplicationScope/MESSAGE_GROUP (deduplication-scope {:test/item :message-group} "test" :item)))
    (is (= DeduplicationScope/QUEUE (deduplication-scope {:item :queue} "test" :item)))
    (is (= DeduplicationScope/QUEUE (deduplication-scope {:test/item :queue} "test" :item)))))


(deftest fifo-throughput-limit-test
  (testing "Testing enum function fifo-throughput-limit"
    (is (= FifoThroughputLimit/PER_QUEUE (fifo-throughput-limit {:item FifoThroughputLimit/PER_QUEUE} "test" :item)))
    (is (= FifoThroughputLimit/PER_QUEUE (fifo-throughput-limit {:test/item FifoThroughputLimit/PER_QUEUE} "test" :item)))
    (is (= FifoThroughputLimit/PER_MESSAGE_GROUP_ID (fifo-throughput-limit {:item FifoThroughputLimit/PER_MESSAGE_GROUP_ID} "test" :item)))
    (is (= FifoThroughputLimit/PER_MESSAGE_GROUP_ID (fifo-throughput-limit {:test/item FifoThroughputLimit/PER_MESSAGE_GROUP_ID} "test" :item)))
    (is (= FifoThroughputLimit/PER_QUEUE (fifo-throughput-limit {:item :per-queue} "test" :item)))
    (is (= FifoThroughputLimit/PER_QUEUE (fifo-throughput-limit {:test/item :per-queue} "test" :item)))
    (is (= FifoThroughputLimit/PER_MESSAGE_GROUP_ID (fifo-throughput-limit {:item :per-message-group-id} "test" :item)))
    (is (= FifoThroughputLimit/PER_MESSAGE_GROUP_ID (fifo-throughput-limit {:test/item :per-message-group-id} "test" :item)))))


(deftest queue-encryption-test
  (testing "Testing enum function queue-encryption"
    (is (= QueueEncryption/UNENCRYPTED (queue-encryption {:item QueueEncryption/UNENCRYPTED} "test" :item)))
    (is (= QueueEncryption/UNENCRYPTED (queue-encryption {:test/item QueueEncryption/UNENCRYPTED} "test" :item)))
    (is (= QueueEncryption/KMS (queue-encryption {:item QueueEncryption/KMS} "test" :item)))
    (is (= QueueEncryption/KMS (queue-encryption {:test/item QueueEncryption/KMS} "test" :item)))
    (is (= QueueEncryption/SQS_MANAGED (queue-encryption {:item QueueEncryption/SQS_MANAGED} "test" :item)))
    (is (= QueueEncryption/SQS_MANAGED (queue-encryption {:test/item QueueEncryption/SQS_MANAGED} "test" :item)))
    (is (= QueueEncryption/KMS_MANAGED (queue-encryption {:item QueueEncryption/KMS_MANAGED} "test" :item)))
    (is (= QueueEncryption/KMS_MANAGED (queue-encryption {:test/item QueueEncryption/KMS_MANAGED} "test" :item)))
    (is (= QueueEncryption/UNENCRYPTED (queue-encryption {:item :unencrypted} "test" :item)))
    (is (= QueueEncryption/UNENCRYPTED (queue-encryption {:test/item :unencrypted} "test" :item)))
    (is (= QueueEncryption/KMS (queue-encryption {:item :kms} "test" :item)))
    (is (= QueueEncryption/KMS (queue-encryption {:test/item :kms} "test" :item)))
    (is (= QueueEncryption/SQS_MANAGED (queue-encryption {:item :sqs-managed} "test" :item)))
    (is (= QueueEncryption/SQS_MANAGED (queue-encryption {:test/item :sqs-managed} "test" :item)))
    (is (= QueueEncryption/KMS_MANAGED (queue-encryption {:item :kms-managed} "test" :item)))
    (is (= QueueEncryption/KMS_MANAGED (queue-encryption {:test/item :kms-managed} "test" :item)))))


(deftest redrive-permission-test
  (testing "Testing enum function redrive-permission"
    (is (= RedrivePermission/BY_QUEUE (redrive-permission {:item RedrivePermission/BY_QUEUE} "test" :item)))
    (is (= RedrivePermission/BY_QUEUE (redrive-permission {:test/item RedrivePermission/BY_QUEUE} "test" :item)))
    (is (= RedrivePermission/ALLOW_ALL (redrive-permission {:item RedrivePermission/ALLOW_ALL} "test" :item)))
    (is (= RedrivePermission/ALLOW_ALL (redrive-permission {:test/item RedrivePermission/ALLOW_ALL} "test" :item)))
    (is (= RedrivePermission/DENY_ALL (redrive-permission {:item RedrivePermission/DENY_ALL} "test" :item)))
    (is (= RedrivePermission/DENY_ALL (redrive-permission {:test/item RedrivePermission/DENY_ALL} "test" :item)))
    (is (= RedrivePermission/BY_QUEUE (redrive-permission {:item :by-queue} "test" :item)))
    (is (= RedrivePermission/BY_QUEUE (redrive-permission {:test/item :by-queue} "test" :item)))
    (is (= RedrivePermission/ALLOW_ALL (redrive-permission {:item :allow-all} "test" :item)))
    (is (= RedrivePermission/ALLOW_ALL (redrive-permission {:test/item :allow-all} "test" :item)))
    (is (= RedrivePermission/DENY_ALL (redrive-permission {:item :deny-all} "test" :item)))
    (is (= RedrivePermission/DENY_ALL (redrive-permission {:test/item :deny-all} "test" :item)))))