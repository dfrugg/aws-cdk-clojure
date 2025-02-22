(ns cdk.api.services.dynamodb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.dynamodb package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.cloudwatch :refer [unit]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.dynamodb Attribute$Builder
                                                     AttributeType
                                                     AutoscaledCapacityOptions$Builder
                                                     BillingMode
                                                     CapacityMode
                                                     CfnGlobalTable$AttributeDefinitionProperty$Builder
                                                     CfnGlobalTable$Builder
                                                     CfnGlobalTable$CapacityAutoScalingSettingsProperty$Builder
                                                     CfnGlobalTable$ContributorInsightsSpecificationProperty$Builder
                                                     CfnGlobalTable$GlobalSecondaryIndexProperty$Builder
                                                     CfnGlobalTable$KeySchemaProperty$Builder
                                                     CfnGlobalTable$KinesisStreamSpecificationProperty$Builder
                                                     CfnGlobalTable$LocalSecondaryIndexProperty$Builder
                                                     CfnGlobalTable$PointInTimeRecoverySpecificationProperty$Builder
                                                     CfnGlobalTable$ProjectionProperty$Builder
                                                     CfnGlobalTable$ReadOnDemandThroughputSettingsProperty$Builder
                                                     CfnGlobalTable$ReadProvisionedThroughputSettingsProperty$Builder
                                                     CfnGlobalTable$ReplicaGlobalSecondaryIndexSpecificationProperty$Builder
                                                     CfnGlobalTable$ReplicaSSESpecificationProperty$Builder
                                                     CfnGlobalTable$ReplicaSpecificationProperty$Builder
                                                     CfnGlobalTable$ReplicaStreamSpecificationProperty$Builder
                                                     CfnGlobalTable$ResourcePolicyProperty$Builder
                                                     CfnGlobalTable$SSESpecificationProperty$Builder
                                                     CfnGlobalTable$StreamSpecificationProperty$Builder
                                                     CfnGlobalTable$TargetTrackingScalingPolicyConfigurationProperty$Builder
                                                     CfnGlobalTable$TimeToLiveSpecificationProperty$Builder
                                                     CfnGlobalTable$WriteOnDemandThroughputSettingsProperty$Builder
                                                     CfnGlobalTable$WriteProvisionedThroughputSettingsProperty$Builder
                                                     CfnGlobalTableProps$Builder
                                                     CfnTable$AttributeDefinitionProperty$Builder
                                                     CfnTable$Builder
                                                     CfnTable$ContributorInsightsSpecificationProperty$Builder
                                                     CfnTable$CsvProperty$Builder
                                                     CfnTable$GlobalSecondaryIndexProperty$Builder
                                                     CfnTable$ImportSourceSpecificationProperty$Builder
                                                     CfnTable$InputFormatOptionsProperty$Builder
                                                     CfnTable$KeySchemaProperty$Builder
                                                     CfnTable$KinesisStreamSpecificationProperty$Builder
                                                     CfnTable$LocalSecondaryIndexProperty$Builder
                                                     CfnTable$OnDemandThroughputProperty$Builder
                                                     CfnTable$PointInTimeRecoverySpecificationProperty$Builder
                                                     CfnTable$ProjectionProperty$Builder
                                                     CfnTable$ProvisionedThroughputProperty$Builder
                                                     CfnTable$ResourcePolicyProperty$Builder
                                                     CfnTable$S3BucketSourceProperty$Builder
                                                     CfnTable$SSESpecificationProperty$Builder
                                                     CfnTable$StreamSpecificationProperty$Builder
                                                     CfnTable$TimeToLiveSpecificationProperty$Builder
                                                     CfnTableProps$Builder
                                                     CsvOptions$Builder
                                                     EnableScalingProps$Builder
                                                     GlobalSecondaryIndexProps$Builder
                                                     GlobalSecondaryIndexPropsV2$Builder
                                                     ImportSourceSpecification$Builder
                                                     InputCompressionType
                                                     LocalSecondaryIndexProps$Builder
                                                     Operation
                                                     OperationsMetricOptions$Builder
                                                     ProjectionType
                                                     ReplicaGlobalSecondaryIndexOptions$Builder
                                                     ReplicaTableProps$Builder
                                                     SchemaOptions$Builder
                                                     SecondaryIndexProps$Builder
                                                     StreamViewType
                                                     SystemErrorsForOperationsMetricOptions$Builder
                                                     Table$Builder
                                                     TableAttributes$Builder
                                                     TableAttributesV2$Builder
                                                     TableClass
                                                     TableEncryption
                                                     TableOptions$Builder
                                                     TableOptionsV2$Builder
                                                     TableProps$Builder
                                                     TablePropsV2$Builder
                                                     TableV2$Builder
                                                     ThroughputProps$Builder
                                                     UtilizationScalingProps$Builder]))


(defn attribute-type
  "The `attribute-type` function data interprets values in the provided config data into a 
`AttributeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AttributeType` - the value is returned.
* is `:number` - `AttributeType/NUMBER` is returned
* is `:string` - `AttributeType/STRING` is returned
* is `:binary` - `AttributeType/BINARY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AttributeType data) data
      (= :number data) AttributeType/NUMBER
      (= :string data) AttributeType/STRING
      (= :binary data) AttributeType/BINARY)))


(defn billing-mode
  "The `billing-mode` function data interprets values in the provided config data into a 
`BillingMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BillingMode` - the value is returned.
* is `:provisioned` - `BillingMode/PROVISIONED` is returned
* is `:pay-per-request` - `BillingMode/PAY_PER_REQUEST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BillingMode data) data
      (= :provisioned data) BillingMode/PROVISIONED
      (= :pay-per-request data) BillingMode/PAY_PER_REQUEST)))


(defn capacity-mode
  "The `capacity-mode` function data interprets values in the provided config data into a 
`CapacityMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CapacityMode` - the value is returned.
* is `:autoscaled` - `CapacityMode/AUTOSCALED` is returned
* is `:fixed` - `CapacityMode/FIXED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CapacityMode data) data
      (= :autoscaled data) CapacityMode/AUTOSCALED
      (= :fixed data) CapacityMode/FIXED)))


(defn input-compression-type
  "The `input-compression-type` function data interprets values in the provided config data into a 
`InputCompressionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InputCompressionType` - the value is returned.
* is `:gzip` - `InputCompressionType/GZIP` is returned
* is `:none` - `InputCompressionType/NONE` is returned
* is `:zstd` - `InputCompressionType/ZSTD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InputCompressionType data) data
      (= :gzip data) InputCompressionType/GZIP
      (= :none data) InputCompressionType/NONE
      (= :zstd data) InputCompressionType/ZSTD)))


