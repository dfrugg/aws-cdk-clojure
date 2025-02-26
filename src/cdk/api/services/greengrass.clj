(ns cdk.api.services.greengrass
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.greengrass package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.greengrass CfnConnectorDefinition$Builder
                                                       CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder
                                                       CfnConnectorDefinition$ConnectorProperty$Builder
                                                       CfnConnectorDefinitionProps$Builder
                                                       CfnConnectorDefinitionVersion$Builder
                                                       CfnConnectorDefinitionVersion$ConnectorProperty$Builder
                                                       CfnConnectorDefinitionVersionProps$Builder
                                                       CfnCoreDefinition$Builder
                                                       CfnCoreDefinition$CoreDefinitionVersionProperty$Builder
                                                       CfnCoreDefinition$CoreProperty$Builder
                                                       CfnCoreDefinitionProps$Builder
                                                       CfnCoreDefinitionVersion$Builder
                                                       CfnCoreDefinitionVersion$CoreProperty$Builder
                                                       CfnCoreDefinitionVersionProps$Builder
                                                       CfnDeviceDefinition$Builder
                                                       CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder
                                                       CfnDeviceDefinition$DeviceProperty$Builder
                                                       CfnDeviceDefinitionProps$Builder
                                                       CfnDeviceDefinitionVersion$Builder
                                                       CfnDeviceDefinitionVersion$DeviceProperty$Builder
                                                       CfnDeviceDefinitionVersionProps$Builder
                                                       CfnFunctionDefinition$Builder
                                                       CfnFunctionDefinition$DefaultConfigProperty$Builder
                                                       CfnFunctionDefinition$EnvironmentProperty$Builder
                                                       CfnFunctionDefinition$ExecutionProperty$Builder
                                                       CfnFunctionDefinition$FunctionConfigurationProperty$Builder
                                                       CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder
                                                       CfnFunctionDefinition$FunctionProperty$Builder
                                                       CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder
                                                       CfnFunctionDefinition$RunAsProperty$Builder
                                                       CfnFunctionDefinitionProps$Builder
                                                       CfnFunctionDefinitionVersion$Builder
                                                       CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder
                                                       CfnFunctionDefinitionVersion$EnvironmentProperty$Builder
                                                       CfnFunctionDefinitionVersion$ExecutionProperty$Builder
                                                       CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder
                                                       CfnFunctionDefinitionVersion$FunctionProperty$Builder
                                                       CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder
                                                       CfnFunctionDefinitionVersion$RunAsProperty$Builder
                                                       CfnFunctionDefinitionVersionProps$Builder
                                                       CfnGroup$Builder
                                                       CfnGroup$GroupVersionProperty$Builder
                                                       CfnGroupProps$Builder
                                                       CfnGroupVersion$Builder
                                                       CfnGroupVersionProps$Builder
                                                       CfnLoggerDefinition$Builder
                                                       CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder
                                                       CfnLoggerDefinition$LoggerProperty$Builder
                                                       CfnLoggerDefinitionProps$Builder
                                                       CfnLoggerDefinitionVersion$Builder
                                                       CfnLoggerDefinitionVersion$LoggerProperty$Builder
                                                       CfnLoggerDefinitionVersionProps$Builder
                                                       CfnResourceDefinition$Builder
                                                       CfnResourceDefinition$GroupOwnerSettingProperty$Builder
                                                       CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder
                                                       CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder
                                                       CfnResourceDefinition$ResourceDataContainerProperty$Builder
                                                       CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder
                                                       CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder
                                                       CfnResourceDefinition$ResourceInstanceProperty$Builder
                                                       CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder
                                                       CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder
                                                       CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder
                                                       CfnResourceDefinitionProps$Builder
                                                       CfnResourceDefinitionVersion$Builder
                                                       CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder
                                                       CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder
                                                       CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder
                                                       CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder
                                                       CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder
                                                       CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder
                                                       CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder
                                                       CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder
                                                       CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder
                                                       CfnResourceDefinitionVersionProps$Builder
                                                       CfnSubscriptionDefinition$Builder
                                                       CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder
                                                       CfnSubscriptionDefinition$SubscriptionProperty$Builder
                                                       CfnSubscriptionDefinitionProps$Builder
                                                       CfnSubscriptionDefinitionVersion$Builder
                                                       CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder
                                                       CfnSubscriptionDefinitionVersionProps$Builder]))


(defn build-cfn-connector-definition-builder
  "The build-cfn-connector-definition-builder function updates a CfnConnectorDefinition$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectorDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connector-definition-builder
  "Creates a  `CfnConnectorDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connector-definition-builder (CfnConnectorDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-connector-definition-connector-definition-version-property-builder
  "The build-cfn-connector-definition-connector-definition-version-property-builder function updates a CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connectors` |
"
  [^CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connectors)]
    (. builder connectors data))
  (.build builder))


