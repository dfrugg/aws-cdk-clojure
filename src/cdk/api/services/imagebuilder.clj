(ns cdk.api.services.imagebuilder
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.imagebuilder package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.imagebuilder CfnComponent$Builder
                                                         CfnComponentProps$Builder
                                                         CfnContainerRecipe$Builder
                                                         CfnContainerRecipe$ComponentConfigurationProperty$Builder
                                                         CfnContainerRecipe$ComponentParameterProperty$Builder
                                                         CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder
                                                         CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder
                                                         CfnContainerRecipe$InstanceConfigurationProperty$Builder
                                                         CfnContainerRecipe$TargetContainerRepositoryProperty$Builder
                                                         CfnContainerRecipeProps$Builder
                                                         CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$Builder
                                                         CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$DistributionProperty$Builder
                                                         CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder
                                                         CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder
                                                         CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder
                                                         CfnDistributionConfigurationProps$Builder
                                                         CfnImage$Builder
                                                         CfnImage$EcrConfigurationProperty$Builder
                                                         CfnImage$ImageScanningConfigurationProperty$Builder
                                                         CfnImage$ImageTestsConfigurationProperty$Builder
                                                         CfnImage$WorkflowConfigurationProperty$Builder
                                                         CfnImage$WorkflowParameterProperty$Builder
                                                         CfnImagePipeline$Builder
                                                         CfnImagePipeline$EcrConfigurationProperty$Builder
                                                         CfnImagePipeline$ImageScanningConfigurationProperty$Builder
                                                         CfnImagePipeline$ImageTestsConfigurationProperty$Builder
                                                         CfnImagePipeline$ScheduleProperty$Builder
                                                         CfnImagePipeline$WorkflowConfigurationProperty$Builder
                                                         CfnImagePipeline$WorkflowParameterProperty$Builder
                                                         CfnImagePipelineProps$Builder
                                                         CfnImageProps$Builder
                                                         CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder
                                                         CfnImageRecipe$Builder
                                                         CfnImageRecipe$ComponentConfigurationProperty$Builder
                                                         CfnImageRecipe$ComponentParameterProperty$Builder
                                                         CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder
                                                         CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder
                                                         CfnImageRecipe$SystemsManagerAgentProperty$Builder
                                                         CfnImageRecipeProps$Builder
                                                         CfnInfrastructureConfiguration$Builder
                                                         CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder
                                                         CfnInfrastructureConfiguration$LoggingProperty$Builder
                                                         CfnInfrastructureConfiguration$S3LogsProperty$Builder
                                                         CfnInfrastructureConfigurationProps$Builder
                                                         CfnLifecyclePolicy$ActionProperty$Builder
                                                         CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder
                                                         CfnLifecyclePolicy$Builder
                                                         CfnLifecyclePolicy$ExclusionRulesProperty$Builder
                                                         CfnLifecyclePolicy$FilterProperty$Builder
                                                         CfnLifecyclePolicy$IncludeResourcesProperty$Builder
                                                         CfnLifecyclePolicy$LastLaunchedProperty$Builder
                                                         CfnLifecyclePolicy$PolicyDetailProperty$Builder
                                                         CfnLifecyclePolicy$RecipeSelectionProperty$Builder
                                                         CfnLifecyclePolicy$ResourceSelectionProperty$Builder
                                                         CfnLifecyclePolicyProps$Builder
                                                         CfnWorkflow$Builder
                                                         CfnWorkflowProps$Builder]))


