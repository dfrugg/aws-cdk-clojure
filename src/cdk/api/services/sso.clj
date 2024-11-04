(ns cdk.api.services.sso
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sso package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sso CfnApplication$Builder
                                                CfnApplication$PortalOptionsConfigurationProperty$Builder
                                                CfnApplication$SignInOptionsProperty$Builder
                                                CfnApplicationAssignment$Builder
                                                CfnApplicationAssignmentProps$Builder
                                                CfnApplicationProps$Builder
                                                CfnAssignment$Builder
                                                CfnAssignmentProps$Builder
                                                CfnInstance$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder
                                                CfnInstanceAccessControlAttributeConfigurationProps$Builder
                                                CfnInstanceProps$Builder
                                                CfnPermissionSet$Builder
                                                CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder
                                                CfnPermissionSet$PermissionsBoundaryProperty$Builder
                                                CfnPermissionSetProps$Builder]))


(defn cfn-application-assignment-builder
  "The cfn-application-assignment-builder function buildes out new instances of 
CfnApplicationAssignment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |"
  [stack id config]
  (let [builder (CfnApplicationAssignment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-arn)]
      (. builder applicationArn data))
    (when-let [data (lookup-entry config id :principal-id)]
      (. builder principalId data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (.build builder)))


(defn cfn-application-assignment-props-builder
  "The cfn-application-assignment-props-builder function buildes out new instances of 
CfnApplicationAssignmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |"
  [stack id config]
  (let [builder (CfnApplicationAssignmentProps$Builder.)]
    (when-let [data (lookup-entry config id :application-arn)]
      (. builder applicationArn data))
    (when-let [data (lookup-entry config id :principal-id)]
      (. builder principalId data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-provider-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portalOptions` | software.amazon.awscdk.services.sso.CfnApplication$PortalOptionsConfigurationProperty | [[cdk.support/lookup-entry]] | `:portal-options` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-provider-arn)]
      (. builder applicationProviderArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :portal-options)]
      (. builder portalOptions data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-portal-options-configuration-property-builder
  "The cfn-application-portal-options-configuration-property-builder function buildes out new instances of 
CfnApplication$PortalOptionsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signInOptions` | software.amazon.awscdk.services.sso.CfnApplication$SignInOptionsProperty | [[cdk.support/lookup-entry]] | `:sign-in-options` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |"
  [stack id config]
  (let [builder (CfnApplication$PortalOptionsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sign-in-options)]
      (. builder signInOptions data))
    (when-let [data (lookup-entry config id :visibility)]
      (. builder visibility data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-provider-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portalOptions` | software.amazon.awscdk.services.sso.CfnApplication$PortalOptionsConfigurationProperty | [[cdk.support/lookup-entry]] | `:portal-options` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-provider-arn)]
      (. builder applicationProviderArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :portal-options)]
      (. builder portalOptions data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-sign-in-options-property-builder
  "The cfn-application-sign-in-options-property-builder function buildes out new instances of 
CfnApplication$SignInOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-url` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |"
  [stack id config]
  (let [builder (CfnApplication$SignInOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-url)]
      (. builder applicationUrl data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (.build builder)))


(defn cfn-assignment-builder
  "The cfn-assignment-builder function buildes out new instances of 
CfnAssignment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissionSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-set-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnAssignment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :permission-set-arn)]
      (. builder permissionSetArn data))
    (when-let [data (lookup-entry config id :principal-id)]
      (. builder principalId data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn cfn-assignment-props-builder
  "The cfn-assignment-props-builder function buildes out new instances of 
CfnAssignmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissionSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-set-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnAssignmentProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :permission-set-arn)]
      (. builder permissionSetArn data))
    (when-let [data (lookup-entry config id :principal-id)]
      (. builder principalId data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder
  "The cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder function buildes out new instances of 
CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder
  "The cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder function buildes out new instances of 
CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.util.List | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-instance-access-control-attribute-configuration-builder
  "The cfn-instance-access-control-attribute-configuration-builder function buildes out new instances of 
CfnInstanceAccessControlAttributeConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-attributes` |
| `instanceAccessControlAttributeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-access-control-attribute-configuration` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |"
  [stack id config]
  (let [builder (CfnInstanceAccessControlAttributeConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-control-attributes)]
      (. builder accessControlAttributes data))
    (when-let [data (lookup-entry config id :instance-access-control-attribute-configuration)]
      (. builder instanceAccessControlAttributeConfiguration data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (.build builder)))


(defn cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder
  "The cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder function buildes out new instances of 
CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-attributes` |"
  [stack id config]
  (let [builder (CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-control-attributes)]
      (. builder accessControlAttributes data))
    (.build builder)))


(defn cfn-instance-access-control-attribute-configuration-props-builder
  "The cfn-instance-access-control-attribute-configuration-props-builder function buildes out new instances of 
CfnInstanceAccessControlAttributeConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-attributes` |
| `instanceAccessControlAttributeConfiguration` | software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-access-control-attribute-configuration` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |"
  [stack id config]
  (let [builder (CfnInstanceAccessControlAttributeConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :access-control-attributes)]
      (. builder accessControlAttributes data))
    (when-let [data (lookup-entry config id :instance-access-control-attribute-configuration)]
      (. builder instanceAccessControlAttributeConfiguration data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (.build builder)))


(defn cfn-instance-builder
  "The cfn-instance-builder function buildes out new instances of 
CfnInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-props-builder
  "The cfn-instance-props-builder function buildes out new instances of 
CfnInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-permission-set-builder
  "The cfn-permission-set-builder function buildes out new instances of 
CfnPermissionSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-managed-policy-references` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inlinePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-policy` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `relayStateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relay-state-type` |
| `sessionDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-duration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPermissionSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :customer-managed-policy-references)]
      (. builder customerManagedPolicyReferences data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :inline-policy)]
      (. builder inlinePolicy data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :relay-state-type)]
      (. builder relayStateType data))
    (when-let [data (lookup-entry config id :session-duration)]
      (. builder sessionDuration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-permission-set-customer-managed-policy-reference-property-builder
  "The cfn-permission-set-customer-managed-policy-reference-property-builder function buildes out new instances of 
CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-permission-set-permissions-boundary-property-builder
  "The cfn-permission-set-permissions-boundary-property-builder function buildes out new instances of 
CfnPermissionSet$PermissionsBoundaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-managed-policy-reference` |
| `managedPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-arn` |"
  [stack id config]
  (let [builder (CfnPermissionSet$PermissionsBoundaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-policy-reference)]
      (. builder customerManagedPolicyReference data))
    (when-let [data (lookup-entry config id :managed-policy-arn)]
      (. builder managedPolicyArn data))
    (.build builder)))


(defn cfn-permission-set-props-builder
  "The cfn-permission-set-props-builder function buildes out new instances of 
CfnPermissionSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReferences` | java.util.List | [[cdk.support/lookup-entry]] | `:customer-managed-policy-references` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inlinePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-policy` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `relayStateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relay-state-type` |
| `sessionDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-duration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPermissionSetProps$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-policy-references)]
      (. builder customerManagedPolicyReferences data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :inline-policy)]
      (. builder inlinePolicy data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :managed-policies)]
      (. builder managedPolicies data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permissions-boundary)]
      (. builder permissionsBoundary data))
    (when-let [data (lookup-entry config id :relay-state-type)]
      (. builder relayStateType data))
    (when-let [data (lookup-entry config id :session-duration)]
      (. builder sessionDuration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))