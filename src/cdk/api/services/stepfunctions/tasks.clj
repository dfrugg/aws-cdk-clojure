(ns cdk.api.services.stepfunctions.tasks
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.stepfunctions.tasks package. "
  (:require [cdk.api.services.ecs :refer [fargate-platform-version
                                          propagated-tag-source]]
            [cdk.api.services.stepfunctions :refer [integration-pattern
                                                    service-integration-pattern]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.stepfunctions.tasks ActionOnFailure
                                                                AlgorithmSpecification$Builder
                                                                ApplicationConfiguration$Builder
                                                                AssembleWith
                                                                AthenaGetQueryExecution$Builder
                                                                AthenaGetQueryExecutionProps$Builder
                                                                AthenaGetQueryResults$Builder
                                                                AthenaGetQueryResultsProps$Builder
                                                                AthenaStartQueryExecution$Builder
                                                                AthenaStartQueryExecutionProps$Builder
                                                                AthenaStopQueryExecution$Builder
                                                                AthenaStopQueryExecutionProps$Builder
                                                                AuthType
                                                                BatchContainerOverrides$Builder
                                                                BatchJobDependency$Builder
                                                                BatchStrategy
                                                                BatchSubmitJob$Builder
                                                                BatchSubmitJobProps$Builder
                                                                BedrockInvokeModel$Builder
                                                                BedrockInvokeModelInputProps$Builder
                                                                BedrockInvokeModelOutputProps$Builder
                                                                BedrockInvokeModelProps$Builder
                                                                CallApiGatewayEndpointBaseProps$Builder
                                                                CallApiGatewayHttpApiEndpoint$Builder
                                                                CallApiGatewayHttpApiEndpointProps$Builder
                                                                CallApiGatewayRestApiEndpoint$Builder
                                                                CallApiGatewayRestApiEndpointProps$Builder
                                                                CallAwsService$Builder
                                                                CallAwsServiceProps$Builder
                                                                Channel$Builder
                                                                CodeBuildStartBuild$Builder
                                                                CodeBuildStartBuildBatch$Builder
                                                                CodeBuildStartBuildBatchProps$Builder
                                                                CodeBuildStartBuildProps$Builder
                                                                CommonEcsRunTaskProps$Builder
                                                                CompressionType
                                                                ContainerDefinition$Builder
                                                                ContainerDefinitionConfig$Builder
                                                                ContainerDefinitionOptions$Builder
                                                                ContainerOverride$Builder
                                                                ContainerOverrides$Builder
                                                                DataSource$Builder
                                                                DockerImageConfig$Builder
                                                                DynamoConsumedCapacity
                                                                DynamoDeleteItem$Builder
                                                                DynamoDeleteItemProps$Builder
                                                                DynamoGetItem$Builder
                                                                DynamoGetItemProps$Builder
                                                                DynamoItemCollectionMetrics
                                                                DynamoPutItem$Builder
                                                                DynamoPutItemProps$Builder
                                                                DynamoReturnValues
                                                                DynamoUpdateItem$Builder
                                                                DynamoUpdateItemProps$Builder
                                                                EcsEc2LaunchTarget$Builder
                                                                EcsEc2LaunchTargetOptions$Builder
                                                                EcsFargateLaunchTarget$Builder
                                                                EcsFargateLaunchTargetOptions$Builder
                                                                EcsLaunchTargetConfig$Builder
                                                                EcsRunTask$Builder
                                                                EcsRunTaskProps$Builder
                                                                EksCall$Builder
                                                                EksCallProps$Builder
                                                                EmrAddStep$Builder
                                                                EmrAddStepProps$Builder
                                                                EmrCancelStep$Builder
                                                                EmrCancelStepProps$Builder
                                                                EmrContainersCreateVirtualCluster$Builder
                                                                EmrContainersCreateVirtualClusterProps$Builder
                                                                EmrContainersDeleteVirtualCluster$Builder
                                                                EmrContainersDeleteVirtualClusterProps$Builder
                                                                EmrContainersStartJobRun$Builder
                                                                EmrContainersStartJobRunProps$Builder
                                                                EmrCreateCluster$ApplicationConfigProperty$Builder
                                                                EmrCreateCluster$AutoScalingPolicyProperty$Builder
                                                                EmrCreateCluster$BootstrapActionConfigProperty$Builder
                                                                EmrCreateCluster$Builder
                                                                EmrCreateCluster$CloudWatchAlarmComparisonOperator
                                                                EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder
                                                                EmrCreateCluster$CloudWatchAlarmStatistic
                                                                EmrCreateCluster$CloudWatchAlarmUnit
                                                                EmrCreateCluster$ConfigurationProperty$Builder
                                                                EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder
                                                                EmrCreateCluster$EbsBlockDeviceVolumeType
                                                                EmrCreateCluster$EbsConfigurationProperty$Builder
                                                                EmrCreateCluster$EmrClusterScaleDownBehavior
                                                                EmrCreateCluster$InstanceFleetConfigProperty$Builder
                                                                EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder
                                                                EmrCreateCluster$InstanceGroupConfigProperty$Builder
                                                                EmrCreateCluster$InstanceMarket
                                                                EmrCreateCluster$InstanceRoleType
                                                                EmrCreateCluster$InstanceTypeConfigProperty$Builder
                                                                EmrCreateCluster$InstancesConfigProperty$Builder
                                                                EmrCreateCluster$KerberosAttributesProperty$Builder
                                                                EmrCreateCluster$MetricDimensionProperty$Builder
                                                                EmrCreateCluster$OnDemandAllocationStrategy
                                                                EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder
                                                                EmrCreateCluster$PlacementTypeProperty$Builder
                                                                EmrCreateCluster$ScalingActionProperty$Builder
                                                                EmrCreateCluster$ScalingAdjustmentType
                                                                EmrCreateCluster$ScalingConstraintsProperty$Builder
                                                                EmrCreateCluster$ScalingRuleProperty$Builder
                                                                EmrCreateCluster$ScalingTriggerProperty$Builder
                                                                EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder
                                                                EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder
                                                                EmrCreateCluster$SpotAllocationStrategy
                                                                EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder
                                                                EmrCreateCluster$SpotTimeoutAction
                                                                EmrCreateCluster$VolumeSpecificationProperty$Builder
                                                                EmrCreateClusterProps$Builder
                                                                EmrModifyInstanceFleetByName$Builder
                                                                EmrModifyInstanceFleetByNameProps$Builder
                                                                EmrModifyInstanceGroupByName$Builder
                                                                EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder
                                                                EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder
                                                                EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder
                                                                EmrModifyInstanceGroupByNameProps$Builder
                                                                EmrSetClusterTerminationProtection$Builder
                                                                EmrSetClusterTerminationProtectionProps$Builder
                                                                EmrTerminateCluster$Builder
                                                                EmrTerminateClusterProps$Builder
                                                                EncryptionConfiguration$Builder
                                                                EncryptionOption
                                                                EvaluateExpression$Builder
                                                                EvaluateExpressionProps$Builder
                                                                EventBridgePutEvents$Builder
                                                                EventBridgePutEventsEntry$Builder
                                                                EventBridgePutEventsProps$Builder
                                                                GlueDataBrewStartJobRun$Builder
                                                                GlueDataBrewStartJobRunProps$Builder
                                                                GlueStartCrawlerRun$Builder
                                                                GlueStartCrawlerRunProps$Builder
                                                                GlueStartJobRun$Builder
                                                                GlueStartJobRunProps$Builder
                                                                HttpInvoke$Builder
                                                                HttpInvokeProps$Builder
                                                                HttpMethod
                                                                HttpMethods
                                                                InputMode
                                                                JobDependency$Builder
                                                                JobDriver$Builder
                                                                LambdaInvocationType
                                                                LambdaInvoke$Builder
                                                                LambdaInvokeProps$Builder
                                                                LaunchTargetBindOptions$Builder
                                                                MediaConvertCreateJob$Builder
                                                                MediaConvertCreateJobProps$Builder
                                                                MessageAttribute$Builder
                                                                MessageAttributeDataType
                                                                MetricDefinition$Builder
                                                                Mode
                                                                ModelClientOptions$Builder
                                                                Monitoring$Builder
                                                                OutputDataConfig$Builder
                                                                ProductionVariant$Builder
                                                                QueryExecutionContext$Builder
                                                                RecordWrapperType
                                                                ResourceConfig$Builder
                                                                ResultConfiguration$Builder
                                                                S3DataDistributionType
                                                                S3DataSource$Builder
                                                                S3DataType
                                                                S3LocationBindOptions$Builder
                                                                S3LocationConfig$Builder
                                                                SageMakerCreateEndpoint$Builder
                                                                SageMakerCreateEndpointConfig$Builder
                                                                SageMakerCreateEndpointConfigProps$Builder
                                                                SageMakerCreateEndpointProps$Builder
                                                                SageMakerCreateModel$Builder
                                                                SageMakerCreateModelProps$Builder
                                                                SageMakerCreateTrainingJob$Builder
                                                                SageMakerCreateTrainingJobProps$Builder
                                                                SageMakerCreateTransformJob$Builder
                                                                SageMakerCreateTransformJobProps$Builder
                                                                SageMakerUpdateEndpoint$Builder
                                                                SageMakerUpdateEndpointProps$Builder
                                                                ShuffleConfig$Builder
                                                                SnsPublish$Builder
                                                                SnsPublishProps$Builder
                                                                SparkSubmitJobDriver$Builder
                                                                SplitType
                                                                SqsSendMessage$Builder
                                                                SqsSendMessageProps$Builder
                                                                StepFunctionsInvokeActivity$Builder
                                                                StepFunctionsInvokeActivityProps$Builder
                                                                StepFunctionsStartExecution$Builder
                                                                StepFunctionsStartExecutionProps$Builder
                                                                StoppingCondition$Builder
                                                                TaskEnvironmentVariable$Builder
                                                                TransformDataSource$Builder
                                                                TransformInput$Builder
                                                                TransformOutput$Builder
                                                                TransformResources$Builder
                                                                TransformS3DataSource$Builder
                                                                URLEncodingFormat
                                                                VpcConfig$Builder
                                                                WorkerConfigurationProperty$Builder
                                                                WorkerType]))


(defn action-on-failure
  "The `action-on-failure` function data interprets values in the provided config data into a 
`ActionOnFailure` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ActionOnFailure` - the value is returned.
* is `:cancel-and-wait` - `ActionOnFailure/CANCEL_AND_WAIT` is returned
* is `:continue` - `ActionOnFailure/CONTINUE` is returned
* is `:terminate-cluster` - `ActionOnFailure/TERMINATE_CLUSTER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ActionOnFailure data) data
      (= :cancel-and-wait data) ActionOnFailure/CANCEL_AND_WAIT
      (= :continue data) ActionOnFailure/CONTINUE
      (= :terminate-cluster data) ActionOnFailure/TERMINATE_CLUSTER)))


(defn assemble-with
  "The `assemble-with` function data interprets values in the provided config data into a 
`AssembleWith` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AssembleWith` - the value is returned.
* is `:line` - `AssembleWith/LINE` is returned
* is `:none` - `AssembleWith/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AssembleWith data) data
      (= :line data) AssembleWith/LINE
      (= :none data) AssembleWith/NONE)))


(defn auth-type
  "The `auth-type` function data interprets values in the provided config data into a 
`AuthType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuthType` - the value is returned.
* is `:no-auth` - `AuthType/NO_AUTH` is returned
* is `:iam-role` - `AuthType/IAM_ROLE` is returned
* is `:resource-policy` - `AuthType/RESOURCE_POLICY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuthType data) data
      (= :no-auth data) AuthType/NO_AUTH
      (= :iam-role data) AuthType/IAM_ROLE
      (= :resource-policy data) AuthType/RESOURCE_POLICY)))


(defn batch-strategy
  "The `batch-strategy` function data interprets values in the provided config data into a 
`BatchStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BatchStrategy` - the value is returned.
* is `:single-record` - `BatchStrategy/SINGLE_RECORD` is returned
* is `:multi-record` - `BatchStrategy/MULTI_RECORD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BatchStrategy data) data
      (= :single-record data) BatchStrategy/SINGLE_RECORD
      (= :multi-record data) BatchStrategy/MULTI_RECORD)))


(defn compression-type
  "The `compression-type` function data interprets values in the provided config data into a 
`CompressionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CompressionType` - the value is returned.
* is `:gzip` - `CompressionType/GZIP` is returned
* is `:none` - `CompressionType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CompressionType data) data
      (= :gzip data) CompressionType/GZIP
      (= :none data) CompressionType/NONE)))


(defn dynamo-consumed-capacity
  "The `dynamo-consumed-capacity` function data interprets values in the provided config data into a 
`DynamoConsumedCapacity` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DynamoConsumedCapacity` - the value is returned.
* is `:total` - `DynamoConsumedCapacity/TOTAL` is returned
* is `:indexes` - `DynamoConsumedCapacity/INDEXES` is returned
* is `:none` - `DynamoConsumedCapacity/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DynamoConsumedCapacity data) data
      (= :total data) DynamoConsumedCapacity/TOTAL
      (= :indexes data) DynamoConsumedCapacity/INDEXES
      (= :none data) DynamoConsumedCapacity/NONE)))


(defn dynamo-item-collection-metrics
  "The `dynamo-item-collection-metrics` function data interprets values in the provided config data into a 
`DynamoItemCollectionMetrics` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DynamoItemCollectionMetrics` - the value is returned.
* is `:size` - `DynamoItemCollectionMetrics/SIZE` is returned
* is `:none` - `DynamoItemCollectionMetrics/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DynamoItemCollectionMetrics data) data
      (= :size data) DynamoItemCollectionMetrics/SIZE
      (= :none data) DynamoItemCollectionMetrics/NONE)))


(defn dynamo-return-values
  "The `dynamo-return-values` function data interprets values in the provided config data into a 
`DynamoReturnValues` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DynamoReturnValues` - the value is returned.
* is `:updated-old` - `DynamoReturnValues/UPDATED_OLD` is returned
* is `:all-old` - `DynamoReturnValues/ALL_OLD` is returned
* is `:updated-new` - `DynamoReturnValues/UPDATED_NEW` is returned
* is `:none` - `DynamoReturnValues/NONE` is returned
* is `:all-new` - `DynamoReturnValues/ALL_NEW` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DynamoReturnValues data) data
      (= :updated-old data) DynamoReturnValues/UPDATED_OLD
      (= :all-old data) DynamoReturnValues/ALL_OLD
      (= :updated-new data) DynamoReturnValues/UPDATED_NEW
      (= :none data) DynamoReturnValues/NONE
      (= :all-new data) DynamoReturnValues/ALL_NEW)))


(defn emr-create-cluster-cloud-watch-alarm-comparison-operator
  "The `emr-create-cluster-cloud-watch-alarm-comparison-operator` function data interprets values in the provided config data into a 
`EmrCreateCluster$CloudWatchAlarmComparisonOperator` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$CloudWatchAlarmComparisonOperator` - the value is returned.
* is `:less-than-or-equal` - `EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL` is returned
* is `:greater-than` - `EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN` is returned
* is `:less-than` - `EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN` is returned
* is `:greater-than-or-equal` - `EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$CloudWatchAlarmComparisonOperator data) data
      (= :less-than-or-equal data) EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN_OR_EQUAL
      (= :greater-than data) EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN
      (= :less-than data) EmrCreateCluster$CloudWatchAlarmComparisonOperator/LESS_THAN
      (= :greater-than-or-equal data) EmrCreateCluster$CloudWatchAlarmComparisonOperator/GREATER_THAN_OR_EQUAL)))


(defn emr-create-cluster-cloud-watch-alarm-statistic
  "The `emr-create-cluster-cloud-watch-alarm-statistic` function data interprets values in the provided config data into a 
`EmrCreateCluster$CloudWatchAlarmStatistic` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$CloudWatchAlarmStatistic` - the value is returned.
* is `:sample-count` - `EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT` is returned
* is `:maximum` - `EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM` is returned
* is `:minimum` - `EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM` is returned
* is `:sum` - `EmrCreateCluster$CloudWatchAlarmStatistic/SUM` is returned
* is `:average` - `EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$CloudWatchAlarmStatistic data) data
      (= :sample-count data) EmrCreateCluster$CloudWatchAlarmStatistic/SAMPLE_COUNT
      (= :maximum data) EmrCreateCluster$CloudWatchAlarmStatistic/MAXIMUM
      (= :minimum data) EmrCreateCluster$CloudWatchAlarmStatistic/MINIMUM
      (= :sum data) EmrCreateCluster$CloudWatchAlarmStatistic/SUM
      (= :average data) EmrCreateCluster$CloudWatchAlarmStatistic/AVERAGE)))


