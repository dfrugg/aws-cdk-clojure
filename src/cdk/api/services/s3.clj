(ns cdk.api.services.s3
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.s3 package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.s3 BlockPublicAccess$Builder
                                               BlockPublicAccessOptions$Builder
                                               Bucket$Builder
                                               BucketAccessControl
                                               BucketAttributes$Builder
                                               BucketEncryption
                                               BucketMetrics$Builder
                                               BucketNotificationDestinationConfig$Builder
                                               BucketNotificationDestinationType
                                               BucketPolicy$Builder
                                               BucketPolicyProps$Builder
                                               BucketProps$Builder
                                               CfnAccessGrant$AccessGrantsLocationConfigurationProperty$Builder
                                               CfnAccessGrant$Builder
                                               CfnAccessGrant$GranteeProperty$Builder
                                               CfnAccessGrantProps$Builder
                                               CfnAccessGrantsInstance$Builder
                                               CfnAccessGrantsInstanceProps$Builder
                                               CfnAccessGrantsLocation$Builder
                                               CfnAccessGrantsLocationProps$Builder
                                               CfnAccessPoint$Builder
                                               CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder
                                               CfnAccessPoint$VpcConfigurationProperty$Builder
                                               CfnAccessPointProps$Builder
                                               CfnBucket$AbortIncompleteMultipartUploadProperty$Builder
                                               CfnBucket$AccelerateConfigurationProperty$Builder
                                               CfnBucket$AccessControlTranslationProperty$Builder
                                               CfnBucket$AnalyticsConfigurationProperty$Builder
                                               CfnBucket$BucketEncryptionProperty$Builder
                                               CfnBucket$Builder
                                               CfnBucket$CorsConfigurationProperty$Builder
                                               CfnBucket$CorsRuleProperty$Builder
                                               CfnBucket$DataExportProperty$Builder
                                               CfnBucket$DefaultRetentionProperty$Builder
                                               CfnBucket$DeleteMarkerReplicationProperty$Builder
                                               CfnBucket$DestinationProperty$Builder
                                               CfnBucket$EncryptionConfigurationProperty$Builder
                                               CfnBucket$EventBridgeConfigurationProperty$Builder
                                               CfnBucket$FilterRuleProperty$Builder
                                               CfnBucket$IntelligentTieringConfigurationProperty$Builder
                                               CfnBucket$InventoryConfigurationProperty$Builder
                                               CfnBucket$LambdaConfigurationProperty$Builder
                                               CfnBucket$LifecycleConfigurationProperty$Builder
                                               CfnBucket$LoggingConfigurationProperty$Builder
                                               CfnBucket$MetricsConfigurationProperty$Builder
                                               CfnBucket$MetricsProperty$Builder
                                               CfnBucket$NoncurrentVersionExpirationProperty$Builder
                                               CfnBucket$NoncurrentVersionTransitionProperty$Builder
                                               CfnBucket$NotificationConfigurationProperty$Builder
                                               CfnBucket$NotificationFilterProperty$Builder
                                               CfnBucket$ObjectLockConfigurationProperty$Builder
                                               CfnBucket$ObjectLockRuleProperty$Builder
                                               CfnBucket$OwnershipControlsProperty$Builder
                                               CfnBucket$OwnershipControlsRuleProperty$Builder
                                               CfnBucket$PartitionedPrefixProperty$Builder
                                               CfnBucket$PublicAccessBlockConfigurationProperty$Builder
                                               CfnBucket$QueueConfigurationProperty$Builder
                                               CfnBucket$RedirectAllRequestsToProperty$Builder
                                               CfnBucket$RedirectRuleProperty$Builder
                                               CfnBucket$ReplicaModificationsProperty$Builder
                                               CfnBucket$ReplicationConfigurationProperty$Builder
                                               CfnBucket$ReplicationDestinationProperty$Builder
                                               CfnBucket$ReplicationRuleAndOperatorProperty$Builder
                                               CfnBucket$ReplicationRuleFilterProperty$Builder
                                               CfnBucket$ReplicationRuleProperty$Builder
                                               CfnBucket$ReplicationTimeProperty$Builder
                                               CfnBucket$ReplicationTimeValueProperty$Builder
                                               CfnBucket$RoutingRuleConditionProperty$Builder
                                               CfnBucket$RoutingRuleProperty$Builder
                                               CfnBucket$RuleProperty$Builder
                                               CfnBucket$S3KeyFilterProperty$Builder
                                               CfnBucket$ServerSideEncryptionByDefaultProperty$Builder
                                               CfnBucket$ServerSideEncryptionRuleProperty$Builder
                                               CfnBucket$SourceSelectionCriteriaProperty$Builder
                                               CfnBucket$SseKmsEncryptedObjectsProperty$Builder
                                               CfnBucket$StorageClassAnalysisProperty$Builder
                                               CfnBucket$TagFilterProperty$Builder
                                               CfnBucket$TargetObjectKeyFormatProperty$Builder
                                               CfnBucket$TieringProperty$Builder
                                               CfnBucket$TopicConfigurationProperty$Builder
                                               CfnBucket$TransitionProperty$Builder
                                               CfnBucket$VersioningConfigurationProperty$Builder
                                               CfnBucket$WebsiteConfigurationProperty$Builder
                                               CfnBucketPolicy$Builder
                                               CfnBucketPolicyProps$Builder
                                               CfnBucketProps$Builder
                                               CfnMultiRegionAccessPoint$Builder
                                               CfnMultiRegionAccessPoint$PublicAccessBlockConfigurationProperty$Builder
                                               CfnMultiRegionAccessPoint$RegionProperty$Builder
                                               CfnMultiRegionAccessPointPolicy$Builder
                                               CfnMultiRegionAccessPointPolicy$PolicyStatusProperty$Builder
                                               CfnMultiRegionAccessPointPolicyProps$Builder
                                               CfnMultiRegionAccessPointProps$Builder
                                               CfnStorageLens$AccountLevelProperty$Builder
                                               CfnStorageLens$ActivityMetricsProperty$Builder
                                               CfnStorageLens$AdvancedCostOptimizationMetricsProperty$Builder
                                               CfnStorageLens$AdvancedDataProtectionMetricsProperty$Builder
                                               CfnStorageLens$AwsOrgProperty$Builder
                                               CfnStorageLens$BucketLevelProperty$Builder
                                               CfnStorageLens$BucketsAndRegionsProperty$Builder
                                               CfnStorageLens$Builder
                                               CfnStorageLens$CloudWatchMetricsProperty$Builder
                                               CfnStorageLens$DataExportProperty$Builder
                                               CfnStorageLens$DetailedStatusCodesMetricsProperty$Builder
                                               CfnStorageLens$EncryptionProperty$Builder
                                               CfnStorageLens$PrefixLevelProperty$Builder
                                               CfnStorageLens$PrefixLevelStorageMetricsProperty$Builder
                                               CfnStorageLens$S3BucketDestinationProperty$Builder
                                               CfnStorageLens$SSEKMSProperty$Builder
                                               CfnStorageLens$SelectionCriteriaProperty$Builder
                                               CfnStorageLens$StorageLensConfigurationProperty$Builder
                                               CfnStorageLens$StorageLensGroupLevelProperty$Builder
                                               CfnStorageLens$StorageLensGroupSelectionCriteriaProperty$Builder
                                               CfnStorageLensGroup$AndProperty$Builder
                                               CfnStorageLensGroup$Builder
                                               CfnStorageLensGroup$FilterProperty$Builder
                                               CfnStorageLensGroup$MatchObjectAgeProperty$Builder
                                               CfnStorageLensGroup$MatchObjectSizeProperty$Builder
                                               CfnStorageLensGroup$OrProperty$Builder
                                               CfnStorageLensGroupProps$Builder
                                               CfnStorageLensProps$Builder
                                               CorsRule$Builder
                                               EventType
                                               HttpMethods
                                               IntelligentTieringConfiguration$Builder
                                               Inventory$Builder
                                               InventoryDestination$Builder
                                               InventoryFormat
                                               InventoryFrequency
                                               InventoryObjectVersion
                                               LifecycleRule$Builder
                                               Location$Builder
                                               NoncurrentVersionTransition$Builder
                                               NotificationKeyFilter$Builder
                                               ObjectLockMode
                                               ObjectOwnership
                                               OnCloudTrailBucketEventOptions$Builder
                                               PartitionDateSource
                                               RedirectProtocol
                                               RedirectTarget$Builder
                                               RoutingRule$Builder
                                               RoutingRuleCondition$Builder
                                               Tag$Builder
                                               TransferAccelerationUrlOptions$Builder
                                               Transition$Builder
                                               VirtualHostedStyleUrlOptions$Builder]))


(defn bucket-access-control
  "The `bucket-access-control` function data interprets values in the provided config data into a 
`BucketAccessControl` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BucketAccessControl` - the value is returned.
* is `:authenticated-read` - `BucketAccessControl/AUTHENTICATED_READ` is returned
* is `:aws-exec-read` - `BucketAccessControl/AWS_EXEC_READ` is returned
* is `:public-read` - `BucketAccessControl/PUBLIC_READ` is returned
* is `:private` - `BucketAccessControl/PRIVATE` is returned
* is `:log-delivery-write` - `BucketAccessControl/LOG_DELIVERY_WRITE` is returned
* is `:bucket-owner-full-control` - `BucketAccessControl/BUCKET_OWNER_FULL_CONTROL` is returned
* is `:public-read-write` - `BucketAccessControl/PUBLIC_READ_WRITE` is returned
* is `:bucket-owner-read` - `BucketAccessControl/BUCKET_OWNER_READ` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BucketAccessControl data) data
      (= :authenticated-read data) BucketAccessControl/AUTHENTICATED_READ
      (= :aws-exec-read data) BucketAccessControl/AWS_EXEC_READ
      (= :public-read data) BucketAccessControl/PUBLIC_READ
      (= :private data) BucketAccessControl/PRIVATE
      (= :log-delivery-write data) BucketAccessControl/LOG_DELIVERY_WRITE
      (= :bucket-owner-full-control data) BucketAccessControl/BUCKET_OWNER_FULL_CONTROL
      (= :public-read-write data) BucketAccessControl/PUBLIC_READ_WRITE
      (= :bucket-owner-read data) BucketAccessControl/BUCKET_OWNER_READ)))


(defn bucket-encryption
  "The `bucket-encryption` function data interprets values in the provided config data into a 
`BucketEncryption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BucketEncryption` - the value is returned.
* is `:dsse-managed` - `BucketEncryption/DSSE_MANAGED` is returned
* is `:kms-managed` - `BucketEncryption/KMS_MANAGED` is returned
* is `:unencrypted` - `BucketEncryption/UNENCRYPTED` is returned
* is `:s3-managed` - `BucketEncryption/S3_MANAGED` is returned
* is `:kms` - `BucketEncryption/KMS` is returned
* is `:dsse` - `BucketEncryption/DSSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BucketEncryption data) data
      (= :dsse-managed data) BucketEncryption/DSSE_MANAGED
      (= :kms-managed data) BucketEncryption/KMS_MANAGED
      (= :unencrypted data) BucketEncryption/UNENCRYPTED
      (= :s3-managed data) BucketEncryption/S3_MANAGED
      (= :kms data) BucketEncryption/KMS
      (= :dsse data) BucketEncryption/DSSE)))


