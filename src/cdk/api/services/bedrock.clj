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


(defn cfn-agent-action-group-executor-property-builder>
  "The cfn-agent-action-group-executor-property-builder> function updates a CfnAgent$ActionGroupExecutorProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$ActionGroupExecutorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-control` |
| `lambda` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda` |
"
  [^CfnAgent$ActionGroupExecutorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-control)]
    (. builder customControl data))
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (.build builder))


(defn cfn-agent-action-group-executor-property-builder
  "Creates a  `CfnAgent$ActionGroupExecutorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-action-group-executor-property-builder> (new CfnAgent$ActionGroupExecutorProperty$Builder) id config))


(defn cfn-agent-agent-action-group-property-builder>
  "The cfn-agent-agent-action-group-property-builder> function updates a CfnAgent$AgentActionGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$AgentActionGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionGroupExecutor` | software.amazon.awscdk.services.bedrock.CfnAgent$ActionGroupExecutorProperty | [[cdk.support/lookup-entry]] | `:action-group-executor` |
| `actionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-group-name` |
| `actionGroupState` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-group-state` |
| `apiSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-schema` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionSchema` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-schema` |
| `parentActionGroupSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-action-group-signature` |
| `skipResourceInUseCheckOnDelete` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:skip-resource-in-use-check-on-delete` |
"
  [^CfnAgent$AgentActionGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action-group-executor)]
    (. builder actionGroupExecutor data))
  (when-some [data (lookup-entry config id :action-group-name)]
    (. builder actionGroupName data))
  (when-some [data (lookup-entry config id :action-group-state)]
    (. builder actionGroupState data))
  (when-some [data (lookup-entry config id :api-schema)]
    (. builder apiSchema data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :function-schema)]
    (. builder functionSchema data))
  (when-some [data (lookup-entry config id :parent-action-group-signature)]
    (. builder parentActionGroupSignature data))
  (when-some [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
    (. builder skipResourceInUseCheckOnDelete data))
  (.build builder))


(defn cfn-agent-agent-action-group-property-builder
  "Creates a  `CfnAgent$AgentActionGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-agent-action-group-property-builder> (new CfnAgent$AgentActionGroupProperty$Builder) id config))


(defn cfn-agent-agent-knowledge-base-property-builder>
  "The cfn-agent-agent-knowledge-base-property-builder> function updates a CfnAgent$AgentKnowledgeBaseProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$AgentKnowledgeBaseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `knowledgeBaseState` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-state` |
"
  [^CfnAgent$AgentKnowledgeBaseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :knowledge-base-id)]
    (. builder knowledgeBaseId data))
  (when-some [data (lookup-entry config id :knowledge-base-state)]
    (. builder knowledgeBaseState data))
  (.build builder))


(defn cfn-agent-agent-knowledge-base-property-builder
  "Creates a  `CfnAgent$AgentKnowledgeBaseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-agent-knowledge-base-property-builder> (new CfnAgent$AgentKnowledgeBaseProperty$Builder) id config))


(defn cfn-agent-alias-agent-alias-history-event-property-builder>
  "The cfn-agent-alias-agent-alias-history-event-property-builder> function updates a CfnAgentAlias$AgentAliasHistoryEventProperty$Builder instance using the provided configuration.
  The function takes the CfnAgentAlias$AgentAliasHistoryEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `routingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |
"
  [^CfnAgentAlias$AgentAliasHistoryEventProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :end-date)]
    (. builder endDate data))
  (when-some [data (lookup-entry config id :routing-configuration)]
    (. builder routingConfiguration data))
  (when-some [data (lookup-entry config id :start-date)]
    (. builder startDate data))
  (.build builder))


(defn cfn-agent-alias-agent-alias-history-event-property-builder
  "Creates a  `CfnAgentAlias$AgentAliasHistoryEventProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-alias-agent-alias-history-event-property-builder> (new CfnAgentAlias$AgentAliasHistoryEventProperty$Builder) id config))


(defn cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder>
  "The cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder> function updates a CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder instance using the provided configuration.
  The function takes the CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |
"
  [^CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-version)]
    (. builder agentVersion data))
  (.build builder))