(defn cfn-component-builder
  "The cfn-component-builder function buildes out new instances of 
CfnComponent$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-description` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `supportedOsVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-os-versions` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnComponent$Builder/create stack id)]
    (when-let [data (lookup-entry config id :change-description)]
      (. builder changeDescription data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :supported-os-versions)]
      (. builder supportedOsVersions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-component-props-builder
  "The cfn-component-props-builder function buildes out new instances of 
CfnComponentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-description` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `supportedOsVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:supported-os-versions` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnComponentProps$Builder.)]
    (when-let [data (lookup-entry config id :change-description)]
      (. builder changeDescription data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :supported-os-versions)]
      (. builder supportedOsVersions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-container-recipe-builder
  "The cfn-container-recipe-builder function buildes out new instances of 
CfnContainerRecipe$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | java.util.List | [[cdk.support/lookup-entry]] | `:components` |
| `containerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dockerfileTemplateData` | java.lang.String | [[cdk.support/lookup-entry]] | `:dockerfile-template-data` |
| `dockerfileTemplateUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:dockerfile-template-uri` |
| `imageOsVersionOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-os-version-override` |
| `instanceConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe$InstanceConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-configuration` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-image` |
| `platformOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-override` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRepository` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-repository` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$Builder/create stack id)]
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :container-type)]
      (. builder containerType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dockerfile-template-data)]
      (. builder dockerfileTemplateData data))
    (when-let [data (lookup-entry config id :dockerfile-template-uri)]
      (. builder dockerfileTemplateUri data))
    (when-let [data (lookup-entry config id :image-os-version-override)]
      (. builder imageOsVersionOverride data))
    (when-let [data (lookup-entry config id :instance-configuration)]
      (. builder instanceConfiguration data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-image)]
      (. builder parentImage data))
    (when-let [data (lookup-entry config id :platform-override)]
      (. builder platformOverride data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-repository)]
      (. builder targetRepository data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-container-recipe-component-configuration-property-builder
  "The cfn-container-recipe-component-configuration-property-builder function buildes out new instances of 
CfnContainerRecipe$ComponentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$ComponentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-arn)]
      (. builder componentArn data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-container-recipe-component-parameter-property-builder
  "The cfn-container-recipe-component-parameter-property-builder function buildes out new instances of 
CfnContainerRecipe$ComponentParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$ComponentParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-container-recipe-ebs-instance-block-device-specification-property-builder
  "The cfn-container-recipe-ebs-instance-block-device-specification-property-builder function buildes out new instances of 
CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-container-recipe-instance-block-device-mapping-property-builder
  "The cfn-container-recipe-instance-block-device-mapping-property-builder function buildes out new instances of 
CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-container-recipe-instance-configuration-property-builder
  "The cfn-container-recipe-instance-configuration-property-builder function buildes out new instances of 
CfnContainerRecipe$InstanceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$InstanceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (.build builder)))


(defn cfn-container-recipe-props-builder
  "The cfn-container-recipe-props-builder function buildes out new instances of 
CfnContainerRecipeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | java.util.List | [[cdk.support/lookup-entry]] | `:components` |
| `containerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dockerfileTemplateData` | java.lang.String | [[cdk.support/lookup-entry]] | `:dockerfile-template-data` |
| `dockerfileTemplateUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:dockerfile-template-uri` |
| `imageOsVersionOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-os-version-override` |
| `instanceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-configuration` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-image` |
| `platformOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform-override` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRepository` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-repository` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnContainerRecipeProps$Builder.)]
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :container-type)]
      (. builder containerType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dockerfile-template-data)]
      (. builder dockerfileTemplateData data))
    (when-let [data (lookup-entry config id :dockerfile-template-uri)]
      (. builder dockerfileTemplateUri data))
    (when-let [data (lookup-entry config id :image-os-version-override)]
      (. builder imageOsVersionOverride data))
    (when-let [data (lookup-entry config id :instance-configuration)]
      (. builder instanceConfiguration data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-image)]
      (. builder parentImage data))
    (when-let [data (lookup-entry config id :platform-override)]
      (. builder platformOverride data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-repository)]
      (. builder targetRepository data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-container-recipe-target-container-repository-property-builder
  "The cfn-container-recipe-target-container-repository-property-builder function buildes out new instances of 
CfnContainerRecipe$TargetContainerRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (CfnContainerRecipe$TargetContainerRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn cfn-distribution-configuration-ami-distribution-configuration-property-builder
  "The cfn-distribution-configuration-ami-distribution-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:ami-tags` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `launchPermissionConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$LaunchPermissionConfigurationProperty | [[cdk.support/lookup-entry]] | `:launch-permission-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetAccountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-account-ids` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ami-tags)]
      (. builder amiTags data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :launch-permission-configuration)]
      (. builder launchPermissionConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :target-account-ids)]
      (. builder targetAccountIds data))
    (.build builder)))


