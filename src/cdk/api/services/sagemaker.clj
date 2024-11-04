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


(defn cfn-app-builder
  "The cfn-app-builder function buildes out new instances of 
CfnApp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-name` |
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `resourceSpec` | software.amazon.awscdk.services.sagemaker.CfnApp$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:resource-spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |"
  [stack id config]
  (let [builder (CfnApp$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-app-image-config-builder
  "The cfn-app-image-config-builder function buildes out new instances of 
CfnAppImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `codeEditorAppImageConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$CodeEditorAppImageConfigProperty | [[cdk.support/lookup-entry]] | `:code-editor-app-image-config` |
| `jupyterLabAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-image-config` |
| `kernelGatewayImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-image-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-app-image-config-code-editor-app-image-config-property-builder
  "The cfn-app-image-config-code-editor-app-image-config-property-builder function buildes out new instances of 
CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-config` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$CodeEditorAppImageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-config)]
      (. builder containerConfig data))
    (.build builder)))


(defn cfn-app-image-config-container-config-property-builder
  "The cfn-app-image-config-container-config-property-builder function buildes out new instances of 
CfnAppImageConfig$ContainerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `containerEnvironmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-environment-variables` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$ContainerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-arguments)]
      (. builder containerArguments data))
    (when-let [data (lookup-entry config id :container-entrypoint)]
      (. builder containerEntrypoint data))
    (when-let [data (lookup-entry config id :container-environment-variables)]
      (. builder containerEnvironmentVariables data))
    (.build builder)))


(defn cfn-app-image-config-custom-image-container-environment-variable-property-builder
  "The cfn-app-image-config-custom-image-container-environment-variable-property-builder function buildes out new instances of 
CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$CustomImageContainerEnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-app-image-config-file-system-config-property-builder
  "The cfn-app-image-config-file-system-config-property-builder function buildes out new instances of 
CfnAppImageConfig$FileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultGid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-gid` |
| `defaultUid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-uid` |
| `mountPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-path` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$FileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-gid)]
      (. builder defaultGid data))
    (when-let [data (lookup-entry config id :default-uid)]
      (. builder defaultUid data))
    (when-let [data (lookup-entry config id :mount-path)]
      (. builder mountPath data))
    (.build builder)))


(defn cfn-app-image-config-jupyter-lab-app-image-config-property-builder
  "The cfn-app-image-config-jupyter-lab-app-image-config-property-builder function buildes out new instances of 
CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-config` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$JupyterLabAppImageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-config)]
      (. builder containerConfig data))
    (.build builder)))


(defn cfn-app-image-config-kernel-gateway-image-config-property-builder
  "The cfn-app-image-config-kernel-gateway-image-config-property-builder function buildes out new instances of 
CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$FileSystemConfigProperty | [[cdk.support/lookup-entry]] | `:file-system-config` |
| `kernelSpecs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-specs` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$KernelGatewayImageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-config)]
      (. builder fileSystemConfig data))
    (when-let [data (lookup-entry config id :kernel-specs)]
      (. builder kernelSpecs data))
    (.build builder)))


(defn cfn-app-image-config-kernel-spec-property-builder
  "The cfn-app-image-config-kernel-spec-property-builder function buildes out new instances of 
CfnAppImageConfig$KernelSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnAppImageConfig$KernelSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-app-image-config-props-builder
  "The cfn-app-image-config-props-builder function buildes out new instances of 
CfnAppImageConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `codeEditorAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-image-config` |
| `jupyterLabAppImageConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-image-config` |
| `kernelGatewayImageConfig` | software.amazon.awscdk.services.sagemaker.CfnAppImageConfig$KernelGatewayImageConfigProperty | [[cdk.support/lookup-entry]] | `:kernel-gateway-image-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppImageConfigProps$Builder.)]
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
    (.build builder)))


(defn cfn-app-props-builder
  "The cfn-app-props-builder function buildes out new instances of 
CfnAppProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-name` |
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `resourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-spec` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |"
  [stack id config]
  (let [builder (CfnAppProps$Builder.)]
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
    (.build builder)))


(defn cfn-app-resource-spec-property-builder
  "The cfn-app-resource-spec-property-builder function buildes out new instances of 
CfnApp$ResourceSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |"
  [stack id config]
  (let [builder (CfnApp$ResourceSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :sage-maker-image-arn)]
      (. builder sageMakerImageArn data))
    (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
      (. builder sageMakerImageVersionArn data))
    (.build builder)))


(defn cfn-code-repository-builder
  "The cfn-code-repository-builder function buildes out new instances of 
CfnCodeRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-repository-name` |
| `gitConfig` | software.amazon.awscdk.services.sagemaker.CfnCodeRepository$GitConfigProperty | [[cdk.support/lookup-entry]] | `:git-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCodeRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :code-repository-name)]
      (. builder codeRepositoryName data))
    (when-let [data (lookup-entry config id :git-config)]
      (. builder gitConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-code-repository-git-config-property-builder
  "The cfn-code-repository-git-config-property-builder function buildes out new instances of 
CfnCodeRepository$GitConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnCodeRepository$GitConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-code-repository-props-builder
  "The cfn-code-repository-props-builder function buildes out new instances of 
CfnCodeRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-repository-name` |
| `gitConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:git-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCodeRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :code-repository-name)]
      (. builder codeRepositoryName data))
    (when-let [data (lookup-entry config id :git-config)]
      (. builder gitConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-quality-job-definition-batch-transform-input-property-builder
  "The cfn-data-quality-job-definition-batch-transform-input-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$BatchTransformInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-quality-job-definition-builder
  "The cfn-data-quality-job-definition-builder function buildes out new instances of 
CfnDataQualityJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-quality-job-definition-cluster-config-property-builder
  "The cfn-data-quality-job-definition-cluster-config-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$ClusterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-data-quality-job-definition-constraints-resource-property-builder
  "The cfn-data-quality-job-definition-constraints-resource-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$ConstraintsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-data-quality-job-definition-csv-property-builder
  "The cfn-data-quality-job-definition-csv-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-data-quality-job-definition-data-quality-app-specification-property-builder
  "The cfn-data-quality-job-definition-data-quality-app-specification-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$DataQualityAppSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-quality-job-definition-data-quality-baseline-config-property-builder
  "The cfn-data-quality-job-definition-data-quality-baseline-config-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$ConstraintsResourceProperty | [[cdk.support/lookup-entry]] | `:constraints-resource` |
| `statisticsResource` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$StatisticsResourceProperty | [[cdk.support/lookup-entry]] | `:statistics-resource` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$DataQualityBaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :baselining-job-name)]
      (. builder baseliningJobName data))
    (when-let [data (lookup-entry config id :constraints-resource)]
      (. builder constraintsResource data))
    (when-let [data (lookup-entry config id :statistics-resource)]
      (. builder statisticsResource data))
    (.build builder)))


(defn cfn-data-quality-job-definition-data-quality-job-input-property-builder
  "The cfn-data-quality-job-definition-data-quality-job-input-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$DataQualityJobInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-transform-input)]
      (. builder batchTransformInput data))
    (when-let [data (lookup-entry config id :endpoint-input)]
      (. builder endpointInput data))
    (.build builder)))


(defn cfn-data-quality-job-definition-dataset-format-property-builder
  "The cfn-data-quality-job-definition-dataset-format-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$DatasetFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:parquet` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$DatasetFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :parquet)]
      (. builder parquet data))
    (.build builder)))


(defn cfn-data-quality-job-definition-endpoint-input-property-builder
  "The cfn-data-quality-job-definition-endpoint-input-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$EndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$EndpointInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-data-quality-job-definition-json-property-builder
  "The cfn-data-quality-job-definition-json-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$JsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$JsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :line)]
      (. builder line data))
    (.build builder)))


(defn cfn-data-quality-job-definition-monitoring-output-config-property-builder
  "The cfn-data-quality-job-definition-monitoring-output-config-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$MonitoringOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :monitoring-outputs)]
      (. builder monitoringOutputs data))
    (.build builder)))


(defn cfn-data-quality-job-definition-monitoring-output-property-builder
  "The cfn-data-quality-job-definition-monitoring-output-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$MonitoringOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-output)]
      (. builder s3Output data))
    (.build builder)))


(defn cfn-data-quality-job-definition-monitoring-resources-property-builder
  "The cfn-data-quality-job-definition-monitoring-resources-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition$ClusterConfigProperty | [[cdk.support/lookup-entry]] | `:cluster-config` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$MonitoringResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
    (.build builder)))


(defn cfn-data-quality-job-definition-network-config-property-builder
  "The cfn-data-quality-job-definition-network-config-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$NetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$NetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
      (. builder enableInterContainerTrafficEncryption data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-data-quality-job-definition-props-builder
  "The cfn-data-quality-job-definition-props-builder function buildes out new instances of 
CfnDataQualityJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinitionProps$Builder.)]
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
    (.build builder)))


(defn cfn-data-quality-job-definition-s3-output-property-builder
  "The cfn-data-quality-job-definition-s3-output-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$S3OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$S3OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-path)]
      (. builder localPath data))
    (when-let [data (lookup-entry config id :s3-upload-mode)]
      (. builder s3UploadMode data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-data-quality-job-definition-statistics-resource-property-builder
  "The cfn-data-quality-job-definition-statistics-resource-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$StatisticsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-data-quality-job-definition-stopping-condition-property-builder
  "The cfn-data-quality-job-definition-stopping-condition-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$StoppingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$StoppingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
      (. builder maxRuntimeInSeconds data))
    (.build builder)))


(defn cfn-data-quality-job-definition-vpc-config-property-builder
  "The cfn-data-quality-job-definition-vpc-config-property-builder function buildes out new instances of 
CfnDataQualityJobDefinition$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnDataQualityJobDefinition$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-device-builder
  "The cfn-device-builder function buildes out new instances of 
CfnDevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | software.amazon.awscdk.services.sagemaker.CfnDevice$DeviceProperty | [[cdk.support/lookup-entry]] | `:device` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDevice$Builder/create stack id)]
    (when-let [data (lookup-entry config id :device)]
      (. builder device data))
    (when-let [data (lookup-entry config id :device-fleet-name)]
      (. builder deviceFleetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-device-property-builder
  "The cfn-device-device-property-builder function buildes out new instances of 
CfnDevice$DeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `iotThingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:iot-thing-name` |"
  [stack id config]
  (let [builder (CfnDevice$DeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :iot-thing-name)]
      (. builder iotThingName data))
    (.build builder)))


