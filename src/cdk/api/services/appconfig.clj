(ns cdk.api.services.appconfig
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appconfig package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.appconfig Action$Builder
                                                      ActionPoint
                                                      ActionProps$Builder
                                                      Application$Builder
                                                      ApplicationProps$Builder
                                                      CfnApplication$Builder
                                                      CfnApplicationProps$Builder
                                                      CfnConfigurationProfile$Builder
                                                      CfnConfigurationProfile$ValidatorsProperty$Builder
                                                      CfnConfigurationProfileProps$Builder
                                                      CfnDeployment$Builder
                                                      CfnDeployment$DynamicExtensionParametersProperty$Builder
                                                      CfnDeploymentProps$Builder
                                                      CfnDeploymentStrategy$Builder
                                                      CfnDeploymentStrategyProps$Builder
                                                      CfnEnvironment$Builder
                                                      CfnEnvironment$MonitorProperty$Builder
                                                      CfnEnvironment$MonitorsProperty$Builder
                                                      CfnEnvironmentProps$Builder
                                                      CfnExtension$ActionProperty$Builder
                                                      CfnExtension$Builder
                                                      CfnExtension$ParameterProperty$Builder
                                                      CfnExtensionAssociation$Builder
                                                      CfnExtensionAssociationProps$Builder
                                                      CfnExtensionProps$Builder
                                                      CfnHostedConfigurationVersion$Builder
                                                      CfnHostedConfigurationVersionProps$Builder
                                                      ConfigurationOptions$Builder
                                                      ConfigurationProps$Builder
                                                      ConfigurationSourceType
                                                      ConfigurationType
                                                      DeploymentStrategy$Builder
                                                      DeploymentStrategyProps$Builder
                                                      Environment$Builder
                                                      EnvironmentAttributes$Builder
                                                      EnvironmentOptions$Builder
                                                      EnvironmentProps$Builder
                                                      Extension$Builder
                                                      ExtensionAttributes$Builder
                                                      ExtensionOptions$Builder
                                                      ExtensionProps$Builder
                                                      GrowthType
                                                      HostedConfiguration$Builder
                                                      HostedConfigurationOptions$Builder
                                                      HostedConfigurationProps$Builder
                                                      MonitorType
                                                      Platform
                                                      RolloutStrategyProps$Builder
                                                      SourceType
                                                      SourcedConfiguration$Builder
                                                      SourcedConfigurationOptions$Builder
                                                      SourcedConfigurationProps$Builder
                                                      ValidatorType]))


(defn action-point
  "The `action-point` function data interprets values in the provided config data into a 
`ActionPoint` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ActionPoint` - the value is returned.
* is `:on-deployment-start` - `ActionPoint/ON_DEPLOYMENT_START` is returned
* is `:on-deployment-step` - `ActionPoint/ON_DEPLOYMENT_STEP` is returned
* is `:on-deployment-baking` - `ActionPoint/ON_DEPLOYMENT_BAKING` is returned
* is `:on-deployment-complete` - `ActionPoint/ON_DEPLOYMENT_COMPLETE` is returned
* is `:pre-start-deployment` - `ActionPoint/PRE_START_DEPLOYMENT` is returned
* is `:pre-create-hosted-configuration-version` - `ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION` is returned
* is `:on-deployment-rolled-back` - `ActionPoint/ON_DEPLOYMENT_ROLLED_BACK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ActionPoint data) data
      (= :on-deployment-start data) ActionPoint/ON_DEPLOYMENT_START
      (= :on-deployment-step data) ActionPoint/ON_DEPLOYMENT_STEP
      (= :on-deployment-baking data) ActionPoint/ON_DEPLOYMENT_BAKING
      (= :on-deployment-complete data) ActionPoint/ON_DEPLOYMENT_COMPLETE
      (= :pre-start-deployment data) ActionPoint/PRE_START_DEPLOYMENT
      (= :pre-create-hosted-configuration-version data) ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION
      (= :on-deployment-rolled-back data) ActionPoint/ON_DEPLOYMENT_ROLLED_BACK)))


