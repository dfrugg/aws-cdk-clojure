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


(defn cfn-identity-source-builder>
  "The cfn-identity-source-builder> function updates a CfnIdentitySource$Builder instance using the provided configuration.
  The function takes the CfnIdentitySource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$IdentitySourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `principalEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-entity-type` |
"
  [^CfnIdentitySource$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (when-some [data (lookup-entry config id :principal-entity-type)]
    (. builder principalEntityType data))
  (.build builder))


(defn cfn-identity-source-builder
  "Creates a  `CfnIdentitySource$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-identity-source-builder> (CfnIdentitySource$Builder/create scope (name id)) id config))


(defn cfn-identity-source-cognito-group-configuration-property-builder>
  "The cfn-identity-source-cognito-group-configuration-property-builder> function updates a CfnIdentitySource$CognitoGroupConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentitySource$CognitoGroupConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-entity-type` |
"
  [^CfnIdentitySource$CognitoGroupConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-entity-type)]
    (. builder groupEntityType data))
  (.build builder))


(defn cfn-identity-source-cognito-group-configuration-property-builder
  "Creates a  `CfnIdentitySource$CognitoGroupConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-source-cognito-group-configuration-property-builder> (new CfnIdentitySource$CognitoGroupConfigurationProperty$Builder) id config))


(defn cfn-identity-source-cognito-user-pool-configuration-property-builder>
  "The cfn-identity-source-cognito-user-pool-configuration-property-builder> function updates a CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `groupConfiguration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$CognitoGroupConfigurationProperty | [[cdk.support/lookup-entry]] | `:group-configuration` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
"
  [^CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-ids)]
    (. builder clientIds data))
  (when-some [data (lookup-entry config id :group-configuration)]
    (. builder groupConfiguration data))
  (when-some [data (lookup-entry config id :user-pool-arn)]
    (. builder userPoolArn data))
  (.build builder))


(defn cfn-identity-source-cognito-user-pool-configuration-property-builder
  "Creates a  `CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-source-cognito-user-pool-configuration-property-builder> (new CfnIdentitySource$CognitoUserPoolConfigurationProperty$Builder) id config))


(defn cfn-identity-source-identity-source-configuration-property-builder>
  "The cfn-identity-source-identity-source-configuration-property-builder> function updates a CfnIdentitySource$IdentitySourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentitySource$IdentitySourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cognitoUserPoolConfiguration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$CognitoUserPoolConfigurationProperty | [[cdk.support/lookup-entry]] | `:cognito-user-pool-configuration` |
"
  [^CfnIdentitySource$IdentitySourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cognito-user-pool-configuration)]
    (. builder cognitoUserPoolConfiguration data))
  (.build builder))


(defn cfn-identity-source-identity-source-configuration-property-builder
  "Creates a  `CfnIdentitySource$IdentitySourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-source-identity-source-configuration-property-builder> (new CfnIdentitySource$IdentitySourceConfigurationProperty$Builder) id config))


(defn cfn-identity-source-identity-source-details-property-builder>
  "The cfn-identity-source-identity-source-details-property-builder> function updates a CfnIdentitySource$IdentitySourceDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnIdentitySource$IdentitySourceDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientIds` | java.util.List | [[cdk.support/lookup-entry]] | `:client-ids` |
| `discoveryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:discovery-url` |
| `openIdIssuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:open-id-issuer` |
| `userPoolArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-arn` |
"
  [^CfnIdentitySource$IdentitySourceDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-ids)]
    (. builder clientIds data))
  (when-some [data (lookup-entry config id :discovery-url)]
    (. builder discoveryUrl data))
  (when-some [data (lookup-entry config id :open-id-issuer)]
    (. builder openIdIssuer data))
  (when-some [data (lookup-entry config id :user-pool-arn)]
    (. builder userPoolArn data))
  (.build builder))


