(ns cdk.api.services.entityresolution
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.entityresolution package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.entityresolution CfnIdMappingWorkflow$Builder
                                                             CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder
                                                             CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder
                                                             CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder
                                                             CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder
                                                             CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder
                                                             CfnIdMappingWorkflowProps$Builder
                                                             CfnIdNamespace$Builder
                                                             CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder
                                                             CfnIdNamespace$IdNamespaceInputSourceProperty$Builder
                                                             CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder
                                                             CfnIdNamespaceProps$Builder
                                                             CfnMatchingWorkflow$Builder
                                                             CfnMatchingWorkflow$InputSourceProperty$Builder
                                                             CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder
                                                             CfnMatchingWorkflow$OutputAttributeProperty$Builder
                                                             CfnMatchingWorkflow$OutputSourceProperty$Builder
                                                             CfnMatchingWorkflow$ProviderPropertiesProperty$Builder
                                                             CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder
                                                             CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder
                                                             CfnMatchingWorkflow$RuleProperty$Builder
                                                             CfnMatchingWorkflowProps$Builder
                                                             CfnPolicyStatement$Builder
                                                             CfnPolicyStatementProps$Builder
                                                             CfnSchemaMapping$Builder
                                                             CfnSchemaMapping$SchemaInputAttributeProperty$Builder
                                                             CfnSchemaMappingProps$Builder]))


(defn cfn-id-mapping-workflow-builder>
  "The cfn-id-mapping-workflow-builder> function updates a CfnIdMappingWorkflow$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingTechniques` | software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow$IdMappingTechniquesProperty | [[cdk.support/lookup-entry]] | `:id-mapping-techniques` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnIdMappingWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id-mapping-techniques)]
    (. builder idMappingTechniques data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :output-source-config)]
    (. builder outputSourceConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-id-mapping-workflow-builder
  "Creates a  `CfnIdMappingWorkflow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-id-mapping-workflow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-id-mapping-workflow-builder> (CfnIdMappingWorkflow$Builder/create scope (name id)) id config))


(defn cfn-id-mapping-workflow-id-mapping-techniques-property-builder>
  "The cfn-id-mapping-workflow-id-mapping-techniques-property-builder> function updates a CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idMappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-mapping-type` |
| `providerProperties` | software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow$ProviderPropertiesProperty | [[cdk.support/lookup-entry]] | `:provider-properties` |
"
  [^CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id-mapping-type)]
    (. builder idMappingType data))
  (when-some [data (lookup-entry config id :provider-properties)]
    (. builder providerProperties data))
  (.build builder))