(defn cfn-device-fleet-builder
  "The cfn-device-fleet-builder function buildes out new instances of 
CfnDeviceFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnDeviceFleet$EdgeOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceFleet$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-device-fleet-edge-output-config-property-builder
  "The cfn-device-fleet-edge-output-config-property-builder function buildes out new instances of 
CfnDeviceFleet$EdgeOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-location` |"
  [stack id config]
  (let [builder (CfnDeviceFleet$EdgeOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-output-location)]
      (. builder s3OutputLocation data))
    (.build builder)))


(defn cfn-device-fleet-props-builder
  "The cfn-device-fleet-props-builder function buildes out new instances of 
CfnDeviceFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnDeviceFleet$EdgeOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceFleetProps$Builder.)]
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
    (.build builder)))


(defn cfn-device-props-builder
  "The cfn-device-props-builder function buildes out new instances of 
CfnDeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | software.amazon.awscdk.services.sagemaker.CfnDevice$DeviceProperty | [[cdk.support/lookup-entry]] | `:device` |
| `deviceFleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-fleet-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :device)]
      (. builder device data))
    (when-let [data (lookup-entry config id :device-fleet-name)]
      (. builder deviceFleetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-domain-code-editor-app-settings-property-builder
  "The cfn-domain-code-editor-app-settings-property-builder function buildes out new instances of 
CfnDomain$CodeEditorAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |"
  [stack id config]
  (let [builder (CfnDomain$CodeEditorAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (when-let [data (lookup-entry config id :lifecycle-config-arns)]
      (. builder lifecycleConfigArns data))
    (.build builder)))


(defn cfn-domain-code-repository-property-builder
  "The cfn-domain-code-repository-property-builder function buildes out new instances of 
CfnDomain$CodeRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |"
  [stack id config]
  (let [builder (CfnDomain$CodeRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (.build builder)))


(defn cfn-domain-custom-file-system-config-property-builder
  "The cfn-domain-custom-file-system-config-property-builder function buildes out new instances of 
CfnDomain$CustomFileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystemConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system-config` |"
  [stack id config]
  (let [builder (CfnDomain$CustomFileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs-file-system-config)]
      (. builder efsFileSystemConfig data))
    (.build builder)))


(defn cfn-domain-custom-image-property-builder
  "The cfn-domain-custom-image-property-builder function buildes out new instances of 
CfnDomain$CustomImageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |"
  [stack id config]
  (let [builder (CfnDomain$CustomImageProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-image-config-name)]
      (. builder appImageConfigName data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :image-version-number)]
      (. builder imageVersionNumber data))
    (.build builder)))


(defn cfn-domain-custom-posix-user-config-property-builder
  "The cfn-domain-custom-posix-user-config-property-builder function buildes out new instances of 
CfnDomain$CustomPosixUserConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |"
  [stack id config]
  (let [builder (CfnDomain$CustomPosixUserConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (.build builder)))


(defn cfn-domain-default-ebs-storage-settings-property-builder
  "The cfn-domain-default-ebs-storage-settings-property-builder function buildes out new instances of 
CfnDomain$DefaultEbsStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ebs-volume-size-in-gb` |
| `maximumEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ebs-volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnDomain$DefaultEbsStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-ebs-volume-size-in-gb)]
      (. builder defaultEbsVolumeSizeInGb data))
    (when-let [data (lookup-entry config id :maximum-ebs-volume-size-in-gb)]
      (. builder maximumEbsVolumeSizeInGb data))
    (.build builder)))


(defn cfn-domain-default-space-settings-property-builder
  "The cfn-domain-default-space-settings-property-builder function buildes out new instances of 
CfnDomain$DefaultSpaceSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customFileSystemConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-file-system-configs` |
| `customPosixUserConfig` | software.amazon.awscdk.services.sagemaker.CfnDomain$CustomPosixUserConfigProperty | [[cdk.support/lookup-entry]] | `:custom-posix-user-config` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `jupyterLabAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$JupyterLabAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$JupyterServerAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `spaceStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-storage-settings` |"
  [stack id config]
  (let [builder (CfnDomain$DefaultSpaceSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-domain-default-space-storage-settings-property-builder
  "The cfn-domain-default-space-storage-settings-property-builder function buildes out new instances of 
CfnDomain$DefaultSpaceStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsStorageSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DefaultEbsStorageSettingsProperty | [[cdk.support/lookup-entry]] | `:default-ebs-storage-settings` |"
  [stack id config]
  (let [builder (CfnDomain$DefaultSpaceStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-ebs-storage-settings)]
      (. builder defaultEbsStorageSettings data))
    (.build builder)))


(defn cfn-domain-docker-settings-property-builder
  "The cfn-domain-docker-settings-property-builder function buildes out new instances of 
CfnDomain$DockerSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableDockerAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-docker-access` |
| `vpcOnlyTrustedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-only-trusted-accounts` |"
  [stack id config]
  (let [builder (CfnDomain$DockerSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-docker-access)]
      (. builder enableDockerAccess data))
    (when-let [data (lookup-entry config id :vpc-only-trusted-accounts)]
      (. builder vpcOnlyTrustedAccounts data))
    (.build builder)))


(defn cfn-domain-domain-settings-property-builder
  "The cfn-domain-domain-settings-property-builder function buildes out new instances of 
CfnDomain$DomainSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dockerSettings` | software.amazon.awscdk.services.sagemaker.CfnDomain$DockerSettingsProperty | [[cdk.support/lookup-entry]] | `:docker-settings` |
| `rStudioServerProDomainSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:r-studio-server-pro-domain-settings` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |"
  [stack id config]
  (let [builder (CfnDomain$DomainSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :docker-settings)]
      (. builder dockerSettings data))
    (when-let [data (lookup-entry config id :r-studio-server-pro-domain-settings)]
      (. builder rStudioServerProDomainSettings data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (.build builder)))


(defn cfn-domain-efs-file-system-config-property-builder
  "The cfn-domain-efs-file-system-config-property-builder function buildes out new instances of 
CfnDomain$EFSFileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |"
  [stack id config]
  (let [builder (CfnDomain$EFSFileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :file-system-path)]
      (. builder fileSystemPath data))
    (.build builder)))


(defn cfn-domain-jupyter-lab-app-settings-property-builder
  "The cfn-domain-jupyter-lab-app-settings-property-builder function buildes out new instances of 
CfnDomain$JupyterLabAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |"
  [stack id config]
  (let [builder (CfnDomain$JupyterLabAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-repositories)]
      (. builder codeRepositories data))
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (when-let [data (lookup-entry config id :lifecycle-config-arns)]
      (. builder lifecycleConfigArns data))
    (.build builder)))


(defn cfn-domain-jupyter-server-app-settings-property-builder
  "The cfn-domain-jupyter-server-app-settings-property-builder function buildes out new instances of 
CfnDomain$JupyterServerAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnDomain$JupyterServerAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-domain-kernel-gateway-app-settings-property-builder
  "The cfn-domain-kernel-gateway-app-settings-property-builder function buildes out new instances of 
CfnDomain$KernelGatewayAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnDomain$KernelGatewayAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
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
    (.build builder)))


(defn cfn-domain-r-session-app-settings-property-builder
  "The cfn-domain-r-session-app-settings-property-builder function buildes out new instances of 
CfnDomain$RSessionAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnDomain$RSessionAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-domain-r-studio-server-pro-app-settings-property-builder
  "The cfn-domain-r-studio-server-pro-app-settings-property-builder function buildes out new instances of 
CfnDomain$RStudioServerProAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-status` |
| `userGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group` |"
  [stack id config]
  (let [builder (CfnDomain$RStudioServerProAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-status)]
      (. builder accessStatus data))
    (when-let [data (lookup-entry config id :user-group)]
      (. builder userGroup data))
    (.build builder)))


(defn cfn-domain-r-studio-server-pro-domain-settings-property-builder
  "The cfn-domain-r-studio-server-pro-domain-settings-property-builder function buildes out new instances of 
CfnDomain$RStudioServerProDomainSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnDomain$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `domainExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role-arn` |
| `rStudioConnectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:r-studio-connect-url` |
| `rStudioPackageManagerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:r-studio-package-manager-url` |"
  [stack id config]
  (let [builder (CfnDomain$RStudioServerProDomainSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (when-let [data (lookup-entry config id :domain-execution-role-arn)]
      (. builder domainExecutionRoleArn data))
    (when-let [data (lookup-entry config id :r-studio-connect-url)]
      (. builder rStudioConnectUrl data))
    (when-let [data (lookup-entry config id :r-studio-package-manager-url)]
      (. builder rStudioPackageManagerUrl data))
    (.build builder)))


(defn cfn-domain-resource-spec-property-builder
  "The cfn-domain-resource-spec-property-builder function buildes out new instances of 
CfnDomain$ResourceSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `lifecycleConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-config-arn` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |"
  [stack id config]
  (let [builder (CfnDomain$ResourceSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :lifecycle-config-arn)]
      (. builder lifecycleConfigArn data))
    (when-let [data (lookup-entry config id :sage-maker-image-arn)]
      (. builder sageMakerImageArn data))
    (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
      (. builder sageMakerImageVersionArn data))
    (.build builder)))


(defn cfn-domain-sharing-settings-property-builder
  "The cfn-domain-sharing-settings-property-builder function buildes out new instances of 
CfnDomain$SharingSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookOutputOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-output-option` |
| `s3KmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |"
  [stack id config]
  (let [builder (CfnDomain$SharingSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :notebook-output-option)]
      (. builder notebookOutputOption data))
    (when-let [data (lookup-entry config id :s3-kms-key-id)]
      (. builder s3KmsKeyId data))
    (when-let [data (lookup-entry config id :s3-output-path)]
      (. builder s3OutputPath data))
    (.build builder)))


(defn cfn-domain-user-settings-property-builder
  "The cfn-domain-user-settings-property-builder function buildes out new instances of 
CfnDomain$UserSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `studioWebPortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-web-portal` |"
  [stack id config]
  (let [builder (CfnDomain$UserSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-alarm-property-builder
  "The cfn-endpoint-alarm-property-builder function buildes out new instances of 
CfnEndpoint$AlarmProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |"
  [stack id config]
  (let [builder (CfnEndpoint$AlarmProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (.build builder)))


(defn cfn-endpoint-auto-rollback-config-property-builder
  "The cfn-endpoint-auto-rollback-config-property-builder function buildes out new instances of 
CfnEndpoint$AutoRollbackConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarms` |"
  [stack id config]
  (let [builder (CfnEndpoint$AutoRollbackConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (.build builder)))


(defn cfn-endpoint-blue-green-update-policy-property-builder
  "The cfn-endpoint-blue-green-update-policy-property-builder function buildes out new instances of 
CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumExecutionTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-execution-timeout-in-seconds` |
| `terminationWaitInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-wait-in-seconds` |
| `trafficRoutingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:traffic-routing-configuration` |"
  [stack id config]
  (let [builder (CfnEndpoint$BlueGreenUpdatePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-execution-timeout-in-seconds)]
      (. builder maximumExecutionTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :termination-wait-in-seconds)]
      (. builder terminationWaitInSeconds data))
    (when-let [data (lookup-entry config id :traffic-routing-configuration)]
      (. builder trafficRoutingConfiguration data))
    (.build builder)))


(defn cfn-endpoint-builder
  "The cfn-endpoint-builder function buildes out new instances of 
CfnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$DeploymentConfigProperty | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeRetainedVariantProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-retained-variant-properties` |
| `retainAllVariantProperties` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-all-variant-properties` |
| `retainDeploymentConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-deployment-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEndpoint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-endpoint-capacity-size-property-builder
  "The cfn-endpoint-capacity-size-property-builder function buildes out new instances of 
CfnEndpoint$CapacitySizeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEndpoint$CapacitySizeProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-endpoint-config-async-inference-client-config-property-builder
  "The cfn-endpoint-config-async-inference-client-config-property-builder function buildes out new instances of 
CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrentInvocationsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-invocations-per-instance` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$AsyncInferenceClientConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-concurrent-invocations-per-instance)]
      (. builder maxConcurrentInvocationsPerInstance data))
    (.build builder)))


(defn cfn-endpoint-config-async-inference-config-property-builder
  "The cfn-endpoint-config-async-inference-config-property-builder function buildes out new instances of 
CfnEndpointConfig$AsyncInferenceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-config` |
| `outputConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$AsyncInferenceOutputConfigProperty | [[cdk.support/lookup-entry]] | `:output-config` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$AsyncInferenceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-config)]
      (. builder clientConfig data))
    (when-let [data (lookup-entry config id :output-config)]
      (. builder outputConfig data))
    (.build builder)))


(defn cfn-endpoint-config-async-inference-notification-config-property-builder
  "The cfn-endpoint-config-async-inference-notification-config-property-builder function buildes out new instances of 
CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:error-topic` |
| `includeInferenceResponseIn` | java.util.List | [[cdk.support/lookup-entry]] | `:include-inference-response-in` |
| `successTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-topic` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$AsyncInferenceNotificationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-topic)]
      (. builder errorTopic data))
    (when-let [data (lookup-entry config id :include-inference-response-in)]
      (. builder includeInferenceResponseIn data))
    (when-let [data (lookup-entry config id :success-topic)]
      (. builder successTopic data))
    (.build builder)))


(defn cfn-endpoint-config-async-inference-output-config-property-builder
  "The cfn-endpoint-config-async-inference-output-config-property-builder function buildes out new instances of 
CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `notificationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-config` |
| `s3FailurePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-failure-path` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$AsyncInferenceOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :notification-config)]
      (. builder notificationConfig data))
    (when-let [data (lookup-entry config id :s3-failure-path)]
      (. builder s3FailurePath data))
    (when-let [data (lookup-entry config id :s3-output-path)]
      (. builder s3OutputPath data))
    (.build builder)))


(defn cfn-endpoint-config-builder
  "The cfn-endpoint-config-builder function buildes out new instances of 
CfnEndpointConfig$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-endpoint-config-capture-content-type-header-property-builder
  "The cfn-endpoint-config-capture-content-type-header-property-builder function buildes out new instances of 
CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:csv-content-types` |
| `jsonContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:json-content-types` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$CaptureContentTypeHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv-content-types)]
      (. builder csvContentTypes data))
    (when-let [data (lookup-entry config id :json-content-types)]
      (. builder jsonContentTypes data))
    (.build builder)))


(defn cfn-endpoint-config-capture-option-property-builder
  "The cfn-endpoint-config-capture-option-property-builder function buildes out new instances of 
CfnEndpointConfig$CaptureOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:capture-mode` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$CaptureOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :capture-mode)]
      (. builder captureMode data))
    (.build builder)))


(defn cfn-endpoint-config-clarify-explainer-config-property-builder
  "The cfn-endpoint-config-clarify-explainer-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableExplanations` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-explanations` |
| `inferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-config` |
| `shapConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shap-config` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ClarifyExplainerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-explanations)]
      (. builder enableExplanations data))
    (when-let [data (lookup-entry config id :inference-config)]
      (. builder inferenceConfig data))
    (when-let [data (lookup-entry config id :shap-config)]
      (. builder shapConfig data))
    (.build builder)))


(defn cfn-endpoint-config-clarify-inference-config-property-builder
  "The cfn-endpoint-config-clarify-inference-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `probabilityIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:probability-index` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ClarifyInferenceConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-config-clarify-shap-baseline-config-property-builder
  "The cfn-endpoint-config-clarify-shap-baseline-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mimeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mime-type` |
| `shapBaseline` | java.lang.String | [[cdk.support/lookup-entry]] | `:shap-baseline` |
| `shapBaselineUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:shap-baseline-uri` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ClarifyShapBaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :mime-type)]
      (. builder mimeType data))
    (when-let [data (lookup-entry config id :shap-baseline)]
      (. builder shapBaseline data))
    (when-let [data (lookup-entry config id :shap-baseline-uri)]
      (. builder shapBaselineUri data))
    (.build builder)))


(defn cfn-endpoint-config-clarify-shap-config-property-builder
  "The cfn-endpoint-config-clarify-shap-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ClarifyShapConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfSamples` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-samples` |
| `seed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seed` |
| `shapBaselineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shap-baseline-config` |
| `textConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-config` |
| `useLogit` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-logit` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ClarifyShapConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-config-clarify-text-config-property-builder
  "The cfn-endpoint-config-clarify-text-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ClarifyTextConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `granularity` | java.lang.String | [[cdk.support/lookup-entry]] | `:granularity` |
| `language` | java.lang.String | [[cdk.support/lookup-entry]] | `:language` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ClarifyTextConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :granularity)]
      (. builder granularity data))
    (when-let [data (lookup-entry config id :language)]
      (. builder language data))
    (.build builder)))


(defn cfn-endpoint-config-data-capture-config-property-builder
  "The cfn-endpoint-config-data-capture-config-property-builder function buildes out new instances of 
CfnEndpointConfig$DataCaptureConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureContentTypeHeader` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$CaptureContentTypeHeaderProperty | [[cdk.support/lookup-entry]] | `:capture-content-type-header` |
| `captureOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capture-options` |
| `destinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-s3-uri` |
| `enableCapture` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-capture` |
| `initialSamplingPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:initial-sampling-percentage` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$DataCaptureConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-config-explainer-config-property-builder
  "The cfn-endpoint-config-explainer-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ExplainerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clarifyExplainerConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$ClarifyExplainerConfigProperty | [[cdk.support/lookup-entry]] | `:clarify-explainer-config` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ExplainerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :clarify-explainer-config)]
      (. builder clarifyExplainerConfig data))
    (.build builder)))


(defn cfn-endpoint-config-managed-instance-scaling-property-builder
  "The cfn-endpoint-config-managed-instance-scaling-property-builder function buildes out new instances of 
CfnEndpointConfig$ManagedInstanceScalingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-instance-count` |
| `minInstanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-instance-count` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ManagedInstanceScalingProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-instance-count)]
      (. builder maxInstanceCount data))
    (when-let [data (lookup-entry config id :min-instance-count)]
      (. builder minInstanceCount data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-endpoint-config-production-variant-property-builder
  "The cfn-endpoint-config-production-variant-property-builder function buildes out new instances of 
CfnEndpointConfig$ProductionVariantProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ProductionVariantProperty$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-config-props-builder
  "The cfn-endpoint-config-props-builder function buildes out new instances of 
CfnEndpointConfigProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnEndpointConfig$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnEndpointConfigProps$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-config-routing-config-property-builder
  "The cfn-endpoint-config-routing-config-property-builder function buildes out new instances of 
CfnEndpointConfig$RoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-strategy` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$RoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :routing-strategy)]
      (. builder routingStrategy data))
    (.build builder)))


(defn cfn-endpoint-config-serverless-config-property-builder
  "The cfn-endpoint-config-serverless-config-property-builder function buildes out new instances of 
CfnEndpointConfig$ServerlessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `memorySizeInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size-in-mb` |
| `provisionedConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-concurrency` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$ServerlessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :memory-size-in-mb)]
      (. builder memorySizeInMb data))
    (when-let [data (lookup-entry config id :provisioned-concurrency)]
      (. builder provisionedConcurrency data))
    (.build builder)))


(defn cfn-endpoint-config-vpc-config-property-builder
  "The cfn-endpoint-config-vpc-config-property-builder function buildes out new instances of 
CfnEndpointConfig$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnEndpointConfig$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-endpoint-deployment-config-property-builder
  "The cfn-endpoint-deployment-config-property-builder function buildes out new instances of 
CfnEndpoint$DeploymentConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRollbackConfiguration` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$AutoRollbackConfigProperty | [[cdk.support/lookup-entry]] | `:auto-rollback-configuration` |
| `blueGreenUpdatePolicy` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$BlueGreenUpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:blue-green-update-policy` |
| `rollingUpdatePolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rolling-update-policy` |"
  [stack id config]
  (let [builder (CfnEndpoint$DeploymentConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-rollback-configuration)]
      (. builder autoRollbackConfiguration data))
    (when-let [data (lookup-entry config id :blue-green-update-policy)]
      (. builder blueGreenUpdatePolicy data))
    (when-let [data (lookup-entry config id :rolling-update-policy)]
      (. builder rollingUpdatePolicy data))
    (.build builder)))


(defn cfn-endpoint-props-builder
  "The cfn-endpoint-props-builder function buildes out new instances of 
CfnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-config` |
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeRetainedVariantProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-retained-variant-properties` |
| `retainAllVariantProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-all-variant-properties` |
| `retainDeploymentConfig` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:retain-deployment-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEndpointProps$Builder.)]
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
    (.build builder)))


(defn cfn-endpoint-rolling-update-policy-property-builder
  "The cfn-endpoint-rolling-update-policy-property-builder function buildes out new instances of 
CfnEndpoint$RollingUpdatePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumBatchSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:maximum-batch-size` |
| `maximumExecutionTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-execution-timeout-in-seconds` |
| `rollbackMaximumBatchSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:rollback-maximum-batch-size` |
| `waitIntervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-interval-in-seconds` |"
  [stack id config]
  (let [builder (CfnEndpoint$RollingUpdatePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-batch-size)]
      (. builder maximumBatchSize data))
    (when-let [data (lookup-entry config id :maximum-execution-timeout-in-seconds)]
      (. builder maximumExecutionTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :rollback-maximum-batch-size)]
      (. builder rollbackMaximumBatchSize data))
    (when-let [data (lookup-entry config id :wait-interval-in-seconds)]
      (. builder waitIntervalInSeconds data))
    (.build builder)))


