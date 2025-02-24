(ns cdk.api.services.sagemaker
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sagemaker package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sagemaker CfnApp$Builder
                                                      CfnApp$ResourceSpecProperty$Builder
                                                      CfnAppImageConfig$Builder
                                                      CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder
                                                      CfnAppImageConfig$ContainerConfigProperty$Builder
                                                      CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder
                                                      CfnAppImageConfig$FileSystemConfigProperty$Builder
                                                      CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder
                                                      CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder
                                                      CfnAppImageConfig$KernelSpecProperty$Builder
                                                      CfnAppImageConfigProps$Builder
                                                      CfnAppProps$Builder
                                                      CfnCodeRepository$Builder
                                                      CfnCodeRepository$GitConfigProperty$Builder
                                                      CfnCodeRepositoryProps$Builder
                                                      CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder
                                                      CfnDataQualityJobDefinition$Builder
                                                      CfnDataQualityJobDefinition$ClusterConfigProperty$Builder
                                                      CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder
                                                      CfnDataQualityJobDefinition$CsvProperty$Builder
                                                      CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder
                                                      CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder
                                                      CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder
                                                      CfnDataQualityJobDefinition$DatasetFormatProperty$Builder
                                                      CfnDataQualityJobDefinition$EndpointInputProperty$Builder
                                                      CfnDataQualityJobDefinition$JsonProperty$Builder
                                                      CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder
                                                      CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder
                                                      CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder
                                                      CfnDataQualityJobDefinition$NetworkConfigProperty$Builder
                                                      CfnDataQualityJobDefinition$S3OutputProperty$Builder
                                                      CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder
                                                      CfnDataQualityJobDefinition$StoppingConditionProperty$Builder
                                                      CfnDataQualityJobDefinition$VpcConfigProperty$Builder
                                                      CfnDataQualityJobDefinitionProps$Builder
                                                      CfnDevice$Builder
                                                      CfnDevice$DeviceProperty$Builder
                                                      CfnDeviceFleet$Builder
                                                      CfnDeviceFleet$EdgeOutputConfigProperty$Builder
                                                      CfnDeviceFleetProps$Builder
                                                      CfnDeviceProps$Builder
                                                      CfnDomain$Builder
                                                      CfnDomain$CodeEditorAppSettingsProperty$Builder
                                                      CfnDomain$CodeRepositoryProperty$Builder
                                                      CfnDomain$CustomFileSystemConfigProperty$Builder
                                                      CfnDomain$CustomImageProperty$Builder
                                                      CfnDomain$CustomPosixUserConfigProperty$Builder
                                                      CfnDomain$DefaultEbsStorageSettingsProperty$Builder
                                                      CfnDomain$DefaultSpaceSettingsProperty$Builder
                                                      CfnDomain$DefaultSpaceStorageSettingsProperty$Builder
                                                      CfnDomain$DockerSettingsProperty$Builder
                                                      CfnDomain$DomainSettingsProperty$Builder
                                                      CfnDomain$EFSFileSystemConfigProperty$Builder
                                                      CfnDomain$JupyterLabAppSettingsProperty$Builder
                                                      CfnDomain$JupyterServerAppSettingsProperty$Builder
                                                      CfnDomain$KernelGatewayAppSettingsProperty$Builder
                                                      CfnDomain$RSessionAppSettingsProperty$Builder
                                                      CfnDomain$RStudioServerProAppSettingsProperty$Builder
                                                      CfnDomain$RStudioServerProDomainSettingsProperty$Builder
                                                      CfnDomain$ResourceSpecProperty$Builder
                                                      CfnDomain$SharingSettingsProperty$Builder
                                                      CfnDomain$UserSettingsProperty$Builder
                                                      CfnDomainProps$Builder
                                                      CfnEndpoint$AlarmProperty$Builder
                                                      CfnEndpoint$AutoRollbackConfigProperty$Builder
                                                      CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder
                                                      CfnEndpoint$Builder
                                                      CfnEndpoint$CapacitySizeProperty$Builder
                                                      CfnEndpoint$DeploymentConfigProperty$Builder
                                                      CfnEndpoint$RollingUpdatePolicyProperty$Builder
                                                      CfnEndpoint$TrafficRoutingConfigProperty$Builder
                                                      CfnEndpoint$VariantPropertyProperty$Builder
                                                      CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder
                                                      CfnEndpointConfig$AsyncInferenceConfigProperty$Builder
                                                      CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder
                                                      CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder
                                                      CfnEndpointConfig$Builder
                                                      CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder
                                                      CfnEndpointConfig$CaptureOptionProperty$Builder
                                                      CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder
                                                      CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder
                                                      CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder
                                                      CfnEndpointConfig$ClarifyShapConfigProperty$Builder
                                                      CfnEndpointConfig$ClarifyTextConfigProperty$Builder
                                                      CfnEndpointConfig$DataCaptureConfigProperty$Builder
                                                      CfnEndpointConfig$ExplainerConfigProperty$Builder
                                                      CfnEndpointConfig$ManagedInstanceScalingProperty$Builder
                                                      CfnEndpointConfig$ProductionVariantProperty$Builder
                                                      CfnEndpointConfig$RoutingConfigProperty$Builder
                                                      CfnEndpointConfig$ServerlessConfigProperty$Builder
                                                      CfnEndpointConfig$VpcConfigProperty$Builder
                                                      CfnEndpointConfigProps$Builder
                                                      CfnEndpointProps$Builder
                                                      CfnFeatureGroup$Builder
                                                      CfnFeatureGroup$DataCatalogConfigProperty$Builder
                                                      CfnFeatureGroup$FeatureDefinitionProperty$Builder
                                                      CfnFeatureGroup$OfflineStoreConfigProperty$Builder
                                                      CfnFeatureGroup$OnlineStoreConfigProperty$Builder
                                                      CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder
                                                      CfnFeatureGroup$S3StorageConfigProperty$Builder
                                                      CfnFeatureGroup$ThroughputConfigProperty$Builder
                                                      CfnFeatureGroup$TtlDurationProperty$Builder
                                                      CfnFeatureGroupProps$Builder
                                                      CfnImage$Builder
                                                      CfnImageProps$Builder
                                                      CfnImageVersion$Builder
                                                      CfnImageVersionProps$Builder
                                                      CfnInferenceComponent$Builder
                                                      CfnInferenceComponent$DeployedImageProperty$Builder
                                                      CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder
                                                      CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder
                                                      CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder
                                                      CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder
                                                      CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder
                                                      CfnInferenceComponentProps$Builder
                                                      CfnInferenceExperiment$Builder
                                                      CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder
                                                      CfnInferenceExperiment$DataStorageConfigProperty$Builder
                                                      CfnInferenceExperiment$EndpointMetadataProperty$Builder
                                                      CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder
                                                      CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder
                                                      CfnInferenceExperiment$ModelVariantConfigProperty$Builder
                                                      CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder
                                                      CfnInferenceExperiment$ShadowModeConfigProperty$Builder
                                                      CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder
                                                      CfnInferenceExperimentProps$Builder
                                                      CfnModel$Builder
                                                      CfnModel$ContainerDefinitionProperty$Builder
                                                      CfnModel$ImageConfigProperty$Builder
                                                      CfnModel$InferenceExecutionConfigProperty$Builder
                                                      CfnModel$ModelAccessConfigProperty$Builder
                                                      CfnModel$ModelDataSourceProperty$Builder
                                                      CfnModel$MultiModelConfigProperty$Builder
                                                      CfnModel$RepositoryAuthConfigProperty$Builder
                                                      CfnModel$S3DataSourceProperty$Builder
                                                      CfnModel$VpcConfigProperty$Builder
                                                      CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder
                                                      CfnModelBiasJobDefinition$Builder
                                                      CfnModelBiasJobDefinition$ClusterConfigProperty$Builder
                                                      CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder
                                                      CfnModelBiasJobDefinition$CsvProperty$Builder
                                                      CfnModelBiasJobDefinition$DatasetFormatProperty$Builder
                                                      CfnModelBiasJobDefinition$EndpointInputProperty$Builder
                                                      CfnModelBiasJobDefinition$JsonProperty$Builder
                                                      CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder
                                                      CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder
                                                      CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder
                                                      CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder
                                                      CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder
                                                      CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder
                                                      CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder
                                                      CfnModelBiasJobDefinition$NetworkConfigProperty$Builder
                                                      CfnModelBiasJobDefinition$S3OutputProperty$Builder
                                                      CfnModelBiasJobDefinition$StoppingConditionProperty$Builder
                                                      CfnModelBiasJobDefinition$VpcConfigProperty$Builder
                                                      CfnModelBiasJobDefinitionProps$Builder
                                                      CfnModelCard$AdditionalInformationProperty$Builder
                                                      CfnModelCard$Builder
                                                      CfnModelCard$BusinessDetailsProperty$Builder
                                                      CfnModelCard$ContainerProperty$Builder
                                                      CfnModelCard$ContentProperty$Builder
                                                      CfnModelCard$EvaluationDetailProperty$Builder
                                                      CfnModelCard$FunctionProperty$Builder
                                                      CfnModelCard$InferenceEnvironmentProperty$Builder
                                                      CfnModelCard$InferenceSpecificationProperty$Builder
                                                      CfnModelCard$IntendedUsesProperty$Builder
                                                      CfnModelCard$MetricDataItemsProperty$Builder
                                                      CfnModelCard$MetricGroupProperty$Builder
                                                      CfnModelCard$ModelOverviewProperty$Builder
                                                      CfnModelCard$ModelPackageCreatorProperty$Builder
                                                      CfnModelCard$ModelPackageDetailsProperty$Builder
                                                      CfnModelCard$ObjectiveFunctionProperty$Builder
                                                      CfnModelCard$SecurityConfigProperty$Builder
                                                      CfnModelCard$SourceAlgorithmProperty$Builder
                                                      CfnModelCard$TrainingDetailsProperty$Builder
                                                      CfnModelCard$TrainingEnvironmentProperty$Builder
                                                      CfnModelCard$TrainingHyperParameterProperty$Builder
                                                      CfnModelCard$TrainingJobDetailsProperty$Builder
                                                      CfnModelCard$TrainingMetricProperty$Builder
                                                      CfnModelCard$UserContextProperty$Builder
                                                      CfnModelCardProps$Builder
                                                      CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$Builder
                                                      CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$CsvProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$JsonProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder
                                                      CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder
                                                      CfnModelExplainabilityJobDefinitionProps$Builder
                                                      CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder
                                                      CfnModelPackage$BiasProperty$Builder
                                                      CfnModelPackage$Builder
                                                      CfnModelPackage$DataSourceProperty$Builder
                                                      CfnModelPackage$DriftCheckBaselinesProperty$Builder
                                                      CfnModelPackage$DriftCheckBiasProperty$Builder
                                                      CfnModelPackage$DriftCheckExplainabilityProperty$Builder
                                                      CfnModelPackage$DriftCheckModelDataQualityProperty$Builder
                                                      CfnModelPackage$DriftCheckModelQualityProperty$Builder
                                                      CfnModelPackage$ExplainabilityProperty$Builder
                                                      CfnModelPackage$FileSourceProperty$Builder
                                                      CfnModelPackage$InferenceSpecificationProperty$Builder
                                                      CfnModelPackage$MetadataPropertiesProperty$Builder
                                                      CfnModelPackage$MetricsSourceProperty$Builder
                                                      CfnModelPackage$ModelDataQualityProperty$Builder
                                                      CfnModelPackage$ModelInputProperty$Builder
                                                      CfnModelPackage$ModelMetricsProperty$Builder
                                                      CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder
                                                      CfnModelPackage$ModelPackageStatusDetailsProperty$Builder
                                                      CfnModelPackage$ModelPackageStatusItemProperty$Builder
                                                      CfnModelPackage$ModelQualityProperty$Builder
                                                      CfnModelPackage$S3DataSourceProperty$Builder
                                                      CfnModelPackage$SourceAlgorithmProperty$Builder
                                                      CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder
                                                      CfnModelPackage$TransformInputProperty$Builder
                                                      CfnModelPackage$TransformJobDefinitionProperty$Builder
                                                      CfnModelPackage$TransformOutputProperty$Builder
                                                      CfnModelPackage$TransformResourcesProperty$Builder
                                                      CfnModelPackage$ValidationProfileProperty$Builder
                                                      CfnModelPackage$ValidationSpecificationProperty$Builder
                                                      CfnModelPackageGroup$Builder
                                                      CfnModelPackageGroupProps$Builder
                                                      CfnModelPackageProps$Builder
                                                      CfnModelProps$Builder
                                                      CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder
                                                      CfnModelQualityJobDefinition$Builder
                                                      CfnModelQualityJobDefinition$ClusterConfigProperty$Builder
                                                      CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder
                                                      CfnModelQualityJobDefinition$CsvProperty$Builder
                                                      CfnModelQualityJobDefinition$DatasetFormatProperty$Builder
                                                      CfnModelQualityJobDefinition$EndpointInputProperty$Builder
                                                      CfnModelQualityJobDefinition$JsonProperty$Builder
                                                      CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder
                                                      CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder
                                                      CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder
                                                      CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder
                                                      CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder
                                                      CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder
                                                      CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder
                                                      CfnModelQualityJobDefinition$NetworkConfigProperty$Builder
                                                      CfnModelQualityJobDefinition$S3OutputProperty$Builder
                                                      CfnModelQualityJobDefinition$StoppingConditionProperty$Builder
                                                      CfnModelQualityJobDefinition$VpcConfigProperty$Builder
                                                      CfnModelQualityJobDefinitionProps$Builder
                                                      CfnMonitoringSchedule$BaselineConfigProperty$Builder
                                                      CfnMonitoringSchedule$BatchTransformInputProperty$Builder
                                                      CfnMonitoringSchedule$Builder
                                                      CfnMonitoringSchedule$ClusterConfigProperty$Builder
                                                      CfnMonitoringSchedule$ConstraintsResourceProperty$Builder
                                                      CfnMonitoringSchedule$CsvProperty$Builder
                                                      CfnMonitoringSchedule$DatasetFormatProperty$Builder
                                                      CfnMonitoringSchedule$EndpointInputProperty$Builder
                                                      CfnMonitoringSchedule$JsonProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringInputProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringOutputProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringResourcesProperty$Builder
                                                      CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder
                                                      CfnMonitoringSchedule$NetworkConfigProperty$Builder
                                                      CfnMonitoringSchedule$S3OutputProperty$Builder
                                                      CfnMonitoringSchedule$ScheduleConfigProperty$Builder
                                                      CfnMonitoringSchedule$StatisticsResourceProperty$Builder
                                                      CfnMonitoringSchedule$StoppingConditionProperty$Builder
                                                      CfnMonitoringSchedule$VpcConfigProperty$Builder
                                                      CfnMonitoringScheduleProps$Builder
                                                      CfnNotebookInstance$Builder
                                                      CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder
                                                      CfnNotebookInstanceLifecycleConfig$Builder
                                                      CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder
                                                      CfnNotebookInstanceLifecycleConfigProps$Builder
                                                      CfnNotebookInstanceProps$Builder
                                                      CfnPipeline$Builder
                                                      CfnPipeline$ParallelismConfigurationProperty$Builder
                                                      CfnPipeline$PipelineDefinitionProperty$Builder
                                                      CfnPipeline$S3LocationProperty$Builder
                                                      CfnPipelineProps$Builder
                                                      CfnProject$Builder
                                                      CfnProject$ProvisioningParameterProperty$Builder
                                                      CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder
                                                      CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder
                                                      CfnProjectProps$Builder
                                                      CfnSpace$Builder
                                                      CfnSpace$CodeRepositoryProperty$Builder
                                                      CfnSpace$CustomFileSystemProperty$Builder
                                                      CfnSpace$CustomImageProperty$Builder
                                                      CfnSpace$EFSFileSystemProperty$Builder
                                                      CfnSpace$EbsStorageSettingsProperty$Builder
                                                      CfnSpace$JupyterServerAppSettingsProperty$Builder
                                                      CfnSpace$KernelGatewayAppSettingsProperty$Builder
                                                      CfnSpace$OwnershipSettingsProperty$Builder
                                                      CfnSpace$ResourceSpecProperty$Builder
                                                      CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder
                                                      CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder
                                                      CfnSpace$SpaceSettingsProperty$Builder
                                                      CfnSpace$SpaceSharingSettingsProperty$Builder
                                                      CfnSpace$SpaceStorageSettingsProperty$Builder
                                                      CfnSpaceProps$Builder
                                                      CfnUserProfile$Builder
                                                      CfnUserProfile$CodeEditorAppSettingsProperty$Builder
                                                      CfnUserProfile$CodeRepositoryProperty$Builder
                                                      CfnUserProfile$CustomFileSystemConfigProperty$Builder
                                                      CfnUserProfile$CustomImageProperty$Builder
                                                      CfnUserProfile$CustomPosixUserConfigProperty$Builder
                                                      CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder
                                                      CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder
                                                      CfnUserProfile$EFSFileSystemConfigProperty$Builder
                                                      CfnUserProfile$JupyterLabAppSettingsProperty$Builder
                                                      CfnUserProfile$JupyterServerAppSettingsProperty$Builder
                                                      CfnUserProfile$KernelGatewayAppSettingsProperty$Builder
                                                      CfnUserProfile$RStudioServerProAppSettingsProperty$Builder
                                                      CfnUserProfile$ResourceSpecProperty$Builder
                                                      CfnUserProfile$SharingSettingsProperty$Builder
                                                      CfnUserProfile$UserSettingsProperty$Builder
                                                      CfnUserProfileProps$Builder
                                                      CfnWorkteam$Builder
                                                      CfnWorkteam$CognitoMemberDefinitionProperty$Builder
                                                      CfnWorkteam$MemberDefinitionProperty$Builder
                                                      CfnWorkteam$NotificationConfigurationProperty$Builder
                                                      CfnWorkteam$OidcMemberDefinitionProperty$Builder
                                                      CfnWorkteamProps$Builder]))


(defn build-cfn-app-builder
  "The build-cfn-app-builder function updates a CfnApp$Builder instance using the provided configuration.
  The function takes the CfnApp$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-name` |
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `resourceSpec` | software.amazon.awscdk.services.sagemaker.CfnApp$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:resource-spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
"
  [^CfnApp$Builder builder id config]
  (when-let [data (lookup-entry config id :app-name)]
    (. builder appName data))
  (when-let [data (lookup-entry config id :app-type)]
    (. builder appType data))
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :resource-spec)]
    (. builder resourceSpec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (.build builder))


(defn cfn-app-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-app-builder (CfnApp$Builder/create scope (name id)) id config))


(defn build-cfn-app-image-config-builder
  "The build-cfn-app-image-config-builder function updates a CfnAppImageConfig$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `codeEditorAppImageConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$CodeEditorAppImageConfigProperty | [[cdk.support/lookup-entry]] | `:code-editor-app-image-config` |
| `jupyterLabAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-image-config` |
| `kernelGatewayImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-image-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppImageConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :app-image-config-name)]
    (. builder appImageConfigName data))
  (when-let [data (lookup-entry config id :code-editor-app-image-config)]
    (. builder codeEditorAppImageConfig data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-image-config)]
    (. builder jupyterLabAppImageConfig data))
  (when-let [data (lookup-entry config id :kernel-gateway-image-config)]
    (. builder kernelGatewayImageConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-image-config-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-app-image-config-builder (CfnAppImageConfig$Builder/create scope (name id)) id config))


(defn build-cfn-app-image-config-code-editor-app-image-config-property-builder
  "The build-cfn-app-image-config-code-editor-app-image-config-property-builder function updates a CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-config` |
"
  [^CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-config)]
    (. builder containerConfig data))
  (.build builder))


(defn cfn-app-image-config-code-editor-app-image-config-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-code-editor-app-image-config-property-builder (new CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder) id config))


(defn build-cfn-app-image-config-container-config-property-builder
  "The build-cfn-app-image-config-container-config-property-builder function updates a CfnAppImageConfig$ContainerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$ContainerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `containerEnvironmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-environment-variables` |
"
  [^CfnAppImageConfig$ContainerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-arguments)]
    (. builder containerArguments data))
  (when-let [data (lookup-entry config id :container-entrypoint)]
    (. builder containerEntrypoint data))
  (when-let [data (lookup-entry config id :container-environment-variables)]
    (. builder containerEnvironmentVariables data))
  (.build builder))


(defn cfn-app-image-config-container-config-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-container-config-property-builder (new CfnAppImageConfig$ContainerConfigProperty$Builder) id config))


(defn build-cfn-app-image-config-custom-image-container-environment-variable-property-builder
  "The build-cfn-app-image-config-custom-image-container-environment-variable-property-builder function updates a CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-app-image-config-custom-image-container-environment-variable-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-custom-image-container-environment-variable-property-builder (new CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder) id config))


(defn build-cfn-app-image-config-file-system-config-property-builder
  "The build-cfn-app-image-config-file-system-config-property-builder function updates a CfnAppImageConfig$FileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$FileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultGid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-gid` |
| `defaultUid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-uid` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |
"
  [^CfnAppImageConfig$FileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-gid)]
    (. builder defaultGid data))
  (when-let [data (lookup-entry config id :default-uid)]
    (. builder defaultUid data))
  (when-let [data (lookup-entry config id :mount-path)]
    (. builder mountPath data))
  (.build builder))


(defn cfn-app-image-config-file-system-config-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-file-system-config-property-builder (new CfnAppImageConfig$FileSystemConfigProperty$Builder) id config))


(defn build-cfn-app-image-config-jupyter-lab-app-image-config-property-builder
  "The build-cfn-app-image-config-jupyter-lab-app-image-config-property-builder function updates a CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-config` |
"
  [^CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-config)]
    (. builder containerConfig data))
  (.build builder))


(defn cfn-app-image-config-jupyter-lab-app-image-config-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-jupyter-lab-app-image-config-property-builder (new CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder) id config))


(defn build-cfn-app-image-config-kernel-gateway-image-config-property-builder
  "The build-cfn-app-image-config-kernel-gateway-image-config-property-builder function updates a CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$FileSystemConfigProperty | [[cdk.support/lookup-entry]] | `:file-system-config` |
| `kernelSpecs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-specs` |
"
  [^CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-config)]
    (. builder fileSystemConfig data))
  (when-let [data (lookup-entry config id :kernel-specs)]
    (. builder kernelSpecs data))
  (.build builder))


(defn cfn-app-image-config-kernel-gateway-image-config-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-kernel-gateway-image-config-property-builder (new CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder) id config))


(defn build-cfn-app-image-config-kernel-spec-property-builder
  "The build-cfn-app-image-config-kernel-spec-property-builder function updates a CfnAppImageConfig$KernelSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfig$KernelSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAppImageConfig$KernelSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-app-image-config-kernel-spec-property-builder
  ""
  [id config]
  (build-cfn-app-image-config-kernel-spec-property-builder (new CfnAppImageConfig$KernelSpecProperty$Builder) id config))


(defn build-cfn-app-image-config-props-builder
  "The build-cfn-app-image-config-props-builder function updates a CfnAppImageConfigProps$Builder instance using the provided configuration.
  The function takes the CfnAppImageConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `codeEditorAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-image-config` |
| `jupyterLabAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-image-config` |
| `kernelGatewayImageConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$KernelGatewayImageConfigProperty | [[cdk.support/lookup-entry]] | `:kernel-gateway-image-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppImageConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-image-config-name)]
    (. builder appImageConfigName data))
  (when-let [data (lookup-entry config id :code-editor-app-image-config)]
    (. builder codeEditorAppImageConfig data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-image-config)]
    (. builder jupyterLabAppImageConfig data))
  (when-let [data (lookup-entry config id :kernel-gateway-image-config)]
    (. builder kernelGatewayImageConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-image-config-props-builder
  ""
  [id config]
  (build-cfn-app-image-config-props-builder (new CfnAppImageConfigProps$Builder) id config))


(defn build-cfn-app-props-builder
  "The build-cfn-app-props-builder function updates a CfnAppProps$Builder instance using the provided configuration.
  The function takes the CfnAppProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-name` |
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `resourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
"
  [^CfnAppProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-name)]
    (. builder appName data))
  (when-let [data (lookup-entry config id :app-type)]
    (. builder appType data))
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :resource-spec)]
    (. builder resourceSpec data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (.build builder))


(defn cfn-app-props-builder
  ""
  [id config]
  (build-cfn-app-props-builder (new CfnAppProps$Builder) id config))


(defn build-cfn-app-resource-spec-property-builder
  "The build-cfn-app-resource-spec-property-builder function updates a CfnApp$ResourceSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$ResourceSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |
"
  [^CfnApp$ResourceSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :sage-maker-image-arn)]
    (. builder sageMakerImageArn data))
  (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
    (. builder sageMakerImageVersionArn data))
  (.build builder))


(defn cfn-app-resource-spec-property-builder
  ""
  [id config]
  (build-cfn-app-resource-spec-property-builder (new CfnApp$ResourceSpecProperty$Builder) id config))


(defn build-cfn-code-repository-builder
  "The build-cfn-code-repository-builder function updates a CfnCodeRepository$Builder instance using the provided configuration.
  The function takes the CfnCodeRepository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-repository-name` |
| `gitConfig` | software.amazon.awscdk.services.sagemaker.CfnCodeRepository$GitConfigProperty | [[cdk.support/lookup-entry]] | `:git-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCodeRepository$Builder builder id config]
  (when-let [data (lookup-entry config id :code-repository-name)]
    (. builder codeRepositoryName data))
  (when-let [data (lookup-entry config id :git-config)]
    (. builder gitConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-code-repository-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-code-repository-builder (CfnCodeRepository$Builder/create scope (name id)) id config))


(defn build-cfn-code-repository-git-config-property-builder
  "The build-cfn-code-repository-git-config-property-builder function updates a CfnCodeRepository$GitConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCodeRepository$GitConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnCodeRepository$GitConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-let [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (when-let [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-code-repository-git-config-property-builder
  ""
  [id config]
  (build-cfn-code-repository-git-config-property-builder (new CfnCodeRepository$GitConfigProperty$Builder) id config))


(defn build-cfn-code-repository-props-builder
  "The build-cfn-code-repository-props-builder function updates a CfnCodeRepositoryProps$Builder instance using the provided configuration.
  The function takes the CfnCodeRepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-repository-name` |
| `gitConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:git-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCodeRepositoryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :code-repository-name)]
    (. builder codeRepositoryName data))
  (when-let [data (lookup-entry config id :git-config)]
    (. builder gitConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-code-repository-props-builder
  ""
  [id config]
  (build-cfn-code-repository-props-builder (new CfnCodeRepositoryProps$Builder) id config))


(defn build-cfn-data-quality-job-definition-batch-transform-input-property-builder
  "The build-cfn-data-quality-job-definition-batch-transform-input-property-builder function updates a CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-captured-destination-s3-uri)]
    (. builder dataCapturedDestinationS3Uri data))
  (when-let [data (lookup-entry config id :dataset-format)]
    (. builder datasetFormat data))
  (when-let [data (lookup-entry config id :exclude-features-attribute)]
    (. builder excludeFeaturesAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-data-quality-job-definition-batch-transform-input-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-batch-transform-input-property-builder (new CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-builder
  "The build-cfn-data-quality-job-definition-builder function updates a CfnDataQualityJobDefinition$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataQualityAppSpecification` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty | [[cdk.support/lookup-entry]] | `:data-quality-app-specification` |
| `dataQualityBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-quality-baseline-config` |
| `dataQualityJobInput` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DataQualityJobInputProperty | [[cdk.support/lookup-entry]] | `:data-quality-job-input` |
| `dataQualityJobOutputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-quality-job-output-config` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$MonitoringResourcesProperty | [[cdk.support/lookup-entry]] | `:job-resources` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataQualityJobDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :data-quality-app-specification)]
    (. builder dataQualityAppSpecification data))
  (when-let [data (lookup-entry config id :data-quality-baseline-config)]
    (. builder dataQualityBaselineConfig data))
  (when-let [data (lookup-entry config id :data-quality-job-input)]
    (. builder dataQualityJobInput data))
  (when-let [data (lookup-entry config id :data-quality-job-output-config)]
    (. builder dataQualityJobOutputConfig data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-quality-job-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-data-quality-job-definition-builder (CfnDataQualityJobDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-data-quality-job-definition-cluster-config-property-builder
  "The build-cfn-data-quality-job-definition-cluster-config-property-builder function updates a CfnDataQualityJobDefinition$ClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$ClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnDataQualityJobDefinition$ClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-data-quality-job-definition-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-cluster-config-property-builder (new CfnDataQualityJobDefinition$ClusterConfigProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-constraints-resource-property-builder
  "The build-cfn-data-quality-job-definition-constraints-resource-property-builder function updates a CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-data-quality-job-definition-constraints-resource-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-constraints-resource-property-builder (new CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-csv-property-builder
  "The build-cfn-data-quality-job-definition-csv-property-builder function updates a CfnDataQualityJobDefinition$CsvProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$CsvProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnDataQualityJobDefinition$CsvProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-data-quality-job-definition-csv-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-csv-property-builder (new CfnDataQualityJobDefinition$CsvProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-data-quality-app-specification-property-builder
  "The build-cfn-data-quality-job-definition-data-quality-app-specification-property-builder function updates a CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |
"
  [^CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-arguments)]
    (. builder containerArguments data))
  (when-let [data (lookup-entry config id :container-entrypoint)]
    (. builder containerEntrypoint data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :post-analytics-processor-source-uri)]
    (. builder postAnalyticsProcessorSourceUri data))
  (when-let [data (lookup-entry config id :record-preprocessor-source-uri)]
    (. builder recordPreprocessorSourceUri data))
  (.build builder))


