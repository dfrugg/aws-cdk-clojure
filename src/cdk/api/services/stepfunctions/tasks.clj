(ns cdk.api.services.stepfunctions.tasks
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.stepfunctions.tasks package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.stepfunctions :refer [integration-pattern
                                                    service-integration-pattern]]
            [cdk.api.services.ecs :refer [fargate-platform-version
                                          propagated-tag-source]])
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


(defn algorithm-specification-builder
  "The algorithm-specification-builder function buildes out new instances of 
AlgorithmSpecification$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `metricDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-definitions` |
| `trainingImage` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:training-image` |
| `trainingInputMode` | software.amazon.awscdk.services.stepfunctions.tasks.InputMode | [[cdk.api.services.stepfunctions.tasks/input-mode]] | `:training-input-mode` |"
  [stack id config]
  (let [builder (AlgorithmSpecification$Builder.)]
    (when-let [data (lookup-entry config id :algorithm-name)]
      (. builder algorithmName data))
    (when-let [data (lookup-entry config id :metric-definitions)]
      (. builder metricDefinitions data))
    (when-let [data (lookup-entry config id :training-image)]
      (. builder trainingImage data))
    (when-let [data (input-mode config id :training-input-mode)]
      (. builder trainingInputMode data))
    (.build builder)))


(defn application-configuration-builder
  "The application-configuration-builder function buildes out new instances of 
ApplicationConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | software.amazon.awscdk.services.stepfunctions.tasks.Classification | [[cdk.support/lookup-entry]] | `:classification` |
| `nestedConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:nested-config` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |"
  [stack id config]
  (let [builder (ApplicationConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :nested-config)]
      (. builder nestedConfig data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (.build builder)))


(defn athena-get-query-execution-builder
  "The athena-get-query-execution-builder function buildes out new instances of 
AthenaGetQueryExecution$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaGetQueryExecution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn athena-get-query-execution-props-builder
  "The athena-get-query-execution-props-builder function buildes out new instances of 
AthenaGetQueryExecutionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaGetQueryExecutionProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn athena-get-query-results-builder
  "The athena-get-query-results-builder function buildes out new instances of 
AthenaGetQueryResults$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaGetQueryResults$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :max-results)]
      (. builder maxResults data))
    (when-let [data (lookup-entry config id :next-token)]
      (. builder nextToken data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn athena-get-query-results-props-builder
  "The athena-get-query-results-props-builder function buildes out new instances of 
AthenaGetQueryResultsProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaGetQueryResultsProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :max-results)]
      (. builder maxResults data))
    (when-let [data (lookup-entry config id :next-token)]
      (. builder nextToken data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn athena-start-query-execution-builder
  "The athena-start-query-execution-builder function buildes out new instances of 
AthenaStartQueryExecution$Builder using the provided configuration.  Each field is set as follows:

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
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (AthenaStartQueryExecution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-request-token)]
      (. builder clientRequestToken data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-parameters)]
      (. builder executionParameters data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-context)]
      (. builder queryExecutionContext data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :result-configuration)]
      (. builder resultConfiguration data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn athena-start-query-execution-props-builder
  "The athena-start-query-execution-props-builder function buildes out new instances of 
AthenaStartQueryExecutionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `workGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:work-group` |"
  [stack id config]
  (let [builder (AthenaStartQueryExecutionProps$Builder.)]
    (when-let [data (lookup-entry config id :client-request-token)]
      (. builder clientRequestToken data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-parameters)]
      (. builder executionParameters data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-context)]
      (. builder queryExecutionContext data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :result-configuration)]
      (. builder resultConfiguration data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :work-group)]
      (. builder workGroup data))
    (.build builder)))


(defn athena-stop-query-execution-builder
  "The athena-stop-query-execution-builder function buildes out new instances of 
AthenaStopQueryExecution$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaStopQueryExecution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn athena-stop-query-execution-props-builder
  "The athena-stop-query-execution-props-builder function buildes out new instances of 
AthenaStopQueryExecutionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (AthenaStopQueryExecutionProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-execution-id)]
      (. builder queryExecutionId data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn batch-container-overrides-builder
  "The batch-container-overrides-builder function buildes out new instances of 
BatchContainerOverrides$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `memory` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:memory` |
| `vcpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vcpus` |"
  [stack id config]
  (let [builder (BatchContainerOverrides$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :vcpus)]
      (. builder vcpus data))
    (.build builder)))


(defn batch-job-dependency-builder
  "The batch-job-dependency-builder function buildes out new instances of 
BatchJobDependency$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (BatchJobDependency$Builder.)]
    (when-let [data (lookup-entry config id :job-id)]
      (. builder jobId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn batch-submit-job-builder
  "The batch-submit-job-builder function buildes out new instances of 
BatchSubmitJob$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (BatchSubmitJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :array-size)]
      (. builder arraySize data))
    (when-let [data (lookup-entry config id :attempts)]
      (. builder attempts data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :container-overrides)]
      (. builder containerOverrides data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :depends-on)]
      (. builder dependsOn data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :job-definition-arn)]
      (. builder jobDefinitionArn data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :job-queue-arn)]
      (. builder jobQueueArn data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn batch-submit-job-props-builder
  "The batch-submit-job-props-builder function buildes out new instances of 
BatchSubmitJobProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (BatchSubmitJobProps$Builder.)]
    (when-let [data (lookup-entry config id :array-size)]
      (. builder arraySize data))
    (when-let [data (lookup-entry config id :attempts)]
      (. builder attempts data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :container-overrides)]
      (. builder containerOverrides data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :depends-on)]
      (. builder dependsOn data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :job-definition-arn)]
      (. builder jobDefinitionArn data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :job-queue-arn)]
      (. builder jobQueueArn data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn bedrock-invoke-model-builder
  "The bedrock-invoke-model-builder function buildes out new instances of 
BedrockInvokeModel$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (BedrockInvokeModel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept)]
      (. builder accept data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :model)]
      (. builder model data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn bedrock-invoke-model-input-props-builder
  "The bedrock-invoke-model-input-props-builder function buildes out new instances of 
BedrockInvokeModelInputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (BedrockInvokeModelInputProps$Builder.)]
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn bedrock-invoke-model-output-props-builder
  "The bedrock-invoke-model-output-props-builder function buildes out new instances of 
BedrockInvokeModelOutputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (BedrockInvokeModelOutputProps$Builder.)]
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn bedrock-invoke-model-props-builder
  "The bedrock-invoke-model-props-builder function buildes out new instances of 
BedrockInvokeModelProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (BedrockInvokeModelProps$Builder.)]
    (when-let [data (lookup-entry config id :accept)]
      (. builder accept data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :model)]
      (. builder model data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-api-gateway-endpoint-base-props-builder
  "The call-api-gateway-endpoint-base-props-builder function buildes out new instances of 
CallApiGatewayEndpointBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallApiGatewayEndpointBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :api-path)]
      (. builder apiPath data))
    (when-let [data (auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-api-gateway-http-api-endpoint-builder
  "The call-api-gateway-http-api-endpoint-builder function buildes out new instances of 
CallApiGatewayHttpApiEndpoint$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallApiGatewayHttpApiEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :api-path)]
      (. builder apiPath data))
    (when-let [data (lookup-entry config id :api-stack)]
      (. builder apiStack data))
    (when-let [data (auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-api-gateway-http-api-endpoint-props-builder
  "The call-api-gateway-http-api-endpoint-props-builder function buildes out new instances of 
CallApiGatewayHttpApiEndpointProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallApiGatewayHttpApiEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :api-path)]
      (. builder apiPath data))
    (when-let [data (lookup-entry config id :api-stack)]
      (. builder apiStack data))
    (when-let [data (auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-api-gateway-rest-api-endpoint-builder
  "The call-api-gateway-rest-api-endpoint-builder function buildes out new instances of 
CallApiGatewayRestApiEndpoint$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallApiGatewayRestApiEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :api-path)]
      (. builder apiPath data))
    (when-let [data (auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-api-gateway-rest-api-endpoint-props-builder
  "The call-api-gateway-rest-api-endpoint-props-builder function buildes out new instances of 
CallApiGatewayRestApiEndpointProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallApiGatewayRestApiEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :api-path)]
      (. builder apiPath data))
    (when-let [data (auth-type config id :auth-type)]
      (. builder authType data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (http-method config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-aws-service-builder
  "The call-aws-service-builder function buildes out new instances of 
CallAwsService$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallAwsService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :additional-iam-statements)]
      (. builder additionalIamStatements data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :iam-action)]
      (. builder iamAction data))
    (when-let [data (lookup-entry config id :iam-resources)]
      (. builder iamResources data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn call-aws-service-props-builder
  "The call-aws-service-props-builder function buildes out new instances of 
CallAwsServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CallAwsServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :additional-iam-statements)]
      (. builder additionalIamStatements data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :iam-action)]
      (. builder iamAction data))
    (when-let [data (lookup-entry config id :iam-resources)]
      (. builder iamResources data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn channel-builder
  "The channel-builder function buildes out new instances of 
Channel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `compressionType` | software.amazon.awscdk.services.stepfunctions.tasks.CompressionType | [[cdk.api.services.stepfunctions.tasks/compression-type]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `dataSource` | software.amazon.awscdk.services.stepfunctions.tasks.DataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `inputMode` | software.amazon.awscdk.services.stepfunctions.tasks.InputMode | [[cdk.api.services.stepfunctions.tasks/input-mode]] | `:input-mode` |
| `recordWrapperType` | software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType | [[cdk.api.services.stepfunctions.tasks/record-wrapper-type]] | `:record-wrapper-type` |
| `shuffleConfig` | software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig | [[cdk.support/lookup-entry]] | `:shuffle-config` |"
  [stack id config]
  (let [builder (Channel$Builder.)]
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (compression-type config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (input-mode config id :input-mode)]
      (. builder inputMode data))
    (when-let [data (record-wrapper-type config id :record-wrapper-type)]
      (. builder recordWrapperType data))
    (when-let [data (lookup-entry config id :shuffle-config)]
      (. builder shuffleConfig data))
    (.build builder)))


(defn code-build-start-build-batch-builder
  "The code-build-start-build-batch-builder function buildes out new instances of 
CodeBuildStartBuildBatch$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CodeBuildStartBuildBatch$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment-variables-override)]
      (. builder environmentVariablesOverride data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn code-build-start-build-batch-props-builder
  "The code-build-start-build-batch-props-builder function buildes out new instances of 
CodeBuildStartBuildBatchProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CodeBuildStartBuildBatchProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment-variables-override)]
      (. builder environmentVariablesOverride data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn code-build-start-build-builder
  "The code-build-start-build-builder function buildes out new instances of 
CodeBuildStartBuild$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CodeBuildStartBuild$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment-variables-override)]
      (. builder environmentVariablesOverride data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn code-build-start-build-props-builder
  "The code-build-start-build-props-builder function buildes out new instances of 
CodeBuildStartBuildProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CodeBuildStartBuildProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment-variables-override)]
      (. builder environmentVariablesOverride data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn common-ecs-run-task-props-builder
  "The common-ecs-run-task-props-builder function buildes out new instances of 
CommonEcsRunTaskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `containerOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:container-overrides` |
| `integrationPattern` | software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern | [[cdk.api.services.stepfunctions/service-integration-pattern]] | `:integration-pattern` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (CommonEcsRunTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :container-overrides)]
      (. builder containerOverrides data))
    (when-let [data (service-integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn container-definition-builder
  "The container-definition-builder function buildes out new instances of 
ContainerDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-host-name` |
| `environmentVariables` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `image` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:image` |
| `mode` | software.amazon.awscdk.services.stepfunctions.tasks.Mode | [[cdk.api.services.stepfunctions.tasks/mode]] | `:mode` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelS3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:model-s3-location` |"
  [stack id config]
  (let [builder (ContainerDefinition$Builder/create)]
    (when-let [data (lookup-entry config id :container-host-name)]
      (. builder containerHostName data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (mode config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :model-package-name)]
      (. builder modelPackageName data))
    (when-let [data (lookup-entry config id :model-s3-location)]
      (. builder modelS3Location data))
    (.build builder)))


(defn container-definition-config-builder
  "The container-definition-config-builder function buildes out new instances of 
ContainerDefinitionConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (ContainerDefinitionConfig$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn container-definition-options-builder
  "The container-definition-options-builder function buildes out new instances of 
ContainerDefinitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-host-name` |
| `environmentVariables` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `image` | software.amazon.awscdk.services.stepfunctions.tasks.DockerImage | [[cdk.support/lookup-entry]] | `:image` |
| `mode` | software.amazon.awscdk.services.stepfunctions.tasks.Mode | [[cdk.api.services.stepfunctions.tasks/mode]] | `:mode` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelS3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:model-s3-location` |"
  [stack id config]
  (let [builder (ContainerDefinitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :container-host-name)]
      (. builder containerHostName data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (mode config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :model-package-name)]
      (. builder modelPackageName data))
    (when-let [data (lookup-entry config id :model-s3-location)]
      (. builder modelS3Location data))
    (.build builder)))


(defn container-override-builder
  "The container-override-builder function buildes out new instances of 
ContainerOverride$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerDefinition` | software.amazon.awscdk.services.ecs.ContainerDefinition | [[cdk.support/lookup-entry]] | `:container-definition` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `memoryReservation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation` |"
  [stack id config]
  (let [builder (ContainerOverride$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-definition)]
      (. builder containerDefinition data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :memory-limit)]
      (. builder memoryLimit data))
    (when-let [data (lookup-entry config id :memory-reservation)]
      (. builder memoryReservation data))
    (.build builder)))


(defn container-overrides-builder
  "The container-overrides-builder function buildes out new instances of 
ContainerOverrides$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
| `vcpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vcpus` |"
  [stack id config]
  (let [builder (ContainerOverrides$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (when-let [data (lookup-entry config id :vcpus)]
      (. builder vcpus data))
    (.build builder)))


(defn data-source-builder
  "The data-source-builder function buildes out new instances of 
DataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource | [[cdk.support/lookup-entry]] | `:s3-data-source` |"
  [stack id config]
  (let [builder (DataSource$Builder.)]
    (when-let [data (lookup-entry config id :s3-data-source)]
      (. builder s3DataSource data))
    (.build builder)))


(defn docker-image-config-builder
  "The docker-image-config-builder function buildes out new instances of 
DockerImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |"
  [stack id config]
  (let [builder (DockerImageConfig$Builder.)]
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (.build builder)))


(defn dynamo-delete-item-builder
  "The dynamo-delete-item-builder function buildes out new instances of 
DynamoDeleteItem$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoDeleteItem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-delete-item-props-builder
  "The dynamo-delete-item-props-builder function buildes out new instances of 
DynamoDeleteItemProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoDeleteItemProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-get-item-builder
  "The dynamo-get-item-builder function buildes out new instances of 
DynamoGetItem$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoGetItem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :consistent-read)]
      (. builder consistentRead data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :projection-expression)]
      (. builder projectionExpression data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-get-item-props-builder
  "The dynamo-get-item-props-builder function buildes out new instances of 
DynamoGetItemProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoGetItemProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :consistent-read)]
      (. builder consistentRead data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :projection-expression)]
      (. builder projectionExpression data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-put-item-builder
  "The dynamo-put-item-builder function buildes out new instances of 
DynamoPutItem$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoPutItem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :item)]
      (. builder item data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-put-item-props-builder
  "The dynamo-put-item-props-builder function buildes out new instances of 
DynamoPutItemProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (DynamoPutItemProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :item)]
      (. builder item data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn dynamo-update-item-builder
  "The dynamo-update-item-builder function buildes out new instances of 
DynamoUpdateItem$Builder using the provided configuration.  Each field is set as follows:

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
| `updateExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-expression` |"
  [stack id config]
  (let [builder (DynamoUpdateItem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :update-expression)]
      (. builder updateExpression data))
    (.build builder)))


(defn dynamo-update-item-props-builder
  "The dynamo-update-item-props-builder function buildes out new instances of 
DynamoUpdateItemProps$Builder using the provided configuration.  Each field is set as follows:

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
| `updateExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-expression` |"
  [stack id config]
  (let [builder (DynamoUpdateItemProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :condition-expression)]
      (. builder conditionExpression data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression-attribute-names)]
      (. builder expressionAttributeNames data))
    (when-let [data (lookup-entry config id :expression-attribute-values)]
      (. builder expressionAttributeValues data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (dynamo-consumed-capacity config id :return-consumed-capacity)]
      (. builder returnConsumedCapacity data))
    (when-let [data (dynamo-item-collection-metrics config id :return-item-collection-metrics)]
      (. builder returnItemCollectionMetrics data))
    (when-let [data (dynamo-return-values config id :return-values)]
      (. builder returnValues data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :update-expression)]
      (. builder updateExpression data))
    (.build builder)))


(defn ecs-ec2-launch-target-builder
  "The ecs-ec2-launch-target-builder function buildes out new instances of 
EcsEc2LaunchTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |"
  [stack id config]
  (let [builder (EcsEc2LaunchTarget$Builder/create)]
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (.build builder)))


(defn ecs-ec2-launch-target-options-builder
  "The ecs-ec2-launch-target-options-builder function buildes out new instances of 
EcsEc2LaunchTargetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |"
  [stack id config]
  (let [builder (EcsEc2LaunchTargetOptions$Builder.)]
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (.build builder)))


