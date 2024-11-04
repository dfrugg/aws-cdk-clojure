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


(defn cfn-connector-definition-builder
  "The cfn-connector-definition-builder function buildes out new instances of 
CfnConnectorDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectorDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-connector-definition-connector-definition-version-property-builder
  "The cfn-connector-definition-connector-definition-version-property-builder function buildes out new instances of 
CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connectors` |"
  [stack id config]
  (let [builder (CfnConnectorDefinition$ConnectorDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :connectors)]
      (. builder connectors data))
    (.build builder)))


(defn cfn-connector-definition-connector-property-builder
  "The cfn-connector-definition-connector-property-builder function buildes out new instances of 
CfnConnectorDefinition$ConnectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnConnectorDefinition$ConnectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-connector-definition-props-builder
  "The cfn-connector-definition-props-builder function buildes out new instances of 
CfnConnectorDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnConnectorDefinition$ConnectorDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectorDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-connector-definition-version-builder
  "The cfn-connector-definition-version-builder function buildes out new instances of 
CfnConnectorDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-id` |
| `connectors` | java.util.List | [[cdk.support/lookup-entry]] | `:connectors` |"
  [stack id config]
  (let [builder (CfnConnectorDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connector-definition-id)]
      (. builder connectorDefinitionId data))
    (when-let [data (lookup-entry config id :connectors)]
      (. builder connectors data))
    (.build builder)))


(defn cfn-connector-definition-version-connector-property-builder
  "The cfn-connector-definition-version-connector-property-builder function buildes out new instances of 
CfnConnectorDefinitionVersion$ConnectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnConnectorDefinitionVersion$ConnectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-arn)]
      (. builder connectorArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-connector-definition-version-props-builder
  "The cfn-connector-definition-version-props-builder function buildes out new instances of 
CfnConnectorDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-id` |
| `connectors` | java.util.List | [[cdk.support/lookup-entry]] | `:connectors` |"
  [stack id config]
  (let [builder (CfnConnectorDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :connector-definition-id)]
      (. builder connectorDefinitionId data))
    (when-let [data (lookup-entry config id :connectors)]
      (. builder connectors data))
    (.build builder)))


(defn cfn-core-definition-builder
  "The cfn-core-definition-builder function buildes out new instances of 
CfnCoreDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnCoreDefinition$CoreDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCoreDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-core-definition-core-definition-version-property-builder
  "The cfn-core-definition-core-definition-version-property-builder function buildes out new instances of 
CfnCoreDefinition$CoreDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cores` | java.util.List | [[cdk.support/lookup-entry]] | `:cores` |"
  [stack id config]
  (let [builder (CfnCoreDefinition$CoreDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cores)]
      (. builder cores data))
    (.build builder)))


(defn cfn-core-definition-core-property-builder
  "The cfn-core-definition-core-property-builder function buildes out new instances of 
CfnCoreDefinition$CoreProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |"
  [stack id config]
  (let [builder (CfnCoreDefinition$CoreProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :sync-shadow)]
      (. builder syncShadow data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (.build builder)))


(defn cfn-core-definition-props-builder
  "The cfn-core-definition-props-builder function buildes out new instances of 
CfnCoreDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnCoreDefinition$CoreDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCoreDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-core-definition-version-builder
  "The cfn-core-definition-version-builder function buildes out new instances of 
CfnCoreDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-id` |
| `cores` | java.util.List | [[cdk.support/lookup-entry]] | `:cores` |"
  [stack id config]
  (let [builder (CfnCoreDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :core-definition-id)]
      (. builder coreDefinitionId data))
    (when-let [data (lookup-entry config id :cores)]
      (. builder cores data))
    (.build builder)))


(defn cfn-core-definition-version-core-property-builder
  "The cfn-core-definition-version-core-property-builder function buildes out new instances of 
CfnCoreDefinitionVersion$CoreProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |"
  [stack id config]
  (let [builder (CfnCoreDefinitionVersion$CoreProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :sync-shadow)]
      (. builder syncShadow data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (.build builder)))


(defn cfn-core-definition-version-props-builder
  "The cfn-core-definition-version-props-builder function buildes out new instances of 
CfnCoreDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-id` |
| `cores` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cores` |"
  [stack id config]
  (let [builder (CfnCoreDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :core-definition-id)]
      (. builder coreDefinitionId data))
    (when-let [data (lookup-entry config id :cores)]
      (. builder cores data))
    (.build builder)))


(defn cfn-device-definition-builder
  "The cfn-device-definition-builder function buildes out new instances of 
CfnDeviceDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnDeviceDefinition$DeviceDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-definition-device-definition-version-property-builder
  "The cfn-device-definition-device-definition-version-property-builder function buildes out new instances of 
CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devices` | java.util.List | [[cdk.support/lookup-entry]] | `:devices` |"
  [stack id config]
  (let [builder (CfnDeviceDefinition$DeviceDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :devices)]
      (. builder devices data))
    (.build builder)))