(defn configuration-source-type
  "The `configuration-source-type` function data interprets values in the provided config data into a 
`ConfigurationSourceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ConfigurationSourceType` - the value is returned.
* is `:secrets-manager` - `ConfigurationSourceType/SECRETS_MANAGER` is returned
* is `:ssm-parameter` - `ConfigurationSourceType/SSM_PARAMETER` is returned
* is `:s3` - `ConfigurationSourceType/S3` is returned
* is `:code-pipeline` - `ConfigurationSourceType/CODE_PIPELINE` is returned
* is `:ssm-document` - `ConfigurationSourceType/SSM_DOCUMENT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ConfigurationSourceType data) data
      (= :secrets-manager data) ConfigurationSourceType/SECRETS_MANAGER
      (= :ssm-parameter data) ConfigurationSourceType/SSM_PARAMETER
      (= :s3 data) ConfigurationSourceType/S3
      (= :code-pipeline data) ConfigurationSourceType/CODE_PIPELINE
      (= :ssm-document data) ConfigurationSourceType/SSM_DOCUMENT)))


(defn configuration-type
  "The `configuration-type` function data interprets values in the provided config data into a 
`ConfigurationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ConfigurationType` - the value is returned.
* is `:freeform` - `ConfigurationType/FREEFORM` is returned
* is `:feature-flags` - `ConfigurationType/FEATURE_FLAGS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ConfigurationType data) data
      (= :freeform data) ConfigurationType/FREEFORM
      (= :feature-flags data) ConfigurationType/FEATURE_FLAGS)))


(defn growth-type
  "The `growth-type` function data interprets values in the provided config data into a 
`GrowthType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `GrowthType` - the value is returned.
* is `:linear` - `GrowthType/LINEAR` is returned
* is `:exponential` - `GrowthType/EXPONENTIAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? GrowthType data) data
      (= :linear data) GrowthType/LINEAR
      (= :exponential data) GrowthType/EXPONENTIAL)))


(defn monitor-type
  "The `monitor-type` function data interprets values in the provided config data into a 
`MonitorType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MonitorType` - the value is returned.
* is `:cloudwatch` - `MonitorType/CLOUDWATCH` is returned
* is `:cfn-monitors-property` - `MonitorType/CFN_MONITORS_PROPERTY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MonitorType data) data
      (= :cloudwatch data) MonitorType/CLOUDWATCH
      (= :cfn-monitors-property data) MonitorType/CFN_MONITORS_PROPERTY)))


(defn platform
  "The `platform` function data interprets values in the provided config data into a 
`Platform` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Platform` - the value is returned.
* is `:x86-64` - `Platform/X86_64` is returned
* is `:arm-64` - `Platform/ARM_64` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Platform data) data
      (= :x86-64 data) Platform/X86_64
      (= :arm-64 data) Platform/ARM_64)))


(defn source-type
  "The `source-type` function data interprets values in the provided config data into a 
`SourceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SourceType` - the value is returned.
* is `:events` - `SourceType/EVENTS` is returned
* is `:lambda` - `SourceType/LAMBDA` is returned
* is `:sqs` - `SourceType/SQS` is returned
* is `:sns` - `SourceType/SNS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SourceType data) data
      (= :events data) SourceType/EVENTS
      (= :lambda data) SourceType/LAMBDA
      (= :sqs data) SourceType/SQS
      (= :sns data) SourceType/SNS)))


(defn validator-type
  "The `validator-type` function data interprets values in the provided config data into a 
`ValidatorType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ValidatorType` - the value is returned.
* is `:json-schema` - `ValidatorType/JSON_SCHEMA` is returned
* is `:lambda` - `ValidatorType/LAMBDA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ValidatorType data) data
      (= :json-schema data) ValidatorType/JSON_SCHEMA
      (= :lambda data) ValidatorType/LAMBDA)))