(defn operation
  "The `operation` function data interprets values in the provided config data into a 
`Operation` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Operation` - the value is returned.
* is `:batch-get-item` - `Operation/BATCH_GET_ITEM` is returned
* is `:batch-execute-statement` - `Operation/BATCH_EXECUTE_STATEMENT` is returned
* is `:put-item` - `Operation/PUT_ITEM` is returned
* is `:execute-statement` - `Operation/EXECUTE_STATEMENT` is returned
* is `:batch-write-item` - `Operation/BATCH_WRITE_ITEM` is returned
* is `:transact-get-items` - `Operation/TRANSACT_GET_ITEMS` is returned
* is `:execute-transaction` - `Operation/EXECUTE_TRANSACTION` is returned
* is `:transact-write-items` - `Operation/TRANSACT_WRITE_ITEMS` is returned
* is `:update-item` - `Operation/UPDATE_ITEM` is returned
* is `:delete-item` - `Operation/DELETE_ITEM` is returned
* is `:query` - `Operation/QUERY` is returned
* is `:scan` - `Operation/SCAN` is returned
* is `:get-item` - `Operation/GET_ITEM` is returned
* is `:get-records` - `Operation/GET_RECORDS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Operation data) data
      (= :batch-get-item data) Operation/BATCH_GET_ITEM
      (= :batch-execute-statement data) Operation/BATCH_EXECUTE_STATEMENT
      (= :put-item data) Operation/PUT_ITEM
      (= :execute-statement data) Operation/EXECUTE_STATEMENT
      (= :batch-write-item data) Operation/BATCH_WRITE_ITEM
      (= :transact-get-items data) Operation/TRANSACT_GET_ITEMS
      (= :execute-transaction data) Operation/EXECUTE_TRANSACTION
      (= :transact-write-items data) Operation/TRANSACT_WRITE_ITEMS
      (= :update-item data) Operation/UPDATE_ITEM
      (= :delete-item data) Operation/DELETE_ITEM
      (= :query data) Operation/QUERY
      (= :scan data) Operation/SCAN
      (= :get-item data) Operation/GET_ITEM
      (= :get-records data) Operation/GET_RECORDS)))


(defn projection-type
  "The `projection-type` function data interprets values in the provided config data into a 
`ProjectionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ProjectionType` - the value is returned.
* is `:keys-only` - `ProjectionType/KEYS_ONLY` is returned
* is `:include` - `ProjectionType/INCLUDE` is returned
* is `:all` - `ProjectionType/ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ProjectionType data) data
      (= :keys-only data) ProjectionType/KEYS_ONLY
      (= :include data) ProjectionType/INCLUDE
      (= :all data) ProjectionType/ALL)))


(defn stream-view-type
  "The `stream-view-type` function data interprets values in the provided config data into a 
`StreamViewType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StreamViewType` - the value is returned.
* is `:new-image` - `StreamViewType/NEW_IMAGE` is returned
* is `:new-and-old-images` - `StreamViewType/NEW_AND_OLD_IMAGES` is returned
* is `:keys-only` - `StreamViewType/KEYS_ONLY` is returned
* is `:old-image` - `StreamViewType/OLD_IMAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StreamViewType data) data
      (= :new-image data) StreamViewType/NEW_IMAGE
      (= :new-and-old-images data) StreamViewType/NEW_AND_OLD_IMAGES
      (= :keys-only data) StreamViewType/KEYS_ONLY
      (= :old-image data) StreamViewType/OLD_IMAGE)))


(defn table-class
  "The `table-class` function data interprets values in the provided config data into a 
`TableClass` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TableClass` - the value is returned.
* is `:standard` - `TableClass/STANDARD` is returned
* is `:standard-infrequent-access` - `TableClass/STANDARD_INFREQUENT_ACCESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TableClass data) data
      (= :standard data) TableClass/STANDARD
      (= :standard-infrequent-access data) TableClass/STANDARD_INFREQUENT_ACCESS)))