(defn bucket-notification-destination-type
  "The `bucket-notification-destination-type` function data interprets values in the provided config data into a 
`BucketNotificationDestinationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BucketNotificationDestinationType` - the value is returned.
* is `:queue` - `BucketNotificationDestinationType/QUEUE` is returned
* is `:topic` - `BucketNotificationDestinationType/TOPIC` is returned
* is `:lambda` - `BucketNotificationDestinationType/LAMBDA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BucketNotificationDestinationType data) data
      (= :queue data) BucketNotificationDestinationType/QUEUE
      (= :topic data) BucketNotificationDestinationType/TOPIC
      (= :lambda data) BucketNotificationDestinationType/LAMBDA)))


(defn event-type
  "The `event-type` function data interprets values in the provided config data into a 
`EventType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EventType` - the value is returned.
* is `:object-tagging-put` - `EventType/OBJECT_TAGGING_PUT` is returned
* is `:lifecycle-expiration-delete` - `EventType/LIFECYCLE_EXPIRATION_DELETE` is returned
* is `:object-restore-delete` - `EventType/OBJECT_RESTORE_DELETE` is returned
* is `:object-created-copy` - `EventType/OBJECT_CREATED_COPY` is returned
* is `:replication-operation-not-tracked` - `EventType/REPLICATION_OPERATION_NOT_TRACKED` is returned
* is `:lifecycle-transition` - `EventType/LIFECYCLE_TRANSITION` is returned
* is `:object-acl-put` - `EventType/OBJECT_ACL_PUT` is returned
* is `:lifecycle-expiration` - `EventType/LIFECYCLE_EXPIRATION` is returned
* is `:object-tagging` - `EventType/OBJECT_TAGGING` is returned
* is `:object-restore-post` - `EventType/OBJECT_RESTORE_POST` is returned
* is `:object-removed-delete` - `EventType/OBJECT_REMOVED_DELETE` is returned
* is `:replication-operation-missed-threshold` - `EventType/REPLICATION_OPERATION_MISSED_THRESHOLD` is returned
* is `:lifecycle-expiration-delete-marker-created` - `EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED` is returned
* is `:object-restore-completed` - `EventType/OBJECT_RESTORE_COMPLETED` is returned
* is `:replication-operation-failed-replication` - `EventType/REPLICATION_OPERATION_FAILED_REPLICATION` is returned
* is `:object-removed` - `EventType/OBJECT_REMOVED` is returned
* is `:object-created-post` - `EventType/OBJECT_CREATED_POST` is returned
* is `:object-created` - `EventType/OBJECT_CREATED` is returned
* is `:object-created-complete-multipart-upload` - `EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD` is returned
* is `:object-removed-delete-marker-created` - `EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED` is returned
* is `:replication-operation-replicated-after-threshold` - `EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD` is returned
* is `:reduced-redundancy-lost-object` - `EventType/REDUCED_REDUNDANCY_LOST_OBJECT` is returned
* is `:intelligent-tiering` - `EventType/INTELLIGENT_TIERING` is returned
* is `:object-created-put` - `EventType/OBJECT_CREATED_PUT` is returned
* is `:object-tagging-delete` - `EventType/OBJECT_TAGGING_DELETE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EventType data) data
      (= :object-tagging-put data) EventType/OBJECT_TAGGING_PUT
      (= :lifecycle-expiration-delete data) EventType/LIFECYCLE_EXPIRATION_DELETE
      (= :object-restore-delete data) EventType/OBJECT_RESTORE_DELETE
      (= :object-created-copy data) EventType/OBJECT_CREATED_COPY
      (= :replication-operation-not-tracked data) EventType/REPLICATION_OPERATION_NOT_TRACKED
      (= :lifecycle-transition data) EventType/LIFECYCLE_TRANSITION
      (= :object-acl-put data) EventType/OBJECT_ACL_PUT
      (= :lifecycle-expiration data) EventType/LIFECYCLE_EXPIRATION
      (= :object-tagging data) EventType/OBJECT_TAGGING
      (= :object-restore-post data) EventType/OBJECT_RESTORE_POST
      (= :object-removed-delete data) EventType/OBJECT_REMOVED_DELETE
      (= :replication-operation-missed-threshold data) EventType/REPLICATION_OPERATION_MISSED_THRESHOLD
      (= :lifecycle-expiration-delete-marker-created data) EventType/LIFECYCLE_EXPIRATION_DELETE_MARKER_CREATED
      (= :object-restore-completed data) EventType/OBJECT_RESTORE_COMPLETED
      (= :replication-operation-failed-replication data) EventType/REPLICATION_OPERATION_FAILED_REPLICATION
      (= :object-removed data) EventType/OBJECT_REMOVED
      (= :object-created-post data) EventType/OBJECT_CREATED_POST
      (= :object-created data) EventType/OBJECT_CREATED
      (= :object-created-complete-multipart-upload data) EventType/OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD
      (= :object-removed-delete-marker-created data) EventType/OBJECT_REMOVED_DELETE_MARKER_CREATED
      (= :replication-operation-replicated-after-threshold data) EventType/REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD
      (= :reduced-redundancy-lost-object data) EventType/REDUCED_REDUNDANCY_LOST_OBJECT
      (= :intelligent-tiering data) EventType/INTELLIGENT_TIERING
      (= :object-created-put data) EventType/OBJECT_CREATED_PUT
      (= :object-tagging-delete data) EventType/OBJECT_TAGGING_DELETE)))


(defn http-methods
  "The `http-methods` function data interprets values in the provided config data into a 
`HttpMethods` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethods` - the value is returned.
* is `:get` - `HttpMethods/GET` is returned
* is `:put` - `HttpMethods/PUT` is returned
* is `:post` - `HttpMethods/POST` is returned
* is `:delete` - `HttpMethods/DELETE` is returned
* is `:head` - `HttpMethods/HEAD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethods data) data
      (= :get data) HttpMethods/GET
      (= :put data) HttpMethods/PUT
      (= :post data) HttpMethods/POST
      (= :delete data) HttpMethods/DELETE
      (= :head data) HttpMethods/HEAD)))


(defn inventory-format
  "The `inventory-format` function data interprets values in the provided config data into a 
`InventoryFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InventoryFormat` - the value is returned.
* is `:orc` - `InventoryFormat/ORC` is returned
* is `:parquet` - `InventoryFormat/PARQUET` is returned
* is `:csv` - `InventoryFormat/CSV` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InventoryFormat data) data
      (= :orc data) InventoryFormat/ORC
      (= :parquet data) InventoryFormat/PARQUET
      (= :csv data) InventoryFormat/CSV)))


(defn inventory-frequency
  "The `inventory-frequency` function data interprets values in the provided config data into a 
`InventoryFrequency` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InventoryFrequency` - the value is returned.
* is `:daily` - `InventoryFrequency/DAILY` is returned
* is `:weekly` - `InventoryFrequency/WEEKLY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InventoryFrequency data) data
      (= :daily data) InventoryFrequency/DAILY
      (= :weekly data) InventoryFrequency/WEEKLY)))


(defn inventory-object-version
  "The `inventory-object-version` function data interprets values in the provided config data into a 
`InventoryObjectVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InventoryObjectVersion` - the value is returned.
* is `:current` - `InventoryObjectVersion/CURRENT` is returned
* is `:all` - `InventoryObjectVersion/ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InventoryObjectVersion data) data
      (= :current data) InventoryObjectVersion/CURRENT
      (= :all data) InventoryObjectVersion/ALL)))


(defn object-lock-mode
  "The `object-lock-mode` function data interprets values in the provided config data into a 
`ObjectLockMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ObjectLockMode` - the value is returned.
* is `:governance` - `ObjectLockMode/GOVERNANCE` is returned
* is `:compliance` - `ObjectLockMode/COMPLIANCE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ObjectLockMode data) data
      (= :governance data) ObjectLockMode/GOVERNANCE
      (= :compliance data) ObjectLockMode/COMPLIANCE)))


(defn object-ownership
  "The `object-ownership` function data interprets values in the provided config data into a 
`ObjectOwnership` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ObjectOwnership` - the value is returned.
* is `:bucket-owner-enforced` - `ObjectOwnership/BUCKET_OWNER_ENFORCED` is returned
* is `:bucket-owner-preferred` - `ObjectOwnership/BUCKET_OWNER_PREFERRED` is returned
* is `:object-writer` - `ObjectOwnership/OBJECT_WRITER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ObjectOwnership data) data
      (= :bucket-owner-enforced data) ObjectOwnership/BUCKET_OWNER_ENFORCED
      (= :bucket-owner-preferred data) ObjectOwnership/BUCKET_OWNER_PREFERRED
      (= :object-writer data) ObjectOwnership/OBJECT_WRITER)))


(defn partition-date-source
  "The `partition-date-source` function data interprets values in the provided config data into a 
`PartitionDateSource` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PartitionDateSource` - the value is returned.
* is `:delivery-time` - `PartitionDateSource/DELIVERY_TIME` is returned
* is `:event-time` - `PartitionDateSource/EVENT_TIME` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PartitionDateSource data) data
      (= :delivery-time data) PartitionDateSource/DELIVERY_TIME
      (= :event-time data) PartitionDateSource/EVENT_TIME)))


(defn redirect-protocol
  "The `redirect-protocol` function data interprets values in the provided config data into a 
`RedirectProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RedirectProtocol` - the value is returned.
* is `:https` - `RedirectProtocol/HTTPS` is returned
* is `:http` - `RedirectProtocol/HTTP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RedirectProtocol data) data
      (= :https data) RedirectProtocol/HTTPS
      (= :http data) RedirectProtocol/HTTP)))


(defn build-block-public-access-builder
  "The build-block-public-access-builder function updates a BlockPublicAccess$Builder instance using the provided configuration.
  The function takes the BlockPublicAccess$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^BlockPublicAccess$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn build-block-public-access-options-builder
  "The build-block-public-access-options-builder function updates a BlockPublicAccessOptions$Builder instance using the provided configuration.
  The function takes the BlockPublicAccessOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^BlockPublicAccessOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn build-bucket-attributes-builder
  "The build-bucket-attributes-builder function updates a BucketAttributes$Builder instance using the provided configuration.
  The function takes the BucketAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bucketDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-domain-name` |
| `bucketDualStackDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-dual-stack-domain-name` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketRegionalDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-regional-domain-name` |
| `bucketWebsiteNewUrlFormat` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bucket-website-new-url-format` |
| `bucketWebsiteUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-website-url` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `isWebsite` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-website` |
| `notificationsHandlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:notifications-handler-role` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^BucketAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-let [data (lookup-entry config id :bucket-domain-name)]
    (. builder bucketDomainName data))
  (when-let [data (lookup-entry config id :bucket-dual-stack-domain-name)]
    (. builder bucketDualStackDomainName data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :bucket-regional-domain-name)]
    (. builder bucketRegionalDomainName data))
  (when-let [data (lookup-entry config id :bucket-website-new-url-format)]
    (. builder bucketWebsiteNewUrlFormat data))
  (when-let [data (lookup-entry config id :bucket-website-url)]
    (. builder bucketWebsiteUrl data))
  (when-let [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-let [data (lookup-entry config id :is-website)]
    (. builder isWebsite data))
  (when-let [data (lookup-entry config id :notifications-handler-role)]
    (. builder notificationsHandlerRole data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn build-bucket-builder
  "The build-bucket-builder function updates a Bucket$Builder instance using the provided configuration.
  The function takes the Bucket$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `autoDeleteObjects` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-delete-objects` |
| `blockPublicAccess` | software.amazon.awscdk.services.s3.BlockPublicAccess | [[cdk.support/lookup-entry]] | `:block-public-access` |
| `bucketKeyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bucket-key-enabled` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `cors` | java.util.List | [[cdk.support/lookup-entry]] | `:cors` |
| `encryption` | software.amazon.awscdk.services.s3.BucketEncryption | [[cdk.api.services.s3/bucket-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `eventBridgeEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:event-bridge-enabled` |
| `intelligentTieringConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:intelligent-tiering-configurations` |
| `inventories` | java.util.List | [[cdk.support/lookup-entry]] | `:inventories` |
| `lifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-rules` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `minimumTlsVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-tls-version` |
| `notificationsHandlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:notifications-handler-role` |
| `objectLockDefaultRetention` | software.amazon.awscdk.services.s3.ObjectLockRetention | [[cdk.support/lookup-entry]] | `:object-lock-default-retention` |
| `objectLockEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-lock-enabled` |
| `objectOwnership` | software.amazon.awscdk.services.s3.ObjectOwnership | [[cdk.api.services.s3/object-ownership]] | `:object-ownership` |
| `publicReadAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-read-access` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `serverAccessLogsBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:server-access-logs-bucket` |
| `serverAccessLogsPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-access-logs-prefix` |
| `targetObjectKeyFormat` | software.amazon.awscdk.services.s3.TargetObjectKeyFormat | [[cdk.support/lookup-entry]] | `:target-object-key-format` |
| `transferAcceleration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transfer-acceleration` |
| `versioned` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:versioned` |
| `websiteErrorDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-error-document` |
| `websiteIndexDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-index-document` |
| `websiteRedirect` | software.amazon.awscdk.services.s3.RedirectTarget | [[cdk.support/lookup-entry]] | `:website-redirect` |
| `websiteRoutingRules` | java.util.List | [[cdk.support/lookup-entry]] | `:website-routing-rules` |
"
  [^Bucket$Builder builder id config]
  (when-let [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :auto-delete-objects)]
    (. builder autoDeleteObjects data))
  (when-let [data (lookup-entry config id :block-public-access)]
    (. builder blockPublicAccess data))
  (when-let [data (lookup-entry config id :bucket-key-enabled)]
    (. builder bucketKeyEnabled data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (bucket-encryption config id :encryption)]
    (. builder encryption data))
  (when-let [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :event-bridge-enabled)]
    (. builder eventBridgeEnabled data))
  (when-let [data (lookup-entry config id :intelligent-tiering-configurations)]
    (. builder intelligentTieringConfigurations data))
  (when-let [data (lookup-entry config id :inventories)]
    (. builder inventories data))
  (when-let [data (lookup-entry config id :lifecycle-rules)]
    (. builder lifecycleRules data))
  (when-let [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-let [data (lookup-entry config id :minimum-tls-version)]
    (. builder minimumTlsVersion data))
  (when-let [data (lookup-entry config id :notifications-handler-role)]
    (. builder notificationsHandlerRole data))
  (when-let [data (lookup-entry config id :object-lock-default-retention)]
    (. builder objectLockDefaultRetention data))
  (when-let [data (lookup-entry config id :object-lock-enabled)]
    (. builder objectLockEnabled data))
  (when-let [data (object-ownership config id :object-ownership)]
    (. builder objectOwnership data))
  (when-let [data (lookup-entry config id :public-read-access)]
    (. builder publicReadAccess data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :server-access-logs-bucket)]
    (. builder serverAccessLogsBucket data))
  (when-let [data (lookup-entry config id :server-access-logs-prefix)]
    (. builder serverAccessLogsPrefix data))
  (when-let [data (lookup-entry config id :target-object-key-format)]
    (. builder targetObjectKeyFormat data))
  (when-let [data (lookup-entry config id :transfer-acceleration)]
    (. builder transferAcceleration data))
  (when-let [data (lookup-entry config id :versioned)]
    (. builder versioned data))
  (when-let [data (lookup-entry config id :website-error-document)]
    (. builder websiteErrorDocument data))
  (when-let [data (lookup-entry config id :website-index-document)]
    (. builder websiteIndexDocument data))
  (when-let [data (lookup-entry config id :website-redirect)]
    (. builder websiteRedirect data))
  (when-let [data (lookup-entry config id :website-routing-rules)]
    (. builder websiteRoutingRules data))
  (.build builder))