(defn cfn-id-mapping-workflow-id-mapping-techniques-property-builder
  "Creates a  `CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-id-mapping-techniques-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-id-mapping-techniques-property-builder> (new CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder) id config))


(defn cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder>
  "The cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder> function updates a CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-source-arn)]
    (. builder inputSourceArn data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder
  "Creates a  `CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder> (new CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder) id config))


(defn cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder>
  "The cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder> function updates a CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `outputS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-path` |
"
  [^CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (when-some [data (lookup-entry config id :output-s3-path)]
    (. builder outputS3Path data))
  (.build builder))


(defn cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder
  "Creates a  `CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder> (new CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder) id config))


(defn cfn-id-mapping-workflow-intermediate-source-configuration-property-builder>
  "The cfn-id-mapping-workflow-intermediate-source-configuration-property-builder> function updates a CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-s3-path` |
"
  [^CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :intermediate-s3-path)]
    (. builder intermediateS3Path data))
  (.build builder))


(defn cfn-id-mapping-workflow-intermediate-source-configuration-property-builder
  "Creates a  `CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-intermediate-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-intermediate-source-configuration-property-builder> (new CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder) id config))


(defn cfn-id-mapping-workflow-props-builder>
  "The cfn-id-mapping-workflow-props-builder> function updates a CfnIdMappingWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingTechniques` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id-mapping-techniques` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnIdMappingWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id-mapping-techniques)]
    (. builder idMappingTechniques data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :output-source-config)]
    (. builder outputSourceConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-id-mapping-workflow-props-builder
  "Creates a  `CfnIdMappingWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-props-builder> (new CfnIdMappingWorkflowProps$Builder) id config))


(defn cfn-id-mapping-workflow-provider-properties-property-builder>
  "The cfn-id-mapping-workflow-provider-properties-property-builder> function updates a CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateSourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:intermediate-source-configuration` |
| `providerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |
"
  [^CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :intermediate-source-configuration)]
    (. builder intermediateSourceConfiguration data))
  (when-some [data (lookup-entry config id :provider-configuration)]
    (. builder providerConfiguration data))
  (when-some [data (lookup-entry config id :provider-service-arn)]
    (. builder providerServiceArn data))
  (.build builder))


(defn cfn-id-mapping-workflow-provider-properties-property-builder
  "Creates a  `CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-mapping-workflow-provider-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-mapping-workflow-provider-properties-property-builder> (new CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder) id config))


(defn cfn-id-namespace-builder>
  "The cfn-id-namespace-builder> function updates a CfnIdNamespace$Builder instance using the provided configuration.
  The function takes the CfnIdNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingWorkflowProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:id-mapping-workflow-properties` |
| `idNamespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-namespace-name` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id-mapping-workflow-properties)]
    (. builder idMappingWorkflowProperties data))
  (when-some [data (lookup-entry config id :id-namespace-name)]
    (. builder idNamespaceName data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-id-namespace-builder
  "Creates a  `CfnIdNamespace$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-id-namespace-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-id-namespace-builder> (CfnIdNamespace$Builder/create scope (name id)) id config))


(defn cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder>
  "The cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder> function updates a CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idMappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-mapping-type` |
| `providerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-properties` |
"
  [^CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id-mapping-type)]
    (. builder idMappingType data))
  (when-some [data (lookup-entry config id :provider-properties)]
    (. builder providerProperties data))
  (.build builder))


(defn cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder
  "Creates a  `CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder> (new CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder) id config))


(defn cfn-id-namespace-id-namespace-input-source-property-builder>
  "The cfn-id-namespace-id-namespace-input-source-property-builder> function updates a CfnIdNamespace$IdNamespaceInputSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnIdNamespace$IdNamespaceInputSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
"
  [^CfnIdNamespace$IdNamespaceInputSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-source-arn)]
    (. builder inputSourceArn data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (.build builder))


(defn cfn-id-namespace-id-namespace-input-source-property-builder
  "Creates a  `CfnIdNamespace$IdNamespaceInputSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-namespace-id-namespace-input-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-namespace-id-namespace-input-source-property-builder> (new CfnIdNamespace$IdNamespaceInputSourceProperty$Builder) id config))


(defn cfn-id-namespace-namespace-provider-properties-property-builder>
  "The cfn-id-namespace-namespace-provider-properties-property-builder> function updates a CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerConfiguration` | java.util.Map | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |
"
  [^CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :provider-configuration)]
    (. builder providerConfiguration data))
  (when-some [data (lookup-entry config id :provider-service-arn)]
    (. builder providerServiceArn data))
  (.build builder))


(defn cfn-id-namespace-namespace-provider-properties-property-builder
  "Creates a  `CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-namespace-namespace-provider-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-namespace-namespace-provider-properties-property-builder> (new CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder) id config))


(defn cfn-id-namespace-props-builder>
  "The cfn-id-namespace-props-builder> function updates a CfnIdNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnIdNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingWorkflowProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id-mapping-workflow-properties` |
| `idNamespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-namespace-name` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnIdNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id-mapping-workflow-properties)]
    (. builder idMappingWorkflowProperties data))
  (when-some [data (lookup-entry config id :id-namespace-name)]
    (. builder idNamespaceName data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-id-namespace-props-builder
  "Creates a  `CfnIdNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-id-namespace-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-id-namespace-props-builder> (new CfnIdNamespaceProps$Builder) id config))


(defn cfn-matching-workflow-builder>
  "The cfn-matching-workflow-builder> function updates a CfnMatchingWorkflow$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `resolutionTechniques` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ResolutionTechniquesProperty | [[cdk.support/lookup-entry]] | `:resolution-techniques` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnMatchingWorkflow$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :output-source-config)]
    (. builder outputSourceConfig data))
  (when-some [data (lookup-entry config id :resolution-techniques)]
    (. builder resolutionTechniques data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-matching-workflow-builder
  "Creates a  `CfnMatchingWorkflow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-matching-workflow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-matching-workflow-builder> (CfnMatchingWorkflow$Builder/create scope (name id)) id config))


(defn cfn-matching-workflow-input-source-property-builder>
  "The cfn-matching-workflow-input-source-property-builder> function updates a CfnMatchingWorkflow$InputSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$InputSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyNormalization` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-normalization` |
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
"
  [^CfnMatchingWorkflow$InputSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-normalization)]
    (. builder applyNormalization data))
  (when-some [data (lookup-entry config id :input-source-arn)]
    (. builder inputSourceArn data))
  (when-some [data (lookup-entry config id :schema-arn)]
    (. builder schemaArn data))
  (.build builder))


(defn cfn-matching-workflow-input-source-property-builder
  "Creates a  `CfnMatchingWorkflow$InputSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-input-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-input-source-property-builder> (new CfnMatchingWorkflow$InputSourceProperty$Builder) id config))


(defn cfn-matching-workflow-intermediate-source-configuration-property-builder>
  "The cfn-matching-workflow-intermediate-source-configuration-property-builder> function updates a CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-s3-path` |
"
  [^CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :intermediate-s3-path)]
    (. builder intermediateS3Path data))
  (.build builder))


(defn cfn-matching-workflow-intermediate-source-configuration-property-builder
  "Creates a  `CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-intermediate-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-intermediate-source-configuration-property-builder> (new CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder) id config))


(defn cfn-matching-workflow-output-attribute-property-builder>
  "The cfn-matching-workflow-output-attribute-property-builder> function updates a CfnMatchingWorkflow$OutputAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$OutputAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hashed` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hashed` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMatchingWorkflow$OutputAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hashed)]
    (. builder hashed data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-matching-workflow-output-attribute-property-builder
  "Creates a  `CfnMatchingWorkflow$OutputAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-output-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-output-attribute-property-builder> (new CfnMatchingWorkflow$OutputAttributeProperty$Builder) id config))


(defn cfn-matching-workflow-output-source-property-builder>
  "The cfn-matching-workflow-output-source-property-builder> function updates a CfnMatchingWorkflow$OutputSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$OutputSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyNormalization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apply-normalization` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `output` | java.util.List | [[cdk.support/lookup-entry]] | `:output` |
| `outputS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-path` |
"
  [^CfnMatchingWorkflow$OutputSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-normalization)]
    (. builder applyNormalization data))
  (when-some [data (lookup-entry config id :kms-arn)]
    (. builder kmsArn data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :output-s3-path)]
    (. builder outputS3Path data))
  (.build builder))


(defn cfn-matching-workflow-output-source-property-builder
  "Creates a  `CfnMatchingWorkflow$OutputSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-output-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-output-source-property-builder> (new CfnMatchingWorkflow$OutputSourceProperty$Builder) id config))


(defn cfn-matching-workflow-props-builder>
  "The cfn-matching-workflow-props-builder> function updates a CfnMatchingWorkflowProps$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `resolutionTechniques` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ResolutionTechniquesProperty | [[cdk.support/lookup-entry]] | `:resolution-techniques` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |
"
  [^CfnMatchingWorkflowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :input-source-config)]
    (. builder inputSourceConfig data))
  (when-some [data (lookup-entry config id :output-source-config)]
    (. builder outputSourceConfig data))
  (when-some [data (lookup-entry config id :resolution-techniques)]
    (. builder resolutionTechniques data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workflow-name)]
    (. builder workflowName data))
  (.build builder))