(defn cfn-data-quality-job-definition-data-quality-app-specification-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-data-quality-app-specification-property-builder (new CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-data-quality-baseline-config-property-builder
  "The build-cfn-data-quality-job-definition-data-quality-baseline-config-property-builder function updates a CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$ConstraintsResourceProperty | [[cdk.support/lookup-entry]] | `:constraints-resource` |
| `statisticsResource` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$StatisticsResourceProperty | [[cdk.support/lookup-entry]] | `:statistics-resource` |
"
  [^CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :baselining-job-name)]
    (. builder baseliningJobName data))
  (when-let [data (lookup-entry config id :constraints-resource)]
    (. builder constraintsResource data))
  (when-let [data (lookup-entry config id :statistics-resource)]
    (. builder statisticsResource data))
  (.build builder))


(defn cfn-data-quality-job-definition-data-quality-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-data-quality-baseline-config-property-builder (new CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-data-quality-job-input-property-builder
  "The build-cfn-data-quality-job-definition-data-quality-job-input-property-builder function updates a CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
"
  [^CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-transform-input)]
    (. builder batchTransformInput data))
  (when-let [data (lookup-entry config id :endpoint-input)]
    (. builder endpointInput data))
  (.build builder))


(defn cfn-data-quality-job-definition-data-quality-job-input-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-data-quality-job-input-property-builder (new CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-dataset-format-property-builder
  "The build-cfn-data-quality-job-definition-dataset-format-property-builder function updates a CfnDataQualityJobDefinition$DatasetFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$DatasetFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:parquet` |
"
  [^CfnDataQualityJobDefinition$DatasetFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :parquet)]
    (. builder parquet data))
  (.build builder))


(defn cfn-data-quality-job-definition-dataset-format-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-dataset-format-property-builder (new CfnDataQualityJobDefinition$DatasetFormatProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-endpoint-input-property-builder
  "The build-cfn-data-quality-job-definition-endpoint-input-property-builder function updates a CfnDataQualityJobDefinition$EndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$EndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnDataQualityJobDefinition$EndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :exclude-features-attribute)]
    (. builder excludeFeaturesAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-data-quality-job-definition-endpoint-input-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-endpoint-input-property-builder (new CfnDataQualityJobDefinition$EndpointInputProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-json-property-builder
  "The build-cfn-data-quality-job-definition-json-property-builder function updates a CfnDataQualityJobDefinition$JsonProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$JsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |
"
  [^CfnDataQualityJobDefinition$JsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :line)]
    (. builder line data))
  (.build builder))


(defn cfn-data-quality-job-definition-json-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-json-property-builder (new CfnDataQualityJobDefinition$JsonProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-monitoring-output-config-property-builder
  "The build-cfn-data-quality-job-definition-monitoring-output-config-property-builder function updates a CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |
"
  [^CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :monitoring-outputs)]
    (. builder monitoringOutputs data))
  (.build builder))


(defn cfn-data-quality-job-definition-monitoring-output-config-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-monitoring-output-config-property-builder (new CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-monitoring-output-property-builder
  "The build-cfn-data-quality-job-definition-monitoring-output-property-builder function updates a CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |
"
  [^CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-output)]
    (. builder s3Output data))
  (.build builder))


(defn cfn-data-quality-job-definition-monitoring-output-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-monitoring-output-property-builder (new CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-monitoring-resources-property-builder
  "The build-cfn-data-quality-job-definition-monitoring-resources-property-builder function updates a CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$ClusterConfigProperty | [[cdk.support/lookup-entry]] | `:cluster-config` |
"
  [^CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-config)]
    (. builder clusterConfig data))
  (.build builder))


(defn cfn-data-quality-job-definition-monitoring-resources-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-monitoring-resources-property-builder (new CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-network-config-property-builder
  "The build-cfn-data-quality-job-definition-network-config-property-builder function updates a CfnDataQualityJobDefinition$NetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$NetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnDataQualityJobDefinition$NetworkConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
    (. builder enableInterContainerTrafficEncryption data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-data-quality-job-definition-network-config-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-network-config-property-builder (new CfnDataQualityJobDefinition$NetworkConfigProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-props-builder
  "The build-cfn-data-quality-job-definition-props-builder function updates a CfnDataQualityJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataQualityAppSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-quality-app-specification` |
| `dataQualityBaselineConfig` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty | [[cdk.support/lookup-entry]] | `:data-quality-baseline-config` |
| `dataQualityJobInput` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DataQualityJobInputProperty | [[cdk.support/lookup-entry]] | `:data-quality-job-input` |
| `dataQualityJobOutputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-quality-job-output-config` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$MonitoringResourcesProperty | [[cdk.support/lookup-entry]] | `:job-resources` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataQualityJobDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-quality-app-specification)]
    (. builder dataQualityAppSpecification data))
  (when-let [data (lookup-entry config id :data-quality-baseline-config)]
    (. builder dataQualityBaselineConfig data))
  (when-let [data (lookup-entry config id :data-quality-job-input)]
    (. builder dataQualityJobInput data))
  (when-let [data (lookup-entry config id :data-quality-job-output-config)]
    (. builder dataQualityJobOutputConfig data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-quality-job-definition-props-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-props-builder (new CfnDataQualityJobDefinitionProps$Builder) id config))


(defn build-cfn-data-quality-job-definition-s3-output-property-builder
  "The build-cfn-data-quality-job-definition-s3-output-property-builder function updates a CfnDataQualityJobDefinition$S3OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$S3OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnDataQualityJobDefinition$S3OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-upload-mode)]
    (. builder s3UploadMode data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-data-quality-job-definition-s3-output-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-s3-output-property-builder (new CfnDataQualityJobDefinition$S3OutputProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-statistics-resource-property-builder
  "The build-cfn-data-quality-job-definition-statistics-resource-property-builder function updates a CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-data-quality-job-definition-statistics-resource-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-statistics-resource-property-builder (new CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-stopping-condition-property-builder
  "The build-cfn-data-quality-job-definition-stopping-condition-property-builder function updates a CfnDataQualityJobDefinition$StoppingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$StoppingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |
"
  [^CfnDataQualityJobDefinition$StoppingConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
    (. builder maxRuntimeInSeconds data))
  (.build builder))


(defn cfn-data-quality-job-definition-stopping-condition-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-stopping-condition-property-builder (new CfnDataQualityJobDefinition$StoppingConditionProperty$Builder) id config))


(defn build-cfn-data-quality-job-definition-vpc-config-property-builder
  "The build-cfn-data-quality-job-definition-vpc-config-property-builder function updates a CfnDataQualityJobDefinition$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataQualityJobDefinition$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnDataQualityJobDefinition$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-data-quality-job-definition-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-data-quality-job-definition-vpc-config-property-builder (new CfnDataQualityJobDefinition$VpcConfigProperty$Builder) id config))


(defn build-cfn-device-builder
  "The build-cfn-device-builder function updates a CfnDevice$Builder instance using the provided configuration.
  The function takes the CfnDevice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | software.amazon.awscdk.services.sagemaker.CfnDevice$DeviceProperty | [[cdk.support/lookup-entry]] | `:device` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDevice$Builder builder id config]
  (when-let [data (lookup-entry config id :device)]
    (. builder device data))
  (when-let [data (lookup-entry config id :device-fleet-name)]
    (. builder deviceFleetName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-device-builder (CfnDevice$Builder/create scope (name id)) id config))


(defn build-cfn-device-device-property-builder
  "The build-cfn-device-device-property-builder function updates a CfnDevice$DeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnDevice$DeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `iotThingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:iot-thing-name` |
"
  [^CfnDevice$DeviceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-let [data (lookup-entry config id :iot-thing-name)]
    (. builder iotThingName data))
  (.build builder))


(defn cfn-device-device-property-builder
  ""
  [id config]
  (build-cfn-device-device-property-builder (new CfnDevice$DeviceProperty$Builder) id config))


(defn build-cfn-device-fleet-builder
  "The build-cfn-device-fleet-builder function updates a CfnDeviceFleet$Builder instance using the provided configuration.
  The function takes the CfnDeviceFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnDeviceFleet$EdgeOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceFleet$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :device-fleet-name)]
    (. builder deviceFleetName data))
  (when-let [data (lookup-entry config id :output-config)]
    (. builder outputConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-fleet-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-device-fleet-builder (CfnDeviceFleet$Builder/create scope (name id)) id config))


(defn build-cfn-device-fleet-edge-output-config-property-builder
  "The build-cfn-device-fleet-edge-output-config-property-builder function updates a CfnDeviceFleet$EdgeOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeviceFleet$EdgeOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-location` |
"
  [^CfnDeviceFleet$EdgeOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :s3-output-location)]
    (. builder s3OutputLocation data))
  (.build builder))


(defn cfn-device-fleet-edge-output-config-property-builder
  ""
  [id config]
  (build-cfn-device-fleet-edge-output-config-property-builder (new CfnDeviceFleet$EdgeOutputConfigProperty$Builder) id config))


(defn build-cfn-device-fleet-props-builder
  "The build-cfn-device-fleet-props-builder function updates a CfnDeviceFleetProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnDeviceFleet$EdgeOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceFleetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :device-fleet-name)]
    (. builder deviceFleetName data))
  (when-let [data (lookup-entry config id :output-config)]
    (. builder outputConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-fleet-props-builder
  ""
  [id config]
  (build-cfn-device-fleet-props-builder (new CfnDeviceFleetProps$Builder) id config))


(defn build-cfn-device-props-builder
  "The build-cfn-device-props-builder function updates a CfnDeviceProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | software.amazon.awscdk.services.sagemaker.CfnDevice$DeviceProperty | [[cdk.support/lookup-entry]] | `:device` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :device)]
    (. builder device data))
  (when-let [data (lookup-entry config id :device-fleet-name)]
    (. builder deviceFleetName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-props-builder
  ""
  [id config]
  (build-cfn-device-props-builder (new CfnDeviceProps$Builder) id config))


(defn build-cfn-domain-builder
  "The build-cfn-domain-builder function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appNetworkAccessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-network-access-type` |
| `appSecurityGroupManagement` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-security-group-management` |
| `authMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-mode` |
| `defaultSpaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-space-settings` |
| `defaultUserSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$UserSettingsProperty | [[cdk.support/lookup-entry]] | `:default-user-settings` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DomainSettingsProperty | [[cdk.support/lookup-entry]] | `:domain-settings` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnDomain$Builder builder id config]
  (when-let [data (lookup-entry config id :app-network-access-type)]
    (. builder appNetworkAccessType data))
  (when-let [data (lookup-entry config id :app-security-group-management)]
    (. builder appSecurityGroupManagement data))
  (when-let [data (lookup-entry config id :auth-mode)]
    (. builder authMode data))
  (when-let [data (lookup-entry config id :default-space-settings)]
    (. builder defaultSpaceSettings data))
  (when-let [data (lookup-entry config id :default-user-settings)]
    (. builder defaultUserSettings data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :domain-settings)]
    (. builder domainSettings data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-domain-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-builder (CfnDomain$Builder/create scope (name id)) id config))


(defn build-cfn-domain-code-editor-app-settings-property-builder
  "The build-cfn-domain-code-editor-app-settings-property-builder function updates a CfnDomain$CodeEditorAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CodeEditorAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |
"
  [^CfnDomain$CodeEditorAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (when-let [data (lookup-entry config id :lifecycle-config-arns)]
    (. builder lifecycleConfigArns data))
  (.build builder))


(defn cfn-domain-code-editor-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-code-editor-app-settings-property-builder (new CfnDomain$CodeEditorAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-code-repository-property-builder
  "The build-cfn-domain-code-repository-property-builder function updates a CfnDomain$CodeRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CodeRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
"
  [^CfnDomain$CodeRepositoryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (.build builder))


(defn cfn-domain-code-repository-property-builder
  ""
  [id config]
  (build-cfn-domain-code-repository-property-builder (new CfnDomain$CodeRepositoryProperty$Builder) id config))


(defn build-cfn-domain-custom-file-system-config-property-builder
  "The build-cfn-domain-custom-file-system-config-property-builder function updates a CfnDomain$CustomFileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CustomFileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystemConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system-config` |
"
  [^CfnDomain$CustomFileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :efs-file-system-config)]
    (. builder efsFileSystemConfig data))
  (.build builder))


(defn cfn-domain-custom-file-system-config-property-builder
  ""
  [id config]
  (build-cfn-domain-custom-file-system-config-property-builder (new CfnDomain$CustomFileSystemConfigProperty$Builder) id config))


(defn build-cfn-domain-custom-image-property-builder
  "The build-cfn-domain-custom-image-property-builder function updates a CfnDomain$CustomImageProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CustomImageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |
"
  [^CfnDomain$CustomImageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-image-config-name)]
    (. builder appImageConfigName data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :image-version-number)]
    (. builder imageVersionNumber data))
  (.build builder))


(defn cfn-domain-custom-image-property-builder
  ""
  [id config]
  (build-cfn-domain-custom-image-property-builder (new CfnDomain$CustomImageProperty$Builder) id config))


(defn build-cfn-domain-custom-posix-user-config-property-builder
  "The build-cfn-domain-custom-posix-user-config-property-builder function updates a CfnDomain$CustomPosixUserConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CustomPosixUserConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnDomain$CustomPosixUserConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-let [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-domain-custom-posix-user-config-property-builder
  ""
  [id config]
  (build-cfn-domain-custom-posix-user-config-property-builder (new CfnDomain$CustomPosixUserConfigProperty$Builder) id config))


(defn build-cfn-domain-default-ebs-storage-settings-property-builder
  "The build-cfn-domain-default-ebs-storage-settings-property-builder function updates a CfnDomain$DefaultEbsStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DefaultEbsStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ebs-volume-size-in-gb` |
| `maximumEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ebs-volume-size-in-gb` |
"
  [^CfnDomain$DefaultEbsStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-ebs-volume-size-in-gb)]
    (. builder defaultEbsVolumeSizeInGb data))
  (when-let [data (lookup-entry config id :maximum-ebs-volume-size-in-gb)]
    (. builder maximumEbsVolumeSizeInGb data))
  (.build builder))


(defn cfn-domain-default-ebs-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-default-ebs-storage-settings-property-builder (new CfnDomain$DefaultEbsStorageSettingsProperty$Builder) id config))


(defn build-cfn-domain-default-space-settings-property-builder
  "The build-cfn-domain-default-space-settings-property-builder function updates a CfnDomain$DefaultSpaceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DefaultSpaceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customFileSystemConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-file-system-configs` |
| `customPosixUserConfig` | software.amazon.awscdk.services.sagemaker.CfnDomain$CustomPosixUserConfigProperty | [[cdk.support/lookup-entry]] | `:custom-posix-user-config` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `jupyterLabAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$JupyterLabAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$JupyterServerAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `spaceStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-storage-settings` |
"
  [^CfnDomain$DefaultSpaceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-file-system-configs)]
    (. builder customFileSystemConfigs data))
  (when-let [data (lookup-entry config id :custom-posix-user-config)]
    (. builder customPosixUserConfig data))
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-settings)]
    (. builder jupyterLabAppSettings data))
  (when-let [data (lookup-entry config id :jupyter-server-app-settings)]
    (. builder jupyterServerAppSettings data))
  (when-let [data (lookup-entry config id :kernel-gateway-app-settings)]
    (. builder kernelGatewayAppSettings data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :space-storage-settings)]
    (. builder spaceStorageSettings data))
  (.build builder))


(defn cfn-domain-default-space-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-default-space-settings-property-builder (new CfnDomain$DefaultSpaceSettingsProperty$Builder) id config))


(defn build-cfn-domain-default-space-storage-settings-property-builder
  "The build-cfn-domain-default-space-storage-settings-property-builder function updates a CfnDomain$DefaultSpaceStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DefaultSpaceStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsStorageSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DefaultEbsStorageSettingsProperty | [[cdk.support/lookup-entry]] | `:default-ebs-storage-settings` |
"
  [^CfnDomain$DefaultSpaceStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-ebs-storage-settings)]
    (. builder defaultEbsStorageSettings data))
  (.build builder))


(defn cfn-domain-default-space-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-default-space-storage-settings-property-builder (new CfnDomain$DefaultSpaceStorageSettingsProperty$Builder) id config))


(defn build-cfn-domain-docker-settings-property-builder
  "The build-cfn-domain-docker-settings-property-builder function updates a CfnDomain$DockerSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DockerSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDockerAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-docker-access` |
| `vpcOnlyTrustedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-only-trusted-accounts` |
"
  [^CfnDomain$DockerSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-docker-access)]
    (. builder enableDockerAccess data))
  (when-let [data (lookup-entry config id :vpc-only-trusted-accounts)]
    (. builder vpcOnlyTrustedAccounts data))
  (.build builder))


(defn cfn-domain-docker-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-docker-settings-property-builder (new CfnDomain$DockerSettingsProperty$Builder) id config))


(defn build-cfn-domain-domain-settings-property-builder
  "The build-cfn-domain-domain-settings-property-builder function updates a CfnDomain$DomainSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DomainSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dockerSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DockerSettingsProperty | [[cdk.support/lookup-entry]] | `:docker-settings` |
| `rStudioServerProDomainSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:r-studio-server-pro-domain-settings` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
"
  [^CfnDomain$DomainSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :docker-settings)]
    (. builder dockerSettings data))
  (when-let [data (lookup-entry config id :r-studio-server-pro-domain-settings)]
    (. builder rStudioServerProDomainSettings data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (.build builder))


(defn cfn-domain-domain-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-domain-settings-property-builder (new CfnDomain$DomainSettingsProperty$Builder) id config))


(defn build-cfn-domain-efs-file-system-config-property-builder
  "The build-cfn-domain-efs-file-system-config-property-builder function updates a CfnDomain$EFSFileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$EFSFileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
"
  [^CfnDomain$EFSFileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :file-system-path)]
    (. builder fileSystemPath data))
  (.build builder))


(defn cfn-domain-efs-file-system-config-property-builder
  ""
  [id config]
  (build-cfn-domain-efs-file-system-config-property-builder (new CfnDomain$EFSFileSystemConfigProperty$Builder) id config))


(defn build-cfn-domain-jupyter-lab-app-settings-property-builder
  "The build-cfn-domain-jupyter-lab-app-settings-property-builder function updates a CfnDomain$JupyterLabAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$JupyterLabAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |
"
  [^CfnDomain$JupyterLabAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-repositories)]
    (. builder codeRepositories data))
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (when-let [data (lookup-entry config id :lifecycle-config-arns)]
    (. builder lifecycleConfigArns data))
  (.build builder))


(defn cfn-domain-jupyter-lab-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-jupyter-lab-app-settings-property-builder (new CfnDomain$JupyterLabAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-jupyter-server-app-settings-property-builder
  "The build-cfn-domain-jupyter-server-app-settings-property-builder function updates a CfnDomain$JupyterServerAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$JupyterServerAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnDomain$JupyterServerAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-domain-jupyter-server-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-jupyter-server-app-settings-property-builder (new CfnDomain$JupyterServerAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-kernel-gateway-app-settings-property-builder
  "The build-cfn-domain-kernel-gateway-app-settings-property-builder function updates a CfnDomain$KernelGatewayAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$KernelGatewayAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnDomain$KernelGatewayAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-domain-kernel-gateway-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-kernel-gateway-app-settings-property-builder (new CfnDomain$KernelGatewayAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-props-builder
  "The build-cfn-domain-props-builder function updates a CfnDomainProps$Builder instance using the provided configuration.
  The function takes the CfnDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appNetworkAccessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-network-access-type` |
| `appSecurityGroupManagement` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-security-group-management` |
| `authMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-mode` |
| `defaultSpaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-space-settings` |
| `defaultUserSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-user-settings` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DomainSettingsProperty | [[cdk.support/lookup-entry]] | `:domain-settings` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnDomainProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-network-access-type)]
    (. builder appNetworkAccessType data))
  (when-let [data (lookup-entry config id :app-security-group-management)]
    (. builder appSecurityGroupManagement data))
  (when-let [data (lookup-entry config id :auth-mode)]
    (. builder authMode data))
  (when-let [data (lookup-entry config id :default-space-settings)]
    (. builder defaultSpaceSettings data))
  (when-let [data (lookup-entry config id :default-user-settings)]
    (. builder defaultUserSettings data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :domain-settings)]
    (. builder domainSettings data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-domain-props-builder
  ""
  [id config]
  (build-cfn-domain-props-builder (new CfnDomainProps$Builder) id config))


(defn build-cfn-domain-r-session-app-settings-property-builder
  "The build-cfn-domain-r-session-app-settings-property-builder function updates a CfnDomain$RSessionAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$RSessionAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnDomain$RSessionAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-domain-r-session-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-r-session-app-settings-property-builder (new CfnDomain$RSessionAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-r-studio-server-pro-app-settings-property-builder
  "The build-cfn-domain-r-studio-server-pro-app-settings-property-builder function updates a CfnDomain$RStudioServerProAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$RStudioServerProAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-status` |
| `userGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group` |
"
  [^CfnDomain$RStudioServerProAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-status)]
    (. builder accessStatus data))
  (when-let [data (lookup-entry config id :user-group)]
    (. builder userGroup data))
  (.build builder))


(defn cfn-domain-r-studio-server-pro-app-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-r-studio-server-pro-app-settings-property-builder (new CfnDomain$RStudioServerProAppSettingsProperty$Builder) id config))


(defn build-cfn-domain-r-studio-server-pro-domain-settings-property-builder
  "The build-cfn-domain-r-studio-server-pro-domain-settings-property-builder function updates a CfnDomain$RStudioServerProDomainSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$RStudioServerProDomainSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `domainExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role-arn` |
| `rStudioConnectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:r-studio-connect-url` |
| `rStudioPackageManagerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:r-studio-package-manager-url` |
"
  [^CfnDomain$RStudioServerProDomainSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (when-let [data (lookup-entry config id :domain-execution-role-arn)]
    (. builder domainExecutionRoleArn data))
  (when-let [data (lookup-entry config id :r-studio-connect-url)]
    (. builder rStudioConnectUrl data))
  (when-let [data (lookup-entry config id :r-studio-package-manager-url)]
    (. builder rStudioPackageManagerUrl data))
  (.build builder))


(defn cfn-domain-r-studio-server-pro-domain-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-r-studio-server-pro-domain-settings-property-builder (new CfnDomain$RStudioServerProDomainSettingsProperty$Builder) id config))


(defn build-cfn-domain-resource-spec-property-builder
  "The build-cfn-domain-resource-spec-property-builder function updates a CfnDomain$ResourceSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ResourceSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `lifecycleConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-config-arn` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |
"
  [^CfnDomain$ResourceSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :lifecycle-config-arn)]
    (. builder lifecycleConfigArn data))
  (when-let [data (lookup-entry config id :sage-maker-image-arn)]
    (. builder sageMakerImageArn data))
  (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
    (. builder sageMakerImageVersionArn data))
  (.build builder))


(defn cfn-domain-resource-spec-property-builder
  ""
  [id config]
  (build-cfn-domain-resource-spec-property-builder (new CfnDomain$ResourceSpecProperty$Builder) id config))


(defn build-cfn-domain-sharing-settings-property-builder
  "The build-cfn-domain-sharing-settings-property-builder function updates a CfnDomain$SharingSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$SharingSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookOutputOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-output-option` |
| `s3KmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |
"
  [^CfnDomain$SharingSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :notebook-output-option)]
    (. builder notebookOutputOption data))
  (when-let [data (lookup-entry config id :s3-kms-key-id)]
    (. builder s3KmsKeyId data))
  (when-let [data (lookup-entry config id :s3-output-path)]
    (. builder s3OutputPath data))
  (.build builder))


(defn cfn-domain-sharing-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-sharing-settings-property-builder (new CfnDomain$SharingSettingsProperty$Builder) id config))


(defn build-cfn-domain-user-settings-property-builder
  "The build-cfn-domain-user-settings-property-builder function updates a CfnDomain$UserSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$UserSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeEditorAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-settings` |
| `customFileSystemConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-file-system-configs` |
| `customPosixUserConfig` | software.amazon.awscdk.services.sagemaker.CfnDomain$CustomPosixUserConfigProperty | [[cdk.support/lookup-entry]] | `:custom-posix-user-config` |
| `defaultLandingUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-landing-uri` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `jupyterLabAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$JupyterServerAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$KernelGatewayAppSettingsProperty | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `rSessionAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$RSessionAppSettingsProperty | [[cdk.support/lookup-entry]] | `:r-session-app-settings` |
| `rStudioServerProAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:r-studio-server-pro-app-settings` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sharingSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$SharingSettingsProperty | [[cdk.support/lookup-entry]] | `:sharing-settings` |
| `spaceStorageSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DefaultSpaceStorageSettingsProperty | [[cdk.support/lookup-entry]] | `:space-storage-settings` |
| `studioWebPortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-web-portal` |
"
  [^CfnDomain$UserSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-editor-app-settings)]
    (. builder codeEditorAppSettings data))
  (when-let [data (lookup-entry config id :custom-file-system-configs)]
    (. builder customFileSystemConfigs data))
  (when-let [data (lookup-entry config id :custom-posix-user-config)]
    (. builder customPosixUserConfig data))
  (when-let [data (lookup-entry config id :default-landing-uri)]
    (. builder defaultLandingUri data))
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-settings)]
    (. builder jupyterLabAppSettings data))
  (when-let [data (lookup-entry config id :jupyter-server-app-settings)]
    (. builder jupyterServerAppSettings data))
  (when-let [data (lookup-entry config id :kernel-gateway-app-settings)]
    (. builder kernelGatewayAppSettings data))
  (when-let [data (lookup-entry config id :r-session-app-settings)]
    (. builder rSessionAppSettings data))
  (when-let [data (lookup-entry config id :r-studio-server-pro-app-settings)]
    (. builder rStudioServerProAppSettings data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :sharing-settings)]
    (. builder sharingSettings data))
  (when-let [data (lookup-entry config id :space-storage-settings)]
    (. builder spaceStorageSettings data))
  (when-let [data (lookup-entry config id :studio-web-portal)]
    (. builder studioWebPortal data))
  (.build builder))


(defn cfn-domain-user-settings-property-builder
  ""
  [id config]
  (build-cfn-domain-user-settings-property-builder (new CfnDomain$UserSettingsProperty$Builder) id config))


(defn build-cfn-endpoint-alarm-property-builder
  "The build-cfn-endpoint-alarm-property-builder function updates a CfnEndpoint$AlarmProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$AlarmProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
"
  [^CfnEndpoint$AlarmProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (.build builder))


(defn cfn-endpoint-alarm-property-builder
  ""
  [id config]
  (build-cfn-endpoint-alarm-property-builder (new CfnEndpoint$AlarmProperty$Builder) id config))


(defn build-cfn-endpoint-auto-rollback-config-property-builder
  "The build-cfn-endpoint-auto-rollback-config-property-builder function updates a CfnEndpoint$AutoRollbackConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$AutoRollbackConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarms` |
"
  [^CfnEndpoint$AutoRollbackConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (.build builder))


(defn cfn-endpoint-auto-rollback-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-auto-rollback-config-property-builder (new CfnEndpoint$AutoRollbackConfigProperty$Builder) id config))


(defn build-cfn-endpoint-blue-green-update-policy-property-builder
  "The build-cfn-endpoint-blue-green-update-policy-property-builder function updates a CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumExecutionTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-execution-timeout-in-seconds` |
| `terminationWaitInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-in-seconds` |
| `trafficRoutingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-configuration` |
"
  [^CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-execution-timeout-in-seconds)]
    (. builder maximumExecutionTimeoutInSeconds data))
  (when-let [data (lookup-entry config id :termination-wait-in-seconds)]
    (. builder terminationWaitInSeconds data))
  (when-let [data (lookup-entry config id :traffic-routing-configuration)]
    (. builder trafficRoutingConfiguration data))
  (.build builder))


(defn cfn-endpoint-blue-green-update-policy-property-builder
  ""
  [id config]
  (build-cfn-endpoint-blue-green-update-policy-property-builder (new CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder) id config))


(defn build-cfn-endpoint-builder
  "The build-cfn-endpoint-builder function updates a CfnEndpoint$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$DeploymentConfigProperty | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeRetainedVariantProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-retained-variant-properties` |
| `retainAllVariantProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-all-variant-properties` |
| `retainDeploymentConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-deployment-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-let [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :exclude-retained-variant-properties)]
    (. builder excludeRetainedVariantProperties data))
  (when-let [data (lookup-entry config id :retain-all-variant-properties)]
    (. builder retainAllVariantProperties data))
  (when-let [data (lookup-entry config id :retain-deployment-config)]
    (. builder retainDeploymentConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-endpoint-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-endpoint-builder (CfnEndpoint$Builder/create scope (name id)) id config))


(defn build-cfn-endpoint-capacity-size-property-builder
  "The build-cfn-endpoint-capacity-size-property-builder function updates a CfnEndpoint$CapacitySizeProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$CapacitySizeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEndpoint$CapacitySizeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-endpoint-capacity-size-property-builder
  ""
  [id config]
  (build-cfn-endpoint-capacity-size-property-builder (new CfnEndpoint$CapacitySizeProperty$Builder) id config))


(defn build-cfn-endpoint-config-async-inference-client-config-property-builder
  "The build-cfn-endpoint-config-async-inference-client-config-property-builder function updates a CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrentInvocationsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-invocations-per-instance` |
"
  [^CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-concurrent-invocations-per-instance)]
    (. builder maxConcurrentInvocationsPerInstance data))
  (.build builder))


(defn cfn-endpoint-config-async-inference-client-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-async-inference-client-config-property-builder (new CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-async-inference-config-property-builder
  "The build-cfn-endpoint-config-async-inference-config-property-builder function updates a CfnEndpointConfig$AsyncInferenceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$AsyncInferenceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-config` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$AsyncInferenceOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |
"
  [^CfnEndpointConfig$AsyncInferenceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :client-config)]
    (. builder clientConfig data))
  (when-let [data (lookup-entry config id :output-config)]
    (. builder outputConfig data))
  (.build builder))


