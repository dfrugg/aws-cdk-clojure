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


(defn access-key-builder
  "The access-key-builder function buildes out new instances of 
AccessKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | software.amazon.awscdk.services.iam.AccessKeyStatus | [[cdk.api.services.iam/access-key-status]] | `:status` |
| `user` | software.amazon.awscdk.services.iam.IUser | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (AccessKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :serial)]
      (. builder serial data))
    (when-let [data (access-key-status config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn access-key-props-builder
  "The access-key-props-builder function buildes out new instances of 
AccessKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | software.amazon.awscdk.services.iam.AccessKeyStatus | [[cdk.api.services.iam/access-key-status]] | `:status` |
| `user` | software.amazon.awscdk.services.iam.IUser | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (AccessKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :serial)]
      (. builder serial data))
    (when-let [data (access-key-status config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn add-to-principal-policy-result-builder
  "The add-to-principal-policy-result-builder function buildes out new instances of 
AddToPrincipalPolicyResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDependable` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:policy-dependable` |
| `statementAdded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:statement-added` |"
  [stack id config]
  (let [builder (AddToPrincipalPolicyResult$Builder.)]
    (when-let [data (lookup-entry config id :policy-dependable)]
      (. builder policyDependable data))
    (when-let [data (lookup-entry config id :statement-added)]
      (. builder statementAdded data))
    (.build builder)))


(defn add-to-resource-policy-result-builder
  "The add-to-resource-policy-result-builder function buildes out new instances of 
AddToResourcePolicyResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDependable` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:policy-dependable` |
| `statementAdded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:statement-added` |"
  [stack id config]
  (let [builder (AddToResourcePolicyResult$Builder.)]
    (when-let [data (lookup-entry config id :policy-dependable)]
      (. builder policyDependable data))
    (when-let [data (lookup-entry config id :statement-added)]
      (. builder statementAdded data))
    (.build builder)))


(defn cfn-access-key-builder
  "The cfn-access-key-builder function buildes out new instances of 
CfnAccessKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnAccessKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :serial)]
      (. builder serial data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-access-key-props-builder
  "The cfn-access-key-props-builder function buildes out new instances of 
CfnAccessKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serial` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serial` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnAccessKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :serial)]
      (. builder serial data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-group-builder
  "The cfn-group-builder function buildes out new instances of 
CfnGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |"
  [stack id config]
  (let [builder (CfnGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (.build builder)))


(defn cfn-group-policy-builder
  "The cfn-group-policy-builder function buildes out new instances of 
CfnGroupPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnGroupPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-group-policy-property-builder
  "The cfn-group-policy-property-builder function buildes out new instances of 
CfnGroup$PolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnGroup$PolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-group-policy-props-builder
  "The cfn-group-policy-props-builder function buildes out new instances of 
CfnGroupPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnGroupPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-group-props-builder
  "The cfn-group-props-builder function buildes out new instances of 
CfnGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |"
  [stack id config]
  (let [builder (CfnGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (.build builder)))


(defn cfn-instance-profile-builder
  "The cfn-instance-profile-builder function buildes out new instances of 
CfnInstanceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |"
  [stack id config]
  (let [builder (CfnInstanceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (.build builder)))


(defn cfn-instance-profile-props-builder
  "The cfn-instance-profile-props-builder function buildes out new instances of 
CfnInstanceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |"
  [stack id config]
  (let [builder (CfnInstanceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (.build builder)))


(defn cfn-managed-policy-builder
  "The cfn-managed-policy-builder function buildes out new instances of 
CfnManagedPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnManagedPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-managed-policy-props-builder
  "The cfn-managed-policy-props-builder function buildes out new instances of 
CfnManagedPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnManagedPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-oidc-provider-builder
  "The cfn-oidc-provider-builder function buildes out new instances of 
CfnOIDCProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:client-id-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbprintList` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprint-list` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOIDCProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-id-list)]
      (. builder clientIdList data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thumbprint-list)]
      (. builder thumbprintList data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-oidc-provider-props-builder
  "The cfn-oidc-provider-props-builder function buildes out new instances of 
CfnOIDCProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIdList` | java.util.List | [[cdk.support/lookup-entry]] | `:client-id-list` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thumbprintList` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprint-list` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnOIDCProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :client-id-list)]
      (. builder clientIdList data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thumbprint-list)]
      (. builder thumbprintList data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-policy-builder
  "The cfn-policy-builder function buildes out new instances of 
CfnPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-policy-props-builder
  "The cfn-policy-props-builder function buildes out new instances of 
CfnPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-role-builder
  "The cfn-role-builder function buildes out new instances of 
CfnRole$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRole$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assume-role-policy-document)]
      (. builder assumeRolePolicyDocument data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-role-policy-builder
  "The cfn-role-policy-builder function buildes out new instances of 
CfnRolePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (CfnRolePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn cfn-role-policy-property-builder
  "The cfn-role-policy-property-builder function buildes out new instances of 
CfnRole$PolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnRole$PolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-role-policy-props-builder
  "The cfn-role-policy-props-builder function buildes out new instances of 
CfnRolePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (CfnRolePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn cfn-role-props-builder
  "The cfn-role-props-builder function buildes out new instances of 
CfnRoleProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoleProps$Builder.)]
    (when-let [data (lookup-entry config id :assume-role-policy-document)]
      (. builder assumeRolePolicyDocument data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-saml-provider-builder
  "The cfn-saml-provider-builder function buildes out new instances of 
CfnSAMLProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlMetadataDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSAMLProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :saml-metadata-document)]
      (. builder samlMetadataDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-saml-provider-props-builder
  "The cfn-saml-provider-props-builder function buildes out new instances of 
CfnSAMLProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlMetadataDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-metadata-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSAMLProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :saml-metadata-document)]
      (. builder samlMetadataDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-server-certificate-builder
  "The cfn-server-certificate-builder function buildes out new instances of 
CfnServerCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-body` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `serverCertificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServerCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-body)]
      (. builder certificateBody data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :server-certificate-name)]
      (. builder serverCertificateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-server-certificate-props-builder
  "The cfn-server-certificate-props-builder function buildes out new instances of 
CfnServerCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-body` |
| `certificateChain` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-chain` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `serverCertificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServerCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-body)]
      (. builder certificateBody data))
    (when-let [data (lookup-entry config id :certificate-chain)]
      (. builder certificateChain data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :server-certificate-name)]
      (. builder serverCertificateName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-linked-role-builder
  "The cfn-service-linked-role-builder function buildes out new instances of 
CfnServiceLinkedRole$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service-name` |
| `customSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-suffix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnServiceLinkedRole$Builder/create stack id)]
    (when-let [data (lookup-entry config id :aws-service-name)]
      (. builder awsServiceName data))
    (when-let [data (lookup-entry config id :custom-suffix)]
      (. builder customSuffix data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-service-linked-role-props-builder
  "The cfn-service-linked-role-props-builder function buildes out new instances of 
CfnServiceLinkedRoleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service-name` |
| `customSuffix` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-suffix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnServiceLinkedRoleProps$Builder.)]
    (when-let [data (lookup-entry config id :aws-service-name)]
      (. builder awsServiceName data))
    (when-let [data (lookup-entry config id :custom-suffix)]
      (. builder customSuffix data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-user-builder
  "The cfn-user-builder function buildes out new instances of 
CfnUser$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `loginProfile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:login-profile` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUser$Builder/create stack id)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :login-profile)]
      (. builder loginProfile data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-login-profile-property-builder
  "The cfn-user-login-profile-property-builder function buildes out new instances of 
CfnUser$LoginProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |"
  [stack id config]
  (let [builder (CfnUser$LoginProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :password-reset-required)]
      (. builder passwordResetRequired data))
    (.build builder)))


(defn cfn-user-policy-builder
  "The cfn-user-policy-builder function buildes out new instances of 
CfnUserPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-policy-property-builder
  "The cfn-user-policy-property-builder function buildes out new instances of 
CfnUser$PolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnUser$PolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-user-policy-props-builder
  "The cfn-user-policy-props-builder function buildes out new instances of 
CfnUserPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-props-builder
  "The cfn-user-props-builder function buildes out new instances of 
CfnUserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `loginProfile` | software.amazon.awscdk.services.iam.CfnUser$LoginProfileProperty | [[cdk.support/lookup-entry]] | `:login-profile` |
| `managedPolicyArns` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policy-arns` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | java.lang.String | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserProps$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :login-profile)]
      (. builder loginProfile data))
    (when-let [data (lookup-entry config id :managed-policy-arns)]
      (. builder managedPolicyArns data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-to-group-addition-builder
  "The cfn-user-to-group-addition-builder function buildes out new instances of 
CfnUserToGroupAddition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnUserToGroupAddition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-user-to-group-addition-props-builder
  "The cfn-user-to-group-addition-props-builder function buildes out new instances of 
CfnUserToGroupAdditionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnUserToGroupAdditionProps$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-virtual-mfa-device-builder
  "The cfn-virtual-mfa-device-builder function buildes out new instances of 
CfnVirtualMFADevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
| `virtualMfaDeviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-mfa-device-name` |"
  [stack id config]
  (let [builder (CfnVirtualMFADevice$Builder/create stack id)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (when-let [data (lookup-entry config id :virtual-mfa-device-name)]
      (. builder virtualMfaDeviceName data))
    (.build builder)))


(defn cfn-virtual-mfa-device-props-builder
  "The cfn-virtual-mfa-device-props-builder function buildes out new instances of 
CfnVirtualMFADeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
| `virtualMfaDeviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-mfa-device-name` |"
  [stack id config]
  (let [builder (CfnVirtualMFADeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (when-let [data (lookup-entry config id :virtual-mfa-device-name)]
      (. builder virtualMfaDeviceName data))
    (.build builder)))


(defn common-grant-options-builder
  "The common-grant-options-builder function buildes out new instances of 
CommonGrantOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |"
  [stack id config]
  (let [builder (CommonGrantOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :grantee)]
      (. builder grantee data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (.build builder)))


(defn customize-roles-options-builder
  "The customize-roles-options-builder function buildes out new instances of 
CustomizeRolesOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preventSynthesis` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:prevent-synthesis` |
| `usePrecreatedRoles` | java.util.Map | [[cdk.support/lookup-entry]] | `:use-precreated-roles` |"
  [stack id config]
  (let [builder (CustomizeRolesOptions$Builder.)]
    (when-let [data (lookup-entry config id :prevent-synthesis)]
      (. builder preventSynthesis data))
    (when-let [data (lookup-entry config id :use-precreated-roles)]
      (. builder usePrecreatedRoles data))
    (.build builder)))


(defn from-role-arn-options-builder
  "The from-role-arn-options-builder function buildes out new instances of 
FromRoleArnOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |
| `defaultPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy-name` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |"
  [stack id config]
  (let [builder (FromRoleArnOptions$Builder.)]
    (when-let [data (lookup-entry config id :add-grants-to-resources)]
      (. builder addGrantsToResources data))
    (when-let [data (lookup-entry config id :default-policy-name)]
      (. builder defaultPolicyName data))
    (when-let [data (lookup-entry config id :mutable)]
      (. builder mutable data))
    (.build builder)))


(defn from-role-name-options-builder
  "The from-role-name-options-builder function buildes out new instances of 
FromRoleNameOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |
| `defaultPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy-name` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |"
  [stack id config]
  (let [builder (FromRoleNameOptions$Builder.)]
    (when-let [data (lookup-entry config id :add-grants-to-resources)]
      (. builder addGrantsToResources data))
    (when-let [data (lookup-entry config id :default-policy-name)]
      (. builder defaultPolicyName data))
    (when-let [data (lookup-entry config id :mutable)]
      (. builder mutable data))
    (.build builder)))


(defn grant-on-principal-and-resource-options-builder
  "The grant-on-principal-and-resource-options-builder function buildes out new instances of 
GrantOnPrincipalAndResourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resource` | software.amazon.awscdk.services.iam.IResourceWithPolicy | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `resourcePolicyPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:resource-policy-principal` |
| `resourceSelfArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-self-arns` |"
  [stack id config]
  (let [builder (GrantOnPrincipalAndResourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :grantee)]
      (. builder grantee data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (when-let [data (lookup-entry config id :resource-policy-principal)]
      (. builder resourcePolicyPrincipal data))
    (when-let [data (lookup-entry config id :resource-self-arns)]
      (. builder resourceSelfArns data))
    (.build builder)))


(defn grant-on-principal-options-builder
  "The grant-on-principal-options-builder function buildes out new instances of 
GrantOnPrincipalOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `scope` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (GrantOnPrincipalOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :grantee)]
      (. builder grantee data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn grant-with-resource-options-builder
  "The grant-with-resource-options-builder function buildes out new instances of 
GrantWithResourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `grantee` | software.amazon.awscdk.services.iam.IGrantable | [[cdk.support/lookup-entry]] | `:grantee` |
| `resource` | software.amazon.awscdk.services.iam.IResourceWithPolicy | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `resourceSelfArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-self-arns` |"
  [stack id config]
  (let [builder (GrantWithResourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :grantee)]
      (. builder grantee data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (when-let [data (lookup-entry config id :resource-self-arns)]
      (. builder resourceSelfArns data))
    (.build builder)))


(defn group-builder
  "The group-builder function buildes out new instances of 
Group$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (Group$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn group-props-builder
  "The group-props-builder function buildes out new instances of 
GroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (GroupProps$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn instance-profile-attributes-builder
  "The instance-profile-attributes-builder function buildes out new instances of 
InstanceProfileAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (InstanceProfileAttributes$Builder.)]
    (when-let [data (lookup-entry config id :instance-profile-arn)]
      (. builder instanceProfileArn data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn instance-profile-builder
  "The instance-profile-builder function buildes out new instances of 
InstanceProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (InstanceProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn instance-profile-props-builder
  "The instance-profile-props-builder function buildes out new instances of 
InstanceProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (InstanceProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-profile-name)]
      (. builder instanceProfileName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn lazy-role-builder
  "The lazy-role-builder function buildes out new instances of 
LazyRole$Builder using the provided configuration.  Each field is set as follows:

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
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (LazyRole$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assumed-by)]
      (. builder assumedBy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :external-ids)]
      (. builder externalIds data))
    (when-let [data (lookup-entry config id :inline-policies)]
      (. builder inlinePolicies data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn lazy-role-props-builder
  "The lazy-role-props-builder function buildes out new instances of 
LazyRoleProps$Builder using the provided configuration.  Each field is set as follows:

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
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (LazyRoleProps$Builder.)]
    (when-let [data (lookup-entry config id :assumed-by)]
      (. builder assumedBy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :external-ids)]
      (. builder externalIds data))
    (when-let [data (lookup-entry config id :inline-policies)]
      (. builder inlinePolicies data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn managed-policy-builder
  "The managed-policy-builder function buildes out new instances of 
ManagedPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (ManagedPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :document)]
      (. builder document data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn managed-policy-props-builder
  "The managed-policy-props-builder function buildes out new instances of 
ManagedPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (ManagedPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :document)]
      (. builder document data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policy-name)]
      (. builder managedPolicyName data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn open-id-connect-provider-builder
  "The open-id-connect-provider-builder function buildes out new instances of 
OpenIdConnectProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `thumbprints` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprints` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (OpenIdConnectProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-ids)]
      (. builder clientIds data))
    (when-let [data (lookup-entry config id :thumbprints)]
      (. builder thumbprints data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn open-id-connect-provider-props-builder
  "The open-id-connect-provider-props-builder function buildes out new instances of 
OpenIdConnectProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `thumbprints` | java.util.List | [[cdk.support/lookup-entry]] | `:thumbprints` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (OpenIdConnectProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :client-ids)]
      (. builder clientIds data))
    (when-let [data (lookup-entry config id :thumbprints)]
      (. builder thumbprints data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn policy-builder
  "The policy-builder function buildes out new instances of 
Policy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (Policy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :document)]
      (. builder document data))
    (when-let [data (lookup-entry config id :force)]
      (. builder force data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn policy-document-builder
  "The policy-document-builder function buildes out new instances of 
PolicyDocument$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignSids` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-sids` |
| `minimize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:minimize` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (PolicyDocument$Builder/create)]
    (when-let [data (lookup-entry config id :assign-sids)]
      (. builder assignSids data))
    (when-let [data (lookup-entry config id :minimize)]
      (. builder minimize data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn policy-document-props-builder
  "The policy-document-props-builder function buildes out new instances of 
PolicyDocumentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignSids` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-sids` |
| `minimize` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:minimize` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (PolicyDocumentProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-sids)]
      (. builder assignSids data))
    (when-let [data (lookup-entry config id :minimize)]
      (. builder minimize data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn policy-props-builder
  "The policy-props-builder function buildes out new instances of 
PolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `document` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:document` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (PolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :document)]
      (. builder document data))
    (when-let [data (lookup-entry config id :force)]
      (. builder force data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn policy-statement-builder
  "The policy-statement-builder function buildes out new instances of 
PolicyStatement$Builder using the provided configuration.  Each field is set as follows:

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
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |"
  [stack id config]
  (let [builder (PolicyStatement$Builder/create)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (effect config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :not-actions)]
      (. builder notActions data))
    (when-let [data (lookup-entry config id :not-principals)]
      (. builder notPrincipals data))
    (when-let [data (lookup-entry config id :not-resources)]
      (. builder notResources data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :sid)]
      (. builder sid data))
    (.build builder)))


(defn policy-statement-props-builder
  "The policy-statement-props-builder function buildes out new instances of 
PolicyStatementProps$Builder using the provided configuration.  Each field is set as follows:

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
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |"
  [stack id config]
  (let [builder (PolicyStatementProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (effect config id :effect)]
      (. builder effect data))
    (when-let [data (lookup-entry config id :not-actions)]
      (. builder notActions data))
    (when-let [data (lookup-entry config id :not-principals)]
      (. builder notPrincipals data))
    (when-let [data (lookup-entry config id :not-resources)]
      (. builder notResources data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :sid)]
      (. builder sid data))
    (.build builder)))


(defn role-builder
  "The role-builder function buildes out new instances of 
Role$Builder using the provided configuration.  Each field is set as follows:

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
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (Role$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assumed-by)]
      (. builder assumedBy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :external-ids)]
      (. builder externalIds data))
    (when-let [data (lookup-entry config id :inline-policies)]
      (. builder inlinePolicies data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn role-props-builder
  "The role-props-builder function buildes out new instances of 
RoleProps$Builder using the provided configuration.  Each field is set as follows:

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
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |"
  [stack id config]
  (let [builder (RoleProps$Builder.)]
    (when-let [data (lookup-entry config id :assumed-by)]
      (. builder assumedBy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :external-ids)]
      (. builder externalIds data))
    (when-let [data (lookup-entry config id :inline-policies)]
      (. builder inlinePolicies data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :max-session-duration)]
      (. builder maxSessionDuration data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (.build builder)))


(defn saml-provider-builder
  "The saml-provider-builder function buildes out new instances of 
SamlProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataDocument` | software.amazon.awscdk.services.iam.SamlMetadataDocument | [[cdk.support/lookup-entry]] | `:metadata-document` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (SamlProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :metadata-document)]
      (. builder metadataDocument data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn saml-provider-props-builder
  "The saml-provider-props-builder function buildes out new instances of 
SamlProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metadataDocument` | software.amazon.awscdk.services.iam.SamlMetadataDocument | [[cdk.support/lookup-entry]] | `:metadata-document` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (SamlProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :metadata-document)]
      (. builder metadataDocument data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn service-principal-builder
  "The service-principal-builder function buildes out new instances of 
ServicePrincipal$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config ^java.lang.String service]
  (let [builder (ServicePrincipal$Builder/create ^java.lang.String service)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn service-principal-opts-builder
  "The service-principal-opts-builder function buildes out new instances of 
ServicePrincipalOpts$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.util.Map | [[cdk.support/lookup-entry]] | `:conditions` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (ServicePrincipalOpts$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn unknown-principal-builder
  "The unknown-principal-builder function buildes out new instances of 
UnknownPrincipal$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (UnknownPrincipal$Builder/create)]
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn unknown-principal-props-builder
  "The unknown-principal-props-builder function buildes out new instances of 
UnknownPrincipalProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resource` | software.constructs.IConstruct | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (UnknownPrincipalProps$Builder.)]
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn user-attributes-builder
  "The user-attributes-builder function buildes out new instances of 
UserAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-arn` |"
  [stack id config]
  (let [builder (UserAttributes$Builder.)]
    (when-let [data (lookup-entry config id :user-arn)]
      (. builder userArn data))
    (.build builder)))


(defn user-builder
  "The user-builder function buildes out new instances of 
User$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (User$Builder/create stack id)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :password-reset-required)]
      (. builder passwordResetRequired data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn user-props-builder
  "The user-props-builder function buildes out new instances of 
UserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `passwordResetRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:password-reset-required` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `permissionsBoundary` | software.amazon.awscdk.services.iam.IManagedPolicy | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (UserProps$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :password-reset-required)]
      (. builder passwordResetRequired data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn without-policy-updates-options-builder
  "The without-policy-updates-options-builder function buildes out new instances of 
WithoutPolicyUpdatesOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addGrantsToResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-grants-to-resources` |"
  [stack id config]
  (let [builder (WithoutPolicyUpdatesOptions$Builder.)]
    (when-let [data (lookup-entry config id :add-grants-to-resources)]
      (. builder addGrantsToResources data))
    (.build builder)))