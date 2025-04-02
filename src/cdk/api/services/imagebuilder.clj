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


(defn cfn-component-builder>
  "The cfn-component-builder> function updates a CfnComponent$Builder instance using the provided configuration.
  The function takes the CfnComponent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnComponent$Builder builder id config]
  (when-some [data (lookup-entry config id :change-description)]
    (. builder changeDescription data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :supported-os-versions)]
    (. builder supportedOsVersions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-component-builder
  "Creates a  `CfnComponent$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-component-builder> (CfnComponent$Builder/create scope (name id)) id config))


(defn cfn-component-props-builder>
  "The cfn-component-props-builder> function updates a CfnComponentProps$Builder instance using the provided configuration.
  The function takes the CfnComponentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnComponentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :change-description)]
    (. builder changeDescription data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :supported-os-versions)]
    (. builder supportedOsVersions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-component-props-builder
  "Creates a  `CfnComponentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-component-props-builder> (new CfnComponentProps$Builder) id config))


(defn cfn-container-recipe-builder>
  "The cfn-container-recipe-builder> function updates a CfnContainerRecipe$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnContainerRecipe$Builder builder id config]
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :container-type)]
    (. builder containerType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dockerfile-template-data)]
    (. builder dockerfileTemplateData data))
  (when-some [data (lookup-entry config id :dockerfile-template-uri)]
    (. builder dockerfileTemplateUri data))
  (when-some [data (lookup-entry config id :image-os-version-override)]
    (. builder imageOsVersionOverride data))
  (when-some [data (lookup-entry config id :instance-configuration)]
    (. builder instanceConfiguration data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-image)]
    (. builder parentImage data))
  (when-some [data (lookup-entry config id :platform-override)]
    (. builder platformOverride data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-repository)]
    (. builder targetRepository data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-container-recipe-builder
  "Creates a  `CfnContainerRecipe$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-container-recipe-builder> (CfnContainerRecipe$Builder/create scope (name id)) id config))


(defn cfn-container-recipe-component-configuration-property-builder>
  "The cfn-container-recipe-component-configuration-property-builder> function updates a CfnContainerRecipe$ComponentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$ComponentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnContainerRecipe$ComponentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-arn)]
    (. builder componentArn data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-container-recipe-component-configuration-property-builder
  "Creates a  `CfnContainerRecipe$ComponentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-component-configuration-property-builder> (new CfnContainerRecipe$ComponentConfigurationProperty$Builder) id config))


(defn cfn-container-recipe-component-parameter-property-builder>
  "The cfn-container-recipe-component-parameter-property-builder> function updates a CfnContainerRecipe$ComponentParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$ComponentParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnContainerRecipe$ComponentParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-container-recipe-component-parameter-property-builder
  "Creates a  `CfnContainerRecipe$ComponentParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-component-parameter-property-builder> (new CfnContainerRecipe$ComponentParameterProperty$Builder) id config))


(defn cfn-container-recipe-ebs-instance-block-device-specification-property-builder>
  "The cfn-container-recipe-ebs-instance-block-device-specification-property-builder> function updates a CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-on-termination)]
    (. builder deleteOnTermination data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :snapshot-id)]
    (. builder snapshotId data))
  (when-some [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (when-some [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-container-recipe-ebs-instance-block-device-specification-property-builder
  "Creates a  `CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-ebs-instance-block-device-specification-property-builder> (new CfnContainerRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder) id config))


(defn cfn-container-recipe-instance-block-device-mapping-property-builder>
  "The cfn-container-recipe-instance-block-device-mapping-property-builder> function updates a CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |
"
  [^CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-some [data (lookup-entry config id :ebs)]
    (. builder ebs data))
  (when-some [data (lookup-entry config id :no-device)]
    (. builder noDevice data))
  (when-some [data (lookup-entry config id :virtual-name)]
    (. builder virtualName data))
  (.build builder))


(defn cfn-container-recipe-instance-block-device-mapping-property-builder
  "Creates a  `CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-instance-block-device-mapping-property-builder> (new CfnContainerRecipe$InstanceBlockDeviceMappingProperty$Builder) id config))


(defn cfn-container-recipe-instance-configuration-property-builder>
  "The cfn-container-recipe-instance-configuration-property-builder> function updates a CfnContainerRecipe$InstanceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$InstanceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
"
  [^CfnContainerRecipe$InstanceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :block-device-mappings)]
    (. builder blockDeviceMappings data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (.build builder))


(defn cfn-container-recipe-instance-configuration-property-builder
  "Creates a  `CfnContainerRecipe$InstanceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-instance-configuration-property-builder> (new CfnContainerRecipe$InstanceConfigurationProperty$Builder) id config))


(defn cfn-container-recipe-props-builder>
  "The cfn-container-recipe-props-builder> function updates a CfnContainerRecipeProps$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnContainerRecipeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :container-type)]
    (. builder containerType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dockerfile-template-data)]
    (. builder dockerfileTemplateData data))
  (when-some [data (lookup-entry config id :dockerfile-template-uri)]
    (. builder dockerfileTemplateUri data))
  (when-some [data (lookup-entry config id :image-os-version-override)]
    (. builder imageOsVersionOverride data))
  (when-some [data (lookup-entry config id :instance-configuration)]
    (. builder instanceConfiguration data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-image)]
    (. builder parentImage data))
  (when-some [data (lookup-entry config id :platform-override)]
    (. builder platformOverride data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-repository)]
    (. builder targetRepository data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-container-recipe-props-builder
  "Creates a  `CfnContainerRecipeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-props-builder> (new CfnContainerRecipeProps$Builder) id config))


(defn cfn-container-recipe-target-container-repository-property-builder>
  "The cfn-container-recipe-target-container-repository-property-builder> function updates a CfnContainerRecipe$TargetContainerRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerRecipe$TargetContainerRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^CfnContainerRecipe$TargetContainerRepositoryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn cfn-container-recipe-target-container-repository-property-builder
  "Creates a  `CfnContainerRecipe$TargetContainerRepositoryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-recipe-target-container-repository-property-builder> (new CfnContainerRecipe$TargetContainerRepositoryProperty$Builder) id config))


(defn cfn-distribution-configuration-ami-distribution-configuration-property-builder>
  "The cfn-distribution-configuration-ami-distribution-configuration-property-builder> function updates a CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:ami-tags` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `launchPermissionConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$LaunchPermissionConfigurationProperty | [[cdk.support/lookup-entry]] | `:launch-permission-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `targetAccountIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-account-ids` |
"
  [^CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ami-tags)]
    (. builder amiTags data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :launch-permission-configuration)]
    (. builder launchPermissionConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :target-account-ids)]
    (. builder targetAccountIds data))
  (.build builder))


(defn cfn-distribution-configuration-ami-distribution-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-ami-distribution-configuration-property-builder> (new CfnDistributionConfiguration$AmiDistributionConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-builder>
  "The cfn-distribution-configuration-builder> function updates a CfnDistributionConfiguration$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributions` | java.util.List | [[cdk.support/lookup-entry]] | `:distributions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistributionConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :distributions)]
    (. builder distributions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-configuration-builder
  "Creates a  `CfnDistributionConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-distribution-configuration-builder> (CfnDistributionConfiguration$Builder/create scope (name id)) id config))


(defn cfn-distribution-configuration-container-distribution-configuration-property-builder>
  "The cfn-distribution-configuration-container-distribution-configuration-property-builder> function updates a CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targetRepository` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$TargetContainerRepositoryProperty | [[cdk.support/lookup-entry]] | `:target-repository` |
"
  [^CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-tags)]
    (. builder containerTags data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :target-repository)]
    (. builder targetRepository data))
  (.build builder))


(defn cfn-distribution-configuration-container-distribution-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-container-distribution-configuration-property-builder> (new CfnDistributionConfiguration$ContainerDistributionConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-distribution-property-builder>
  "The cfn-distribution-configuration-distribution-property-builder> function updates a CfnDistributionConfiguration$DistributionProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$DistributionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amiDistributionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:ami-distribution-configuration` |
| `containerDistributionConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:container-distribution-configuration` |
| `fastLaunchConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fast-launch-configurations` |
| `launchTemplateConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-configurations` |
| `licenseConfigurationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:license-configuration-arns` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnDistributionConfiguration$DistributionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ami-distribution-configuration)]
    (. builder amiDistributionConfiguration data))
  (when-some [data (lookup-entry config id :container-distribution-configuration)]
    (. builder containerDistributionConfiguration data))
  (when-some [data (lookup-entry config id :fast-launch-configurations)]
    (. builder fastLaunchConfigurations data))
  (when-some [data (lookup-entry config id :launch-template-configurations)]
    (. builder launchTemplateConfigurations data))
  (when-some [data (lookup-entry config id :license-configuration-arns)]
    (. builder licenseConfigurationArns data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-distribution-configuration-distribution-property-builder
  "Creates a  `CfnDistributionConfiguration$DistributionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-distribution-property-builder> (new CfnDistributionConfiguration$DistributionProperty$Builder) id config))


(defn cfn-distribution-configuration-fast-launch-configuration-property-builder>
  "The cfn-distribution-configuration-fast-launch-configuration-property-builder> function updates a CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxParallelLaunches` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-parallel-launches` |
| `snapshotConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty | [[cdk.support/lookup-entry]] | `:snapshot-configuration` |
"
  [^CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :max-parallel-launches)]
    (. builder maxParallelLaunches data))
  (when-some [data (lookup-entry config id :snapshot-configuration)]
    (. builder snapshotConfiguration data))
  (.build builder))


(defn cfn-distribution-configuration-fast-launch-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-fast-launch-configuration-property-builder> (new CfnDistributionConfiguration$FastLaunchConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder>
  "The cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder> function updates a CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `launchTemplateVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-version` |
"
  [^CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :launch-template-id)]
    (. builder launchTemplateId data))
  (when-some [data (lookup-entry config id :launch-template-name)]
    (. builder launchTemplateName data))
  (when-some [data (lookup-entry config id :launch-template-version)]
    (. builder launchTemplateVersion data))
  (.build builder))


(defn cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder
  "Creates a  `CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-fast-launch-launch-template-specification-property-builder> (new CfnDistributionConfiguration$FastLaunchLaunchTemplateSpecificationProperty$Builder) id config))


(defn cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder>
  "The cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder> function updates a CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetResourceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-resource-count` |
"
  [^CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-resource-count)]
    (. builder targetResourceCount data))
  (.build builder))


(defn cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-fast-launch-snapshot-configuration-property-builder> (new CfnDistributionConfiguration$FastLaunchSnapshotConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-launch-permission-configuration-property-builder>
  "The cfn-distribution-configuration-launch-permission-configuration-property-builder> function updates a CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-arns` |
| `organizationalUnitArns` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-arns` |
| `userGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:user-groups` |
| `userIds` | java.util.List | [[cdk.support/lookup-entry]] | `:user-ids` |
"
  [^CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :organization-arns)]
    (. builder organizationArns data))
  (when-some [data (lookup-entry config id :organizational-unit-arns)]
    (. builder organizationalUnitArns data))
  (when-some [data (lookup-entry config id :user-groups)]
    (. builder userGroups data))
  (when-some [data (lookup-entry config id :user-ids)]
    (. builder userIds data))
  (.build builder))


(defn cfn-distribution-configuration-launch-permission-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-launch-permission-configuration-property-builder> (new CfnDistributionConfiguration$LaunchPermissionConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-launch-template-configuration-property-builder>
  "The cfn-distribution-configuration-launch-template-configuration-property-builder> function updates a CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `setDefaultVersion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:set-default-version` |
"
  [^CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :launch-template-id)]
    (. builder launchTemplateId data))
  (when-some [data (lookup-entry config id :set-default-version)]
    (. builder setDefaultVersion data))
  (.build builder))


(defn cfn-distribution-configuration-launch-template-configuration-property-builder
  "Creates a  `CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-launch-template-configuration-property-builder> (new CfnDistributionConfiguration$LaunchTemplateConfigurationProperty$Builder) id config))


(defn cfn-distribution-configuration-props-builder>
  "The cfn-distribution-configuration-props-builder> function updates a CfnDistributionConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributions` | java.util.List | [[cdk.support/lookup-entry]] | `:distributions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistributionConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :distributions)]
    (. builder distributions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-configuration-props-builder
  "Creates a  `CfnDistributionConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-props-builder> (new CfnDistributionConfigurationProps$Builder) id config))


(defn cfn-distribution-configuration-target-container-repository-property-builder>
  "The cfn-distribution-configuration-target-container-repository-property-builder> function updates a CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn cfn-distribution-configuration-target-container-repository-property-builder
  "Creates a  `CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-configuration-target-container-repository-property-builder> (new CfnDistributionConfiguration$TargetContainerRepositoryProperty$Builder) id config))


(defn cfn-image-builder>
  "The cfn-image-builder> function updates a CfnImage$Builder instance using the provided configuration.
  The function takes the CfnImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |
"
  [^CfnImage$Builder builder id config]
  (when-some [data (lookup-entry config id :container-recipe-arn)]
    (. builder containerRecipeArn data))
  (when-some [data (lookup-entry config id :distribution-configuration-arn)]
    (. builder distributionConfigurationArn data))
  (when-some [data (lookup-entry config id :enhanced-image-metadata-enabled)]
    (. builder enhancedImageMetadataEnabled data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :image-recipe-arn)]
    (. builder imageRecipeArn data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tests-configuration)]
    (. builder imageTestsConfiguration data))
  (when-some [data (lookup-entry config id :infrastructure-configuration-arn)]
    (. builder infrastructureConfigurationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflows)]
    (. builder workflows data))
  (.build builder))


(defn cfn-image-builder
  "Creates a  `CfnImage$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-image-builder> (CfnImage$Builder/create scope (name id)) id config))


(defn cfn-image-ecr-configuration-property-builder>
  "The cfn-image-ecr-configuration-property-builder> function updates a CfnImage$EcrConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImage$EcrConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^CfnImage$EcrConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-tags)]
    (. builder containerTags data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn cfn-image-ecr-configuration-property-builder
  "Creates a  `CfnImage$EcrConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-ecr-configuration-property-builder> (new CfnImage$EcrConfigurationProperty$Builder) id config))


(defn cfn-image-image-scanning-configuration-property-builder>
  "The cfn-image-image-scanning-configuration-property-builder> function updates a CfnImage$ImageScanningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImage$ImageScanningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImage$EcrConfigurationProperty | [[cdk.support/lookup-entry]] | `:ecr-configuration` |
| `imageScanningEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-enabled` |
"
  [^CfnImage$ImageScanningConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ecr-configuration)]
    (. builder ecrConfiguration data))
  (when-some [data (lookup-entry config id :image-scanning-enabled)]
    (. builder imageScanningEnabled data))
  (.build builder))


(defn cfn-image-image-scanning-configuration-property-builder
  "Creates a  `CfnImage$ImageScanningConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-image-scanning-configuration-property-builder> (new CfnImage$ImageScanningConfigurationProperty$Builder) id config))


(defn cfn-image-image-tests-configuration-property-builder>
  "The cfn-image-image-tests-configuration-property-builder> function updates a CfnImage$ImageTestsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImage$ImageTestsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTestsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-tests-enabled` |
| `timeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-minutes` |
"
  [^CfnImage$ImageTestsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-tests-enabled)]
    (. builder imageTestsEnabled data))
  (when-some [data (lookup-entry config id :timeout-minutes)]
    (. builder timeoutMinutes data))
  (.build builder))


(defn cfn-image-image-tests-configuration-property-builder
  "Creates a  `CfnImage$ImageTestsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-image-tests-configuration-property-builder> (new CfnImage$ImageTestsConfigurationProperty$Builder) id config))


(defn cfn-image-pipeline-builder>
  "The cfn-image-pipeline-builder> function updates a CfnImagePipeline$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |
"
  [^CfnImagePipeline$Builder builder id config]
  (when-some [data (lookup-entry config id :container-recipe-arn)]
    (. builder containerRecipeArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :distribution-configuration-arn)]
    (. builder distributionConfigurationArn data))
  (when-some [data (lookup-entry config id :enhanced-image-metadata-enabled)]
    (. builder enhancedImageMetadataEnabled data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :image-recipe-arn)]
    (. builder imageRecipeArn data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tests-configuration)]
    (. builder imageTestsConfiguration data))
  (when-some [data (lookup-entry config id :infrastructure-configuration-arn)]
    (. builder infrastructureConfigurationArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflows)]
    (. builder workflows data))
  (.build builder))


