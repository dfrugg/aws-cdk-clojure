(ns cdk.api.services.greengrassv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.greengrassv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.greengrassv2 CfnComponentVersion$Builder
                                                         CfnComponentVersion$ComponentDependencyRequirementProperty$Builder
                                                         CfnComponentVersion$ComponentPlatformProperty$Builder
                                                         CfnComponentVersion$LambdaContainerParamsProperty$Builder
                                                         CfnComponentVersion$LambdaDeviceMountProperty$Builder
                                                         CfnComponentVersion$LambdaEventSourceProperty$Builder
                                                         CfnComponentVersion$LambdaExecutionParametersProperty$Builder
                                                         CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder
                                                         CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder
                                                         CfnComponentVersion$LambdaVolumeMountProperty$Builder
                                                         CfnComponentVersionProps$Builder
                                                         CfnDeployment$Builder
                                                         CfnDeployment$ComponentConfigurationUpdateProperty$Builder
                                                         CfnDeployment$ComponentDeploymentSpecificationProperty$Builder
                                                         CfnDeployment$ComponentRunWithProperty$Builder
                                                         CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder
                                                         CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder
                                                         CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder
                                                         CfnDeployment$DeploymentPoliciesProperty$Builder
                                                         CfnDeployment$IoTJobAbortConfigProperty$Builder
                                                         CfnDeployment$IoTJobAbortCriteriaProperty$Builder
                                                         CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder
                                                         CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder
                                                         CfnDeployment$IoTJobTimeoutConfigProperty$Builder
                                                         CfnDeployment$SystemResourceLimitsProperty$Builder
                                                         CfnDeploymentProps$Builder]))


(defn cfn-component-version-builder>
  "The cfn-component-version-builder> function updates a CfnComponentVersion$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineRecipe` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-recipe` |
| `lambdaFunction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnComponentVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :inline-recipe)]
    (. builder inlineRecipe data))
  (when-some [data (lookup-entry config id :lambda-function)]
    (. builder lambdaFunction data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-component-version-builder
  "Creates a  `CfnComponentVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-component-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-component-version-builder> (CfnComponentVersion$Builder/create scope (name id)) id config))


(defn cfn-component-version-component-dependency-requirement-property-builder>
  "The cfn-component-version-component-dependency-requirement-property-builder> function updates a CfnComponentVersion$ComponentDependencyRequirementProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$ComponentDependencyRequirementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dependency-type` |
| `versionRequirement` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-requirement` |
"
  [^CfnComponentVersion$ComponentDependencyRequirementProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dependency-type)]
    (. builder dependencyType data))
  (when-some [data (lookup-entry config id :version-requirement)]
    (. builder versionRequirement data))
  (.build builder))


(defn cfn-component-version-component-dependency-requirement-property-builder
  "Creates a  `CfnComponentVersion$ComponentDependencyRequirementProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-component-dependency-requirement-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-component-dependency-requirement-property-builder> (new CfnComponentVersion$ComponentDependencyRequirementProperty$Builder) id config))


(defn cfn-component-version-component-platform-property-builder>
  "The cfn-component-version-component-platform-property-builder> function updates a CfnComponentVersion$ComponentPlatformProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$ComponentPlatformProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnComponentVersion$ComponentPlatformProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-component-version-component-platform-property-builder
  "Creates a  `CfnComponentVersion$ComponentPlatformProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-component-platform-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-component-platform-property-builder> (new CfnComponentVersion$ComponentPlatformProperty$Builder) id config))


(defn cfn-component-version-lambda-container-params-property-builder>
  "The cfn-component-version-lambda-container-params-property-builder> function updates a CfnComponentVersion$LambdaContainerParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaContainerParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `memorySizeInKb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size-in-kb` |
| `mountRoSysfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mount-ro-sysfs` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnComponentVersion$LambdaContainerParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :devices)]
    (. builder devices data))
  (when-some [data (lookup-entry config id :memory-size-in-kb)]
    (. builder memorySizeInKb data))
  (when-some [data (lookup-entry config id :mount-ro-sysfs)]
    (. builder mountRoSysfs data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-component-version-lambda-container-params-property-builder
  "Creates a  `CfnComponentVersion$LambdaContainerParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-container-params-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-container-params-property-builder> (new CfnComponentVersion$LambdaContainerParamsProperty$Builder) id config))


(defn cfn-component-version-lambda-device-mount-property-builder>
  "The cfn-component-version-lambda-device-mount-property-builder> function updates a CfnComponentVersion$LambdaDeviceMountProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaDeviceMountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGroupOwner` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-group-owner` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
"
  [^CfnComponentVersion$LambdaDeviceMountProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-group-owner)]
    (. builder addGroupOwner data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permission)]
    (. builder permission data))
  (.build builder))