(defn emr-create-cluster-cloud-watch-alarm-unit
  "The `emr-create-cluster-cloud-watch-alarm-unit` function data interprets values in the provided config data into a 
`EmrCreateCluster$CloudWatchAlarmUnit` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$CloudWatchAlarmUnit` - the value is returned.
* is `:giga-bits-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND` is returned
* is `:giga-bytes-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND` is returned
* is `:mega-bits-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND` is returned
* is `:milli-seconds` - `EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS` is returned
* is `:count` - `EmrCreateCluster$CloudWatchAlarmUnit/COUNT` is returned
* is `:giga-bits` - `EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS` is returned
* is `:tera-bits` - `EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS` is returned
* is `:tera-bytes` - `EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES` is returned
* is `:percent` - `EmrCreateCluster$CloudWatchAlarmUnit/PERCENT` is returned
* is `:tera-bits-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND` is returned
* is `:kilo-bytes` - `EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES` is returned
* is `:count-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND` is returned
* is `:none` - `EmrCreateCluster$CloudWatchAlarmUnit/NONE` is returned
* is `:kilo-bits-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND` is returned
* is `:mega-bytes` - `EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES` is returned
* is `:bytes` - `EmrCreateCluster$CloudWatchAlarmUnit/BYTES` is returned
* is `:micro-seconds` - `EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS` is returned
* is `:giga-bytes` - `EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES` is returned
* is `:seconds` - `EmrCreateCluster$CloudWatchAlarmUnit/SECONDS` is returned
* is `:mega-bytes-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND` is returned
* is `:mega-bits` - `EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS` is returned
* is `:bytes-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND` is returned
* is `:bits-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND` is returned
* is `:kilo-bits` - `EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS` is returned
* is `:bits` - `EmrCreateCluster$CloudWatchAlarmUnit/BITS` is returned
* is `:kilo-bytes-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND` is returned
* is `:tera-bytes-per-second` - `EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$CloudWatchAlarmUnit data) data
      (= :giga-bits-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS_PER_SECOND
      (= :giga-bytes-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES_PER_SECOND
      (= :mega-bits-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS_PER_SECOND
      (= :milli-seconds data) EmrCreateCluster$CloudWatchAlarmUnit/MILLI_SECONDS
      (= :count data) EmrCreateCluster$CloudWatchAlarmUnit/COUNT
      (= :giga-bits data) EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BITS
      (= :tera-bits data) EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS
      (= :tera-bytes data) EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES
      (= :percent data) EmrCreateCluster$CloudWatchAlarmUnit/PERCENT
      (= :tera-bits-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/TERA_BITS_PER_SECOND
      (= :kilo-bytes data) EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES
      (= :count-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/COUNT_PER_SECOND
      (= :none data) EmrCreateCluster$CloudWatchAlarmUnit/NONE
      (= :kilo-bits-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS_PER_SECOND
      (= :mega-bytes data) EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES
      (= :bytes data) EmrCreateCluster$CloudWatchAlarmUnit/BYTES
      (= :micro-seconds data) EmrCreateCluster$CloudWatchAlarmUnit/MICRO_SECONDS
      (= :giga-bytes data) EmrCreateCluster$CloudWatchAlarmUnit/GIGA_BYTES
      (= :seconds data) EmrCreateCluster$CloudWatchAlarmUnit/SECONDS
      (= :mega-bytes-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BYTES_PER_SECOND
      (= :mega-bits data) EmrCreateCluster$CloudWatchAlarmUnit/MEGA_BITS
      (= :bytes-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/BYTES_PER_SECOND
      (= :bits-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/BITS_PER_SECOND
      (= :kilo-bits data) EmrCreateCluster$CloudWatchAlarmUnit/KILO_BITS
      (= :bits data) EmrCreateCluster$CloudWatchAlarmUnit/BITS
      (= :kilo-bytes-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/KILO_BYTES_PER_SECOND
      (= :tera-bytes-per-second data) EmrCreateCluster$CloudWatchAlarmUnit/TERA_BYTES_PER_SECOND)))


(defn emr-create-cluster-ebs-block-device-volume-type
  "The `emr-create-cluster-ebs-block-device-volume-type` function data interprets values in the provided config data into a 
`EmrCreateCluster$EbsBlockDeviceVolumeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$EbsBlockDeviceVolumeType` - the value is returned.
* is `:io1` - `EmrCreateCluster$EbsBlockDeviceVolumeType/IO1` is returned
* is `:gp3` - `EmrCreateCluster$EbsBlockDeviceVolumeType/GP3` is returned
* is `:st1` - `EmrCreateCluster$EbsBlockDeviceVolumeType/ST1` is returned
* is `:sc1` - `EmrCreateCluster$EbsBlockDeviceVolumeType/SC1` is returned
* is `:standard` - `EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD` is returned
* is `:gp2` - `EmrCreateCluster$EbsBlockDeviceVolumeType/GP2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$EbsBlockDeviceVolumeType data) data
      (= :io1 data) EmrCreateCluster$EbsBlockDeviceVolumeType/IO1
      (= :gp3 data) EmrCreateCluster$EbsBlockDeviceVolumeType/GP3
      (= :st1 data) EmrCreateCluster$EbsBlockDeviceVolumeType/ST1
      (= :sc1 data) EmrCreateCluster$EbsBlockDeviceVolumeType/SC1
      (= :standard data) EmrCreateCluster$EbsBlockDeviceVolumeType/STANDARD
      (= :gp2 data) EmrCreateCluster$EbsBlockDeviceVolumeType/GP2)))


(defn emr-create-cluster-emr-cluster-scale-down-behavior
  "The `emr-create-cluster-emr-cluster-scale-down-behavior` function data interprets values in the provided config data into a 
`EmrCreateCluster$EmrClusterScaleDownBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$EmrClusterScaleDownBehavior` - the value is returned.
* is `:terminate-at-instance-hour` - `EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR` is returned
* is `:terminate-at-task-completion` - `EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$EmrClusterScaleDownBehavior data) data
      (= :terminate-at-instance-hour data) EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_INSTANCE_HOUR
      (= :terminate-at-task-completion data) EmrCreateCluster$EmrClusterScaleDownBehavior/TERMINATE_AT_TASK_COMPLETION)))


(defn emr-create-cluster-instance-market
  "The `emr-create-cluster-instance-market` function data interprets values in the provided config data into a 
`EmrCreateCluster$InstanceMarket` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$InstanceMarket` - the value is returned.
* is `:spot` - `EmrCreateCluster$InstanceMarket/SPOT` is returned
* is `:on-demand` - `EmrCreateCluster$InstanceMarket/ON_DEMAND` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$InstanceMarket data) data
      (= :spot data) EmrCreateCluster$InstanceMarket/SPOT
      (= :on-demand data) EmrCreateCluster$InstanceMarket/ON_DEMAND)))


(defn emr-create-cluster-instance-role-type
  "The `emr-create-cluster-instance-role-type` function data interprets values in the provided config data into a 
`EmrCreateCluster$InstanceRoleType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$InstanceRoleType` - the value is returned.
* is `:master` - `EmrCreateCluster$InstanceRoleType/MASTER` is returned
* is `:core` - `EmrCreateCluster$InstanceRoleType/CORE` is returned
* is `:task` - `EmrCreateCluster$InstanceRoleType/TASK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$InstanceRoleType data) data
      (= :master data) EmrCreateCluster$InstanceRoleType/MASTER
      (= :core data) EmrCreateCluster$InstanceRoleType/CORE
      (= :task data) EmrCreateCluster$InstanceRoleType/TASK)))


(defn emr-create-cluster-on-demand-allocation-strategy
  "The `emr-create-cluster-on-demand-allocation-strategy` function data interprets values in the provided config data into a 
`EmrCreateCluster$OnDemandAllocationStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$OnDemandAllocationStrategy` - the value is returned.
* is `:lowest-price` - `EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$OnDemandAllocationStrategy data) data
      (= :lowest-price data) EmrCreateCluster$OnDemandAllocationStrategy/LOWEST_PRICE)))


(defn emr-create-cluster-scaling-adjustment-type
  "The `emr-create-cluster-scaling-adjustment-type` function data interprets values in the provided config data into a 
`EmrCreateCluster$ScalingAdjustmentType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$ScalingAdjustmentType` - the value is returned.
* is `:exact-capacity` - `EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY` is returned
* is `:change-in-capacity` - `EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY` is returned
* is `:percent-change-in-capacity` - `EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$ScalingAdjustmentType data) data
      (= :exact-capacity data) EmrCreateCluster$ScalingAdjustmentType/EXACT_CAPACITY
      (= :change-in-capacity data) EmrCreateCluster$ScalingAdjustmentType/CHANGE_IN_CAPACITY
      (= :percent-change-in-capacity data) EmrCreateCluster$ScalingAdjustmentType/PERCENT_CHANGE_IN_CAPACITY)))


(defn emr-create-cluster-spot-allocation-strategy
  "The `emr-create-cluster-spot-allocation-strategy` function data interprets values in the provided config data into a 
`EmrCreateCluster$SpotAllocationStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$SpotAllocationStrategy` - the value is returned.
* is `:price-capacity-optimized` - `EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED` is returned
* is `:diversified` - `EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED` is returned
* is `:lowest-price` - `EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE` is returned
* is `:capacity-optimized` - `EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$SpotAllocationStrategy data) data
      (= :price-capacity-optimized data) EmrCreateCluster$SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED
      (= :diversified data) EmrCreateCluster$SpotAllocationStrategy/DIVERSIFIED
      (= :lowest-price data) EmrCreateCluster$SpotAllocationStrategy/LOWEST_PRICE
      (= :capacity-optimized data) EmrCreateCluster$SpotAllocationStrategy/CAPACITY_OPTIMIZED)))


(defn emr-create-cluster-spot-timeout-action
  "The `emr-create-cluster-spot-timeout-action` function data interprets values in the provided config data into a 
`EmrCreateCluster$SpotTimeoutAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EmrCreateCluster$SpotTimeoutAction` - the value is returned.
* is `:switch-to-on-demand` - `EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND` is returned
* is `:terminate-cluster` - `EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EmrCreateCluster$SpotTimeoutAction data) data
      (= :switch-to-on-demand data) EmrCreateCluster$SpotTimeoutAction/SWITCH_TO_ON_DEMAND
      (= :terminate-cluster data) EmrCreateCluster$SpotTimeoutAction/TERMINATE_CLUSTER)))


(defn encryption-option
  "The `encryption-option` function data interprets values in the provided config data into a 
`EncryptionOption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EncryptionOption` - the value is returned.
* is `:kms` - `EncryptionOption/KMS` is returned
* is `:client-side-kms` - `EncryptionOption/CLIENT_SIDE_KMS` is returned
* is `:s3-managed` - `EncryptionOption/S3_MANAGED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EncryptionOption data) data
      (= :kms data) EncryptionOption/KMS
      (= :client-side-kms data) EncryptionOption/CLIENT_SIDE_KMS
      (= :s3-managed data) EncryptionOption/S3_MANAGED)))


(defn http-method
  "The `http-method` function data interprets values in the provided config data into a 
`HttpMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethod` - the value is returned.
* is `:get` - `HttpMethod/GET` is returned
* is `:head` - `HttpMethod/HEAD` is returned
* is `:options` - `HttpMethod/OPTIONS` is returned
* is `:post` - `HttpMethod/POST` is returned
* is `:put` - `HttpMethod/PUT` is returned
* is `:patch` - `HttpMethod/PATCH` is returned
* is `:delete` - `HttpMethod/DELETE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethod data) data
      (= :get data) HttpMethod/GET
      (= :head data) HttpMethod/HEAD
      (= :options data) HttpMethod/OPTIONS
      (= :post data) HttpMethod/POST
      (= :put data) HttpMethod/PUT
      (= :patch data) HttpMethod/PATCH
      (= :delete data) HttpMethod/DELETE)))


(defn http-methods
  "The `http-methods` function data interprets values in the provided config data into a 
`HttpMethods` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpMethods` - the value is returned.
* is `:delete` - `HttpMethods/DELETE` is returned
* is `:put` - `HttpMethods/PUT` is returned
* is `:patch` - `HttpMethods/PATCH` is returned
* is `:post` - `HttpMethods/POST` is returned
* is `:get` - `HttpMethods/GET` is returned
* is `:head` - `HttpMethods/HEAD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpMethods data) data
      (= :delete data) HttpMethods/DELETE
      (= :put data) HttpMethods/PUT
      (= :patch data) HttpMethods/PATCH
      (= :post data) HttpMethods/POST
      (= :get data) HttpMethods/GET
      (= :head data) HttpMethods/HEAD)))


(defn input-mode
  "The `input-mode` function data interprets values in the provided config data into a 
`InputMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InputMode` - the value is returned.
* is `:pipe` - `InputMode/PIPE` is returned
* is `:file` - `InputMode/FILE` is returned
* is `:fast-file` - `InputMode/FAST_FILE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InputMode data) data
      (= :pipe data) InputMode/PIPE
      (= :file data) InputMode/FILE
      (= :fast-file data) InputMode/FAST_FILE)))


(defn lambda-invocation-type
  "The `lambda-invocation-type` function data interprets values in the provided config data into a 
`LambdaInvocationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LambdaInvocationType` - the value is returned.
* is `:request-response` - `LambdaInvocationType/REQUEST_RESPONSE` is returned
* is `:event` - `LambdaInvocationType/EVENT` is returned
* is `:dry-run` - `LambdaInvocationType/DRY_RUN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LambdaInvocationType data) data
      (= :request-response data) LambdaInvocationType/REQUEST_RESPONSE
      (= :event data) LambdaInvocationType/EVENT
      (= :dry-run data) LambdaInvocationType/DRY_RUN)))


(defn message-attribute-data-type
  "The `message-attribute-data-type` function data interprets values in the provided config data into a 
`MessageAttributeDataType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MessageAttributeDataType` - the value is returned.
* is `:string-array` - `MessageAttributeDataType/STRING_ARRAY` is returned
* is `:string` - `MessageAttributeDataType/STRING` is returned
* is `:number` - `MessageAttributeDataType/NUMBER` is returned
* is `:binary` - `MessageAttributeDataType/BINARY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MessageAttributeDataType data) data
      (= :string-array data) MessageAttributeDataType/STRING_ARRAY
      (= :string data) MessageAttributeDataType/STRING
      (= :number data) MessageAttributeDataType/NUMBER
      (= :binary data) MessageAttributeDataType/BINARY)))


(defn mode
  "The `mode` function data interprets values in the provided config data into a 
`Mode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Mode` - the value is returned.
* is `:multi-model` - `Mode/MULTI_MODEL` is returned
* is `:single-model` - `Mode/SINGLE_MODEL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Mode data) data
      (= :multi-model data) Mode/MULTI_MODEL
      (= :single-model data) Mode/SINGLE_MODEL)))


(defn record-wrapper-type
  "The `record-wrapper-type` function data interprets values in the provided config data into a 
`RecordWrapperType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RecordWrapperType` - the value is returned.
* is `:none` - `RecordWrapperType/NONE` is returned
* is `:record-io` - `RecordWrapperType/RECORD_IO` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RecordWrapperType data) data
      (= :none data) RecordWrapperType/NONE
      (= :record-io data) RecordWrapperType/RECORD_IO)))


(defn s3-data-distribution-type
  "The `s3-data-distribution-type` function data interprets values in the provided config data into a 
`S3DataDistributionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `S3DataDistributionType` - the value is returned.
* is `:fully-replicated` - `S3DataDistributionType/FULLY_REPLICATED` is returned
* is `:sharded-by-s3-key` - `S3DataDistributionType/SHARDED_BY_S3_KEY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? S3DataDistributionType data) data
      (= :fully-replicated data) S3DataDistributionType/FULLY_REPLICATED
      (= :sharded-by-s3-key data) S3DataDistributionType/SHARDED_BY_S3_KEY)))


(defn s3-data-type
  "The `s3-data-type` function data interprets values in the provided config data into a 
`S3DataType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `S3DataType` - the value is returned.
* is `:augmented-manifest-file` - `S3DataType/AUGMENTED_MANIFEST_FILE` is returned
* is `:s3-prefix` - `S3DataType/S3_PREFIX` is returned
* is `:manifest-file` - `S3DataType/MANIFEST_FILE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? S3DataType data) data
      (= :augmented-manifest-file data) S3DataType/AUGMENTED_MANIFEST_FILE
      (= :s3-prefix data) S3DataType/S3_PREFIX
      (= :manifest-file data) S3DataType/MANIFEST_FILE)))


(defn split-type
  "The `split-type` function data interprets values in the provided config data into a 
`SplitType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SplitType` - the value is returned.
* is `:line` - `SplitType/LINE` is returned
* is `:record-io` - `SplitType/RECORD_IO` is returned
* is `:tf-record` - `SplitType/TF_RECORD` is returned
* is `:none` - `SplitType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SplitType data) data
      (= :line data) SplitType/LINE
      (= :record-io data) SplitType/RECORD_IO
      (= :tf-record data) SplitType/TF_RECORD
      (= :none data) SplitType/NONE)))


(defn url-encoding-format
  "The `url-encoding-format` function data interprets values in the provided config data into a 
`URLEncodingFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `URLEncodingFormat` - the value is returned.
* is `:indices` - `URLEncodingFormat/INDICES` is returned
* is `:none` - `URLEncodingFormat/NONE` is returned
* is `:repeat` - `URLEncodingFormat/REPEAT` is returned
* is `:commas` - `URLEncodingFormat/COMMAS` is returned
* is `:default` - `URLEncodingFormat/DEFAULT` is returned
* is `:brackets` - `URLEncodingFormat/BRACKETS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? URLEncodingFormat data) data
      (= :indices data) URLEncodingFormat/INDICES
      (= :none data) URLEncodingFormat/NONE
      (= :repeat data) URLEncodingFormat/REPEAT
      (= :commas data) URLEncodingFormat/COMMAS
      (= :default data) URLEncodingFormat/DEFAULT
      (= :brackets data) URLEncodingFormat/BRACKETS)))


(defn worker-type
  "The `worker-type` function data interprets values in the provided config data into a 
`WorkerType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WorkerType` - the value is returned.
* is `:g-025x` - `WorkerType/G_025X` is returned
* is `:g-1x` - `WorkerType/G_1X` is returned
* is `:standard` - `WorkerType/STANDARD` is returned
* is `:g-2x` - `WorkerType/G_2X` is returned
* is `:z-2x` - `WorkerType/Z_2X` is returned
* is `:g-8x` - `WorkerType/G_8X` is returned
* is `:g-4x` - `WorkerType/G_4X` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WorkerType data) data
      (= :g-025x data) WorkerType/G_025X
      (= :g-1x data) WorkerType/G_1X
      (= :standard data) WorkerType/STANDARD
      (= :g-2x data) WorkerType/G_2X
      (= :z-2x data) WorkerType/Z_2X
      (= :g-8x data) WorkerType/G_8X
      (= :g-4x data) WorkerType/G_4X)))


(defn build-algorithm-specification-builder
  "The build-algorithm-specification-builder function updates a AlgorithmSpecification$Builder instance using the provided configuration.
  The function takes the AlgorithmSpecification$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `metricDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-definitions` |
| `trainingImage` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:training-image` |
| `trainingInputMode` | software.amazon.awscdk.services.stepfunctions.tasks.InputMode | [[cdk.api.services.stepfunctions.tasks/input-mode]] | `:training-input-mode` |
"
  [^AlgorithmSpecification$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm-name)]
    (. builder algorithmName data))
  (when-some [data (lookup-entry config id :metric-definitions)]
    (. builder metricDefinitions data))
  (when-some [data (lookup-entry config id :training-image)]
    (. builder trainingImage data))
  (when-some [data (input-mode config id :training-input-mode)]
    (. builder trainingInputMode data))
  (.build builder))


