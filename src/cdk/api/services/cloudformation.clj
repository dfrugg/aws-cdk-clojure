(ns cdk.api.services.cloudformation
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudformation package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloudformation CfnCustomResource$Builder
                                                           CfnCustomResourceProps$Builder
                                                           CfnHookDefaultVersion$Builder
                                                           CfnHookDefaultVersionProps$Builder
                                                           CfnHookTypeConfig$Builder
                                                           CfnHookTypeConfigProps$Builder
                                                           CfnHookVersion$Builder
                                                           CfnHookVersion$LoggingConfigProperty$Builder
                                                           CfnHookVersionProps$Builder
                                                           CfnMacro$Builder
                                                           CfnMacroProps$Builder
                                                           CfnModuleDefaultVersion$Builder
                                                           CfnModuleDefaultVersionProps$Builder
                                                           CfnModuleVersion$Builder
                                                           CfnModuleVersionProps$Builder
                                                           CfnPublicTypeVersion$Builder
                                                           CfnPublicTypeVersionProps$Builder
                                                           CfnPublisher$Builder
                                                           CfnPublisherProps$Builder
                                                           CfnResourceDefaultVersion$Builder
                                                           CfnResourceDefaultVersionProps$Builder
                                                           CfnResourceVersion$Builder
                                                           CfnResourceVersion$LoggingConfigProperty$Builder
                                                           CfnResourceVersionProps$Builder
                                                           CfnStack$Builder
                                                           CfnStack$OutputProperty$Builder
                                                           CfnStackProps$Builder
                                                           CfnStackSet$AutoDeploymentProperty$Builder
                                                           CfnStackSet$Builder
                                                           CfnStackSet$DeploymentTargetsProperty$Builder
                                                           CfnStackSet$ManagedExecutionProperty$Builder
                                                           CfnStackSet$OperationPreferencesProperty$Builder
                                                           CfnStackSet$ParameterProperty$Builder
                                                           CfnStackSet$StackInstancesProperty$Builder
                                                           CfnStackSetProps$Builder
                                                           CfnTypeActivation$Builder
                                                           CfnTypeActivation$LoggingConfigProperty$Builder
                                                           CfnTypeActivationProps$Builder
                                                           CfnWaitCondition$Builder
                                                           CfnWaitConditionHandle$Builder
                                                           CfnWaitConditionHandleProps$Builder
                                                           CfnWaitConditionProps$Builder]))


(defn cfn-custom-resource-builder
  "The cfn-custom-resource-builder function buildes out new instances of 
CfnCustomResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CfnCustomResource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn cfn-custom-resource-props-builder
  "The cfn-custom-resource-props-builder function buildes out new instances of 
CfnCustomResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |"
  [stack id config]
  (let [builder (CfnCustomResourceProps$Builder.)]
    (when-let [data (lookup-entry config id :service-token)]
      (. builder serviceToken data))
    (.build builder)))


(defn cfn-hook-default-version-builder
  "The cfn-hook-default-version-builder function buildes out new instances of 
CfnHookDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnHookDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-hook-default-version-props-builder
  "The cfn-hook-default-version-props-builder function buildes out new instances of 
CfnHookDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnHookDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-hook-type-config-builder
  "The cfn-hook-type-config-builder function buildes out new instances of 
CfnHookTypeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookTypeConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :configuration-alias)]
      (. builder configurationAlias data))
    (when-let [data (lookup-entry config id :type-arn)]
      (. builder typeArn data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-type-config-props-builder
  "The cfn-hook-type-config-props-builder function buildes out new instances of 
CfnHookTypeConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookTypeConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :configuration-alias)]
      (. builder configurationAlias data))
    (when-let [data (lookup-entry config id :type-arn)]
      (. builder typeArn data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-version-builder
  "The cfn-hook-version-builder function buildes out new instances of 
CfnHookVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-hook-version-logging-config-property-builder
  "The cfn-hook-version-logging-config-property-builder function buildes out new instances of 
CfnHookVersion$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnHookVersion$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-hook-version-props-builder
  "The cfn-hook-version-props-builder function buildes out new instances of 
CfnHookVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnHookVersion$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnHookVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-macro-builder
  "The cfn-macro-builder function buildes out new instances of 
CfnMacro$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMacro$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-macro-props-builder
  "The cfn-macro-props-builder function buildes out new instances of 
CfnMacroProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMacroProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-module-default-version-builder
  "The cfn-module-default-version-builder function buildes out new instances of 
CfnModuleDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnModuleDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-module-default-version-props-builder
  "The cfn-module-default-version-props-builder function buildes out new instances of 
CfnModuleDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnModuleDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-module-version-builder
  "The cfn-module-version-builder function buildes out new instances of 
CfnModuleVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |"
  [stack id config]
  (let [builder (CfnModuleVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :module-package)]
      (. builder modulePackage data))
    (.build builder)))


