(ns cdk.api.services.servicecatalog
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicecatalog package. "
  (:require [cdk.api.services.s3.deployment :refer [server-side-encryption]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.servicecatalog CfnAcceptedPortfolioShare$Builder
                                                           CfnAcceptedPortfolioShareProps$Builder
                                                           CfnCloudFormationProduct$Builder
                                                           CfnCloudFormationProduct$CodeStarParametersProperty$Builder
                                                           CfnCloudFormationProduct$ConnectionParametersProperty$Builder
                                                           CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder
                                                           CfnCloudFormationProduct$SourceConnectionProperty$Builder
                                                           CfnCloudFormationProductProps$Builder
                                                           CfnCloudFormationProvisionedProduct$Builder
                                                           CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder
                                                           CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder
                                                           CfnCloudFormationProvisionedProductProps$Builder
                                                           CfnLaunchNotificationConstraint$Builder
                                                           CfnLaunchNotificationConstraintProps$Builder
                                                           CfnLaunchRoleConstraint$Builder
                                                           CfnLaunchRoleConstraintProps$Builder
                                                           CfnLaunchTemplateConstraint$Builder
                                                           CfnLaunchTemplateConstraintProps$Builder
                                                           CfnPortfolio$Builder
                                                           CfnPortfolioPrincipalAssociation$Builder
                                                           CfnPortfolioPrincipalAssociationProps$Builder
                                                           CfnPortfolioProductAssociation$Builder
                                                           CfnPortfolioProductAssociationProps$Builder
                                                           CfnPortfolioProps$Builder
                                                           CfnPortfolioShare$Builder
                                                           CfnPortfolioShareProps$Builder
                                                           CfnResourceUpdateConstraint$Builder
                                                           CfnResourceUpdateConstraintProps$Builder
                                                           CfnServiceAction$Builder
                                                           CfnServiceAction$DefinitionParameterProperty$Builder
                                                           CfnServiceActionAssociation$Builder
                                                           CfnServiceActionAssociationProps$Builder
                                                           CfnServiceActionProps$Builder
                                                           CfnStackSetConstraint$Builder
                                                           CfnStackSetConstraintProps$Builder
                                                           CfnTagOption$Builder
                                                           CfnTagOptionAssociation$Builder
                                                           CfnTagOptionAssociationProps$Builder
                                                           CfnTagOptionProps$Builder
                                                           CloudFormationProduct$Builder
                                                           CloudFormationProductProps$Builder
                                                           CloudFormationProductVersion$Builder
                                                           CloudFormationRuleConstraintOptions$Builder
                                                           CloudFormationTemplateConfig$Builder
                                                           CommonConstraintOptions$Builder
                                                           MessageLanguage
                                                           Portfolio$Builder
                                                           PortfolioProps$Builder
                                                           PortfolioShareOptions$Builder
                                                           ProductStack$Builder
                                                           ProductStackHistory$Builder
                                                           ProductStackHistoryProps$Builder
                                                           ProductStackProps$Builder
                                                           StackSetsConstraintOptions$Builder
                                                           TagOptions$Builder
                                                           TagOptionsProps$Builder
                                                           TagUpdateConstraintOptions$Builder
                                                           TemplateRule$Builder
                                                           TemplateRuleAssertion$Builder]))


(defn message-language
  "The `message-language` function data interprets values in the provided config data into a 
`MessageLanguage` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MessageLanguage` - the value is returned.
* is `:en` - `MessageLanguage/EN` is returned
* is `:zh` - `MessageLanguage/ZH` is returned
* is `:jp` - `MessageLanguage/JP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MessageLanguage data) data
      (= :en data) MessageLanguage/EN
      (= :zh data) MessageLanguage/ZH
      (= :jp data) MessageLanguage/JP)))