(defn action-builder
  "The action-builder function buildes out new instances of 
Action$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:action-points` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventDestination` | software.amazon.awscdk.services.appconfig.IEventDestination | [[cdk.support/lookup-entry]] | `:event-destination` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `invokeWithoutExecutionRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invoke-without-execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (Action$Builder/create)]
    (when-let [data (lookup-entry config id :action-points)]
      (. builder actionPoints data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :invoke-without-execution-role)]
      (. builder invokeWithoutExecutionRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn action-props-builder
  "The action-props-builder function buildes out new instances of 
ActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:action-points` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventDestination` | software.amazon.awscdk.services.appconfig.IEventDestination | [[cdk.support/lookup-entry]] | `:event-destination` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `invokeWithoutExecutionRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invoke-without-execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-points)]
      (. builder actionPoints data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-destination)]
      (. builder eventDestination data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :invoke-without-execution-role)]
      (. builder invokeWithoutExecutionRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn application-builder
  "The application-builder function buildes out new instances of 
Application$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (Application$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn application-props-builder
  "The application-props-builder function buildes out new instances of 
ApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (ApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-name)]
      (. builder applicationName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configuration-profile-builder
  "The cfn-configuration-profile-builder function buildes out new instances of 
CfnConfigurationProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `locationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retrievalRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:retrieval-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |"
  [stack id config]
  (let [builder (CfnConfigurationProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :location-uri)]
      (. builder locationUri data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retrieval-role-arn)]
      (. builder retrievalRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (.build builder)))


(defn cfn-configuration-profile-props-builder
  "The cfn-configuration-profile-props-builder function buildes out new instances of 
CfnConfigurationProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `locationUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-uri` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retrievalRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:retrieval-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validators` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validators` |"
  [stack id config]
  (let [builder (CfnConfigurationProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :location-uri)]
      (. builder locationUri data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retrieval-role-arn)]
      (. builder retrievalRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (.build builder)))


(defn cfn-configuration-profile-validators-property-builder
  "The cfn-configuration-profile-validators-property-builder function buildes out new instances of 
CfnConfigurationProfile$ValidatorsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnConfigurationProfile$ValidatorsProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-deployment-builder
  "The cfn-deployment-builder function buildes out new instances of 
CfnDeployment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `configurationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-version` |
| `deploymentStrategyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamicExtensionParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic-extension-parameters` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeployment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-profile-id)]
      (. builder configurationProfileId data))
    (when-let [data (lookup-entry config id :configuration-version)]
      (. builder configurationVersion data))
    (when-let [data (lookup-entry config id :deployment-strategy-id)]
      (. builder deploymentStrategyId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dynamic-extension-parameters)]
      (. builder dynamicExtensionParameters data))
    (when-let [data (lookup-entry config id :environment-id)]
      (. builder environmentId data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-dynamic-extension-parameters-property-builder
  "The cfn-deployment-dynamic-extension-parameters-property-builder function buildes out new instances of 
CfnDeployment$DynamicExtensionParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-reference` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnDeployment$DynamicExtensionParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :extension-reference)]
      (. builder extensionReference data))
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-deployment-props-builder
  "The cfn-deployment-props-builder function buildes out new instances of 
CfnDeploymentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `configurationVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-version` |
| `deploymentStrategyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamicExtensionParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:dynamic-extension-parameters` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeploymentProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-profile-id)]
      (. builder configurationProfileId data))
    (when-let [data (lookup-entry config id :configuration-version)]
      (. builder configurationVersion data))
    (when-let [data (lookup-entry config id :deployment-strategy-id)]
      (. builder deploymentStrategyId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dynamic-extension-parameters)]
      (. builder dynamicExtensionParameters data))
    (when-let [data (lookup-entry config id :environment-id)]
      (. builder environmentId data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-strategy-builder
  "The cfn-deployment-strategy-builder function buildes out new instances of 
CfnDeploymentStrategy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDurationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:deployment-duration-in-minutes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `finalBakeTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-bake-time-in-minutes` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |
| `growthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:growth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicateTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicate-to` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeploymentStrategy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-duration-in-minutes)]
      (. builder deploymentDurationInMinutes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :final-bake-time-in-minutes)]
      (. builder finalBakeTimeInMinutes data))
    (when-let [data (lookup-entry config id :growth-factor)]
      (. builder growthFactor data))
    (when-let [data (lookup-entry config id :growth-type)]
      (. builder growthType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replicate-to)]
      (. builder replicateTo data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-deployment-strategy-props-builder
  "The cfn-deployment-strategy-props-builder function buildes out new instances of 
CfnDeploymentStrategyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDurationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:deployment-duration-in-minutes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `finalBakeTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-bake-time-in-minutes` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |
| `growthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:growth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicateTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicate-to` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeploymentStrategyProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-duration-in-minutes)]
      (. builder deploymentDurationInMinutes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :final-bake-time-in-minutes)]
      (. builder finalBakeTimeInMinutes data))
    (when-let [data (lookup-entry config id :growth-factor)]
      (. builder growthFactor data))
    (when-let [data (lookup-entry config id :growth-type)]
      (. builder growthType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replicate-to)]
      (. builder replicateTo data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-monitor-property-builder
  "The cfn-environment-monitor-property-builder function buildes out new instances of 
CfnEnvironment$MonitorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |"
  [stack id config]
  (let [builder (CfnEnvironment$MonitorProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-arn)]
      (. builder alarmArn data))
    (when-let [data (lookup-entry config id :alarm-role-arn)]
      (. builder alarmRoleArn data))
    (.build builder)))