(defn ecs-fargate-launch-target-builder
  "The ecs-fargate-launch-target-builder function buildes out new instances of 
EcsFargateLaunchTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |"
  [stack id config]
  (let [builder (EcsFargateLaunchTarget$Builder/create)]
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (.build builder)))


(defn ecs-fargate-launch-target-options-builder
  "The ecs-fargate-launch-target-options-builder function buildes out new instances of 
EcsFargateLaunchTargetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |"
  [stack id config]
  (let [builder (EcsFargateLaunchTargetOptions$Builder.)]
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (.build builder)))


(defn ecs-launch-target-config-builder
  "The ecs-launch-target-config-builder function buildes out new instances of 
EcsLaunchTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (EcsLaunchTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn ecs-run-task-builder
  "The ecs-run-task-builder function buildes out new instances of 
EcsRunTask$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EcsRunTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :container-overrides)]
      (. builder containerOverrides data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :launch-target)]
      (. builder launchTarget data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (propagated-tag-source config id :propagated-tag-source)]
      (. builder propagatedTagSource data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :revision-number)]
      (. builder revisionNumber data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn ecs-run-task-props-builder
  "The ecs-run-task-props-builder function buildes out new instances of 
EcsRunTaskProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EcsRunTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :container-overrides)]
      (. builder containerOverrides data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :launch-target)]
      (. builder launchTarget data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (propagated-tag-source config id :propagated-tag-source)]
      (. builder propagatedTagSource data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :revision-number)]
      (. builder revisionNumber data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn eks-call-builder
  "The eks-call-builder function buildes out new instances of 
EksCall$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EksCall$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (http-methods config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :http-path)]
      (. builder httpPath data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn eks-call-props-builder
  "The eks-call-props-builder function buildes out new instances of 
EksCallProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EksCallProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (http-methods config id :http-method)]
      (. builder httpMethod data))
    (when-let [data (lookup-entry config id :http-path)]
      (. builder httpPath data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-parameters)]
      (. builder queryParameters data))
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-add-step-builder
  "The emr-add-step-builder function buildes out new instances of 
EmrAddStep$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrAddStep$Builder/create stack id)]
    (when-let [data (action-on-failure config id :action-on-failure)]
      (. builder actionOnFailure data))
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :jar)]
      (. builder jar data))
    (when-let [data (lookup-entry config id :main-class)]
      (. builder mainClass data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-add-step-props-builder
  "The emr-add-step-props-builder function buildes out new instances of 
EmrAddStepProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrAddStepProps$Builder.)]
    (when-let [data (action-on-failure config id :action-on-failure)]
      (. builder actionOnFailure data))
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :jar)]
      (. builder jar data))
    (when-let [data (lookup-entry config id :main-class)]
      (. builder mainClass data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-cancel-step-builder
  "The emr-cancel-step-builder function buildes out new instances of 
EmrCancelStep$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrCancelStep$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :step-id)]
      (. builder stepId data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-cancel-step-props-builder
  "The emr-cancel-step-props-builder function buildes out new instances of 
EmrCancelStepProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrCancelStepProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :step-id)]
      (. builder stepId data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-containers-create-virtual-cluster-builder
  "The emr-containers-create-virtual-cluster-builder function buildes out new instances of 
EmrContainersCreateVirtualCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-cluster-name` |"
  [stack id config]
  (let [builder (EmrContainersCreateVirtualCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :eks-cluster)]
      (. builder eksCluster data))
    (when-let [data (lookup-entry config id :eks-namespace)]
      (. builder eksNamespace data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster-name)]
      (. builder virtualClusterName data))
    (.build builder)))


(defn emr-containers-create-virtual-cluster-props-builder
  "The emr-containers-create-virtual-cluster-props-builder function buildes out new instances of 
EmrContainersCreateVirtualClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualClusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-cluster-name` |"
  [stack id config]
  (let [builder (EmrContainersCreateVirtualClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :eks-cluster)]
      (. builder eksCluster data))
    (when-let [data (lookup-entry config id :eks-namespace)]
      (. builder eksNamespace data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster-name)]
      (. builder virtualClusterName data))
    (.build builder)))


(defn emr-containers-delete-virtual-cluster-builder
  "The emr-containers-delete-virtual-cluster-builder function buildes out new instances of 
EmrContainersDeleteVirtualCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualClusterId` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:virtual-cluster-id` |"
  [stack id config]
  (let [builder (EmrContainersDeleteVirtualCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster-id)]
      (. builder virtualClusterId data))
    (.build builder)))


(defn emr-containers-delete-virtual-cluster-props-builder
  "The emr-containers-delete-virtual-cluster-props-builder function buildes out new instances of 
EmrContainersDeleteVirtualClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualClusterId` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:virtual-cluster-id` |"
  [stack id config]
  (let [builder (EmrContainersDeleteVirtualClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster-id)]
      (. builder virtualClusterId data))
    (.build builder)))


(defn emr-containers-start-job-run-builder
  "The emr-containers-start-job-run-builder function buildes out new instances of 
EmrContainersStartJobRun$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualCluster` | software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput | [[cdk.support/lookup-entry]] | `:virtual-cluster` |"
  [stack id config]
  (let [builder (EmrContainersStartJobRun$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-config)]
      (. builder applicationConfig data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :job-driver)]
      (. builder jobDriver data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster)]
      (. builder virtualCluster data))
    (.build builder)))


(defn emr-containers-start-job-run-props-builder
  "The emr-containers-start-job-run-props-builder function buildes out new instances of 
EmrContainersStartJobRunProps$Builder using the provided configuration.  Each field is set as follows:

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
| `virtualCluster` | software.amazon.awscdk.services.stepfunctions.tasks.VirtualClusterInput | [[cdk.support/lookup-entry]] | `:virtual-cluster` |"
  [stack id config]
  (let [builder (EmrContainersStartJobRunProps$Builder.)]
    (when-let [data (lookup-entry config id :application-config)]
      (. builder applicationConfig data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :job-driver)]
      (. builder jobDriver data))
    (when-let [data (lookup-entry config id :job-name)]
      (. builder jobName data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :virtual-cluster)]
      (. builder virtualCluster data))
    (.build builder)))


(defn emr-create-cluster-application-config-property-builder
  "The emr-create-cluster-application-config-property-builder function buildes out new instances of 
EmrCreateCluster$ApplicationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-info` |
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ApplicationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn emr-create-cluster-auto-scaling-policy-property-builder
  "The emr-create-cluster-auto-scaling-policy-property-builder function buildes out new instances of 
EmrCreateCluster$AutoScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingConstraintsProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (EmrCreateCluster$AutoScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn emr-create-cluster-bootstrap-action-config-property-builder
  "The emr-create-cluster-bootstrap-action-config-property-builder function buildes out new instances of 
EmrCreateCluster$BootstrapActionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scriptBootstrapAction` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScriptBootstrapActionConfigProperty | [[cdk.support/lookup-entry]] | `:script-bootstrap-action` |"
  [stack id config]
  (let [builder (EmrCreateCluster$BootstrapActionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :script-bootstrap-action)]
      (. builder scriptBootstrapAction data))
    (.build builder)))


(defn emr-create-cluster-builder
  "The emr-create-cluster-builder function buildes out new instances of 
EmrCreateCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |"
  [stack id config]
  (let [builder (EmrCreateCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :auto-scaling-role)]
      (. builder autoScalingRole data))
    (when-let [data (lookup-entry config id :bootstrap-actions)]
      (. builder bootstrapActions data))
    (when-let [data (lookup-entry config id :cluster-role)]
      (. builder clusterRole data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :custom-ami-id)]
      (. builder customAmiId data))
    (when-let [data (lookup-entry config id :ebs-root-volume-size)]
      (. builder ebsRootVolumeSize data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :kerberos-attributes)]
      (. builder kerberosAttributes data))
    (when-let [data (lookup-entry config id :log-uri)]
      (. builder logUri data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (emr-create-cluster-emr-cluster-scale-down-behavior config id :scale-down-behavior)]
      (. builder scaleDownBehavior data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :step-concurrency-level)]
      (. builder stepConcurrencyLevel data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :visible-to-all-users)]
      (. builder visibleToAllUsers data))
    (.build builder)))


(defn emr-create-cluster-cloud-watch-alarm-definition-property-builder
  "The emr-create-cluster-cloud-watch-alarm-definition-property-builder function buildes out new instances of 
EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmUnit | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-cloud-watch-alarm-unit]] | `:unit` |"
  [stack id config]
  (let [builder (EmrCreateCluster$CloudWatchAlarmDefinitionProperty$Builder.)]
    (when-let [data (emr-create-cluster-cloud-watch-alarm-comparison-operator config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :period)]
      (. builder period data))
    (when-let [data (emr-create-cluster-cloud-watch-alarm-statistic config id :statistic)]
      (. builder statistic data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (emr-create-cluster-cloud-watch-alarm-unit config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn emr-create-cluster-configuration-property-builder
  "The emr-create-cluster-configuration-property-builder function buildes out new instances of 
EmrCreateCluster$ConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classification` | java.lang.String | [[cdk.support/lookup-entry]] | `:classification` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :classification)]
      (. builder classification data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (.build builder)))


