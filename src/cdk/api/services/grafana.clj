(ns cdk.api.services.grafana
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.grafana package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.grafana CfnWorkspace$AssertionAttributesProperty$Builder
                                                    CfnWorkspace$Builder
                                                    CfnWorkspace$IdpMetadataProperty$Builder
                                                    CfnWorkspace$NetworkAccessControlProperty$Builder
                                                    CfnWorkspace$RoleValuesProperty$Builder
                                                    CfnWorkspace$SamlConfigurationProperty$Builder
                                                    CfnWorkspace$VpcConfigurationProperty$Builder
                                                    CfnWorkspaceProps$Builder]))


(defn build-cfn-workspace-assertion-attributes-property-builder
  "The build-cfn-workspace-assertion-attributes-property-builder function updates a CfnWorkspace$AssertionAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$AssertionAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `groups` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups` |
| `login` | java.lang.String | [[cdk.support/lookup-entry]] | `:login` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `org` | java.lang.String | [[cdk.support/lookup-entry]] | `:org` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
"
  [^CfnWorkspace$AssertionAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :login)]
    (. builder login data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :org)]
    (. builder org data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn cfn-workspace-assertion-attributes-property-builder
  "Creates a  `CfnWorkspace$AssertionAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-assertion-attributes-property-builder (new CfnWorkspace$AssertionAttributesProperty$Builder) id config))


(defn build-cfn-workspace-builder
  "The build-cfn-workspace-builder function updates a CfnWorkspace$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAccessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-access-type` |
| `authenticationProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:authentication-providers` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `dataSources` | java.util.List | [[cdk.support/lookup-entry]] | `:data-sources` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `grafanaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:grafana-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkAccessControl` | software.amazon.awscdk.services.grafana.CfnWorkspace$NetworkAccessControlProperty | [[cdk.support/lookup-entry]] | `:network-access-control` |
| `notificationDestinations` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-destinations` |
| `organizationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-role-name` |
| `organizationalUnits` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-units` |
| `permissionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-type` |
| `pluginAdminEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:plugin-admin-enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samlConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:saml-configuration` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `vpcConfiguration` | software.amazon.awscdk.services.grafana.CfnWorkspace$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnWorkspace$Builder builder id config]
  (when-some [data (lookup-entry config id :account-access-type)]
    (. builder accountAccessType data))
  (when-some [data (lookup-entry config id :authentication-providers)]
    (. builder authenticationProviders data))
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :grafana-version)]
    (. builder grafanaVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-access-control)]
    (. builder networkAccessControl data))
  (when-some [data (lookup-entry config id :notification-destinations)]
    (. builder notificationDestinations data))
  (when-some [data (lookup-entry config id :organization-role-name)]
    (. builder organizationRoleName data))
  (when-some [data (lookup-entry config id :organizational-units)]
    (. builder organizationalUnits data))
  (when-some [data (lookup-entry config id :permission-type)]
    (. builder permissionType data))
  (when-some [data (lookup-entry config id :plugin-admin-enabled)]
    (. builder pluginAdminEnabled data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :saml-configuration)]
    (. builder samlConfiguration data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-workspace-builder
  "Creates a  `CfnWorkspace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-workspace-builder (CfnWorkspace$Builder/create scope (name id)) id config))


(defn build-cfn-workspace-idp-metadata-property-builder
  "The build-cfn-workspace-idp-metadata-property-builder function updates a CfnWorkspace$IdpMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$IdpMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `xml` | java.lang.String | [[cdk.support/lookup-entry]] | `:xml` |
"
  [^CfnWorkspace$IdpMetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (when-some [data (lookup-entry config id :xml)]
    (. builder xml data))
  (.build builder))


(defn cfn-workspace-idp-metadata-property-builder
  "Creates a  `CfnWorkspace$IdpMetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-idp-metadata-property-builder (new CfnWorkspace$IdpMetadataProperty$Builder) id config))


(defn build-cfn-workspace-network-access-control-property-builder
  "The build-cfn-workspace-network-access-control-property-builder function updates a CfnWorkspace$NetworkAccessControlProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$NetworkAccessControlProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixListIds` | java.util.List | [[cdk.support/lookup-entry]] | `:prefix-list-ids` |
| `vpceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpce-ids` |
"
  [^CfnWorkspace$NetworkAccessControlProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :prefix-list-ids)]
    (. builder prefixListIds data))
  (when-some [data (lookup-entry config id :vpce-ids)]
    (. builder vpceIds data))
  (.build builder))


(defn cfn-workspace-network-access-control-property-builder
  "Creates a  `CfnWorkspace$NetworkAccessControlProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-network-access-control-property-builder (new CfnWorkspace$NetworkAccessControlProperty$Builder) id config))


(defn build-cfn-workspace-props-builder
  "The build-cfn-workspace-props-builder function updates a CfnWorkspaceProps$Builder instance using the provided configuration.
  The function takes the CfnWorkspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountAccessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-access-type` |
| `authenticationProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:authentication-providers` |
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `dataSources` | java.util.List | [[cdk.support/lookup-entry]] | `:data-sources` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `grafanaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:grafana-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkAccessControl` | software.amazon.awscdk.services.grafana.CfnWorkspace$NetworkAccessControlProperty | [[cdk.support/lookup-entry]] | `:network-access-control` |
| `notificationDestinations` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-destinations` |
| `organizationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-role-name` |
| `organizationalUnits` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-units` |
| `permissionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-type` |
| `pluginAdminEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:plugin-admin-enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `samlConfiguration` | software.amazon.awscdk.services.grafana.CfnWorkspace$SamlConfigurationProperty | [[cdk.support/lookup-entry]] | `:saml-configuration` |
| `stackSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-name` |
| `vpcConfiguration` | software.amazon.awscdk.services.grafana.CfnWorkspace$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |
"
  [^CfnWorkspaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-access-type)]
    (. builder accountAccessType data))
  (when-some [data (lookup-entry config id :authentication-providers)]
    (. builder authenticationProviders data))
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :grafana-version)]
    (. builder grafanaVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-access-control)]
    (. builder networkAccessControl data))
  (when-some [data (lookup-entry config id :notification-destinations)]
    (. builder notificationDestinations data))
  (when-some [data (lookup-entry config id :organization-role-name)]
    (. builder organizationRoleName data))
  (when-some [data (lookup-entry config id :organizational-units)]
    (. builder organizationalUnits data))
  (when-some [data (lookup-entry config id :permission-type)]
    (. builder permissionType data))
  (when-some [data (lookup-entry config id :plugin-admin-enabled)]
    (. builder pluginAdminEnabled data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :saml-configuration)]
    (. builder samlConfiguration data))
  (when-some [data (lookup-entry config id :stack-set-name)]
    (. builder stackSetName data))
  (when-some [data (lookup-entry config id :vpc-configuration)]
    (. builder vpcConfiguration data))
  (.build builder))


