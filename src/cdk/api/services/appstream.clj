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


(defn build-cfn-app-block-builder
  "The build-cfn-app-block-builder function updates a CfnAppBlock$Builder instance using the provided configuration.
  The function takes the CfnAppBlock$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-type` |
| `postSetupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-setup-script-details` |
| `setupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:setup-script-details` |
| `sourceS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-s3-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppBlock$Builder builder id config]
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
  (.build builder))


(defn build-cfn-app-block-builder-access-endpoint-property-builder
  "The build-cfn-app-block-builder-access-endpoint-property-builder function updates a CfnAppBlockBuilder$AccessEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnAppBlockBuilder$AccessEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |
"
  [^CfnAppBlockBuilder$AccessEndpointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :vpce-id)]
    (. builder vpceId data))
  (.build builder))


(defn build-cfn-app-block-builder-builder
  "The build-cfn-app-block-builder-builder function updates a CfnAppBlockBuilder$Builder instance using the provided configuration.
  The function takes the CfnAppBlockBuilder$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.services.appstream.CfnAppBlockBuilder$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnAppBlockBuilder$Builder builder id config]
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
  (.build builder))


(defn build-cfn-app-block-builder-props-builder
  "The build-cfn-app-block-builder-props-builder function updates a CfnAppBlockBuilderProps$Builder instance using the provided configuration.
  The function takes the CfnAppBlockBuilderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnAppBlockBuilderProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-app-block-builder-vpc-config-property-builder
  "The build-cfn-app-block-builder-vpc-config-property-builder function updates a CfnAppBlockBuilder$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnAppBlockBuilder$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnAppBlockBuilder$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn build-cfn-app-block-props-builder
  "The build-cfn-app-block-props-builder function updates a CfnAppBlockProps$Builder instance using the provided configuration.
  The function takes the CfnAppBlockProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packagingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging-type` |
| `postSetupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-setup-script-details` |
| `setupScriptDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:setup-script-details` |
| `sourceS3Location` | software.amazon.awscdk.services.appstream.CfnAppBlock$S3LocationProperty | [[cdk.support/lookup-entry]] | `:source-s3-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppBlockProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-app-block-s3-location-property-builder
  "The build-cfn-app-block-s3-location-property-builder function updates a CfnAppBlock$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnAppBlock$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnAppBlock$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn build-cfn-app-block-script-details-property-builder
  "The build-cfn-app-block-script-details-property-builder function updates a CfnAppBlock$ScriptDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnAppBlock$ScriptDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executableParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable-parameters` |
| `executablePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:executable-path` |
| `scriptS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:script-s3-location` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnAppBlock$ScriptDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :executable-parameters)]
    (. builder executableParameters data))
  (when-let [data (lookup-entry config id :executable-path)]
    (. builder executablePath data))
  (when-let [data (lookup-entry config id :script-s3-location)]
    (. builder scriptS3Location data))
  (when-let [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnApplication$Builder builder id config]
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
  (.build builder))


(defn build-cfn-application-entitlement-association-builder
  "The build-cfn-application-entitlement-association-builder function updates a CfnApplicationEntitlementAssociation$Builder instance using the provided configuration.
  The function takes the CfnApplicationEntitlementAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `entitlementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnApplicationEntitlementAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :entitlement-name)]
    (. builder entitlementName data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (.build builder))


(defn build-cfn-application-entitlement-association-props-builder
  "The build-cfn-application-entitlement-association-props-builder function updates a CfnApplicationEntitlementAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationEntitlementAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `entitlementName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnApplicationEntitlementAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :entitlement-name)]
    (. builder entitlementName data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (.build builder))


(defn build-cfn-application-fleet-association-builder
  "The build-cfn-application-fleet-association-builder function updates a CfnApplicationFleetAssociation$Builder instance using the provided configuration.
  The function takes the CfnApplicationFleetAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
"
  [^CfnApplicationFleetAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-let [data (lookup-entry config id :fleet-name)]
    (. builder fleetName data))
  (.build builder))


(defn build-cfn-application-fleet-association-props-builder
  "The build-cfn-application-fleet-association-props-builder function updates a CfnApplicationFleetAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationFleetAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
"
  [^CfnApplicationFleetAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-let [data (lookup-entry config id :fleet-name)]
    (. builder fleetName data))
  (.build builder))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnApplicationProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-application-s3-location-property-builder
  "The build-cfn-application-s3-location-property-builder function updates a CfnApplication$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnApplication$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn build-cfn-directory-config-builder
  "The build-cfn-directory-config-builder function updates a CfnDirectoryConfig$Builder instance using the provided configuration.
  The function takes the CfnDirectoryConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBasedAuthProperties` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty | [[cdk.support/lookup-entry]] | `:certificate-based-auth-properties` |
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-names` |
| `serviceAccountCredentials` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$ServiceAccountCredentialsProperty | [[cdk.support/lookup-entry]] | `:service-account-credentials` |
"
  [^CfnDirectoryConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-based-auth-properties)]
    (. builder certificateBasedAuthProperties data))
  (when-let [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-names)]
    (. builder organizationalUnitDistinguishedNames data))
  (when-let [data (lookup-entry config id :service-account-credentials)]
    (. builder serviceAccountCredentials data))
  (.build builder))