(defn cfn-connector-definition-connector-definition-version-property-builder
  "Creates a  `CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-definition-connector-definition-version-property-builder (new CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder) id config))


(defn build-cfn-connector-definition-connector-property-builder
  "The build-cfn-connector-definition-connector-property-builder function updates a CfnConnectorDefinition$ConnectorProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinition$ConnectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnConnectorDefinition$ConnectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-connector-definition-connector-property-builder
  "Creates a  `CfnConnectorDefinition$ConnectorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-definition-connector-property-builder (new CfnConnectorDefinition$ConnectorProperty$Builder) id config))


(defn build-cfn-connector-definition-props-builder
  "The build-cfn-connector-definition-props-builder function updates a CfnConnectorDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnConnectorDefinition$ConnectorDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectorDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connector-definition-props-builder
  "Creates a  `CfnConnectorDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-definition-props-builder (new CfnConnectorDefinitionProps$Builder) id config))


(defn build-cfn-connector-definition-version-builder
  "The build-cfn-connector-definition-version-builder function updates a CfnConnectorDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-id` |
| `connectors` | java.util.List | [[cdk.support/lookup-entry]] | `:connectors` |
"
  [^CfnConnectorDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-definition-id)]
    (. builder connectorDefinitionId data))
  (when-some [data (lookup-entry config id :connectors)]
    (. builder connectors data))
  (.build builder))


(defn cfn-connector-definition-version-builder
  "Creates a  `CfnConnectorDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connector-definition-version-builder (CfnConnectorDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-connector-definition-version-connector-property-builder
  "The build-cfn-connector-definition-version-connector-property-builder function updates a CfnConnectorDefinitionVersion$ConnectorProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinitionVersion$ConnectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnConnectorDefinitionVersion$ConnectorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-arn)]
    (. builder connectorArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-connector-definition-version-connector-property-builder
  "Creates a  `CfnConnectorDefinitionVersion$ConnectorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-definition-version-connector-property-builder (new CfnConnectorDefinitionVersion$ConnectorProperty$Builder) id config))


(defn build-cfn-connector-definition-version-props-builder
  "The build-cfn-connector-definition-version-props-builder function updates a CfnConnectorDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnConnectorDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-id` |
| `connectors` | java.util.List | [[cdk.support/lookup-entry]] | `:connectors` |
"
  [^CfnConnectorDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-definition-id)]
    (. builder connectorDefinitionId data))
  (when-some [data (lookup-entry config id :connectors)]
    (. builder connectors data))
  (.build builder))


(defn cfn-connector-definition-version-props-builder
  "Creates a  `CfnConnectorDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connector-definition-version-props-builder (new CfnConnectorDefinitionVersionProps$Builder) id config))


(defn build-cfn-core-definition-builder
  "The build-cfn-core-definition-builder function updates a CfnCoreDefinition$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnCoreDefinition$CoreDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCoreDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-core-definition-builder
  "Creates a  `CfnCoreDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-core-definition-builder (CfnCoreDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-core-definition-core-definition-version-property-builder
  "The build-cfn-core-definition-core-definition-version-property-builder function updates a CfnCoreDefinition$CoreDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinition$CoreDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cores` | java.util.List | [[cdk.support/lookup-entry]] | `:cores` |
"
  [^CfnCoreDefinition$CoreDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cores)]
    (. builder cores data))
  (.build builder))


(defn cfn-core-definition-core-definition-version-property-builder
  "Creates a  `CfnCoreDefinition$CoreDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-definition-core-definition-version-property-builder (new CfnCoreDefinition$CoreDefinitionVersionProperty$Builder) id config))


(defn build-cfn-core-definition-core-property-builder
  "The build-cfn-core-definition-core-property-builder function updates a CfnCoreDefinition$CoreProperty$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinition$CoreProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
"
  [^CfnCoreDefinition$CoreProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :sync-shadow)]
    (. builder syncShadow data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (.build builder))


(defn cfn-core-definition-core-property-builder
  "Creates a  `CfnCoreDefinition$CoreProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-definition-core-property-builder (new CfnCoreDefinition$CoreProperty$Builder) id config))


(defn build-cfn-core-definition-props-builder
  "The build-cfn-core-definition-props-builder function updates a CfnCoreDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnCoreDefinition$CoreDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCoreDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-core-definition-props-builder
  "Creates a  `CfnCoreDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-definition-props-builder (new CfnCoreDefinitionProps$Builder) id config))


(defn build-cfn-core-definition-version-builder
  "The build-cfn-core-definition-version-builder function updates a CfnCoreDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-id` |
| `cores` | java.util.List | [[cdk.support/lookup-entry]] | `:cores` |
"
  [^CfnCoreDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :core-definition-id)]
    (. builder coreDefinitionId data))
  (when-some [data (lookup-entry config id :cores)]
    (. builder cores data))
  (.build builder))


(defn cfn-core-definition-version-builder
  "Creates a  `CfnCoreDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-core-definition-version-builder (CfnCoreDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-core-definition-version-core-property-builder
  "The build-cfn-core-definition-version-core-property-builder function updates a CfnCoreDefinitionVersion$CoreProperty$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinitionVersion$CoreProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
"
  [^CfnCoreDefinitionVersion$CoreProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :sync-shadow)]
    (. builder syncShadow data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (.build builder))


(defn cfn-core-definition-version-core-property-builder
  "Creates a  `CfnCoreDefinitionVersion$CoreProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-definition-version-core-property-builder (new CfnCoreDefinitionVersion$CoreProperty$Builder) id config))


(defn build-cfn-core-definition-version-props-builder
  "The build-cfn-core-definition-version-props-builder function updates a CfnCoreDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnCoreDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-id` |
| `cores` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cores` |
"
  [^CfnCoreDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :core-definition-id)]
    (. builder coreDefinitionId data))
  (when-some [data (lookup-entry config id :cores)]
    (. builder cores data))
  (.build builder))


(defn cfn-core-definition-version-props-builder
  "Creates a  `CfnCoreDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-definition-version-props-builder (new CfnCoreDefinitionVersionProps$Builder) id config))


(defn build-cfn-device-definition-builder
  "The build-cfn-device-definition-builder function updates a CfnDeviceDefinition$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnDeviceDefinition$DeviceDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-definition-builder
  "Creates a  `CfnDeviceDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-device-definition-builder (CfnDeviceDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-device-definition-device-definition-version-property-builder
  "The build-cfn-device-definition-device-definition-version-property-builder function updates a CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |
"
  [^CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :devices)]
    (. builder devices data))
  (.build builder))


