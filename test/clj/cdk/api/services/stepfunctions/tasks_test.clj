(ns cdk.api.services.stepfunctions.tasks-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.stepfunctions.tasks package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.stepfunctions.tasks :refer [action-on-failure
                                                          assemble-with
                                                          auth-type
                                                          batch-strategy
                                                          compression-type
                                                          dynamo-consumed-capacity
                                                          dynamo-item-collection-metrics
                                                          dynamo-return-values
                                                          emr-create-cluster-cloud-watch-alarm-comparison-operator
                                                          emr-create-cluster-cloud-watch-alarm-statistic
                                                          emr-create-cluster-cloud-watch-alarm-unit
                                                          emr-create-cluster-ebs-block-device-volume-type
                                                          emr-create-cluster-emr-cluster-scale-down-behavior
                                                          emr-create-cluster-instance-market
                                                          emr-create-cluster-instance-role-type
                                                          emr-create-cluster-on-demand-allocation-strategy
                                                          emr-create-cluster-scaling-adjustment-type
                                                          emr-create-cluster-spot-allocation-strategy
                                                          emr-create-cluster-spot-timeout-action
                                                          encryption-option
                                                          http-method
                                                          http-methods
                                                          input-mode
                                                          lambda-invocation-type
                                                          message-attribute-data-type
                                                          mode
                                                          record-wrapper-type
                                                          s3-data-distribution-type
                                                          s3-data-type
                                                          split-type
                                                          url-encoding-format
                                                          worker-type]])
  (:import [software.amazon.awscdk.services.stepfunctions.tasks ActionOnFailure
                                                                AssembleWith
                                                                AuthType
                                                                BatchStrategy
                                                                CompressionType
                                                                DynamoConsumedCapacity
                                                                DynamoItemCollectionMetrics
                                                                DynamoReturnValues
                                                                EmrCreateCluster$CloudWatchAlarmComparisonOperator
                                                                EmrCreateCluster$CloudWatchAlarmStatistic
                                                                EmrCreateCluster$CloudWatchAlarmUnit
                                                                EmrCreateCluster$EbsBlockDeviceVolumeType
                                                                EmrCreateCluster$EmrClusterScaleDownBehavior
                                                                EmrCreateCluster$InstanceMarket
                                                                EmrCreateCluster$InstanceRoleType
                                                                EmrCreateCluster$OnDemandAllocationStrategy
                                                                EmrCreateCluster$ScalingAdjustmentType
                                                                EmrCreateCluster$SpotAllocationStrategy
                                                                EmrCreateCluster$SpotTimeoutAction
                                                                EncryptionOption
                                                                HttpMethod
                                                                HttpMethods
                                                                InputMode
                                                                LambdaInvocationType
                                                                MessageAttributeDataType
                                                                Mode
                                                                RecordWrapperType
                                                                S3DataDistributionType
                                                                S3DataType
                                                                SplitType
                                                                URLEncodingFormat
                                                                WorkerType]))


(deftest action-on-failure-test
  (testing "Testing enum function action-on-failure"
    (is (= ActionOnFailure/CANCEL_AND_WAIT (action-on-failure {:item ActionOnFailure/CANCEL_AND_WAIT} "test" :item)))
    (is (= ActionOnFailure/CANCEL_AND_WAIT (action-on-failure {:test/item ActionOnFailure/CANCEL_AND_WAIT} "test" :item)))
    (is (= ActionOnFailure/CONTINUE (action-on-failure {:item ActionOnFailure/CONTINUE} "test" :item)))
    (is (= ActionOnFailure/CONTINUE (action-on-failure {:test/item ActionOnFailure/CONTINUE} "test" :item)))
    (is (= ActionOnFailure/TERMINATE_CLUSTER (action-on-failure {:item ActionOnFailure/TERMINATE_CLUSTER} "test" :item)))
    (is (= ActionOnFailure/TERMINATE_CLUSTER (action-on-failure {:test/item ActionOnFailure/TERMINATE_CLUSTER} "test" :item)))
    (is (= ActionOnFailure/CANCEL_AND_WAIT (action-on-failure {:item :cancel-and-wait} "test" :item)))
    (is (= ActionOnFailure/CANCEL_AND_WAIT (action-on-failure {:test/item :cancel-and-wait} "test" :item)))
    (is (= ActionOnFailure/CONTINUE (action-on-failure {:item :continue} "test" :item)))
    (is (= ActionOnFailure/CONTINUE (action-on-failure {:test/item :continue} "test" :item)))
    (is (= ActionOnFailure/TERMINATE_CLUSTER (action-on-failure {:item :terminate-cluster} "test" :item)))
    (is (= ActionOnFailure/TERMINATE_CLUSTER (action-on-failure {:test/item :terminate-cluster} "test" :item)))))


(deftest assemble-with-test
  (testing "Testing enum function assemble-with"
    (is (= AssembleWith/LINE (assemble-with {:item AssembleWith/LINE} "test" :item)))
    (is (= AssembleWith/LINE (assemble-with {:test/item AssembleWith/LINE} "test" :item)))
    (is (= AssembleWith/NONE (assemble-with {:item AssembleWith/NONE} "test" :item)))
    (is (= AssembleWith/NONE (assemble-with {:test/item AssembleWith/NONE} "test" :item)))
    (is (= AssembleWith/LINE (assemble-with {:item :line} "test" :item)))
    (is (= AssembleWith/LINE (assemble-with {:test/item :line} "test" :item)))
    (is (= AssembleWith/NONE (assemble-with {:item :none} "test" :item)))
    (is (= AssembleWith/NONE (assemble-with {:test/item :none} "test" :item)))))