(defn cfn-component-version-lambda-device-mount-property-builder
  "Creates a  `CfnComponentVersion$LambdaDeviceMountProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-device-mount-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-device-mount-property-builder> (new CfnComponentVersion$LambdaDeviceMountProperty$Builder) id config))


(defn cfn-component-version-lambda-event-source-property-builder>
  "The cfn-component-version-lambda-event-source-property-builder> function updates a CfnComponentVersion$LambdaEventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaEventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnComponentVersion$LambdaEventSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-component-version-lambda-event-source-property-builder
  "Creates a  `CfnComponentVersion$LambdaEventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-event-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-event-source-property-builder> (new CfnComponentVersion$LambdaEventSourceProperty$Builder) id config))


(defn cfn-component-version-lambda-execution-parameters-property-builder>
  "The cfn-component-version-lambda-execution-parameters-property-builder> function updates a CfnComponentVersion$LambdaExecutionParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaExecutionParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `eventSources` | java.util.List | [[cdk.support/lookup-entry]] | `:event-sources` |
| `execArgs` | java.util.List | [[cdk.support/lookup-entry]] | `:exec-args` |
| `inputPayloadEncodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-payload-encoding-type` |
| `linuxProcessParams` | software.amazon.awscdk.services.greengrassv2.CfnComponentVersion$LambdaLinuxProcessParamsProperty | [[cdk.support/lookup-entry]] | `:linux-process-params` |
| `maxIdleTimeInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-time-in-seconds` |
| `maxInstancesCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-instances-count` |
| `maxQueueSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-queue-size` |
| `pinned` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pinned` |
| `statusTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:status-timeout-in-seconds` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnComponentVersion$LambdaExecutionParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :environment-variables)]
    (. builder environmentVariables data))
  (when-some [data (lookup-entry config id :event-sources)]
    (. builder eventSources data))
  (when-some [data (lookup-entry config id :exec-args)]
    (. builder execArgs data))
  (when-some [data (lookup-entry config id :input-payload-encoding-type)]
    (. builder inputPayloadEncodingType data))
  (when-some [data (lookup-entry config id :linux-process-params)]
    (. builder linuxProcessParams data))
  (when-some [data (lookup-entry config id :max-idle-time-in-seconds)]
    (. builder maxIdleTimeInSeconds data))
  (when-some [data (lookup-entry config id :max-instances-count)]
    (. builder maxInstancesCount data))
  (when-some [data (lookup-entry config id :max-queue-size)]
    (. builder maxQueueSize data))
  (when-some [data (lookup-entry config id :pinned)]
    (. builder pinned data))
  (when-some [data (lookup-entry config id :status-timeout-in-seconds)]
    (. builder statusTimeoutInSeconds data))
  (when-some [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-component-version-lambda-execution-parameters-property-builder
  "Creates a  `CfnComponentVersion$LambdaExecutionParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-execution-parameters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-execution-parameters-property-builder> (new CfnComponentVersion$LambdaExecutionParametersProperty$Builder) id config))


(defn cfn-component-version-lambda-function-recipe-source-property-builder>
  "The cfn-component-version-lambda-function-recipe-source-property-builder> function updates a CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentDependencies` | java.util.Map | [[cdk.support/lookup-entry]] | `:component-dependencies` |
| `componentLambdaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:component-lambda-parameters` |
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentPlatforms` | java.util.List | [[cdk.support/lookup-entry]] | `:component-platforms` |
| `componentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
"
  [^CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-dependencies)]
    (. builder componentDependencies data))
  (when-some [data (lookup-entry config id :component-lambda-parameters)]
    (. builder componentLambdaParameters data))
  (when-some [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-some [data (lookup-entry config id :component-platforms)]
    (. builder componentPlatforms data))
  (when-some [data (lookup-entry config id :component-version)]
    (. builder componentVersion data))
  (when-some [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (.build builder))


(defn cfn-component-version-lambda-function-recipe-source-property-builder
  "Creates a  `CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-function-recipe-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-function-recipe-source-property-builder> (new CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder) id config))


(defn cfn-component-version-lambda-linux-process-params-property-builder>
  "The cfn-component-version-lambda-linux-process-params-property-builder> function updates a CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerParams` | software.amazon.awscdk.services.greengrassv2.CfnComponentVersion$LambdaContainerParamsProperty | [[cdk.support/lookup-entry]] | `:container-params` |
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |
"
  [^CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-params)]
    (. builder containerParams data))
  (when-some [data (lookup-entry config id :isolation-mode)]
    (. builder isolationMode data))
  (.build builder))


(defn cfn-component-version-lambda-linux-process-params-property-builder
  "Creates a  `CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-linux-process-params-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-linux-process-params-property-builder> (new CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder) id config))


(defn cfn-component-version-lambda-volume-mount-property-builder>
  "The cfn-component-version-lambda-volume-mount-property-builder> function updates a CfnComponentVersion$LambdaVolumeMountProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentVersion$LambdaVolumeMountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-group-owner` |
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnComponentVersion$LambdaVolumeMountProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-group-owner)]
    (. builder addGroupOwner data))
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :permission)]
    (. builder permission data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-component-version-lambda-volume-mount-property-builder
  "Creates a  `CfnComponentVersion$LambdaVolumeMountProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-lambda-volume-mount-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-lambda-volume-mount-property-builder> (new CfnComponentVersion$LambdaVolumeMountProperty$Builder) id config))


(defn cfn-component-version-props-builder>
  "The cfn-component-version-props-builder> function updates a CfnComponentVersionProps$Builder instance using the provided configuration.
  The function takes the CfnComponentVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineRecipe` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-recipe` |
| `lambdaFunction` | software.amazon.awscdk.services.greengrassv2.CfnComponentVersion$LambdaFunctionRecipeSourceProperty | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnComponentVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :inline-recipe)]
    (. builder inlineRecipe data))
  (when-some [data (lookup-entry config id :lambda-function)]
    (. builder lambdaFunction data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-component-version-props-builder
  "Creates a  `CfnComponentVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-component-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-component-version-props-builder> (new CfnComponentVersionProps$Builder) id config))


(defn cfn-deployment-builder>
  "The cfn-deployment-builder> function updates a CfnDeployment$Builder instance using the provided configuration.
  The function takes the CfnDeployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `deploymentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-name` |
| `deploymentPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-policies` |
| `iotJobConfiguration` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentIoTJobConfigurationProperty | [[cdk.support/lookup-entry]] | `:iot-job-configuration` |
| `parentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-target-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnDeployment$Builder builder id config]
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :deployment-name)]
    (. builder deploymentName data))
  (when-some [data (lookup-entry config id :deployment-policies)]
    (. builder deploymentPolicies data))
  (when-some [data (lookup-entry config id :iot-job-configuration)]
    (. builder iotJobConfiguration data))
  (when-some [data (lookup-entry config id :parent-target-arn)]
    (. builder parentTargetArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-deployment-builder
  "Creates a  `CfnDeployment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-deployment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-deployment-builder> (CfnDeployment$Builder/create scope (name id)) id config))


(defn cfn-deployment-component-configuration-update-property-builder>
  "The cfn-deployment-component-configuration-update-property-builder> function updates a CfnDeployment$ComponentConfigurationUpdateProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$ComponentConfigurationUpdateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `merge` | java.lang.String | [[cdk.support/lookup-entry]] | `:merge` |
| `reset` | java.util.List | [[cdk.support/lookup-entry]] | `:reset` |
"
  [^CfnDeployment$ComponentConfigurationUpdateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :merge)]
    (. builder merge data))
  (when-some [data (lookup-entry config id :reset)]
    (. builder reset data))
  (.build builder))


