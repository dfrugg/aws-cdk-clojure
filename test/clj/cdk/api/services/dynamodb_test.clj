(ns cdk.api.services.dynamodb-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.dynamodb package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.dynamodb :refer [attribute-type
                                               billing-mode
                                               capacity-mode
                                               input-compression-type
                                               operation
                                               projection-type
                                               stream-view-type
                                               table-class
                                               table-encryption]])
  (:import [software.amazon.awscdk.services.dynamodb AttributeType
                                                     BillingMode
                                                     CapacityMode
                                                     InputCompressionType
                                                     Operation
                                                     ProjectionType
                                                     StreamViewType
                                                     TableClass
                                                     TableEncryption]))


(deftest attribute-type-test
  (testing "Testing enum function attribute-type"
    (is (= AttributeType/NUMBER (attribute-type {:item AttributeType/NUMBER} "test" :item)))
    (is (= AttributeType/NUMBER (attribute-type {:test/item AttributeType/NUMBER} "test" :item)))
    (is (= AttributeType/STRING (attribute-type {:item AttributeType/STRING} "test" :item)))
    (is (= AttributeType/STRING (attribute-type {:test/item AttributeType/STRING} "test" :item)))
    (is (= AttributeType/BINARY (attribute-type {:item AttributeType/BINARY} "test" :item)))
    (is (= AttributeType/BINARY (attribute-type {:test/item AttributeType/BINARY} "test" :item)))
    (is (= AttributeType/NUMBER (attribute-type {:item :number} "test" :item)))
    (is (= AttributeType/NUMBER (attribute-type {:test/item :number} "test" :item)))
    (is (= AttributeType/STRING (attribute-type {:item :string} "test" :item)))
    (is (= AttributeType/STRING (attribute-type {:test/item :string} "test" :item)))
    (is (= AttributeType/BINARY (attribute-type {:item :binary} "test" :item)))
    (is (= AttributeType/BINARY (attribute-type {:test/item :binary} "test" :item)))))


(deftest billing-mode-test
  (testing "Testing enum function billing-mode"
    (is (= BillingMode/PROVISIONED (billing-mode {:item BillingMode/PROVISIONED} "test" :item)))
    (is (= BillingMode/PROVISIONED (billing-mode {:test/item BillingMode/PROVISIONED} "test" :item)))
    (is (= BillingMode/PAY_PER_REQUEST (billing-mode {:item BillingMode/PAY_PER_REQUEST} "test" :item)))
    (is (= BillingMode/PAY_PER_REQUEST (billing-mode {:test/item BillingMode/PAY_PER_REQUEST} "test" :item)))
    (is (= BillingMode/PROVISIONED (billing-mode {:item :provisioned} "test" :item)))
    (is (= BillingMode/PROVISIONED (billing-mode {:test/item :provisioned} "test" :item)))
    (is (= BillingMode/PAY_PER_REQUEST (billing-mode {:item :pay-per-request} "test" :item)))
    (is (= BillingMode/PAY_PER_REQUEST (billing-mode {:test/item :pay-per-request} "test" :item)))))


(deftest capacity-mode-test
  (testing "Testing enum function capacity-mode"
    (is (= CapacityMode/AUTOSCALED (capacity-mode {:item CapacityMode/AUTOSCALED} "test" :item)))
    (is (= CapacityMode/AUTOSCALED (capacity-mode {:test/item CapacityMode/AUTOSCALED} "test" :item)))
    (is (= CapacityMode/FIXED (capacity-mode {:item CapacityMode/FIXED} "test" :item)))
    (is (= CapacityMode/FIXED (capacity-mode {:test/item CapacityMode/FIXED} "test" :item)))
    (is (= CapacityMode/AUTOSCALED (capacity-mode {:item :autoscaled} "test" :item)))
    (is (= CapacityMode/AUTOSCALED (capacity-mode {:test/item :autoscaled} "test" :item)))
    (is (= CapacityMode/FIXED (capacity-mode {:item :fixed} "test" :item)))
    (is (= CapacityMode/FIXED (capacity-mode {:test/item :fixed} "test" :item)))))