(defn cfn-endpoint-traffic-routing-config-property-builder
  "The cfn-endpoint-traffic-routing-config-property-builder function buildes out new instances of 
CfnEndpoint$TrafficRoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `canarySize` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:canary-size` |
| `linearStepSize` | software.amazon.awscdk.services.sagemaker.CfnEndpoint$CapacitySizeProperty | [[cdk.support/lookup-entry]] | `:linear-step-size` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `waitIntervalInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-interval-in-seconds` |"
  [stack id config]
  (let [builder (CfnEndpoint$TrafficRoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :canary-size)]
      (. builder canarySize data))
    (when-let [data (lookup-entry config id :linear-step-size)]
      (. builder linearStepSize data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :wait-interval-in-seconds)]
      (. builder waitIntervalInSeconds data))
    (.build builder)))


(defn cfn-endpoint-variant-property-property-builder
  "The cfn-endpoint-variant-property-property-builder function buildes out new instances of 
CfnEndpoint$VariantPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variantPropertyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-property-type` |"
  [stack id config]
  (let [builder (CfnEndpoint$VariantPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :variant-property-type)]
      (. builder variantPropertyType data))
    (.build builder)))


(defn cfn-feature-group-builder
  "The cfn-feature-group-builder function buildes out new instances of 
CfnFeatureGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `throughputConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:throughput-config` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-feature-group-data-catalog-config-property-builder
  "The cfn-feature-group-data-catalog-config-property-builder function buildes out new instances of 
CfnFeatureGroup$DataCatalogConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `database` | java.lang.String | [[cdk.support/lookup-entry]] | `:database` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$DataCatalogConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog)]
      (. builder catalog data))
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-feature-group-feature-definition-property-builder
  "The cfn-feature-group-feature-definition-property-builder function buildes out new instances of 
CfnFeatureGroup$FeatureDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `featureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-type` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$FeatureDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :feature-name)]
      (. builder featureName data))
    (when-let [data (lookup-entry config id :feature-type)]
      (. builder featureType data))
    (.build builder)))


(defn cfn-feature-group-offline-store-config-property-builder
  "The cfn-feature-group-offline-store-config-property-builder function buildes out new instances of 
CfnFeatureGroup$OfflineStoreConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCatalogConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$DataCatalogConfigProperty | [[cdk.support/lookup-entry]] | `:data-catalog-config` |
| `disableGlueTableCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-glue-table-creation` |
| `s3StorageConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$S3StorageConfigProperty | [[cdk.support/lookup-entry]] | `:s3-storage-config` |
| `tableFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-format` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$OfflineStoreConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-catalog-config)]
      (. builder dataCatalogConfig data))
    (when-let [data (lookup-entry config id :disable-glue-table-creation)]
      (. builder disableGlueTableCreation data))
    (when-let [data (lookup-entry config id :s3-storage-config)]
      (. builder s3StorageConfig data))
    (when-let [data (lookup-entry config id :table-format)]
      (. builder tableFormat data))
    (.build builder)))


(defn cfn-feature-group-online-store-config-property-builder
  "The cfn-feature-group-online-store-config-property-builder function buildes out new instances of 
CfnFeatureGroup$OnlineStoreConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableOnlineStore` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-online-store` |
| `securityConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$OnlineStoreSecurityConfigProperty | [[cdk.support/lookup-entry]] | `:security-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `ttlDuration` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$TtlDurationProperty | [[cdk.support/lookup-entry]] | `:ttl-duration` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$OnlineStoreConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-online-store)]
      (. builder enableOnlineStore data))
    (when-let [data (lookup-entry config id :security-config)]
      (. builder securityConfig data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :ttl-duration)]
      (. builder ttlDuration data))
    (.build builder)))


(defn cfn-feature-group-online-store-security-config-property-builder
  "The cfn-feature-group-online-store-security-config-property-builder function buildes out new instances of 
CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$OnlineStoreSecurityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-feature-group-props-builder
  "The cfn-feature-group-props-builder function buildes out new instances of 
CfnFeatureGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `throughputConfig` | software.amazon.awscdk.services.sagemaker.CfnFeatureGroup$ThroughputConfigProperty | [[cdk.support/lookup-entry]] | `:throughput-config` |"
  [stack id config]
  (let [builder (CfnFeatureGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-feature-group-s3-storage-config-property-builder
  "The cfn-feature-group-s3-storage-config-property-builder function buildes out new instances of 
CfnFeatureGroup$S3StorageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$S3StorageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-feature-group-throughput-config-property-builder
  "The cfn-feature-group-throughput-config-property-builder function buildes out new instances of 
CfnFeatureGroup$ThroughputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedReadCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-read-capacity-units` |
| `provisionedWriteCapacityUnits` | java.lang.Number | [[cdk.support/lookup-entry]] | `:provisioned-write-capacity-units` |
| `throughputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:throughput-mode` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$ThroughputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-read-capacity-units)]
      (. builder provisionedReadCapacityUnits data))
    (when-let [data (lookup-entry config id :provisioned-write-capacity-units)]
      (. builder provisionedWriteCapacityUnits data))
    (when-let [data (lookup-entry config id :throughput-mode)]
      (. builder throughputMode data))
    (.build builder)))


(defn cfn-feature-group-ttl-duration-property-builder
  "The cfn-feature-group-ttl-duration-property-builder function buildes out new instances of 
CfnFeatureGroup$TtlDurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFeatureGroup$TtlDurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-image-builder
  "The cfn-image-builder function buildes out new instances of 
CfnImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-description` |
| `imageDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-display-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnImage$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-image-props-builder
  "The cfn-image-props-builder function buildes out new instances of 
CfnImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-description` |
| `imageDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-display-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnImageProps$Builder.)]
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
    (.build builder)))


(defn cfn-image-version-builder
  "The cfn-image-version-builder function buildes out new instances of 
CfnImageVersion$Builder using the provided configuration.  Each field is set as follows:

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
| `vendorGuidance` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-guidance` |"
  [stack id config]
  (let [builder (CfnImageVersion$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-image-version-props-builder
  "The cfn-image-version-props-builder function buildes out new instances of 
CfnImageVersionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vendorGuidance` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-guidance` |"
  [stack id config]
  (let [builder (CfnImageVersionProps$Builder.)]
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
    (.build builder)))


(defn cfn-inference-component-builder
  "The cfn-inference-component-builder function buildes out new instances of 
CfnInferenceComponent$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-arn` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `inferenceComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-component-name` |
| `runtimeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-config` |
| `specification` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentSpecificationProperty | [[cdk.support/lookup-entry]] | `:specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-inference-component-deployed-image-property-builder
  "The cfn-inference-component-deployed-image-property-builder function buildes out new instances of 
CfnInferenceComponent$DeployedImageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolutionTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-time` |
| `resolvedImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolved-image` |
| `specifiedImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:specified-image` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$DeployedImageProperty$Builder.)]
    (when-let [data (lookup-entry config id :resolution-time)]
      (. builder resolutionTime data))
    (when-let [data (lookup-entry config id :resolved-image)]
      (. builder resolvedImage data))
    (when-let [data (lookup-entry config id :specified-image)]
      (. builder specifiedImage data))
    (.build builder)))


(defn cfn-inference-component-inference-component-compute-resource-requirements-property-builder
  "The cfn-inference-component-inference-component-compute-resource-requirements-property-builder function buildes out new instances of 
CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxMemoryRequiredInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-memory-required-in-mb` |
| `minMemoryRequiredInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-memory-required-in-mb` |
| `numberOfAcceleratorDevicesRequired` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-accelerator-devices-required` |
| `numberOfCpuCoresRequired` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-cpu-cores-required` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-memory-required-in-mb)]
      (. builder maxMemoryRequiredInMb data))
    (when-let [data (lookup-entry config id :min-memory-required-in-mb)]
      (. builder minMemoryRequiredInMb data))
    (when-let [data (lookup-entry config id :number-of-accelerator-devices-required)]
      (. builder numberOfAcceleratorDevicesRequired data))
    (when-let [data (lookup-entry config id :number-of-cpu-cores-required)]
      (. builder numberOfCpuCoresRequired data))
    (.build builder)))


(defn cfn-inference-component-inference-component-container-specification-property-builder
  "The cfn-inference-component-inference-component-container-specification-property-builder function buildes out new instances of 
CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-url` |
| `deployedImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployed-image` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$InferenceComponentContainerSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-url)]
      (. builder artifactUrl data))
    (when-let [data (lookup-entry config id :deployed-image)]
      (. builder deployedImage data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (.build builder)))


(defn cfn-inference-component-inference-component-runtime-config-property-builder
  "The cfn-inference-component-inference-component-runtime-config-property-builder function buildes out new instances of 
CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:copy-count` |
| `currentCopyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:current-copy-count` |
| `desiredCopyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-copy-count` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$InferenceComponentRuntimeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :copy-count)]
      (. builder copyCount data))
    (when-let [data (lookup-entry config id :current-copy-count)]
      (. builder currentCopyCount data))
    (when-let [data (lookup-entry config id :desired-copy-count)]
      (. builder desiredCopyCount data))
    (.build builder)))


(defn cfn-inference-component-inference-component-specification-property-builder
  "The cfn-inference-component-inference-component-specification-property-builder function buildes out new instances of 
CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeResourceRequirements` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentComputeResourceRequirementsProperty | [[cdk.support/lookup-entry]] | `:compute-resource-requirements` |
| `container` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentContainerSpecificationProperty | [[cdk.support/lookup-entry]] | `:container` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `startupParameters` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentStartupParametersProperty | [[cdk.support/lookup-entry]] | `:startup-parameters` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$InferenceComponentSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :compute-resource-requirements)]
      (. builder computeResourceRequirements data))
    (when-let [data (lookup-entry config id :container)]
      (. builder container data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :startup-parameters)]
      (. builder startupParameters data))
    (.build builder)))


(defn cfn-inference-component-inference-component-startup-parameters-property-builder
  "The cfn-inference-component-inference-component-startup-parameters-property-builder function buildes out new instances of 
CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerStartupHealthCheckTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-startup-health-check-timeout-in-seconds` |
| `modelDataDownloadTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:model-data-download-timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnInferenceComponent$InferenceComponentStartupParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-startup-health-check-timeout-in-seconds)]
      (. builder containerStartupHealthCheckTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :model-data-download-timeout-in-seconds)]
      (. builder modelDataDownloadTimeoutInSeconds data))
    (.build builder)))


(defn cfn-inference-component-props-builder
  "The cfn-inference-component-props-builder function buildes out new instances of 
CfnInferenceComponentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-arn` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `inferenceComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-component-name` |
| `runtimeConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceComponent$InferenceComponentRuntimeConfigProperty | [[cdk.support/lookup-entry]] | `:runtime-config` |
| `specification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |"
  [stack id config]
  (let [builder (CfnInferenceComponentProps$Builder.)]
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
    (.build builder)))


(defn cfn-inference-experiment-builder
  "The cfn-inference-experiment-builder function buildes out new instances of 
CfnInferenceExperiment$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-inference-experiment-capture-content-type-header-property-builder
  "The cfn-inference-experiment-capture-content-type-header-property-builder function buildes out new instances of 
CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csvContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:csv-content-types` |
| `jsonContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:json-content-types` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$CaptureContentTypeHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv-content-types)]
      (. builder csvContentTypes data))
    (when-let [data (lookup-entry config id :json-content-types)]
      (. builder jsonContentTypes data))
    (.build builder)))


(defn cfn-inference-experiment-data-storage-config-property-builder
  "The cfn-inference-experiment-data-storage-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$DataStorageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-type` |
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$DataStorageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-inference-experiment-endpoint-metadata-property-builder
  "The cfn-inference-experiment-endpoint-metadata-property-builder function buildes out new instances of 
CfnInferenceExperiment$EndpointMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-config-name` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `endpointStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-status` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$EndpointMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-config-name)]
      (. builder endpointConfigName data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :endpoint-status)]
      (. builder endpointStatus data))
    (.build builder)))


(defn cfn-inference-experiment-inference-experiment-schedule-property-builder
  "The cfn-inference-experiment-inference-experiment-schedule-property-builder function buildes out new instances of 
CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$InferenceExperimentScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-inference-experiment-model-infrastructure-config-property-builder
  "The cfn-inference-experiment-model-infrastructure-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `infrastructureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-type` |
| `realTimeInferenceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:real-time-inference-config` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$ModelInfrastructureConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :infrastructure-type)]
      (. builder infrastructureType data))
    (when-let [data (lookup-entry config id :real-time-inference-config)]
      (. builder realTimeInferenceConfig data))
    (.build builder)))


(defn cfn-inference-experiment-model-variant-config-property-builder
  "The cfn-inference-experiment-model-variant-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$ModelVariantConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `infrastructureConfig` | software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment$ModelInfrastructureConfigProperty | [[cdk.support/lookup-entry]] | `:infrastructure-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `variantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variant-name` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$ModelVariantConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :infrastructure-config)]
      (. builder infrastructureConfig data))
    (when-let [data (lookup-entry config id :model-name)]
      (. builder modelName data))
    (when-let [data (lookup-entry config id :variant-name)]
      (. builder variantName data))
    (.build builder)))