(defn algorithm-specification-builder
  "Creates a  `AlgorithmSpecification$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-algorithm-specification-builder (new AlgorithmSpecification$Builder) id config))


(defn build-application-configuration-builder
  "The build-application-configuration-builder function updates a ApplicationConfiguration$Builder instance using the provided configuration.
  The function takes the ApplicationConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | software.amazon.awscdk.services.stepfunctions.tasks.Classification | [[cdk.support/lookup-entry]] | `:classification` |
| `nestedConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:nested-config` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
"
  [^ApplicationConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-some [data (lookup-entry config id :nested-config)]
    (. builder nestedConfig data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (.build builder))


(defn application-configuration-builder
  "Creates a  `ApplicationConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-application-configuration-builder (new ApplicationConfiguration$Builder) id config))


(defn build-athena-get-query-execution-builder
  "The build-athena-get-query-execution-builder function updates a AthenaGetQueryExecution$Builder instance using the provided configuration.
  The function takes the AthenaGetQueryExecution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaGetQueryExecution$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-get-query-execution-builder
  "Creates a  `AthenaGetQueryExecution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-athena-get-query-execution-builder (AthenaGetQueryExecution$Builder/create scope (name id)) id config))


(defn build-athena-get-query-execution-props-builder
  "The build-athena-get-query-execution-props-builder function updates a AthenaGetQueryExecutionProps$Builder instance using the provided configuration.
  The function takes the AthenaGetQueryExecutionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaGetQueryExecutionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-get-query-execution-props-builder
  "Creates a  `AthenaGetQueryExecutionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-athena-get-query-execution-props-builder (new AthenaGetQueryExecutionProps$Builder) id config))


(defn build-athena-get-query-results-builder
  "The build-athena-get-query-results-builder function updates a AthenaGetQueryResults$Builder instance using the provided configuration.
  The function takes the AthenaGetQueryResults$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `maxResults` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-results` |
| `nextToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-token` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaGetQueryResults$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :max-results)]
    (. builder maxResults data))
  (when-some [data (lookup-entry config id :next-token)]
    (. builder nextToken data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-get-query-results-builder
  "Creates a  `AthenaGetQueryResults$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-athena-get-query-results-builder (AthenaGetQueryResults$Builder/create scope (name id)) id config))


(defn build-athena-get-query-results-props-builder
  "The build-athena-get-query-results-props-builder function updates a AthenaGetQueryResultsProps$Builder instance using the provided configuration.
  The function takes the AthenaGetQueryResultsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `maxResults` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-results` |
| `nextToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:next-token` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaGetQueryResultsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :max-results)]
    (. builder maxResults data))
  (when-some [data (lookup-entry config id :next-token)]
    (. builder nextToken data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-get-query-results-props-builder
  "Creates a  `AthenaGetQueryResultsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-athena-get-query-results-props-builder (new AthenaGetQueryResultsProps$Builder) id config))


(defn build-athena-start-query-execution-builder
  "The build-athena-start-query-execution-builder function updates a AthenaStartQueryExecution$Builder instance using the provided configuration.
  The function takes the AthenaStartQueryExecution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientRequestToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-request-token` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:execution-parameters` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionContext` | software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext | [[cdk.support/lookup-entry]] | `:query-execution-context` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `resultConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration | [[cdk.support/lookup-entry]] | `:result-configuration` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^AthenaStartQueryExecution$Builder builder id config]
  (when-some [data (lookup-entry config id :client-request-token)]
    (. builder clientRequestToken data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-parameters)]
    (. builder executionParameters data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-context)]
    (. builder queryExecutionContext data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :result-configuration)]
    (. builder resultConfiguration data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn athena-start-query-execution-builder
  "Creates a  `AthenaStartQueryExecution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-athena-start-query-execution-builder (AthenaStartQueryExecution$Builder/create scope (name id)) id config))


(defn build-athena-start-query-execution-props-builder
  "The build-athena-start-query-execution-props-builder function updates a AthenaStartQueryExecutionProps$Builder instance using the provided configuration.
  The function takes the AthenaStartQueryExecutionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientRequestToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-request-token` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:execution-parameters` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionContext` | software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext | [[cdk.support/lookup-entry]] | `:query-execution-context` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `resultConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration | [[cdk.support/lookup-entry]] | `:result-configuration` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |
"
  [^AthenaStartQueryExecutionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-request-token)]
    (. builder clientRequestToken data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-parameters)]
    (. builder executionParameters data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-context)]
    (. builder queryExecutionContext data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :result-configuration)]
    (. builder resultConfiguration data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :work-group)]
    (. builder workGroup data))
  (.build builder))


(defn athena-start-query-execution-props-builder
  "Creates a  `AthenaStartQueryExecutionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-athena-start-query-execution-props-builder (new AthenaStartQueryExecutionProps$Builder) id config))


(defn build-athena-stop-query-execution-builder
  "The build-athena-stop-query-execution-builder function updates a AthenaStopQueryExecution$Builder instance using the provided configuration.
  The function takes the AthenaStopQueryExecution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaStopQueryExecution$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-stop-query-execution-builder
  "Creates a  `AthenaStopQueryExecution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-athena-stop-query-execution-builder (AthenaStopQueryExecution$Builder/create scope (name id)) id config))


(defn build-athena-stop-query-execution-props-builder
  "The build-athena-stop-query-execution-props-builder function updates a AthenaStopQueryExecutionProps$Builder instance using the provided configuration.
  The function takes the AthenaStopQueryExecutionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryExecutionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-execution-id` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^AthenaStopQueryExecutionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-execution-id)]
    (. builder queryExecutionId data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn athena-stop-query-execution-props-builder
  "Creates a  `AthenaStopQueryExecutionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-athena-stop-query-execution-props-builder (new AthenaStopQueryExecutionProps$Builder) id config))


(defn build-batch-container-overrides-builder
  "The build-batch-container-overrides-builder function updates a BatchContainerOverrides$Builder instance using the provided configuration.
  The function takes the BatchContainerOverrides$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `vcpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vcpus` |
"
  [^BatchContainerOverrides$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :gpu-count)]
    (. builder gpuCount data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :vcpus)]
    (. builder vcpus data))
  (.build builder))


(defn batch-container-overrides-builder
  "Creates a  `BatchContainerOverrides$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-batch-container-overrides-builder (new BatchContainerOverrides$Builder) id config))


(defn build-batch-job-dependency-builder
  "The build-batch-job-dependency-builder function updates a BatchJobDependency$Builder instance using the provided configuration.
  The function takes the BatchJobDependency$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^BatchJobDependency$Builder builder id config]
  (when-some [data (lookup-entry config id :job-id)]
    (. builder jobId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn batch-job-dependency-builder
  "Creates a  `BatchJobDependency$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-batch-job-dependency-builder (new BatchJobDependency$Builder) id config))


(defn build-batch-submit-job-builder
  "The build-batch-submit-job-builder function updates a BatchSubmitJob$Builder instance using the provided configuration.
  The function takes the BatchSubmitJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arraySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:array-size` |
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containerOverrides` | software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `dependsOn` | java.util.List | [[cdk.support/lookup-entry]] | `:depends-on` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jobDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-arn` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `jobQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-arn` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `payload` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:payload` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^BatchSubmitJob$Builder builder id config]
  (when-some [data (lookup-entry config id :array-size)]
    (. builder arraySize data))
  (when-some [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :depends-on)]
    (. builder dependsOn data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :job-definition-arn)]
    (. builder jobDefinitionArn data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :job-queue-arn)]
    (. builder jobQueueArn data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn batch-submit-job-builder
  "Creates a  `BatchSubmitJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-batch-submit-job-builder (BatchSubmitJob$Builder/create scope (name id)) id config))


(defn build-batch-submit-job-props-builder
  "The build-batch-submit-job-props-builder function updates a BatchSubmitJobProps$Builder instance using the provided configuration.
  The function takes the BatchSubmitJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arraySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:array-size` |
| `attempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attempts` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containerOverrides` | software.amazon.awscdk.services.stepfunctions.tasks.BatchContainerOverrides | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `dependsOn` | java.util.List | [[cdk.support/lookup-entry]] | `:depends-on` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jobDefinitionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-arn` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `jobQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-queue-arn` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `payload` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:payload` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^BatchSubmitJobProps$Builder builder id config]
  (when-some [data (lookup-entry config id :array-size)]
    (. builder arraySize data))
  (when-some [data (lookup-entry config id :attempts)]
    (. builder attempts data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :depends-on)]
    (. builder dependsOn data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :job-definition-arn)]
    (. builder jobDefinitionArn data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :job-queue-arn)]
    (. builder jobQueueArn data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn batch-submit-job-props-builder
  "Creates a  `BatchSubmitJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-batch-submit-job-props-builder (new BatchSubmitJobProps$Builder) id config))


(defn build-bedrock-invoke-model-builder
  "The build-bedrock-invoke-model-builder function updates a BedrockInvokeModel$Builder instance using the provided configuration.
  The function takes the BedrockInvokeModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `body` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:body` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `input` | software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `model` | software.amazon.awscdk.services.bedrock.IModel | [[cdk.support/lookup-entry]] | `:model` |
| `output` | software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps | [[cdk.support/lookup-entry]] | `:output` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^BedrockInvokeModel$Builder builder id config]
  (when-some [data (lookup-entry config id :accept)]
    (. builder accept data))
  (when-some [data (lookup-entry config id :body)]
    (. builder body data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :model)]
    (. builder model data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn bedrock-invoke-model-builder
  "Creates a  `BedrockInvokeModel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-bedrock-invoke-model-builder (BedrockInvokeModel$Builder/create scope (name id)) id config))


(defn build-bedrock-invoke-model-input-props-builder
  "The build-bedrock-invoke-model-input-props-builder function updates a BedrockInvokeModelInputProps$Builder instance using the provided configuration.
  The function takes the BedrockInvokeModelInputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^BedrockInvokeModelInputProps$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn bedrock-invoke-model-input-props-builder
  "Creates a  `BedrockInvokeModelInputProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bedrock-invoke-model-input-props-builder (new BedrockInvokeModelInputProps$Builder) id config))


(defn build-bedrock-invoke-model-output-props-builder
  "The build-bedrock-invoke-model-output-props-builder function updates a BedrockInvokeModelOutputProps$Builder instance using the provided configuration.
  The function takes the BedrockInvokeModelOutputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^BedrockInvokeModelOutputProps$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn bedrock-invoke-model-output-props-builder
  "Creates a  `BedrockInvokeModelOutputProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bedrock-invoke-model-output-props-builder (new BedrockInvokeModelOutputProps$Builder) id config))


(defn build-bedrock-invoke-model-props-builder
  "The build-bedrock-invoke-model-props-builder function updates a BedrockInvokeModelProps$Builder instance using the provided configuration.
  The function takes the BedrockInvokeModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `body` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:body` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `input` | software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `model` | software.amazon.awscdk.services.bedrock.IModel | [[cdk.support/lookup-entry]] | `:model` |
| `output` | software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps | [[cdk.support/lookup-entry]] | `:output` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^BedrockInvokeModelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :accept)]
    (. builder accept data))
  (when-some [data (lookup-entry config id :body)]
    (. builder body data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :model)]
    (. builder model data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn bedrock-invoke-model-props-builder
  "Creates a  `BedrockInvokeModelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-bedrock-invoke-model-props-builder (new BedrockInvokeModelProps$Builder) id config))


(defn build-call-api-gateway-endpoint-base-props-builder
  "The build-call-api-gateway-endpoint-base-props-builder function updates a CallApiGatewayEndpointBaseProps$Builder instance using the provided configuration.
  The function takes the CallApiGatewayEndpointBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-path` |
| `authType` | software.amazon.awscdk.services.stepfunctions.tasks.AuthType | [[cdk.api.services.stepfunctions.tasks/auth-type]] | `:auth-type` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod | [[cdk.api.services.stepfunctions.tasks/http-method]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallApiGatewayEndpointBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api-path)]
    (. builder apiPath data))
  (when-some [data (auth-type config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (http-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-api-gateway-endpoint-base-props-builder
  "Creates a  `CallApiGatewayEndpointBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-call-api-gateway-endpoint-base-props-builder (new CallApiGatewayEndpointBaseProps$Builder) id config))


(defn build-call-api-gateway-http-api-endpoint-builder
  "The build-call-api-gateway-http-api-endpoint-builder function updates a CallApiGatewayHttpApiEndpoint$Builder instance using the provided configuration.
  The function takes the CallApiGatewayHttpApiEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-path` |
| `apiStack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:api-stack` |
| `authType` | software.amazon.awscdk.services.stepfunctions.tasks.AuthType | [[cdk.api.services.stepfunctions.tasks/auth-type]] | `:auth-type` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod | [[cdk.api.services.stepfunctions.tasks/http-method]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallApiGatewayHttpApiEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-some [data (lookup-entry config id :api-path)]
    (. builder apiPath data))
  (when-some [data (lookup-entry config id :api-stack)]
    (. builder apiStack data))
  (when-some [data (auth-type config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (http-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-api-gateway-http-api-endpoint-builder
  "Creates a  `CallApiGatewayHttpApiEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-call-api-gateway-http-api-endpoint-builder (CallApiGatewayHttpApiEndpoint$Builder/create scope (name id)) id config))


