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


(defn cfn-id-mapping-workflow-builder
  "The cfn-id-mapping-workflow-builder function buildes out new instances of 
CfnIdMappingWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingTechniques` | software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow$IdMappingTechniquesProperty | [[cdk.support/lookup-entry]] | `:id-mapping-techniques` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id-mapping-techniques)]
      (. builder idMappingTechniques data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :output-source-config)]
      (. builder outputSourceConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-id-mapping-workflow-id-mapping-techniques-property-builder
  "The cfn-id-mapping-workflow-id-mapping-techniques-property-builder function buildes out new instances of 
CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idMappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-mapping-type` |
| `providerProperties` | software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow$ProviderPropertiesProperty | [[cdk.support/lookup-entry]] | `:provider-properties` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$IdMappingTechniquesProperty$Builder.)]
    (when-let [data (lookup-entry config id :id-mapping-type)]
      (. builder idMappingType data))
    (when-let [data (lookup-entry config id :provider-properties)]
      (. builder providerProperties data))
    (.build builder)))


(defn cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder
  "The cfn-id-mapping-workflow-id-mapping-workflow-input-source-property-builder function buildes out new instances of 
CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$IdMappingWorkflowInputSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-source-arn)]
      (. builder inputSourceArn data))
    (when-let [data (lookup-entry config id :schema-arn)]
      (. builder schemaArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder
  "The cfn-id-mapping-workflow-id-mapping-workflow-output-source-property-builder function buildes out new instances of 
CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `outputS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-path` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$IdMappingWorkflowOutputSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (when-let [data (lookup-entry config id :output-s3-path)]
      (. builder outputS3Path data))
    (.build builder)))


(defn cfn-id-mapping-workflow-intermediate-source-configuration-property-builder
  "The cfn-id-mapping-workflow-intermediate-source-configuration-property-builder function buildes out new instances of 
CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-s3-path` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$IntermediateSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :intermediate-s3-path)]
      (. builder intermediateS3Path data))
    (.build builder)))


(defn cfn-id-mapping-workflow-props-builder
  "The cfn-id-mapping-workflow-props-builder function buildes out new instances of 
CfnIdMappingWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingTechniques` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id-mapping-techniques` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id-mapping-techniques)]
      (. builder idMappingTechniques data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :output-source-config)]
      (. builder outputSourceConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-id-mapping-workflow-provider-properties-property-builder
  "The cfn-id-mapping-workflow-provider-properties-property-builder function buildes out new instances of 
CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateSourceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:intermediate-source-configuration` |
| `providerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |"
  [stack id config]
  (let [builder (CfnIdMappingWorkflow$ProviderPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :intermediate-source-configuration)]
      (. builder intermediateSourceConfiguration data))
    (when-let [data (lookup-entry config id :provider-configuration)]
      (. builder providerConfiguration data))
    (when-let [data (lookup-entry config id :provider-service-arn)]
      (. builder providerServiceArn data))
    (.build builder)))


(defn cfn-id-namespace-builder
  "The cfn-id-namespace-builder function buildes out new instances of 
CfnIdNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingWorkflowProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:id-mapping-workflow-properties` |
| `idNamespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-namespace-name` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIdNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id-mapping-workflow-properties)]
      (. builder idMappingWorkflowProperties data))
    (when-let [data (lookup-entry config id :id-namespace-name)]
      (. builder idNamespaceName data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder
  "The cfn-id-namespace-id-namespace-id-mapping-workflow-properties-property-builder function buildes out new instances of 
CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idMappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-mapping-type` |
| `providerProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-properties` |"
  [stack id config]
  (let [builder (CfnIdNamespace$IdNamespaceIdMappingWorkflowPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :id-mapping-type)]
      (. builder idMappingType data))
    (when-let [data (lookup-entry config id :provider-properties)]
      (. builder providerProperties data))
    (.build builder)))


(defn cfn-id-namespace-id-namespace-input-source-property-builder
  "The cfn-id-namespace-id-namespace-input-source-property-builder function buildes out new instances of 
CfnIdNamespace$IdNamespaceInputSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |"
  [stack id config]
  (let [builder (CfnIdNamespace$IdNamespaceInputSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-source-arn)]
      (. builder inputSourceArn data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (.build builder)))


(defn cfn-id-namespace-namespace-provider-properties-property-builder
  "The cfn-id-namespace-namespace-provider-properties-property-builder function buildes out new instances of 
CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerConfiguration` | java.util.Map | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |"
  [stack id config]
  (let [builder (CfnIdNamespace$NamespaceProviderPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :provider-configuration)]
      (. builder providerConfiguration data))
    (when-let [data (lookup-entry config id :provider-service-arn)]
      (. builder providerServiceArn data))
    (.build builder)))


