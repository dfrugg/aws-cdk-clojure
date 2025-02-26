(ns cdk.api.services.chatbot
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.chatbot package. "
  (:require [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.chatbot CfnMicrosoftTeamsChannelConfiguration$Builder
                                                    CfnMicrosoftTeamsChannelConfigurationProps$Builder
                                                    CfnSlackChannelConfiguration$Builder
                                                    CfnSlackChannelConfigurationProps$Builder
                                                    LoggingLevel
                                                    SlackChannelConfiguration$Builder
                                                    SlackChannelConfigurationProps$Builder]))


(defn logging-level
  "The `logging-level` function data interprets values in the provided config data into a 
`LoggingLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoggingLevel` - the value is returned.
* is `:error` - `LoggingLevel/ERROR` is returned
* is `:none` - `LoggingLevel/NONE` is returned
* is `:info` - `LoggingLevel/INFO` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoggingLevel data) data
      (= :error data) LoggingLevel/ERROR
      (= :none data) LoggingLevel/NONE
      (= :info data) LoggingLevel/INFO)))


(defn build-cfn-microsoft-teams-channel-configuration-builder
  "The build-cfn-microsoft-teams-channel-configuration-builder function updates a CfnMicrosoftTeamsChannelConfiguration$Builder instance using the provided configuration.
  The function takes the CfnMicrosoftTeamsChannelConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-name` |
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `snsTopicArns` | java.util.List | [[cdk.support/lookup-entry]] | `:sns-topic-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `teamsChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:teams-channel-id` |
| `teamsTenantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:teams-tenant-id` |
| `userRoleRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-role-required` |
"
  [^CfnMicrosoftTeamsChannelConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-name)]
    (. builder configurationName data))
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :sns-topic-arns)]
    (. builder snsTopicArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-some [data (lookup-entry config id :teams-channel-id)]
    (. builder teamsChannelId data))
  (when-some [data (lookup-entry config id :teams-tenant-id)]
    (. builder teamsTenantId data))
  (when-some [data (lookup-entry config id :user-role-required)]
    (. builder userRoleRequired data))
  (.build builder))


(defn cfn-microsoft-teams-channel-configuration-builder
  "Creates a  `CfnMicrosoftTeamsChannelConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-microsoft-teams-channel-configuration-builder (CfnMicrosoftTeamsChannelConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-microsoft-teams-channel-configuration-props-builder
  "The build-cfn-microsoft-teams-channel-configuration-props-builder function updates a CfnMicrosoftTeamsChannelConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnMicrosoftTeamsChannelConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-name` |
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `snsTopicArns` | java.util.List | [[cdk.support/lookup-entry]] | `:sns-topic-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `teamsChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:teams-channel-id` |
| `teamsTenantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:teams-tenant-id` |
| `userRoleRequired` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-role-required` |
"
  [^CfnMicrosoftTeamsChannelConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-name)]
    (. builder configurationName data))
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :sns-topic-arns)]
    (. builder snsTopicArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-some [data (lookup-entry config id :teams-channel-id)]
    (. builder teamsChannelId data))
  (when-some [data (lookup-entry config id :teams-tenant-id)]
    (. builder teamsTenantId data))
  (when-some [data (lookup-entry config id :user-role-required)]
    (. builder userRoleRequired data))
  (.build builder))


(defn cfn-microsoft-teams-channel-configuration-props-builder
  "Creates a  `CfnMicrosoftTeamsChannelConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-microsoft-teams-channel-configuration-props-builder (new CfnMicrosoftTeamsChannelConfigurationProps$Builder) id config))


(defn build-cfn-slack-channel-configuration-builder
  "The build-cfn-slack-channel-configuration-builder function updates a CfnSlackChannelConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSlackChannelConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-name` |
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `slackChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-id` |
| `slackWorkspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-workspace-id` |
| `snsTopicArns` | java.util.List | [[cdk.support/lookup-entry]] | `:sns-topic-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-role-required` |
"
  [^CfnSlackChannelConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-name)]
    (. builder configurationName data))
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :slack-channel-id)]
    (. builder slackChannelId data))
  (when-some [data (lookup-entry config id :slack-workspace-id)]
    (. builder slackWorkspaceId data))
  (when-some [data (lookup-entry config id :sns-topic-arns)]
    (. builder snsTopicArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-role-required)]
    (. builder userRoleRequired data))
  (.build builder))