(defn cfn-deployment-component-configuration-update-property-builder
  "Creates a  `CfnDeployment$ComponentConfigurationUpdateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-component-configuration-update-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-component-configuration-update-property-builder> (new CfnDeployment$ComponentConfigurationUpdateProperty$Builder) id config))


(defn cfn-deployment-component-deployment-specification-property-builder>
  "The cfn-deployment-component-deployment-specification-property-builder> function updates a CfnDeployment$ComponentDeploymentSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$ComponentDeploymentSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-version` |
| `configurationUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-update` |
| `runWith` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$ComponentRunWithProperty | [[cdk.support/lookup-entry]] | `:run-with` |
"
  [^CfnDeployment$ComponentDeploymentSpecificationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-version)]
    (. builder componentVersion data))
  (when-some [data (lookup-entry config id :configuration-update)]
    (. builder configurationUpdate data))
  (when-some [data (lookup-entry config id :run-with)]
    (. builder runWith data))
  (.build builder))


(defn cfn-deployment-component-deployment-specification-property-builder
  "Creates a  `CfnDeployment$ComponentDeploymentSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-component-deployment-specification-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-component-deployment-specification-property-builder> (new CfnDeployment$ComponentDeploymentSpecificationProperty$Builder) id config))


(defn cfn-deployment-component-run-with-property-builder>
  "The cfn-deployment-component-run-with-property-builder> function updates a CfnDeployment$ComponentRunWithProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$ComponentRunWithProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `posixUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:posix-user` |
| `systemResourceLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:system-resource-limits` |
| `windowsUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows-user` |
"
  [^CfnDeployment$ComponentRunWithProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :posix-user)]
    (. builder posixUser data))
  (when-some [data (lookup-entry config id :system-resource-limits)]
    (. builder systemResourceLimits data))
  (when-some [data (lookup-entry config id :windows-user)]
    (. builder windowsUser data))
  (.build builder))