(defn build-bucket-metrics-builder
  "The build-bucket-metrics-builder function updates a BucketMetrics$Builder instance using the provided configuration.
  The function takes the BucketMetrics$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tagFilters` | java.util.Map | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^BucketMetrics$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn build-bucket-notification-destination-config-builder
  "The build-bucket-notification-destination-config-builder function updates a BucketNotificationDestinationConfig$Builder instance using the provided configuration.
  The function takes the BucketNotificationDestinationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `type` | software.amazon.awscdk.services.s3.BucketNotificationDestinationType | [[cdk.api.services.s3/bucket-notification-destination-type]] | `:type` |
"
  [^BucketNotificationDestinationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-let [data (bucket-notification-destination-type config id :type)]
    (. builder type data))
  (.build builder))


(defn build-bucket-policy-builder
  "The build-bucket-policy-builder function updates a BucketPolicy$Builder instance using the provided configuration.
  The function takes the BucketPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^BucketPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn build-bucket-policy-props-builder
  "The build-bucket-policy-props-builder function updates a BucketPolicyProps$Builder instance using the provided configuration.
  The function takes the BucketPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^BucketPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn build-bucket-props-builder
  "The build-bucket-props-builder function updates a BucketProps$Builder instance using the provided configuration.
  The function takes the BucketProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControl` | software.amazon.awscdk.services.s3.BucketAccessControl | [[cdk.api.services.s3/bucket-access-control]] | `:access-control` |
| `autoDeleteObjects` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-delete-objects` |
| `blockPublicAccess` | software.amazon.awscdk.services.s3.BlockPublicAccess | [[cdk.support/lookup-entry]] | `:block-public-access` |
| `bucketKeyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bucket-key-enabled` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `cors` | java.util.List | [[cdk.support/lookup-entry]] | `:cors` |
| `encryption` | software.amazon.awscdk.services.s3.BucketEncryption | [[cdk.api.services.s3/bucket-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `enforceSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-ssl` |
| `eventBridgeEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:event-bridge-enabled` |
| `intelligentTieringConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:intelligent-tiering-configurations` |
| `inventories` | java.util.List | [[cdk.support/lookup-entry]] | `:inventories` |
| `lifecycleRules` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-rules` |
| `metrics` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics` |
| `minimumTlsVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-tls-version` |
| `notificationsHandlerRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:notifications-handler-role` |
| `objectLockDefaultRetention` | software.amazon.awscdk.services.s3.ObjectLockRetention | [[cdk.support/lookup-entry]] | `:object-lock-default-retention` |
| `objectLockEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-lock-enabled` |
| `objectOwnership` | software.amazon.awscdk.services.s3.ObjectOwnership | [[cdk.api.services.s3/object-ownership]] | `:object-ownership` |
| `publicReadAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-read-access` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `serverAccessLogsBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:server-access-logs-bucket` |
| `serverAccessLogsPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-access-logs-prefix` |
| `targetObjectKeyFormat` | software.amazon.awscdk.services.s3.TargetObjectKeyFormat | [[cdk.support/lookup-entry]] | `:target-object-key-format` |
| `transferAcceleration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transfer-acceleration` |
| `versioned` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:versioned` |
| `websiteErrorDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-error-document` |
| `websiteIndexDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:website-index-document` |
| `websiteRedirect` | software.amazon.awscdk.services.s3.RedirectTarget | [[cdk.support/lookup-entry]] | `:website-redirect` |
| `websiteRoutingRules` | java.util.List | [[cdk.support/lookup-entry]] | `:website-routing-rules` |
"
  [^BucketProps$Builder builder id config]
  (when-let [data (bucket-access-control config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :auto-delete-objects)]
    (. builder autoDeleteObjects data))
  (when-let [data (lookup-entry config id :block-public-access)]
    (. builder blockPublicAccess data))
  (when-let [data (lookup-entry config id :bucket-key-enabled)]
    (. builder bucketKeyEnabled data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :cors)]
    (. builder cors data))
  (when-let [data (bucket-encryption config id :encryption)]
    (. builder encryption data))
  (when-let [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-let [data (lookup-entry config id :enforce-ssl)]
    (. builder enforceSsl data))
  (when-let [data (lookup-entry config id :event-bridge-enabled)]
    (. builder eventBridgeEnabled data))
  (when-let [data (lookup-entry config id :intelligent-tiering-configurations)]
    (. builder intelligentTieringConfigurations data))
  (when-let [data (lookup-entry config id :inventories)]
    (. builder inventories data))
  (when-let [data (lookup-entry config id :lifecycle-rules)]
    (. builder lifecycleRules data))
  (when-let [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-let [data (lookup-entry config id :minimum-tls-version)]
    (. builder minimumTlsVersion data))
  (when-let [data (lookup-entry config id :notifications-handler-role)]
    (. builder notificationsHandlerRole data))
  (when-let [data (lookup-entry config id :object-lock-default-retention)]
    (. builder objectLockDefaultRetention data))
  (when-let [data (lookup-entry config id :object-lock-enabled)]
    (. builder objectLockEnabled data))
  (when-let [data (object-ownership config id :object-ownership)]
    (. builder objectOwnership data))
  (when-let [data (lookup-entry config id :public-read-access)]
    (. builder publicReadAccess data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :server-access-logs-bucket)]
    (. builder serverAccessLogsBucket data))
  (when-let [data (lookup-entry config id :server-access-logs-prefix)]
    (. builder serverAccessLogsPrefix data))
  (when-let [data (lookup-entry config id :target-object-key-format)]
    (. builder targetObjectKeyFormat data))
  (when-let [data (lookup-entry config id :transfer-acceleration)]
    (. builder transferAcceleration data))
  (when-let [data (lookup-entry config id :versioned)]
    (. builder versioned data))
  (when-let [data (lookup-entry config id :website-error-document)]
    (. builder websiteErrorDocument data))
  (when-let [data (lookup-entry config id :website-index-document)]
    (. builder websiteIndexDocument data))
  (when-let [data (lookup-entry config id :website-redirect)]
    (. builder websiteRedirect data))
  (when-let [data (lookup-entry config id :website-routing-rules)]
    (. builder websiteRoutingRules data))
  (.build builder))


(defn build-cfn-access-grant-access-grants-location-configuration-property-builder
  "The build-cfn-access-grant-access-grants-location-configuration-property-builder function updates a CfnAccessGrant$AccessGrantsLocationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessGrant$AccessGrantsLocationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3SubPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-sub-prefix` |
"
  [^CfnAccessGrant$AccessGrantsLocationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-sub-prefix)]
    (. builder s3SubPrefix data))
  (.build builder))