(defn cfn-device-definition-device-definition-version-property-builder
  "Creates a  `CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-definition-device-definition-version-property-builder (new CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder) id config))


(defn build-cfn-device-definition-device-property-builder
  "The build-cfn-device-definition-device-property-builder function updates a CfnDeviceDefinition$DeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinition$DeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
"
  [^CfnDeviceDefinition$DeviceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :sync-shadow)]
    (. builder syncShadow data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (.build builder))


(defn cfn-device-definition-device-property-builder
  "Creates a  `CfnDeviceDefinition$DeviceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-definition-device-property-builder (new CfnDeviceDefinition$DeviceProperty$Builder) id config))


(defn build-cfn-device-definition-props-builder
  "The build-cfn-device-definition-props-builder function updates a CfnDeviceDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-definition-props-builder
  "Creates a  `CfnDeviceDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-definition-props-builder (new CfnDeviceDefinitionProps$Builder) id config))


(defn build-cfn-device-definition-version-builder
  "The build-cfn-device-definition-version-builder function updates a CfnDeviceDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-id` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |
"
  [^CfnDeviceDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :device-definition-id)]
    (. builder deviceDefinitionId data))
  (when-some [data (lookup-entry config id :devices)]
    (. builder devices data))
  (.build builder))


(defn cfn-device-definition-version-builder
  "Creates a  `CfnDeviceDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-device-definition-version-builder (CfnDeviceDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-device-definition-version-device-property-builder
  "The build-cfn-device-definition-version-device-property-builder function updates a CfnDeviceDefinitionVersion$DeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinitionVersion$DeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
"
  [^CfnDeviceDefinitionVersion$DeviceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :sync-shadow)]
    (. builder syncShadow data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (.build builder))


(defn cfn-device-definition-version-device-property-builder
  "Creates a  `CfnDeviceDefinitionVersion$DeviceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-definition-version-device-property-builder (new CfnDeviceDefinitionVersion$DeviceProperty$Builder) id config))


(defn build-cfn-device-definition-version-props-builder
  "The build-cfn-device-definition-version-props-builder function updates a CfnDeviceDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-id` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |
"
  [^CfnDeviceDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :device-definition-id)]
    (. builder deviceDefinitionId data))
  (when-some [data (lookup-entry config id :devices)]
    (. builder devices data))
  (.build builder))


(defn cfn-device-definition-version-props-builder
  "Creates a  `CfnDeviceDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-definition-version-props-builder (new CfnDeviceDefinitionVersionProps$Builder) id config))


(defn build-cfn-function-definition-builder
  "The build-cfn-function-definition-builder function updates a CfnFunctionDefinition$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFunctionDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-function-definition-builder
  "Creates a  `CfnFunctionDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-function-definition-builder (CfnFunctionDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-function-definition-default-config-property-builder
  "The build-cfn-function-definition-default-config-property-builder function updates a CfnFunctionDefinition$DefaultConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$DefaultConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |
"
  [^CfnFunctionDefinition$DefaultConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution)]
    (. builder execution data))
  (.build builder))


(defn cfn-function-definition-default-config-property-builder
  "Creates a  `CfnFunctionDefinition$DefaultConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-default-config-property-builder (new CfnFunctionDefinition$DefaultConfigProperty$Builder) id config))


(defn build-cfn-function-definition-environment-property-builder
  "The build-cfn-function-definition-environment-property-builder function updates a CfnFunctionDefinition$EnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$EnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessSysfs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-sysfs` |
| `execution` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$ExecutionProperty | [[cdk.support/lookup-entry]] | `:execution` |
| `resourceAccessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-access-policies` |
| `variables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnFunctionDefinition$EnvironmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-sysfs)]
    (. builder accessSysfs data))
  (when-some [data (lookup-entry config id :execution)]
    (. builder execution data))
  (when-some [data (lookup-entry config id :resource-access-policies)]
    (. builder resourceAccessPolicies data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-function-definition-environment-property-builder
  "Creates a  `CfnFunctionDefinition$EnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-environment-property-builder (new CfnFunctionDefinition$EnvironmentProperty$Builder) id config))


(defn build-cfn-function-definition-execution-property-builder
  "The build-cfn-function-definition-execution-property-builder function updates a CfnFunctionDefinition$ExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$ExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |
| `runAs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-as` |
"
  [^CfnFunctionDefinition$ExecutionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :isolation-mode)]
    (. builder isolationMode data))
  (when-some [data (lookup-entry config id :run-as)]
    (. builder runAs data))
  (.build builder))


(defn cfn-function-definition-execution-property-builder
  "Creates a  `CfnFunctionDefinition$ExecutionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-execution-property-builder (new CfnFunctionDefinition$ExecutionProperty$Builder) id config))


(defn build-cfn-function-definition-function-configuration-property-builder
  "The build-cfn-function-definition-function-configuration-property-builder function updates a CfnFunctionDefinition$FunctionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$FunctionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-type` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `execArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:exec-args` |
| `executable` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `pinned` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pinned` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnFunctionDefinition$FunctionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encoding-type)]
    (. builder encodingType data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :exec-args)]
    (. builder execArgs data))
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-some [data (lookup-entry config id :pinned)]
    (. builder pinned data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-function-definition-function-configuration-property-builder
  "Creates a  `CfnFunctionDefinition$FunctionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-function-configuration-property-builder (new CfnFunctionDefinition$FunctionConfigurationProperty$Builder) id config))


(defn build-cfn-function-definition-function-definition-version-property-builder
  "The build-cfn-function-definition-function-definition-version-property-builder function updates a CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$DefaultConfigProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |
"
  [^CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-config)]
    (. builder defaultConfig data))
  (when-some [data (lookup-entry config id :functions)]
    (. builder functions data))
  (.build builder))