(defn build-cfn-accepted-portfolio-share-builder
  "The build-cfn-accepted-portfolio-share-builder function updates a CfnAcceptedPortfolioShare$Builder instance using the provided configuration.
  The function takes the CfnAcceptedPortfolioShare$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
"
  [^CfnAcceptedPortfolioShare$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (.build builder))


(defn build-cfn-accepted-portfolio-share-props-builder
  "The build-cfn-accepted-portfolio-share-props-builder function updates a CfnAcceptedPortfolioShareProps$Builder instance using the provided configuration.
  The function takes the CfnAcceptedPortfolioShareProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
"
  [^CfnAcceptedPortfolioShareProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (.build builder))


(defn build-cfn-cloud-formation-product-builder
  "The build-cfn-cloud-formation-product-builder function updates a CfnCloudFormationProduct$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProduct$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributor` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributor` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `productType` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-type` |
| `provisioningArtifactParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioning-artifact-parameters` |
| `replaceProvisioningArtifacts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-provisioning-artifacts` |
| `sourceConnection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-connection` |
| `supportDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-description` |
| `supportEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-email` |
| `supportUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-url` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCloudFormationProduct$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :distributor)]
    (. builder distributor data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :product-type)]
    (. builder productType data))
  (when-let [data (lookup-entry config id :provisioning-artifact-parameters)]
    (. builder provisioningArtifactParameters data))
  (when-let [data (lookup-entry config id :replace-provisioning-artifacts)]
    (. builder replaceProvisioningArtifacts data))
  (when-let [data (lookup-entry config id :source-connection)]
    (. builder sourceConnection data))
  (when-let [data (lookup-entry config id :support-description)]
    (. builder supportDescription data))
  (when-let [data (lookup-entry config id :support-email)]
    (. builder supportEmail data))
  (when-let [data (lookup-entry config id :support-url)]
    (. builder supportUrl data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cloud-formation-product-code-star-parameters-property-builder
  "The build-cfn-cloud-formation-product-code-star-parameters-property-builder function updates a CfnCloudFormationProduct$CodeStarParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProduct$CodeStarParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-path` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
"
  [^CfnCloudFormationProduct$CodeStarParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :artifact-path)]
    (. builder artifactPath data))
  (when-let [data (lookup-entry config id :branch)]
    (. builder branch data))
  (when-let [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (when-let [data (lookup-entry config id :repository)]
    (. builder repository data))
  (.build builder))


(defn build-cfn-cloud-formation-product-connection-parameters-property-builder
  "The build-cfn-cloud-formation-product-connection-parameters-property-builder function updates a CfnCloudFormationProduct$ConnectionParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProduct$ConnectionParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeStar` | software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct$CodeStarParametersProperty | [[cdk.support/lookup-entry]] | `:code-star` |
"
  [^CfnCloudFormationProduct$ConnectionParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-star)]
    (. builder codeStar data))
  (.build builder))