(defn cfn-matching-workflow-props-builder
  "Creates a  `CfnMatchingWorkflowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-props-builder> (new CfnMatchingWorkflowProps$Builder) id config))


(defn cfn-matching-workflow-provider-properties-property-builder>
  "The cfn-matching-workflow-provider-properties-property-builder> function updates a CfnMatchingWorkflow$ProviderPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$ProviderPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateSourceConfiguration` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$IntermediateSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:intermediate-source-configuration` |
| `providerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |
"
  [^CfnMatchingWorkflow$ProviderPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :intermediate-source-configuration)]
    (. builder intermediateSourceConfiguration data))
  (when-some [data (lookup-entry config id :provider-configuration)]
    (. builder providerConfiguration data))
  (when-some [data (lookup-entry config id :provider-service-arn)]
    (. builder providerServiceArn data))
  (.build builder))


(defn cfn-matching-workflow-provider-properties-property-builder
  "Creates a  `CfnMatchingWorkflow$ProviderPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-provider-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-provider-properties-property-builder> (new CfnMatchingWorkflow$ProviderPropertiesProperty$Builder) id config))


(defn cfn-matching-workflow-resolution-techniques-property-builder>
  "The cfn-matching-workflow-resolution-techniques-property-builder> function updates a CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerProperties` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ProviderPropertiesProperty | [[cdk.support/lookup-entry]] | `:provider-properties` |
| `resolutionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-type` |
| `ruleBasedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-based-properties` |
"
  [^CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :provider-properties)]
    (. builder providerProperties data))
  (when-some [data (lookup-entry config id :resolution-type)]
    (. builder resolutionType data))
  (when-some [data (lookup-entry config id :rule-based-properties)]
    (. builder ruleBasedProperties data))
  (.build builder))