(deftest auth-type-test
  (testing "Testing enum function auth-type"
    (is (= AuthType/NO_AUTH (auth-type {:item AuthType/NO_AUTH} "test" :item)))
    (is (= AuthType/NO_AUTH (auth-type {:test/item AuthType/NO_AUTH} "test" :item)))
    (is (= AuthType/IAM_ROLE (auth-type {:item AuthType/IAM_ROLE} "test" :item)))
    (is (= AuthType/IAM_ROLE (auth-type {:test/item AuthType/IAM_ROLE} "test" :item)))
    (is (= AuthType/RESOURCE_POLICY (auth-type {:item AuthType/RESOURCE_POLICY} "test" :item)))
    (is (= AuthType/RESOURCE_POLICY (auth-type {:test/item AuthType/RESOURCE_POLICY} "test" :item)))
    (is (= AuthType/NO_AUTH (auth-type {:item :no-auth} "test" :item)))
    (is (= AuthType/NO_AUTH (auth-type {:test/item :no-auth} "test" :item)))
    (is (= AuthType/IAM_ROLE (auth-type {:item :iam-role} "test" :item)))
    (is (= AuthType/IAM_ROLE (auth-type {:test/item :iam-role} "test" :item)))
    (is (= AuthType/RESOURCE_POLICY (auth-type {:item :resource-policy} "test" :item)))
    (is (= AuthType/RESOURCE_POLICY (auth-type {:test/item :resource-policy} "test" :item)))))


(deftest batch-strategy-test
  (testing "Testing enum function batch-strategy"
    (is (= BatchStrategy/SINGLE_RECORD (batch-strategy {:item BatchStrategy/SINGLE_RECORD} "test" :item)))
    (is (= BatchStrategy/SINGLE_RECORD (batch-strategy {:test/item BatchStrategy/SINGLE_RECORD} "test" :item)))
    (is (= BatchStrategy/MULTI_RECORD (batch-strategy {:item BatchStrategy/MULTI_RECORD} "test" :item)))
    (is (= BatchStrategy/MULTI_RECORD (batch-strategy {:test/item BatchStrategy/MULTI_RECORD} "test" :item)))
    (is (= BatchStrategy/SINGLE_RECORD (batch-strategy {:item :single-record} "test" :item)))
    (is (= BatchStrategy/SINGLE_RECORD (batch-strategy {:test/item :single-record} "test" :item)))
    (is (= BatchStrategy/MULTI_RECORD (batch-strategy {:item :multi-record} "test" :item)))
    (is (= BatchStrategy/MULTI_RECORD (batch-strategy {:test/item :multi-record} "test" :item)))))


(deftest compression-type-test
  (testing "Testing enum function compression-type"
    (is (= CompressionType/GZIP (compression-type {:item CompressionType/GZIP} "test" :item)))
    (is (= CompressionType/GZIP (compression-type {:test/item CompressionType/GZIP} "test" :item)))
    (is (= CompressionType/NONE (compression-type {:item CompressionType/NONE} "test" :item)))
    (is (= CompressionType/NONE (compression-type {:test/item CompressionType/NONE} "test" :item)))
    (is (= CompressionType/GZIP (compression-type {:item :gzip} "test" :item)))
    (is (= CompressionType/GZIP (compression-type {:test/item :gzip} "test" :item)))
    (is (= CompressionType/NONE (compression-type {:item :none} "test" :item)))
    (is (= CompressionType/NONE (compression-type {:test/item :none} "test" :item)))))


(deftest dynamo-consumed-capacity-test
  (testing "Testing enum function dynamo-consumed-capacity"
    (is (= DynamoConsumedCapacity/TOTAL (dynamo-consumed-capacity {:item DynamoConsumedCapacity/TOTAL} "test" :item)))
    (is (= DynamoConsumedCapacity/TOTAL (dynamo-consumed-capacity {:test/item DynamoConsumedCapacity/TOTAL} "test" :item)))
    (is (= DynamoConsumedCapacity/INDEXES (dynamo-consumed-capacity {:item DynamoConsumedCapacity/INDEXES} "test" :item)))
    (is (= DynamoConsumedCapacity/INDEXES (dynamo-consumed-capacity {:test/item DynamoConsumedCapacity/INDEXES} "test" :item)))
    (is (= DynamoConsumedCapacity/NONE (dynamo-consumed-capacity {:item DynamoConsumedCapacity/NONE} "test" :item)))
    (is (= DynamoConsumedCapacity/NONE (dynamo-consumed-capacity {:test/item DynamoConsumedCapacity/NONE} "test" :item)))
    (is (= DynamoConsumedCapacity/TOTAL (dynamo-consumed-capacity {:item :total} "test" :item)))
    (is (= DynamoConsumedCapacity/TOTAL (dynamo-consumed-capacity {:test/item :total} "test" :item)))
    (is (= DynamoConsumedCapacity/INDEXES (dynamo-consumed-capacity {:item :indexes} "test" :item)))
    (is (= DynamoConsumedCapacity/INDEXES (dynamo-consumed-capacity {:test/item :indexes} "test" :item)))
    (is (= DynamoConsumedCapacity/NONE (dynamo-consumed-capacity {:item :none} "test" :item)))
    (is (= DynamoConsumedCapacity/NONE (dynamo-consumed-capacity {:test/item :none} "test" :item)))))


(deftest dynamo-item-collection-metrics-test
  (testing "Testing enum function dynamo-item-collection-metrics"
    (is (= DynamoItemCollectionMetrics/SIZE (dynamo-item-collection-metrics {:item DynamoItemCollectionMetrics/SIZE} "test" :item)))
    (is (= DynamoItemCollectionMetrics/SIZE (dynamo-item-collection-metrics {:test/item DynamoItemCollectionMetrics/SIZE} "test" :item)))
    (is (= DynamoItemCollectionMetrics/NONE (dynamo-item-collection-metrics {:item DynamoItemCollectionMetrics/NONE} "test" :item)))
    (is (= DynamoItemCollectionMetrics/NONE (dynamo-item-collection-metrics {:test/item DynamoItemCollectionMetrics/NONE} "test" :item)))
    (is (= DynamoItemCollectionMetrics/SIZE (dynamo-item-collection-metrics {:item :size} "test" :item)))
    (is (= DynamoItemCollectionMetrics/SIZE (dynamo-item-collection-metrics {:test/item :size} "test" :item)))
    (is (= DynamoItemCollectionMetrics/NONE (dynamo-item-collection-metrics {:item :none} "test" :item)))
    (is (= DynamoItemCollectionMetrics/NONE (dynamo-item-collection-metrics {:test/item :none} "test" :item)))))


