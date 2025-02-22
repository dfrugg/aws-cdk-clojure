(ns cdk.api.services.efs-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.efs package. "
  (:require [cdk.api.services.efs :refer [lifecycle-policy
                                          out-of-infrequent-access-policy
                                          performance-mode
                                          replication-overwrite-protection
                                          throughput-mode]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.efs LifecyclePolicy
                                                OutOfInfrequentAccessPolicy
                                                PerformanceMode
                                                ReplicationOverwriteProtection
                                                ThroughputMode]))


(deftest lifecycle-policy-test
  (testing "Testing enum function lifecycle-policy"
    (is (= LifecyclePolicy/AFTER_270_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_270_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_270_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_270_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_1_DAY (lifecycle-policy {:item LifecyclePolicy/AFTER_1_DAY} "test" :item)))
    (is (= LifecyclePolicy/AFTER_1_DAY (lifecycle-policy {:test/item LifecyclePolicy/AFTER_1_DAY} "test" :item)))
    (is (= LifecyclePolicy/AFTER_30_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_30_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_30_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_30_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_180_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_180_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_180_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_180_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_90_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_90_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_90_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_90_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_14_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_14_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_14_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_14_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_7_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_7_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_7_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_7_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_365_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_365_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_365_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_365_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_60_DAYS (lifecycle-policy {:item LifecyclePolicy/AFTER_60_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_60_DAYS (lifecycle-policy {:test/item LifecyclePolicy/AFTER_60_DAYS} "test" :item)))
    (is (= LifecyclePolicy/AFTER_270_DAYS (lifecycle-policy {:item :after-270-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_270_DAYS (lifecycle-policy {:test/item :after-270-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_1_DAY (lifecycle-policy {:item :after-1-day} "test" :item)))
    (is (= LifecyclePolicy/AFTER_1_DAY (lifecycle-policy {:test/item :after-1-day} "test" :item)))
    (is (= LifecyclePolicy/AFTER_30_DAYS (lifecycle-policy {:item :after-30-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_30_DAYS (lifecycle-policy {:test/item :after-30-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_180_DAYS (lifecycle-policy {:item :after-180-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_180_DAYS (lifecycle-policy {:test/item :after-180-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_90_DAYS (lifecycle-policy {:item :after-90-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_90_DAYS (lifecycle-policy {:test/item :after-90-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_14_DAYS (lifecycle-policy {:item :after-14-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_14_DAYS (lifecycle-policy {:test/item :after-14-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_7_DAYS (lifecycle-policy {:item :after-7-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_7_DAYS (lifecycle-policy {:test/item :after-7-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_365_DAYS (lifecycle-policy {:item :after-365-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_365_DAYS (lifecycle-policy {:test/item :after-365-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_60_DAYS (lifecycle-policy {:item :after-60-days} "test" :item)))
    (is (= LifecyclePolicy/AFTER_60_DAYS (lifecycle-policy {:test/item :after-60-days} "test" :item)))))


(deftest out-of-infrequent-access-policy-test
  (testing "Testing enum function out-of-infrequent-access-policy"
    (is (= OutOfInfrequentAccessPolicy/AFTER_1_ACCESS (out-of-infrequent-access-policy {:item OutOfInfrequentAccessPolicy/AFTER_1_ACCESS} "test" :item)))
    (is (= OutOfInfrequentAccessPolicy/AFTER_1_ACCESS (out-of-infrequent-access-policy {:test/item OutOfInfrequentAccessPolicy/AFTER_1_ACCESS} "test" :item)))
    (is (= OutOfInfrequentAccessPolicy/AFTER_1_ACCESS (out-of-infrequent-access-policy {:item :after-1-access} "test" :item)))
    (is (= OutOfInfrequentAccessPolicy/AFTER_1_ACCESS (out-of-infrequent-access-policy {:test/item :after-1-access} "test" :item)))))


(deftest performance-mode-test
  (testing "Testing enum function performance-mode"
    (is (= PerformanceMode/GENERAL_PURPOSE (performance-mode {:item PerformanceMode/GENERAL_PURPOSE} "test" :item)))
    (is (= PerformanceMode/GENERAL_PURPOSE (performance-mode {:test/item PerformanceMode/GENERAL_PURPOSE} "test" :item)))
    (is (= PerformanceMode/MAX_IO (performance-mode {:item PerformanceMode/MAX_IO} "test" :item)))
    (is (= PerformanceMode/MAX_IO (performance-mode {:test/item PerformanceMode/MAX_IO} "test" :item)))
    (is (= PerformanceMode/GENERAL_PURPOSE (performance-mode {:item :general-purpose} "test" :item)))
    (is (= PerformanceMode/GENERAL_PURPOSE (performance-mode {:test/item :general-purpose} "test" :item)))
    (is (= PerformanceMode/MAX_IO (performance-mode {:item :max-io} "test" :item)))
    (is (= PerformanceMode/MAX_IO (performance-mode {:test/item :max-io} "test" :item)))))


(deftest replication-overwrite-protection-test
  (testing "Testing enum function replication-overwrite-protection"
    (is (= ReplicationOverwriteProtection/ENABLED (replication-overwrite-protection {:item ReplicationOverwriteProtection/ENABLED} "test" :item)))
    (is (= ReplicationOverwriteProtection/ENABLED (replication-overwrite-protection {:test/item ReplicationOverwriteProtection/ENABLED} "test" :item)))
    (is (= ReplicationOverwriteProtection/DISABLED (replication-overwrite-protection {:item ReplicationOverwriteProtection/DISABLED} "test" :item)))
    (is (= ReplicationOverwriteProtection/DISABLED (replication-overwrite-protection {:test/item ReplicationOverwriteProtection/DISABLED} "test" :item)))
    (is (= ReplicationOverwriteProtection/ENABLED (replication-overwrite-protection {:item :enabled} "test" :item)))
    (is (= ReplicationOverwriteProtection/ENABLED (replication-overwrite-protection {:test/item :enabled} "test" :item)))
    (is (= ReplicationOverwriteProtection/DISABLED (replication-overwrite-protection {:item :disabled} "test" :item)))
    (is (= ReplicationOverwriteProtection/DISABLED (replication-overwrite-protection {:test/item :disabled} "test" :item)))))


(deftest throughput-mode-test
  (testing "Testing enum function throughput-mode"
    (is (= ThroughputMode/ELASTIC (throughput-mode {:item ThroughputMode/ELASTIC} "test" :item)))
    (is (= ThroughputMode/ELASTIC (throughput-mode {:test/item ThroughputMode/ELASTIC} "test" :item)))
    (is (= ThroughputMode/BURSTING (throughput-mode {:item ThroughputMode/BURSTING} "test" :item)))
    (is (= ThroughputMode/BURSTING (throughput-mode {:test/item ThroughputMode/BURSTING} "test" :item)))
    (is (= ThroughputMode/PROVISIONED (throughput-mode {:item ThroughputMode/PROVISIONED} "test" :item)))
    (is (= ThroughputMode/PROVISIONED (throughput-mode {:test/item ThroughputMode/PROVISIONED} "test" :item)))
    (is (= ThroughputMode/ELASTIC (throughput-mode {:item :elastic} "test" :item)))
    (is (= ThroughputMode/ELASTIC (throughput-mode {:test/item :elastic} "test" :item)))
    (is (= ThroughputMode/BURSTING (throughput-mode {:item :bursting} "test" :item)))
    (is (= ThroughputMode/BURSTING (throughput-mode {:test/item :bursting} "test" :item)))
    (is (= ThroughputMode/PROVISIONED (throughput-mode {:item :provisioned} "test" :item)))
    (is (= ThroughputMode/PROVISIONED (throughput-mode {:test/item :provisioned} "test" :item)))))