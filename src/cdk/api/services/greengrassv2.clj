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


(defn cfn-component-version-builder
  "The cfn-component-version-builder function buildes out new instances of 
CfnComponentVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineRecipe` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-recipe` |
| `lambdaFunction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnComponentVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :inline-recipe)]
      (. builder inlineRecipe data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-component-version-component-dependency-requirement-property-builder
  "The cfn-component-version-component-dependency-requirement-property-builder function buildes out new instances of 
CfnComponentVersion$ComponentDependencyRequirementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dependency-type` |
| `versionRequirement` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-requirement` |"
  [stack id config]
  (let [builder (CfnComponentVersion$ComponentDependencyRequirementProperty$Builder.)]
    (when-let [data (lookup-entry config id :dependency-type)]
      (. builder dependencyType data))
    (when-let [data (lookup-entry config id :version-requirement)]
      (. builder versionRequirement data))
    (.build builder)))


(defn cfn-component-version-component-platform-property-builder
  "The cfn-component-version-component-platform-property-builder function buildes out new instances of 
CfnComponentVersion$ComponentPlatformProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnComponentVersion$ComponentPlatformProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-component-version-lambda-container-params-property-builder
  "The cfn-component-version-lambda-container-params-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaContainerParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
| `memorySizeInKb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size-in-kb` |
| `mountRoSysfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mount-ro-sysfs` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaContainerParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :devices)]
      (. builder devices data))
    (when-let [data (lookup-entry config id :memory-size-in-kb)]
      (. builder memorySizeInKb data))
    (when-let [data (lookup-entry config id :mount-ro-sysfs)]
      (. builder mountRoSysfs data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-component-version-lambda-device-mount-property-builder
  "The cfn-component-version-lambda-device-mount-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaDeviceMountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGroupOwner` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-group-owner` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaDeviceMountProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-group-owner)]
      (. builder addGroupOwner data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (.build builder)))


(defn cfn-component-version-lambda-event-source-property-builder
  "The cfn-component-version-lambda-event-source-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaEventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaEventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-component-version-lambda-execution-parameters-property-builder
  "The cfn-component-version-lambda-execution-parameters-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaExecutionParametersProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaExecutionParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :event-sources)]
      (. builder eventSources data))
    (when-let [data (lookup-entry config id :exec-args)]
      (. builder execArgs data))
    (when-let [data (lookup-entry config id :input-payload-encoding-type)]
      (. builder inputPayloadEncodingType data))
    (when-let [data (lookup-entry config id :linux-process-params)]
      (. builder linuxProcessParams data))
    (when-let [data (lookup-entry config id :max-idle-time-in-seconds)]
      (. builder maxIdleTimeInSeconds data))
    (when-let [data (lookup-entry config id :max-instances-count)]
      (. builder maxInstancesCount data))
    (when-let [data (lookup-entry config id :max-queue-size)]
      (. builder maxQueueSize data))
    (when-let [data (lookup-entry config id :pinned)]
      (. builder pinned data))
    (when-let [data (lookup-entry config id :status-timeout-in-seconds)]
      (. builder statusTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-component-version-lambda-function-recipe-source-property-builder
  "The cfn-component-version-lambda-function-recipe-source-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentDependencies` | java.util.Map | [[cdk.support/lookup-entry]] | `:component-dependencies` |
| `componentLambdaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:component-lambda-parameters` |
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentPlatforms` | java.util.List | [[cdk.support/lookup-entry]] | `:component-platforms` |
| `componentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaFunctionRecipeSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-dependencies)]
      (. builder componentDependencies data))
    (when-let [data (lookup-entry config id :component-lambda-parameters)]
      (. builder componentLambdaParameters data))
    (when-let [data (lookup-entry config id :component-name)]
      (. builder componentName data))
    (when-let [data (lookup-entry config id :component-platforms)]
      (. builder componentPlatforms data))
    (when-let [data (lookup-entry config id :component-version)]
      (. builder componentVersion data))
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (.build builder)))


(defn cfn-component-version-lambda-linux-process-params-property-builder
  "The cfn-component-version-lambda-linux-process-params-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerParams` | software.amazon.awscdk.services.greengrassv2.CfnComponentVersion$LambdaContainerParamsProperty | [[cdk.support/lookup-entry]] | `:container-params` |
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaLinuxProcessParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-params)]
      (. builder containerParams data))
    (when-let [data (lookup-entry config id :isolation-mode)]
      (. builder isolationMode data))
    (.build builder)))