(defn emr-create-cluster-ebs-block-device-config-property-builder
  "The emr-create-cluster-ebs-block-device-config-property-builder function buildes out new instances of 
EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `volumeSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$VolumeSpecificationProperty | [[cdk.support/lookup-entry]] | `:volume-specification` |
| `volumesPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volumes-per-instance` |"
  [stack id config]
  (let [builder (EmrCreateCluster$EbsBlockDeviceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :volume-specification)]
      (. builder volumeSpecification data))
    (when-let [data (lookup-entry config id :volumes-per-instance)]
      (. builder volumesPerInstance data))
    (.build builder)))


(defn emr-create-cluster-ebs-configuration-property-builder
  "The emr-create-cluster-ebs-configuration-property-builder function buildes out new instances of 
EmrCreateCluster$EbsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsBlockDeviceConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:ebs-block-device-configs` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |"
  [stack id config]
  (let [builder (EmrCreateCluster$EbsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-block-device-configs)]
      (. builder ebsBlockDeviceConfigs data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (.build builder)))


(defn emr-create-cluster-instance-fleet-config-property-builder
  "The emr-create-cluster-instance-fleet-config-property-builder function buildes out new instances of 
EmrCreateCluster$InstanceFleetConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceFleetType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceRoleType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-role-type]] | `:instance-fleet-type` |
| `instanceTypeConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-type-configs` |
| `launchSpecifications` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetOnDemandCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-on-demand-capacity` |
| `targetSpotCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-spot-capacity` |"
  [stack id config]
  (let [builder (EmrCreateCluster$InstanceFleetConfigProperty$Builder.)]
    (when-let [data (emr-create-cluster-instance-role-type config id :instance-fleet-type)]
      (. builder instanceFleetType data))
    (when-let [data (lookup-entry config id :instance-type-configs)]
      (. builder instanceTypeConfigs data))
    (when-let [data (lookup-entry config id :launch-specifications)]
      (. builder launchSpecifications data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :target-on-demand-capacity)]
      (. builder targetOnDemandCapacity data))
    (when-let [data (lookup-entry config id :target-spot-capacity)]
      (. builder targetSpotCapacity data))
    (.build builder)))


(defn emr-create-cluster-instance-fleet-provisioning-specifications-property-builder
  "The emr-create-cluster-instance-fleet-provisioning-specifications-property-builder function buildes out new instances of 
EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onDemandSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$OnDemandProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:on-demand-specification` |
| `spotSpecification` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotProvisioningSpecificationProperty | [[cdk.support/lookup-entry]] | `:spot-specification` |"
  [stack id config]
  (let [builder (EmrCreateCluster$InstanceFleetProvisioningSpecificationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-demand-specification)]
      (. builder onDemandSpecification data))
    (when-let [data (lookup-entry config id :spot-specification)]
      (. builder spotSpecification data))
    (.build builder)))


(defn emr-create-cluster-instance-group-config-property-builder
  "The emr-create-cluster-instance-group-config-property-builder function buildes out new instances of 
EmrCreateCluster$InstanceGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (EmrCreateCluster$InstanceGroupConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-policy)]
      (. builder autoScalingPolicy data))
    (when-let [data (lookup-entry config id :bid-price)]
      (. builder bidPrice data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :ebs-configuration)]
      (. builder ebsConfiguration data))
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (emr-create-cluster-instance-role-type config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (emr-create-cluster-instance-market config id :market)]
      (. builder market data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn emr-create-cluster-instance-type-config-property-builder
  "The emr-create-cluster-instance-type-config-property-builder function buildes out new instances of 
EmrCreateCluster$InstanceTypeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bidPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:bid-price` |
| `bidPriceAsPercentageOfOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bid-price-as-percentage-of-on-demand-price` |
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `ebsConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EbsConfigurationProperty | [[cdk.support/lookup-entry]] | `:ebs-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (EmrCreateCluster$InstanceTypeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bid-price)]
      (. builder bidPrice data))
    (when-let [data (lookup-entry config id :bid-price-as-percentage-of-on-demand-price)]
      (. builder bidPriceAsPercentageOfOnDemandPrice data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :ebs-configuration)]
      (. builder ebsConfiguration data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn emr-create-cluster-instances-config-property-builder
  "The emr-create-cluster-instances-config-property-builder function buildes out new instances of 
EmrCreateCluster$InstancesConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `terminationProtected` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protected` |"
  [stack id config]
  (let [builder (EmrCreateCluster$InstancesConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-master-security-groups)]
      (. builder additionalMasterSecurityGroups data))
    (when-let [data (lookup-entry config id :additional-slave-security-groups)]
      (. builder additionalSlaveSecurityGroups data))
    (when-let [data (lookup-entry config id :ec2-key-name)]
      (. builder ec2KeyName data))
    (when-let [data (lookup-entry config id :ec2-subnet-id)]
      (. builder ec2SubnetId data))
    (when-let [data (lookup-entry config id :ec2-subnet-ids)]
      (. builder ec2SubnetIds data))
    (when-let [data (lookup-entry config id :emr-managed-master-security-group)]
      (. builder emrManagedMasterSecurityGroup data))
    (when-let [data (lookup-entry config id :emr-managed-slave-security-group)]
      (. builder emrManagedSlaveSecurityGroup data))
    (when-let [data (lookup-entry config id :hadoop-version)]
      (. builder hadoopVersion data))
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-fleets)]
      (. builder instanceFleets data))
    (when-let [data (lookup-entry config id :instance-groups)]
      (. builder instanceGroups data))
    (when-let [data (lookup-entry config id :master-instance-type)]
      (. builder masterInstanceType data))
    (when-let [data (lookup-entry config id :placement)]
      (. builder placement data))
    (when-let [data (lookup-entry config id :service-access-security-group)]
      (. builder serviceAccessSecurityGroup data))
    (when-let [data (lookup-entry config id :slave-instance-type)]
      (. builder slaveInstanceType data))
    (when-let [data (lookup-entry config id :termination-protected)]
      (. builder terminationProtected data))
    (.build builder)))


(defn emr-create-cluster-kerberos-attributes-property-builder
  "The emr-create-cluster-kerberos-attributes-property-builder function buildes out new instances of 
EmrCreateCluster$KerberosAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adDomainJoinPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-password` |
| `adDomainJoinUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:ad-domain-join-user` |
| `crossRealmTrustPrincipalPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-realm-trust-principal-password` |
| `kdcAdminPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:kdc-admin-password` |
| `realm` | java.lang.String | [[cdk.support/lookup-entry]] | `:realm` |"
  [stack id config]
  (let [builder (EmrCreateCluster$KerberosAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :ad-domain-join-password)]
      (. builder adDomainJoinPassword data))
    (when-let [data (lookup-entry config id :ad-domain-join-user)]
      (. builder adDomainJoinUser data))
    (when-let [data (lookup-entry config id :cross-realm-trust-principal-password)]
      (. builder crossRealmTrustPrincipalPassword data))
    (when-let [data (lookup-entry config id :kdc-admin-password)]
      (. builder kdcAdminPassword data))
    (when-let [data (lookup-entry config id :realm)]
      (. builder realm data))
    (.build builder)))


(defn emr-create-cluster-metric-dimension-property-builder
  "The emr-create-cluster-metric-dimension-property-builder function buildes out new instances of 
EmrCreateCluster$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (EmrCreateCluster$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn emr-create-cluster-on-demand-provisioning-specification-property-builder
  "The emr-create-cluster-on-demand-provisioning-specification-property-builder function buildes out new instances of 
EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$OnDemandAllocationStrategy | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-on-demand-allocation-strategy]] | `:allocation-strategy` |"
  [stack id config]
  (let [builder (EmrCreateCluster$OnDemandProvisioningSpecificationProperty$Builder.)]
    (when-let [data (emr-create-cluster-on-demand-allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (.build builder)))


(defn emr-create-cluster-placement-type-property-builder
  "The emr-create-cluster-placement-type-property-builder function buildes out new instances of 
EmrCreateCluster$PlacementTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |"
  [stack id config]
  (let [builder (EmrCreateCluster$PlacementTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (.build builder)))


(defn emr-create-cluster-props-builder
  "The emr-create-cluster-props-builder function buildes out new instances of 
EmrCreateClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `visibleToAllUsers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:visible-to-all-users` |"
  [stack id config]
  (let [builder (EmrCreateClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :auto-scaling-role)]
      (. builder autoScalingRole data))
    (when-let [data (lookup-entry config id :bootstrap-actions)]
      (. builder bootstrapActions data))
    (when-let [data (lookup-entry config id :cluster-role)]
      (. builder clusterRole data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :custom-ami-id)]
      (. builder customAmiId data))
    (when-let [data (lookup-entry config id :ebs-root-volume-size)]
      (. builder ebsRootVolumeSize data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :kerberos-attributes)]
      (. builder kerberosAttributes data))
    (when-let [data (lookup-entry config id :log-uri)]
      (. builder logUri data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :release-label)]
      (. builder releaseLabel data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (emr-create-cluster-emr-cluster-scale-down-behavior config id :scale-down-behavior)]
      (. builder scaleDownBehavior data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :step-concurrency-level)]
      (. builder stepConcurrencyLevel data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :visible-to-all-users)]
      (. builder visibleToAllUsers data))
    (.build builder)))


(defn emr-create-cluster-scaling-action-property-builder
  "The emr-create-cluster-scaling-action-property-builder function buildes out new instances of 
EmrCreateCluster$ScalingActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `market` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$InstanceMarket | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-instance-market]] | `:market` |
| `simpleScalingPolicyConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SimpleScalingPolicyConfigurationProperty | [[cdk.support/lookup-entry]] | `:simple-scaling-policy-configuration` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ScalingActionProperty$Builder.)]
    (when-let [data (emr-create-cluster-instance-market config id :market)]
      (. builder market data))
    (when-let [data (lookup-entry config id :simple-scaling-policy-configuration)]
      (. builder simpleScalingPolicyConfiguration data))
    (.build builder)))