(deftest input-compression-type-test
  (testing "Testing enum function input-compression-type"
    (is (= InputCompressionType/GZIP (input-compression-type {:item InputCompressionType/GZIP} "test" :item)))
    (is (= InputCompressionType/GZIP (input-compression-type {:test/item InputCompressionType/GZIP} "test" :item)))
    (is (= InputCompressionType/NONE (input-compression-type {:item InputCompressionType/NONE} "test" :item)))
    (is (= InputCompressionType/NONE (input-compression-type {:test/item InputCompressionType/NONE} "test" :item)))
    (is (= InputCompressionType/ZSTD (input-compression-type {:item InputCompressionType/ZSTD} "test" :item)))
    (is (= InputCompressionType/ZSTD (input-compression-type {:test/item InputCompressionType/ZSTD} "test" :item)))
    (is (= InputCompressionType/GZIP (input-compression-type {:item :gzip} "test" :item)))
    (is (= InputCompressionType/GZIP (input-compression-type {:test/item :gzip} "test" :item)))
    (is (= InputCompressionType/NONE (input-compression-type {:item :none} "test" :item)))
    (is (= InputCompressionType/NONE (input-compression-type {:test/item :none} "test" :item)))
    (is (= InputCompressionType/ZSTD (input-compression-type {:item :zstd} "test" :item)))
    (is (= InputCompressionType/ZSTD (input-compression-type {:test/item :zstd} "test" :item)))))


(deftest operation-test
  (testing "Testing enum function operation"
    (is (= Operation/BATCH_GET_ITEM (operation {:item Operation/BATCH_GET_ITEM} "test" :item)))
    (is (= Operation/BATCH_GET_ITEM (operation {:test/item Operation/BATCH_GET_ITEM} "test" :item)))
    (is (= Operation/BATCH_EXECUTE_STATEMENT (operation {:item Operation/BATCH_EXECUTE_STATEMENT} "test" :item)))
    (is (= Operation/BATCH_EXECUTE_STATEMENT (operation {:test/item Operation/BATCH_EXECUTE_STATEMENT} "test" :item)))
    (is (= Operation/PUT_ITEM (operation {:item Operation/PUT_ITEM} "test" :item)))
    (is (= Operation/PUT_ITEM (operation {:test/item Operation/PUT_ITEM} "test" :item)))
    (is (= Operation/EXECUTE_STATEMENT (operation {:item Operation/EXECUTE_STATEMENT} "test" :item)))
    (is (= Operation/EXECUTE_STATEMENT (operation {:test/item Operation/EXECUTE_STATEMENT} "test" :item)))
    (is (= Operation/BATCH_WRITE_ITEM (operation {:item Operation/BATCH_WRITE_ITEM} "test" :item)))
    (is (= Operation/BATCH_WRITE_ITEM (operation {:test/item Operation/BATCH_WRITE_ITEM} "test" :item)))
    (is (= Operation/TRANSACT_GET_ITEMS (operation {:item Operation/TRANSACT_GET_ITEMS} "test" :item)))
    (is (= Operation/TRANSACT_GET_ITEMS (operation {:test/item Operation/TRANSACT_GET_ITEMS} "test" :item)))
    (is (= Operation/EXECUTE_TRANSACTION (operation {:item Operation/EXECUTE_TRANSACTION} "test" :item)))
    (is (= Operation/EXECUTE_TRANSACTION (operation {:test/item Operation/EXECUTE_TRANSACTION} "test" :item)))
    (is (= Operation/TRANSACT_WRITE_ITEMS (operation {:item Operation/TRANSACT_WRITE_ITEMS} "test" :item)))
    (is (= Operation/TRANSACT_WRITE_ITEMS (operation {:test/item Operation/TRANSACT_WRITE_ITEMS} "test" :item)))
    (is (= Operation/UPDATE_ITEM (operation {:item Operation/UPDATE_ITEM} "test" :item)))
    (is (= Operation/UPDATE_ITEM (operation {:test/item Operation/UPDATE_ITEM} "test" :item)))
    (is (= Operation/DELETE_ITEM (operation {:item Operation/DELETE_ITEM} "test" :item)))
    (is (= Operation/DELETE_ITEM (operation {:test/item Operation/DELETE_ITEM} "test" :item)))
    (is (= Operation/QUERY (operation {:item Operation/QUERY} "test" :item)))
    (is (= Operation/QUERY (operation {:test/item Operation/QUERY} "test" :item)))
    (is (= Operation/SCAN (operation {:item Operation/SCAN} "test" :item)))
    (is (= Operation/SCAN (operation {:test/item Operation/SCAN} "test" :item)))
    (is (= Operation/GET_ITEM (operation {:item Operation/GET_ITEM} "test" :item)))
    (is (= Operation/GET_ITEM (operation {:test/item Operation/GET_ITEM} "test" :item)))
    (is (= Operation/GET_RECORDS (operation {:item Operation/GET_RECORDS} "test" :item)))
    (is (= Operation/GET_RECORDS (operation {:test/item Operation/GET_RECORDS} "test" :item)))
    (is (= Operation/BATCH_GET_ITEM (operation {:item :batch-get-item} "test" :item)))
    (is (= Operation/BATCH_GET_ITEM (operation {:test/item :batch-get-item} "test" :item)))
    (is (= Operation/BATCH_EXECUTE_STATEMENT (operation {:item :batch-execute-statement} "test" :item)))
    (is (= Operation/BATCH_EXECUTE_STATEMENT (operation {:test/item :batch-execute-statement} "test" :item)))
    (is (= Operation/PUT_ITEM (operation {:item :put-item} "test" :item)))
    (is (= Operation/PUT_ITEM (operation {:test/item :put-item} "test" :item)))
    (is (= Operation/EXECUTE_STATEMENT (operation {:item :execute-statement} "test" :item)))
    (is (= Operation/EXECUTE_STATEMENT (operation {:test/item :execute-statement} "test" :item)))
    (is (= Operation/BATCH_WRITE_ITEM (operation {:item :batch-write-item} "test" :item)))
    (is (= Operation/BATCH_WRITE_ITEM (operation {:test/item :batch-write-item} "test" :item)))
    (is (= Operation/TRANSACT_GET_ITEMS (operation {:item :transact-get-items} "test" :item)))
    (is (= Operation/TRANSACT_GET_ITEMS (operation {:test/item :transact-get-items} "test" :item)))
    (is (= Operation/EXECUTE_TRANSACTION (operation {:item :execute-transaction} "test" :item)))
    (is (= Operation/EXECUTE_TRANSACTION (operation {:test/item :execute-transaction} "test" :item)))
    (is (= Operation/TRANSACT_WRITE_ITEMS (operation {:item :transact-write-items} "test" :item)))
    (is (= Operation/TRANSACT_WRITE_ITEMS (operation {:test/item :transact-write-items} "test" :item)))
    (is (= Operation/UPDATE_ITEM (operation {:item :update-item} "test" :item)))
    (is (= Operation/UPDATE_ITEM (operation {:test/item :update-item} "test" :item)))
    (is (= Operation/DELETE_ITEM (operation {:item :delete-item} "test" :item)))
    (is (= Operation/DELETE_ITEM (operation {:test/item :delete-item} "test" :item)))
    (is (= Operation/QUERY (operation {:item :query} "test" :item)))
    (is (= Operation/QUERY (operation {:test/item :query} "test" :item)))
    (is (= Operation/SCAN (operation {:item :scan} "test" :item)))
    (is (= Operation/SCAN (operation {:test/item :scan} "test" :item)))
    (is (= Operation/GET_ITEM (operation {:item :get-item} "test" :item)))
    (is (= Operation/GET_ITEM (operation {:test/item :get-item} "test" :item)))
    (is (= Operation/GET_RECORDS (operation {:item :get-records} "test" :item)))
    (is (= Operation/GET_RECORDS (operation {:test/item :get-records} "test" :item)))))


