(ns cdk.api.services.appstream
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appstream package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.appstream CfnAppBlock$Builder
                                                      CfnAppBlock$S3LocationProperty$Builder
                                                      CfnAppBlock$ScriptDetailsProperty$Builder
                                                      CfnAppBlockBuilder$AccessEndpointProperty$Builder
                                                      CfnAppBlockBuilder$Builder
                                                      CfnAppBlockBuilder$VpcConfigProperty$Builder
                                                      CfnAppBlockBuilderProps$Builder
                                                      CfnAppBlockProps$Builder
                                                      CfnApplication$Builder
                                                      CfnApplication$S3LocationProperty$Builder
                                                      CfnApplicationEntitlementAssociation$Builder
                                                      CfnApplicationEntitlementAssociationProps$Builder
                                                      CfnApplicationFleetAssociation$Builder
                                                      CfnApplicationFleetAssociationProps$Builder
                                                      CfnApplicationProps$Builder
                                                      CfnDirectoryConfig$Builder
                                                      CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder
                                                      CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder
                                                      CfnDirectoryConfigProps$Builder
                                                      CfnEntitlement$AttributeProperty$Builder
                                                      CfnEntitlement$Builder
                                                      CfnEntitlementProps$Builder
                                                      CfnFleet$Builder
                                                      CfnFleet$ComputeCapacityProperty$Builder
                                                      CfnFleet$DomainJoinInfoProperty$Builder
                                                      CfnFleet$S3LocationProperty$Builder
                                                      CfnFleet$VpcConfigProperty$Builder
                                                      CfnFleetProps$Builder
                                                      CfnImageBuilder$AccessEndpointProperty$Builder
                                                      CfnImageBuilder$Builder
                                                      CfnImageBuilder$DomainJoinInfoProperty$Builder
                                                      CfnImageBuilder$VpcConfigProperty$Builder
                                                      CfnImageBuilderProps$Builder
                                                      CfnStack$AccessEndpointProperty$Builder
                                                      CfnStack$ApplicationSettingsProperty$Builder
                                                      CfnStack$Builder
                                                      CfnStack$StorageConnectorProperty$Builder
                                                      CfnStack$StreamingExperienceSettingsProperty$Builder
                                                      CfnStack$UserSettingProperty$Builder
                                                      CfnStackFleetAssociation$Builder
                                                      CfnStackFleetAssociationProps$Builder
                                                      CfnStackProps$Builder
                                                      CfnStackUserAssociation$Builder
                                                      CfnStackUserAssociationProps$Builder
                                                      CfnUser$Builder
                                                      CfnUserProps$Builder]))


(defn cfn-app-block-builder
  "The cfn-app-block-builder function buildes out new instances of 
CfnAppBlock$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-type` |
| `postSetupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-setup-script-details` |
| `setupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:setup-script-details` |
| `sourceS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-s3-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppBlock$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :packaging-type)]
      (. builder packagingType data))
    (when-let [data (lookup-entry config id :post-setup-script-details)]
      (. builder postSetupScriptDetails data))
    (when-let [data (lookup-entry config id :setup-script-details)]
      (. builder setupScriptDetails data))
    (when-let [data (lookup-entry config id :source-s3-location)]
      (. builder sourceS3Location data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-block-builder-access-endpoint-property-builder
  "The cfn-app-block-builder-access-endpoint-property-builder function buildes out new instances of 
CfnAppBlockBuilder$AccessEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |"
  [stack id config]
  (let [builder (CfnAppBlockBuilder$AccessEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :vpce-id)]
      (. builder vpceId data))
    (.build builder)))