(defn cfn-device-definition-device-property-builder
  "The cfn-device-definition-device-property-builder function buildes out new instances of 
CfnDeviceDefinition$DeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |"
  [stack id config]
  (let [builder (CfnDeviceDefinition$DeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :sync-shadow)]
      (. builder syncShadow data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (.build builder)))


(defn cfn-device-definition-props-builder
  "The cfn-device-definition-props-builder function buildes out new instances of 
CfnDeviceDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDeviceDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-device-definition-version-builder
  "The cfn-device-definition-version-builder function buildes out new instances of 
CfnDeviceDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-id` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |"
  [stack id config]
  (let [builder (CfnDeviceDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :device-definition-id)]
      (. builder deviceDefinitionId data))
    (when-let [data (lookup-entry config id :devices)]
      (. builder devices data))
    (.build builder)))


(defn cfn-device-definition-version-device-property-builder
  "The cfn-device-definition-version-device-property-builder function buildes out new instances of 
CfnDeviceDefinitionVersion$DeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `syncShadow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sync-shadow` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |"
  [stack id config]
  (let [builder (CfnDeviceDefinitionVersion$DeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :sync-shadow)]
      (. builder syncShadow data))
    (when-let [data (lookup-entry config id :thing-arn)]
      (. builder thingArn data))
    (.build builder)))


(defn cfn-device-definition-version-props-builder
  "The cfn-device-definition-version-props-builder function buildes out new instances of 
CfnDeviceDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-id` |
| `devices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:devices` |"
  [stack id config]
  (let [builder (CfnDeviceDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :device-definition-id)]
      (. builder deviceDefinitionId data))
    (when-let [data (lookup-entry config id :devices)]
      (. builder devices data))
    (.build builder)))


(defn cfn-function-definition-builder
  "The cfn-function-definition-builder function buildes out new instances of 
CfnFunctionDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-function-definition-default-config-property-builder
  "The cfn-function-definition-default-config-property-builder function buildes out new instances of 
CfnFunctionDefinition$DefaultConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$DefaultConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution)]
      (. builder execution data))
    (.build builder)))


(defn cfn-function-definition-environment-property-builder
  "The cfn-function-definition-environment-property-builder function buildes out new instances of 
CfnFunctionDefinition$EnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessSysfs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-sysfs` |
| `execution` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$ExecutionProperty | [[cdk.support/lookup-entry]] | `:execution` |
| `resourceAccessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-access-policies` |
| `variables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$EnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-sysfs)]
      (. builder accessSysfs data))
    (when-let [data (lookup-entry config id :execution)]
      (. builder execution data))
    (when-let [data (lookup-entry config id :resource-access-policies)]
      (. builder resourceAccessPolicies data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-function-definition-execution-property-builder
  "The cfn-function-definition-execution-property-builder function buildes out new instances of 
CfnFunctionDefinition$ExecutionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |
| `runAs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:run-as` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$ExecutionProperty$Builder.)]
    (when-let [data (lookup-entry config id :isolation-mode)]
      (. builder isolationMode data))
    (when-let [data (lookup-entry config id :run-as)]
      (. builder runAs data))
    (.build builder)))


