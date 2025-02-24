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


(defn build-action-builder
  "The build-action-builder function updates a Action$Builder instance using the provided configuration.
  The function takes the Action$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:action-points` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventDestination` | software.amazon.awscdk.services.appconfig.IEventDestination | [[cdk.support/lookup-entry]] | `:event-destination` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `invokeWithoutExecutionRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invoke-without-execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^Action$Builder builder id config]
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
  (.build builder))


(defn action-builder
  ""
  [id config]
  (build-action-builder (Action$Builder/create) id config))


(defn build-action-props-builder
  "The build-action-props-builder function updates a ActionProps$Builder instance using the provided configuration.
  The function takes the ActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:action-points` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventDestination` | software.amazon.awscdk.services.appconfig.IEventDestination | [[cdk.support/lookup-entry]] | `:event-destination` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `invokeWithoutExecutionRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:invoke-without-execution-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ActionProps$Builder builder id config]
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
  (.build builder))


(defn action-props-builder
  ""
  [id config]
  (build-action-props-builder (new ActionProps$Builder) id config))


(defn build-application-builder
  "The build-application-builder function updates a Application$Builder instance using the provided configuration.
  The function takes the Application$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^Application$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn application-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-application-builder (Application$Builder/create scope (name id)) id config))


(defn build-application-props-builder
  "The build-application-props-builder function updates a ApplicationProps$Builder instance using the provided configuration.
  The function takes the ApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^ApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn application-props-builder
  ""
  [id config]
  (build-application-props-builder (new ApplicationProps$Builder) id config))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  ""
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-configuration-profile-builder
  "The build-cfn-configuration-profile-builder function updates a CfnConfigurationProfile$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
"
  [^CfnConfigurationProfile$Builder builder id config]
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
  (.build builder))


(defn cfn-configuration-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-configuration-profile-builder (CfnConfigurationProfile$Builder/create scope (name id)) id config))


(defn build-cfn-configuration-profile-props-builder
  "The build-cfn-configuration-profile-props-builder function updates a CfnConfigurationProfileProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `validators` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:validators` |
"
  [^CfnConfigurationProfileProps$Builder builder id config]
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
  (.build builder))


(defn cfn-configuration-profile-props-builder
  ""
  [id config]
  (build-cfn-configuration-profile-props-builder (new CfnConfigurationProfileProps$Builder) id config))


(defn build-cfn-configuration-profile-validators-property-builder
  "The build-cfn-configuration-profile-validators-property-builder function updates a CfnConfigurationProfile$ValidatorsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProfile$ValidatorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnConfigurationProfile$ValidatorsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-configuration-profile-validators-property-builder
  ""
  [id config]
  (build-cfn-configuration-profile-validators-property-builder (new CfnConfigurationProfile$ValidatorsProperty$Builder) id config))


(defn build-cfn-deployment-builder
  "The build-cfn-deployment-builder function updates a CfnDeployment$Builder instance using the provided configuration.
  The function takes the CfnDeployment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeployment$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-deployment-builder (CfnDeployment$Builder/create scope (name id)) id config))


(defn build-cfn-deployment-dynamic-extension-parameters-property-builder
  "The build-cfn-deployment-dynamic-extension-parameters-property-builder function updates a CfnDeployment$DynamicExtensionParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnDeployment$DynamicExtensionParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-reference` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnDeployment$DynamicExtensionParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :extension-reference)]
    (. builder extensionReference data))
  (when-let [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-let [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-deployment-dynamic-extension-parameters-property-builder
  ""
  [id config]
  (build-cfn-deployment-dynamic-extension-parameters-property-builder (new CfnDeployment$DynamicExtensionParametersProperty$Builder) id config))


(defn build-cfn-deployment-props-builder
  "The build-cfn-deployment-props-builder function updates a CfnDeploymentProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeploymentProps$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-props-builder
  ""
  [id config]
  (build-cfn-deployment-props-builder (new CfnDeploymentProps$Builder) id config))


(defn build-cfn-deployment-strategy-builder
  "The build-cfn-deployment-strategy-builder function updates a CfnDeploymentStrategy$Builder instance using the provided configuration.
  The function takes the CfnDeploymentStrategy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDurationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:deployment-duration-in-minutes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `finalBakeTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-bake-time-in-minutes` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |
| `growthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:growth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicateTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicate-to` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeploymentStrategy$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-strategy-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-deployment-strategy-builder (CfnDeploymentStrategy$Builder/create scope (name id)) id config))


(defn build-cfn-deployment-strategy-props-builder
  "The build-cfn-deployment-strategy-props-builder function updates a CfnDeploymentStrategyProps$Builder instance using the provided configuration.
  The function takes the CfnDeploymentStrategyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDurationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:deployment-duration-in-minutes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `finalBakeTimeInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-bake-time-in-minutes` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |
| `growthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:growth-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicateTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:replicate-to` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeploymentStrategyProps$Builder builder id config]
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
  (.build builder))