(defn cfn-app-block-builder-builder
  "The cfn-app-block-builder-builder function buildes out new instances of 
CfnAppBlockBuilder$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `appBlockArns` | java.util.List | [[cdk.support/lookup-entry]] | `:app-block-arns` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `enableDefaultInternetAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.appstream.CfnAppBlockBuilder$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnAppBlockBuilder$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :app-block-arns)]
      (. builder appBlockArns data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-app-block-builder-props-builder
  "The cfn-app-block-builder-props-builder function buildes out new instances of 
CfnAppBlockBuilderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `appBlockArns` | java.util.List | [[cdk.support/lookup-entry]] | `:app-block-arns` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `enableDefaultInternetAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnAppBlockBuilderProps$Builder.)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :app-block-arns)]
      (. builder appBlockArns data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-app-block-builder-vpc-config-property-builder
  "The cfn-app-block-builder-vpc-config-property-builder function buildes out new instances of 
CfnAppBlockBuilder$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnAppBlockBuilder$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-app-block-props-builder
  "The cfn-app-block-props-builder function buildes out new instances of 
CfnAppBlockProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-type` |
| `postSetupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-setup-script-details` |
| `setupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:setup-script-details` |
| `sourceS3Location` | software.amazon.awscdk.services.appstream.CfnAppBlock$S3LocationProperty | [[cdk.support/lookup-entry]] | `:source-s3-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppBlockProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :packaging-type)]
      (. builder packagingType data))
    (when-let [data (lookup-entry config id :post-setup-script-details)]
      (. builder postSetupScriptDetails data))
    (when-let [data (lookup-entry config id :setup-script-details)]
      (. builder setupScriptDetails data))
    (when-let [data (lookup-entry config id :source-s3-location)]
      (. builder sourceS3Location data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-block-s3-location-property-builder
  "The cfn-app-block-s3-location-property-builder function buildes out new instances of 
CfnAppBlock$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnAppBlock$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-app-block-script-details-property-builder
  "The cfn-app-block-script-details-property-builder function buildes out new instances of 
CfnAppBlock$ScriptDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executableParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable-parameters` |
| `executablePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable-path` |
| `scriptS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:script-s3-location` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnAppBlock$ScriptDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :executable-parameters)]
      (. builder executableParameters data))
    (when-let [data (lookup-entry config id :executable-path)]
      (. builder executablePath data))
    (when-let [data (lookup-entry config id :script-s3-location)]
      (. builder scriptS3Location data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appBlockArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-block-arn` |
| `attributesToDelete` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes-to-delete` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `iconS3Location` | software.amazon.awscdk.services.appstream.CfnApplication$S3LocationProperty | [[cdk.support/lookup-entry]] | `:icon-s3-location` |
| `instanceFamilies` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-families` |
| `launchParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-parameters` |
| `launchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platforms` | java.util.List | [[cdk.support/lookup-entry]] | `:platforms` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-block-arn)]
      (. builder appBlockArn data))
    (when-let [data (lookup-entry config id :attributes-to-delete)]
      (. builder attributesToDelete data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :icon-s3-location)]
      (. builder iconS3Location data))
    (when-let [data (lookup-entry config id :instance-families)]
      (. builder instanceFamilies data))
    (when-let [data (lookup-entry config id :launch-parameters)]
      (. builder launchParameters data))
    (when-let [data (lookup-entry config id :launch-path)]
      (. builder launchPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platforms)]
      (. builder platforms data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-application-entitlement-association-builder
  "The cfn-application-entitlement-association-builder function buildes out new instances of 
CfnApplicationEntitlementAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `entitlementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnApplicationEntitlementAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-identifier)]
      (. builder applicationIdentifier data))
    (when-let [data (lookup-entry config id :entitlement-name)]
      (. builder entitlementName data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-application-entitlement-association-props-builder
  "The cfn-application-entitlement-association-props-builder function buildes out new instances of 
CfnApplicationEntitlementAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `entitlementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnApplicationEntitlementAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-identifier)]
      (. builder applicationIdentifier data))
    (when-let [data (lookup-entry config id :entitlement-name)]
      (. builder entitlementName data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-application-fleet-association-builder
  "The cfn-application-fleet-association-builder function buildes out new instances of 
CfnApplicationFleetAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |"
  [stack id config]
  (let [builder (CfnApplicationFleetAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-arn)]
      (. builder applicationArn data))
    (when-let [data (lookup-entry config id :fleet-name)]
      (. builder fleetName data))
    (.build builder)))


