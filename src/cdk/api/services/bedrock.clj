(ns cdk.api.services.bedrock
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.bedrock package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.bedrock CfnAgent$APISchemaProperty$Builder
                                                    CfnAgent$ActionGroupExecutorProperty$Builder
                                                    CfnAgent$AgentActionGroupProperty$Builder
                                                    CfnAgent$AgentKnowledgeBaseProperty$Builder
                                                    CfnAgent$Builder
                                                    CfnAgent$FunctionProperty$Builder
                                                    CfnAgent$FunctionSchemaProperty$Builder
                                                    CfnAgent$InferenceConfigurationProperty$Builder
                                                    CfnAgent$ParameterDetailProperty$Builder
                                                    CfnAgent$PromptConfigurationProperty$Builder
                                                    CfnAgent$PromptOverrideConfigurationProperty$Builder
                                                    CfnAgent$S3IdentifierProperty$Builder
                                                    CfnAgentAlias$AgentAliasHistoryEventProperty$Builder
                                                    CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder
                                                    CfnAgentAlias$Builder
                                                    CfnAgentAliasProps$Builder
                                                    CfnAgentProps$Builder
                                                    CfnDataSource$Builder
                                                    CfnDataSource$ChunkingConfigurationProperty$Builder
                                                    CfnDataSource$DataSourceConfigurationProperty$Builder
                                                    CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder
                                                    CfnDataSource$S3DataSourceConfigurationProperty$Builder
                                                    CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder
                                                    CfnDataSource$VectorIngestionConfigurationProperty$Builder
                                                    CfnDataSourceProps$Builder
                                                    CfnGuardrail$Builder
                                                    CfnGuardrail$ContentFilterConfigProperty$Builder
                                                    CfnGuardrail$ContentPolicyConfigProperty$Builder
                                                    CfnGuardrail$ManagedWordsConfigProperty$Builder
                                                    CfnGuardrail$PiiEntityConfigProperty$Builder
                                                    CfnGuardrail$RegexConfigProperty$Builder
                                                    CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder
                                                    CfnGuardrail$TopicConfigProperty$Builder
                                                    CfnGuardrail$TopicPolicyConfigProperty$Builder
                                                    CfnGuardrail$WordConfigProperty$Builder
                                                    CfnGuardrail$WordPolicyConfigProperty$Builder
                                                    CfnGuardrailProps$Builder
                                                    CfnGuardrailVersion$Builder
                                                    CfnGuardrailVersionProps$Builder
                                                    CfnKnowledgeBase$Builder
                                                    CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder
                                                    CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder
                                                    CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder
                                                    CfnKnowledgeBase$PineconeConfigurationProperty$Builder
                                                    CfnKnowledgeBase$PineconeFieldMappingProperty$Builder
                                                    CfnKnowledgeBase$RdsConfigurationProperty$Builder
                                                    CfnKnowledgeBase$RdsFieldMappingProperty$Builder
                                                    CfnKnowledgeBase$StorageConfigurationProperty$Builder
                                                    CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder
                                                    CfnKnowledgeBaseProps$Builder]))


(defn cfn-agent-action-group-executor-property-builder
  "The cfn-agent-action-group-executor-property-builder function buildes out new instances of 
CfnAgent$ActionGroupExecutorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-control` |
| `lambda` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda` |"
  [stack id config]
  (let [builder (CfnAgent$ActionGroupExecutorProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-control)]
      (. builder customControl data))
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (.build builder)))