(deftest projection-type-test
  (testing "Testing enum function projection-type"
    (is (= ProjectionType/KEYS_ONLY (projection-type {:item ProjectionType/KEYS_ONLY} "test" :item)))
    (is (= ProjectionType/KEYS_ONLY (projection-type {:test/item ProjectionType/KEYS_ONLY} "test" :item)))
    (is (= ProjectionType/INCLUDE (projection-type {:item ProjectionType/INCLUDE} "test" :item)))
    (is (= ProjectionType/INCLUDE (projection-type {:test/item ProjectionType/INCLUDE} "test" :item)))
    (is (= ProjectionType/ALL (projection-type {:item ProjectionType/ALL} "test" :item)))
    (is (= ProjectionType/ALL (projection-type {:test/item ProjectionType/ALL} "test" :item)))
    (is (= ProjectionType/KEYS_ONLY (projection-type {:item :keys-only} "test" :item)))
    (is (= ProjectionType/KEYS_ONLY (projection-type {:test/item :keys-only} "test" :item)))
    (is (= ProjectionType/INCLUDE (projection-type {:item :include} "test" :item)))
    (is (= ProjectionType/INCLUDE (projection-type {:test/item :include} "test" :item)))
    (is (= ProjectionType/ALL (projection-type {:item :all} "test" :item)))
    (is (= ProjectionType/ALL (projection-type {:test/item :all} "test" :item)))))


