(ns cdk.api.services.wisdom
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.wisdom package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.wisdom CfnAssistant$Builder
                                                   CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder
                                                   CfnAssistantAssociation$AssociationDataProperty$Builder
                                                   CfnAssistantAssociation$Builder
                                                   CfnAssistantAssociationProps$Builder
                                                   CfnAssistantProps$Builder
                                                   CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder
                                                   CfnKnowledgeBase$Builder
                                                   CfnKnowledgeBase$RenderingConfigurationProperty$Builder
                                                   CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder
                                                   CfnKnowledgeBase$SourceConfigurationProperty$Builder
                                                   CfnKnowledgeBaseProps$Builder]))


(defn build-cfn-assistant-association-association-data-property-builder
  "The build-cfn-assistant-association-association-data-property-builder function updates a CfnAssistantAssociation$AssociationDataProperty$Builder instance using the provided configuration.
  The function takes the CfnAssistantAssociation$AssociationDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
"
  [^CfnAssistantAssociation$AssociationDataProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :knowledge-base-id)]
    (. builder knowledgeBaseId data))
  (.build builder))


(defn cfn-assistant-association-association-data-property-builder
  "Creates a  `CfnAssistantAssociation$AssociationDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assistant-association-association-data-property-builder (new CfnAssistantAssociation$AssociationDataProperty$Builder) id config))


(defn build-cfn-assistant-association-builder
  "The build-cfn-assistant-association-builder function updates a CfnAssistantAssociation$Builder instance using the provided configuration.
  The function takes the CfnAssistantAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assistantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assistant-id` |
| `association` | software.amazon.awscdk.services.wisdom.CfnAssistantAssociation$AssociationDataProperty | [[cdk.support/lookup-entry]] | `:association` |
| `associationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssistantAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :assistant-id)]
    (. builder assistantId data))
  (when-let [data (lookup-entry config id :association)]
    (. builder association data))
  (when-let [data (lookup-entry config id :association-type)]
    (. builder associationType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-assistant-association-builder
  "Creates a  `CfnAssistantAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-assistant-association-builder (CfnAssistantAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-assistant-association-props-builder
  "The build-cfn-assistant-association-props-builder function updates a CfnAssistantAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnAssistantAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assistantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assistant-id` |
| `association` | software.amazon.awscdk.services.wisdom.CfnAssistantAssociation$AssociationDataProperty | [[cdk.support/lookup-entry]] | `:association` |
| `associationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssistantAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :assistant-id)]
    (. builder assistantId data))
  (when-let [data (lookup-entry config id :association)]
    (. builder association data))
  (when-let [data (lookup-entry config id :association-type)]
    (. builder associationType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-assistant-association-props-builder
  "Creates a  `CfnAssistantAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assistant-association-props-builder (new CfnAssistantAssociationProps$Builder) id config))


(defn build-cfn-assistant-builder
  "The build-cfn-assistant-builder function updates a CfnAssistant$Builder instance using the provided configuration.
  The function takes the CfnAssistant$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAssistant$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-assistant-builder
  "Creates a  `CfnAssistant$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-assistant-builder (CfnAssistant$Builder/create scope (name id)) id config))


(defn build-cfn-assistant-props-builder
  "The build-cfn-assistant-props-builder function updates a CfnAssistantProps$Builder instance using the provided configuration.
  The function takes the CfnAssistantProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.wisdom.CfnAssistant$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAssistantProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-assistant-props-builder
  "Creates a  `CfnAssistantProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assistant-props-builder (new CfnAssistantProps$Builder) id config))


(defn build-cfn-assistant-server-side-encryption-configuration-property-builder
  "The build-cfn-assistant-server-side-encryption-configuration-property-builder function updates a CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-assistant-server-side-encryption-configuration-property-builder
  "Creates a  `CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assistant-server-side-encryption-configuration-property-builder (new CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-knowledge-base-app-integrations-configuration-property-builder
  "The build-cfn-knowledge-base-app-integrations-configuration-property-builder function updates a CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIntegrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-integration-arn` |
| `objectFields` | java.util.List | [[cdk.support/lookup-entry]] | `:object-fields` |
"
  [^CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-integration-arn)]
    (. builder appIntegrationArn data))
  (when-let [data (lookup-entry config id :object-fields)]
    (. builder objectFields data))
  (.build builder))


(defn cfn-knowledge-base-app-integrations-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-knowledge-base-app-integrations-configuration-property-builder (new CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder) id config))


(defn build-cfn-knowledge-base-builder
  "The build-cfn-knowledge-base-builder function updates a CfnKnowledgeBase$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendering-configuration` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `sourceConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKnowledgeBase$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :knowledge-base-type)]
    (. builder knowledgeBaseType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rendering-configuration)]
    (. builder renderingConfiguration data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-knowledge-base-builder
  "Creates a  `CfnKnowledgeBase$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-knowledge-base-builder (CfnKnowledgeBase$Builder/create scope (name id)) id config))


(defn build-cfn-knowledge-base-props-builder
  "The build-cfn-knowledge-base-props-builder function updates a CfnKnowledgeBaseProps$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendering-configuration` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `sourceConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKnowledgeBaseProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :knowledge-base-type)]
    (. builder knowledgeBaseType data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rendering-configuration)]
    (. builder renderingConfiguration data))
  (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-let [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-knowledge-base-props-builder
  "Creates a  `CfnKnowledgeBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-knowledge-base-props-builder (new CfnKnowledgeBaseProps$Builder) id config))


(defn build-cfn-knowledge-base-rendering-configuration-property-builder
  "The build-cfn-knowledge-base-rendering-configuration-property-builder function updates a CfnKnowledgeBase$RenderingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$RenderingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-uri` |
"
  [^CfnKnowledgeBase$RenderingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :template-uri)]
    (. builder templateUri data))
  (.build builder))


(defn cfn-knowledge-base-rendering-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$RenderingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-knowledge-base-rendering-configuration-property-builder (new CfnKnowledgeBase$RenderingConfigurationProperty$Builder) id config))


(defn build-cfn-knowledge-base-server-side-encryption-configuration-property-builder
  "The build-cfn-knowledge-base-server-side-encryption-configuration-property-builder function updates a CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-knowledge-base-server-side-encryption-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-knowledge-base-server-side-encryption-configuration-property-builder (new CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-knowledge-base-source-configuration-property-builder
  "The build-cfn-knowledge-base-source-configuration-property-builder function updates a CfnKnowledgeBase$SourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$SourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIntegrations` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$AppIntegrationsConfigurationProperty | [[cdk.support/lookup-entry]] | `:app-integrations` |
"
  [^CfnKnowledgeBase$SourceConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-integrations)]
    (. builder appIntegrations data))
  (.build builder))


(defn cfn-knowledge-base-source-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$SourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-knowledge-base-source-configuration-property-builder (new CfnKnowledgeBase$SourceConfigurationProperty$Builder) id config))