(defn build-cfn-access-grant-builder
  "The build-cfn-access-grant-builder function updates a CfnAccessGrant$Builder instance using the provided configuration.
  The function takes the CfnAccessGrant$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessGrantsLocationConfiguration` | software.amazon.awscdk.services.s3.CfnAccessGrant$AccessGrantsLocationConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-grants-location-configuration` |
| `accessGrantsLocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-grants-location-id` |
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `grantee` | software.amazon.awscdk.services.s3.CfnAccessGrant$GranteeProperty | [[cdk.support/lookup-entry]] | `:grantee` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `s3PrefixType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrant$Builder builder id config]
  (when-let [data (lookup-entry config id :access-grants-location-configuration)]
    (. builder accessGrantsLocationConfiguration data))
  (when-let [data (lookup-entry config id :access-grants-location-id)]
    (. builder accessGrantsLocationId data))
  (when-let [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-let [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-let [data (lookup-entry config id :permission)]
    (. builder permission data))
  (when-let [data (lookup-entry config id :s3-prefix-type)]
    (. builder s3PrefixType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-grant-grantee-property-builder
  "The build-cfn-access-grant-grantee-property-builder function updates a CfnAccessGrant$GranteeProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessGrant$GranteeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `granteeIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:grantee-identifier` |
| `granteeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:grantee-type` |
"
  [^CfnAccessGrant$GranteeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grantee-identifier)]
    (. builder granteeIdentifier data))
  (when-let [data (lookup-entry config id :grantee-type)]
    (. builder granteeType data))
  (.build builder))


(defn build-cfn-access-grant-props-builder
  "The build-cfn-access-grant-props-builder function updates a CfnAccessGrantProps$Builder instance using the provided configuration.
  The function takes the CfnAccessGrantProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessGrantsLocationConfiguration` | software.amazon.awscdk.services.s3.CfnAccessGrant$AccessGrantsLocationConfigurationProperty | [[cdk.support/lookup-entry]] | `:access-grants-location-configuration` |
| `accessGrantsLocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-grants-location-id` |
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `grantee` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grantee` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `s3PrefixType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrantProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-grants-location-configuration)]
    (. builder accessGrantsLocationConfiguration data))
  (when-let [data (lookup-entry config id :access-grants-location-id)]
    (. builder accessGrantsLocationId data))
  (when-let [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-let [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-let [data (lookup-entry config id :permission)]
    (. builder permission data))
  (when-let [data (lookup-entry config id :s3-prefix-type)]
    (. builder s3PrefixType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-grants-instance-builder
  "The build-cfn-access-grants-instance-builder function updates a CfnAccessGrantsInstance$Builder instance using the provided configuration.
  The function takes the CfnAccessGrantsInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityCenterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrantsInstance$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-center-arn)]
    (. builder identityCenterArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-grants-instance-props-builder
  "The build-cfn-access-grants-instance-props-builder function updates a CfnAccessGrantsInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnAccessGrantsInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityCenterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-center-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrantsInstanceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :identity-center-arn)]
    (. builder identityCenterArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-grants-location-builder
  "The build-cfn-access-grants-location-builder function updates a CfnAccessGrantsLocation$Builder instance using the provided configuration.
  The function takes the CfnAccessGrantsLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `locationScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrantsLocation$Builder builder id config]
  (when-let [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-let [data (lookup-entry config id :location-scope)]
    (. builder locationScope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-grants-location-props-builder
  "The build-cfn-access-grants-location-props-builder function updates a CfnAccessGrantsLocationProps$Builder instance using the provided configuration.
  The function takes the CfnAccessGrantsLocationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `locationScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccessGrantsLocationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-let [data (lookup-entry config id :location-scope)]
    (. builder locationScope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-access-point-builder
  "The build-cfn-access-point-builder function updates a CfnAccessPoint$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-account-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `vpcConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-account-id)]
    (. builder bucketAccountId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn build-cfn-access-point-props-builder
  "The build-cfn-access-point-props-builder function updates a CfnAccessPointProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-account-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `vpcConfiguration` | software.amazon.awscdk.services.s3.CfnAccessPoint$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnAccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-account-id)]
    (. builder bucketAccountId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn build-cfn-access-point-public-access-block-configuration-property-builder
  "The build-cfn-access-point-public-access-block-configuration-property-builder function updates a CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^CfnAccessPoint$PublicAccessBlockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn build-cfn-access-point-vpc-configuration-property-builder
  "The build-cfn-access-point-vpc-configuration-property-builder function updates a CfnAccessPoint$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPoint$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnAccessPoint$VpcConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-bucket-abort-incomplete-multipart-upload-property-builder
  "The build-cfn-bucket-abort-incomplete-multipart-upload-property-builder function updates a CfnBucket$AbortIncompleteMultipartUploadProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AbortIncompleteMultipartUploadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysAfterInitiation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-after-initiation` |
"
  [^CfnBucket$AbortIncompleteMultipartUploadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days-after-initiation)]
    (. builder daysAfterInitiation data))
  (.build builder))


(defn build-cfn-bucket-accelerate-configuration-property-builder
  "The build-cfn-bucket-accelerate-configuration-property-builder function updates a CfnBucket$AccelerateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AccelerateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:acceleration-status` |
"
  [^CfnBucket$AccelerateConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :acceleration-status)]
    (. builder accelerationStatus data))
  (.build builder))


(defn build-cfn-bucket-access-control-translation-property-builder
  "The build-cfn-bucket-access-control-translation-property-builder function updates a CfnBucket$AccessControlTranslationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AccessControlTranslationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
"
  [^CfnBucket$AccessControlTranslationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (.build builder))


(defn build-cfn-bucket-analytics-configuration-property-builder
  "The build-cfn-bucket-analytics-configuration-property-builder function updates a CfnBucket$AnalyticsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AnalyticsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `storageClassAnalysis` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-class-analysis` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^CfnBucket$AnalyticsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :storage-class-analysis)]
    (. builder storageClassAnalysis data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn build-cfn-bucket-bucket-encryption-property-builder
  "The build-cfn-bucket-bucket-encryption-property-builder function updates a CfnBucket$BucketEncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$BucketEncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverSideEncryptionConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
"
  [^CfnBucket$BucketEncryptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (.build builder))


(defn build-cfn-bucket-builder
  "The build-cfn-bucket-builder function updates a CfnBucket$Builder instance using the provided configuration.
  The function takes the CfnBucket$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerateConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$AccelerateConfigurationProperty | [[cdk.support/lookup-entry]] | `:accelerate-configuration` |
| `accessControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-control` |
| `analyticsConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:analytics-configurations` |
| `bucketEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bucket-encryption` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `corsConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$CorsConfigurationProperty | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `intelligentTieringConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:intelligent-tiering-configurations` |
| `inventoryConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inventory-configurations` |
| `lifecycleConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `loggingConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `metricsConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:metrics-configurations` |
| `notificationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `objectLockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:object-lock-configuration` |
| `objectLockEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-lock-enabled` |
| `ownershipControls` | software.amazon.awscdk.services.s3.CfnBucket$OwnershipControlsProperty | [[cdk.support/lookup-entry]] | `:ownership-controls` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `replicationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versioningConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$VersioningConfigurationProperty | [[cdk.support/lookup-entry]] | `:versioning-configuration` |
| `websiteConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:website-configuration` |
"
  [^CfnBucket$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerate-configuration)]
    (. builder accelerateConfiguration data))
  (when-let [data (lookup-entry config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :analytics-configurations)]
    (. builder analyticsConfigurations data))
  (when-let [data (lookup-entry config id :bucket-encryption)]
    (. builder bucketEncryption data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :intelligent-tiering-configurations)]
    (. builder intelligentTieringConfigurations data))
  (when-let [data (lookup-entry config id :inventory-configurations)]
    (. builder inventoryConfigurations data))
  (when-let [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-let [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-let [data (lookup-entry config id :metrics-configurations)]
    (. builder metricsConfigurations data))
  (when-let [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-let [data (lookup-entry config id :object-lock-configuration)]
    (. builder objectLockConfiguration data))
  (when-let [data (lookup-entry config id :object-lock-enabled)]
    (. builder objectLockEnabled data))
  (when-let [data (lookup-entry config id :ownership-controls)]
    (. builder ownershipControls data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :versioning-configuration)]
    (. builder versioningConfiguration data))
  (when-let [data (lookup-entry config id :website-configuration)]
    (. builder websiteConfiguration data))
  (.build builder))


(defn build-cfn-bucket-cors-configuration-property-builder
  "The build-cfn-bucket-cors-configuration-property-builder function updates a CfnBucket$CorsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$CorsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `corsRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors-rules` |
"
  [^CfnBucket$CorsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cors-rules)]
    (. builder corsRules data))
  (.build builder))


(defn build-cfn-bucket-cors-rule-property-builder
  "The build-cfn-bucket-cors-rule-property-builder function updates a CfnBucket$CorsRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$CorsRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-headers` |
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `exposedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:exposed-headers` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CfnBucket$CorsRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-headers)]
    (. builder allowedHeaders data))
  (when-let [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-let [data (lookup-entry config id :allowed-origins)]
    (. builder allowedOrigins data))
  (when-let [data (lookup-entry config id :exposed-headers)]
    (. builder exposedHeaders data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn build-cfn-bucket-data-export-property-builder
  "The build-cfn-bucket-data-export-property-builder function updates a CfnBucket$DataExportProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$DataExportProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `outputSchemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-schema-version` |
"
  [^CfnBucket$DataExportProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :output-schema-version)]
    (. builder outputSchemaVersion data))
  (.build builder))


(defn build-cfn-bucket-default-retention-property-builder
  "The build-cfn-bucket-default-retention-property-builder function updates a CfnBucket$DefaultRetentionProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$DefaultRetentionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `years` | java.lang.Number | [[cdk.support/lookup-entry]] | `:years` |
"
  [^CfnBucket$DefaultRetentionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days)]
    (. builder days data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :years)]
    (. builder years data))
  (.build builder))


(defn build-cfn-bucket-delete-marker-replication-property-builder
  "The build-cfn-bucket-delete-marker-replication-property-builder function updates a CfnBucket$DeleteMarkerReplicationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$DeleteMarkerReplicationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$DeleteMarkerReplicationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-destination-property-builder
  "The build-cfn-bucket-destination-property-builder function updates a CfnBucket$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-account-id` |
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnBucket$DestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-account-id)]
    (. builder bucketAccountId data))
  (when-let [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn build-cfn-bucket-encryption-configuration-property-builder
  "The build-cfn-bucket-encryption-configuration-property-builder function updates a CfnBucket$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicaKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:replica-kms-key-id` |
"
  [^CfnBucket$EncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :replica-kms-key-id)]
    (. builder replicaKmsKeyId data))
  (.build builder))


(defn build-cfn-bucket-event-bridge-configuration-property-builder
  "The build-cfn-bucket-event-bridge-configuration-property-builder function updates a CfnBucket$EventBridgeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$EventBridgeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBridgeEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:event-bridge-enabled` |
"
  [^CfnBucket$EventBridgeConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bridge-enabled)]
    (. builder eventBridgeEnabled data))
  (.build builder))


(defn build-cfn-bucket-filter-rule-property-builder
  "The build-cfn-bucket-filter-rule-property-builder function updates a CfnBucket$FilterRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$FilterRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBucket$FilterRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-bucket-intelligent-tiering-configuration-property-builder
  "The build-cfn-bucket-intelligent-tiering-configuration-property-builder function updates a CfnBucket$IntelligentTieringConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$IntelligentTieringConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tagFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-filters` |
| `tierings` | java.util.List | [[cdk.support/lookup-entry]] | `:tierings` |
"
  [^CfnBucket$IntelligentTieringConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (when-let [data (lookup-entry config id :tierings)]
    (. builder tierings data))
  (.build builder))


(defn build-cfn-bucket-inventory-configuration-property-builder
  "The build-cfn-bucket-inventory-configuration-property-builder function updates a CfnBucket$InventoryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$InventoryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `includedObjectVersions` | java.lang.String | [[cdk.support/lookup-entry]] | `:included-object-versions` |
| `optionalFields` | java.util.List | [[cdk.support/lookup-entry]] | `:optional-fields` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `scheduleFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-frequency` |
"
  [^CfnBucket$InventoryConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :included-object-versions)]
    (. builder includedObjectVersions data))
  (when-let [data (lookup-entry config id :optional-fields)]
    (. builder optionalFields data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :schedule-frequency)]
    (. builder scheduleFrequency data))
  (.build builder))


(defn build-cfn-bucket-lambda-configuration-property-builder
  "The build-cfn-bucket-lambda-configuration-property-builder function updates a CfnBucket$LambdaConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$LambdaConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `filter` | software.amazon.awscdk.services.s3.CfnBucket$NotificationFilterProperty | [[cdk.support/lookup-entry]] | `:filter` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
"
  [^CfnBucket$LambdaConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (.build builder))


(defn build-cfn-bucket-lifecycle-configuration-property-builder
  "The build-cfn-bucket-lifecycle-configuration-property-builder function updates a CfnBucket$LifecycleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$LifecycleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnBucket$LifecycleConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-bucket-logging-configuration-property-builder
  "The build-cfn-bucket-logging-configuration-property-builder function updates a CfnBucket$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationBucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-bucket-name` |
| `logFilePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-file-prefix` |
| `targetObjectKeyFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-object-key-format` |
"
  [^CfnBucket$LoggingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-bucket-name)]
    (. builder destinationBucketName data))
  (when-let [data (lookup-entry config id :log-file-prefix)]
    (. builder logFilePrefix data))
  (when-let [data (lookup-entry config id :target-object-key-format)]
    (. builder targetObjectKeyFormat data))
  (.build builder))


(defn build-cfn-bucket-metrics-configuration-property-builder
  "The build-cfn-bucket-metrics-configuration-property-builder function updates a CfnBucket$MetricsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$MetricsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^CfnBucket$MetricsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-point-arn)]
    (. builder accessPointArn data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn build-cfn-bucket-metrics-property-builder
  "The build-cfn-bucket-metrics-property-builder function updates a CfnBucket$MetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$MetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventThreshold` | software.amazon.awscdk.services.s3.CfnBucket$ReplicationTimeValueProperty | [[cdk.support/lookup-entry]] | `:event-threshold` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$MetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-threshold)]
    (. builder eventThreshold data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-noncurrent-version-expiration-property-builder
  "The build-cfn-bucket-noncurrent-version-expiration-property-builder function updates a CfnBucket$NoncurrentVersionExpirationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$NoncurrentVersionExpirationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `newerNoncurrentVersions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:newer-noncurrent-versions` |
| `noncurrentDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:noncurrent-days` |
"
  [^CfnBucket$NoncurrentVersionExpirationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :newer-noncurrent-versions)]
    (. builder newerNoncurrentVersions data))
  (when-let [data (lookup-entry config id :noncurrent-days)]
    (. builder noncurrentDays data))
  (.build builder))


(defn build-cfn-bucket-noncurrent-version-transition-property-builder
  "The build-cfn-bucket-noncurrent-version-transition-property-builder function updates a CfnBucket$NoncurrentVersionTransitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$NoncurrentVersionTransitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `newerNoncurrentVersions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:newer-noncurrent-versions` |
| `storageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-class` |
| `transitionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transition-in-days` |
"
  [^CfnBucket$NoncurrentVersionTransitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :newer-noncurrent-versions)]
    (. builder newerNoncurrentVersions data))
  (when-let [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :transition-in-days)]
    (. builder transitionInDays data))
  (.build builder))


(defn build-cfn-bucket-notification-configuration-property-builder
  "The build-cfn-bucket-notification-configuration-property-builder function updates a CfnBucket$NotificationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$NotificationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBridgeConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$EventBridgeConfigurationProperty | [[cdk.support/lookup-entry]] | `:event-bridge-configuration` |
| `lambdaConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:lambda-configurations` |
| `queueConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-configurations` |
| `topicConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:topic-configurations` |
"
  [^CfnBucket$NotificationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bridge-configuration)]
    (. builder eventBridgeConfiguration data))
  (when-let [data (lookup-entry config id :lambda-configurations)]
    (. builder lambdaConfigurations data))
  (when-let [data (lookup-entry config id :queue-configurations)]
    (. builder queueConfigurations data))
  (when-let [data (lookup-entry config id :topic-configurations)]
    (. builder topicConfigurations data))
  (.build builder))