(defn cfn-function-definition-function-configuration-property-builder
  "The cfn-function-definition-function-configuration-property-builder function buildes out new instances of 
CfnFunctionDefinition$FunctionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-type` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `execArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:exec-args` |
| `executable` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `pinned` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pinned` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$FunctionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encoding-type)]
      (. builder encodingType data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :exec-args)]
      (. builder execArgs data))
    (when-let [data (lookup-entry config id :executable)]
      (. builder executable data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :pinned)]
      (. builder pinned data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-function-definition-function-definition-version-property-builder
  "The cfn-function-definition-function-definition-version-property-builder function buildes out new instances of 
CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$DefaultConfigProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$FunctionDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-config)]
      (. builder defaultConfig data))
    (when-let [data (lookup-entry config id :functions)]
      (. builder functions data))
    (.build builder)))


(defn cfn-function-definition-function-property-builder
  "The cfn-function-definition-function-property-builder function buildes out new instances of 
CfnFunctionDefinition$FunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-configuration` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$FunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :function-configuration)]
      (. builder functionConfiguration data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-function-definition-props-builder
  "The cfn-function-definition-props-builder function buildes out new instances of 
CfnFunctionDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinition$FunctionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-function-definition-resource-access-policy-property-builder
  "The cfn-function-definition-resource-access-policy-property-builder function buildes out new instances of 
CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$ResourceAccessPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-function-definition-run-as-property-builder
  "The cfn-function-definition-run-as-property-builder function buildes out new instances of 
CfnFunctionDefinition$RunAsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |"
  [stack id config]
  (let [builder (CfnFunctionDefinition$RunAsProperty$Builder.)]
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (.build builder)))


(defn cfn-function-definition-version-builder
  "The cfn-function-definition-version-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-config` |
| `functionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-id` |
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-config)]
      (. builder defaultConfig data))
    (when-let [data (lookup-entry config id :function-definition-id)]
      (. builder functionDefinitionId data))
    (when-let [data (lookup-entry config id :functions)]
      (. builder functions data))
    (.build builder)))


(defn cfn-function-definition-version-default-config-property-builder
  "The cfn-function-definition-version-default-config-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$DefaultConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution)]
      (. builder execution data))
    (.build builder)))


(defn cfn-function-definition-version-environment-property-builder
  "The cfn-function-definition-version-environment-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$EnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessSysfs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-sysfs` |
| `execution` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution` |
| `resourceAccessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-access-policies` |
| `variables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$EnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-sysfs)]
      (. builder accessSysfs data))
    (when-let [data (lookup-entry config id :execution)]
      (. builder execution data))
    (when-let [data (lookup-entry config id :resource-access-policies)]
      (. builder resourceAccessPolicies data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-function-definition-version-execution-property-builder
  "The cfn-function-definition-version-execution-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$ExecutionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isolationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:isolation-mode` |
| `runAs` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$RunAsProperty | [[cdk.support/lookup-entry]] | `:run-as` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$ExecutionProperty$Builder.)]
    (when-let [data (lookup-entry config id :isolation-mode)]
      (. builder isolationMode data))
    (when-let [data (lookup-entry config id :run-as)]
      (. builder runAs data))
    (.build builder)))


(defn cfn-function-definition-version-function-configuration-property-builder
  "The cfn-function-definition-version-function-configuration-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-type` |
| `environment` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$EnvironmentProperty | [[cdk.support/lookup-entry]] | `:environment` |
| `execArgs` | java.lang.String | [[cdk.support/lookup-entry]] | `:exec-args` |
| `executable` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `pinned` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pinned` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$FunctionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encoding-type)]
      (. builder encodingType data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :exec-args)]
      (. builder execArgs data))
    (when-let [data (lookup-entry config id :executable)]
      (. builder executable data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :pinned)]
      (. builder pinned data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-function-definition-version-function-property-builder
  "The cfn-function-definition-version-function-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$FunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionConfiguration` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$FunctionConfigurationProperty | [[cdk.support/lookup-entry]] | `:function-configuration` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$FunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :function-configuration)]
      (. builder functionConfiguration data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-function-definition-version-props-builder
  "The cfn-function-definition-version-props-builder function buildes out new instances of 
CfnFunctionDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultConfig` | software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion$DefaultConfigProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `functionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-id` |
| `functions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:functions` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :default-config)]
      (. builder defaultConfig data))
    (when-let [data (lookup-entry config id :function-definition-id)]
      (. builder functionDefinitionId data))
    (when-let [data (lookup-entry config id :functions)]
      (. builder functions data))
    (.build builder)))


(defn cfn-function-definition-version-resource-access-policy-property-builder
  "The cfn-function-definition-version-resource-access-policy-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$ResourceAccessPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-function-definition-version-run-as-property-builder
  "The cfn-function-definition-version-run-as-property-builder function buildes out new instances of 
CfnFunctionDefinitionVersion$RunAsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gid` |
| `uid` | java.lang.Number | [[cdk.support/lookup-entry]] | `:uid` |"
  [stack id config]
  (let [builder (CfnFunctionDefinitionVersion$RunAsProperty$Builder.)]
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (.build builder)))


