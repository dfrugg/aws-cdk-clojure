(ns cdk.api.services.organizations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.organizations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.organizations CfnAccount$Builder
                                                          CfnAccountProps$Builder
                                                          CfnOrganization$Builder
                                                          CfnOrganizationProps$Builder
                                                          CfnOrganizationalUnit$Builder
                                                          CfnOrganizationalUnitProps$Builder
                                                          CfnPolicy$Builder
                                                          CfnPolicyProps$Builder
                                                          CfnResourcePolicy$Builder
                                                          CfnResourcePolicyProps$Builder]))


(defn cfn-account-builder>
  "The cfn-account-builder> function updates a CfnAccount$Builder instance using the provided configuration.
  The function takes the CfnAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `parentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:parent-ids` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccount$Builder builder id config]
  (when-some [data (lookup-entry config id :account-name)]
    (. builder accountName data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :parent-ids)]
    (. builder parentIds data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-account-builder
  "Creates a  `CfnAccount$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-account-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-account-builder> (CfnAccount$Builder/create scope (name id)) id config))


(defn cfn-account-props-builder>
  "The cfn-account-props-builder> function updates a CfnAccountProps$Builder instance using the provided configuration.
  The function takes the CfnAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `parentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:parent-ids` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAccountProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-name)]
    (. builder accountName data))
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :parent-ids)]
    (. builder parentIds data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-account-props-builder
  "Creates a  `CfnAccountProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-account-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-account-props-builder> (new CfnAccountProps$Builder) id config))


(defn cfn-organization-builder>
  "The cfn-organization-builder> function updates a CfnOrganization$Builder instance using the provided configuration.
  The function takes the CfnOrganization$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-set` |
"
  [^CfnOrganization$Builder builder id config]
  (when-some [data (lookup-entry config id :feature-set)]
    (. builder featureSet data))
  (.build builder))


(defn cfn-organization-builder
  "Creates a  `CfnOrganization$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-organization-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-organization-builder> (CfnOrganization$Builder/create scope (name id)) id config))


(defn cfn-organization-props-builder>
  "The cfn-organization-props-builder> function updates a CfnOrganizationProps$Builder instance using the provided configuration.
  The function takes the CfnOrganizationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-set` |
"
  [^CfnOrganizationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :feature-set)]
    (. builder featureSet data))
  (.build builder))


(defn cfn-organization-props-builder
  "Creates a  `CfnOrganizationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-organization-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-organization-props-builder> (new CfnOrganizationProps$Builder) id config))


(defn cfn-organizational-unit-builder>
  "The cfn-organizational-unit-builder> function updates a CfnOrganizationalUnit$Builder instance using the provided configuration.
  The function takes the CfnOrganizationalUnit$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOrganizationalUnit$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-id)]
    (. builder parentId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-organizational-unit-builder
  "Creates a  `CfnOrganizationalUnit$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-organizational-unit-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-organizational-unit-builder> (CfnOrganizationalUnit$Builder/create scope (name id)) id config))


(defn cfn-organizational-unit-props-builder>
  "The cfn-organizational-unit-props-builder> function updates a CfnOrganizationalUnitProps$Builder instance using the provided configuration.
  The function takes the CfnOrganizationalUnitProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOrganizationalUnitProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-id)]
    (. builder parentId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-organizational-unit-props-builder
  "Creates a  `CfnOrganizationalUnitProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-organizational-unit-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-organizational-unit-props-builder> (new CfnOrganizationalUnitProps$Builder) id config))


(defn cfn-policy-builder>
  "The cfn-policy-builder> function updates a CfnPolicy$Builder instance using the provided configuration.
  The function takes the CfnPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-ids)]
    (. builder targetIds data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-policy-builder
  "Creates a  `CfnPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-builder> (CfnPolicy$Builder/create scope (name id)) id config))


(defn cfn-policy-props-builder>
  "The cfn-policy-props-builder> function updates a CfnPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-ids)]
    (. builder targetIds data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-policy-props-builder
  "Creates a  `CfnPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-policy-props-builder> (new CfnPolicyProps$Builder) id config))


(defn cfn-resource-policy-builder>
  "The cfn-resource-policy-builder> function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-policy-builder
  "Creates a  `CfnResourcePolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-resource-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-policy-builder> (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn cfn-resource-policy-props-builder>
  "The cfn-resource-policy-props-builder> function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-resource-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-resource-policy-props-builder> (new CfnResourcePolicyProps$Builder) id config))