(defn build-cfn-directory-config-certificate-based-auth-properties-property-builder
  "The build-cfn-directory-config-certificate-based-auth-properties-property-builder function updates a CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-directory-config-props-builder
  "The build-cfn-directory-config-props-builder function updates a CfnDirectoryConfigProps$Builder instance using the provided configuration.
  The function takes the CfnDirectoryConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateBasedAuthProperties` | software.amazon.awscdk.services.appstream.CfnDirectoryConfig$CertificateBasedAuthPropertiesProperty | [[cdk.support/lookup-entry]] | `:certificate-based-auth-properties` |
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-names` |
| `serviceAccountCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:service-account-credentials` |
"
  [^CfnDirectoryConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-based-auth-properties)]
    (. builder certificateBasedAuthProperties data))
  (when-let [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-names)]
    (. builder organizationalUnitDistinguishedNames data))
  (when-let [data (lookup-entry config id :service-account-credentials)]
    (. builder serviceAccountCredentials data))
  (.build builder))


(defn build-cfn-directory-config-service-account-credentials-property-builder
  "The build-cfn-directory-config-service-account-credentials-property-builder function updates a CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `accountPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-password` |
"
  [^CfnDirectoryConfig$ServiceAccountCredentialsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :account-name)]
    (. builder accountName data))
  (when-let [data (lookup-entry config id :account-password)]
    (. builder accountPassword data))
  (.build builder))


(defn build-cfn-entitlement-attribute-property-builder
  "The build-cfn-entitlement-attribute-property-builder function updates a CfnEntitlement$AttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnEntitlement$AttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEntitlement$AttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-entitlement-builder
  "The build-cfn-entitlement-builder function updates a CfnEntitlement$Builder instance using the provided configuration.
  The function takes the CfnEntitlement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVisibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-visibility` |
| `attributes` | java.util.List | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnEntitlement$Builder builder id config]
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
  (.build builder))


(defn build-cfn-entitlement-props-builder
  "The build-cfn-entitlement-props-builder function updates a CfnEntitlementProps$Builder instance using the provided configuration.
  The function takes the CfnEntitlementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVisibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-visibility` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnEntitlementProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-fleet-builder
  "The build-cfn-fleet-builder function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFleet$Builder builder id config]
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
  (.build builder))


(defn build-cfn-fleet-compute-capacity-property-builder
  "The build-cfn-fleet-compute-capacity-property-builder function updates a CfnFleet$ComputeCapacityProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ComputeCapacityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredInstances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-instances` |
| `desiredSessions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-sessions` |
"
  [^CfnFleet$ComputeCapacityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :desired-instances)]
    (. builder desiredInstances data))
  (when-let [data (lookup-entry config id :desired-sessions)]
    (. builder desiredSessions data))
  (.build builder))


(defn build-cfn-fleet-domain-join-info-property-builder
  "The build-cfn-fleet-domain-join-info-property-builder function updates a CfnFleet$DomainJoinInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$DomainJoinInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
"
  [^CfnFleet$DomainJoinInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
    (. builder organizationalUnitDistinguishedName data))
  (.build builder))


(defn build-cfn-fleet-props-builder
  "The build-cfn-fleet-props-builder function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnFleetProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-fleet-s3-location-property-builder
  "The build-cfn-fleet-s3-location-property-builder function updates a CfnFleet$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnFleet$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn build-cfn-fleet-vpc-config-property-builder
  "The build-cfn-fleet-vpc-config-property-builder function updates a CfnFleet$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnFleet$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn build-cfn-image-builder-access-endpoint-property-builder
  "The build-cfn-image-builder-access-endpoint-property-builder function updates a CfnImageBuilder$AccessEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnImageBuilder$AccessEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |
"
  [^CfnImageBuilder$AccessEndpointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :vpce-id)]
    (. builder vpceId data))
  (.build builder))


(defn build-cfn-image-builder-builder
  "The build-cfn-image-builder-builder function updates a CfnImageBuilder$Builder instance using the provided configuration.
  The function takes the CfnImageBuilder$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnImageBuilder$Builder builder id config]
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
  (.build builder))


(defn build-cfn-image-builder-domain-join-info-property-builder
  "The build-cfn-image-builder-domain-join-info-property-builder function updates a CfnImageBuilder$DomainJoinInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnImageBuilder$DomainJoinInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
"
  [^CfnImageBuilder$DomainJoinInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
    (. builder organizationalUnitDistinguishedName data))
  (.build builder))