(defn cfn-group-builder
  "The cfn-group-builder function buildes out new instances of 
CfnGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnGroup$GroupVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-group-group-version-property-builder
  "The cfn-group-group-version-property-builder function buildes out new instances of 
CfnGroup$GroupVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |"
  [stack id config]
  (let [builder (CfnGroup$GroupVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-definition-version-arn)]
      (. builder connectorDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :core-definition-version-arn)]
      (. builder coreDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :device-definition-version-arn)]
      (. builder deviceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :function-definition-version-arn)]
      (. builder functionDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :logger-definition-version-arn)]
      (. builder loggerDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :resource-definition-version-arn)]
      (. builder resourceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :subscription-definition-version-arn)]
      (. builder subscriptionDefinitionVersionArn data))
    (.build builder)))


(defn cfn-group-props-builder
  "The cfn-group-props-builder function buildes out new instances of 
CfnGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-group-version-builder
  "The cfn-group-version-builder function buildes out new instances of 
CfnGroupVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |"
  [stack id config]
  (let [builder (CfnGroupVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connector-definition-version-arn)]
      (. builder connectorDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :core-definition-version-arn)]
      (. builder coreDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :device-definition-version-arn)]
      (. builder deviceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :function-definition-version-arn)]
      (. builder functionDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :logger-definition-version-arn)]
      (. builder loggerDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :resource-definition-version-arn)]
      (. builder resourceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :subscription-definition-version-arn)]
      (. builder subscriptionDefinitionVersionArn data))
    (.build builder)))


(defn cfn-group-version-props-builder
  "The cfn-group-version-props-builder function buildes out new instances of 
CfnGroupVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-definition-version-arn` |
| `coreDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-definition-version-arn` |
| `deviceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-definition-version-arn` |
| `functionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-definition-version-arn` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `loggerDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-version-arn` |
| `resourceDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-version-arn` |
| `subscriptionDefinitionVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-version-arn` |"
  [stack id config]
  (let [builder (CfnGroupVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :connector-definition-version-arn)]
      (. builder connectorDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :core-definition-version-arn)]
      (. builder coreDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :device-definition-version-arn)]
      (. builder deviceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :function-definition-version-arn)]
      (. builder functionDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :logger-definition-version-arn)]
      (. builder loggerDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :resource-definition-version-arn)]
      (. builder resourceDefinitionVersionArn data))
    (when-let [data (lookup-entry config id :subscription-definition-version-arn)]
      (. builder subscriptionDefinitionVersionArn data))
    (.build builder)))


(defn cfn-logger-definition-builder
  "The cfn-logger-definition-builder function buildes out new instances of 
CfnLoggerDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnLoggerDefinition$LoggerDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoggerDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-logger-definition-logger-definition-version-property-builder
  "The cfn-logger-definition-logger-definition-version-property-builder function buildes out new instances of 
CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggers` | java.util.List | [[cdk.support/lookup-entry]] | `:loggers` |"
  [stack id config]
  (let [builder (CfnLoggerDefinition$LoggerDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :loggers)]
      (. builder loggers data))
    (.build builder)))