(defn cfn-image-pipeline-builder
  "Creates a  `CfnImagePipeline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-image-pipeline-builder> (CfnImagePipeline$Builder/create scope (name id)) id config))


(defn cfn-image-pipeline-ecr-configuration-property-builder>
  "The cfn-image-pipeline-ecr-configuration-property-builder> function updates a CfnImagePipeline$EcrConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$EcrConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:container-tags` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^CfnImagePipeline$EcrConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-tags)]
    (. builder containerTags data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn cfn-image-pipeline-ecr-configuration-property-builder
  "Creates a  `CfnImagePipeline$EcrConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-ecr-configuration-property-builder> (new CfnImagePipeline$EcrConfigurationProperty$Builder) id config))


(defn cfn-image-pipeline-image-scanning-configuration-property-builder>
  "The cfn-image-pipeline-image-scanning-configuration-property-builder> function updates a CfnImagePipeline$ImageScanningConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$ImageScanningConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrConfiguration` | software.amazon.awscdk.services.imagebuilder.CfnImagePipeline$EcrConfigurationProperty | [[cdk.support/lookup-entry]] | `:ecr-configuration` |
| `imageScanningEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-scanning-enabled` |
"
  [^CfnImagePipeline$ImageScanningConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ecr-configuration)]
    (. builder ecrConfiguration data))
  (when-some [data (lookup-entry config id :image-scanning-enabled)]
    (. builder imageScanningEnabled data))
  (.build builder))


(defn cfn-image-pipeline-image-scanning-configuration-property-builder
  "Creates a  `CfnImagePipeline$ImageScanningConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-image-scanning-configuration-property-builder> (new CfnImagePipeline$ImageScanningConfigurationProperty$Builder) id config))


(defn cfn-image-pipeline-image-tests-configuration-property-builder>
  "The cfn-image-pipeline-image-tests-configuration-property-builder> function updates a CfnImagePipeline$ImageTestsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$ImageTestsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageTestsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-tests-enabled` |
| `timeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-minutes` |
"
  [^CfnImagePipeline$ImageTestsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-tests-enabled)]
    (. builder imageTestsEnabled data))
  (when-some [data (lookup-entry config id :timeout-minutes)]
    (. builder timeoutMinutes data))
  (.build builder))