(defn cfn-distribution-configuration-builder
  "The cfn-distribution-configuration-builder function buildes out new instances of 
CfnDistributionConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributions` | java.util.List | [[cdk.support/lookup-entry]] | `:distributions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :distributions)]
      (. builder distributions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-configuration-container-distribution-configuration-property-builder
  "The cfn-distribution-configuration-container-distribution-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targetRepository` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$TargetContainerRepositoryProperty | [[cdk.support/lookup-entry]] | `:target-repository` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-tags)]
      (. builder containerTags data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target-repository)]
      (. builder targetRepository data))
    (.build builder)))


(defn cfn-distribution-configuration-distribution-property-builder
  "The cfn-distribution-configuration-distribution-property-builder function buildes out new instances of 
CfnDistributionConfiguration$DistributionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiDistributionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:ami-distribution-configuration` |
| `containerDistributionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:container-distribution-configuration` |
| `fastLaunchConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fast-launch-configurations` |
| `launchTemplateConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-configurations` |
| `licenseConfigurationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:license-configuration-arns` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$DistributionProperty$Builder.)]
    (when-let [data (lookup-entry config id :ami-distribution-configuration)]
      (. builder amiDistributionConfiguration data))
    (when-let [data (lookup-entry config id :container-distribution-configuration)]
      (. builder containerDistributionConfiguration data))
    (when-let [data (lookup-entry config id :fast-launch-configurations)]
      (. builder fastLaunchConfigurations data))
    (when-let [data (lookup-entry config id :launch-template-configurations)]
      (. builder launchTemplateConfigurations data))
    (when-let [data (lookup-entry config id :license-configuration-arns)]
      (. builder licenseConfigurationArns data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-distribution-configuration-fast-launch-configuration-property-builder
  "The cfn-distribution-configuration-fast-launch-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxParallelLaunches` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallel-launches` |
| `snapshotConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty | [[cdk.support/lookup-entry]] | `:snapshot-configuration` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :max-parallel-launches)]
      (. builder maxParallelLaunches data))
    (when-let [data (lookup-entry config id :snapshot-configuration)]
      (. builder snapshotConfiguration data))
    (.build builder)))


(defn cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder
  "The cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder function buildes out new instances of 
CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `launchTemplateVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-version` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :launch-template-version)]
      (. builder launchTemplateVersion data))
    (.build builder)))


(defn cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder
  "The cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetResourceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-resource-count` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-resource-count)]
      (. builder targetResourceCount data))
    (.build builder)))