(defn cfn-logger-definition-logger-property-builder
  "The cfn-logger-definition-logger-property-builder function buildes out new instances of 
CfnLoggerDefinition$LoggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `component` | java.lang.String | [[cdk.support/lookup-entry]] | `:component` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `space` | java.lang.Number | [[cdk.support/lookup-entry]] | `:space` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLoggerDefinition$LoggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :component)]
      (. builder component data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :level)]
      (. builder level data))
    (when-let [data (lookup-entry config id :space)]
      (. builder space data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-logger-definition-props-builder
  "The cfn-logger-definition-props-builder function buildes out new instances of 
CfnLoggerDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoggerDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-logger-definition-version-builder
  "The cfn-logger-definition-version-builder function buildes out new instances of 
CfnLoggerDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggerDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-id` |
| `loggers` | java.util.List | [[cdk.support/lookup-entry]] | `:loggers` |"
  [stack id config]
  (let [builder (CfnLoggerDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :logger-definition-id)]
      (. builder loggerDefinitionId data))
    (when-let [data (lookup-entry config id :loggers)]
      (. builder loggers data))
    (.build builder)))


(defn cfn-logger-definition-version-logger-property-builder
  "The cfn-logger-definition-version-logger-property-builder function buildes out new instances of 
CfnLoggerDefinitionVersion$LoggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `component` | java.lang.String | [[cdk.support/lookup-entry]] | `:component` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | java.lang.String | [[cdk.support/lookup-entry]] | `:level` |
| `space` | java.lang.Number | [[cdk.support/lookup-entry]] | `:space` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLoggerDefinitionVersion$LoggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :component)]
      (. builder component data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :level)]
      (. builder level data))
    (when-let [data (lookup-entry config id :space)]
      (. builder space data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-logger-definition-version-props-builder
  "The cfn-logger-definition-version-props-builder function buildes out new instances of 
CfnLoggerDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loggerDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logger-definition-id` |
| `loggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:loggers` |"
  [stack id config]
  (let [builder (CfnLoggerDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :logger-definition-id)]
      (. builder loggerDefinitionId data))
    (when-let [data (lookup-entry config id :loggers)]
      (. builder loggers data))
    (.build builder)))


(defn cfn-resource-definition-builder
  "The cfn-resource-definition-builder function buildes out new instances of 
CfnResourceDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-definition-group-owner-setting-property-builder
  "The cfn-resource-definition-group-owner-setting-property-builder function buildes out new instances of 
CfnResourceDefinition$GroupOwnerSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAddGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-add-group-owner` |
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$GroupOwnerSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-add-group-owner)]
      (. builder autoAddGroupOwner data))
    (when-let [data (lookup-entry config id :group-owner)]
      (. builder groupOwner data))
    (.build builder)))


(defn cfn-resource-definition-local-device-resource-data-property-builder
  "The cfn-resource-definition-local-device-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwnerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$LocalDeviceResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-owner-setting)]
      (. builder groupOwnerSetting data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-resource-definition-local-volume-resource-data-property-builder
  "The cfn-resource-definition-local-volume-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `groupOwnerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$GroupOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$LocalVolumeResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :group-owner-setting)]
      (. builder groupOwnerSetting data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-resource-definition-props-builder
  "The cfn-resource-definition-props-builder function buildes out new instances of 
CfnResourceDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$ResourceDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-definition-resource-data-container-property-builder
  "The cfn-resource-definition-resource-data-container-property-builder function buildes out new instances of 
CfnResourceDefinition$ResourceDataContainerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localDeviceResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$LocalDeviceResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-device-resource-data` |
| `localVolumeResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$LocalVolumeResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-volume-resource-data` |
| `s3MachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-machine-learning-model-resource-data` |
| `sageMakerMachineLearningModelResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty | [[cdk.support/lookup-entry]] | `:sage-maker-machine-learning-model-resource-data` |
| `secretsManagerSecretResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$SecretsManagerSecretResourceDataProperty | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-resource-data` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$ResourceDataContainerProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-device-resource-data)]
      (. builder localDeviceResourceData data))
    (when-let [data (lookup-entry config id :local-volume-resource-data)]
      (. builder localVolumeResourceData data))
    (when-let [data (lookup-entry config id :s3-machine-learning-model-resource-data)]
      (. builder s3MachineLearningModelResourceData data))
    (when-let [data (lookup-entry config id :sage-maker-machine-learning-model-resource-data)]
      (. builder sageMakerMachineLearningModelResourceData data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-resource-data)]
      (. builder secretsManagerSecretResourceData data))
    (.build builder)))


