(ns cdk.api.services.detective
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.detective package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.detective CfnGraph$Builder
                                                      CfnGraphProps$Builder
                                                      CfnMemberInvitation$Builder
                                                      CfnMemberInvitationProps$Builder
                                                      CfnOrganizationAdmin$Builder
                                                      CfnOrganizationAdminProps$Builder]))


(defn build-cfn-graph-builder
  "The build-cfn-graph-builder function updates a CfnGraph$Builder instance using the provided configuration.
  The function takes the CfnGraph$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableMembers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-enable-members` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGraph$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-enable-members)]
    (. builder autoEnableMembers data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-graph-props-builder
  "The build-cfn-graph-props-builder function updates a CfnGraphProps$Builder instance using the provided configuration.
  The function takes the CfnGraphProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableMembers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-members` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGraphProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-enable-members)]
    (. builder autoEnableMembers data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-member-invitation-builder
  "The build-cfn-member-invitation-builder function updates a CfnMemberInvitation$Builder instance using the provided configuration.
  The function takes the CfnMemberInvitation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `graphArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-arn` |
| `memberEmailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-email-address` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
"
  [^CfnMemberInvitation$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-email-notification)]
    (. builder disableEmailNotification data))
  (when-let [data (lookup-entry config id :graph-arn)]
    (. builder graphArn data))
  (when-let [data (lookup-entry config id :member-email-address)]
    (. builder memberEmailAddress data))
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn build-cfn-member-invitation-props-builder
  "The build-cfn-member-invitation-props-builder function updates a CfnMemberInvitationProps$Builder instance using the provided configuration.
  The function takes the CfnMemberInvitationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableEmailNotification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `graphArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-arn` |
| `memberEmailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-email-address` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
"
  [^CfnMemberInvitationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-email-notification)]
    (. builder disableEmailNotification data))
  (when-let [data (lookup-entry config id :graph-arn)]
    (. builder graphArn data))
  (when-let [data (lookup-entry config id :member-email-address)]
    (. builder memberEmailAddress data))
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn build-cfn-organization-admin-builder
  "The build-cfn-organization-admin-builder function updates a CfnOrganizationAdmin$Builder instance using the provided configuration.
  The function takes the CfnOrganizationAdmin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
"
  [^CfnOrganizationAdmin$Builder builder id config]
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (.build builder))


(defn build-cfn-organization-admin-props-builder
  "The build-cfn-organization-admin-props-builder function updates a CfnOrganizationAdminProps$Builder instance using the provided configuration.
  The function takes the CfnOrganizationAdminProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
"
  [^CfnOrganizationAdminProps$Builder builder id config]
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (.build builder))