(defn build-cfn-bucket-notification-filter-property-builder
  "The build-cfn-bucket-notification-filter-property-builder function updates a CfnBucket$NotificationFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$NotificationFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Key` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnBucket$NotificationFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn build-cfn-bucket-object-lock-configuration-property-builder
  "The build-cfn-bucket-object-lock-configuration-property-builder function updates a CfnBucket$ObjectLockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ObjectLockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectLockEnabled` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-lock-enabled` |
| `rule` | software.amazon.awscdk.services.s3.CfnBucket$ObjectLockRuleProperty | [[cdk.support/lookup-entry]] | `:rule` |
"
  [^CfnBucket$ObjectLockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :object-lock-enabled)]
    (. builder objectLockEnabled data))
  (when-let [data (lookup-entry config id :rule)]
    (. builder rule data))
  (.build builder))


(defn build-cfn-bucket-object-lock-rule-property-builder
  "The build-cfn-bucket-object-lock-rule-property-builder function updates a CfnBucket$ObjectLockRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ObjectLockRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultRetention` | software.amazon.awscdk.services.s3.CfnBucket$DefaultRetentionProperty | [[cdk.support/lookup-entry]] | `:default-retention` |
"
  [^CfnBucket$ObjectLockRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-retention)]
    (. builder defaultRetention data))
  (.build builder))


(defn build-cfn-bucket-ownership-controls-property-builder
  "The build-cfn-bucket-ownership-controls-property-builder function updates a CfnBucket$OwnershipControlsProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$OwnershipControlsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnBucket$OwnershipControlsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-bucket-ownership-controls-rule-property-builder
  "The build-cfn-bucket-ownership-controls-rule-property-builder function updates a CfnBucket$OwnershipControlsRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$OwnershipControlsRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectOwnership` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-ownership` |
"
  [^CfnBucket$OwnershipControlsRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :object-ownership)]
    (. builder objectOwnership data))
  (.build builder))


(defn build-cfn-bucket-partitioned-prefix-property-builder
  "The build-cfn-bucket-partitioned-prefix-property-builder function updates a CfnBucket$PartitionedPrefixProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$PartitionedPrefixProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionDateSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-date-source` |
"
  [^CfnBucket$PartitionedPrefixProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :partition-date-source)]
    (. builder partitionDateSource data))
  (.build builder))


(defn build-cfn-bucket-policy-builder
  "The build-cfn-bucket-policy-builder function updates a CfnBucketPolicy$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn build-cfn-bucket-policy-props-builder
  "The build-cfn-bucket-policy-props-builder function updates a CfnBucketPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnBucketPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
"
  [^CfnBucketPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (.build builder))


(defn build-cfn-bucket-props-builder
  "The build-cfn-bucket-props-builder function updates a CfnBucketProps$Builder instance using the provided configuration.
  The function takes the CfnBucketProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accelerateConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$AccelerateConfigurationProperty | [[cdk.support/lookup-entry]] | `:accelerate-configuration` |
| `accessControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-control` |
| `analyticsConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analytics-configurations` |
| `bucketEncryption` | software.amazon.awscdk.services.s3.CfnBucket$BucketEncryptionProperty | [[cdk.support/lookup-entry]] | `:bucket-encryption` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `corsConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$CorsConfigurationProperty | [[cdk.support/lookup-entry]] | `:cors-configuration` |
| `intelligentTieringConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:intelligent-tiering-configurations` |
| `inventoryConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:inventory-configurations` |
| `lifecycleConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$LifecycleConfigurationProperty | [[cdk.support/lookup-entry]] | `:lifecycle-configuration` |
| `loggingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-configuration` |
| `metricsConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metrics-configurations` |
| `notificationConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `objectLockConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$ObjectLockConfigurationProperty | [[cdk.support/lookup-entry]] | `:object-lock-configuration` |
| `objectLockEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-lock-enabled` |
| `ownershipControls` | software.amazon.awscdk.services.s3.CfnBucket$OwnershipControlsProperty | [[cdk.support/lookup-entry]] | `:ownership-controls` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `replicationConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$ReplicationConfigurationProperty | [[cdk.support/lookup-entry]] | `:replication-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versioningConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$VersioningConfigurationProperty | [[cdk.support/lookup-entry]] | `:versioning-configuration` |
| `websiteConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$WebsiteConfigurationProperty | [[cdk.support/lookup-entry]] | `:website-configuration` |
"
  [^CfnBucketProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerate-configuration)]
    (. builder accelerateConfiguration data))
  (when-let [data (lookup-entry config id :access-control)]
    (. builder accessControl data))
  (when-let [data (lookup-entry config id :analytics-configurations)]
    (. builder analyticsConfigurations data))
  (when-let [data (lookup-entry config id :bucket-encryption)]
    (. builder bucketEncryption data))
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :cors-configuration)]
    (. builder corsConfiguration data))
  (when-let [data (lookup-entry config id :intelligent-tiering-configurations)]
    (. builder intelligentTieringConfigurations data))
  (when-let [data (lookup-entry config id :inventory-configurations)]
    (. builder inventoryConfigurations data))
  (when-let [data (lookup-entry config id :lifecycle-configuration)]
    (. builder lifecycleConfiguration data))
  (when-let [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (when-let [data (lookup-entry config id :metrics-configurations)]
    (. builder metricsConfigurations data))
  (when-let [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-let [data (lookup-entry config id :object-lock-configuration)]
    (. builder objectLockConfiguration data))
  (when-let [data (lookup-entry config id :object-lock-enabled)]
    (. builder objectLockEnabled data))
  (when-let [data (lookup-entry config id :ownership-controls)]
    (. builder ownershipControls data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :replication-configuration)]
    (. builder replicationConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :versioning-configuration)]
    (. builder versioningConfiguration data))
  (when-let [data (lookup-entry config id :website-configuration)]
    (. builder websiteConfiguration data))
  (.build builder))


(defn build-cfn-bucket-public-access-block-configuration-property-builder
  "The build-cfn-bucket-public-access-block-configuration-property-builder function updates a CfnBucket$PublicAccessBlockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$PublicAccessBlockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^CfnBucket$PublicAccessBlockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn build-cfn-bucket-queue-configuration-property-builder
  "The build-cfn-bucket-queue-configuration-property-builder function updates a CfnBucket$QueueConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$QueueConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `queue` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue` |
"
  [^CfnBucket$QueueConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :queue)]
    (. builder queue data))
  (.build builder))


(defn build-cfn-bucket-redirect-all-requests-to-property-builder
  "The build-cfn-bucket-redirect-all-requests-to-property-builder function updates a CfnBucket$RedirectAllRequestsToProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RedirectAllRequestsToProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnBucket$RedirectAllRequestsToProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn build-cfn-bucket-redirect-rule-property-builder
  "The build-cfn-bucket-redirect-rule-property-builder function updates a CfnBucket$RedirectRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RedirectRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `httpRedirectCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-redirect-code` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `replaceKeyPrefixWith` | java.lang.String | [[cdk.support/lookup-entry]] | `:replace-key-prefix-with` |
| `replaceKeyWith` | java.lang.String | [[cdk.support/lookup-entry]] | `:replace-key-with` |
"
  [^CfnBucket$RedirectRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (lookup-entry config id :http-redirect-code)]
    (. builder httpRedirectCode data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :replace-key-prefix-with)]
    (. builder replaceKeyPrefixWith data))
  (when-let [data (lookup-entry config id :replace-key-with)]
    (. builder replaceKeyWith data))
  (.build builder))


(defn build-cfn-bucket-replica-modifications-property-builder
  "The build-cfn-bucket-replica-modifications-property-builder function updates a CfnBucket$ReplicaModificationsProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicaModificationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$ReplicaModificationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-replication-configuration-property-builder
  "The build-cfn-bucket-replication-configuration-property-builder function updates a CfnBucket$ReplicationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnBucket$ReplicationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-bucket-replication-destination-property-builder
  "The build-cfn-bucket-replication-destination-property-builder function updates a CfnBucket$ReplicationDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlTranslation` | software.amazon.awscdk.services.s3.CfnBucket$AccessControlTranslationProperty | [[cdk.support/lookup-entry]] | `:access-control-translation` |
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `encryptionConfiguration` | software.amazon.awscdk.services.s3.CfnBucket$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `metrics` | software.amazon.awscdk.services.s3.CfnBucket$MetricsProperty | [[cdk.support/lookup-entry]] | `:metrics` |
| `replicationTime` | software.amazon.awscdk.services.s3.CfnBucket$ReplicationTimeProperty | [[cdk.support/lookup-entry]] | `:replication-time` |
| `storageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-class` |
"
  [^CfnBucket$ReplicationDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-control-translation)]
    (. builder accessControlTranslation data))
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-let [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (when-let [data (lookup-entry config id :replication-time)]
    (. builder replicationTime data))
  (when-let [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (.build builder))


(defn build-cfn-bucket-replication-rule-and-operator-property-builder
  "The build-cfn-bucket-replication-rule-and-operator-property-builder function updates a CfnBucket$ReplicationRuleAndOperatorProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationRuleAndOperatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tagFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-filters` |
"
  [^CfnBucket$ReplicationRuleAndOperatorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (.build builder))


(defn build-cfn-bucket-replication-rule-filter-property-builder
  "The build-cfn-bucket-replication-rule-filter-property-builder function updates a CfnBucket$ReplicationRuleFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationRuleFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `and` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tagFilter` | software.amazon.awscdk.services.s3.CfnBucket$TagFilterProperty | [[cdk.support/lookup-entry]] | `:tag-filter` |
"
  [^CfnBucket$ReplicationRuleFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and)]
    (. builder and data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag-filter)]
    (. builder tagFilter data))
  (.build builder))


(defn build-cfn-bucket-replication-rule-property-builder
  "The build-cfn-bucket-replication-rule-property-builder function updates a CfnBucket$ReplicationRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteMarkerReplication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-marker-replication` |
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `sourceSelectionCriteria` | software.amazon.awscdk.services.s3.CfnBucket$SourceSelectionCriteriaProperty | [[cdk.support/lookup-entry]] | `:source-selection-criteria` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$ReplicationRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delete-marker-replication)]
    (. builder deleteMarkerReplication data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :source-selection-criteria)]
    (. builder sourceSelectionCriteria data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-replication-time-property-builder
  "The build-cfn-bucket-replication-time-property-builder function updates a CfnBucket$ReplicationTimeProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationTimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `time` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time` |
"
  [^CfnBucket$ReplicationTimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :time)]
    (. builder time data))
  (.build builder))


(defn build-cfn-bucket-replication-time-value-property-builder
  "The build-cfn-bucket-replication-time-value-property-builder function updates a CfnBucket$ReplicationTimeValueProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ReplicationTimeValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minutes` |
"
  [^CfnBucket$ReplicationTimeValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :minutes)]
    (. builder minutes data))
  (.build builder))


(defn build-cfn-bucket-routing-rule-condition-property-builder
  "The build-cfn-bucket-routing-rule-condition-property-builder function updates a CfnBucket$RoutingRuleConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RoutingRuleConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpErrorCodeReturnedEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-error-code-returned-equals` |
| `keyPrefixEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix-equals` |
"
  [^CfnBucket$RoutingRuleConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :http-error-code-returned-equals)]
    (. builder httpErrorCodeReturnedEquals data))
  (when-let [data (lookup-entry config id :key-prefix-equals)]
    (. builder keyPrefixEquals data))
  (.build builder))


(defn build-cfn-bucket-routing-rule-property-builder
  "The build-cfn-bucket-routing-rule-property-builder function updates a CfnBucket$RoutingRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RoutingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `redirectRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redirect-rule` |
| `routingRuleCondition` | software.amazon.awscdk.services.s3.CfnBucket$RoutingRuleConditionProperty | [[cdk.support/lookup-entry]] | `:routing-rule-condition` |
"
  [^CfnBucket$RoutingRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :redirect-rule)]
    (. builder redirectRule data))
  (when-let [data (lookup-entry config id :routing-rule-condition)]
    (. builder routingRuleCondition data))
  (.build builder))


