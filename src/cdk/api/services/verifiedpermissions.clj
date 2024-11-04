(ns cdk.api.services.verifiedpermissions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.verifiedpermissions package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.verifiedpermissions CfnIdentitySource$Builder
                                                                CfnIdentitySource$CognitoGroupConfigurationProperty$Builder
                                                                CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder
                                                                CfnIdentitySource$IdentitySourceConfigurationProperty$Builder
                                                                CfnIdentitySource$IdentitySourceDetailsProperty$Builder
                                                                CfnIdentitySourceProps$Builder
                                                                CfnPolicy$Builder
                                                                CfnPolicy$EntityIdentifierProperty$Builder
                                                                CfnPolicy$PolicyDefinitionProperty$Builder
                                                                CfnPolicy$StaticPolicyDefinitionProperty$Builder
                                                                CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder
                                                                CfnPolicyProps$Builder
                                                                CfnPolicyStore$Builder
                                                                CfnPolicyStore$SchemaDefinitionProperty$Builder
                                                                CfnPolicyStore$ValidationSettingsProperty$Builder
                                                                CfnPolicyStoreProps$Builder
                                                                CfnPolicyTemplate$Builder
                                                                CfnPolicyTemplateProps$Builder]))


(defn cfn-identity-source-builder
  "The cfn-identity-source-builder function buildes out new instances of 
CfnIdentitySource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$IdentitySourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `principalEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-entity-type` |"
  [stack id config]
  (let [builder (CfnIdentitySource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (when-let [data (lookup-entry config id :principal-entity-type)]
      (. builder principalEntityType data))
    (.build builder)))


(defn cfn-identity-source-cognito-group-configuration-property-builder
  "The cfn-identity-source-cognito-group-configuration-property-builder function buildes out new instances of 
CfnIdentitySource$CognitoGroupConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-entity-type` |"
  [stack id config]
  (let [builder (CfnIdentitySource$CognitoGroupConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-entity-type)]
      (. builder groupEntityType data))
    (.build builder)))


(defn cfn-identity-source-cognito-user-pool-configuration-property-builder
  "The cfn-identity-source-cognito-user-pool-configuration-property-builder function buildes out new instances of 
CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `groupConfiguration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$CognitoGroupConfigurationProperty | [[cdk.support/lookup-entry]] | `:group-configuration` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |"
  [stack id config]
  (let [builder (CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-ids)]
      (. builder clientIds data))
    (when-let [data (lookup-entry config id :group-configuration)]
      (. builder groupConfiguration data))
    (when-let [data (lookup-entry config id :user-pool-arn)]
      (. builder userPoolArn data))
    (.build builder)))


(defn cfn-identity-source-identity-source-configuration-property-builder
  "The cfn-identity-source-identity-source-configuration-property-builder function buildes out new instances of 
CfnIdentitySource$IdentitySourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoUserPoolConfiguration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$CognitoUserPoolConfigurationProperty | [[cdk.support/lookup-entry]] | `:cognito-user-pool-configuration` |"
  [stack id config]
  (let [builder (CfnIdentitySource$IdentitySourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cognito-user-pool-configuration)]
      (. builder cognitoUserPoolConfiguration data))
    (.build builder)))


(defn cfn-identity-source-identity-source-details-property-builder
  "The cfn-identity-source-identity-source-details-property-builder function buildes out new instances of 
CfnIdentitySource$IdentitySourceDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `discoveryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-url` |
| `openIdIssuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:open-id-issuer` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |"
  [stack id config]
  (let [builder (CfnIdentitySource$IdentitySourceDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-ids)]
      (. builder clientIds data))
    (when-let [data (lookup-entry config id :discovery-url)]
      (. builder discoveryUrl data))
    (when-let [data (lookup-entry config id :open-id-issuer)]
      (. builder openIdIssuer data))
    (when-let [data (lookup-entry config id :user-pool-arn)]
      (. builder userPoolArn data))
    (.build builder)))


