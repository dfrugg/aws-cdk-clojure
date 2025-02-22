(ns cdk.api.services.secretsmanager-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.secretsmanager package. "
  (:require [cdk.api.services.secretsmanager :refer [attachment-target-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.secretsmanager AttachmentTargetType]))


(deftest attachment-target-type-test
  (testing "Testing enum function attachment-target-type"
    (is (= AttachmentTargetType/DOCDB_DB_INSTANCE (attachment-target-type {:item AttachmentTargetType/DOCDB_DB_INSTANCE} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_INSTANCE (attachment-target-type {:test/item AttachmentTargetType/DOCDB_DB_INSTANCE} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_INSTANCE (attachment-target-type {:item AttachmentTargetType/RDS_DB_INSTANCE} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_INSTANCE (attachment-target-type {:test/item AttachmentTargetType/RDS_DB_INSTANCE} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_CLUSTER (attachment-target-type {:item AttachmentTargetType/RDS_DB_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_CLUSTER (attachment-target-type {:test/item AttachmentTargetType/RDS_DB_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_PROXY (attachment-target-type {:item AttachmentTargetType/RDS_DB_PROXY} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_PROXY (attachment-target-type {:test/item AttachmentTargetType/RDS_DB_PROXY} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_CLUSTER (attachment-target-type {:item AttachmentTargetType/DOCDB_DB_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_CLUSTER (attachment-target-type {:test/item AttachmentTargetType/DOCDB_DB_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/REDSHIFT_CLUSTER (attachment-target-type {:item AttachmentTargetType/REDSHIFT_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/REDSHIFT_CLUSTER (attachment-target-type {:test/item AttachmentTargetType/REDSHIFT_CLUSTER} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_INSTANCE (attachment-target-type {:item :docdb-db-instance} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_INSTANCE (attachment-target-type {:test/item :docdb-db-instance} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_INSTANCE (attachment-target-type {:item :rds-db-instance} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_INSTANCE (attachment-target-type {:test/item :rds-db-instance} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_CLUSTER (attachment-target-type {:item :rds-db-cluster} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_CLUSTER (attachment-target-type {:test/item :rds-db-cluster} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_PROXY (attachment-target-type {:item :rds-db-proxy} "test" :item)))
    (is (= AttachmentTargetType/RDS_DB_PROXY (attachment-target-type {:test/item :rds-db-proxy} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_CLUSTER (attachment-target-type {:item :docdb-db-cluster} "test" :item)))
    (is (= AttachmentTargetType/DOCDB_DB_CLUSTER (attachment-target-type {:test/item :docdb-db-cluster} "test" :item)))
    (is (= AttachmentTargetType/REDSHIFT_CLUSTER (attachment-target-type {:item :redshift-cluster} "test" :item)))
    (is (= AttachmentTargetType/REDSHIFT_CLUSTER (attachment-target-type {:test/item :redshift-cluster} "test" :item)))))