(defn cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder
  "Creates a  `CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-alias-agent-alias-routing-configuration-list-item-property-builder> (new CfnAgentAlias$AgentAliasRoutingConfigurationListItemProperty$Builder) id config))


(defn cfn-agent-alias-builder>
  "The cfn-agent-alias-builder> function updates a CfnAgentAlias$Builder instance using the provided configuration.
  The function takes the CfnAgentAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-alias-name` |
| `agentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routingConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAgentAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-alias-name)]
    (. builder agentAliasName data))
  (when-some [data (lookup-entry config id :agent-id)]
    (. builder agentId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :routing-configuration)]
    (. builder routingConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-agent-alias-builder
  "Creates a  `CfnAgentAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-agent-alias-builder> (CfnAgentAlias$Builder/create scope (name id)) id config))


(defn cfn-agent-alias-props-builder>
  "The cfn-agent-alias-props-builder> function updates a CfnAgentAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAgentAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-alias-name` |
| `agentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `routingConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:routing-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAgentAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-alias-name)]
    (. builder agentAliasName data))
  (when-some [data (lookup-entry config id :agent-id)]
    (. builder agentId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :routing-configuration)]
    (. builder routingConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-agent-alias-props-builder
  "Creates a  `CfnAgentAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-alias-props-builder> (new CfnAgentAliasProps$Builder) id config))


(defn cfn-agent-api-schema-property-builder>
  "The cfn-agent-api-schema-property-builder> function updates a CfnAgent$APISchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$APISchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payload` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload` |
| `s3` | software.amazon.awscdk.services.bedrock.CfnAgent$S3IdentifierProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnAgent$APISchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-agent-api-schema-property-builder
  "Creates a  `CfnAgent$APISchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-api-schema-property-builder> (new CfnAgent$APISchemaProperty$Builder) id config))


(defn cfn-agent-builder>
  "The cfn-agent-builder> function updates a CfnAgent$Builder instance using the provided configuration.
  The function takes the CfnAgent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `testAliasTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:test-alias-tags` |
"
  [^CfnAgent$Builder builder id config]
  (when-some [data (lookup-entry config id :action-groups)]
    (. builder actionGroups data))
  (when-some [data (lookup-entry config id :agent-name)]
    (. builder agentName data))
  (when-some [data (lookup-entry config id :agent-resource-role-arn)]
    (. builder agentResourceRoleArn data))
  (when-some [data (lookup-entry config id :auto-prepare)]
    (. builder autoPrepare data))
  (when-some [data (lookup-entry config id :customer-encryption-key-arn)]
    (. builder customerEncryptionKeyArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :foundation-model)]
    (. builder foundationModel data))
  (when-some [data (lookup-entry config id :idle-session-ttl-in-seconds)]
    (. builder idleSessionTtlInSeconds data))
  (when-some [data (lookup-entry config id :instruction)]
    (. builder instruction data))
  (when-some [data (lookup-entry config id :knowledge-bases)]
    (. builder knowledgeBases data))
  (when-some [data (lookup-entry config id :prompt-override-configuration)]
    (. builder promptOverrideConfiguration data))
  (when-some [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
    (. builder skipResourceInUseCheckOnDelete data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :test-alias-tags)]
    (. builder testAliasTags data))
  (.build builder))


(defn cfn-agent-builder
  "Creates a  `CfnAgent$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-agent-builder> (CfnAgent$Builder/create scope (name id)) id config))


(defn cfn-agent-function-property-builder>
  "The cfn-agent-function-property-builder> function updates a CfnAgent$FunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$FunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnAgent$FunctionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-agent-function-property-builder
  "Creates a  `CfnAgent$FunctionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-function-property-builder> (new CfnAgent$FunctionProperty$Builder) id config))


(defn cfn-agent-function-schema-property-builder>
  "The cfn-agent-function-schema-property-builder> function updates a CfnAgent$FunctionSchemaProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$FunctionSchemaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:functions` |
"
  [^CfnAgent$FunctionSchemaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :functions)]
    (. builder functions data))
  (.build builder))


(defn cfn-agent-function-schema-property-builder
  "Creates a  `CfnAgent$FunctionSchemaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-function-schema-property-builder> (new CfnAgent$FunctionSchemaProperty$Builder) id config))


(defn cfn-agent-inference-configuration-property-builder>
  "The cfn-agent-inference-configuration-property-builder> function updates a CfnAgent$InferenceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$InferenceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-length` |
| `stopSequences` | java.util.List | [[cdk.support/lookup-entry]] | `:stop-sequences` |
| `temperature` | java.lang.Number | [[cdk.support/lookup-entry]] | `:temperature` |
| `topK` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top-k` |
| `topP` | java.lang.Number | [[cdk.support/lookup-entry]] | `:top-p` |
"
  [^CfnAgent$InferenceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :maximum-length)]
    (. builder maximumLength data))
  (when-some [data (lookup-entry config id :stop-sequences)]
    (. builder stopSequences data))
  (when-some [data (lookup-entry config id :temperature)]
    (. builder temperature data))
  (when-some [data (lookup-entry config id :top-k)]
    (. builder topK data))
  (when-some [data (lookup-entry config id :top-p)]
    (. builder topP data))
  (.build builder))


(defn cfn-agent-inference-configuration-property-builder
  "Creates a  `CfnAgent$InferenceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-inference-configuration-property-builder> (new CfnAgent$InferenceConfigurationProperty$Builder) id config))


(defn cfn-agent-parameter-detail-property-builder>
  "The cfn-agent-parameter-detail-property-builder> function updates a CfnAgent$ParameterDetailProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$ParameterDetailProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `required` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:required` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAgent$ParameterDetailProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :required)]
    (. builder required data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-agent-parameter-detail-property-builder
  "Creates a  `CfnAgent$ParameterDetailProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-parameter-detail-property-builder> (new CfnAgent$ParameterDetailProperty$Builder) id config))


(defn cfn-agent-prompt-configuration-property-builder>
  "The cfn-agent-prompt-configuration-property-builder> function updates a CfnAgent$PromptConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$PromptConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `basePromptTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-prompt-template` |
| `inferenceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inference-configuration` |
| `parserMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:parser-mode` |
| `promptCreationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-creation-mode` |
| `promptState` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-state` |
| `promptType` | java.lang.String | [[cdk.support/lookup-entry]] | `:prompt-type` |
"
  [^CfnAgent$PromptConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-prompt-template)]
    (. builder basePromptTemplate data))
  (when-some [data (lookup-entry config id :inference-configuration)]
    (. builder inferenceConfiguration data))
  (when-some [data (lookup-entry config id :parser-mode)]
    (. builder parserMode data))
  (when-some [data (lookup-entry config id :prompt-creation-mode)]
    (. builder promptCreationMode data))
  (when-some [data (lookup-entry config id :prompt-state)]
    (. builder promptState data))
  (when-some [data (lookup-entry config id :prompt-type)]
    (. builder promptType data))
  (.build builder))


(defn cfn-agent-prompt-configuration-property-builder
  "Creates a  `CfnAgent$PromptConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-prompt-configuration-property-builder> (new CfnAgent$PromptConfigurationProperty$Builder) id config))


(defn cfn-agent-prompt-override-configuration-property-builder>
  "The cfn-agent-prompt-override-configuration-property-builder> function updates a CfnAgent$PromptOverrideConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$PromptOverrideConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideLambda` | java.lang.String | [[cdk.support/lookup-entry]] | `:override-lambda` |
| `promptConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:prompt-configurations` |
"
  [^CfnAgent$PromptOverrideConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :override-lambda)]
    (. builder overrideLambda data))
  (when-some [data (lookup-entry config id :prompt-configurations)]
    (. builder promptConfigurations data))
  (.build builder))