(defn cfn-resource-definition-resource-definition-version-property-builder
  "The cfn-resource-definition-resource-definition-version-property-builder function buildes out new instances of 
CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$ResourceDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (.build builder)))


(defn cfn-resource-definition-resource-download-owner-setting-property-builder
  "The cfn-resource-definition-resource-download-owner-setting-property-builder function buildes out new instances of 
CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
| `groupPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-permission` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$ResourceDownloadOwnerSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-owner)]
      (. builder groupOwner data))
    (when-let [data (lookup-entry config id :group-permission)]
      (. builder groupPermission data))
    (.build builder)))


(defn cfn-resource-definition-resource-instance-property-builder
  "The cfn-resource-definition-resource-instance-property-builder function buildes out new instances of 
CfnResourceDefinition$ResourceInstanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceDataContainer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-data-container` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$ResourceInstanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-data-container)]
      (. builder resourceDataContainer data))
    (.build builder)))


(defn cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder
  "The cfn-resource-definition-s3-machine-learning-model-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$S3MachineLearningModelResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :owner-setting)]
      (. builder ownerSetting data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder
  "The cfn-resource-definition-sage-maker-machine-learning-model-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinition$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `sageMakerJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-job-arn` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$SageMakerMachineLearningModelResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :owner-setting)]
      (. builder ownerSetting data))
    (when-let [data (lookup-entry config id :sage-maker-job-arn)]
      (. builder sageMakerJobArn data))
    (.build builder)))


(defn cfn-resource-definition-secrets-manager-secret-resource-data-property-builder
  "The cfn-resource-definition-secrets-manager-secret-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStagingLabelsToDownload` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-staging-labels-to-download` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnResourceDefinition$SecretsManagerSecretResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-staging-labels-to-download)]
      (. builder additionalStagingLabelsToDownload data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-resource-definition-version-builder
  "The cfn-resource-definition-version-builder function buildes out new instances of 
CfnResourceDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-id` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-definition-id)]
      (. builder resourceDefinitionId data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (.build builder)))


(defn cfn-resource-definition-version-group-owner-setting-property-builder
  "The cfn-resource-definition-version-group-owner-setting-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAddGroupOwner` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-add-group-owner` |
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$GroupOwnerSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-add-group-owner)]
      (. builder autoAddGroupOwner data))
    (when-let [data (lookup-entry config id :group-owner)]
      (. builder groupOwner data))
    (.build builder)))


(defn cfn-resource-definition-version-local-device-resource-data-property-builder
  "The cfn-resource-definition-version-local-device-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwnerSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-owner-setting)]
      (. builder groupOwnerSetting data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-resource-definition-version-local-volume-resource-data-property-builder
  "The cfn-resource-definition-version-local-volume-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `groupOwnerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$GroupOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:group-owner-setting` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :group-owner-setting)]
      (. builder groupOwnerSetting data))
    (when-let [data (lookup-entry config id :source-path)]
      (. builder sourcePath data))
    (.build builder)))


(defn cfn-resource-definition-version-props-builder
  "The cfn-resource-definition-version-props-builder function buildes out new instances of 
CfnResourceDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-definition-id` |
| `resources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resources` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-definition-id)]
      (. builder resourceDefinitionId data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (.build builder)))


(defn cfn-resource-definition-version-resource-data-container-property-builder
  "The cfn-resource-definition-version-resource-data-container-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localDeviceResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$LocalDeviceResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-device-resource-data` |
| `localVolumeResourceData` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$LocalVolumeResourceDataProperty | [[cdk.support/lookup-entry]] | `:local-volume-resource-data` |
| `s3MachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-machine-learning-model-resource-data` |
| `sageMakerMachineLearningModelResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sage-maker-machine-learning-model-resource-data` |
| `secretsManagerSecretResourceData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secrets-manager-secret-resource-data` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$ResourceDataContainerProperty$Builder.)]
    (when-let [data (lookup-entry config id :local-device-resource-data)]
      (. builder localDeviceResourceData data))
    (when-let [data (lookup-entry config id :local-volume-resource-data)]
      (. builder localVolumeResourceData data))
    (when-let [data (lookup-entry config id :s3-machine-learning-model-resource-data)]
      (. builder s3MachineLearningModelResourceData data))
    (when-let [data (lookup-entry config id :sage-maker-machine-learning-model-resource-data)]
      (. builder sageMakerMachineLearningModelResourceData data))
    (when-let [data (lookup-entry config id :secrets-manager-secret-resource-data)]
      (. builder secretsManagerSecretResourceData data))
    (.build builder)))