(defn cfn-image-pipeline-image-tests-configuration-property-builder
  "Creates a  `CfnImagePipeline$ImageTestsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-image-tests-configuration-property-builder> (new CfnImagePipeline$ImageTestsConfigurationProperty$Builder) id config))


(defn cfn-image-pipeline-props-builder>
  "The cfn-image-pipeline-props-builder> function updates a CfnImagePipelineProps$Builder instance using the provided configuration.
  The function takes the CfnImagePipelineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:workflows` |
"
  [^CfnImagePipelineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-recipe-arn)]
    (. builder containerRecipeArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :distribution-configuration-arn)]
    (. builder distributionConfigurationArn data))
  (when-some [data (lookup-entry config id :enhanced-image-metadata-enabled)]
    (. builder enhancedImageMetadataEnabled data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :image-recipe-arn)]
    (. builder imageRecipeArn data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tests-configuration)]
    (. builder imageTestsConfiguration data))
  (when-some [data (lookup-entry config id :infrastructure-configuration-arn)]
    (. builder infrastructureConfigurationArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflows)]
    (. builder workflows data))
  (.build builder))


(defn cfn-image-pipeline-props-builder
  "Creates a  `CfnImagePipelineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-props-builder> (new CfnImagePipelineProps$Builder) id config))


