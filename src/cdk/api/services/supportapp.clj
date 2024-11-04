(ns cdk.api.services.supportapp
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.supportapp package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.supportapp CfnAccountAlias$Builder
                                                       CfnAccountAliasProps$Builder
                                                       CfnSlackChannelConfiguration$Builder
                                                       CfnSlackChannelConfigurationProps$Builder
                                                       CfnSlackWorkspaceConfiguration$Builder
                                                       CfnSlackWorkspaceConfigurationProps$Builder]))


(defn cfn-account-alias-builder
  "The cfn-account-alias-builder function buildes out new instances of 
CfnAccountAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-alias` |"
  [stack id config]
  (let [builder (CfnAccountAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-alias)]
      (. builder accountAlias data))
    (.build builder)))


(defn cfn-account-alias-props-builder
  "The cfn-account-alias-props-builder function buildes out new instances of 
CfnAccountAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-alias` |"
  [stack id config]
  (let [builder (CfnAccountAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :account-alias)]
      (. builder accountAlias data))
    (.build builder)))


(defn cfn-slack-channel-configuration-builder
  "The cfn-slack-channel-configuration-builder function buildes out new instances of 
CfnSlackChannelConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-role-arn` |
| `notifyOnAddCorrespondenceToCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-add-correspondence-to-case` |
| `notifyOnCaseSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:notify-on-case-severity` |
| `notifyOnCreateOrReopenCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-create-or-reopen-case` |
| `notifyOnResolveCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-resolve-case` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |"
  [stack id config]
  (let [builder (CfnSlackChannelConfiguration$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-slack-channel-configuration-props-builder
  "The cfn-slack-channel-configuration-props-builder function buildes out new instances of 
CfnSlackChannelConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-role-arn` |
| `notifyOnAddCorrespondenceToCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-add-correspondence-to-case` |
| `notifyOnCaseSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:notify-on-case-severity` |
| `notifyOnCreateOrReopenCase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notify-on-create-or-reopen-case` |
| `notifyOnResolveCase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notify-on-resolve-case` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |"
  [stack id config]
  (let [builder (CfnSlackChannelConfigurationProps$Builder.)]
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
    (.build builder)))


(defn cfn-slack-workspace-configuration-builder
  "The cfn-slack-workspace-configuration-builder function buildes out new instances of 
CfnSlackWorkspaceConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnSlackWorkspaceConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))


(defn cfn-slack-workspace-configuration-props-builder
  "The cfn-slack-workspace-configuration-props-builder function buildes out new instances of 
CfnSlackWorkspaceConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `versionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-id` |"
  [stack id config]
  (let [builder (CfnSlackWorkspaceConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :version-id)]
      (. builder versionId data))
    (.build builder)))