(defn table-encryption
  "The `table-encryption` function data interprets values in the provided config data into a 
`TableEncryption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TableEncryption` - the value is returned.
* is `:customer-managed` - `TableEncryption/CUSTOMER_MANAGED` is returned
* is `:aws-managed` - `TableEncryption/AWS_MANAGED` is returned
* is `:default` - `TableEncryption/DEFAULT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TableEncryption data) data
      (= :customer-managed data) TableEncryption/CUSTOMER_MANAGED
      (= :aws-managed data) TableEncryption/AWS_MANAGED
      (= :default data) TableEncryption/DEFAULT)))


(defn attribute-builder
  "The attribute-builder function buildes out new instances of 
Attribute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.dynamodb.AttributeType | [[cdk.api.services.dynamodb/attribute-type]] | `:type` |"
  [stack id config]
  (let [builder (Attribute$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (attribute-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn autoscaled-capacity-options-builder
  "The autoscaled-capacity-options-builder function buildes out new instances of 
AutoscaledCapacityOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `seedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed-capacity` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |"
  [stack id config]
  (let [builder (AutoscaledCapacityOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :seed-capacity)]
      (. builder seedCapacity data))
    (when-let [data (lookup-entry config id :target-utilization-percent)]
      (. builder targetUtilizationPercent data))
    (.build builder)))


(defn cfn-global-table-attribute-definition-property-builder
  "The cfn-global-table-attribute-definition-property-builder function buildes out new instances of 
CfnGlobalTable$AttributeDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |"
  [stack id config]
  (let [builder (CfnGlobalTable$AttributeDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :attribute-type)]
      (. builder attributeType data))
    (.build builder)))


(defn cfn-global-table-builder
  "The cfn-global-table-builder function buildes out new instances of 
CfnGlobalTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-definitions` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `globalSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `keySchema` | java.util.List | [[cdk.support/lookup-entry]] | `:key-schema` |
| `localSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `replicas` | java.util.List | [[cdk.support/lookup-entry]] | `:replicas` |
| `sseSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `streamSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$StreamSpecificationProperty | [[cdk.support/lookup-entry]] | `:stream-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeToLiveSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$TimeToLiveSpecificationProperty | [[cdk.support/lookup-entry]] | `:time-to-live-specification` |
| `writeOnDemandThroughputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-on-demand-throughput-settings` |
| `writeProvisionedThroughputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-provisioned-throughput-settings` |"
  [stack id config]
  (let [builder (CfnGlobalTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attribute-definitions)]
      (. builder attributeDefinitions data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :replicas)]
      (. builder replicas data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :stream-specification)]
      (. builder streamSpecification data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :time-to-live-specification)]
      (. builder timeToLiveSpecification data))
    (when-let [data (lookup-entry config id :write-on-demand-throughput-settings)]
      (. builder writeOnDemandThroughputSettings data))
    (when-let [data (lookup-entry config id :write-provisioned-throughput-settings)]
      (. builder writeProvisionedThroughputSettings data))
    (.build builder)))


(defn cfn-global-table-capacity-auto-scaling-settings-property-builder
  "The cfn-global-table-capacity-auto-scaling-settings-property-builder function buildes out new instances of 
CfnGlobalTable$CapacityAutoScalingSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `seedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed-capacity` |
| `targetTrackingScalingPolicyConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tracking-scaling-policy-configuration` |"
  [stack id config]
  (let [builder (CfnGlobalTable$CapacityAutoScalingSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :seed-capacity)]
      (. builder seedCapacity data))
    (when-let [data (lookup-entry config id :target-tracking-scaling-policy-configuration)]
      (. builder targetTrackingScalingPolicyConfiguration data))
    (.build builder)))


(defn cfn-global-table-contributor-insights-specification-property-builder
  "The cfn-global-table-contributor-insights-specification-property-builder function buildes out new instances of 
CfnGlobalTable$ContributorInsightsSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ContributorInsightsSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-global-table-global-secondary-index-property-builder
  "The cfn-global-table-global-secondary-index-property-builder function buildes out new instances of 
CfnGlobalTable$GlobalSecondaryIndexProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `projection` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ProjectionProperty | [[cdk.support/lookup-entry]] | `:projection` |
| `writeOnDemandThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$WriteOnDemandThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:write-on-demand-throughput-settings` |
| `writeProvisionedThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$WriteProvisionedThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:write-provisioned-throughput-settings` |"
  [stack id config]
  (let [builder (CfnGlobalTable$GlobalSecondaryIndexProperty$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :projection)]
      (. builder projection data))
    (when-let [data (lookup-entry config id :write-on-demand-throughput-settings)]
      (. builder writeOnDemandThroughputSettings data))
    (when-let [data (lookup-entry config id :write-provisioned-throughput-settings)]
      (. builder writeProvisionedThroughputSettings data))
    (.build builder)))


(defn cfn-global-table-key-schema-property-builder
  "The cfn-global-table-key-schema-property-builder function buildes out new instances of 
CfnGlobalTable$KeySchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |"
  [stack id config]
  (let [builder (CfnGlobalTable$KeySchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (.build builder)))


(defn cfn-global-table-kinesis-stream-specification-property-builder
  "The cfn-global-table-kinesis-stream-specification-property-builder function buildes out new instances of 
CfnGlobalTable$KinesisStreamSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approximateCreationDateTimePrecision` | java.lang.String | [[cdk.support/lookup-entry]] | `:approximate-creation-date-time-precision` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnGlobalTable$KinesisStreamSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :approximate-creation-date-time-precision)]
      (. builder approximateCreationDateTimePrecision data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-global-table-local-secondary-index-property-builder
  "The cfn-global-table-local-secondary-index-property-builder function buildes out new instances of 
CfnGlobalTable$LocalSecondaryIndexProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `projection` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ProjectionProperty | [[cdk.support/lookup-entry]] | `:projection` |"
  [stack id config]
  (let [builder (CfnGlobalTable$LocalSecondaryIndexProperty$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :projection)]
      (. builder projection data))
    (.build builder)))


(defn cfn-global-table-point-in-time-recovery-specification-property-builder
  "The cfn-global-table-point-in-time-recovery-specification-property-builder function buildes out new instances of 
CfnGlobalTable$PointInTimeRecoverySpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pointInTimeRecoveryEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-enabled` |"
  [stack id config]
  (let [builder (CfnGlobalTable$PointInTimeRecoverySpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :point-in-time-recovery-enabled)]
      (. builder pointInTimeRecoveryEnabled data))
    (.build builder)))


(defn cfn-global-table-projection-property-builder
  "The cfn-global-table-projection-property-builder function buildes out new instances of 
CfnGlobalTable$ProjectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `projectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:projection-type` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ProjectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (lookup-entry config id :projection-type)]
      (. builder projectionType data))
    (.build builder)))


(defn cfn-global-table-props-builder
  "The cfn-global-table-props-builder function buildes out new instances of 
CfnGlobalTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-definitions` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `globalSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `keySchema` | java.util.List | [[cdk.support/lookup-entry]] | `:key-schema` |
| `localSecondaryIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `replicas` | java.util.List | [[cdk.support/lookup-entry]] | `:replicas` |
| `sseSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `streamSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$StreamSpecificationProperty | [[cdk.support/lookup-entry]] | `:stream-specification` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeToLiveSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-to-live-specification` |
| `writeOnDemandThroughputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-on-demand-throughput-settings` |
| `writeProvisionedThroughputSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:write-provisioned-throughput-settings` |"
  [stack id config]
  (let [builder (CfnGlobalTableProps$Builder.)]
    (when-let [data (lookup-entry config id :attribute-definitions)]
      (. builder attributeDefinitions data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :replicas)]
      (. builder replicas data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :stream-specification)]
      (. builder streamSpecification data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :time-to-live-specification)]
      (. builder timeToLiveSpecification data))
    (when-let [data (lookup-entry config id :write-on-demand-throughput-settings)]
      (. builder writeOnDemandThroughputSettings data))
    (when-let [data (lookup-entry config id :write-provisioned-throughput-settings)]
      (. builder writeProvisionedThroughputSettings data))
    (.build builder)))


(defn cfn-global-table-read-on-demand-throughput-settings-property-builder
  "The cfn-global-table-read-on-demand-throughput-settings-property-builder function buildes out new instances of 
CfnGlobalTable$ReadOnDemandThroughputSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxReadRequestUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-read-request-units` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReadOnDemandThroughputSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-read-request-units)]
      (. builder maxReadRequestUnits data))
    (.build builder)))


(defn cfn-global-table-read-provisioned-throughput-settings-property-builder
  "The cfn-global-table-read-provisioned-throughput-settings-property-builder function buildes out new instances of 
CfnGlobalTable$ReadProvisionedThroughputSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityAutoScalingSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$CapacityAutoScalingSettingsProperty | [[cdk.support/lookup-entry]] | `:read-capacity-auto-scaling-settings` |
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReadProvisionedThroughputSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-auto-scaling-settings)]
      (. builder readCapacityAutoScalingSettings data))
    (when-let [data (lookup-entry config id :read-capacity-units)]
      (. builder readCapacityUnits data))
    (.build builder)))