(defn emr-create-cluster-scaling-constraints-property-builder
  "The emr-create-cluster-scaling-constraints-property-builder function buildes out new instances of 
EmrCreateCluster$ScalingConstraintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ScalingConstraintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn emr-create-cluster-scaling-rule-property-builder
  "The emr-create-cluster-scaling-rule-property-builder function buildes out new instances of 
EmrCreateCluster$ScalingRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `trigger` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingTriggerProperty | [[cdk.support/lookup-entry]] | `:trigger` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ScalingRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :trigger)]
      (. builder trigger data))
    (.build builder)))


(defn emr-create-cluster-scaling-trigger-property-builder
  "The emr-create-cluster-scaling-trigger-property-builder function buildes out new instances of 
EmrCreateCluster$ScalingTriggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchAlarmDefinition` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$CloudWatchAlarmDefinitionProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-alarm-definition` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ScalingTriggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-alarm-definition)]
      (. builder cloudWatchAlarmDefinition data))
    (.build builder)))


(defn emr-create-cluster-script-bootstrap-action-config-property-builder
  "The emr-create-cluster-script-bootstrap-action-config-property-builder function buildes out new instances of 
EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | java.util.List | [[cdk.support/lookup-entry]] | `:args` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (EmrCreateCluster$ScriptBootstrapActionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :args)]
      (. builder args data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn emr-create-cluster-simple-scaling-policy-configuration-property-builder
  "The emr-create-cluster-simple-scaling-policy-configuration-property-builder function buildes out new instances of 
EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adjustmentType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$ScalingAdjustmentType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-scaling-adjustment-type]] | `:adjustment-type` |
| `coolDown` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cool-down` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |"
  [stack id config]
  (let [builder (EmrCreateCluster$SimpleScalingPolicyConfigurationProperty$Builder.)]
    (when-let [data (emr-create-cluster-scaling-adjustment-type config id :adjustment-type)]
      (. builder adjustmentType data))
    (when-let [data (lookup-entry config id :cool-down)]
      (. builder coolDown data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (.build builder)))


(defn emr-create-cluster-spot-provisioning-specification-property-builder
  "The emr-create-cluster-spot-provisioning-specification-property-builder function buildes out new instances of 
EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotAllocationStrategy | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-spot-allocation-strategy]] | `:allocation-strategy` |
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `timeoutAction` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$SpotTimeoutAction | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-spot-timeout-action]] | `:timeout-action` |
| `timeoutDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-duration-minutes` |"
  [stack id config]
  (let [builder (EmrCreateCluster$SpotProvisioningSpecificationProperty$Builder.)]
    (when-let [data (emr-create-cluster-spot-allocation-strategy config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :block-duration-minutes)]
      (. builder blockDurationMinutes data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (emr-create-cluster-spot-timeout-action config id :timeout-action)]
      (. builder timeoutAction data))
    (when-let [data (lookup-entry config id :timeout-duration-minutes)]
      (. builder timeoutDurationMinutes data))
    (.build builder)))


(defn emr-create-cluster-volume-specification-property-builder
  "The emr-create-cluster-volume-specification-property-builder function buildes out new instances of 
EmrCreateCluster$VolumeSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster$EbsBlockDeviceVolumeType | [[cdk.api.services.stepfunctions.tasks/emr-create-cluster-ebs-block-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EmrCreateCluster$VolumeSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (emr-create-cluster-ebs-block-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn emr-modify-instance-fleet-by-name-builder
  "The emr-modify-instance-fleet-by-name-builder function buildes out new instances of 
EmrModifyInstanceFleetByName$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrModifyInstanceFleetByName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instance-fleet-name)]
      (. builder instanceFleetName data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :target-on-demand-capacity)]
      (. builder targetOnDemandCapacity data))
    (when-let [data (lookup-entry config id :target-spot-capacity)]
      (. builder targetSpotCapacity data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-modify-instance-fleet-by-name-props-builder
  "The emr-modify-instance-fleet-by-name-props-builder function buildes out new instances of 
EmrModifyInstanceFleetByNameProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrModifyInstanceFleetByNameProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instance-fleet-name)]
      (. builder instanceFleetName data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :target-on-demand-capacity)]
      (. builder targetOnDemandCapacity data))
    (when-let [data (lookup-entry config id :target-spot-capacity)]
      (. builder targetSpotCapacity data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-modify-instance-group-by-name-builder
  "The emr-modify-instance-group-by-name-builder function buildes out new instances of 
EmrModifyInstanceGroupByName$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrModifyInstanceGroupByName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instance-group)]
      (. builder instanceGroup data))
    (when-let [data (lookup-entry config id :instance-group-name)]
      (. builder instanceGroupName data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-modify-instance-group-by-name-instance-group-modify-config-property-builder
  "The emr-modify-instance-group-by-name-instance-group-modify-config-property-builder function buildes out new instances of 
EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `eC2InstanceIdsToTerminate` | java.util.List | [[cdk.support/lookup-entry]] | `:e-c2-instance-ids-to-terminate` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `shrinkPolicy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$ShrinkPolicyProperty | [[cdk.support/lookup-entry]] | `:shrink-policy` |"
  [stack id config]
  (let [builder (EmrModifyInstanceGroupByName$InstanceGroupModifyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :e-c2-instance-ids-to-terminate)]
      (. builder eC2InstanceIdsToTerminate data))
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :shrink-policy)]
      (. builder shrinkPolicy data))
    (.build builder)))


(defn emr-modify-instance-group-by-name-instance-resize-policy-property-builder
  "The emr-modify-instance-group-by-name-instance-resize-policy-property-builder function buildes out new instances of 
EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceTerminationTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:instance-termination-timeout` |
| `instancesToProtect` | java.util.List | [[cdk.support/lookup-entry]] | `:instances-to-protect` |
| `instancesToTerminate` | java.util.List | [[cdk.support/lookup-entry]] | `:instances-to-terminate` |"
  [stack id config]
  (let [builder (EmrModifyInstanceGroupByName$InstanceResizePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-termination-timeout)]
      (. builder instanceTerminationTimeout data))
    (when-let [data (lookup-entry config id :instances-to-protect)]
      (. builder instancesToProtect data))
    (when-let [data (lookup-entry config id :instances-to-terminate)]
      (. builder instancesToTerminate data))
    (.build builder)))


(defn emr-modify-instance-group-by-name-props-builder
  "The emr-modify-instance-group-by-name-props-builder function buildes out new instances of 
EmrModifyInstanceGroupByNameProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrModifyInstanceGroupByNameProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (lookup-entry config id :instance-group)]
      (. builder instanceGroup data))
    (when-let [data (lookup-entry config id :instance-group-name)]
      (. builder instanceGroupName data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-modify-instance-group-by-name-shrink-policy-property-builder
  "The emr-modify-instance-group-by-name-shrink-policy-property-builder function buildes out new instances of 
EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decommissionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:decommission-timeout` |
| `instanceResizePolicy` | software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName$InstanceResizePolicyProperty | [[cdk.support/lookup-entry]] | `:instance-resize-policy` |"
  [stack id config]
  (let [builder (EmrModifyInstanceGroupByName$ShrinkPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :decommission-timeout)]
      (. builder decommissionTimeout data))
    (when-let [data (lookup-entry config id :instance-resize-policy)]
      (. builder instanceResizePolicy data))
    (.build builder)))