(defn cfn-distribution-configuration-launch-permission-configuration-property-builder
  "The cfn-distribution-configuration-launch-permission-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-arns` |
| `organizationalUnitArns` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-arns` |
| `userGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:user-groups` |
| `userIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-ids` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :organization-arns)]
      (. builder organizationArns data))
    (when-let [data (lookup-entry config id :organizational-unit-arns)]
      (. builder organizationalUnitArns data))
    (when-let [data (lookup-entry config id :user-groups)]
      (. builder userGroups data))
    (when-let [data (lookup-entry config id :user-ids)]
      (. builder userIds data))
    (.build builder)))


(defn cfn-distribution-configuration-launch-template-configuration-property-builder
  "The cfn-distribution-configuration-launch-template-configuration-property-builder function buildes out new instances of 
CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `setDefaultVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-default-version` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :set-default-version)]
      (. builder setDefaultVersion data))
    (.build builder)))


(defn cfn-distribution-configuration-props-builder
  "The cfn-distribution-configuration-props-builder function buildes out new instances of 
CfnDistributionConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributions` | java.util.List | [[cdk.support/lookup-entry]] | `:distributions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistributionConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :distributions)]
      (. builder distributions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-configuration-target-container-repository-property-builder
  "The cfn-distribution-configuration-target-container-repository-property-builder function buildes out new instances of 
CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn cfn-image-builder
  "The cfn-image-builder function buildes out new instances of 
CfnImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-recipe-arn` |
| `distributionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-configuration-arn` |
| `enhancedImageMetadataEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-image-metadata-enabled` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `imageRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-recipe-arn` |
| `imageScanningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTestsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-tests-configuration` |
| `infrastructureConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-configuration-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |"
  [stack id config]
  (let [builder (CfnImage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-recipe-arn)]
      (. builder containerRecipeArn data))
    (when-let [data (lookup-entry config id :distribution-configuration-arn)]
      (. builder distributionConfigurationArn data))
    (when-let [data (lookup-entry config id :enhanced-image-metadata-enabled)]
      (. builder enhancedImageMetadataEnabled data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :image-recipe-arn)]
      (. builder imageRecipeArn data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tests-configuration)]
      (. builder imageTestsConfiguration data))
    (when-let [data (lookup-entry config id :infrastructure-configuration-arn)]
      (. builder infrastructureConfigurationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflows)]
      (. builder workflows data))
    (.build builder)))


(defn cfn-image-ecr-configuration-property-builder
  "The cfn-image-ecr-configuration-property-builder function buildes out new instances of 
CfnImage$EcrConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (CfnImage$EcrConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-tags)]
      (. builder containerTags data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn cfn-image-image-scanning-configuration-property-builder
  "The cfn-image-image-scanning-configuration-property-builder function buildes out new instances of 
CfnImage$ImageScanningConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImage$EcrConfigurationProperty | [[cdk.support/lookup-entry]] | `:ecr-configuration` |
| `imageScanningEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-enabled` |"
  [stack id config]
  (let [builder (CfnImage$ImageScanningConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ecr-configuration)]
      (. builder ecrConfiguration data))
    (when-let [data (lookup-entry config id :image-scanning-enabled)]
      (. builder imageScanningEnabled data))
    (.build builder)))


(defn cfn-image-image-tests-configuration-property-builder
  "The cfn-image-image-tests-configuration-property-builder function buildes out new instances of 
CfnImage$ImageTestsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTestsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-tests-enabled` |
| `timeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-minutes` |"
  [stack id config]
  (let [builder (CfnImage$ImageTestsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-tests-enabled)]
      (. builder imageTestsEnabled data))
    (when-let [data (lookup-entry config id :timeout-minutes)]
      (. builder timeoutMinutes data))
    (.build builder)))


(defn cfn-image-pipeline-builder
  "The cfn-image-pipeline-builder function buildes out new instances of 
CfnImagePipeline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-recipe-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-configuration-arn` |
| `enhancedImageMetadataEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enhanced-image-metadata-enabled` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `imageRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-recipe-arn` |
| `imageScanningConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ImageScanningConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTestsConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ImageTestsConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-tests-configuration` |
| `infrastructureConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-configuration-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |"
  [stack id config]
  (let [builder (CfnImagePipeline$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-recipe-arn)]
      (. builder containerRecipeArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :distribution-configuration-arn)]
      (. builder distributionConfigurationArn data))
    (when-let [data (lookup-entry config id :enhanced-image-metadata-enabled)]
      (. builder enhancedImageMetadataEnabled data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :image-recipe-arn)]
      (. builder imageRecipeArn data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tests-configuration)]
      (. builder imageTestsConfiguration data))
    (when-let [data (lookup-entry config id :infrastructure-configuration-arn)]
      (. builder infrastructureConfigurationArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflows)]
      (. builder workflows data))
    (.build builder)))