(defn cfn-agent-agent-action-group-property-builder
  "The cfn-agent-agent-action-group-property-builder function buildes out new instances of 
CfnAgent$AgentActionGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionGroupExecutor` | software.amazon.awscdk.services.bedrock.CfnAgent$ActionGroupExecutorProperty | [[cdk.support/lookup-entry]] | `:action-group-executor` |
| `actionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-group-name` |
| `actionGroupState` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-group-state` |
| `apiSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-schema` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-schema` |
| `parentActionGroupSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-action-group-signature` |
| `skipResourceInUseCheckOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:skip-resource-in-use-check-on-delete` |"
  [stack id config]
  (let [builder (CfnAgent$AgentActionGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-group-executor)]
      (. builder actionGroupExecutor data))
    (when-let [data (lookup-entry config id :action-group-name)]
      (. builder actionGroupName data))
    (when-let [data (lookup-entry config id :action-group-state)]
      (. builder actionGroupState data))
    (when-let [data (lookup-entry config id :api-schema)]
      (. builder apiSchema data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-schema)]
      (. builder functionSchema data))
    (when-let [data (lookup-entry config id :parent-action-group-signature)]
      (. builder parentActionGroupSignature data))
    (when-let [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
      (. builder skipResourceInUseCheckOnDelete data))
    (.build builder)))


(defn cfn-agent-agent-knowledge-base-property-builder
  "The cfn-agent-agent-knowledge-base-property-builder function buildes out new instances of 
CfnAgent$AgentKnowledgeBaseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `knowledgeBaseState` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-state` |"
  [stack id config]
  (let [builder (CfnAgent$AgentKnowledgeBaseProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :knowledge-base-id)]
      (. builder knowledgeBaseId data))
    (when-let [data (lookup-entry config id :knowledge-base-state)]
      (. builder knowledgeBaseState data))
    (.build builder)))


(defn cfn-agent-alias-agent-alias-history-event-property-builder
  "The cfn-agent-alias-agent-alias-history-event-property-builder function buildes out new instances of 
CfnAgentAlias$AgentAliasHistoryEventProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |"
  [stack id config]
  (let [builder (CfnAgentAlias$AgentAliasHistoryEventProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :routing-configuration)]
      (. builder routingConfiguration data))
    (when-let [data (lookup-entry config id :start-date)]
      (. builder startDate data))
    (.build builder)))


(defn cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder
  "The cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder function buildes out new instances of 
CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |"
  [stack id config]
  (let [builder (CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :agent-version)]
      (. builder agentVersion data))
    (.build builder)))


(defn cfn-agent-alias-builder
  "The cfn-agent-alias-builder function buildes out new instances of 
CfnAgentAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-alias-name` |
| `agentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routingConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAgentAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-alias-name)]
      (. builder agentAliasName data))
    (when-let [data (lookup-entry config id :agent-id)]
      (. builder agentId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :routing-configuration)]
      (. builder routingConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-agent-alias-props-builder
  "The cfn-agent-alias-props-builder function buildes out new instances of 
CfnAgentAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-alias-name` |
| `agentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routingConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAgentAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-alias-name)]
      (. builder agentAliasName data))
    (when-let [data (lookup-entry config id :agent-id)]
      (. builder agentId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :routing-configuration)]
      (. builder routingConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-agent-api-schema-property-builder
  "The cfn-agent-api-schema-property-builder function buildes out new instances of 
CfnAgent$APISchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload` |
| `s3` | software.amazon.awscdk.services.bedrock.CfnAgent$S3IdentifierProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnAgent$APISchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload)]
      (. builder payload data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-agent-builder
  "The cfn-agent-builder function buildes out new instances of 
CfnAgent$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-groups` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `agentResourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-resource-role-arn` |
| `autoPrepare` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-prepare` |
| `customerEncryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-encryption-key-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `foundationModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:foundation-model` |
| `idleSessionTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-session-ttl-in-seconds` |
| `instruction` | java.lang.String | [[cdk.support/lookup-entry]] | `:instruction` |
| `knowledgeBases` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-bases` |
| `promptOverrideConfiguration` | software.amazon.awscdk.services.bedrock.CfnAgent$PromptOverrideConfigurationProperty | [[cdk.support/lookup-entry]] | `:prompt-override-configuration` |
| `skipResourceInUseCheckOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-resource-in-use-check-on-delete` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `testAliasTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:test-alias-tags` |"
  [stack id config]
  (let [builder (CfnAgent$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action-groups)]
      (. builder actionGroups data))
    (when-let [data (lookup-entry config id :agent-name)]
      (. builder agentName data))
    (when-let [data (lookup-entry config id :agent-resource-role-arn)]
      (. builder agentResourceRoleArn data))
    (when-let [data (lookup-entry config id :auto-prepare)]
      (. builder autoPrepare data))
    (when-let [data (lookup-entry config id :customer-encryption-key-arn)]
      (. builder customerEncryptionKeyArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :foundation-model)]
      (. builder foundationModel data))
    (when-let [data (lookup-entry config id :idle-session-ttl-in-seconds)]
      (. builder idleSessionTtlInSeconds data))
    (when-let [data (lookup-entry config id :instruction)]
      (. builder instruction data))
    (when-let [data (lookup-entry config id :knowledge-bases)]
      (. builder knowledgeBases data))
    (when-let [data (lookup-entry config id :prompt-override-configuration)]
      (. builder promptOverrideConfiguration data))
    (when-let [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
      (. builder skipResourceInUseCheckOnDelete data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :test-alias-tags)]
      (. builder testAliasTags data))
    (.build builder)))


(defn cfn-agent-function-property-builder
  "The cfn-agent-function-property-builder function buildes out new instances of 
CfnAgent$FunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnAgent$FunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-agent-function-schema-property-builder
  "The cfn-agent-function-schema-property-builder function buildes out new instances of 
CfnAgent$FunctionSchemaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:functions` |"
  [stack id config]
  (let [builder (CfnAgent$FunctionSchemaProperty$Builder.)]
    (when-let [data (lookup-entry config id :functions)]
      (. builder functions data))
    (.build builder)))