(defn cfn-global-table-replica-global-secondary-index-specification-property-builder
  "The cfn-global-table-replica-global-secondary-index-specification-property-builder function buildes out new instances of 
CfnGlobalTable$ReplicaGlobalSecondaryIndexSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsightsSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contributor-insights-specification` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `readOnDemandThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReadOnDemandThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:read-on-demand-throughput-settings` |
| `readProvisionedThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReadProvisionedThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:read-provisioned-throughput-settings` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReplicaGlobalSecondaryIndexSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights-specification)]
      (. builder contributorInsightsSpecification data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :read-on-demand-throughput-settings)]
      (. builder readOnDemandThroughputSettings data))
    (when-let [data (lookup-entry config id :read-provisioned-throughput-settings)]
      (. builder readProvisionedThroughputSettings data))
    (.build builder)))


(defn cfn-global-table-replica-specification-property-builder
  "The cfn-global-table-replica-specification-property-builder function buildes out new instances of 
CfnGlobalTable$ReplicaSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsightsSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ContributorInsightsSpecificationProperty | [[cdk.support/lookup-entry]] | `:contributor-insights-specification` |
| `deletionProtectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection-enabled` |
| `globalSecondaryIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `kinesisStreamSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-specification` |
| `pointInTimeRecoverySpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-specification` |
| `readOnDemandThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReadOnDemandThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:read-on-demand-throughput-settings` |
| `readProvisionedThroughputSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReadProvisionedThroughputSettingsProperty | [[cdk.support/lookup-entry]] | `:read-provisioned-throughput-settings` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `replicaStreamSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReplicaStreamSpecificationProperty | [[cdk.support/lookup-entry]] | `:replica-stream-specification` |
| `resourcePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sseSpecification` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$ReplicaSSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tableClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-class` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReplicaSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights-specification)]
      (. builder contributorInsightsSpecification data))
    (when-let [data (lookup-entry config id :deletion-protection-enabled)]
      (. builder deletionProtectionEnabled data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :kinesis-stream-specification)]
      (. builder kinesisStreamSpecification data))
    (when-let [data (lookup-entry config id :point-in-time-recovery-specification)]
      (. builder pointInTimeRecoverySpecification data))
    (when-let [data (lookup-entry config id :read-on-demand-throughput-settings)]
      (. builder readOnDemandThroughputSettings data))
    (when-let [data (lookup-entry config id :read-provisioned-throughput-settings)]
      (. builder readProvisionedThroughputSettings data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :replica-stream-specification)]
      (. builder replicaStreamSpecification data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-global-table-replica-sse-specification-property-builder
  "The cfn-global-table-replica-sse-specification-property-builder function buildes out new instances of 
CfnGlobalTable$ReplicaSSESpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReplicaSSESpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-master-key-id)]
      (. builder kmsMasterKeyId data))
    (.build builder)))


(defn cfn-global-table-replica-stream-specification-property-builder
  "The cfn-global-table-replica-stream-specification-property-builder function buildes out new instances of 
CfnGlobalTable$ReplicaStreamSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourcePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-policy` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ReplicaStreamSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (.build builder)))


(defn cfn-global-table-resource-policy-property-builder
  "The cfn-global-table-resource-policy-property-builder function buildes out new instances of 
CfnGlobalTable$ResourcePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnGlobalTable$ResourcePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-global-table-sse-specification-property-builder
  "The cfn-global-table-sse-specification-property-builder function buildes out new instances of 
CfnGlobalTable$SSESpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |
| `sseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-type` |"
  [stack id config]
  (let [builder (CfnGlobalTable$SSESpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sse-enabled)]
      (. builder sseEnabled data))
    (when-let [data (lookup-entry config id :sse-type)]
      (. builder sseType data))
    (.build builder)))


(defn cfn-global-table-stream-specification-property-builder
  "The cfn-global-table-stream-specification-property-builder function buildes out new instances of 
CfnGlobalTable$StreamSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamViewType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-view-type` |"
  [stack id config]
  (let [builder (CfnGlobalTable$StreamSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :stream-view-type)]
      (. builder streamViewType data))
    (.build builder)))


(defn cfn-global-table-target-tracking-scaling-policy-configuration-property-builder
  "The cfn-global-table-target-tracking-scaling-policy-configuration-property-builder function buildes out new instances of 
CfnGlobalTable$TargetTrackingScalingPolicyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `scaleInCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnGlobalTable$TargetTrackingScalingPolicyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn cfn-global-table-time-to-live-specification-property-builder
  "The cfn-global-table-time-to-live-specification-property-builder function buildes out new instances of 
CfnGlobalTable$TimeToLiveSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnGlobalTable$TimeToLiveSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-global-table-write-on-demand-throughput-settings-property-builder
  "The cfn-global-table-write-on-demand-throughput-settings-property-builder function buildes out new instances of 
CfnGlobalTable$WriteOnDemandThroughputSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxWriteRequestUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-write-request-units` |"
  [stack id config]
  (let [builder (CfnGlobalTable$WriteOnDemandThroughputSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-write-request-units)]
      (. builder maxWriteRequestUnits data))
    (.build builder)))


(defn cfn-global-table-write-provisioned-throughput-settings-property-builder
  "The cfn-global-table-write-provisioned-throughput-settings-property-builder function buildes out new instances of 
CfnGlobalTable$WriteProvisionedThroughputSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `writeCapacityAutoScalingSettings` | software.amazon.awscdk.services.dynamodb.CfnGlobalTable$CapacityAutoScalingSettingsProperty | [[cdk.support/lookup-entry]] | `:write-capacity-auto-scaling-settings` |"
  [stack id config]
  (let [builder (CfnGlobalTable$WriteProvisionedThroughputSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :write-capacity-auto-scaling-settings)]
      (. builder writeCapacityAutoScalingSettings data))
    (.build builder)))


(defn cfn-table-attribute-definition-property-builder
  "The cfn-table-attribute-definition-property-builder function buildes out new instances of 
CfnTable$AttributeDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |"
  [stack id config]
  (let [builder (CfnTable$AttributeDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :attribute-type)]
      (. builder attributeType data))
    (.build builder)))


(defn cfn-table-builder
  "The cfn-table-builder function buildes out new instances of 
CfnTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-definitions` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `contributorInsightsSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contributor-insights-specification` |
| `deletionProtectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protection-enabled` |
| `globalSecondaryIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `importSourceSpecification` | software.amazon.awscdk.services.dynamodb.CfnTable$ImportSourceSpecificationProperty | [[cdk.support/lookup-entry]] | `:import-source-specification` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `kinesisStreamSpecification` | software.amazon.awscdk.services.dynamodb.CfnTable$KinesisStreamSpecificationProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-specification` |
| `localSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `onDemandThroughput` | software.amazon.awscdk.services.dynamodb.CfnTable$OnDemandThroughputProperty | [[cdk.support/lookup-entry]] | `:on-demand-throughput` |
| `pointInTimeRecoverySpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-specification` |
| `provisionedThroughput` | software.amazon.awscdk.services.dynamodb.CfnTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `resourcePolicy` | software.amazon.awscdk.services.dynamodb.CfnTable$ResourcePolicyProperty | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sseSpecification` | software.amazon.awscdk.services.dynamodb.CfnTable$SSESpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `streamSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-specification` |
| `tableClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeToLiveSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-to-live-specification` |"
  [stack id config]
  (let [builder (CfnTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attribute-definitions)]
      (. builder attributeDefinitions data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :contributor-insights-specification)]
      (. builder contributorInsightsSpecification data))
    (when-let [data (lookup-entry config id :deletion-protection-enabled)]
      (. builder deletionProtectionEnabled data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :import-source-specification)]
      (. builder importSourceSpecification data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :kinesis-stream-specification)]
      (. builder kinesisStreamSpecification data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :on-demand-throughput)]
      (. builder onDemandThroughput data))
    (when-let [data (lookup-entry config id :point-in-time-recovery-specification)]
      (. builder pointInTimeRecoverySpecification data))
    (when-let [data (lookup-entry config id :provisioned-throughput)]
      (. builder provisionedThroughput data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :stream-specification)]
      (. builder streamSpecification data))
    (when-let [data (lookup-entry config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-to-live-specification)]
      (. builder timeToLiveSpecification data))
    (.build builder)))