(defn build-cfn-cloud-formation-product-props-builder
  "The build-cfn-cloud-formation-product-props-builder function updates a CfnCloudFormationProductProps$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProductProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributor` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributor` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `productType` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-type` |
| `provisioningArtifactParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioning-artifact-parameters` |
| `replaceProvisioningArtifacts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-provisioning-artifacts` |
| `sourceConnection` | software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct$SourceConnectionProperty | [[cdk.support/lookup-entry]] | `:source-connection` |
| `supportDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-description` |
| `supportEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-email` |
| `supportUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-url` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCloudFormationProductProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :distributor)]
    (. builder distributor data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :product-type)]
    (. builder productType data))
  (when-let [data (lookup-entry config id :provisioning-artifact-parameters)]
    (. builder provisioningArtifactParameters data))
  (when-let [data (lookup-entry config id :replace-provisioning-artifacts)]
    (. builder replaceProvisioningArtifacts data))
  (when-let [data (lookup-entry config id :source-connection)]
    (. builder sourceConnection data))
  (when-let [data (lookup-entry config id :support-description)]
    (. builder supportDescription data))
  (when-let [data (lookup-entry config id :support-email)]
    (. builder supportEmail data))
  (when-let [data (lookup-entry config id :support-url)]
    (. builder supportUrl data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cloud-formation-product-provisioning-artifact-properties-property-builder
  "The build-cfn-cloud-formation-product-provisioning-artifact-properties-property-builder function updates a CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableTemplateValidation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-template-validation` |
| `info` | java.lang.Object | [[cdk.support/lookup-entry]] | `:info` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :disable-template-validation)]
    (. builder disableTemplateValidation data))
  (when-let [data (lookup-entry config id :info)]
    (. builder info data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-cloud-formation-product-source-connection-property-builder
  "The build-cfn-cloud-formation-product-source-connection-property-builder function updates a CfnCloudFormationProduct$SourceConnectionProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProduct$SourceConnectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCloudFormationProduct$SourceConnectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :connection-parameters)]
    (. builder connectionParameters data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-cloud-formation-provisioned-product-builder
  "The build-cfn-cloud-formation-provisioned-product-builder function updates a CfnCloudFormationProvisionedProduct$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProvisionedProduct$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `pathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-id` |
| `pathName` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `provisionedProductName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-name` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `provisioningArtifactName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-name` |
| `provisioningParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioning-parameters` |
| `provisioningPreferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioning-preferences` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCloudFormationProvisionedProduct$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :path-id)]
    (. builder pathId data))
  (when-let [data (lookup-entry config id :path-name)]
    (. builder pathName data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :provisioned-product-name)]
    (. builder provisionedProductName data))
  (when-let [data (lookup-entry config id :provisioning-artifact-id)]
    (. builder provisioningArtifactId data))
  (when-let [data (lookup-entry config id :provisioning-artifact-name)]
    (. builder provisioningArtifactName data))
  (when-let [data (lookup-entry config id :provisioning-parameters)]
    (. builder provisioningParameters data))
  (when-let [data (lookup-entry config id :provisioning-preferences)]
    (. builder provisioningPreferences data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cloud-formation-provisioned-product-props-builder
  "The build-cfn-cloud-formation-provisioned-product-props-builder function updates a CfnCloudFormationProvisionedProductProps$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProvisionedProductProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `pathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-id` |
| `pathName` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-name` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `provisionedProductName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioned-product-name` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `provisioningArtifactName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-name` |
| `provisioningParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioning-parameters` |
| `provisioningPreferences` | software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty | [[cdk.support/lookup-entry]] | `:provisioning-preferences` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCloudFormationProvisionedProductProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :path-id)]
    (. builder pathId data))
  (when-let [data (lookup-entry config id :path-name)]
    (. builder pathName data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :provisioned-product-name)]
    (. builder provisionedProductName data))
  (when-let [data (lookup-entry config id :provisioning-artifact-id)]
    (. builder provisioningArtifactId data))
  (when-let [data (lookup-entry config id :provisioning-artifact-name)]
    (. builder provisioningArtifactName data))
  (when-let [data (lookup-entry config id :provisioning-parameters)]
    (. builder provisioningParameters data))
  (when-let [data (lookup-entry config id :provisioning-preferences)]
    (. builder provisioningPreferences data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-cloud-formation-provisioned-product-provisioning-parameter-property-builder
  "The build-cfn-cloud-formation-provisioned-product-provisioning-parameter-property-builder function updates a CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-cloud-formation-provisioned-product-provisioning-preferences-property-builder
  "The build-cfn-cloud-formation-provisioned-product-provisioning-preferences-property-builder function updates a CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackSetAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-set-accounts` |
| `stackSetFailureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-failure-tolerance-count` |
| `stackSetFailureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-failure-tolerance-percentage` |
| `stackSetMaxConcurrencyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-max-concurrency-count` |
| `stackSetMaxConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-max-concurrency-percentage` |
| `stackSetOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-operation-type` |
| `stackSetRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-set-regions` |
"
  [^CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :stack-set-accounts)]
    (. builder stackSetAccounts data))
  (when-let [data (lookup-entry config id :stack-set-failure-tolerance-count)]
    (. builder stackSetFailureToleranceCount data))
  (when-let [data (lookup-entry config id :stack-set-failure-tolerance-percentage)]
    (. builder stackSetFailureTolerancePercentage data))
  (when-let [data (lookup-entry config id :stack-set-max-concurrency-count)]
    (. builder stackSetMaxConcurrencyCount data))
  (when-let [data (lookup-entry config id :stack-set-max-concurrency-percentage)]
    (. builder stackSetMaxConcurrencyPercentage data))
  (when-let [data (lookup-entry config id :stack-set-operation-type)]
    (. builder stackSetOperationType data))
  (when-let [data (lookup-entry config id :stack-set-regions)]
    (. builder stackSetRegions data))
  (.build builder))