(defn cfn-deployment-strategy-props-builder
  ""
  [id config]
  (build-cfn-deployment-strategy-props-builder (new CfnDeploymentStrategyProps$Builder) id config))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironment$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-builder (CfnEnvironment$Builder/create scope (name id)) id config))


(defn build-cfn-environment-monitor-property-builder
  "The build-cfn-environment-monitor-property-builder function updates a CfnEnvironment$MonitorProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$MonitorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
"
  [^CfnEnvironment$MonitorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-arn)]
    (. builder alarmArn data))
  (when-let [data (lookup-entry config id :alarm-role-arn)]
    (. builder alarmRoleArn data))
  (.build builder))


(defn cfn-environment-monitor-property-builder
  ""
  [id config]
  (build-cfn-environment-monitor-property-builder (new CfnEnvironment$MonitorProperty$Builder) id config))


(defn build-cfn-environment-monitors-property-builder
  "The build-cfn-environment-monitors-property-builder function updates a CfnEnvironment$MonitorsProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$MonitorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
"
  [^CfnEnvironment$MonitorsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-arn)]
    (. builder alarmArn data))
  (when-let [data (lookup-entry config id :alarm-role-arn)]
    (. builder alarmRoleArn data))
  (.build builder))


(defn cfn-environment-monitors-property-builder
  ""
  [id config]
  (build-cfn-environment-monitors-property-builder (new CfnEnvironment$MonitorsProperty$Builder) id config))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `monitors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentProps$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-props-builder
  ""
  [id config]
  (build-cfn-environment-props-builder (new CfnEnvironmentProps$Builder) id config))


(defn build-cfn-extension-action-property-builder
  "The build-cfn-extension-action-property-builder function updates a CfnExtension$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnExtension$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:uri` |
"
  [^CfnExtension$ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-extension-action-property-builder
  ""
  [id config]
  (build-cfn-extension-action-property-builder (new CfnExtension$ActionProperty$Builder) id config))


(defn build-cfn-extension-association-builder
  "The build-cfn-extension-association-builder function updates a CfnExtensionAssociation$Builder instance using the provided configuration.
  The function takes the CfnExtensionAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-identifier` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExtensionAssociation$Builder builder id config]
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
  (.build builder))


(defn cfn-extension-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-extension-association-builder (CfnExtensionAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-extension-association-props-builder
  "The build-cfn-extension-association-props-builder function updates a CfnExtensionAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnExtensionAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `extensionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-identifier` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExtensionAssociationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-extension-association-props-builder
  ""
  [id config]
  (build-cfn-extension-association-props-builder (new CfnExtensionAssociationProps$Builder) id config))


(defn build-cfn-extension-builder
  "The build-cfn-extension-builder function updates a CfnExtension$Builder instance using the provided configuration.
  The function takes the CfnExtension$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExtension$Builder builder id config]
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
  (.build builder))


(defn cfn-extension-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-extension-builder (CfnExtension$Builder/create scope (name id)) id config))


(defn build-cfn-extension-parameter-property-builder
  "The build-cfn-extension-parameter-property-builder function updates a CfnExtension$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnExtension$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
"
  [^CfnExtension$ParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :dynamic)]
    (. builder dynamic data))
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn cfn-extension-parameter-property-builder
  ""
  [id config]
  (build-cfn-extension-parameter-property-builder (new CfnExtension$ParameterProperty$Builder) id config))


(defn build-cfn-extension-props-builder
  "The build-cfn-extension-props-builder function updates a CfnExtensionProps$Builder instance using the provided configuration.
  The function takes the CfnExtensionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExtensionProps$Builder builder id config]
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
  (.build builder))


(defn cfn-extension-props-builder
  ""
  [id config]
  (build-cfn-extension-props-builder (new CfnExtensionProps$Builder) id config))


(defn build-cfn-hosted-configuration-version-builder
  "The build-cfn-hosted-configuration-version-builder function updates a CfnHostedConfigurationVersion$Builder instance using the provided configuration.
  The function takes the CfnHostedConfigurationVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^CfnHostedConfigurationVersion$Builder builder id config]
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
  (.build builder))


(defn cfn-hosted-configuration-version-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-hosted-configuration-version-builder (CfnHostedConfigurationVersion$Builder/create scope (name id)) id config))


(defn build-cfn-hosted-configuration-version-props-builder
  "The build-cfn-hosted-configuration-version-props-builder function updates a CfnHostedConfigurationVersionProps$Builder instance using the provided configuration.
  The function takes the CfnHostedConfigurationVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-profile-id` |
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^CfnHostedConfigurationVersionProps$Builder builder id config]
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
  (.build builder))


