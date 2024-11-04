(ns cdk.api.services.cloudtrail-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudtrail package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.cloudtrail :refer [data-resource-type
                                                 management-event-sources
                                                 read-write-type]])
  (:import [software.amazon.awscdk.services.cloudtrail DataResourceType
                                                       ManagementEventSources
                                                       ReadWriteType]))


(deftest data-resource-type-test
  (testing "Testing enum function data-resource-type"
    (is (= DataResourceType/S3_OBJECT (data-resource-type {:item DataResourceType/S3_OBJECT} "test" :item)))
    (is (= DataResourceType/S3_OBJECT (data-resource-type {:test/item DataResourceType/S3_OBJECT} "test" :item)))
    (is (= DataResourceType/LAMBDA_FUNCTION (data-resource-type {:item DataResourceType/LAMBDA_FUNCTION} "test" :item)))
    (is (= DataResourceType/LAMBDA_FUNCTION (data-resource-type {:test/item DataResourceType/LAMBDA_FUNCTION} "test" :item)))
    (is (= DataResourceType/S3_OBJECT (data-resource-type {:item :s3-object} "test" :item)))
    (is (= DataResourceType/S3_OBJECT (data-resource-type {:test/item :s3-object} "test" :item)))
    (is (= DataResourceType/LAMBDA_FUNCTION (data-resource-type {:item :lambda-function} "test" :item)))
    (is (= DataResourceType/LAMBDA_FUNCTION (data-resource-type {:test/item :lambda-function} "test" :item)))))


(deftest management-event-sources-test
  (testing "Testing enum function management-event-sources"
    (is (= ManagementEventSources/KMS (management-event-sources {:item ManagementEventSources/KMS} "test" :item)))
    (is (= ManagementEventSources/KMS (management-event-sources {:test/item ManagementEventSources/KMS} "test" :item)))
    (is (= ManagementEventSources/RDS_DATA_API (management-event-sources {:item ManagementEventSources/RDS_DATA_API} "test" :item)))
    (is (= ManagementEventSources/RDS_DATA_API (management-event-sources {:test/item ManagementEventSources/RDS_DATA_API} "test" :item)))
    (is (= ManagementEventSources/KMS (management-event-sources {:item :kms} "test" :item)))
    (is (= ManagementEventSources/KMS (management-event-sources {:test/item :kms} "test" :item)))
    (is (= ManagementEventSources/RDS_DATA_API (management-event-sources {:item :rds-data-api} "test" :item)))
    (is (= ManagementEventSources/RDS_DATA_API (management-event-sources {:test/item :rds-data-api} "test" :item)))))


(deftest read-write-type-test
  (testing "Testing enum function read-write-type"
    (is (= ReadWriteType/ALL (read-write-type {:item ReadWriteType/ALL} "test" :item)))
    (is (= ReadWriteType/ALL (read-write-type {:test/item ReadWriteType/ALL} "test" :item)))
    (is (= ReadWriteType/WRITE_ONLY (read-write-type {:item ReadWriteType/WRITE_ONLY} "test" :item)))
    (is (= ReadWriteType/WRITE_ONLY (read-write-type {:test/item ReadWriteType/WRITE_ONLY} "test" :item)))
    (is (= ReadWriteType/READ_ONLY (read-write-type {:item ReadWriteType/READ_ONLY} "test" :item)))
    (is (= ReadWriteType/READ_ONLY (read-write-type {:test/item ReadWriteType/READ_ONLY} "test" :item)))
    (is (= ReadWriteType/NONE (read-write-type {:item ReadWriteType/NONE} "test" :item)))
    (is (= ReadWriteType/NONE (read-write-type {:test/item ReadWriteType/NONE} "test" :item)))
    (is (= ReadWriteType/ALL (read-write-type {:item :all} "test" :item)))
    (is (= ReadWriteType/ALL (read-write-type {:test/item :all} "test" :item)))
    (is (= ReadWriteType/WRITE_ONLY (read-write-type {:item :write-only} "test" :item)))
    (is (= ReadWriteType/WRITE_ONLY (read-write-type {:test/item :write-only} "test" :item)))
    (is (= ReadWriteType/READ_ONLY (read-write-type {:item :read-only} "test" :item)))
    (is (= ReadWriteType/READ_ONLY (read-write-type {:test/item :read-only} "test" :item)))
    (is (= ReadWriteType/NONE (read-write-type {:item :none} "test" :item)))
    (is (= ReadWriteType/NONE (read-write-type {:test/item :none} "test" :item)))))