(defn cfn-table-contributor-insights-specification-property-builder
  "The cfn-table-contributor-insights-specification-property-builder function buildes out new instances of 
CfnTable$ContributorInsightsSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnTable$ContributorInsightsSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-table-csv-property-builder
  "The cfn-table-csv-property-builder function buildes out new instances of 
CfnTable$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `headerList` | java.util.List | [[cdk.support/lookup-entry]] | `:header-list` |"
  [stack id config]
  (let [builder (CfnTable$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :header-list)]
      (. builder headerList data))
    (.build builder)))


(defn cfn-table-global-secondary-index-property-builder
  "The cfn-table-global-secondary-index-property-builder function buildes out new instances of 
CfnTable$GlobalSecondaryIndexProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsightsSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contributor-insights-specification` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `onDemandThroughput` | software.amazon.awscdk.services.dynamodb.CfnTable$OnDemandThroughputProperty | [[cdk.support/lookup-entry]] | `:on-demand-throughput` |
| `projection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:projection` |
| `provisionedThroughput` | software.amazon.awscdk.services.dynamodb.CfnTable$ProvisionedThroughputProperty | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |"
  [stack id config]
  (let [builder (CfnTable$GlobalSecondaryIndexProperty$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights-specification)]
      (. builder contributorInsightsSpecification data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :on-demand-throughput)]
      (. builder onDemandThroughput data))
    (when-let [data (lookup-entry config id :projection)]
      (. builder projection data))
    (when-let [data (lookup-entry config id :provisioned-throughput)]
      (. builder provisionedThroughput data))
    (.build builder)))


(defn cfn-table-import-source-specification-property-builder
  "The cfn-table-import-source-specification-property-builder function buildes out new instances of 
CfnTable$ImportSourceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputCompressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-compression-type` |
| `inputFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-format` |
| `inputFormatOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-format-options` |
| `s3BucketSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-bucket-source` |"
  [stack id config]
  (let [builder (CfnTable$ImportSourceSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-compression-type)]
      (. builder inputCompressionType data))
    (when-let [data (lookup-entry config id :input-format)]
      (. builder inputFormat data))
    (when-let [data (lookup-entry config id :input-format-options)]
      (. builder inputFormatOptions data))
    (when-let [data (lookup-entry config id :s3-bucket-source)]
      (. builder s3BucketSource data))
    (.build builder)))