(defn cfn-deployment-component-run-with-property-builder
  "Creates a  `CfnDeployment$ComponentRunWithProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-component-run-with-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-component-run-with-property-builder> (new CfnDeployment$ComponentRunWithProperty$Builder) id config))


(defn cfn-deployment-deployment-component-update-policy-property-builder>
  "The cfn-deployment-deployment-component-update-policy-property-builder> function updates a CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-deployment-deployment-component-update-policy-property-builder
  "Creates a  `CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-deployment-component-update-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-deployment-component-update-policy-property-builder> (new CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder) id config))


(defn cfn-deployment-deployment-configuration-validation-policy-property-builder>
  "The cfn-deployment-deployment-configuration-validation-policy-property-builder> function updates a CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-deployment-deployment-configuration-validation-policy-property-builder
  "Creates a  `CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-deployment-configuration-validation-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-deployment-configuration-validation-policy-property-builder> (new CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder) id config))


(defn cfn-deployment-deployment-io-t-job-configuration-property-builder>
  "The cfn-deployment-deployment-io-t-job-configuration-property-builder> function updates a CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abort-config` |
| `jobExecutionsRolloutConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-executions-rollout-config` |
| `timeoutConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-config` |
"
  [^CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :abort-config)]
    (. builder abortConfig data))
  (when-some [data (lookup-entry config id :job-executions-rollout-config)]
    (. builder jobExecutionsRolloutConfig data))
  (when-some [data (lookup-entry config id :timeout-config)]
    (. builder timeoutConfig data))
  (.build builder))


(defn cfn-deployment-deployment-io-t-job-configuration-property-builder
  "Creates a  `CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-deployment-io-t-job-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-deployment-io-t-job-configuration-property-builder> (new CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder) id config))


(defn cfn-deployment-deployment-policies-property-builder>
  "The cfn-deployment-deployment-policies-property-builder> function updates a CfnDeployment$DeploymentPoliciesProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DeploymentPoliciesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentUpdatePolicy` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentComponentUpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:component-update-policy` |
| `configurationValidationPolicy` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentConfigurationValidationPolicyProperty | [[cdk.support/lookup-entry]] | `:configuration-validation-policy` |
| `failureHandlingPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-handling-policy` |
"
  [^CfnDeployment$DeploymentPoliciesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component-update-policy)]
    (. builder componentUpdatePolicy data))
  (when-some [data (lookup-entry config id :configuration-validation-policy)]
    (. builder configurationValidationPolicy data))
  (when-some [data (lookup-entry config id :failure-handling-policy)]
    (. builder failureHandlingPolicy data))
  (.build builder))


(defn cfn-deployment-deployment-policies-property-builder
  "Creates a  `CfnDeployment$DeploymentPoliciesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-deployment-policies-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-deployment-policies-property-builder> (new CfnDeployment$DeploymentPoliciesProperty$Builder) id config))


(defn cfn-deployment-io-t-job-abort-config-property-builder>
  "The cfn-deployment-io-t-job-abort-config-property-builder> function updates a CfnDeployment$IoTJobAbortConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$IoTJobAbortConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteriaList` | java.util.List | [[cdk.support/lookup-entry]] | `:criteria-list` |
"
  [^CfnDeployment$IoTJobAbortConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :criteria-list)]
    (. builder criteriaList data))
  (.build builder))


(defn cfn-deployment-io-t-job-abort-config-property-builder
  "Creates a  `CfnDeployment$IoTJobAbortConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-io-t-job-abort-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-io-t-job-abort-config-property-builder> (new CfnDeployment$IoTJobAbortConfigProperty$Builder) id config))


(defn cfn-deployment-io-t-job-abort-criteria-property-builder>
  "The cfn-deployment-io-t-job-abort-criteria-property-builder> function updates a CfnDeployment$IoTJobAbortCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$IoTJobAbortCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `minNumberOfExecutedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-number-of-executed-things` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |
"
  [^CfnDeployment$IoTJobAbortCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :failure-type)]
    (. builder failureType data))
  (when-some [data (lookup-entry config id :min-number-of-executed-things)]
    (. builder minNumberOfExecutedThings data))
  (when-some [data (lookup-entry config id :threshold-percentage)]
    (. builder thresholdPercentage data))
  (.build builder))