(defn cfn-image-pipeline-ecr-configuration-property-builder
  "The cfn-image-pipeline-ecr-configuration-property-builder function buildes out new instances of 
CfnImagePipeline$EcrConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (CfnImagePipeline$EcrConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-tags)]
      (. builder containerTags data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn cfn-image-pipeline-image-scanning-configuration-property-builder
  "The cfn-image-pipeline-image-scanning-configuration-property-builder function buildes out new instances of 
CfnImagePipeline$ImageScanningConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$EcrConfigurationProperty | [[cdk.support/lookup-entry]] | `:ecr-configuration` |
| `imageScanningEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-enabled` |"
  [stack id config]
  (let [builder (CfnImagePipeline$ImageScanningConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ecr-configuration)]
      (. builder ecrConfiguration data))
    (when-let [data (lookup-entry config id :image-scanning-enabled)]
      (. builder imageScanningEnabled data))
    (.build builder)))


(defn cfn-image-pipeline-image-tests-configuration-property-builder
  "The cfn-image-pipeline-image-tests-configuration-property-builder function buildes out new instances of 
CfnImagePipeline$ImageTestsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTestsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-tests-enabled` |
| `timeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-minutes` |"
  [stack id config]
  (let [builder (CfnImagePipeline$ImageTestsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-tests-enabled)]
      (. builder imageTestsEnabled data))
    (when-let [data (lookup-entry config id :timeout-minutes)]
      (. builder timeoutMinutes data))
    (.build builder)))


(defn cfn-image-pipeline-props-builder
  "The cfn-image-pipeline-props-builder function buildes out new instances of 
CfnImagePipelineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-recipe-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-configuration-arn` |
| `enhancedImageMetadataEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enhanced-image-metadata-enabled` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `imageRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-recipe-arn` |
| `imageScanningConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ImageScanningConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTestsConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ImageTestsConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-tests-configuration` |
| `infrastructureConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-configuration-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |"
  [stack id config]
  (let [builder (CfnImagePipelineProps$Builder.)]
    (when-let [data (lookup-entry config id :container-recipe-arn)]
      (. builder containerRecipeArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :distribution-configuration-arn)]
      (. builder distributionConfigurationArn data))
    (when-let [data (lookup-entry config id :enhanced-image-metadata-enabled)]
      (. builder enhancedImageMetadataEnabled data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :image-recipe-arn)]
      (. builder imageRecipeArn data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tests-configuration)]
      (. builder imageTestsConfiguration data))
    (when-let [data (lookup-entry config id :infrastructure-configuration-arn)]
      (. builder infrastructureConfigurationArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflows)]
      (. builder workflows data))
    (.build builder)))


(defn cfn-image-pipeline-schedule-property-builder
  "The cfn-image-pipeline-schedule-property-builder function buildes out new instances of 
CfnImagePipeline$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineExecutionStartCondition` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-execution-start-condition` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnImagePipeline$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :pipeline-execution-start-condition)]
      (. builder pipelineExecutionStartCondition data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-image-pipeline-workflow-configuration-property-builder
  "The cfn-image-pipeline-workflow-configuration-property-builder function buildes out new instances of 
CfnImagePipeline$WorkflowConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:parallel-group` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `workflowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-arn` |"
  [stack id config]
  (let [builder (CfnImagePipeline$WorkflowConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :parallel-group)]
      (. builder parallelGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :workflow-arn)]
      (. builder workflowArn data))
    (.build builder)))