(defn cfn-table-input-format-options-property-builder
  "The cfn-table-input-format-options-property-builder function buildes out new instances of 
CfnTable$InputFormatOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.dynamodb.CfnTable$CsvProperty | [[cdk.support/lookup-entry]] | `:csv` |"
  [stack id config]
  (let [builder (CfnTable$InputFormatOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (.build builder)))


(defn cfn-table-key-schema-property-builder
  "The cfn-table-key-schema-property-builder function buildes out new instances of 
CfnTable$KeySchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |"
  [stack id config]
  (let [builder (CfnTable$KeySchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (.build builder)))


(defn cfn-table-kinesis-stream-specification-property-builder
  "The cfn-table-kinesis-stream-specification-property-builder function buildes out new instances of 
CfnTable$KinesisStreamSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approximateCreationDateTimePrecision` | java.lang.String | [[cdk.support/lookup-entry]] | `:approximate-creation-date-time-precision` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnTable$KinesisStreamSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :approximate-creation-date-time-precision)]
      (. builder approximateCreationDateTimePrecision data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-table-local-secondary-index-property-builder
  "The cfn-table-local-secondary-index-property-builder function buildes out new instances of 
CfnTable$LocalSecondaryIndexProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `projection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:projection` |"
  [stack id config]
  (let [builder (CfnTable$LocalSecondaryIndexProperty$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :projection)]
      (. builder projection data))
    (.build builder)))


(defn cfn-table-on-demand-throughput-property-builder
  "The cfn-table-on-demand-throughput-property-builder function buildes out new instances of 
CfnTable$OnDemandThroughputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxReadRequestUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-read-request-units` |
| `maxWriteRequestUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-write-request-units` |"
  [stack id config]
  (let [builder (CfnTable$OnDemandThroughputProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-read-request-units)]
      (. builder maxReadRequestUnits data))
    (when-let [data (lookup-entry config id :max-write-request-units)]
      (. builder maxWriteRequestUnits data))
    (.build builder)))


(defn cfn-table-point-in-time-recovery-specification-property-builder
  "The cfn-table-point-in-time-recovery-specification-property-builder function buildes out new instances of 
CfnTable$PointInTimeRecoverySpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pointInTimeRecoveryEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-enabled` |"
  [stack id config]
  (let [builder (CfnTable$PointInTimeRecoverySpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :point-in-time-recovery-enabled)]
      (. builder pointInTimeRecoveryEnabled data))
    (.build builder)))


(defn cfn-table-projection-property-builder
  "The cfn-table-projection-property-builder function buildes out new instances of 
CfnTable$ProjectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `projectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:projection-type` |"
  [stack id config]
  (let [builder (CfnTable$ProjectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (lookup-entry config id :projection-type)]
      (. builder projectionType data))
    (.build builder)))


(defn cfn-table-props-builder
  "The cfn-table-props-builder function buildes out new instances of 
CfnTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-definitions` |
| `billingMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-mode` |
| `contributorInsightsSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contributor-insights-specification` |
| `deletionProtectionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection-enabled` |
| `globalSecondaryIndexes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `importSourceSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:import-source-specification` |
| `keySchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-schema` |
| `kinesisStreamSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-specification` |
| `localSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `onDemandThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-demand-throughput` |
| `pointInTimeRecoverySpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:point-in-time-recovery-specification` |
| `provisionedThroughput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-throughput` |
| `resourcePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `streamSpecification` | software.amazon.awscdk.services.dynamodb.CfnTable$StreamSpecificationProperty | [[cdk.support/lookup-entry]] | `:stream-specification` |
| `tableClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeToLiveSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-to-live-specification` |"
  [stack id config]
  (let [builder (CfnTableProps$Builder.)]
    (when-let [data (lookup-entry config id :attribute-definitions)]
      (. builder attributeDefinitions data))
    (when-let [data (lookup-entry config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :contributor-insights-specification)]
      (. builder contributorInsightsSpecification data))
    (when-let [data (lookup-entry config id :deletion-protection-enabled)]
      (. builder deletionProtectionEnabled data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :import-source-specification)]
      (. builder importSourceSpecification data))
    (when-let [data (lookup-entry config id :key-schema)]
      (. builder keySchema data))
    (when-let [data (lookup-entry config id :kinesis-stream-specification)]
      (. builder kinesisStreamSpecification data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :on-demand-throughput)]
      (. builder onDemandThroughput data))
    (when-let [data (lookup-entry config id :point-in-time-recovery-specification)]
      (. builder pointInTimeRecoverySpecification data))
    (when-let [data (lookup-entry config id :provisioned-throughput)]
      (. builder provisionedThroughput data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :stream-specification)]
      (. builder streamSpecification data))
    (when-let [data (lookup-entry config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-to-live-specification)]
      (. builder timeToLiveSpecification data))
    (.build builder)))


(defn cfn-table-provisioned-throughput-property-builder
  "The cfn-table-provisioned-throughput-property-builder function buildes out new instances of 
CfnTable$ProvisionedThroughputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity-units` |
| `writeCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity-units` |"
  [stack id config]
  (let [builder (CfnTable$ProvisionedThroughputProperty$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity-units)]
      (. builder readCapacityUnits data))
    (when-let [data (lookup-entry config id :write-capacity-units)]
      (. builder writeCapacityUnits data))
    (.build builder)))


(defn cfn-table-resource-policy-property-builder
  "The cfn-table-resource-policy-property-builder function buildes out new instances of 
CfnTable$ResourcePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |"
  [stack id config]
  (let [builder (CfnTable$ResourcePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (.build builder)))


(defn cfn-table-s3-bucket-source-property-builder
  "The cfn-table-s3-bucket-source-property-builder function buildes out new instances of 
CfnTable$S3BucketSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3BucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-owner` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (CfnTable$S3BucketSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-bucket-owner)]
      (. builder s3BucketOwner data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn cfn-table-sse-specification-property-builder
  "The cfn-table-sse-specification-property-builder function buildes out new instances of 
CfnTable$SSESpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsMasterKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-master-key-id` |
| `sseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sse-enabled` |
| `sseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-type` |"
  [stack id config]
  (let [builder (CfnTable$SSESpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-master-key-id)]
      (. builder kmsMasterKeyId data))
    (when-let [data (lookup-entry config id :sse-enabled)]
      (. builder sseEnabled data))
    (when-let [data (lookup-entry config id :sse-type)]
      (. builder sseType data))
    (.build builder)))


(defn cfn-table-stream-specification-property-builder
  "The cfn-table-stream-specification-property-builder function buildes out new instances of 
CfnTable$StreamSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourcePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `streamViewType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-view-type` |"
  [stack id config]
  (let [builder (CfnTable$StreamSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :stream-view-type)]
      (. builder streamViewType data))
    (.build builder)))


(defn cfn-table-time-to-live-specification-property-builder
  "The cfn-table-time-to-live-specification-property-builder function buildes out new instances of 
CfnTable$TimeToLiveSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnTable$TimeToLiveSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn csv-options-builder
  "The csv-options-builder function buildes out new instances of 
CsvOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delimiter` | java.lang.String | [[cdk.support/lookup-entry]] | `:delimiter` |
| `headerList` | java.util.List | [[cdk.support/lookup-entry]] | `:header-list` |"
  [stack id config]
  (let [builder (CsvOptions$Builder.)]
    (when-let [data (lookup-entry config id :delimiter)]
      (. builder delimiter data))
    (when-let [data (lookup-entry config id :header-list)]
      (. builder headerList data))
    (.build builder)))


(defn enable-scaling-props-builder
  "The enable-scaling-props-builder function buildes out new instances of 
EnableScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (EnableScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn global-secondary-index-props-builder
  "The global-secondary-index-props-builder function buildes out new instances of 
GlobalSecondaryIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `projectionType` | software.amazon.awscdk.services.dynamodb.ProjectionType | [[cdk.api.services.dynamodb/projection-type]] | `:projection-type` |
| `readCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `writeCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (GlobalSecondaryIndexProps$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (projection-type config id :projection-type)]
      (. builder projectionType data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn global-secondary-index-props-v2-builder
  "The global-secondary-index-props-v2-builder function buildes out new instances of 
GlobalSecondaryIndexPropsV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `projectionType` | software.amazon.awscdk.services.dynamodb.ProjectionType | [[cdk.api.services.dynamodb/projection-type]] | `:projection-type` |
| `readCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `writeCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (GlobalSecondaryIndexPropsV2$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (projection-type config id :projection-type)]
      (. builder projectionType data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn import-source-specification-builder
  "The import-source-specification-builder function buildes out new instances of 
ImportSourceSpecification$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `compressionType` | software.amazon.awscdk.services.dynamodb.InputCompressionType | [[cdk.api.services.dynamodb/input-compression-type]] | `:compression-type` |
| `inputFormat` | software.amazon.awscdk.services.dynamodb.InputFormat | [[cdk.support/lookup-entry]] | `:input-format` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |"
  [stack id config]
  (let [builder (ImportSourceSpecification$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (input-compression-type config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :input-format)]
      (. builder inputFormat data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (.build builder)))


(defn local-secondary-index-props-builder
  "The local-secondary-index-props-builder function buildes out new instances of 
LocalSecondaryIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `projectionType` | software.amazon.awscdk.services.dynamodb.ProjectionType | [[cdk.api.services.dynamodb/projection-type]] | `:projection-type` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |"
  [stack id config]
  (let [builder (LocalSecondaryIndexProps$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (projection-type config id :projection-type)]
      (. builder projectionType data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (.build builder)))


(defn operations-metric-options-builder
  "The operations-metric-options-builder function buildes out new instances of 
OperationsMetricOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `operations` | java.util.List | [[cdk.support/lookup-entry]] | `:operations` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (OperationsMetricOptions$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :operations)]
      (. builder operations data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn replica-global-secondary-index-options-builder
  "The replica-global-secondary-index-options-builder function buildes out new instances of 
ReplicaGlobalSecondaryIndexOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `readCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:read-capacity` |"
  [stack id config]
  (let [builder (ReplicaGlobalSecondaryIndexOptions$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (.build builder)))


(defn replica-table-props-builder
  "The replica-table-props-builder function buildes out new instances of 
ReplicaTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `globalSecondaryIndexOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:global-secondary-index-options` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `readCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (ReplicaTableProps$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :global-secondary-index-options)]
      (. builder globalSecondaryIndexOptions data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn schema-options-builder
  "The schema-options-builder function buildes out new instances of 
SchemaOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |"
  [stack id config]
  (let [builder (SchemaOptions$Builder.)]
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (.build builder)))


(defn secondary-index-props-builder
  "The secondary-index-props-builder function buildes out new instances of 
SecondaryIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `nonKeyAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:non-key-attributes` |
| `projectionType` | software.amazon.awscdk.services.dynamodb.ProjectionType | [[cdk.api.services.dynamodb/projection-type]] | `:projection-type` |"
  [stack id config]
  (let [builder (SecondaryIndexProps$Builder.)]
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :non-key-attributes)]
      (. builder nonKeyAttributes data))
    (when-let [data (projection-type config id :projection-type)]
      (. builder projectionType data))
    (.build builder)))