(defn cfn-function-definition-function-definition-version-property-builder
  "Creates a  `CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-function-definition-version-property-builder (new CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder) id config))


(defn build-cfn-function-definition-function-property-builder
  "The build-cfn-function-definition-function-property-builder function updates a CfnFunctionDefinition$FunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$FunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-configuration` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnFunctionDefinition$FunctionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :function-configuration)]
    (. builder functionConfiguration data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-function-definition-function-property-builder
  "Creates a  `CfnFunctionDefinition$FunctionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-function-property-builder (new CfnFunctionDefinition$FunctionProperty$Builder) id config))


(defn build-cfn-function-definition-props-builder
  "The build-cfn-function-definition-props-builder function updates a CfnFunctionDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$FunctionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFunctionDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-function-definition-props-builder
  "Creates a  `CfnFunctionDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-props-builder (new CfnFunctionDefinitionProps$Builder) id config))


(defn build-cfn-function-definition-resource-access-policy-property-builder
  "The build-cfn-function-definition-resource-access-policy-property-builder function updates a CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :permission)]
    (. builder permission data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-function-definition-resource-access-policy-property-builder
  "Creates a  `CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-resource-access-policy-property-builder (new CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder) id config))


(defn build-cfn-function-definition-run-as-property-builder
  "The build-cfn-function-definition-run-as-property-builder function updates a CfnFunctionDefinition$RunAsProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinition$RunAsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnFunctionDefinition$RunAsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-some [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-function-definition-run-as-property-builder
  "Creates a  `CfnFunctionDefinition$RunAsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-run-as-property-builder (new CfnFunctionDefinition$RunAsProperty$Builder) id config))


(defn build-cfn-function-definition-version-builder
  "The build-cfn-function-definition-version-builder function updates a CfnFunctionDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-config` |
| `functionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-id` |
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |
"
  [^CfnFunctionDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :default-config)]
    (. builder defaultConfig data))
  (when-some [data (lookup-entry config id :function-definition-id)]
    (. builder functionDefinitionId data))
  (when-some [data (lookup-entry config id :functions)]
    (. builder functions data))
  (.build builder))


(defn cfn-function-definition-version-builder
  "Creates a  `CfnFunctionDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-function-definition-version-builder (CfnFunctionDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-function-definition-version-default-config-property-builder
  "The build-cfn-function-definition-version-default-config-property-builder function updates a CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |
"
  [^CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution)]
    (. builder execution data))
  (.build builder))


(defn cfn-function-definition-version-default-config-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-default-config-property-builder (new CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder) id config))


(defn build-cfn-function-definition-version-environment-property-builder
  "The build-cfn-function-definition-version-environment-property-builder function updates a CfnFunctionDefinitionVersion$EnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$EnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessSysfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-sysfs` |
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |
| `resourceAccessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-access-policies` |
| `variables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnFunctionDefinitionVersion$EnvironmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-sysfs)]
    (. builder accessSysfs data))
  (when-some [data (lookup-entry config id :execution)]
    (. builder execution data))
  (when-some [data (lookup-entry config id :resource-access-policies)]
    (. builder resourceAccessPolicies data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-function-definition-version-environment-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$EnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-environment-property-builder (new CfnFunctionDefinitionVersion$EnvironmentProperty$Builder) id config))


(defn build-cfn-function-definition-version-execution-property-builder
  "The build-cfn-function-definition-version-execution-property-builder function updates a CfnFunctionDefinitionVersion$ExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$ExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |
| `runAs` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$RunAsProperty | [[cdk.support/lookup-entry]] | `:run-as` |
"
  [^CfnFunctionDefinitionVersion$ExecutionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :isolation-mode)]
    (. builder isolationMode data))
  (when-some [data (lookup-entry config id :run-as)]
    (. builder runAs data))
  (.build builder))


(defn cfn-function-definition-version-execution-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$ExecutionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-execution-property-builder (new CfnFunctionDefinitionVersion$ExecutionProperty$Builder) id config))


(defn build-cfn-function-definition-version-function-configuration-property-builder
  "The build-cfn-function-definition-version-function-configuration-property-builder function updates a CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-type` |
| `environment` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$EnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `execArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:exec-args` |
| `executable` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `pinned` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pinned` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encoding-type)]
    (. builder encodingType data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :exec-args)]
    (. builder execArgs data))
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-some [data (lookup-entry config id :pinned)]
    (. builder pinned data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-function-definition-version-function-configuration-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-function-configuration-property-builder (new CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder) id config))


(defn build-cfn-function-definition-version-function-property-builder
  "The build-cfn-function-definition-version-function-property-builder function updates a CfnFunctionDefinitionVersion$FunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$FunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionConfiguration` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$FunctionConfigurationProperty | [[cdk.support/lookup-entry]] | `:function-configuration` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnFunctionDefinitionVersion$FunctionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :function-configuration)]
    (. builder functionConfiguration data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-function-definition-version-function-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$FunctionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-function-property-builder (new CfnFunctionDefinitionVersion$FunctionProperty$Builder) id config))


(defn build-cfn-function-definition-version-props-builder
  "The build-cfn-function-definition-version-props-builder function updates a CfnFunctionDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$DefaultConfigProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `functionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-id` |
| `functions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:functions` |
"
  [^CfnFunctionDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-config)]
    (. builder defaultConfig data))
  (when-some [data (lookup-entry config id :function-definition-id)]
    (. builder functionDefinitionId data))
  (when-some [data (lookup-entry config id :functions)]
    (. builder functions data))
  (.build builder))