(defn cfn-image-pipeline-workflow-parameter-property-builder
  "The cfn-image-pipeline-workflow-parameter-property-builder function buildes out new instances of 
CfnImagePipeline$WorkflowParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnImagePipeline$WorkflowParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-image-props-builder
  "The cfn-image-props-builder function buildes out new instances of 
CfnImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-recipe-arn` |
| `distributionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-configuration-arn` |
| `enhancedImageMetadataEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-image-metadata-enabled` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `imageRecipeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-recipe-arn` |
| `imageScanningConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-configuration` |
| `imageTestsConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImage$ImageTestsConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-tests-configuration` |
| `infrastructureConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:infrastructure-configuration-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workflows` | java.util.List | [[cdk.support/lookup-entry]] | `:workflows` |"
  [stack id config]
  (let [builder (CfnImageProps$Builder.)]
    (when-let [data (lookup-entry config id :container-recipe-arn)]
      (. builder containerRecipeArn data))
    (when-let [data (lookup-entry config id :distribution-configuration-arn)]
      (. builder distributionConfigurationArn data))
    (when-let [data (lookup-entry config id :enhanced-image-metadata-enabled)]
      (. builder enhancedImageMetadataEnabled data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :image-recipe-arn)]
      (. builder imageRecipeArn data))
    (when-let [data (lookup-entry config id :image-scanning-configuration)]
      (. builder imageScanningConfiguration data))
    (when-let [data (lookup-entry config id :image-tests-configuration)]
      (. builder imageTestsConfiguration data))
    (when-let [data (lookup-entry config id :infrastructure-configuration-arn)]
      (. builder infrastructureConfigurationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflows)]
      (. builder workflows data))
    (.build builder)))


(defn cfn-image-recipe-additional-instance-configuration-property-builder
  "The cfn-image-recipe-additional-instance-configuration-property-builder function buildes out new instances of 
CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `systemsManagerAgent` | software.amazon.awscdk.services.imagebuilder.CfnImageRecipe$SystemsManagerAgentProperty | [[cdk.support/lookup-entry]] | `:systems-manager-agent` |
| `userDataOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data-override` |"
  [stack id config]
  (let [builder (CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :systems-manager-agent)]
      (. builder systemsManagerAgent data))
    (when-let [data (lookup-entry config id :user-data-override)]
      (. builder userDataOverride data))
    (.build builder)))


(defn cfn-image-recipe-builder
  "The cfn-image-recipe-builder function buildes out new instances of 
CfnImageRecipe$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInstanceConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImageRecipe$AdditionalInstanceConfigurationProperty | [[cdk.support/lookup-entry]] | `:additional-instance-configuration` |
| `blockDeviceMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-image` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnImageRecipe$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-instance-configuration)]
      (. builder additionalInstanceConfiguration data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-image)]
      (. builder parentImage data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-image-recipe-component-configuration-property-builder
  "The cfn-image-recipe-component-configuration-property-builder function buildes out new instances of 
CfnImageRecipe$ComponentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnImageRecipe$ComponentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-arn)]
      (. builder componentArn data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-image-recipe-component-parameter-property-builder
  "The cfn-image-recipe-component-parameter-property-builder function buildes out new instances of 
CfnImageRecipe$ComponentParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnImageRecipe$ComponentParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-image-recipe-ebs-instance-block-device-specification-property-builder
  "The cfn-image-recipe-ebs-instance-block-device-specification-property-builder function buildes out new instances of 
CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-image-recipe-instance-block-device-mapping-property-builder
  "The cfn-image-recipe-instance-block-device-mapping-property-builder function buildes out new instances of 
CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-image-recipe-props-builder
  "The cfn-image-recipe-props-builder function buildes out new instances of 
CfnImageRecipeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInstanceConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImageRecipe$AdditionalInstanceConfigurationProperty | [[cdk.support/lookup-entry]] | `:additional-instance-configuration` |
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentImage` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-image` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnImageRecipeProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-instance-configuration)]
      (. builder additionalInstanceConfiguration data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-image)]
      (. builder parentImage data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-image-recipe-systems-manager-agent-property-builder
  "The cfn-image-recipe-systems-manager-agent-property-builder function buildes out new instances of 
CfnImageRecipe$SystemsManagerAgentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `uninstallAfterBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:uninstall-after-build` |"
  [stack id config]
  (let [builder (CfnImageRecipe$SystemsManagerAgentProperty$Builder.)]
    (when-let [data (lookup-entry config id :uninstall-after-build)]
      (. builder uninstallAfterBuild data))
    (.build builder)))


(defn cfn-image-workflow-configuration-property-builder
  "The cfn-image-workflow-configuration-property-builder function buildes out new instances of 
CfnImage$WorkflowConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:parallel-group` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `workflowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-arn` |"
  [stack id config]
  (let [builder (CfnImage$WorkflowConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :parallel-group)]
      (. builder parallelGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :workflow-arn)]
      (. builder workflowArn data))
    (.build builder)))