(defn emr-set-cluster-termination-protection-builder
  "The emr-set-cluster-termination-protection-builder function buildes out new instances of 
EmrSetClusterTerminationProtection$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrSetClusterTerminationProtection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :termination-protected)]
      (. builder terminationProtected data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-set-cluster-termination-protection-props-builder
  "The emr-set-cluster-termination-protection-props-builder function buildes out new instances of 
EmrSetClusterTerminationProtectionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrSetClusterTerminationProtectionProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :termination-protected)]
      (. builder terminationProtected data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-terminate-cluster-builder
  "The emr-terminate-cluster-builder function buildes out new instances of 
EmrTerminateCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrTerminateCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn emr-terminate-cluster-props-builder
  "The emr-terminate-cluster-props-builder function buildes out new instances of 
EmrTerminateClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EmrTerminateClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-id)]
      (. builder clusterId data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn encryption-configuration-builder
  "The encryption-configuration-builder function buildes out new instances of 
EncryptionConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `encryptionOption` | software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption | [[cdk.api.services.stepfunctions.tasks/encryption-option]] | `:encryption-option` |"
  [stack id config]
  (let [builder (EncryptionConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (encryption-option config id :encryption-option)]
      (. builder encryptionOption data))
    (.build builder)))


(defn evaluate-expression-builder
  "The evaluate-expression-builder function buildes out new instances of 
EvaluateExpression$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EvaluateExpression$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn evaluate-expression-props-builder
  "The evaluate-expression-props-builder function buildes out new instances of 
EvaluateExpressionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EvaluateExpressionProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn event-bridge-put-events-builder
  "The event-bridge-put-events-builder function buildes out new instances of 
EventBridgePutEvents$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EventBridgePutEvents$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn event-bridge-put-events-entry-builder
  "The event-bridge-put-events-entry-builder function buildes out new instances of 
EventBridgePutEventsEntry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detail` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:detail` |
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (EventBridgePutEventsEntry$Builder.)]
    (when-let [data (lookup-entry config id :detail)]
      (. builder detail data))
    (when-let [data (lookup-entry config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn event-bridge-put-events-props-builder
  "The event-bridge-put-events-props-builder function buildes out new instances of 
EventBridgePutEventsProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (EventBridgePutEventsProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn glue-data-brew-start-job-run-builder
  "The glue-data-brew-start-job-run-builder function buildes out new instances of 
GlueDataBrewStartJobRun$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (GlueDataBrewStartJobRun$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn glue-data-brew-start-job-run-props-builder
  "The glue-data-brew-start-job-run-props-builder function buildes out new instances of 
GlueDataBrewStartJobRunProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (GlueDataBrewStartJobRunProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn glue-start-crawler-run-builder
  "The glue-start-crawler-run-builder function buildes out new instances of 
GlueStartCrawlerRun$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (GlueStartCrawlerRun$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :crawler-name)]
      (. builder crawlerName data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn glue-start-crawler-run-props-builder
  "The glue-start-crawler-run-props-builder function buildes out new instances of 
GlueStartCrawlerRunProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (GlueStartCrawlerRunProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :crawler-name)]
      (. builder crawlerName data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn glue-start-job-run-builder
  "The glue-start-job-run-builder function buildes out new instances of 
GlueStartJobRun$Builder using the provided configuration.  Each field is set as follows:

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
| `workerConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |"
  [stack id config]
  (let [builder (GlueStartJobRun$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :glue-job-name)]
      (. builder glueJobName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :notify-delay-after)]
      (. builder notifyDelayAfter data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :worker-configuration)]
      (. builder workerConfiguration data))
    (.build builder)))


(defn glue-start-job-run-props-builder
  "The glue-start-job-run-props-builder function buildes out new instances of 
GlueStartJobRunProps$Builder using the provided configuration.  Each field is set as follows:

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
| `workerConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerConfigurationProperty | [[cdk.support/lookup-entry]] | `:worker-configuration` |"
  [stack id config]
  (let [builder (GlueStartJobRunProps$Builder.)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :glue-job-name)]
      (. builder glueJobName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :notify-delay-after)]
      (. builder notifyDelayAfter data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :security-configuration)]
      (. builder securityConfiguration data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :worker-configuration)]
      (. builder workerConfiguration data))
    (.build builder)))


(defn http-invoke-builder
  "The http-invoke-builder function buildes out new instances of 
HttpInvoke$Builder using the provided configuration.  Each field is set as follows:

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
| `urlEncodingFormat` | software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat | [[cdk.api.services.stepfunctions.tasks/url-encoding-format]] | `:url-encoding-format` |"
  [stack id config]
  (let [builder (HttpInvoke$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-endpoint)]
      (. builder apiEndpoint data))
    (when-let [data (lookup-entry config id :api-root)]
      (. builder apiRoot data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :connection)]
      (. builder connection data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (url-encoding-format config id :url-encoding-format)]
      (. builder urlEncodingFormat data))
    (.build builder)))


(defn http-invoke-props-builder
  "The http-invoke-props-builder function buildes out new instances of 
HttpInvokeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `urlEncodingFormat` | software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat | [[cdk.api.services.stepfunctions.tasks/url-encoding-format]] | `:url-encoding-format` |"
  [stack id config]
  (let [builder (HttpInvokeProps$Builder.)]
    (when-let [data (lookup-entry config id :api-endpoint)]
      (. builder apiEndpoint data))
    (when-let [data (lookup-entry config id :api-root)]
      (. builder apiRoot data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :connection)]
      (. builder connection data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :method)]
      (. builder method data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :query-string-parameters)]
      (. builder queryStringParameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (url-encoding-format config id :url-encoding-format)]
      (. builder urlEncodingFormat data))
    (.build builder)))


(defn job-dependency-builder
  "The job-dependency-builder function buildes out new instances of 
JobDependency$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jobId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (JobDependency$Builder.)]
    (when-let [data (lookup-entry config id :job-id)]
      (. builder jobId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn job-driver-builder
  "The job-driver-builder function buildes out new instances of 
JobDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sparkSubmitJobDriver` | software.amazon.awscdk.services.stepfunctions.tasks.SparkSubmitJobDriver | [[cdk.support/lookup-entry]] | `:spark-submit-job-driver` |"
  [stack id config]
  (let [builder (JobDriver$Builder.)]
    (when-let [data (lookup-entry config id :spark-submit-job-driver)]
      (. builder sparkSubmitJobDriver data))
    (.build builder)))


(defn lambda-invoke-builder
  "The lambda-invoke-builder function buildes out new instances of 
LambdaInvoke$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (LambdaInvoke$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-context)]
      (. builder clientContext data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lambda-invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :payload-response-only)]
      (. builder payloadResponseOnly data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :retry-on-service-exceptions)]
      (. builder retryOnServiceExceptions data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn lambda-invoke-props-builder
  "The lambda-invoke-props-builder function buildes out new instances of 
LambdaInvokeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (LambdaInvokeProps$Builder.)]
    (when-let [data (lookup-entry config id :client-context)]
      (. builder clientContext data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lambda-invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :payload-response-only)]
      (. builder payloadResponseOnly data))
    (when-let [data (lookup-entry config id :qualifier)]
      (. builder qualifier data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :retry-on-service-exceptions)]
      (. builder retryOnServiceExceptions data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn launch-target-bind-options-builder
  "The launch-target-bind-options-builder function buildes out new instances of 
LaunchTargetBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.ITaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (LaunchTargetBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn media-convert-create-job-builder
  "The media-convert-create-job-builder function buildes out new instances of 
MediaConvertCreateJob$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (MediaConvertCreateJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :create-job-request)]
      (. builder createJobRequest data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn media-convert-create-job-props-builder
  "The media-convert-create-job-props-builder function buildes out new instances of 
MediaConvertCreateJobProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (MediaConvertCreateJobProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :create-job-request)]
      (. builder createJobRequest data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn message-attribute-builder
  "The message-attribute-builder function buildes out new instances of 
MessageAttribute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataType` | software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType | [[cdk.api.services.stepfunctions.tasks/message-attribute-data-type]] | `:data-type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (MessageAttribute$Builder.)]
    (when-let [data (message-attribute-data-type config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn metric-definition-builder
  "The metric-definition-builder function buildes out new instances of 
MetricDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |"
  [stack id config]
  (let [builder (MetricDefinition$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (.build builder)))


(defn model-client-options-builder
  "The model-client-options-builder function buildes out new instances of 
ModelClientOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invocationsMaxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:invocations-max-retries` |
| `invocationsTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:invocations-timeout` |"
  [stack id config]
  (let [builder (ModelClientOptions$Builder.)]
    (when-let [data (lookup-entry config id :invocations-max-retries)]
      (. builder invocationsMaxRetries data))
    (when-let [data (lookup-entry config id :invocations-timeout)]
      (. builder invocationsTimeout data))
    (.build builder)))


(defn monitoring-builder
  "The monitoring-builder function buildes out new instances of 
Monitoring$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:log-bucket` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStreamNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-stream-name-prefix` |
| `logging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:logging` |
| `persistentAppUi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:persistent-app-ui` |"
  [stack id config]
  (let [builder (Monitoring$Builder.)]
    (when-let [data (lookup-entry config id :log-bucket)]
      (. builder logBucket data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream-name-prefix)]
      (. builder logStreamNamePrefix data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :persistent-app-ui)]
      (. builder persistentAppUi data))
    (.build builder)))