(defn cfn-function-definition-version-props-builder
  "Creates a  `CfnFunctionDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-props-builder (new CfnFunctionDefinitionVersionProps$Builder) id config))


(defn build-cfn-function-definition-version-resource-access-policy-property-builder
  "The build-cfn-function-definition-version-resource-access-policy-property-builder function updates a CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :permission)]
    (. builder permission data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-function-definition-version-resource-access-policy-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-resource-access-policy-property-builder (new CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder) id config))


(defn build-cfn-function-definition-version-run-as-property-builder
  "The build-cfn-function-definition-version-run-as-property-builder function updates a CfnFunctionDefinitionVersion$RunAsProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionDefinitionVersion$RunAsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |
"
  [^CfnFunctionDefinitionVersion$RunAsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-some [data (lookup-entry config id :uid)]
    (. builder uid data))
  (.build builder))


(defn cfn-function-definition-version-run-as-property-builder
  "Creates a  `CfnFunctionDefinitionVersion$RunAsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-function-definition-version-run-as-property-builder (new CfnFunctionDefinitionVersion$RunAsProperty$Builder) id config))


(defn build-cfn-group-builder
  "The build-cfn-group-builder function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnGroup$GroupVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-builder
  "Creates a  `CfnGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-group-builder (CfnGroup$Builder/create scope (name id)) id config))


(defn build-cfn-group-group-version-property-builder
  "The build-cfn-group-group-version-property-builder function updates a CfnGroup$GroupVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$GroupVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |
"
  [^CfnGroup$GroupVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-definition-version-arn)]
    (. builder connectorDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :core-definition-version-arn)]
    (. builder coreDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :device-definition-version-arn)]
    (. builder deviceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :function-definition-version-arn)]
    (. builder functionDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :logger-definition-version-arn)]
    (. builder loggerDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :resource-definition-version-arn)]
    (. builder resourceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :subscription-definition-version-arn)]
    (. builder subscriptionDefinitionVersionArn data))
  (.build builder))


(defn cfn-group-group-version-property-builder
  "Creates a  `CfnGroup$GroupVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-group-group-version-property-builder (new CfnGroup$GroupVersionProperty$Builder) id config))


(defn build-cfn-group-props-builder
  "The build-cfn-group-props-builder function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-group-props-builder
  "Creates a  `CfnGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-group-props-builder (new CfnGroupProps$Builder) id config))


(defn build-cfn-group-version-builder
  "The build-cfn-group-version-builder function updates a CfnGroupVersion$Builder instance using the provided configuration.
  The function takes the CfnGroupVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |
"
  [^CfnGroupVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-definition-version-arn)]
    (. builder connectorDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :core-definition-version-arn)]
    (. builder coreDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :device-definition-version-arn)]
    (. builder deviceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :function-definition-version-arn)]
    (. builder functionDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-some [data (lookup-entry config id :logger-definition-version-arn)]
    (. builder loggerDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :resource-definition-version-arn)]
    (. builder resourceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :subscription-definition-version-arn)]
    (. builder subscriptionDefinitionVersionArn data))
  (.build builder))


(defn cfn-group-version-builder
  "Creates a  `CfnGroupVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-group-version-builder (CfnGroupVersion$Builder/create scope (name id)) id config))


(defn build-cfn-group-version-props-builder
  "The build-cfn-group-version-props-builder function updates a CfnGroupVersionProps$Builder instance using the provided configuration.
  The function takes the CfnGroupVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |
"
  [^CfnGroupVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connector-definition-version-arn)]
    (. builder connectorDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :core-definition-version-arn)]
    (. builder coreDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :device-definition-version-arn)]
    (. builder deviceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :function-definition-version-arn)]
    (. builder functionDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-some [data (lookup-entry config id :logger-definition-version-arn)]
    (. builder loggerDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :resource-definition-version-arn)]
    (. builder resourceDefinitionVersionArn data))
  (when-some [data (lookup-entry config id :subscription-definition-version-arn)]
    (. builder subscriptionDefinitionVersionArn data))
  (.build builder))


(defn cfn-group-version-props-builder
  "Creates a  `CfnGroupVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-group-version-props-builder (new CfnGroupVersionProps$Builder) id config))


(defn build-cfn-logger-definition-builder
  "The build-cfn-logger-definition-builder function updates a CfnLoggerDefinition$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnLoggerDefinition$LoggerDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLoggerDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-logger-definition-builder
  "Creates a  `CfnLoggerDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-logger-definition-builder (CfnLoggerDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-logger-definition-logger-definition-version-property-builder
  "The build-cfn-logger-definition-logger-definition-version-property-builder function updates a CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggers` | java.util.List | [[cdk.support/lookup-entry]] | `:loggers` |
"
  [^CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :loggers)]
    (. builder loggers data))
  (.build builder))