(defn build-cfn-launch-notification-constraint-builder
  "The build-cfn-launch-notification-constraint-builder function updates a CfnLaunchNotificationConstraint$Builder instance using the provided configuration.
  The function takes the CfnLaunchNotificationConstraint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
"
  [^CfnLaunchNotificationConstraint$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (.build builder))


(defn build-cfn-launch-notification-constraint-props-builder
  "The build-cfn-launch-notification-constraint-props-builder function updates a CfnLaunchNotificationConstraintProps$Builder instance using the provided configuration.
  The function takes the CfnLaunchNotificationConstraintProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
"
  [^CfnLaunchNotificationConstraintProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (.build builder))


(defn build-cfn-launch-role-constraint-builder
  "The build-cfn-launch-role-constraint-builder function updates a CfnLaunchRoleConstraint$Builder instance using the provided configuration.
  The function takes the CfnLaunchRoleConstraint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-role-name` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnLaunchRoleConstraint$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :local-role-name)]
    (. builder localRoleName data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-launch-role-constraint-props-builder
  "The build-cfn-launch-role-constraint-props-builder function updates a CfnLaunchRoleConstraintProps$Builder instance using the provided configuration.
  The function takes the CfnLaunchRoleConstraintProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-role-name` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnLaunchRoleConstraintProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :local-role-name)]
    (. builder localRoleName data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-launch-template-constraint-builder
  "The build-cfn-launch-template-constraint-builder function updates a CfnLaunchTemplateConstraint$Builder instance using the provided configuration.
  The function takes the CfnLaunchTemplateConstraint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnLaunchTemplateConstraint$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-launch-template-constraint-props-builder
  "The build-cfn-launch-template-constraint-props-builder function updates a CfnLaunchTemplateConstraintProps$Builder instance using the provided configuration.
  The function takes the CfnLaunchTemplateConstraintProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnLaunchTemplateConstraintProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn build-cfn-portfolio-builder
  "The build-cfn-portfolio-builder function updates a CfnPortfolio$Builder instance using the provided configuration.
  The function takes the CfnPortfolio$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPortfolio$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-portfolio-principal-association-builder
  "The build-cfn-portfolio-principal-association-builder function updates a CfnPortfolioPrincipalAssociation$Builder instance using the provided configuration.
  The function takes the CfnPortfolioPrincipalAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
"
  [^CfnPortfolioPrincipalAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :principal-arn)]
    (. builder principalArn data))
  (when-let [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (.build builder))


(defn build-cfn-portfolio-principal-association-props-builder
  "The build-cfn-portfolio-principal-association-props-builder function updates a CfnPortfolioPrincipalAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnPortfolioPrincipalAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
"
  [^CfnPortfolioPrincipalAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :principal-arn)]
    (. builder principalArn data))
  (when-let [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (.build builder))


(defn build-cfn-portfolio-product-association-builder
  "The build-cfn-portfolio-product-association-builder function updates a CfnPortfolioProductAssociation$Builder instance using the provided configuration.
  The function takes the CfnPortfolioProductAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `sourcePortfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-portfolio-id` |
"
  [^CfnPortfolioProductAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :source-portfolio-id)]
    (. builder sourcePortfolioId data))
  (.build builder))


(defn build-cfn-portfolio-product-association-props-builder
  "The build-cfn-portfolio-product-association-props-builder function updates a CfnPortfolioProductAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnPortfolioProductAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `sourcePortfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-portfolio-id` |
"
  [^CfnPortfolioProductAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :source-portfolio-id)]
    (. builder sourcePortfolioId data))
  (.build builder))


(defn build-cfn-portfolio-props-builder
  "The build-cfn-portfolio-props-builder function updates a CfnPortfolioProps$Builder instance using the provided configuration.
  The function takes the CfnPortfolioProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPortfolioProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-portfolio-share-builder
  "The build-cfn-portfolio-share-builder function updates a CfnPortfolioShare$Builder instance using the provided configuration.
  The function takes the CfnPortfolioShare$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |
"
  [^CfnPortfolioShare$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :share-tag-options)]
    (. builder shareTagOptions data))
  (.build builder))