(defn cfn-application-fleet-association-props-builder
  "The cfn-application-fleet-association-props-builder function buildes out new instances of 
CfnApplicationFleetAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |"
  [stack id config]
  (let [builder (CfnApplicationFleetAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-arn)]
      (. builder applicationArn data))
    (when-let [data (lookup-entry config id :fleet-name)]
      (. builder fleetName data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appBlockArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-block-arn` |
| `attributesToDelete` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes-to-delete` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `iconS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:icon-s3-location` |
| `instanceFamilies` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-families` |
| `launchParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-parameters` |
| `launchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-path` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platforms` | java.util.List | [[cdk.support/lookup-entry]] | `:platforms` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :app-block-arn)]
      (. builder appBlockArn data))
    (when-let [data (lookup-entry config id :attributes-to-delete)]
      (. builder attributesToDelete data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :icon-s3-location)]
      (. builder iconS3Location data))
    (when-let [data (lookup-entry config id :instance-families)]
      (. builder instanceFamilies data))
    (when-let [data (lookup-entry config id :launch-parameters)]
      (. builder launchParameters data))
    (when-let [data (lookup-entry config id :launch-path)]
      (. builder launchPath data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platforms)]
      (. builder platforms data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-application-s3-location-property-builder
  "The cfn-application-s3-location-property-builder function buildes out new instances of 
CfnApplication$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnApplication$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-directory-config-builder
  "The cfn-directory-config-builder function buildes out new instances of 
CfnDirectoryConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBasedAuthProperties` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty | [[cdk.support/lookup-entry]] | `:certificate-based-auth-properties` |
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-names` |
| `serviceAccountCredentials` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$ServiceAccountCredentialsProperty | [[cdk.support/lookup-entry]] | `:service-account-credentials` |"
  [stack id config]
  (let [builder (CfnDirectoryConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-based-auth-properties)]
      (. builder certificateBasedAuthProperties data))
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :organizational-unit-distinguished-names)]
      (. builder organizationalUnitDistinguishedNames data))
    (when-let [data (lookup-entry config id :service-account-credentials)]
      (. builder serviceAccountCredentials data))
    (.build builder)))


(defn cfn-directory-config-certificate-based-auth-properties-property-builder
  "The cfn-directory-config-certificate-based-auth-properties-property-builder function buildes out new instances of 
CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-directory-config-props-builder
  "The cfn-directory-config-props-builder function buildes out new instances of 
CfnDirectoryConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBasedAuthProperties` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty | [[cdk.support/lookup-entry]] | `:certificate-based-auth-properties` |
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-names` |
| `serviceAccountCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-account-credentials` |"
  [stack id config]
  (let [builder (CfnDirectoryConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-based-auth-properties)]
      (. builder certificateBasedAuthProperties data))
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :organizational-unit-distinguished-names)]
      (. builder organizationalUnitDistinguishedNames data))
    (when-let [data (lookup-entry config id :service-account-credentials)]
      (. builder serviceAccountCredentials data))
    (.build builder)))


(defn cfn-directory-config-service-account-credentials-property-builder
  "The cfn-directory-config-service-account-credentials-property-builder function buildes out new instances of 
CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `accountPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-password` |"
  [stack id config]
  (let [builder (CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :account-name)]
      (. builder accountName data))
    (when-let [data (lookup-entry config id :account-password)]
      (. builder accountPassword data))
    (.build builder)))