(defn cfn-image-pipeline-schedule-property-builder>
  "The cfn-image-pipeline-schedule-property-builder> function updates a CfnImagePipeline$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pipelineExecutionStartCondition` | java.lang.String | [[cdk.support/lookup-entry]] | `:pipeline-execution-start-condition` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnImagePipeline$ScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pipeline-execution-start-condition)]
    (. builder pipelineExecutionStartCondition data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-image-pipeline-schedule-property-builder
  "Creates a  `CfnImagePipeline$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-schedule-property-builder> (new CfnImagePipeline$ScheduleProperty$Builder) id config))


(defn cfn-image-pipeline-workflow-configuration-property-builder>
  "The cfn-image-pipeline-workflow-configuration-property-builder> function updates a CfnImagePipeline$WorkflowConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$WorkflowConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:parallel-group` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `workflowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-arn` |
"
  [^CfnImagePipeline$WorkflowConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallel-group)]
    (. builder parallelGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :workflow-arn)]
    (. builder workflowArn data))
  (.build builder))


(defn cfn-image-pipeline-workflow-configuration-property-builder
  "Creates a  `CfnImagePipeline$WorkflowConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-workflow-configuration-property-builder> (new CfnImagePipeline$WorkflowConfigurationProperty$Builder) id config))


(defn cfn-image-pipeline-workflow-parameter-property-builder>
  "The cfn-image-pipeline-workflow-parameter-property-builder> function updates a CfnImagePipeline$WorkflowParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnImagePipeline$WorkflowParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnImagePipeline$WorkflowParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-image-pipeline-workflow-parameter-property-builder
  "Creates a  `CfnImagePipeline$WorkflowParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-pipeline-workflow-parameter-property-builder> (new CfnImagePipeline$WorkflowParameterProperty$Builder) id config))


(defn cfn-image-props-builder>
  "The cfn-image-props-builder> function updates a CfnImageProps$Builder instance using the provided configuration.
  The function takes the CfnImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workflows` | java.util.List | [[cdk.support/lookup-entry]] | `:workflows` |
"
  [^CfnImageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-recipe-arn)]
    (. builder containerRecipeArn data))
  (when-some [data (lookup-entry config id :distribution-configuration-arn)]
    (. builder distributionConfigurationArn data))
  (when-some [data (lookup-entry config id :enhanced-image-metadata-enabled)]
    (. builder enhancedImageMetadataEnabled data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :image-recipe-arn)]
    (. builder imageRecipeArn data))
  (when-some [data (lookup-entry config id :image-scanning-configuration)]
    (. builder imageScanningConfiguration data))
  (when-some [data (lookup-entry config id :image-tests-configuration)]
    (. builder imageTestsConfiguration data))
  (when-some [data (lookup-entry config id :infrastructure-configuration-arn)]
    (. builder infrastructureConfigurationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflows)]
    (. builder workflows data))
  (.build builder))


(defn cfn-image-props-builder
  "Creates a  `CfnImageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-props-builder> (new CfnImageProps$Builder) id config))


(defn cfn-image-recipe-additional-instance-configuration-property-builder>
  "The cfn-image-recipe-additional-instance-configuration-property-builder> function updates a CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `systemsManagerAgent` | software.amazon.awscdk.services.imagebuilder.CfnImageRecipe$SystemsManagerAgentProperty | [[cdk.support/lookup-entry]] | `:systems-manager-agent` |
| `userDataOverride` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data-override` |
"
  [^CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :systems-manager-agent)]
    (. builder systemsManagerAgent data))
  (when-some [data (lookup-entry config id :user-data-override)]
    (. builder userDataOverride data))
  (.build builder))


(defn cfn-image-recipe-additional-instance-configuration-property-builder
  "Creates a  `CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-additional-instance-configuration-property-builder> (new CfnImageRecipe$AdditionalInstanceConfigurationProperty$Builder) id config))