(defn cfn-hosted-configuration-version-props-builder
  ""
  [id config]
  (build-cfn-hosted-configuration-version-props-builder (new CfnHostedConfigurationVersionProps$Builder) id config))


(defn build-configuration-options-builder
  "The build-configuration-options-builder function updates a ConfigurationOptions$Builder instance using the provided configuration.
  The function takes the ConfigurationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
"
  [^ConfigurationOptions$Builder builder id config]
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
  (.build builder))


(defn configuration-options-builder
  ""
  [id config]
  (build-configuration-options-builder (new ConfigurationOptions$Builder) id config))


(defn build-configuration-props-builder
  "The build-configuration-props-builder function updates a ConfigurationProps$Builder instance using the provided configuration.
  The function takes the ConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `deployTo` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy-to` |
| `deploymentKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:deployment-key` |
| `deploymentStrategy` | software.amazon.awscdk.services.appconfig.IDeploymentStrategy | [[cdk.support/lookup-entry]] | `:deployment-strategy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.services.appconfig.ConfigurationType | [[cdk.api.services.appconfig/configuration-type]] | `:type` |
| `validators` | java.util.List | [[cdk.support/lookup-entry]] | `:validators` |
"
  [^ConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn configuration-props-builder
  ""
  [id config]
  (build-configuration-props-builder (new ConfigurationProps$Builder) id config))


(defn build-deployment-strategy-builder
  "The build-deployment-strategy-builder function updates a DeploymentStrategy$Builder instance using the provided configuration.
  The function takes the DeploymentStrategy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentStrategyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `rolloutStrategy` | software.amazon.awscdk.services.appconfig.RolloutStrategy | [[cdk.support/lookup-entry]] | `:rollout-strategy` |
"
  [^DeploymentStrategy$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-strategy-name)]
    (. builder deploymentStrategyName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :rollout-strategy)]
    (. builder rolloutStrategy data))
  (.build builder))


(defn deployment-strategy-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-deployment-strategy-builder (DeploymentStrategy$Builder/create scope (name id)) id config))


(defn build-deployment-strategy-props-builder
  "The build-deployment-strategy-props-builder function updates a DeploymentStrategyProps$Builder instance using the provided configuration.
  The function takes the DeploymentStrategyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentStrategyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-strategy-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `rolloutStrategy` | software.amazon.awscdk.services.appconfig.RolloutStrategy | [[cdk.support/lookup-entry]] | `:rollout-strategy` |
"
  [^DeploymentStrategyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-strategy-name)]
    (. builder deploymentStrategyName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :rollout-strategy)]
    (. builder rolloutStrategy data))
  (.build builder))


(defn deployment-strategy-props-builder
  ""
  [id config]
  (build-deployment-strategy-props-builder (new DeploymentStrategyProps$Builder) id config))


(defn build-environment-attributes-builder
  "The build-environment-attributes-builder function updates a EnvironmentAttributes$Builder instance using the provided configuration.
  The function takes the EnvironmentAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^EnvironmentAttributes$Builder builder id config]
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
  (.build builder))


(defn environment-attributes-builder
  ""
  [id config]
  (build-environment-attributes-builder (new EnvironmentAttributes$Builder) id config))


(defn build-environment-builder
  "The build-environment-builder function updates a Environment$Builder instance using the provided configuration.
  The function takes the Environment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
"
  [^Environment$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-environment-builder (Environment$Builder/create scope (name id)) id config))