(defn cfn-entitlement-attribute-property-builder
  "The cfn-entitlement-attribute-property-builder function buildes out new instances of 
CfnEntitlement$AttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEntitlement$AttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-entitlement-builder
  "The cfn-entitlement-builder function buildes out new instances of 
CfnEntitlement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVisibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-visibility` |
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnEntitlement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-visibility)]
      (. builder appVisibility data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-entitlement-props-builder
  "The cfn-entitlement-props-builder function buildes out new instances of 
CfnEntitlementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVisibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-visibility` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnEntitlementProps$Builder.)]
    (when-let [data (lookup-entry config id :app-visibility)]
      (. builder appVisibility data))
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeCapacity` | software.amazon.awscdk.services.appstream.CfnFleet$ComputeCapacityProperty | [[cdk.support/lookup-entry]] | `:compute-capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disconnectTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disconnect-timeout-in-seconds` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainJoinInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-join-info` |
| `enableDefaultInternetAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `fleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-type` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `idleDisconnectTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-disconnect-timeout-in-seconds` |
| `imageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-arn` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `maxConcurrentSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-sessions` |
| `maxSessionsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-sessions-per-instance` |
| `maxUserDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-user-duration-in-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `sessionScriptS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-script-s3-location` |
| `streamView` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-view` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usbDeviceFilterStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:usb-device-filter-strings` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compute-capacity)]
      (. builder computeCapacity data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disconnect-timeout-in-seconds)]
      (. builder disconnectTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-join-info)]
      (. builder domainJoinInfo data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :fleet-type)]
      (. builder fleetType data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :idle-disconnect-timeout-in-seconds)]
      (. builder idleDisconnectTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :image-arn)]
      (. builder imageArn data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :max-concurrent-sessions)]
      (. builder maxConcurrentSessions data))
    (when-let [data (lookup-entry config id :max-sessions-per-instance)]
      (. builder maxSessionsPerInstance data))
    (when-let [data (lookup-entry config id :max-user-duration-in-seconds)]
      (. builder maxUserDurationInSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :session-script-s3-location)]
      (. builder sessionScriptS3Location data))
    (when-let [data (lookup-entry config id :stream-view)]
      (. builder streamView data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :usb-device-filter-strings)]
      (. builder usbDeviceFilterStrings data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-fleet-compute-capacity-property-builder
  "The cfn-fleet-compute-capacity-property-builder function buildes out new instances of 
CfnFleet$ComputeCapacityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredInstances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-instances` |
| `desiredSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-sessions` |"
  [stack id config]
  (let [builder (CfnFleet$ComputeCapacityProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-instances)]
      (. builder desiredInstances data))
    (when-let [data (lookup-entry config id :desired-sessions)]
      (. builder desiredSessions data))
    (.build builder)))


(defn cfn-fleet-domain-join-info-property-builder
  "The cfn-fleet-domain-join-info-property-builder function buildes out new instances of 
CfnFleet$DomainJoinInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |"
  [stack id config]
  (let [builder (CfnFleet$DomainJoinInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
      (. builder organizationalUnitDistinguishedName data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computeCapacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disconnectTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:disconnect-timeout-in-seconds` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainJoinInfo` | software.amazon.awscdk.services.appstream.CfnFleet$DomainJoinInfoProperty | [[cdk.support/lookup-entry]] | `:domain-join-info` |
| `enableDefaultInternetAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `fleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-type` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `idleDisconnectTimeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-disconnect-timeout-in-seconds` |
| `imageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-arn` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `maxConcurrentSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-sessions` |
| `maxSessionsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-sessions-per-instance` |
| `maxUserDurationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-user-duration-in-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `sessionScriptS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-script-s3-location` |
| `streamView` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-view` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `usbDeviceFilterStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:usb-device-filter-strings` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :compute-capacity)]
      (. builder computeCapacity data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disconnect-timeout-in-seconds)]
      (. builder disconnectTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-join-info)]
      (. builder domainJoinInfo data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :fleet-type)]
      (. builder fleetType data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :idle-disconnect-timeout-in-seconds)]
      (. builder idleDisconnectTimeoutInSeconds data))
    (when-let [data (lookup-entry config id :image-arn)]
      (. builder imageArn data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :max-concurrent-sessions)]
      (. builder maxConcurrentSessions data))
    (when-let [data (lookup-entry config id :max-sessions-per-instance)]
      (. builder maxSessionsPerInstance data))
    (when-let [data (lookup-entry config id :max-user-duration-in-seconds)]
      (. builder maxUserDurationInSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :session-script-s3-location)]
      (. builder sessionScriptS3Location data))
    (when-let [data (lookup-entry config id :stream-view)]
      (. builder streamView data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :usb-device-filter-strings)]
      (. builder usbDeviceFilterStrings data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-fleet-s3-location-property-builder
  "The cfn-fleet-s3-location-property-builder function buildes out new instances of 
CfnFleet$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnFleet$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-fleet-vpc-config-property-builder
  "The cfn-fleet-vpc-config-property-builder function buildes out new instances of 
CfnFleet$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnFleet$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-image-builder-access-endpoint-property-builder
  "The cfn-image-builder-access-endpoint-property-builder function buildes out new instances of 
CfnImageBuilder$AccessEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |"
  [stack id config]
  (let [builder (CfnImageBuilder$AccessEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :vpce-id)]
      (. builder vpceId data))
    (.build builder)))


