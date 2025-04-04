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


(defn action-builder>
  "The action-builder> function updates a Action$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :action-points)]
    (. builder actionPoints data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :invoke-without-execution-role)]
    (. builder invokeWithoutExecutionRole data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn action-builder
  "Creates a  `Action$Builder` instance using a no-argument create, applies the data configuration using the [[action-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (action-builder> (Action$Builder/create) id config))


(defn action-props-builder>
  "The action-props-builder> function updates a ActionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :action-points)]
    (. builder actionPoints data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-destination)]
    (. builder eventDestination data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :invoke-without-execution-role)]
    (. builder invokeWithoutExecutionRole data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn action-props-builder
  "Creates a  `ActionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[action-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (action-props-builder> (new ActionProps$Builder) id config))


(defn application-builder>
  "The application-builder> function updates a Application$Builder instance using the provided configuration.
  The function takes the Application$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^Application$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn application-builder
  "Creates a  `Application$Builder` instance using a scope and ID, applies the data configuration using the [[application-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-builder> (Application$Builder/create scope (name id)) id config))


(defn application-props-builder>
  "The application-props-builder> function updates a ApplicationProps$Builder instance using the provided configuration.
  The function takes the ApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^ApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-name)]
    (. builder applicationName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn application-props-builder
  "Creates a  `ApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[application-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (application-props-builder> (new ApplicationProps$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-application-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-configuration-profile-builder>
  "The cfn-configuration-profile-builder> function updates a CfnConfigurationProfile$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-identifier)]
    (. builder kmsKeyIdentifier data))
  (when-some [data (lookup-entry config id :location-uri)]
    (. builder locationUri data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retrieval-role-arn)]
    (. builder retrievalRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (.build builder))


(defn cfn-configuration-profile-builder
  "Creates a  `CfnConfigurationProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-configuration-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-configuration-profile-builder> (CfnConfigurationProfile$Builder/create scope (name id)) id config))


(defn cfn-configuration-profile-props-builder>
  "The cfn-configuration-profile-props-builder> function updates a CfnConfigurationProfileProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-identifier)]
    (. builder kmsKeyIdentifier data))
  (when-some [data (lookup-entry config id :location-uri)]
    (. builder locationUri data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retrieval-role-arn)]
    (. builder retrievalRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (.build builder))


(defn cfn-configuration-profile-props-builder
  "Creates a  `CfnConfigurationProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-configuration-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-configuration-profile-props-builder> (new CfnConfigurationProfileProps$Builder) id config))


(defn cfn-configuration-profile-validators-property-builder>
  "The cfn-configuration-profile-validators-property-builder> function updates a CfnConfigurationProfile$ValidatorsProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProfile$ValidatorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnConfigurationProfile$ValidatorsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-configuration-profile-validators-property-builder
  "Creates a  `CfnConfigurationProfile$ValidatorsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-configuration-profile-validators-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-configuration-profile-validators-property-builder> (new CfnConfigurationProfile$ValidatorsProperty$Builder) id config))


(defn cfn-deployment-builder>
  "The cfn-deployment-builder> function updates a CfnDeployment$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :configuration-profile-id)]
    (. builder configurationProfileId data))
  (when-some [data (lookup-entry config id :configuration-version)]
    (. builder configurationVersion data))
  (when-some [data (lookup-entry config id :deployment-strategy-id)]
    (. builder deploymentStrategyId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dynamic-extension-parameters)]
    (. builder dynamicExtensionParameters data))
  (when-some [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (when-some [data (lookup-entry config id :kms-key-identifier)]
    (. builder kmsKeyIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
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


(defn cfn-deployment-dynamic-extension-parameters-property-builder>
  "The cfn-deployment-dynamic-extension-parameters-property-builder> function updates a CfnDeployment$DynamicExtensionParametersProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :extension-reference)]
    (. builder extensionReference data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-deployment-dynamic-extension-parameters-property-builder
  "Creates a  `CfnDeployment$DynamicExtensionParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-dynamic-extension-parameters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-dynamic-extension-parameters-property-builder> (new CfnDeployment$DynamicExtensionParametersProperty$Builder) id config))


(defn cfn-deployment-props-builder>
  "The cfn-deployment-props-builder> function updates a CfnDeploymentProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :configuration-profile-id)]
    (. builder configurationProfileId data))
  (when-some [data (lookup-entry config id :configuration-version)]
    (. builder configurationVersion data))
  (when-some [data (lookup-entry config id :deployment-strategy-id)]
    (. builder deploymentStrategyId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dynamic-extension-parameters)]
    (. builder dynamicExtensionParameters data))
  (when-some [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (when-some [data (lookup-entry config id :kms-key-identifier)]
    (. builder kmsKeyIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-deployment-props-builder
  "Creates a  `CfnDeploymentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-props-builder> (new CfnDeploymentProps$Builder) id config))


(defn cfn-deployment-strategy-builder>
  "The cfn-deployment-strategy-builder> function updates a CfnDeploymentStrategy$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-duration-in-minutes)]
    (. builder deploymentDurationInMinutes data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :final-bake-time-in-minutes)]
    (. builder finalBakeTimeInMinutes data))
  (when-some [data (lookup-entry config id :growth-factor)]
    (. builder growthFactor data))
  (when-some [data (lookup-entry config id :growth-type)]
    (. builder growthType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :replicate-to)]
    (. builder replicateTo data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-deployment-strategy-builder
  "Creates a  `CfnDeploymentStrategy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-deployment-strategy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-deployment-strategy-builder> (CfnDeploymentStrategy$Builder/create scope (name id)) id config))


(defn cfn-deployment-strategy-props-builder>
  "The cfn-deployment-strategy-props-builder> function updates a CfnDeploymentStrategyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-duration-in-minutes)]
    (. builder deploymentDurationInMinutes data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :final-bake-time-in-minutes)]
    (. builder finalBakeTimeInMinutes data))
  (when-some [data (lookup-entry config id :growth-factor)]
    (. builder growthFactor data))
  (when-some [data (lookup-entry config id :growth-type)]
    (. builder growthType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :replicate-to)]
    (. builder replicateTo data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-deployment-strategy-props-builder
  "Creates a  `CfnDeploymentStrategyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-deployment-strategy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-deployment-strategy-props-builder> (new CfnDeploymentStrategyProps$Builder) id config))


(defn cfn-environment-builder>
  "The cfn-environment-builder> function updates a CfnEnvironment$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-builder> (CfnEnvironment$Builder/create scope (name id)) id config))


(defn cfn-environment-monitor-property-builder>
  "The cfn-environment-monitor-property-builder> function updates a CfnEnvironment$MonitorProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$MonitorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
"
  [^CfnEnvironment$MonitorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-arn)]
    (. builder alarmArn data))
  (when-some [data (lookup-entry config id :alarm-role-arn)]
    (. builder alarmRoleArn data))
  (.build builder))


(defn cfn-environment-monitor-property-builder
  "Creates a  `CfnEnvironment$MonitorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-monitor-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-monitor-property-builder> (new CfnEnvironment$MonitorProperty$Builder) id config))


(defn cfn-environment-monitors-property-builder>
  "The cfn-environment-monitors-property-builder> function updates a CfnEnvironment$MonitorsProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$MonitorsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-arn` |
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
"
  [^CfnEnvironment$MonitorsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-arn)]
    (. builder alarmArn data))
  (when-some [data (lookup-entry config id :alarm-role-arn)]
    (. builder alarmRoleArn data))
  (.build builder))


(defn cfn-environment-monitors-property-builder
  "Creates a  `CfnEnvironment$MonitorsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-monitors-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-monitors-property-builder> (new CfnEnvironment$MonitorsProperty$Builder) id config))


(defn cfn-environment-props-builder>
  "The cfn-environment-props-builder> function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-props-builder> (new CfnEnvironmentProps$Builder) id config))


(defn cfn-extension-action-property-builder>
  "The cfn-extension-action-property-builder> function updates a CfnExtension$ActionProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :uri)]
    (. builder uri data))
  (.build builder))


(defn cfn-extension-action-property-builder
  "Creates a  `CfnExtension$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-extension-action-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-extension-action-property-builder> (new CfnExtension$ActionProperty$Builder) id config))


(defn cfn-extension-association-builder>
  "The cfn-extension-association-builder> function updates a CfnExtensionAssociation$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :extension-identifier)]
    (. builder extensionIdentifier data))
  (when-some [data (lookup-entry config id :extension-version-number)]
    (. builder extensionVersionNumber data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-extension-association-builder
  "Creates a  `CfnExtensionAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-extension-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-extension-association-builder> (CfnExtensionAssociation$Builder/create scope (name id)) id config))


(defn cfn-extension-association-props-builder>
  "The cfn-extension-association-props-builder> function updates a CfnExtensionAssociationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :extension-identifier)]
    (. builder extensionIdentifier data))
  (when-some [data (lookup-entry config id :extension-version-number)]
    (. builder extensionVersionNumber data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-extension-association-props-builder
  "Creates a  `CfnExtensionAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-extension-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-extension-association-props-builder> (new CfnExtensionAssociationProps$Builder) id config))


(defn cfn-extension-builder>
  "The cfn-extension-builder> function updates a CfnExtension$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-extension-builder
  "Creates a  `CfnExtension$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-extension-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-extension-builder> (CfnExtension$Builder/create scope (name id)) id config))


(defn cfn-extension-parameter-property-builder>
  "The cfn-extension-parameter-property-builder> function updates a CfnExtension$ParameterProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dynamic)]
    (. builder dynamic data))
  (when-some [data (lookup-entry config id :required)]
    (. builder required data))
  (.build builder))


(defn cfn-extension-parameter-property-builder
  "Creates a  `CfnExtension$ParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-extension-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-extension-parameter-property-builder> (new CfnExtension$ParameterProperty$Builder) id config))


(defn cfn-extension-props-builder>
  "The cfn-extension-props-builder> function updates a CfnExtensionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-extension-props-builder
  "Creates a  `CfnExtensionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-extension-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-extension-props-builder> (new CfnExtensionProps$Builder) id config))


(defn cfn-hosted-configuration-version-builder>
  "The cfn-hosted-configuration-version-builder> function updates a CfnHostedConfigurationVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :configuration-profile-id)]
    (. builder configurationProfileId data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn cfn-hosted-configuration-version-builder
  "Creates a  `CfnHostedConfigurationVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hosted-configuration-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hosted-configuration-version-builder> (CfnHostedConfigurationVersion$Builder/create scope (name id)) id config))


(defn cfn-hosted-configuration-version-props-builder>
  "The cfn-hosted-configuration-version-props-builder> function updates a CfnHostedConfigurationVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-some [data (lookup-entry config id :configuration-profile-id)]
    (. builder configurationProfileId data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn cfn-hosted-configuration-version-props-builder
  "Creates a  `CfnHostedConfigurationVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hosted-configuration-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hosted-configuration-version-props-builder> (new CfnHostedConfigurationVersionProps$Builder) id config))


(defn configuration-options-builder>
  "The configuration-options-builder> function updates a ConfigurationOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (.build builder))


(defn configuration-options-builder
  "Creates a  `ConfigurationOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[configuration-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (configuration-options-builder> (new ConfigurationOptions$Builder) id config))


(defn configuration-props-builder>
  "The configuration-props-builder> function updates a ConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (.build builder))


(defn configuration-props-builder
  "Creates a  `ConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (configuration-props-builder> (new ConfigurationProps$Builder) id config))


(defn deployment-strategy-builder>
  "The deployment-strategy-builder> function updates a DeploymentStrategy$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-strategy-name)]
    (. builder deploymentStrategyName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :rollout-strategy)]
    (. builder rolloutStrategy data))
  (.build builder))


(defn deployment-strategy-builder
  "Creates a  `DeploymentStrategy$Builder` instance using a scope and ID, applies the data configuration using the [[deployment-strategy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (deployment-strategy-builder> (DeploymentStrategy$Builder/create scope (name id)) id config))


(defn deployment-strategy-props-builder>
  "The deployment-strategy-props-builder> function updates a DeploymentStrategyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-strategy-name)]
    (. builder deploymentStrategyName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :rollout-strategy)]
    (. builder rolloutStrategy data))
  (.build builder))


(defn deployment-strategy-props-builder
  "Creates a  `DeploymentStrategyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[deployment-strategy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (deployment-strategy-props-builder> (new DeploymentStrategyProps$Builder) id config))


(defn environment-attributes-builder>
  "The environment-attributes-builder> function updates a EnvironmentAttributes$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn environment-attributes-builder
  "Creates a  `EnvironmentAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[environment-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (environment-attributes-builder> (new EnvironmentAttributes$Builder) id config))


(defn environment-builder>
  "The environment-builder> function updates a Environment$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-builder
  "Creates a  `Environment$Builder` instance using a scope and ID, applies the data configuration using the [[environment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (environment-builder> (Environment$Builder/create scope (name id)) id config))


(defn environment-options-builder>
  "The environment-options-builder> function updates a EnvironmentOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-options-builder
  "Creates a  `EnvironmentOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[environment-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (environment-options-builder> (new EnvironmentOptions$Builder) id config))


(defn environment-props-builder>
  "The environment-props-builder> function updates a EnvironmentProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-some [data (lookup-entry config id :monitors)]
    (. builder monitors data))
  (.build builder))


(defn environment-props-builder
  "Creates a  `EnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[environment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (environment-props-builder> (new EnvironmentProps$Builder) id config))


(defn extension-attributes-builder>
  "The extension-attributes-builder> function updates a ExtensionAttributes$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :extension-arn)]
    (. builder extensionArn data))
  (when-some [data (lookup-entry config id :extension-id)]
    (. builder extensionId data))
  (when-some [data (lookup-entry config id :extension-version-number)]
    (. builder extensionVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn extension-attributes-builder
  "Creates a  `ExtensionAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[extension-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (extension-attributes-builder> (new ExtensionAttributes$Builder) id config))


(defn extension-builder>
  "The extension-builder> function updates a Extension$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :extension-name)]
    (. builder extensionName data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn extension-builder
  "Creates a  `Extension$Builder` instance using a scope and ID, applies the data configuration using the [[extension-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (extension-builder> (Extension$Builder/create scope (name id)) id config))


(defn extension-options-builder>
  "The extension-options-builder> function updates a ExtensionOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :extension-name)]
    (. builder extensionName data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn extension-options-builder
  "Creates a  `ExtensionOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[extension-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (extension-options-builder> (new ExtensionOptions$Builder) id config))


(defn extension-props-builder>
  "The extension-props-builder> function updates a ExtensionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :extension-name)]
    (. builder extensionName data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn extension-props-builder
  "Creates a  `ExtensionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[extension-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (extension-props-builder> (new ExtensionProps$Builder) id config))


(defn hosted-configuration-builder>
  "The hosted-configuration-builder> function updates a HostedConfiguration$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn hosted-configuration-builder
  "Creates a  `HostedConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[hosted-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (hosted-configuration-builder> (HostedConfiguration$Builder/create scope (name id)) id config))


(defn hosted-configuration-options-builder>
  "The hosted-configuration-options-builder> function updates a HostedConfigurationOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn hosted-configuration-options-builder
  "Creates a  `HostedConfigurationOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[hosted-configuration-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (hosted-configuration-options-builder> (new HostedConfigurationOptions$Builder) id config))


(defn hosted-configuration-props-builder>
  "The hosted-configuration-props-builder> function updates a HostedConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :latest-version-number)]
    (. builder latestVersionNumber data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-label)]
    (. builder versionLabel data))
  (.build builder))


(defn hosted-configuration-props-builder
  "Creates a  `HostedConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[hosted-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (hosted-configuration-props-builder> (new HostedConfigurationProps$Builder) id config))


(defn rollout-strategy-props-builder>
  "The rollout-strategy-props-builder> function updates a RolloutStrategyProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-duration)]
    (. builder deploymentDuration data))
  (when-some [data (lookup-entry config id :final-bake-time)]
    (. builder finalBakeTime data))
  (when-some [data (lookup-entry config id :growth-factor)]
    (. builder growthFactor data))
  (.build builder))


(defn rollout-strategy-props-builder
  "Creates a  `RolloutStrategyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[rollout-strategy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (rollout-strategy-props-builder> (new RolloutStrategyProps$Builder) id config))


(defn sourced-configuration-builder>
  "The sourced-configuration-builder> function updates a SourcedConfiguration$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retrieval-role)]
    (. builder retrievalRole data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-number)]
    (. builder versionNumber data))
  (.build builder))


(defn sourced-configuration-builder
  "Creates a  `SourcedConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[sourced-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (sourced-configuration-builder> (SourcedConfiguration$Builder/create scope (name id)) id config))


(defn sourced-configuration-options-builder>
  "The sourced-configuration-options-builder> function updates a SourcedConfigurationOptions$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retrieval-role)]
    (. builder retrievalRole data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-number)]
    (. builder versionNumber data))
  (.build builder))


(defn sourced-configuration-options-builder
  "Creates a  `SourcedConfigurationOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[sourced-configuration-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sourced-configuration-options-builder> (new SourcedConfigurationOptions$Builder) id config))


(defn sourced-configuration-props-builder>
  "The sourced-configuration-props-builder> function updates a SourcedConfigurationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :deploy-to)]
    (. builder deployTo data))
  (when-some [data (lookup-entry config id :deployment-key)]
    (. builder deploymentKey data))
  (when-some [data (lookup-entry config id :deployment-strategy)]
    (. builder deploymentStrategy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retrieval-role)]
    (. builder retrievalRole data))
  (when-some [data (configuration-type config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :validators)]
    (. builder validators data))
  (when-some [data (lookup-entry config id :version-number)]
    (. builder versionNumber data))
  (.build builder))


(defn sourced-configuration-props-builder
  "Creates a  `SourcedConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sourced-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sourced-configuration-props-builder> (new SourcedConfigurationProps$Builder) id config))