(defn cfn-slack-channel-configuration-builder
  "Creates a  `CfnSlackChannelConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-slack-channel-configuration-builder (CfnSlackChannelConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-slack-channel-configuration-props-builder
  "The build-cfn-slack-channel-configuration-props-builder function updates a CfnSlackChannelConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSlackChannelConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-name` |
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `loggingLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:logging-level` |
| `slackChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-id` |
| `slackWorkspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-workspace-id` |
| `snsTopicArns` | java.util.List | [[cdk.support/lookup-entry]] | `:sns-topic-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-role-required` |
"
  [^CfnSlackChannelConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration-name)]
    (. builder configurationName data))
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :slack-channel-id)]
    (. builder slackChannelId data))
  (when-some [data (lookup-entry config id :slack-workspace-id)]
    (. builder slackWorkspaceId data))
  (when-some [data (lookup-entry config id :sns-topic-arns)]
    (. builder snsTopicArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-role-required)]
    (. builder userRoleRequired data))
  (.build builder))


(defn cfn-slack-channel-configuration-props-builder
  "Creates a  `CfnSlackChannelConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-slack-channel-configuration-props-builder (new CfnSlackChannelConfigurationProps$Builder) id config))


(defn build-slack-channel-configuration-builder
  "The build-slack-channel-configuration-builder function updates a SlackChannelConfiguration$Builder instance using the provided configuration.
  The function takes the SlackChannelConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingLevel` | software.amazon.awscdk.services.chatbot.LoggingLevel | [[cdk.api.services.chatbot/logging-level]] | `:logging-level` |
| `notificationTopics` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-topics` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `slackChannelConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-configuration-name` |
| `slackChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-id` |
| `slackWorkspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-workspace-id` |
"
  [^SlackChannelConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-some [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-some [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-some [data (logging-level config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :notification-topics)]
    (. builder notificationTopics data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :slack-channel-configuration-name)]
    (. builder slackChannelConfigurationName data))
  (when-some [data (lookup-entry config id :slack-channel-id)]
    (. builder slackChannelId data))
  (when-some [data (lookup-entry config id :slack-workspace-id)]
    (. builder slackWorkspaceId data))
  (.build builder))


(defn slack-channel-configuration-builder
  "Creates a  `SlackChannelConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-slack-channel-configuration-builder (SlackChannelConfiguration$Builder/create scope (name id)) id config))


(defn build-slack-channel-configuration-props-builder
  "The build-slack-channel-configuration-props-builder function updates a SlackChannelConfigurationProps$Builder instance using the provided configuration.
  The function takes the SlackChannelConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `guardrailPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:guardrail-policies` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.logs.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingLevel` | software.amazon.awscdk.services.chatbot.LoggingLevel | [[cdk.api.services.chatbot/logging-level]] | `:logging-level` |
| `notificationTopics` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-topics` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `slackChannelConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-configuration-name` |
| `slackChannelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-channel-id` |
| `slackWorkspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:slack-workspace-id` |
"
  [^SlackChannelConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :guardrail-policies)]
    (. builder guardrailPolicies data))
  (when-some [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-some [data (lookup-entry config id :log-retention-retry-options)]
    (. builder logRetentionRetryOptions data))
  (when-some [data (lookup-entry config id :log-retention-role)]
    (. builder logRetentionRole data))
  (when-some [data (logging-level config id :logging-level)]
    (. builder loggingLevel data))
  (when-some [data (lookup-entry config id :notification-topics)]
    (. builder notificationTopics data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :slack-channel-configuration-name)]
    (. builder slackChannelConfigurationName data))
  (when-some [data (lookup-entry config id :slack-channel-id)]
    (. builder slackChannelId data))
  (when-some [data (lookup-entry config id :slack-workspace-id)]
    (. builder slackWorkspaceId data))
  (.build builder))


(defn slack-channel-configuration-props-builder
  "Creates a  `SlackChannelConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-slack-channel-configuration-props-builder (new SlackChannelConfigurationProps$Builder) id config))