(defn build-cfn-bucket-rule-property-builder
  "The build-cfn-bucket-rule-property-builder function updates a CfnBucket$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortIncompleteMultipartUpload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abort-incomplete-multipart-upload` |
| `expirationDate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:expiration-date` |
| `expirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expiration-in-days` |
| `expiredObjectDeleteMarker` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:expired-object-delete-marker` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `noncurrentVersionExpiration` | software.amazon.awscdk.services.s3.CfnBucket$NoncurrentVersionExpirationProperty | [[cdk.support/lookup-entry]] | `:noncurrent-version-expiration` |
| `noncurrentVersionExpirationInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:noncurrent-version-expiration-in-days` |
| `noncurrentVersionTransition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:noncurrent-version-transition` |
| `noncurrentVersionTransitions` | java.util.List | [[cdk.support/lookup-entry]] | `:noncurrent-version-transitions` |
| `objectSizeGreaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-size-greater-than` |
| `objectSizeLessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-size-less-than` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tagFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-filters` |
| `transition` | software.amazon.awscdk.services.s3.CfnBucket$TransitionProperty | [[cdk.support/lookup-entry]] | `:transition` |
| `transitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transitions` |
"
  [^CfnBucket$RuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :abort-incomplete-multipart-upload)]
    (. builder abortIncompleteMultipartUpload data))
  (when-let [data (lookup-entry config id :expiration-date)]
    (. builder expirationDate data))
  (when-let [data (lookup-entry config id :expiration-in-days)]
    (. builder expirationInDays data))
  (when-let [data (lookup-entry config id :expired-object-delete-marker)]
    (. builder expiredObjectDeleteMarker data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :noncurrent-version-expiration)]
    (. builder noncurrentVersionExpiration data))
  (when-let [data (lookup-entry config id :noncurrent-version-expiration-in-days)]
    (. builder noncurrentVersionExpirationInDays data))
  (when-let [data (lookup-entry config id :noncurrent-version-transition)]
    (. builder noncurrentVersionTransition data))
  (when-let [data (lookup-entry config id :noncurrent-version-transitions)]
    (. builder noncurrentVersionTransitions data))
  (when-let [data (lookup-entry config id :object-size-greater-than)]
    (. builder objectSizeGreaterThan data))
  (when-let [data (lookup-entry config id :object-size-less-than)]
    (. builder objectSizeLessThan data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (when-let [data (lookup-entry config id :transition)]
    (. builder transition data))
  (when-let [data (lookup-entry config id :transitions)]
    (. builder transitions data))
  (.build builder))


(defn build-cfn-bucket-s3-key-filter-property-builder
  "The build-cfn-bucket-s3-key-filter-property-builder function updates a CfnBucket$S3KeyFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$S3KeyFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnBucket$S3KeyFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-bucket-server-side-encryption-by-default-property-builder
  "The build-cfn-bucket-server-side-encryption-by-default-property-builder function updates a CfnBucket$ServerSideEncryptionByDefaultProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ServerSideEncryptionByDefaultProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `sseAlgorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-algorithm` |
"
  [^CfnBucket$ServerSideEncryptionByDefaultProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-master-key-id)]
    (. builder kmsMasterKeyId data))
  (when-let [data (lookup-entry config id :sse-algorithm)]
    (. builder sseAlgorithm data))
  (.build builder))


(defn build-cfn-bucket-server-side-encryption-rule-property-builder
  "The build-cfn-bucket-server-side-encryption-rule-property-builder function updates a CfnBucket$ServerSideEncryptionRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$ServerSideEncryptionRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketKeyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bucket-key-enabled` |
| `serverSideEncryptionByDefault` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-by-default` |
"
  [^CfnBucket$ServerSideEncryptionRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-key-enabled)]
    (. builder bucketKeyEnabled data))
  (when-let [data (lookup-entry config id :server-side-encryption-by-default)]
    (. builder serverSideEncryptionByDefault data))
  (.build builder))


(defn build-cfn-bucket-source-selection-criteria-property-builder
  "The build-cfn-bucket-source-selection-criteria-property-builder function updates a CfnBucket$SourceSelectionCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$SourceSelectionCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replicaModifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replica-modifications` |
| `sseKmsEncryptedObjects` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-kms-encrypted-objects` |
"
  [^CfnBucket$SourceSelectionCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :replica-modifications)]
    (. builder replicaModifications data))
  (when-let [data (lookup-entry config id :sse-kms-encrypted-objects)]
    (. builder sseKmsEncryptedObjects data))
  (.build builder))


(defn build-cfn-bucket-sse-kms-encrypted-objects-property-builder
  "The build-cfn-bucket-sse-kms-encrypted-objects-property-builder function updates a CfnBucket$SseKmsEncryptedObjectsProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$SseKmsEncryptedObjectsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$SseKmsEncryptedObjectsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-storage-class-analysis-property-builder
  "The build-cfn-bucket-storage-class-analysis-property-builder function updates a CfnBucket$StorageClassAnalysisProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$StorageClassAnalysisProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataExport` | software.amazon.awscdk.services.s3.CfnBucket$DataExportProperty | [[cdk.support/lookup-entry]] | `:data-export` |
"
  [^CfnBucket$StorageClassAnalysisProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-export)]
    (. builder dataExport data))
  (.build builder))


(defn build-cfn-bucket-tag-filter-property-builder
  "The build-cfn-bucket-tag-filter-property-builder function updates a CfnBucket$TagFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$TagFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBucket$TagFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-bucket-target-object-key-format-property-builder
  "The build-cfn-bucket-target-object-key-format-property-builder function updates a CfnBucket$TargetObjectKeyFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$TargetObjectKeyFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionedPrefix` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:partitioned-prefix` |
| `simplePrefix` | java.lang.Object | [[cdk.support/lookup-entry]] | `:simple-prefix` |
"
  [^CfnBucket$TargetObjectKeyFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :partitioned-prefix)]
    (. builder partitionedPrefix data))
  (when-let [data (lookup-entry config id :simple-prefix)]
    (. builder simplePrefix data))
  (.build builder))


(defn build-cfn-bucket-tiering-property-builder
  "The build-cfn-bucket-tiering-property-builder function updates a CfnBucket$TieringProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$TieringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessTier` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-tier` |
| `days` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days` |
"
  [^CfnBucket$TieringProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-tier)]
    (. builder accessTier data))
  (when-let [data (lookup-entry config id :days)]
    (. builder days data))
  (.build builder))


(defn build-cfn-bucket-topic-configuration-property-builder
  "The build-cfn-bucket-topic-configuration-property-builder function updates a CfnBucket$TopicConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$TopicConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^CfnBucket$TopicConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn build-cfn-bucket-transition-property-builder
  "The build-cfn-bucket-transition-property-builder function updates a CfnBucket$TransitionProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$TransitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-class` |
| `transitionDate` | java.time.Instant | [[cdk.support/lookup-entry]] | `:transition-date` |
| `transitionInDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:transition-in-days` |
"
  [^CfnBucket$TransitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :transition-date)]
    (. builder transitionDate data))
  (when-let [data (lookup-entry config id :transition-in-days)]
    (. builder transitionInDays data))
  (.build builder))


(defn build-cfn-bucket-versioning-configuration-property-builder
  "The build-cfn-bucket-versioning-configuration-property-builder function updates a CfnBucket$VersioningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$VersioningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnBucket$VersioningConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-bucket-website-configuration-property-builder
  "The build-cfn-bucket-website-configuration-property-builder function updates a CfnBucket$WebsiteConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$WebsiteConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-document` |
| `indexDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-document` |
| `redirectAllRequestsTo` | software.amazon.awscdk.services.s3.CfnBucket$RedirectAllRequestsToProperty | [[cdk.support/lookup-entry]] | `:redirect-all-requests-to` |
| `routingRules` | java.util.List | [[cdk.support/lookup-entry]] | `:routing-rules` |
"
  [^CfnBucket$WebsiteConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error-document)]
    (. builder errorDocument data))
  (when-let [data (lookup-entry config id :index-document)]
    (. builder indexDocument data))
  (when-let [data (lookup-entry config id :redirect-all-requests-to)]
    (. builder redirectAllRequestsTo data))
  (when-let [data (lookup-entry config id :routing-rules)]
    (. builder routingRules data))
  (.build builder))


(defn build-cfn-multi-region-access-point-builder
  "The build-cfn-multi-region-access-point-builder function updates a CfnMultiRegionAccessPoint$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `regions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^CfnMultiRegionAccessPoint$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn build-cfn-multi-region-access-point-policy-builder
  "The build-cfn-multi-region-access-point-policy-builder function updates a CfnMultiRegionAccessPointPolicy$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPointPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mrapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mrap-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnMultiRegionAccessPointPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :mrap-name)]
    (. builder mrapName data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn build-cfn-multi-region-access-point-policy-policy-status-property-builder
  "The build-cfn-multi-region-access-point-policy-policy-status-property-builder function updates a CfnMultiRegionAccessPointPolicy$PolicyStatusProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPointPolicy$PolicyStatusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPublic` | java.lang.String | [[cdk.support/lookup-entry]] | `:is-public` |
"
  [^CfnMultiRegionAccessPointPolicy$PolicyStatusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-public)]
    (. builder isPublic data))
  (.build builder))


(defn build-cfn-multi-region-access-point-policy-props-builder
  "The build-cfn-multi-region-access-point-policy-props-builder function updates a CfnMultiRegionAccessPointPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPointPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mrapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:mrap-name` |
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
"
  [^CfnMultiRegionAccessPointPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :mrap-name)]
    (. builder mrapName data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (.build builder))


(defn build-cfn-multi-region-access-point-props-builder
  "The build-cfn-multi-region-access-point-props-builder function updates a CfnMultiRegionAccessPointProps$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicAccessBlockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-access-block-configuration` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^CfnMultiRegionAccessPointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :public-access-block-configuration)]
    (. builder publicAccessBlockConfiguration data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn build-cfn-multi-region-access-point-public-access-block-configuration-property-builder
  "The build-cfn-multi-region-access-point-public-access-block-configuration-property-builder function updates a CfnMultiRegionAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPoint$PublicAccessBlockConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicAcls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-public-acls` |
| `blockPublicPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `ignorePublicAcls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ignore-public-acls` |
| `restrictPublicBuckets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restrict-public-buckets` |
"
  [^CfnMultiRegionAccessPoint$PublicAccessBlockConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :block-public-acls)]
    (. builder blockPublicAcls data))
  (when-let [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-let [data (lookup-entry config id :ignore-public-acls)]
    (. builder ignorePublicAcls data))
  (when-let [data (lookup-entry config id :restrict-public-buckets)]
    (. builder restrictPublicBuckets data))
  (.build builder))


(defn build-cfn-multi-region-access-point-region-property-builder
  "The build-cfn-multi-region-access-point-region-property-builder function updates a CfnMultiRegionAccessPoint$RegionProperty$Builder instance using the provided configuration.
  The function takes the CfnMultiRegionAccessPoint$RegionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-account-id` |
"
  [^CfnMultiRegionAccessPoint$RegionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-account-id)]
    (. builder bucketAccountId data))
  (.build builder))


(defn build-cfn-storage-lens-account-level-property-builder
  "The build-cfn-storage-lens-account-level-property-builder function updates a CfnStorageLens$AccountLevelProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$AccountLevelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityMetrics` | software.amazon.awscdk.services.s3.CfnStorageLens$ActivityMetricsProperty | [[cdk.support/lookup-entry]] | `:activity-metrics` |
| `advancedCostOptimizationMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-cost-optimization-metrics` |
| `advancedDataProtectionMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-data-protection-metrics` |
| `bucketLevel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bucket-level` |
| `detailedStatusCodesMetrics` | software.amazon.awscdk.services.s3.CfnStorageLens$DetailedStatusCodesMetricsProperty | [[cdk.support/lookup-entry]] | `:detailed-status-codes-metrics` |
| `storageLensGroupLevel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-lens-group-level` |
"
  [^CfnStorageLens$AccountLevelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :activity-metrics)]
    (. builder activityMetrics data))
  (when-let [data (lookup-entry config id :advanced-cost-optimization-metrics)]
    (. builder advancedCostOptimizationMetrics data))
  (when-let [data (lookup-entry config id :advanced-data-protection-metrics)]
    (. builder advancedDataProtectionMetrics data))
  (when-let [data (lookup-entry config id :bucket-level)]
    (. builder bucketLevel data))
  (when-let [data (lookup-entry config id :detailed-status-codes-metrics)]
    (. builder detailedStatusCodesMetrics data))
  (when-let [data (lookup-entry config id :storage-lens-group-level)]
    (. builder storageLensGroupLevel data))
  (.build builder))