(defn build-call-api-gateway-http-api-endpoint-props-builder
  "The build-call-api-gateway-http-api-endpoint-props-builder function updates a CallApiGatewayHttpApiEndpointProps$Builder instance using the provided configuration.
  The function takes the CallApiGatewayHttpApiEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `apiPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-path` |
| `apiStack` | software.amazon.awscdk.Stack | [[cdk.support/lookup-entry]] | `:api-stack` |
| `authType` | software.amazon.awscdk.services.stepfunctions.tasks.AuthType | [[cdk.api.services.stepfunctions.tasks/auth-type]] | `:auth-type` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod | [[cdk.api.services.stepfunctions.tasks/http-method]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallApiGatewayHttpApiEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-some [data (lookup-entry config id :api-path)]
    (. builder apiPath data))
  (when-some [data (lookup-entry config id :api-stack)]
    (. builder apiStack data))
  (when-some [data (auth-type config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (http-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-api-gateway-http-api-endpoint-props-builder
  "Creates a  `CallApiGatewayHttpApiEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-call-api-gateway-http-api-endpoint-props-builder (new CallApiGatewayHttpApiEndpointProps$Builder) id config))


(defn build-call-api-gateway-rest-api-endpoint-builder
  "The build-call-api-gateway-rest-api-endpoint-builder function updates a CallApiGatewayRestApiEndpoint$Builder instance using the provided configuration.
  The function takes the CallApiGatewayRestApiEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `apiPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-path` |
| `authType` | software.amazon.awscdk.services.stepfunctions.tasks.AuthType | [[cdk.api.services.stepfunctions.tasks/auth-type]] | `:auth-type` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod | [[cdk.api.services.stepfunctions.tasks/http-method]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallApiGatewayRestApiEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :api)]
    (. builder api data))
  (when-some [data (lookup-entry config id :api-path)]
    (. builder apiPath data))
  (when-some [data (auth-type config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (http-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-api-gateway-rest-api-endpoint-builder
  "Creates a  `CallApiGatewayRestApiEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-call-api-gateway-rest-api-endpoint-builder (CallApiGatewayRestApiEndpoint$Builder/create scope (name id)) id config))


(defn build-call-api-gateway-rest-api-endpoint-props-builder
  "The build-call-api-gateway-rest-api-endpoint-props-builder function updates a CallApiGatewayRestApiEndpointProps$Builder instance using the provided configuration.
  The function takes the CallApiGatewayRestApiEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.apigateway.IRestApi | [[cdk.support/lookup-entry]] | `:api` |
| `apiPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-path` |
| `authType` | software.amazon.awscdk.services.stepfunctions.tasks.AuthType | [[cdk.api.services.stepfunctions.tasks/auth-type]] | `:auth-type` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod | [[cdk.api.services.stepfunctions.tasks/http-method]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallApiGatewayRestApiEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api)]
    (. builder api data))
  (when-some [data (lookup-entry config id :api-path)]
    (. builder apiPath data))
  (when-some [data (auth-type config id :auth-type)]
    (. builder authType data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (http-method config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-api-gateway-rest-api-endpoint-props-builder
  "Creates a  `CallApiGatewayRestApiEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-call-api-gateway-rest-api-endpoint-props-builder (new CallApiGatewayRestApiEndpointProps$Builder) id config))


(defn build-call-aws-service-builder
  "The build-call-aws-service-builder function updates a CallAwsService$Builder instance using the provided configuration.
  The function takes the CallAwsService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `additionalIamStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-iam-statements` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `iamAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-action` |
| `iamResources` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-resources` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallAwsService$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :additional-iam-statements)]
    (. builder additionalIamStatements data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :iam-action)]
    (. builder iamAction data))
  (when-some [data (lookup-entry config id :iam-resources)]
    (. builder iamResources data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-aws-service-builder
  "Creates a  `CallAwsService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-call-aws-service-builder (CallAwsService$Builder/create scope (name id)) id config))


(defn build-call-aws-service-props-builder
  "The build-call-aws-service-props-builder function updates a CallAwsServiceProps$Builder instance using the provided configuration.
  The function takes the CallAwsServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `additionalIamStatements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-iam-statements` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `iamAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-action` |
| `iamResources` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-resources` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CallAwsServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :additional-iam-statements)]
    (. builder additionalIamStatements data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :iam-action)]
    (. builder iamAction data))
  (when-some [data (lookup-entry config id :iam-resources)]
    (. builder iamResources data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn call-aws-service-props-builder
  "Creates a  `CallAwsServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-call-aws-service-props-builder (new CallAwsServiceProps$Builder) id config))


(defn build-channel-builder
  "The build-channel-builder function updates a Channel$Builder instance using the provided configuration.
  The function takes the Channel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `compressionType` | software.amazon.awscdk.services.stepfunctions.tasks.CompressionType | [[cdk.api.services.stepfunctions.tasks/compression-type]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `dataSource` | software.amazon.awscdk.services.stepfunctions.tasks.DataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `inputMode` | software.amazon.awscdk.services.stepfunctions.tasks.InputMode | [[cdk.api.services.stepfunctions.tasks/input-mode]] | `:input-mode` |
| `recordWrapperType` | software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType | [[cdk.api.services.stepfunctions.tasks/record-wrapper-type]] | `:record-wrapper-type` |
| `shuffleConfig` | software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig | [[cdk.support/lookup-entry]] | `:shuffle-config` |
"
  [^Channel$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (compression-type config id :compression-type)]
    (. builder compressionType data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (input-mode config id :input-mode)]
    (. builder inputMode data))
  (when-some [data (record-wrapper-type config id :record-wrapper-type)]
    (. builder recordWrapperType data))
  (when-some [data (lookup-entry config id :shuffle-config)]
    (. builder shuffleConfig data))
  (.build builder))


(defn channel-builder
  "Creates a  `Channel$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-channel-builder (new Channel$Builder) id config))


(defn build-code-build-start-build-batch-builder
  "The build-code-build-start-build-batch-builder function updates a CodeBuildStartBuildBatch$Builder instance using the provided configuration.
  The function takes the CodeBuildStartBuildBatch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environmentVariablesOverride` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables-override` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CodeBuildStartBuildBatch$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment-variables-override)]
    (. builder environmentVariablesOverride data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn code-build-start-build-batch-builder
  "Creates a  `CodeBuildStartBuildBatch$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-code-build-start-build-batch-builder (CodeBuildStartBuildBatch$Builder/create scope (name id)) id config))


(defn build-code-build-start-build-batch-props-builder
  "The build-code-build-start-build-batch-props-builder function updates a CodeBuildStartBuildBatchProps$Builder instance using the provided configuration.
  The function takes the CodeBuildStartBuildBatchProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environmentVariablesOverride` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables-override` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CodeBuildStartBuildBatchProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment-variables-override)]
    (. builder environmentVariablesOverride data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn code-build-start-build-batch-props-builder
  "Creates a  `CodeBuildStartBuildBatchProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-build-start-build-batch-props-builder (new CodeBuildStartBuildBatchProps$Builder) id config))


(defn build-code-build-start-build-builder
  "The build-code-build-start-build-builder function updates a CodeBuildStartBuild$Builder instance using the provided configuration.
  The function takes the CodeBuildStartBuild$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environmentVariablesOverride` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables-override` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CodeBuildStartBuild$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment-variables-override)]
    (. builder environmentVariablesOverride data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn code-build-start-build-builder
  "Creates a  `CodeBuildStartBuild$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-code-build-start-build-builder (CodeBuildStartBuild$Builder/create scope (name id)) id config))


(defn build-code-build-start-build-props-builder
  "The build-code-build-start-build-props-builder function updates a CodeBuildStartBuildProps$Builder instance using the provided configuration.
  The function takes the CodeBuildStartBuildProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environmentVariablesOverride` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables-override` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `project` | software.amazon.awscdk.services.codebuild.IProject | [[cdk.support/lookup-entry]] | `:project` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CodeBuildStartBuildProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment-variables-override)]
    (. builder environmentVariablesOverride data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn code-build-start-build-props-builder
  "Creates a  `CodeBuildStartBuildProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-code-build-start-build-props-builder (new CodeBuildStartBuildProps$Builder) id config))


(defn build-common-ecs-run-task-props-builder
  "The build-common-ecs-run-task-props-builder function updates a CommonEcsRunTaskProps$Builder instance using the provided configuration.
  The function takes the CommonEcsRunTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern | [[cdk.api.services.stepfunctions/service-integration-pattern]] | `:integration-pattern` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^CommonEcsRunTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (service-integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn common-ecs-run-task-props-builder
  "Creates a  `CommonEcsRunTaskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-common-ecs-run-task-props-builder (new CommonEcsRunTaskProps$Builder) id config))


(defn build-container-definition-builder
  "The build-container-definition-builder function updates a ContainerDefinition$Builder instance using the provided configuration.
  The function takes the ContainerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-host-name` |
| `environmentVariables` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `image` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:image` |
| `mode` | software.amazon.awscdk.services.stepfunctions.tasks.Mode | [[cdk.api.services.stepfunctions.tasks/mode]] | `:mode` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelS3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:model-s3-location` |
"
  [^ContainerDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :container-host-name)]
    (. builder containerHostName data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (mode config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-some [data (lookup-entry config id :model-s3-location)]
    (. builder modelS3Location data))
  (.build builder))


(defn container-definition-builder
  "Creates a  `ContainerDefinition$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-container-definition-builder (ContainerDefinition$Builder/create) id config))


(defn build-container-definition-config-builder
  "The build-container-definition-config-builder function updates a ContainerDefinitionConfig$Builder instance using the provided configuration.
  The function takes the ContainerDefinitionConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^ContainerDefinitionConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn container-definition-config-builder
  "Creates a  `ContainerDefinitionConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-container-definition-config-builder (new ContainerDefinitionConfig$Builder) id config))


(defn build-container-definition-options-builder
  "The build-container-definition-options-builder function updates a ContainerDefinitionOptions$Builder instance using the provided configuration.
  The function takes the ContainerDefinitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-host-name` |
| `environmentVariables` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `image` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:image` |
| `mode` | software.amazon.awscdk.services.stepfunctions.tasks.Mode | [[cdk.api.services.stepfunctions.tasks/mode]] | `:mode` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelS3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:model-s3-location` |
"
  [^ContainerDefinitionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :container-host-name)]
    (. builder containerHostName data))
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (mode config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-some [data (lookup-entry config id :model-s3-location)]
    (. builder modelS3Location data))
  (.build builder))


(defn container-definition-options-builder
  "Creates a  `ContainerDefinitionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-container-definition-options-builder (new ContainerDefinitionOptions$Builder) id config))


(defn build-container-override-builder
  "The build-container-override-builder function updates a ContainerOverride$Builder instance using the provided configuration.
  The function takes the ContainerOverride$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerDefinition` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container-definition` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |
"
  [^ContainerOverride$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-definition)]
    (. builder containerDefinition data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-some [data (lookup-entry config id :memory-reservation)]
    (. builder memoryReservation data))
  (.build builder))


(defn container-override-builder
  "Creates a  `ContainerOverride$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-container-override-builder (new ContainerOverride$Builder) id config))


(defn build-container-overrides-builder
  "The build-container-overrides-builder function updates a ContainerOverrides$Builder instance using the provided configuration.
  The function takes the ContainerOverrides$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `vcpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vcpus` |
"
  [^ContainerOverrides$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :gpu-count)]
    (. builder gpuCount data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (when-some [data (lookup-entry config id :vcpus)]
    (. builder vcpus data))
  (.build builder))


(defn container-overrides-builder
  "Creates a  `ContainerOverrides$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-container-overrides-builder (new ContainerOverrides$Builder) id config))


(defn build-data-source-builder
  "The build-data-source-builder function updates a DataSource$Builder instance using the provided configuration.
  The function takes the DataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource | [[cdk.support/lookup-entry]] | `:s3-data-source` |
"
  [^DataSource$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-data-source)]
    (. builder s3DataSource data))
  (.build builder))


(defn data-source-builder
  "Creates a  `DataSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-data-source-builder (new DataSource$Builder) id config))


(defn build-docker-image-config-builder
  "The build-docker-image-config-builder function updates a DockerImageConfig$Builder instance using the provided configuration.
  The function takes the DockerImageConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
"
  [^DockerImageConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (.build builder))


(defn docker-image-config-builder
  "Creates a  `DockerImageConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-docker-image-config-builder (new DockerImageConfig$Builder) id config))


(defn build-dynamo-delete-item-builder
  "The build-dynamo-delete-item-builder function updates a DynamoDeleteItem$Builder instance using the provided configuration.
  The function takes the DynamoDeleteItem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoDeleteItem$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-delete-item-builder
  "Creates a  `DynamoDeleteItem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-dynamo-delete-item-builder (DynamoDeleteItem$Builder/create scope (name id)) id config))


(defn build-dynamo-delete-item-props-builder
  "The build-dynamo-delete-item-props-builder function updates a DynamoDeleteItemProps$Builder instance using the provided configuration.
  The function takes the DynamoDeleteItemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoDeleteItemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-delete-item-props-builder
  "Creates a  `DynamoDeleteItemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dynamo-delete-item-props-builder (new DynamoDeleteItemProps$Builder) id config))


(defn build-dynamo-get-item-builder
  "The build-dynamo-get-item-builder function updates a DynamoGetItem$Builder instance using the provided configuration.
  The function takes the DynamoGetItem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `consistentRead` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:consistent-read` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `projectionExpression` | java.util.List | [[cdk.support/lookup-entry]] | `:projection-expression` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoGetItem$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :consistent-read)]
    (. builder consistentRead data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :projection-expression)]
    (. builder projectionExpression data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-get-item-builder
  "Creates a  `DynamoGetItem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-dynamo-get-item-builder (DynamoGetItem$Builder/create scope (name id)) id config))


(defn build-dynamo-get-item-props-builder
  "The build-dynamo-get-item-props-builder function updates a DynamoGetItemProps$Builder instance using the provided configuration.
  The function takes the DynamoGetItemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `consistentRead` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:consistent-read` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `projectionExpression` | java.util.List | [[cdk.support/lookup-entry]] | `:projection-expression` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoGetItemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :consistent-read)]
    (. builder consistentRead data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :projection-expression)]
    (. builder projectionExpression data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-get-item-props-builder
  "Creates a  `DynamoGetItemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dynamo-get-item-props-builder (new DynamoGetItemProps$Builder) id config))


(defn build-dynamo-put-item-builder
  "The build-dynamo-put-item-builder function updates a DynamoPutItem$Builder instance using the provided configuration.
  The function takes the DynamoPutItem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `item` | java.util.Map | [[cdk.support/lookup-entry]] | `:item` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoPutItem$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :item)]
    (. builder item data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-put-item-builder
  "Creates a  `DynamoPutItem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-dynamo-put-item-builder (DynamoPutItem$Builder/create scope (name id)) id config))


(defn build-dynamo-put-item-props-builder
  "The build-dynamo-put-item-props-builder function updates a DynamoPutItemProps$Builder instance using the provided configuration.
  The function takes the DynamoPutItemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `item` | java.util.Map | [[cdk.support/lookup-entry]] | `:item` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^DynamoPutItemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :item)]
    (. builder item data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn dynamo-put-item-props-builder
  "Creates a  `DynamoPutItemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dynamo-put-item-props-builder (new DynamoPutItemProps$Builder) id config))


(defn build-dynamo-update-item-builder
  "The build-dynamo-update-item-builder function updates a DynamoUpdateItem$Builder instance using the provided configuration.
  The function takes the DynamoUpdateItem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `updateExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-expression` |
"
  [^DynamoUpdateItem$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :update-expression)]
    (. builder updateExpression data))
  (.build builder))


(defn dynamo-update-item-builder
  "Creates a  `DynamoUpdateItem$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-dynamo-update-item-builder (DynamoUpdateItem$Builder/create scope (name id)) id config))


(defn build-dynamo-update-item-props-builder
  "The build-dynamo-update-item-props-builder function updates a DynamoUpdateItemProps$Builder instance using the provided configuration.
  The function takes the DynamoUpdateItemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `conditionExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-expression` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expressionAttributeNames` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-names` |
| `expressionAttributeValues` | java.util.Map | [[cdk.support/lookup-entry]] | `:expression-attribute-values` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `key` | java.util.Map | [[cdk.support/lookup-entry]] | `:key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `returnConsumedCapacity` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity | [[cdk.api.services.stepfunctions.tasks/dynamo-consumed-capacity]] | `:return-consumed-capacity` |
| `returnItemCollectionMetrics` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics | [[cdk.api.services.stepfunctions.tasks/dynamo-item-collection-metrics]] | `:return-item-collection-metrics` |
| `returnValues` | software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues | [[cdk.api.services.stepfunctions.tasks/dynamo-return-values]] | `:return-values` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `updateExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-expression` |
"
  [^DynamoUpdateItemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :condition-expression)]
    (. builder conditionExpression data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression-attribute-names)]
    (. builder expressionAttributeNames data))
  (when-some [data (lookup-entry config id :expression-attribute-values)]
    (. builder expressionAttributeValues data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
    (. builder returnConsumedCapacity data))
  (when-some [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
    (. builder returnItemCollectionMetrics data))
  (when-some [data (dynamo-return-values config id :return-values)]
    (. builder returnValues data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :table)]
    (. builder table data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :update-expression)]
    (. builder updateExpression data))
  (.build builder))


(defn dynamo-update-item-props-builder
  "Creates a  `DynamoUpdateItemProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dynamo-update-item-props-builder (new DynamoUpdateItemProps$Builder) id config))


(defn build-ecs-ec2-launch-target-builder
  "The build-ecs-ec2-launch-target-builder function updates a EcsEc2LaunchTarget$Builder instance using the provided configuration.
  The function takes the EcsEc2LaunchTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
"
  [^EcsEc2LaunchTarget$Builder builder id config]
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (.build builder))


(defn ecs-ec2-launch-target-builder
  "Creates a  `EcsEc2LaunchTarget$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-ec2-launch-target-builder (EcsEc2LaunchTarget$Builder/create) id config))


(defn build-ecs-ec2-launch-target-options-builder
  "The build-ecs-ec2-launch-target-options-builder function updates a EcsEc2LaunchTargetOptions$Builder instance using the provided configuration.
  The function takes the EcsEc2LaunchTargetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
"
  [^EcsEc2LaunchTargetOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (.build builder))


(defn ecs-ec2-launch-target-options-builder
  "Creates a  `EcsEc2LaunchTargetOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-ec2-launch-target-options-builder (new EcsEc2LaunchTargetOptions$Builder) id config))


(defn build-ecs-fargate-launch-target-builder
  "The build-ecs-fargate-launch-target-builder function updates a EcsFargateLaunchTarget$Builder instance using the provided configuration.
  The function takes the EcsFargateLaunchTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
"
  [^EcsFargateLaunchTarget$Builder builder id config]
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (.build builder))


(defn ecs-fargate-launch-target-builder
  "Creates a  `EcsFargateLaunchTarget$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-fargate-launch-target-builder (EcsFargateLaunchTarget$Builder/create) id config))


(defn build-ecs-fargate-launch-target-options-builder
  "The build-ecs-fargate-launch-target-options-builder function updates a EcsFargateLaunchTargetOptions$Builder instance using the provided configuration.
  The function takes the EcsFargateLaunchTargetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
"
  [^EcsFargateLaunchTargetOptions$Builder builder id config]
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (.build builder))


(defn ecs-fargate-launch-target-options-builder
  "Creates a  `EcsFargateLaunchTargetOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-fargate-launch-target-options-builder (new EcsFargateLaunchTargetOptions$Builder) id config))


(defn build-ecs-launch-target-config-builder
  "The build-ecs-launch-target-config-builder function updates a EcsLaunchTargetConfig$Builder instance using the provided configuration.
  The function takes the EcsLaunchTargetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^EcsLaunchTargetConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn ecs-launch-target-config-builder
  "Creates a  `EcsLaunchTargetConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-launch-target-config-builder (new EcsLaunchTargetConfig$Builder) id config))


(defn build-ecs-run-task-builder
  "The build-ecs-run-task-builder function updates a EcsRunTask$Builder instance using the provided configuration.
  The function takes the EcsRunTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `launchTarget` | software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget | [[cdk.support/lookup-entry]] | `:launch-target` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `propagatedTagSource` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagated-tag-source` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `revisionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision-number` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EcsRunTask$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :launch-target)]
    (. builder launchTarget data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (propagated-tag-source config id :propagated-tag-source)]
    (. builder propagatedTagSource data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :revision-number)]
    (. builder revisionNumber data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn ecs-run-task-builder
  "Creates a  `EcsRunTask$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ecs-run-task-builder (EcsRunTask$Builder/create scope (name id)) id config))


(defn build-ecs-run-task-props-builder
  "The build-ecs-run-task-props-builder function updates a EcsRunTaskProps$Builder instance using the provided configuration.
  The function takes the EcsRunTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `launchTarget` | software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget | [[cdk.support/lookup-entry]] | `:launch-target` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `propagatedTagSource` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagated-tag-source` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `revisionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision-number` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EcsRunTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :container-overrides)]
    (. builder containerOverrides data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :launch-target)]
    (. builder launchTarget data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (propagated-tag-source config id :propagated-tag-source)]
    (. builder propagatedTagSource data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :revision-number)]
    (. builder revisionNumber data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn ecs-run-task-props-builder
  "Creates a  `EcsRunTaskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ecs-run-task-props-builder (new EcsRunTaskProps$Builder) id config))


(defn build-eks-call-builder
  "The build-eks-call-builder function updates a EksCall$Builder instance using the provided configuration.
  The function takes the EksCall$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `httpMethod` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods | [[cdk.api.services.stepfunctions.tasks/http-methods]] | `:http-method` |
| `httpPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-path` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EksCall$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (http-methods config id :http-method)]
    (. builder httpMethod data))
  (when-some [data (lookup-entry config id :http-path)]
    (. builder httpPath data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn eks-call-builder
  "Creates a  `EksCall$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-eks-call-builder (EksCall$Builder/create scope (name id)) id config))


(defn build-eks-call-props-builder
  "The build-eks-call-props-builder function updates a EksCallProps$Builder instance using the provided configuration.
  The function takes the EksCallProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.eks.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `httpMethod` | software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods | [[cdk.api.services.stepfunctions.tasks/http-methods]] | `:http-method` |
| `httpPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-path` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryParameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:query-parameters` |
| `requestBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:request-body` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EksCallProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (http-methods config id :http-method)]
    (. builder httpMethod data))
  (when-some [data (lookup-entry config id :http-path)]
    (. builder httpPath data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-parameters)]
    (. builder queryParameters data))
  (when-some [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn eks-call-props-builder
  "Creates a  `EksCallProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-eks-call-props-builder (new EksCallProps$Builder) id config))


(defn build-emr-add-step-builder
  "The build-emr-add-step-builder function updates a EmrAddStep$Builder instance using the provided configuration.
  The function takes the EmrAddStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure | [[cdk.api.services.stepfunctions.tasks/action-on-failure]] | `:action-on-failure` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrAddStep$Builder builder id config]
  (when-some [data (action-on-failure config id :action-on-failure)]
    (. builder actionOnFailure data))
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :jar)]
    (. builder jar data))
  (when-some [data (lookup-entry config id :main-class)]
    (. builder mainClass data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-add-step-builder
  "Creates a  `EmrAddStep$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-add-step-builder (EmrAddStep$Builder/create scope (name id)) id config))


(defn build-emr-add-step-props-builder
  "The build-emr-add-step-props-builder function updates a EmrAddStepProps$Builder instance using the provided configuration.
  The function takes the EmrAddStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionOnFailure` | software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure | [[cdk.api.services.stepfunctions.tasks/action-on-failure]] | `:action-on-failure` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jar` | java.lang.String | [[cdk.support/lookup-entry]] | `:jar` |
| `mainClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:main-class` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrAddStepProps$Builder builder id config]
  (when-some [data (action-on-failure config id :action-on-failure)]
    (. builder actionOnFailure data))
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :jar)]
    (. builder jar data))
  (when-some [data (lookup-entry config id :main-class)]
    (. builder mainClass data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-add-step-props-builder
  "Creates a  `EmrAddStepProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-add-step-props-builder (new EmrAddStepProps$Builder) id config))


(defn build-emr-cancel-step-builder
  "The build-emr-cancel-step-builder function updates a EmrCancelStep$Builder instance using the provided configuration.
  The function takes the EmrCancelStep$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stepId` | java.lang.String | [[cdk.support/lookup-entry]] | `:step-id` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrCancelStep$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :step-id)]
    (. builder stepId data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-cancel-step-builder
  "Creates a  `EmrCancelStep$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-cancel-step-builder (EmrCancelStep$Builder/create scope (name id)) id config))


(defn build-emr-cancel-step-props-builder
  "The build-emr-cancel-step-props-builder function updates a EmrCancelStepProps$Builder instance using the provided configuration.
  The function takes the EmrCancelStepProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stepId` | java.lang.String | [[cdk.support/lookup-entry]] | `:step-id` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrCancelStepProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :step-id)]
    (. builder stepId data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-cancel-step-props-builder
  "Creates a  `EmrCancelStepProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-cancel-step-props-builder (new EmrCancelStepProps$Builder) id config))


(defn build-emr-containers-create-virtual-cluster-builder
  "The build-emr-containers-create-virtual-cluster-builder function updates a EmrContainersCreateVirtualCluster$Builder instance using the provided configuration.
  The function takes the EmrContainersCreateVirtualCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `eksCluster` | software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput | [[cdk.support/lookup-entry]] | `:eks-cluster` |
| `eksNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-namespace` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-cluster-name` |
"
  [^EmrContainersCreateVirtualCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :eks-cluster)]
    (. builder eksCluster data))
  (when-some [data (lookup-entry config id :eks-namespace)]
    (. builder eksNamespace data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster-name)]
    (. builder virtualClusterName data))
  (.build builder))


(defn emr-containers-create-virtual-cluster-builder
  "Creates a  `EmrContainersCreateVirtualCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-containers-create-virtual-cluster-builder (EmrContainersCreateVirtualCluster$Builder/create scope (name id)) id config))


(defn build-emr-containers-create-virtual-cluster-props-builder
  "The build-emr-containers-create-virtual-cluster-props-builder function updates a EmrContainersCreateVirtualClusterProps$Builder instance using the provided configuration.
  The function takes the EmrContainersCreateVirtualClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `eksCluster` | software.amazon.awscdk.services.stepfunctions.tasks.EksClusterInput | [[cdk.support/lookup-entry]] | `:eks-cluster` |
| `eksNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-namespace` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-cluster-name` |
"
  [^EmrContainersCreateVirtualClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :eks-cluster)]
    (. builder eksCluster data))
  (when-some [data (lookup-entry config id :eks-namespace)]
    (. builder eksNamespace data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster-name)]
    (. builder virtualClusterName data))
  (.build builder))


(defn emr-containers-create-virtual-cluster-props-builder
  "Creates a  `EmrContainersCreateVirtualClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-containers-create-virtual-cluster-props-builder (new EmrContainersCreateVirtualClusterProps$Builder) id config))


(defn build-emr-containers-delete-virtual-cluster-builder
  "The build-emr-containers-delete-virtual-cluster-builder function updates a EmrContainersDeleteVirtualCluster$Builder instance using the provided configuration.
  The function takes the EmrContainersDeleteVirtualCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualClusterId` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:virtual-cluster-id` |
"
  [^EmrContainersDeleteVirtualCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster-id)]
    (. builder virtualClusterId data))
  (.build builder))


(defn emr-containers-delete-virtual-cluster-builder
  "Creates a  `EmrContainersDeleteVirtualCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-containers-delete-virtual-cluster-builder (EmrContainersDeleteVirtualCluster$Builder/create scope (name id)) id config))


(defn build-emr-containers-delete-virtual-cluster-props-builder
  "The build-emr-containers-delete-virtual-cluster-props-builder function updates a EmrContainersDeleteVirtualClusterProps$Builder instance using the provided configuration.
  The function takes the EmrContainersDeleteVirtualClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualClusterId` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:virtual-cluster-id` |
"
  [^EmrContainersDeleteVirtualClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster-id)]
    (. builder virtualClusterId data))
  (.build builder))


(defn emr-containers-delete-virtual-cluster-props-builder
  "Creates a  `EmrContainersDeleteVirtualClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-containers-delete-virtual-cluster-props-builder (new EmrContainersDeleteVirtualClusterProps$Builder) id config))


(defn build-emr-containers-start-job-run-builder
  "The build-emr-containers-start-job-run-builder function updates a EmrContainersStartJobRun$Builder instance using the provided configuration.
  The function takes the EmrContainersStartJobRun$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:application-config` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jobDriver` | software.amazon.awscdk.services.stepfunctions.tasks.JobDriver | [[cdk.support/lookup-entry]] | `:job-driver` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `monitoring` | software.amazon.awscdk.services.stepfunctions.tasks.Monitoring | [[cdk.support/lookup-entry]] | `:monitoring` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `releaseLabel` | software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel | [[cdk.support/lookup-entry]] | `:release-label` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualCluster` | software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput | [[cdk.support/lookup-entry]] | `:virtual-cluster` |
"
  [^EmrContainersStartJobRun$Builder builder id config]
  (when-some [data (lookup-entry config id :application-config)]
    (. builder applicationConfig data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :job-driver)]
    (. builder jobDriver data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :monitoring)]
    (. builder monitoring data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster)]
    (. builder virtualCluster data))
  (.build builder))


(defn emr-containers-start-job-run-builder
  "Creates a  `EmrContainersStartJobRun$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-containers-start-job-run-builder (EmrContainersStartJobRun$Builder/create scope (name id)) id config))


(defn build-emr-containers-start-job-run-props-builder
  "The build-emr-containers-start-job-run-props-builder function updates a EmrContainersStartJobRunProps$Builder instance using the provided configuration.
  The function takes the EmrContainersStartJobRunProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:application-config` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `jobDriver` | software.amazon.awscdk.services.stepfunctions.tasks.JobDriver | [[cdk.support/lookup-entry]] | `:job-driver` |
| `jobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-name` |
| `monitoring` | software.amazon.awscdk.services.stepfunctions.tasks.Monitoring | [[cdk.support/lookup-entry]] | `:monitoring` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `releaseLabel` | software.amazon.awscdk.services.stepfunctions.tasks.ReleaseLabel | [[cdk.support/lookup-entry]] | `:release-label` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `virtualCluster` | software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput | [[cdk.support/lookup-entry]] | `:virtual-cluster` |
"
  [^EmrContainersStartJobRunProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-config)]
    (. builder applicationConfig data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :job-driver)]
    (. builder jobDriver data))
  (when-some [data (lookup-entry config id :job-name)]
    (. builder jobName data))
  (when-some [data (lookup-entry config id :monitoring)]
    (. builder monitoring data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :virtual-cluster)]
    (. builder virtualCluster data))
  (.build builder))


(defn emr-containers-start-job-run-props-builder
  "Creates a  `EmrContainersStartJobRunProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-containers-start-job-run-props-builder (new EmrContainersStartJobRunProps$Builder) id config))


(defn build-emr-create-cluster-application-config-property-builder
  "The build-emr-create-cluster-application-config-property-builder function updates a EmrCreateCluster$ApplicationConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ApplicationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-info` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^EmrCreateCluster$ApplicationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn emr-create-cluster-application-config-property-builder
  "Creates a  `EmrCreateCluster$ApplicationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-application-config-property-builder (new EmrCreateCluster$ApplicationConfigProperty$Builder) id config))


(defn build-emr-create-cluster-auto-scaling-policy-property-builder
  "The build-emr-create-cluster-auto-scaling-policy-property-builder function updates a EmrCreateCluster$AutoScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$AutoScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingConstraintsProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^EmrCreateCluster$AutoScalingPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn emr-create-cluster-auto-scaling-policy-property-builder
  "Creates a  `EmrCreateCluster$AutoScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-auto-scaling-policy-property-builder (new EmrCreateCluster$AutoScalingPolicyProperty$Builder) id config))


(defn build-emr-create-cluster-bootstrap-action-config-property-builder
  "The build-emr-create-cluster-bootstrap-action-config-property-builder function updates a EmrCreateCluster$BootstrapActionConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$BootstrapActionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scriptBootstrapAction` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScriptBootstrapActionConfigProperty | [[cdk.support/lookup-entry]] | `:script-bootstrap-action` |
"
  [^EmrCreateCluster$BootstrapActionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :script-bootstrap-action)]
    (. builder scriptBootstrapAction data))
  (.build builder))


(defn emr-create-cluster-bootstrap-action-config-property-builder
  "Creates a  `EmrCreateCluster$BootstrapActionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-bootstrap-action-config-property-builder (new EmrCreateCluster$BootstrapActionConfigProperty$Builder) id config))


(defn build-emr-create-cluster-builder
  "The build-emr-create-cluster-builder function updates a EmrCreateCluster$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-info` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `autoScalingRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:auto-scaling-role` |
| `bootstrapActions` | java.util.List | [[cdk.support/lookup-entry]] | `:bootstrap-actions` |
| `clusterRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cluster-role` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsRootVolumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ebs-root-volume-size` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instances` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstancesConfigProperty | [[cdk.support/lookup-entry]] | `:instances` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `kerberosAttributes` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$KerberosAttributesProperty | [[cdk.support/lookup-entry]] | `:kerberos-attributes` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `scaleDownBehavior` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EmrClusterScaleDownBehavior | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-emr-cluster-scale-down-behavior]] | `:scale-down-behavior` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stepConcurrencyLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-concurrency-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |
"
  [^EmrCreateCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :auto-scaling-role)]
    (. builder autoScalingRole data))
  (when-some [data (lookup-entry config id :bootstrap-actions)]
    (. builder bootstrapActions data))
  (when-some [data (lookup-entry config id :cluster-role)]
    (. builder clusterRole data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-some [data (lookup-entry config id :ebs-root-volume-size)]
    (. builder ebsRootVolumeSize data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :kerberos-attributes)]
    (. builder kerberosAttributes data))
  (when-some [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (emr-create-cluster-emr-cluster-scale-down-behavior config id :scale-down-behavior)]
    (. builder scaleDownBehavior data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :step-concurrency-level)]
    (. builder stepConcurrencyLevel data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :visible-to-all-users)]
    (. builder visibleToAllUsers data))
  (.build builder))