(defn cfn-component-version-lambda-volume-mount-property-builder
  "The cfn-component-version-lambda-volume-mount-property-builder function buildes out new instances of 
CfnComponentVersion$LambdaVolumeMountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-group-owner` |
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnComponentVersion$LambdaVolumeMountProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-group-owner)]
      (. builder addGroupOwner data))
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-component-version-props-builder
  "The cfn-component-version-props-builder function buildes out new instances of 
CfnComponentVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineRecipe` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-recipe` |
| `lambdaFunction` | software.amazon.awscdk.services.greengrassv2.CfnComponentVersion$LambdaFunctionRecipeSourceProperty | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnComponentVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :inline-recipe)]
      (. builder inlineRecipe data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-builder
  "The cfn-deployment-builder function buildes out new instances of 
CfnDeployment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `deploymentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-name` |
| `deploymentPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-policies` |
| `iotJobConfiguration` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentIoTJobConfigurationProperty | [[cdk.support/lookup-entry]] | `:iot-job-configuration` |
| `parentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-target-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnDeployment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :deployment-name)]
      (. builder deploymentName data))
    (when-let [data (lookup-entry config id :deployment-policies)]
      (. builder deploymentPolicies data))
    (when-let [data (lookup-entry config id :iot-job-configuration)]
      (. builder iotJobConfiguration data))
    (when-let [data (lookup-entry config id :parent-target-arn)]
      (. builder parentTargetArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-deployment-component-configuration-update-property-builder
  "The cfn-deployment-component-configuration-update-property-builder function buildes out new instances of 
CfnDeployment$ComponentConfigurationUpdateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `merge` | java.lang.String | [[cdk.support/lookup-entry]] | `:merge` |
| `reset` | java.util.List | [[cdk.support/lookup-entry]] | `:reset` |"
  [stack id config]
  (let [builder (CfnDeployment$ComponentConfigurationUpdateProperty$Builder.)]
    (when-let [data (lookup-entry config id :merge)]
      (. builder merge data))
    (when-let [data (lookup-entry config id :reset)]
      (. builder reset data))
    (.build builder)))


(defn cfn-deployment-component-deployment-specification-property-builder
  "The cfn-deployment-component-deployment-specification-property-builder function buildes out new instances of 
CfnDeployment$ComponentDeploymentSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-version` |
| `configurationUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-update` |
| `runWith` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$ComponentRunWithProperty | [[cdk.support/lookup-entry]] | `:run-with` |"
  [stack id config]
  (let [builder (CfnDeployment$ComponentDeploymentSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-version)]
      (. builder componentVersion data))
    (when-let [data (lookup-entry config id :configuration-update)]
      (. builder configurationUpdate data))
    (when-let [data (lookup-entry config id :run-with)]
      (. builder runWith data))
    (.build builder)))


(defn cfn-deployment-component-run-with-property-builder
  "The cfn-deployment-component-run-with-property-builder function buildes out new instances of 
CfnDeployment$ComponentRunWithProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `posixUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:posix-user` |
| `systemResourceLimits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:system-resource-limits` |
| `windowsUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows-user` |"
  [stack id config]
  (let [builder (CfnDeployment$ComponentRunWithProperty$Builder.)]
    (when-let [data (lookup-entry config id :posix-user)]
      (. builder posixUser data))
    (when-let [data (lookup-entry config id :system-resource-limits)]
      (. builder systemResourceLimits data))
    (when-let [data (lookup-entry config id :windows-user)]
      (. builder windowsUser data))
    (.build builder)))


(defn cfn-deployment-deployment-component-update-policy-property-builder
  "The cfn-deployment-deployment-component-update-policy-property-builder function buildes out new instances of 
CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeployment$DeploymentComponentUpdatePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-deployment-deployment-configuration-validation-policy-property-builder
  "The cfn-deployment-deployment-configuration-validation-policy-property-builder function buildes out new instances of 
CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnDeployment$DeploymentConfigurationValidationPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-deployment-deployment-io-t-job-configuration-property-builder
  "The cfn-deployment-deployment-io-t-job-configuration-property-builder function buildes out new instances of 
CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abort-config` |
| `jobExecutionsRolloutConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:job-executions-rollout-config` |
| `timeoutConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-config` |"
  [stack id config]
  (let [builder (CfnDeployment$DeploymentIoTJobConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :abort-config)]
      (. builder abortConfig data))
    (when-let [data (lookup-entry config id :job-executions-rollout-config)]
      (. builder jobExecutionsRolloutConfig data))
    (when-let [data (lookup-entry config id :timeout-config)]
      (. builder timeoutConfig data))
    (.build builder)))