(defn cfn-image-recipe-builder>
  "The cfn-image-recipe-builder> function updates a CfnImageRecipe$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnImageRecipe$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-instance-configuration)]
    (. builder additionalInstanceConfiguration data))
  (when-some [data (lookup-entry config id :block-device-mappings)]
    (. builder blockDeviceMappings data))
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-image)]
    (. builder parentImage data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-image-recipe-builder
  "Creates a  `CfnImageRecipe$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-image-recipe-builder> (CfnImageRecipe$Builder/create scope (name id)) id config))


(defn cfn-image-recipe-component-configuration-property-builder>
  "The cfn-image-recipe-component-configuration-property-builder> function updates a CfnImageRecipe$ComponentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$ComponentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnImageRecipe$ComponentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-arn)]
    (. builder componentArn data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-image-recipe-component-configuration-property-builder
  "Creates a  `CfnImageRecipe$ComponentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-component-configuration-property-builder> (new CfnImageRecipe$ComponentConfigurationProperty$Builder) id config))


(defn cfn-image-recipe-component-parameter-property-builder>
  "The cfn-image-recipe-component-parameter-property-builder> function updates a CfnImageRecipe$ComponentParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$ComponentParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnImageRecipe$ComponentParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-image-recipe-component-parameter-property-builder
  "Creates a  `CfnImageRecipe$ComponentParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-component-parameter-property-builder> (new CfnImageRecipe$ComponentParameterProperty$Builder) id config))


(defn cfn-image-recipe-ebs-instance-block-device-specification-property-builder>
  "The cfn-image-recipe-ebs-instance-block-device-specification-property-builder> function updates a CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-on-termination)]
    (. builder deleteOnTermination data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :snapshot-id)]
    (. builder snapshotId data))
  (when-some [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (when-some [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-image-recipe-ebs-instance-block-device-specification-property-builder
  "Creates a  `CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-ebs-instance-block-device-specification-property-builder> (new CfnImageRecipe$EbsInstanceBlockDeviceSpecificationProperty$Builder) id config))


(defn cfn-image-recipe-instance-block-device-mapping-property-builder>
  "The cfn-image-recipe-instance-block-device-mapping-property-builder> function updates a CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |
"
  [^CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-some [data (lookup-entry config id :ebs)]
    (. builder ebs data))
  (when-some [data (lookup-entry config id :no-device)]
    (. builder noDevice data))
  (when-some [data (lookup-entry config id :virtual-name)]
    (. builder virtualName data))
  (.build builder))


(defn cfn-image-recipe-instance-block-device-mapping-property-builder
  "Creates a  `CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-instance-block-device-mapping-property-builder> (new CfnImageRecipe$InstanceBlockDeviceMappingProperty$Builder) id config))


(defn cfn-image-recipe-props-builder>
  "The cfn-image-recipe-props-builder> function updates a CfnImageRecipeProps$Builder instance using the provided configuration.
  The function takes the CfnImageRecipeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnImageRecipeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-instance-configuration)]
    (. builder additionalInstanceConfiguration data))
  (when-some [data (lookup-entry config id :block-device-mappings)]
    (. builder blockDeviceMappings data))
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-image)]
    (. builder parentImage data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-image-recipe-props-builder
  "Creates a  `CfnImageRecipeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-props-builder> (new CfnImageRecipeProps$Builder) id config))


(defn cfn-image-recipe-systems-manager-agent-property-builder>
  "The cfn-image-recipe-systems-manager-agent-property-builder> function updates a CfnImageRecipe$SystemsManagerAgentProperty$Builder instance using the provided configuration.
  The function takes the CfnImageRecipe$SystemsManagerAgentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `uninstallAfterBuild` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:uninstall-after-build` |
"
  [^CfnImageRecipe$SystemsManagerAgentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :uninstall-after-build)]
    (. builder uninstallAfterBuild data))
  (.build builder))


(defn cfn-image-recipe-systems-manager-agent-property-builder
  "Creates a  `CfnImageRecipe$SystemsManagerAgentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-recipe-systems-manager-agent-property-builder> (new CfnImageRecipe$SystemsManagerAgentProperty$Builder) id config))


(defn cfn-image-workflow-configuration-property-builder>
  "The cfn-image-workflow-configuration-property-builder> function updates a CfnImage$WorkflowConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnImage$WorkflowConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `onFailure` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-failure` |
| `parallelGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:parallel-group` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `workflowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-arn` |
"
  [^CfnImage$WorkflowConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :on-failure)]
    (. builder onFailure data))
  (when-some [data (lookup-entry config id :parallel-group)]
    (. builder parallelGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :workflow-arn)]
    (. builder workflowArn data))
  (.build builder))


(defn cfn-image-workflow-configuration-property-builder
  "Creates a  `CfnImage$WorkflowConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-workflow-configuration-property-builder> (new CfnImage$WorkflowConfigurationProperty$Builder) id config))


(defn cfn-image-workflow-parameter-property-builder>
  "The cfn-image-workflow-parameter-property-builder> function updates a CfnImage$WorkflowParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnImage$WorkflowParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnImage$WorkflowParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-image-workflow-parameter-property-builder
  "Creates a  `CfnImage$WorkflowParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-image-workflow-parameter-property-builder> (new CfnImage$WorkflowParameterProperty$Builder) id config))


(defn cfn-infrastructure-configuration-builder>
  "The cfn-infrastructure-configuration-builder> function updates a CfnInfrastructureConfiguration$Builder instance using the provided configuration.
  The function takes the CfnInfrastructureConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminateInstanceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instance-on-failure` |
"
  [^CfnInfrastructureConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-metadata-options)]
    (. builder instanceMetadataOptions data))
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :terminate-instance-on-failure)]
    (. builder terminateInstanceOnFailure data))
  (.build builder))


(defn cfn-infrastructure-configuration-builder
  "Creates a  `CfnInfrastructureConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-infrastructure-configuration-builder> (CfnInfrastructureConfiguration$Builder/create scope (name id)) id config))


(defn cfn-infrastructure-configuration-instance-metadata-options-property-builder>
  "The cfn-infrastructure-configuration-instance-metadata-options-property-builder> function updates a CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-tokens` |
"
  [^CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :http-put-response-hop-limit)]
    (. builder httpPutResponseHopLimit data))
  (when-some [data (lookup-entry config id :http-tokens)]
    (. builder httpTokens data))
  (.build builder))


