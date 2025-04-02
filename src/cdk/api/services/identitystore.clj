(ns cdk.api.services.identitystore
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.identitystore package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.identitystore CfnGroup$Builder
                                                          CfnGroupMembership$Builder
                                                          CfnGroupMembership$MemberIdProperty$Builder
                                                          CfnGroupMembershipProps$Builder
                                                          CfnGroupProps$Builder]))


(defn cfn-group-builder>
  "The cfn-group-builder> function updates a CfnGroup$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (.build builder))


(defn cfn-group-builder
  "Creates a  `CfnGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-group-builder> (CfnGroup$Builder/create scope (name id)) id config))


(defn cfn-group-membership-builder>
  "The cfn-group-membership-builder> function updates a CfnGroupMembership$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-some [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (when-some [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (.build builder))


(defn cfn-group-membership-builder
  "Creates a  `CfnGroupMembership$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-group-membership-builder> (CfnGroupMembership$Builder/create scope (name id)) id config))


(defn cfn-group-membership-member-id-property-builder>
  "The cfn-group-membership-member-id-property-builder> function updates a CfnGroupMembership$MemberIdProperty$Builder instance using the provided configuration.
  The function takes the CfnGroupMembership$MemberIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-id` |
"
  [^CfnGroupMembership$MemberIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :user-id)]
    (. builder userId data))
  (.build builder))


(defn cfn-group-membership-member-id-property-builder
  "Creates a  `CfnGroupMembership$MemberIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-membership-member-id-property-builder> (new CfnGroupMembership$MemberIdProperty$Builder) id config))


(defn cfn-group-membership-props-builder>
  "The cfn-group-membership-props-builder> function updates a CfnGroupMembershipProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :group-id)]
    (. builder groupId data))
  (when-some [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (when-some [data (lookup-entry config id :member-id)]
    (. builder memberId data))
  (.build builder))


(defn cfn-group-membership-props-builder
  "Creates a  `CfnGroupMembershipProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-membership-props-builder> (new CfnGroupMembershipProps$Builder) id config))


(defn cfn-group-props-builder>
  "The cfn-group-props-builder> function updates a CfnGroupProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :identity-store-id)]
    (. builder identityStoreId data))
  (.build builder))


(defn cfn-group-props-builder
  "Creates a  `CfnGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-group-props-builder> (new CfnGroupProps$Builder) id config))