(defn cfn-agent-prompt-override-configuration-property-builder
  "Creates a  `CfnAgent$PromptOverrideConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-prompt-override-configuration-property-builder> (new CfnAgent$PromptOverrideConfigurationProperty$Builder) id config))


(defn cfn-agent-props-builder>
  "The cfn-agent-props-builder> function updates a CfnAgentProps$Builder instance using the provided configuration.
  The function takes the CfnAgentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `testAliasTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:test-alias-tags` |
"
  [^CfnAgentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-groups)]
    (. builder actionGroups data))
  (when-some [data (lookup-entry config id :agent-name)]
    (. builder agentName data))
  (when-some [data (lookup-entry config id :agent-resource-role-arn)]
    (. builder agentResourceRoleArn data))
  (when-some [data (lookup-entry config id :auto-prepare)]
    (. builder autoPrepare data))
  (when-some [data (lookup-entry config id :customer-encryption-key-arn)]
    (. builder customerEncryptionKeyArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :foundation-model)]
    (. builder foundationModel data))
  (when-some [data (lookup-entry config id :idle-session-ttl-in-seconds)]
    (. builder idleSessionTtlInSeconds data))
  (when-some [data (lookup-entry config id :instruction)]
    (. builder instruction data))
  (when-some [data (lookup-entry config id :knowledge-bases)]
    (. builder knowledgeBases data))
  (when-some [data (lookup-entry config id :prompt-override-configuration)]
    (. builder promptOverrideConfiguration data))
  (when-some [data (lookup-entry config id :skip-resource-in-use-check-on-delete)]
    (. builder skipResourceInUseCheckOnDelete data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :test-alias-tags)]
    (. builder testAliasTags data))
  (.build builder))