(defn build-cfn-storage-lens-activity-metrics-property-builder
  "The build-cfn-storage-lens-activity-metrics-property-builder function updates a CfnStorageLens$ActivityMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$ActivityMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-enabled` |
"
  [^CfnStorageLens$ActivityMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (.build builder))


(defn build-cfn-storage-lens-advanced-cost-optimization-metrics-property-builder
  "The build-cfn-storage-lens-advanced-cost-optimization-metrics-property-builder function updates a CfnStorageLens$AdvancedCostOptimizationMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$AdvancedCostOptimizationMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-enabled` |
"
  [^CfnStorageLens$AdvancedCostOptimizationMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (.build builder))


(defn build-cfn-storage-lens-advanced-data-protection-metrics-property-builder
  "The build-cfn-storage-lens-advanced-data-protection-metrics-property-builder function updates a CfnStorageLens$AdvancedDataProtectionMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$AdvancedDataProtectionMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-enabled` |
"
  [^CfnStorageLens$AdvancedDataProtectionMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (.build builder))


(defn build-cfn-storage-lens-aws-org-property-builder
  "The build-cfn-storage-lens-aws-org-property-builder function updates a CfnStorageLens$AwsOrgProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$AwsOrgProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnStorageLens$AwsOrgProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn build-cfn-storage-lens-bucket-level-property-builder
  "The build-cfn-storage-lens-bucket-level-property-builder function updates a CfnStorageLens$BucketLevelProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$BucketLevelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activityMetrics` | software.amazon.awscdk.services.s3.CfnStorageLens$ActivityMetricsProperty | [[cdk.support/lookup-entry]] | `:activity-metrics` |
| `advancedCostOptimizationMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-cost-optimization-metrics` |
| `advancedDataProtectionMetrics` | software.amazon.awscdk.services.s3.CfnStorageLens$AdvancedDataProtectionMetricsProperty | [[cdk.support/lookup-entry]] | `:advanced-data-protection-metrics` |
| `detailedStatusCodesMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detailed-status-codes-metrics` |
| `prefixLevel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prefix-level` |
"
  [^CfnStorageLens$BucketLevelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :activity-metrics)]
    (. builder activityMetrics data))
  (when-let [data (lookup-entry config id :advanced-cost-optimization-metrics)]
    (. builder advancedCostOptimizationMetrics data))
  (when-let [data (lookup-entry config id :advanced-data-protection-metrics)]
    (. builder advancedDataProtectionMetrics data))
  (when-let [data (lookup-entry config id :detailed-status-codes-metrics)]
    (. builder detailedStatusCodesMetrics data))
  (when-let [data (lookup-entry config id :prefix-level)]
    (. builder prefixLevel data))
  (.build builder))


(defn build-cfn-storage-lens-buckets-and-regions-property-builder
  "The build-cfn-storage-lens-buckets-and-regions-property-builder function updates a CfnStorageLens$BucketsAndRegionsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$BucketsAndRegionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buckets` | java.util.List | [[cdk.support/lookup-entry]] | `:buckets` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^CfnStorageLens$BucketsAndRegionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :buckets)]
    (. builder buckets data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn build-cfn-storage-lens-builder
  "The build-cfn-storage-lens-builder function updates a CfnStorageLens$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageLensConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-lens-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageLens$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-lens-configuration)]
    (. builder storageLensConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-lens-cloud-watch-metrics-property-builder
  "The build-cfn-storage-lens-cloud-watch-metrics-property-builder function updates a CfnStorageLens$CloudWatchMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$CloudWatchMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-enabled` |
"
  [^CfnStorageLens$CloudWatchMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (.build builder))


(defn build-cfn-storage-lens-data-export-property-builder
  "The build-cfn-storage-lens-data-export-property-builder function updates a CfnStorageLens$DataExportProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$DataExportProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics` |
| `s3BucketDestination` | software.amazon.awscdk.services.s3.CfnStorageLens$S3BucketDestinationProperty | [[cdk.support/lookup-entry]] | `:s3-bucket-destination` |
"
  [^CfnStorageLens$DataExportProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-metrics)]
    (. builder cloudWatchMetrics data))
  (when-let [data (lookup-entry config id :s3-bucket-destination)]
    (. builder s3BucketDestination data))
  (.build builder))


(defn build-cfn-storage-lens-detailed-status-codes-metrics-property-builder
  "The build-cfn-storage-lens-detailed-status-codes-metrics-property-builder function updates a CfnStorageLens$DetailedStatusCodesMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$DetailedStatusCodesMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-enabled` |
"
  [^CfnStorageLens$DetailedStatusCodesMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (.build builder))


(defn build-cfn-storage-lens-encryption-property-builder
  "The build-cfn-storage-lens-encryption-property-builder function updates a CfnStorageLens$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ssekms` | software.amazon.awscdk.services.s3.CfnStorageLens$SSEKMSProperty | [[cdk.support/lookup-entry]] | `:ssekms` |
| `sses3` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sses3` |
"
  [^CfnStorageLens$EncryptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ssekms)]
    (. builder ssekms data))
  (when-let [data (lookup-entry config id :sses3)]
    (. builder sses3 data))
  (.build builder))


(defn build-cfn-storage-lens-group-and-property-builder
  "The build-cfn-storage-lens-group-and-property-builder function updates a CfnStorageLensGroup$AndProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$AndProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchAnyPrefix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-prefix` |
| `matchAnySuffix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-suffix` |
| `matchAnyTag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-any-tag` |
| `matchObjectAge` | software.amazon.awscdk.services.s3.CfnStorageLensGroup$MatchObjectAgeProperty | [[cdk.support/lookup-entry]] | `:match-object-age` |
| `matchObjectSize` | software.amazon.awscdk.services.s3.CfnStorageLensGroup$MatchObjectSizeProperty | [[cdk.support/lookup-entry]] | `:match-object-size` |
"
  [^CfnStorageLensGroup$AndProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-any-prefix)]
    (. builder matchAnyPrefix data))
  (when-let [data (lookup-entry config id :match-any-suffix)]
    (. builder matchAnySuffix data))
  (when-let [data (lookup-entry config id :match-any-tag)]
    (. builder matchAnyTag data))
  (when-let [data (lookup-entry config id :match-object-age)]
    (. builder matchObjectAge data))
  (when-let [data (lookup-entry config id :match-object-size)]
    (. builder matchObjectSize data))
  (.build builder))


(defn build-cfn-storage-lens-group-builder
  "The build-cfn-storage-lens-group-builder function updates a CfnStorageLensGroup$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageLensGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-lens-group-filter-property-builder
  "The build-cfn-storage-lens-group-filter-property-builder function updates a CfnStorageLensGroup$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `and` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and` |
| `matchAnyPrefix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-prefix` |
| `matchAnySuffix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-suffix` |
| `matchAnyTag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-any-tag` |
| `matchObjectAge` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-object-age` |
| `matchObjectSize` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-object-size` |
| `or` | software.amazon.awscdk.services.s3.CfnStorageLensGroup$OrProperty | [[cdk.support/lookup-entry]] | `:or` |
"
  [^CfnStorageLensGroup$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and)]
    (. builder and data))
  (when-let [data (lookup-entry config id :match-any-prefix)]
    (. builder matchAnyPrefix data))
  (when-let [data (lookup-entry config id :match-any-suffix)]
    (. builder matchAnySuffix data))
  (when-let [data (lookup-entry config id :match-any-tag)]
    (. builder matchAnyTag data))
  (when-let [data (lookup-entry config id :match-object-age)]
    (. builder matchObjectAge data))
  (when-let [data (lookup-entry config id :match-object-size)]
    (. builder matchObjectSize data))
  (when-let [data (lookup-entry config id :or)]
    (. builder or data))
  (.build builder))


(defn build-cfn-storage-lens-group-match-object-age-property-builder
  "The build-cfn-storage-lens-group-match-object-age-property-builder function updates a CfnStorageLensGroup$MatchObjectAgeProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$MatchObjectAgeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daysGreaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-greater-than` |
| `daysLessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:days-less-than` |
"
  [^CfnStorageLensGroup$MatchObjectAgeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :days-greater-than)]
    (. builder daysGreaterThan data))
  (when-let [data (lookup-entry config id :days-less-than)]
    (. builder daysLessThan data))
  (.build builder))


(defn build-cfn-storage-lens-group-match-object-size-property-builder
  "The build-cfn-storage-lens-group-match-object-size-property-builder function updates a CfnStorageLensGroup$MatchObjectSizeProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$MatchObjectSizeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bytesGreaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bytes-greater-than` |
| `bytesLessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bytes-less-than` |
"
  [^CfnStorageLensGroup$MatchObjectSizeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bytes-greater-than)]
    (. builder bytesGreaterThan data))
  (when-let [data (lookup-entry config id :bytes-less-than)]
    (. builder bytesLessThan data))
  (.build builder))


(defn build-cfn-storage-lens-group-or-property-builder
  "The build-cfn-storage-lens-group-or-property-builder function updates a CfnStorageLensGroup$OrProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroup$OrProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchAnyPrefix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-prefix` |
| `matchAnySuffix` | java.util.List | [[cdk.support/lookup-entry]] | `:match-any-suffix` |
| `matchAnyTag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-any-tag` |
| `matchObjectAge` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-object-age` |
| `matchObjectSize` | software.amazon.awscdk.services.s3.CfnStorageLensGroup$MatchObjectSizeProperty | [[cdk.support/lookup-entry]] | `:match-object-size` |
"
  [^CfnStorageLensGroup$OrProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-any-prefix)]
    (. builder matchAnyPrefix data))
  (when-let [data (lookup-entry config id :match-any-suffix)]
    (. builder matchAnySuffix data))
  (when-let [data (lookup-entry config id :match-any-tag)]
    (. builder matchAnyTag data))
  (when-let [data (lookup-entry config id :match-object-age)]
    (. builder matchObjectAge data))
  (when-let [data (lookup-entry config id :match-object-size)]
    (. builder matchObjectSize data))
  (.build builder))


(defn build-cfn-storage-lens-group-props-builder
  "The build-cfn-storage-lens-group-props-builder function updates a CfnStorageLensGroupProps$Builder instance using the provided configuration.
  The function takes the CfnStorageLensGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageLensGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-lens-prefix-level-property-builder
  "The build-cfn-storage-lens-prefix-level-property-builder function updates a CfnStorageLens$PrefixLevelProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$PrefixLevelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageMetrics` | software.amazon.awscdk.services.s3.CfnStorageLens$PrefixLevelStorageMetricsProperty | [[cdk.support/lookup-entry]] | `:storage-metrics` |
"
  [^CfnStorageLens$PrefixLevelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-metrics)]
    (. builder storageMetrics data))
  (.build builder))


(defn build-cfn-storage-lens-prefix-level-storage-metrics-property-builder
  "The build-cfn-storage-lens-prefix-level-storage-metrics-property-builder function updates a CfnStorageLens$PrefixLevelStorageMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$PrefixLevelStorageMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-enabled` |
| `selectionCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:selection-criteria` |
"
  [^CfnStorageLens$PrefixLevelStorageMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (when-let [data (lookup-entry config id :selection-criteria)]
    (. builder selectionCriteria data))
  (.build builder))


(defn build-cfn-storage-lens-props-builder
  "The build-cfn-storage-lens-props-builder function updates a CfnStorageLensProps$Builder instance using the provided configuration.
  The function takes the CfnStorageLensProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageLensConfiguration` | software.amazon.awscdk.services.s3.CfnStorageLens$StorageLensConfigurationProperty | [[cdk.support/lookup-entry]] | `:storage-lens-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageLensProps$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-lens-configuration)]
    (. builder storageLensConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-storage-lens-s3-bucket-destination-property-builder
  "The build-cfn-storage-lens-s3-bucket-destination-property-builder function updates a CfnStorageLens$S3BucketDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$S3BucketDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `outputSchemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-schema-version` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnStorageLens$S3BucketDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :output-schema-version)]
    (. builder outputSchemaVersion data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn build-cfn-storage-lens-selection-criteria-property-builder
  "The build-cfn-storage-lens-selection-criteria-property-builder function updates a CfnStorageLens$SelectionCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$SelectionCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `maxDepth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-depth` |
| `minStorageBytesPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-storage-bytes-percentage` |
"
  [^CfnStorageLens$SelectionCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delimiter)]
    (. builder delimiter data))
  (when-let [data (lookup-entry config id :max-depth)]
    (. builder maxDepth data))
  (when-let [data (lookup-entry config id :min-storage-bytes-percentage)]
    (. builder minStorageBytesPercentage data))
  (.build builder))


