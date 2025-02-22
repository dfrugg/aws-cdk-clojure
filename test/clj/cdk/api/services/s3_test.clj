(ns cdk.api.services.s3-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3 package. "
  (:require [cdk.api.services.s3 :refer [bucket-access-control
                                         bucket-encryption
                                         bucket-notification-destination-type
                                         event-type
                                         http-methods
                                         inventory-format
                                         inventory-frequency
                                         inventory-object-version
                                         object-lock-mode
                                         object-ownership
                                         partition-date-source
                                         redirect-protocol]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.s3 BucketAccessControl
                                               BucketEncryption
                                               BucketNotificationDestinationType
                                               EventType
                                               HttpMethods
                                               InventoryFormat
                                               InventoryFrequency
                                               InventoryObjectVersion
                                               ObjectLockMode
                                               ObjectOwnership
                                               PartitionDateSource
                                               RedirectProtocol]))


(deftest bucket-access-control-test
  (testing "Testing enum function bucket-access-control"
    (is (= BucketAccessControl/AUTHENTICATED_READ (bucket-access-control {:item BucketAccessControl/AUTHENTICATED_READ} "test" :item)))
    (is (= BucketAccessControl/AUTHENTICATED_READ (bucket-access-control {:test/item BucketAccessControl/AUTHENTICATED_READ} "test" :item)))
    (is (= BucketAccessControl/AWS_EXEC_READ (bucket-access-control {:item BucketAccessControl/AWS_EXEC_READ} "test" :item)))
    (is (= BucketAccessControl/AWS_EXEC_READ (bucket-access-control {:test/item BucketAccessControl/AWS_EXEC_READ} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ (bucket-access-control {:item BucketAccessControl/PUBLIC_READ} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ (bucket-access-control {:test/item BucketAccessControl/PUBLIC_READ} "test" :item)))
    (is (= BucketAccessControl/PRIVATE (bucket-access-control {:item BucketAccessControl/PRIVATE} "test" :item)))
    (is (= BucketAccessControl/PRIVATE (bucket-access-control {:test/item BucketAccessControl/PRIVATE} "test" :item)))
    (is (= BucketAccessControl/LOG_DELIVERY_WRITE (bucket-access-control {:item BucketAccessControl/LOG_DELIVERY_WRITE} "test" :item)))
    (is (= BucketAccessControl/LOG_DELIVERY_WRITE (bucket-access-control {:test/item BucketAccessControl/LOG_DELIVERY_WRITE} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_FULL_CONTROL (bucket-access-control {:item BucketAccessControl/BUCKET_OWNER_FULL_CONTROL} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_FULL_CONTROL (bucket-access-control {:test/item BucketAccessControl/BUCKET_OWNER_FULL_CONTROL} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ_WRITE (bucket-access-control {:item BucketAccessControl/PUBLIC_READ_WRITE} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ_WRITE (bucket-access-control {:test/item BucketAccessControl/PUBLIC_READ_WRITE} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_READ (bucket-access-control {:item BucketAccessControl/BUCKET_OWNER_READ} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_READ (bucket-access-control {:test/item BucketAccessControl/BUCKET_OWNER_READ} "test" :item)))
    (is (= BucketAccessControl/AUTHENTICATED_READ (bucket-access-control {:item :authenticated-read} "test" :item)))
    (is (= BucketAccessControl/AUTHENTICATED_READ (bucket-access-control {:test/item :authenticated-read} "test" :item)))
    (is (= BucketAccessControl/AWS_EXEC_READ (bucket-access-control {:item :aws-exec-read} "test" :item)))
    (is (= BucketAccessControl/AWS_EXEC_READ (bucket-access-control {:test/item :aws-exec-read} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ (bucket-access-control {:item :public-read} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ (bucket-access-control {:test/item :public-read} "test" :item)))
    (is (= BucketAccessControl/PRIVATE (bucket-access-control {:item :private} "test" :item)))
    (is (= BucketAccessControl/PRIVATE (bucket-access-control {:test/item :private} "test" :item)))
    (is (= BucketAccessControl/LOG_DELIVERY_WRITE (bucket-access-control {:item :log-delivery-write} "test" :item)))
    (is (= BucketAccessControl/LOG_DELIVERY_WRITE (bucket-access-control {:test/item :log-delivery-write} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_FULL_CONTROL (bucket-access-control {:item :bucket-owner-full-control} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_FULL_CONTROL (bucket-access-control {:test/item :bucket-owner-full-control} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ_WRITE (bucket-access-control {:item :public-read-write} "test" :item)))
    (is (= BucketAccessControl/PUBLIC_READ_WRITE (bucket-access-control {:test/item :public-read-write} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_READ (bucket-access-control {:item :bucket-owner-read} "test" :item)))
    (is (= BucketAccessControl/BUCKET_OWNER_READ (bucket-access-control {:test/item :bucket-owner-read} "test" :item)))))


(deftest bucket-encryption-test
  (testing "Testing enum function bucket-encryption"
    (is (= BucketEncryption/DSSE_MANAGED (bucket-encryption {:item BucketEncryption/DSSE_MANAGED} "test" :item)))
    (is (= BucketEncryption/DSSE_MANAGED (bucket-encryption {:test/item BucketEncryption/DSSE_MANAGED} "test" :item)))
    (is (= BucketEncryption/KMS_MANAGED (bucket-encryption {:item BucketEncryption/KMS_MANAGED} "test" :item)))
    (is (= BucketEncryption/KMS_MANAGED (bucket-encryption {:test/item BucketEncryption/KMS_MANAGED} "test" :item)))
    (is (= BucketEncryption/UNENCRYPTED (bucket-encryption {:item BucketEncryption/UNENCRYPTED} "test" :item)))
    (is (= BucketEncryption/UNENCRYPTED (bucket-encryption {:test/item BucketEncryption/UNENCRYPTED} "test" :item)))
    (is (= BucketEncryption/S3_MANAGED (bucket-encryption {:item BucketEncryption/S3_MANAGED} "test" :item)))
    (is (= BucketEncryption/S3_MANAGED (bucket-encryption {:test/item BucketEncryption/S3_MANAGED} "test" :item)))
    (is (= BucketEncryption/KMS (bucket-encryption {:item BucketEncryption/KMS} "test" :item)))
    (is (= BucketEncryption/KMS (bucket-encryption {:test/item BucketEncryption/KMS} "test" :item)))
    (is (= BucketEncryption/DSSE (bucket-encryption {:item BucketEncryption/DSSE} "test" :item)))
    (is (= BucketEncryption/DSSE (bucket-encryption {:test/item BucketEncryption/DSSE} "test" :item)))
    (is (= BucketEncryption/DSSE_MANAGED (bucket-encryption {:item :dsse-managed} "test" :item)))
    (is (= BucketEncryption/DSSE_MANAGED (bucket-encryption {:test/item :dsse-managed} "test" :item)))
    (is (= BucketEncryption/KMS_MANAGED (bucket-encryption {:item :kms-managed} "test" :item)))
    (is (= BucketEncryption/KMS_MANAGED (bucket-encryption {:test/item :kms-managed} "test" :item)))
    (is (= BucketEncryption/UNENCRYPTED (bucket-encryption {:item :unencrypted} "test" :item)))
    (is (= BucketEncryption/UNENCRYPTED (bucket-encryption {:test/item :unencrypted} "test" :item)))
    (is (= BucketEncryption/S3_MANAGED (bucket-encryption {:item :s3-managed} "test" :item)))
    (is (= BucketEncryption/S3_MANAGED (bucket-encryption {:test/item :s3-managed} "test" :item)))
    (is (= BucketEncryption/KMS (bucket-encryption {:item :kms} "test" :item)))
    (is (= BucketEncryption/KMS (bucket-encryption {:test/item :kms} "test" :item)))
    (is (= BucketEncryption/DSSE (bucket-encryption {:item :dsse} "test" :item)))
    (is (= BucketEncryption/DSSE (bucket-encryption {:test/item :dsse} "test" :item)))))


(deftest bucket-notification-destination-type-test
  (testing "Testing enum function bucket-notification-destination-type"
    (is (= BucketNotificationDestinationType/QUEUE (bucket-notification-destination-type {:item BucketNotificationDestinationType/QUEUE} "test" :item)))
    (is (= BucketNotificationDestinationType/QUEUE (bucket-notification-destination-type {:test/item BucketNotificationDestinationType/QUEUE} "test" :item)))
    (is (= BucketNotificationDestinationType/TOPIC (bucket-notification-destination-type {:item BucketNotificationDestinationType/TOPIC} "test" :item)))
    (is (= BucketNotificationDestinationType/TOPIC (bucket-notification-destination-type {:test/item BucketNotificationDestinationType/TOPIC} "test" :item)))
    (is (= BucketNotificationDestinationType/LAMBDA (bucket-notification-destination-type {:item BucketNotificationDestinationType/LAMBDA} "test" :item)))
    (is (= BucketNotificationDestinationType/LAMBDA (bucket-notification-destination-type {:test/item BucketNotificationDestinationType/LAMBDA} "test" :item)))
    (is (= BucketNotificationDestinationType/QUEUE (bucket-notification-destination-type {:item :queue} "test" :item)))
    (is (= BucketNotificationDestinationType/QUEUE (bucket-notification-destination-type {:test/item :queue} "test" :item)))
    (is (= BucketNotificationDestinationType/TOPIC (bucket-notification-destination-type {:item :topic} "test" :item)))
    (is (= BucketNotificationDestinationType/TOPIC (bucket-notification-destination-type {:test/item :topic} "test" :item)))
    (is (= BucketNotificationDestinationType/LAMBDA (bucket-notification-destination-type {:item :lambda} "test" :item)))
    (is (= BucketNotificationDestinationType/LAMBDA (bucket-notification-destination-type {:test/item :lambda} "test" :item)))))


(deftest event-type-test
  (testing "Testing enum function event-type"
    (is (= EventType/OBJECT_TAGGING_PUT (event-type {:item EventType/OBJECT_TAGGING_PUT} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_PUT (event-type {:test/item EventType/OBJECT_TAGGING_PUT} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE (event-type {:item EventType/LIFECYCLE_EXPIRATION_DELETE} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE (event-type {:test/item EventType/LIFECYCLE_EXPIRATION_DELETE} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_DELETE (event-type {:item EventType/OBJECT_RESTORE_DELETE} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_DELETE (event-type {:test/item EventType/OBJECT_RESTORE_DELETE} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COPY (event-type {:item EventType/OBJECT_CREATED_COPY} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COPY (event-type {:test/item EventType/OBJECT_CREATED_COPY} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_NOT_TRACKED (event-type {:item EventType/REPLICATION_OPERATION_NOT_TRACKED} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_NOT_TRACKED (event-type {:test/item EventType/REPLICATION_OPERATION_NOT_TRACKED} "test" :item)))
    (is (= EventType/LIFECYCLE_TRANSITION (event-type {:item EventType/LIFECYCLE_TRANSITION} "test" :item)))
    (is (= EventType/LIFECYCLE_TRANSITION (event-type {:test/item EventType/LIFECYCLE_TRANSITION} "test" :item)))
    (is (= EventType/OBJECT_ACL_PUT (event-type {:item EventType/OBJECT_ACL_PUT} "test" :item)))
    (is (= EventType/OBJECT_ACL_PUT (event-type {:test/item EventType/OBJECT_ACL_PUT} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION (event-type {:item EventType/LIFECYCLE_EXPIRATION} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION (event-type {:test/item EventType/LIFECYCLE_EXPIRATION} "test" :item)))
    (is (= EventType/OBJECT_TAGGING (event-type {:item EventType/OBJECT_TAGGING} "test" :item)))
    (is (= EventType/OBJECT_TAGGING (event-type {:test/item EventType/OBJECT_TAGGING} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_POST (event-type {:item EventType/OBJECT_RESTORE_POST} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_POST (event-type {:test/item EventType/OBJECT_RESTORE_POST} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE (event-type {:item EventType/OBJECT_REMOVED_DELETE} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE (event-type {:test/item EventType/OBJECT_REMOVED_DELETE} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_MISSED_THRESHOLD (event-type {:item EventType/REPLICATION_OPERATION_MISSED_THRESHOLD} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_MISSED_THRESHOLD (event-type {:test/item EventType/REPLICATION_OPERATION_MISSED_THRESHOLD} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED (event-type {:item EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED (event-type {:test/item EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_COMPLETED (event-type {:item EventType/OBJECT_RESTORE_COMPLETED} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_COMPLETED (event-type {:test/item EventType/OBJECT_RESTORE_COMPLETED} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_FAILED_REPLICATION (event-type {:item EventType/REPLICATION_OPERATION_FAILED_REPLICATION} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_FAILED_REPLICATION (event-type {:test/item EventType/REPLICATION_OPERATION_FAILED_REPLICATION} "test" :item)))
    (is (= EventType/OBJECT_REMOVED (event-type {:item EventType/OBJECT_REMOVED} "test" :item)))
    (is (= EventType/OBJECT_REMOVED (event-type {:test/item EventType/OBJECT_REMOVED} "test" :item)))
    (is (= EventType/OBJECT_CREATED_POST (event-type {:item EventType/OBJECT_CREATED_POST} "test" :item)))
    (is (= EventType/OBJECT_CREATED_POST (event-type {:test/item EventType/OBJECT_CREATED_POST} "test" :item)))
    (is (= EventType/OBJECT_CREATED (event-type {:item EventType/OBJECT_CREATED} "test" :item)))
    (is (= EventType/OBJECT_CREATED (event-type {:test/item EventType/OBJECT_CREATED} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD (event-type {:item EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD (event-type {:test/item EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED (event-type {:item EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED (event-type {:test/item EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD (event-type {:item EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD (event-type {:test/item EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD} "test" :item)))
    (is (= EventType/REDUCED_REDUNDANCY_LOST_OBJECT (event-type {:item EventType/REDUCED_REDUNDANCY_LOST_OBJECT} "test" :item)))
    (is (= EventType/REDUCED_REDUNDANCY_LOST_OBJECT (event-type {:test/item EventType/REDUCED_REDUNDANCY_LOST_OBJECT} "test" :item)))
    (is (= EventType/INTELLIGENT_TIERING (event-type {:item EventType/INTELLIGENT_TIERING} "test" :item)))
    (is (= EventType/INTELLIGENT_TIERING (event-type {:test/item EventType/INTELLIGENT_TIERING} "test" :item)))
    (is (= EventType/OBJECT_CREATED_PUT (event-type {:item EventType/OBJECT_CREATED_PUT} "test" :item)))
    (is (= EventType/OBJECT_CREATED_PUT (event-type {:test/item EventType/OBJECT_CREATED_PUT} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_DELETE (event-type {:item EventType/OBJECT_TAGGING_DELETE} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_DELETE (event-type {:test/item EventType/OBJECT_TAGGING_DELETE} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_PUT (event-type {:item :object-tagging-put} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_PUT (event-type {:test/item :object-tagging-put} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE (event-type {:item :lifecycle-expiration-delete} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE (event-type {:test/item :lifecycle-expiration-delete} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_DELETE (event-type {:item :object-restore-delete} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_DELETE (event-type {:test/item :object-restore-delete} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COPY (event-type {:item :object-created-copy} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COPY (event-type {:test/item :object-created-copy} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_NOT_TRACKED (event-type {:item :replication-operation-not-tracked} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_NOT_TRACKED (event-type {:test/item :replication-operation-not-tracked} "test" :item)))
    (is (= EventType/LIFECYCLE_TRANSITION (event-type {:item :lifecycle-transition} "test" :item)))
    (is (= EventType/LIFECYCLE_TRANSITION (event-type {:test/item :lifecycle-transition} "test" :item)))
    (is (= EventType/OBJECT_ACL_PUT (event-type {:item :object-acl-put} "test" :item)))
    (is (= EventType/OBJECT_ACL_PUT (event-type {:test/item :object-acl-put} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION (event-type {:item :lifecycle-expiration} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION (event-type {:test/item :lifecycle-expiration} "test" :item)))
    (is (= EventType/OBJECT_TAGGING (event-type {:item :object-tagging} "test" :item)))
    (is (= EventType/OBJECT_TAGGING (event-type {:test/item :object-tagging} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_POST (event-type {:item :object-restore-post} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_POST (event-type {:test/item :object-restore-post} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE (event-type {:item :object-removed-delete} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE (event-type {:test/item :object-removed-delete} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_MISSED_THRESHOLD (event-type {:item :replication-operation-missed-threshold} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_MISSED_THRESHOLD (event-type {:test/item :replication-operation-missed-threshold} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED (event-type {:item :lifecycle-expiration-delete-marker-created} "test" :item)))
    (is (= EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED (event-type {:test/item :lifecycle-expiration-delete-marker-created} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_COMPLETED (event-type {:item :object-restore-completed} "test" :item)))
    (is (= EventType/OBJECT_RESTORE_COMPLETED (event-type {:test/item :object-restore-completed} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_FAILED_REPLICATION (event-type {:item :replication-operation-failed-replication} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_FAILED_REPLICATION (event-type {:test/item :replication-operation-failed-replication} "test" :item)))
    (is (= EventType/OBJECT_REMOVED (event-type {:item :object-removed} "test" :item)))
    (is (= EventType/OBJECT_REMOVED (event-type {:test/item :object-removed} "test" :item)))
    (is (= EventType/OBJECT_CREATED_POST (event-type {:item :object-created-post} "test" :item)))
    (is (= EventType/OBJECT_CREATED_POST (event-type {:test/item :object-created-post} "test" :item)))
    (is (= EventType/OBJECT_CREATED (event-type {:item :object-created} "test" :item)))
    (is (= EventType/OBJECT_CREATED (event-type {:test/item :object-created} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD (event-type {:item :object-created-complete-multipart-upload} "test" :item)))
    (is (= EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD (event-type {:test/item :object-created-complete-multipart-upload} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED (event-type {:item :object-removed-delete-marker-created} "test" :item)))
    (is (= EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED (event-type {:test/item :object-removed-delete-marker-created} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD (event-type {:item :replication-operation-replicated-after-threshold} "test" :item)))
    (is (= EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD (event-type {:test/item :replication-operation-replicated-after-threshold} "test" :item)))
    (is (= EventType/REDUCED_REDUNDANCY_LOST_OBJECT (event-type {:item :reduced-redundancy-lost-object} "test" :item)))
    (is (= EventType/REDUCED_REDUNDANCY_LOST_OBJECT (event-type {:test/item :reduced-redundancy-lost-object} "test" :item)))
    (is (= EventType/INTELLIGENT_TIERING (event-type {:item :intelligent-tiering} "test" :item)))
    (is (= EventType/INTELLIGENT_TIERING (event-type {:test/item :intelligent-tiering} "test" :item)))
    (is (= EventType/OBJECT_CREATED_PUT (event-type {:item :object-created-put} "test" :item)))
    (is (= EventType/OBJECT_CREATED_PUT (event-type {:test/item :object-created-put} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_DELETE (event-type {:item :object-tagging-delete} "test" :item)))
    (is (= EventType/OBJECT_TAGGING_DELETE (event-type {:test/item :object-tagging-delete} "test" :item)))))


(deftest http-methods-test
  (testing "Testing enum function http-methods"
    (is (= HttpMethods/GET (http-methods {:item HttpMethods/GET} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:test/item HttpMethods/GET} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:item HttpMethods/PUT} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:test/item HttpMethods/PUT} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:item HttpMethods/POST} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:test/item HttpMethods/POST} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:item HttpMethods/DELETE} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:test/item HttpMethods/DELETE} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:item HttpMethods/HEAD} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:test/item HttpMethods/HEAD} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:item :get} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:test/item :get} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:item :put} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:test/item :put} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:item :post} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:test/item :post} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:item :delete} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:test/item :delete} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:item :head} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:test/item :head} "test" :item)))))


(deftest inventory-format-test
  (testing "Testing enum function inventory-format"
    (is (= InventoryFormat/ORC (inventory-format {:item InventoryFormat/ORC} "test" :item)))
    (is (= InventoryFormat/ORC (inventory-format {:test/item InventoryFormat/ORC} "test" :item)))
    (is (= InventoryFormat/PARQUET (inventory-format {:item InventoryFormat/PARQUET} "test" :item)))
    (is (= InventoryFormat/PARQUET (inventory-format {:test/item InventoryFormat/PARQUET} "test" :item)))
    (is (= InventoryFormat/CSV (inventory-format {:item InventoryFormat/CSV} "test" :item)))
    (is (= InventoryFormat/CSV (inventory-format {:test/item InventoryFormat/CSV} "test" :item)))
    (is (= InventoryFormat/ORC (inventory-format {:item :orc} "test" :item)))
    (is (= InventoryFormat/ORC (inventory-format {:test/item :orc} "test" :item)))
    (is (= InventoryFormat/PARQUET (inventory-format {:item :parquet} "test" :item)))
    (is (= InventoryFormat/PARQUET (inventory-format {:test/item :parquet} "test" :item)))
    (is (= InventoryFormat/CSV (inventory-format {:item :csv} "test" :item)))
    (is (= InventoryFormat/CSV (inventory-format {:test/item :csv} "test" :item)))))


(deftest inventory-frequency-test
  (testing "Testing enum function inventory-frequency"
    (is (= InventoryFrequency/DAILY (inventory-frequency {:item InventoryFrequency/DAILY} "test" :item)))
    (is (= InventoryFrequency/DAILY (inventory-frequency {:test/item InventoryFrequency/DAILY} "test" :item)))
    (is (= InventoryFrequency/WEEKLY (inventory-frequency {:item InventoryFrequency/WEEKLY} "test" :item)))
    (is (= InventoryFrequency/WEEKLY (inventory-frequency {:test/item InventoryFrequency/WEEKLY} "test" :item)))
    (is (= InventoryFrequency/DAILY (inventory-frequency {:item :daily} "test" :item)))
    (is (= InventoryFrequency/DAILY (inventory-frequency {:test/item :daily} "test" :item)))
    (is (= InventoryFrequency/WEEKLY (inventory-frequency {:item :weekly} "test" :item)))
    (is (= InventoryFrequency/WEEKLY (inventory-frequency {:test/item :weekly} "test" :item)))))


(deftest inventory-object-version-test
  (testing "Testing enum function inventory-object-version"
    (is (= InventoryObjectVersion/CURRENT (inventory-object-version {:item InventoryObjectVersion/CURRENT} "test" :item)))
    (is (= InventoryObjectVersion/CURRENT (inventory-object-version {:test/item InventoryObjectVersion/CURRENT} "test" :item)))
    (is (= InventoryObjectVersion/ALL (inventory-object-version {:item InventoryObjectVersion/ALL} "test" :item)))
    (is (= InventoryObjectVersion/ALL (inventory-object-version {:test/item InventoryObjectVersion/ALL} "test" :item)))
    (is (= InventoryObjectVersion/CURRENT (inventory-object-version {:item :current} "test" :item)))
    (is (= InventoryObjectVersion/CURRENT (inventory-object-version {:test/item :current} "test" :item)))
    (is (= InventoryObjectVersion/ALL (inventory-object-version {:item :all} "test" :item)))
    (is (= InventoryObjectVersion/ALL (inventory-object-version {:test/item :all} "test" :item)))))


(deftest object-lock-mode-test
  (testing "Testing enum function object-lock-mode"
    (is (= ObjectLockMode/GOVERNANCE (object-lock-mode {:item ObjectLockMode/GOVERNANCE} "test" :item)))
    (is (= ObjectLockMode/GOVERNANCE (object-lock-mode {:test/item ObjectLockMode/GOVERNANCE} "test" :item)))
    (is (= ObjectLockMode/COMPLIANCE (object-lock-mode {:item ObjectLockMode/COMPLIANCE} "test" :item)))
    (is (= ObjectLockMode/COMPLIANCE (object-lock-mode {:test/item ObjectLockMode/COMPLIANCE} "test" :item)))
    (is (= ObjectLockMode/GOVERNANCE (object-lock-mode {:item :governance} "test" :item)))
    (is (= ObjectLockMode/GOVERNANCE (object-lock-mode {:test/item :governance} "test" :item)))
    (is (= ObjectLockMode/COMPLIANCE (object-lock-mode {:item :compliance} "test" :item)))
    (is (= ObjectLockMode/COMPLIANCE (object-lock-mode {:test/item :compliance} "test" :item)))))


(deftest object-ownership-test
  (testing "Testing enum function object-ownership"
    (is (= ObjectOwnership/BUCKET_OWNER_ENFORCED (object-ownership {:item ObjectOwnership/BUCKET_OWNER_ENFORCED} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_ENFORCED (object-ownership {:test/item ObjectOwnership/BUCKET_OWNER_ENFORCED} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_PREFERRED (object-ownership {:item ObjectOwnership/BUCKET_OWNER_PREFERRED} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_PREFERRED (object-ownership {:test/item ObjectOwnership/BUCKET_OWNER_PREFERRED} "test" :item)))
    (is (= ObjectOwnership/OBJECT_WRITER (object-ownership {:item ObjectOwnership/OBJECT_WRITER} "test" :item)))
    (is (= ObjectOwnership/OBJECT_WRITER (object-ownership {:test/item ObjectOwnership/OBJECT_WRITER} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_ENFORCED (object-ownership {:item :bucket-owner-enforced} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_ENFORCED (object-ownership {:test/item :bucket-owner-enforced} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_PREFERRED (object-ownership {:item :bucket-owner-preferred} "test" :item)))
    (is (= ObjectOwnership/BUCKET_OWNER_PREFERRED (object-ownership {:test/item :bucket-owner-preferred} "test" :item)))
    (is (= ObjectOwnership/OBJECT_WRITER (object-ownership {:item :object-writer} "test" :item)))
    (is (= ObjectOwnership/OBJECT_WRITER (object-ownership {:test/item :object-writer} "test" :item)))))


(deftest partition-date-source-test
  (testing "Testing enum function partition-date-source"
    (is (= PartitionDateSource/DELIVERY_TIME (partition-date-source {:item PartitionDateSource/DELIVERY_TIME} "test" :item)))
    (is (= PartitionDateSource/DELIVERY_TIME (partition-date-source {:test/item PartitionDateSource/DELIVERY_TIME} "test" :item)))
    (is (= PartitionDateSource/EVENT_TIME (partition-date-source {:item PartitionDateSource/EVENT_TIME} "test" :item)))
    (is (= PartitionDateSource/EVENT_TIME (partition-date-source {:test/item PartitionDateSource/EVENT_TIME} "test" :item)))
    (is (= PartitionDateSource/DELIVERY_TIME (partition-date-source {:item :delivery-time} "test" :item)))
    (is (= PartitionDateSource/DELIVERY_TIME (partition-date-source {:test/item :delivery-time} "test" :item)))
    (is (= PartitionDateSource/EVENT_TIME (partition-date-source {:item :event-time} "test" :item)))
    (is (= PartitionDateSource/EVENT_TIME (partition-date-source {:test/item :event-time} "test" :item)))))


(deftest redirect-protocol-test
  (testing "Testing enum function redirect-protocol"
    (is (= RedirectProtocol/HTTPS (redirect-protocol {:item RedirectProtocol/HTTPS} "test" :item)))
    (is (= RedirectProtocol/HTTPS (redirect-protocol {:test/item RedirectProtocol/HTTPS} "test" :item)))
    (is (= RedirectProtocol/HTTP (redirect-protocol {:item RedirectProtocol/HTTP} "test" :item)))
    (is (= RedirectProtocol/HTTP (redirect-protocol {:test/item RedirectProtocol/HTTP} "test" :item)))
    (is (= RedirectProtocol/HTTPS (redirect-protocol {:item :https} "test" :item)))
    (is (= RedirectProtocol/HTTPS (redirect-protocol {:test/item :https} "test" :item)))
    (is (= RedirectProtocol/HTTP (redirect-protocol {:item :http} "test" :item)))
    (is (= RedirectProtocol/HTTP (redirect-protocol {:test/item :http} "test" :item)))))