(defn cfn-inference-experiment-props-builder
  "The cfn-inference-experiment-props-builder function buildes out new instances of 
CfnInferenceExperimentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnInferenceExperimentProps$Builder.)]
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
    (.build builder)))


(defn cfn-inference-experiment-real-time-inference-config-property-builder
  "The cfn-inference-experiment-real-time-inference-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$RealTimeInferenceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (.build builder)))


(defn cfn-inference-experiment-shadow-mode-config-property-builder
  "The cfn-inference-experiment-shadow-mode-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$ShadowModeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shadowModelVariants` | java.util.List | [[cdk.support/lookup-entry]] | `:shadow-model-variants` |
| `sourceModelVariantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-model-variant-name` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$ShadowModeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :shadow-model-variants)]
      (. builder shadowModelVariants data))
    (when-let [data (lookup-entry config id :source-model-variant-name)]
      (. builder sourceModelVariantName data))
    (.build builder)))


(defn cfn-inference-experiment-shadow-model-variant-config-property-builder
  "The cfn-inference-experiment-shadow-model-variant-config-property-builder function buildes out new instances of 
CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `samplingPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-percentage` |
| `shadowModelVariantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:shadow-model-variant-name` |"
  [stack id config]
  (let [builder (CfnInferenceExperiment$ShadowModelVariantConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :sampling-percentage)]
      (. builder samplingPercentage data))
    (when-let [data (lookup-entry config id :shadow-model-variant-name)]
      (. builder shadowModelVariantName data))
    (.build builder)))


(defn cfn-model-bias-job-definition-batch-transform-input-property-builder
  "The cfn-model-bias-job-definition-batch-transform-input-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$BatchTransformInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-bias-job-definition-builder
  "The cfn-model-bias-job-definition-builder function buildes out new instances of 
CfnModelBiasJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-bias-job-definition-cluster-config-property-builder
  "The cfn-model-bias-job-definition-cluster-config-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$ClusterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-model-bias-job-definition-constraints-resource-property-builder
  "The cfn-model-bias-job-definition-constraints-resource-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$ConstraintsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-bias-job-definition-csv-property-builder
  "The cfn-model-bias-job-definition-csv-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-model-bias-job-definition-dataset-format-property-builder
  "The cfn-model-bias-job-definition-dataset-format-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$DatasetFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$CsvProperty | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$JsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$DatasetFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :parquet)]
      (. builder parquet data))
    (.build builder)))


(defn cfn-model-bias-job-definition-endpoint-input-property-builder
  "The cfn-model-bias-job-definition-endpoint-input-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$EndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$EndpointInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-bias-job-definition-json-property-builder
  "The cfn-model-bias-job-definition-json-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$JsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$JsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :line)]
      (. builder line data))
    (.build builder)))


(defn cfn-model-bias-job-definition-model-bias-app-specification-property-builder
  "The cfn-model-bias-job-definition-model-bias-app-specification-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-uri` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$ModelBiasAppSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :config-uri)]
      (. builder configUri data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (.build builder)))


(defn cfn-model-bias-job-definition-model-bias-baseline-config-property-builder
  "The cfn-model-bias-job-definition-model-bias-baseline-config-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$ModelBiasBaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :baselining-job-name)]
      (. builder baseliningJobName data))
    (when-let [data (lookup-entry config id :constraints-resource)]
      (. builder constraintsResource data))
    (.build builder)))


(defn cfn-model-bias-job-definition-model-bias-job-input-property-builder
  "The cfn-model-bias-job-definition-model-bias-job-input-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
| `groundTruthS3Input` | software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty | [[cdk.support/lookup-entry]] | `:ground-truth-s3-input` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$ModelBiasJobInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-transform-input)]
      (. builder batchTransformInput data))
    (when-let [data (lookup-entry config id :endpoint-input)]
      (. builder endpointInput data))
    (when-let [data (lookup-entry config id :ground-truth-s3-input)]
      (. builder groundTruthS3Input data))
    (.build builder)))


(defn cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder
  "The cfn-model-bias-job-definition-monitoring-ground-truth-s3-input-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$MonitoringGroundTruthS3InputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-bias-job-definition-monitoring-output-config-property-builder
  "The cfn-model-bias-job-definition-monitoring-output-config-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$MonitoringOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :monitoring-outputs)]
      (. builder monitoringOutputs data))
    (.build builder)))


(defn cfn-model-bias-job-definition-monitoring-output-property-builder
  "The cfn-model-bias-job-definition-monitoring-output-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$MonitoringOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-output)]
      (. builder s3Output data))
    (.build builder)))


(defn cfn-model-bias-job-definition-monitoring-resources-property-builder
  "The cfn-model-bias-job-definition-monitoring-resources-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$MonitoringResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
    (.build builder)))


(defn cfn-model-bias-job-definition-network-config-property-builder
  "The cfn-model-bias-job-definition-network-config-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$NetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$NetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
      (. builder enableInterContainerTrafficEncryption data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-model-bias-job-definition-props-builder
  "The cfn-model-bias-job-definition-props-builder function buildes out new instances of 
CfnModelBiasJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinitionProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-bias-job-definition-s3-output-property-builder
  "The cfn-model-bias-job-definition-s3-output-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$S3OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$S3OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-path)]
      (. builder localPath data))
    (when-let [data (lookup-entry config id :s3-upload-mode)]
      (. builder s3UploadMode data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-bias-job-definition-stopping-condition-property-builder
  "The cfn-model-bias-job-definition-stopping-condition-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$StoppingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$StoppingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
      (. builder maxRuntimeInSeconds data))
    (.build builder)))


(defn cfn-model-bias-job-definition-vpc-config-property-builder
  "The cfn-model-bias-job-definition-vpc-config-property-builder function buildes out new instances of 
CfnModelBiasJobDefinition$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnModelBiasJobDefinition$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-model-builder
  "The cfn-model-builder function buildes out new instances of 
CfnModel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceExecutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-execution-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `primaryContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-container` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnModel$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-card-additional-information-property-builder
  "The cfn-model-card-additional-information-property-builder function buildes out new instances of 
CfnModelCard$AdditionalInformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caveatsAndRecommendations` | java.lang.String | [[cdk.support/lookup-entry]] | `:caveats-and-recommendations` |
| `customDetails` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-details` |
| `ethicalConsiderations` | java.lang.String | [[cdk.support/lookup-entry]] | `:ethical-considerations` |"
  [stack id config]
  (let [builder (CfnModelCard$AdditionalInformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :caveats-and-recommendations)]
      (. builder caveatsAndRecommendations data))
    (when-let [data (lookup-entry config id :custom-details)]
      (. builder customDetails data))
    (when-let [data (lookup-entry config id :ethical-considerations)]
      (. builder ethicalConsiderations data))
    (.build builder)))


(defn cfn-model-card-builder
  "The cfn-model-card-builder function buildes out new instances of 
CfnModelCard$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `createdBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:created-by` |
| `lastModifiedBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-modified-by` |
| `modelCardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-name` |
| `modelCardStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-status` |
| `securityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelCard$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-card-business-details-property-builder
  "The cfn-model-card-business-details-property-builder function buildes out new instances of 
CfnModelCard$BusinessDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `businessProblem` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-problem` |
| `businessStakeholders` | java.lang.String | [[cdk.support/lookup-entry]] | `:business-stakeholders` |
| `lineOfBusiness` | java.lang.String | [[cdk.support/lookup-entry]] | `:line-of-business` |"
  [stack id config]
  (let [builder (CfnModelCard$BusinessDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :business-problem)]
      (. builder businessProblem data))
    (when-let [data (lookup-entry config id :business-stakeholders)]
      (. builder businessStakeholders data))
    (when-let [data (lookup-entry config id :line-of-business)]
      (. builder lineOfBusiness data))
    (.build builder)))


(defn cfn-model-card-container-property-builder
  "The cfn-model-card-container-property-builder function buildes out new instances of 
CfnModelCard$ContainerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |
| `nearestModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nearest-model-name` |"
  [stack id config]
  (let [builder (CfnModelCard$ContainerProperty$Builder.)]
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :model-data-url)]
      (. builder modelDataUrl data))
    (when-let [data (lookup-entry config id :nearest-model-name)]
      (. builder nearestModelName data))
    (.build builder)))


(defn cfn-model-card-content-property-builder
  "The cfn-model-card-content-property-builder function buildes out new instances of 
CfnModelCard$ContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInformation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-information` |
| `businessDetails` | software.amazon.awscdk.services.sagemaker.CfnModelCard$BusinessDetailsProperty | [[cdk.support/lookup-entry]] | `:business-details` |
| `evaluationDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:evaluation-details` |
| `intendedUses` | software.amazon.awscdk.services.sagemaker.CfnModelCard$IntendedUsesProperty | [[cdk.support/lookup-entry]] | `:intended-uses` |
| `modelOverview` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ModelOverviewProperty | [[cdk.support/lookup-entry]] | `:model-overview` |
| `modelPackageDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-package-details` |
| `trainingDetails` | software.amazon.awscdk.services.sagemaker.CfnModelCard$TrainingDetailsProperty | [[cdk.support/lookup-entry]] | `:training-details` |"
  [stack id config]
  (let [builder (CfnModelCard$ContentProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-evaluation-detail-property-builder
  "The cfn-model-card-evaluation-detail-property-builder function buildes out new instances of 
CfnModelCard$EvaluationDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `datasets` | java.util.List | [[cdk.support/lookup-entry]] | `:datasets` |
| `evaluationJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-job-arn` |
| `evaluationObservation` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-observation` |
| `metadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metadata` |
| `metricGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-groups` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnModelCard$EvaluationDetailProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-function-property-builder
  "The cfn-model-card-function-property-builder function buildes out new instances of 
CfnModelCard$FunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `facet` | java.lang.String | [[cdk.support/lookup-entry]] | `:facet` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |"
  [stack id config]
  (let [builder (CfnModelCard$FunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :facet)]
      (. builder facet data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (.build builder)))


(defn cfn-model-card-inference-environment-property-builder
  "The cfn-model-card-inference-environment-property-builder function buildes out new instances of 
CfnModelCard$InferenceEnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerImage` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image` |"
  [stack id config]
  (let [builder (CfnModelCard$InferenceEnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-image)]
      (. builder containerImage data))
    (.build builder)))