(deftest dynamo-return-values-test
  (testing "Testing enum function dynamo-return-values"
    (is (= DynamoReturnValues/UPDATED_OLD (dynamo-return-values {:item DynamoReturnValues/UPDATED_OLD} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_OLD (dynamo-return-values {:test/item DynamoReturnValues/UPDATED_OLD} "test" :item)))
    (is (= DynamoReturnValues/ALL_OLD (dynamo-return-values {:item DynamoReturnValues/ALL_OLD} "test" :item)))
    (is (= DynamoReturnValues/ALL_OLD (dynamo-return-values {:test/item DynamoReturnValues/ALL_OLD} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_NEW (dynamo-return-values {:item DynamoReturnValues/UPDATED_NEW} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_NEW (dynamo-return-values {:test/item DynamoReturnValues/UPDATED_NEW} "test" :item)))
    (is (= DynamoReturnValues/NONE (dynamo-return-values {:item DynamoReturnValues/NONE} "test" :item)))
    (is (= DynamoReturnValues/NONE (dynamo-return-values {:test/item DynamoReturnValues/NONE} "test" :item)))
    (is (= DynamoReturnValues/ALL_NEW (dynamo-return-values {:item DynamoReturnValues/ALL_NEW} "test" :item)))
    (is (= DynamoReturnValues/ALL_NEW (dynamo-return-values {:test/item DynamoReturnValues/ALL_NEW} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_OLD (dynamo-return-values {:item :updated-old} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_OLD (dynamo-return-values {:test/item :updated-old} "test" :item)))
    (is (= DynamoReturnValues/ALL_OLD (dynamo-return-values {:item :all-old} "test" :item)))
    (is (= DynamoReturnValues/ALL_OLD (dynamo-return-values {:test/item :all-old} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_NEW (dynamo-return-values {:item :updated-new} "test" :item)))
    (is (= DynamoReturnValues/UPDATED_NEW (dynamo-return-values {:test/item :updated-new} "test" :item)))
    (is (= DynamoReturnValues/NONE (dynamo-return-values {:item :none} "test" :item)))
    (is (= DynamoReturnValues/NONE (dynamo-return-values {:test/item :none} "test" :item)))
    (is (= DynamoReturnValues/ALL_NEW (dynamo-return-values {:item :all-new} "test" :item)))
    (is (= DynamoReturnValues/ALL_NEW (dynamo-return-values {:test/item :all-new} "test" :item)))))


(deftest emr-create-cluster-cloud-watch-alarm-comparison-operator-test
  (testing "Testing enum function emr-create-cluster-cloud-watch-alarm-comparison-operator"
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item :less-than-or-equal} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item :less-than-or-equal} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item :greater-than} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item :greater-than} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item :less-than} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item :less-than} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:item :greater-than-or-equal} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL (emr-create-cluster-cloud-watch-alarm-comparison-operator {:test/item :greater-than-or-equal} "test" :item)))))