(defn emr-create-cluster-builder
  "Creates a  `EmrCreateCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-create-cluster-builder (EmrCreateCluster$Builder/create scope (name id)) id config))


(defn build-emr-create-cluster-cloud-watch-alarm-definition-property-builder
  "The build-emr-create-cluster-cloud-watch-alarm-definition-property-builder function updates a EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmComparisonOperator | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-cloud-watch-alarm-comparison-operator]] | `:comparison-operator` |
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `period` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:period` |
| `statistic` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmStatistic | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-cloud-watch-alarm-statistic]] | `:statistic` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `unit` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmUnit | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-cloud-watch-alarm-unit]] | `:unit` |
"
  [^EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-cloud-watch-alarm-comparison-operator config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (emr-create-cluster-cloud-watch-alarm-statistic config id :statistic)]
    (. builder statistic data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (emr-create-cluster-cloud-watch-alarm-unit config id :unit)]
    (. builder unit data))
  (.build builder))


(defn emr-create-cluster-cloud-watch-alarm-definition-property-builder
  "Creates a  `EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-cloud-watch-alarm-definition-property-builder (new EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder) id config))


(defn build-emr-create-cluster-configuration-property-builder
  "The build-emr-create-cluster-configuration-property-builder function updates a EmrCreateCluster$ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
"
  [^EmrCreateCluster$ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :classification)]
    (. builder classification data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (.build builder))


(defn emr-create-cluster-configuration-property-builder
  "Creates a  `EmrCreateCluster$ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-configuration-property-builder (new EmrCreateCluster$ConfigurationProperty$Builder) id config))


(defn build-emr-create-cluster-ebs-block-device-config-property-builder
  "The build-emr-create-cluster-ebs-block-device-config-property-builder function updates a EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$VolumeSpecificationProperty | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |
"
  [^EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :volume-specification)]
    (. builder volumeSpecification data))
  (when-some [data (lookup-entry config id :volumes-per-instance)]
    (. builder volumesPerInstance data))
  (.build builder))


(defn emr-create-cluster-ebs-block-device-config-property-builder
  "Creates a  `EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-ebs-block-device-config-property-builder (new EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder) id config))


(defn build-emr-create-cluster-ebs-configuration-property-builder
  "The build-emr-create-cluster-ebs-configuration-property-builder function updates a EmrCreateCluster$EbsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$EbsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
"
  [^EmrCreateCluster$EbsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ebs-block-device-configs)]
    (. builder ebsBlockDeviceConfigs data))
  (when-some [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (.build builder))


(defn emr-create-cluster-ebs-configuration-property-builder
  "Creates a  `EmrCreateCluster$EbsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-ebs-configuration-property-builder (new EmrCreateCluster$EbsConfigurationProperty$Builder) id config))


(defn build-emr-create-cluster-instance-fleet-config-property-builder
  "The build-emr-create-cluster-instance-fleet-config-property-builder function updates a EmrCreateCluster$InstanceFleetConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$InstanceFleetConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceFleetType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceRoleType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-role-type]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
"
  [^EmrCreateCluster$InstanceFleetConfigProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-instance-role-type config id :instance-fleet-type)]
    (. builder instanceFleetType data))
  (when-some [data (lookup-entry config id :instance-type-configs)]
    (. builder instanceTypeConfigs data))
  (when-some [data (lookup-entry config id :launch-specifications)]
    (. builder launchSpecifications data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-some [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (.build builder))


(defn emr-create-cluster-instance-fleet-config-property-builder
  "Creates a  `EmrCreateCluster$InstanceFleetConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-instance-fleet-config-property-builder (new EmrCreateCluster$InstanceFleetConfigProperty$Builder) id config))


(defn build-emr-create-cluster-instance-fleet-provisioning-specifications-property-builder
  "The build-emr-create-cluster-instance-fleet-provisioning-specifications-property-builder function updates a EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$OnDemandProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:spot-specification` |
"
  [^EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-demand-specification)]
    (. builder onDemandSpecification data))
  (when-some [data (lookup-entry config id :spot-specification)]
    (. builder spotSpecification data))
  (.build builder))


(defn emr-create-cluster-instance-fleet-provisioning-specifications-property-builder
  "Creates a  `EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-instance-fleet-provisioning-specifications-property-builder (new EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder) id config))


(defn build-emr-create-cluster-instance-group-config-property-builder
  "The build-emr-create-cluster-instance-group-config-property-builder function updates a EmrCreateCluster$InstanceGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$InstanceGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$AutoScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `ebsConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceRole` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceRoleType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-role-type]] | `:instance-role` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `market` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceMarket | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-market]] | `:market` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^EmrCreateCluster$InstanceGroupConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-some [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (emr-create-cluster-instance-role-type config id :instance-role)]
    (. builder instanceRole data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (emr-create-cluster-instance-market config id :market)]
    (. builder market data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn emr-create-cluster-instance-group-config-property-builder
  "Creates a  `EmrCreateCluster$InstanceGroupConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-instance-group-config-property-builder (new EmrCreateCluster$InstanceGroupConfigProperty$Builder) id config))


(defn build-emr-create-cluster-instance-type-config-property-builder
  "The build-emr-create-cluster-instance-type-config-property-builder function updates a EmrCreateCluster$InstanceTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$InstanceTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `ebsConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |
"
  [^EmrCreateCluster$InstanceTypeConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bid-price)]
    (. builder bidPrice data))
  (when-some [data (lookup-entry config id :bid-price-as-percentage-of-on-demand-price)]
    (. builder bidPriceAsPercentageOfOnDemandPrice data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :ebs-configuration)]
    (. builder ebsConfiguration data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :weighted-capacity)]
    (. builder weightedCapacity data))
  (.build builder))


(defn emr-create-cluster-instance-type-config-property-builder
  "Creates a  `EmrCreateCluster$InstanceTypeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-instance-type-config-property-builder (new EmrCreateCluster$InstanceTypeConfigProperty$Builder) id config))


(defn build-emr-create-cluster-instances-config-property-builder
  "The build-emr-create-cluster-instances-config-property-builder function updates a EmrCreateCluster$InstancesConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$InstancesConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMasterSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-master-security-groups` |
| `additionalSlaveSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-slave-security-groups` |
| `ec2KeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-key-name` |
| `ec2SubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-subnet-id` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `emrManagedMasterSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:emr-managed-master-security-group` |
| `emrManagedSlaveSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:emr-managed-slave-security-group` |
| `hadoopVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:hadoop-version` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceFleets` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-fleets` |
| `instanceGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-groups` |
| `masterInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-instance-type` |
| `placement` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$PlacementTypeProperty | [[cdk.support/lookup-entry]] | `:placement` |
| `serviceAccessSecurityGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-access-security-group` |
| `slaveInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:slave-instance-type` |
| `terminationProtected` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protected` |
"
  [^EmrCreateCluster$InstancesConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-master-security-groups)]
    (. builder additionalMasterSecurityGroups data))
  (when-some [data (lookup-entry config id :additional-slave-security-groups)]
    (. builder additionalSlaveSecurityGroups data))
  (when-some [data (lookup-entry config id :ec2-key-name)]
    (. builder ec2KeyName data))
  (when-some [data (lookup-entry config id :ec2-subnet-id)]
    (. builder ec2SubnetId data))
  (when-some [data (lookup-entry config id :ec2-subnet-ids)]
    (. builder ec2SubnetIds data))
  (when-some [data (lookup-entry config id :emr-managed-master-security-group)]
    (. builder emrManagedMasterSecurityGroup data))
  (when-some [data (lookup-entry config id :emr-managed-slave-security-group)]
    (. builder emrManagedSlaveSecurityGroup data))
  (when-some [data (lookup-entry config id :hadoop-version)]
    (. builder hadoopVersion data))
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (lookup-entry config id :instance-fleets)]
    (. builder instanceFleets data))
  (when-some [data (lookup-entry config id :instance-groups)]
    (. builder instanceGroups data))
  (when-some [data (lookup-entry config id :master-instance-type)]
    (. builder masterInstanceType data))
  (when-some [data (lookup-entry config id :placement)]
    (. builder placement data))
  (when-some [data (lookup-entry config id :service-access-security-group)]
    (. builder serviceAccessSecurityGroup data))
  (when-some [data (lookup-entry config id :slave-instance-type)]
    (. builder slaveInstanceType data))
  (when-some [data (lookup-entry config id :termination-protected)]
    (. builder terminationProtected data))
  (.build builder))


(defn emr-create-cluster-instances-config-property-builder
  "Creates a  `EmrCreateCluster$InstancesConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-instances-config-property-builder (new EmrCreateCluster$InstancesConfigProperty$Builder) id config))


(defn build-emr-create-cluster-kerberos-attributes-property-builder
  "The build-emr-create-cluster-kerberos-attributes-property-builder function updates a EmrCreateCluster$KerberosAttributesProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$KerberosAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDomainJoinPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-password` |
| `adDomainJoinUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-user` |
| `crossRealmTrustPrincipalPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-realm-trust-principal-password` |
| `kdcAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:kdc-admin-password` |
| `realm` | java.lang.String | [[cdk.support/lookup-entry]] | `:realm` |
"
  [^EmrCreateCluster$KerberosAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ad-domain-join-password)]
    (. builder adDomainJoinPassword data))
  (when-some [data (lookup-entry config id :ad-domain-join-user)]
    (. builder adDomainJoinUser data))
  (when-some [data (lookup-entry config id :cross-realm-trust-principal-password)]
    (. builder crossRealmTrustPrincipalPassword data))
  (when-some [data (lookup-entry config id :kdc-admin-password)]
    (. builder kdcAdminPassword data))
  (when-some [data (lookup-entry config id :realm)]
    (. builder realm data))
  (.build builder))


(defn emr-create-cluster-kerberos-attributes-property-builder
  "Creates a  `EmrCreateCluster$KerberosAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-kerberos-attributes-property-builder (new EmrCreateCluster$KerberosAttributesProperty$Builder) id config))


(defn build-emr-create-cluster-metric-dimension-property-builder
  "The build-emr-create-cluster-metric-dimension-property-builder function updates a EmrCreateCluster$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^EmrCreateCluster$MetricDimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn emr-create-cluster-metric-dimension-property-builder
  "Creates a  `EmrCreateCluster$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-metric-dimension-property-builder (new EmrCreateCluster$MetricDimensionProperty$Builder) id config))


(defn build-emr-create-cluster-on-demand-provisioning-specification-property-builder
  "The build-emr-create-cluster-on-demand-provisioning-specification-property-builder function updates a EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$OnDemandAllocationStrategy | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-on-demand-allocation-strategy]] | `:allocation-strategy` |
"
  [^EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-on-demand-allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (.build builder))


(defn emr-create-cluster-on-demand-provisioning-specification-property-builder
  "Creates a  `EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-on-demand-provisioning-specification-property-builder (new EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder) id config))


(defn build-emr-create-cluster-placement-type-property-builder
  "The build-emr-create-cluster-placement-type-property-builder function updates a EmrCreateCluster$PlacementTypeProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$PlacementTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
"
  [^EmrCreateCluster$PlacementTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (.build builder))


(defn emr-create-cluster-placement-type-property-builder
  "Creates a  `EmrCreateCluster$PlacementTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-placement-type-property-builder (new EmrCreateCluster$PlacementTypeProperty$Builder) id config))


(defn build-emr-create-cluster-props-builder
  "The build-emr-create-cluster-props-builder function updates a EmrCreateClusterProps$Builder instance using the provided configuration.
  The function takes the EmrCreateClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-info` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `autoScalingRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:auto-scaling-role` |
| `bootstrapActions` | java.util.List | [[cdk.support/lookup-entry]] | `:bootstrap-actions` |
| `clusterRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cluster-role` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `customAmiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-ami-id` |
| `ebsRootVolumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ebs-root-volume-size` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instances` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstancesConfigProperty | [[cdk.support/lookup-entry]] | `:instances` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `kerberosAttributes` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$KerberosAttributesProperty | [[cdk.support/lookup-entry]] | `:kerberos-attributes` |
| `logUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `releaseLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-label` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `scaleDownBehavior` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EmrClusterScaleDownBehavior | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-emr-cluster-scale-down-behavior]] | `:scale-down-behavior` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stepConcurrencyLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step-concurrency-level` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |
"
  [^EmrCreateClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-info)]
    (. builder additionalInfo data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :auto-scaling-role)]
    (. builder autoScalingRole data))
  (when-some [data (lookup-entry config id :bootstrap-actions)]
    (. builder bootstrapActions data))
  (when-some [data (lookup-entry config id :cluster-role)]
    (. builder clusterRole data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :custom-ami-id)]
    (. builder customAmiId data))
  (when-some [data (lookup-entry config id :ebs-root-volume-size)]
    (. builder ebsRootVolumeSize data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :kerberos-attributes)]
    (. builder kerberosAttributes data))
  (when-some [data (lookup-entry config id :log-uri)]
    (. builder logUri data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :release-label)]
    (. builder releaseLabel data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (emr-create-cluster-emr-cluster-scale-down-behavior config id :scale-down-behavior)]
    (. builder scaleDownBehavior data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :step-concurrency-level)]
    (. builder stepConcurrencyLevel data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :visible-to-all-users)]
    (. builder visibleToAllUsers data))
  (.build builder))