(defn cfn-agent-props-builder
  "Creates a  `CfnAgentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-props-builder> (new CfnAgentProps$Builder) id config))


(defn cfn-agent-s3-identifier-property-builder>
  "The cfn-agent-s3-identifier-property-builder> function updates a CfnAgent$S3IdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnAgent$S3IdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |
"
  [^CfnAgent$S3IdentifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (when-some [data (lookup-entry config id :s3-object-key)]
    (. builder s3ObjectKey data))
  (.build builder))


(defn cfn-agent-s3-identifier-property-builder
  "Creates a  `CfnAgent$S3IdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-agent-s3-identifier-property-builder> (new CfnAgent$S3IdentifierProperty$Builder) id config))


(defn cfn-data-source-builder>
  "The cfn-data-source-builder> function updates a CfnDataSource$Builder instance using the provided configuration.
  The function takes the CfnDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDeletionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-deletion-policy` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `vectorIngestionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$VectorIngestionConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-ingestion-configuration` |
"
  [^CfnDataSource$Builder builder id config]
  (when-some [data (lookup-entry config id :data-deletion-policy)]
    (. builder dataDeletionPolicy data))
  (when-some [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :knowledge-base-id)]
    (. builder knowledgeBaseId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :vector-ingestion-configuration)]
    (. builder vectorIngestionConfiguration data))
  (.build builder))


(defn cfn-data-source-builder
  "Creates a  `CfnDataSource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-data-source-builder> (CfnDataSource$Builder/create scope (name id)) id config))


(defn cfn-data-source-chunking-configuration-property-builder>
  "The cfn-data-source-chunking-configuration-property-builder> function updates a CfnDataSource$ChunkingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ChunkingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chunkingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:chunking-strategy` |
| `fixedSizeChunkingConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$FixedSizeChunkingConfigurationProperty | [[cdk.support/lookup-entry]] | `:fixed-size-chunking-configuration` |
"
  [^CfnDataSource$ChunkingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :chunking-strategy)]
    (. builder chunkingStrategy data))
  (when-some [data (lookup-entry config id :fixed-size-chunking-configuration)]
    (. builder fixedSizeChunkingConfiguration data))
  (.build builder))


(defn cfn-data-source-chunking-configuration-property-builder
  "Creates a  `CfnDataSource$ChunkingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-chunking-configuration-property-builder> (new CfnDataSource$ChunkingConfigurationProperty$Builder) id config))


(defn cfn-data-source-data-source-configuration-property-builder>
  "The cfn-data-source-data-source-configuration-property-builder> function updates a CfnDataSource$DataSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DataSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Configuration` | software.amazon.awscdk.services.bedrock.CfnDataSource$S3DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:s3-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSource$DataSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-data-source-data-source-configuration-property-builder
  "Creates a  `CfnDataSource$DataSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-data-source-configuration-property-builder> (new CfnDataSource$DataSourceConfigurationProperty$Builder) id config))


(defn cfn-data-source-fixed-size-chunking-configuration-property-builder>
  "The cfn-data-source-fixed-size-chunking-configuration-property-builder> function updates a CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxTokens` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-tokens` |
| `overlapPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:overlap-percentage` |
"
  [^CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-tokens)]
    (. builder maxTokens data))
  (when-some [data (lookup-entry config id :overlap-percentage)]
    (. builder overlapPercentage data))
  (.build builder))


(defn cfn-data-source-fixed-size-chunking-configuration-property-builder
  "Creates a  `CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-fixed-size-chunking-configuration-property-builder> (new CfnDataSource$FixedSizeChunkingConfigurationProperty$Builder) id config))


(defn cfn-data-source-props-builder>
  "The cfn-data-source-props-builder> function updates a CfnDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataDeletionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-deletion-policy` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseId` | java.lang.String | [[cdk.support/lookup-entry]] | `:knowledge-base-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverSideEncryptionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$ServerSideEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-side-encryption-configuration` |
| `vectorIngestionConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$VectorIngestionConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-ingestion-configuration` |
"
  [^CfnDataSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-deletion-policy)]
    (. builder dataDeletionPolicy data))
  (when-some [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :knowledge-base-id)]
    (. builder knowledgeBaseId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-side-encryption-configuration)]
    (. builder serverSideEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :vector-ingestion-configuration)]
    (. builder vectorIngestionConfiguration data))
  (.build builder))


(defn cfn-data-source-props-builder
  "Creates a  `CfnDataSourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-props-builder> (new CfnDataSourceProps$Builder) id config))


(defn cfn-data-source-s3-data-source-configuration-property-builder>
  "The cfn-data-source-s3-data-source-configuration-property-builder> function updates a CfnDataSource$S3DataSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$S3DataSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `bucketOwnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner-account-id` |
| `inclusionPrefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:inclusion-prefixes` |
"
  [^CfnDataSource$S3DataSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :bucket-owner-account-id)]
    (. builder bucketOwnerAccountId data))
  (when-some [data (lookup-entry config id :inclusion-prefixes)]
    (. builder inclusionPrefixes data))
  (.build builder))