(defn output-data-config-builder
  "The output-data-config-builder function buildes out new instances of 
OutputDataConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `s3OutputLocation` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:s3-output-location` |"
  [stack id config]
  (let [builder (OutputDataConfig$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :s3-output-location)]
      (. builder s3OutputLocation data))
    (.build builder)))


(defn production-variant-builder
  "The production-variant-builder function buildes out new instances of 
ProductionVariant$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorType` | software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType | [[cdk.support/lookup-entry]] | `:accelerator-type` |
| `initialInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-instance-count` |
| `initialVariantWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-variant-weight` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |"
  [stack id config]
  (let [builder (ProductionVariant$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-type)]
      (. builder acceleratorType data))
    (when-let [data (lookup-entry config id :initial-instance-count)]
      (. builder initialInstanceCount data))
    (when-let [data (lookup-entry config id :initial-variant-weight)]
      (. builder initialVariantWeight data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :variant-name)]
      (. builder variantName data))
    (.build builder)))


(defn query-execution-context-builder
  "The query-execution-context-builder function buildes out new instances of 
QueryExecutionContext$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogName` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-name` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |"
  [stack id config]
  (let [builder (QueryExecutionContext$Builder.)]
    (when-let [data (lookup-entry config id :catalog-name)]
      (. builder catalogName data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (.build builder)))


(defn resource-config-builder
  "The resource-config-builder function buildes out new instances of 
ResourceConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |
| `volumeSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:volume-size` |"
  [stack id config]
  (let [builder (ResourceConfig$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-encryption-key)]
      (. builder volumeEncryptionKey data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (.build builder)))


(defn result-configuration-builder
  "The result-configuration-builder function buildes out new instances of 
ResultConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `outputLocation` | software.amazon.awscdk.services.s3.Location | [[cdk.support/lookup-entry]] | `:output-location` |"
  [stack id config]
  (let [builder (ResultConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :output-location)]
      (. builder outputLocation data))
    (.build builder)))


(defn s3-data-source-builder
  "The s3-data-source-builder function buildes out new instances of 
S3DataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:attribute-names` |
| `s3DataDistributionType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType | [[cdk.api.services.stepfunctions.tasks/s3-data-distribution-type]] | `:s3-data-distribution-type` |
| `s3DataType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataType | [[cdk.api.services.stepfunctions.tasks/s3-data-type]] | `:s3-data-type` |
| `s3Location` | software.amazon.awscdk.services.stepfunctions.tasks.S3Location | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (S3DataSource$Builder.)]
    (when-let [data (lookup-entry config id :attribute-names)]
      (. builder attributeNames data))
    (when-let [data (s3-data-distribution-type config id :s3-data-distribution-type)]
      (. builder s3DataDistributionType data))
    (when-let [data (s3-data-type config id :s3-data-type)]
      (. builder s3DataType data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn s3-location-bind-options-builder
  "The s3-location-bind-options-builder function buildes out new instances of 
S3LocationBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forReading` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-reading` |
| `forWriting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:for-writing` |"
  [stack id config]
  (let [builder (S3LocationBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :for-reading)]
      (. builder forReading data))
    (when-let [data (lookup-entry config id :for-writing)]
      (. builder forWriting data))
    (.build builder)))


(defn s3-location-config-builder
  "The s3-location-config-builder function buildes out new instances of 
S3LocationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (S3LocationConfig$Builder.)]
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn sage-maker-create-endpoint-builder
  "The sage-maker-create-endpoint-builder function buildes out new instances of 
SageMakerCreateEndpoint$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerCreateEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sage-maker-create-endpoint-config-builder
  "The sage-maker-create-endpoint-config-builder function buildes out new instances of 
SageMakerCreateEndpointConfig$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerCreateEndpointConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :production-variants)]
      (. builder productionVariants data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sage-maker-create-endpoint-config-props-builder
  "The sage-maker-create-endpoint-config-props-builder function buildes out new instances of 
SageMakerCreateEndpointConfigProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerCreateEndpointConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :production-variants)]
      (. builder productionVariants data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sage-maker-create-endpoint-props-builder
  "The sage-maker-create-endpoint-props-builder function buildes out new instances of 
SageMakerCreateEndpointProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerCreateEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sage-maker-create-model-builder
  "The sage-maker-create-model-builder function buildes out new instances of 
SageMakerCreateModel$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (SageMakerCreateModel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :primary-container)]
      (. builder primaryContainer data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn sage-maker-create-model-props-builder
  "The sage-maker-create-model-props-builder function buildes out new instances of 
SageMakerCreateModelProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (SageMakerCreateModelProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :primary-container)]
      (. builder primaryContainer data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn sage-maker-create-training-job-builder
  "The sage-maker-create-training-job-builder function buildes out new instances of 
SageMakerCreateTrainingJob$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (SageMakerCreateTrainingJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :algorithm-specification)]
      (. builder algorithmSpecification data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :hyperparameters)]
      (. builder hyperparameters data))
    (when-let [data (lookup-entry config id :input-data-config)]
      (. builder inputDataConfig data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-data-config)]
      (. builder outputDataConfig data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :resource-config)]
      (. builder resourceConfig data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :stopping-condition)]
      (. builder stoppingCondition data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :training-job-name)]
      (. builder trainingJobName data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn sage-maker-create-training-job-props-builder
  "The sage-maker-create-training-job-props-builder function buildes out new instances of 
SageMakerCreateTrainingJobProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (SageMakerCreateTrainingJobProps$Builder.)]
    (when-let [data (lookup-entry config id :algorithm-specification)]
      (. builder algorithmSpecification data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :hyperparameters)]
      (. builder hyperparameters data))
    (when-let [data (lookup-entry config id :input-data-config)]
      (. builder inputDataConfig data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-data-config)]
      (. builder outputDataConfig data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :resource-config)]
      (. builder resourceConfig data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :stopping-condition)]
      (. builder stoppingCondition data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :training-job-name)]
      (. builder trainingJobName data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn sage-maker-create-transform-job-builder
  "The sage-maker-create-transform-job-builder function buildes out new instances of 
SageMakerCreateTransformJob$Builder using the provided configuration.  Each field is set as follows:

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
| `transformResources` | software.amazon.awscdk.services.stepfunctions.tasks.TransformResources | [[cdk.support/lookup-entry]] | `:transform-resources` |"
  [stack id config]
  (let [builder (SageMakerCreateTransformJob$Builder/create stack id)]
    (when-let [data (batch-strategy config id :batch-strategy)]
      (. builder batchStrategy data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :max-concurrent-transforms)]
      (. builder maxConcurrentTransforms data))
    (when-let [data (lookup-entry config id :max-payload)]
      (. builder maxPayload data))
    (when-let [data (lookup-entry config id :model-client-options)]
      (. builder modelClientOptions data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :transform-input)]
      (. builder transformInput data))
    (when-let [data (lookup-entry config id :transform-job-name)]
      (. builder transformJobName data))
    (when-let [data (lookup-entry config id :transform-output)]
      (. builder transformOutput data))
    (when-let [data (lookup-entry config id :transform-resources)]
      (. builder transformResources data))
    (.build builder)))


(defn sage-maker-create-transform-job-props-builder
  "The sage-maker-create-transform-job-props-builder function buildes out new instances of 
SageMakerCreateTransformJobProps$Builder using the provided configuration.  Each field is set as follows:

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
| `transformResources` | software.amazon.awscdk.services.stepfunctions.tasks.TransformResources | [[cdk.support/lookup-entry]] | `:transform-resources` |"
  [stack id config]
  (let [builder (SageMakerCreateTransformJobProps$Builder.)]
    (when-let [data (batch-strategy config id :batch-strategy)]
      (. builder batchStrategy data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :max-concurrent-transforms)]
      (. builder maxConcurrentTransforms data))
    (when-let [data (lookup-entry config id :max-payload)]
      (. builder maxPayload data))
    (when-let [data (lookup-entry config id :model-client-options)]
      (. builder modelClientOptions data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :transform-input)]
      (. builder transformInput data))
    (when-let [data (lookup-entry config id :transform-job-name)]
      (. builder transformJobName data))
    (when-let [data (lookup-entry config id :transform-output)]
      (. builder transformOutput data))
    (when-let [data (lookup-entry config id :transform-resources)]
      (. builder transformResources data))
    (.build builder)))


(defn sage-maker-update-endpoint-builder
  "The sage-maker-update-endpoint-builder function buildes out new instances of 
SageMakerUpdateEndpoint$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerUpdateEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sage-maker-update-endpoint-props-builder
  "The sage-maker-update-endpoint-props-builder function buildes out new instances of 
SageMakerUpdateEndpointProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SageMakerUpdateEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn shuffle-config-builder
  "The shuffle-config-builder function buildes out new instances of 
ShuffleConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `seed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed` |"
  [stack id config]
  (let [builder (ShuffleConfig$Builder.)]
    (when-let [data (lookup-entry config id :seed)]
      (. builder seed data))
    (.build builder)))


(defn sns-publish-builder
  "The sns-publish-builder function buildes out new instances of 
SnsPublish$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (SnsPublish$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :message-attributes)]
      (. builder messageAttributes data))
    (when-let [data (lookup-entry config id :message-deduplication-id)]
      (. builder messageDeduplicationId data))
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (when-let [data (lookup-entry config id :message-per-subscription-type)]
      (. builder messagePerSubscriptionType data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn sns-publish-props-builder
  "The sns-publish-props-builder function buildes out new instances of 
SnsPublishProps$Builder using the provided configuration.  Each field is set as follows:

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
| `topic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (SnsPublishProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :message-attributes)]
      (. builder messageAttributes data))
    (when-let [data (lookup-entry config id :message-deduplication-id)]
      (. builder messageDeduplicationId data))
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (when-let [data (lookup-entry config id :message-per-subscription-type)]
      (. builder messagePerSubscriptionType data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn spark-submit-job-driver-builder
  "The spark-submit-job-driver-builder function buildes out new instances of 
SparkSubmitJobDriver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entryPoint` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:entry-point` |
| `entryPointArguments` | software.amazon.awscdk.services.stepfunctions.TaskInput | [[cdk.support/lookup-entry]] | `:entry-point-arguments` |
| `sparkSubmitParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:spark-submit-parameters` |"
  [stack id config]
  (let [builder (SparkSubmitJobDriver$Builder.)]
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :entry-point-arguments)]
      (. builder entryPointArguments data))
    (when-let [data (lookup-entry config id :spark-submit-parameters)]
      (. builder sparkSubmitParameters data))
    (.build builder)))