(defn emr-create-cluster-props-builder
  "Creates a  `EmrCreateClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-props-builder (new EmrCreateClusterProps$Builder) id config))


(defn build-emr-create-cluster-scaling-action-property-builder
  "The build-emr-create-cluster-scaling-action-property-builder function updates a EmrCreateCluster$ScalingActionProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ScalingActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceMarket | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-market]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |
"
  [^EmrCreateCluster$ScalingActionProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-instance-market config id :market)]
    (. builder market data))
  (when-some [data (lookup-entry config id :simple-scaling-policy-configuration)]
    (. builder simpleScalingPolicyConfiguration data))
  (.build builder))


(defn emr-create-cluster-scaling-action-property-builder
  "Creates a  `EmrCreateCluster$ScalingActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-scaling-action-property-builder (new EmrCreateCluster$ScalingActionProperty$Builder) id config))


(defn build-emr-create-cluster-scaling-constraints-property-builder
  "The build-emr-create-cluster-scaling-constraints-property-builder function updates a EmrCreateCluster$ScalingConstraintsProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ScalingConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^EmrCreateCluster$ScalingConstraintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn emr-create-cluster-scaling-constraints-property-builder
  "Creates a  `EmrCreateCluster$ScalingConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-scaling-constraints-property-builder (new EmrCreateCluster$ScalingConstraintsProperty$Builder) id config))


(defn build-emr-create-cluster-scaling-rule-property-builder
  "The build-emr-create-cluster-scaling-rule-property-builder function updates a EmrCreateCluster$ScalingRuleProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ScalingRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingTriggerProperty | [[cdk.support/lookup-entry]] | `:trigger` |
"
  [^EmrCreateCluster$ScalingRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :trigger)]
    (. builder trigger data))
  (.build builder))


(defn emr-create-cluster-scaling-rule-property-builder
  "Creates a  `EmrCreateCluster$ScalingRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-scaling-rule-property-builder (new EmrCreateCluster$ScalingRuleProperty$Builder) id config))


(defn build-emr-create-cluster-scaling-trigger-property-builder
  "The build-emr-create-cluster-scaling-trigger-property-builder function updates a EmrCreateCluster$ScalingTriggerProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ScalingTriggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |
"
  [^EmrCreateCluster$ScalingTriggerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-alarm-definition)]
    (. builder cloudWatchAlarmDefinition data))
  (.build builder))


(defn emr-create-cluster-scaling-trigger-property-builder
  "Creates a  `EmrCreateCluster$ScalingTriggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-scaling-trigger-property-builder (new EmrCreateCluster$ScalingTriggerProperty$Builder) id config))


(defn build-emr-create-cluster-script-bootstrap-action-config-property-builder
  "The build-emr-create-cluster-script-bootstrap-action-config-property-builder function updates a EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn emr-create-cluster-script-bootstrap-action-config-property-builder
  "Creates a  `EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-script-bootstrap-action-config-property-builder (new EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder) id config))


(defn build-emr-create-cluster-simple-scaling-policy-configuration-property-builder
  "The build-emr-create-cluster-simple-scaling-policy-configuration-property-builder function updates a EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingAdjustmentType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-scaling-adjustment-type]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
"
  [^EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-scaling-adjustment-type config id :adjustment-type)]
    (. builder adjustmentType data))
  (when-some [data (lookup-entry config id :cool-down)]
    (. builder coolDown data))
  (when-some [data (lookup-entry config id :scaling-adjustment)]
    (. builder scalingAdjustment data))
  (.build builder))