(defn cfn-endpoint-config-async-inference-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-async-inference-config-property-builder (new CfnEndpointConfig$AsyncInferenceConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-async-inference-notification-config-property-builder
  "The build-cfn-endpoint-config-async-inference-notification-config-property-builder function updates a CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-topic` |
| `includeInferenceResponseIn` | java.util.List | [[cdk.support/lookup-entry]] | `:include-inference-response-in` |
| `successTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-topic` |
"
  [^CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error-topic)]
    (. builder errorTopic data))
  (when-let [data (lookup-entry config id :include-inference-response-in)]
    (. builder includeInferenceResponseIn data))
  (when-let [data (lookup-entry config id :success-topic)]
    (. builder successTopic data))
  (.build builder))


(defn cfn-endpoint-config-async-inference-notification-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-async-inference-notification-config-property-builder (new CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-async-inference-output-config-property-builder
  "The build-cfn-endpoint-config-async-inference-output-config-property-builder function updates a CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `notificationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-config` |
| `s3FailurePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-failure-path` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |
"
  [^CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :notification-config)]
    (. builder notificationConfig data))
  (when-let [data (lookup-entry config id :s3-failure-path)]
    (. builder s3FailurePath data))
  (when-let [data (lookup-entry config id :s3-output-path)]
    (. builder s3OutputPath data))
  (.build builder))


(defn cfn-endpoint-config-async-inference-output-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-async-inference-output-config-property-builder (new CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-builder
  "The build-cfn-endpoint-config-builder function updates a CfnEndpointConfig$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asyncInferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:async-inference-config` |
| `dataCaptureConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-capture-config` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `explainerConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$ExplainerConfigProperty | [[cdk.support/lookup-entry]] | `:explainer-config` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `productionVariants` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:production-variants` |
| `shadowProductionVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:shadow-production-variants` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnEndpointConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :async-inference-config)]
    (. builder asyncInferenceConfig data))
  (when-let [data (lookup-entry config id :data-capture-config)]
    (. builder dataCaptureConfig data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :explainer-config)]
    (. builder explainerConfig data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :production-variants)]
    (. builder productionVariants data))
  (when-let [data (lookup-entry config id :shadow-production-variants)]
    (. builder shadowProductionVariants data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-endpoint-config-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-endpoint-config-builder (CfnEndpointConfig$Builder/create scope (name id)) id config))


(defn build-cfn-endpoint-config-capture-content-type-header-property-builder
  "The build-cfn-endpoint-config-capture-content-type-header-property-builder function updates a CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:csv-content-types` |
| `jsonContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:json-content-types` |
"
  [^CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv-content-types)]
    (. builder csvContentTypes data))
  (when-let [data (lookup-entry config id :json-content-types)]
    (. builder jsonContentTypes data))
  (.build builder))


(defn cfn-endpoint-config-capture-content-type-header-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-capture-content-type-header-property-builder (new CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder) id config))


(defn build-cfn-endpoint-config-capture-option-property-builder
  "The build-cfn-endpoint-config-capture-option-property-builder function updates a CfnEndpointConfig$CaptureOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$CaptureOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:capture-mode` |
"
  [^CfnEndpointConfig$CaptureOptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :capture-mode)]
    (. builder captureMode data))
  (.build builder))


(defn cfn-endpoint-config-capture-option-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-capture-option-property-builder (new CfnEndpointConfig$CaptureOptionProperty$Builder) id config))


(defn build-cfn-endpoint-config-clarify-explainer-config-property-builder
  "The build-cfn-endpoint-config-clarify-explainer-config-property-builder function updates a CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableExplanations` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-explanations` |
| `inferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-config` |
| `shapConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shap-config` |
"
  [^CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-explanations)]
    (. builder enableExplanations data))
  (when-let [data (lookup-entry config id :inference-config)]
    (. builder inferenceConfig data))
  (when-let [data (lookup-entry config id :shap-config)]
    (. builder shapConfig data))
  (.build builder))


(defn cfn-endpoint-config-clarify-explainer-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-clarify-explainer-config-property-builder (new CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-clarify-inference-config-property-builder
  "The build-cfn-endpoint-config-clarify-inference-config-property-builder function updates a CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-template` |
| `featureHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:feature-headers` |
| `featureTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:feature-types` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `labelAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-attribute` |
| `labelHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:label-headers` |
| `labelIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:label-index` |
| `maxPayloadInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-payload-in-mb` |
| `maxRecordCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-record-count` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `probabilityIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-index` |
"
  [^CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-template)]
    (. builder contentTemplate data))
  (when-let [data (lookup-entry config id :feature-headers)]
    (. builder featureHeaders data))
  (when-let [data (lookup-entry config id :feature-types)]
    (. builder featureTypes data))
  (when-let [data (lookup-entry config id :features-attribute)]
    (. builder featuresAttribute data))
  (when-let [data (lookup-entry config id :label-attribute)]
    (. builder labelAttribute data))
  (when-let [data (lookup-entry config id :label-headers)]
    (. builder labelHeaders data))
  (when-let [data (lookup-entry config id :label-index)]
    (. builder labelIndex data))
  (when-let [data (lookup-entry config id :max-payload-in-mb)]
    (. builder maxPayloadInMb data))
  (when-let [data (lookup-entry config id :max-record-count)]
    (. builder maxRecordCount data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :probability-index)]
    (. builder probabilityIndex data))
  (.build builder))


(defn cfn-endpoint-config-clarify-inference-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-clarify-inference-config-property-builder (new CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-clarify-shap-baseline-config-property-builder
  "The build-cfn-endpoint-config-clarify-shap-baseline-config-property-builder function updates a CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mimeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mime-type` |
| `shapBaseline` | java.lang.String | [[cdk.support/lookup-entry]] | `:shap-baseline` |
| `shapBaselineUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:shap-baseline-uri` |
"
  [^CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mime-type)]
    (. builder mimeType data))
  (when-let [data (lookup-entry config id :shap-baseline)]
    (. builder shapBaseline data))
  (when-let [data (lookup-entry config id :shap-baseline-uri)]
    (. builder shapBaselineUri data))
  (.build builder))


(defn cfn-endpoint-config-clarify-shap-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-clarify-shap-baseline-config-property-builder (new CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-clarify-shap-config-property-builder
  "The build-cfn-endpoint-config-clarify-shap-config-property-builder function updates a CfnEndpointConfig$ClarifyShapConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ClarifyShapConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfSamples` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-samples` |
| `seed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed` |
| `shapBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shap-baseline-config` |
| `textConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-config` |
| `useLogit` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-logit` |
"
  [^CfnEndpointConfig$ClarifyShapConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :number-of-samples)]
    (. builder numberOfSamples data))
  (when-let [data (lookup-entry config id :seed)]
    (. builder seed data))
  (when-let [data (lookup-entry config id :shap-baseline-config)]
    (. builder shapBaselineConfig data))
  (when-let [data (lookup-entry config id :text-config)]
    (. builder textConfig data))
  (when-let [data (lookup-entry config id :use-logit)]
    (. builder useLogit data))
  (.build builder))


(defn cfn-endpoint-config-clarify-shap-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-clarify-shap-config-property-builder (new CfnEndpointConfig$ClarifyShapConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-clarify-text-config-property-builder
  "The build-cfn-endpoint-config-clarify-text-config-property-builder function updates a CfnEndpointConfig$ClarifyTextConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ClarifyTextConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `granularity` | java.lang.String | [[cdk.support/lookup-entry]] | `:granularity` |
| `language` | java.lang.String | [[cdk.support/lookup-entry]] | `:language` |
"
  [^CfnEndpointConfig$ClarifyTextConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :granularity)]
    (. builder granularity data))
  (when-let [data (lookup-entry config id :language)]
    (. builder language data))
  (.build builder))


(defn cfn-endpoint-config-clarify-text-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-clarify-text-config-property-builder (new CfnEndpointConfig$ClarifyTextConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-data-capture-config-property-builder
  "The build-cfn-endpoint-config-data-capture-config-property-builder function updates a CfnEndpointConfig$DataCaptureConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$DataCaptureConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureContentTypeHeader` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$CaptureContentTypeHeaderProperty | [[cdk.support/lookup-entry]] | `:capture-content-type-header` |
| `captureOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capture-options` |
| `destinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-s3-uri` |
| `enableCapture` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-capture` |
| `initialSamplingPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-sampling-percentage` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnEndpointConfig$DataCaptureConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :capture-content-type-header)]
    (. builder captureContentTypeHeader data))
  (when-let [data (lookup-entry config id :capture-options)]
    (. builder captureOptions data))
  (when-let [data (lookup-entry config id :destination-s3-uri)]
    (. builder destinationS3Uri data))
  (when-let [data (lookup-entry config id :enable-capture)]
    (. builder enableCapture data))
  (when-let [data (lookup-entry config id :initial-sampling-percentage)]
    (. builder initialSamplingPercentage data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-endpoint-config-data-capture-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-data-capture-config-property-builder (new CfnEndpointConfig$DataCaptureConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-explainer-config-property-builder
  "The build-cfn-endpoint-config-explainer-config-property-builder function updates a CfnEndpointConfig$ExplainerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ExplainerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clarifyExplainerConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$ClarifyExplainerConfigProperty | [[cdk.support/lookup-entry]] | `:clarify-explainer-config` |
"
  [^CfnEndpointConfig$ExplainerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :clarify-explainer-config)]
    (. builder clarifyExplainerConfig data))
  (.build builder))


(defn cfn-endpoint-config-explainer-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-explainer-config-property-builder (new CfnEndpointConfig$ExplainerConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-managed-instance-scaling-property-builder
  "The build-cfn-endpoint-config-managed-instance-scaling-property-builder function updates a CfnEndpointConfig$ManagedInstanceScalingProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ManagedInstanceScalingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-instance-count` |
| `minInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-instance-count` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnEndpointConfig$ManagedInstanceScalingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-instance-count)]
    (. builder maxInstanceCount data))
  (when-let [data (lookup-entry config id :min-instance-count)]
    (. builder minInstanceCount data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-endpoint-config-managed-instance-scaling-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-managed-instance-scaling-property-builder (new CfnEndpointConfig$ManagedInstanceScalingProperty$Builder) id config))


(defn build-cfn-endpoint-config-production-variant-property-builder
  "The build-cfn-endpoint-config-production-variant-property-builder function updates a CfnEndpointConfig$ProductionVariantProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ProductionVariantProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:accelerator-type` |
| `containerStartupHealthCheckTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-startup-health-check-timeout-in-seconds` |
| `enableSsmAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ssm-access` |
| `initialInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-instance-count` |
| `initialVariantWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-variant-weight` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `managedInstanceScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-instance-scaling` |
| `modelDataDownloadTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-data-download-timeout-in-seconds` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `routingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-config` |
| `serverlessConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serverless-config` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnEndpointConfig$ProductionVariantProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-type)]
    (. builder acceleratorType data))
  (when-let [data (lookup-entry config id :container-startup-health-check-timeout-in-seconds)]
    (. builder containerStartupHealthCheckTimeoutInSeconds data))
  (when-let [data (lookup-entry config id :enable-ssm-access)]
    (. builder enableSsmAccess data))
  (when-let [data (lookup-entry config id :initial-instance-count)]
    (. builder initialInstanceCount data))
  (when-let [data (lookup-entry config id :initial-variant-weight)]
    (. builder initialVariantWeight data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :managed-instance-scaling)]
    (. builder managedInstanceScaling data))
  (when-let [data (lookup-entry config id :model-data-download-timeout-in-seconds)]
    (. builder modelDataDownloadTimeoutInSeconds data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :routing-config)]
    (. builder routingConfig data))
  (when-let [data (lookup-entry config id :serverless-config)]
    (. builder serverlessConfig data))
  (when-let [data (lookup-entry config id :variant-name)]
    (. builder variantName data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-endpoint-config-production-variant-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-production-variant-property-builder (new CfnEndpointConfig$ProductionVariantProperty$Builder) id config))


(defn build-cfn-endpoint-config-props-builder
  "The build-cfn-endpoint-config-props-builder function updates a CfnEndpointConfigProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asyncInferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:async-inference-config` |
| `dataCaptureConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-capture-config` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `explainerConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$ExplainerConfigProperty | [[cdk.support/lookup-entry]] | `:explainer-config` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `productionVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:production-variants` |
| `shadowProductionVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:shadow-production-variants` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnEndpointConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :async-inference-config)]
    (. builder asyncInferenceConfig data))
  (when-let [data (lookup-entry config id :data-capture-config)]
    (. builder dataCaptureConfig data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :explainer-config)]
    (. builder explainerConfig data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :production-variants)]
    (. builder productionVariants data))
  (when-let [data (lookup-entry config id :shadow-production-variants)]
    (. builder shadowProductionVariants data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-endpoint-config-props-builder
  ""
  [id config]
  (build-cfn-endpoint-config-props-builder (new CfnEndpointConfigProps$Builder) id config))


(defn build-cfn-endpoint-config-routing-config-property-builder
  "The build-cfn-endpoint-config-routing-config-property-builder function updates a CfnEndpointConfig$RoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$RoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-strategy` |
"
  [^CfnEndpointConfig$RoutingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :routing-strategy)]
    (. builder routingStrategy data))
  (.build builder))


(defn cfn-endpoint-config-routing-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-routing-config-property-builder (new CfnEndpointConfig$RoutingConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-serverless-config-property-builder
  "The build-cfn-endpoint-config-serverless-config-property-builder function updates a CfnEndpointConfig$ServerlessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$ServerlessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `memorySizeInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size-in-mb` |
| `provisionedConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrency` |
"
  [^CfnEndpointConfig$ServerlessConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-let [data (lookup-entry config id :memory-size-in-mb)]
    (. builder memorySizeInMb data))
  (when-let [data (lookup-entry config id :provisioned-concurrency)]
    (. builder provisionedConcurrency data))
  (.build builder))


(defn cfn-endpoint-config-serverless-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-serverless-config-property-builder (new CfnEndpointConfig$ServerlessConfigProperty$Builder) id config))


(defn build-cfn-endpoint-config-vpc-config-property-builder
  "The build-cfn-endpoint-config-vpc-config-property-builder function updates a CfnEndpointConfig$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointConfig$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnEndpointConfig$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-endpoint-config-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-config-vpc-config-property-builder (new CfnEndpointConfig$VpcConfigProperty$Builder) id config))


(defn build-cfn-endpoint-deployment-config-property-builder
  "The build-cfn-endpoint-deployment-config-property-builder function updates a CfnEndpoint$DeploymentConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$DeploymentConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRollbackConfiguration` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$AutoRollbackConfigProperty | [[cdk.support/lookup-entry]] | `:auto-rollback-configuration` |
| `blueGreenUpdatePolicy` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$BlueGreenUpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:blue-green-update-policy` |
| `rollingUpdatePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rolling-update-policy` |
"
  [^CfnEndpoint$DeploymentConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-rollback-configuration)]
    (. builder autoRollbackConfiguration data))
  (when-let [data (lookup-entry config id :blue-green-update-policy)]
    (. builder blueGreenUpdatePolicy data))
  (when-let [data (lookup-entry config id :rolling-update-policy)]
    (. builder rollingUpdatePolicy data))
  (.build builder))


(defn cfn-endpoint-deployment-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-deployment-config-property-builder (new CfnEndpoint$DeploymentConfigProperty$Builder) id config))


(defn build-cfn-endpoint-props-builder
  "The build-cfn-endpoint-props-builder function updates a CfnEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeRetainedVariantProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-retained-variant-properties` |
| `retainAllVariantProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-all-variant-properties` |
| `retainDeploymentConfig` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployment-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-config)]
    (. builder deploymentConfig data))
  (when-let [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :exclude-retained-variant-properties)]
    (. builder excludeRetainedVariantProperties data))
  (when-let [data (lookup-entry config id :retain-all-variant-properties)]
    (. builder retainAllVariantProperties data))
  (when-let [data (lookup-entry config id :retain-deployment-config)]
    (. builder retainDeploymentConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-endpoint-props-builder
  ""
  [id config]
  (build-cfn-endpoint-props-builder (new CfnEndpointProps$Builder) id config))


(defn build-cfn-endpoint-rolling-update-policy-property-builder
  "The build-cfn-endpoint-rolling-update-policy-property-builder function updates a CfnEndpoint$RollingUpdatePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$RollingUpdatePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumBatchSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:maximum-batch-size` |
| `maximumExecutionTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-execution-timeout-in-seconds` |
| `rollbackMaximumBatchSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:rollback-maximum-batch-size` |
| `waitIntervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-interval-in-seconds` |
"
  [^CfnEndpoint$RollingUpdatePolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :maximum-batch-size)]
    (. builder maximumBatchSize data))
  (when-let [data (lookup-entry config id :maximum-execution-timeout-in-seconds)]
    (. builder maximumExecutionTimeoutInSeconds data))
  (when-let [data (lookup-entry config id :rollback-maximum-batch-size)]
    (. builder rollbackMaximumBatchSize data))
  (when-let [data (lookup-entry config id :wait-interval-in-seconds)]
    (. builder waitIntervalInSeconds data))
  (.build builder))


(defn cfn-endpoint-rolling-update-policy-property-builder
  ""
  [id config]
  (build-cfn-endpoint-rolling-update-policy-property-builder (new CfnEndpoint$RollingUpdatePolicyProperty$Builder) id config))


(defn build-cfn-endpoint-traffic-routing-config-property-builder
  "The build-cfn-endpoint-traffic-routing-config-property-builder function updates a CfnEndpoint$TrafficRoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$TrafficRoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canarySize` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:canary-size` |
| `linearStepSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:linear-step-size` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `waitIntervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-interval-in-seconds` |
"
  [^CfnEndpoint$TrafficRoutingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :canary-size)]
    (. builder canarySize data))
  (when-let [data (lookup-entry config id :linear-step-size)]
    (. builder linearStepSize data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :wait-interval-in-seconds)]
    (. builder waitIntervalInSeconds data))
  (.build builder))


(defn cfn-endpoint-traffic-routing-config-property-builder
  ""
  [id config]
  (build-cfn-endpoint-traffic-routing-config-property-builder (new CfnEndpoint$TrafficRoutingConfigProperty$Builder) id config))


(defn build-cfn-endpoint-variant-property-property-builder
  "The build-cfn-endpoint-variant-property-property-builder function updates a CfnEndpoint$VariantPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpoint$VariantPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variantPropertyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-property-type` |
"
  [^CfnEndpoint$VariantPropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :variant-property-type)]
    (. builder variantPropertyType data))
  (.build builder))


(defn cfn-endpoint-variant-property-property-builder
  ""
  [id config]
  (build-cfn-endpoint-variant-property-property-builder (new CfnEndpoint$VariantPropertyProperty$Builder) id config))


(defn build-cfn-feature-group-builder
  "The build-cfn-feature-group-builder function updates a CfnFeatureGroup$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventTimeFeatureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-time-feature-name` |
| `featureDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:feature-definitions` |
| `featureGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-group-name` |
| `offlineStoreConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:offline-store-config` |
| `onlineStoreConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:online-store-config` |
| `recordIdentifierFeatureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-identifier-feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throughputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:throughput-config` |
"
  [^CfnFeatureGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :event-time-feature-name)]
    (. builder eventTimeFeatureName data))
  (when-let [data (lookup-entry config id :feature-definitions)]
    (. builder featureDefinitions data))
  (when-let [data (lookup-entry config id :feature-group-name)]
    (. builder featureGroupName data))
  (when-let [data (lookup-entry config id :offline-store-config)]
    (. builder offlineStoreConfig data))
  (when-let [data (lookup-entry config id :online-store-config)]
    (. builder onlineStoreConfig data))
  (when-let [data (lookup-entry config id :record-identifier-feature-name)]
    (. builder recordIdentifierFeatureName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :throughput-config)]
    (. builder throughputConfig data))
  (.build builder))


(defn cfn-feature-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-feature-group-builder (CfnFeatureGroup$Builder/create scope (name id)) id config))


(defn build-cfn-feature-group-data-catalog-config-property-builder
  "The build-cfn-feature-group-data-catalog-config-property-builder function updates a CfnFeatureGroup$DataCatalogConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$DataCatalogConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnFeatureGroup$DataCatalogConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog)]
    (. builder catalog data))
  (when-let [data (lookup-entry config id :database)]
    (. builder database data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-feature-group-data-catalog-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-data-catalog-config-property-builder (new CfnFeatureGroup$DataCatalogConfigProperty$Builder) id config))


(defn build-cfn-feature-group-feature-definition-property-builder
  "The build-cfn-feature-group-feature-definition-property-builder function updates a CfnFeatureGroup$FeatureDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$FeatureDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `featureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-type` |
"
  [^CfnFeatureGroup$FeatureDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :feature-name)]
    (. builder featureName data))
  (when-let [data (lookup-entry config id :feature-type)]
    (. builder featureType data))
  (.build builder))


(defn cfn-feature-group-feature-definition-property-builder
  ""
  [id config]
  (build-cfn-feature-group-feature-definition-property-builder (new CfnFeatureGroup$FeatureDefinitionProperty$Builder) id config))


(defn build-cfn-feature-group-offline-store-config-property-builder
  "The build-cfn-feature-group-offline-store-config-property-builder function updates a CfnFeatureGroup$OfflineStoreConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$OfflineStoreConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$DataCatalogConfigProperty | [[cdk.support/lookup-entry]] | `:data-catalog-config` |
| `disableGlueTableCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-glue-table-creation` |
| `s3StorageConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$S3StorageConfigProperty | [[cdk.support/lookup-entry]] | `:s3-storage-config` |
| `tableFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-format` |
"
  [^CfnFeatureGroup$OfflineStoreConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-catalog-config)]
    (. builder dataCatalogConfig data))
  (when-let [data (lookup-entry config id :disable-glue-table-creation)]
    (. builder disableGlueTableCreation data))
  (when-let [data (lookup-entry config id :s3-storage-config)]
    (. builder s3StorageConfig data))
  (when-let [data (lookup-entry config id :table-format)]
    (. builder tableFormat data))
  (.build builder))


(defn cfn-feature-group-offline-store-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-offline-store-config-property-builder (new CfnFeatureGroup$OfflineStoreConfigProperty$Builder) id config))


(defn build-cfn-feature-group-online-store-config-property-builder
  "The build-cfn-feature-group-online-store-config-property-builder function updates a CfnFeatureGroup$OnlineStoreConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$OnlineStoreConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableOnlineStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-online-store` |
| `securityConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$OnlineStoreSecurityConfigProperty | [[cdk.support/lookup-entry]] | `:security-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `ttlDuration` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$TtlDurationProperty | [[cdk.support/lookup-entry]] | `:ttl-duration` |
"
  [^CfnFeatureGroup$OnlineStoreConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-online-store)]
    (. builder enableOnlineStore data))
  (when-let [data (lookup-entry config id :security-config)]
    (. builder securityConfig data))
  (when-let [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-let [data (lookup-entry config id :ttl-duration)]
    (. builder ttlDuration data))
  (.build builder))


(defn cfn-feature-group-online-store-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-online-store-config-property-builder (new CfnFeatureGroup$OnlineStoreConfigProperty$Builder) id config))


(defn build-cfn-feature-group-online-store-security-config-property-builder
  "The build-cfn-feature-group-online-store-security-config-property-builder function updates a CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-feature-group-online-store-security-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-online-store-security-config-property-builder (new CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder) id config))


(defn build-cfn-feature-group-props-builder
  "The build-cfn-feature-group-props-builder function updates a CfnFeatureGroupProps$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventTimeFeatureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-time-feature-name` |
| `featureDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:feature-definitions` |
| `featureGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-group-name` |
| `offlineStoreConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:offline-store-config` |
| `onlineStoreConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:online-store-config` |
| `recordIdentifierFeatureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-identifier-feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throughputConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$ThroughputConfigProperty | [[cdk.support/lookup-entry]] | `:throughput-config` |
"
  [^CfnFeatureGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :event-time-feature-name)]
    (. builder eventTimeFeatureName data))
  (when-let [data (lookup-entry config id :feature-definitions)]
    (. builder featureDefinitions data))
  (when-let [data (lookup-entry config id :feature-group-name)]
    (. builder featureGroupName data))
  (when-let [data (lookup-entry config id :offline-store-config)]
    (. builder offlineStoreConfig data))
  (when-let [data (lookup-entry config id :online-store-config)]
    (. builder onlineStoreConfig data))
  (when-let [data (lookup-entry config id :record-identifier-feature-name)]
    (. builder recordIdentifierFeatureName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :throughput-config)]
    (. builder throughputConfig data))
  (.build builder))


(defn cfn-feature-group-props-builder
  ""
  [id config]
  (build-cfn-feature-group-props-builder (new CfnFeatureGroupProps$Builder) id config))


(defn build-cfn-feature-group-s3-storage-config-property-builder
  "The build-cfn-feature-group-s3-storage-config-property-builder function updates a CfnFeatureGroup$S3StorageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$S3StorageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnFeatureGroup$S3StorageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-feature-group-s3-storage-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-s3-storage-config-property-builder (new CfnFeatureGroup$S3StorageConfigProperty$Builder) id config))


(defn build-cfn-feature-group-throughput-config-property-builder
  "The build-cfn-feature-group-throughput-config-property-builder function updates a CfnFeatureGroup$ThroughputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$ThroughputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedReadCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-read-capacity-units` |
| `provisionedWriteCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-write-capacity-units` |
| `throughputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:throughput-mode` |
"
  [^CfnFeatureGroup$ThroughputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provisioned-read-capacity-units)]
    (. builder provisionedReadCapacityUnits data))
  (when-let [data (lookup-entry config id :provisioned-write-capacity-units)]
    (. builder provisionedWriteCapacityUnits data))
  (when-let [data (lookup-entry config id :throughput-mode)]
    (. builder throughputMode data))
  (.build builder))


(defn cfn-feature-group-throughput-config-property-builder
  ""
  [id config]
  (build-cfn-feature-group-throughput-config-property-builder (new CfnFeatureGroup$ThroughputConfigProperty$Builder) id config))


(defn build-cfn-feature-group-ttl-duration-property-builder
  "The build-cfn-feature-group-ttl-duration-property-builder function updates a CfnFeatureGroup$TtlDurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFeatureGroup$TtlDurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFeatureGroup$TtlDurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-feature-group-ttl-duration-property-builder
  ""
  [id config]
  (build-cfn-feature-group-ttl-duration-property-builder (new CfnFeatureGroup$TtlDurationProperty$Builder) id config))


(defn build-cfn-image-builder
  "The build-cfn-image-builder function updates a CfnImage$Builder instance using the provided configuration.
  The function takes the CfnImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-description` |
| `imageDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-display-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnImage$Builder builder id config]
  (when-let [data (lookup-entry config id :image-description)]
    (. builder imageDescription data))
  (when-let [data (lookup-entry config id :image-display-name)]
    (. builder imageDisplayName data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :image-role-arn)]
    (. builder imageRoleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-image-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-image-builder (CfnImage$Builder/create scope (name id)) id config))


(defn build-cfn-image-props-builder
  "The build-cfn-image-props-builder function updates a CfnImageProps$Builder instance using the provided configuration.
  The function takes the CfnImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-description` |
| `imageDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-display-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnImageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :image-description)]
    (. builder imageDescription data))
  (when-let [data (lookup-entry config id :image-display-name)]
    (. builder imageDisplayName data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :image-role-arn)]
    (. builder imageRoleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-image-props-builder
  ""
  [id config]
  (build-cfn-image-props-builder (new CfnImageProps$Builder) id config))


(defn build-cfn-image-version-builder
  "The build-cfn-image-version-builder function updates a CfnImageVersion$Builder instance using the provided configuration.
  The function takes the CfnImageVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `baseImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-image` |
| `horovod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:horovod` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `jobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-type` |
| `mlFramework` | java.lang.String | [[cdk.support/lookup-entry]] | `:ml-framework` |
| `processor` | java.lang.String | [[cdk.support/lookup-entry]] | `:processor` |
| `programmingLang` | java.lang.String | [[cdk.support/lookup-entry]] | `:programming-lang` |
| `releaseNotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-notes` |
| `vendorGuidance` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-guidance` |
"
  [^CfnImageVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-let [data (lookup-entry config id :base-image)]
    (. builder baseImage data))
  (when-let [data (lookup-entry config id :horovod)]
    (. builder horovod data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :job-type)]
    (. builder jobType data))
  (when-let [data (lookup-entry config id :ml-framework)]
    (. builder mlFramework data))
  (when-let [data (lookup-entry config id :processor)]
    (. builder processor data))
  (when-let [data (lookup-entry config id :programming-lang)]
    (. builder programmingLang data))
  (when-let [data (lookup-entry config id :release-notes)]
    (. builder releaseNotes data))
  (when-let [data (lookup-entry config id :vendor-guidance)]
    (. builder vendorGuidance data))
  (.build builder))


(defn cfn-image-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-image-version-builder (CfnImageVersion$Builder/create scope (name id)) id config))


(defn build-cfn-image-version-props-builder
  "The build-cfn-image-version-props-builder function updates a CfnImageVersionProps$Builder instance using the provided configuration.
  The function takes the CfnImageVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `baseImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-image` |
| `horovod` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:horovod` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `jobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-type` |
| `mlFramework` | java.lang.String | [[cdk.support/lookup-entry]] | `:ml-framework` |
| `processor` | java.lang.String | [[cdk.support/lookup-entry]] | `:processor` |
| `programmingLang` | java.lang.String | [[cdk.support/lookup-entry]] | `:programming-lang` |
| `releaseNotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:release-notes` |
| `vendorGuidance` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-guidance` |
"
  [^CfnImageVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-let [data (lookup-entry config id :base-image)]
    (. builder baseImage data))
  (when-let [data (lookup-entry config id :horovod)]
    (. builder horovod data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :job-type)]
    (. builder jobType data))
  (when-let [data (lookup-entry config id :ml-framework)]
    (. builder mlFramework data))
  (when-let [data (lookup-entry config id :processor)]
    (. builder processor data))
  (when-let [data (lookup-entry config id :programming-lang)]
    (. builder programmingLang data))
  (when-let [data (lookup-entry config id :release-notes)]
    (. builder releaseNotes data))
  (when-let [data (lookup-entry config id :vendor-guidance)]
    (. builder vendorGuidance data))
  (.build builder))


(defn cfn-image-version-props-builder
  ""
  [id config]
  (build-cfn-image-version-props-builder (new CfnImageVersionProps$Builder) id config))


(defn build-cfn-inference-component-builder
  "The build-cfn-inference-component-builder function updates a CfnInferenceComponent$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-arn` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `inferenceComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-component-name` |
| `runtimeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-config` |
| `specification` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentSpecificationProperty | [[cdk.support/lookup-entry]] | `:specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |
"
  [^CfnInferenceComponent$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-arn)]
    (. builder endpointArn data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :inference-component-name)]
    (. builder inferenceComponentName data))
  (when-let [data (lookup-entry config id :runtime-config)]
    (. builder runtimeConfig data))
  (when-let [data (lookup-entry config id :specification)]
    (. builder specification data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variant-name)]
    (. builder variantName data))
  (.build builder))


(defn cfn-inference-component-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-inference-component-builder (CfnInferenceComponent$Builder/create scope (name id)) id config))


(defn build-cfn-inference-component-deployed-image-property-builder
  "The build-cfn-inference-component-deployed-image-property-builder function updates a CfnInferenceComponent$DeployedImageProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$DeployedImageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolutionTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-time` |
| `resolvedImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolved-image` |
| `specifiedImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:specified-image` |
"
  [^CfnInferenceComponent$DeployedImageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resolution-time)]
    (. builder resolutionTime data))
  (when-let [data (lookup-entry config id :resolved-image)]
    (. builder resolvedImage data))
  (when-let [data (lookup-entry config id :specified-image)]
    (. builder specifiedImage data))
  (.build builder))