(defn cfn-logger-definition-logger-definition-version-property-builder
  "Creates a  `CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logger-definition-logger-definition-version-property-builder (new CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder) id config))


(defn build-cfn-logger-definition-logger-property-builder
  "The build-cfn-logger-definition-logger-property-builder function updates a CfnLoggerDefinition$LoggerProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinition$LoggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `component` | java.lang.String | [[cdk.support/lookup-entry]] | `:component` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `space` | java.lang.Number | [[cdk.support/lookup-entry]] | `:space` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLoggerDefinition$LoggerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component)]
    (. builder component data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :level)]
    (. builder level data))
  (when-some [data (lookup-entry config id :space)]
    (. builder space data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-logger-definition-logger-property-builder
  "Creates a  `CfnLoggerDefinition$LoggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logger-definition-logger-property-builder (new CfnLoggerDefinition$LoggerProperty$Builder) id config))


(defn build-cfn-logger-definition-props-builder
  "The build-cfn-logger-definition-props-builder function updates a CfnLoggerDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLoggerDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-logger-definition-props-builder
  "Creates a  `CfnLoggerDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logger-definition-props-builder (new CfnLoggerDefinitionProps$Builder) id config))


(defn build-cfn-logger-definition-version-builder
  "The build-cfn-logger-definition-version-builder function updates a CfnLoggerDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggerDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-id` |
| `loggers` | java.util.List | [[cdk.support/lookup-entry]] | `:loggers` |
"
  [^CfnLoggerDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :logger-definition-id)]
    (. builder loggerDefinitionId data))
  (when-some [data (lookup-entry config id :loggers)]
    (. builder loggers data))
  (.build builder))


(defn cfn-logger-definition-version-builder
  "Creates a  `CfnLoggerDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-logger-definition-version-builder (CfnLoggerDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-logger-definition-version-logger-property-builder
  "The build-cfn-logger-definition-version-logger-property-builder function updates a CfnLoggerDefinitionVersion$LoggerProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinitionVersion$LoggerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `component` | java.lang.String | [[cdk.support/lookup-entry]] | `:component` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `space` | java.lang.Number | [[cdk.support/lookup-entry]] | `:space` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLoggerDefinitionVersion$LoggerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :component)]
    (. builder component data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :level)]
    (. builder level data))
  (when-some [data (lookup-entry config id :space)]
    (. builder space data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-logger-definition-version-logger-property-builder
  "Creates a  `CfnLoggerDefinitionVersion$LoggerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logger-definition-version-logger-property-builder (new CfnLoggerDefinitionVersion$LoggerProperty$Builder) id config))


(defn build-cfn-logger-definition-version-props-builder
  "The build-cfn-logger-definition-version-props-builder function updates a CfnLoggerDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnLoggerDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggerDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-id` |
| `loggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:loggers` |
"
  [^CfnLoggerDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :logger-definition-id)]
    (. builder loggerDefinitionId data))
  (when-some [data (lookup-entry config id :loggers)]
    (. builder loggers data))
  (.build builder))


(defn cfn-logger-definition-version-props-builder
  "Creates a  `CfnLoggerDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-logger-definition-version-props-builder (new CfnLoggerDefinitionVersionProps$Builder) id config))


(defn build-cfn-resource-definition-builder
  "The build-cfn-resource-definition-builder function updates a CfnResourceDefinition$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-definition-builder
  "Creates a  `CfnResourceDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-definition-builder (CfnResourceDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-resource-definition-group-owner-setting-property-builder
  "The build-cfn-resource-definition-group-owner-setting-property-builder function updates a CfnResourceDefinition$GroupOwnerSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$GroupOwnerSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAddGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-add-group-owner` |
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
"
  [^CfnResourceDefinition$GroupOwnerSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-add-group-owner)]
    (. builder autoAddGroupOwner data))
  (when-some [data (lookup-entry config id :group-owner)]
    (. builder groupOwner data))
  (.build builder))


