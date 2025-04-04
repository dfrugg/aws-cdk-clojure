(ns cdk.api.services.iam
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iam package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iam AccessKey$Builder
                                                AccessKeyProps$Builder
                                                AccessKeyStatus
                                                AddToPrincipalPolicyResult$Builder
                                                AddToResourcePolicyResult$Builder
                                                CfnAccessKey$Builder
                                                CfnAccessKeyProps$Builder
                                                CfnGroup$Builder
                                                CfnGroup$PolicyProperty$Builder
                                                CfnGroupPolicy$Builder
                                                CfnGroupPolicyProps$Builder
                                                CfnGroupProps$Builder
                                                CfnInstanceProfile$Builder
                                                CfnInstanceProfileProps$Builder
                                                CfnManagedPolicy$Builder
                                                CfnManagedPolicyProps$Builder
                                                CfnOIDCProvider$Builder
                                                CfnOIDCProviderProps$Builder
                                                CfnPolicy$Builder
                                                CfnPolicyProps$Builder
                                                CfnRole$Builder
                                                CfnRole$PolicyProperty$Builder
                                                CfnRolePolicy$Builder
                                                CfnRolePolicyProps$Builder
                                                CfnRoleProps$Builder
                                                CfnSAMLProvider$Builder
                                                CfnSAMLProviderProps$Builder
                                                CfnServerCertificate$Builder
                                                CfnServerCertificateProps$Builder
                                                CfnServiceLinkedRole$Builder
                                                CfnServiceLinkedRoleProps$Builder
                                                CfnUser$Builder
                                                CfnUser$LoginProfileProperty$Builder
                                                CfnUser$PolicyProperty$Builder
                                                CfnUserPolicy$Builder
                                                CfnUserPolicyProps$Builder
                                                CfnUserProps$Builder
                                                CfnUserToGroupAddition$Builder
                                                CfnUserToGroupAdditionProps$Builder
                                                CfnVirtualMFADevice$Builder
                                                CfnVirtualMFADeviceProps$Builder
                                                CommonGrantOptions$Builder
                                                CustomizeRolesOptions$Builder
                                                Effect
                                                FromRoleArnOptions$Builder
                                                FromRoleNameOptions$Builder
                                                GrantOnPrincipalAndResourceOptions$Builder
                                                GrantOnPrincipalOptions$Builder
                                                GrantWithResourceOptions$Builder
                                                Group$Builder
                                                GroupProps$Builder
                                                InstanceProfile$Builder
                                                InstanceProfileAttributes$Builder
                                                InstanceProfileProps$Builder
                                                LazyRole$Builder
                                                LazyRoleProps$Builder
                                                ManagedPolicy$Builder
                                                ManagedPolicyProps$Builder
                                                OpenIdConnectProvider$Builder
                                                OpenIdConnectProviderProps$Builder
                                                Policy$Builder
                                                PolicyDocument$Builder
                                                PolicyDocumentProps$Builder
                                                PolicyProps$Builder
                                                PolicyStatement$Builder
                                                PolicyStatementProps$Builder
                                                Role$Builder
                                                RoleProps$Builder
                                                SamlProvider$Builder
                                                SamlProviderProps$Builder
                                                ServicePrincipal$Builder
                                                ServicePrincipalOpts$Builder
                                                UnknownPrincipal$Builder
                                                UnknownPrincipalProps$Builder
                                                User$Builder
                                                UserAttributes$Builder
                                                UserProps$Builder
                                                WithoutPolicyUpdatesOptions$Builder]))


(defn access-key-status
  "The `access-key-status` function data interprets values in the provided config data into a 
`AccessKeyStatus` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AccessKeyStatus` - the value is returned.
* is `:inactive` - `AccessKeyStatus/INACTIVE` is returned
* is `:active` - `AccessKeyStatus/ACTIVE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AccessKeyStatus data) data
      (= :inactive data) AccessKeyStatus/INACTIVE
      (= :active data) AccessKeyStatus/ACTIVE)))


(defn effect
  "The `effect` function data interprets values in the provided config data into a 
`Effect` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Effect` - the value is returned.
* is `:allow` - `Effect/ALLOW` is returned
* is `:deny` - `Effect/DENY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Effect data) data
      (= :allow data) Effect/ALLOW
      (= :deny data) Effect/DENY)))