(defn sqs-send-message-builder
  "The sqs-send-message-builder function buildes out new instances of 
SqsSendMessage$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SqsSendMessage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :delay)]
      (. builder delay data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :message-body)]
      (. builder messageBody data))
    (when-let [data (lookup-entry config id :message-deduplication-id)]
      (. builder messageDeduplicationId data))
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn sqs-send-message-props-builder
  "The sqs-send-message-props-builder function buildes out new instances of 
SqsSendMessageProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (SqsSendMessageProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :delay)]
      (. builder delay data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :message-body)]
      (. builder messageBody data))
    (when-let [data (lookup-entry config id :message-deduplication-id)]
      (. builder messageDeduplicationId data))
    (when-let [data (lookup-entry config id :message-group-id)]
      (. builder messageGroupId data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn step-functions-invoke-activity-builder
  "The step-functions-invoke-activity-builder function buildes out new instances of 
StepFunctionsInvokeActivity$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (StepFunctionsInvokeActivity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activity)]
      (. builder activity data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn step-functions-invoke-activity-props-builder
  "The step-functions-invoke-activity-props-builder function buildes out new instances of 
StepFunctionsInvokeActivityProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (StepFunctionsInvokeActivityProps$Builder.)]
    (when-let [data (lookup-entry config id :activity)]
      (. builder activity data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn step-functions-start-execution-builder
  "The step-functions-start-execution-builder function buildes out new instances of 
StepFunctionsStartExecution$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (StepFunctionsStartExecution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associate-with-parent)]
      (. builder associateWithParent data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn step-functions-start-execution-props-builder
  "The step-functions-start-execution-props-builder function buildes out new instances of 
StepFunctionsStartExecutionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (StepFunctionsStartExecutionProps$Builder.)]
    (when-let [data (lookup-entry config id :associate-with-parent)]
      (. builder associateWithParent data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :heartbeat)]
      (. builder heartbeat data))
    (when-let [data (lookup-entry config id :heartbeat-timeout)]
      (. builder heartbeatTimeout data))
    (when-let [data (lookup-entry config id :input)]
      (. builder input data))
    (when-let [data (lookup-entry config id :input-path)]
      (. builder inputPath data))
    (when-let [data (integration-pattern config id :integration-pattern)]
      (. builder integrationPattern data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :output-path)]
      (. builder outputPath data))
    (when-let [data (lookup-entry config id :result-path)]
      (. builder resultPath data))
    (when-let [data (lookup-entry config id :result-selector)]
      (. builder resultSelector data))
    (when-let [data (lookup-entry config id :state-machine)]
      (. builder stateMachine data))
    (when-let [data (lookup-entry config id :state-name)]
      (. builder stateName data))
    (when-let [data (lookup-entry config id :task-timeout)]
      (. builder taskTimeout data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn stopping-condition-builder
  "The stopping-condition-builder function buildes out new instances of 
StoppingCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-runtime` |"
  [stack id config]
  (let [builder (StoppingCondition$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime)]
      (. builder maxRuntime data))
    (.build builder)))


(defn task-environment-variable-builder
  "The task-environment-variable-builder function buildes out new instances of 
TaskEnvironmentVariable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (TaskEnvironmentVariable$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn transform-data-source-builder
  "The transform-data-source-builder function buildes out new instances of 
TransformDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource | [[cdk.support/lookup-entry]] | `:s3-data-source` |"
  [stack id config]
  (let [builder (TransformDataSource$Builder.)]
    (when-let [data (lookup-entry config id :s3-data-source)]
      (. builder s3DataSource data))
    (.build builder)))


(defn transform-input-builder
  "The transform-input-builder function buildes out new instances of 
TransformInput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | software.amazon.awscdk.services.stepfunctions.tasks.CompressionType | [[cdk.api.services.stepfunctions.tasks/compression-type]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `splitType` | software.amazon.awscdk.services.stepfunctions.tasks.SplitType | [[cdk.api.services.stepfunctions.tasks/split-type]] | `:split-type` |
| `transformDataSource` | software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource | [[cdk.support/lookup-entry]] | `:transform-data-source` |"
  [stack id config]
  (let [builder (TransformInput$Builder.)]
    (when-let [data (compression-type config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (split-type config id :split-type)]
      (. builder splitType data))
    (when-let [data (lookup-entry config id :transform-data-source)]
      (. builder transformDataSource data))
    (.build builder)))


(defn transform-output-builder
  "The transform-output-builder function buildes out new instances of 
TransformOutput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `assembleWith` | software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith | [[cdk.api.services.stepfunctions.tasks/assemble-with]] | `:assemble-with` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |"
  [stack id config]
  (let [builder (TransformOutput$Builder.)]
    (when-let [data (lookup-entry config id :accept)]
      (. builder accept data))
    (when-let [data (assemble-with config id :assemble-with)]
      (. builder assembleWith data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :s3-output-path)]
      (. builder s3OutputPath data))
    (.build builder)))


(defn transform-resources-builder
  "The transform-resources-builder function buildes out new instances of 
TransformResources$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:volume-encryption-key` |"
  [stack id config]
  (let [builder (TransformResources$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-encryption-key)]
      (. builder volumeEncryptionKey data))
    (.build builder)))


(defn transform-s3-data-source-builder
  "The transform-s3-data-source-builder function buildes out new instances of 
TransformS3DataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataType` | software.amazon.awscdk.services.stepfunctions.tasks.S3DataType | [[cdk.api.services.stepfunctions.tasks/s3-data-type]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (TransformS3DataSource$Builder.)]
    (when-let [data (s3-data-type config id :s3-data-type)]
      (. builder s3DataType data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn vpc-config-builder
  "The vpc-config-builder function buildes out new instances of 
VpcConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (VpcConfig$Builder.)]
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn worker-configuration-property-builder
  "The worker-configuration-property-builder function buildes out new instances of 
WorkerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfWorkers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-workers` |
| `workerType` | software.amazon.awscdk.services.stepfunctions.tasks.WorkerType | [[cdk.api.services.stepfunctions.tasks/worker-type]] | `:worker-type` |"
  [stack id config]
  (let [builder (WorkerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-workers)]
      (. builder numberOfWorkers data))
    (when-let [data (worker-type config id :worker-type)]
      (. builder workerType data))
    (.build builder)))