(deftest stream-view-type-test
  (testing "Testing enum function stream-view-type"
    (is (= StreamViewType/NEW_IMAGE (stream-view-type {:item StreamViewType/NEW_IMAGE} "test" :item)))
    (is (= StreamViewType/NEW_IMAGE (stream-view-type {:test/item StreamViewType/NEW_IMAGE} "test" :item)))
    (is (= StreamViewType/NEW_AND_OLD_IMAGES (stream-view-type {:item StreamViewType/NEW_AND_OLD_IMAGES} "test" :item)))
    (is (= StreamViewType/NEW_AND_OLD_IMAGES (stream-view-type {:test/item StreamViewType/NEW_AND_OLD_IMAGES} "test" :item)))
    (is (= StreamViewType/KEYS_ONLY (stream-view-type {:item StreamViewType/KEYS_ONLY} "test" :item)))
    (is (= StreamViewType/KEYS_ONLY (stream-view-type {:test/item StreamViewType/KEYS_ONLY} "test" :item)))
    (is (= StreamViewType/OLD_IMAGE (stream-view-type {:item StreamViewType/OLD_IMAGE} "test" :item)))
    (is (= StreamViewType/OLD_IMAGE (stream-view-type {:test/item StreamViewType/OLD_IMAGE} "test" :item)))
    (is (= StreamViewType/NEW_IMAGE (stream-view-type {:item :new-image} "test" :item)))
    (is (= StreamViewType/NEW_IMAGE (stream-view-type {:test/item :new-image} "test" :item)))
    (is (= StreamViewType/NEW_AND_OLD_IMAGES (stream-view-type {:item :new-and-old-images} "test" :item)))
    (is (= StreamViewType/NEW_AND_OLD_IMAGES (stream-view-type {:test/item :new-and-old-images} "test" :item)))
    (is (= StreamViewType/KEYS_ONLY (stream-view-type {:item :keys-only} "test" :item)))
    (is (= StreamViewType/KEYS_ONLY (stream-view-type {:test/item :keys-only} "test" :item)))
    (is (= StreamViewType/OLD_IMAGE (stream-view-type {:item :old-image} "test" :item)))
    (is (= StreamViewType/OLD_IMAGE (stream-view-type {:test/item :old-image} "test" :item)))))


(deftest table-class-test
  (testing "Testing enum function table-class"
    (is (= TableClass/STANDARD (table-class {:item TableClass/STANDARD} "test" :item)))
    (is (= TableClass/STANDARD (table-class {:test/item TableClass/STANDARD} "test" :item)))
    (is (= TableClass/STANDARD_INFREQUENT_ACCESS (table-class {:item TableClass/STANDARD_INFREQUENT_ACCESS} "test" :item)))
    (is (= TableClass/STANDARD_INFREQUENT_ACCESS (table-class {:test/item TableClass/STANDARD_INFREQUENT_ACCESS} "test" :item)))
    (is (= TableClass/STANDARD (table-class {:item :standard} "test" :item)))
    (is (= TableClass/STANDARD (table-class {:test/item :standard} "test" :item)))
    (is (= TableClass/STANDARD_INFREQUENT_ACCESS (table-class {:item :standard-infrequent-access} "test" :item)))
    (is (= TableClass/STANDARD_INFREQUENT_ACCESS (table-class {:test/item :standard-infrequent-access} "test" :item)))))


(deftest table-encryption-test
  (testing "Testing enum function table-encryption"
    (is (= TableEncryption/CUSTOMER_MANAGED (table-encryption {:item TableEncryption/CUSTOMER_MANAGED} "test" :item)))
    (is (= TableEncryption/CUSTOMER_MANAGED (table-encryption {:test/item TableEncryption/CUSTOMER_MANAGED} "test" :item)))
    (is (= TableEncryption/AWS_MANAGED (table-encryption {:item TableEncryption/AWS_MANAGED} "test" :item)))
    (is (= TableEncryption/AWS_MANAGED (table-encryption {:test/item TableEncryption/AWS_MANAGED} "test" :item)))
    (is (= TableEncryption/DEFAULT (table-encryption {:item TableEncryption/DEFAULT} "test" :item)))
    (is (= TableEncryption/DEFAULT (table-encryption {:test/item TableEncryption/DEFAULT} "test" :item)))
    (is (= TableEncryption/CUSTOMER_MANAGED (table-encryption {:item :customer-managed} "test" :item)))
    (is (= TableEncryption/CUSTOMER_MANAGED (table-encryption {:test/item :customer-managed} "test" :item)))
    (is (= TableEncryption/AWS_MANAGED (table-encryption {:item :aws-managed} "test" :item)))
    (is (= TableEncryption/AWS_MANAGED (table-encryption {:test/item :aws-managed} "test" :item)))
    (is (= TableEncryption/DEFAULT (table-encryption {:item :default} "test" :item)))
    (is (= TableEncryption/DEFAULT (table-encryption {:test/item :default} "test" :item)))))