(defn build-cfn-portfolio-share-props-builder
  "The build-cfn-portfolio-share-props-builder function updates a CfnPortfolioShareProps$Builder instance using the provided configuration.
  The function takes the CfnPortfolioShareProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |
"
  [^CfnPortfolioShareProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :share-tag-options)]
    (. builder shareTagOptions data))
  (.build builder))


(defn build-cfn-resource-update-constraint-builder
  "The build-cfn-resource-update-constraint-builder function updates a CfnResourceUpdateConstraint$Builder instance using the provided configuration.
  The function takes the CfnResourceUpdateConstraint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `tagUpdateOnProvisionedProduct` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-update-on-provisioned-product` |
"
  [^CfnResourceUpdateConstraint$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :tag-update-on-provisioned-product)]
    (. builder tagUpdateOnProvisionedProduct data))
  (.build builder))


(defn build-cfn-resource-update-constraint-props-builder
  "The build-cfn-resource-update-constraint-props-builder function updates a CfnResourceUpdateConstraintProps$Builder instance using the provided configuration.
  The function takes the CfnResourceUpdateConstraintProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `tagUpdateOnProvisionedProduct` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-update-on-provisioned-product` |
"
  [^CfnResourceUpdateConstraintProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :tag-update-on-provisioned-product)]
    (. builder tagUpdateOnProvisionedProduct data))
  (.build builder))


(defn build-cfn-service-action-association-builder
  "The build-cfn-service-action-association-builder function updates a CfnServiceActionAssociation$Builder instance using the provided configuration.
  The function takes the CfnServiceActionAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `serviceActionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-action-id` |
"
  [^CfnServiceActionAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :provisioning-artifact-id)]
    (. builder provisioningArtifactId data))
  (when-let [data (lookup-entry config id :service-action-id)]
    (. builder serviceActionId data))
  (.build builder))


(defn build-cfn-service-action-association-props-builder
  "The build-cfn-service-action-association-props-builder function updates a CfnServiceActionAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnServiceActionAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `serviceActionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-action-id` |
"
  [^CfnServiceActionAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :provisioning-artifact-id)]
    (. builder provisioningArtifactId data))
  (when-let [data (lookup-entry config id :service-action-id)]
    (. builder serviceActionId data))
  (.build builder))


(defn build-cfn-service-action-builder
  "The build-cfn-service-action-builder function updates a CfnServiceAction$Builder instance using the provided configuration.
  The function takes the CfnServiceAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnServiceAction$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-type)]
    (. builder definitionType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-service-action-definition-parameter-property-builder
  "The build-cfn-service-action-definition-parameter-property-builder function updates a CfnServiceAction$DefinitionParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnServiceAction$DefinitionParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnServiceAction$DefinitionParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-service-action-props-builder
  "The build-cfn-service-action-props-builder function updates a CfnServiceActionProps$Builder instance using the provided configuration.
  The function takes the CfnServiceActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnServiceActionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-type)]
    (. builder definitionType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-stack-set-constraint-builder
  "The build-cfn-stack-set-constraint-builder function updates a CfnStackSetConstraint$Builder instance using the provided configuration.
  The function takes the CfnStackSetConstraint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountList` | java.util.List | [[cdk.support/lookup-entry]] | `:account-list` |
| `adminRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `regionList` | java.util.List | [[cdk.support/lookup-entry]] | `:region-list` |
| `stackInstanceControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-instance-control` |
"
  [^CfnStackSetConstraint$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :account-list)]
    (. builder accountList data))
  (when-let [data (lookup-entry config id :admin-role)]
    (. builder adminRole data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :region-list)]
    (. builder regionList data))
  (when-let [data (lookup-entry config id :stack-instance-control)]
    (. builder stackInstanceControl data))
  (.build builder))


