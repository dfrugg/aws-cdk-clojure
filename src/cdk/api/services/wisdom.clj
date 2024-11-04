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


(defn cfn-assistant-association-association-data-property-builder
  "The cfn-assistant-association-association-data-property-builder function buildes out new instances of 
CfnAssistantAssociation$AssociationDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |"
  [stack id config]
  (let [builder (CfnAssistantAssociation$AssociationDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :knowledge-base-id)]
      (. builder knowledgeBaseId data))
    (.build builder)))


(defn cfn-assistant-association-builder
  "The cfn-assistant-association-builder function buildes out new instances of 
CfnAssistantAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assistantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assistant-id` |
| `association` | software.amazon.awscdk.services.wisdom.CfnAssistantAssociation$AssociationDataProperty | [[cdk.support/lookup-entry]] | `:association` |
| `associationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssistantAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assistant-id)]
      (. builder assistantId data))
    (when-let [data (lookup-entry config id :association)]
      (. builder association data))
    (when-let [data (lookup-entry config id :association-type)]
      (. builder associationType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-assistant-association-props-builder
  "The cfn-assistant-association-props-builder function buildes out new instances of 
CfnAssistantAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assistantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assistant-id` |
| `association` | software.amazon.awscdk.services.wisdom.CfnAssistantAssociation$AssociationDataProperty | [[cdk.support/lookup-entry]] | `:association` |
| `associationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssistantAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :assistant-id)]
      (. builder assistantId data))
    (when-let [data (lookup-entry config id :association)]
      (. builder association data))
    (when-let [data (lookup-entry config id :association-type)]
      (. builder associationType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-assistant-builder
  "The cfn-assistant-builder function buildes out new instances of 
CfnAssistant$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAssistant$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-assistant-props-builder
  "The cfn-assistant-props-builder function buildes out new instances of 
CfnAssistantProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.wisdom.CfnAssistant$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAssistantProps$Builder.)]
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
    (.build builder)))


(defn cfn-assistant-server-side-encryption-configuration-property-builder
  "The cfn-assistant-server-side-encryption-configuration-property-builder function buildes out new instances of 
CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnAssistant$ServerSideEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-knowledge-base-app-integrations-configuration-property-builder
  "The cfn-knowledge-base-app-integrations-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIntegrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-integration-arn` |
| `objectFields` | java.util.List | [[cdk.support/lookup-entry]] | `:object-fields` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$AppIntegrationsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-integration-arn)]
      (. builder appIntegrationArn data))
    (when-let [data (lookup-entry config id :object-fields)]
      (. builder objectFields data))
    (.build builder)))


(defn cfn-knowledge-base-builder
  "The cfn-knowledge-base-builder function buildes out new instances of 
CfnKnowledgeBase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendering-configuration` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `sourceConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-knowledge-base-props-builder
  "The cfn-knowledge-base-props-builder function buildes out new instances of 
CfnKnowledgeBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseType` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rendering-configuration` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `sourceConfiguration` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKnowledgeBaseProps$Builder.)]
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
    (.build builder)))


(defn cfn-knowledge-base-rendering-configuration-property-builder
  "The cfn-knowledge-base-rendering-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$RenderingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-uri` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$RenderingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :template-uri)]
      (. builder templateUri data))
    (.build builder)))


(defn cfn-knowledge-base-server-side-encryption-configuration-property-builder
  "The cfn-knowledge-base-server-side-encryption-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$ServerSideEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-knowledge-base-source-configuration-property-builder
  "The cfn-knowledge-base-source-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$SourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIntegrations` | software.amazon.awscdk.services.wisdom.CfnKnowledgeBase$AppIntegrationsConfigurationProperty | [[cdk.support/lookup-entry]] | `:app-integrations` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$SourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-integrations)]
      (. builder appIntegrations data))
    (.build builder)))