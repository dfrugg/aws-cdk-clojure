(ns cdk.api.services.detective
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.detective package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.detective CfnGraph$Builder
                                                      CfnGraphProps$Builder
                                                      CfnMemberInvitation$Builder
                                                      CfnMemberInvitationProps$Builder
                                                      CfnOrganizationAdmin$Builder
                                                      CfnOrganizationAdminProps$Builder]))


(defn cfn-graph-builder
  "The cfn-graph-builder function buildes out new instances of 
CfnGraph$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableMembers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-enable-members` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGraph$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-enable-members)]
      (. builder autoEnableMembers data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-graph-props-builder
  "The cfn-graph-props-builder function buildes out new instances of 
CfnGraphProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableMembers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-members` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGraphProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-enable-members)]
      (. builder autoEnableMembers data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-member-invitation-builder
  "The cfn-member-invitation-builder function buildes out new instances of 
CfnMemberInvitation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `graphArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-arn` |
| `memberEmailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-email-address` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnMemberInvitation$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-member-invitation-props-builder
  "The cfn-member-invitation-props-builder function buildes out new instances of 
CfnMemberInvitationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableEmailNotification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-email-notification` |
| `graphArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-arn` |
| `memberEmailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-email-address` |
| `memberId` | java.lang.String | [[cdk.support/lookup-entry]] | `:member-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnMemberInvitationProps$Builder.)]
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
    (.build builder)))


(defn cfn-organization-admin-builder
  "The cfn-organization-admin-builder function buildes out new instances of 
CfnOrganizationAdmin$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |"
  [stack id config]
  (let [builder (CfnOrganizationAdmin$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (.build builder)))


(defn cfn-organization-admin-props-builder
  "The cfn-organization-admin-props-builder function buildes out new instances of 
CfnOrganizationAdminProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |"
  [stack id config]
  (let [builder (CfnOrganizationAdminProps$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (.build builder)))