(defn cfn-inference-component-deployed-image-property-builder
  ""
  [id config]
  (build-cfn-inference-component-deployed-image-property-builder (new CfnInferenceComponent$DeployedImageProperty$Builder) id config))


(defn build-cfn-inference-component-inference-component-compute-resource-requirements-property-builder
  "The build-cfn-inference-component-inference-component-compute-resource-requirements-property-builder function updates a CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxMemoryRequiredInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-memory-required-in-mb` |
| `minMemoryRequiredInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-memory-required-in-mb` |
| `numberOfAcceleratorDevicesRequired` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-accelerator-devices-required` |
| `numberOfCpuCoresRequired` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-cpu-cores-required` |
"
  [^CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-memory-required-in-mb)]
    (. builder maxMemoryRequiredInMb data))
  (when-let [data (lookup-entry config id :min-memory-required-in-mb)]
    (. builder minMemoryRequiredInMb data))
  (when-let [data (lookup-entry config id :number-of-accelerator-devices-required)]
    (. builder numberOfAcceleratorDevicesRequired data))
  (when-let [data (lookup-entry config id :number-of-cpu-cores-required)]
    (. builder numberOfCpuCoresRequired data))
  (.build builder))


(defn cfn-inference-component-inference-component-compute-resource-requirements-property-builder
  ""
  [id config]
  (build-cfn-inference-component-inference-component-compute-resource-requirements-property-builder (new CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder) id config))


(defn build-cfn-inference-component-inference-component-container-specification-property-builder
  "The build-cfn-inference-component-inference-component-container-specification-property-builder function updates a CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-url` |
| `deployedImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployed-image` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
"
  [^CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-url)]
    (. builder artifactUrl data))
  (when-let [data (lookup-entry config id :deployed-image)]
    (. builder deployedImage data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image)]
    (. builder image data))
  (.build builder))


(defn cfn-inference-component-inference-component-container-specification-property-builder
  ""
  [id config]
  (build-cfn-inference-component-inference-component-container-specification-property-builder (new CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder) id config))


(defn build-cfn-inference-component-inference-component-runtime-config-property-builder
  "The build-cfn-inference-component-inference-component-runtime-config-property-builder function updates a CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:copy-count` |
| `currentCopyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:current-copy-count` |
| `desiredCopyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-copy-count` |
"
  [^CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :copy-count)]
    (. builder copyCount data))
  (when-let [data (lookup-entry config id :current-copy-count)]
    (. builder currentCopyCount data))
  (when-let [data (lookup-entry config id :desired-copy-count)]
    (. builder desiredCopyCount data))
  (.build builder))


(defn cfn-inference-component-inference-component-runtime-config-property-builder
  ""
  [id config]
  (build-cfn-inference-component-inference-component-runtime-config-property-builder (new CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder) id config))


(defn build-cfn-inference-component-inference-component-specification-property-builder
  "The build-cfn-inference-component-inference-component-specification-property-builder function updates a CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeResourceRequirements` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty | [[cdk.support/lookup-entry]] | `:compute-resource-requirements` |
| `container` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentContainerSpecificationProperty | [[cdk.support/lookup-entry]] | `:container` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `startupParameters` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentStartupParametersProperty | [[cdk.support/lookup-entry]] | `:startup-parameters` |
"
  [^CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :compute-resource-requirements)]
    (. builder computeResourceRequirements data))
  (when-let [data (lookup-entry config id :container)]
    (. builder container data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :startup-parameters)]
    (. builder startupParameters data))
  (.build builder))


(defn cfn-inference-component-inference-component-specification-property-builder
  ""
  [id config]
  (build-cfn-inference-component-inference-component-specification-property-builder (new CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder) id config))


(defn build-cfn-inference-component-inference-component-startup-parameters-property-builder
  "The build-cfn-inference-component-inference-component-startup-parameters-property-builder function updates a CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerStartupHealthCheckTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-startup-health-check-timeout-in-seconds` |
| `modelDataDownloadTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-data-download-timeout-in-seconds` |
"
  [^CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-startup-health-check-timeout-in-seconds)]
    (. builder containerStartupHealthCheckTimeoutInSeconds data))
  (when-let [data (lookup-entry config id :model-data-download-timeout-in-seconds)]
    (. builder modelDataDownloadTimeoutInSeconds data))
  (.build builder))


(defn cfn-inference-component-inference-component-startup-parameters-property-builder
  ""
  [id config]
  (build-cfn-inference-component-inference-component-startup-parameters-property-builder (new CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder) id config))


(defn build-cfn-inference-component-props-builder
  "The build-cfn-inference-component-props-builder function updates a CfnInferenceComponentProps$Builder instance using the provided configuration.
  The function takes the CfnInferenceComponentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-arn` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `inferenceComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-component-name` |
| `runtimeConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentRuntimeConfigProperty | [[cdk.support/lookup-entry]] | `:runtime-config` |
| `specification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |
"
  [^CfnInferenceComponentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-arn)]
    (. builder endpointArn data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :inference-component-name)]
    (. builder inferenceComponentName data))
  (when-let [data (lookup-entry config id :runtime-config)]
    (. builder runtimeConfig data))
  (when-let [data (lookup-entry config id :specification)]
    (. builder specification data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variant-name)]
    (. builder variantName data))
  (.build builder))


(defn cfn-inference-component-props-builder
  ""
  [id config]
  (build-cfn-inference-component-props-builder (new CfnInferenceComponentProps$Builder) id config))


(defn build-cfn-inference-experiment-builder
  "The build-cfn-inference-experiment-builder function updates a CfnInferenceExperiment$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataStorageConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment$DataStorageConfigProperty | [[cdk.support/lookup-entry]] | `:data-storage-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `modelVariants` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-variants` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `shadowModeConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment$ShadowModeConfigProperty | [[cdk.support/lookup-entry]] | `:shadow-mode-config` |
| `statusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-reason` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnInferenceExperiment$Builder builder id config]
  (when-let [data (lookup-entry config id :data-storage-config)]
    (. builder dataStorageConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :model-variants)]
    (. builder modelVariants data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :shadow-mode-config)]
    (. builder shadowModeConfig data))
  (when-let [data (lookup-entry config id :status-reason)]
    (. builder statusReason data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-inference-experiment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-inference-experiment-builder (CfnInferenceExperiment$Builder/create scope (name id)) id config))


(defn build-cfn-inference-experiment-capture-content-type-header-property-builder
  "The build-cfn-inference-experiment-capture-content-type-header-property-builder function updates a CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:csv-content-types` |
| `jsonContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:json-content-types` |
"
  [^CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv-content-types)]
    (. builder csvContentTypes data))
  (when-let [data (lookup-entry config id :json-content-types)]
    (. builder jsonContentTypes data))
  (.build builder))


(defn cfn-inference-experiment-capture-content-type-header-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-capture-content-type-header-property-builder (new CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder) id config))


(defn build-cfn-inference-experiment-data-storage-config-property-builder
  "The build-cfn-inference-experiment-data-storage-config-property-builder function updates a CfnInferenceExperiment$DataStorageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$DataStorageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-type` |
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnInferenceExperiment$DataStorageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-inference-experiment-data-storage-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-data-storage-config-property-builder (new CfnInferenceExperiment$DataStorageConfigProperty$Builder) id config))


(defn build-cfn-inference-experiment-endpoint-metadata-property-builder
  "The build-cfn-inference-experiment-endpoint-metadata-property-builder function updates a CfnInferenceExperiment$EndpointMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$EndpointMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `endpointStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-status` |
"
  [^CfnInferenceExperiment$EndpointMetadataProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-config-name)]
    (. builder endpointConfigName data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :endpoint-status)]
    (. builder endpointStatus data))
  (.build builder))


(defn cfn-inference-experiment-endpoint-metadata-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-endpoint-metadata-property-builder (new CfnInferenceExperiment$EndpointMetadataProperty$Builder) id config))


(defn build-cfn-inference-experiment-inference-experiment-schedule-property-builder
  "The build-cfn-inference-experiment-inference-experiment-schedule-property-builder function updates a CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-inference-experiment-inference-experiment-schedule-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-inference-experiment-schedule-property-builder (new CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder) id config))


(defn build-cfn-inference-experiment-model-infrastructure-config-property-builder
  "The build-cfn-inference-experiment-model-infrastructure-config-property-builder function updates a CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `infrastructureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-type` |
| `realTimeInferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:real-time-inference-config` |
"
  [^CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :infrastructure-type)]
    (. builder infrastructureType data))
  (when-let [data (lookup-entry config id :real-time-inference-config)]
    (. builder realTimeInferenceConfig data))
  (.build builder))


(defn cfn-inference-experiment-model-infrastructure-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-model-infrastructure-config-property-builder (new CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder) id config))


(defn build-cfn-inference-experiment-model-variant-config-property-builder
  "The build-cfn-inference-experiment-model-variant-config-property-builder function updates a CfnInferenceExperiment$ModelVariantConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$ModelVariantConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `infrastructureConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment$ModelInfrastructureConfigProperty | [[cdk.support/lookup-entry]] | `:infrastructure-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |
"
  [^CfnInferenceExperiment$ModelVariantConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :infrastructure-config)]
    (. builder infrastructureConfig data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :variant-name)]
    (. builder variantName data))
  (.build builder))


(defn cfn-inference-experiment-model-variant-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-model-variant-config-property-builder (new CfnInferenceExperiment$ModelVariantConfigProperty$Builder) id config))


(defn build-cfn-inference-experiment-props-builder
  "The build-cfn-inference-experiment-props-builder function updates a CfnInferenceExperimentProps$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperimentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataStorageConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment$DataStorageConfigProperty | [[cdk.support/lookup-entry]] | `:data-storage-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `modelVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:model-variants` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `shadowModeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shadow-mode-config` |
| `statusReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:status-reason` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnInferenceExperimentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-storage-config)]
    (. builder dataStorageConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (lookup-entry config id :model-variants)]
    (. builder modelVariants data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :shadow-mode-config)]
    (. builder shadowModeConfig data))
  (when-let [data (lookup-entry config id :status-reason)]
    (. builder statusReason data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-inference-experiment-props-builder
  ""
  [id config]
  (build-cfn-inference-experiment-props-builder (new CfnInferenceExperimentProps$Builder) id config))


(defn build-cfn-inference-experiment-real-time-inference-config-property-builder
  "The build-cfn-inference-experiment-real-time-inference-config-property-builder function updates a CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
"
  [^CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (.build builder))


(defn cfn-inference-experiment-real-time-inference-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-real-time-inference-config-property-builder (new CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder) id config))


(defn build-cfn-inference-experiment-shadow-mode-config-property-builder
  "The build-cfn-inference-experiment-shadow-mode-config-property-builder function updates a CfnInferenceExperiment$ShadowModeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$ShadowModeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shadowModelVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:shadow-model-variants` |
| `sourceModelVariantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-model-variant-name` |
"
  [^CfnInferenceExperiment$ShadowModeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :shadow-model-variants)]
    (. builder shadowModelVariants data))
  (when-let [data (lookup-entry config id :source-model-variant-name)]
    (. builder sourceModelVariantName data))
  (.build builder))


(defn cfn-inference-experiment-shadow-mode-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-shadow-mode-config-property-builder (new CfnInferenceExperiment$ShadowModeConfigProperty$Builder) id config))


(defn build-cfn-inference-experiment-shadow-model-variant-config-property-builder
  "The build-cfn-inference-experiment-shadow-model-variant-config-property-builder function updates a CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `samplingPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-percentage` |
| `shadowModelVariantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:shadow-model-variant-name` |
"
  [^CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sampling-percentage)]
    (. builder samplingPercentage data))
  (when-let [data (lookup-entry config id :shadow-model-variant-name)]
    (. builder shadowModelVariantName data))
  (.build builder))


(defn cfn-inference-experiment-shadow-model-variant-config-property-builder
  ""
  [id config]
  (build-cfn-inference-experiment-shadow-model-variant-config-property-builder (new CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-batch-transform-input-property-builder
  "The build-cfn-model-bias-job-definition-batch-transform-input-property-builder function updates a CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `endTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time-offset` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `probabilityThresholdAttribute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-threshold-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |
"
  [^CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-captured-destination-s3-uri)]
    (. builder dataCapturedDestinationS3Uri data))
  (when-let [data (lookup-entry config id :dataset-format)]
    (. builder datasetFormat data))
  (when-let [data (lookup-entry config id :end-time-offset)]
    (. builder endTimeOffset data))
  (when-let [data (lookup-entry config id :features-attribute)]
    (. builder featuresAttribute data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :probability-threshold-attribute)]
    (. builder probabilityThresholdAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (when-let [data (lookup-entry config id :start-time-offset)]
    (. builder startTimeOffset data))
  (.build builder))


(defn cfn-model-bias-job-definition-batch-transform-input-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-batch-transform-input-property-builder (new CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-builder
  "The build-cfn-model-bias-job-definition-builder function updates a CfnModelBiasJobDefinition$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelBiasAppSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty | [[cdk.support/lookup-entry]] | `:model-bias-app-specification` |
| `modelBiasBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-bias-baseline-config` |
| `modelBiasJobInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-bias-job-input` |
| `modelBiasJobOutputConfig` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$MonitoringOutputConfigProperty | [[cdk.support/lookup-entry]] | `:model-bias-job-output-config` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelBiasJobDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-bias-app-specification)]
    (. builder modelBiasAppSpecification data))
  (when-let [data (lookup-entry config id :model-bias-baseline-config)]
    (. builder modelBiasBaselineConfig data))
  (when-let [data (lookup-entry config id :model-bias-job-input)]
    (. builder modelBiasJobInput data))
  (when-let [data (lookup-entry config id :model-bias-job-output-config)]
    (. builder modelBiasJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-bias-job-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-bias-job-definition-builder (CfnModelBiasJobDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-model-bias-job-definition-cluster-config-property-builder
  "The build-cfn-model-bias-job-definition-cluster-config-property-builder function updates a CfnModelBiasJobDefinition$ClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$ClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnModelBiasJobDefinition$ClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-model-bias-job-definition-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-cluster-config-property-builder (new CfnModelBiasJobDefinition$ClusterConfigProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-constraints-resource-property-builder
  "The build-cfn-model-bias-job-definition-constraints-resource-property-builder function updates a CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-bias-job-definition-constraints-resource-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-constraints-resource-property-builder (new CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-csv-property-builder
  "The build-cfn-model-bias-job-definition-csv-property-builder function updates a CfnModelBiasJobDefinition$CsvProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$CsvProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnModelBiasJobDefinition$CsvProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-model-bias-job-definition-csv-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-csv-property-builder (new CfnModelBiasJobDefinition$CsvProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-dataset-format-property-builder
  "The build-cfn-model-bias-job-definition-dataset-format-property-builder function updates a CfnModelBiasJobDefinition$DatasetFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$DatasetFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$CsvProperty | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$JsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |
"
  [^CfnModelBiasJobDefinition$DatasetFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :parquet)]
    (. builder parquet data))
  (.build builder))


(defn cfn-model-bias-job-definition-dataset-format-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-dataset-format-property-builder (new CfnModelBiasJobDefinition$DatasetFormatProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-endpoint-input-property-builder
  "The build-cfn-model-bias-job-definition-endpoint-input-property-builder function updates a CfnModelBiasJobDefinition$EndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$EndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time-offset` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `probabilityThresholdAttribute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-threshold-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |
"
  [^CfnModelBiasJobDefinition$EndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time-offset)]
    (. builder endTimeOffset data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :features-attribute)]
    (. builder featuresAttribute data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :probability-threshold-attribute)]
    (. builder probabilityThresholdAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (when-let [data (lookup-entry config id :start-time-offset)]
    (. builder startTimeOffset data))
  (.build builder))


(defn cfn-model-bias-job-definition-endpoint-input-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-endpoint-input-property-builder (new CfnModelBiasJobDefinition$EndpointInputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-json-property-builder
  "The build-cfn-model-bias-job-definition-json-property-builder function updates a CfnModelBiasJobDefinition$JsonProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$JsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |
"
  [^CfnModelBiasJobDefinition$JsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :line)]
    (. builder line data))
  (.build builder))


(defn cfn-model-bias-job-definition-json-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-json-property-builder (new CfnModelBiasJobDefinition$JsonProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-model-bias-app-specification-property-builder
  "The build-cfn-model-bias-job-definition-model-bias-app-specification-property-builder function updates a CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-uri` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
"
  [^CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :config-uri)]
    (. builder configUri data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (.build builder))


(defn cfn-model-bias-job-definition-model-bias-app-specification-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-model-bias-app-specification-property-builder (new CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-model-bias-baseline-config-property-builder
  "The build-cfn-model-bias-job-definition-model-bias-baseline-config-property-builder function updates a CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |
"
  [^CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :baselining-job-name)]
    (. builder baseliningJobName data))
  (when-let [data (lookup-entry config id :constraints-resource)]
    (. builder constraintsResource data))
  (.build builder))


(defn cfn-model-bias-job-definition-model-bias-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-model-bias-baseline-config-property-builder (new CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-model-bias-job-input-property-builder
  "The build-cfn-model-bias-job-definition-model-bias-job-input-property-builder function updates a CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
| `groundTruthS3Input` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty | [[cdk.support/lookup-entry]] | `:ground-truth-s3-input` |
"
  [^CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-transform-input)]
    (. builder batchTransformInput data))
  (when-let [data (lookup-entry config id :endpoint-input)]
    (. builder endpointInput data))
  (when-let [data (lookup-entry config id :ground-truth-s3-input)]
    (. builder groundTruthS3Input data))
  (.build builder))


(defn cfn-model-bias-job-definition-model-bias-job-input-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-model-bias-job-input-property-builder (new CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder
  "The build-cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder function updates a CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder (new CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-monitoring-output-config-property-builder
  "The build-cfn-model-bias-job-definition-monitoring-output-config-property-builder function updates a CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |
"
  [^CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :monitoring-outputs)]
    (. builder monitoringOutputs data))
  (.build builder))


(defn cfn-model-bias-job-definition-monitoring-output-config-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-monitoring-output-config-property-builder (new CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-monitoring-output-property-builder
  "The build-cfn-model-bias-job-definition-monitoring-output-property-builder function updates a CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |
"
  [^CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-output)]
    (. builder s3Output data))
  (.build builder))


(defn cfn-model-bias-job-definition-monitoring-output-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-monitoring-output-property-builder (new CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-monitoring-resources-property-builder
  "The build-cfn-model-bias-job-definition-monitoring-resources-property-builder function updates a CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |
"
  [^CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-config)]
    (. builder clusterConfig data))
  (.build builder))


(defn cfn-model-bias-job-definition-monitoring-resources-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-monitoring-resources-property-builder (new CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-network-config-property-builder
  "The build-cfn-model-bias-job-definition-network-config-property-builder function updates a CfnModelBiasJobDefinition$NetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$NetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnModelBiasJobDefinition$NetworkConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
    (. builder enableInterContainerTrafficEncryption data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-model-bias-job-definition-network-config-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-network-config-property-builder (new CfnModelBiasJobDefinition$NetworkConfigProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-props-builder
  "The build-cfn-model-bias-job-definition-props-builder function updates a CfnModelBiasJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelBiasAppSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-bias-app-specification` |
| `modelBiasBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-bias-baseline-config` |
| `modelBiasJobInput` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$ModelBiasJobInputProperty | [[cdk.support/lookup-entry]] | `:model-bias-job-input` |
| `modelBiasJobOutputConfig` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$MonitoringOutputConfigProperty | [[cdk.support/lookup-entry]] | `:model-bias-job-output-config` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelBiasJobDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-bias-app-specification)]
    (. builder modelBiasAppSpecification data))
  (when-let [data (lookup-entry config id :model-bias-baseline-config)]
    (. builder modelBiasBaselineConfig data))
  (when-let [data (lookup-entry config id :model-bias-job-input)]
    (. builder modelBiasJobInput data))
  (when-let [data (lookup-entry config id :model-bias-job-output-config)]
    (. builder modelBiasJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-bias-job-definition-props-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-props-builder (new CfnModelBiasJobDefinitionProps$Builder) id config))


(defn build-cfn-model-bias-job-definition-s3-output-property-builder
  "The build-cfn-model-bias-job-definition-s3-output-property-builder function updates a CfnModelBiasJobDefinition$S3OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$S3OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelBiasJobDefinition$S3OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-upload-mode)]
    (. builder s3UploadMode data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-bias-job-definition-s3-output-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-s3-output-property-builder (new CfnModelBiasJobDefinition$S3OutputProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-stopping-condition-property-builder
  "The build-cfn-model-bias-job-definition-stopping-condition-property-builder function updates a CfnModelBiasJobDefinition$StoppingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$StoppingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |
"
  [^CfnModelBiasJobDefinition$StoppingConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
    (. builder maxRuntimeInSeconds data))
  (.build builder))


(defn cfn-model-bias-job-definition-stopping-condition-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-stopping-condition-property-builder (new CfnModelBiasJobDefinition$StoppingConditionProperty$Builder) id config))


(defn build-cfn-model-bias-job-definition-vpc-config-property-builder
  "The build-cfn-model-bias-job-definition-vpc-config-property-builder function updates a CfnModelBiasJobDefinition$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelBiasJobDefinition$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnModelBiasJobDefinition$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-model-bias-job-definition-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-model-bias-job-definition-vpc-config-property-builder (new CfnModelBiasJobDefinition$VpcConfigProperty$Builder) id config))


(defn build-cfn-model-builder
  "The build-cfn-model-builder function updates a CfnModel$Builder instance using the provided configuration.
  The function takes the CfnModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceExecutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-execution-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `primaryContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-container` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnModel$Builder builder id config]
  (when-let [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :inference-execution-config)]
    (. builder inferenceExecutionConfig data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :primary-container)]
    (. builder primaryContainer data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-model-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-builder (CfnModel$Builder/create scope (name id)) id config))


(defn build-cfn-model-card-additional-information-property-builder
  "The build-cfn-model-card-additional-information-property-builder function updates a CfnModelCard$AdditionalInformationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$AdditionalInformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caveatsAndRecommendations` | java.lang.String | [[cdk.support/lookup-entry]] | `:caveats-and-recommendations` |
| `customDetails` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-details` |
| `ethicalConsiderations` | java.lang.String | [[cdk.support/lookup-entry]] | `:ethical-considerations` |
"
  [^CfnModelCard$AdditionalInformationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :caveats-and-recommendations)]
    (. builder caveatsAndRecommendations data))
  (when-let [data (lookup-entry config id :custom-details)]
    (. builder customDetails data))
  (when-let [data (lookup-entry config id :ethical-considerations)]
    (. builder ethicalConsiderations data))
  (.build builder))


(defn cfn-model-card-additional-information-property-builder
  ""
  [id config]
  (build-cfn-model-card-additional-information-property-builder (new CfnModelCard$AdditionalInformationProperty$Builder) id config))


(defn build-cfn-model-card-builder
  "The build-cfn-model-card-builder function updates a CfnModelCard$Builder instance using the provided configuration.
  The function takes the CfnModelCard$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `createdBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:created-by` |
| `lastModifiedBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-modified-by` |
| `modelCardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-name` |
| `modelCardStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-status` |
| `securityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelCard$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-let [data (lookup-entry config id :last-modified-by)]
    (. builder lastModifiedBy data))
  (when-let [data (lookup-entry config id :model-card-name)]
    (. builder modelCardName data))
  (when-let [data (lookup-entry config id :model-card-status)]
    (. builder modelCardStatus data))
  (when-let [data (lookup-entry config id :security-config)]
    (. builder securityConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-card-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-card-builder (CfnModelCard$Builder/create scope (name id)) id config))


(defn build-cfn-model-card-business-details-property-builder
  "The build-cfn-model-card-business-details-property-builder function updates a CfnModelCard$BusinessDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$BusinessDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessProblem` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-problem` |
| `businessStakeholders` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-stakeholders` |
| `lineOfBusiness` | java.lang.String | [[cdk.support/lookup-entry]] | `:line-of-business` |
"
  [^CfnModelCard$BusinessDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :business-problem)]
    (. builder businessProblem data))
  (when-let [data (lookup-entry config id :business-stakeholders)]
    (. builder businessStakeholders data))
  (when-let [data (lookup-entry config id :line-of-business)]
    (. builder lineOfBusiness data))
  (.build builder))


(defn cfn-model-card-business-details-property-builder
  ""
  [id config]
  (build-cfn-model-card-business-details-property-builder (new CfnModelCard$BusinessDetailsProperty$Builder) id config))


(defn build-cfn-model-card-container-property-builder
  "The build-cfn-model-card-container-property-builder function updates a CfnModelCard$ContainerProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ContainerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
| `nearestModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nearest-model-name` |
"
  [^CfnModelCard$ContainerProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :image)]
    (. builder image data))
  (when-let [data (lookup-entry config id :model-data-url)]
    (. builder modelDataUrl data))
  (when-let [data (lookup-entry config id :nearest-model-name)]
    (. builder nearestModelName data))
  (.build builder))


(defn cfn-model-card-container-property-builder
  ""
  [id config]
  (build-cfn-model-card-container-property-builder (new CfnModelCard$ContainerProperty$Builder) id config))


(defn build-cfn-model-card-content-property-builder
  "The build-cfn-model-card-content-property-builder function updates a CfnModelCard$ContentProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInformation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-information` |
| `businessDetails` | software.amazon.awscdk.services.sagemaker.CfnModelCard$BusinessDetailsProperty | [[cdk.support/lookup-entry]] | `:business-details` |
| `evaluationDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluation-details` |
| `intendedUses` | software.amazon.awscdk.services.sagemaker.CfnModelCard$IntendedUsesProperty | [[cdk.support/lookup-entry]] | `:intended-uses` |
| `modelOverview` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ModelOverviewProperty | [[cdk.support/lookup-entry]] | `:model-overview` |
| `modelPackageDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-package-details` |
| `trainingDetails` | software.amazon.awscdk.services.sagemaker.CfnModelCard$TrainingDetailsProperty | [[cdk.support/lookup-entry]] | `:training-details` |
"
  [^CfnModelCard$ContentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-information)]
    (. builder additionalInformation data))
  (when-let [data (lookup-entry config id :business-details)]
    (. builder businessDetails data))
  (when-let [data (lookup-entry config id :evaluation-details)]
    (. builder evaluationDetails data))
  (when-let [data (lookup-entry config id :intended-uses)]
    (. builder intendedUses data))
  (when-let [data (lookup-entry config id :model-overview)]
    (. builder modelOverview data))
  (when-let [data (lookup-entry config id :model-package-details)]
    (. builder modelPackageDetails data))
  (when-let [data (lookup-entry config id :training-details)]
    (. builder trainingDetails data))
  (.build builder))


(defn cfn-model-card-content-property-builder
  ""
  [id config]
  (build-cfn-model-card-content-property-builder (new CfnModelCard$ContentProperty$Builder) id config))