(defn cfn-infrastructure-configuration-instance-metadata-options-property-builder
  "Creates a  `CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-infrastructure-configuration-instance-metadata-options-property-builder> (new CfnInfrastructureConfiguration$InstanceMetadataOptionsProperty$Builder) id config))


(defn cfn-infrastructure-configuration-logging-property-builder>
  "The cfn-infrastructure-configuration-logging-property-builder> function updates a CfnInfrastructureConfiguration$LoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnInfrastructureConfiguration$LoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Logs` | software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration$S3LogsProperty | [[cdk.support/lookup-entry]] | `:s3-logs` |
"
  [^CfnInfrastructureConfiguration$LoggingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-logs)]
    (. builder s3Logs data))
  (.build builder))


(defn cfn-infrastructure-configuration-logging-property-builder
  "Creates a  `CfnInfrastructureConfiguration$LoggingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-infrastructure-configuration-logging-property-builder> (new CfnInfrastructureConfiguration$LoggingProperty$Builder) id config))


(defn cfn-infrastructure-configuration-props-builder>
  "The cfn-infrastructure-configuration-props-builder> function updates a CfnInfrastructureConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnInfrastructureConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `terminateInstanceOnFailure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instance-on-failure` |
"
  [^CfnInfrastructureConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-metadata-options)]
    (. builder instanceMetadataOptions data))
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :instance-types)]
    (. builder instanceTypes data))
  (when-some [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :terminate-instance-on-failure)]
    (. builder terminateInstanceOnFailure data))
  (.build builder))