(defn cfn-data-source-s3-data-source-configuration-property-builder
  "Creates a  `CfnDataSource$S3DataSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-s3-data-source-configuration-property-builder> (new CfnDataSource$S3DataSourceConfigurationProperty$Builder) id config))


(defn cfn-data-source-server-side-encryption-configuration-property-builder>
  "The cfn-data-source-server-side-encryption-configuration-property-builder> function updates a CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-data-source-server-side-encryption-configuration-property-builder
  "Creates a  `CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-server-side-encryption-configuration-property-builder> (new CfnDataSource$ServerSideEncryptionConfigurationProperty$Builder) id config))


(defn cfn-data-source-vector-ingestion-configuration-property-builder>
  "The cfn-data-source-vector-ingestion-configuration-property-builder> function updates a CfnDataSource$VectorIngestionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$VectorIngestionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chunkingConfiguration` | software.amazon.awscdk.services.bedrock.CfnDataSource$ChunkingConfigurationProperty | [[cdk.support/lookup-entry]] | `:chunking-configuration` |
"
  [^CfnDataSource$VectorIngestionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :chunking-configuration)]
    (. builder chunkingConfiguration data))
  (.build builder))


(defn cfn-data-source-vector-ingestion-configuration-property-builder
  "Creates a  `CfnDataSource$VectorIngestionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-data-source-vector-ingestion-configuration-property-builder> (new CfnDataSource$VectorIngestionConfigurationProperty$Builder) id config))


(defn cfn-guardrail-builder>
  "The cfn-guardrail-builder> function updates a CfnGuardrail$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `wordPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:word-policy-config` |
"
  [^CfnGuardrail$Builder builder id config]
  (when-some [data (lookup-entry config id :blocked-input-messaging)]
    (. builder blockedInputMessaging data))
  (when-some [data (lookup-entry config id :blocked-outputs-messaging)]
    (. builder blockedOutputsMessaging data))
  (when-some [data (lookup-entry config id :content-policy-config)]
    (. builder contentPolicyConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sensitive-information-policy-config)]
    (. builder sensitiveInformationPolicyConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :topic-policy-config)]
    (. builder topicPolicyConfig data))
  (when-some [data (lookup-entry config id :word-policy-config)]
    (. builder wordPolicyConfig data))
  (.build builder))


(defn cfn-guardrail-builder
  "Creates a  `CfnGuardrail$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-guardrail-builder> (CfnGuardrail$Builder/create scope (name id)) id config))


(defn cfn-guardrail-content-filter-config-property-builder>
  "The cfn-guardrail-content-filter-config-property-builder> function updates a CfnGuardrail$ContentFilterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$ContentFilterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputStrength` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-strength` |
| `outputStrength` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-strength` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGuardrail$ContentFilterConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-strength)]
    (. builder inputStrength data))
  (when-some [data (lookup-entry config id :output-strength)]
    (. builder outputStrength data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-guardrail-content-filter-config-property-builder
  "Creates a  `CfnGuardrail$ContentFilterConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-content-filter-config-property-builder> (new CfnGuardrail$ContentFilterConfigProperty$Builder) id config))


(defn cfn-guardrail-content-policy-config-property-builder>
  "The cfn-guardrail-content-policy-config-property-builder> function updates a CfnGuardrail$ContentPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$ContentPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filtersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters-config` |
"
  [^CfnGuardrail$ContentPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filters-config)]
    (. builder filtersConfig data))
  (.build builder))