(defn cfn-module-version-props-builder
  "The cfn-module-version-props-builder function buildes out new instances of 
CfnModuleVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |"
  [stack id config]
  (let [builder (CfnModuleVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :module-name)]
      (. builder moduleName data))
    (when-let [data (lookup-entry config id :module-package)]
      (. builder modulePackage data))
    (.build builder)))


(defn cfn-public-type-version-builder
  "The cfn-public-type-version-builder function buildes out new instances of 
CfnPublicTypeVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnPublicTypeVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :log-delivery-bucket)]
      (. builder logDeliveryBucket data))
    (when-let [data (lookup-entry config id :public-version-number)]
      (. builder publicVersionNumber data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-public-type-version-props-builder
  "The cfn-public-type-version-props-builder function buildes out new instances of 
CfnPublicTypeVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnPublicTypeVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :log-delivery-bucket)]
      (. builder logDeliveryBucket data))
    (when-let [data (lookup-entry config id :public-version-number)]
      (. builder publicVersionNumber data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-publisher-builder
  "The cfn-publisher-builder function buildes out new instances of 
CfnPublisher$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |"
  [stack id config]
  (let [builder (CfnPublisher$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
      (. builder acceptTermsAndConditions data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (.build builder)))


(defn cfn-publisher-props-builder
  "The cfn-publisher-props-builder function buildes out new instances of 
CfnPublisherProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |"
  [stack id config]
  (let [builder (CfnPublisherProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
      (. builder acceptTermsAndConditions data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (.build builder)))


(defn cfn-resource-default-version-builder
  "The cfn-resource-default-version-builder function buildes out new instances of 
CfnResourceDefaultVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnResourceDefaultVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-resource-default-version-props-builder
  "The cfn-resource-default-version-props-builder function buildes out new instances of 
CfnResourceDefaultVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnResourceDefaultVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-version-arn)]
      (. builder typeVersionArn data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-resource-version-builder
  "The cfn-resource-version-builder function buildes out new instances of 
CfnResourceVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResourceVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-resource-version-logging-config-property-builder
  "The cfn-resource-version-logging-config-property-builder function buildes out new instances of 
CfnResourceVersion$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnResourceVersion$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-resource-version-props-builder
  "The cfn-resource-version-props-builder function buildes out new instances of 
CfnResourceVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnResourceVersion$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResourceVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :schema-handler-package)]
      (. builder schemaHandlerPackage data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-stack-builder
  "The cfn-stack-builder function buildes out new instances of 
CfnStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnStack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-stack-output-property-builder
  "The cfn-stack-output-property-builder function buildes out new instances of 
CfnStack$OutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `outputKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-key` |
| `outputValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-value` |"
  [stack id config]
  (let [builder (CfnStack$OutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :export-name)]
      (. builder exportName data))
    (when-let [data (lookup-entry config id :output-key)]
      (. builder outputKey data))
    (when-let [data (lookup-entry config id :output-value)]
      (. builder outputValue data))
    (.build builder)))


(defn cfn-stack-props-builder
  "The cfn-stack-props-builder function buildes out new instances of 
CfnStackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnStackProps$Builder.)]
    (when-let [data (lookup-entry config id :notification-arns)]
      (. builder notificationArns data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (when-let [data (lookup-entry config id :timeout-in-minutes)]
      (. builder timeoutInMinutes data))
    (.build builder)))


(defn cfn-stack-set-auto-deployment-property-builder
  "The cfn-stack-set-auto-deployment-property-builder function buildes out new instances of 
CfnStackSet$AutoDeploymentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |"
  [stack id config]
  (let [builder (CfnStackSet$AutoDeploymentProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :retain-stacks-on-account-removal)]
      (. builder retainStacksOnAccountRemoval data))
    (.build builder)))


(defn cfn-stack-set-builder
  "The cfn-stack-set-builder function buildes out new instances of 
CfnStackSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:administration-role-arn` |
| `autoDeployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-deployment` |
| `callAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:call-as` |
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `managedExecution` | java.lang.Object | [[cdk.support/lookup-entry]] | `:managed-execution` |
| `operationPreferences` | software.amazon.awscdk.services.cloudformation.CfnStackSet$OperationPreferencesProperty | [[cdk.support/lookup-entry]] | `:operation-preferences` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `permissionModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-model` |
| `stackInstancesGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stack-instances-group` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |"
  [stack id config]
  (let [builder (CfnStackSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :administration-role-arn)]
      (. builder administrationRoleArn data))
    (when-let [data (lookup-entry config id :auto-deployment)]
      (. builder autoDeployment data))
    (when-let [data (lookup-entry config id :call-as)]
      (. builder callAs data))
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role-name)]
      (. builder executionRoleName data))
    (when-let [data (lookup-entry config id :managed-execution)]
      (. builder managedExecution data))
    (when-let [data (lookup-entry config id :operation-preferences)]
      (. builder operationPreferences data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :stack-instances-group)]
      (. builder stackInstancesGroup data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (.build builder)))


(defn cfn-stack-set-deployment-targets-property-builder
  "The cfn-stack-set-deployment-targets-property-builder function buildes out new instances of 
CfnStackSet$DeploymentTargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountFilterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-filter-type` |
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `accountsUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:accounts-url` |
| `organizationalUnitIds` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-ids` |"
  [stack id config]
  (let [builder (CfnStackSet$DeploymentTargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-filter-type)]
      (. builder accountFilterType data))
    (when-let [data (lookup-entry config id :accounts)]
      (. builder accounts data))
    (when-let [data (lookup-entry config id :accounts-url)]
      (. builder accountsUrl data))
    (when-let [data (lookup-entry config id :organizational-unit-ids)]
      (. builder organizationalUnitIds data))
    (.build builder)))


(defn cfn-stack-set-managed-execution-property-builder
  "The cfn-stack-set-managed-execution-property-builder function buildes out new instances of 
CfnStackSet$ManagedExecutionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active` |"
  [stack id config]
  (let [builder (CfnStackSet$ManagedExecutionProperty$Builder.)]
    (when-let [data (lookup-entry config id :active)]
      (. builder active data))
    (.build builder)))


(defn cfn-stack-set-operation-preferences-property-builder
  "The cfn-stack-set-operation-preferences-property-builder function buildes out new instances of 
CfnStackSet$OperationPreferencesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-count` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxConcurrentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-count` |
| `maxConcurrentPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-percentage` |
| `regionConcurrencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-concurrency-type` |
| `regionOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:region-order` |"
  [stack id config]
  (let [builder (CfnStackSet$OperationPreferencesProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-tolerance-count)]
      (. builder failureToleranceCount data))
    (when-let [data (lookup-entry config id :failure-tolerance-percentage)]
      (. builder failureTolerancePercentage data))
    (when-let [data (lookup-entry config id :max-concurrent-count)]
      (. builder maxConcurrentCount data))
    (when-let [data (lookup-entry config id :max-concurrent-percentage)]
      (. builder maxConcurrentPercentage data))
    (when-let [data (lookup-entry config id :region-concurrency-type)]
      (. builder regionConcurrencyType data))
    (when-let [data (lookup-entry config id :region-order)]
      (. builder regionOrder data))
    (.build builder)))


(defn cfn-stack-set-parameter-property-builder
  "The cfn-stack-set-parameter-property-builder function buildes out new instances of 
CfnStackSet$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnStackSet$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-key)]
      (. builder parameterKey data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-stack-set-props-builder
  "The cfn-stack-set-props-builder function buildes out new instances of 
CfnStackSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `administrationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:administration-role-arn` |
| `autoDeployment` | software.amazon.awscdk.services.cloudformation.CfnStackSet$AutoDeploymentProperty | [[cdk.support/lookup-entry]] | `:auto-deployment` |
| `callAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:call-as` |
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `managedExecution` | java.lang.Object | [[cdk.support/lookup-entry]] | `:managed-execution` |
| `operationPreferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operation-preferences` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `permissionModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-model` |
| `stackInstancesGroup` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-instances-group` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |"
  [stack id config]
  (let [builder (CfnStackSetProps$Builder.)]
    (when-let [data (lookup-entry config id :administration-role-arn)]
      (. builder administrationRoleArn data))
    (when-let [data (lookup-entry config id :auto-deployment)]
      (. builder autoDeployment data))
    (when-let [data (lookup-entry config id :call-as)]
      (. builder callAs data))
    (when-let [data (lookup-entry config id :capabilities)]
      (. builder capabilities data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :execution-role-name)]
      (. builder executionRoleName data))
    (when-let [data (lookup-entry config id :managed-execution)]
      (. builder managedExecution data))
    (when-let [data (lookup-entry config id :operation-preferences)]
      (. builder operationPreferences data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :stack-instances-group)]
      (. builder stackInstancesGroup data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-url)]
      (. builder templateUrl data))
    (.build builder)))


(defn cfn-stack-set-stack-instances-property-builder
  "The cfn-stack-set-stack-instances-property-builder function buildes out new instances of 
CfnStackSet$StackInstancesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-targets` |
| `parameterOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |"
  [stack id config]
  (let [builder (CfnStackSet$StackInstancesProperty$Builder.)]
    (when-let [data (lookup-entry config id :deployment-targets)]
      (. builder deploymentTargets data))
    (when-let [data (lookup-entry config id :parameter-overrides)]
      (. builder parameterOverrides data))
    (when-let [data (lookup-entry config id :regions)]
      (. builder regions data))
    (.build builder)))


(defn cfn-type-activation-builder
  "The cfn-type-activation-builder function buildes out new instances of 
CfnTypeActivation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-update` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnTypeActivation$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |
| `publicTypeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-type-arn` |
| `publisherId` | java.lang.String | [[cdk.support/lookup-entry]] | `:publisher-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeNameAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name-alias` |
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |"
  [stack id config]
  (let [builder (CfnTypeActivation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-update)]
      (. builder autoUpdate data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :major-version)]
      (. builder majorVersion data))
    (when-let [data (lookup-entry config id :public-type-arn)]
      (. builder publicTypeArn data))
    (when-let [data (lookup-entry config id :publisher-id)]
      (. builder publisherId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-name-alias)]
      (. builder typeNameAlias data))
    (when-let [data (lookup-entry config id :version-bump)]
      (. builder versionBump data))
    (.build builder)))