(defn emr-create-cluster-simple-scaling-policy-configuration-property-builder
  "Creates a  `EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-simple-scaling-policy-configuration-property-builder (new EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder) id config))


(defn build-emr-create-cluster-spot-provisioning-specification-property-builder
  "The build-emr-create-cluster-spot-provisioning-specification-property-builder function updates a EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotAllocationStrategy | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-spot-allocation-strategy]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `timeoutAction` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotTimeoutAction | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-spot-timeout-action]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |
"
  [^EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder builder id config]
  (when-some [data (emr-create-cluster-spot-allocation-strategy config id :allocation-strategy)]
    (. builder allocationStrategy data))
  (when-some [data (lookup-entry config id :block-duration-minutes)]
    (. builder blockDurationMinutes data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (emr-create-cluster-spot-timeout-action config id :timeout-action)]
    (. builder timeoutAction data))
  (when-some [data (lookup-entry config id :timeout-duration-minutes)]
    (. builder timeoutDurationMinutes data))
  (.build builder))


(defn emr-create-cluster-spot-provisioning-specification-property-builder
  "Creates a  `EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-spot-provisioning-specification-property-builder (new EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder) id config))


(defn build-emr-create-cluster-volume-specification-property-builder
  "The build-emr-create-cluster-volume-specification-property-builder function updates a EmrCreateCluster$VolumeSpecificationProperty$Builder instance using the provided configuration.
  The function takes the EmrCreateCluster$VolumeSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EbsBlockDeviceVolumeType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-ebs-block-device-volume-type]] | `:volume-type` |
"
  [^EmrCreateCluster$VolumeSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (when-some [data (emr-create-cluster-ebs-block-device-volume-type config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn emr-create-cluster-volume-specification-property-builder
  "Creates a  `EmrCreateCluster$VolumeSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-create-cluster-volume-specification-property-builder (new EmrCreateCluster$VolumeSpecificationProperty$Builder) id config))


(defn build-emr-modify-instance-fleet-by-name-builder
  "The build-emr-modify-instance-fleet-by-name-builder function updates a EmrModifyInstanceFleetByName$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceFleetByName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instanceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-name` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrModifyInstanceFleetByName$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instance-fleet-name)]
    (. builder instanceFleetName data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-some [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-modify-instance-fleet-by-name-builder
  "Creates a  `EmrModifyInstanceFleetByName$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-modify-instance-fleet-by-name-builder (EmrModifyInstanceFleetByName$Builder/create scope (name id)) id config))


(defn build-emr-modify-instance-fleet-by-name-props-builder
  "The build-emr-modify-instance-fleet-by-name-props-builder function updates a EmrModifyInstanceFleetByNameProps$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceFleetByNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instanceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-fleet-name` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrModifyInstanceFleetByNameProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instance-fleet-name)]
    (. builder instanceFleetName data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :target-on-demand-capacity)]
    (. builder targetOnDemandCapacity data))
  (when-some [data (lookup-entry config id :target-spot-capacity)]
    (. builder targetSpotCapacity data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-modify-instance-fleet-by-name-props-builder
  "Creates a  `EmrModifyInstanceFleetByNameProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-modify-instance-fleet-by-name-props-builder (new EmrModifyInstanceFleetByNameProps$Builder) id config))


(defn build-emr-modify-instance-group-by-name-builder
  "The build-emr-modify-instance-group-by-name-builder function updates a EmrModifyInstanceGroupByName$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceGroupByName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instanceGroup` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty | [[cdk.support/lookup-entry]] | `:instance-group` |
| `instanceGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-group-name` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrModifyInstanceGroupByName$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instance-group)]
    (. builder instanceGroup data))
  (when-some [data (lookup-entry config id :instance-group-name)]
    (. builder instanceGroupName data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-modify-instance-group-by-name-builder
  "Creates a  `EmrModifyInstanceGroupByName$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-modify-instance-group-by-name-builder (EmrModifyInstanceGroupByName$Builder/create scope (name id)) id config))


(defn build-emr-modify-instance-group-by-name-instance-group-modify-config-property-builder
  "The build-emr-modify-instance-group-by-name-instance-group-modify-config-property-builder function updates a EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `eC2InstanceIdsToTerminate` | java.util.List | [[cdk.support/lookup-entry]] | `:e-c2-instance-ids-to-terminate` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `shrinkPolicy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$ShrinkPolicyProperty | [[cdk.support/lookup-entry]] | `:shrink-policy` |
"
  [^EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :e-c2-instance-ids-to-terminate)]
    (. builder eC2InstanceIdsToTerminate data))
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (lookup-entry config id :shrink-policy)]
    (. builder shrinkPolicy data))
  (.build builder))


(defn emr-modify-instance-group-by-name-instance-group-modify-config-property-builder
  "Creates a  `EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-modify-instance-group-by-name-instance-group-modify-config-property-builder (new EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder) id config))


(defn build-emr-modify-instance-group-by-name-instance-resize-policy-property-builder
  "The build-emr-modify-instance-group-by-name-instance-resize-policy-property-builder function updates a EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceTerminationTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:instance-termination-timeout` |
| `instancesToProtect` | java.util.List | [[cdk.support/lookup-entry]] | `:instances-to-protect` |
| `instancesToTerminate` | java.util.List | [[cdk.support/lookup-entry]] | `:instances-to-terminate` |
"
  [^EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-termination-timeout)]
    (. builder instanceTerminationTimeout data))
  (when-some [data (lookup-entry config id :instances-to-protect)]
    (. builder instancesToProtect data))
  (when-some [data (lookup-entry config id :instances-to-terminate)]
    (. builder instancesToTerminate data))
  (.build builder))


(defn emr-modify-instance-group-by-name-instance-resize-policy-property-builder
  "Creates a  `EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-modify-instance-group-by-name-instance-resize-policy-property-builder (new EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder) id config))


(defn build-emr-modify-instance-group-by-name-props-builder
  "The build-emr-modify-instance-group-by-name-props-builder function updates a EmrModifyInstanceGroupByNameProps$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceGroupByNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `instanceGroup` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty | [[cdk.support/lookup-entry]] | `:instance-group` |
| `instanceGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-group-name` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrModifyInstanceGroupByNameProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (lookup-entry config id :instance-group)]
    (. builder instanceGroup data))
  (when-some [data (lookup-entry config id :instance-group-name)]
    (. builder instanceGroupName data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-modify-instance-group-by-name-props-builder
  "Creates a  `EmrModifyInstanceGroupByNameProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-modify-instance-group-by-name-props-builder (new EmrModifyInstanceGroupByNameProps$Builder) id config))


(defn build-emr-modify-instance-group-by-name-shrink-policy-property-builder
  "The build-emr-modify-instance-group-by-name-shrink-policy-property-builder function updates a EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder instance using the provided configuration.
  The function takes the EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decommissionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:decommission-timeout` |
| `instanceResizePolicy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$InstanceResizePolicyProperty | [[cdk.support/lookup-entry]] | `:instance-resize-policy` |
"
  [^EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :decommission-timeout)]
    (. builder decommissionTimeout data))
  (when-some [data (lookup-entry config id :instance-resize-policy)]
    (. builder instanceResizePolicy data))
  (.build builder))


(defn emr-modify-instance-group-by-name-shrink-policy-property-builder
  "Creates a  `EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-modify-instance-group-by-name-shrink-policy-property-builder (new EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder) id config))


(defn build-emr-set-cluster-termination-protection-builder
  "The build-emr-set-cluster-termination-protection-builder function updates a EmrSetClusterTerminationProtection$Builder instance using the provided configuration.
  The function takes the EmrSetClusterTerminationProtection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `terminationProtected` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protected` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrSetClusterTerminationProtection$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :termination-protected)]
    (. builder terminationProtected data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-set-cluster-termination-protection-builder
  "Creates a  `EmrSetClusterTerminationProtection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-set-cluster-termination-protection-builder (EmrSetClusterTerminationProtection$Builder/create scope (name id)) id config))


(defn build-emr-set-cluster-termination-protection-props-builder
  "The build-emr-set-cluster-termination-protection-props-builder function updates a EmrSetClusterTerminationProtectionProps$Builder instance using the provided configuration.
  The function takes the EmrSetClusterTerminationProtectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `terminationProtected` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protected` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrSetClusterTerminationProtectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :termination-protected)]
    (. builder terminationProtected data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-set-cluster-termination-protection-props-builder
  "Creates a  `EmrSetClusterTerminationProtectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-set-cluster-termination-protection-props-builder (new EmrSetClusterTerminationProtectionProps$Builder) id config))


(defn build-emr-terminate-cluster-builder
  "The build-emr-terminate-cluster-builder function updates a EmrTerminateCluster$Builder instance using the provided configuration.
  The function takes the EmrTerminateCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrTerminateCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-terminate-cluster-builder
  "Creates a  `EmrTerminateCluster$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-emr-terminate-cluster-builder (EmrTerminateCluster$Builder/create scope (name id)) id config))


(defn build-emr-terminate-cluster-props-builder
  "The build-emr-terminate-cluster-props-builder function updates a EmrTerminateClusterProps$Builder instance using the provided configuration.
  The function takes the EmrTerminateClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-id` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EmrTerminateClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-id)]
    (. builder clusterId data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn emr-terminate-cluster-props-builder
  "Creates a  `EmrTerminateClusterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-emr-terminate-cluster-props-builder (new EmrTerminateClusterProps$Builder) id config))


(defn build-encryption-configuration-builder
  "The build-encryption-configuration-builder function updates a EncryptionConfiguration$Builder instance using the provided configuration.
  The function takes the EncryptionConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `encryptionOption` | software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption | [[cdk.api.services.stepfunctions.tasks/encryption-option]] | `:encryption-option` |
"
  [^EncryptionConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (encryption-option config id :encryption-option)]
    (. builder encryptionOption data))
  (.build builder))


(defn encryption-configuration-builder
  "Creates a  `EncryptionConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-encryption-configuration-builder (new EncryptionConfiguration$Builder) id config))


(defn build-evaluate-expression-builder
  "The build-evaluate-expression-builder function updates a EvaluateExpression$Builder instance using the provided configuration.
  The function takes the EvaluateExpression$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EvaluateExpression$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn evaluate-expression-builder
  "Creates a  `EvaluateExpression$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-evaluate-expression-builder (EvaluateExpression$Builder/create scope (name id)) id config))


(defn build-evaluate-expression-props-builder
  "The build-evaluate-expression-props-builder function updates a EvaluateExpressionProps$Builder instance using the provided configuration.
  The function takes the EvaluateExpressionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EvaluateExpressionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn evaluate-expression-props-builder
  "Creates a  `EvaluateExpressionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-evaluate-expression-props-builder (new EvaluateExpressionProps$Builder) id config))


(defn build-event-bridge-put-events-builder
  "The build-event-bridge-put-events-builder function updates a EventBridgePutEvents$Builder instance using the provided configuration.
  The function takes the EventBridgePutEvents$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `entries` | java.util.List | [[cdk.support/lookup-entry]] | `:entries` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EventBridgePutEvents$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :entries)]
    (. builder entries data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn event-bridge-put-events-builder
  "Creates a  `EventBridgePutEvents$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-event-bridge-put-events-builder (EventBridgePutEvents$Builder/create scope (name id)) id config))


(defn build-event-bridge-put-events-entry-builder
  "The build-event-bridge-put-events-entry-builder function updates a EventBridgePutEventsEntry$Builder instance using the provided configuration.
  The function takes the EventBridgePutEventsEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detail` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:detail` |
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
"
  [^EventBridgePutEventsEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :detail)]
    (. builder detail data))
  (when-some [data (lookup-entry config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :event-bus)]
    (. builder eventBus data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn event-bridge-put-events-entry-builder
  "Creates a  `EventBridgePutEventsEntry$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-bridge-put-events-entry-builder (new EventBridgePutEventsEntry$Builder) id config))


(defn build-event-bridge-put-events-props-builder
  "The build-event-bridge-put-events-props-builder function updates a EventBridgePutEventsProps$Builder instance using the provided configuration.
  The function takes the EventBridgePutEventsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `entries` | java.util.List | [[cdk.support/lookup-entry]] | `:entries` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^EventBridgePutEventsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :entries)]
    (. builder entries data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn event-bridge-put-events-props-builder
  "Creates a  `EventBridgePutEventsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-event-bridge-put-events-props-builder (new EventBridgePutEventsProps$Builder) id config))


(defn build-glue-data-brew-start-job-run-builder
  "The build-glue-data-brew-start-job-run-builder function updates a GlueDataBrewStartJobRun$Builder instance using the provided configuration.
  The function takes the GlueDataBrewStartJobRun$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^GlueDataBrewStartJobRun$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn glue-data-brew-start-job-run-builder
  "Creates a  `GlueDataBrewStartJobRun$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-glue-data-brew-start-job-run-builder (GlueDataBrewStartJobRun$Builder/create scope (name id)) id config))


(defn build-glue-data-brew-start-job-run-props-builder
  "The build-glue-data-brew-start-job-run-props-builder function updates a GlueDataBrewStartJobRunProps$Builder instance using the provided configuration.
  The function takes the GlueDataBrewStartJobRunProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^GlueDataBrewStartJobRunProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn glue-data-brew-start-job-run-props-builder
  "Creates a  `GlueDataBrewStartJobRunProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-glue-data-brew-start-job-run-props-builder (new GlueDataBrewStartJobRunProps$Builder) id config))


(defn build-glue-start-crawler-run-builder
  "The build-glue-start-crawler-run-builder function updates a GlueStartCrawlerRun$Builder instance using the provided configuration.
  The function takes the GlueStartCrawlerRun$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^GlueStartCrawlerRun$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :crawler-name)]
    (. builder crawlerName data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn glue-start-crawler-run-builder
  "Creates a  `GlueStartCrawlerRun$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-glue-start-crawler-run-builder (GlueStartCrawlerRun$Builder/create scope (name id)) id config))


(defn build-glue-start-crawler-run-props-builder
  "The build-glue-start-crawler-run-props-builder function updates a GlueStartCrawlerRunProps$Builder instance using the provided configuration.
  The function takes the GlueStartCrawlerRunProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crawlerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:crawler-name` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^GlueStartCrawlerRunProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :crawler-name)]
    (. builder crawlerName data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn glue-start-crawler-run-props-builder
  "Creates a  `GlueStartCrawlerRunProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-glue-start-crawler-run-props-builder (new GlueStartCrawlerRunProps$Builder) id config))


(defn build-glue-start-job-run-builder
  "The build-glue-start-job-run-builder function updates a GlueStartJobRun$Builder instance using the provided configuration.
  The function takes the GlueStartJobRun$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:arguments` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `glueJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-job-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `notifyDelayAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:notify-delay-after` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `workerConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |
"
  [^GlueStartJobRun$Builder builder id config]
  (when-some [data (lookup-entry config id :arguments)]
    (. builder arguments data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :glue-job-name)]
    (. builder glueJobName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :notify-delay-after)]
    (. builder notifyDelayAfter data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :worker-configuration)]
    (. builder workerConfiguration data))
  (.build builder))


(defn glue-start-job-run-builder
  "Creates a  `GlueStartJobRun$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-glue-start-job-run-builder (GlueStartJobRun$Builder/create scope (name id)) id config))


(defn build-glue-start-job-run-props-builder
  "The build-glue-start-job-run-props-builder function updates a GlueStartJobRunProps$Builder instance using the provided configuration.
  The function takes the GlueStartJobRunProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:arguments` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `glueJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:glue-job-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `notifyDelayAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:notify-delay-after` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `securityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-configuration` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `workerConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |
"
  [^GlueStartJobRunProps$Builder builder id config]
  (when-some [data (lookup-entry config id :arguments)]
    (. builder arguments data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :glue-job-name)]
    (. builder glueJobName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :notify-delay-after)]
    (. builder notifyDelayAfter data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :security-configuration)]
    (. builder securityConfiguration data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :worker-configuration)]
    (. builder workerConfiguration data))
  (.build builder))


(defn glue-start-job-run-props-builder
  "Creates a  `GlueStartJobRunProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-glue-start-job-run-props-builder (new GlueStartJobRunProps$Builder) id config))


(defn build-http-invoke-builder
  "The build-http-invoke-builder function updates a HttpInvoke$Builder instance using the provided configuration.
  The function takes the HttpInvoke$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiEndpoint` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:api-endpoint` |
| `apiRoot` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-root` |
| `body` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:body` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryStringParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `urlEncodingFormat` | software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat | [[cdk.api.services.stepfunctions.tasks/url-encoding-format]] | `:url-encoding-format` |
"
  [^HttpInvoke$Builder builder id config]
  (when-some [data (lookup-entry config id :api-endpoint)]
    (. builder apiEndpoint data))
  (when-some [data (lookup-entry config id :api-root)]
    (. builder apiRoot data))
  (when-some [data (lookup-entry config id :body)]
    (. builder body data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :connection)]
    (. builder connection data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (url-encoding-format config id :url-encoding-format)]
    (. builder urlEncodingFormat data))
  (.build builder))


(defn http-invoke-builder
  "Creates a  `HttpInvoke$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-http-invoke-builder (HttpInvoke$Builder/create scope (name id)) id config))


(defn build-http-invoke-props-builder
  "The build-http-invoke-props-builder function updates a HttpInvokeProps$Builder instance using the provided configuration.
  The function takes the HttpInvokeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiEndpoint` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:api-endpoint` |
| `apiRoot` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-root` |
| `body` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:body` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `connection` | software.amazon.awscdk.services.events.IConnection | [[cdk.support/lookup-entry]] | `:connection` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `headers` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:headers` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `method` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:method` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queryStringParameters` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:query-string-parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `urlEncodingFormat` | software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat | [[cdk.api.services.stepfunctions.tasks/url-encoding-format]] | `:url-encoding-format` |
"
  [^HttpInvokeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api-endpoint)]
    (. builder apiEndpoint data))
  (when-some [data (lookup-entry config id :api-root)]
    (. builder apiRoot data))
  (when-some [data (lookup-entry config id :body)]
    (. builder body data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :connection)]
    (. builder connection data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :method)]
    (. builder method data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :query-string-parameters)]
    (. builder queryStringParameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (url-encoding-format config id :url-encoding-format)]
    (. builder urlEncodingFormat data))
  (.build builder))


(defn http-invoke-props-builder
  "Creates a  `HttpInvokeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-http-invoke-props-builder (new HttpInvokeProps$Builder) id config))


(defn build-job-dependency-builder
  "The build-job-dependency-builder function updates a JobDependency$Builder instance using the provided configuration.
  The function takes the JobDependency$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^JobDependency$Builder builder id config]
  (when-some [data (lookup-entry config id :job-id)]
    (. builder jobId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn job-dependency-builder
  "Creates a  `JobDependency$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-job-dependency-builder (new JobDependency$Builder) id config))


(defn build-job-driver-builder
  "The build-job-driver-builder function updates a JobDriver$Builder instance using the provided configuration.
  The function takes the JobDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sparkSubmitJobDriver` | software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver | [[cdk.support/lookup-entry]] | `:spark-submit-job-driver` |
"
  [^JobDriver$Builder builder id config]
  (when-some [data (lookup-entry config id :spark-submit-job-driver)]
    (. builder sparkSubmitJobDriver data))
  (.build builder))


(defn job-driver-builder
  "Creates a  `JobDriver$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-job-driver-builder (new JobDriver$Builder) id config))


(defn build-lambda-invoke-builder
  "The build-lambda-invoke-builder function updates a LambdaInvoke$Builder instance using the provided configuration.
  The function takes the LambdaInvoke$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-context` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `invocationType` | software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType | [[cdk.api.services.stepfunctions.tasks/lambda-invocation-type]] | `:invocation-type` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `payload` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:payload` |
| `payloadResponseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:payload-response-only` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `retryOnServiceExceptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retry-on-service-exceptions` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^LambdaInvoke$Builder builder id config]
  (when-some [data (lookup-entry config id :client-context)]
    (. builder clientContext data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lambda-invocation-type config id :invocation-type)]
    (. builder invocationType data))
  (when-some [data (lookup-entry config id :lambda-function)]
    (. builder lambdaFunction data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :payload-response-only)]
    (. builder payloadResponseOnly data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :retry-on-service-exceptions)]
    (. builder retryOnServiceExceptions data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn lambda-invoke-builder
  "Creates a  `LambdaInvoke$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-lambda-invoke-builder (LambdaInvoke$Builder/create scope (name id)) id config))


(defn build-lambda-invoke-props-builder
  "The build-lambda-invoke-props-builder function updates a LambdaInvokeProps$Builder instance using the provided configuration.
  The function takes the LambdaInvokeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-context` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `invocationType` | software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType | [[cdk.api.services.stepfunctions.tasks/lambda-invocation-type]] | `:invocation-type` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `payload` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:payload` |
| `payloadResponseOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:payload-response-only` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `retryOnServiceExceptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retry-on-service-exceptions` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^LambdaInvokeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-context)]
    (. builder clientContext data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lambda-invocation-type config id :invocation-type)]
    (. builder invocationType data))
  (when-some [data (lookup-entry config id :lambda-function)]
    (. builder lambdaFunction data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :payload-response-only)]
    (. builder payloadResponseOnly data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :retry-on-service-exceptions)]
    (. builder retryOnServiceExceptions data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn lambda-invoke-props-builder
  "Creates a  `LambdaInvokeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-lambda-invoke-props-builder (new LambdaInvokeProps$Builder) id config))


(defn build-launch-target-bind-options-builder
  "The build-launch-target-bind-options-builder function updates a LaunchTargetBindOptions$Builder instance using the provided configuration.
  The function takes the LaunchTargetBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^LaunchTargetBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn launch-target-bind-options-builder
  "Creates a  `LaunchTargetBindOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-launch-target-bind-options-builder (new LaunchTargetBindOptions$Builder) id config))


(defn build-media-convert-create-job-builder
  "The build-media-convert-create-job-builder function updates a MediaConvertCreateJob$Builder instance using the provided configuration.
  The function takes the MediaConvertCreateJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `createJobRequest` | java.util.Map | [[cdk.support/lookup-entry]] | `:create-job-request` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^MediaConvertCreateJob$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :create-job-request)]
    (. builder createJobRequest data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn media-convert-create-job-builder
  "Creates a  `MediaConvertCreateJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-media-convert-create-job-builder (MediaConvertCreateJob$Builder/create scope (name id)) id config))


(defn build-media-convert-create-job-props-builder
  "The build-media-convert-create-job-props-builder function updates a MediaConvertCreateJobProps$Builder instance using the provided configuration.
  The function takes the MediaConvertCreateJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `createJobRequest` | java.util.Map | [[cdk.support/lookup-entry]] | `:create-job-request` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^MediaConvertCreateJobProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :create-job-request)]
    (. builder createJobRequest data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn media-convert-create-job-props-builder
  "Creates a  `MediaConvertCreateJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-media-convert-create-job-props-builder (new MediaConvertCreateJobProps$Builder) id config))


(defn build-message-attribute-builder
  "The build-message-attribute-builder function updates a MessageAttribute$Builder instance using the provided configuration.
  The function takes the MessageAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataType` | software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType | [[cdk.api.services.stepfunctions.tasks/message-attribute-data-type]] | `:data-type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^MessageAttribute$Builder builder id config]
  (when-some [data (message-attribute-data-type config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn message-attribute-builder
  "Creates a  `MessageAttribute$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-message-attribute-builder (new MessageAttribute$Builder) id config))


(defn build-metric-definition-builder
  "The build-metric-definition-builder function updates a MetricDefinition$Builder instance using the provided configuration.
  The function takes the MetricDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
"
  [^MetricDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex)]
    (. builder regex data))
  (.build builder))


(defn metric-definition-builder
  "Creates a  `MetricDefinition$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-metric-definition-builder (new MetricDefinition$Builder) id config))


(defn build-model-client-options-builder
  "The build-model-client-options-builder function updates a ModelClientOptions$Builder instance using the provided configuration.
  The function takes the ModelClientOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationsMaxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocations-max-retries` |
| `invocationsTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:invocations-timeout` |
"
  [^ModelClientOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :invocations-max-retries)]
    (. builder invocationsMaxRetries data))
  (when-some [data (lookup-entry config id :invocations-timeout)]
    (. builder invocationsTimeout data))
  (.build builder))


(defn model-client-options-builder
  "Creates a  `ModelClientOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-model-client-options-builder (new ModelClientOptions$Builder) id config))


(defn build-monitoring-builder
  "The build-monitoring-builder function updates a Monitoring$Builder instance using the provided configuration.
  The function takes the Monitoring$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:log-bucket` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name-prefix` |
| `logging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:logging` |
| `persistentAppUi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:persistent-app-ui` |
"
  [^Monitoring$Builder builder id config]
  (when-some [data (lookup-entry config id :log-bucket)]
    (. builder logBucket data))
  (when-some [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-some [data (lookup-entry config id :log-stream-name-prefix)]
    (. builder logStreamNamePrefix data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :persistent-app-ui)]
    (. builder persistentAppUi data))
  (.build builder))


(defn monitoring-builder
  "Creates a  `Monitoring$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-monitoring-builder (new Monitoring$Builder) id config))


(defn build-output-data-config-builder
  "The build-output-data-config-builder function updates a OutputDataConfig$Builder instance using the provided configuration.
  The function takes the OutputDataConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `s3OutputLocation` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:s3-output-location` |
"
  [^OutputDataConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :s3-output-location)]
    (. builder s3OutputLocation data))
  (.build builder))


(defn output-data-config-builder
  "Creates a  `OutputDataConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-output-data-config-builder (new OutputDataConfig$Builder) id config))


(defn build-production-variant-builder
  "The build-production-variant-builder function updates a ProductionVariant$Builder instance using the provided configuration.
  The function takes the ProductionVariant$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorType` | software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType | [[cdk.support/lookup-entry]] | `:accelerator-type` |
| `initialInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-instance-count` |
| `initialVariantWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-variant-weight` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |
"
  [^ProductionVariant$Builder builder id config]
  (when-some [data (lookup-entry config id :accelerator-type)]
    (. builder acceleratorType data))
  (when-some [data (lookup-entry config id :initial-instance-count)]
    (. builder initialInstanceCount data))
  (when-some [data (lookup-entry config id :initial-variant-weight)]
    (. builder initialVariantWeight data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :variant-name)]
    (. builder variantName data))
  (.build builder))


(defn production-variant-builder
  "Creates a  `ProductionVariant$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-production-variant-builder (new ProductionVariant$Builder) id config))


(defn build-query-execution-context-builder
  "The build-query-execution-context-builder function updates a QueryExecutionContext$Builder instance using the provided configuration.
  The function takes the QueryExecutionContext$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogName` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
"
  [^QueryExecutionContext$Builder builder id config]
  (when-some [data (lookup-entry config id :catalog-name)]
    (. builder catalogName data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (.build builder))


(defn query-execution-context-builder
  "Creates a  `QueryExecutionContext$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-query-execution-context-builder (new QueryExecutionContext$Builder) id config))


(defn build-resource-config-builder
  "The build-resource-config-builder function updates a ResourceConfig$Builder instance using the provided configuration.
  The function takes the ResourceConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `volumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:volume-size` |
"
  [^ResourceConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :volume-encryption-key)]
    (. builder volumeEncryptionKey data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (.build builder))


(defn resource-config-builder
  "Creates a  `ResourceConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-resource-config-builder (new ResourceConfig$Builder) id config))


(defn build-result-configuration-builder
  "The build-result-configuration-builder function updates a ResultConfiguration$Builder instance using the provided configuration.
  The function takes the ResultConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `outputLocation` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:output-location` |
"
  [^ResultConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (.build builder))


(defn result-configuration-builder
  "Creates a  `ResultConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-result-configuration-builder (new ResultConfiguration$Builder) id config))


(defn build-s3-data-source-builder
  "The build-s3-data-source-builder function updates a S3DataSource$Builder instance using the provided configuration.
  The function takes the S3DataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-names` |
| `s3DataDistributionType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType | [[cdk.api.services.stepfunctions.tasks/s3-data-distribution-type]] | `:s3-data-distribution-type` |
| `s3DataType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataType | [[cdk.api.services.stepfunctions.tasks/s3-data-type]] | `:s3-data-type` |
| `s3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^S3DataSource$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-names)]
    (. builder attributeNames data))
  (when-some [data (s3-data-distribution-type config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-some [data (s3-data-type config id :s3-data-type)]
    (. builder s3DataType data))
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn s3-data-source-builder
  "Creates a  `S3DataSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-data-source-builder (new S3DataSource$Builder) id config))


(defn build-s3-location-bind-options-builder
  "The build-s3-location-bind-options-builder function updates a S3LocationBindOptions$Builder instance using the provided configuration.
  The function takes the S3LocationBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forReading` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-reading` |
| `forWriting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-writing` |
"
  [^S3LocationBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :for-reading)]
    (. builder forReading data))
  (when-some [data (lookup-entry config id :for-writing)]
    (. builder forWriting data))
  (.build builder))


(defn s3-location-bind-options-builder
  "Creates a  `S3LocationBindOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-location-bind-options-builder (new S3LocationBindOptions$Builder) id config))


(defn build-s3-location-config-builder
  "The build-s3-location-config-builder function updates a S3LocationConfig$Builder instance using the provided configuration.
  The function takes the S3LocationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^S3LocationConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn s3-location-config-builder
  "Creates a  `S3LocationConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-location-config-builder (new S3LocationConfig$Builder) id config))


(defn build-sage-maker-create-endpoint-builder
  "The build-sage-maker-create-endpoint-builder function updates a SageMakerCreateEndpoint$Builder instance using the provided configuration.
  The function takes the SageMakerCreateEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerCreateEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-create-endpoint-builder
  "Creates a  `SageMakerCreateEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-create-endpoint-builder (SageMakerCreateEndpoint$Builder/create scope (name id)) id config))


(defn build-sage-maker-create-endpoint-config-builder
  "The build-sage-maker-create-endpoint-config-builder function updates a SageMakerCreateEndpointConfig$Builder instance using the provided configuration.
  The function takes the SageMakerCreateEndpointConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `productionVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:production-variants` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerCreateEndpointConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :production-variants)]
    (. builder productionVariants data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-create-endpoint-config-builder
  "Creates a  `SageMakerCreateEndpointConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-create-endpoint-config-builder (SageMakerCreateEndpointConfig$Builder/create scope (name id)) id config))


(defn build-sage-maker-create-endpoint-config-props-builder
  "The build-sage-maker-create-endpoint-config-props-builder function updates a SageMakerCreateEndpointConfigProps$Builder instance using the provided configuration.
  The function takes the SageMakerCreateEndpointConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `productionVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:production-variants` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerCreateEndpointConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :production-variants)]
    (. builder productionVariants data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-create-endpoint-config-props-builder
  "Creates a  `SageMakerCreateEndpointConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-create-endpoint-config-props-builder (new SageMakerCreateEndpointConfigProps$Builder) id config))


(defn build-sage-maker-create-endpoint-props-builder
  "The build-sage-maker-create-endpoint-props-builder function updates a SageMakerCreateEndpointProps$Builder instance using the provided configuration.
  The function takes the SageMakerCreateEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerCreateEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-create-endpoint-props-builder
  "Creates a  `SageMakerCreateEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-create-endpoint-props-builder (new SageMakerCreateEndpointProps$Builder) id config))


(defn build-sage-maker-create-model-builder
  "The build-sage-maker-create-model-builder function updates a SageMakerCreateModel$Builder instance using the provided configuration.
  The function takes the SageMakerCreateModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `primaryContainer` | software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition | [[cdk.support/lookup-entry]] | `:primary-container` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^SageMakerCreateModel$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :primary-container)]
    (. builder primaryContainer data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn sage-maker-create-model-builder
  "Creates a  `SageMakerCreateModel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-create-model-builder (SageMakerCreateModel$Builder/create scope (name id)) id config))


(defn build-sage-maker-create-model-props-builder
  "The build-sage-maker-create-model-props-builder function updates a SageMakerCreateModelProps$Builder instance using the provided configuration.
  The function takes the SageMakerCreateModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `primaryContainer` | software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition | [[cdk.support/lookup-entry]] | `:primary-container` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^SageMakerCreateModelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :primary-container)]
    (. builder primaryContainer data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn sage-maker-create-model-props-builder
  "Creates a  `SageMakerCreateModelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-create-model-props-builder (new SageMakerCreateModelProps$Builder) id config))


(defn build-sage-maker-create-training-job-builder
  "The build-sage-maker-create-training-job-builder function updates a SageMakerCreateTrainingJob$Builder instance using the provided configuration.
  The function takes the SageMakerCreateTrainingJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification | [[cdk.support/lookup-entry]] | `:algorithm-specification` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `hyperparameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:hyperparameters` |
| `inputDataConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-data-config` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputDataConfig` | software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig | [[cdk.support/lookup-entry]] | `:output-data-config` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resourceConfig` | software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig | [[cdk.support/lookup-entry]] | `:resource-config` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stoppingCondition` | software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `trainingJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-job-name` |
| `vpcConfig` | software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^SageMakerCreateTrainingJob$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm-specification)]
    (. builder algorithmSpecification data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :hyperparameters)]
    (. builder hyperparameters data))
  (when-some [data (lookup-entry config id :input-data-config)]
    (. builder inputDataConfig data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-data-config)]
    (. builder outputDataConfig data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :resource-config)]
    (. builder resourceConfig data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :training-job-name)]
    (. builder trainingJobName data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn sage-maker-create-training-job-builder
  "Creates a  `SageMakerCreateTrainingJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-create-training-job-builder (SageMakerCreateTrainingJob$Builder/create scope (name id)) id config))


(defn build-sage-maker-create-training-job-props-builder
  "The build-sage-maker-create-training-job-props-builder function updates a SageMakerCreateTrainingJobProps$Builder instance using the provided configuration.
  The function takes the SageMakerCreateTrainingJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification | [[cdk.support/lookup-entry]] | `:algorithm-specification` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `hyperparameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:hyperparameters` |
| `inputDataConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-data-config` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputDataConfig` | software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig | [[cdk.support/lookup-entry]] | `:output-data-config` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resourceConfig` | software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig | [[cdk.support/lookup-entry]] | `:resource-config` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `stoppingCondition` | software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `trainingJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-job-name` |
| `vpcConfig` | software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^SageMakerCreateTrainingJobProps$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm-specification)]
    (. builder algorithmSpecification data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :hyperparameters)]
    (. builder hyperparameters data))
  (when-some [data (lookup-entry config id :input-data-config)]
    (. builder inputDataConfig data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-data-config)]
    (. builder outputDataConfig data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :resource-config)]
    (. builder resourceConfig data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :training-job-name)]
    (. builder trainingJobName data))
  (when-some [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn sage-maker-create-training-job-props-builder
  "Creates a  `SageMakerCreateTrainingJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-create-training-job-props-builder (new SageMakerCreateTrainingJobProps$Builder) id config))


(defn build-sage-maker-create-transform-job-builder
  "The build-sage-maker-create-transform-job-builder function updates a SageMakerCreateTransformJob$Builder instance using the provided configuration.
  The function takes the SageMakerCreateTransformJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy | [[cdk.api.services.stepfunctions.tasks/batch-strategy]] | `:batch-strategy` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `maxConcurrentTransforms` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-transforms` |
| `maxPayload` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-payload` |
| `modelClientOptions` | software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions | [[cdk.support/lookup-entry]] | `:model-client-options` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `transformInput` | software.amazon.awscdk.services.stepfunctions.tasks.TransformInput | [[cdk.support/lookup-entry]] | `:transform-input` |
| `transformJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:transform-job-name` |
| `transformOutput` | software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput | [[cdk.support/lookup-entry]] | `:transform-output` |
| `transformResources` | software.amazon.awscdk.services.stepfunctions.tasks.TransformResources | [[cdk.support/lookup-entry]] | `:transform-resources` |
"
  [^SageMakerCreateTransformJob$Builder builder id config]
  (when-some [data (batch-strategy config id :batch-strategy)]
    (. builder batchStrategy data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :max-concurrent-transforms)]
    (. builder maxConcurrentTransforms data))
  (when-some [data (lookup-entry config id :max-payload)]
    (. builder maxPayload data))
  (when-some [data (lookup-entry config id :model-client-options)]
    (. builder modelClientOptions data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :transform-input)]
    (. builder transformInput data))
  (when-some [data (lookup-entry config id :transform-job-name)]
    (. builder transformJobName data))
  (when-some [data (lookup-entry config id :transform-output)]
    (. builder transformOutput data))
  (when-some [data (lookup-entry config id :transform-resources)]
    (. builder transformResources data))
  (.build builder))