(defn build-cfn-stack-set-constraint-props-builder
  "The build-cfn-stack-set-constraint-props-builder function updates a CfnStackSetConstraintProps$Builder instance using the provided configuration.
  The function takes the CfnStackSetConstraintProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountList` | java.util.List | [[cdk.support/lookup-entry]] | `:account-list` |
| `adminRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `regionList` | java.util.List | [[cdk.support/lookup-entry]] | `:region-list` |
| `stackInstanceControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-instance-control` |
"
  [^CfnStackSetConstraintProps$Builder builder id config]
  (when-let [data (lookup-entry config id :accept-language)]
    (. builder acceptLanguage data))
  (when-let [data (lookup-entry config id :account-list)]
    (. builder accountList data))
  (when-let [data (lookup-entry config id :admin-role)]
    (. builder adminRole data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-let [data (lookup-entry config id :portfolio-id)]
    (. builder portfolioId data))
  (when-let [data (lookup-entry config id :product-id)]
    (. builder productId data))
  (when-let [data (lookup-entry config id :region-list)]
    (. builder regionList data))
  (when-let [data (lookup-entry config id :stack-instance-control)]
    (. builder stackInstanceControl data))
  (.build builder))


(defn build-cfn-tag-option-association-builder
  "The build-cfn-tag-option-association-builder function updates a CfnTagOptionAssociation$Builder instance using the provided configuration.
  The function takes the CfnTagOptionAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tagOptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-option-id` |
"
  [^CfnTagOptionAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :tag-option-id)]
    (. builder tagOptionId data))
  (.build builder))


(defn build-cfn-tag-option-association-props-builder
  "The build-cfn-tag-option-association-props-builder function updates a CfnTagOptionAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnTagOptionAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tagOptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-option-id` |
"
  [^CfnTagOptionAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-let [data (lookup-entry config id :tag-option-id)]
    (. builder tagOptionId data))
  (.build builder))


(defn build-cfn-tag-option-builder
  "The build-cfn-tag-option-builder function updates a CfnTagOption$Builder instance using the provided configuration.
  The function takes the CfnTagOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTagOption$Builder builder id config]
  (when-let [data (lookup-entry config id :active)]
    (. builder active data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-tag-option-props-builder
  "The build-cfn-tag-option-props-builder function updates a CfnTagOptionProps$Builder instance using the provided configuration.
  The function takes the CfnTagOptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTagOptionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :active)]
    (. builder active data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cloud-formation-product-builder
  "The build-cloud-formation-product-builder function updates a CloudFormationProduct$Builder instance using the provided configuration.
  The function takes the CloudFormationProduct$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributor` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributor` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `productVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:product-versions` |
| `replaceProductVersionIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-product-version-ids` |
| `supportDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-description` |
| `supportEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-email` |
| `supportUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-url` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |
"
  [^CloudFormationProduct$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :distributor)]
    (. builder distributor data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :product-versions)]
    (. builder productVersions data))
  (when-let [data (lookup-entry config id :replace-product-version-ids)]
    (. builder replaceProductVersionIds data))
  (when-let [data (lookup-entry config id :support-description)]
    (. builder supportDescription data))
  (when-let [data (lookup-entry config id :support-email)]
    (. builder supportEmail data))
  (when-let [data (lookup-entry config id :support-url)]
    (. builder supportUrl data))
  (when-let [data (lookup-entry config id :tag-options)]
    (. builder tagOptions data))
  (.build builder))


(defn build-cloud-formation-product-props-builder
  "The build-cloud-formation-product-props-builder function updates a CloudFormationProductProps$Builder instance using the provided configuration.
  The function takes the CloudFormationProductProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `distributor` | java.lang.String | [[cdk.support/lookup-entry]] | `:distributor` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `productName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-name` |
| `productVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:product-versions` |
| `replaceProductVersionIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-product-version-ids` |
| `supportDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-description` |
| `supportEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-email` |
| `supportUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:support-url` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |
"
  [^CloudFormationProductProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :distributor)]
    (. builder distributor data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :owner)]
    (. builder owner data))
  (when-let [data (lookup-entry config id :product-name)]
    (. builder productName data))
  (when-let [data (lookup-entry config id :product-versions)]
    (. builder productVersions data))
  (when-let [data (lookup-entry config id :replace-product-version-ids)]
    (. builder replaceProductVersionIds data))
  (when-let [data (lookup-entry config id :support-description)]
    (. builder supportDescription data))
  (when-let [data (lookup-entry config id :support-email)]
    (. builder supportEmail data))
  (when-let [data (lookup-entry config id :support-url)]
    (. builder supportUrl data))
  (when-let [data (lookup-entry config id :tag-options)]
    (. builder tagOptions data))
  (.build builder))