(defn cfn-deployment-deployment-policies-property-builder
  "The cfn-deployment-deployment-policies-property-builder function buildes out new instances of 
CfnDeployment$DeploymentPoliciesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentUpdatePolicy` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentComponentUpdatePolicyProperty | [[cdk.support/lookup-entry]] | `:component-update-policy` |
| `configurationValidationPolicy` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentConfigurationValidationPolicyProperty | [[cdk.support/lookup-entry]] | `:configuration-validation-policy` |
| `failureHandlingPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-handling-policy` |"
  [stack id config]
  (let [builder (CfnDeployment$DeploymentPoliciesProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-update-policy)]
      (. builder componentUpdatePolicy data))
    (when-let [data (lookup-entry config id :configuration-validation-policy)]
      (. builder configurationValidationPolicy data))
    (when-let [data (lookup-entry config id :failure-handling-policy)]
      (. builder failureHandlingPolicy data))
    (.build builder)))


(defn cfn-deployment-io-t-job-abort-config-property-builder
  "The cfn-deployment-io-t-job-abort-config-property-builder function buildes out new instances of 
CfnDeployment$IoTJobAbortConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteriaList` | java.util.List | [[cdk.support/lookup-entry]] | `:criteria-list` |"
  [stack id config]
  (let [builder (CfnDeployment$IoTJobAbortConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :criteria-list)]
      (. builder criteriaList data))
    (.build builder)))


(defn cfn-deployment-io-t-job-abort-criteria-property-builder
  "The cfn-deployment-io-t-job-abort-criteria-property-builder function buildes out new instances of 
CfnDeployment$IoTJobAbortCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `minNumberOfExecutedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-number-of-executed-things` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |"
  [stack id config]
  (let [builder (CfnDeployment$IoTJobAbortCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :failure-type)]
      (. builder failureType data))
    (when-let [data (lookup-entry config id :min-number-of-executed-things)]
      (. builder minNumberOfExecutedThings data))
    (when-let [data (lookup-entry config id :threshold-percentage)]
      (. builder thresholdPercentage data))
    (.build builder)))


(defn cfn-deployment-io-t-job-executions-rollout-config-property-builder
  "The cfn-deployment-io-t-job-executions-rollout-config-property-builder function buildes out new instances of 
CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exponentialRate` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$IoTJobExponentialRolloutRateProperty | [[cdk.support/lookup-entry]] | `:exponential-rate` |
| `maximumPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-per-minute` |"
  [stack id config]
  (let [builder (CfnDeployment$IoTJobExecutionsRolloutConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :exponential-rate)]
      (. builder exponentialRate data))
    (when-let [data (lookup-entry config id :maximum-per-minute)]
      (. builder maximumPerMinute data))
    (.build builder)))


(defn cfn-deployment-io-t-job-exponential-rollout-rate-property-builder
  "The cfn-deployment-io-t-job-exponential-rollout-rate-property-builder function buildes out new instances of 
CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseRatePerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-rate-per-minute` |
| `incrementFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:increment-factor` |
| `rateIncreaseCriteria` | java.lang.Object | [[cdk.support/lookup-entry]] | `:rate-increase-criteria` |"
  [stack id config]
  (let [builder (CfnDeployment$IoTJobExponentialRolloutRateProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-rate-per-minute)]
      (. builder baseRatePerMinute data))
    (when-let [data (lookup-entry config id :increment-factor)]
      (. builder incrementFactor data))
    (when-let [data (lookup-entry config id :rate-increase-criteria)]
      (. builder rateIncreaseCriteria data))
    (.build builder)))


(defn cfn-deployment-io-t-job-timeout-config-property-builder
  "The cfn-deployment-io-t-job-timeout-config-property-builder function buildes out new instances of 
CfnDeployment$IoTJobTimeoutConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inProgressTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:in-progress-timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnDeployment$IoTJobTimeoutConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :in-progress-timeout-in-minutes)]
      (. builder inProgressTimeoutInMinutes data))
    (.build builder)))


(defn cfn-deployment-props-builder
  "The cfn-deployment-props-builder function buildes out new instances of 
CfnDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `deploymentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-name` |
| `deploymentPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-policies` |
| `iotJobConfiguration` | software.amazon.awscdk.services.greengrassv2.CfnDeployment$DeploymentIoTJobConfigurationProperty | [[cdk.support/lookup-entry]] | `:iot-job-configuration` |
| `parentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-target-arn` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnDeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :components)]
      (. builder components data))
    (when-let [data (lookup-entry config id :deployment-name)]
      (. builder deploymentName data))
    (when-let [data (lookup-entry config id :deployment-policies)]
      (. builder deploymentPolicies data))
    (when-let [data (lookup-entry config id :iot-job-configuration)]
      (. builder iotJobConfiguration data))
    (when-let [data (lookup-entry config id :parent-target-arn)]
      (. builder parentTargetArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-deployment-system-resource-limits-property-builder
  "The cfn-deployment-system-resource-limits-property-builder function buildes out new instances of 
CfnDeployment$SystemResourceLimitsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpus` |
| `memory` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory` |"
  [stack id config]
  (let [builder (CfnDeployment$SystemResourceLimitsProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpus)]
      (. builder cpus data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (.build builder)))