(defn cfn-infrastructure-configuration-props-builder
  "Creates a  `CfnInfrastructureConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-infrastructure-configuration-props-builder> (new CfnInfrastructureConfigurationProps$Builder) id config))


(defn cfn-infrastructure-configuration-s3-logs-property-builder>
  "The cfn-infrastructure-configuration-s3-logs-property-builder> function updates a CfnInfrastructureConfiguration$S3LogsProperty$Builder instance using the provided configuration.
  The function takes the CfnInfrastructureConfiguration$S3LogsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
"
  [^CfnInfrastructureConfiguration$S3LogsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (when-some [data (lookup-entry config id :s3-key-prefix)]
    (. builder s3KeyPrefix data))
  (.build builder))


(defn cfn-infrastructure-configuration-s3-logs-property-builder
  "Creates a  `CfnInfrastructureConfiguration$S3LogsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-infrastructure-configuration-s3-logs-property-builder> (new CfnInfrastructureConfiguration$S3LogsProperty$Builder) id config))


(defn cfn-lifecycle-policy-action-property-builder>
  "The cfn-lifecycle-policy-action-property-builder> function updates a CfnLifecyclePolicy$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includeResources` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$IncludeResourcesProperty | [[cdk.support/lookup-entry]] | `:include-resources` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLifecyclePolicy$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :include-resources)]
    (. builder includeResources data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-lifecycle-policy-action-property-builder
  "Creates a  `CfnLifecyclePolicy$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-action-property-builder> (new CfnLifecyclePolicy$ActionProperty$Builder) id config))


(defn cfn-lifecycle-policy-ami-exclusion-rules-property-builder>
  "The cfn-lifecycle-policy-ami-exclusion-rules-property-builder> function updates a CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPublic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-public` |
| `lastLaunched` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:last-launched` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `sharedAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:shared-accounts` |
| `tagMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-map` |
"
  [^CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-public)]
    (. builder isPublic data))
  (when-some [data (lookup-entry config id :last-launched)]
    (. builder lastLaunched data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-some [data (lookup-entry config id :shared-accounts)]
    (. builder sharedAccounts data))
  (when-some [data (lookup-entry config id :tag-map)]
    (. builder tagMap data))
  (.build builder))


(defn cfn-lifecycle-policy-ami-exclusion-rules-property-builder
  "Creates a  `CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-ami-exclusion-rules-property-builder> (new CfnLifecyclePolicy$AmiExclusionRulesProperty$Builder) id config))


(defn cfn-lifecycle-policy-builder>
  "The cfn-lifecycle-policy-builder> function updates a CfnLifecyclePolicy$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-details` |
| `resourceSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-selection` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLifecyclePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy-details)]
    (. builder policyDetails data))
  (when-some [data (lookup-entry config id :resource-selection)]
    (. builder resourceSelection data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-lifecycle-policy-builder
  "Creates a  `CfnLifecyclePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-lifecycle-policy-builder> (CfnLifecyclePolicy$Builder/create scope (name id)) id config))


(defn cfn-lifecycle-policy-exclusion-rules-property-builder>
  "The cfn-lifecycle-policy-exclusion-rules-property-builder> function updates a CfnLifecyclePolicy$ExclusionRulesProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ExclusionRulesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amis` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$AmiExclusionRulesProperty | [[cdk.support/lookup-entry]] | `:amis` |
| `tagMap` | java.util.Map | [[cdk.support/lookup-entry]] | `:tag-map` |
"
  [^CfnLifecyclePolicy$ExclusionRulesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amis)]
    (. builder amis data))
  (when-some [data (lookup-entry config id :tag-map)]
    (. builder tagMap data))
  (.build builder))


(defn cfn-lifecycle-policy-exclusion-rules-property-builder
  "Creates a  `CfnLifecyclePolicy$ExclusionRulesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-exclusion-rules-property-builder> (new CfnLifecyclePolicy$ExclusionRulesProperty$Builder) id config))


(defn cfn-lifecycle-policy-filter-property-builder>
  "The cfn-lifecycle-policy-filter-property-builder> function updates a CfnLifecyclePolicy$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retainAtLeast` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retain-at-least` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnLifecyclePolicy$FilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :retain-at-least)]
    (. builder retainAtLeast data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-lifecycle-policy-filter-property-builder
  "Creates a  `CfnLifecyclePolicy$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-filter-property-builder> (new CfnLifecyclePolicy$FilterProperty$Builder) id config))


(defn cfn-lifecycle-policy-include-resources-property-builder>
  "The cfn-lifecycle-policy-include-resources-property-builder> function updates a CfnLifecyclePolicy$IncludeResourcesProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$IncludeResourcesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amis` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amis` |
| `containers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:containers` |
| `snapshots` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshots` |
"
  [^CfnLifecyclePolicy$IncludeResourcesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amis)]
    (. builder amis data))
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :snapshots)]
    (. builder snapshots data))
  (.build builder))


(defn cfn-lifecycle-policy-include-resources-property-builder
  "Creates a  `CfnLifecyclePolicy$IncludeResourcesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-include-resources-property-builder> (new CfnLifecyclePolicy$IncludeResourcesProperty$Builder) id config))


(defn cfn-lifecycle-policy-last-launched-property-builder>
  "The cfn-lifecycle-policy-last-launched-property-builder> function updates a CfnLifecyclePolicy$LastLaunchedProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$LastLaunchedProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnLifecyclePolicy$LastLaunchedProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-lifecycle-policy-last-launched-property-builder
  "Creates a  `CfnLifecyclePolicy$LastLaunchedProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-last-launched-property-builder> (new CfnLifecyclePolicy$LastLaunchedProperty$Builder) id config))


(defn cfn-lifecycle-policy-policy-detail-property-builder>
  "The cfn-lifecycle-policy-policy-detail-property-builder> function updates a CfnLifecyclePolicy$PolicyDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$PolicyDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `exclusionRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclusion-rules` |
| `filter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter` |
"
  [^CfnLifecyclePolicy$PolicyDetailProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :exclusion-rules)]
    (. builder exclusionRules data))
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (.build builder))


(defn cfn-lifecycle-policy-policy-detail-property-builder
  "Creates a  `CfnLifecyclePolicy$PolicyDetailProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-policy-detail-property-builder> (new CfnLifecyclePolicy$PolicyDetailProperty$Builder) id config))


(defn cfn-lifecycle-policy-props-builder>
  "The cfn-lifecycle-policy-props-builder> function updates a CfnLifecyclePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-details` |
| `resourceSelection` | software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy$ResourceSelectionProperty | [[cdk.support/lookup-entry]] | `:resource-selection` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLifecyclePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy-details)]
    (. builder policyDetails data))
  (when-some [data (lookup-entry config id :resource-selection)]
    (. builder resourceSelection data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-lifecycle-policy-props-builder
  "Creates a  `CfnLifecyclePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-props-builder> (new CfnLifecyclePolicyProps$Builder) id config))


(defn cfn-lifecycle-policy-recipe-selection-property-builder>
  "The cfn-lifecycle-policy-recipe-selection-property-builder> function updates a CfnLifecyclePolicy$RecipeSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$RecipeSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `semanticVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:semantic-version` |
"
  [^CfnLifecyclePolicy$RecipeSelectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :semantic-version)]
    (. builder semanticVersion data))
  (.build builder))


(defn cfn-lifecycle-policy-recipe-selection-property-builder
  "Creates a  `CfnLifecyclePolicy$RecipeSelectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-recipe-selection-property-builder> (new CfnLifecyclePolicy$RecipeSelectionProperty$Builder) id config))


(defn cfn-lifecycle-policy-resource-selection-property-builder>
  "The cfn-lifecycle-policy-resource-selection-property-builder> function updates a CfnLifecyclePolicy$ResourceSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ResourceSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recipes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipes` |
| `tagMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-map` |
"
  [^CfnLifecyclePolicy$ResourceSelectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :recipes)]
    (. builder recipes data))
  (when-some [data (lookup-entry config id :tag-map)]
    (. builder tagMap data))
  (.build builder))


(defn cfn-lifecycle-policy-resource-selection-property-builder
  "Creates a  `CfnLifecyclePolicy$ResourceSelectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-resource-selection-property-builder> (new CfnLifecyclePolicy$ResourceSelectionProperty$Builder) id config))


(defn cfn-workflow-builder>
  "The cfn-workflow-builder> function updates a CfnWorkflow$Builder instance using the provided configuration.
  The function takes the CfnWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :change-description)]
    (. builder changeDescription data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-workflow-builder
  "Creates a  `CfnWorkflow$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workflow-builder> (CfnWorkflow$Builder/create scope (name id)) id config))


(defn cfn-workflow-props-builder>
  "The cfn-workflow-props-builder> function updates a CfnWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :change-description)]
    (. builder changeDescription data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-workflow-props-builder
  "Creates a  `CfnWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-workflow-props-builder> (new CfnWorkflowProps$Builder) id config))