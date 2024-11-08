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


(defn cfn-workspace-assertion-attributes-property-builder
  "The cfn-workspace-assertion-attributes-property-builder function buildes out new instances of 
CfnWorkspace$AssertionAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `groups` | java.lang.String | [[cdk.support/lookup-entry]] | `:groups` |
| `login` | java.lang.String | [[cdk.support/lookup-entry]] | `:login` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `org` | java.lang.String | [[cdk.support/lookup-entry]] | `:org` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (CfnWorkspace$AssertionAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :login)]
      (. builder login data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :org)]
      (. builder org data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn cfn-workspace-builder
  "The cfn-workspace-builder function buildes out new instances of 
CfnWorkspace$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.services.grafana.CfnWorkspace$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnWorkspace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-access-type)]
      (. builder accountAccessType data))
    (when-let [data (lookup-entry config id :authentication-providers)]
      (. builder authenticationProviders data))
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :data-sources)]
      (. builder dataSources data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :grafana-version)]
      (. builder grafanaVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-access-control)]
      (. builder networkAccessControl data))
    (when-let [data (lookup-entry config id :notification-destinations)]
      (. builder notificationDestinations data))
    (when-let [data (lookup-entry config id :organization-role-name)]
      (. builder organizationRoleName data))
    (when-let [data (lookup-entry config id :organizational-units)]
      (. builder organizationalUnits data))
    (when-let [data (lookup-entry config id :permission-type)]
      (. builder permissionType data))
    (when-let [data (lookup-entry config id :plugin-admin-enabled)]
      (. builder pluginAdminEnabled data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :saml-configuration)]
      (. builder samlConfiguration data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-workspace-idp-metadata-property-builder
  "The cfn-workspace-idp-metadata-property-builder function buildes out new instances of 
CfnWorkspace$IdpMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `xml` | java.lang.String | [[cdk.support/lookup-entry]] | `:xml` |"
  [stack id config]
  (let [builder (CfnWorkspace$IdpMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (when-let [data (lookup-entry config id :xml)]
      (. builder xml data))
    (.build builder)))


(defn cfn-workspace-network-access-control-property-builder
  "The cfn-workspace-network-access-control-property-builder function buildes out new instances of 
CfnWorkspace$NetworkAccessControlProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `prefixListIds` | java.util.List | [[cdk.support/lookup-entry]] | `:prefix-list-ids` |
| `vpceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpce-ids` |"
  [stack id config]
  (let [builder (CfnWorkspace$NetworkAccessControlProperty$Builder.)]
    (when-let [data (lookup-entry config id :prefix-list-ids)]
      (. builder prefixListIds data))
    (when-let [data (lookup-entry config id :vpce-ids)]
      (. builder vpceIds data))
    (.build builder)))


(defn cfn-workspace-props-builder
  "The cfn-workspace-props-builder function buildes out new instances of 
CfnWorkspaceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcConfiguration` | software.amazon.awscdk.services.grafana.CfnWorkspace$VpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:vpc-configuration` |"
  [stack id config]
  (let [builder (CfnWorkspaceProps$Builder.)]
    (when-let [data (lookup-entry config id :account-access-type)]
      (. builder accountAccessType data))
    (when-let [data (lookup-entry config id :authentication-providers)]
      (. builder authenticationProviders data))
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :data-sources)]
      (. builder dataSources data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :grafana-version)]
      (. builder grafanaVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-access-control)]
      (. builder networkAccessControl data))
    (when-let [data (lookup-entry config id :notification-destinations)]
      (. builder notificationDestinations data))
    (when-let [data (lookup-entry config id :organization-role-name)]
      (. builder organizationRoleName data))
    (when-let [data (lookup-entry config id :organizational-units)]
      (. builder organizationalUnits data))
    (when-let [data (lookup-entry config id :permission-type)]
      (. builder permissionType data))
    (when-let [data (lookup-entry config id :plugin-admin-enabled)]
      (. builder pluginAdminEnabled data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :saml-configuration)]
      (. builder samlConfiguration data))
    (when-let [data (lookup-entry config id :stack-set-name)]
      (. builder stackSetName data))
    (when-let [data (lookup-entry config id :vpc-configuration)]
      (. builder vpcConfiguration data))
    (.build builder)))


(defn cfn-workspace-role-values-property-builder
  "The cfn-workspace-role-values-property-builder function buildes out new instances of 
CfnWorkspace$RoleValuesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admin` | java.util.List | [[cdk.support/lookup-entry]] | `:admin` |
| `editor` | java.util.List | [[cdk.support/lookup-entry]] | `:editor` |"
  [stack id config]
  (let [builder (CfnWorkspace$RoleValuesProperty$Builder.)]
    (when-let [data (lookup-entry config id :admin)]
      (. builder admin data))
    (when-let [data (lookup-entry config id :editor)]
      (. builder editor data))
    (.build builder)))


(defn cfn-workspace-saml-configuration-property-builder
  "The cfn-workspace-saml-configuration-property-builder function buildes out new instances of 
CfnWorkspace$SamlConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOrganizations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-organizations` |
| `assertionAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assertion-attributes` |
| `idpMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:idp-metadata` |
| `loginValidityDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:login-validity-duration` |
| `roleValues` | software.amazon.awscdk.services.grafana.CfnWorkspace$RoleValuesProperty | [[cdk.support/lookup-entry]] | `:role-values` |"
  [stack id config]
  (let [builder (CfnWorkspace$SamlConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-organizations)]
      (. builder allowedOrganizations data))
    (when-let [data (lookup-entry config id :assertion-attributes)]
      (. builder assertionAttributes data))
    (when-let [data (lookup-entry config id :idp-metadata)]
      (. builder idpMetadata data))
    (when-let [data (lookup-entry config id :login-validity-duration)]
      (. builder loginValidityDuration data))
    (when-let [data (lookup-entry config id :role-values)]
      (. builder roleValues data))
    (.build builder)))


(defn cfn-workspace-vpc-configuration-property-builder
  "The cfn-workspace-vpc-configuration-property-builder function buildes out new instances of 
CfnWorkspace$VpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnWorkspace$VpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))