(defn build-cfn-model-card-evaluation-detail-property-builder
  "The build-cfn-model-card-evaluation-detail-property-builder function updates a CfnModelCard$EvaluationDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$EvaluationDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasets` | java.util.List | [[cdk.support/lookup-entry]] | `:datasets` |
| `evaluationJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-job-arn` |
| `evaluationObservation` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-observation` |
| `metadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metadata` |
| `metricGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-groups` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnModelCard$EvaluationDetailProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :datasets)]
    (. builder datasets data))
  (when-let [data (lookup-entry config id :evaluation-job-arn)]
    (. builder evaluationJobArn data))
  (when-let [data (lookup-entry config id :evaluation-observation)]
    (. builder evaluationObservation data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :metric-groups)]
    (. builder metricGroups data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-model-card-evaluation-detail-property-builder
  ""
  [id config]
  (build-cfn-model-card-evaluation-detail-property-builder (new CfnModelCard$EvaluationDetailProperty$Builder) id config))


(defn build-cfn-model-card-function-property-builder
  "The build-cfn-model-card-function-property-builder function updates a CfnModelCard$FunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$FunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `facet` | java.lang.String | [[cdk.support/lookup-entry]] | `:facet` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
"
  [^CfnModelCard$FunctionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :facet)]
    (. builder facet data))
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (.build builder))


(defn cfn-model-card-function-property-builder
  ""
  [id config]
  (build-cfn-model-card-function-property-builder (new CfnModelCard$FunctionProperty$Builder) id config))


(defn build-cfn-model-card-inference-environment-property-builder
  "The build-cfn-model-card-inference-environment-property-builder function updates a CfnModelCard$InferenceEnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$InferenceEnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerImage` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image` |
"
  [^CfnModelCard$InferenceEnvironmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-image)]
    (. builder containerImage data))
  (.build builder))


(defn cfn-model-card-inference-environment-property-builder
  ""
  [id config]
  (build-cfn-model-card-inference-environment-property-builder (new CfnModelCard$InferenceEnvironmentProperty$Builder) id config))


(defn build-cfn-model-card-inference-specification-property-builder
  "The build-cfn-model-card-inference-specification-property-builder function updates a CfnModelCard$InferenceSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$InferenceSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
"
  [^CfnModelCard$InferenceSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :containers)]
    (. builder containers data))
  (.build builder))


(defn cfn-model-card-inference-specification-property-builder
  ""
  [id config]
  (build-cfn-model-card-inference-specification-property-builder (new CfnModelCard$InferenceSpecificationProperty$Builder) id config))


(defn build-cfn-model-card-intended-uses-property-builder
  "The build-cfn-model-card-intended-uses-property-builder function updates a CfnModelCard$IntendedUsesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$IntendedUsesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `explanationsForRiskRating` | java.lang.String | [[cdk.support/lookup-entry]] | `:explanations-for-risk-rating` |
| `factorsAffectingModelEfficiency` | java.lang.String | [[cdk.support/lookup-entry]] | `:factors-affecting-model-efficiency` |
| `intendedUses` | java.lang.String | [[cdk.support/lookup-entry]] | `:intended-uses` |
| `purposeOfModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:purpose-of-model` |
| `riskRating` | java.lang.String | [[cdk.support/lookup-entry]] | `:risk-rating` |
"
  [^CfnModelCard$IntendedUsesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :explanations-for-risk-rating)]
    (. builder explanationsForRiskRating data))
  (when-let [data (lookup-entry config id :factors-affecting-model-efficiency)]
    (. builder factorsAffectingModelEfficiency data))
  (when-let [data (lookup-entry config id :intended-uses)]
    (. builder intendedUses data))
  (when-let [data (lookup-entry config id :purpose-of-model)]
    (. builder purposeOfModel data))
  (when-let [data (lookup-entry config id :risk-rating)]
    (. builder riskRating data))
  (.build builder))


(defn cfn-model-card-intended-uses-property-builder
  ""
  [id config]
  (build-cfn-model-card-intended-uses-property-builder (new CfnModelCard$IntendedUsesProperty$Builder) id config))


(defn build-cfn-model-card-metric-data-items-property-builder
  "The build-cfn-model-card-metric-data-items-property-builder function updates a CfnModelCard$MetricDataItemsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$MetricDataItemsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
| `xAxisName` | java.util.List | [[cdk.support/lookup-entry]] | `:x-axis-name` |
| `yAxisName` | java.util.List | [[cdk.support/lookup-entry]] | `:y-axis-name` |
"
  [^CfnModelCard$MetricDataItemsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :notes)]
    (. builder notes data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :x-axis-name)]
    (. builder xAxisName data))
  (when-let [data (lookup-entry config id :y-axis-name)]
    (. builder yAxisName data))
  (.build builder))


(defn cfn-model-card-metric-data-items-property-builder
  ""
  [id config]
  (build-cfn-model-card-metric-data-items-property-builder (new CfnModelCard$MetricDataItemsProperty$Builder) id config))


(defn build-cfn-model-card-metric-group-property-builder
  "The build-cfn-model-card-metric-group-property-builder function updates a CfnModelCard$MetricGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$MetricGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricData` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnModelCard$MetricGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :metric-data)]
    (. builder metricData data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-model-card-metric-group-property-builder
  ""
  [id config]
  (build-cfn-model-card-metric-group-property-builder (new CfnModelCard$MetricGroupProperty$Builder) id config))


(defn build-cfn-model-card-model-overview-property-builder
  "The build-cfn-model-card-model-overview-property-builder function updates a CfnModelCard$ModelOverviewProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ModelOverviewProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmType` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-type` |
| `inferenceEnvironment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-environment` |
| `modelArtifact` | java.util.List | [[cdk.support/lookup-entry]] | `:model-artifact` |
| `modelCreator` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-creator` |
| `modelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-description` |
| `modelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-id` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `modelOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-owner` |
| `modelVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-version` |
| `problemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:problem-type` |
"
  [^CfnModelCard$ModelOverviewProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :algorithm-type)]
    (. builder algorithmType data))
  (when-let [data (lookup-entry config id :inference-environment)]
    (. builder inferenceEnvironment data))
  (when-let [data (lookup-entry config id :model-artifact)]
    (. builder modelArtifact data))
  (when-let [data (lookup-entry config id :model-creator)]
    (. builder modelCreator data))
  (when-let [data (lookup-entry config id :model-description)]
    (. builder modelDescription data))
  (when-let [data (lookup-entry config id :model-id)]
    (. builder modelId data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :model-owner)]
    (. builder modelOwner data))
  (when-let [data (lookup-entry config id :model-version)]
    (. builder modelVersion data))
  (when-let [data (lookup-entry config id :problem-type)]
    (. builder problemType data))
  (.build builder))


(defn cfn-model-card-model-overview-property-builder
  ""
  [id config]
  (build-cfn-model-card-model-overview-property-builder (new CfnModelCard$ModelOverviewProperty$Builder) id config))


(defn build-cfn-model-card-model-package-creator-property-builder
  "The build-cfn-model-card-model-package-creator-property-builder function updates a CfnModelCard$ModelPackageCreatorProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ModelPackageCreatorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
"
  [^CfnModelCard$ModelPackageCreatorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (.build builder))


(defn cfn-model-card-model-package-creator-property-builder
  ""
  [id config]
  (build-cfn-model-card-model-package-creator-property-builder (new CfnModelCard$ModelPackageCreatorProperty$Builder) id config))


(defn build-cfn-model-card-model-package-details-property-builder
  "The build-cfn-model-card-model-package-details-property-builder function updates a CfnModelCard$ModelPackageDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ModelPackageDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approvalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:approval-description` |
| `createdBy` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ModelPackageCreatorProperty | [[cdk.support/lookup-entry]] | `:created-by` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `inferenceSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelCard$InferenceSpecificationProperty | [[cdk.support/lookup-entry]] | `:inference-specification` |
| `modelApprovalStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-approval-status` |
| `modelPackageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-arn` |
| `modelPackageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelPackageStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-status` |
| `modelPackageVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-package-version` |
| `sourceAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-algorithms` |
| `task` | java.lang.String | [[cdk.support/lookup-entry]] | `:task` |
"
  [^CfnModelCard$ModelPackageDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :approval-description)]
    (. builder approvalDescription data))
  (when-let [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :inference-specification)]
    (. builder inferenceSpecification data))
  (when-let [data (lookup-entry config id :model-approval-status)]
    (. builder modelApprovalStatus data))
  (when-let [data (lookup-entry config id :model-package-arn)]
    (. builder modelPackageArn data))
  (when-let [data (lookup-entry config id :model-package-description)]
    (. builder modelPackageDescription data))
  (when-let [data (lookup-entry config id :model-package-group-name)]
    (. builder modelPackageGroupName data))
  (when-let [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-let [data (lookup-entry config id :model-package-status)]
    (. builder modelPackageStatus data))
  (when-let [data (lookup-entry config id :model-package-version)]
    (. builder modelPackageVersion data))
  (when-let [data (lookup-entry config id :source-algorithms)]
    (. builder sourceAlgorithms data))
  (when-let [data (lookup-entry config id :task)]
    (. builder task data))
  (.build builder))


(defn cfn-model-card-model-package-details-property-builder
  ""
  [id config]
  (build-cfn-model-card-model-package-details-property-builder (new CfnModelCard$ModelPackageDetailsProperty$Builder) id config))


(defn build-cfn-model-card-objective-function-property-builder
  "The build-cfn-model-card-objective-function-property-builder function updates a CfnModelCard$ObjectiveFunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$ObjectiveFunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.sagemaker.CfnModelCard$FunctionProperty | [[cdk.support/lookup-entry]] | `:function` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |
"
  [^CfnModelCard$ObjectiveFunctionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function)]
    (. builder function data))
  (when-let [data (lookup-entry config id :notes)]
    (. builder notes data))
  (.build builder))


(defn cfn-model-card-objective-function-property-builder
  ""
  [id config]
  (build-cfn-model-card-objective-function-property-builder (new CfnModelCard$ObjectiveFunctionProperty$Builder) id config))


(defn build-cfn-model-card-props-builder
  "The build-cfn-model-card-props-builder function updates a CfnModelCardProps$Builder instance using the provided configuration.
  The function takes the CfnModelCardProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `createdBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:created-by` |
| `lastModifiedBy` | software.amazon.awscdk.services.sagemaker.CfnModelCard$UserContextProperty | [[cdk.support/lookup-entry]] | `:last-modified-by` |
| `modelCardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-name` |
| `modelCardStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-status` |
| `securityConfig` | software.amazon.awscdk.services.sagemaker.CfnModelCard$SecurityConfigProperty | [[cdk.support/lookup-entry]] | `:security-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelCardProps$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-let [data (lookup-entry config id :last-modified-by)]
    (. builder lastModifiedBy data))
  (when-let [data (lookup-entry config id :model-card-name)]
    (. builder modelCardName data))
  (when-let [data (lookup-entry config id :model-card-status)]
    (. builder modelCardStatus data))
  (when-let [data (lookup-entry config id :security-config)]
    (. builder securityConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-card-props-builder
  ""
  [id config]
  (build-cfn-model-card-props-builder (new CfnModelCardProps$Builder) id config))


(defn build-cfn-model-card-security-config-property-builder
  "The build-cfn-model-card-security-config-property-builder function updates a CfnModelCard$SecurityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$SecurityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnModelCard$SecurityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-model-card-security-config-property-builder
  ""
  [id config]
  (build-cfn-model-card-security-config-property-builder (new CfnModelCard$SecurityConfigProperty$Builder) id config))


(defn build-cfn-model-card-source-algorithm-property-builder
  "The build-cfn-model-card-source-algorithm-property-builder function updates a CfnModelCard$SourceAlgorithmProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$SourceAlgorithmProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
"
  [^CfnModelCard$SourceAlgorithmProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :algorithm-name)]
    (. builder algorithmName data))
  (when-let [data (lookup-entry config id :model-data-url)]
    (. builder modelDataUrl data))
  (.build builder))


(defn cfn-model-card-source-algorithm-property-builder
  ""
  [id config]
  (build-cfn-model-card-source-algorithm-property-builder (new CfnModelCard$SourceAlgorithmProperty$Builder) id config))


(defn build-cfn-model-card-training-details-property-builder
  "The build-cfn-model-card-training-details-property-builder function updates a CfnModelCard$TrainingDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$TrainingDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectiveFunction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:objective-function` |
| `trainingJobDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-job-details` |
| `trainingObservations` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-observations` |
"
  [^CfnModelCard$TrainingDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :objective-function)]
    (. builder objectiveFunction data))
  (when-let [data (lookup-entry config id :training-job-details)]
    (. builder trainingJobDetails data))
  (when-let [data (lookup-entry config id :training-observations)]
    (. builder trainingObservations data))
  (.build builder))


(defn cfn-model-card-training-details-property-builder
  ""
  [id config]
  (build-cfn-model-card-training-details-property-builder (new CfnModelCard$TrainingDetailsProperty$Builder) id config))


(defn build-cfn-model-card-training-environment-property-builder
  "The build-cfn-model-card-training-environment-property-builder function updates a CfnModelCard$TrainingEnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$TrainingEnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerImage` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image` |
"
  [^CfnModelCard$TrainingEnvironmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-image)]
    (. builder containerImage data))
  (.build builder))


(defn cfn-model-card-training-environment-property-builder
  ""
  [id config]
  (build-cfn-model-card-training-environment-property-builder (new CfnModelCard$TrainingEnvironmentProperty$Builder) id config))


(defn build-cfn-model-card-training-hyper-parameter-property-builder
  "The build-cfn-model-card-training-hyper-parameter-property-builder function updates a CfnModelCard$TrainingHyperParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$TrainingHyperParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnModelCard$TrainingHyperParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-model-card-training-hyper-parameter-property-builder
  ""
  [id config]
  (build-cfn-model-card-training-hyper-parameter-property-builder (new CfnModelCard$TrainingHyperParameterProperty$Builder) id config))


(defn build-cfn-model-card-training-job-details-property-builder
  "The build-cfn-model-card-training-job-details-property-builder function updates a CfnModelCard$TrainingJobDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$TrainingJobDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hyperParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hyper-parameters` |
| `trainingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-arn` |
| `trainingDatasets` | java.util.List | [[cdk.support/lookup-entry]] | `:training-datasets` |
| `trainingEnvironment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-environment` |
| `trainingMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:training-metrics` |
| `userProvidedHyperParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:user-provided-hyper-parameters` |
| `userProvidedTrainingMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-provided-training-metrics` |
"
  [^CfnModelCard$TrainingJobDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :hyper-parameters)]
    (. builder hyperParameters data))
  (when-let [data (lookup-entry config id :training-arn)]
    (. builder trainingArn data))
  (when-let [data (lookup-entry config id :training-datasets)]
    (. builder trainingDatasets data))
  (when-let [data (lookup-entry config id :training-environment)]
    (. builder trainingEnvironment data))
  (when-let [data (lookup-entry config id :training-metrics)]
    (. builder trainingMetrics data))
  (when-let [data (lookup-entry config id :user-provided-hyper-parameters)]
    (. builder userProvidedHyperParameters data))
  (when-let [data (lookup-entry config id :user-provided-training-metrics)]
    (. builder userProvidedTrainingMetrics data))
  (.build builder))


(defn cfn-model-card-training-job-details-property-builder
  ""
  [id config]
  (build-cfn-model-card-training-job-details-property-builder (new CfnModelCard$TrainingJobDetailsProperty$Builder) id config))


(defn build-cfn-model-card-training-metric-property-builder
  "The build-cfn-model-card-training-metric-property-builder function updates a CfnModelCard$TrainingMetricProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$TrainingMetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnModelCard$TrainingMetricProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :notes)]
    (. builder notes data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-model-card-training-metric-property-builder
  ""
  [id config]
  (build-cfn-model-card-training-metric-property-builder (new CfnModelCard$TrainingMetricProperty$Builder) id config))


(defn build-cfn-model-card-user-context-property-builder
  "The build-cfn-model-card-user-context-property-builder function updates a CfnModelCard$UserContextProperty$Builder instance using the provided configuration.
  The function takes the CfnModelCard$UserContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `userProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-arn` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
"
  [^CfnModelCard$UserContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :user-profile-arn)]
    (. builder userProfileArn data))
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (.build builder))


(defn cfn-model-card-user-context-property-builder
  ""
  [id config]
  (build-cfn-model-card-user-context-property-builder (new CfnModelCard$UserContextProperty$Builder) id config))


(defn build-cfn-model-container-definition-property-builder
  "The build-cfn-model-container-definition-property-builder function updates a CfnModel$ContainerDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$ContainerDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-hostname` |
| `environment` | java.lang.Object | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `imageConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$ImageConfigProperty | [[cdk.support/lookup-entry]] | `:image-config` |
| `inferenceSpecificationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-specification-name` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `modelDataSource` | software.amazon.awscdk.services.sagemaker.CfnModel$ModelDataSourceProperty | [[cdk.support/lookup-entry]] | `:model-data-source` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `multiModelConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$MultiModelConfigProperty | [[cdk.support/lookup-entry]] | `:multi-model-config` |
"
  [^CfnModel$ContainerDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-hostname)]
    (. builder containerHostname data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image)]
    (. builder image data))
  (when-let [data (lookup-entry config id :image-config)]
    (. builder imageConfig data))
  (when-let [data (lookup-entry config id :inference-specification-name)]
    (. builder inferenceSpecificationName data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :model-data-source)]
    (. builder modelDataSource data))
  (when-let [data (lookup-entry config id :model-data-url)]
    (. builder modelDataUrl data))
  (when-let [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-let [data (lookup-entry config id :multi-model-config)]
    (. builder multiModelConfig data))
  (.build builder))


(defn cfn-model-container-definition-property-builder
  ""
  [id config]
  (build-cfn-model-container-definition-property-builder (new CfnModel$ContainerDefinitionProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-batch-transform-input-property-builder
  "The build-cfn-model-explainability-job-definition-batch-transform-input-property-builder function updates a CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-captured-destination-s3-uri)]
    (. builder dataCapturedDestinationS3Uri data))
  (when-let [data (lookup-entry config id :dataset-format)]
    (. builder datasetFormat data))
  (when-let [data (lookup-entry config id :features-attribute)]
    (. builder featuresAttribute data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-model-explainability-job-definition-batch-transform-input-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-batch-transform-input-property-builder (new CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-builder
  "The build-cfn-model-explainability-job-definition-builder function updates a CfnModelExplainabilityJobDefinition$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelExplainabilityAppSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-explainability-app-specification` |
| `modelExplainabilityBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-explainability-baseline-config` |
| `modelExplainabilityJobInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-explainability-job-input` |
| `modelExplainabilityJobOutputConfig` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty | [[cdk.support/lookup-entry]] | `:model-explainability-job-output-config` |
| `networkConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelExplainabilityJobDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-explainability-app-specification)]
    (. builder modelExplainabilityAppSpecification data))
  (when-let [data (lookup-entry config id :model-explainability-baseline-config)]
    (. builder modelExplainabilityBaselineConfig data))
  (when-let [data (lookup-entry config id :model-explainability-job-input)]
    (. builder modelExplainabilityJobInput data))
  (when-let [data (lookup-entry config id :model-explainability-job-output-config)]
    (. builder modelExplainabilityJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-explainability-job-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-explainability-job-definition-builder (CfnModelExplainabilityJobDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-model-explainability-job-definition-cluster-config-property-builder
  "The build-cfn-model-explainability-job-definition-cluster-config-property-builder function updates a CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-model-explainability-job-definition-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-cluster-config-property-builder (new CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-constraints-resource-property-builder
  "The build-cfn-model-explainability-job-definition-constraints-resource-property-builder function updates a CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-explainability-job-definition-constraints-resource-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-constraints-resource-property-builder (new CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-csv-property-builder
  "The build-cfn-model-explainability-job-definition-csv-property-builder function updates a CfnModelExplainabilityJobDefinition$CsvProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$CsvProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnModelExplainabilityJobDefinition$CsvProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-model-explainability-job-definition-csv-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-csv-property-builder (new CfnModelExplainabilityJobDefinition$CsvProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-dataset-format-property-builder
  "The build-cfn-model-explainability-job-definition-dataset-format-property-builder function updates a CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$JsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |
"
  [^CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :parquet)]
    (. builder parquet data))
  (.build builder))


(defn cfn-model-explainability-job-definition-dataset-format-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-dataset-format-property-builder (new CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-endpoint-input-property-builder
  "The build-cfn-model-explainability-job-definition-endpoint-input-property-builder function updates a CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :features-attribute)]
    (. builder featuresAttribute data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-model-explainability-job-definition-endpoint-input-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-endpoint-input-property-builder (new CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-json-property-builder
  "The build-cfn-model-explainability-job-definition-json-property-builder function updates a CfnModelExplainabilityJobDefinition$JsonProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$JsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |
"
  [^CfnModelExplainabilityJobDefinition$JsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :line)]
    (. builder line data))
  (.build builder))


(defn cfn-model-explainability-job-definition-json-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-json-property-builder (new CfnModelExplainabilityJobDefinition$JsonProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder
  "The build-cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder function updates a CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-uri` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
"
  [^CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :config-uri)]
    (. builder configUri data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (.build builder))


(defn cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder (new CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder
  "The build-cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder function updates a CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |
"
  [^CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :baselining-job-name)]
    (. builder baseliningJobName data))
  (when-let [data (lookup-entry config id :constraints-resource)]
    (. builder constraintsResource data))
  (.build builder))


(defn cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder (new CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-model-explainability-job-input-property-builder
  "The build-cfn-model-explainability-job-definition-model-explainability-job-input-property-builder function updates a CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$BatchTransformInputProperty | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
"
  [^CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-transform-input)]
    (. builder batchTransformInput data))
  (when-let [data (lookup-entry config id :endpoint-input)]
    (. builder endpointInput data))
  (.build builder))


(defn cfn-model-explainability-job-definition-model-explainability-job-input-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-model-explainability-job-input-property-builder (new CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-monitoring-output-config-property-builder
  "The build-cfn-model-explainability-job-definition-monitoring-output-config-property-builder function updates a CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |
"
  [^CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :monitoring-outputs)]
    (. builder monitoringOutputs data))
  (.build builder))


(defn cfn-model-explainability-job-definition-monitoring-output-config-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-monitoring-output-config-property-builder (new CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-monitoring-output-property-builder
  "The build-cfn-model-explainability-job-definition-monitoring-output-property-builder function updates a CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |
"
  [^CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-output)]
    (. builder s3Output data))
  (.build builder))


(defn cfn-model-explainability-job-definition-monitoring-output-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-monitoring-output-property-builder (new CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-monitoring-resources-property-builder
  "The build-cfn-model-explainability-job-definition-monitoring-resources-property-builder function updates a CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |
"
  [^CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-config)]
    (. builder clusterConfig data))
  (.build builder))


(defn cfn-model-explainability-job-definition-monitoring-resources-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-monitoring-resources-property-builder (new CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-network-config-property-builder
  "The build-cfn-model-explainability-job-definition-network-config-property-builder function updates a CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
    (. builder enableInterContainerTrafficEncryption data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-model-explainability-job-definition-network-config-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-network-config-property-builder (new CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-props-builder
  "The build-cfn-model-explainability-job-definition-props-builder function updates a CfnModelExplainabilityJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelExplainabilityAppSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty | [[cdk.support/lookup-entry]] | `:model-explainability-app-specification` |
| `modelExplainabilityBaselineConfig` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty | [[cdk.support/lookup-entry]] | `:model-explainability-baseline-config` |
| `modelExplainabilityJobInput` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty | [[cdk.support/lookup-entry]] | `:model-explainability-job-input` |
| `modelExplainabilityJobOutputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-explainability-job-output-config` |
| `networkConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelExplainabilityJobDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-explainability-app-specification)]
    (. builder modelExplainabilityAppSpecification data))
  (when-let [data (lookup-entry config id :model-explainability-baseline-config)]
    (. builder modelExplainabilityBaselineConfig data))
  (when-let [data (lookup-entry config id :model-explainability-job-input)]
    (. builder modelExplainabilityJobInput data))
  (when-let [data (lookup-entry config id :model-explainability-job-output-config)]
    (. builder modelExplainabilityJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-explainability-job-definition-props-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-props-builder (new CfnModelExplainabilityJobDefinitionProps$Builder) id config))


(defn build-cfn-model-explainability-job-definition-s3-output-property-builder
  "The build-cfn-model-explainability-job-definition-s3-output-property-builder function updates a CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-upload-mode)]
    (. builder s3UploadMode data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-explainability-job-definition-s3-output-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-s3-output-property-builder (new CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-stopping-condition-property-builder
  "The build-cfn-model-explainability-job-definition-stopping-condition-property-builder function updates a CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |
"
  [^CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
    (. builder maxRuntimeInSeconds data))
  (.build builder))


(defn cfn-model-explainability-job-definition-stopping-condition-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-stopping-condition-property-builder (new CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder) id config))


(defn build-cfn-model-explainability-job-definition-vpc-config-property-builder
  "The build-cfn-model-explainability-job-definition-vpc-config-property-builder function updates a CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-model-explainability-job-definition-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-model-explainability-job-definition-vpc-config-property-builder (new CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder) id config))


(defn build-cfn-model-image-config-property-builder
  "The build-cfn-model-image-config-property-builder function updates a CfnModel$ImageConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$ImageConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryAccessMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-mode` |
| `repositoryAuthConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$RepositoryAuthConfigProperty | [[cdk.support/lookup-entry]] | `:repository-auth-config` |
"
  [^CfnModel$ImageConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :repository-access-mode)]
    (. builder repositoryAccessMode data))
  (when-let [data (lookup-entry config id :repository-auth-config)]
    (. builder repositoryAuthConfig data))
  (.build builder))


(defn cfn-model-image-config-property-builder
  ""
  [id config]
  (build-cfn-model-image-config-property-builder (new CfnModel$ImageConfigProperty$Builder) id config))


(defn build-cfn-model-inference-execution-config-property-builder
  "The build-cfn-model-inference-execution-config-property-builder function updates a CfnModel$InferenceExecutionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$InferenceExecutionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnModel$InferenceExecutionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-model-inference-execution-config-property-builder
  ""
  [id config]
  (build-cfn-model-inference-execution-config-property-builder (new CfnModel$InferenceExecutionConfigProperty$Builder) id config))


(defn build-cfn-model-model-access-config-property-builder
  "The build-cfn-model-model-access-config-property-builder function updates a CfnModel$ModelAccessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$ModelAccessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptEula` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-eula` |
"
  [^CfnModel$ModelAccessConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-eula)]
    (. builder acceptEula data))
  (.build builder))


(defn cfn-model-model-access-config-property-builder
  ""
  [id config]
  (build-cfn-model-model-access-config-property-builder (new CfnModel$ModelAccessConfigProperty$Builder) id config))


(defn build-cfn-model-model-data-source-property-builder
  "The build-cfn-model-model-data-source-property-builder function updates a CfnModel$ModelDataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$ModelDataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.sagemaker.CfnModel$S3DataSourceProperty | [[cdk.support/lookup-entry]] | `:s3-data-source` |
"
  [^CfnModel$ModelDataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-data-source)]
    (. builder s3DataSource data))
  (.build builder))


(defn cfn-model-model-data-source-property-builder
  ""
  [id config]
  (build-cfn-model-model-data-source-property-builder (new CfnModel$ModelDataSourceProperty$Builder) id config))


(defn build-cfn-model-multi-model-config-property-builder
  "The build-cfn-model-multi-model-config-property-builder function updates a CfnModel$MultiModelConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$MultiModelConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelCacheSetting` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-cache-setting` |
"
  [^CfnModel$MultiModelConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :model-cache-setting)]
    (. builder modelCacheSetting data))
  (.build builder))


(defn cfn-model-multi-model-config-property-builder
  ""
  [id config]
  (build-cfn-model-multi-model-config-property-builder (new CfnModel$MultiModelConfigProperty$Builder) id config))


(defn build-cfn-model-package-additional-inference-specification-definition-property-builder
  "The build-cfn-model-package-additional-inference-specification-definition-property-builder function updates a CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `supportedContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-content-types` |
| `supportedRealtimeInferenceInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-realtime-inference-instance-types` |
| `supportedResponseMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-response-mime-types` |
| `supportedTransformInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-transform-instance-types` |
"
  [^CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :supported-content-types)]
    (. builder supportedContentTypes data))
  (when-let [data (lookup-entry config id :supported-realtime-inference-instance-types)]
    (. builder supportedRealtimeInferenceInstanceTypes data))
  (when-let [data (lookup-entry config id :supported-response-mime-types)]
    (. builder supportedResponseMimeTypes data))
  (when-let [data (lookup-entry config id :supported-transform-instance-types)]
    (. builder supportedTransformInstanceTypes data))
  (.build builder))


(defn cfn-model-package-additional-inference-specification-definition-property-builder
  ""
  [id config]
  (build-cfn-model-package-additional-inference-specification-definition-property-builder (new CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder) id config))


(defn build-cfn-model-package-bias-property-builder
  "The build-cfn-model-package-bias-property-builder function updates a CfnModelPackage$BiasProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$BiasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postTrainingReport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-training-report` |
| `preTrainingReport` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:pre-training-report` |
| `report` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:report` |
"
  [^CfnModelPackage$BiasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :post-training-report)]
    (. builder postTrainingReport data))
  (when-let [data (lookup-entry config id :pre-training-report)]
    (. builder preTrainingReport data))
  (when-let [data (lookup-entry config id :report)]
    (. builder report data))
  (.build builder))


(defn cfn-model-package-bias-property-builder
  ""
  [id config]
  (build-cfn-model-package-bias-property-builder (new CfnModelPackage$BiasProperty$Builder) id config))


(defn build-cfn-model-package-builder
  "The build-cfn-model-package-builder function updates a CfnModelPackage$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInferenceSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-inference-specifications` |
| `additionalInferenceSpecificationsToAdd` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-inference-specifications-to-add` |
| `approvalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:approval-description` |
| `certifyForMarketplace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:certify-for-marketplace` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `customerMetadataProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:customer-metadata-properties` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `driftCheckBaselines` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:drift-check-baselines` |
| `inferenceSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$InferenceSpecificationProperty | [[cdk.support/lookup-entry]] | `:inference-specification` |
| `lastModifiedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-modified-time` |
| `metadataProperties` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetadataPropertiesProperty | [[cdk.support/lookup-entry]] | `:metadata-properties` |
| `modelApprovalStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-approval-status` |
| `modelMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-metrics` |
| `modelPackageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelPackageStatusDetails` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ModelPackageStatusDetailsProperty | [[cdk.support/lookup-entry]] | `:model-package-status-details` |
| `modelPackageVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-package-version` |
| `samplePayloadUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-payload-url` |
| `skipModelValidation` | java.lang.String | [[cdk.support/lookup-entry]] | `:skip-model-validation` |
| `sourceAlgorithmSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$SourceAlgorithmSpecificationProperty | [[cdk.support/lookup-entry]] | `:source-algorithm-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `task` | java.lang.String | [[cdk.support/lookup-entry]] | `:task` |
| `validationSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ValidationSpecificationProperty | [[cdk.support/lookup-entry]] | `:validation-specification` |
"
  [^CfnModelPackage$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-inference-specifications)]
    (. builder additionalInferenceSpecifications data))
  (when-let [data (lookup-entry config id :additional-inference-specifications-to-add)]
    (. builder additionalInferenceSpecificationsToAdd data))
  (when-let [data (lookup-entry config id :approval-description)]
    (. builder approvalDescription data))
  (when-let [data (lookup-entry config id :certify-for-marketplace)]
    (. builder certifyForMarketplace data))
  (when-let [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-let [data (lookup-entry config id :customer-metadata-properties)]
    (. builder customerMetadataProperties data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :drift-check-baselines)]
    (. builder driftCheckBaselines data))
  (when-let [data (lookup-entry config id :inference-specification)]
    (. builder inferenceSpecification data))
  (when-let [data (lookup-entry config id :last-modified-time)]
    (. builder lastModifiedTime data))
  (when-let [data (lookup-entry config id :metadata-properties)]
    (. builder metadataProperties data))
  (when-let [data (lookup-entry config id :model-approval-status)]
    (. builder modelApprovalStatus data))
  (when-let [data (lookup-entry config id :model-metrics)]
    (. builder modelMetrics data))
  (when-let [data (lookup-entry config id :model-package-description)]
    (. builder modelPackageDescription data))
  (when-let [data (lookup-entry config id :model-package-group-name)]
    (. builder modelPackageGroupName data))
  (when-let [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-let [data (lookup-entry config id :model-package-status-details)]
    (. builder modelPackageStatusDetails data))
  (when-let [data (lookup-entry config id :model-package-version)]
    (. builder modelPackageVersion data))
  (when-let [data (lookup-entry config id :sample-payload-url)]
    (. builder samplePayloadUrl data))
  (when-let [data (lookup-entry config id :skip-model-validation)]
    (. builder skipModelValidation data))
  (when-let [data (lookup-entry config id :source-algorithm-specification)]
    (. builder sourceAlgorithmSpecification data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task)]
    (. builder task data))
  (when-let [data (lookup-entry config id :validation-specification)]
    (. builder validationSpecification data))
  (.build builder))