(defn cfn-model-card-inference-specification-property-builder
  "The cfn-model-card-inference-specification-property-builder function buildes out new instances of 
CfnModelCard$InferenceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |"
  [stack id config]
  (let [builder (CfnModelCard$InferenceSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (.build builder)))


(defn cfn-model-card-intended-uses-property-builder
  "The cfn-model-card-intended-uses-property-builder function buildes out new instances of 
CfnModelCard$IntendedUsesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `explanationsForRiskRating` | java.lang.String | [[cdk.support/lookup-entry]] | `:explanations-for-risk-rating` |
| `factorsAffectingModelEfficiency` | java.lang.String | [[cdk.support/lookup-entry]] | `:factors-affecting-model-efficiency` |
| `intendedUses` | java.lang.String | [[cdk.support/lookup-entry]] | `:intended-uses` |
| `purposeOfModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:purpose-of-model` |
| `riskRating` | java.lang.String | [[cdk.support/lookup-entry]] | `:risk-rating` |"
  [stack id config]
  (let [builder (CfnModelCard$IntendedUsesProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-metric-data-items-property-builder
  "The cfn-model-card-metric-data-items-property-builder function buildes out new instances of 
CfnModelCard$MetricDataItemsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
| `xAxisName` | java.util.List | [[cdk.support/lookup-entry]] | `:x-axis-name` |
| `yAxisName` | java.util.List | [[cdk.support/lookup-entry]] | `:y-axis-name` |"
  [stack id config]
  (let [builder (CfnModelCard$MetricDataItemsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-metric-group-property-builder
  "The cfn-model-card-metric-group-property-builder function buildes out new instances of 
CfnModelCard$MetricGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricData` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnModelCard$MetricGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :metric-data)]
      (. builder metricData data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-model-card-model-overview-property-builder
  "The cfn-model-card-model-overview-property-builder function buildes out new instances of 
CfnModelCard$ModelOverviewProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `problemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:problem-type` |"
  [stack id config]
  (let [builder (CfnModelCard$ModelOverviewProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-model-package-creator-property-builder
  "The cfn-model-card-model-package-creator-property-builder function buildes out new instances of 
CfnModelCard$ModelPackageCreatorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |"
  [stack id config]
  (let [builder (CfnModelCard$ModelPackageCreatorProperty$Builder.)]
    (when-let [data (lookup-entry config id :user-profile-name)]
      (. builder userProfileName data))
    (.build builder)))


(defn cfn-model-card-model-package-details-property-builder
  "The cfn-model-card-model-package-details-property-builder function buildes out new instances of 
CfnModelCard$ModelPackageDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `task` | java.lang.String | [[cdk.support/lookup-entry]] | `:task` |"
  [stack id config]
  (let [builder (CfnModelCard$ModelPackageDetailsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-objective-function-property-builder
  "The cfn-model-card-objective-function-property-builder function buildes out new instances of 
CfnModelCard$ObjectiveFunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `function` | software.amazon.awscdk.services.sagemaker.CfnModelCard$FunctionProperty | [[cdk.support/lookup-entry]] | `:function` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |"
  [stack id config]
  (let [builder (CfnModelCard$ObjectiveFunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lookup-entry config id :notes)]
      (. builder notes data))
    (.build builder)))


(defn cfn-model-card-props-builder
  "The cfn-model-card-props-builder function buildes out new instances of 
CfnModelCardProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.services.sagemaker.CfnModelCard$ContentProperty | [[cdk.support/lookup-entry]] | `:content` |
| `createdBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:created-by` |
| `lastModifiedBy` | software.amazon.awscdk.services.sagemaker.CfnModelCard$UserContextProperty | [[cdk.support/lookup-entry]] | `:last-modified-by` |
| `modelCardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-name` |
| `modelCardStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-card-status` |
| `securityConfig` | software.amazon.awscdk.services.sagemaker.CfnModelCard$SecurityConfigProperty | [[cdk.support/lookup-entry]] | `:security-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelCardProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-security-config-property-builder
  "The cfn-model-card-security-config-property-builder function buildes out new instances of 
CfnModelCard$SecurityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnModelCard$SecurityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-model-card-source-algorithm-property-builder
  "The cfn-model-card-source-algorithm-property-builder function buildes out new instances of 
CfnModelCard$SourceAlgorithmProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |"
  [stack id config]
  (let [builder (CfnModelCard$SourceAlgorithmProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm-name)]
      (. builder algorithmName data))
    (when-let [data (lookup-entry config id :model-data-url)]
      (. builder modelDataUrl data))
    (.build builder)))


(defn cfn-model-card-training-details-property-builder
  "The cfn-model-card-training-details-property-builder function buildes out new instances of 
CfnModelCard$TrainingDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectiveFunction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:objective-function` |
| `trainingJobDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-job-details` |
| `trainingObservations` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-observations` |"
  [stack id config]
  (let [builder (CfnModelCard$TrainingDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :objective-function)]
      (. builder objectiveFunction data))
    (when-let [data (lookup-entry config id :training-job-details)]
      (. builder trainingJobDetails data))
    (when-let [data (lookup-entry config id :training-observations)]
      (. builder trainingObservations data))
    (.build builder)))


(defn cfn-model-card-training-environment-property-builder
  "The cfn-model-card-training-environment-property-builder function buildes out new instances of 
CfnModelCard$TrainingEnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerImage` | java.util.List | [[cdk.support/lookup-entry]] | `:container-image` |"
  [stack id config]
  (let [builder (CfnModelCard$TrainingEnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-image)]
      (. builder containerImage data))
    (.build builder)))


(defn cfn-model-card-training-hyper-parameter-property-builder
  "The cfn-model-card-training-hyper-parameter-property-builder function buildes out new instances of 
CfnModelCard$TrainingHyperParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnModelCard$TrainingHyperParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-model-card-training-job-details-property-builder
  "The cfn-model-card-training-job-details-property-builder function buildes out new instances of 
CfnModelCard$TrainingJobDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hyperParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hyper-parameters` |
| `trainingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:training-arn` |
| `trainingDatasets` | java.util.List | [[cdk.support/lookup-entry]] | `:training-datasets` |
| `trainingEnvironment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:training-environment` |
| `trainingMetrics` | java.util.List | [[cdk.support/lookup-entry]] | `:training-metrics` |
| `userProvidedHyperParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:user-provided-hyper-parameters` |
| `userProvidedTrainingMetrics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-provided-training-metrics` |"
  [stack id config]
  (let [builder (CfnModelCard$TrainingJobDetailsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-card-training-metric-property-builder
  "The cfn-model-card-training-metric-property-builder function buildes out new instances of 
CfnModelCard$TrainingMetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notes` | java.lang.String | [[cdk.support/lookup-entry]] | `:notes` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnModelCard$TrainingMetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notes)]
      (. builder notes data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-model-card-user-context-property-builder
  "The cfn-model-card-user-context-property-builder function buildes out new instances of 
CfnModelCard$UserContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `userProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-arn` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |"
  [stack id config]
  (let [builder (CfnModelCard$UserContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-id)]
      (. builder domainId data))
    (when-let [data (lookup-entry config id :user-profile-arn)]
      (. builder userProfileArn data))
    (when-let [data (lookup-entry config id :user-profile-name)]
      (. builder userProfileName data))
    (.build builder)))


(defn cfn-model-container-definition-property-builder
  "The cfn-model-container-definition-property-builder function buildes out new instances of 
CfnModel$ContainerDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `multiModelConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$MultiModelConfigProperty | [[cdk.support/lookup-entry]] | `:multi-model-config` |"
  [stack id config]
  (let [builder (CfnModel$ContainerDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-explainability-job-definition-batch-transform-input-property-builder
  "The cfn-model-explainability-job-definition-batch-transform-input-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$BatchTransformInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-explainability-job-definition-builder
  "The cfn-model-explainability-job-definition-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-explainability-job-definition-cluster-config-property-builder
  "The cfn-model-explainability-job-definition-cluster-config-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$ClusterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-constraints-resource-property-builder
  "The cfn-model-explainability-job-definition-constraints-resource-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$ConstraintsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-csv-property-builder
  "The cfn-model-explainability-job-definition-csv-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-dataset-format-property-builder
  "The cfn-model-explainability-job-definition-dataset-format-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$JsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$DatasetFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :parquet)]
      (. builder parquet data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-endpoint-input-property-builder
  "The cfn-model-explainability-job-definition-endpoint-input-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `featuresAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:features-attribute` |
| `inferenceAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:inference-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `probabilityAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:probability-attribute` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$EndpointInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-explainability-job-definition-json-property-builder
  "The cfn-model-explainability-job-definition-json-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$JsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:line` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$JsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :line)]
      (. builder line data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder
  "The cfn-model-explainability-job-definition-model-explainability-app-specification-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:config-uri` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$ModelExplainabilityAppSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :config-uri)]
      (. builder configUri data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder
  "The cfn-model-explainability-job-definition-model-explainability-baseline-config-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$ModelExplainabilityBaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :baselining-job-name)]
      (. builder baseliningJobName data))
    (when-let [data (lookup-entry config id :constraints-resource)]
      (. builder constraintsResource data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-model-explainability-job-input-property-builder
  "The cfn-model-explainability-job-definition-model-explainability-job-input-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$BatchTransformInputProperty | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$ModelExplainabilityJobInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-transform-input)]
      (. builder batchTransformInput data))
    (when-let [data (lookup-entry config id :endpoint-input)]
      (. builder endpointInput data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-monitoring-output-config-property-builder
  "The cfn-model-explainability-job-definition-monitoring-output-config-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$MonitoringOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :monitoring-outputs)]
      (. builder monitoringOutputs data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-monitoring-output-property-builder
  "The cfn-model-explainability-job-definition-monitoring-output-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-output` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$MonitoringOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-output)]
      (. builder s3Output data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-monitoring-resources-property-builder
  "The cfn-model-explainability-job-definition-monitoring-resources-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$MonitoringResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-network-config-property-builder
  "The cfn-model-explainability-job-definition-network-config-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$NetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
      (. builder enableInterContainerTrafficEncryption data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-props-builder
  "The cfn-model-explainability-job-definition-props-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinitionProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-explainability-job-definition-s3-output-property-builder
  "The cfn-model-explainability-job-definition-s3-output-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$S3OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-path)]
      (. builder localPath data))
    (when-let [data (lookup-entry config id :s3-upload-mode)]
      (. builder s3UploadMode data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-stopping-condition-property-builder
  "The cfn-model-explainability-job-definition-stopping-condition-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$StoppingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
      (. builder maxRuntimeInSeconds data))
    (.build builder)))


(defn cfn-model-explainability-job-definition-vpc-config-property-builder
  "The cfn-model-explainability-job-definition-vpc-config-property-builder function buildes out new instances of 
CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnModelExplainabilityJobDefinition$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-model-image-config-property-builder
  "The cfn-model-image-config-property-builder function buildes out new instances of 
CfnModel$ImageConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryAccessMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-mode` |
| `repositoryAuthConfig` | software.amazon.awscdk.services.sagemaker.CfnModel$RepositoryAuthConfigProperty | [[cdk.support/lookup-entry]] | `:repository-auth-config` |"
  [stack id config]
  (let [builder (CfnModel$ImageConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-access-mode)]
      (. builder repositoryAccessMode data))
    (when-let [data (lookup-entry config id :repository-auth-config)]
      (. builder repositoryAuthConfig data))
    (.build builder)))


(defn cfn-model-inference-execution-config-property-builder
  "The cfn-model-inference-execution-config-property-builder function buildes out new instances of 
CfnModel$InferenceExecutionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnModel$InferenceExecutionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-model-model-access-config-property-builder
  "The cfn-model-model-access-config-property-builder function buildes out new instances of 
CfnModel$ModelAccessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptEula` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-eula` |"
  [stack id config]
  (let [builder (CfnModel$ModelAccessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :accept-eula)]
      (. builder acceptEula data))
    (.build builder)))


(defn cfn-model-model-data-source-property-builder
  "The cfn-model-model-data-source-property-builder function buildes out new instances of 
CfnModel$ModelDataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.services.sagemaker.CfnModel$S3DataSourceProperty | [[cdk.support/lookup-entry]] | `:s3-data-source` |"
  [stack id config]
  (let [builder (CfnModel$ModelDataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-data-source)]
      (. builder s3DataSource data))
    (.build builder)))


(defn cfn-model-multi-model-config-property-builder
  "The cfn-model-multi-model-config-property-builder function buildes out new instances of 
CfnModel$MultiModelConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelCacheSetting` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-cache-setting` |"
  [stack id config]
  (let [builder (CfnModel$MultiModelConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :model-cache-setting)]
      (. builder modelCacheSetting data))
    (.build builder)))


(defn cfn-model-package-additional-inference-specification-definition-property-builder
  "The cfn-model-package-additional-inference-specification-definition-property-builder function buildes out new instances of 
CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `supportedContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-content-types` |
| `supportedRealtimeInferenceInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-realtime-inference-instance-types` |
| `supportedResponseMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-response-mime-types` |
| `supportedTransformInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-transform-instance-types` |"
  [stack id config]
  (let [builder (CfnModelPackage$AdditionalInferenceSpecificationDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-package-bias-property-builder
  "The cfn-model-package-bias-property-builder function buildes out new instances of 
CfnModelPackage$BiasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postTrainingReport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-training-report` |
| `preTrainingReport` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:pre-training-report` |
| `report` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:report` |"
  [stack id config]
  (let [builder (CfnModelPackage$BiasProperty$Builder.)]
    (when-let [data (lookup-entry config id :post-training-report)]
      (. builder postTrainingReport data))
    (when-let [data (lookup-entry config id :pre-training-report)]
      (. builder preTrainingReport data))
    (when-let [data (lookup-entry config id :report)]
      (. builder report data))
    (.build builder)))


(defn cfn-model-package-builder
  "The cfn-model-package-builder function buildes out new instances of 
CfnModelPackage$Builder using the provided configuration.  Each field is set as follows:

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
| `validationSpecification` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ValidationSpecificationProperty | [[cdk.support/lookup-entry]] | `:validation-specification` |"
  [stack id config]
  (let [builder (CfnModelPackage$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-package-data-source-property-builder
  "The cfn-model-package-data-source-property-builder function buildes out new instances of 
CfnModelPackage$DataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-data-source` |"
  [stack id config]
  (let [builder (CfnModelPackage$DataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-data-source)]
      (. builder s3DataSource data))
    (.build builder)))


(defn cfn-model-package-drift-check-baselines-property-builder
  "The cfn-model-package-drift-check-baselines-property-builder function buildes out new instances of 
CfnModelPackage$DriftCheckBaselinesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bias` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bias` |
| `explainability` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:explainability` |
| `modelDataQuality` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$DriftCheckModelDataQualityProperty | [[cdk.support/lookup-entry]] | `:model-data-quality` |
| `modelQuality` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-quality` |"
  [stack id config]
  (let [builder (CfnModelPackage$DriftCheckBaselinesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bias)]
      (. builder bias data))
    (when-let [data (lookup-entry config id :explainability)]
      (. builder explainability data))
    (when-let [data (lookup-entry config id :model-data-quality)]
      (. builder modelDataQuality data))
    (when-let [data (lookup-entry config id :model-quality)]
      (. builder modelQuality data))
    (.build builder)))


(defn cfn-model-package-drift-check-bias-property-builder
  "The cfn-model-package-drift-check-bias-property-builder function buildes out new instances of 
CfnModelPackage$DriftCheckBiasProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-file` |
| `postTrainingConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-training-constraints` |
| `preTrainingConstraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:pre-training-constraints` |"
  [stack id config]
  (let [builder (CfnModelPackage$DriftCheckBiasProperty$Builder.)]
    (when-let [data (lookup-entry config id :config-file)]
      (. builder configFile data))
    (when-let [data (lookup-entry config id :post-training-constraints)]
      (. builder postTrainingConstraints data))
    (when-let [data (lookup-entry config id :pre-training-constraints)]
      (. builder preTrainingConstraints data))
    (.build builder)))


(defn cfn-model-package-drift-check-explainability-property-builder
  "The cfn-model-package-drift-check-explainability-property-builder function buildes out new instances of 
CfnModelPackage$DriftCheckExplainabilityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configFile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-file` |
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |"
  [stack id config]
  (let [builder (CfnModelPackage$DriftCheckExplainabilityProperty$Builder.)]
    (when-let [data (lookup-entry config id :config-file)]
      (. builder configFile data))
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (.build builder)))


(defn cfn-model-package-drift-check-model-data-quality-property-builder
  "The cfn-model-package-drift-check-model-data-quality-property-builder function buildes out new instances of 
CfnModelPackage$DriftCheckModelDataQualityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnModelPackage$DriftCheckModelDataQualityProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-model-package-drift-check-model-quality-property-builder
  "The cfn-model-package-drift-check-model-quality-property-builder function buildes out new instances of 
CfnModelPackage$DriftCheckModelQualityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnModelPackage$DriftCheckModelQualityProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-model-package-explainability-property-builder
  "The cfn-model-package-explainability-property-builder function buildes out new instances of 
CfnModelPackage$ExplainabilityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `report` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:report` |"
  [stack id config]
  (let [builder (CfnModelPackage$ExplainabilityProperty$Builder.)]
    (when-let [data (lookup-entry config id :report)]
      (. builder report data))
    (.build builder)))


(defn cfn-model-package-file-source-property-builder
  "The cfn-model-package-file-source-property-builder function buildes out new instances of 
CfnModelPackage$FileSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-digest` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelPackage$FileSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-digest)]
      (. builder contentDigest data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-package-group-builder
  "The cfn-model-package-group-builder function buildes out new instances of 
CfnModelPackageGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelPackageGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageGroupPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:model-package-group-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelPackageGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :model-package-group-description)]
      (. builder modelPackageGroupDescription data))
    (when-let [data (lookup-entry config id :model-package-group-name)]
      (. builder modelPackageGroupName data))
    (when-let [data (lookup-entry config id :model-package-group-policy)]
      (. builder modelPackageGroupPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-model-package-group-props-builder
  "The cfn-model-package-group-props-builder function buildes out new instances of 
CfnModelPackageGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modelPackageGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-description` |
| `modelPackageGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-package-group-name` |
| `modelPackageGroupPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:model-package-group-policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelPackageGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :model-package-group-description)]
      (. builder modelPackageGroupDescription data))
    (when-let [data (lookup-entry config id :model-package-group-name)]
      (. builder modelPackageGroupName data))
    (when-let [data (lookup-entry config id :model-package-group-policy)]
      (. builder modelPackageGroupPolicy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-model-package-inference-specification-property-builder
  "The cfn-model-package-inference-specification-property-builder function buildes out new instances of 
CfnModelPackage$InferenceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | java.util.List | [[cdk.support/lookup-entry]] | `:containers` |
| `supportedContentTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-content-types` |
| `supportedRealtimeInferenceInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-realtime-inference-instance-types` |
| `supportedResponseMimeTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-response-mime-types` |
| `supportedTransformInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-transform-instance-types` |"
  [stack id config]
  (let [builder (CfnModelPackage$InferenceSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-package-metadata-properties-property-builder
  "The cfn-model-package-metadata-properties-property-builder function buildes out new instances of 
CfnModelPackage$MetadataPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `commitId` | java.lang.String | [[cdk.support/lookup-entry]] | `:commit-id` |
| `generatedBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-by` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |"
  [stack id config]
  (let [builder (CfnModelPackage$MetadataPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :commit-id)]
      (. builder commitId data))
    (when-let [data (lookup-entry config id :generated-by)]
      (. builder generatedBy data))
    (when-let [data (lookup-entry config id :project-id)]
      (. builder projectId data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (.build builder)))


(defn cfn-model-package-metrics-source-property-builder
  "The cfn-model-package-metrics-source-property-builder function buildes out new instances of 
CfnModelPackage$MetricsSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-digest` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelPackage$MetricsSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-digest)]
      (. builder contentDigest data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-package-model-data-quality-property-builder
  "The cfn-model-package-model-data-quality-property-builder function buildes out new instances of 
CfnModelPackage$ModelDataQualityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelDataQualityProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-model-package-model-input-property-builder
  "The cfn-model-package-model-input-property-builder function buildes out new instances of 
CfnModelPackage$ModelInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataInputConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-input-config` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-input-config)]
      (. builder dataInputConfig data))
    (.build builder)))


(defn cfn-model-package-model-metrics-property-builder
  "The cfn-model-package-model-metrics-property-builder function buildes out new instances of 
CfnModelPackage$ModelMetricsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bias` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$BiasProperty | [[cdk.support/lookup-entry]] | `:bias` |
| `explainability` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:explainability` |
| `modelDataQuality` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-data-quality` |
| `modelQuality` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$ModelQualityProperty | [[cdk.support/lookup-entry]] | `:model-quality` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelMetricsProperty$Builder.)]
    (when-let [data (lookup-entry config id :bias)]
      (. builder bias data))
    (when-let [data (lookup-entry config id :explainability)]
      (. builder explainability data))
    (when-let [data (lookup-entry config id :model-data-quality)]
      (. builder modelDataQuality data))
    (when-let [data (lookup-entry config id :model-quality)]
      (. builder modelQuality data))
    (.build builder)))


(defn cfn-model-package-model-package-container-definition-property-builder
  "The cfn-model-package-model-package-container-definition-property-builder function buildes out new instances of 
CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `nearestModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nearest-model-name` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelPackageContainerDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-package-model-package-status-details-property-builder
  "The cfn-model-package-model-package-status-details-property-builder function buildes out new instances of 
CfnModelPackage$ModelPackageStatusDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `validationStatuses` | java.util.List | [[cdk.support/lookup-entry]] | `:validation-statuses` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelPackageStatusDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :validation-statuses)]
      (. builder validationStatuses data))
    (.build builder)))


(defn cfn-model-package-model-package-status-item-property-builder
  "The cfn-model-package-model-package-status-item-property-builder function buildes out new instances of 
CfnModelPackage$ModelPackageStatusItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelPackageStatusItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-reason)]
      (. builder failureReason data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-model-package-model-quality-property-builder
  "The cfn-model-package-model-quality-property-builder function buildes out new instances of 
CfnModelPackage$ModelQualityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraints` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:constraints` |
| `statistics` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$MetricsSourceProperty | [[cdk.support/lookup-entry]] | `:statistics` |"
  [stack id config]
  (let [builder (CfnModelPackage$ModelQualityProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :statistics)]
      (. builder statistics data))
    (.build builder)))


(defn cfn-model-package-props-builder
  "The cfn-model-package-props-builder function buildes out new instances of 
CfnModelPackageProps$Builder using the provided configuration.  Each field is set as follows:

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
| `validationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-specification` |"
  [stack id config]
  (let [builder (CfnModelPackageProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-package-s3-data-source-property-builder
  "The cfn-model-package-s3-data-source-property-builder function buildes out new instances of 
CfnModelPackage$S3DataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3DataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelPackage$S3DataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-data-type)]
      (. builder s3DataType data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-package-source-algorithm-property-builder
  "The cfn-model-package-source-algorithm-property-builder function buildes out new instances of 
CfnModelPackage$SourceAlgorithmProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm-name` |
| `modelDataUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-data-url` |"
  [stack id config]
  (let [builder (CfnModelPackage$SourceAlgorithmProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm-name)]
      (. builder algorithmName data))
    (when-let [data (lookup-entry config id :model-data-url)]
      (. builder modelDataUrl data))
    (.build builder)))


(defn cfn-model-package-source-algorithm-specification-property-builder
  "The cfn-model-package-source-algorithm-specification-property-builder function buildes out new instances of 
CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceAlgorithms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-algorithms` |"
  [stack id config]
  (let [builder (CfnModelPackage$SourceAlgorithmSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-algorithms)]
      (. builder sourceAlgorithms data))
    (.build builder)))


(defn cfn-model-package-transform-input-property-builder
  "The cfn-model-package-transform-input-property-builder function buildes out new instances of 
CfnModelPackage$TransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-type` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `dataSource` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$DataSourceProperty | [[cdk.support/lookup-entry]] | `:data-source` |
| `splitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:split-type` |"
  [stack id config]
  (let [builder (CfnModelPackage$TransformInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :split-type)]
      (. builder splitType data))
    (.build builder)))


(defn cfn-model-package-transform-job-definition-property-builder
  "The cfn-model-package-transform-job-definition-property-builder function buildes out new instances of 
CfnModelPackage$TransformJobDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:batch-strategy` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `maxConcurrentTransforms` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-transforms` |
| `maxPayloadInMb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-payload-in-mb` |
| `transformInput` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$TransformInputProperty | [[cdk.support/lookup-entry]] | `:transform-input` |
| `transformOutput` | software.amazon.awscdk.services.sagemaker.CfnModelPackage$TransformOutputProperty | [[cdk.support/lookup-entry]] | `:transform-output` |
| `transformResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform-resources` |"
  [stack id config]
  (let [builder (CfnModelPackage$TransformJobDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-package-transform-output-property-builder
  "The cfn-model-package-transform-output-property-builder function buildes out new instances of 
CfnModelPackage$TransformOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accept` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept` |
| `assembleWith` | java.lang.String | [[cdk.support/lookup-entry]] | `:assemble-with` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |"
  [stack id config]
  (let [builder (CfnModelPackage$TransformOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :accept)]
      (. builder accept data))
    (when-let [data (lookup-entry config id :assemble-with)]
      (. builder assembleWith data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :s3-output-path)]
      (. builder s3OutputPath data))
    (.build builder)))


(defn cfn-model-package-transform-resources-property-builder
  "The cfn-model-package-transform-resources-property-builder function buildes out new instances of 
CfnModelPackage$TransformResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |"
  [stack id config]
  (let [builder (CfnModelPackage$TransformResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (.build builder)))


(defn cfn-model-package-validation-profile-property-builder
  "The cfn-model-package-validation-profile-property-builder function buildes out new instances of 
CfnModelPackage$ValidationProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `profileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile-name` |
| `transformJobDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform-job-definition` |"
  [stack id config]
  (let [builder (CfnModelPackage$ValidationProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :profile-name)]
      (. builder profileName data))
    (when-let [data (lookup-entry config id :transform-job-definition)]
      (. builder transformJobDefinition data))
    (.build builder)))


(defn cfn-model-package-validation-specification-property-builder
  "The cfn-model-package-validation-specification-property-builder function buildes out new instances of 
CfnModelPackage$ValidationSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `validationProfiles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validation-profiles` |
| `validationRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-role` |"
  [stack id config]
  (let [builder (CfnModelPackage$ValidationSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :validation-profiles)]
      (. builder validationProfiles data))
    (when-let [data (lookup-entry config id :validation-role)]
      (. builder validationRole data))
    (.build builder)))


(defn cfn-model-props-builder
  "The cfn-model-props-builder function buildes out new instances of 
CfnModelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:containers` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `inferenceExecutionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-execution-config` |
| `modelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:model-name` |
| `primaryContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-container` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnModelProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-batch-transform-input-property-builder
  "The cfn-model-quality-job-definition-batch-transform-input-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$BatchTransformInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-builder
  "The cfn-model-quality-job-definition-builder function buildes out new instances of 
CfnModelQualityJobDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-cluster-config-property-builder
  "The cfn-model-quality-job-definition-cluster-config-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$ClusterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-model-quality-job-definition-constraints-resource-property-builder
  "The cfn-model-quality-job-definition-constraints-resource-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$ConstraintsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-quality-job-definition-csv-property-builder
  "The cfn-model-quality-job-definition-csv-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-model-quality-job-definition-dataset-format-property-builder
  "The cfn-model-quality-job-definition-dataset-format-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$DatasetFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parquet` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$DatasetFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :parquet)]
      (. builder parquet data))
    (.build builder)))


(defn cfn-model-quality-job-definition-endpoint-input-property-builder
  "The cfn-model-quality-job-definition-endpoint-input-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$EndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `startTimeOffset` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time-offset` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$EndpointInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-json-property-builder
  "The cfn-model-quality-job-definition-json-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$JsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:line` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$JsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :line)]
      (. builder line data))
    (.build builder)))


(defn cfn-model-quality-job-definition-model-quality-app-specification-property-builder
  "The cfn-model-quality-job-definition-model-quality-app-specification-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `problemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:problem-type` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$ModelQualityAppSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-model-quality-baseline-config-property-builder
  "The cfn-model-quality-job-definition-model-quality-baseline-config-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseliningJobName` | java.lang.String | [[cdk.support/lookup-entry]] | `:baselining-job-name` |
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$ModelQualityBaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :baselining-job-name)]
      (. builder baseliningJobName data))
    (when-let [data (lookup-entry config id :constraints-resource)]
      (. builder constraintsResource data))
    (.build builder)))


(defn cfn-model-quality-job-definition-model-quality-job-input-property-builder
  "The cfn-model-quality-job-definition-model-quality-job-input-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$BatchTransformInputProperty | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$EndpointInputProperty | [[cdk.support/lookup-entry]] | `:endpoint-input` |
| `groundTruthS3Input` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ground-truth-s3-input` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$ModelQualityJobInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-transform-input)]
      (. builder batchTransformInput data))
    (when-let [data (lookup-entry config id :endpoint-input)]
      (. builder endpointInput data))
    (when-let [data (lookup-entry config id :ground-truth-s3-input)]
      (. builder groundTruthS3Input data))
    (.build builder)))


(defn cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder
  "The cfn-model-quality-job-definition-monitoring-ground-truth-s3-input-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$MonitoringGroundTruthS3InputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-quality-job-definition-monitoring-output-config-property-builder
  "The cfn-model-quality-job-definition-monitoring-output-config-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$MonitoringOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :monitoring-outputs)]
      (. builder monitoringOutputs data))
    (.build builder)))


(defn cfn-model-quality-job-definition-monitoring-output-property-builder
  "The cfn-model-quality-job-definition-monitoring-output-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$S3OutputProperty | [[cdk.support/lookup-entry]] | `:s3-output` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$MonitoringOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-output)]
      (. builder s3Output data))
    (.build builder)))


(defn cfn-model-quality-job-definition-monitoring-resources-property-builder
  "The cfn-model-quality-job-definition-monitoring-resources-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$MonitoringResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
    (.build builder)))


(defn cfn-model-quality-job-definition-network-config-property-builder
  "The cfn-model-quality-job-definition-network-config-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$NetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$NetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
      (. builder enableInterContainerTrafficEncryption data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-model-quality-job-definition-props-builder
  "The cfn-model-quality-job-definition-props-builder function buildes out new instances of 
CfnModelQualityJobDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinitionProps$Builder.)]
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
    (.build builder)))


(defn cfn-model-quality-job-definition-s3-output-property-builder
  "The cfn-model-quality-job-definition-s3-output-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$S3OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$S3OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-path)]
      (. builder localPath data))
    (when-let [data (lookup-entry config id :s3-upload-mode)]
      (. builder s3UploadMode data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-quality-job-definition-stopping-condition-property-builder
  "The cfn-model-quality-job-definition-stopping-condition-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$StoppingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$StoppingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
      (. builder maxRuntimeInSeconds data))
    (.build builder)))


(defn cfn-model-quality-job-definition-vpc-config-property-builder
  "The cfn-model-quality-job-definition-vpc-config-property-builder function buildes out new instances of 
CfnModelQualityJobDefinition$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnModelQualityJobDefinition$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-model-repository-auth-config-property-builder
  "The cfn-model-repository-auth-config-property-builder function buildes out new instances of 
CfnModel$RepositoryAuthConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryCredentialsProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-credentials-provider-arn` |"
  [stack id config]
  (let [builder (CfnModel$RepositoryAuthConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-credentials-provider-arn)]
      (. builder repositoryCredentialsProviderArn data))
    (.build builder)))


(defn cfn-model-s3-data-source-property-builder
  "The cfn-model-s3-data-source-property-builder function buildes out new instances of 
CfnModel$S3DataSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression-type` |
| `modelAccessConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:model-access-config` |
| `s3DataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-type` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnModel$S3DataSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :compression-type)]
      (. builder compressionType data))
    (when-let [data (lookup-entry config id :model-access-config)]
      (. builder modelAccessConfig data))
    (when-let [data (lookup-entry config id :s3-data-type)]
      (. builder s3DataType data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-model-vpc-config-property-builder
  "The cfn-model-vpc-config-property-builder function buildes out new instances of 
CfnModel$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnModel$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-monitoring-schedule-baseline-config-property-builder
  "The cfn-monitoring-schedule-baseline-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$BaselineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `constraintsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:constraints-resource` |
| `statisticsResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statistics-resource` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$BaselineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :constraints-resource)]
      (. builder constraintsResource data))
    (when-let [data (lookup-entry config id :statistics-resource)]
      (. builder statisticsResource data))
    (.build builder)))


(defn cfn-monitoring-schedule-batch-transform-input-property-builder
  "The cfn-monitoring-schedule-batch-transform-input-property-builder function buildes out new instances of 
CfnMonitoringSchedule$BatchTransformInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataCapturedDestinationS3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-captured-destination-s3-uri` |
| `datasetFormat` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$DatasetFormatProperty | [[cdk.support/lookup-entry]] | `:dataset-format` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$BatchTransformInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-builder
  "The cfn-monitoring-schedule-builder function buildes out new instances of 
CfnMonitoringSchedule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastMonitoringExecutionSummary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-monitoring-execution-summary` |
| `monitoringScheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-schedule-config` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `monitoringScheduleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-cluster-config-property-builder
  "The cfn-monitoring-schedule-cluster-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `volumeKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-kms-key-id` |
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$ClusterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :volume-kms-key-id)]
      (. builder volumeKmsKeyId data))
    (when-let [data (lookup-entry config id :volume-size-in-gb)]
      (. builder volumeSizeInGb data))
    (.build builder)))