(defn cfn-guardrail-content-policy-config-property-builder
  "Creates a  `CfnGuardrail$ContentPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-content-policy-config-property-builder> (new CfnGuardrail$ContentPolicyConfigProperty$Builder) id config))


(defn cfn-guardrail-managed-words-config-property-builder>
  "The cfn-guardrail-managed-words-config-property-builder> function updates a CfnGuardrail$ManagedWordsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$ManagedWordsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGuardrail$ManagedWordsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-guardrail-managed-words-config-property-builder
  "Creates a  `CfnGuardrail$ManagedWordsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-managed-words-config-property-builder> (new CfnGuardrail$ManagedWordsConfigProperty$Builder) id config))


(defn cfn-guardrail-pii-entity-config-property-builder>
  "The cfn-guardrail-pii-entity-config-property-builder> function updates a CfnGuardrail$PiiEntityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$PiiEntityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGuardrail$PiiEntityConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-guardrail-pii-entity-config-property-builder
  "Creates a  `CfnGuardrail$PiiEntityConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-pii-entity-config-property-builder> (new CfnGuardrail$PiiEntityConfigProperty$Builder) id config))


(defn cfn-guardrail-props-builder>
  "The cfn-guardrail-props-builder> function updates a CfnGuardrailProps$Builder instance using the provided configuration.
  The function takes the CfnGuardrailProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `wordPolicyConfig` | software.amazon.awscdk.services.bedrock.CfnGuardrail$WordPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:word-policy-config` |
"
  [^CfnGuardrailProps$Builder builder id config]
  (when-some [data (lookup-entry config id :blocked-input-messaging)]
    (. builder blockedInputMessaging data))
  (when-some [data (lookup-entry config id :blocked-outputs-messaging)]
    (. builder blockedOutputsMessaging data))
  (when-some [data (lookup-entry config id :content-policy-config)]
    (. builder contentPolicyConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sensitive-information-policy-config)]
    (. builder sensitiveInformationPolicyConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :topic-policy-config)]
    (. builder topicPolicyConfig data))
  (when-some [data (lookup-entry config id :word-policy-config)]
    (. builder wordPolicyConfig data))
  (.build builder))


(defn cfn-guardrail-props-builder
  "Creates a  `CfnGuardrailProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-props-builder> (new CfnGuardrailProps$Builder) id config))


(defn cfn-guardrail-regex-config-property-builder>
  "The cfn-guardrail-regex-config-property-builder> function updates a CfnGuardrail$RegexConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$RegexConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnGuardrail$RegexConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-guardrail-regex-config-property-builder
  "Creates a  `CfnGuardrail$RegexConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-regex-config-property-builder> (new CfnGuardrail$RegexConfigProperty$Builder) id config))


(defn cfn-guardrail-sensitive-information-policy-config-property-builder>
  "The cfn-guardrail-sensitive-information-policy-config-property-builder> function updates a CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `piiEntitiesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pii-entities-config` |
| `regexesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regexes-config` |
"
  [^CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pii-entities-config)]
    (. builder piiEntitiesConfig data))
  (when-some [data (lookup-entry config id :regexes-config)]
    (. builder regexesConfig data))
  (.build builder))


(defn cfn-guardrail-sensitive-information-policy-config-property-builder
  "Creates a  `CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-sensitive-information-policy-config-property-builder> (new CfnGuardrail$SensitiveInformationPolicyConfigProperty$Builder) id config))


(defn cfn-guardrail-topic-config-property-builder>
  "The cfn-guardrail-topic-config-property-builder> function updates a CfnGuardrail$TopicConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$TopicConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `examples` | java.util.List | [[cdk.support/lookup-entry]] | `:examples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnGuardrail$TopicConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :examples)]
    (. builder examples data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-guardrail-topic-config-property-builder
  "Creates a  `CfnGuardrail$TopicConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-topic-config-property-builder> (new CfnGuardrail$TopicConfigProperty$Builder) id config))


(defn cfn-guardrail-topic-policy-config-property-builder>
  "The cfn-guardrail-topic-policy-config-property-builder> function updates a CfnGuardrail$TopicPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$TopicPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicsConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:topics-config` |
"
  [^CfnGuardrail$TopicPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :topics-config)]
    (. builder topicsConfig data))
  (.build builder))


(defn cfn-guardrail-topic-policy-config-property-builder
  "Creates a  `CfnGuardrail$TopicPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-topic-policy-config-property-builder> (new CfnGuardrail$TopicPolicyConfigProperty$Builder) id config))


(defn cfn-guardrail-version-builder>
  "The cfn-guardrail-version-builder> function updates a CfnGuardrailVersion$Builder instance using the provided configuration.
  The function takes the CfnGuardrailVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `guardrailIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:guardrail-identifier` |
"
  [^CfnGuardrailVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :guardrail-identifier)]
    (. builder guardrailIdentifier data))
  (.build builder))


(defn cfn-guardrail-version-builder
  "Creates a  `CfnGuardrailVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-guardrail-version-builder> (CfnGuardrailVersion$Builder/create scope (name id)) id config))


(defn cfn-guardrail-version-props-builder>
  "The cfn-guardrail-version-props-builder> function updates a CfnGuardrailVersionProps$Builder instance using the provided configuration.
  The function takes the CfnGuardrailVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `guardrailIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:guardrail-identifier` |
"
  [^CfnGuardrailVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :guardrail-identifier)]
    (. builder guardrailIdentifier data))
  (.build builder))