(defn cfn-id-namespace-props-builder
  "The cfn-id-namespace-props-builder function buildes out new instances of 
CfnIdNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idMappingWorkflowProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id-mapping-workflow-properties` |
| `idNamespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:id-namespace-name` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIdNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id-mapping-workflow-properties)]
      (. builder idMappingWorkflowProperties data))
    (when-let [data (lookup-entry config id :id-namespace-name)]
      (. builder idNamespaceName data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-matching-workflow-builder
  "The cfn-matching-workflow-builder function buildes out new instances of 
CfnMatchingWorkflow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `resolutionTechniques` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ResolutionTechniquesProperty | [[cdk.support/lookup-entry]] | `:resolution-techniques` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :output-source-config)]
      (. builder outputSourceConfig data))
    (when-let [data (lookup-entry config id :resolution-techniques)]
      (. builder resolutionTechniques data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-matching-workflow-input-source-property-builder
  "The cfn-matching-workflow-input-source-property-builder function buildes out new instances of 
CfnMatchingWorkflow$InputSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyNormalization` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:apply-normalization` |
| `inputSourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-source-arn` |
| `schemaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-arn` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$InputSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :apply-normalization)]
      (. builder applyNormalization data))
    (when-let [data (lookup-entry config id :input-source-arn)]
      (. builder inputSourceArn data))
    (when-let [data (lookup-entry config id :schema-arn)]
      (. builder schemaArn data))
    (.build builder)))


(defn cfn-matching-workflow-intermediate-source-configuration-property-builder
  "The cfn-matching-workflow-intermediate-source-configuration-property-builder function buildes out new instances of 
CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:intermediate-s3-path` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$IntermediateSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :intermediate-s3-path)]
      (. builder intermediateS3Path data))
    (.build builder)))