(defn cfn-monitoring-schedule-constraints-resource-property-builder
  "The cfn-monitoring-schedule-constraints-resource-property-builder function buildes out new instances of 
CfnMonitoringSchedule$ConstraintsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$ConstraintsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-monitoring-schedule-csv-property-builder
  "The cfn-monitoring-schedule-csv-property-builder function buildes out new instances of 
CfnMonitoringSchedule$CsvProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$CsvProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-monitoring-schedule-dataset-format-property-builder
  "The cfn-monitoring-schedule-dataset-format-property-builder function buildes out new instances of 
CfnMonitoringSchedule$DatasetFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `csv` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$CsvProperty | [[cdk.support/lookup-entry]] | `:csv` |
| `json` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json` |
| `parquet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:parquet` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$DatasetFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :csv)]
      (. builder csv data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :parquet)]
      (. builder parquet data))
    (.build builder)))


(defn cfn-monitoring-schedule-endpoint-input-property-builder
  "The cfn-monitoring-schedule-endpoint-input-property-builder function buildes out new instances of 
CfnMonitoringSchedule$EndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `excludeFeaturesAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-features-attribute` |
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3DataDistributionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-data-distribution-type` |
| `s3InputMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-input-mode` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$EndpointInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-json-property-builder
  "The cfn-monitoring-schedule-json-property-builder function buildes out new instances of 
CfnMonitoringSchedule$JsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `line` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:line` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$JsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :line)]
      (. builder line data))
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-app-specification-property-builder
  "The cfn-monitoring-schedule-monitoring-app-specification-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerArguments` | java.util.List | [[cdk.support/lookup-entry]] | `:container-arguments` |
| `containerEntrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:container-entrypoint` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `postAnalyticsProcessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:post-analytics-processor-source-uri` |
| `recordPreprocessorSourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-preprocessor-source-uri` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringAppSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-execution-summary-property-builder
  "The cfn-monitoring-schedule-monitoring-execution-summary-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastModifiedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-modified-time` |
| `monitoringExecutionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-execution-status` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `processingJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:processing-job-arn` |
| `scheduledTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-time` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringExecutionSummaryProperty$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-input-property-builder
  "The cfn-monitoring-schedule-monitoring-input-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchTransformInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-transform-input` |
| `endpointInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-input` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-transform-input)]
      (. builder batchTransformInput data))
    (when-let [data (lookup-entry config id :endpoint-input)]
      (. builder endpointInput data))
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-job-definition-property-builder
  "The cfn-monitoring-schedule-monitoring-job-definition-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `stoppingCondition` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$StoppingConditionProperty | [[cdk.support/lookup-entry]] | `:stopping-condition` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringJobDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-output-config-property-builder
  "The cfn-monitoring-schedule-monitoring-output-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `monitoringOutputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-outputs` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringOutputConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :monitoring-outputs)]
      (. builder monitoringOutputs data))
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-output-property-builder
  "The cfn-monitoring-schedule-monitoring-output-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Output` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$S3OutputProperty | [[cdk.support/lookup-entry]] | `:s3-output` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-output)]
      (. builder s3Output data))
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-resources-property-builder
  "The cfn-monitoring-schedule-monitoring-resources-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cluster-config` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
    (.build builder)))