(defn cfn-guardrail-version-props-builder
  "Creates a  `CfnGuardrailVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-version-props-builder> (new CfnGuardrailVersionProps$Builder) id config))


(defn cfn-guardrail-word-config-property-builder>
  "The cfn-guardrail-word-config-property-builder> function updates a CfnGuardrail$WordConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$WordConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnGuardrail$WordConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-guardrail-word-config-property-builder
  "Creates a  `CfnGuardrail$WordConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-word-config-property-builder> (new CfnGuardrail$WordConfigProperty$Builder) id config))


(defn cfn-guardrail-word-policy-config-property-builder>
  "The cfn-guardrail-word-policy-config-property-builder> function updates a CfnGuardrail$WordPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGuardrail$WordPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedWordListsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:managed-word-lists-config` |
| `wordsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:words-config` |
"
  [^CfnGuardrail$WordPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :managed-word-lists-config)]
    (. builder managedWordListsConfig data))
  (when-some [data (lookup-entry config id :words-config)]
    (. builder wordsConfig data))
  (.build builder))


(defn cfn-guardrail-word-policy-config-property-builder
  "Creates a  `CfnGuardrail$WordPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-guardrail-word-policy-config-property-builder> (new CfnGuardrail$WordPolicyConfigProperty$Builder) id config))


(defn cfn-knowledge-base-builder>
  "The cfn-knowledge-base-builder> function updates a CfnKnowledgeBase$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:knowledge-base-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `storageConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$StorageConfigurationProperty | [[cdk.support/lookup-entry]] | `:storage-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKnowledgeBase$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :knowledge-base-configuration)]
    (. builder knowledgeBaseConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :storage-configuration)]
    (. builder storageConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
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
  (cfn-knowledge-base-builder> (CfnKnowledgeBase$Builder/create scope (name id)) id config))


(defn cfn-knowledge-base-knowledge-base-configuration-property-builder>
  "The cfn-knowledge-base-knowledge-base-configuration-property-builder> function updates a CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vectorKnowledgeBaseConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty | [[cdk.support/lookup-entry]] | `:vector-knowledge-base-configuration` |
"
  [^CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :vector-knowledge-base-configuration)]
    (. builder vectorKnowledgeBaseConfiguration data))
  (.build builder))


(defn cfn-knowledge-base-knowledge-base-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-knowledge-base-configuration-property-builder> (new CfnKnowledgeBase$KnowledgeBaseConfigurationProperty$Builder) id config))


(defn cfn-knowledge-base-open-search-serverless-configuration-property-builder>
  "The cfn-knowledge-base-open-search-serverless-configuration-property-builder> function updates a CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-arn` |
| `fieldMapping` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `vectorIndexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-index-name` |
"
  [^CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-arn)]
    (. builder collectionArn data))
  (when-some [data (lookup-entry config id :field-mapping)]
    (. builder fieldMapping data))
  (when-some [data (lookup-entry config id :vector-index-name)]
    (. builder vectorIndexName data))
  (.build builder))


(defn cfn-knowledge-base-open-search-serverless-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-open-search-serverless-configuration-property-builder> (new CfnKnowledgeBase$OpenSearchServerlessConfigurationProperty$Builder) id config))


(defn cfn-knowledge-base-open-search-serverless-field-mapping-property-builder>
  "The cfn-knowledge-base-open-search-serverless-field-mapping-property-builder> function updates a CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |
| `vectorField` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-field` |
"
  [^CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-field)]
    (. builder metadataField data))
  (when-some [data (lookup-entry config id :text-field)]
    (. builder textField data))
  (when-some [data (lookup-entry config id :vector-field)]
    (. builder vectorField data))
  (.build builder))


(defn cfn-knowledge-base-open-search-serverless-field-mapping-property-builder
  "Creates a  `CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-open-search-serverless-field-mapping-property-builder> (new CfnKnowledgeBase$OpenSearchServerlessFieldMappingProperty$Builder) id config))


(defn cfn-knowledge-base-pinecone-configuration-property-builder>
  "The cfn-knowledge-base-pinecone-configuration-property-builder> function updates a CfnKnowledgeBase$PineconeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$PineconeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-string` |
| `credentialsSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-secret-arn` |
| `fieldMapping` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$PineconeFieldMappingProperty | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnKnowledgeBase$PineconeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-string)]
    (. builder connectionString data))
  (when-some [data (lookup-entry config id :credentials-secret-arn)]
    (. builder credentialsSecretArn data))
  (when-some [data (lookup-entry config id :field-mapping)]
    (. builder fieldMapping data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-knowledge-base-pinecone-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$PineconeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-pinecone-configuration-property-builder> (new CfnKnowledgeBase$PineconeConfigurationProperty$Builder) id config))