(defn cfn-agent-inference-configuration-property-builder
  "The cfn-agent-inference-configuration-property-builder function buildes out new instances of 
CfnAgent$InferenceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-length` |
| `stopSequences` | java.util.List | [[cdk.support/lookup-entry]] | `:stop-sequences` |
| `temperature` | java.lang.Number | [[cdk.support/lookup-entry]] | `:temperature` |
| `topK` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top-k` |
| `topP` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top-p` |"
  [stack id config]
  (let [builder (CfnAgent$InferenceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-length)]
      (. builder maximumLength data))
    (when-let [data (lookup-entry config id :stop-sequences)]
      (. builder stopSequences data))
    (when-let [data (lookup-entry config id :temperature)]
      (. builder temperature data))
    (when-let [data (lookup-entry config id :top-k)]
      (. builder topK data))
    (when-let [data (lookup-entry config id :top-p)]
      (. builder topP data))
    (.build builder)))


(defn cfn-agent-parameter-detail-property-builder
  "The cfn-agent-parameter-detail-property-builder function buildes out new instances of 
CfnAgent$ParameterDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAgent$ParameterDetailProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :required)]
      (. builder required data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-agent-prompt-configuration-property-builder
  "The cfn-agent-prompt-configuration-property-builder function buildes out new instances of 
CfnAgent$PromptConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePromptTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-prompt-template` |
| `inferenceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-configuration` |
| `parserMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:parser-mode` |
| `promptCreationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-creation-mode` |
| `promptState` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-state` |
| `promptType` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-type` |"
  [stack id config]
  (let [builder (CfnAgent$PromptConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-prompt-template)]
      (. builder basePromptTemplate data))
    (when-let [data (lookup-entry config id :inference-configuration)]
      (. builder inferenceConfiguration data))
    (when-let [data (lookup-entry config id :parser-mode)]
      (. builder parserMode data))
    (when-let [data (lookup-entry config id :prompt-creation-mode)]
      (. builder promptCreationMode data))
    (when-let [data (lookup-entry config id :prompt-state)]
      (. builder promptState data))
    (when-let [data (lookup-entry config id :prompt-type)]
      (. builder promptType data))
    (.build builder)))