(defn cfn-matching-workflow-output-attribute-property-builder
  "The cfn-matching-workflow-output-attribute-property-builder function buildes out new instances of 
CfnMatchingWorkflow$OutputAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hashed` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hashed` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$OutputAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :hashed)]
      (. builder hashed data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-matching-workflow-output-source-property-builder
  "The cfn-matching-workflow-output-source-property-builder function buildes out new instances of 
CfnMatchingWorkflow$OutputSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyNormalization` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apply-normalization` |
| `kmsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-arn` |
| `output` | java.util.List | [[cdk.support/lookup-entry]] | `:output` |
| `outputS3Path` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-path` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$OutputSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :apply-normalization)]
      (. builder applyNormalization data))
    (when-let [data (lookup-entry config id :kms-arn)]
      (. builder kmsArn data))
    (when-let [data (lookup-entry config id :output)]
      (. builder output data))
    (when-let [data (lookup-entry config id :output-s3-path)]
      (. builder outputS3Path data))
    (.build builder)))


(defn cfn-matching-workflow-props-builder
  "The cfn-matching-workflow-props-builder function buildes out new instances of 
CfnMatchingWorkflowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:input-source-config` |
| `outputSourceConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:output-source-config` |
| `resolutionTechniques` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ResolutionTechniquesProperty | [[cdk.support/lookup-entry]] | `:resolution-techniques` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workflowName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workflow-name` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflowProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :input-source-config)]
      (. builder inputSourceConfig data))
    (when-let [data (lookup-entry config id :output-source-config)]
      (. builder outputSourceConfig data))
    (when-let [data (lookup-entry config id :resolution-techniques)]
      (. builder resolutionTechniques data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workflow-name)]
      (. builder workflowName data))
    (.build builder)))


(defn cfn-matching-workflow-provider-properties-property-builder
  "The cfn-matching-workflow-provider-properties-property-builder function buildes out new instances of 
CfnMatchingWorkflow$ProviderPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intermediateSourceConfiguration` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$IntermediateSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:intermediate-source-configuration` |
| `providerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provider-configuration` |
| `providerServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-service-arn` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$ProviderPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :intermediate-source-configuration)]
      (. builder intermediateSourceConfiguration data))
    (when-let [data (lookup-entry config id :provider-configuration)]
      (. builder providerConfiguration data))
    (when-let [data (lookup-entry config id :provider-service-arn)]
      (. builder providerServiceArn data))
    (.build builder)))


(defn cfn-matching-workflow-resolution-techniques-property-builder
  "The cfn-matching-workflow-resolution-techniques-property-builder function buildes out new instances of 
CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `providerProperties` | software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow$ProviderPropertiesProperty | [[cdk.support/lookup-entry]] | `:provider-properties` |
| `resolutionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-type` |
| `ruleBasedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-based-properties` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$ResolutionTechniquesProperty$Builder.)]
    (when-let [data (lookup-entry config id :provider-properties)]
      (. builder providerProperties data))
    (when-let [data (lookup-entry config id :resolution-type)]
      (. builder resolutionType data))
    (when-let [data (lookup-entry config id :rule-based-properties)]
      (. builder ruleBasedProperties data))
    (.build builder)))


(defn cfn-matching-workflow-rule-based-properties-property-builder
  "The cfn-matching-workflow-rule-based-properties-property-builder function buildes out new instances of 
CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeMatchingModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-matching-model` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$RuleBasedPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-matching-model)]
      (. builder attributeMatchingModel data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-matching-workflow-rule-property-builder
  "The cfn-matching-workflow-rule-property-builder function buildes out new instances of 
CfnMatchingWorkflow$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:matching-keys` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |"
  [stack id config]
  (let [builder (CfnMatchingWorkflow$RuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :matching-keys)]
      (. builder matchingKeys data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (.build builder)))


(defn cfn-policy-statement-builder
  "The cfn-policy-statement-builder function buildes out new instances of 
CfnPolicyStatement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.util.List | [[cdk.support/lookup-entry]] | `:action` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `principal` | java.util.List | [[cdk.support/lookup-entry]] | `:principal` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnPolicyStatement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn cfn-policy-statement-props-builder
  "The cfn-policy-statement-props-builder function buildes out new instances of 
CfnPolicyStatementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.util.List | [[cdk.support/lookup-entry]] | `:action` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `effect` | java.lang.String | [[cdk.support/lookup-entry]] | `:effect` |
| `principal` | java.util.List | [[cdk.support/lookup-entry]] | `:principal` |
| `statementId` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement-id` |"
  [stack id config]
  (let [builder (CfnPolicyStatementProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :statement-id)]
      (. builder statementId data))
    (.build builder)))


(defn cfn-schema-mapping-builder
  "The cfn-schema-mapping-builder function buildes out new instances of 
CfnSchemaMapping$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mappedInputFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mapped-input-fields` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchemaMapping$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :mapped-input-fields)]
      (. builder mappedInputFields data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schema-mapping-props-builder
  "The cfn-schema-mapping-props-builder function buildes out new instances of 
CfnSchemaMappingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mappedInputFields` | java.util.List | [[cdk.support/lookup-entry]] | `:mapped-input-fields` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSchemaMappingProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :mapped-input-fields)]
      (. builder mappedInputFields data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-schema-mapping-schema-input-attribute-property-builder
  "The cfn-schema-mapping-schema-input-attribute-property-builder function buildes out new instances of 
CfnSchemaMapping$SchemaInputAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `matchKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-key` |
| `subType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sub-type` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSchemaMapping$SchemaInputAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :match-key)]
      (. builder matchKey data))
    (when-let [data (lookup-entry config id :sub-type)]
      (. builder subType data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))