(defn cfn-model-package-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-package-builder (CfnModelPackage$Builder/create scope (name id)) id config))


(defn build-cfn-model-package-data-source-property-builder
  "The build-cfn-model-package-data-source-property-builder function updates a CfnModelPackage$DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-data-source` |
"
  [^CfnModelPackage$DataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-data-source)]
    (. builder s3DataSource data))
  (.build builder))


(defn cfn-model-package-data-source-property-builder
  ""
  [id config]
  (build-cfn-model-package-data-source-property-builder (new CfnModelPackage$DataSourceProperty$Builder) id config))


(defn build-cfn-model-package-drift-check-baselines-property-builder
  "The build-cfn-model-package-drift-check-baselines-property-builder function updates a CfnModelPackage$DriftCheckBaselinesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DriftCheckBaselinesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bias` |
| `explainability` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:explainability` |
| `modelDataQuality` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$DriftCheckModelDataQualityProperty | [[cdk.support/lookup-entry]] | `:model-data-quality` |
| `modelQuality` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-quality` |
"
  [^CfnModelPackage$DriftCheckBaselinesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bias)]
    (. builder bias data))
  (when-let [data (lookup-entry config id :explainability)]
    (. builder explainability data))
  (when-let [data (lookup-entry config id :model-data-quality)]
    (. builder modelDataQuality data))
  (when-let [data (lookup-entry config id :model-quality)]
    (. builder modelQuality data))
  (.build builder))


(defn cfn-model-package-drift-check-baselines-property-builder
  ""
  [id config]
  (build-cfn-model-package-drift-check-baselines-property-builder (new CfnModelPackage$DriftCheckBaselinesProperty$Builder) id config))


(defn build-cfn-model-package-drift-check-bias-property-builder
  "The build-cfn-model-package-drift-check-bias-property-builder function updates a CfnModelPackage$DriftCheckBiasProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DriftCheckBiasProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-file` |
| `postTrainingConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-training-constraints` |
| `preTrainingConstraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:pre-training-constraints` |
"
  [^CfnModelPackage$DriftCheckBiasProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :config-file)]
    (. builder configFile data))
  (when-let [data (lookup-entry config id :post-training-constraints)]
    (. builder postTrainingConstraints data))
  (when-let [data (lookup-entry config id :pre-training-constraints)]
    (. builder preTrainingConstraints data))
  (.build builder))


(defn cfn-model-package-drift-check-bias-property-builder
  ""
  [id config]
  (build-cfn-model-package-drift-check-bias-property-builder (new CfnModelPackage$DriftCheckBiasProperty$Builder) id config))


(defn build-cfn-model-package-drift-check-explainability-property-builder
  "The build-cfn-model-package-drift-check-explainability-property-builder function updates a CfnModelPackage$DriftCheckExplainabilityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DriftCheckExplainabilityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-file` |
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
"
  [^CfnModelPackage$DriftCheckExplainabilityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :config-file)]
    (. builder configFile data))
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (.build builder))


(defn cfn-model-package-drift-check-explainability-property-builder
  ""
  [id config]
  (build-cfn-model-package-drift-check-explainability-property-builder (new CfnModelPackage$DriftCheckExplainabilityProperty$Builder) id config))


(defn build-cfn-model-package-drift-check-model-data-quality-property-builder
  "The build-cfn-model-package-drift-check-model-data-quality-property-builder function updates a CfnModelPackage$DriftCheckModelDataQualityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DriftCheckModelDataQualityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnModelPackage$DriftCheckModelDataQualityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-model-package-drift-check-model-data-quality-property-builder
  ""
  [id config]
  (build-cfn-model-package-drift-check-model-data-quality-property-builder (new CfnModelPackage$DriftCheckModelDataQualityProperty$Builder) id config))


(defn build-cfn-model-package-drift-check-model-quality-property-builder
  "The build-cfn-model-package-drift-check-model-quality-property-builder function updates a CfnModelPackage$DriftCheckModelQualityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$DriftCheckModelQualityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnModelPackage$DriftCheckModelQualityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-model-package-drift-check-model-quality-property-builder
  ""
  [id config]
  (build-cfn-model-package-drift-check-model-quality-property-builder (new CfnModelPackage$DriftCheckModelQualityProperty$Builder) id config))


(defn build-cfn-model-package-explainability-property-builder
  "The build-cfn-model-package-explainability-property-builder function updates a CfnModelPackage$ExplainabilityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ExplainabilityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `report` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:report` |
"
  [^CfnModelPackage$ExplainabilityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :report)]
    (. builder report data))
  (.build builder))


(defn cfn-model-package-explainability-property-builder
  ""
  [id config]
  (build-cfn-model-package-explainability-property-builder (new CfnModelPackage$ExplainabilityProperty$Builder) id config))


(defn build-cfn-model-package-file-source-property-builder
  "The build-cfn-model-package-file-source-property-builder function updates a CfnModelPackage$FileSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$FileSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-digest` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelPackage$FileSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-digest)]
    (. builder contentDigest data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-package-file-source-property-builder
  ""
  [id config]
  (build-cfn-model-package-file-source-property-builder (new CfnModelPackage$FileSourceProperty$Builder) id config))


(defn build-cfn-model-package-group-builder
  "The build-cfn-model-package-group-builder function updates a CfnModelPackageGroup$Builder instance using the provided configuration.
  The function takes the CfnModelPackageGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelPackageGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageGroupPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:model-package-group-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelPackageGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :model-package-group-description)]
    (. builder modelPackageGroupDescription data))
  (when-let [data (lookup-entry config id :model-package-group-name)]
    (. builder modelPackageGroupName data))
  (when-let [data (lookup-entry config id :model-package-group-policy)]
    (. builder modelPackageGroupPolicy data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-package-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-package-group-builder (CfnModelPackageGroup$Builder/create scope (name id)) id config))


(defn build-cfn-model-package-group-props-builder
  "The build-cfn-model-package-group-props-builder function updates a CfnModelPackageGroupProps$Builder instance using the provided configuration.
  The function takes the CfnModelPackageGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelPackageGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageGroupPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:model-package-group-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelPackageGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :model-package-group-description)]
    (. builder modelPackageGroupDescription data))
  (when-let [data (lookup-entry config id :model-package-group-name)]
    (. builder modelPackageGroupName data))
  (when-let [data (lookup-entry config id :model-package-group-policy)]
    (. builder modelPackageGroupPolicy data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-package-group-props-builder
  ""
  [id config]
  (build-cfn-model-package-group-props-builder (new CfnModelPackageGroupProps$Builder) id config))


(defn build-cfn-model-package-inference-specification-property-builder
  "The build-cfn-model-package-inference-specification-property-builder function updates a CfnModelPackage$InferenceSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$InferenceSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `supportedContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-content-types` |
| `supportedRealtimeInferenceInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-realtime-inference-instance-types` |
| `supportedResponseMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-response-mime-types` |
| `supportedTransformInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-transform-instance-types` |
"
  [^CfnModelPackage$InferenceSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-let [data (lookup-entry config id :supported-content-types)]
    (. builder supportedContentTypes data))
  (when-let [data (lookup-entry config id :supported-realtime-inference-instance-types)]
    (. builder supportedRealtimeInferenceInstanceTypes data))
  (when-let [data (lookup-entry config id :supported-response-mime-types)]
    (. builder supportedResponseMimeTypes data))
  (when-let [data (lookup-entry config id :supported-transform-instance-types)]
    (. builder supportedTransformInstanceTypes data))
  (.build builder))


(defn cfn-model-package-inference-specification-property-builder
  ""
  [id config]
  (build-cfn-model-package-inference-specification-property-builder (new CfnModelPackage$InferenceSpecificationProperty$Builder) id config))


(defn build-cfn-model-package-metadata-properties-property-builder
  "The build-cfn-model-package-metadata-properties-property-builder function updates a CfnModelPackage$MetadataPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$MetadataPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `generatedBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-by` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
"
  [^CfnModelPackage$MetadataPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :commit-id)]
    (. builder commitId data))
  (when-let [data (lookup-entry config id :generated-by)]
    (. builder generatedBy data))
  (when-let [data (lookup-entry config id :project-id)]
    (. builder projectId data))
  (when-let [data (lookup-entry config id :repository)]
    (. builder repository data))
  (.build builder))


(defn cfn-model-package-metadata-properties-property-builder
  ""
  [id config]
  (build-cfn-model-package-metadata-properties-property-builder (new CfnModelPackage$MetadataPropertiesProperty$Builder) id config))


(defn build-cfn-model-package-metrics-source-property-builder
  "The build-cfn-model-package-metrics-source-property-builder function updates a CfnModelPackage$MetricsSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$MetricsSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-digest` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelPackage$MetricsSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content-digest)]
    (. builder contentDigest data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-package-metrics-source-property-builder
  ""
  [id config]
  (build-cfn-model-package-metrics-source-property-builder (new CfnModelPackage$MetricsSourceProperty$Builder) id config))


(defn build-cfn-model-package-model-data-quality-property-builder
  "The build-cfn-model-package-model-data-quality-property-builder function updates a CfnModelPackage$ModelDataQualityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelDataQualityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnModelPackage$ModelDataQualityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-model-package-model-data-quality-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-data-quality-property-builder (new CfnModelPackage$ModelDataQualityProperty$Builder) id config))


(defn build-cfn-model-package-model-input-property-builder
  "The build-cfn-model-package-model-input-property-builder function updates a CfnModelPackage$ModelInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataInputConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-input-config` |
"
  [^CfnModelPackage$ModelInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-input-config)]
    (. builder dataInputConfig data))
  (.build builder))


(defn cfn-model-package-model-input-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-input-property-builder (new CfnModelPackage$ModelInputProperty$Builder) id config))


(defn build-cfn-model-package-model-metrics-property-builder
  "The build-cfn-model-package-model-metrics-property-builder function updates a CfnModelPackage$ModelMetricsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelMetricsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bias` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$BiasProperty | [[cdk.support/lookup-entry]] | `:bias` |
| `explainability` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:explainability` |
| `modelDataQuality` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-data-quality` |
| `modelQuality` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ModelQualityProperty | [[cdk.support/lookup-entry]] | `:model-quality` |
"
  [^CfnModelPackage$ModelMetricsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bias)]
    (. builder bias data))
  (when-let [data (lookup-entry config id :explainability)]
    (. builder explainability data))
  (when-let [data (lookup-entry config id :model-data-quality)]
    (. builder modelDataQuality data))
  (when-let [data (lookup-entry config id :model-quality)]
    (. builder modelQuality data))
  (.build builder))


(defn cfn-model-package-model-metrics-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-metrics-property-builder (new CfnModelPackage$ModelMetricsProperty$Builder) id config))


(defn build-cfn-model-package-model-package-container-definition-property-builder
  "The build-cfn-model-package-model-package-container-definition-property-builder function updates a CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-hostname` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `frameworkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-version` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `imageDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-digest` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
| `modelInput` | java.lang.Object | [[cdk.support/lookup-entry]] | `:model-input` |
| `nearestModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nearest-model-name` |
"
  [^CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-hostname)]
    (. builder containerHostname data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :framework)]
    (. builder framework data))
  (when-let [data (lookup-entry config id :framework-version)]
    (. builder frameworkVersion data))
  (when-let [data (lookup-entry config id :image)]
    (. builder image data))
  (when-let [data (lookup-entry config id :image-digest)]
    (. builder imageDigest data))
  (when-let [data (lookup-entry config id :model-data-url)]
    (. builder modelDataUrl data))
  (when-let [data (lookup-entry config id :model-input)]
    (. builder modelInput data))
  (when-let [data (lookup-entry config id :nearest-model-name)]
    (. builder nearestModelName data))
  (.build builder))


(defn cfn-model-package-model-package-container-definition-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-package-container-definition-property-builder (new CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder) id config))


(defn build-cfn-model-package-model-package-status-details-property-builder
  "The build-cfn-model-package-model-package-status-details-property-builder function updates a CfnModelPackage$ModelPackageStatusDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelPackageStatusDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `validationStatuses` | java.util.List | [[cdk.support/lookup-entry]] | `:validation-statuses` |
"
  [^CfnModelPackage$ModelPackageStatusDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :validation-statuses)]
    (. builder validationStatuses data))
  (.build builder))


(defn cfn-model-package-model-package-status-details-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-package-status-details-property-builder (new CfnModelPackage$ModelPackageStatusDetailsProperty$Builder) id config))


(defn build-cfn-model-package-model-package-status-item-property-builder
  "The build-cfn-model-package-model-package-status-item-property-builder function updates a CfnModelPackage$ModelPackageStatusItemProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelPackageStatusItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnModelPackage$ModelPackageStatusItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-reason)]
    (. builder failureReason data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-model-package-model-package-status-item-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-package-status-item-property-builder (new CfnModelPackage$ModelPackageStatusItemProperty$Builder) id config))


(defn build-cfn-model-package-model-quality-property-builder
  "The build-cfn-model-package-model-quality-property-builder function updates a CfnModelPackage$ModelQualityProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ModelQualityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |
"
  [^CfnModelPackage$ModelQualityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-let [data (lookup-entry config id :statistics)]
    (. builder statistics data))
  (.build builder))


(defn cfn-model-package-model-quality-property-builder
  ""
  [id config]
  (build-cfn-model-package-model-quality-property-builder (new CfnModelPackage$ModelQualityProperty$Builder) id config))


(defn build-cfn-model-package-props-builder
  "The build-cfn-model-package-props-builder function updates a CfnModelPackageProps$Builder instance using the provided configuration.
  The function takes the CfnModelPackageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInferenceSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-inference-specifications` |
| `additionalInferenceSpecificationsToAdd` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-inference-specifications-to-add` |
| `approvalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:approval-description` |
| `certifyForMarketplace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:certify-for-marketplace` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `customerMetadataProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:customer-metadata-properties` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `driftCheckBaselines` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:drift-check-baselines` |
| `inferenceSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-specification` |
| `lastModifiedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-modified-time` |
| `metadataProperties` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetadataPropertiesProperty | [[cdk.support/lookup-entry]] | `:metadata-properties` |
| `modelApprovalStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-approval-status` |
| `modelMetrics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ModelMetricsProperty | [[cdk.support/lookup-entry]] | `:model-metrics` |
| `modelPackageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-name` |
| `modelPackageStatusDetails` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ModelPackageStatusDetailsProperty | [[cdk.support/lookup-entry]] | `:model-package-status-details` |
| `modelPackageVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-package-version` |
| `samplePayloadUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:sample-payload-url` |
| `skipModelValidation` | java.lang.String | [[cdk.support/lookup-entry]] | `:skip-model-validation` |
| `sourceAlgorithmSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-algorithm-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `task` | java.lang.String | [[cdk.support/lookup-entry]] | `:task` |
| `validationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-specification` |
"
  [^CfnModelPackageProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-inference-specifications)]
    (. builder additionalInferenceSpecifications data))
  (when-let [data (lookup-entry config id :additional-inference-specifications-to-add)]
    (. builder additionalInferenceSpecificationsToAdd data))
  (when-let [data (lookup-entry config id :approval-description)]
    (. builder approvalDescription data))
  (when-let [data (lookup-entry config id :certify-for-marketplace)]
    (. builder certifyForMarketplace data))
  (when-let [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-let [data (lookup-entry config id :customer-metadata-properties)]
    (. builder customerMetadataProperties data))
  (when-let [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-let [data (lookup-entry config id :drift-check-baselines)]
    (. builder driftCheckBaselines data))
  (when-let [data (lookup-entry config id :inference-specification)]
    (. builder inferenceSpecification data))
  (when-let [data (lookup-entry config id :last-modified-time)]
    (. builder lastModifiedTime data))
  (when-let [data (lookup-entry config id :metadata-properties)]
    (. builder metadataProperties data))
  (when-let [data (lookup-entry config id :model-approval-status)]
    (. builder modelApprovalStatus data))
  (when-let [data (lookup-entry config id :model-metrics)]
    (. builder modelMetrics data))
  (when-let [data (lookup-entry config id :model-package-description)]
    (. builder modelPackageDescription data))
  (when-let [data (lookup-entry config id :model-package-group-name)]
    (. builder modelPackageGroupName data))
  (when-let [data (lookup-entry config id :model-package-name)]
    (. builder modelPackageName data))
  (when-let [data (lookup-entry config id :model-package-status-details)]
    (. builder modelPackageStatusDetails data))
  (when-let [data (lookup-entry config id :model-package-version)]
    (. builder modelPackageVersion data))
  (when-let [data (lookup-entry config id :sample-payload-url)]
    (. builder samplePayloadUrl data))
  (when-let [data (lookup-entry config id :skip-model-validation)]
    (. builder skipModelValidation data))
  (when-let [data (lookup-entry config id :source-algorithm-specification)]
    (. builder sourceAlgorithmSpecification data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :task)]
    (. builder task data))
  (when-let [data (lookup-entry config id :validation-specification)]
    (. builder validationSpecification data))
  (.build builder))


(defn cfn-model-package-props-builder
  ""
  [id config]
  (build-cfn-model-package-props-builder (new CfnModelPackageProps$Builder) id config))


(defn build-cfn-model-package-s3-data-source-property-builder
  "The build-cfn-model-package-s3-data-source-property-builder function updates a CfnModelPackage$S3DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$S3DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelPackage$S3DataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-data-type)]
    (. builder s3DataType data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-package-s3-data-source-property-builder
  ""
  [id config]
  (build-cfn-model-package-s3-data-source-property-builder (new CfnModelPackage$S3DataSourceProperty$Builder) id config))


(defn build-cfn-model-package-source-algorithm-property-builder
  "The build-cfn-model-package-source-algorithm-property-builder function updates a CfnModelPackage$SourceAlgorithmProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$SourceAlgorithmProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
"
  [^CfnModelPackage$SourceAlgorithmProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :algorithm-name)]
    (. builder algorithmName data))
  (when-let [data (lookup-entry config id :model-data-url)]
    (. builder modelDataUrl data))
  (.build builder))


(defn cfn-model-package-source-algorithm-property-builder
  ""
  [id config]
  (build-cfn-model-package-source-algorithm-property-builder (new CfnModelPackage$SourceAlgorithmProperty$Builder) id config))


(defn build-cfn-model-package-source-algorithm-specification-property-builder
  "The build-cfn-model-package-source-algorithm-specification-property-builder function updates a CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-algorithms` |
"
  [^CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source-algorithms)]
    (. builder sourceAlgorithms data))
  (.build builder))


(defn cfn-model-package-source-algorithm-specification-property-builder
  ""
  [id config]
  (build-cfn-model-package-source-algorithm-specification-property-builder (new CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder) id config))


(defn build-cfn-model-package-transform-input-property-builder
  "The build-cfn-model-package-transform-input-property-builder function updates a CfnModelPackage$TransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$TransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `dataSource` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$DataSourceProperty | [[cdk.support/lookup-entry]] | `:data-source` |
| `splitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-type` |
"
  [^CfnModelPackage$TransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :compression-type)]
    (. builder compressionType data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :split-type)]
    (. builder splitType data))
  (.build builder))


(defn cfn-model-package-transform-input-property-builder
  ""
  [id config]
  (build-cfn-model-package-transform-input-property-builder (new CfnModelPackage$TransformInputProperty$Builder) id config))


(defn build-cfn-model-package-transform-job-definition-property-builder
  "The build-cfn-model-package-transform-job-definition-property-builder function updates a CfnModelPackage$TransformJobDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$TransformJobDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:batch-strategy` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `maxConcurrentTransforms` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-transforms` |
| `maxPayloadInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-payload-in-mb` |
| `transformInput` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$TransformInputProperty | [[cdk.support/lookup-entry]] | `:transform-input` |
| `transformOutput` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$TransformOutputProperty | [[cdk.support/lookup-entry]] | `:transform-output` |
| `transformResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform-resources` |
"
  [^CfnModelPackage$TransformJobDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-strategy)]
    (. builder batchStrategy data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :max-concurrent-transforms)]
    (. builder maxConcurrentTransforms data))
  (when-let [data (lookup-entry config id :max-payload-in-mb)]
    (. builder maxPayloadInMb data))
  (when-let [data (lookup-entry config id :transform-input)]
    (. builder transformInput data))
  (when-let [data (lookup-entry config id :transform-output)]
    (. builder transformOutput data))
  (when-let [data (lookup-entry config id :transform-resources)]
    (. builder transformResources data))
  (.build builder))


(defn cfn-model-package-transform-job-definition-property-builder
  ""
  [id config]
  (build-cfn-model-package-transform-job-definition-property-builder (new CfnModelPackage$TransformJobDefinitionProperty$Builder) id config))


(defn build-cfn-model-package-transform-output-property-builder
  "The build-cfn-model-package-transform-output-property-builder function updates a CfnModelPackage$TransformOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$TransformOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `assembleWith` | java.lang.String | [[cdk.support/lookup-entry]] | `:assemble-with` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |
"
  [^CfnModelPackage$TransformOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :accept)]
    (. builder accept data))
  (when-let [data (lookup-entry config id :assemble-with)]
    (. builder assembleWith data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :s3-output-path)]
    (. builder s3OutputPath data))
  (.build builder))


(defn cfn-model-package-transform-output-property-builder
  ""
  [id config]
  (build-cfn-model-package-transform-output-property-builder (new CfnModelPackage$TransformOutputProperty$Builder) id config))


(defn build-cfn-model-package-transform-resources-property-builder
  "The build-cfn-model-package-transform-resources-property-builder function updates a CfnModelPackage$TransformResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$TransformResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
"
  [^CfnModelPackage$TransformResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (.build builder))


(defn cfn-model-package-transform-resources-property-builder
  ""
  [id config]
  (build-cfn-model-package-transform-resources-property-builder (new CfnModelPackage$TransformResourcesProperty$Builder) id config))


(defn build-cfn-model-package-validation-profile-property-builder
  "The build-cfn-model-package-validation-profile-property-builder function updates a CfnModelPackage$ValidationProfileProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ValidationProfileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `transformJobDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform-job-definition` |
"
  [^CfnModelPackage$ValidationProfileProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :profile-name)]
    (. builder profileName data))
  (when-let [data (lookup-entry config id :transform-job-definition)]
    (. builder transformJobDefinition data))
  (.build builder))


(defn cfn-model-package-validation-profile-property-builder
  ""
  [id config]
  (build-cfn-model-package-validation-profile-property-builder (new CfnModelPackage$ValidationProfileProperty$Builder) id config))


(defn build-cfn-model-package-validation-specification-property-builder
  "The build-cfn-model-package-validation-specification-property-builder function updates a CfnModelPackage$ValidationSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelPackage$ValidationSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `validationProfiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-profiles` |
| `validationRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-role` |
"
  [^CfnModelPackage$ValidationSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :validation-profiles)]
    (. builder validationProfiles data))
  (when-let [data (lookup-entry config id :validation-role)]
    (. builder validationRole data))
  (.build builder))


(defn cfn-model-package-validation-specification-property-builder
  ""
  [id config]
  (build-cfn-model-package-validation-specification-property-builder (new CfnModelPackage$ValidationSpecificationProperty$Builder) id config))


(defn build-cfn-model-props-builder
  "The build-cfn-model-props-builder function updates a CfnModelProps$Builder instance using the provided configuration.
  The function takes the CfnModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:containers` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceExecutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-execution-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `primaryContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-container` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnModelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :inference-execution-config)]
    (. builder inferenceExecutionConfig data))
  (when-let [data (lookup-entry config id :model-name)]
    (. builder modelName data))
  (when-let [data (lookup-entry config id :primary-container)]
    (. builder primaryContainer data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-model-props-builder
  ""
  [id config]
  (build-cfn-model-props-builder (new CfnModelProps$Builder) id config))


(defn build-cfn-model-quality-job-definition-batch-transform-input-property-builder
  "The build-cfn-model-quality-job-definition-batch-transform-input-property-builder function updates a CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `endTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time-offset` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `probabilityThresholdAttribute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-threshold-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |
"
  [^CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-captured-destination-s3-uri)]
    (. builder dataCapturedDestinationS3Uri data))
  (when-let [data (lookup-entry config id :dataset-format)]
    (. builder datasetFormat data))
  (when-let [data (lookup-entry config id :end-time-offset)]
    (. builder endTimeOffset data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :probability-threshold-attribute)]
    (. builder probabilityThresholdAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (when-let [data (lookup-entry config id :start-time-offset)]
    (. builder startTimeOffset data))
  (.build builder))


(defn cfn-model-quality-job-definition-batch-transform-input-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-batch-transform-input-property-builder (new CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-builder
  "The build-cfn-model-quality-job-definition-builder function updates a CfnModelQualityJobDefinition$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelQualityAppSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-quality-app-specification` |
| `modelQualityBaselineConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty | [[cdk.support/lookup-entry]] | `:model-quality-baseline-config` |
| `modelQualityJobInput` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$ModelQualityJobInputProperty | [[cdk.support/lookup-entry]] | `:model-quality-job-input` |
| `modelQualityJobOutputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-quality-job-output-config` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelQualityJobDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-quality-app-specification)]
    (. builder modelQualityAppSpecification data))
  (when-let [data (lookup-entry config id :model-quality-baseline-config)]
    (. builder modelQualityBaselineConfig data))
  (when-let [data (lookup-entry config id :model-quality-job-input)]
    (. builder modelQualityJobInput data))
  (when-let [data (lookup-entry config id :model-quality-job-output-config)]
    (. builder modelQualityJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-quality-job-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-model-quality-job-definition-builder (CfnModelQualityJobDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-model-quality-job-definition-cluster-config-property-builder
  "The build-cfn-model-quality-job-definition-cluster-config-property-builder function updates a CfnModelQualityJobDefinition$ClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$ClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnModelQualityJobDefinition$ClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-model-quality-job-definition-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-cluster-config-property-builder (new CfnModelQualityJobDefinition$ClusterConfigProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-constraints-resource-property-builder
  "The build-cfn-model-quality-job-definition-constraints-resource-property-builder function updates a CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-quality-job-definition-constraints-resource-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-constraints-resource-property-builder (new CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-csv-property-builder
  "The build-cfn-model-quality-job-definition-csv-property-builder function updates a CfnModelQualityJobDefinition$CsvProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$CsvProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnModelQualityJobDefinition$CsvProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-model-quality-job-definition-csv-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-csv-property-builder (new CfnModelQualityJobDefinition$CsvProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-dataset-format-property-builder
  "The build-cfn-model-quality-job-definition-dataset-format-property-builder function updates a CfnModelQualityJobDefinition$DatasetFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$DatasetFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |
"
  [^CfnModelQualityJobDefinition$DatasetFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :parquet)]
    (. builder parquet data))
  (.build builder))


(defn cfn-model-quality-job-definition-dataset-format-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-dataset-format-property-builder (new CfnModelQualityJobDefinition$DatasetFormatProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-endpoint-input-property-builder
  "The build-cfn-model-quality-job-definition-endpoint-input-property-builder function updates a CfnModelQualityJobDefinition$EndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$EndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time-offset` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `probabilityThresholdAttribute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-threshold-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |
"
  [^CfnModelQualityJobDefinition$EndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time-offset)]
    (. builder endTimeOffset data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :inference-attribute)]
    (. builder inferenceAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :probability-attribute)]
    (. builder probabilityAttribute data))
  (when-let [data (lookup-entry config id :probability-threshold-attribute)]
    (. builder probabilityThresholdAttribute data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (when-let [data (lookup-entry config id :start-time-offset)]
    (. builder startTimeOffset data))
  (.build builder))


(defn cfn-model-quality-job-definition-endpoint-input-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-endpoint-input-property-builder (new CfnModelQualityJobDefinition$EndpointInputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-json-property-builder
  "The build-cfn-model-quality-job-definition-json-property-builder function updates a CfnModelQualityJobDefinition$JsonProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$JsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:line` |
"
  [^CfnModelQualityJobDefinition$JsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :line)]
    (. builder line data))
  (.build builder))