(defn cfn-identity-source-identity-source-details-property-builder
  "Creates a  `CfnIdentitySource$IdentitySourceDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-source-identity-source-details-property-builder> (new CfnIdentitySource$IdentitySourceDetailsProperty$Builder) id config))


(defn cfn-identity-source-props-builder>
  "The cfn-identity-source-props-builder> function updates a CfnIdentitySourceProps$Builder instance using the provided configuration.
  The function takes the CfnIdentitySourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource$IdentitySourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `principalEntityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-entity-type` |
"
  [^CfnIdentitySourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (when-some [data (lookup-entry config id :principal-entity-type)]
    (. builder principalEntityType data))
  (.build builder))


(defn cfn-identity-source-props-builder
  "Creates a  `CfnIdentitySourceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-identity-source-props-builder> (new CfnIdentitySourceProps$Builder) id config))


(defn cfn-policy-builder>
  "The cfn-policy-builder> function updates a CfnPolicy$Builder instance using the provided configuration.
  The function takes the CfnPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
"
  [^CfnPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (.build builder))


(defn cfn-policy-builder
  "Creates a  `CfnPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-builder> (CfnPolicy$Builder/create scope (name id)) id config))


(defn cfn-policy-entity-identifier-property-builder>
  "The cfn-policy-entity-identifier-property-builder> function updates a CfnPolicy$EntityIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$EntityIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-type` |
"
  [^CfnPolicy$EntityIdentifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :entity-id)]
    (. builder entityId data))
  (when-some [data (lookup-entry config id :entity-type)]
    (. builder entityType data))
  (.build builder))


(defn cfn-policy-entity-identifier-property-builder
  "Creates a  `CfnPolicy$EntityIdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-entity-identifier-property-builder> (new CfnPolicy$EntityIdentifierProperty$Builder) id config))


(defn cfn-policy-policy-definition-property-builder>
  "The cfn-policy-policy-definition-property-builder> function updates a CfnPolicy$PolicyDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$PolicyDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `staticValue` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$StaticPolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:static-value` |
| `templateLinked` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$TemplateLinkedPolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:template-linked` |
"
  [^CfnPolicy$PolicyDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :static-value)]
    (. builder staticValue data))
  (when-some [data (lookup-entry config id :template-linked)]
    (. builder templateLinked data))
  (.build builder))


(defn cfn-policy-policy-definition-property-builder
  "Creates a  `CfnPolicy$PolicyDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-policy-definition-property-builder> (new CfnPolicy$PolicyDefinitionProperty$Builder) id config))


(defn cfn-policy-props-builder>
  "The cfn-policy-props-builder> function updates a CfnPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$PolicyDefinitionProperty | [[cdk.support/lookup-entry]] | `:definition` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
"
  [^CfnPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (.build builder))


(defn cfn-policy-props-builder
  "Creates a  `CfnPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-props-builder> (new CfnPolicyProps$Builder) id config))


(defn cfn-policy-static-policy-definition-property-builder>
  "The cfn-policy-static-policy-definition-property-builder> function updates a CfnPolicy$StaticPolicyDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$StaticPolicyDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |
"
  [^CfnPolicy$StaticPolicyDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :statement)]
    (. builder statement data))
  (.build builder))


(defn cfn-policy-static-policy-definition-property-builder
  "Creates a  `CfnPolicy$StaticPolicyDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-static-policy-definition-property-builder> (new CfnPolicy$StaticPolicyDefinitionProperty$Builder) id config))


(defn cfn-policy-store-builder>
  "The cfn-policy-store-builder> function updates a CfnPolicyStore$Builder instance using the provided configuration.
  The function takes the CfnPolicyStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `schema` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `validationSettings` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$ValidationSettingsProperty | [[cdk.support/lookup-entry]] | `:validation-settings` |
"
  [^CfnPolicyStore$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :validation-settings)]
    (. builder validationSettings data))
  (.build builder))


(defn cfn-policy-store-builder
  "Creates a  `CfnPolicyStore$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-store-builder> (CfnPolicyStore$Builder/create scope (name id)) id config))


(defn cfn-policy-store-props-builder>
  "The cfn-policy-store-props-builder> function updates a CfnPolicyStoreProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `schema` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$SchemaDefinitionProperty | [[cdk.support/lookup-entry]] | `:schema` |
| `validationSettings` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore$ValidationSettingsProperty | [[cdk.support/lookup-entry]] | `:validation-settings` |
"
  [^CfnPolicyStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :schema)]
    (. builder schema data))
  (when-some [data (lookup-entry config id :validation-settings)]
    (. builder validationSettings data))
  (.build builder))


(defn cfn-policy-store-props-builder
  "Creates a  `CfnPolicyStoreProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-store-props-builder> (new CfnPolicyStoreProps$Builder) id config))


(defn cfn-policy-store-schema-definition-property-builder>
  "The cfn-policy-store-schema-definition-property-builder> function updates a CfnPolicyStore$SchemaDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicyStore$SchemaDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cedarJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:cedar-json` |
"
  [^CfnPolicyStore$SchemaDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cedar-json)]
    (. builder cedarJson data))
  (.build builder))


(defn cfn-policy-store-schema-definition-property-builder
  "Creates a  `CfnPolicyStore$SchemaDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-store-schema-definition-property-builder> (new CfnPolicyStore$SchemaDefinitionProperty$Builder) id config))


(defn cfn-policy-store-validation-settings-property-builder>
  "The cfn-policy-store-validation-settings-property-builder> function updates a CfnPolicyStore$ValidationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicyStore$ValidationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnPolicyStore$ValidationSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-policy-store-validation-settings-property-builder
  "Creates a  `CfnPolicyStore$ValidationSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-store-validation-settings-property-builder> (new CfnPolicyStore$ValidationSettingsProperty$Builder) id config))


(defn cfn-policy-template-builder>
  "The cfn-policy-template-builder> function updates a CfnPolicyTemplate$Builder instance using the provided configuration.
  The function takes the CfnPolicyTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |
"
  [^CfnPolicyTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (when-some [data (lookup-entry config id :statement)]
    (. builder statement data))
  (.build builder))


(defn cfn-policy-template-builder
  "Creates a  `CfnPolicyTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-template-builder> (CfnPolicyTemplate$Builder/create scope (name id)) id config))


(defn cfn-policy-template-linked-policy-definition-property-builder>
  "The cfn-policy-template-linked-policy-definition-property-builder> function updates a CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-template-id` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.verifiedpermissions.CfnPolicy$EntityIdentifierProperty | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-template-id)]
    (. builder policyTemplateId data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn cfn-policy-template-linked-policy-definition-property-builder
  "Creates a  `CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-template-linked-policy-definition-property-builder> (new CfnPolicy$TemplateLinkedPolicyDefinitionProperty$Builder) id config))


(defn cfn-policy-template-props-builder>
  "The cfn-policy-template-props-builder> function updates a CfnPolicyTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyStoreId` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-store-id` |
| `statement` | java.lang.String | [[cdk.support/lookup-entry]] | `:statement` |
"
  [^CfnPolicyTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :policy-store-id)]
    (. builder policyStoreId data))
  (when-some [data (lookup-entry config id :statement)]
    (. builder statement data))
  (.build builder))


(defn cfn-policy-template-props-builder
  "Creates a  `CfnPolicyTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-template-props-builder> (new CfnPolicyTemplateProps$Builder) id config))