(defn system-errors-for-operations-metric-options-builder
  "The system-errors-for-operations-metric-options-builder function buildes out new instances of 
SystemErrorsForOperationsMetricOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `color` | java.lang.String | [[cdk.support/lookup-entry]] | `:color` |
| `dimensionsMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:dimensions-map` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `operations` | java.util.List | [[cdk.support/lookup-entry]] | `:operations` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
| `unit` | software.amazon.awscdk.services.cloudwatch.Unit | [[cdk.api.services.cloudwatch/unit]] | `:unit` |"
  [stack id config]
  (let [builder (SystemErrorsForOperationsMetricOptions$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :color)]
      (. builder color data))
    (when-let [data (lookup-entry config id :dimensions-map)]
      (. builder dimensionsMap data))
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (when-let [data (lookup-entry config id :operations)]
      (. builder operations data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (when-let [data (unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn table-attributes-builder
  "The table-attributes-builder function buildes out new instances of 
TableAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `globalIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-indexes` |
| `grantIndexPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-index-permissions` |
| `localIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-indexes` |
| `tableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-stream-arn` |"
  [stack id config]
  (let [builder (TableAttributes$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :global-indexes)]
      (. builder globalIndexes data))
    (when-let [data (lookup-entry config id :grant-index-permissions)]
      (. builder grantIndexPermissions data))
    (when-let [data (lookup-entry config id :local-indexes)]
      (. builder localIndexes data))
    (when-let [data (lookup-entry config id :table-arn)]
      (. builder tableArn data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :table-stream-arn)]
      (. builder tableStreamArn data))
    (.build builder)))


(defn table-attributes-v2-builder
  "The table-attributes-v2-builder function buildes out new instances of 
TableAttributesV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `globalIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-indexes` |
| `grantIndexPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:grant-index-permissions` |
| `localIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-indexes` |
| `tableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-arn` |
| `tableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tableStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-stream-arn` |"
  [stack id config]
  (let [builder (TableAttributesV2$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :global-indexes)]
      (. builder globalIndexes data))
    (when-let [data (lookup-entry config id :grant-index-permissions)]
      (. builder grantIndexPermissions data))
    (when-let [data (lookup-entry config id :local-indexes)]
      (. builder localIndexes data))
    (when-let [data (lookup-entry config id :table-arn)]
      (. builder tableArn data))
    (when-let [data (lookup-entry config id :table-id)]
      (. builder tableId data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :table-stream-arn)]
      (. builder tableStreamArn data))
    (.build builder)))


(defn table-builder
  "The table-builder function buildes out new instances of 
Table$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingMode` | software.amazon.awscdk.services.dynamodb.BillingMode | [[cdk.api.services.dynamodb/billing-mode]] | `:billing-mode` |
| `contributorInsightsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `encryption` | software.amazon.awscdk.services.dynamodb.TableEncryption | [[cdk.api.services.dynamodb/table-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `importSource` | software.amazon.awscdk.services.dynamodb.ImportSourceSpecification | [[cdk.support/lookup-entry]] | `:import-source` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `readCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicationRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-regions` |
| `replicationTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:replication-timeout` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `stream` | software.amazon.awscdk.services.dynamodb.StreamViewType | [[cdk.api.services.dynamodb/stream-view-type]] | `:stream` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeToLiveAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-to-live-attribute` |
| `waitForReplicationToFinish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-for-replication-to-finish` |
| `writeCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (Table$Builder/create stack id)]
    (when-let [data (billing-mode config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :contributor-insights-enabled)]
      (. builder contributorInsightsEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (table-encryption config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :import-source)]
      (. builder importSource data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replication-regions)]
      (. builder replicationRegions data))
    (when-let [data (lookup-entry config id :replication-timeout)]
      (. builder replicationTimeout data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (stream-view-type config id :stream)]
      (. builder stream data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :time-to-live-attribute)]
      (. builder timeToLiveAttribute data))
    (when-let [data (lookup-entry config id :wait-for-replication-to-finish)]
      (. builder waitForReplicationToFinish data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn table-options-builder
  "The table-options-builder function buildes out new instances of 
TableOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingMode` | software.amazon.awscdk.services.dynamodb.BillingMode | [[cdk.api.services.dynamodb/billing-mode]] | `:billing-mode` |
| `contributorInsightsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `encryption` | software.amazon.awscdk.services.dynamodb.TableEncryption | [[cdk.api.services.dynamodb/table-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `importSource` | software.amazon.awscdk.services.dynamodb.ImportSourceSpecification | [[cdk.support/lookup-entry]] | `:import-source` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `readCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicationRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-regions` |
| `replicationTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:replication-timeout` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `stream` | software.amazon.awscdk.services.dynamodb.StreamViewType | [[cdk.api.services.dynamodb/stream-view-type]] | `:stream` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `timeToLiveAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-to-live-attribute` |
| `waitForReplicationToFinish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-for-replication-to-finish` |
| `writeCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (TableOptions$Builder.)]
    (when-let [data (billing-mode config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :contributor-insights-enabled)]
      (. builder contributorInsightsEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (table-encryption config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :import-source)]
      (. builder importSource data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replication-regions)]
      (. builder replicationRegions data))
    (when-let [data (lookup-entry config id :replication-timeout)]
      (. builder replicationTimeout data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (stream-view-type config id :stream)]
      (. builder stream data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :time-to-live-attribute)]
      (. builder timeToLiveAttribute data))
    (when-let [data (lookup-entry config id :wait-for-replication-to-finish)]
      (. builder waitForReplicationToFinish data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn table-options-v2-builder
  "The table-options-v2-builder function buildes out new instances of 
TableOptionsV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (TableOptionsV2$Builder.)]
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn table-props-builder
  "The table-props-builder function buildes out new instances of 
TableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingMode` | software.amazon.awscdk.services.dynamodb.BillingMode | [[cdk.api.services.dynamodb/billing-mode]] | `:billing-mode` |
| `contributorInsightsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights-enabled` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `encryption` | software.amazon.awscdk.services.dynamodb.TableEncryption | [[cdk.api.services.dynamodb/table-encryption]] | `:encryption` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `importSource` | software.amazon.awscdk.services.dynamodb.ImportSourceSpecification | [[cdk.support/lookup-entry]] | `:import-source` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `readCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicationRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replication-regions` |
| `replicationTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:replication-timeout` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `stream` | software.amazon.awscdk.services.dynamodb.StreamViewType | [[cdk.api.services.dynamodb/stream-view-type]] | `:stream` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timeToLiveAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-to-live-attribute` |
| `waitForReplicationToFinish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:wait-for-replication-to-finish` |
| `writeCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (TableProps$Builder.)]
    (when-let [data (billing-mode config id :billing-mode)]
      (. builder billingMode data))
    (when-let [data (lookup-entry config id :contributor-insights-enabled)]
      (. builder contributorInsightsEnabled data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (table-encryption config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :import-source)]
      (. builder importSource data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replication-regions)]
      (. builder replicationRegions data))
    (when-let [data (lookup-entry config id :replication-timeout)]
      (. builder replicationTimeout data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (stream-view-type config id :stream)]
      (. builder stream data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :time-to-live-attribute)]
      (. builder timeToLiveAttribute data))
    (when-let [data (lookup-entry config id :wait-for-replication-to-finish)]
      (. builder waitForReplicationToFinish data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn table-props-v2-builder
  "The table-props-v2-builder function buildes out new instances of 
TablePropsV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billing` | software.amazon.awscdk.services.dynamodb.Billing | [[cdk.support/lookup-entry]] | `:billing` |
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `dynamoStream` | software.amazon.awscdk.services.dynamodb.StreamViewType | [[cdk.api.services.dynamodb/stream-view-type]] | `:dynamo-stream` |
| `encryption` | software.amazon.awscdk.services.dynamodb.TableEncryptionV2 | [[cdk.support/lookup-entry]] | `:encryption` |
| `globalSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `localSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicas` | java.util.List | [[cdk.support/lookup-entry]] | `:replicas` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeToLiveAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-to-live-attribute` |"
  [stack id config]
  (let [builder (TablePropsV2$Builder.)]
    (when-let [data (lookup-entry config id :billing)]
      (. builder billing data))
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (stream-view-type config id :dynamo-stream)]
      (. builder dynamoStream data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replicas)]
      (. builder replicas data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-to-live-attribute)]
      (. builder timeToLiveAttribute data))
    (.build builder)))


(defn table-v2-builder
  "The table-v2-builder function buildes out new instances of 
TableV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billing` | software.amazon.awscdk.services.dynamodb.Billing | [[cdk.support/lookup-entry]] | `:billing` |
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `dynamoStream` | software.amazon.awscdk.services.dynamodb.StreamViewType | [[cdk.api.services.dynamodb/stream-view-type]] | `:dynamo-stream` |
| `encryption` | software.amazon.awscdk.services.dynamodb.TableEncryptionV2 | [[cdk.support/lookup-entry]] | `:encryption` |
| `globalSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:global-secondary-indexes` |
| `kinesisStream` | software.amazon.awscdk.services.kinesis.IStream | [[cdk.support/lookup-entry]] | `:kinesis-stream` |
| `localSecondaryIndexes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-secondary-indexes` |
| `partitionKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:partition-key` |
| `pointInTimeRecovery` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:point-in-time-recovery` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicas` | java.util.List | [[cdk.support/lookup-entry]] | `:replicas` |
| `resourcePolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `sortKey` | software.amazon.awscdk.services.dynamodb.Attribute | [[cdk.support/lookup-entry]] | `:sort-key` |
| `tableClass` | software.amazon.awscdk.services.dynamodb.TableClass | [[cdk.api.services.dynamodb/table-class]] | `:table-class` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeToLiveAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-to-live-attribute` |"
  [stack id config]
  (let [builder (TableV2$Builder/create stack id)]
    (when-let [data (lookup-entry config id :billing)]
      (. builder billing data))
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (stream-view-type config id :dynamo-stream)]
      (. builder dynamoStream data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :global-secondary-indexes)]
      (. builder globalSecondaryIndexes data))
    (when-let [data (lookup-entry config id :kinesis-stream)]
      (. builder kinesisStream data))
    (when-let [data (lookup-entry config id :local-secondary-indexes)]
      (. builder localSecondaryIndexes data))
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :point-in-time-recovery)]
      (. builder pointInTimeRecovery data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replicas)]
      (. builder replicas data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :sort-key)]
      (. builder sortKey data))
    (when-let [data (table-class config id :table-class)]
      (. builder tableClass data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-to-live-attribute)]
      (. builder timeToLiveAttribute data))
    (.build builder)))