(defn cfn-monitoring-schedule-monitoring-schedule-config-property-builder
  "The cfn-monitoring-schedule-monitoring-schedule-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitoringJobDefinition` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$MonitoringJobDefinitionProperty | [[cdk.support/lookup-entry]] | `:monitoring-job-definition` |
| `monitoringJobDefinitionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-job-definition-name` |
| `monitoringType` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-type` |
| `scheduleConfig` | software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule$ScheduleConfigProperty | [[cdk.support/lookup-entry]] | `:schedule-config` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$MonitoringScheduleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :monitoring-job-definition)]
      (. builder monitoringJobDefinition data))
    (when-let [data (lookup-entry config id :monitoring-job-definition-name)]
      (. builder monitoringJobDefinitionName data))
    (when-let [data (lookup-entry config id :monitoring-type)]
      (. builder monitoringType data))
    (when-let [data (lookup-entry config id :schedule-config)]
      (. builder scheduleConfig data))
    (.build builder)))


(defn cfn-monitoring-schedule-network-config-property-builder
  "The cfn-monitoring-schedule-network-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$NetworkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableInterContainerTrafficEncryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-inter-container-traffic-encryption` |
| `enableNetworkIsolation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-network-isolation` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$NetworkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-inter-container-traffic-encryption)]
      (. builder enableInterContainerTrafficEncryption data))
    (when-let [data (lookup-entry config id :enable-network-isolation)]
      (. builder enableNetworkIsolation data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-monitoring-schedule-props-builder
  "The cfn-monitoring-schedule-props-builder function buildes out new instances of 
CfnMonitoringScheduleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `failureReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-reason` |
| `lastMonitoringExecutionSummary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-monitoring-execution-summary` |
| `monitoringScheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-schedule-config` |
| `monitoringScheduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-name` |
| `monitoringScheduleStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-schedule-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMonitoringScheduleProps$Builder.)]
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
    (.build builder)))


(defn cfn-monitoring-schedule-s3-output-property-builder
  "The cfn-monitoring-schedule-s3-output-property-builder function buildes out new instances of 
CfnMonitoringSchedule$S3OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-path` |
| `s3UploadMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-upload-mode` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$S3OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-path)]
      (. builder localPath data))
    (when-let [data (lookup-entry config id :s3-upload-mode)]
      (. builder s3UploadMode data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-monitoring-schedule-schedule-config-property-builder
  "The cfn-monitoring-schedule-schedule-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$ScheduleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAnalysisEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-analysis-end-time` |
| `dataAnalysisStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-analysis-start-time` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$ScheduleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-analysis-end-time)]
      (. builder dataAnalysisEndTime data))
    (when-let [data (lookup-entry config id :data-analysis-start-time)]
      (. builder dataAnalysisStartTime data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-monitoring-schedule-statistics-resource-property-builder
  "The cfn-monitoring-schedule-statistics-resource-property-builder function buildes out new instances of 
CfnMonitoringSchedule$StatisticsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$StatisticsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-monitoring-schedule-stopping-condition-property-builder
  "The cfn-monitoring-schedule-stopping-condition-property-builder function buildes out new instances of 
CfnMonitoringSchedule$StoppingConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxRuntimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-runtime-in-seconds` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$StoppingConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-runtime-in-seconds)]
      (. builder maxRuntimeInSeconds data))
    (.build builder)))


(defn cfn-monitoring-schedule-vpc-config-property-builder
  "The cfn-monitoring-schedule-vpc-config-property-builder function buildes out new instances of 
CfnMonitoringSchedule$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (CfnMonitoringSchedule$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn cfn-notebook-instance-builder
  "The cfn-notebook-instance-builder function buildes out new instances of 
CfnNotebookInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnNotebookInstance$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-notebook-instance-instance-metadata-service-configuration-property-builder
  "The cfn-notebook-instance-instance-metadata-service-configuration-property-builder function buildes out new instances of 
CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `minimumInstanceMetadataServiceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:minimum-instance-metadata-service-version` |"
  [stack id config]
  (let [builder (CfnNotebookInstance$InstanceMetadataServiceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :minimum-instance-metadata-service-version)]
      (. builder minimumInstanceMetadataServiceVersion data))
    (.build builder)))


(defn cfn-notebook-instance-lifecycle-config-builder
  "The cfn-notebook-instance-lifecycle-config-builder function buildes out new instances of 
CfnNotebookInstanceLifecycleConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookInstanceLifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-lifecycle-config-name` |
| `onCreate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-create` |
| `onStart` | java.util.List | [[cdk.support/lookup-entry]] | `:on-start` |"
  [stack id config]
  (let [builder (CfnNotebookInstanceLifecycleConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :notebook-instance-lifecycle-config-name)]
      (. builder notebookInstanceLifecycleConfigName data))
    (when-let [data (lookup-entry config id :on-create)]
      (. builder onCreate data))
    (when-let [data (lookup-entry config id :on-start)]
      (. builder onStart data))
    (.build builder)))


(defn cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder
  "The cfn-notebook-instance-lifecycle-config-notebook-instance-lifecycle-hook-property-builder function buildes out new instances of 
CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |"
  [stack id config]
  (let [builder (CfnNotebookInstanceLifecycleConfig$NotebookInstanceLifecycleHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (.build builder)))


(defn cfn-notebook-instance-lifecycle-config-props-builder
  "The cfn-notebook-instance-lifecycle-config-props-builder function buildes out new instances of 
CfnNotebookInstanceLifecycleConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookInstanceLifecycleConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-instance-lifecycle-config-name` |
| `onCreate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-create` |
| `onStart` | java.util.List | [[cdk.support/lookup-entry]] | `:on-start` |"
  [stack id config]
  (let [builder (CfnNotebookInstanceLifecycleConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :notebook-instance-lifecycle-config-name)]
      (. builder notebookInstanceLifecycleConfigName data))
    (when-let [data (lookup-entry config id :on-create)]
      (. builder onCreate data))
    (when-let [data (lookup-entry config id :on-start)]
      (. builder onStart data))
    (.build builder)))


(defn cfn-notebook-instance-props-builder
  "The cfn-notebook-instance-props-builder function buildes out new instances of 
CfnNotebookInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `volumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnNotebookInstanceProps$Builder.)]
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
    (.build builder)))


(defn cfn-pipeline-builder
  "The cfn-pipeline-builder function buildes out new instances of 
CfnPipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parallelismConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
| `pipelineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pipeline-definition` |
| `pipelineDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-description` |
| `pipelineDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-display-name` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPipeline$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-pipeline-parallelism-configuration-property-builder
  "The cfn-pipeline-parallelism-configuration-property-builder function buildes out new instances of 
CfnPipeline$ParallelismConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxParallelExecutionSteps` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallel-execution-steps` |"
  [stack id config]
  (let [builder (CfnPipeline$ParallelismConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-parallel-execution-steps)]
      (. builder maxParallelExecutionSteps data))
    (.build builder)))


(defn cfn-pipeline-pipeline-definition-property-builder
  "The cfn-pipeline-pipeline-definition-property-builder function buildes out new instances of 
CfnPipeline$PipelineDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineDefinitionBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-definition-body` |
| `pipelineDefinitionS3Location` | software.amazon.awscdk.services.sagemaker.CfnPipeline$S3LocationProperty | [[cdk.support/lookup-entry]] | `:pipeline-definition-s3-location` |"
  [stack id config]
  (let [builder (CfnPipeline$PipelineDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-definition-body)]
      (. builder pipelineDefinitionBody data))
    (when-let [data (lookup-entry config id :pipeline-definition-s3-location)]
      (. builder pipelineDefinitionS3Location data))
    (.build builder)))


(defn cfn-pipeline-props-builder
  "The cfn-pipeline-props-builder function buildes out new instances of 
CfnPipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parallelismConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parallelism-configuration` |
| `pipelineDefinition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:pipeline-definition` |
| `pipelineDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-description` |
| `pipelineDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-display-name` |
| `pipelineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPipelineProps$Builder.)]
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
    (.build builder)))


(defn cfn-pipeline-s3-location-property-builder
  "The cfn-pipeline-s3-location-property-builder function buildes out new instances of 
CfnPipeline$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `eTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:e-tag` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnPipeline$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :e-tag)]
      (. builder eTag data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `serviceCatalogProvisionedProductDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-catalog-provisioned-product-details` |
| `serviceCatalogProvisioningDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-catalog-provisioning-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `serviceCatalogProvisionedProductDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-catalog-provisioned-product-details` |
| `serviceCatalogProvisioningDetails` | java.lang.Object | [[cdk.support/lookup-entry]] | `:service-catalog-provisioning-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
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
    (.build builder)))


(defn cfn-project-provisioning-parameter-property-builder
  "The cfn-project-provisioning-parameter-property-builder function buildes out new instances of 
CfnProject$ProvisioningParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnProject$ProvisioningParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-project-service-catalog-provisioned-product-details-property-builder
  "The cfn-project-service-catalog-provisioned-product-details-property-builder function buildes out new instances of 
CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `provisionedProductId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-id` |
| `provisionedProductStatusMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-status-message` |"
  [stack id config]
  (let [builder (CfnProject$ServiceCatalogProvisionedProductDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :provisioned-product-id)]
      (. builder provisionedProductId data))
    (when-let [data (lookup-entry config id :provisioned-product-status-message)]
      (. builder provisionedProductStatusMessage data))
    (.build builder)))


(defn cfn-project-service-catalog-provisioning-details-property-builder
  "The cfn-project-service-catalog-provisioning-details-property-builder function buildes out new instances of 
CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `provisioningParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioning-parameters` |"
  [stack id config]
  (let [builder (CfnProject$ServiceCatalogProvisioningDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :path-id)]
      (. builder pathId data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :provisioning-artifact-id)]
      (. builder provisioningArtifactId data))
    (when-let [data (lookup-entry config id :provisioning-parameters)]
      (. builder provisioningParameters data))
    (.build builder)))


(defn cfn-space-builder
  "The cfn-space-builder function buildes out new instances of 
CfnSpace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `ownershipSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$OwnershipSettingsProperty | [[cdk.support/lookup-entry]] | `:ownership-settings` |
| `spaceDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-display-name` |
| `spaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-name` |
| `spaceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-settings` |
| `spaceSharingSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:space-sharing-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSpace$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-space-code-repository-property-builder
  "The cfn-space-code-repository-property-builder function buildes out new instances of 
CfnSpace$CodeRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |"
  [stack id config]
  (let [builder (CfnSpace$CodeRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (.build builder)))


(defn cfn-space-custom-file-system-property-builder
  "The cfn-space-custom-file-system-property-builder function buildes out new instances of 
CfnSpace$CustomFileSystemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystem` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system` |"
  [stack id config]
  (let [builder (CfnSpace$CustomFileSystemProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs-file-system)]
      (. builder efsFileSystem data))
    (.build builder)))


(defn cfn-space-custom-image-property-builder
  "The cfn-space-custom-image-property-builder function buildes out new instances of 
CfnSpace$CustomImageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |"
  [stack id config]
  (let [builder (CfnSpace$CustomImageProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-image-config-name)]
      (. builder appImageConfigName data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :image-version-number)]
      (. builder imageVersionNumber data))
    (.build builder)))


(defn cfn-space-ebs-storage-settings-property-builder
  "The cfn-space-ebs-storage-settings-property-builder function buildes out new instances of 
CfnSpace$EbsStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ebs-volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnSpace$EbsStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-volume-size-in-gb)]
      (. builder ebsVolumeSizeInGb data))
    (.build builder)))


(defn cfn-space-efs-file-system-property-builder
  "The cfn-space-efs-file-system-property-builder function buildes out new instances of 
CfnSpace$EFSFileSystemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |"
  [stack id config]
  (let [builder (CfnSpace$EFSFileSystemProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (.build builder)))


(defn cfn-space-jupyter-server-app-settings-property-builder
  "The cfn-space-jupyter-server-app-settings-property-builder function buildes out new instances of 
CfnSpace$JupyterServerAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnSpace$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnSpace$JupyterServerAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-space-kernel-gateway-app-settings-property-builder
  "The cfn-space-kernel-gateway-app-settings-property-builder function buildes out new instances of 
CfnSpace$KernelGatewayAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnSpace$KernelGatewayAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-space-ownership-settings-property-builder
  "The cfn-space-ownership-settings-property-builder function buildes out new instances of 
CfnSpace$OwnershipSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ownerUserProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-user-profile-name` |"
  [stack id config]
  (let [builder (CfnSpace$OwnershipSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :owner-user-profile-name)]
      (. builder ownerUserProfileName data))
    (.build builder)))