(defn cfn-deployment-io-t-job-abort-criteria-property-builder
  "Creates a  `CfnDeployment$IoTJobAbortCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-io-t-job-abort-criteria-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-io-t-job-abort-criteria-property-builder> (new CfnDeployment$IoTJobAbortCriteriaProperty$Builder) id config))


(defn cfn-deployment-io-t-job-executions-rollout-config-property-builder>
  "The cfn-deployment-io-t-job-executions-rollout-config-property-builder> function updates a CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exponentialRate` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$IoTJobExponentialRolloutRateProperty | [[cdk.support/lookup-entry]] | `:exponential-rate` |
| `maximumPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-per-minute` |
"
  [^CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exponential-rate)]
    (. builder exponentialRate data))
  (when-some [data (lookup-entry config id :maximum-per-minute)]
    (. builder maximumPerMinute data))
  (.build builder))


(defn cfn-deployment-io-t-job-executions-rollout-config-property-builder
  "Creates a  `CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-io-t-job-executions-rollout-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-io-t-job-executions-rollout-config-property-builder> (new CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder) id config))


(defn cfn-deployment-io-t-job-exponential-rollout-rate-property-builder>
  "The cfn-deployment-io-t-job-exponential-rollout-rate-property-builder> function updates a CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseRatePerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-rate-per-minute` |
| `incrementFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:increment-factor` |
| `rateIncreaseCriteria` | java.lang.Object | [[cdk.support/lookup-entry]] | `:rate-increase-criteria` |
"
  [^CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-rate-per-minute)]
    (. builder baseRatePerMinute data))
  (when-some [data (lookup-entry config id :increment-factor)]
    (. builder incrementFactor data))
  (when-some [data (lookup-entry config id :rate-increase-criteria)]
    (. builder rateIncreaseCriteria data))
  (.build builder))


(defn cfn-deployment-io-t-job-exponential-rollout-rate-property-builder
  "Creates a  `CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-io-t-job-exponential-rollout-rate-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-io-t-job-exponential-rollout-rate-property-builder> (new CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder) id config))


(defn cfn-deployment-io-t-job-timeout-config-property-builder>
  "The cfn-deployment-io-t-job-timeout-config-property-builder> function updates a CfnDeployment$IoTJobTimeoutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$IoTJobTimeoutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inProgressTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:in-progress-timeout-in-minutes` |
"
  [^CfnDeployment$IoTJobTimeoutConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :in-progress-timeout-in-minutes)]
    (. builder inProgressTimeoutInMinutes data))
  (.build builder))


(defn cfn-deployment-io-t-job-timeout-config-property-builder
  "Creates a  `CfnDeployment$IoTJobTimeoutConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-io-t-job-timeout-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-io-t-job-timeout-config-property-builder> (new CfnDeployment$IoTJobTimeoutConfigProperty$Builder) id config))


(defn cfn-deployment-props-builder>
  "The cfn-deployment-props-builder> function updates a CfnDeploymentProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `deploymentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-name` |
| `deploymentPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-policies` |
| `iotJobConfiguration` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentIoTJobConfigurationProperty | [[cdk.support/lookup-entry]] | `:iot-job-configuration` |
| `parentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-target-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnDeploymentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :components)]
    (. builder components data))
  (when-some [data (lookup-entry config id :deployment-name)]
    (. builder deploymentName data))
  (when-some [data (lookup-entry config id :deployment-policies)]
    (. builder deploymentPolicies data))
  (when-some [data (lookup-entry config id :iot-job-configuration)]
    (. builder iotJobConfiguration data))
  (when-some [data (lookup-entry config id :parent-target-arn)]
    (. builder parentTargetArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-deployment-props-builder
  "Creates a  `CfnDeploymentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-props-builder> (new CfnDeploymentProps$Builder) id config))


(defn cfn-deployment-system-resource-limits-property-builder>
  "The cfn-deployment-system-resource-limits-property-builder> function updates a CfnDeployment$SystemResourceLimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$SystemResourceLimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpus` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |
"
  [^CfnDeployment$SystemResourceLimitsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpus)]
    (. builder cpus data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (.build builder))


(defn cfn-deployment-system-resource-limits-property-builder
  "Creates a  `CfnDeployment$SystemResourceLimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-system-resource-limits-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-system-resource-limits-property-builder> (new CfnDeployment$SystemResourceLimitsProperty$Builder) id config))