(defn cfn-matching-workflow-resolution-techniques-property-builder
  "Creates a  `CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-resolution-techniques-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-resolution-techniques-property-builder> (new CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder) id config))


(defn cfn-matching-workflow-rule-based-properties-property-builder>
  "The cfn-matching-workflow-rule-based-properties-property-builder> function updates a CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMatchingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-matching-model` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-matching-model)]
    (. builder attributeMatchingModel data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-matching-workflow-rule-based-properties-property-builder
  "Creates a  `CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-rule-based-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-rule-based-properties-property-builder> (new CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder) id config))


(defn cfn-matching-workflow-rule-property-builder>
  "The cfn-matching-workflow-rule-property-builder> function updates a CfnMatchingWorkflow$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchingWorkflow$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-keys` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^CfnMatchingWorkflow$RuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :matching-keys)]
    (. builder matchingKeys data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))


(defn cfn-matching-workflow-rule-property-builder
  "Creates a  `CfnMatchingWorkflow$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-matching-workflow-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-matching-workflow-rule-property-builder> (new CfnMatchingWorkflow$RuleProperty$Builder) id config))


(defn cfn-policy-statement-builder>
  "The cfn-policy-statement-builder> function updates a CfnPolicyStatement$Builder instance using the provided configuration.
  The function takes the CfnPolicyStatement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.util.List | [[cdk.support/lookup-entry]] | `:action` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `principal` | java.util.List | [[cdk.support/lookup-entry]] | `:principal` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnPolicyStatement$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-some [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn cfn-policy-statement-builder
  "Creates a  `CfnPolicyStatement$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-policy-statement-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-statement-builder> (CfnPolicyStatement$Builder/create scope (name id)) id config))


(defn cfn-policy-statement-props-builder>
  "The cfn-policy-statement-props-builder> function updates a CfnPolicyStatementProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyStatementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.util.List | [[cdk.support/lookup-entry]] | `:action` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `principal` | java.util.List | [[cdk.support/lookup-entry]] | `:principal` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |
"
  [^CfnPolicyStatementProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-some [data (lookup-entry config id :statement-id)]
    (. builder statementId data))
  (.build builder))


(defn cfn-policy-statement-props-builder
  "Creates a  `CfnPolicyStatementProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-policy-statement-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-policy-statement-props-builder> (new CfnPolicyStatementProps$Builder) id config))


(defn cfn-schema-mapping-builder>
  "The cfn-schema-mapping-builder> function updates a CfnSchemaMapping$Builder instance using the provided configuration.
  The function takes the CfnSchemaMapping$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mappedInputFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mapped-input-fields` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchemaMapping$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :mapped-input-fields)]
    (. builder mappedInputFields data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schema-mapping-builder
  "Creates a  `CfnSchemaMapping$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-schema-mapping-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-schema-mapping-builder> (CfnSchemaMapping$Builder/create scope (name id)) id config))


(defn cfn-schema-mapping-props-builder>
  "The cfn-schema-mapping-props-builder> function updates a CfnSchemaMappingProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaMappingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mappedInputFields` | java.util.List | [[cdk.support/lookup-entry]] | `:mapped-input-fields` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSchemaMappingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :mapped-input-fields)]
    (. builder mappedInputFields data))
  (when-some [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-schema-mapping-props-builder
  "Creates a  `CfnSchemaMappingProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-schema-mapping-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-schema-mapping-props-builder> (new CfnSchemaMappingProps$Builder) id config))


(defn cfn-schema-mapping-schema-input-attribute-property-builder>
  "The cfn-schema-mapping-schema-input-attribute-property-builder> function updates a CfnSchemaMapping$SchemaInputAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnSchemaMapping$SchemaInputAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `matchKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-key` |
| `subType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sub-type` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSchemaMapping$SchemaInputAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-name)]
    (. builder fieldName data))
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :match-key)]
    (. builder matchKey data))
  (when-some [data (lookup-entry config id :sub-type)]
    (. builder subType data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-schema-mapping-schema-input-attribute-property-builder
  "Creates a  `CfnSchemaMapping$SchemaInputAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-schema-mapping-schema-input-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-schema-mapping-schema-input-attribute-property-builder> (new CfnSchemaMapping$SchemaInputAttributeProperty$Builder) id config))