(defn build-environment-options-builder
  "The build-environment-options-builder function updates a EnvironmentOptions$Builder instance using the provided configuration.
  The function takes the EnvironmentOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
"
  [^EnvironmentOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-options-builder
  ""
  [id config]
  (build-environment-options-builder (new EnvironmentOptions$Builder) id config))


(defn build-environment-props-builder
  "The build-environment-props-builder function updates a EnvironmentProps$Builder instance using the provided configuration.
  The function takes the EnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.appconfig.IApplication | [[cdk.support/lookup-entry]] | `:application` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `monitors` | java.util.List | [[cdk.support/lookup-entry]] | `:monitors` |
"
  [^EnvironmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-props-builder
  ""
  [id config]
  (build-environment-props-builder (new EnvironmentProps$Builder) id config))


(defn build-extension-attributes-builder
  "The build-extension-attributes-builder function updates a ExtensionAttributes$Builder instance using the provided configuration.
  The function takes the ExtensionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-arn` |
| `extensionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-id` |
| `extensionVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:extension-version-number` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ExtensionAttributes$Builder builder id config]
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
  (.build builder))


(defn extension-attributes-builder
  ""
  [id config]
  (build-extension-attributes-builder (new ExtensionAttributes$Builder) id config))


(defn build-extension-builder
  "The build-extension-builder function updates a Extension$Builder instance using the provided configuration.
  The function takes the Extension$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^Extension$Builder builder id config]
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
  (.build builder))


(defn extension-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-extension-builder (Extension$Builder/create scope (name id)) id config))


(defn build-extension-options-builder
  "The build-extension-options-builder function updates a ExtensionOptions$Builder instance using the provided configuration.
  The function takes the ExtensionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^ExtensionOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :extension-name)]
    (. builder extensionName data))
  (when-let [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn extension-options-builder
  ""
  [id config]
  (build-extension-options-builder (new ExtensionOptions$Builder) id config))


(defn build-extension-props-builder
  "The build-extension-props-builder function updates a ExtensionProps$Builder instance using the provided configuration.
  The function takes the ExtensionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:extension-name` |
| `latestVersionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latest-version-number` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^ExtensionProps$Builder builder id config]
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
  (.build builder))


(defn extension-props-builder
  ""
  [id config]
  (build-extension-props-builder (new ExtensionProps$Builder) id config))


(defn build-hosted-configuration-builder
  "The build-hosted-configuration-builder function updates a HostedConfiguration$Builder instance using the provided configuration.
  The function takes the HostedConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^HostedConfiguration$Builder builder id config]
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
  (.build builder))


(defn hosted-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-hosted-configuration-builder (HostedConfiguration$Builder/create scope (name id)) id config))


(defn build-hosted-configuration-options-builder
  "The build-hosted-configuration-options-builder function updates a HostedConfigurationOptions$Builder instance using the provided configuration.
  The function takes the HostedConfigurationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^HostedConfigurationOptions$Builder builder id config]
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
  (.build builder))


(defn hosted-configuration-options-builder
  ""
  [id config]
  (build-hosted-configuration-options-builder (new HostedConfigurationOptions$Builder) id config))


(defn build-hosted-configuration-props-builder
  "The build-hosted-configuration-props-builder function updates a HostedConfigurationProps$Builder instance using the provided configuration.
  The function takes the HostedConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-label` |
"
  [^HostedConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn hosted-configuration-props-builder
  ""
  [id config]
  (build-hosted-configuration-props-builder (new HostedConfigurationProps$Builder) id config))


(defn build-rollout-strategy-props-builder
  "The build-rollout-strategy-props-builder function updates a RolloutStrategyProps$Builder instance using the provided configuration.
  The function takes the RolloutStrategyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:deployment-duration` |
| `finalBakeTime` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:final-bake-time` |
| `growthFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:growth-factor` |
"
  [^RolloutStrategyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-duration)]
    (. builder deploymentDuration data))
  (when-let [data (lookup-entry config id :final-bake-time)]
    (. builder finalBakeTime data))
  (when-let [data (lookup-entry config id :growth-factor)]
    (. builder growthFactor data))
  (.build builder))


(defn rollout-strategy-props-builder
  ""
  [id config]
  (build-rollout-strategy-props-builder (new RolloutStrategyProps$Builder) id config))


(defn build-sourced-configuration-builder
  "The build-sourced-configuration-builder function updates a SourcedConfiguration$Builder instance using the provided configuration.
  The function takes the SourcedConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |
"
  [^SourcedConfiguration$Builder builder id config]
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
  (.build builder))


(defn sourced-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-sourced-configuration-builder (SourcedConfiguration$Builder/create scope (name id)) id config))


(defn build-sourced-configuration-options-builder
  "The build-sourced-configuration-options-builder function updates a SourcedConfigurationOptions$Builder instance using the provided configuration.
  The function takes the SourcedConfigurationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |
"
  [^SourcedConfigurationOptions$Builder builder id config]
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
  (.build builder))


(defn sourced-configuration-options-builder
  ""
  [id config]
  (build-sourced-configuration-options-builder (new SourcedConfigurationOptions$Builder) id config))


(defn build-sourced-configuration-props-builder
  "The build-sourced-configuration-props-builder function updates a SourcedConfigurationProps$Builder instance using the provided configuration.
  The function takes the SourcedConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |
"
  [^SourcedConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn sourced-configuration-props-builder
  ""
  [id config]
  (build-sourced-configuration-props-builder (new SourcedConfigurationProps$Builder) id config))