(deftest emr-create-cluster-cloud-watch-alarm-statistic-test
  (testing "Testing enum function emr-create-cluster-cloud-watch-alarm-statistic"
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT (emr-create-cluster-cloud-watch-alarm-statistic {:item EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT (emr-create-cluster-cloud-watch-alarm-statistic {:test/item EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:item EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:item EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SUM (emr-create-cluster-cloud-watch-alarm-statistic {:item EmrCreateCluster$CloudWatchAlarmStatistic/SUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item EmrCreateCluster$CloudWatchAlarmStatistic/SUM} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE (emr-create-cluster-cloud-watch-alarm-statistic {:item EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE (emr-create-cluster-cloud-watch-alarm-statistic {:test/item EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT (emr-create-cluster-cloud-watch-alarm-statistic {:item :sample-count} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT (emr-create-cluster-cloud-watch-alarm-statistic {:test/item :sample-count} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:item :maximum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item :maximum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:item :minimum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item :minimum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SUM (emr-create-cluster-cloud-watch-alarm-statistic {:item :sum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/SUM (emr-create-cluster-cloud-watch-alarm-statistic {:test/item :sum} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE (emr-create-cluster-cloud-watch-alarm-statistic {:item :average} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE (emr-create-cluster-cloud-watch-alarm-statistic {:test/item :average} "test" :item)))))


(deftest emr-create-cluster-cloud-watch-alarm-unit-test
  (testing "Testing enum function emr-create-cluster-cloud-watch-alarm-unit"
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/COUNT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/COUNT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/PERCENT (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/PERCENT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/PERCENT (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/PERCENT} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/NONE (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/NONE} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/NONE (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/NONE} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/SECONDS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/BITS} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :giga-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :giga-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :giga-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :giga-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :mega-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :mega-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item :milli-seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :milli-seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT (emr-create-cluster-cloud-watch-alarm-unit {:item :count} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT (emr-create-cluster-cloud-watch-alarm-unit {:test/item :count} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item :giga-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :giga-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item :tera-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :tera-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item :tera-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item :tera-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/PERCENT (emr-create-cluster-cloud-watch-alarm-unit {:item :percent} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/PERCENT (emr-create-cluster-cloud-watch-alarm-unit {:test/item :percent} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :tera-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :tera-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item :kilo-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item :kilo-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :count-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :count-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/NONE (emr-create-cluster-cloud-watch-alarm-unit {:item :none} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/NONE (emr-create-cluster-cloud-watch-alarm-unit {:test/item :none} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :kilo-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :kilo-bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item :mega-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item :mega-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item :bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item :bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item :micro-seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :micro-seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:item :giga-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES (emr-create-cluster-cloud-watch-alarm-unit {:test/item :giga-bytes} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:item :seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/SECONDS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :seconds} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :mega-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :mega-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item :mega-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :mega-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :bits-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS (emr-create-cluster-cloud-watch-alarm-unit {:item :kilo-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :kilo-bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS (emr-create-cluster-cloud-watch-alarm-unit {:item :bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/BITS (emr-create-cluster-cloud-watch-alarm-unit {:test/item :bits} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :kilo-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :kilo-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:item :tera-bytes-per-second} "test" :item)))
    (is (= EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND (emr-create-cluster-cloud-watch-alarm-unit {:test/item :tera-bytes-per-second} "test" :item)))))


(deftest emr-create-cluster-ebs-block-device-volume-type-test
  (testing "Testing enum function emr-create-cluster-ebs-block-device-volume-type"
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/IO1 (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/IO1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/IO1 (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/IO1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP3 (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/GP3} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP3 (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/GP3} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/ST1 (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/ST1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/ST1 (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/ST1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/SC1 (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/SC1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/SC1 (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/SC1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP2 (emr-create-cluster-ebs-block-device-volume-type {:item EmrCreateCluster$EbsBlockDeviceVolumeType/GP2} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP2 (emr-create-cluster-ebs-block-device-volume-type {:test/item EmrCreateCluster$EbsBlockDeviceVolumeType/GP2} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/IO1 (emr-create-cluster-ebs-block-device-volume-type {:item :io1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/IO1 (emr-create-cluster-ebs-block-device-volume-type {:test/item :io1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP3 (emr-create-cluster-ebs-block-device-volume-type {:item :gp3} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP3 (emr-create-cluster-ebs-block-device-volume-type {:test/item :gp3} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/ST1 (emr-create-cluster-ebs-block-device-volume-type {:item :st1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/ST1 (emr-create-cluster-ebs-block-device-volume-type {:test/item :st1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/SC1 (emr-create-cluster-ebs-block-device-volume-type {:item :sc1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/SC1 (emr-create-cluster-ebs-block-device-volume-type {:test/item :sc1} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD (emr-create-cluster-ebs-block-device-volume-type {:item :standard} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD (emr-create-cluster-ebs-block-device-volume-type {:test/item :standard} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP2 (emr-create-cluster-ebs-block-device-volume-type {:item :gp2} "test" :item)))
    (is (= EmrCreateCluster$EbsBlockDeviceVolumeType/GP2 (emr-create-cluster-ebs-block-device-volume-type {:test/item :gp2} "test" :item)))))


(deftest emr-create-cluster-emr-cluster-scale-down-behavior-test
  (testing "Testing enum function emr-create-cluster-emr-cluster-scale-down-behavior"
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR (emr-create-cluster-emr-cluster-scale-down-behavior {:item EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR (emr-create-cluster-emr-cluster-scale-down-behavior {:test/item EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION (emr-create-cluster-emr-cluster-scale-down-behavior {:item EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION (emr-create-cluster-emr-cluster-scale-down-behavior {:test/item EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR (emr-create-cluster-emr-cluster-scale-down-behavior {:item :terminate-at-instance-hour} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR (emr-create-cluster-emr-cluster-scale-down-behavior {:test/item :terminate-at-instance-hour} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION (emr-create-cluster-emr-cluster-scale-down-behavior {:item :terminate-at-task-completion} "test" :item)))
    (is (= EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION (emr-create-cluster-emr-cluster-scale-down-behavior {:test/item :terminate-at-task-completion} "test" :item)))))


(deftest emr-create-cluster-instance-market-test
  (testing "Testing enum function emr-create-cluster-instance-market"
    (is (= EmrCreateCluster$InstanceMarket/SPOT (emr-create-cluster-instance-market {:item EmrCreateCluster$InstanceMarket/SPOT} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/SPOT (emr-create-cluster-instance-market {:test/item EmrCreateCluster$InstanceMarket/SPOT} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/ON_DEMAND (emr-create-cluster-instance-market {:item EmrCreateCluster$InstanceMarket/ON_DEMAND} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/ON_DEMAND (emr-create-cluster-instance-market {:test/item EmrCreateCluster$InstanceMarket/ON_DEMAND} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/SPOT (emr-create-cluster-instance-market {:item :spot} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/SPOT (emr-create-cluster-instance-market {:test/item :spot} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/ON_DEMAND (emr-create-cluster-instance-market {:item :on-demand} "test" :item)))
    (is (= EmrCreateCluster$InstanceMarket/ON_DEMAND (emr-create-cluster-instance-market {:test/item :on-demand} "test" :item)))))


(deftest emr-create-cluster-instance-role-type-test
  (testing "Testing enum function emr-create-cluster-instance-role-type"
    (is (= EmrCreateCluster$InstanceRoleType/MASTER (emr-create-cluster-instance-role-type {:item EmrCreateCluster$InstanceRoleType/MASTER} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/MASTER (emr-create-cluster-instance-role-type {:test/item EmrCreateCluster$InstanceRoleType/MASTER} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/CORE (emr-create-cluster-instance-role-type {:item EmrCreateCluster$InstanceRoleType/CORE} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/CORE (emr-create-cluster-instance-role-type {:test/item EmrCreateCluster$InstanceRoleType/CORE} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/TASK (emr-create-cluster-instance-role-type {:item EmrCreateCluster$InstanceRoleType/TASK} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/TASK (emr-create-cluster-instance-role-type {:test/item EmrCreateCluster$InstanceRoleType/TASK} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/MASTER (emr-create-cluster-instance-role-type {:item :master} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/MASTER (emr-create-cluster-instance-role-type {:test/item :master} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/CORE (emr-create-cluster-instance-role-type {:item :core} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/CORE (emr-create-cluster-instance-role-type {:test/item :core} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/TASK (emr-create-cluster-instance-role-type {:item :task} "test" :item)))
    (is (= EmrCreateCluster$InstanceRoleType/TASK (emr-create-cluster-instance-role-type {:test/item :task} "test" :item)))))


(deftest emr-create-cluster-on-demand-allocation-strategy-test
  (testing "Testing enum function emr-create-cluster-on-demand-allocation-strategy"
    (is (= EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE (emr-create-cluster-on-demand-allocation-strategy {:item EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE (emr-create-cluster-on-demand-allocation-strategy {:test/item EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE (emr-create-cluster-on-demand-allocation-strategy {:item :lowest-price} "test" :item)))
    (is (= EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE (emr-create-cluster-on-demand-allocation-strategy {:test/item :lowest-price} "test" :item)))))


(deftest emr-create-cluster-scaling-adjustment-type-test
  (testing "Testing enum function emr-create-cluster-scaling-adjustment-type"
    (is (= EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item :exact-capacity} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item :exact-capacity} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item :change-in-capacity} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item :change-in-capacity} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:item :percent-change-in-capacity} "test" :item)))
    (is (= EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY (emr-create-cluster-scaling-adjustment-type {:test/item :percent-change-in-capacity} "test" :item)))))


(deftest emr-create-cluster-spot-allocation-strategy-test
  (testing "Testing enum function emr-create-cluster-spot-allocation-strategy"
    (is (= EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:item EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:test/item EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED (emr-create-cluster-spot-allocation-strategy {:item EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED (emr-create-cluster-spot-allocation-strategy {:test/item EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE (emr-create-cluster-spot-allocation-strategy {:item EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE (emr-create-cluster-spot-allocation-strategy {:test/item EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:item EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:test/item EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:item :price-capacity-optimized} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:test/item :price-capacity-optimized} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED (emr-create-cluster-spot-allocation-strategy {:item :diversified} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED (emr-create-cluster-spot-allocation-strategy {:test/item :diversified} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE (emr-create-cluster-spot-allocation-strategy {:item :lowest-price} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE (emr-create-cluster-spot-allocation-strategy {:test/item :lowest-price} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:item :capacity-optimized} "test" :item)))
    (is (= EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED (emr-create-cluster-spot-allocation-strategy {:test/item :capacity-optimized} "test" :item)))))


(deftest emr-create-cluster-spot-timeout-action-test
  (testing "Testing enum function emr-create-cluster-spot-timeout-action"
    (is (= EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND (emr-create-cluster-spot-timeout-action {:item EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND (emr-create-cluster-spot-timeout-action {:test/item EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER (emr-create-cluster-spot-timeout-action {:item EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER (emr-create-cluster-spot-timeout-action {:test/item EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND (emr-create-cluster-spot-timeout-action {:item :switch-to-on-demand} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND (emr-create-cluster-spot-timeout-action {:test/item :switch-to-on-demand} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER (emr-create-cluster-spot-timeout-action {:item :terminate-cluster} "test" :item)))
    (is (= EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER (emr-create-cluster-spot-timeout-action {:test/item :terminate-cluster} "test" :item)))))


(deftest encryption-option-test
  (testing "Testing enum function encryption-option"
    (is (= EncryptionOption/KMS (encryption-option {:item EncryptionOption/KMS} "test" :item)))
    (is (= EncryptionOption/KMS (encryption-option {:test/item EncryptionOption/KMS} "test" :item)))
    (is (= EncryptionOption/CLIENT_SIDE_KMS (encryption-option {:item EncryptionOption/CLIENT_SIDE_KMS} "test" :item)))
    (is (= EncryptionOption/CLIENT_SIDE_KMS (encryption-option {:test/item EncryptionOption/CLIENT_SIDE_KMS} "test" :item)))
    (is (= EncryptionOption/S3_MANAGED (encryption-option {:item EncryptionOption/S3_MANAGED} "test" :item)))
    (is (= EncryptionOption/S3_MANAGED (encryption-option {:test/item EncryptionOption/S3_MANAGED} "test" :item)))
    (is (= EncryptionOption/KMS (encryption-option {:item :kms} "test" :item)))
    (is (= EncryptionOption/KMS (encryption-option {:test/item :kms} "test" :item)))
    (is (= EncryptionOption/CLIENT_SIDE_KMS (encryption-option {:item :client-side-kms} "test" :item)))
    (is (= EncryptionOption/CLIENT_SIDE_KMS (encryption-option {:test/item :client-side-kms} "test" :item)))
    (is (= EncryptionOption/S3_MANAGED (encryption-option {:item :s3-managed} "test" :item)))
    (is (= EncryptionOption/S3_MANAGED (encryption-option {:test/item :s3-managed} "test" :item)))))


(deftest http-method-test
  (testing "Testing enum function http-method"
    (is (= HttpMethod/GET (http-method {:item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item :get} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item :get} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item :head} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item :head} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item :options} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item :options} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item :post} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item :post} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item :put} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item :put} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item :patch} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item :patch} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item :delete} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item :delete} "test" :item)))))


(deftest http-methods-test
  (testing "Testing enum function http-methods"
    (is (= HttpMethods/DELETE (http-methods {:item HttpMethods/DELETE} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:test/item HttpMethods/DELETE} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:item HttpMethods/PUT} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:test/item HttpMethods/PUT} "test" :item)))
    (is (= HttpMethods/PATCH (http-methods {:item HttpMethods/PATCH} "test" :item)))
    (is (= HttpMethods/PATCH (http-methods {:test/item HttpMethods/PATCH} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:item HttpMethods/POST} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:test/item HttpMethods/POST} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:item HttpMethods/GET} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:test/item HttpMethods/GET} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:item HttpMethods/HEAD} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:test/item HttpMethods/HEAD} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:item :delete} "test" :item)))
    (is (= HttpMethods/DELETE (http-methods {:test/item :delete} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:item :put} "test" :item)))
    (is (= HttpMethods/PUT (http-methods {:test/item :put} "test" :item)))
    (is (= HttpMethods/PATCH (http-methods {:item :patch} "test" :item)))
    (is (= HttpMethods/PATCH (http-methods {:test/item :patch} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:item :post} "test" :item)))
    (is (= HttpMethods/POST (http-methods {:test/item :post} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:item :get} "test" :item)))
    (is (= HttpMethods/GET (http-methods {:test/item :get} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:item :head} "test" :item)))
    (is (= HttpMethods/HEAD (http-methods {:test/item :head} "test" :item)))))


(deftest input-mode-test
  (testing "Testing enum function input-mode"
    (is (= InputMode/PIPE (input-mode {:item InputMode/PIPE} "test" :item)))
    (is (= InputMode/PIPE (input-mode {:test/item InputMode/PIPE} "test" :item)))
    (is (= InputMode/FILE (input-mode {:item InputMode/FILE} "test" :item)))
    (is (= InputMode/FILE (input-mode {:test/item InputMode/FILE} "test" :item)))
    (is (= InputMode/FAST_FILE (input-mode {:item InputMode/FAST_FILE} "test" :item)))
    (is (= InputMode/FAST_FILE (input-mode {:test/item InputMode/FAST_FILE} "test" :item)))
    (is (= InputMode/PIPE (input-mode {:item :pipe} "test" :item)))
    (is (= InputMode/PIPE (input-mode {:test/item :pipe} "test" :item)))
    (is (= InputMode/FILE (input-mode {:item :file} "test" :item)))
    (is (= InputMode/FILE (input-mode {:test/item :file} "test" :item)))
    (is (= InputMode/FAST_FILE (input-mode {:item :fast-file} "test" :item)))
    (is (= InputMode/FAST_FILE (input-mode {:test/item :fast-file} "test" :item)))))


(deftest lambda-invocation-type-test
  (testing "Testing enum function lambda-invocation-type"
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:item LambdaInvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:test/item LambdaInvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:item LambdaInvocationType/EVENT} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:test/item LambdaInvocationType/EVENT} "test" :item)))
    (is (= LambdaInvocationType/DRY_RUN (lambda-invocation-type {:item LambdaInvocationType/DRY_RUN} "test" :item)))
    (is (= LambdaInvocationType/DRY_RUN (lambda-invocation-type {:test/item LambdaInvocationType/DRY_RUN} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:item :request-response} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:test/item :request-response} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:item :event} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:test/item :event} "test" :item)))
    (is (= LambdaInvocationType/DRY_RUN (lambda-invocation-type {:item :dry-run} "test" :item)))
    (is (= LambdaInvocationType/DRY_RUN (lambda-invocation-type {:test/item :dry-run} "test" :item)))))


(deftest message-attribute-data-type-test
  (testing "Testing enum function message-attribute-data-type"
    (is (= MessageAttributeDataType/STRING_ARRAY (message-attribute-data-type {:item MessageAttributeDataType/STRING_ARRAY} "test" :item)))
    (is (= MessageAttributeDataType/STRING_ARRAY (message-attribute-data-type {:test/item MessageAttributeDataType/STRING_ARRAY} "test" :item)))
    (is (= MessageAttributeDataType/STRING (message-attribute-data-type {:item MessageAttributeDataType/STRING} "test" :item)))
    (is (= MessageAttributeDataType/STRING (message-attribute-data-type {:test/item MessageAttributeDataType/STRING} "test" :item)))
    (is (= MessageAttributeDataType/NUMBER (message-attribute-data-type {:item MessageAttributeDataType/NUMBER} "test" :item)))
    (is (= MessageAttributeDataType/NUMBER (message-attribute-data-type {:test/item MessageAttributeDataType/NUMBER} "test" :item)))
    (is (= MessageAttributeDataType/BINARY (message-attribute-data-type {:item MessageAttributeDataType/BINARY} "test" :item)))
    (is (= MessageAttributeDataType/BINARY (message-attribute-data-type {:test/item MessageAttributeDataType/BINARY} "test" :item)))
    (is (= MessageAttributeDataType/STRING_ARRAY (message-attribute-data-type {:item :string-array} "test" :item)))
    (is (= MessageAttributeDataType/STRING_ARRAY (message-attribute-data-type {:test/item :string-array} "test" :item)))
    (is (= MessageAttributeDataType/STRING (message-attribute-data-type {:item :string} "test" :item)))
    (is (= MessageAttributeDataType/STRING (message-attribute-data-type {:test/item :string} "test" :item)))
    (is (= MessageAttributeDataType/NUMBER (message-attribute-data-type {:item :number} "test" :item)))
    (is (= MessageAttributeDataType/NUMBER (message-attribute-data-type {:test/item :number} "test" :item)))
    (is (= MessageAttributeDataType/BINARY (message-attribute-data-type {:item :binary} "test" :item)))
    (is (= MessageAttributeDataType/BINARY (message-attribute-data-type {:test/item :binary} "test" :item)))))


(deftest mode-test
  (testing "Testing enum function mode"
    (is (= Mode/MULTI_MODEL (mode {:item Mode/MULTI_MODEL} "test" :item)))
    (is (= Mode/MULTI_MODEL (mode {:test/item Mode/MULTI_MODEL} "test" :item)))
    (is (= Mode/SINGLE_MODEL (mode {:item Mode/SINGLE_MODEL} "test" :item)))
    (is (= Mode/SINGLE_MODEL (mode {:test/item Mode/SINGLE_MODEL} "test" :item)))
    (is (= Mode/MULTI_MODEL (mode {:item :multi-model} "test" :item)))
    (is (= Mode/MULTI_MODEL (mode {:test/item :multi-model} "test" :item)))
    (is (= Mode/SINGLE_MODEL (mode {:item :single-model} "test" :item)))
    (is (= Mode/SINGLE_MODEL (mode {:test/item :single-model} "test" :item)))))


(deftest record-wrapper-type-test
  (testing "Testing enum function record-wrapper-type"
    (is (= RecordWrapperType/NONE (record-wrapper-type {:item RecordWrapperType/NONE} "test" :item)))
    (is (= RecordWrapperType/NONE (record-wrapper-type {:test/item RecordWrapperType/NONE} "test" :item)))
    (is (= RecordWrapperType/RECORD_IO (record-wrapper-type {:item RecordWrapperType/RECORD_IO} "test" :item)))
    (is (= RecordWrapperType/RECORD_IO (record-wrapper-type {:test/item RecordWrapperType/RECORD_IO} "test" :item)))
    (is (= RecordWrapperType/NONE (record-wrapper-type {:item :none} "test" :item)))
    (is (= RecordWrapperType/NONE (record-wrapper-type {:test/item :none} "test" :item)))
    (is (= RecordWrapperType/RECORD_IO (record-wrapper-type {:item :record-io} "test" :item)))
    (is (= RecordWrapperType/RECORD_IO (record-wrapper-type {:test/item :record-io} "test" :item)))))


(deftest s3-data-distribution-type-test
  (testing "Testing enum function s3-data-distribution-type"
    (is (= S3DataDistributionType/FULLY_REPLICATED (s3-data-distribution-type {:item S3DataDistributionType/FULLY_REPLICATED} "test" :item)))
    (is (= S3DataDistributionType/FULLY_REPLICATED (s3-data-distribution-type {:test/item S3DataDistributionType/FULLY_REPLICATED} "test" :item)))
    (is (= S3DataDistributionType/SHARDED_BY_S3_KEY (s3-data-distribution-type {:item S3DataDistributionType/SHARDED_BY_S3_KEY} "test" :item)))
    (is (= S3DataDistributionType/SHARDED_BY_S3_KEY (s3-data-distribution-type {:test/item S3DataDistributionType/SHARDED_BY_S3_KEY} "test" :item)))
    (is (= S3DataDistributionType/FULLY_REPLICATED (s3-data-distribution-type {:item :fully-replicated} "test" :item)))
    (is (= S3DataDistributionType/FULLY_REPLICATED (s3-data-distribution-type {:test/item :fully-replicated} "test" :item)))
    (is (= S3DataDistributionType/SHARDED_BY_S3_KEY (s3-data-distribution-type {:item :sharded-by-s3-key} "test" :item)))
    (is (= S3DataDistributionType/SHARDED_BY_S3_KEY (s3-data-distribution-type {:test/item :sharded-by-s3-key} "test" :item)))))


(deftest s3-data-type-test
  (testing "Testing enum function s3-data-type"
    (is (= S3DataType/AUGMENTED_MANIFEST_FILE (s3-data-type {:item S3DataType/AUGMENTED_MANIFEST_FILE} "test" :item)))
    (is (= S3DataType/AUGMENTED_MANIFEST_FILE (s3-data-type {:test/item S3DataType/AUGMENTED_MANIFEST_FILE} "test" :item)))
    (is (= S3DataType/S3_PREFIX (s3-data-type {:item S3DataType/S3_PREFIX} "test" :item)))
    (is (= S3DataType/S3_PREFIX (s3-data-type {:test/item S3DataType/S3_PREFIX} "test" :item)))
    (is (= S3DataType/MANIFEST_FILE (s3-data-type {:item S3DataType/MANIFEST_FILE} "test" :item)))
    (is (= S3DataType/MANIFEST_FILE (s3-data-type {:test/item S3DataType/MANIFEST_FILE} "test" :item)))
    (is (= S3DataType/AUGMENTED_MANIFEST_FILE (s3-data-type {:item :augmented-manifest-file} "test" :item)))
    (is (= S3DataType/AUGMENTED_MANIFEST_FILE (s3-data-type {:test/item :augmented-manifest-file} "test" :item)))
    (is (= S3DataType/S3_PREFIX (s3-data-type {:item :s3-prefix} "test" :item)))
    (is (= S3DataType/S3_PREFIX (s3-data-type {:test/item :s3-prefix} "test" :item)))
    (is (= S3DataType/MANIFEST_FILE (s3-data-type {:item :manifest-file} "test" :item)))
    (is (= S3DataType/MANIFEST_FILE (s3-data-type {:test/item :manifest-file} "test" :item)))))


(deftest split-type-test
  (testing "Testing enum function split-type"
    (is (= SplitType/LINE (split-type {:item SplitType/LINE} "test" :item)))
    (is (= SplitType/LINE (split-type {:test/item SplitType/LINE} "test" :item)))
    (is (= SplitType/RECORD_IO (split-type {:item SplitType/RECORD_IO} "test" :item)))
    (is (= SplitType/RECORD_IO (split-type {:test/item SplitType/RECORD_IO} "test" :item)))
    (is (= SplitType/TF_RECORD (split-type {:item SplitType/TF_RECORD} "test" :item)))
    (is (= SplitType/TF_RECORD (split-type {:test/item SplitType/TF_RECORD} "test" :item)))
    (is (= SplitType/NONE (split-type {:item SplitType/NONE} "test" :item)))
    (is (= SplitType/NONE (split-type {:test/item SplitType/NONE} "test" :item)))
    (is (= SplitType/LINE (split-type {:item :line} "test" :item)))
    (is (= SplitType/LINE (split-type {:test/item :line} "test" :item)))
    (is (= SplitType/RECORD_IO (split-type {:item :record-io} "test" :item)))
    (is (= SplitType/RECORD_IO (split-type {:test/item :record-io} "test" :item)))
    (is (= SplitType/TF_RECORD (split-type {:item :tf-record} "test" :item)))
    (is (= SplitType/TF_RECORD (split-type {:test/item :tf-record} "test" :item)))
    (is (= SplitType/NONE (split-type {:item :none} "test" :item)))
    (is (= SplitType/NONE (split-type {:test/item :none} "test" :item)))))


(deftest url-encoding-format-test
  (testing "Testing enum function url-encoding-format"
    (is (= URLEncodingFormat/INDICES (url-encoding-format {:item URLEncodingFormat/INDICES} "test" :item)))
    (is (= URLEncodingFormat/INDICES (url-encoding-format {:test/item URLEncodingFormat/INDICES} "test" :item)))
    (is (= URLEncodingFormat/NONE (url-encoding-format {:item URLEncodingFormat/NONE} "test" :item)))
    (is (= URLEncodingFormat/NONE (url-encoding-format {:test/item URLEncodingFormat/NONE} "test" :item)))
    (is (= URLEncodingFormat/REPEAT (url-encoding-format {:item URLEncodingFormat/REPEAT} "test" :item)))
    (is (= URLEncodingFormat/REPEAT (url-encoding-format {:test/item URLEncodingFormat/REPEAT} "test" :item)))
    (is (= URLEncodingFormat/COMMAS (url-encoding-format {:item URLEncodingFormat/COMMAS} "test" :item)))
    (is (= URLEncodingFormat/COMMAS (url-encoding-format {:test/item URLEncodingFormat/COMMAS} "test" :item)))
    (is (= URLEncodingFormat/DEFAULT (url-encoding-format {:item URLEncodingFormat/DEFAULT} "test" :item)))
    (is (= URLEncodingFormat/DEFAULT (url-encoding-format {:test/item URLEncodingFormat/DEFAULT} "test" :item)))
    (is (= URLEncodingFormat/BRACKETS (url-encoding-format {:item URLEncodingFormat/BRACKETS} "test" :item)))
    (is (= URLEncodingFormat/BRACKETS (url-encoding-format {:test/item URLEncodingFormat/BRACKETS} "test" :item)))
    (is (= URLEncodingFormat/INDICES (url-encoding-format {:item :indices} "test" :item)))
    (is (= URLEncodingFormat/INDICES (url-encoding-format {:test/item :indices} "test" :item)))
    (is (= URLEncodingFormat/NONE (url-encoding-format {:item :none} "test" :item)))
    (is (= URLEncodingFormat/NONE (url-encoding-format {:test/item :none} "test" :item)))
    (is (= URLEncodingFormat/REPEAT (url-encoding-format {:item :repeat} "test" :item)))
    (is (= URLEncodingFormat/REPEAT (url-encoding-format {:test/item :repeat} "test" :item)))
    (is (= URLEncodingFormat/COMMAS (url-encoding-format {:item :commas} "test" :item)))
    (is (= URLEncodingFormat/COMMAS (url-encoding-format {:test/item :commas} "test" :item)))
    (is (= URLEncodingFormat/DEFAULT (url-encoding-format {:item :default} "test" :item)))
    (is (= URLEncodingFormat/DEFAULT (url-encoding-format {:test/item :default} "test" :item)))
    (is (= URLEncodingFormat/BRACKETS (url-encoding-format {:item :brackets} "test" :item)))
    (is (= URLEncodingFormat/BRACKETS (url-encoding-format {:test/item :brackets} "test" :item)))))


(deftest worker-type-test
  (testing "Testing enum function worker-type"
    (is (= WorkerType/G_025X (worker-type {:item WorkerType/G_025X} "test" :item)))
    (is (= WorkerType/G_025X (worker-type {:test/item WorkerType/G_025X} "test" :item)))
    (is (= WorkerType/G_1X (worker-type {:item WorkerType/G_1X} "test" :item)))
    (is (= WorkerType/G_1X (worker-type {:test/item WorkerType/G_1X} "test" :item)))
    (is (= WorkerType/STANDARD (worker-type {:item WorkerType/STANDARD} "test" :item)))
    (is (= WorkerType/STANDARD (worker-type {:test/item WorkerType/STANDARD} "test" :item)))
    (is (= WorkerType/G_2X (worker-type {:item WorkerType/G_2X} "test" :item)))
    (is (= WorkerType/G_2X (worker-type {:test/item WorkerType/G_2X} "test" :item)))
    (is (= WorkerType/Z_2X (worker-type {:item WorkerType/Z_2X} "test" :item)))
    (is (= WorkerType/Z_2X (worker-type {:test/item WorkerType/Z_2X} "test" :item)))
    (is (= WorkerType/G_8X (worker-type {:item WorkerType/G_8X} "test" :item)))
    (is (= WorkerType/G_8X (worker-type {:test/item WorkerType/G_8X} "test" :item)))
    (is (= WorkerType/G_4X (worker-type {:item WorkerType/G_4X} "test" :item)))
    (is (= WorkerType/G_4X (worker-type {:test/item WorkerType/G_4X} "test" :item)))
    (is (= WorkerType/G_025X (worker-type {:item :g-025x} "test" :item)))
    (is (= WorkerType/G_025X (worker-type {:test/item :g-025x} "test" :item)))
    (is (= WorkerType/G_1X (worker-type {:item :g-1x} "test" :item)))
    (is (= WorkerType/G_1X (worker-type {:test/item :g-1x} "test" :item)))
    (is (= WorkerType/STANDARD (worker-type {:item :standard} "test" :item)))
    (is (= WorkerType/STANDARD (worker-type {:test/item :standard} "test" :item)))
    (is (= WorkerType/G_2X (worker-type {:item :g-2x} "test" :item)))
    (is (= WorkerType/G_2X (worker-type {:test/item :g-2x} "test" :item)))
    (is (= WorkerType/Z_2X (worker-type {:item :z-2x} "test" :item)))
    (is (= WorkerType/Z_2X (worker-type {:test/item :z-2x} "test" :item)))
    (is (= WorkerType/G_8X (worker-type {:item :g-8x} "test" :item)))
    (is (= WorkerType/G_8X (worker-type {:test/item :g-8x} "test" :item)))
    (is (= WorkerType/G_4X (worker-type {:item :g-4x} "test" :item)))
    (is (= WorkerType/G_4X (worker-type {:test/item :g-4x} "test" :item)))))