(defn cfn-space-props-builder
  "The cfn-space-props-builder function buildes out new instances of 
CfnSpaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `ownershipSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ownership-settings` |
| `spaceDisplayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-display-name` |
| `spaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:space-name` |
| `spaceSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceSettingsProperty | [[cdk.support/lookup-entry]] | `:space-settings` |
| `spaceSharingSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceSharingSettingsProperty | [[cdk.support/lookup-entry]] | `:space-sharing-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSpaceProps$Builder.)]
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
    (.build builder)))


(defn cfn-space-resource-spec-property-builder
  "The cfn-space-resource-spec-property-builder function buildes out new instances of 
CfnSpace$ResourceSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |"
  [stack id config]
  (let [builder (CfnSpace$ResourceSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :sage-maker-image-arn)]
      (. builder sageMakerImageArn data))
    (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
      (. builder sageMakerImageVersionArn data))
    (.build builder)))


(defn cfn-space-space-code-editor-app-settings-property-builder
  "The cfn-space-space-code-editor-app-settings-property-builder function buildes out new instances of 
CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnSpace$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnSpace$SpaceCodeEditorAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-space-space-jupyter-lab-app-settings-property-builder
  "The cfn-space-space-jupyter-lab-app-settings-property-builder function buildes out new instances of 
CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | java.util.List | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnSpace$SpaceJupyterLabAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-repositories)]
      (. builder codeRepositories data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-space-space-settings-property-builder
  "The cfn-space-space-settings-property-builder function buildes out new instances of 
CfnSpace$SpaceSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appType` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-type` |
| `codeEditorAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-editor-app-settings` |
| `customFileSystems` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-file-systems` |
| `jupyterLabAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:jupyter-lab-app-settings` |
| `jupyterServerAppSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$JupyterServerAppSettingsProperty | [[cdk.support/lookup-entry]] | `:jupyter-server-app-settings` |
| `kernelGatewayAppSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kernel-gateway-app-settings` |
| `spaceStorageSettings` | software.amazon.awscdk.services.sagemaker.CfnSpace$SpaceStorageSettingsProperty | [[cdk.support/lookup-entry]] | `:space-storage-settings` |"
  [stack id config]
  (let [builder (CfnSpace$SpaceSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-space-space-sharing-settings-property-builder
  "The cfn-space-space-sharing-settings-property-builder function buildes out new instances of 
CfnSpace$SpaceSharingSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sharingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sharing-type` |"
  [stack id config]
  (let [builder (CfnSpace$SpaceSharingSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sharing-type)]
      (. builder sharingType data))
    (.build builder)))


(defn cfn-space-space-storage-settings-property-builder
  "The cfn-space-space-storage-settings-property-builder function buildes out new instances of 
CfnSpace$SpaceStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-storage-settings` |"
  [stack id config]
  (let [builder (CfnSpace$SpaceStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-storage-settings)]
      (. builder ebsStorageSettings data))
    (.build builder)))


(defn cfn-user-profile-builder
  "The cfn-user-profile-builder function buildes out new instances of 
CfnUserProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `singleSignOnUserIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-identifier` |
| `singleSignOnUserValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-value` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |"
  [stack id config]
  (let [builder (CfnUserProfile$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-user-profile-code-editor-app-settings-property-builder
  "The cfn-user-profile-code-editor-app-settings-property-builder function buildes out new instances of 
CfnUserProfile$CodeEditorAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |"
  [stack id config]
  (let [builder (CfnUserProfile$CodeEditorAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (when-let [data (lookup-entry config id :lifecycle-config-arns)]
      (. builder lifecycleConfigArns data))
    (.build builder)))


(defn cfn-user-profile-code-repository-property-builder
  "The cfn-user-profile-code-repository-property-builder function buildes out new instances of 
CfnUserProfile$CodeRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |"
  [stack id config]
  (let [builder (CfnUserProfile$CodeRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (.build builder)))


(defn cfn-user-profile-custom-file-system-config-property-builder
  "The cfn-user-profile-custom-file-system-config-property-builder function buildes out new instances of 
CfnUserProfile$CustomFileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `efsFileSystemConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:efs-file-system-config` |"
  [stack id config]
  (let [builder (CfnUserProfile$CustomFileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :efs-file-system-config)]
      (. builder efsFileSystemConfig data))
    (.build builder)))


(defn cfn-user-profile-custom-image-property-builder
  "The cfn-user-profile-custom-image-property-builder function buildes out new instances of 
CfnUserProfile$CustomImageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appImageConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-image-config-name` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `imageVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:image-version-number` |"
  [stack id config]
  (let [builder (CfnUserProfile$CustomImageProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-image-config-name)]
      (. builder appImageConfigName data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :image-version-number)]
      (. builder imageVersionNumber data))
    (.build builder)))


(defn cfn-user-profile-custom-posix-user-config-property-builder
  "The cfn-user-profile-custom-posix-user-config-property-builder function buildes out new instances of 
CfnUserProfile$CustomPosixUserConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |"
  [stack id config]
  (let [builder (CfnUserProfile$CustomPosixUserConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (.build builder)))


(defn cfn-user-profile-default-ebs-storage-settings-property-builder
  "The cfn-user-profile-default-ebs-storage-settings-property-builder function buildes out new instances of 
CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ebs-volume-size-in-gb` |
| `maximumEbsVolumeSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ebs-volume-size-in-gb` |"
  [stack id config]
  (let [builder (CfnUserProfile$DefaultEbsStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-ebs-volume-size-in-gb)]
      (. builder defaultEbsVolumeSizeInGb data))
    (when-let [data (lookup-entry config id :maximum-ebs-volume-size-in-gb)]
      (. builder maximumEbsVolumeSizeInGb data))
    (.build builder)))


(defn cfn-user-profile-default-space-storage-settings-property-builder
  "The cfn-user-profile-default-space-storage-settings-property-builder function buildes out new instances of 
CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultEbsStorageSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-ebs-storage-settings` |"
  [stack id config]
  (let [builder (CfnUserProfile$DefaultSpaceStorageSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-ebs-storage-settings)]
      (. builder defaultEbsStorageSettings data))
    (.build builder)))


(defn cfn-user-profile-efs-file-system-config-property-builder
  "The cfn-user-profile-efs-file-system-config-property-builder function buildes out new instances of 
CfnUserProfile$EFSFileSystemConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `fileSystemPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-path` |"
  [stack id config]
  (let [builder (CfnUserProfile$EFSFileSystemConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :file-system-path)]
      (. builder fileSystemPath data))
    (.build builder)))


(defn cfn-user-profile-jupyter-lab-app-settings-property-builder
  "The cfn-user-profile-jupyter-lab-app-settings-property-builder function buildes out new instances of 
CfnUserProfile$JupyterLabAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeRepositories` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-repositories` |
| `customImages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |
| `lifecycleConfigArns` | java.util.List | [[cdk.support/lookup-entry]] | `:lifecycle-config-arns` |"
  [stack id config]
  (let [builder (CfnUserProfile$JupyterLabAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-repositories)]
      (. builder codeRepositories data))
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (when-let [data (lookup-entry config id :lifecycle-config-arns)]
      (. builder lifecycleConfigArns data))
    (.build builder)))


(defn cfn-user-profile-jupyter-server-app-settings-property-builder
  "The cfn-user-profile-jupyter-server-app-settings-property-builder function buildes out new instances of 
CfnUserProfile$JupyterServerAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultResourceSpec` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$ResourceSpecProperty | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnUserProfile$JupyterServerAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-user-profile-kernel-gateway-app-settings-property-builder
  "The cfn-user-profile-kernel-gateway-app-settings-property-builder function buildes out new instances of 
CfnUserProfile$KernelGatewayAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customImages` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-images` |
| `defaultResourceSpec` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-resource-spec` |"
  [stack id config]
  (let [builder (CfnUserProfile$KernelGatewayAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-images)]
      (. builder customImages data))
    (when-let [data (lookup-entry config id :default-resource-spec)]
      (. builder defaultResourceSpec data))
    (.build builder)))


(defn cfn-user-profile-props-builder
  "The cfn-user-profile-props-builder function buildes out new instances of 
CfnUserProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-id` |
| `singleSignOnUserIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-identifier` |
| `singleSignOnUserValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:single-sign-on-user-value` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-profile-name` |
| `userSettings` | software.amazon.awscdk.services.sagemaker.CfnUserProfile$UserSettingsProperty | [[cdk.support/lookup-entry]] | `:user-settings` |"
  [stack id config]
  (let [builder (CfnUserProfileProps$Builder.)]
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
    (.build builder)))


(defn cfn-user-profile-r-studio-server-pro-app-settings-property-builder
  "The cfn-user-profile-r-studio-server-pro-app-settings-property-builder function buildes out new instances of 
CfnUserProfile$RStudioServerProAppSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-status` |
| `userGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-group` |"
  [stack id config]
  (let [builder (CfnUserProfile$RStudioServerProAppSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-status)]
      (. builder accessStatus data))
    (when-let [data (lookup-entry config id :user-group)]
      (. builder userGroup data))
    (.build builder)))


(defn cfn-user-profile-resource-spec-property-builder
  "The cfn-user-profile-resource-spec-property-builder function buildes out new instances of 
CfnUserProfile$ResourceSpecProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `sageMakerImageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-arn` |
| `sageMakerImageVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-image-version-arn` |"
  [stack id config]
  (let [builder (CfnUserProfile$ResourceSpecProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :sage-maker-image-arn)]
      (. builder sageMakerImageArn data))
    (when-let [data (lookup-entry config id :sage-maker-image-version-arn)]
      (. builder sageMakerImageVersionArn data))
    (.build builder)))


(defn cfn-user-profile-sharing-settings-property-builder
  "The cfn-user-profile-sharing-settings-property-builder function buildes out new instances of 
CfnUserProfile$SharingSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notebookOutputOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:notebook-output-option` |
| `s3KmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-kms-key-id` |
| `s3OutputPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-output-path` |"
  [stack id config]
  (let [builder (CfnUserProfile$SharingSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :notebook-output-option)]
      (. builder notebookOutputOption data))
    (when-let [data (lookup-entry config id :s3-kms-key-id)]
      (. builder s3KmsKeyId data))
    (when-let [data (lookup-entry config id :s3-output-path)]
      (. builder s3OutputPath data))
    (.build builder)))


(defn cfn-user-profile-user-settings-property-builder
  "The cfn-user-profile-user-settings-property-builder function buildes out new instances of 
CfnUserProfile$UserSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `studioWebPortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-web-portal` |"
  [stack id config]
  (let [builder (CfnUserProfile$UserSettingsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-workteam-builder
  "The cfn-workteam-builder function buildes out new instances of 
CfnWorkteam$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-definitions` |
| `notificationConfiguration` | software.amazon.awscdk.services.sagemaker.CfnWorkteam$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workforceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workforce-name` |
| `workteamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workteam-name` |"
  [stack id config]
  (let [builder (CfnWorkteam$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-workteam-cognito-member-definition-property-builder
  "The cfn-workteam-cognito-member-definition-property-builder function buildes out new instances of 
CfnWorkteam$CognitoMemberDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoClientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-client-id` |
| `cognitoUserGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-user-group` |
| `cognitoUserPool` | java.lang.String | [[cdk.support/lookup-entry]] | `:cognito-user-pool` |"
  [stack id config]
  (let [builder (CfnWorkteam$CognitoMemberDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cognito-client-id)]
      (. builder cognitoClientId data))
    (when-let [data (lookup-entry config id :cognito-user-group)]
      (. builder cognitoUserGroup data))
    (when-let [data (lookup-entry config id :cognito-user-pool)]
      (. builder cognitoUserPool data))
    (.build builder)))


(defn cfn-workteam-member-definition-property-builder
  "The cfn-workteam-member-definition-property-builder function buildes out new instances of 
CfnWorkteam$MemberDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoMemberDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-member-definition` |
| `oidcMemberDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc-member-definition` |"
  [stack id config]
  (let [builder (CfnWorkteam$MemberDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cognito-member-definition)]
      (. builder cognitoMemberDefinition data))
    (when-let [data (lookup-entry config id :oidc-member-definition)]
      (. builder oidcMemberDefinition data))
    (.build builder)))


(defn cfn-workteam-notification-configuration-property-builder
  "The cfn-workteam-notification-configuration-property-builder function buildes out new instances of 
CfnWorkteam$NotificationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-topic-arn` |"
  [stack id config]
  (let [builder (CfnWorkteam$NotificationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :notification-topic-arn)]
      (. builder notificationTopicArn data))
    (.build builder)))


(defn cfn-workteam-oidc-member-definition-property-builder
  "The cfn-workteam-oidc-member-definition-property-builder function buildes out new instances of 
CfnWorkteam$OidcMemberDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oidcGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:oidc-groups` |"
  [stack id config]
  (let [builder (CfnWorkteam$OidcMemberDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :oidc-groups)]
      (. builder oidcGroups data))
    (.build builder)))


(defn cfn-workteam-props-builder
  "The cfn-workteam-props-builder function buildes out new instances of 
CfnWorkteamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `memberDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-definitions` |
| `notificationConfiguration` | software.amazon.awscdk.services.sagemaker.CfnWorkteam$NotificationConfigurationProperty | [[cdk.support/lookup-entry]] | `:notification-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workforceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workforce-name` |
| `workteamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workteam-name` |"
  [stack id config]
  (let [builder (CfnWorkteamProps$Builder.)]
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
    (.build builder)))