(defn cfn-knowledge-base-pinecone-field-mapping-property-builder>
  "The cfn-knowledge-base-pinecone-field-mapping-property-builder> function updates a CfnKnowledgeBase$PineconeFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$PineconeFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |
"
  [^CfnKnowledgeBase$PineconeFieldMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-field)]
    (. builder metadataField data))
  (when-some [data (lookup-entry config id :text-field)]
    (. builder textField data))
  (.build builder))


(defn cfn-knowledge-base-pinecone-field-mapping-property-builder
  "Creates a  `CfnKnowledgeBase$PineconeFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-pinecone-field-mapping-property-builder> (new CfnKnowledgeBase$PineconeFieldMappingProperty$Builder) id config))


(defn cfn-knowledge-base-props-builder>
  "The cfn-knowledge-base-props-builder> function updates a CfnKnowledgeBaseProps$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `knowledgeBaseConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$KnowledgeBaseConfigurationProperty | [[cdk.support/lookup-entry]] | `:knowledge-base-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `storageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-configuration` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnKnowledgeBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :knowledge-base-configuration)]
    (. builder knowledgeBaseConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :storage-configuration)]
    (. builder storageConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-knowledge-base-props-builder
  "Creates a  `CfnKnowledgeBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-props-builder> (new CfnKnowledgeBaseProps$Builder) id config))


(defn cfn-knowledge-base-rds-configuration-property-builder>
  "The cfn-knowledge-base-rds-configuration-property-builder> function updates a CfnKnowledgeBase$RdsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$RdsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialsSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:credentials-secret-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `fieldMapping` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$RdsFieldMappingProperty | [[cdk.support/lookup-entry]] | `:field-mapping` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnKnowledgeBase$RdsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :credentials-secret-arn)]
    (. builder credentialsSecretArn data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :field-mapping)]
    (. builder fieldMapping data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-knowledge-base-rds-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$RdsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-rds-configuration-property-builder> (new CfnKnowledgeBase$RdsConfigurationProperty$Builder) id config))


(defn cfn-knowledge-base-rds-field-mapping-property-builder>
  "The cfn-knowledge-base-rds-field-mapping-property-builder> function updates a CfnKnowledgeBase$RdsFieldMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$RdsFieldMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataField` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-field` |
| `primaryKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-key-field` |
| `textField` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-field` |
| `vectorField` | java.lang.String | [[cdk.support/lookup-entry]] | `:vector-field` |
"
  [^CfnKnowledgeBase$RdsFieldMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-field)]
    (. builder metadataField data))
  (when-some [data (lookup-entry config id :primary-key-field)]
    (. builder primaryKeyField data))
  (when-some [data (lookup-entry config id :text-field)]
    (. builder textField data))
  (when-some [data (lookup-entry config id :vector-field)]
    (. builder vectorField data))
  (.build builder))


(defn cfn-knowledge-base-rds-field-mapping-property-builder
  "Creates a  `CfnKnowledgeBase$RdsFieldMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-rds-field-mapping-property-builder> (new CfnKnowledgeBase$RdsFieldMappingProperty$Builder) id config))


(defn cfn-knowledge-base-storage-configuration-property-builder>
  "The cfn-knowledge-base-storage-configuration-property-builder> function updates a CfnKnowledgeBase$StorageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$StorageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `opensearchServerlessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:opensearch-serverless-configuration` |
| `pineconeConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$PineconeConfigurationProperty | [[cdk.support/lookup-entry]] | `:pinecone-configuration` |
| `rdsConfiguration` | software.amazon.awscdk.services.bedrock.CfnKnowledgeBase$RdsConfigurationProperty | [[cdk.support/lookup-entry]] | `:rds-configuration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnKnowledgeBase$StorageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :opensearch-serverless-configuration)]
    (. builder opensearchServerlessConfiguration data))
  (when-some [data (lookup-entry config id :pinecone-configuration)]
    (. builder pineconeConfiguration data))
  (when-some [data (lookup-entry config id :rds-configuration)]
    (. builder rdsConfiguration data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-knowledge-base-storage-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$StorageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-storage-configuration-property-builder> (new CfnKnowledgeBase$StorageConfigurationProperty$Builder) id config))


(defn cfn-knowledge-base-vector-knowledge-base-configuration-property-builder>
  "The cfn-knowledge-base-vector-knowledge-base-configuration-property-builder> function updates a CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `embeddingModelArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:embedding-model-arn` |
"
  [^CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :embedding-model-arn)]
    (. builder embeddingModelArn data))
  (.build builder))


(defn cfn-knowledge-base-vector-knowledge-base-configuration-property-builder
  "Creates a  `CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-knowledge-base-vector-knowledge-base-configuration-property-builder> (new CfnKnowledgeBase$VectorKnowledgeBaseConfigurationProperty$Builder) id config))