(defn cfn-model-quality-job-definition-json-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-json-property-builder (new CfnModelQualityJobDefinition$JsonProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-model-quality-app-specification-property-builder
  "The build-cfn-model-quality-job-definition-model-quality-app-specification-property-builder function updates a CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `problemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:problem-type` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |
"
  [^CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-arguments)]
    (. builder containerArguments data))
  (when-let [data (lookup-entry config id :container-entrypoint)]
    (. builder containerEntrypoint data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :post-analytics-processor-source-uri)]
    (. builder postAnalyticsProcessorSourceUri data))
  (when-let [data (lookup-entry config id :problem-type)]
    (. builder problemType data))
  (when-let [data (lookup-entry config id :record-preprocessor-source-uri)]
    (. builder recordPreprocessorSourceUri data))
  (.build builder))


(defn cfn-model-quality-job-definition-model-quality-app-specification-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-model-quality-app-specification-property-builder (new CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-model-quality-baseline-config-property-builder
  "The build-cfn-model-quality-job-definition-model-quality-baseline-config-property-builder function updates a CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |
"
  [^CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :baselining-job-name)]
    (. builder baseliningJobName data))
  (when-let [data (lookup-entry config id :constraints-resource)]
    (. builder constraintsResource data))
  (.build builder))


(defn cfn-model-quality-job-definition-model-quality-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-model-quality-baseline-config-property-builder (new CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-model-quality-job-input-property-builder
  "The build-cfn-model-quality-job-definition-model-quality-job-input-property-builder function updates a CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$BatchTransformInputProperty | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
| `groundTruthS3Input` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ground-truth-s3-input` |
"
  [^CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-transform-input)]
    (. builder batchTransformInput data))
  (when-let [data (lookup-entry config id :endpoint-input)]
    (. builder endpointInput data))
  (when-let [data (lookup-entry config id :ground-truth-s3-input)]
    (. builder groundTruthS3Input data))
  (.build builder))


(defn cfn-model-quality-job-definition-model-quality-job-input-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-model-quality-job-input-property-builder (new CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder
  "The build-cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder function updates a CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder (new CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-monitoring-output-config-property-builder
  "The build-cfn-model-quality-job-definition-monitoring-output-config-property-builder function updates a CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |
"
  [^CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :monitoring-outputs)]
    (. builder monitoringOutputs data))
  (.build builder))


(defn cfn-model-quality-job-definition-monitoring-output-config-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-monitoring-output-config-property-builder (new CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-monitoring-output-property-builder
  "The build-cfn-model-quality-job-definition-monitoring-output-property-builder function updates a CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$S3OutputProperty | [[cdk.support/lookup-entry]] | `:s3-output` |
"
  [^CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-output)]
    (. builder s3Output data))
  (.build builder))


(defn cfn-model-quality-job-definition-monitoring-output-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-monitoring-output-property-builder (new CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-monitoring-resources-property-builder
  "The build-cfn-model-quality-job-definition-monitoring-resources-property-builder function updates a CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |
"
  [^CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-config)]
    (. builder clusterConfig data))
  (.build builder))


(defn cfn-model-quality-job-definition-monitoring-resources-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-monitoring-resources-property-builder (new CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-network-config-property-builder
  "The build-cfn-model-quality-job-definition-network-config-property-builder function updates a CfnModelQualityJobDefinition$NetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$NetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnModelQualityJobDefinition$NetworkConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
    (. builder enableInterContainerTrafficEncryption data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-model-quality-job-definition-network-config-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-network-config-property-builder (new CfnModelQualityJobDefinition$NetworkConfigProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-props-builder
  "The build-cfn-model-quality-job-definition-props-builder function updates a CfnModelQualityJobDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `jobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-definition-name` |
| `jobResources` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$MonitoringResourcesProperty | [[cdk.support/lookup-entry]] | `:job-resources` |
| `modelQualityAppSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty | [[cdk.support/lookup-entry]] | `:model-quality-app-specification` |
| `modelQualityBaselineConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty | [[cdk.support/lookup-entry]] | `:model-quality-baseline-config` |
| `modelQualityJobInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-quality-job-input` |
| `modelQualityJobOutputConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$MonitoringOutputConfigProperty | [[cdk.support/lookup-entry]] | `:model-quality-job-output-config` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stopping-condition` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnModelQualityJobDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :job-definition-name)]
    (. builder jobDefinitionName data))
  (when-let [data (lookup-entry config id :job-resources)]
    (. builder jobResources data))
  (when-let [data (lookup-entry config id :model-quality-app-specification)]
    (. builder modelQualityAppSpecification data))
  (when-let [data (lookup-entry config id :model-quality-baseline-config)]
    (. builder modelQualityBaselineConfig data))
  (when-let [data (lookup-entry config id :model-quality-job-input)]
    (. builder modelQualityJobInput data))
  (when-let [data (lookup-entry config id :model-quality-job-output-config)]
    (. builder modelQualityJobOutputConfig data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-model-quality-job-definition-props-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-props-builder (new CfnModelQualityJobDefinitionProps$Builder) id config))


(defn build-cfn-model-quality-job-definition-s3-output-property-builder
  "The build-cfn-model-quality-job-definition-s3-output-property-builder function updates a CfnModelQualityJobDefinition$S3OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$S3OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModelQualityJobDefinition$S3OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-upload-mode)]
    (. builder s3UploadMode data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-quality-job-definition-s3-output-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-s3-output-property-builder (new CfnModelQualityJobDefinition$S3OutputProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-stopping-condition-property-builder
  "The build-cfn-model-quality-job-definition-stopping-condition-property-builder function updates a CfnModelQualityJobDefinition$StoppingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$StoppingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |
"
  [^CfnModelQualityJobDefinition$StoppingConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
    (. builder maxRuntimeInSeconds data))
  (.build builder))


(defn cfn-model-quality-job-definition-stopping-condition-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-stopping-condition-property-builder (new CfnModelQualityJobDefinition$StoppingConditionProperty$Builder) id config))


(defn build-cfn-model-quality-job-definition-vpc-config-property-builder
  "The build-cfn-model-quality-job-definition-vpc-config-property-builder function updates a CfnModelQualityJobDefinition$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModelQualityJobDefinition$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnModelQualityJobDefinition$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-model-quality-job-definition-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-model-quality-job-definition-vpc-config-property-builder (new CfnModelQualityJobDefinition$VpcConfigProperty$Builder) id config))


(defn build-cfn-model-repository-auth-config-property-builder
  "The build-cfn-model-repository-auth-config-property-builder function updates a CfnModel$RepositoryAuthConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$RepositoryAuthConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCredentialsProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-credentials-provider-arn` |
"
  [^CfnModel$RepositoryAuthConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :repository-credentials-provider-arn)]
    (. builder repositoryCredentialsProviderArn data))
  (.build builder))


(defn cfn-model-repository-auth-config-property-builder
  ""
  [id config]
  (build-cfn-model-repository-auth-config-property-builder (new CfnModel$RepositoryAuthConfigProperty$Builder) id config))


(defn build-cfn-model-s3-data-source-property-builder
  "The build-cfn-model-s3-data-source-property-builder function updates a CfnModel$S3DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$S3DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-type` |
| `modelAccessConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-access-config` |
| `s3DataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnModel$S3DataSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :compression-type)]
    (. builder compressionType data))
  (when-let [data (lookup-entry config id :model-access-config)]
    (. builder modelAccessConfig data))
  (when-let [data (lookup-entry config id :s3-data-type)]
    (. builder s3DataType data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-model-s3-data-source-property-builder
  ""
  [id config]
  (build-cfn-model-s3-data-source-property-builder (new CfnModel$S3DataSourceProperty$Builder) id config))


(defn build-cfn-model-vpc-config-property-builder
  "The build-cfn-model-vpc-config-property-builder function updates a CfnModel$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnModel$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnModel$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-model-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-model-vpc-config-property-builder (new CfnModel$VpcConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-baseline-config-property-builder
  "The build-cfn-monitoring-schedule-baseline-config-property-builder function updates a CfnMonitoringSchedule$BaselineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$BaselineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |
| `statisticsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statistics-resource` |
"
  [^CfnMonitoringSchedule$BaselineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :constraints-resource)]
    (. builder constraintsResource data))
  (when-let [data (lookup-entry config id :statistics-resource)]
    (. builder statisticsResource data))
  (.build builder))


(defn cfn-monitoring-schedule-baseline-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-baseline-config-property-builder (new CfnMonitoringSchedule$BaselineConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-batch-transform-input-property-builder
  "The build-cfn-monitoring-schedule-batch-transform-input-property-builder function updates a CfnMonitoringSchedule$BatchTransformInputProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$BatchTransformInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnMonitoringSchedule$BatchTransformInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-captured-destination-s3-uri)]
    (. builder dataCapturedDestinationS3Uri data))
  (when-let [data (lookup-entry config id :dataset-format)]
    (. builder datasetFormat data))
  (when-let [data (lookup-entry config id :exclude-features-attribute)]
    (. builder excludeFeaturesAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-monitoring-schedule-batch-transform-input-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-batch-transform-input-property-builder (new CfnMonitoringSchedule$BatchTransformInputProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-builder
  "The build-cfn-monitoring-schedule-builder function updates a CfnMonitoringSchedule$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastMonitoringExecutionSummary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-monitoring-execution-summary` |
| `monitoringScheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-schedule-config` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `monitoringScheduleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMonitoringSchedule$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :failure-reason)]
    (. builder failureReason data))
  (when-let [data (lookup-entry config id :last-monitoring-execution-summary)]
    (. builder lastMonitoringExecutionSummary data))
  (when-let [data (lookup-entry config id :monitoring-schedule-config)]
    (. builder monitoringScheduleConfig data))
  (when-let [data (lookup-entry config id :monitoring-schedule-name)]
    (. builder monitoringScheduleName data))
  (when-let [data (lookup-entry config id :monitoring-schedule-status)]
    (. builder monitoringScheduleStatus data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-monitoring-schedule-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-monitoring-schedule-builder (CfnMonitoringSchedule$Builder/create scope (name id)) id config))


(defn build-cfn-monitoring-schedule-cluster-config-property-builder
  "The build-cfn-monitoring-schedule-cluster-config-property-builder function updates a CfnMonitoringSchedule$ClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$ClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnMonitoringSchedule$ClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :volume-kms-key-id)]
    (. builder volumeKmsKeyId data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-monitoring-schedule-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-cluster-config-property-builder (new CfnMonitoringSchedule$ClusterConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-constraints-resource-property-builder
  "The build-cfn-monitoring-schedule-constraints-resource-property-builder function updates a CfnMonitoringSchedule$ConstraintsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$ConstraintsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnMonitoringSchedule$ConstraintsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-monitoring-schedule-constraints-resource-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-constraints-resource-property-builder (new CfnMonitoringSchedule$ConstraintsResourceProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-csv-property-builder
  "The build-cfn-monitoring-schedule-csv-property-builder function updates a CfnMonitoringSchedule$CsvProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$CsvProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnMonitoringSchedule$CsvProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-monitoring-schedule-csv-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-csv-property-builder (new CfnMonitoringSchedule$CsvProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-dataset-format-property-builder
  "The build-cfn-monitoring-schedule-dataset-format-property-builder function updates a CfnMonitoringSchedule$DatasetFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$DatasetFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$CsvProperty | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:parquet` |
"
  [^CfnMonitoringSchedule$DatasetFormatProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :csv)]
    (. builder csv data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :parquet)]
    (. builder parquet data))
  (.build builder))


(defn cfn-monitoring-schedule-dataset-format-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-dataset-format-property-builder (new CfnMonitoringSchedule$DatasetFormatProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-endpoint-input-property-builder
  "The build-cfn-monitoring-schedule-endpoint-input-property-builder function updates a CfnMonitoringSchedule$EndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$EndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |
"
  [^CfnMonitoringSchedule$EndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :exclude-features-attribute)]
    (. builder excludeFeaturesAttribute data))
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-data-distribution-type)]
    (. builder s3DataDistributionType data))
  (when-let [data (lookup-entry config id :s3-input-mode)]
    (. builder s3InputMode data))
  (.build builder))


(defn cfn-monitoring-schedule-endpoint-input-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-endpoint-input-property-builder (new CfnMonitoringSchedule$EndpointInputProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-json-property-builder
  "The build-cfn-monitoring-schedule-json-property-builder function updates a CfnMonitoringSchedule$JsonProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$JsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:line` |
"
  [^CfnMonitoringSchedule$JsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :line)]
    (. builder line data))
  (.build builder))


(defn cfn-monitoring-schedule-json-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-json-property-builder (new CfnMonitoringSchedule$JsonProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-app-specification-property-builder
  "The build-cfn-monitoring-schedule-monitoring-app-specification-property-builder function updates a CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |
"
  [^CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :container-arguments)]
    (. builder containerArguments data))
  (when-let [data (lookup-entry config id :container-entrypoint)]
    (. builder containerEntrypoint data))
  (when-let [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-let [data (lookup-entry config id :post-analytics-processor-source-uri)]
    (. builder postAnalyticsProcessorSourceUri data))
  (when-let [data (lookup-entry config id :record-preprocessor-source-uri)]
    (. builder recordPreprocessorSourceUri data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-app-specification-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-app-specification-property-builder (new CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-execution-summary-property-builder
  "The build-cfn-monitoring-schedule-monitoring-execution-summary-property-builder function updates a CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastModifiedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-modified-time` |
| `monitoringExecutionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-execution-status` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `processingJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:processing-job-arn` |
| `scheduledTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-time` |
"
  [^CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :creation-time)]
    (. builder creationTime data))
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :failure-reason)]
    (. builder failureReason data))
  (when-let [data (lookup-entry config id :last-modified-time)]
    (. builder lastModifiedTime data))
  (when-let [data (lookup-entry config id :monitoring-execution-status)]
    (. builder monitoringExecutionStatus data))
  (when-let [data (lookup-entry config id :monitoring-schedule-name)]
    (. builder monitoringScheduleName data))
  (when-let [data (lookup-entry config id :processing-job-arn)]
    (. builder processingJobArn data))
  (when-let [data (lookup-entry config id :scheduled-time)]
    (. builder scheduledTime data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-execution-summary-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-execution-summary-property-builder (new CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-input-property-builder
  "The build-cfn-monitoring-schedule-monitoring-input-property-builder function updates a CfnMonitoringSchedule$MonitoringInputProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-input` |
"
  [^CfnMonitoringSchedule$MonitoringInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :batch-transform-input)]
    (. builder batchTransformInput data))
  (when-let [data (lookup-entry config id :endpoint-input)]
    (. builder endpointInput data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-input-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-input-property-builder (new CfnMonitoringSchedule$MonitoringInputProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-job-definition-property-builder
  "The build-cfn-monitoring-schedule-monitoring-job-definition-property-builder function updates a CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:baseline-config` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `monitoringAppSpecification` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$MonitoringAppSpecificationProperty | [[cdk.support/lookup-entry]] | `:monitoring-app-specification` |
| `monitoringInputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-inputs` |
| `monitoringOutputConfig` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$MonitoringOutputConfigProperty | [[cdk.support/lookup-entry]] | `:monitoring-output-config` |
| `monitoringResources` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$MonitoringResourcesProperty | [[cdk.support/lookup-entry]] | `:monitoring-resources` |
| `networkConfig` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$NetworkConfigProperty | [[cdk.support/lookup-entry]] | `:network-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |
"
  [^CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :baseline-config)]
    (. builder baselineConfig data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :monitoring-app-specification)]
    (. builder monitoringAppSpecification data))
  (when-let [data (lookup-entry config id :monitoring-inputs)]
    (. builder monitoringInputs data))
  (when-let [data (lookup-entry config id :monitoring-output-config)]
    (. builder monitoringOutputConfig data))
  (when-let [data (lookup-entry config id :monitoring-resources)]
    (. builder monitoringResources data))
  (when-let [data (lookup-entry config id :network-config)]
    (. builder networkConfig data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stopping-condition)]
    (. builder stoppingCondition data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-job-definition-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-job-definition-property-builder (new CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-output-config-property-builder
  "The build-cfn-monitoring-schedule-monitoring-output-config-property-builder function updates a CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |
"
  [^CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :monitoring-outputs)]
    (. builder monitoringOutputs data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-output-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-output-config-property-builder (new CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-output-property-builder
  "The build-cfn-monitoring-schedule-monitoring-output-property-builder function updates a CfnMonitoringSchedule$MonitoringOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$S3OutputProperty | [[cdk.support/lookup-entry]] | `:s3-output` |
"
  [^CfnMonitoringSchedule$MonitoringOutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-output)]
    (. builder s3Output data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-output-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-output-property-builder (new CfnMonitoringSchedule$MonitoringOutputProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-resources-property-builder
  "The build-cfn-monitoring-schedule-monitoring-resources-property-builder function updates a CfnMonitoringSchedule$MonitoringResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |
"
  [^CfnMonitoringSchedule$MonitoringResourcesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-config)]
    (. builder clusterConfig data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-resources-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-resources-property-builder (new CfnMonitoringSchedule$MonitoringResourcesProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-monitoring-schedule-config-property-builder
  "The build-cfn-monitoring-schedule-monitoring-schedule-config-property-builder function updates a CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitoringJobDefinition` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$MonitoringJobDefinitionProperty | [[cdk.support/lookup-entry]] | `:monitoring-job-definition` |
| `monitoringJobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-job-definition-name` |
| `monitoringType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-type` |
| `scheduleConfig` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$ScheduleConfigProperty | [[cdk.support/lookup-entry]] | `:schedule-config` |
"
  [^CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :monitoring-job-definition)]
    (. builder monitoringJobDefinition data))
  (when-let [data (lookup-entry config id :monitoring-job-definition-name)]
    (. builder monitoringJobDefinitionName data))
  (when-let [data (lookup-entry config id :monitoring-type)]
    (. builder monitoringType data))
  (when-let [data (lookup-entry config id :schedule-config)]
    (. builder scheduleConfig data))
  (.build builder))


(defn cfn-monitoring-schedule-monitoring-schedule-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-monitoring-schedule-config-property-builder (new CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-network-config-property-builder
  "The build-cfn-monitoring-schedule-network-config-property-builder function updates a CfnMonitoringSchedule$NetworkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$NetworkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnMonitoringSchedule$NetworkConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
    (. builder enableInterContainerTrafficEncryption data))
  (when-let [data (lookup-entry config id :enable-network-isolation)]
    (. builder enableNetworkIsolation data))
  (when-let [data (lookup-entry config id :vpc-config)]
    (. builder vpcConfig data))
  (.build builder))


(defn cfn-monitoring-schedule-network-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-network-config-property-builder (new CfnMonitoringSchedule$NetworkConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-props-builder
  "The build-cfn-monitoring-schedule-props-builder function updates a CfnMonitoringScheduleProps$Builder instance using the provided configuration.
  The function takes the CfnMonitoringScheduleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastMonitoringExecutionSummary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-monitoring-execution-summary` |
| `monitoringScheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-schedule-config` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `monitoringScheduleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMonitoringScheduleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-let [data (lookup-entry config id :failure-reason)]
    (. builder failureReason data))
  (when-let [data (lookup-entry config id :last-monitoring-execution-summary)]
    (. builder lastMonitoringExecutionSummary data))
  (when-let [data (lookup-entry config id :monitoring-schedule-config)]
    (. builder monitoringScheduleConfig data))
  (when-let [data (lookup-entry config id :monitoring-schedule-name)]
    (. builder monitoringScheduleName data))
  (when-let [data (lookup-entry config id :monitoring-schedule-status)]
    (. builder monitoringScheduleStatus data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-monitoring-schedule-props-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-props-builder (new CfnMonitoringScheduleProps$Builder) id config))


(defn build-cfn-monitoring-schedule-s3-output-property-builder
  "The build-cfn-monitoring-schedule-s3-output-property-builder function updates a CfnMonitoringSchedule$S3OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$S3OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnMonitoringSchedule$S3OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :local-path)]
    (. builder localPath data))
  (when-let [data (lookup-entry config id :s3-upload-mode)]
    (. builder s3UploadMode data))
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-monitoring-schedule-s3-output-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-s3-output-property-builder (new CfnMonitoringSchedule$S3OutputProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-schedule-config-property-builder
  "The build-cfn-monitoring-schedule-schedule-config-property-builder function updates a CfnMonitoringSchedule$ScheduleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$ScheduleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAnalysisEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-analysis-end-time` |
| `dataAnalysisStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-analysis-start-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnMonitoringSchedule$ScheduleConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-analysis-end-time)]
    (. builder dataAnalysisEndTime data))
  (when-let [data (lookup-entry config id :data-analysis-start-time)]
    (. builder dataAnalysisStartTime data))
  (when-let [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-monitoring-schedule-schedule-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-schedule-config-property-builder (new CfnMonitoringSchedule$ScheduleConfigProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-statistics-resource-property-builder
  "The build-cfn-monitoring-schedule-statistics-resource-property-builder function updates a CfnMonitoringSchedule$StatisticsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$StatisticsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnMonitoringSchedule$StatisticsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-monitoring-schedule-statistics-resource-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-statistics-resource-property-builder (new CfnMonitoringSchedule$StatisticsResourceProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-stopping-condition-property-builder
  "The build-cfn-monitoring-schedule-stopping-condition-property-builder function updates a CfnMonitoringSchedule$StoppingConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$StoppingConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |
"
  [^CfnMonitoringSchedule$StoppingConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
    (. builder maxRuntimeInSeconds data))
  (.build builder))


(defn cfn-monitoring-schedule-stopping-condition-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-stopping-condition-property-builder (new CfnMonitoringSchedule$StoppingConditionProperty$Builder) id config))


(defn build-cfn-monitoring-schedule-vpc-config-property-builder
  "The build-cfn-monitoring-schedule-vpc-config-property-builder function updates a CfnMonitoringSchedule$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSchedule$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
"
  [^CfnMonitoringSchedule$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (.build builder))


(defn cfn-monitoring-schedule-vpc-config-property-builder
  ""
  [id config]
  (build-cfn-monitoring-schedule-vpc-config-property-builder (new CfnMonitoringSchedule$VpcConfigProperty$Builder) id config))


(defn build-cfn-notebook-instance-builder
  "The build-cfn-notebook-instance-builder function updates a CfnNotebookInstance$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `additionalCodeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-code-repositories` |
| `defaultCodeRepository` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-code-repository` |
| `directInternetAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:direct-internet-access` |
| `instanceMetadataServiceConfiguration` | software.amazon.awscdk.services.sagemaker.CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-metadata-service-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-config-name` |
| `notebookInstanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-name` |
| `platformIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-identifier` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `rootAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-access` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnNotebookInstance$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-types)]
    (. builder acceleratorTypes data))
  (when-let [data (lookup-entry config id :additional-code-repositories)]
    (. builder additionalCodeRepositories data))
  (when-let [data (lookup-entry config id :default-code-repository)]
    (. builder defaultCodeRepository data))
  (when-let [data (lookup-entry config id :direct-internet-access)]
    (. builder directInternetAccess data))
  (when-let [data (lookup-entry config id :instance-metadata-service-configuration)]
    (. builder instanceMetadataServiceConfiguration data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lifecycle-config-name)]
    (. builder lifecycleConfigName data))
  (when-let [data (lookup-entry config id :notebook-instance-name)]
    (. builder notebookInstanceName data))
  (when-let [data (lookup-entry config id :platform-identifier)]
    (. builder platformIdentifier data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :root-access)]
    (. builder rootAccess data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-notebook-instance-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-notebook-instance-builder (CfnNotebookInstance$Builder/create scope (name id)) id config))


(defn build-cfn-notebook-instance-instance-metadata-service-configuration-property-builder
  "The build-cfn-notebook-instance-instance-metadata-service-configuration-property-builder function updates a CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minimumInstanceMetadataServiceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:minimum-instance-metadata-service-version` |
"
  [^CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :minimum-instance-metadata-service-version)]
    (. builder minimumInstanceMetadataServiceVersion data))
  (.build builder))


(defn cfn-notebook-instance-instance-metadata-service-configuration-property-builder
  ""
  [id config]
  (build-cfn-notebook-instance-instance-metadata-service-configuration-property-builder (new CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder) id config))


(defn build-cfn-notebook-instance-lifecycle-config-builder
  "The build-cfn-notebook-instance-lifecycle-config-builder function updates a CfnNotebookInstanceLifecycleConfig$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstanceLifecycleConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookInstanceLifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-lifecycle-config-name` |
| `onCreate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-create` |
| `onStart` | java.util.List | [[cdk.support/lookup-entry]] | `:on-start` |
"
  [^CfnNotebookInstanceLifecycleConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :notebook-instance-lifecycle-config-name)]
    (. builder notebookInstanceLifecycleConfigName data))
  (when-let [data (lookup-entry config id :on-create)]
    (. builder onCreate data))
  (when-let [data (lookup-entry config id :on-start)]
    (. builder onStart data))
  (.build builder))


(defn cfn-notebook-instance-lifecycle-config-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-notebook-instance-lifecycle-config-builder (CfnNotebookInstanceLifecycleConfig$Builder/create scope (name id)) id config))


(defn build-cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder
  "The build-cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder function updates a CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
"
  [^CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (.build builder))


(defn cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder
  ""
  [id config]
  (build-cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder (new CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder) id config))


(defn build-cfn-notebook-instance-lifecycle-config-props-builder
  "The build-cfn-notebook-instance-lifecycle-config-props-builder function updates a CfnNotebookInstanceLifecycleConfigProps$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstanceLifecycleConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookInstanceLifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-lifecycle-config-name` |
| `onCreate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-create` |
| `onStart` | java.util.List | [[cdk.support/lookup-entry]] | `:on-start` |
"
  [^CfnNotebookInstanceLifecycleConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :notebook-instance-lifecycle-config-name)]
    (. builder notebookInstanceLifecycleConfigName data))
  (when-let [data (lookup-entry config id :on-create)]
    (. builder onCreate data))
  (when-let [data (lookup-entry config id :on-start)]
    (. builder onStart data))
  (.build builder))


(defn cfn-notebook-instance-lifecycle-config-props-builder
  ""
  [id config]
  (build-cfn-notebook-instance-lifecycle-config-props-builder (new CfnNotebookInstanceLifecycleConfigProps$Builder) id config))


(defn build-cfn-notebook-instance-props-builder
  "The build-cfn-notebook-instance-props-builder function updates a CfnNotebookInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnNotebookInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `additionalCodeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-code-repositories` |
| `defaultCodeRepository` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-code-repository` |
| `directInternetAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:direct-internet-access` |
| `instanceMetadataServiceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-metadata-service-configuration` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `lifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-config-name` |
| `notebookInstanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-name` |
| `platformIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-identifier` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `rootAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-access` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |
"
  [^CfnNotebookInstanceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accelerator-types)]
    (. builder acceleratorTypes data))
  (when-let [data (lookup-entry config id :additional-code-repositories)]
    (. builder additionalCodeRepositories data))
  (when-let [data (lookup-entry config id :default-code-repository)]
    (. builder defaultCodeRepository data))
  (when-let [data (lookup-entry config id :direct-internet-access)]
    (. builder directInternetAccess data))
  (when-let [data (lookup-entry config id :instance-metadata-service-configuration)]
    (. builder instanceMetadataServiceConfiguration data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-let [data (lookup-entry config id :lifecycle-config-name)]
    (. builder lifecycleConfigName data))
  (when-let [data (lookup-entry config id :notebook-instance-name)]
    (. builder notebookInstanceName data))
  (when-let [data (lookup-entry config id :platform-identifier)]
    (. builder platformIdentifier data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :root-access)]
    (. builder rootAccess data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :volume-size-in-gb)]
    (. builder volumeSizeInGb data))
  (.build builder))


(defn cfn-notebook-instance-props-builder
  ""
  [id config]
  (build-cfn-notebook-instance-props-builder (new CfnNotebookInstanceProps$Builder) id config))


(defn build-cfn-pipeline-builder
  "The build-cfn-pipeline-builder function updates a CfnPipeline$Builder instance using the provided configuration.
  The function takes the CfnPipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parallelismConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
| `pipelineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pipeline-definition` |
| `pipelineDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-description` |
| `pipelineDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-display-name` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPipeline$Builder builder id config]
  (when-let [data (lookup-entry config id :parallelism-configuration)]
    (. builder parallelismConfiguration data))
  (when-let [data (lookup-entry config id :pipeline-definition)]
    (. builder pipelineDefinition data))
  (when-let [data (lookup-entry config id :pipeline-description)]
    (. builder pipelineDescription data))
  (when-let [data (lookup-entry config id :pipeline-display-name)]
    (. builder pipelineDisplayName data))
  (when-let [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pipeline-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-pipeline-builder (CfnPipeline$Builder/create scope (name id)) id config))


(defn build-cfn-pipeline-parallelism-configuration-property-builder
  "The build-cfn-pipeline-parallelism-configuration-property-builder function updates a CfnPipeline$ParallelismConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$ParallelismConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxParallelExecutionSteps` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallel-execution-steps` |
"
  [^CfnPipeline$ParallelismConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :max-parallel-execution-steps)]
    (. builder maxParallelExecutionSteps data))
  (.build builder))


(defn cfn-pipeline-parallelism-configuration-property-builder
  ""
  [id config]
  (build-cfn-pipeline-parallelism-configuration-property-builder (new CfnPipeline$ParallelismConfigurationProperty$Builder) id config))


(defn build-cfn-pipeline-pipeline-definition-property-builder
  "The build-cfn-pipeline-pipeline-definition-property-builder function updates a CfnPipeline$PipelineDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$PipelineDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineDefinitionBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-definition-body` |
| `pipelineDefinitionS3Location` | software.amazon.awscdk.services.sagemaker.CfnPipeline$S3LocationProperty | [[cdk.support/lookup-entry]] | `:pipeline-definition-s3-location` |
"
  [^CfnPipeline$PipelineDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pipeline-definition-body)]
    (. builder pipelineDefinitionBody data))
  (when-let [data (lookup-entry config id :pipeline-definition-s3-location)]
    (. builder pipelineDefinitionS3Location data))
  (.build builder))