(defn cfn-resource-definition-version-resource-download-owner-setting-property-builder
  "The cfn-resource-definition-version-resource-download-owner-setting-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-owner` |
| `groupPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-permission` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-owner)]
      (. builder groupOwner data))
    (when-let [data (lookup-entry config id :group-permission)]
      (. builder groupPermission data))
    (.build builder)))


(defn cfn-resource-definition-version-resource-instance-property-builder
  "The cfn-resource-definition-version-resource-instance-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceDataContainer` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDataContainerProperty | [[cdk.support/lookup-entry]] | `:resource-data-container` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$ResourceInstanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-data-container)]
      (. builder resourceDataContainer data))
    (.build builder)))


(defn cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder
  "The cfn-resource-definition-version-s3-machine-learning-model-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$S3MachineLearningModelResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :owner-setting)]
      (. builder ownerSetting data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (.build builder)))


(defn cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder
  "The cfn-resource-definition-version-sage-maker-machine-learning-model-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-path` |
| `ownerSetting` | software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion$ResourceDownloadOwnerSettingProperty | [[cdk.support/lookup-entry]] | `:owner-setting` |
| `sageMakerJobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sage-maker-job-arn` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$SageMakerMachineLearningModelResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-path)]
      (. builder destinationPath data))
    (when-let [data (lookup-entry config id :owner-setting)]
      (. builder ownerSetting data))
    (when-let [data (lookup-entry config id :sage-maker-job-arn)]
      (. builder sageMakerJobArn data))
    (.build builder)))


(defn cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder
  "The cfn-resource-definition-version-secrets-manager-secret-resource-data-property-builder function buildes out new instances of 
CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalStagingLabelsToDownload` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-staging-labels-to-download` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnResourceDefinitionVersion$SecretsManagerSecretResourceDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-staging-labels-to-download)]
      (. builder additionalStagingLabelsToDownload data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-subscription-definition-builder
  "The cfn-subscription-definition-builder function buildes out new instances of 
CfnSubscriptionDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-subscription-definition-props-builder
  "The cfn-subscription-definition-props-builder function buildes out new instances of 
CfnSubscriptionDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `initialVersion` | software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty | [[cdk.support/lookup-entry]] | `:initial-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :initial-version)]
      (. builder initialVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-subscription-definition-subscription-definition-version-property-builder
  "The cfn-subscription-definition-subscription-definition-version-property-builder function buildes out new instances of 
CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscriptions` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinition$SubscriptionDefinitionVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :subscriptions)]
      (. builder subscriptions data))
    (.build builder)))


(defn cfn-subscription-definition-subscription-property-builder
  "The cfn-subscription-definition-subscription-property-builder function buildes out new instances of 
CfnSubscriptionDefinition$SubscriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinition$SubscriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-subscription-definition-version-builder
  "The cfn-subscription-definition-version-builder function buildes out new instances of 
CfnSubscriptionDefinitionVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-id` |
| `subscriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subscriptions` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinitionVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :subscription-definition-id)]
      (. builder subscriptionDefinitionId data))
    (when-let [data (lookup-entry config id :subscriptions)]
      (. builder subscriptions data))
    (.build builder)))


(defn cfn-subscription-definition-version-props-builder
  "The cfn-subscription-definition-version-props-builder function buildes out new instances of 
CfnSubscriptionDefinitionVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subscriptionDefinitionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-definition-id` |
| `subscriptions` | java.util.List | [[cdk.support/lookup-entry]] | `:subscriptions` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinitionVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :subscription-definition-id)]
      (. builder subscriptionDefinitionId data))
    (when-let [data (lookup-entry config id :subscriptions)]
      (. builder subscriptions data))
    (.build builder)))


(defn cfn-subscription-definition-version-subscription-property-builder
  "The cfn-subscription-definition-version-subscription-property-builder function buildes out new instances of 
CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnSubscriptionDefinitionVersion$SubscriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))