(defn cfn-identity-source-props-builder
  "The cfn-identity-source-props-builder function buildes out new instances of 
CfnIdentitySourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$IdentitySourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `principalEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-entity-type` |"
  [stack id config]
  (let [builder (CfnIdentitySourceProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (when-let [data (lookup-entry config id :principal-entity-type)]
      (. builder principalEntityType data))
    (.build builder)))


(defn cfn-policy-builder
  "The cfn-policy-builder function buildes out new instances of 
CfnPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |"
  [stack id config]
  (let [builder (CfnPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (.build builder)))


(defn cfn-policy-entity-identifier-property-builder
  "The cfn-policy-entity-identifier-property-builder function buildes out new instances of 
CfnPolicy$EntityIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-type` |"
  [stack id config]
  (let [builder (CfnPolicy$EntityIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :entity-id)]
      (. builder entityId data))
    (when-let [data (lookup-entry config id :entity-type)]
      (. builder entityType data))
    (.build builder)))


(defn cfn-policy-policy-definition-property-builder
  "The cfn-policy-policy-definition-property-builder function buildes out new instances of 
CfnPolicy$PolicyDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `staticValue` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$StaticPolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:static-value` |
| `templateLinked` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$TemplateLinkedPolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:template-linked` |"
  [stack id config]
  (let [builder (CfnPolicy$PolicyDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :static-value)]
      (. builder staticValue data))
    (when-let [data (lookup-entry config id :template-linked)]
      (. builder templateLinked data))
    (.build builder)))


(defn cfn-policy-props-builder
  "The cfn-policy-props-builder function buildes out new instances of 
CfnPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$PolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:definition` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |"
  [stack id config]
  (let [builder (CfnPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (.build builder)))


(defn cfn-policy-static-policy-definition-property-builder
  "The cfn-policy-static-policy-definition-property-builder function buildes out new instances of 
CfnPolicy$StaticPolicyDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |"
  [stack id config]
  (let [builder (CfnPolicy$StaticPolicyDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (.build builder)))


(defn cfn-policy-store-builder
  "The cfn-policy-store-builder function buildes out new instances of 
CfnPolicyStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `schema` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `validationSettings` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$ValidationSettingsProperty | [[cdk.support/lookup-entry]] | `:validation-settings` |"
  [stack id config]
  (let [builder (CfnPolicyStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :validation-settings)]
      (. builder validationSettings data))
    (.build builder)))


(defn cfn-policy-store-props-builder
  "The cfn-policy-store-props-builder function buildes out new instances of 
CfnPolicyStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `schema` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `validationSettings` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$ValidationSettingsProperty | [[cdk.support/lookup-entry]] | `:validation-settings` |"
  [stack id config]
  (let [builder (CfnPolicyStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (lookup-entry config id :validation-settings)]
      (. builder validationSettings data))
    (.build builder)))


(defn cfn-policy-store-schema-definition-property-builder
  "The cfn-policy-store-schema-definition-property-builder function buildes out new instances of 
CfnPolicyStore$SchemaDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cedarJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:cedar-json` |"
  [stack id config]
  (let [builder (CfnPolicyStore$SchemaDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cedar-json)]
      (. builder cedarJson data))
    (.build builder)))


(defn cfn-policy-store-validation-settings-property-builder
  "The cfn-policy-store-validation-settings-property-builder function buildes out new instances of 
CfnPolicyStore$ValidationSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnPolicyStore$ValidationSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-policy-template-builder
  "The cfn-policy-template-builder function buildes out new instances of 
CfnPolicyTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |"
  [stack id config]
  (let [builder (CfnPolicyTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (.build builder)))


(defn cfn-policy-template-linked-policy-definition-property-builder
  "The cfn-policy-template-linked-policy-definition-property-builder function buildes out new instances of 
CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-template-id` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$EntityIdentifierProperty | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :policy-template-id)]
      (. builder policyTemplateId data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn cfn-policy-template-props-builder
  "The cfn-policy-template-props-builder function buildes out new instances of 
CfnPolicyTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |"
  [stack id config]
  (let [builder (CfnPolicyTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :policy-store-id)]
      (. builder policyStoreId data))
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (.build builder)))