(defn cfn-agent-prompt-override-configuration-property-builder
  "The cfn-agent-prompt-override-configuration-property-builder function buildes out new instances of 
CfnAgent$PromptOverrideConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideLambda` | java.lang.String | [[cdk.support/lookup-entry]] | `:override-lambda` |
| `promptConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:prompt-configurations` |"
  [stack id config]
  (let [builder (CfnAgent$PromptOverrideConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :override-lambda)]
      (. builder overrideLambda data))
    (when-let [data (lookup-entry config id :prompt-configurations)]
      (. builder promptConfigurations data))
    (.build builder)))


(defn cfn-agent-props-builder
  "The cfn-agent-props-builder function buildes out new instances of 
CfnAgentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-groups` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `agentResourceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-resource-role-arn` |
| `autoPrepare` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-prepare` |
| `customerEncryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-encryption-key-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `foundationModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:foundation-model` |
| `idleSessionTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-session-ttl-in-seconds` |
| `instruction` | java.lang.String | [[cdk.support/lookup-entry]] | `:instruction` |
| `knowledgeBases` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-bases` |
| `promptOverrideConfiguration` | software.amazon.awscdk.services.bedrock.CfnAgent$PromptOverrideConfigurationProperty | [[cdk.support/lookup-entry]] | `:prompt-override-configuration` |
| `skipResourceInUseCheckOnDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-resource-in-use-check-on-delete` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `testAliasTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:test-alias-tags` |"
  [stack id config]
  (let [builder (CfnAgentProps$Builder.)]
    (when-let [data (lookup-entry config id :action-groups)]
      (. builder actionGroups data))
    (when-let [data (lookup-entry config id :agent-name)]
      (. builder agentName data))
    (when-let [data (lookup-entry config id :agent-resource-role-arn)]
      (. builder agentResourceRoleArn data))
    (when-let [data (lookup-entry config id :auto-prepare)]
      (. builder autoPrepare data))
    (when-let [data (lookup-entry config id :customer-encryption-key-arn)]
      (. builder customerEncryptionKeyArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :foundation-model)]
      (. builder foundationModel data))
    (when-let [data (lookup-entry config id :idle-session-ttl-in-seconds)]
      (. builder idleSessionTtlInSeconds data))
    (when-let [data (lookup-entry config id :instruction)]
      (. builder instruction data))
    (when-let [data (lookup-entry config id :knowledge-bases)]
      (. builder knowledgeBases data))
    (when-let [data (lookup-entry config id :prompt-override-configuration)]
      (. builder promptOverrideConfiguration data))
    (when-let [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
      (. builder skipResourceInUseCheckOnDelete data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :test-alias-tags)]
      (. builder testAliasTags data))
    (.build builder)))


(defn cfn-agent-s3-identifier-property-builder
  "The cfn-agent-s3-identifier-property-builder function buildes out new instances of 
CfnAgent$S3IdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |"
  [stack id config]
  (let [builder (CfnAgent$S3IdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-object-key)]
      (. builder s3ObjectKey data))
    (.build builder)))


(defn cfn-data-source-builder
  "The cfn-data-source-builder function buildes out new instances of 
CfnDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDeletionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-deletion-policy` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `vectorIngestionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$VectorIngestionConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-ingestion-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-deletion-policy)]
      (. builder dataDeletionPolicy data))
    (when-let [data (lookup-entry config id :data-source-configuration)]
      (. builder dataSourceConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :knowledge-base-id)]
      (. builder knowledgeBaseId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
      (. builder serverSideEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :vector-ingestion-configuration)]
      (. builder vectorIngestionConfiguration data))
    (.build builder)))


(defn cfn-data-source-chunking-configuration-property-builder
  "The cfn-data-source-chunking-configuration-property-builder function buildes out new instances of 
CfnDataSource$ChunkingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chunkingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:chunking-strategy` |
| `fixedSizeChunkingConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$FixedSizeChunkingConfigurationProperty | [[cdk.support/lookup-entry]] | `:fixed-size-chunking-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$ChunkingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :chunking-strategy)]
      (. builder chunkingStrategy data))
    (when-let [data (lookup-entry config id :fixed-size-chunking-configuration)]
      (. builder fixedSizeChunkingConfiguration data))
    (.build builder)))


(defn cfn-data-source-data-source-configuration-property-builder
  "The cfn-data-source-data-source-configuration-property-builder function buildes out new instances of 
CfnDataSource$DataSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.services.bedrock.CfnDataSource$S3DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSource$DataSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-configuration)]
      (. builder s3Configuration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-fixed-size-chunking-configuration-property-builder
  "The cfn-data-source-fixed-size-chunking-configuration-property-builder function buildes out new instances of 
CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTokens` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-tokens` |
| `overlapPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:overlap-percentage` |"
  [stack id config]
  (let [builder (CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-tokens)]
      (. builder maxTokens data))
    (when-let [data (lookup-entry config id :overlap-percentage)]
      (. builder overlapPercentage data))
    (.build builder)))


