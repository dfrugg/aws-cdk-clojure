(ns cdk.api.services.identitystore
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.identitystore package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.identitystore CfnGroup$Builder
                                                          CfnGroupMembership$Builder
                                                          CfnGroupMembership$MemberIdProperty$Builder
                                                          CfnGroupMembershipProps$Builder
                                                          CfnGroupProps$Builder]))


(defn build-cfn-group-builder
  "The build-cfn-group-builder function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
"
  [^CfnGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (.build builder))


(defn build-cfn-group-membership-builder
  "The build-cfn-group-membership-builder function updates a CfnGroupMembership$Builder instance using the provided configuration.
  The function takes the CfnGroupMembership$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
| `memberId` | software.amazon.awscdk.services.identitystore.CfnGroupMembership$MemberIdProperty | [[cdk.support/lookup-entry]] | `:member-id` |
"
  [^CfnGroupMembership$Builder builder id config]
  (when-let [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-let [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (.build builder))


(defn build-cfn-group-membership-member-id-property-builder
  "The build-cfn-group-membership-member-id-property-builder function updates a CfnGroupMembership$MemberIdProperty$Builder instance using the provided configuration.
  The function takes the CfnGroupMembership$MemberIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |
"
  [^CfnGroupMembership$MemberIdProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :user-id)]
    (. builder userId data))
  (.build builder))


(defn build-cfn-group-membership-props-builder
  "The build-cfn-group-membership-props-builder function updates a CfnGroupMembershipProps$Builder instance using the provided configuration.
  The function takes the CfnGroupMembershipProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
| `memberId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member-id` |
"
  [^CfnGroupMembershipProps$Builder builder id config]
  (when-let [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-let [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (when-let [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (.build builder))


(defn build-cfn-group-props-builder
  "The build-cfn-group-props-builder function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `identityStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-store-id` |
"
  [^CfnGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (.build builder))