(defn cfn-image-workflow-parameter-property-builder
  "The cfn-image-workflow-parameter-property-builder function buildes out new instances of 
CfnImage$WorkflowParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnImage$WorkflowParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-infrastructure-configuration-builder
  "The cfn-infrastructure-configuration-builder function buildes out new instances of 
CfnInfrastructureConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceMetadataOptions` | software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty | [[cdk.support/lookup-entry]] | `:instance-metadata-options` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `keyPair` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair` |
| `logging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `terminateInstanceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instance-on-failure` |"
  [stack id config]
  (let [builder (CfnInfrastructureConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-metadata-options)]
      (. builder instanceMetadataOptions data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :terminate-instance-on-failure)]
      (. builder terminateInstanceOnFailure data))
    (.build builder)))


(defn cfn-infrastructure-configuration-instance-metadata-options-property-builder
  "The cfn-infrastructure-configuration-instance-metadata-options-property-builder function buildes out new instances of 
CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-tokens` |"
  [stack id config]
  (let [builder (CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-put-response-hop-limit)]
      (. builder httpPutResponseHopLimit data))
    (when-let [data (lookup-entry config id :http-tokens)]
      (. builder httpTokens data))
    (.build builder)))


(defn cfn-infrastructure-configuration-logging-property-builder
  "The cfn-infrastructure-configuration-logging-property-builder function buildes out new instances of 
CfnInfrastructureConfiguration$LoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Logs` | software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration$S3LogsProperty | [[cdk.support/lookup-entry]] | `:s3-logs` |"
  [stack id config]
  (let [builder (CfnInfrastructureConfiguration$LoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-logs)]
      (. builder s3Logs data))
    (.build builder)))


(defn cfn-infrastructure-configuration-props-builder
  "The cfn-infrastructure-configuration-props-builder function buildes out new instances of 
CfnInfrastructureConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceMetadataOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-metadata-options` |
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `instanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-types` |
| `keyPair` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair` |
| `logging` | software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration$LoggingProperty | [[cdk.support/lookup-entry]] | `:logging` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `terminateInstanceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instance-on-failure` |"
  [stack id config]
  (let [builder (CfnInfrastructureConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-metadata-options)]
      (. builder instanceMetadataOptions data))
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :instance-types)]
      (. builder instanceTypes data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :terminate-instance-on-failure)]
      (. builder terminateInstanceOnFailure data))
    (.build builder)))


(defn cfn-infrastructure-configuration-s3-logs-property-builder
  "The cfn-infrastructure-configuration-s3-logs-property-builder function buildes out new instances of 
CfnInfrastructureConfiguration$S3LogsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (CfnInfrastructureConfiguration$S3LogsProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn cfn-lifecycle-policy-action-property-builder
  "The cfn-lifecycle-policy-action-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeResources` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$IncludeResourcesProperty | [[cdk.support/lookup-entry]] | `:include-resources` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :include-resources)]
      (. builder includeResources data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-lifecycle-policy-ami-exclusion-rules-property-builder
  "The cfn-lifecycle-policy-ami-exclusion-rules-property-builder function buildes out new instances of 
CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPublic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-public` |
| `lastLaunched` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-launched` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `sharedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:shared-accounts` |
| `tagMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-map` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-public)]
      (. builder isPublic data))
    (when-let [data (lookup-entry config id :last-launched)]
      (. builder lastLaunched data))
    (when-let [data (lookup-entry config id :regions)]
      (. builder regions data))
    (when-let [data (lookup-entry config id :shared-accounts)]
      (. builder sharedAccounts data))
    (when-let [data (lookup-entry config id :tag-map)]
      (. builder tagMap data))
    (.build builder)))