(defn cfn-environment-monitors-property-builder
  "The cfn-environment-monitors-property-builder function buildes out new instances of 
CfnEnvironment$MonitorsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |"
  [stack id config]
  (let [builder (CfnEnvironment$MonitorsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-arn)]
      (. builder alarmArn data))
    (when-let [data (lookup-entry config id :alarm-role-arn)]
      (. builder alarmRoleArn data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `monitors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-extension-action-property-builder
  "The cfn-extension-action-property-builder function buildes out new instances of 
CfnExtension$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |"
  [stack id config]
  (let [builder (CfnExtension$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :uri)]
      (. builder uri data))
    (.build builder)))


(defn cfn-extension-association-builder
  "The cfn-extension-association-builder function buildes out new instances of 
CfnExtensionAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-identifier` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExtensionAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :extension-identifier)]
      (. builder extensionIdentifier data))
    (when-let [data (lookup-entry config id :extension-version-number)]
      (. builder extensionVersionNumber data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-extension-association-props-builder
  "The cfn-extension-association-props-builder function buildes out new instances of 
CfnExtensionAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-identifier` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExtensionAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :extension-identifier)]
      (. builder extensionIdentifier data))
    (when-let [data (lookup-entry config id :extension-version-number)]
      (. builder extensionVersionNumber data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-extension-builder
  "The cfn-extension-builder function buildes out new instances of 
CfnExtension$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExtension$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-extension-parameter-property-builder
  "The cfn-extension-parameter-property-builder function buildes out new instances of 
CfnExtension$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |"
  [stack id config]
  (let [builder (CfnExtension$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dynamic)]
      (. builder dynamic data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (.build builder)))


(defn cfn-extension-props-builder
  "The cfn-extension-props-builder function buildes out new instances of 
CfnExtensionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExtensionProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-hosted-configuration-version-builder
  "The cfn-hosted-configuration-version-builder function buildes out new instances of 
CfnHostedConfigurationVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (CfnHostedConfigurationVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-profile-id)]
      (. builder configurationProfileId data))
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :version-label)]
      (. builder versionLabel data))
    (.build builder)))


(defn cfn-hosted-configuration-version-props-builder
  "The cfn-hosted-configuration-version-props-builder function buildes out new instances of 
CfnHostedConfigurationVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (CfnHostedConfigurationVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-profile-id)]
      (. builder configurationProfileId data))
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :version-label)]
      (. builder versionLabel data))
    (.build builder)))


(defn configuration-options-builder
  "The configuration-options-builder function buildes out new instances of 
ConfigurationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |"
  [stack id config]
  (let [builder (ConfigurationOptions$Builder.)]
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (.build builder)))


(defn configuration-props-builder
  "The configuration-props-builder function buildes out new instances of 
ConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |"
  [stack id config]
  (let [builder (ConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (.build builder)))


(defn deployment-strategy-builder
  "The deployment-strategy-builder function buildes out new instances of 
DeploymentStrategy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentStrategyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `rolloutStrategy` | software.amazon.awscdk.services.appconfig.RolloutStrategy | [[cdk.support/lookup-entry]] | `:rollout-strategy` |"
  [stack id config]
  (let [builder (DeploymentStrategy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deployment-strategy-name)]
      (. builder deploymentStrategyName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :rollout-strategy)]
      (. builder rolloutStrategy data))
    (.build builder)))


(defn deployment-strategy-props-builder
  "The deployment-strategy-props-builder function buildes out new instances of 
DeploymentStrategyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentStrategyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `rolloutStrategy` | software.amazon.awscdk.services.appconfig.RolloutStrategy | [[cdk.support/lookup-entry]] | `:rollout-strategy` |"
  [stack id config]
  (let [builder (DeploymentStrategyProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-strategy-name)]
      (. builder deploymentStrategyName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :rollout-strategy)]
      (. builder rolloutStrategy data))
    (.build builder)))


(defn environment-attributes-builder
  "The environment-attributes-builder function buildes out new instances of 
EnvironmentAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (EnvironmentAttributes$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment-id)]
      (. builder environmentId data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn environment-builder
  "The environment-builder function buildes out new instances of 
Environment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |"
  [stack id config]
  (let [builder (Environment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (.build builder)))


(defn environment-options-builder
  "The environment-options-builder function buildes out new instances of 
EnvironmentOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |"
  [stack id config]
  (let [builder (EnvironmentOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (.build builder)))


(defn environment-props-builder
  "The environment-props-builder function buildes out new instances of 
EnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |"
  [stack id config]
  (let [builder (EnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment-name)]
      (. builder environmentName data))
    (when-let [data (lookup-entry config id :monitors)]
      (. builder monitors data))
    (.build builder)))


(defn extension-attributes-builder
  "The extension-attributes-builder function buildes out new instances of 
ExtensionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-arn` |
| `extensionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-id` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ExtensionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :extension-arn)]
      (. builder extensionArn data))
    (when-let [data (lookup-entry config id :extension-id)]
      (. builder extensionId data))
    (when-let [data (lookup-entry config id :extension-version-number)]
      (. builder extensionVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn extension-builder
  "The extension-builder function buildes out new instances of 
Extension$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (Extension$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :extension-name)]
      (. builder extensionName data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn extension-options-builder
  "The extension-options-builder function buildes out new instances of 
ExtensionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (ExtensionOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :extension-name)]
      (. builder extensionName data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn extension-props-builder
  "The extension-props-builder function buildes out new instances of 
ExtensionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (ExtensionProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :extension-name)]
      (. builder extensionName data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn hosted-configuration-builder
  "The hosted-configuration-builder function buildes out new instances of 
HostedConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `content` | software.amazon.awscdk.services.appconfig.ConfigurationContent | [[cdk.support/lookup-entry]] | `:content` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (HostedConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-label)]
      (. builder versionLabel data))
    (.build builder)))