(defn build-cloud-formation-product-version-builder
  "The build-cloud-formation-product-version-builder function updates a CloudFormationProductVersion$Builder instance using the provided configuration.
  The function takes the CloudFormationProductVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationTemplate` | software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate | [[cdk.support/lookup-entry]] | `:cloud-formation-template` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |
"
  [^CloudFormationProductVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-formation-template)]
    (. builder cloudFormationTemplate data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :product-version-name)]
    (. builder productVersionName data))
  (when-let [data (lookup-entry config id :validate-template)]
    (. builder validateTemplate data))
  (.build builder))


(defn build-cloud-formation-rule-constraint-options-builder
  "The build-cloud-formation-rule-constraint-options-builder function updates a CloudFormationRuleConstraintOptions$Builder instance using the provided configuration.
  The function takes the CloudFormationRuleConstraintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `rule` | software.amazon.awscdk.services.servicecatalog.TemplateRule | [[cdk.support/lookup-entry]] | `:rule` |
"
  [^CloudFormationRuleConstraintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :rule)]
    (. builder rule data))
  (.build builder))


(defn build-cloud-formation-template-config-builder
  "The build-cloud-formation-template-config-builder function updates a CloudFormationTemplateConfig$Builder instance using the provided configuration.
  The function takes the CloudFormationTemplateConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `httpUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-url` |
"
  [^CloudFormationTemplateConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-bucket)]
    (. builder assetBucket data))
  (when-let [data (lookup-entry config id :http-url)]
    (. builder httpUrl data))
  (.build builder))


(defn build-common-constraint-options-builder
  "The build-common-constraint-options-builder function updates a CommonConstraintOptions$Builder instance using the provided configuration.
  The function takes the CommonConstraintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
"
  [^CommonConstraintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (.build builder))


(defn build-portfolio-builder
  "The build-portfolio-builder function updates a Portfolio$Builder instance using the provided configuration.
  The function takes the Portfolio$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |
"
  [^Portfolio$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-let [data (lookup-entry config id :tag-options)]
    (. builder tagOptions data))
  (.build builder))


(defn build-portfolio-props-builder
  "The build-portfolio-props-builder function updates a PortfolioProps$Builder instance using the provided configuration.
  The function takes the PortfolioProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |
"
  [^PortfolioProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :provider-name)]
    (. builder providerName data))
  (when-let [data (lookup-entry config id :tag-options)]
    (. builder tagOptions data))
  (.build builder))


(defn build-portfolio-share-options-builder
  "The build-portfolio-share-options-builder function updates a PortfolioShareOptions$Builder instance using the provided configuration.
  The function takes the PortfolioShareOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |
"
  [^PortfolioShareOptions$Builder builder id config]
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :share-tag-options)]
    (. builder shareTagOptions data))
  (.build builder))


(defn build-product-stack-builder
  "The build-product-stack-builder function updates a ProductStack$Builder instance using the provided configuration.
  The function takes the ProductStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |
"
  [^ProductStack$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-bucket)]
    (. builder assetBucket data))
  (when-let [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-let [data (server-side-encryption config id :server-side-encryption)]
    (. builder serverSideEncryption data))
  (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
    (. builder serverSideEncryptionAwsKmsKeyId data))
  (.build builder))


(defn build-product-stack-history-builder
  "The build-product-stack-history-builder function updates a ProductStackHistory$Builder instance using the provided configuration.
  The function takes the ProductStackHistory$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersionLocked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:current-version-locked` |
| `currentVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `productStack` | software.amazon.awscdk.services.servicecatalog.ProductStack | [[cdk.support/lookup-entry]] | `:product-stack` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |
"
  [^ProductStackHistory$Builder builder id config]
  (when-let [data (lookup-entry config id :current-version-locked)]
    (. builder currentVersionLocked data))
  (when-let [data (lookup-entry config id :current-version-name)]
    (. builder currentVersionName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :directory)]
    (. builder directory data))
  (when-let [data (lookup-entry config id :product-stack)]
    (. builder productStack data))
  (when-let [data (lookup-entry config id :validate-template)]
    (. builder validateTemplate data))
  (.build builder))


(defn build-product-stack-history-props-builder
  "The build-product-stack-history-props-builder function updates a ProductStackHistoryProps$Builder instance using the provided configuration.
  The function takes the ProductStackHistoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersionLocked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:current-version-locked` |
| `currentVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `productStack` | software.amazon.awscdk.services.servicecatalog.ProductStack | [[cdk.support/lookup-entry]] | `:product-stack` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |
"
  [^ProductStackHistoryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :current-version-locked)]
    (. builder currentVersionLocked data))
  (when-let [data (lookup-entry config id :current-version-name)]
    (. builder currentVersionName data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :directory)]
    (. builder directory data))
  (when-let [data (lookup-entry config id :product-stack)]
    (. builder productStack data))
  (when-let [data (lookup-entry config id :validate-template)]
    (. builder validateTemplate data))
  (.build builder))


(defn build-product-stack-props-builder
  "The build-product-stack-props-builder function updates a ProductStackProps$Builder instance using the provided configuration.
  The function takes the ProductStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |
"
  [^ProductStackProps$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-bucket)]
    (. builder assetBucket data))
  (when-let [data (lookup-entry config id :memory-limit)]
    (. builder memoryLimit data))
  (when-let [data (server-side-encryption config id :server-side-encryption)]
    (. builder serverSideEncryption data))
  (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
    (. builder serverSideEncryptionAwsKmsKeyId data))
  (.build builder))


(defn build-stack-sets-constraint-options-builder
  "The build-stack-sets-constraint-options-builder function updates a StackSetsConstraintOptions$Builder instance using the provided configuration.
  The function takes the StackSetsConstraintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `adminRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:admin-role` |
| `allowStackSetInstanceOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-stack-set-instance-operations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
"
  [^StackSetsConstraintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-let [data (lookup-entry config id :admin-role)]
    (. builder adminRole data))
  (when-let [data (lookup-entry config id :allow-stack-set-instance-operations)]
    (. builder allowStackSetInstanceOperations data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :execution-role-name)]
    (. builder executionRoleName data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (.build builder))


(defn build-tag-options-builder
  "The build-tag-options-builder function updates a TagOptions$Builder instance using the provided configuration.
  The function takes the TagOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValuesForTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:allowed-values-for-tags` |
"
  [^TagOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-values-for-tags)]
    (. builder allowedValuesForTags data))
  (.build builder))


(defn build-tag-options-props-builder
  "The build-tag-options-props-builder function updates a TagOptionsProps$Builder instance using the provided configuration.
  The function takes the TagOptionsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValuesForTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:allowed-values-for-tags` |
"
  [^TagOptionsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-values-for-tags)]
    (. builder allowedValuesForTags data))
  (.build builder))


