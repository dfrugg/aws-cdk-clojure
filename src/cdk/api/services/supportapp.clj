(ns cdk.api.services.supportapp
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.supportapp package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.supportapp CfnAccountAlias$Builder
                                                       CfnAccountAliasProps$Builder
                                                       CfnSlackChannelConfiguration$Builder
                                                       CfnSlackChannelConfigurationProps$Builder
                                                       CfnSlackWorkspaceConfiguration$Builder
                                                       CfnSlackWorkspaceConfigurationProps$Builder]))


(defn build-cfn-account-alias-builder
  "The build-cfn-account-alias-builder function updates a CfnAccountAlias$Builder instance using the provided configuration.
  The function takes the CfnAccountAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-alias` |
"
  [^CfnAccountAlias$Builder builder id config]
  (when-let [data (lookup-entry config id :account-alias)]
    (. builder accountAlias data))
  (.build builder))


(defn cfn-account-alias-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-account-alias-builder (CfnAccountAlias$Builder/create scope (name id)) id config))


(defn build-cfn-account-alias-props-builder
  "The build-cfn-account-alias-props-builder function updates a CfnAccountAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAccountAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-alias` |
"
  [^CfnAccountAliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :account-alias)]
    (. builder accountAlias data))
  (.build builder))


(defn cfn-account-alias-props-builder
  ""
  [id config]
  (build-cfn-account-alias-props-builder (new CfnAccountAliasProps$Builder) id config))


(defn build-cfn-slack-channel-configuration-builder
  "The build-cfn-slack-channel-configuration-builder function updates a CfnSlackChannelConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSlackChannelConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-role-arn` |
| `notifyOnAddCorrespondenceToCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-add-correspondence-to-case` |
| `notifyOnCaseSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:notify-on-case-severity` |
| `notifyOnCreateOrReopenCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-create-or-reopen-case` |
| `notifyOnResolveCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-resolve-case` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
"
  [^CfnSlackChannelConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-let [data (lookup-entry config id :channel-role-arn)]
    (. builder channelRoleArn data))
  (when-let [data (lookup-entry config id :notify-on-add-correspondence-to-case)]
    (. builder notifyOnAddCorrespondenceToCase data))
  (when-let [data (lookup-entry config id :notify-on-case-severity)]
    (. builder notifyOnCaseSeverity data))
  (when-let [data (lookup-entry config id :notify-on-create-or-reopen-case)]
    (. builder notifyOnCreateOrReopenCase data))
  (when-let [data (lookup-entry config id :notify-on-resolve-case)]
    (. builder notifyOnResolveCase data))
  (when-let [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (.build builder))


(defn cfn-slack-channel-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-slack-channel-configuration-builder (CfnSlackChannelConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-slack-channel-configuration-props-builder
  "The build-cfn-slack-channel-configuration-props-builder function updates a CfnSlackChannelConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSlackChannelConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-role-arn` |
| `notifyOnAddCorrespondenceToCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-add-correspondence-to-case` |
| `notifyOnCaseSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:notify-on-case-severity` |
| `notifyOnCreateOrReopenCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-create-or-reopen-case` |
| `notifyOnResolveCase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notify-on-resolve-case` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
"
  [^CfnSlackChannelConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-let [data (lookup-entry config id :channel-role-arn)]
    (. builder channelRoleArn data))
  (when-let [data (lookup-entry config id :notify-on-add-correspondence-to-case)]
    (. builder notifyOnAddCorrespondenceToCase data))
  (when-let [data (lookup-entry config id :notify-on-case-severity)]
    (. builder notifyOnCaseSeverity data))
  (when-let [data (lookup-entry config id :notify-on-create-or-reopen-case)]
    (. builder notifyOnCreateOrReopenCase data))
  (when-let [data (lookup-entry config id :notify-on-resolve-case)]
    (. builder notifyOnResolveCase data))
  (when-let [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (.build builder))


(defn cfn-slack-channel-configuration-props-builder
  ""
  [id config]
  (build-cfn-slack-channel-configuration-props-builder (new CfnSlackChannelConfigurationProps$Builder) id config))


(defn build-cfn-slack-workspace-configuration-builder
  "The build-cfn-slack-workspace-configuration-builder function updates a CfnSlackWorkspaceConfiguration$Builder instance using the provided configuration.
  The function takes the CfnSlackWorkspaceConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnSlackWorkspaceConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-slack-workspace-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-slack-workspace-configuration-builder (CfnSlackWorkspaceConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-slack-workspace-configuration-props-builder
  "The build-cfn-slack-workspace-configuration-props-builder function updates a CfnSlackWorkspaceConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnSlackWorkspaceConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |
"
  [^CfnSlackWorkspaceConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :team-id)]
    (. builder teamId data))
  (when-let [data (lookup-entry config id :version-id)]
    (. builder versionId data))
  (.build builder))


(defn cfn-slack-workspace-configuration-props-builder
  ""
  [id config]
  (build-cfn-slack-workspace-configuration-props-builder (new CfnSlackWorkspaceConfigurationProps$Builder) id config))