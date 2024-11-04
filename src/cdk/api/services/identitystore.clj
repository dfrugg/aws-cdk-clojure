(ns cdk.api.services.identitystore
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.identitystore package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.identitystore CfnGroup$Builder
                                                          CfnGroupMembership$Builder
                                                          CfnGroupMembership$MemberIdProperty$Builder
                                                          CfnGroupMembershipProps$Builder
                                                          CfnGroupProps$Builder]))


(defn cfn-group-builder
  "The cfn-group-builder function buildes out new instances of 
CfnGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |"
  [stack id config]
  (let [builder (CfnGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :identity-store-id)]
      (. builder identityStoreId data))
    (.build builder)))


(defn cfn-group-membership-builder
  "The cfn-group-membership-builder function buildes out new instances of 
CfnGroupMembership$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
| `memberId` | software.amazon.awscdk.services.identitystore.CfnGroupMembership$MemberIdProperty | [[cdk.support/lookup-entry]] | `:member-id` |"
  [stack id config]
  (let [builder (CfnGroupMembership$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :identity-store-id)]
      (. builder identityStoreId data))
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (.build builder)))


(defn cfn-group-membership-member-id-property-builder
  "The cfn-group-membership-member-id-property-builder function buildes out new instances of 
CfnGroupMembership$MemberIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |"
  [stack id config]
  (let [builder (CfnGroupMembership$MemberIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :user-id)]
      (. builder userId data))
    (.build builder)))


(defn cfn-group-membership-props-builder
  "The cfn-group-membership-props-builder function buildes out new instances of 
CfnGroupMembershipProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
| `memberId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-id` |"
  [stack id config]
  (let [builder (CfnGroupMembershipProps$Builder.)]
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :identity-store-id)]
      (. builder identityStoreId data))
    (when-let [data (lookup-entry config id :member-id)]
      (. builder memberId data))
    (.build builder)))


(defn cfn-group-props-builder
  "The cfn-group-props-builder function buildes out new instances of 
CfnGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |"
  [stack id config]
  (let [builder (CfnGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :identity-store-id)]
      (. builder identityStoreId data))
    (.build builder)))