(defn cfn-type-activation-logging-config-property-builder
  "The cfn-type-activation-logging-config-property-builder function buildes out new instances of 
CfnTypeActivation$LoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |"
  [stack id config]
  (let [builder (CfnTypeActivation$LoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :log-role-arn)]
      (. builder logRoleArn data))
    (.build builder)))


(defn cfn-type-activation-props-builder
  "The cfn-type-activation-props-builder function buildes out new instances of 
CfnTypeActivationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-update` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnTypeActivation$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |
| `publicTypeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-type-arn` |
| `publisherId` | java.lang.String | [[cdk.support/lookup-entry]] | `:publisher-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeNameAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name-alias` |
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |"
  [stack id config]
  (let [builder (CfnTypeActivationProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-update)]
      (. builder autoUpdate data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :major-version)]
      (. builder majorVersion data))
    (when-let [data (lookup-entry config id :public-type-arn)]
      (. builder publicTypeArn data))
    (when-let [data (lookup-entry config id :publisher-id)]
      (. builder publisherId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (when-let [data (lookup-entry config id :type-name-alias)]
      (. builder typeNameAlias data))
    (when-let [data (lookup-entry config id :version-bump)]
      (. builder versionBump data))
    (.build builder)))


(defn cfn-wait-condition-builder
  "The cfn-wait-condition-builder function buildes out new instances of 
CfnWaitCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnWaitCondition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :handle)]
      (. builder handle data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-wait-condition-handle-builder
  "The cfn-wait-condition-handle-builder function buildes out new instances of 
CfnWaitConditionHandle$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnWaitConditionHandle$Builder/create stack id)]
    (.build builder)))


(defn cfn-wait-condition-handle-props-builder
  "The cfn-wait-condition-handle-props-builder function buildes out new instances of 
CfnWaitConditionHandleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnWaitConditionHandleProps$Builder.)]
    (.build builder)))


(defn cfn-wait-condition-props-builder
  "The cfn-wait-condition-props-builder function buildes out new instances of 
CfnWaitConditionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnWaitConditionProps$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :handle)]
      (. builder handle data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))