(defn sage-maker-create-transform-job-builder
  "Creates a  `SageMakerCreateTransformJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-create-transform-job-builder (SageMakerCreateTransformJob$Builder/create scope (name id)) id config))


(defn build-sage-maker-create-transform-job-props-builder
  "The build-sage-maker-create-transform-job-props-builder function updates a SageMakerCreateTransformJobProps$Builder instance using the provided configuration.
  The function takes the SageMakerCreateTransformJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy | [[cdk.api.services.stepfunctions.tasks/batch-strategy]] | `:batch-strategy` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `maxConcurrentTransforms` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-transforms` |
| `maxPayload` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:max-payload` |
| `modelClientOptions` | software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions | [[cdk.support/lookup-entry]] | `:model-client-options` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `transformInput` | software.amazon.awscdk.services.stepfunctions.tasks.TransformInput | [[cdk.support/lookup-entry]] | `:transform-input` |
| `transformJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:transform-job-name` |
| `transformOutput` | software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput | [[cdk.support/lookup-entry]] | `:transform-output` |
| `transformResources` | software.amazon.awscdk.services.stepfunctions.tasks.TransformResources | [[cdk.support/lookup-entry]] | `:transform-resources` |
"
  [^SageMakerCreateTransformJobProps$Builder builder id config]
  (when-some [data (batch-strategy config id :batch-strategy)]
    (. builder batchStrategy data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :max-concurrent-transforms)]
    (. builder maxConcurrentTransforms data))
  (when-some [data (lookup-entry config id :max-payload)]
    (. builder maxPayload data))
  (when-some [data (lookup-entry config id :model-client-options)]
    (. builder modelClientOptions data))
  (when-some [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :transform-input)]
    (. builder transformInput data))
  (when-some [data (lookup-entry config id :transform-job-name)]
    (. builder transformJobName data))
  (when-some [data (lookup-entry config id :transform-output)]
    (. builder transformOutput data))
  (when-some [data (lookup-entry config id :transform-resources)]
    (. builder transformResources data))
  (.build builder))


(defn sage-maker-create-transform-job-props-builder
  "Creates a  `SageMakerCreateTransformJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-create-transform-job-props-builder (new SageMakerCreateTransformJobProps$Builder) id config))


(defn build-sage-maker-update-endpoint-builder
  "The build-sage-maker-update-endpoint-builder function updates a SageMakerUpdateEndpoint$Builder instance using the provided configuration.
  The function takes the SageMakerUpdateEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerUpdateEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-update-endpoint-builder
  "Creates a  `SageMakerUpdateEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sage-maker-update-endpoint-builder (SageMakerUpdateEndpoint$Builder/create scope (name id)) id config))


(defn build-sage-maker-update-endpoint-props-builder
  "The build-sage-maker-update-endpoint-props-builder function updates a SageMakerUpdateEndpointProps$Builder instance using the provided configuration.
  The function takes the SageMakerUpdateEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SageMakerUpdateEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sage-maker-update-endpoint-props-builder
  "Creates a  `SageMakerUpdateEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sage-maker-update-endpoint-props-builder (new SageMakerUpdateEndpointProps$Builder) id config))


(defn build-shuffle-config-builder
  "The build-shuffle-config-builder function updates a ShuffleConfig$Builder instance using the provided configuration.
  The function takes the ShuffleConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed` |
"
  [^ShuffleConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :seed)]
    (. builder seed data))
  (.build builder))


(defn shuffle-config-builder
  "Creates a  `ShuffleConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-shuffle-config-builder (new ShuffleConfig$Builder) id config))


(defn build-sns-publish-builder
  "The build-sns-publish-builder function updates a SnsPublish$Builder instance using the provided configuration.
  The function takes the SnsPublish$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `message` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:message-attributes` |
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `messagePerSubscriptionType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:message-per-subscription-type` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^SnsPublish$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :message-attributes)]
    (. builder messageAttributes data))
  (when-some [data (lookup-entry config id :message-deduplication-id)]
    (. builder messageDeduplicationId data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :message-per-subscription-type)]
    (. builder messagePerSubscriptionType data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn sns-publish-builder
  "Creates a  `SnsPublish$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sns-publish-builder (SnsPublish$Builder/create scope (name id)) id config))


(defn build-sns-publish-props-builder
  "The build-sns-publish-props-builder function updates a SnsPublishProps$Builder instance using the provided configuration.
  The function takes the SnsPublishProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `message` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:message` |
| `messageAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:message-attributes` |
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `messagePerSubscriptionType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:message-per-subscription-type` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^SnsPublishProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :message-attributes)]
    (. builder messageAttributes data))
  (when-some [data (lookup-entry config id :message-deduplication-id)]
    (. builder messageDeduplicationId data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :message-per-subscription-type)]
    (. builder messagePerSubscriptionType data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn sns-publish-props-builder
  "Creates a  `SnsPublishProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sns-publish-props-builder (new SnsPublishProps$Builder) id config))


(defn build-spark-submit-job-driver-builder
  "The build-spark-submit-job-driver-builder function updates a SparkSubmitJobDriver$Builder instance using the provided configuration.
  The function takes the SparkSubmitJobDriver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entryPoint` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:entry-point` |
| `entryPointArguments` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:entry-point-arguments` |
| `sparkSubmitParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:spark-submit-parameters` |
"
  [^SparkSubmitJobDriver$Builder builder id config]
  (when-some [data (lookup-entry config id :entry-point)]
    (. builder entryPoint data))
  (when-some [data (lookup-entry config id :entry-point-arguments)]
    (. builder entryPointArguments data))
  (when-some [data (lookup-entry config id :spark-submit-parameters)]
    (. builder sparkSubmitParameters data))
  (.build builder))


(defn spark-submit-job-driver-builder
  "Creates a  `SparkSubmitJobDriver$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-spark-submit-job-driver-builder (new SparkSubmitJobDriver$Builder) id config))


(defn build-sqs-send-message-builder
  "The build-sqs-send-message-builder function updates a SqsSendMessage$Builder instance using the provided configuration.
  The function takes the SqsSendMessage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `delay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delay` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `messageBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:message-body` |
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SqsSendMessage$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :delay)]
    (. builder delay data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :message-body)]
    (. builder messageBody data))
  (when-some [data (lookup-entry config id :message-deduplication-id)]
    (. builder messageDeduplicationId data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sqs-send-message-builder
  "Creates a  `SqsSendMessage$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-sqs-send-message-builder (SqsSendMessage$Builder/create scope (name id)) id config))


(defn build-sqs-send-message-props-builder
  "The build-sqs-send-message-props-builder function updates a SqsSendMessageProps$Builder instance using the provided configuration.
  The function takes the SqsSendMessageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `delay` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delay` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `messageBody` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:message-body` |
| `messageDeduplicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-deduplication-id` |
| `messageGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-group-id` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^SqsSendMessageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :delay)]
    (. builder delay data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :message-body)]
    (. builder messageBody data))
  (when-some [data (lookup-entry config id :message-deduplication-id)]
    (. builder messageDeduplicationId data))
  (when-some [data (lookup-entry config id :message-group-id)]
    (. builder messageGroupId data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn sqs-send-message-props-builder
  "Creates a  `SqsSendMessageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-sqs-send-message-props-builder (new SqsSendMessageProps$Builder) id config))


(defn build-step-functions-invoke-activity-builder
  "The build-step-functions-invoke-activity-builder function updates a StepFunctionsInvokeActivity$Builder instance using the provided configuration.
  The function takes the StepFunctionsInvokeActivity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activity` | software.amazon.awscdk.services.stepfunctions.IActivity | [[cdk.support/lookup-entry]] | `:activity` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^StepFunctionsInvokeActivity$Builder builder id config]
  (when-some [data (lookup-entry config id :activity)]
    (. builder activity data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn step-functions-invoke-activity-builder
  "Creates a  `StepFunctionsInvokeActivity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-step-functions-invoke-activity-builder (StepFunctionsInvokeActivity$Builder/create scope (name id)) id config))


(defn build-step-functions-invoke-activity-props-builder
  "The build-step-functions-invoke-activity-props-builder function updates a StepFunctionsInvokeActivityProps$Builder instance using the provided configuration.
  The function takes the StepFunctionsInvokeActivityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activity` | software.amazon.awscdk.services.stepfunctions.IActivity | [[cdk.support/lookup-entry]] | `:activity` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^StepFunctionsInvokeActivityProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activity)]
    (. builder activity data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn step-functions-invoke-activity-props-builder
  "Creates a  `StepFunctionsInvokeActivityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-step-functions-invoke-activity-props-builder (new StepFunctionsInvokeActivityProps$Builder) id config))


(defn build-step-functions-start-execution-builder
  "The build-step-functions-start-execution-builder function updates a StepFunctionsStartExecution$Builder instance using the provided configuration.
  The function takes the StepFunctionsStartExecution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWithParent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-with-parent` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `input` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^StepFunctionsStartExecution$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-with-parent)]
    (. builder associateWithParent data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn step-functions-start-execution-builder
  "Creates a  `StepFunctionsStartExecution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-step-functions-start-execution-builder (StepFunctionsStartExecution$Builder/create scope (name id)) id config))


(defn build-step-functions-start-execution-props-builder
  "The build-step-functions-start-execution-props-builder function updates a StepFunctionsStartExecutionProps$Builder instance using the provided configuration.
  The function takes the StepFunctionsStartExecutionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWithParent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-with-parent` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `credentials` | software.amazon.awscdk.services.stepfunctions.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `heartbeat` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:heartbeat` |
| `heartbeatTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:heartbeat-timeout` |
| `input` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:input` |
| `inputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-path` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.IntegrationPattern | [[cdk.api.services.stepfunctions/integration-pattern]] | `:integration-pattern` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-path` |
| `resultPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:result-path` |
| `resultSelector` | java.util.Map | [[cdk.support/lookup-entry]] | `:result-selector` |
| `stateMachine` | software.amazon.awscdk.services.stepfunctions.IStateMachine | [[cdk.support/lookup-entry]] | `:state-machine` |
| `stateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-name` |
| `taskTimeout` | software.amazon.awscdk.services.stepfunctions.Timeout | [[cdk.support/lookup-entry]] | `:task-timeout` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^StepFunctionsStartExecutionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-with-parent)]
    (. builder associateWithParent data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :heartbeat)]
    (. builder heartbeat data))
  (when-some [data (lookup-entry config id :heartbeat-timeout)]
    (. builder heartbeatTimeout data))
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :input-path)]
    (. builder inputPath data))
  (when-some [data (integration-pattern config id :integration-pattern)]
    (. builder integrationPattern data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-path)]
    (. builder outputPath data))
  (when-some [data (lookup-entry config id :result-path)]
    (. builder resultPath data))
  (when-some [data (lookup-entry config id :result-selector)]
    (. builder resultSelector data))
  (when-some [data (lookup-entry config id :state-machine)]
    (. builder stateMachine data))
  (when-some [data (lookup-entry config id :state-name)]
    (. builder stateName data))
  (when-some [data (lookup-entry config id :task-timeout)]
    (. builder taskTimeout data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn step-functions-start-execution-props-builder
  "Creates a  `StepFunctionsStartExecutionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-step-functions-start-execution-props-builder (new StepFunctionsStartExecutionProps$Builder) id config))


(defn build-stopping-condition-builder
  "The build-stopping-condition-builder function updates a StoppingCondition$Builder instance using the provided configuration.
  The function takes the StoppingCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-runtime` |
"
  [^StoppingCondition$Builder builder id config]
  (when-some [data (lookup-entry config id :max-runtime)]
    (. builder maxRuntime data))
  (.build builder))


(defn stopping-condition-builder
  "Creates a  `StoppingCondition$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-stopping-condition-builder (new StoppingCondition$Builder) id config))


(defn build-task-environment-variable-builder
  "The build-task-environment-variable-builder function updates a TaskEnvironmentVariable$Builder instance using the provided configuration.
  The function takes the TaskEnvironmentVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^TaskEnvironmentVariable$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn task-environment-variable-builder
  "Creates a  `TaskEnvironmentVariable$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-task-environment-variable-builder (new TaskEnvironmentVariable$Builder) id config))


(defn build-transform-data-source-builder
  "The build-transform-data-source-builder function updates a TransformDataSource$Builder instance using the provided configuration.
  The function takes the TransformDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource | [[cdk.support/lookup-entry]] | `:s3-data-source` |
"
  [^TransformDataSource$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-data-source)]
    (. builder s3DataSource data))
  (.build builder))


(defn transform-data-source-builder
  "Creates a  `TransformDataSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-transform-data-source-builder (new TransformDataSource$Builder) id config))


(defn build-transform-input-builder
  "The build-transform-input-builder function updates a TransformInput$Builder instance using the provided configuration.
  The function takes the TransformInput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | software.amazon.awscdk.services.stepfunctions.tasks.CompressionType | [[cdk.api.services.stepfunctions.tasks/compression-type]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `splitType` | software.amazon.awscdk.services.stepfunctions.tasks.SplitType | [[cdk.api.services.stepfunctions.tasks/split-type]] | `:split-type` |
| `transformDataSource` | software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource | [[cdk.support/lookup-entry]] | `:transform-data-source` |
"
  [^TransformInput$Builder builder id config]
  (when-some [data (compression-type config id :compression-type)]
    (. builder compressionType data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (split-type config id :split-type)]
    (. builder splitType data))
  (when-some [data (lookup-entry config id :transform-data-source)]
    (. builder transformDataSource data))
  (.build builder))


(defn transform-input-builder
  "Creates a  `TransformInput$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-transform-input-builder (new TransformInput$Builder) id config))


(defn build-transform-output-builder
  "The build-transform-output-builder function updates a TransformOutput$Builder instance using the provided configuration.
  The function takes the TransformOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `assembleWith` | software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith | [[cdk.api.services.stepfunctions.tasks/assemble-with]] | `:assemble-with` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |
"
  [^TransformOutput$Builder builder id config]
  (when-some [data (lookup-entry config id :accept)]
    (. builder accept data))
  (when-some [data (assemble-with config id :assemble-with)]
    (. builder assembleWith data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :s3-output-path)]
    (. builder s3OutputPath data))
  (.build builder))


(defn transform-output-builder
  "Creates a  `TransformOutput$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-transform-output-builder (new TransformOutput$Builder) id config))


(defn build-transform-resources-builder
  "The build-transform-resources-builder function updates a TransformResources$Builder instance using the provided configuration.
  The function takes the TransformResources$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
"
  [^TransformResources$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :volume-encryption-key)]
    (. builder volumeEncryptionKey data))
  (.build builder))


(defn transform-resources-builder
  "Creates a  `TransformResources$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-transform-resources-builder (new TransformResources$Builder) id config))


(defn build-transform-s3-data-source-builder
  "The build-transform-s3-data-source-builder function updates a TransformS3DataSource$Builder instance using the provided configuration.
  The function takes the TransformS3DataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataType | [[cdk.api.services.stepfunctions.tasks/s3-data-type]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^TransformS3DataSource$Builder builder id config]
  (when-some [data (s3-data-type config id :s3-data-type)]
    (. builder s3DataType data))
  (when-some [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn transform-s3-data-source-builder
  "Creates a  `TransformS3DataSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-transform-s3-data-source-builder (new TransformS3DataSource$Builder) id config))


(defn build-vpc-config-builder
  "The build-vpc-config-builder function updates a VpcConfig$Builder instance using the provided configuration.
  The function takes the VpcConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^VpcConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn vpc-config-builder
  "Creates a  `VpcConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-vpc-config-builder (new VpcConfig$Builder) id config))


(defn build-worker-configuration-property-builder
  "The build-worker-configuration-property-builder function updates a WorkerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the WorkerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `workerType` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerType | [[cdk.api.services.stepfunctions.tasks/worker-type]] | `:worker-type` |
"
  [^WorkerConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-workers)]
    (. builder numberOfWorkers data))
  (when-some [data (worker-type config id :worker-type)]
    (. builder workerType data))
  (.build builder))


(defn worker-configuration-property-builder
  "Creates a  `WorkerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-worker-configuration-property-builder (new WorkerConfigurationProperty$Builder) id config))