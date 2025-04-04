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


(defn cfn-custom-resource-builder>
  "The cfn-custom-resource-builder> function updates a CfnCustomResource$Builder instance using the provided configuration.
  The function takes the CfnCustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResource$Builder builder id config]
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-builder
  "Creates a  `CfnCustomResource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-custom-resource-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-resource-builder> (CfnCustomResource$Builder/create scope (name id)) id config))


(defn cfn-custom-resource-props-builder>
  "The cfn-custom-resource-props-builder> function updates a CfnCustomResourceProps$Builder instance using the provided configuration.
  The function takes the CfnCustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-token` |
"
  [^CfnCustomResourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :service-token)]
    (. builder serviceToken data))
  (.build builder))


(defn cfn-custom-resource-props-builder
  "Creates a  `CfnCustomResourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-custom-resource-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-custom-resource-props-builder> (new CfnCustomResourceProps$Builder) id config))


(defn cfn-hook-default-version-builder>
  "The cfn-hook-default-version-builder> function updates a CfnHookDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-builder
  "Creates a  `CfnHookDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-default-version-builder> (CfnHookDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-hook-default-version-props-builder>
  "The cfn-hook-default-version-props-builder> function updates a CfnHookDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-hook-default-version-props-builder
  "Creates a  `CfnHookDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-default-version-props-builder> (new CfnHookDefaultVersionProps$Builder) id config))


(defn cfn-hook-type-config-builder>
  "The cfn-hook-type-config-builder> function updates a CfnHookTypeConfig$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-some [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-builder
  "Creates a  `CfnHookTypeConfig$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-type-config-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-type-config-builder> (CfnHookTypeConfig$Builder/create scope (name id)) id config))


(defn cfn-hook-type-config-props-builder>
  "The cfn-hook-type-config-props-builder> function updates a CfnHookTypeConfigProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :configuration-alias)]
    (. builder configurationAlias data))
  (when-some [data (lookup-entry config id :type-arn)]
    (. builder typeArn data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-type-config-props-builder
  "Creates a  `CfnHookTypeConfigProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-type-config-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-type-config-props-builder> (new CfnHookTypeConfigProps$Builder) id config))


(defn cfn-hook-version-builder>
  "The cfn-hook-version-builder> function updates a CfnHookVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-builder
  "Creates a  `CfnHookVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-hook-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-hook-version-builder> (CfnHookVersion$Builder/create scope (name id)) id config))


(defn cfn-hook-version-logging-config-property-builder>
  "The cfn-hook-version-logging-config-property-builder> function updates a CfnHookVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHookVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnHookVersion$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-hook-version-logging-config-property-builder
  "Creates a  `CfnHookVersion$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-version-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-version-logging-config-property-builder> (new CfnHookVersion$LoggingConfigProperty$Builder) id config))


(defn cfn-hook-version-props-builder>
  "The cfn-hook-version-props-builder> function updates a CfnHookVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-hook-version-props-builder
  "Creates a  `CfnHookVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-hook-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-hook-version-props-builder> (new CfnHookVersionProps$Builder) id config))


(defn cfn-macro-builder>
  "The cfn-macro-builder> function updates a CfnMacro$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-macro-builder
  "Creates a  `CfnMacro$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-macro-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-macro-builder> (CfnMacro$Builder/create scope (name id)) id config))


(defn cfn-macro-props-builder>
  "The cfn-macro-props-builder> function updates a CfnMacroProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-macro-props-builder
  "Creates a  `CfnMacroProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-macro-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-macro-props-builder> (new CfnMacroProps$Builder) id config))


(defn cfn-module-default-version-builder>
  "The cfn-module-default-version-builder> function updates a CfnModuleDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-builder
  "Creates a  `CfnModuleDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-module-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-module-default-version-builder> (CfnModuleDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-module-default-version-props-builder>
  "The cfn-module-default-version-props-builder> function updates a CfnModuleDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-module-default-version-props-builder
  "Creates a  `CfnModuleDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-module-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-module-default-version-props-builder> (new CfnModuleDefaultVersionProps$Builder) id config))


(defn cfn-module-version-builder>
  "The cfn-module-version-builder> function updates a CfnModuleVersion$Builder instance using the provided configuration.
  The function takes the CfnModuleVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-builder
  "Creates a  `CfnModuleVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-module-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-module-version-builder> (CfnModuleVersion$Builder/create scope (name id)) id config))


(defn cfn-module-version-props-builder>
  "The cfn-module-version-props-builder> function updates a CfnModuleVersionProps$Builder instance using the provided configuration.
  The function takes the CfnModuleVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `moduleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-name` |
| `modulePackage` | java.lang.String | [[cdk.support/lookup-entry]] | `:module-package` |
"
  [^CfnModuleVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :module-name)]
    (. builder moduleName data))
  (when-some [data (lookup-entry config id :module-package)]
    (. builder modulePackage data))
  (.build builder))


(defn cfn-module-version-props-builder
  "Creates a  `CfnModuleVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-module-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-module-version-props-builder> (new CfnModuleVersionProps$Builder) id config))


(defn cfn-public-type-version-builder>
  "The cfn-public-type-version-builder> function updates a CfnPublicTypeVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :log-delivery-bucket)]
    (. builder logDeliveryBucket data))
  (when-some [data (lookup-entry config id :public-version-number)]
    (. builder publicVersionNumber data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-public-type-version-builder
  "Creates a  `CfnPublicTypeVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-public-type-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-public-type-version-builder> (CfnPublicTypeVersion$Builder/create scope (name id)) id config))


(defn cfn-public-type-version-props-builder>
  "The cfn-public-type-version-props-builder> function updates a CfnPublicTypeVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :log-delivery-bucket)]
    (. builder logDeliveryBucket data))
  (when-some [data (lookup-entry config id :public-version-number)]
    (. builder publicVersionNumber data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-public-type-version-props-builder
  "Creates a  `CfnPublicTypeVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-public-type-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-public-type-version-props-builder> (new CfnPublicTypeVersionProps$Builder) id config))


(defn cfn-publisher-builder>
  "The cfn-publisher-builder> function updates a CfnPublisher$Builder instance using the provided configuration.
  The function takes the CfnPublisher$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisher$Builder builder id config]
  (when-some [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-builder
  "Creates a  `CfnPublisher$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-publisher-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-publisher-builder> (CfnPublisher$Builder/create scope (name id)) id config))


(defn cfn-publisher-props-builder>
  "The cfn-publisher-props-builder> function updates a CfnPublisherProps$Builder instance using the provided configuration.
  The function takes the CfnPublisherProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptTermsAndConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accept-terms-and-conditions` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnPublisherProps$Builder builder id config]
  (when-some [data (lookup-entry config id :accept-terms-and-conditions)]
    (. builder acceptTermsAndConditions data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-publisher-props-builder
  "Creates a  `CfnPublisherProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-publisher-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-publisher-props-builder> (new CfnPublisherProps$Builder) id config))


(defn cfn-resource-default-version-builder>
  "The cfn-resource-default-version-builder> function updates a CfnResourceDefaultVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-builder
  "Creates a  `CfnResourceDefaultVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-default-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-default-version-builder> (CfnResourceDefaultVersion$Builder/create scope (name id)) id config))


(defn cfn-resource-default-version-props-builder>
  "The cfn-resource-default-version-props-builder> function updates a CfnResourceDefaultVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-version-arn)]
    (. builder typeVersionArn data))
  (when-some [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-resource-default-version-props-builder
  "Creates a  `CfnResourceDefaultVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-default-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-default-version-props-builder> (new CfnResourceDefaultVersionProps$Builder) id config))


(defn cfn-resource-version-builder>
  "The cfn-resource-version-builder> function updates a CfnResourceVersion$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-builder
  "Creates a  `CfnResourceVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-version-builder> (CfnResourceVersion$Builder/create scope (name id)) id config))


(defn cfn-resource-version-logging-config-property-builder>
  "The cfn-resource-version-logging-config-property-builder> function updates a CfnResourceVersion$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceVersion$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnResourceVersion$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-resource-version-logging-config-property-builder
  "Creates a  `CfnResourceVersion$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-version-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-version-logging-config-property-builder> (new CfnResourceVersion$LoggingConfigProperty$Builder) id config))


(defn cfn-resource-version-props-builder>
  "The cfn-resource-version-props-builder> function updates a CfnResourceVersionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :schema-handler-package)]
    (. builder schemaHandlerPackage data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-resource-version-props-builder
  "Creates a  `CfnResourceVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-version-props-builder> (new CfnResourceVersionProps$Builder) id config))


(defn cfn-stack-builder>
  "The cfn-stack-builder> function updates a CfnStack$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-stack-builder
  "Creates a  `CfnStack$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stack-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stack-builder> (CfnStack$Builder/create scope (name id)) id config))


(defn cfn-stack-output-property-builder>
  "The cfn-stack-output-property-builder> function updates a CfnStack$OutputProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :export-name)]
    (. builder exportName data))
  (when-some [data (lookup-entry config id :output-key)]
    (. builder outputKey data))
  (when-some [data (lookup-entry config id :output-value)]
    (. builder outputValue data))
  (.build builder))


(defn cfn-stack-output-property-builder
  "Creates a  `CfnStack$OutputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-output-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-output-property-builder> (new CfnStack$OutputProperty$Builder) id config))


(defn cfn-stack-props-builder>
  "The cfn-stack-props-builder> function updates a CfnStackProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (when-some [data (lookup-entry config id :timeout-in-minutes)]
    (. builder timeoutInMinutes data))
  (.build builder))


(defn cfn-stack-props-builder
  "Creates a  `CfnStackProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-props-builder> (new CfnStackProps$Builder) id config))


(defn cfn-stack-set-auto-deployment-property-builder>
  "The cfn-stack-set-auto-deployment-property-builder> function updates a CfnStackSet$AutoDeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$AutoDeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `retainStacksOnAccountRemoval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-stacks-on-account-removal` |
"
  [^CfnStackSet$AutoDeploymentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :retain-stacks-on-account-removal)]
    (. builder retainStacksOnAccountRemoval data))
  (.build builder))


(defn cfn-stack-set-auto-deployment-property-builder
  "Creates a  `CfnStackSet$AutoDeploymentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-auto-deployment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-auto-deployment-property-builder> (new CfnStackSet$AutoDeploymentProperty$Builder) id config))


(defn cfn-stack-set-builder>
  "The cfn-stack-set-builder> function updates a CfnStackSet$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :administration-role-arn)]
    (. builder administrationRoleArn data))
  (when-some [data (lookup-entry config id :auto-deployment)]
    (. builder autoDeployment data))
  (when-some [data (lookup-entry config id :call-as)]
    (. builder callAs data))
  (when-some [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (when-some [data (lookup-entry config id :managed-execution)]
    (. builder managedExecution data))
  (when-some [data (lookup-entry config id :operation-preferences)]
    (. builder operationPreferences data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :stack-instances-group)]
    (. builder stackInstancesGroup data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (.build builder))


(defn cfn-stack-set-builder
  "Creates a  `CfnStackSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stack-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stack-set-builder> (CfnStackSet$Builder/create scope (name id)) id config))


(defn cfn-stack-set-deployment-targets-property-builder>
  "The cfn-stack-set-deployment-targets-property-builder> function updates a CfnStackSet$DeploymentTargetsProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :account-filter-type)]
    (. builder accountFilterType data))
  (when-some [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-some [data (lookup-entry config id :accounts-url)]
    (. builder accountsUrl data))
  (when-some [data (lookup-entry config id :organizational-unit-ids)]
    (. builder organizationalUnitIds data))
  (.build builder))


(defn cfn-stack-set-deployment-targets-property-builder
  "Creates a  `CfnStackSet$DeploymentTargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-deployment-targets-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-deployment-targets-property-builder> (new CfnStackSet$DeploymentTargetsProperty$Builder) id config))


(defn cfn-stack-set-managed-execution-property-builder>
  "The cfn-stack-set-managed-execution-property-builder> function updates a CfnStackSet$ManagedExecutionProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ManagedExecutionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active` |
"
  [^CfnStackSet$ManagedExecutionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :active)]
    (. builder active data))
  (.build builder))


(defn cfn-stack-set-managed-execution-property-builder
  "Creates a  `CfnStackSet$ManagedExecutionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-managed-execution-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-managed-execution-property-builder> (new CfnStackSet$ManagedExecutionProperty$Builder) id config))


(defn cfn-stack-set-operation-preferences-property-builder>
  "The cfn-stack-set-operation-preferences-property-builder> function updates a CfnStackSet$OperationPreferencesProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :failure-tolerance-count)]
    (. builder failureToleranceCount data))
  (when-some [data (lookup-entry config id :failure-tolerance-percentage)]
    (. builder failureTolerancePercentage data))
  (when-some [data (lookup-entry config id :max-concurrent-count)]
    (. builder maxConcurrentCount data))
  (when-some [data (lookup-entry config id :max-concurrent-percentage)]
    (. builder maxConcurrentPercentage data))
  (when-some [data (lookup-entry config id :region-concurrency-type)]
    (. builder regionConcurrencyType data))
  (when-some [data (lookup-entry config id :region-order)]
    (. builder regionOrder data))
  (.build builder))


(defn cfn-stack-set-operation-preferences-property-builder
  "Creates a  `CfnStackSet$OperationPreferencesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-operation-preferences-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-operation-preferences-property-builder> (new CfnStackSet$OperationPreferencesProperty$Builder) id config))


(defn cfn-stack-set-parameter-property-builder>
  "The cfn-stack-set-parameter-property-builder> function updates a CfnStackSet$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnStackSet$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnStackSet$ParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-key)]
    (. builder parameterKey data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-stack-set-parameter-property-builder
  "Creates a  `CfnStackSet$ParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-parameter-property-builder> (new CfnStackSet$ParameterProperty$Builder) id config))


(defn cfn-stack-set-props-builder>
  "The cfn-stack-set-props-builder> function updates a CfnStackSetProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :administration-role-arn)]
    (. builder administrationRoleArn data))
  (when-some [data (lookup-entry config id :auto-deployment)]
    (. builder autoDeployment data))
  (when-some [data (lookup-entry config id :call-as)]
    (. builder callAs data))
  (when-some [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (when-some [data (lookup-entry config id :managed-execution)]
    (. builder managedExecution data))
  (when-some [data (lookup-entry config id :operation-preferences)]
    (. builder operationPreferences data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :stack-instances-group)]
    (. builder stackInstancesGroup data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-url)]
    (. builder templateUrl data))
  (.build builder))


(defn cfn-stack-set-props-builder
  "Creates a  `CfnStackSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-props-builder> (new CfnStackSetProps$Builder) id config))


(defn cfn-stack-set-stack-instances-property-builder>
  "The cfn-stack-set-stack-instances-property-builder> function updates a CfnStackSet$StackInstancesProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :deployment-targets)]
    (. builder deploymentTargets data))
  (when-some [data (lookup-entry config id :parameter-overrides)]
    (. builder parameterOverrides data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn cfn-stack-set-stack-instances-property-builder
  "Creates a  `CfnStackSet$StackInstancesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-set-stack-instances-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-set-stack-instances-property-builder> (new CfnStackSet$StackInstancesProperty$Builder) id config))


(defn cfn-type-activation-builder>
  "The cfn-type-activation-builder> function updates a CfnTypeActivation$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-update)]
    (. builder autoUpdate data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :major-version)]
    (. builder majorVersion data))
  (when-some [data (lookup-entry config id :public-type-arn)]
    (. builder publicTypeArn data))
  (when-some [data (lookup-entry config id :publisher-id)]
    (. builder publisherId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-name-alias)]
    (. builder typeNameAlias data))
  (when-some [data (lookup-entry config id :version-bump)]
    (. builder versionBump data))
  (.build builder))


(defn cfn-type-activation-builder
  "Creates a  `CfnTypeActivation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-type-activation-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-type-activation-builder> (CfnTypeActivation$Builder/create scope (name id)) id config))


(defn cfn-type-activation-logging-config-property-builder>
  "The cfn-type-activation-logging-config-property-builder> function updates a CfnTypeActivation$LoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTypeActivation$LoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `logRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-role-arn` |
"
  [^CfnTypeActivation$LoggingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :log-role-arn)]
    (. builder logRoleArn data))
  (.build builder))


(defn cfn-type-activation-logging-config-property-builder
  "Creates a  `CfnTypeActivation$LoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-type-activation-logging-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-type-activation-logging-config-property-builder> (new CfnTypeActivation$LoggingConfigProperty$Builder) id config))


(defn cfn-type-activation-props-builder>
  "The cfn-type-activation-props-builder> function updates a CfnTypeActivationProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :auto-update)]
    (. builder autoUpdate data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :major-version)]
    (. builder majorVersion data))
  (when-some [data (lookup-entry config id :public-type-arn)]
    (. builder publicTypeArn data))
  (when-some [data (lookup-entry config id :publisher-id)]
    (. builder publisherId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (when-some [data (lookup-entry config id :type-name-alias)]
    (. builder typeNameAlias data))
  (when-some [data (lookup-entry config id :version-bump)]
    (. builder versionBump data))
  (.build builder))


(defn cfn-type-activation-props-builder
  "Creates a  `CfnTypeActivationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-type-activation-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-type-activation-props-builder> (new CfnTypeActivationProps$Builder) id config))


(defn cfn-wait-condition-builder>
  "The cfn-wait-condition-builder> function updates a CfnWaitCondition$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-builder
  "Creates a  `CfnWaitCondition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-wait-condition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-wait-condition-builder> (CfnWaitCondition$Builder/create scope (name id)) id config))


(defn cfn-wait-condition-handle-builder
  "Creates a  `CfnWaitConditionHandle$Builder` instance using a parent scope and ID, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |"
  [^software.constructs.Construct scope id]
  (.build (CfnWaitConditionHandle$Builder/create scope (name id))))


(defn cfn-wait-condition-handle-props-builder
  "Creates a  `CfnWaitConditionHandleProps$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new CfnWaitConditionHandleProps$Builder)))


(defn cfn-wait-condition-props-builder>
  "The cfn-wait-condition-props-builder> function updates a CfnWaitConditionProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :handle)]
    (. builder handle data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-wait-condition-props-builder
  "Creates a  `CfnWaitConditionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wait-condition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wait-condition-props-builder> (new CfnWaitConditionProps$Builder) id config))