(defn cfn-resource-definition-group-owner-setting-property-builder
  "Creates a  `CfnResourceDefinition$GroupOwnerSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-group-owner-setting-property-builder (new CfnResourceDefinition$GroupOwnerSettingProperty$Builder) id config))


(defn build-cfn-resource-definition-local-device-resource-data-property-builder
  "The build-cfn-resource-definition-local-device-resource-data-property-builder function updates a CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwnerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-owner-setting)]
    (. builder groupOwnerSetting data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-resource-definition-local-device-resource-data-property-builder
  "Creates a  `CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-local-device-resource-data-property-builder (new CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-local-volume-resource-data-property-builder
  "The build-cfn-resource-definition-local-volume-resource-data-property-builder function updates a CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `groupOwnerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$GroupOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :group-owner-setting)]
    (. builder groupOwnerSetting data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-resource-definition-local-volume-resource-data-property-builder
  "Creates a  `CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-local-volume-resource-data-property-builder (new CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-props-builder
  "The build-cfn-resource-definition-props-builder function updates a CfnResourceDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$ResourceDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-definition-props-builder
  "Creates a  `CfnResourceDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-props-builder (new CfnResourceDefinitionProps$Builder) id config))


(defn build-cfn-resource-definition-resource-data-container-property-builder
  "The build-cfn-resource-definition-resource-data-container-property-builder function updates a CfnResourceDefinition$ResourceDataContainerProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$ResourceDataContainerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localDeviceResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$LocalDeviceResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-device-resource-data` |
| `localVolumeResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$LocalVolumeResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-volume-resource-data` |
| `s3MachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-machine-learning-model-resource-data` |
| `sageMakerMachineLearningModelResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty | [[cdk.support/lookup-entry]] | `:sage-maker-machine-learning-model-resource-data` |
| `secretsManagerSecretResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$SecretsManagerSecretResourceDataProperty | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-resource-data` |
"
  [^CfnResourceDefinition$ResourceDataContainerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :local-device-resource-data)]
    (. builder localDeviceResourceData data))
  (when-some [data (lookup-entry config id :local-volume-resource-data)]
    (. builder localVolumeResourceData data))
  (when-some [data (lookup-entry config id :s3-machine-learning-model-resource-data)]
    (. builder s3MachineLearningModelResourceData data))
  (when-some [data (lookup-entry config id :sage-maker-machine-learning-model-resource-data)]
    (. builder sageMakerMachineLearningModelResourceData data))
  (when-some [data (lookup-entry config id :secrets-manager-secret-resource-data)]
    (. builder secretsManagerSecretResourceData data))
  (.build builder))


(defn cfn-resource-definition-resource-data-container-property-builder
  "Creates a  `CfnResourceDefinition$ResourceDataContainerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-resource-data-container-property-builder (new CfnResourceDefinition$ResourceDataContainerProperty$Builder) id config))


(defn build-cfn-resource-definition-resource-definition-version-property-builder
  "The build-cfn-resource-definition-resource-definition-version-property-builder function updates a CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
"
  [^CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (.build builder))


(defn cfn-resource-definition-resource-definition-version-property-builder
  "Creates a  `CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-resource-definition-version-property-builder (new CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder) id config))


(defn build-cfn-resource-definition-resource-download-owner-setting-property-builder
  "The build-cfn-resource-definition-resource-download-owner-setting-property-builder function updates a CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
| `groupPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-permission` |
"
  [^CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-owner)]
    (. builder groupOwner data))
  (when-some [data (lookup-entry config id :group-permission)]
    (. builder groupPermission data))
  (.build builder))


(defn cfn-resource-definition-resource-download-owner-setting-property-builder
  "Creates a  `CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-resource-download-owner-setting-property-builder (new CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder) id config))


(defn build-cfn-resource-definition-resource-instance-property-builder
  "The build-cfn-resource-definition-resource-instance-property-builder function updates a CfnResourceDefinition$ResourceInstanceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$ResourceInstanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceDataContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-data-container` |
"
  [^CfnResourceDefinition$ResourceInstanceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-data-container)]
    (. builder resourceDataContainer data))
  (.build builder))


(defn cfn-resource-definition-resource-instance-property-builder
  "Creates a  `CfnResourceDefinition$ResourceInstanceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-resource-instance-property-builder (new CfnResourceDefinition$ResourceInstanceProperty$Builder) id config))


(defn build-cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder
  "The build-cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder function updates a CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :owner-setting)]
    (. builder ownerSetting data))
  (when-some [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder
  "Creates a  `CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder (new CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder
  "The build-cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder function updates a CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `sageMakerJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-job-arn` |
"
  [^CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :owner-setting)]
    (. builder ownerSetting data))
  (when-some [data (lookup-entry config id :sage-maker-job-arn)]
    (. builder sageMakerJobArn data))
  (.build builder))


(defn cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder
  "Creates a  `CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder (new CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-secrets-manager-secret-resource-data-property-builder
  "The build-cfn-resource-definition-secrets-manager-secret-resource-data-property-builder function updates a CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStagingLabelsToDownload` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-staging-labels-to-download` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-staging-labels-to-download)]
    (. builder additionalStagingLabelsToDownload data))
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-resource-definition-secrets-manager-secret-resource-data-property-builder
  "Creates a  `CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-secrets-manager-secret-resource-data-property-builder (new CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-version-builder
  "The build-cfn-resource-definition-version-builder function updates a CfnResourceDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-id` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
"
  [^CfnResourceDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-definition-id)]
    (. builder resourceDefinitionId data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (.build builder))


(defn cfn-resource-definition-version-builder
  "Creates a  `CfnResourceDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-definition-version-builder (CfnResourceDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-resource-definition-version-group-owner-setting-property-builder
  "The build-cfn-resource-definition-version-group-owner-setting-property-builder function updates a CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAddGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-add-group-owner` |
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
"
  [^CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-add-group-owner)]
    (. builder autoAddGroupOwner data))
  (when-some [data (lookup-entry config id :group-owner)]
    (. builder groupOwner data))
  (.build builder))


(defn cfn-resource-definition-version-group-owner-setting-property-builder
  "Creates a  `CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-group-owner-setting-property-builder (new CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder) id config))


(defn build-cfn-resource-definition-version-local-device-resource-data-property-builder
  "The build-cfn-resource-definition-version-local-device-resource-data-property-builder function updates a CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwnerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-owner-setting)]
    (. builder groupOwnerSetting data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-resource-definition-version-local-device-resource-data-property-builder
  "Creates a  `CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-local-device-resource-data-property-builder (new CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-version-local-volume-resource-data-property-builder
  "The build-cfn-resource-definition-version-local-volume-resource-data-property-builder function updates a CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `groupOwnerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$GroupOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :group-owner-setting)]
    (. builder groupOwnerSetting data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-resource-definition-version-local-volume-resource-data-property-builder
  "Creates a  `CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-local-volume-resource-data-property-builder (new CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-version-props-builder
  "The build-cfn-resource-definition-version-props-builder function updates a CfnResourceDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-id` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |
"
  [^CfnResourceDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-definition-id)]
    (. builder resourceDefinitionId data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (.build builder))


(defn cfn-resource-definition-version-props-builder
  "Creates a  `CfnResourceDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-props-builder (new CfnResourceDefinitionVersionProps$Builder) id config))


(defn build-cfn-resource-definition-version-resource-data-container-property-builder
  "The build-cfn-resource-definition-version-resource-data-container-property-builder function updates a CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localDeviceResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-device-resource-data` |
| `localVolumeResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-volume-resource-data` |
| `s3MachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-machine-learning-model-resource-data` |
| `sageMakerMachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sage-maker-machine-learning-model-resource-data` |
| `secretsManagerSecretResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-resource-data` |
"
  [^CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :local-device-resource-data)]
    (. builder localDeviceResourceData data))
  (when-some [data (lookup-entry config id :local-volume-resource-data)]
    (. builder localVolumeResourceData data))
  (when-some [data (lookup-entry config id :s3-machine-learning-model-resource-data)]
    (. builder s3MachineLearningModelResourceData data))
  (when-some [data (lookup-entry config id :sage-maker-machine-learning-model-resource-data)]
    (. builder sageMakerMachineLearningModelResourceData data))
  (when-some [data (lookup-entry config id :secrets-manager-secret-resource-data)]
    (. builder secretsManagerSecretResourceData data))
  (.build builder))


(defn cfn-resource-definition-version-resource-data-container-property-builder
  "Creates a  `CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-resource-data-container-property-builder (new CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder) id config))


(defn build-cfn-resource-definition-version-resource-download-owner-setting-property-builder
  "The build-cfn-resource-definition-version-resource-download-owner-setting-property-builder function updates a CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
| `groupPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-permission` |
"
  [^CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-owner)]
    (. builder groupOwner data))
  (when-some [data (lookup-entry config id :group-permission)]
    (. builder groupPermission data))
  (.build builder))


(defn cfn-resource-definition-version-resource-download-owner-setting-property-builder
  "Creates a  `CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-resource-download-owner-setting-property-builder (new CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder) id config))


(defn build-cfn-resource-definition-version-resource-instance-property-builder
  "The build-cfn-resource-definition-version-resource-instance-property-builder function updates a CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceDataContainer` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDataContainerProperty | [[cdk.support/lookup-entry]] | `:resource-data-container` |
"
  [^CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-data-container)]
    (. builder resourceDataContainer data))
  (.build builder))