(defn cfn-lifecycle-policy-builder
  "The cfn-lifecycle-policy-builder function buildes out new instances of 
CfnLifecyclePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-details` |
| `resourceSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-selection` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy-details)]
      (. builder policyDetails data))
    (when-let [data (lookup-entry config id :resource-selection)]
      (. builder resourceSelection data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-lifecycle-policy-exclusion-rules-property-builder
  "The cfn-lifecycle-policy-exclusion-rules-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ExclusionRulesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amis` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$AmiExclusionRulesProperty | [[cdk.support/lookup-entry]] | `:amis` |
| `tagMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:tag-map` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ExclusionRulesProperty$Builder.)]
    (when-let [data (lookup-entry config id :amis)]
      (. builder amis data))
    (when-let [data (lookup-entry config id :tag-map)]
      (. builder tagMap data))
    (.build builder)))


(defn cfn-lifecycle-policy-filter-property-builder
  "The cfn-lifecycle-policy-filter-property-builder function buildes out new instances of 
CfnLifecyclePolicy$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retainAtLeast` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retain-at-least` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :retain-at-least)]
      (. builder retainAtLeast data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-lifecycle-policy-include-resources-property-builder
  "The cfn-lifecycle-policy-include-resources-property-builder function buildes out new instances of 
CfnLifecyclePolicy$IncludeResourcesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amis` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amis` |
| `containers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:containers` |
| `snapshots` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshots` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$IncludeResourcesProperty$Builder.)]
    (when-let [data (lookup-entry config id :amis)]
      (. builder amis data))
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :snapshots)]
      (. builder snapshots data))
    (.build builder)))


(defn cfn-lifecycle-policy-last-launched-property-builder
  "The cfn-lifecycle-policy-last-launched-property-builder function buildes out new instances of 
CfnLifecyclePolicy$LastLaunchedProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$LastLaunchedProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-lifecycle-policy-policy-detail-property-builder
  "The cfn-lifecycle-policy-policy-detail-property-builder function buildes out new instances of 
CfnLifecyclePolicy$PolicyDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `exclusionRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclusion-rules` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$PolicyDetailProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :exclusion-rules)]
      (. builder exclusionRules data))
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (.build builder)))


(defn cfn-lifecycle-policy-props-builder
  "The cfn-lifecycle-policy-props-builder function buildes out new instances of 
CfnLifecyclePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-details` |
| `resourceSelection` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$ResourceSelectionProperty | [[cdk.support/lookup-entry]] | `:resource-selection` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy-details)]
      (. builder policyDetails data))
    (when-let [data (lookup-entry config id :resource-selection)]
      (. builder resourceSelection data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-lifecycle-policy-recipe-selection-property-builder
  "The cfn-lifecycle-policy-recipe-selection-property-builder function buildes out new instances of 
CfnLifecyclePolicy$RecipeSelectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `semanticVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:semantic-version` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$RecipeSelectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :semantic-version)]
      (. builder semanticVersion data))
    (.build builder)))


(defn cfn-lifecycle-policy-resource-selection-property-builder
  "The cfn-lifecycle-policy-resource-selection-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ResourceSelectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recipes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipes` |
| `tagMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-map` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ResourceSelectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :recipes)]
      (. builder recipes data))
    (when-let [data (lookup-entry config id :tag-map)]
      (. builder tagMap data))
    (.build builder)))


(defn cfn-workflow-builder
  "The cfn-workflow-builder function buildes out new instances of 
CfnWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-description` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :change-description)]
      (. builder changeDescription data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-workflow-props-builder
  "The cfn-workflow-props-builder function buildes out new instances of 
CfnWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-description` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :change-description)]
      (. builder changeDescription data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))