(defn cfn-data-source-props-builder
  "The cfn-data-source-props-builder function buildes out new instances of 
CfnDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDeletionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-deletion-policy` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `vectorIngestionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$VectorIngestionConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-ingestion-configuration` |"
  [stack id config]
  (let [builder (CfnDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :data-deletion-policy)]
      (. builder dataDeletionPolicy data))
    (when-let [data (lookup-entry config id :data-source-configuration)]
      (. builder dataSourceConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :knowledge-base-id)]
      (. builder knowledgeBaseId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-side-encryption-configuration)]
      (. builder serverSideEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :vector-ingestion-configuration)]
      (. builder vectorIngestionConfiguration data))
    (.build builder)))


(defn cfn-data-source-s3-data-source-configuration-property-builder
  "The cfn-data-source-s3-data-source-configuration-property-builder function buildes out new instances of 
CfnDataSource$S3DataSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bucketOwnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner-account-id` |
| `inclusionPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-prefixes` |"
  [stack id config]
  (let [builder (CfnDataSource$S3DataSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :bucket-owner-account-id)]
      (. builder bucketOwnerAccountId data))
    (when-let [data (lookup-entry config id :inclusion-prefixes)]
      (. builder inclusionPrefixes data))
    (.build builder)))


(defn cfn-data-source-server-side-encryption-configuration-property-builder
  "The cfn-data-source-server-side-encryption-configuration-property-builder function buildes out new instances of 
CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-data-source-vector-ingestion-configuration-property-builder
  "The cfn-data-source-vector-ingestion-configuration-property-builder function buildes out new instances of 
CfnDataSource$VectorIngestionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chunkingConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$ChunkingConfigurationProperty | [[cdk.support/lookup-entry]] | `:chunking-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$VectorIngestionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :chunking-configuration)]
      (. builder chunkingConfiguration data))
    (.build builder)))


(defn cfn-guardrail-builder
  "The cfn-guardrail-builder function buildes out new instances of 
CfnGuardrail$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockedInputMessaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:blocked-input-messaging` |
| `blockedOutputsMessaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:blocked-outputs-messaging` |
| `contentPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$ContentPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:content-policy-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sensitiveInformationPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sensitive-information-policy-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$TopicPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:topic-policy-config` |
| `wordPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:word-policy-config` |"
  [stack id config]
  (let [builder (CfnGuardrail$Builder/create stack id)]
    (when-let [data (lookup-entry config id :blocked-input-messaging)]
      (. builder blockedInputMessaging data))
    (when-let [data (lookup-entry config id :blocked-outputs-messaging)]
      (. builder blockedOutputsMessaging data))
    (when-let [data (lookup-entry config id :content-policy-config)]
      (. builder contentPolicyConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sensitive-information-policy-config)]
      (. builder sensitiveInformationPolicyConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topic-policy-config)]
      (. builder topicPolicyConfig data))
    (when-let [data (lookup-entry config id :word-policy-config)]
      (. builder wordPolicyConfig data))
    (.build builder)))


(defn cfn-guardrail-content-filter-config-property-builder
  "The cfn-guardrail-content-filter-config-property-builder function buildes out new instances of 
CfnGuardrail$ContentFilterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputStrength` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-strength` |
| `outputStrength` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-strength` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGuardrail$ContentFilterConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-strength)]
      (. builder inputStrength data))
    (when-let [data (lookup-entry config id :output-strength)]
      (. builder outputStrength data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-guardrail-content-policy-config-property-builder
  "The cfn-guardrail-content-policy-config-property-builder function buildes out new instances of 
CfnGuardrail$ContentPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filtersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters-config` |"
  [stack id config]
  (let [builder (CfnGuardrail$ContentPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters-config)]
      (. builder filtersConfig data))
    (.build builder)))


