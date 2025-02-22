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


(defn build-cfn-custom-resource-builder
  "The build-cfn-custom-resource-builder function updates a CfnCustomResource$Builder instance using the provided configuration.
  The function takes the CfnCustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResource$Builder builder id config]
  (when-let [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn build-cfn-custom-resource-props-builder
  "The build-cfn-custom-resource-props-builder function updates a CfnCustomResourceProps$Builder instance using the provided configuration.
  The function takes the CfnCustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn build-cfn-hook-default-version-builder
  "The build-cfn-hook-default-version-builder function updates a CfnHookDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnHookDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnHookDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-hook-default-version-props-builder
  "The build-cfn-hook-default-version-props-builder function updates a CfnHookDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnHookDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnHookDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-hook-type-config-builder
  "The build-cfn-hook-type-config-builder function updates a CfnHookTypeConfig$Builder instance using the provided configuration.
  The function takes the CfnHookTypeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookTypeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-let [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-hook-type-config-props-builder
  "The build-cfn-hook-type-config-props-builder function updates a CfnHookTypeConfigProps$Builder instance using the provided configuration.
  The function takes the CfnHookTypeConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `configurationAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-alias` |
| `typeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-arn` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookTypeConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-let [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-hook-version-builder
  "The build-cfn-hook-version-builder function updates a CfnHookVersion$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-hook-version-logging-config-property-builder
  "The build-cfn-hook-version-logging-config-property-builder function updates a CfnHookVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnHookVersion$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn build-cfn-hook-version-props-builder
  "The build-cfn-hook-version-props-builder function updates a CfnHookVersionProps$Builder instance using the provided configuration.
  The function takes the CfnHookVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnHookVersion$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnHookVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-macro-builder
  "The build-cfn-macro-builder function updates a CfnMacro$Builder instance using the provided configuration.
  The function takes the CfnMacro$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMacro$Builder builder id config]
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
  (.build builder))


(defn build-cfn-macro-props-builder
  "The build-cfn-macro-props-builder function updates a CfnMacroProps$Builder instance using the provided configuration.
  The function takes the CfnMacroProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMacroProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-module-default-version-builder
  "The build-cfn-module-default-version-builder function updates a CfnModuleDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnModuleDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-module-default-version-props-builder
  "The build-cfn-module-default-version-props-builder function updates a CfnModuleDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnModuleDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-module-version-builder
  "The build-cfn-module-version-builder function updates a CfnModuleVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn build-cfn-module-version-props-builder
  "The build-cfn-module-version-props-builder function updates a CfnModuleVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-let [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn build-cfn-public-type-version-builder
  "The build-cfn-public-type-version-builder function updates a CfnPublicTypeVersion$Builder instance using the provided configuration.
  The function takes the CfnPublicTypeVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnPublicTypeVersion$Builder builder id config]
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
  (.build builder))


(defn build-cfn-public-type-version-props-builder
  "The build-cfn-public-type-version-props-builder function updates a CfnPublicTypeVersionProps$Builder instance using the provided configuration.
  The function takes the CfnPublicTypeVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `logDeliveryBucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-delivery-bucket` |
| `publicVersionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-version-number` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnPublicTypeVersionProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-publisher-builder
  "The build-cfn-publisher-builder function updates a CfnPublisher$Builder instance using the provided configuration.
  The function takes the CfnPublisher$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisher$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn build-cfn-publisher-props-builder
  "The build-cfn-publisher-props-builder function updates a CfnPublisherProps$Builder instance using the provided configuration.
  The function takes the CfnPublisherProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisherProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn build-cfn-resource-default-version-builder
  "The build-cfn-resource-default-version-builder function updates a CfnResourceDefaultVersion$Builder instance using the provided configuration.
  The function takes the CfnResourceDefaultVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnResourceDefaultVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-resource-default-version-props-builder
  "The build-cfn-resource-default-version-props-builder function updates a CfnResourceDefaultVersionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceDefaultVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
| `typeVersionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-version-arn` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnResourceDefaultVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-let [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn build-cfn-resource-version-builder
  "The build-cfn-resource-version-builder function updates a CfnResourceVersion$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResourceVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-resource-version-logging-config-property-builder
  "The build-cfn-resource-version-logging-config-property-builder function updates a CfnResourceVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnResourceVersion$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn build-cfn-resource-version-props-builder
  "The build-cfn-resource-version-props-builder function updates a CfnResourceVersionProps$Builder instance using the provided configuration.
  The function takes the CfnResourceVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `loggingConfig` | software.amazon.awscdk.services.cloudformation.CfnResourceVersion$LoggingConfigProperty | [[cdk.support/lookup-entry]] | `:logging-config` |
| `schemaHandlerPackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-handler-package` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResourceVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-let [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-let [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-let [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn build-cfn-stack-builder
  "The build-cfn-stack-builder function updates a CfnStack$Builder instance using the provided configuration.
  The function takes the CfnStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnStack$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-output-property-builder
  "The build-cfn-stack-output-property-builder function updates a CfnStack$OutputProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$OutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-name` |
| `outputKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-key` |
| `outputValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-value` |
"
  [^CfnStack$OutputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-let [data (lookup-entry config id :output-key)]
    (. builder outputKey data))
  (when-let [data (lookup-entry config id :output-value)]
    (. builder outputValue data))
  (.build builder))


(defn build-cfn-stack-props-builder
  "The build-cfn-stack-props-builder function updates a CfnStackProps$Builder instance using the provided configuration.
  The function takes the CfnStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
| `timeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-minutes` |
"
  [^CfnStackProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-set-auto-deployment-property-builder
  "The build-cfn-stack-set-auto-deployment-property-builder function updates a CfnStackSet$AutoDeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$AutoDeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |
"
  [^CfnStackSet$AutoDeploymentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :retain-stacks-on-account-removal)]
    (. builder retainStacksOnAccountRemoval data))
  (.build builder))


(defn build-cfn-stack-set-builder
  "The build-cfn-stack-set-builder function updates a CfnStackSet$Builder instance using the provided configuration.
  The function takes the CfnStackSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
"
  [^CfnStackSet$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-set-deployment-targets-property-builder
  "The build-cfn-stack-set-deployment-targets-property-builder function updates a CfnStackSet$DeploymentTargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$DeploymentTargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountFilterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-filter-type` |
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `accountsUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:accounts-url` |
| `organizationalUnitIds` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-ids` |
"
  [^CfnStackSet$DeploymentTargetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-filter-type)]
    (. builder accountFilterType data))
  (when-let [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-let [data (lookup-entry config id :accounts-url)]
    (. builder accountsUrl data))
  (when-let [data (lookup-entry config id :organizational-unit-ids)]
    (. builder organizationalUnitIds data))
  (.build builder))


(defn build-cfn-stack-set-managed-execution-property-builder
  "The build-cfn-stack-set-managed-execution-property-builder function updates a CfnStackSet$ManagedExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ManagedExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active` |
"
  [^CfnStackSet$ManagedExecutionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active)]
    (. builder active data))
  (.build builder))


(defn build-cfn-stack-set-operation-preferences-property-builder
  "The build-cfn-stack-set-operation-preferences-property-builder function updates a CfnStackSet$OperationPreferencesProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$OperationPreferencesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-count` |
| `failureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-tolerance-percentage` |
| `maxConcurrentCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-count` |
| `maxConcurrentPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-percentage` |
| `regionConcurrencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-concurrency-type` |
| `regionOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:region-order` |
"
  [^CfnStackSet$OperationPreferencesProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-set-parameter-property-builder
  "The build-cfn-stack-set-parameter-property-builder function updates a CfnStackSet$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnStackSet$ParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameter-key)]
    (. builder parameterKey data))
  (when-let [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn build-cfn-stack-set-props-builder
  "The build-cfn-stack-set-props-builder function updates a CfnStackSetProps$Builder instance using the provided configuration.
  The function takes the CfnStackSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-url` |
"
  [^CfnStackSetProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-set-stack-instances-property-builder
  "The build-cfn-stack-set-stack-instances-property-builder function updates a CfnStackSet$StackInstancesProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$StackInstancesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploymentTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deployment-targets` |
| `parameterOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:parameter-overrides` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^CfnStackSet$StackInstancesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :deployment-targets)]
    (. builder deploymentTargets data))
  (when-let [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn build-cfn-type-activation-builder
  "The build-cfn-type-activation-builder function updates a CfnTypeActivation$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |
"
  [^CfnTypeActivation$Builder builder id config]
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
  (.build builder))


(defn build-cfn-type-activation-logging-config-property-builder
  "The build-cfn-type-activation-logging-config-property-builder function updates a CfnTypeActivation$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnTypeActivation$LoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn build-cfn-type-activation-props-builder
  "The build-cfn-type-activation-props-builder function updates a CfnTypeActivationProps$Builder instance using the provided configuration.
  The function takes the CfnTypeActivationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `versionBump` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-bump` |
"
  [^CfnTypeActivationProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-wait-condition-builder
  "The build-cfn-wait-condition-builder function updates a CfnWaitCondition$Builder instance using the provided configuration.
  The function takes the CfnWaitCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnWaitCondition$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn build-cfn-wait-condition-handle-builder
  "The build-cfn-wait-condition-handle-builder function updates a CfnWaitConditionHandle$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionHandle$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnWaitConditionHandle$Builder builder id config]
  (.build builder))


(defn build-cfn-wait-condition-handle-props-builder
  "The build-cfn-wait-condition-handle-props-builder function updates a CfnWaitConditionHandleProps$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionHandleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnWaitConditionHandleProps$Builder builder id config]
  (.build builder))


(defn build-cfn-wait-condition-props-builder
  "The build-cfn-wait-condition-props-builder function updates a CfnWaitConditionProps$Builder instance using the provided configuration.
  The function takes the CfnWaitConditionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `handle` | java.lang.String | [[cdk.support/lookup-entry]] | `:handle` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnWaitConditionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))