(defn hosted-configuration-options-builder
  "The hosted-configuration-options-builder function buildes out new instances of 
HostedConfigurationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.services.appconfig.ConfigurationContent | [[cdk.support/lookup-entry]] | `:content` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (HostedConfigurationOptions$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-label)]
      (. builder versionLabel data))
    (.build builder)))


(defn hosted-configuration-props-builder
  "The hosted-configuration-props-builder function buildes out new instances of 
HostedConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `content` | software.amazon.awscdk.services.appconfig.ConfigurationContent | [[cdk.support/lookup-entry]] | `:content` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |"
  [stack id config]
  (let [builder (HostedConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :latest-version-number)]
      (. builder latestVersionNumber data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-label)]
      (. builder versionLabel data))
    (.build builder)))


(defn rollout-strategy-props-builder
  "The rollout-strategy-props-builder function buildes out new instances of 
RolloutStrategyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-duration` |
| `finalBakeTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:final-bake-time` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |"
  [stack id config]
  (let [builder (RolloutStrategyProps$Builder.)]
    (when-let [data (lookup-entry config id :deployment-duration)]
      (. builder deploymentDuration data))
    (when-let [data (lookup-entry config id :final-bake-time)]
      (. builder finalBakeTime data))
    (when-let [data (lookup-entry config id :growth-factor)]
      (. builder growthFactor data))
    (.build builder)))


(defn sourced-configuration-builder
  "The sourced-configuration-builder function buildes out new instances of 
SourcedConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.services.appconfig.ConfigurationSource | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retrievalRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:retrieval-role` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |"
  [stack id config]
  (let [builder (SourcedConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retrieval-role)]
      (. builder retrievalRole data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-number)]
      (. builder versionNumber data))
    (.build builder)))


(defn sourced-configuration-options-builder
  "The sourced-configuration-options-builder function buildes out new instances of 
SourcedConfigurationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.services.appconfig.ConfigurationSource | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retrievalRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:retrieval-role` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |"
  [stack id config]
  (let [builder (SourcedConfigurationOptions$Builder.)]
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retrieval-role)]
      (. builder retrievalRole data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-number)]
      (. builder versionNumber data))
    (.build builder)))


(defn sourced-configuration-props-builder
  "The sourced-configuration-props-builder function buildes out new instances of 
SourcedConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `location` | software.amazon.awscdk.services.appconfig.ConfigurationSource | [[cdk.support/lookup-entry]] | `:location` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retrievalRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:retrieval-role` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |"
  [stack id config]
  (let [builder (SourcedConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :deploy-to)]
      (. builder deployTo data))
    (when-let [data (lookup-entry config id :deployment-key)]
      (. builder deploymentKey data))
    (when-let [data (lookup-entry config id :deployment-strategy)]
      (. builder deploymentStrategy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retrieval-role)]
      (. builder retrievalRole data))
    (when-let [data (configuration-type config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :validators)]
      (. builder validators data))
    (when-let [data (lookup-entry config id :version-number)]
      (. builder versionNumber data))
    (.build builder)))