(defn cfn-guardrail-managed-words-config-property-builder
  "The cfn-guardrail-managed-words-config-property-builder function buildes out new instances of 
CfnGuardrail$ManagedWordsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGuardrail$ManagedWordsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-guardrail-pii-entity-config-property-builder
  "The cfn-guardrail-pii-entity-config-property-builder function buildes out new instances of 
CfnGuardrail$PiiEntityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGuardrail$PiiEntityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-guardrail-props-builder
  "The cfn-guardrail-props-builder function buildes out new instances of 
CfnGuardrailProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockedInputMessaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:blocked-input-messaging` |
| `blockedOutputsMessaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:blocked-outputs-messaging` |
| `contentPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$ContentPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:content-policy-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sensitiveInformationPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sensitive-information-policy-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$TopicPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:topic-policy-config` |
| `wordPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$WordPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:word-policy-config` |"
  [stack id config]
  (let [builder (CfnGuardrailProps$Builder.)]
    (when-let [data (lookup-entry config id :blocked-input-messaging)]
      (. builder blockedInputMessaging data))
    (when-let [data (lookup-entry config id :blocked-outputs-messaging)]
      (. builder blockedOutputsMessaging data))
    (when-let [data (lookup-entry config id :content-policy-config)]
      (. builder contentPolicyConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sensitive-information-policy-config)]
      (. builder sensitiveInformationPolicyConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topic-policy-config)]
      (. builder topicPolicyConfig data))
    (when-let [data (lookup-entry config id :word-policy-config)]
      (. builder wordPolicyConfig data))
    (.build builder)))


(defn cfn-guardrail-regex-config-property-builder
  "The cfn-guardrail-regex-config-property-builder function buildes out new instances of 
CfnGuardrail$RegexConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnGuardrail$RegexConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-guardrail-sensitive-information-policy-config-property-builder
  "The cfn-guardrail-sensitive-information-policy-config-property-builder function buildes out new instances of 
CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `piiEntitiesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pii-entities-config` |
| `regexesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regexes-config` |"
  [stack id config]
  (let [builder (CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :pii-entities-config)]
      (. builder piiEntitiesConfig data))
    (when-let [data (lookup-entry config id :regexes-config)]
      (. builder regexesConfig data))
    (.build builder)))


(defn cfn-guardrail-topic-config-property-builder
  "The cfn-guardrail-topic-config-property-builder function buildes out new instances of 
CfnGuardrail$TopicConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `examples` | java.util.List | [[cdk.support/lookup-entry]] | `:examples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnGuardrail$TopicConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :examples)]
      (. builder examples data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-guardrail-topic-policy-config-property-builder
  "The cfn-guardrail-topic-policy-config-property-builder function buildes out new instances of 
CfnGuardrail$TopicPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicsConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-config` |"
  [stack id config]
  (let [builder (CfnGuardrail$TopicPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :topics-config)]
      (. builder topicsConfig data))
    (.build builder)))


(defn cfn-guardrail-version-builder
  "The cfn-guardrail-version-builder function buildes out new instances of 
CfnGuardrailVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `guardrailIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:guardrail-identifier` |"
  [stack id config]
  (let [builder (CfnGuardrailVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :guardrail-identifier)]
      (. builder guardrailIdentifier data))
    (.build builder)))


(defn cfn-guardrail-version-props-builder
  "The cfn-guardrail-version-props-builder function buildes out new instances of 
CfnGuardrailVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `guardrailIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:guardrail-identifier` |"
  [stack id config]
  (let [builder (CfnGuardrailVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :guardrail-identifier)]
      (. builder guardrailIdentifier data))
    (.build builder)))


(defn cfn-guardrail-word-config-property-builder
  "The cfn-guardrail-word-config-property-builder function buildes out new instances of 
CfnGuardrail$WordConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnGuardrail$WordConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-guardrail-word-policy-config-property-builder
  "The cfn-guardrail-word-policy-config-property-builder function buildes out new instances of 
CfnGuardrail$WordPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedWordListsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-word-lists-config` |
| `wordsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:words-config` |"
  [stack id config]
  (let [builder (CfnGuardrail$WordPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :managed-word-lists-config)]
      (. builder managedWordListsConfig data))
    (when-let [data (lookup-entry config id :words-config)]
      (. builder wordsConfig data))
    (.build builder)))


(defn cfn-knowledge-base-builder
  "The cfn-knowledge-base-builder function buildes out new instances of 
CfnKnowledgeBase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-base-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `storageConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$StorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:storage-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :knowledge-base-configuration)]
      (. builder knowledgeBaseConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :storage-configuration)]
      (. builder storageConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-knowledge-base-knowledge-base-configuration-property-builder
  "The cfn-knowledge-base-knowledge-base-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vectorKnowledgeBaseConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-knowledge-base-configuration` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :vector-knowledge-base-configuration)]
      (. builder vectorKnowledgeBaseConfiguration data))
    (.build builder)))