(defn throughput-props-builder
  "The throughput-props-builder function buildes out new instances of 
ThroughputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `readCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:read-capacity` |
| `writeCapacity` | software.amazon.awscdk.services.dynamodb.Capacity | [[cdk.support/lookup-entry]] | `:write-capacity` |"
  [stack id config]
  (let [builder (ThroughputProps$Builder.)]
    (when-let [data (lookup-entry config id :read-capacity)]
      (. builder readCapacity data))
    (when-let [data (lookup-entry config id :write-capacity)]
      (. builder writeCapacity data))
    (.build builder)))


(defn utilization-scaling-props-builder
  "The utilization-scaling-props-builder function buildes out new instances of 
UtilizationScalingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableScaleIn` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-scale-in` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `scaleInCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-in-cooldown` |
| `scaleOutCooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:scale-out-cooldown` |
| `targetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-utilization-percent` |"
  [stack id config]
  (let [builder (UtilizationScalingProps$Builder.)]
    (when-let [data (lookup-entry config id :disable-scale-in)]
      (. builder disableScaleIn data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :scale-in-cooldown)]
      (. builder scaleInCooldown data))
    (when-let [data (lookup-entry config id :scale-out-cooldown)]
      (. builder scaleOutCooldown data))
    (when-let [data (lookup-entry config id :target-utilization-percent)]
      (. builder targetUtilizationPercent data))
    (.build builder)))