(defn cfn-image-builder-builder
  "The cfn-image-builder-builder function buildes out new instances of 
CfnImageBuilder$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `appstreamAgentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:appstream-agent-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainJoinInfo` | software.amazon.awscdk.services.appstream.CfnImageBuilder$DomainJoinInfoProperty | [[cdk.support/lookup-entry]] | `:domain-join-info` |
| `enableDefaultInternetAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `imageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-arn` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnImageBuilder$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :appstream-agent-version)]
      (. builder appstreamAgentVersion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-join-info)]
      (. builder domainJoinInfo data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :image-arn)]
      (. builder imageArn data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-image-builder-domain-join-info-property-builder
  "The cfn-image-builder-domain-join-info-property-builder function buildes out new instances of 
CfnImageBuilder$DomainJoinInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |"
  [stack id config]
  (let [builder (CfnImageBuilder$DomainJoinInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-name)]
      (. builder directoryName data))
    (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
      (. builder organizationalUnitDistinguishedName data))
    (.build builder)))


(defn cfn-image-builder-props-builder
  "The cfn-image-builder-props-builder function buildes out new instances of 
CfnImageBuilderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `appstreamAgentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:appstream-agent-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `domainJoinInfo` | software.amazon.awscdk.services.appstream.CfnImageBuilder$DomainJoinInfoProperty | [[cdk.support/lookup-entry]] | `:domain-join-info` |
| `enableDefaultInternetAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-default-internet-access` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `imageArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-arn` |
| `imageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-name` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConfig` | software.amazon.awscdk.services.appstream.CfnImageBuilder$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |"
  [stack id config]
  (let [builder (CfnImageBuilderProps$Builder.)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :appstream-agent-version)]
      (. builder appstreamAgentVersion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :domain-join-info)]
      (. builder domainJoinInfo data))
    (when-let [data (lookup-entry config id :enable-default-internet-access)]
      (. builder enableDefaultInternetAccess data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :image-arn)]
      (. builder imageArn data))
    (when-let [data (lookup-entry config id :image-name)]
      (. builder imageName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-config)]
      (. builder vpcConfig data))
    (.build builder)))


(defn cfn-image-builder-vpc-config-property-builder
  "The cfn-image-builder-vpc-config-property-builder function buildes out new instances of 
CfnImageBuilder$VpcConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnImageBuilder$VpcConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-stack-access-endpoint-property-builder
  "The cfn-stack-access-endpoint-property-builder function buildes out new instances of 
CfnStack$AccessEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |"
  [stack id config]
  (let [builder (CfnStack$AccessEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :vpce-id)]
      (. builder vpceId data))
    (.build builder)))


(defn cfn-stack-application-settings-property-builder
  "The cfn-stack-application-settings-property-builder function buildes out new instances of 
CfnStack$ApplicationSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `settingsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:settings-group` |"
  [stack id config]
  (let [builder (CfnStack$ApplicationSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :settings-group)]
      (. builder settingsGroup data))
    (.build builder)))


(defn cfn-stack-builder
  "The cfn-stack-builder function buildes out new instances of 
CfnStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `applicationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-settings` |
| `attributesToDelete` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes-to-delete` |
| `deleteStorageConnectors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-storage-connectors` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `embedHostDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:embed-host-domains` |
| `feedbackUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:feedback-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `redirectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:redirect-url` |
| `storageConnectors` | java.util.List | [[cdk.support/lookup-entry]] | `:storage-connectors` |
| `streamingExperienceSettings` | software.amazon.awscdk.services.appstream.CfnStack$StreamingExperienceSettingsProperty | [[cdk.support/lookup-entry]] | `:streaming-experience-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |"
  [stack id config]
  (let [builder (CfnStack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :application-settings)]
      (. builder applicationSettings data))
    (when-let [data (lookup-entry config id :attributes-to-delete)]
      (. builder attributesToDelete data))
    (when-let [data (lookup-entry config id :delete-storage-connectors)]
      (. builder deleteStorageConnectors data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :embed-host-domains)]
      (. builder embedHostDomains data))
    (when-let [data (lookup-entry config id :feedback-url)]
      (. builder feedbackUrl data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :redirect-url)]
      (. builder redirectUrl data))
    (when-let [data (lookup-entry config id :storage-connectors)]
      (. builder storageConnectors data))
    (when-let [data (lookup-entry config id :streaming-experience-settings)]
      (. builder streamingExperienceSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-settings)]
      (. builder userSettings data))
    (.build builder)))