(defn cfn-knowledge-base-open-search-serverless-configuration-property-builder
  "The cfn-knowledge-base-open-search-serverless-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-arn` |
| `fieldMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `vectorIndexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-index-name` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-arn)]
      (. builder collectionArn data))
    (when-let [data (lookup-entry config id :field-mapping)]
      (. builder fieldMapping data))
    (when-let [data (lookup-entry config id :vector-index-name)]
      (. builder vectorIndexName data))
    (.build builder)))


(defn cfn-knowledge-base-open-search-serverless-field-mapping-property-builder
  "The cfn-knowledge-base-open-search-serverless-field-mapping-property-builder function buildes out new instances of 
CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |
| `vectorField` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-field` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :metadata-field)]
      (. builder metadataField data))
    (when-let [data (lookup-entry config id :text-field)]
      (. builder textField data))
    (when-let [data (lookup-entry config id :vector-field)]
      (. builder vectorField data))
    (.build builder)))


(defn cfn-knowledge-base-pinecone-configuration-property-builder
  "The cfn-knowledge-base-pinecone-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$PineconeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `credentialsSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-secret-arn` |
| `fieldMapping` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$PineconeFieldMappingProperty | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$PineconeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-string)]
      (. builder connectionString data))
    (when-let [data (lookup-entry config id :credentials-secret-arn)]
      (. builder credentialsSecretArn data))
    (when-let [data (lookup-entry config id :field-mapping)]
      (. builder fieldMapping data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-knowledge-base-pinecone-field-mapping-property-builder
  "The cfn-knowledge-base-pinecone-field-mapping-property-builder function buildes out new instances of 
CfnKnowledgeBase$PineconeFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$PineconeFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :metadata-field)]
      (. builder metadataField data))
    (when-let [data (lookup-entry config id :text-field)]
      (. builder textField data))
    (.build builder)))


(defn cfn-knowledge-base-props-builder
  "The cfn-knowledge-base-props-builder function buildes out new instances of 
CfnKnowledgeBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$KnowledgeBaseConfigurationProperty | [[cdk.support/lookup-entry]] | `:knowledge-base-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `storageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKnowledgeBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :knowledge-base-configuration)]
      (. builder knowledgeBaseConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :storage-configuration)]
      (. builder storageConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-knowledge-base-rds-configuration-property-builder
  "The cfn-knowledge-base-rds-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$RdsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-secret-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `fieldMapping` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$RdsFieldMappingProperty | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$RdsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :credentials-secret-arn)]
      (. builder credentialsSecretArn data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :field-mapping)]
      (. builder fieldMapping data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-knowledge-base-rds-field-mapping-property-builder
  "The cfn-knowledge-base-rds-field-mapping-property-builder function buildes out new instances of 
CfnKnowledgeBase$RdsFieldMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `primaryKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |
| `vectorField` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-field` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$RdsFieldMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :metadata-field)]
      (. builder metadataField data))
    (when-let [data (lookup-entry config id :primary-key-field)]
      (. builder primaryKeyField data))
    (when-let [data (lookup-entry config id :text-field)]
      (. builder textField data))
    (when-let [data (lookup-entry config id :vector-field)]
      (. builder vectorField data))
    (.build builder)))


(defn cfn-knowledge-base-storage-configuration-property-builder
  "The cfn-knowledge-base-storage-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$StorageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `opensearchServerlessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:opensearch-serverless-configuration` |
| `pineconeConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$PineconeConfigurationProperty | [[cdk.support/lookup-entry]] | `:pinecone-configuration` |
| `rdsConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$RdsConfigurationProperty | [[cdk.support/lookup-entry]] | `:rds-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$StorageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :opensearch-serverless-configuration)]
      (. builder opensearchServerlessConfiguration data))
    (when-let [data (lookup-entry config id :pinecone-configuration)]
      (. builder pineconeConfiguration data))
    (when-let [data (lookup-entry config id :rds-configuration)]
      (. builder rdsConfiguration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-knowledge-base-vector-knowledge-base-configuration-property-builder
  "The cfn-knowledge-base-vector-knowledge-base-configuration-property-builder function buildes out new instances of 
CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `embeddingModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:embedding-model-arn` |"
  [stack id config]
  (let [builder (CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :embedding-model-arn)]
      (. builder embeddingModelArn data))
    (.build builder)))