(defn cfn-pipeline-pipeline-definition-property-builder
  ""
  [id config]
  (build-cfn-pipeline-pipeline-definition-property-builder (new CfnPipeline$PipelineDefinitionProperty$Builder) id config))


(defn build-cfn-pipeline-props-builder
  "The build-cfn-pipeline-props-builder function updates a CfnPipelineProps$Builder instance using the provided configuration.
  The function takes the CfnPipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parallelismConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
| `pipelineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pipeline-definition` |
| `pipelineDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-description` |
| `pipelineDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-display-name` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPipelineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :parallelism-configuration)]
    (. builder parallelismConfiguration data))
  (when-let [data (lookup-entry config id :pipeline-definition)]
    (. builder pipelineDefinition data))
  (when-let [data (lookup-entry config id :pipeline-description)]
    (. builder pipelineDescription data))
  (when-let [data (lookup-entry config id :pipeline-display-name)]
    (. builder pipelineDisplayName data))
  (when-let [data (lookup-entry config id :pipeline-name)]
    (. builder pipelineName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-pipeline-props-builder
  ""
  [id config]
  (build-cfn-pipeline-props-builder (new CfnPipelineProps$Builder) id config))


(defn build-cfn-pipeline-s3-location-property-builder
  "The build-cfn-pipeline-s3-location-property-builder function updates a CfnPipeline$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnPipeline$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnPipeline$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :e-tag)]
    (. builder eTag data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-pipeline-s3-location-property-builder
  ""
  [id config]
  (build-cfn-pipeline-s3-location-property-builder (new CfnPipeline$S3LocationProperty$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `serviceCatalogProvisionedProductDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-catalog-provisioned-product-details` |
| `serviceCatalogProvisioningDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-catalog-provisioning-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProject$Builder builder id config]
  (when-let [data (lookup-entry config id :project-description)]
    (. builder projectDescription data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-let [data (lookup-entry config id :service-catalog-provisioned-product-details)]
    (. builder serviceCatalogProvisionedProductDetails data))
  (when-let [data (lookup-entry config id :service-catalog-provisioning-details)]
    (. builder serviceCatalogProvisioningDetails data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `serviceCatalogProvisionedProductDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-catalog-provisioned-product-details` |
| `serviceCatalogProvisioningDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-catalog-provisioning-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :project-description)]
    (. builder projectDescription data))
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-let [data (lookup-entry config id :service-catalog-provisioned-product-details)]
    (. builder serviceCatalogProvisionedProductDetails data))
  (when-let [data (lookup-entry config id :service-catalog-provisioning-details)]
    (. builder serviceCatalogProvisioningDetails data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-props-builder
  ""
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))


(defn build-cfn-project-provisioning-parameter-property-builder
  "The build-cfn-project-provisioning-parameter-property-builder function updates a CfnProject$ProvisioningParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ProvisioningParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnProject$ProvisioningParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-project-provisioning-parameter-property-builder
  ""
  [id config]
  (build-cfn-project-provisioning-parameter-property-builder (new CfnProject$ProvisioningParameterProperty$Builder) id config))


(defn build-cfn-project-service-catalog-provisioned-product-details-property-builder
  "The build-cfn-project-service-catalog-provisioned-product-details-property-builder function updates a CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedProductId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-id` |
| `provisionedProductStatusMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-status-message` |
"
  [^CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :provisioned-product-id)]
    (. builder provisionedProductId data))
  (when-let [data (lookup-entry config id :provisioned-product-status-message)]
    (. builder provisionedProductStatusMessage data))
  (.build builder))


(defn cfn-project-service-catalog-provisioned-product-details-property-builder
  ""
  [id config]
  (build-cfn-project-service-catalog-provisioned-product-details-property-builder (new CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder) id config))


(defn build-cfn-project-service-catalog-provisioning-details-property-builder
  "The build-cfn-project-service-catalog-provisioning-details-property-builder function updates a CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `provisioningParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioning-parameters` |
"
  [^CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :path-id)]
    (. builder pathId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :provisioning-artifact-id)]
    (. builder provisioningArtifactId data))
  (when-let [data (lookup-entry config id :provisioning-parameters)]
    (. builder provisioningParameters data))
  (.build builder))


(defn cfn-project-service-catalog-provisioning-details-property-builder
  ""
  [id config]
  (build-cfn-project-service-catalog-provisioning-details-property-builder (new CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder) id config))


(defn build-cfn-space-builder
  "The build-cfn-space-builder function updates a CfnSpace$Builder instance using the provided configuration.
  The function takes the CfnSpace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `ownershipSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$OwnershipSettingsProperty | [[cdk.support/lookup-entry]] | `:ownership-settings` |
| `spaceDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-display-name` |
| `spaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-name` |
| `spaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-settings` |
| `spaceSharingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-sharing-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSpace$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :ownership-settings)]
    (. builder ownershipSettings data))
  (when-let [data (lookup-entry config id :space-display-name)]
    (. builder spaceDisplayName data))
  (when-let [data (lookup-entry config id :space-name)]
    (. builder spaceName data))
  (when-let [data (lookup-entry config id :space-settings)]
    (. builder spaceSettings data))
  (when-let [data (lookup-entry config id :space-sharing-settings)]
    (. builder spaceSharingSettings data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-space-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-space-builder (CfnSpace$Builder/create scope (name id)) id config))


(defn build-cfn-space-code-repository-property-builder
  "The build-cfn-space-code-repository-property-builder function updates a CfnSpace$CodeRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$CodeRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
"
  [^CfnSpace$CodeRepositoryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (.build builder))


(defn cfn-space-code-repository-property-builder
  ""
  [id config]
  (build-cfn-space-code-repository-property-builder (new CfnSpace$CodeRepositoryProperty$Builder) id config))


(defn build-cfn-space-custom-file-system-property-builder
  "The build-cfn-space-custom-file-system-property-builder function updates a CfnSpace$CustomFileSystemProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$CustomFileSystemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystem` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system` |
"
  [^CfnSpace$CustomFileSystemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :efs-file-system)]
    (. builder efsFileSystem data))
  (.build builder))


(defn cfn-space-custom-file-system-property-builder
  ""
  [id config]
  (build-cfn-space-custom-file-system-property-builder (new CfnSpace$CustomFileSystemProperty$Builder) id config))


(defn build-cfn-space-custom-image-property-builder
  "The build-cfn-space-custom-image-property-builder function updates a CfnSpace$CustomImageProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$CustomImageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |
"
  [^CfnSpace$CustomImageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-image-config-name)]
    (. builder appImageConfigName data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :image-version-number)]
    (. builder imageVersionNumber data))
  (.build builder))


(defn cfn-space-custom-image-property-builder
  ""
  [id config]
  (build-cfn-space-custom-image-property-builder (new CfnSpace$CustomImageProperty$Builder) id config))


(defn build-cfn-space-ebs-storage-settings-property-builder
  "The build-cfn-space-ebs-storage-settings-property-builder function updates a CfnSpace$EbsStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$EbsStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-volume-size-in-gb` |
"
  [^CfnSpace$EbsStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-volume-size-in-gb)]
    (. builder ebsVolumeSizeInGb data))
  (.build builder))


(defn cfn-space-ebs-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-space-ebs-storage-settings-property-builder (new CfnSpace$EbsStorageSettingsProperty$Builder) id config))


(defn build-cfn-space-efs-file-system-property-builder
  "The build-cfn-space-efs-file-system-property-builder function updates a CfnSpace$EFSFileSystemProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$EFSFileSystemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
"
  [^CfnSpace$EFSFileSystemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (.build builder))


(defn cfn-space-efs-file-system-property-builder
  ""
  [id config]
  (build-cfn-space-efs-file-system-property-builder (new CfnSpace$EFSFileSystemProperty$Builder) id config))


(defn build-cfn-space-jupyter-server-app-settings-property-builder
  "The build-cfn-space-jupyter-server-app-settings-property-builder function updates a CfnSpace$JupyterServerAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$JupyterServerAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnSpace$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnSpace$JupyterServerAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-space-jupyter-server-app-settings-property-builder
  ""
  [id config]
  (build-cfn-space-jupyter-server-app-settings-property-builder (new CfnSpace$JupyterServerAppSettingsProperty$Builder) id config))


(defn build-cfn-space-kernel-gateway-app-settings-property-builder
  "The build-cfn-space-kernel-gateway-app-settings-property-builder function updates a CfnSpace$KernelGatewayAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$KernelGatewayAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnSpace$KernelGatewayAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-space-kernel-gateway-app-settings-property-builder
  ""
  [id config]
  (build-cfn-space-kernel-gateway-app-settings-property-builder (new CfnSpace$KernelGatewayAppSettingsProperty$Builder) id config))


(defn build-cfn-space-ownership-settings-property-builder
  "The build-cfn-space-ownership-settings-property-builder function updates a CfnSpace$OwnershipSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$OwnershipSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ownerUserProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-user-profile-name` |
"
  [^CfnSpace$OwnershipSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :owner-user-profile-name)]
    (. builder ownerUserProfileName data))
  (.build builder))


(defn cfn-space-ownership-settings-property-builder
  ""
  [id config]
  (build-cfn-space-ownership-settings-property-builder (new CfnSpace$OwnershipSettingsProperty$Builder) id config))


(defn build-cfn-space-props-builder
  "The build-cfn-space-props-builder function updates a CfnSpaceProps$Builder instance using the provided configuration.
  The function takes the CfnSpaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `ownershipSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ownership-settings` |
| `spaceDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-display-name` |
| `spaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-name` |
| `spaceSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceSettingsProperty | [[cdk.support/lookup-entry]] | `:space-settings` |
| `spaceSharingSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceSharingSettingsProperty | [[cdk.support/lookup-entry]] | `:space-sharing-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSpaceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :ownership-settings)]
    (. builder ownershipSettings data))
  (when-let [data (lookup-entry config id :space-display-name)]
    (. builder spaceDisplayName data))
  (when-let [data (lookup-entry config id :space-name)]
    (. builder spaceName data))
  (when-let [data (lookup-entry config id :space-settings)]
    (. builder spaceSettings data))
  (when-let [data (lookup-entry config id :space-sharing-settings)]
    (. builder spaceSharingSettings data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-space-props-builder
  ""
  [id config]
  (build-cfn-space-props-builder (new CfnSpaceProps$Builder) id config))


(defn build-cfn-space-resource-spec-property-builder
  "The build-cfn-space-resource-spec-property-builder function updates a CfnSpace$ResourceSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$ResourceSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |
"
  [^CfnSpace$ResourceSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :sage-maker-image-arn)]
    (. builder sageMakerImageArn data))
  (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
    (. builder sageMakerImageVersionArn data))
  (.build builder))


(defn cfn-space-resource-spec-property-builder
  ""
  [id config]
  (build-cfn-space-resource-spec-property-builder (new CfnSpace$ResourceSpecProperty$Builder) id config))


(defn build-cfn-space-space-code-editor-app-settings-property-builder
  "The build-cfn-space-space-code-editor-app-settings-property-builder function updates a CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnSpace$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-space-space-code-editor-app-settings-property-builder
  ""
  [id config]
  (build-cfn-space-space-code-editor-app-settings-property-builder (new CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder) id config))


(defn build-cfn-space-space-jupyter-lab-app-settings-property-builder
  "The build-cfn-space-space-jupyter-lab-app-settings-property-builder function updates a CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-repositories)]
    (. builder codeRepositories data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-space-space-jupyter-lab-app-settings-property-builder
  ""
  [id config]
  (build-cfn-space-space-jupyter-lab-app-settings-property-builder (new CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder) id config))


(defn build-cfn-space-space-settings-property-builder
  "The build-cfn-space-space-settings-property-builder function updates a CfnSpace$SpaceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$SpaceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `codeEditorAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-settings` |
| `customFileSystems` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-file-systems` |
| `jupyterLabAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$JupyterServerAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `spaceStorageSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceStorageSettingsProperty | [[cdk.support/lookup-entry]] | `:space-storage-settings` |
"
  [^CfnSpace$SpaceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-type)]
    (. builder appType data))
  (when-let [data (lookup-entry config id :code-editor-app-settings)]
    (. builder codeEditorAppSettings data))
  (when-let [data (lookup-entry config id :custom-file-systems)]
    (. builder customFileSystems data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-settings)]
    (. builder jupyterLabAppSettings data))
  (when-let [data (lookup-entry config id :jupyter-server-app-settings)]
    (. builder jupyterServerAppSettings data))
  (when-let [data (lookup-entry config id :kernel-gateway-app-settings)]
    (. builder kernelGatewayAppSettings data))
  (when-let [data (lookup-entry config id :space-storage-settings)]
    (. builder spaceStorageSettings data))
  (.build builder))


(defn cfn-space-space-settings-property-builder
  ""
  [id config]
  (build-cfn-space-space-settings-property-builder (new CfnSpace$SpaceSettingsProperty$Builder) id config))


(defn build-cfn-space-space-sharing-settings-property-builder
  "The build-cfn-space-space-sharing-settings-property-builder function updates a CfnSpace$SpaceSharingSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$SpaceSharingSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sharingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sharing-type` |
"
  [^CfnSpace$SpaceSharingSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sharing-type)]
    (. builder sharingType data))
  (.build builder))


(defn cfn-space-space-sharing-settings-property-builder
  ""
  [id config]
  (build-cfn-space-space-sharing-settings-property-builder (new CfnSpace$SpaceSharingSettingsProperty$Builder) id config))


(defn build-cfn-space-space-storage-settings-property-builder
  "The build-cfn-space-space-storage-settings-property-builder function updates a CfnSpace$SpaceStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnSpace$SpaceStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-storage-settings` |
"
  [^CfnSpace$SpaceStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-storage-settings)]
    (. builder ebsStorageSettings data))
  (.build builder))


(defn cfn-space-space-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-space-space-storage-settings-property-builder (new CfnSpace$SpaceStorageSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-builder
  "The build-cfn-user-profile-builder function updates a CfnUserProfile$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `singleSignOnUserIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-identifier` |
| `singleSignOnUserValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-value` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |
"
  [^CfnUserProfile$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :single-sign-on-user-identifier)]
    (. builder singleSignOnUserIdentifier data))
  (when-let [data (lookup-entry config id :single-sign-on-user-value)]
    (. builder singleSignOnUserValue data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (when-let [data (lookup-entry config id :user-settings)]
    (. builder userSettings data))
  (.build builder))


(defn cfn-user-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-user-profile-builder (CfnUserProfile$Builder/create scope (name id)) id config))


(defn build-cfn-user-profile-code-editor-app-settings-property-builder
  "The build-cfn-user-profile-code-editor-app-settings-property-builder function updates a CfnUserProfile$CodeEditorAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$CodeEditorAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |
"
  [^CfnUserProfile$CodeEditorAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (when-let [data (lookup-entry config id :lifecycle-config-arns)]
    (. builder lifecycleConfigArns data))
  (.build builder))


(defn cfn-user-profile-code-editor-app-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-code-editor-app-settings-property-builder (new CfnUserProfile$CodeEditorAppSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-code-repository-property-builder
  "The build-cfn-user-profile-code-repository-property-builder function updates a CfnUserProfile$CodeRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$CodeRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
"
  [^CfnUserProfile$CodeRepositoryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (.build builder))


(defn cfn-user-profile-code-repository-property-builder
  ""
  [id config]
  (build-cfn-user-profile-code-repository-property-builder (new CfnUserProfile$CodeRepositoryProperty$Builder) id config))


(defn build-cfn-user-profile-custom-file-system-config-property-builder
  "The build-cfn-user-profile-custom-file-system-config-property-builder function updates a CfnUserProfile$CustomFileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$CustomFileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystemConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system-config` |
"
  [^CfnUserProfile$CustomFileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :efs-file-system-config)]
    (. builder efsFileSystemConfig data))
  (.build builder))


(defn cfn-user-profile-custom-file-system-config-property-builder
  ""
  [id config]
  (build-cfn-user-profile-custom-file-system-config-property-builder (new CfnUserProfile$CustomFileSystemConfigProperty$Builder) id config))


(defn build-cfn-user-profile-custom-image-property-builder
  "The build-cfn-user-profile-custom-image-property-builder function updates a CfnUserProfile$CustomImageProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$CustomImageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |
"
  [^CfnUserProfile$CustomImageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-image-config-name)]
    (. builder appImageConfigName data))
  (when-let [data (lookup-entry config id :image-name)]
    (. builder imageName data))
  (when-let [data (lookup-entry config id :image-version-number)]
    (. builder imageVersionNumber data))
  (.build builder))


(defn cfn-user-profile-custom-image-property-builder
  ""
  [id config]
  (build-cfn-user-profile-custom-image-property-builder (new CfnUserProfile$CustomImageProperty$Builder) id config))


(defn build-cfn-user-profile-custom-posix-user-config-property-builder
  "The build-cfn-user-profile-custom-posix-user-config-property-builder function updates a CfnUserProfile$CustomPosixUserConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$CustomPosixUserConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnUserProfile$CustomPosixUserConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-let [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-user-profile-custom-posix-user-config-property-builder
  ""
  [id config]
  (build-cfn-user-profile-custom-posix-user-config-property-builder (new CfnUserProfile$CustomPosixUserConfigProperty$Builder) id config))


(defn build-cfn-user-profile-default-ebs-storage-settings-property-builder
  "The build-cfn-user-profile-default-ebs-storage-settings-property-builder function updates a CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ebs-volume-size-in-gb` |
| `maximumEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ebs-volume-size-in-gb` |
"
  [^CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-ebs-volume-size-in-gb)]
    (. builder defaultEbsVolumeSizeInGb data))
  (when-let [data (lookup-entry config id :maximum-ebs-volume-size-in-gb)]
    (. builder maximumEbsVolumeSizeInGb data))
  (.build builder))


(defn cfn-user-profile-default-ebs-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-default-ebs-storage-settings-property-builder (new CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-default-space-storage-settings-property-builder
  "The build-cfn-user-profile-default-space-storage-settings-property-builder function updates a CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-ebs-storage-settings` |
"
  [^CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-ebs-storage-settings)]
    (. builder defaultEbsStorageSettings data))
  (.build builder))


(defn cfn-user-profile-default-space-storage-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-default-space-storage-settings-property-builder (new CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-efs-file-system-config-property-builder
  "The build-cfn-user-profile-efs-file-system-config-property-builder function updates a CfnUserProfile$EFSFileSystemConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$EFSFileSystemConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |
"
  [^CfnUserProfile$EFSFileSystemConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-let [data (lookup-entry config id :file-system-path)]
    (. builder fileSystemPath data))
  (.build builder))


(defn cfn-user-profile-efs-file-system-config-property-builder
  ""
  [id config]
  (build-cfn-user-profile-efs-file-system-config-property-builder (new CfnUserProfile$EFSFileSystemConfigProperty$Builder) id config))


(defn build-cfn-user-profile-jupyter-lab-app-settings-property-builder
  "The build-cfn-user-profile-jupyter-lab-app-settings-property-builder function updates a CfnUserProfile$JupyterLabAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$JupyterLabAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |
"
  [^CfnUserProfile$JupyterLabAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-repositories)]
    (. builder codeRepositories data))
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (when-let [data (lookup-entry config id :lifecycle-config-arns)]
    (. builder lifecycleConfigArns data))
  (.build builder))


(defn cfn-user-profile-jupyter-lab-app-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-jupyter-lab-app-settings-property-builder (new CfnUserProfile$JupyterLabAppSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-jupyter-server-app-settings-property-builder
  "The build-cfn-user-profile-jupyter-server-app-settings-property-builder function updates a CfnUserProfile$JupyterServerAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$JupyterServerAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnUserProfile$JupyterServerAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-user-profile-jupyter-server-app-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-jupyter-server-app-settings-property-builder (new CfnUserProfile$JupyterServerAppSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-kernel-gateway-app-settings-property-builder
  "The build-cfn-user-profile-kernel-gateway-app-settings-property-builder function updates a CfnUserProfile$KernelGatewayAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$KernelGatewayAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
"
  [^CfnUserProfile$KernelGatewayAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-images)]
    (. builder customImages data))
  (when-let [data (lookup-entry config id :default-resource-spec)]
    (. builder defaultResourceSpec data))
  (.build builder))


(defn cfn-user-profile-kernel-gateway-app-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-kernel-gateway-app-settings-property-builder (new CfnUserProfile$KernelGatewayAppSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-props-builder
  "The build-cfn-user-profile-props-builder function updates a CfnUserProfileProps$Builder instance using the provided configuration.
  The function takes the CfnUserProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `singleSignOnUserIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-identifier` |
| `singleSignOnUserValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-value` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
| `userSettings` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$UserSettingsProperty | [[cdk.support/lookup-entry]] | `:user-settings` |
"
  [^CfnUserProfileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-id)]
    (. builder domainId data))
  (when-let [data (lookup-entry config id :single-sign-on-user-identifier)]
    (. builder singleSignOnUserIdentifier data))
  (when-let [data (lookup-entry config id :single-sign-on-user-value)]
    (. builder singleSignOnUserValue data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :user-profile-name)]
    (. builder userProfileName data))
  (when-let [data (lookup-entry config id :user-settings)]
    (. builder userSettings data))
  (.build builder))


(defn cfn-user-profile-props-builder
  ""
  [id config]
  (build-cfn-user-profile-props-builder (new CfnUserProfileProps$Builder) id config))


(defn build-cfn-user-profile-r-studio-server-pro-app-settings-property-builder
  "The build-cfn-user-profile-r-studio-server-pro-app-settings-property-builder function updates a CfnUserProfile$RStudioServerProAppSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$RStudioServerProAppSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-status` |
| `userGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group` |
"
  [^CfnUserProfile$RStudioServerProAppSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :access-status)]
    (. builder accessStatus data))
  (when-let [data (lookup-entry config id :user-group)]
    (. builder userGroup data))
  (.build builder))


(defn cfn-user-profile-r-studio-server-pro-app-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-r-studio-server-pro-app-settings-property-builder (new CfnUserProfile$RStudioServerProAppSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-resource-spec-property-builder
  "The build-cfn-user-profile-resource-spec-property-builder function updates a CfnUserProfile$ResourceSpecProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$ResourceSpecProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |
"
  [^CfnUserProfile$ResourceSpecProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :sage-maker-image-arn)]
    (. builder sageMakerImageArn data))
  (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
    (. builder sageMakerImageVersionArn data))
  (.build builder))


(defn cfn-user-profile-resource-spec-property-builder
  ""
  [id config]
  (build-cfn-user-profile-resource-spec-property-builder (new CfnUserProfile$ResourceSpecProperty$Builder) id config))


(defn build-cfn-user-profile-sharing-settings-property-builder
  "The build-cfn-user-profile-sharing-settings-property-builder function updates a CfnUserProfile$SharingSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$SharingSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookOutputOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-output-option` |
| `s3KmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |
"
  [^CfnUserProfile$SharingSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :notebook-output-option)]
    (. builder notebookOutputOption data))
  (when-let [data (lookup-entry config id :s3-kms-key-id)]
    (. builder s3KmsKeyId data))
  (when-let [data (lookup-entry config id :s3-output-path)]
    (. builder s3OutputPath data))
  (.build builder))


(defn cfn-user-profile-sharing-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-sharing-settings-property-builder (new CfnUserProfile$SharingSettingsProperty$Builder) id config))


(defn build-cfn-user-profile-user-settings-property-builder
  "The build-cfn-user-profile-user-settings-property-builder function updates a CfnUserProfile$UserSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$UserSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeEditorAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-settings` |
| `customFileSystemConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-file-system-configs` |
| `customPosixUserConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-posix-user-config` |
| `defaultLandingUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-landing-uri` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `jupyterLabAppSettings` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$JupyterLabAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$KernelGatewayAppSettingsProperty | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `rStudioServerProAppSettings` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$RStudioServerProAppSettingsProperty | [[cdk.support/lookup-entry]] | `:r-studio-server-pro-app-settings` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sharingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sharing-settings` |
| `spaceStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-storage-settings` |
| `studioWebPortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-web-portal` |
"
  [^CfnUserProfile$UserSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-editor-app-settings)]
    (. builder codeEditorAppSettings data))
  (when-let [data (lookup-entry config id :custom-file-system-configs)]
    (. builder customFileSystemConfigs data))
  (when-let [data (lookup-entry config id :custom-posix-user-config)]
    (. builder customPosixUserConfig data))
  (when-let [data (lookup-entry config id :default-landing-uri)]
    (. builder defaultLandingUri data))
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (lookup-entry config id :jupyter-lab-app-settings)]
    (. builder jupyterLabAppSettings data))
  (when-let [data (lookup-entry config id :jupyter-server-app-settings)]
    (. builder jupyterServerAppSettings data))
  (when-let [data (lookup-entry config id :kernel-gateway-app-settings)]
    (. builder kernelGatewayAppSettings data))
  (when-let [data (lookup-entry config id :r-studio-server-pro-app-settings)]
    (. builder rStudioServerProAppSettings data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :sharing-settings)]
    (. builder sharingSettings data))
  (when-let [data (lookup-entry config id :space-storage-settings)]
    (. builder spaceStorageSettings data))
  (when-let [data (lookup-entry config id :studio-web-portal)]
    (. builder studioWebPortal data))
  (.build builder))


(defn cfn-user-profile-user-settings-property-builder
  ""
  [id config]
  (build-cfn-user-profile-user-settings-property-builder (new CfnUserProfile$UserSettingsProperty$Builder) id config))


(defn build-cfn-workteam-builder
  "The build-cfn-workteam-builder function updates a CfnWorkteam$Builder instance using the provided configuration.
  The function takes the CfnWorkteam$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-definitions` |
| `notificationConfiguration` | software.amazon.awscdk.services.sagemaker.CfnWorkteam$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workforceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workforce-name` |
| `workteamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workteam-name` |
"
  [^CfnWorkteam$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :member-definitions)]
    (. builder memberDefinitions data))
  (when-let [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workforce-name)]
    (. builder workforceName data))
  (when-let [data (lookup-entry config id :workteam-name)]
    (. builder workteamName data))
  (.build builder))


(defn cfn-workteam-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-workteam-builder (CfnWorkteam$Builder/create scope (name id)) id config))


(defn build-cfn-workteam-cognito-member-definition-property-builder
  "The build-cfn-workteam-cognito-member-definition-property-builder function updates a CfnWorkteam$CognitoMemberDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkteam$CognitoMemberDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-client-id` |
| `cognitoUserGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-user-group` |
| `cognitoUserPool` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-user-pool` |
"
  [^CfnWorkteam$CognitoMemberDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cognito-client-id)]
    (. builder cognitoClientId data))
  (when-let [data (lookup-entry config id :cognito-user-group)]
    (. builder cognitoUserGroup data))
  (when-let [data (lookup-entry config id :cognito-user-pool)]
    (. builder cognitoUserPool data))
  (.build builder))


(defn cfn-workteam-cognito-member-definition-property-builder
  ""
  [id config]
  (build-cfn-workteam-cognito-member-definition-property-builder (new CfnWorkteam$CognitoMemberDefinitionProperty$Builder) id config))


(defn build-cfn-workteam-member-definition-property-builder
  "The build-cfn-workteam-member-definition-property-builder function updates a CfnWorkteam$MemberDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkteam$MemberDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoMemberDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-member-definition` |
| `oidcMemberDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc-member-definition` |
"
  [^CfnWorkteam$MemberDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cognito-member-definition)]
    (. builder cognitoMemberDefinition data))
  (when-let [data (lookup-entry config id :oidc-member-definition)]
    (. builder oidcMemberDefinition data))
  (.build builder))


(defn cfn-workteam-member-definition-property-builder
  ""
  [id config]
  (build-cfn-workteam-member-definition-property-builder (new CfnWorkteam$MemberDefinitionProperty$Builder) id config))


(defn build-cfn-workteam-notification-configuration-property-builder
  "The build-cfn-workteam-notification-configuration-property-builder function updates a CfnWorkteam$NotificationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkteam$NotificationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |
"
  [^CfnWorkteam$NotificationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :notification-topic-arn)]
    (. builder notificationTopicArn data))
  (.build builder))


(defn cfn-workteam-notification-configuration-property-builder
  ""
  [id config]
  (build-cfn-workteam-notification-configuration-property-builder (new CfnWorkteam$NotificationConfigurationProperty$Builder) id config))


(defn build-cfn-workteam-oidc-member-definition-property-builder
  "The build-cfn-workteam-oidc-member-definition-property-builder function updates a CfnWorkteam$OidcMemberDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkteam$OidcMemberDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oidcGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:oidc-groups` |
"
  [^CfnWorkteam$OidcMemberDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :oidc-groups)]
    (. builder oidcGroups data))
  (.build builder))


(defn cfn-workteam-oidc-member-definition-property-builder
  ""
  [id config]
  (build-cfn-workteam-oidc-member-definition-property-builder (new CfnWorkteam$OidcMemberDefinitionProperty$Builder) id config))


(defn build-cfn-workteam-props-builder
  "The build-cfn-workteam-props-builder function updates a CfnWorkteamProps$Builder instance using the provided configuration.
  The function takes the CfnWorkteamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-definitions` |
| `notificationConfiguration` | software.amazon.awscdk.services.sagemaker.CfnWorkteam$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workforceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workforce-name` |
| `workteamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workteam-name` |
"
  [^CfnWorkteamProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :member-definitions)]
    (. builder memberDefinitions data))
  (when-let [data (lookup-entry config id :notification-configuration)]
    (. builder notificationConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workforce-name)]
    (. builder workforceName data))
  (when-let [data (lookup-entry config id :workteam-name)]
    (. builder workteamName data))
  (.build builder))


(defn cfn-workteam-props-builder
  ""
  [id config]
  (build-cfn-workteam-props-builder (new CfnWorkteamProps$Builder) id config))