(defn access-key-builder>
  "The access-key-builder> function updates a AccessKey$Builder instance using the provided configuration.
  The function takes the AccessKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | software.amazon.awscdk.services.iam.AccessKeyStatus | [[cdk.api.services.iam/access-key-status]] | `:status` |
| `user` | software.amazon.awscdk.services.iam.IUser | [[cdk.support/lookup-entry]] | `:user` |
"
  [^AccessKey$Builder builder id config]
  (when-some [data (lookup-entry config id :serial)]
    (. builder serial data))
  (when-some [data (access-key-status config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn access-key-builder
  "Creates a  `AccessKey$Builder` instance using a scope and ID, applies the data configuration using the [[access-key-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (access-key-builder> (AccessKey$Builder/create scope (name id)) id config))


(defn access-key-props-builder>
  "The access-key-props-builder> function updates a AccessKeyProps$Builder instance using the provided configuration.
  The function takes the AccessKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | software.amazon.awscdk.services.iam.AccessKeyStatus | [[cdk.api.services.iam/access-key-status]] | `:status` |
| `user` | software.amazon.awscdk.services.iam.IUser | [[cdk.support/lookup-entry]] | `:user` |
"
  [^AccessKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :serial)]
    (. builder serial data))
  (when-some [data (access-key-status config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn access-key-props-builder
  "Creates a  `AccessKeyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[access-key-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (access-key-props-builder> (new AccessKeyProps$Builder) id config))


(defn add-to-principal-policy-result-builder>
  "The add-to-principal-policy-result-builder> function updates a AddToPrincipalPolicyResult$Builder instance using the provided configuration.
  The function takes the AddToPrincipalPolicyResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDependable` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:policy-dependable` |
| `statementAdded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:statement-added` |
"
  [^AddToPrincipalPolicyResult$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-dependable)]
    (. builder policyDependable data))
  (when-some [data (lookup-entry config id :statement-added)]
    (. builder statementAdded data))
  (.build builder))


(defn add-to-principal-policy-result-builder
  "Creates a  `AddToPrincipalPolicyResult$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-to-principal-policy-result-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-to-principal-policy-result-builder> (new AddToPrincipalPolicyResult$Builder) id config))


(defn add-to-resource-policy-result-builder>
  "The add-to-resource-policy-result-builder> function updates a AddToResourcePolicyResult$Builder instance using the provided configuration.
  The function takes the AddToResourcePolicyResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDependable` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:policy-dependable` |
| `statementAdded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:statement-added` |
"
  [^AddToResourcePolicyResult$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-dependable)]
    (. builder policyDependable data))
  (when-some [data (lookup-entry config id :statement-added)]
    (. builder statementAdded data))
  (.build builder))


(defn add-to-resource-policy-result-builder
  "Creates a  `AddToResourcePolicyResult$Builder` instance using a no-argument constructor, applies the data configuration using the [[add-to-resource-policy-result-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (add-to-resource-policy-result-builder> (new AddToResourcePolicyResult$Builder) id config))


(defn cfn-access-key-builder>
  "The cfn-access-key-builder> function updates a CfnAccessKey$Builder instance using the provided configuration.
  The function takes the CfnAccessKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnAccessKey$Builder builder id config]
  (when-some [data (lookup-entry config id :serial)]
    (. builder serial data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-access-key-builder
  "Creates a  `CfnAccessKey$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-access-key-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-access-key-builder> (CfnAccessKey$Builder/create scope (name id)) id config))


(defn cfn-access-key-props-builder>
  "The cfn-access-key-props-builder> function updates a CfnAccessKeyProps$Builder instance using the provided configuration.
  The function takes the CfnAccessKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnAccessKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :serial)]
    (. builder serial data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-access-key-props-builder
  "Creates a  `CfnAccessKeyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-key-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-key-props-builder> (new CfnAccessKeyProps$Builder) id config))


(defn cfn-group-builder>
  "The cfn-group-builder> function updates a CfnGroup$Builder instance using the provided configuration.
  The function takes the CfnGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
"
  [^CfnGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (.build builder))


(defn cfn-group-builder
  "Creates a  `CfnGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-group-builder> (CfnGroup$Builder/create scope (name id)) id config))


(defn cfn-group-policy-builder>
  "The cfn-group-policy-builder> function updates a CfnGroupPolicy$Builder instance using the provided configuration.
  The function takes the CfnGroupPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnGroupPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-group-policy-builder
  "Creates a  `CfnGroupPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-group-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-group-policy-builder> (CfnGroupPolicy$Builder/create scope (name id)) id config))


(defn cfn-group-policy-property-builder>
  "The cfn-group-policy-property-builder> function updates a CfnGroup$PolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnGroup$PolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnGroup$PolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-group-policy-property-builder
  "Creates a  `CfnGroup$PolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-group-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-group-policy-property-builder> (new CfnGroup$PolicyProperty$Builder) id config))


(defn cfn-group-policy-props-builder>
  "The cfn-group-policy-props-builder> function updates a CfnGroupPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnGroupPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnGroupPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-group-policy-props-builder
  "Creates a  `CfnGroupPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-group-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-group-policy-props-builder> (new CfnGroupPolicyProps$Builder) id config))


(defn cfn-group-props-builder>
  "The cfn-group-props-builder> function updates a CfnGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
"
  [^CfnGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (.build builder))


(defn cfn-group-props-builder
  "Creates a  `CfnGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-group-props-builder> (new CfnGroupProps$Builder) id config))


(defn cfn-instance-profile-builder>
  "The cfn-instance-profile-builder> function updates a CfnInstanceProfile$Builder instance using the provided configuration.
  The function takes the CfnInstanceProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
"
  [^CfnInstanceProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (.build builder))


(defn cfn-instance-profile-builder
  "Creates a  `CfnInstanceProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-instance-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-profile-builder> (CfnInstanceProfile$Builder/create scope (name id)) id config))


(defn cfn-instance-profile-props-builder>
  "The cfn-instance-profile-props-builder> function updates a CfnInstanceProfileProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
"
  [^CfnInstanceProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (.build builder))


(defn cfn-instance-profile-props-builder
  "Creates a  `CfnInstanceProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-profile-props-builder> (new CfnInstanceProfileProps$Builder) id config))


(defn cfn-managed-policy-builder>
  "The cfn-managed-policy-builder> function updates a CfnManagedPolicy$Builder instance using the provided configuration.
  The function takes the CfnManagedPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnManagedPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-managed-policy-builder
  "Creates a  `CfnManagedPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-managed-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-managed-policy-builder> (CfnManagedPolicy$Builder/create scope (name id)) id config))


(defn cfn-managed-policy-props-builder>
  "The cfn-managed-policy-props-builder> function updates a CfnManagedPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnManagedPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnManagedPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-managed-policy-props-builder
  "Creates a  `CfnManagedPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-managed-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-managed-policy-props-builder> (new CfnManagedPolicyProps$Builder) id config))


(defn cfn-oidc-provider-builder>
  "The cfn-oidc-provider-builder> function updates a CfnOIDCProvider$Builder instance using the provided configuration.
  The function takes the CfnOIDCProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:client-id-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbprintList` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprint-list` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOIDCProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id-list)]
    (. builder clientIdList data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thumbprint-list)]
    (. builder thumbprintList data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-oidc-provider-builder
  "Creates a  `CfnOIDCProvider$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-oidc-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-oidc-provider-builder> (CfnOIDCProvider$Builder/create scope (name id)) id config))


(defn cfn-oidc-provider-props-builder>
  "The cfn-oidc-provider-props-builder> function updates a CfnOIDCProviderProps$Builder instance using the provided configuration.
  The function takes the CfnOIDCProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:client-id-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbprintList` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprint-list` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnOIDCProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-id-list)]
    (. builder clientIdList data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thumbprint-list)]
    (. builder thumbprintList data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-oidc-provider-props-builder
  "Creates a  `CfnOIDCProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-oidc-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-oidc-provider-props-builder> (new CfnOIDCProviderProps$Builder) id config))


(defn cfn-policy-builder>
  "The cfn-policy-builder> function updates a CfnPolicy$Builder instance using the provided configuration.
  The function takes the CfnPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
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
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-policy-props-builder
  "Creates a  `CfnPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-policy-props-builder> (new CfnPolicyProps$Builder) id config))


(defn cfn-role-builder>
  "The cfn-role-builder> function updates a CfnRole$Builder instance using the provided configuration.
  The function takes the CfnRole$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRolePolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:assume-role-policy-document` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `maxSessionDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRole$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-policy-document)]
    (. builder assumeRolePolicyDocument data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-role-builder
  "Creates a  `CfnRole$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-role-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-role-builder> (CfnRole$Builder/create scope (name id)) id config))


(defn cfn-role-policy-builder>
  "The cfn-role-policy-builder> function updates a CfnRolePolicy$Builder instance using the provided configuration.
  The function takes the CfnRolePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^CfnRolePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn cfn-role-policy-builder
  "Creates a  `CfnRolePolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-role-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-role-policy-builder> (CfnRolePolicy$Builder/create scope (name id)) id config))


(defn cfn-role-policy-property-builder>
  "The cfn-role-policy-property-builder> function updates a CfnRole$PolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnRole$PolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnRole$PolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-role-policy-property-builder
  "Creates a  `CfnRole$PolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-role-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-role-policy-property-builder> (new CfnRole$PolicyProperty$Builder) id config))


(defn cfn-role-policy-props-builder>
  "The cfn-role-policy-props-builder> function updates a CfnRolePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnRolePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^CfnRolePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn cfn-role-policy-props-builder
  "Creates a  `CfnRolePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-role-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-role-policy-props-builder> (new CfnRolePolicyProps$Builder) id config))


(defn cfn-role-props-builder>
  "The cfn-role-props-builder> function updates a CfnRoleProps$Builder instance using the provided configuration.
  The function takes the CfnRoleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRolePolicyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:assume-role-policy-document` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `maxSessionDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-policy-document)]
    (. builder assumeRolePolicyDocument data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-role-props-builder
  "Creates a  `CfnRoleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-role-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-role-props-builder> (new CfnRoleProps$Builder) id config))


(defn cfn-saml-provider-builder>
  "The cfn-saml-provider-builder> function updates a CfnSAMLProvider$Builder instance using the provided configuration.
  The function takes the CfnSAMLProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlMetadataDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSAMLProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :saml-metadata-document)]
    (. builder samlMetadataDocument data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-saml-provider-builder
  "Creates a  `CfnSAMLProvider$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-saml-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-saml-provider-builder> (CfnSAMLProvider$Builder/create scope (name id)) id config))


(defn cfn-saml-provider-props-builder>
  "The cfn-saml-provider-props-builder> function updates a CfnSAMLProviderProps$Builder instance using the provided configuration.
  The function takes the CfnSAMLProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlMetadataDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSAMLProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :saml-metadata-document)]
    (. builder samlMetadataDocument data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-saml-provider-props-builder
  "Creates a  `CfnSAMLProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-saml-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-saml-provider-props-builder> (new CfnSAMLProviderProps$Builder) id config))


(defn cfn-server-certificate-builder>
  "The cfn-server-certificate-builder> function updates a CfnServerCertificate$Builder instance using the provided configuration.
  The function takes the CfnServerCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-body` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `serverCertificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServerCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-body)]
    (. builder certificateBody data))
  (when-some [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :server-certificate-name)]
    (. builder serverCertificateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-server-certificate-builder
  "Creates a  `CfnServerCertificate$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-server-certificate-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-server-certificate-builder> (CfnServerCertificate$Builder/create scope (name id)) id config))


(defn cfn-server-certificate-props-builder>
  "The cfn-server-certificate-props-builder> function updates a CfnServerCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnServerCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-body` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `serverCertificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServerCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-body)]
    (. builder certificateBody data))
  (when-some [data (lookup-entry config id :certificate-chain)]
    (. builder certificateChain data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (when-some [data (lookup-entry config id :server-certificate-name)]
    (. builder serverCertificateName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-server-certificate-props-builder
  "Creates a  `CfnServerCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-server-certificate-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-server-certificate-props-builder> (new CfnServerCertificateProps$Builder) id config))


(defn cfn-service-linked-role-builder>
  "The cfn-service-linked-role-builder> function updates a CfnServiceLinkedRole$Builder instance using the provided configuration.
  The function takes the CfnServiceLinkedRole$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service-name` |
| `customSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-suffix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnServiceLinkedRole$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-service-name)]
    (. builder awsServiceName data))
  (when-some [data (lookup-entry config id :custom-suffix)]
    (. builder customSuffix data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-service-linked-role-builder
  "Creates a  `CfnServiceLinkedRole$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-service-linked-role-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-linked-role-builder> (CfnServiceLinkedRole$Builder/create scope (name id)) id config))


(defn cfn-service-linked-role-props-builder>
  "The cfn-service-linked-role-props-builder> function updates a CfnServiceLinkedRoleProps$Builder instance using the provided configuration.
  The function takes the CfnServiceLinkedRoleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service-name` |
| `customSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-suffix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnServiceLinkedRoleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-service-name)]
    (. builder awsServiceName data))
  (when-some [data (lookup-entry config id :custom-suffix)]
    (. builder customSuffix data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-service-linked-role-props-builder
  "Creates a  `CfnServiceLinkedRoleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-linked-role-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-linked-role-props-builder> (new CfnServiceLinkedRoleProps$Builder) id config))


(defn cfn-user-builder>
  "The cfn-user-builder> function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `loginProfile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:login-profile` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUser$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :login-profile)]
    (. builder loginProfile data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-builder
  "Creates a  `CfnUser$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-user-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-builder> (CfnUser$Builder/create scope (name id)) id config))


(defn cfn-user-login-profile-property-builder>
  "The cfn-user-login-profile-property-builder> function updates a CfnUser$LoginProfileProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$LoginProfileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |
"
  [^CfnUser$LoginProfileProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :password-reset-required)]
    (. builder passwordResetRequired data))
  (.build builder))


(defn cfn-user-login-profile-property-builder
  "Creates a  `CfnUser$LoginProfileProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-login-profile-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-login-profile-property-builder> (new CfnUser$LoginProfileProperty$Builder) id config))


(defn cfn-user-policy-builder>
  "The cfn-user-policy-builder> function updates a CfnUserPolicy$Builder instance using the provided configuration.
  The function takes the CfnUserPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-policy-builder
  "Creates a  `CfnUserPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-user-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-policy-builder> (CfnUserPolicy$Builder/create scope (name id)) id config))


(defn cfn-user-policy-property-builder>
  "The cfn-user-policy-property-builder> function updates a CfnUser$PolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$PolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
"
  [^CfnUser$PolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (.build builder))


(defn cfn-user-policy-property-builder
  "Creates a  `CfnUser$PolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-policy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-policy-property-builder> (new CfnUser$PolicyProperty$Builder) id config))


(defn cfn-user-policy-props-builder>
  "The cfn-user-policy-props-builder> function updates a CfnUserPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnUserPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-policy-props-builder
  "Creates a  `CfnUserPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-policy-props-builder> (new CfnUserPolicyProps$Builder) id config))


(defn cfn-user-props-builder>
  "The cfn-user-props-builder> function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `loginProfile` | software.amazon.awscdk.services.iam.CfnUser$LoginProfileProperty | [[cdk.support/lookup-entry]] | `:login-profile` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserProps$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :login-profile)]
    (. builder loginProfile data))
  (when-some [data (lookup-entry config id :managed-policy-arns)]
    (. builder managedPolicyArns data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn cfn-user-props-builder
  "Creates a  `CfnUserProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-props-builder> (new CfnUserProps$Builder) id config))


(defn cfn-user-to-group-addition-builder>
  "The cfn-user-to-group-addition-builder> function updates a CfnUserToGroupAddition$Builder instance using the provided configuration.
  The function takes the CfnUserToGroupAddition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnUserToGroupAddition$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-user-to-group-addition-builder
  "Creates a  `CfnUserToGroupAddition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-user-to-group-addition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-to-group-addition-builder> (CfnUserToGroupAddition$Builder/create scope (name id)) id config))


(defn cfn-user-to-group-addition-props-builder>
  "The cfn-user-to-group-addition-props-builder> function updates a CfnUserToGroupAdditionProps$Builder instance using the provided configuration.
  The function takes the CfnUserToGroupAdditionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnUserToGroupAdditionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-user-to-group-addition-props-builder
  "Creates a  `CfnUserToGroupAdditionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-to-group-addition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-to-group-addition-props-builder> (new CfnUserToGroupAdditionProps$Builder) id config))


(defn cfn-virtual-mfa-device-builder>
  "The cfn-virtual-mfa-device-builder> function updates a CfnVirtualMFADevice$Builder instance using the provided configuration.
  The function takes the CfnVirtualMFADevice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
| `virtualMfaDeviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-mfa-device-name` |
"
  [^CfnVirtualMFADevice$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (when-some [data (lookup-entry config id :virtual-mfa-device-name)]
    (. builder virtualMfaDeviceName data))
  (.build builder))


(defn cfn-virtual-mfa-device-builder
  "Creates a  `CfnVirtualMFADevice$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-virtual-mfa-device-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-virtual-mfa-device-builder> (CfnVirtualMFADevice$Builder/create scope (name id)) id config))


(defn cfn-virtual-mfa-device-props-builder>
  "The cfn-virtual-mfa-device-props-builder> function updates a CfnVirtualMFADeviceProps$Builder instance using the provided configuration.
  The function takes the CfnVirtualMFADeviceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
| `virtualMfaDeviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-mfa-device-name` |
"
  [^CfnVirtualMFADeviceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (when-some [data (lookup-entry config id :virtual-mfa-device-name)]
    (. builder virtualMfaDeviceName data))
  (.build builder))


(defn cfn-virtual-mfa-device-props-builder
  "Creates a  `CfnVirtualMFADeviceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-virtual-mfa-device-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-virtual-mfa-device-props-builder> (new CfnVirtualMFADeviceProps$Builder) id config))


(defn common-grant-options-builder>
  "The common-grant-options-builder> function updates a CommonGrantOptions$Builder instance using the provided configuration.
  The function takes the CommonGrantOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
"
  [^CommonGrantOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-some [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (.build builder))


(defn common-grant-options-builder
  "Creates a  `CommonGrantOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[common-grant-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (common-grant-options-builder> (new CommonGrantOptions$Builder) id config))


(defn customize-roles-options-builder>
  "The customize-roles-options-builder> function updates a CustomizeRolesOptions$Builder instance using the provided configuration.
  The function takes the CustomizeRolesOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preventSynthesis` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prevent-synthesis` |
| `usePrecreatedRoles` | java.util.Map | [[cdk.support/lookup-entry]] | `:use-precreated-roles` |
"
  [^CustomizeRolesOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :prevent-synthesis)]
    (. builder preventSynthesis data))
  (when-some [data (lookup-entry config id :use-precreated-roles)]
    (. builder usePrecreatedRoles data))
  (.build builder))


(defn customize-roles-options-builder
  "Creates a  `CustomizeRolesOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[customize-roles-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (customize-roles-options-builder> (new CustomizeRolesOptions$Builder) id config))


(defn from-role-arn-options-builder>
  "The from-role-arn-options-builder> function updates a FromRoleArnOptions$Builder instance using the provided configuration.
  The function takes the FromRoleArnOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |
| `defaultPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy-name` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^FromRoleArnOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :add-grants-to-resources)]
    (. builder addGrantsToResources data))
  (when-some [data (lookup-entry config id :default-policy-name)]
    (. builder defaultPolicyName data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn from-role-arn-options-builder
  "Creates a  `FromRoleArnOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[from-role-arn-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (from-role-arn-options-builder> (new FromRoleArnOptions$Builder) id config))


(defn from-role-name-options-builder>
  "The from-role-name-options-builder> function updates a FromRoleNameOptions$Builder instance using the provided configuration.
  The function takes the FromRoleNameOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |
| `defaultPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy-name` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |
"
  [^FromRoleNameOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :add-grants-to-resources)]
    (. builder addGrantsToResources data))
  (when-some [data (lookup-entry config id :default-policy-name)]
    (. builder defaultPolicyName data))
  (when-some [data (lookup-entry config id :mutable)]
    (. builder mutable data))
  (.build builder))


(defn from-role-name-options-builder
  "Creates a  `FromRoleNameOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[from-role-name-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (from-role-name-options-builder> (new FromRoleNameOptions$Builder) id config))


(defn grant-on-principal-and-resource-options-builder>
  "The grant-on-principal-and-resource-options-builder> function updates a GrantOnPrincipalAndResourceOptions$Builder instance using the provided configuration.
  The function takes the GrantOnPrincipalAndResourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resource` | software.amazon.awscdk.services.iam.IResourceWithPolicy | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `resourcePolicyPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:resource-policy-principal` |
| `resourceSelfArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-self-arns` |
"
  [^GrantOnPrincipalAndResourceOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-some [data (lookup-entry config id :resource-policy-principal)]
    (. builder resourcePolicyPrincipal data))
  (when-some [data (lookup-entry config id :resource-self-arns)]
    (. builder resourceSelfArns data))
  (.build builder))


(defn grant-on-principal-and-resource-options-builder
  "Creates a  `GrantOnPrincipalAndResourceOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[grant-on-principal-and-resource-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (grant-on-principal-and-resource-options-builder> (new GrantOnPrincipalAndResourceOptions$Builder) id config))


(defn grant-on-principal-options-builder>
  "The grant-on-principal-options-builder> function updates a GrantOnPrincipalOptions$Builder instance using the provided configuration.
  The function takes the GrantOnPrincipalOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `scope` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^GrantOnPrincipalOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-some [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn grant-on-principal-options-builder
  "Creates a  `GrantOnPrincipalOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[grant-on-principal-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (grant-on-principal-options-builder> (new GrantOnPrincipalOptions$Builder) id config))


(defn grant-with-resource-options-builder>
  "The grant-with-resource-options-builder> function updates a GrantWithResourceOptions$Builder instance using the provided configuration.
  The function takes the GrantWithResourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resource` | software.amazon.awscdk.services.iam.IResourceWithPolicy | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `resourceSelfArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-self-arns` |
"
  [^GrantWithResourceOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :grantee)]
    (. builder grantee data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-some [data (lookup-entry config id :resource-self-arns)]
    (. builder resourceSelfArns data))
  (.build builder))


(defn grant-with-resource-options-builder
  "Creates a  `GrantWithResourceOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[grant-with-resource-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (grant-with-resource-options-builder> (new GrantWithResourceOptions$Builder) id config))


(defn group-builder>
  "The group-builder> function updates a Group$Builder instance using the provided configuration.
  The function takes the Group$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^Group$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn group-builder
  "Creates a  `Group$Builder` instance using a scope and ID, applies the data configuration using the [[group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (group-builder> (Group$Builder/create scope (name id)) id config))


(defn group-props-builder>
  "The group-props-builder> function updates a GroupProps$Builder instance using the provided configuration.
  The function takes the GroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^GroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn group-props-builder
  "Creates a  `GroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (group-props-builder> (new GroupProps$Builder) id config))


(defn instance-profile-attributes-builder>
  "The instance-profile-attributes-builder> function updates a InstanceProfileAttributes$Builder instance using the provided configuration.
  The function takes the InstanceProfileAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^InstanceProfileAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-profile-arn)]
    (. builder instanceProfileArn data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn instance-profile-attributes-builder
  "Creates a  `InstanceProfileAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-profile-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-profile-attributes-builder> (new InstanceProfileAttributes$Builder) id config))


(defn instance-profile-builder>
  "The instance-profile-builder> function updates a InstanceProfile$Builder instance using the provided configuration.
  The function takes the InstanceProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^InstanceProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn instance-profile-builder
  "Creates a  `InstanceProfile$Builder` instance using a scope and ID, applies the data configuration using the [[instance-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (instance-profile-builder> (InstanceProfile$Builder/create scope (name id)) id config))


(defn instance-profile-props-builder>
  "The instance-profile-props-builder> function updates a InstanceProfileProps$Builder instance using the provided configuration.
  The function takes the InstanceProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^InstanceProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-profile-name)]
    (. builder instanceProfileName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn instance-profile-props-builder
  "Creates a  `InstanceProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-profile-props-builder> (new InstanceProfileProps$Builder) id config))


(defn lazy-role-builder>
  "The lazy-role-builder> function updates a LazyRole$Builder instance using the provided configuration.
  The function takes the LazyRole$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumedBy` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:assumed-by` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalIds` | java.util.List | [[cdk.support/lookup-entry]] | `:external-ids` |
| `inlinePolicies` | java.util.Map | [[cdk.support/lookup-entry]] | `:inline-policies` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `maxSessionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^LazyRole$Builder builder id config]
  (when-some [data (lookup-entry config id :assumed-by)]
    (. builder assumedBy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :external-ids)]
    (. builder externalIds data))
  (when-some [data (lookup-entry config id :inline-policies)]
    (. builder inlinePolicies data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn lazy-role-builder
  "Creates a  `LazyRole$Builder` instance using a scope and ID, applies the data configuration using the [[lazy-role-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (lazy-role-builder> (LazyRole$Builder/create scope (name id)) id config))


(defn lazy-role-props-builder>
  "The lazy-role-props-builder> function updates a LazyRoleProps$Builder instance using the provided configuration.
  The function takes the LazyRoleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumedBy` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:assumed-by` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalIds` | java.util.List | [[cdk.support/lookup-entry]] | `:external-ids` |
| `inlinePolicies` | java.util.Map | [[cdk.support/lookup-entry]] | `:inline-policies` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `maxSessionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^LazyRoleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assumed-by)]
    (. builder assumedBy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :external-ids)]
    (. builder externalIds data))
  (when-some [data (lookup-entry config id :inline-policies)]
    (. builder inlinePolicies data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn lazy-role-props-builder
  "Creates a  `LazyRoleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[lazy-role-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (lazy-role-props-builder> (new LazyRoleProps$Builder) id config))


(defn managed-policy-builder>
  "The managed-policy-builder> function updates a ManagedPolicy$Builder instance using the provided configuration.
  The function takes the ManagedPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^ManagedPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn managed-policy-builder
  "Creates a  `ManagedPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[managed-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (managed-policy-builder> (ManagedPolicy$Builder/create scope (name id)) id config))


(defn managed-policy-props-builder>
  "The managed-policy-props-builder> function updates a ManagedPolicyProps$Builder instance using the provided configuration.
  The function takes the ManagedPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^ManagedPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policy-name)]
    (. builder managedPolicyName data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn managed-policy-props-builder
  "Creates a  `ManagedPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[managed-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (managed-policy-props-builder> (new ManagedPolicyProps$Builder) id config))


(defn open-id-connect-provider-builder>
  "The open-id-connect-provider-builder> function updates a OpenIdConnectProvider$Builder instance using the provided configuration.
  The function takes the OpenIdConnectProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `thumbprints` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprints` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^OpenIdConnectProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :client-ids)]
    (. builder clientIds data))
  (when-some [data (lookup-entry config id :thumbprints)]
    (. builder thumbprints data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn open-id-connect-provider-builder
  "Creates a  `OpenIdConnectProvider$Builder` instance using a scope and ID, applies the data configuration using the [[open-id-connect-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (open-id-connect-provider-builder> (OpenIdConnectProvider$Builder/create scope (name id)) id config))


(defn open-id-connect-provider-props-builder>
  "The open-id-connect-provider-props-builder> function updates a OpenIdConnectProviderProps$Builder instance using the provided configuration.
  The function takes the OpenIdConnectProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `thumbprints` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprints` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^OpenIdConnectProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-ids)]
    (. builder clientIds data))
  (when-some [data (lookup-entry config id :thumbprints)]
    (. builder thumbprints data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn open-id-connect-provider-props-builder
  "Creates a  `OpenIdConnectProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[open-id-connect-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (open-id-connect-provider-props-builder> (new OpenIdConnectProviderProps$Builder) id config))


(defn policy-builder>
  "The policy-builder> function updates a Policy$Builder instance using the provided configuration.
  The function takes the Policy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^Policy$Builder builder id config]
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn policy-builder
  "Creates a  `Policy$Builder` instance using a scope and ID, applies the data configuration using the [[policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (policy-builder> (Policy$Builder/create scope (name id)) id config))


(defn policy-document-builder>
  "The policy-document-builder> function updates a PolicyDocument$Builder instance using the provided configuration.
  The function takes the PolicyDocument$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignSids` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-sids` |
| `minimize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:minimize` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^PolicyDocument$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-sids)]
    (. builder assignSids data))
  (when-some [data (lookup-entry config id :minimize)]
    (. builder minimize data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn policy-document-builder
  "Creates a  `PolicyDocument$Builder` instance using a no-argument create, applies the data configuration using the [[policy-document-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-document-builder> (PolicyDocument$Builder/create) id config))


(defn policy-document-props-builder>
  "The policy-document-props-builder> function updates a PolicyDocumentProps$Builder instance using the provided configuration.
  The function takes the PolicyDocumentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignSids` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-sids` |
| `minimize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:minimize` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^PolicyDocumentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-sids)]
    (. builder assignSids data))
  (when-some [data (lookup-entry config id :minimize)]
    (. builder minimize data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn policy-document-props-builder
  "Creates a  `PolicyDocumentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-document-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-document-props-builder> (new PolicyDocumentProps$Builder) id config))


(defn policy-props-builder>
  "The policy-props-builder> function updates a PolicyProps$Builder instance using the provided configuration.
  The function takes the PolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^PolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :statements)]
    (. builder statements data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn policy-props-builder
  "Creates a  `PolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-props-builder> (new PolicyProps$Builder) id config))


(defn policy-statement-builder>
  "The policy-statement-builder> function updates a PolicyStatement$Builder instance using the provided configuration.
  The function takes the PolicyStatement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `effect` | software.amazon.awscdk.services.iam.Effect | [[cdk.api.services.iam/effect]] | `:effect` |
| `notActions` | java.util.List | [[cdk.support/lookup-entry]] | `:not-actions` |
| `notPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-principals` |
| `notResources` | java.util.List | [[cdk.support/lookup-entry]] | `:not-resources` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
"
  [^PolicyStatement$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (effect config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :not-actions)]
    (. builder notActions data))
  (when-some [data (lookup-entry config id :not-principals)]
    (. builder notPrincipals data))
  (when-some [data (lookup-entry config id :not-resources)]
    (. builder notResources data))
  (when-some [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :sid)]
    (. builder sid data))
  (.build builder))


(defn policy-statement-builder
  "Creates a  `PolicyStatement$Builder` instance using a no-argument create, applies the data configuration using the [[policy-statement-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-statement-builder> (PolicyStatement$Builder/create) id config))


(defn policy-statement-props-builder>
  "The policy-statement-props-builder> function updates a PolicyStatementProps$Builder instance using the provided configuration.
  The function takes the PolicyStatementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `effect` | software.amazon.awscdk.services.iam.Effect | [[cdk.api.services.iam/effect]] | `:effect` |
| `notActions` | java.util.List | [[cdk.support/lookup-entry]] | `:not-actions` |
| `notPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:not-principals` |
| `notResources` | java.util.List | [[cdk.support/lookup-entry]] | `:not-resources` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
"
  [^PolicyStatementProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (effect config id :effect)]
    (. builder effect data))
  (when-some [data (lookup-entry config id :not-actions)]
    (. builder notActions data))
  (when-some [data (lookup-entry config id :not-principals)]
    (. builder notPrincipals data))
  (when-some [data (lookup-entry config id :not-resources)]
    (. builder notResources data))
  (when-some [data (lookup-entry config id :principals)]
    (. builder principals data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :sid)]
    (. builder sid data))
  (.build builder))


(defn policy-statement-props-builder
  "Creates a  `PolicyStatementProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[policy-statement-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (policy-statement-props-builder> (new PolicyStatementProps$Builder) id config))


(defn role-builder>
  "The role-builder> function updates a Role$Builder instance using the provided configuration.
  The function takes the Role$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumedBy` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:assumed-by` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalIds` | java.util.List | [[cdk.support/lookup-entry]] | `:external-ids` |
| `inlinePolicies` | java.util.Map | [[cdk.support/lookup-entry]] | `:inline-policies` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `maxSessionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^Role$Builder builder id config]
  (when-some [data (lookup-entry config id :assumed-by)]
    (. builder assumedBy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :external-ids)]
    (. builder externalIds data))
  (when-some [data (lookup-entry config id :inline-policies)]
    (. builder inlinePolicies data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn role-builder
  "Creates a  `Role$Builder` instance using a scope and ID, applies the data configuration using the [[role-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (role-builder> (Role$Builder/create scope (name id)) id config))


(defn role-props-builder>
  "The role-props-builder> function updates a RoleProps$Builder instance using the provided configuration.
  The function takes the RoleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumedBy` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:assumed-by` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalIds` | java.util.List | [[cdk.support/lookup-entry]] | `:external-ids` |
| `inlinePolicies` | java.util.Map | [[cdk.support/lookup-entry]] | `:inline-policies` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `maxSessionDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-session-duration` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
"
  [^RoleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assumed-by)]
    (. builder assumedBy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :external-ids)]
    (. builder externalIds data))
  (when-some [data (lookup-entry config id :inline-policies)]
    (. builder inlinePolicies data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :max-session-duration)]
    (. builder maxSessionDuration data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (.build builder))


(defn role-props-builder
  "Creates a  `RoleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[role-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (role-props-builder> (new RoleProps$Builder) id config))


(defn saml-provider-builder>
  "The saml-provider-builder> function updates a SamlProvider$Builder instance using the provided configuration.
  The function takes the SamlProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataDocument` | software.amazon.awscdk.services.iam.SamlMetadataDocument | [[cdk.support/lookup-entry]] | `:metadata-document` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^SamlProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-document)]
    (. builder metadataDocument data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn saml-provider-builder
  "Creates a  `SamlProvider$Builder` instance using a scope and ID, applies the data configuration using the [[saml-provider-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (saml-provider-builder> (SamlProvider$Builder/create scope (name id)) id config))


(defn saml-provider-props-builder>
  "The saml-provider-props-builder> function updates a SamlProviderProps$Builder instance using the provided configuration.
  The function takes the SamlProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataDocument` | software.amazon.awscdk.services.iam.SamlMetadataDocument | [[cdk.support/lookup-entry]] | `:metadata-document` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^SamlProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :metadata-document)]
    (. builder metadataDocument data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn saml-provider-props-builder
  "Creates a  `SamlProviderProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[saml-provider-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (saml-provider-props-builder> (new SamlProviderProps$Builder) id config))


(defn service-principal-builder>
  "The service-principal-builder> function updates a ServicePrincipal$Builder instance using the provided configuration.
  The function takes the ServicePrincipal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ServicePrincipal$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn service-principal-builder
  "Creates a  `ServicePrincipal$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ___[java.lang.String]___

| Argument | DataType | Description |
|---|---|---|
| `service` | java.lang.String |  |
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^String service id config]
  (service-principal-builder> (ServicePrincipal$Builder/create service) id config))


(defn service-principal-opts-builder>
  "The service-principal-opts-builder> function updates a ServicePrincipalOpts$Builder instance using the provided configuration.
  The function takes the ServicePrincipalOpts$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ServicePrincipalOpts$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn service-principal-opts-builder
  "Creates a  `ServicePrincipalOpts$Builder` instance using a no-argument constructor, applies the data configuration using the [[service-principal-opts-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (service-principal-opts-builder> (new ServicePrincipalOpts$Builder) id config))


(defn unknown-principal-builder>
  "The unknown-principal-builder> function updates a UnknownPrincipal$Builder instance using the provided configuration.
  The function takes the UnknownPrincipal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^UnknownPrincipal$Builder builder id config]
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn unknown-principal-builder
  "Creates a  `UnknownPrincipal$Builder` instance using a no-argument create, applies the data configuration using the [[unknown-principal-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (unknown-principal-builder> (UnknownPrincipal$Builder/create) id config))


(defn unknown-principal-props-builder>
  "The unknown-principal-props-builder> function updates a UnknownPrincipalProps$Builder instance using the provided configuration.
  The function takes the UnknownPrincipalProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^UnknownPrincipalProps$Builder builder id config]
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn unknown-principal-props-builder
  "Creates a  `UnknownPrincipalProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[unknown-principal-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (unknown-principal-props-builder> (new UnknownPrincipalProps$Builder) id config))


(defn user-attributes-builder>
  "The user-attributes-builder> function updates a UserAttributes$Builder instance using the provided configuration.
  The function takes the UserAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-arn` |
"
  [^UserAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :user-arn)]
    (. builder userArn data))
  (.build builder))


(defn user-attributes-builder
  "Creates a  `UserAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[user-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (user-attributes-builder> (new UserAttributes$Builder) id config))


(defn user-builder>
  "The user-builder> function updates a User$Builder instance using the provided configuration.
  The function takes the User$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^User$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :password-reset-required)]
    (. builder passwordResetRequired data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn user-builder
  "Creates a  `User$Builder` instance using a scope and ID, applies the data configuration using the [[user-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (user-builder> (User$Builder/create scope (name id)) id config))


(defn user-props-builder>
  "The user-props-builder> function updates a UserProps$Builder instance using the provided configuration.
  The function takes the UserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^UserProps$Builder builder id config]
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :password-reset-required)]
    (. builder passwordResetRequired data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn user-props-builder
  "Creates a  `UserProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[user-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (user-props-builder> (new UserProps$Builder) id config))


(defn without-policy-updates-options-builder>
  "The without-policy-updates-options-builder> function updates a WithoutPolicyUpdatesOptions$Builder instance using the provided configuration.
  The function takes the WithoutPolicyUpdatesOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |
"
  [^WithoutPolicyUpdatesOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :add-grants-to-resources)]
    (. builder addGrantsToResources data))
  (.build builder))


(defn without-policy-updates-options-builder
  "Creates a  `WithoutPolicyUpdatesOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[without-policy-updates-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (without-policy-updates-options-builder> (new WithoutPolicyUpdatesOptions$Builder) id config))