(defn build-cfn-image-builder-props-builder
  "The build-cfn-image-builder-props-builder function updates a CfnImageBuilderProps$Builder instance using the provided configuration.
  The function takes the CfnImageBuilderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcConfig` | software.amazon.awscdk.services.appstream.CfnImageBuilder$VpcConfigProperty | [[cdk.support/lookup-entry]] | `:vpc-config` |
"
  [^CfnImageBuilderProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-image-builder-vpc-config-property-builder
  "The build-cfn-image-builder-vpc-config-property-builder function updates a CfnImageBuilder$VpcConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnImageBuilder$VpcConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnImageBuilder$VpcConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn build-cfn-stack-access-endpoint-property-builder
  "The build-cfn-stack-access-endpoint-property-builder function updates a CfnStack$AccessEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$AccessEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `vpceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpce-id` |
"
  [^CfnStack$AccessEndpointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :vpce-id)]
    (. builder vpceId data))
  (.build builder))


(defn build-cfn-stack-application-settings-property-builder
  "The build-cfn-stack-application-settings-property-builder function updates a CfnStack$ApplicationSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$ApplicationSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `settingsGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:settings-group` |
"
  [^CfnStack$ApplicationSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :settings-group)]
    (. builder settingsGroup data))
  (.build builder))


(defn build-cfn-stack-builder
  "The build-cfn-stack-builder function updates a CfnStack$Builder instance using the provided configuration.
  The function takes the CfnStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |
"
  [^CfnStack$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-fleet-association-builder
  "The build-cfn-stack-fleet-association-builder function updates a CfnStackFleetAssociation$Builder instance using the provided configuration.
  The function takes the CfnStackFleetAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnStackFleetAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :fleet-name)]
    (. builder fleetName data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (.build builder))


(defn build-cfn-stack-fleet-association-props-builder
  "The build-cfn-stack-fleet-association-props-builder function updates a CfnStackFleetAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnStackFleetAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-name` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
"
  [^CfnStackFleetAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :fleet-name)]
    (. builder fleetName data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (.build builder))


(defn build-cfn-stack-props-builder
  "The build-cfn-stack-props-builder function updates a CfnStackProps$Builder instance using the provided configuration.
  The function takes the CfnStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-settings` |
"
  [^CfnStackProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-stack-storage-connector-property-builder
  "The build-cfn-stack-storage-connector-property-builder function updates a CfnStack$StorageConnectorProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$StorageConnectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connector-type` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `resourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-identifier` |
"
  [^CfnStack$StorageConnectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connector-type)]
    (. builder connectorType data))
  (when-let [data (lookup-entry config id :domains)]
    (. builder domains data))
  (when-let [data (lookup-entry config id :resource-identifier)]
    (. builder resourceIdentifier data))
  (.build builder))


(defn build-cfn-stack-streaming-experience-settings-property-builder
  "The build-cfn-stack-streaming-experience-settings-property-builder function updates a CfnStack$StreamingExperienceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$StreamingExperienceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-protocol` |
"
  [^CfnStack$StreamingExperienceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :preferred-protocol)]
    (. builder preferredProtocol data))
  (.build builder))


(defn build-cfn-stack-user-association-builder
  "The build-cfn-stack-user-association-builder function updates a CfnStackUserAssociation$Builder instance using the provided configuration.
  The function takes the CfnStackUserAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `sendEmailNotification` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:send-email-notification` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnStackUserAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-let [data (lookup-entry config id :send-email-notification)]
    (. builder sendEmailNotification data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn build-cfn-stack-user-association-props-builder
  "The build-cfn-stack-user-association-props-builder function updates a CfnStackUserAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnStackUserAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `sendEmailNotification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:send-email-notification` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnStackUserAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-let [data (lookup-entry config id :send-email-notification)]
    (. builder sendEmailNotification data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-let [data (lookup-entry config id :user-name)]
    (. builder userName data))
  (.build builder))


(defn build-cfn-stack-user-setting-property-builder
  "The build-cfn-stack-user-setting-property-builder function updates a CfnStack$UserSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$UserSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `maximumLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-length` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |
"
  [^CfnStack$UserSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :maximum-length)]
    (. builder maximumLength data))
  (when-let [data (lookup-entry config id :permission)]
    (. builder permission data))
  (.build builder))


(defn build-cfn-user-builder
  "The build-cfn-user-builder function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUser$Builder builder id config]
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
  (.build builder))


(defn build-cfn-user-props-builder
  "The build-cfn-user-props-builder function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `messageAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-action` |
| `userName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-name` |
"
  [^CfnUserProps$Builder builder id config]
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
  (.build builder))