(defn cfn-stack-fleet-association-builder
  "The cfn-stack-fleet-association-builder function buildes out new instances of 
CfnStackFleetAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnStackFleetAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :fleet-name)]
      (. builder fleetName data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-stack-fleet-association-props-builder
  "The cfn-stack-fleet-association-props-builder function buildes out new instances of 
CfnStackFleetAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |"
  [stack id config]
  (let [builder (CfnStackFleetAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :fleet-name)]
      (. builder fleetName data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (.build builder)))


(defn cfn-stack-props-builder
  "The cfn-stack-props-builder function buildes out new instances of 
CfnStackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:access-endpoints` |
| `applicationSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-settings` |
| `attributesToDelete` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes-to-delete` |
| `deleteStorageConnectors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-storage-connectors` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `embedHostDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:embed-host-domains` |
| `feedbackUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:feedback-url` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `redirectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:redirect-url` |
| `storageConnectors` | java.util.List | [[cdk.support/lookup-entry]] | `:storage-connectors` |
| `streamingExperienceSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:streaming-experience-settings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |"
  [stack id config]
  (let [builder (CfnStackProps$Builder.)]
    (when-let [data (lookup-entry config id :access-endpoints)]
      (. builder accessEndpoints data))
    (when-let [data (lookup-entry config id :application-settings)]
      (. builder applicationSettings data))
    (when-let [data (lookup-entry config id :attributes-to-delete)]
      (. builder attributesToDelete data))
    (when-let [data (lookup-entry config id :delete-storage-connectors)]
      (. builder deleteStorageConnectors data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :embed-host-domains)]
      (. builder embedHostDomains data))
    (when-let [data (lookup-entry config id :feedback-url)]
      (. builder feedbackUrl data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :redirect-url)]
      (. builder redirectUrl data))
    (when-let [data (lookup-entry config id :storage-connectors)]
      (. builder storageConnectors data))
    (when-let [data (lookup-entry config id :streaming-experience-settings)]
      (. builder streamingExperienceSettings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-settings)]
      (. builder userSettings data))
    (.build builder)))


(defn cfn-stack-storage-connector-property-builder
  "The cfn-stack-storage-connector-property-builder function buildes out new instances of 
CfnStack$StorageConnectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |"
  [stack id config]
  (let [builder (CfnStack$StorageConnectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :connector-type)]
      (. builder connectorType data))
    (when-let [data (lookup-entry config id :domains)]
      (. builder domains data))
    (when-let [data (lookup-entry config id :resource-identifier)]
      (. builder resourceIdentifier data))
    (.build builder)))


(defn cfn-stack-streaming-experience-settings-property-builder
  "The cfn-stack-streaming-experience-settings-property-builder function buildes out new instances of 
CfnStack$StreamingExperienceSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-protocol` |"
  [stack id config]
  (let [builder (CfnStack$StreamingExperienceSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :preferred-protocol)]
      (. builder preferredProtocol data))
    (.build builder)))


(defn cfn-stack-user-association-builder
  "The cfn-stack-user-association-builder function buildes out new instances of 
CfnStackUserAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `sendEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:send-email-notification` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnStackUserAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :send-email-notification)]
      (. builder sendEmailNotification data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-stack-user-association-props-builder
  "The cfn-stack-user-association-props-builder function buildes out new instances of 
CfnStackUserAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `sendEmailNotification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:send-email-notification` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnStackUserAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :send-email-notification)]
      (. builder sendEmailNotification data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-stack-user-setting-property-builder
  "The cfn-stack-user-setting-property-builder function buildes out new instances of 
CfnStack$UserSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `maximumLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-length` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |"
  [stack id config]
  (let [builder (CfnStack$UserSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :maximum-length)]
      (. builder maximumLength data))
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (.build builder)))


(defn cfn-user-builder
  "The cfn-user-builder function buildes out new instances of 
CfnUser$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUser$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :first-name)]
      (. builder firstName data))
    (when-let [data (lookup-entry config id :last-name)]
      (. builder lastName data))
    (when-let [data (lookup-entry config id :message-action)]
      (. builder messageAction data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))


(defn cfn-user-props-builder
  "The cfn-user-props-builder function buildes out new instances of 
CfnUserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |"
  [stack id config]
  (let [builder (CfnUserProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :first-name)]
      (. builder firstName data))
    (when-let [data (lookup-entry config id :last-name)]
      (. builder lastName data))
    (when-let [data (lookup-entry config id :message-action)]
      (. builder messageAction data))
    (when-let [data (lookup-entry config id :user-name)]
      (. builder userName data))
    (.build builder)))