(defn build-cfn-storage-lens-ssekms-property-builder
  "The build-cfn-storage-lens-ssekms-property-builder function updates a CfnStorageLens$SSEKMSProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$SSEKMSProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
"
  [^CfnStorageLens$SSEKMSProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (.build builder))


(defn build-cfn-storage-lens-storage-lens-configuration-property-builder
  "The build-cfn-storage-lens-storage-lens-configuration-property-builder function updates a CfnStorageLens$StorageLensConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$StorageLensConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountLevel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-level` |
| `awsOrg` | software.amazon.awscdk.services.s3.CfnStorageLens$AwsOrgProperty | [[cdk.support/lookup-entry]] | `:aws-org` |
| `dataExport` | software.amazon.awscdk.services.s3.CfnStorageLens$DataExportProperty | [[cdk.support/lookup-entry]] | `:data-export` |
| `exclude` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `include` | software.amazon.awscdk.services.s3.CfnStorageLens$BucketsAndRegionsProperty | [[cdk.support/lookup-entry]] | `:include` |
| `isEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-enabled` |
| `storageLensArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-lens-arn` |
"
  [^CfnStorageLens$StorageLensConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-level)]
    (. builder accountLevel data))
  (when-let [data (lookup-entry config id :aws-org)]
    (. builder awsOrg data))
  (when-let [data (lookup-entry config id :data-export)]
    (. builder dataExport data))
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :include)]
    (. builder include data))
  (when-let [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (when-let [data (lookup-entry config id :storage-lens-arn)]
    (. builder storageLensArn data))
  (.build builder))


(defn build-cfn-storage-lens-storage-lens-group-level-property-builder
  "The build-cfn-storage-lens-storage-lens-group-level-property-builder function updates a CfnStorageLens$StorageLensGroupLevelProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$StorageLensGroupLevelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageLensGroupSelectionCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-lens-group-selection-criteria` |
"
  [^CfnStorageLens$StorageLensGroupLevelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-lens-group-selection-criteria)]
    (. builder storageLensGroupSelectionCriteria data))
  (.build builder))


(defn build-cfn-storage-lens-storage-lens-group-selection-criteria-property-builder
  "The build-cfn-storage-lens-storage-lens-group-selection-criteria-property-builder function updates a CfnStorageLens$StorageLensGroupSelectionCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageLens$StorageLensGroupSelectionCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `include` | java.util.List | [[cdk.support/lookup-entry]] | `:include` |
"
  [^CfnStorageLens$StorageLensGroupSelectionCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-let [data (lookup-entry config id :include)]
    (. builder include data))
  (.build builder))


(defn build-cors-rule-builder
  "The build-cors-rule-builder function updates a CorsRule$Builder instance using the provided configuration.
  The function takes the CorsRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-headers` |
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `exposedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:exposed-headers` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `maxAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age` |
"
  [^CorsRule$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-headers)]
    (. builder allowedHeaders data))
  (when-let [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-let [data (lookup-entry config id :allowed-origins)]
    (. builder allowedOrigins data))
  (when-let [data (lookup-entry config id :exposed-headers)]
    (. builder exposedHeaders data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :max-age)]
    (. builder maxAge data))
  (.build builder))


(defn build-intelligent-tiering-configuration-builder
  "The build-intelligent-tiering-configuration-builder function updates a IntelligentTieringConfiguration$Builder instance using the provided configuration.
  The function takes the IntelligentTieringConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveAccessTierTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:archive-access-tier-time` |
| `deepArchiveAccessTierTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deep-archive-access-tier-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^IntelligentTieringConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :archive-access-tier-time)]
    (. builder archiveAccessTierTime data))
  (when-let [data (lookup-entry config id :deep-archive-access-tier-time)]
    (. builder deepArchiveAccessTierTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-inventory-builder
  "The build-inventory-builder function updates a Inventory$Builder instance using the provided configuration.
  The function takes the Inventory$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.s3.InventoryDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `format` | software.amazon.awscdk.services.s3.InventoryFormat | [[cdk.api.services.s3/inventory-format]] | `:format` |
| `frequency` | software.amazon.awscdk.services.s3.InventoryFrequency | [[cdk.api.services.s3/inventory-frequency]] | `:frequency` |
| `includeObjectVersions` | software.amazon.awscdk.services.s3.InventoryObjectVersion | [[cdk.api.services.s3/inventory-object-version]] | `:include-object-versions` |
| `inventoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:inventory-id` |
| `objectsPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:objects-prefix` |
| `optionalFields` | java.util.List | [[cdk.support/lookup-entry]] | `:optional-fields` |
"
  [^Inventory$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (inventory-format config id :format)]
    (. builder format data))
  (when-let [data (inventory-frequency config id :frequency)]
    (. builder frequency data))
  (when-let [data (inventory-object-version config id :include-object-versions)]
    (. builder includeObjectVersions data))
  (when-let [data (lookup-entry config id :inventory-id)]
    (. builder inventoryId data))
  (when-let [data (lookup-entry config id :objects-prefix)]
    (. builder objectsPrefix data))
  (when-let [data (lookup-entry config id :optional-fields)]
    (. builder optionalFields data))
  (.build builder))


(defn build-inventory-destination-builder
  "The build-inventory-destination-builder function updates a InventoryDestination$Builder instance using the provided configuration.
  The function takes the InventoryDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^InventoryDestination$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :bucket-owner)]
    (. builder bucketOwner data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn build-lifecycle-rule-builder
  "The build-lifecycle-rule-builder function updates a LifecycleRule$Builder instance using the provided configuration.
  The function takes the LifecycleRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortIncompleteMultipartUploadAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:abort-incomplete-multipart-upload-after` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `expiration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:expiration` |
| `expirationDate` | java.time.Instant | [[cdk.support/lookup-entry]] | `:expiration-date` |
| `expiredObjectDeleteMarker` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:expired-object-delete-marker` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `noncurrentVersionExpiration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:noncurrent-version-expiration` |
| `noncurrentVersionTransitions` | java.util.List | [[cdk.support/lookup-entry]] | `:noncurrent-version-transitions` |
| `noncurrentVersionsToRetain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:noncurrent-versions-to-retain` |
| `objectSizeGreaterThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-size-greater-than` |
| `objectSizeLessThan` | java.lang.Number | [[cdk.support/lookup-entry]] | `:object-size-less-than` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `tagFilters` | java.util.Map | [[cdk.support/lookup-entry]] | `:tag-filters` |
| `transitions` | java.util.List | [[cdk.support/lookup-entry]] | `:transitions` |
"
  [^LifecycleRule$Builder builder id config]
  (when-let [data (lookup-entry config id :abort-incomplete-multipart-upload-after)]
    (. builder abortIncompleteMultipartUploadAfter data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :expiration)]
    (. builder expiration data))
  (when-let [data (lookup-entry config id :expiration-date)]
    (. builder expirationDate data))
  (when-let [data (lookup-entry config id :expired-object-delete-marker)]
    (. builder expiredObjectDeleteMarker data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :noncurrent-version-expiration)]
    (. builder noncurrentVersionExpiration data))
  (when-let [data (lookup-entry config id :noncurrent-version-transitions)]
    (. builder noncurrentVersionTransitions data))
  (when-let [data (lookup-entry config id :noncurrent-versions-to-retain)]
    (. builder noncurrentVersionsToRetain data))
  (when-let [data (lookup-entry config id :object-size-greater-than)]
    (. builder objectSizeGreaterThan data))
  (when-let [data (lookup-entry config id :object-size-less-than)]
    (. builder objectSizeLessThan data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :tag-filters)]
    (. builder tagFilters data))
  (when-let [data (lookup-entry config id :transitions)]
    (. builder transitions data))
  (.build builder))


(defn build-location-builder
  "The build-location-builder function updates a Location$Builder instance using the provided configuration.
  The function takes the Location$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
"
  [^Location$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (when-let [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (.build builder))


(defn build-noncurrent-version-transition-builder
  "The build-noncurrent-version-transition-builder function updates a NoncurrentVersionTransition$Builder instance using the provided configuration.
  The function takes the NoncurrentVersionTransition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `noncurrentVersionsToRetain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:noncurrent-versions-to-retain` |
| `storageClass` | software.amazon.awscdk.services.s3.StorageClass | [[cdk.support/lookup-entry]] | `:storage-class` |
| `transitionAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:transition-after` |
"
  [^NoncurrentVersionTransition$Builder builder id config]
  (when-let [data (lookup-entry config id :noncurrent-versions-to-retain)]
    (. builder noncurrentVersionsToRetain data))
  (when-let [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :transition-after)]
    (. builder transitionAfter data))
  (.build builder))


(defn build-notification-key-filter-builder
  "The build-notification-key-filter-builder function updates a NotificationKeyFilter$Builder instance using the provided configuration.
  The function takes the NotificationKeyFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `suffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:suffix` |
"
  [^NotificationKeyFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-let [data (lookup-entry config id :suffix)]
    (. builder suffix data))
  (.build builder))


(defn build-on-cloud-trail-bucket-event-options-builder
  "The build-on-cloud-trail-bucket-event-options-builder function updates a OnCloudTrailBucketEventOptions$Builder instance using the provided configuration.
  The function takes the OnCloudTrailBucketEventOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `paths` | java.util.List | [[cdk.support/lookup-entry]] | `:paths` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^OnCloudTrailBucketEventOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :cross-stack-scope)]
    (. builder crossStackScope data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-let [data (lookup-entry config id :paths)]
    (. builder paths data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn build-redirect-target-builder
  "The build-redirect-target-builder function updates a RedirectTarget$Builder instance using the provided configuration.
  The function takes the RedirectTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `protocol` | software.amazon.awscdk.services.s3.RedirectProtocol | [[cdk.api.services.s3/redirect-protocol]] | `:protocol` |
"
  [^RedirectTarget$Builder builder id config]
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (redirect-protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn build-routing-rule-builder
  "The build-routing-rule-builder function updates a RoutingRule$Builder instance using the provided configuration.
  The function takes the RoutingRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.services.s3.RoutingRuleCondition | [[cdk.support/lookup-entry]] | `:condition` |
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `httpRedirectCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-redirect-code` |
| `protocol` | software.amazon.awscdk.services.s3.RedirectProtocol | [[cdk.api.services.s3/redirect-protocol]] | `:protocol` |
| `replaceKey` | software.amazon.awscdk.services.s3.ReplaceKey | [[cdk.support/lookup-entry]] | `:replace-key` |
"
  [^RoutingRule$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (lookup-entry config id :http-redirect-code)]
    (. builder httpRedirectCode data))
  (when-let [data (redirect-protocol config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :replace-key)]
    (. builder replaceKey data))
  (.build builder))


(defn build-routing-rule-condition-builder
  "The build-routing-rule-condition-builder function updates a RoutingRuleCondition$Builder instance using the provided configuration.
  The function takes the RoutingRuleCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpErrorCodeReturnedEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-error-code-returned-equals` |
| `keyPrefixEquals` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix-equals` |
"
  [^RoutingRuleCondition$Builder builder id config]
  (when-let [data (lookup-entry config id :http-error-code-returned-equals)]
    (. builder httpErrorCodeReturnedEquals data))
  (when-let [data (lookup-entry config id :key-prefix-equals)]
    (. builder keyPrefixEquals data))
  (.build builder))


(defn build-tag-builder
  "The build-tag-builder function updates a Tag$Builder instance using the provided configuration.
  The function takes the Tag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^Tag$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-transfer-acceleration-url-options-builder
  "The build-transfer-acceleration-url-options-builder function updates a TransferAccelerationUrlOptions$Builder instance using the provided configuration.
  The function takes the TransferAccelerationUrlOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dual-stack` |
"
  [^TransferAccelerationUrlOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :dual-stack)]
    (. builder dualStack data))
  (.build builder))


(defn build-transition-builder
  "The build-transition-builder function updates a Transition$Builder instance using the provided configuration.
  The function takes the Transition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `storageClass` | software.amazon.awscdk.services.s3.StorageClass | [[cdk.support/lookup-entry]] | `:storage-class` |
| `transitionAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:transition-after` |
| `transitionDate` | java.time.Instant | [[cdk.support/lookup-entry]] | `:transition-date` |
"
  [^Transition$Builder builder id config]
  (when-let [data (lookup-entry config id :storage-class)]
    (. builder storageClass data))
  (when-let [data (lookup-entry config id :transition-after)]
    (. builder transitionAfter data))
  (when-let [data (lookup-entry config id :transition-date)]
    (. builder transitionDate data))
  (.build builder))


(defn build-virtual-hosted-style-url-options-builder
  "The build-virtual-hosted-style-url-options-builder function updates a VirtualHostedStyleUrlOptions$Builder instance using the provided configuration.
  The function takes the VirtualHostedStyleUrlOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regional` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:regional` |
"
  [^VirtualHostedStyleUrlOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :regional)]
    (. builder regional data))
  (.build builder))