(defn cfn-workspace-props-builder
  "Creates a  `CfnWorkspaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-props-builder (new CfnWorkspaceProps$Builder) id config))


(defn build-cfn-workspace-role-values-property-builder
  "The build-cfn-workspace-role-values-property-builder function updates a CfnWorkspace$RoleValuesProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$RoleValuesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admin` | java.util.List | [[cdk.support/lookup-entry]] | `:admin` |
| `editor` | java.util.List | [[cdk.support/lookup-entry]] | `:editor` |
"
  [^CfnWorkspace$RoleValuesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :admin)]
    (. builder admin data))
  (when-some [data (lookup-entry config id :editor)]
    (. builder editor data))
  (.build builder))


(defn cfn-workspace-role-values-property-builder
  "Creates a  `CfnWorkspace$RoleValuesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-role-values-property-builder (new CfnWorkspace$RoleValuesProperty$Builder) id config))


(defn build-cfn-workspace-saml-configuration-property-builder
  "The build-cfn-workspace-saml-configuration-property-builder function updates a CfnWorkspace$SamlConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$SamlConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOrganizations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-organizations` |
| `assertionAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assertion-attributes` |
| `idpMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idp-metadata` |
| `loginValidityDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:login-validity-duration` |
| `roleValues` | software.amazon.awscdk.services.grafana.CfnWorkspace$RoleValuesProperty | [[cdk.support/lookup-entry]] | `:role-values` |
"
  [^CfnWorkspace$SamlConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-organizations)]
    (. builder allowedOrganizations data))
  (when-some [data (lookup-entry config id :assertion-attributes)]
    (. builder assertionAttributes data))
  (when-some [data (lookup-entry config id :idp-metadata)]
    (. builder idpMetadata data))
  (when-some [data (lookup-entry config id :login-validity-duration)]
    (. builder loginValidityDuration data))
  (when-some [data (lookup-entry config id :role-values)]
    (. builder roleValues data))
  (.build builder))


(defn cfn-workspace-saml-configuration-property-builder
  "Creates a  `CfnWorkspace$SamlConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-saml-configuration-property-builder (new CfnWorkspace$SamlConfigurationProperty$Builder) id config))


(defn build-cfn-workspace-vpc-configuration-property-builder
  "The build-cfn-workspace-vpc-configuration-property-builder function updates a CfnWorkspace$VpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$VpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnWorkspace$VpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-workspace-vpc-configuration-property-builder
  "Creates a  `CfnWorkspace$VpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-vpc-configuration-property-builder (new CfnWorkspace$VpcConfigurationProperty$Builder) id config))