(defn cfn-resource-definition-version-resource-instance-property-builder
  "Creates a  `CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-resource-instance-property-builder (new CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder) id config))


(defn build-cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder
  "The build-cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder function updates a CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
"
  [^CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :owner-setting)]
    (. builder ownerSetting data))
  (when-some [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (.build builder))


(defn cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder
  "Creates a  `CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder (new CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder
  "The build-cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder function updates a CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `sageMakerJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-job-arn` |
"
  [^CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-path)]
    (. builder destinationPath data))
  (when-some [data (lookup-entry config id :owner-setting)]
    (. builder ownerSetting data))
  (when-some [data (lookup-entry config id :sage-maker-job-arn)]
    (. builder sageMakerJobArn data))
  (.build builder))


(defn cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder
  "Creates a  `CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder (new CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder) id config))


(defn build-cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder
  "The build-cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder function updates a CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStagingLabelsToDownload` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-staging-labels-to-download` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-staging-labels-to-download)]
    (. builder additionalStagingLabelsToDownload data))
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder
  "Creates a  `CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder (new CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder) id config))


(defn build-cfn-subscription-definition-builder
  "The build-cfn-subscription-definition-builder function updates a CfnSubscriptionDefinition$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubscriptionDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subscription-definition-builder
  "Creates a  `CfnSubscriptionDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-subscription-definition-builder (CfnSubscriptionDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-subscription-definition-props-builder
  "The build-cfn-subscription-definition-props-builder function updates a CfnSubscriptionDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSubscriptionDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :initial-version)]
    (. builder initialVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-subscription-definition-props-builder
  "Creates a  `CfnSubscriptionDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscription-definition-props-builder (new CfnSubscriptionDefinitionProps$Builder) id config))


(defn build-cfn-subscription-definition-subscription-definition-version-property-builder
  "The build-cfn-subscription-definition-subscription-definition-version-property-builder function updates a CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscriptions` |
"
  [^CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :subscriptions)]
    (. builder subscriptions data))
  (.build builder))


(defn cfn-subscription-definition-subscription-definition-version-property-builder
  "Creates a  `CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscription-definition-subscription-definition-version-property-builder (new CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder) id config))


(defn build-cfn-subscription-definition-subscription-property-builder
  "The build-cfn-subscription-definition-subscription-property-builder function updates a CfnSubscriptionDefinition$SubscriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinition$SubscriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnSubscriptionDefinition$SubscriptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-subscription-definition-subscription-property-builder
  "Creates a  `CfnSubscriptionDefinition$SubscriptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscription-definition-subscription-property-builder (new CfnSubscriptionDefinition$SubscriptionProperty$Builder) id config))


(defn build-cfn-subscription-definition-version-builder
  "The build-cfn-subscription-definition-version-builder function updates a CfnSubscriptionDefinitionVersion$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinitionVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-id` |
| `subscriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscriptions` |
"
  [^CfnSubscriptionDefinitionVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :subscription-definition-id)]
    (. builder subscriptionDefinitionId data))
  (when-some [data (lookup-entry config id :subscriptions)]
    (. builder subscriptions data))
  (.build builder))


(defn cfn-subscription-definition-version-builder
  "Creates a  `CfnSubscriptionDefinitionVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-subscription-definition-version-builder (CfnSubscriptionDefinitionVersion$Builder/create scope (name id)) id config))


(defn build-cfn-subscription-definition-version-props-builder
  "The build-cfn-subscription-definition-version-props-builder function updates a CfnSubscriptionDefinitionVersionProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinitionVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-id` |
| `subscriptions` | java.util.List | [[cdk.support/lookup-entry]] | `:subscriptions` |
"
  [^CfnSubscriptionDefinitionVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :subscription-definition-id)]
    (. builder subscriptionDefinitionId data))
  (when-some [data (lookup-entry config id :subscriptions)]
    (. builder subscriptions data))
  (.build builder))


(defn cfn-subscription-definition-version-props-builder
  "Creates a  `CfnSubscriptionDefinitionVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscription-definition-version-props-builder (new CfnSubscriptionDefinitionVersionProps$Builder) id config))


(defn build-cfn-subscription-definition-version-subscription-property-builder
  "The build-cfn-subscription-definition-version-subscription-property-builder function updates a CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-subscription-definition-version-subscription-property-builder
  "Creates a  `CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-subscription-definition-version-subscription-property-builder (new CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder) id config))