(defn build-tag-update-constraint-options-builder
  "The build-tag-update-constraint-options-builder function updates a TagUpdateConstraintOptions$Builder instance using the provided configuration.
  The function takes the TagUpdateConstraintOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
"
  [^TagUpdateConstraintOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :allow)]
    (. builder allow data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (message-language config id :message-language)]
    (. builder messageLanguage data))
  (.build builder))


(defn build-template-rule-assertion-builder
  "The build-template-rule-assertion-builder function updates a TemplateRuleAssertion$Builder instance using the provided configuration.
  The function takes the TemplateRuleAssertion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertValue` | software.amazon.awscdk.ICfnRuleConditionExpression | [[cdk.support/lookup-entry]] | `:assert-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^TemplateRuleAssertion$Builder builder id config]
  (when-let [data (lookup-entry config id :assert-value)]
    (. builder assertValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn build-template-rule-builder
  "The build-template-rule-builder function updates a TemplateRule$Builder instance using the provided configuration.
  The function takes the TemplateRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `condition` | software.amazon.awscdk.ICfnRuleConditionExpression | [[cdk.support/lookup-entry]] | `:condition` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^TemplateRule$Builder builder id config]
  (when-let [data (lookup-entry config id :assertions)]
    (. builder assertions data))
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))