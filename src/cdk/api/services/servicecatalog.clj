(ns cdk.api.services.servicecatalog
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicecatalog package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.s3.deployment :refer [server-side-encryption]])
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


(defn cfn-accepted-portfolio-share-builder
  "The cfn-accepted-portfolio-share-builder function buildes out new instances of 
CfnAcceptedPortfolioShare$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |"
  [stack id config]
  (let [builder (CfnAcceptedPortfolioShare$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (.build builder)))


(defn cfn-accepted-portfolio-share-props-builder
  "The cfn-accepted-portfolio-share-props-builder function buildes out new instances of 
CfnAcceptedPortfolioShareProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |"
  [stack id config]
  (let [builder (CfnAcceptedPortfolioShareProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (.build builder)))


(defn cfn-cloud-formation-product-builder
  "The cfn-cloud-formation-product-builder function buildes out new instances of 
CfnCloudFormationProduct$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCloudFormationProduct$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-cloud-formation-product-code-star-parameters-property-builder
  "The cfn-cloud-formation-product-code-star-parameters-property-builder function buildes out new instances of 
CfnCloudFormationProduct$CodeStarParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-path` |
| `branch` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |"
  [stack id config]
  (let [builder (CfnCloudFormationProduct$CodeStarParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :artifact-path)]
      (. builder artifactPath data))
    (when-let [data (lookup-entry config id :branch)]
      (. builder branch data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (.build builder)))


(defn cfn-cloud-formation-product-connection-parameters-property-builder
  "The cfn-cloud-formation-product-connection-parameters-property-builder function buildes out new instances of 
CfnCloudFormationProduct$ConnectionParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeStar` | software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct$CodeStarParametersProperty | [[cdk.support/lookup-entry]] | `:code-star` |"
  [stack id config]
  (let [builder (CfnCloudFormationProduct$ConnectionParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-star)]
      (. builder codeStar data))
    (.build builder)))


(defn cfn-cloud-formation-product-props-builder
  "The cfn-cloud-formation-product-props-builder function buildes out new instances of 
CfnCloudFormationProductProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCloudFormationProductProps$Builder.)]
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
    (.build builder)))


(defn cfn-cloud-formation-product-provisioning-artifact-properties-property-builder
  "The cfn-cloud-formation-product-provisioning-artifact-properties-property-builder function buildes out new instances of 
CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableTemplateValidation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-template-validation` |
| `info` | java.lang.Object | [[cdk.support/lookup-entry]] | `:info` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCloudFormationProduct$ProvisioningArtifactPropertiesProperty$Builder.)]
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
    (.build builder)))


(defn cfn-cloud-formation-product-source-connection-property-builder
  "The cfn-cloud-formation-product-source-connection-property-builder function buildes out new instances of 
CfnCloudFormationProduct$SourceConnectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCloudFormationProduct$SourceConnectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-parameters)]
      (. builder connectionParameters data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-cloud-formation-provisioned-product-builder
  "The cfn-cloud-formation-provisioned-product-builder function buildes out new instances of 
CfnCloudFormationProvisionedProduct$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCloudFormationProvisionedProduct$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-cloud-formation-provisioned-product-props-builder
  "The cfn-cloud-formation-provisioned-product-props-builder function buildes out new instances of 
CfnCloudFormationProvisionedProductProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCloudFormationProvisionedProductProps$Builder.)]
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
    (.build builder)))


(defn cfn-cloud-formation-provisioned-product-provisioning-parameter-property-builder
  "The cfn-cloud-formation-provisioned-product-provisioning-parameter-property-builder function buildes out new instances of 
CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCloudFormationProvisionedProduct$ProvisioningParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-cloud-formation-provisioned-product-provisioning-preferences-property-builder
  "The cfn-cloud-formation-provisioned-product-provisioning-preferences-property-builder function buildes out new instances of 
CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackSetAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-set-accounts` |
| `stackSetFailureToleranceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-failure-tolerance-count` |
| `stackSetFailureTolerancePercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-failure-tolerance-percentage` |
| `stackSetMaxConcurrencyCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-max-concurrency-count` |
| `stackSetMaxConcurrencyPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:stack-set-max-concurrency-percentage` |
| `stackSetOperationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-set-operation-type` |
| `stackSetRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:stack-set-regions` |"
  [stack id config]
  (let [builder (CfnCloudFormationProvisionedProduct$ProvisioningPreferencesProperty$Builder.)]
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
    (.build builder)))


(defn cfn-launch-notification-constraint-builder
  "The cfn-launch-notification-constraint-builder function buildes out new instances of 
CfnLaunchNotificationConstraint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |"
  [stack id config]
  (let [builder (CfnLaunchNotificationConstraint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-launch-notification-constraint-props-builder
  "The cfn-launch-notification-constraint-props-builder function buildes out new instances of 
CfnLaunchNotificationConstraintProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |"
  [stack id config]
  (let [builder (CfnLaunchNotificationConstraintProps$Builder.)]
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
    (.build builder)))


(defn cfn-launch-role-constraint-builder
  "The cfn-launch-role-constraint-builder function buildes out new instances of 
CfnLaunchRoleConstraint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-role-name` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLaunchRoleConstraint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-launch-role-constraint-props-builder
  "The cfn-launch-role-constraint-props-builder function buildes out new instances of 
CfnLaunchRoleConstraintProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `localRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-role-name` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLaunchRoleConstraintProps$Builder.)]
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
    (.build builder)))


(defn cfn-launch-template-constraint-builder
  "The cfn-launch-template-constraint-builder function buildes out new instances of 
CfnLaunchTemplateConstraint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnLaunchTemplateConstraint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-launch-template-constraint-props-builder
  "The cfn-launch-template-constraint-props-builder function buildes out new instances of 
CfnLaunchTemplateConstraintProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `rules` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnLaunchTemplateConstraintProps$Builder.)]
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
    (.build builder)))


(defn cfn-portfolio-builder
  "The cfn-portfolio-builder function buildes out new instances of 
CfnPortfolio$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPortfolio$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-portfolio-principal-association-builder
  "The cfn-portfolio-principal-association-builder function buildes out new instances of 
CfnPortfolioPrincipalAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |"
  [stack id config]
  (let [builder (CfnPortfolioPrincipalAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :principal-arn)]
      (. builder principalArn data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (.build builder)))


(defn cfn-portfolio-principal-association-props-builder
  "The cfn-portfolio-principal-association-props-builder function buildes out new instances of 
CfnPortfolioPrincipalAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |"
  [stack id config]
  (let [builder (CfnPortfolioPrincipalAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :principal-arn)]
      (. builder principalArn data))
    (when-let [data (lookup-entry config id :principal-type)]
      (. builder principalType data))
    (.build builder)))


(defn cfn-portfolio-product-association-builder
  "The cfn-portfolio-product-association-builder function buildes out new instances of 
CfnPortfolioProductAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `sourcePortfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-portfolio-id` |"
  [stack id config]
  (let [builder (CfnPortfolioProductAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :source-portfolio-id)]
      (. builder sourcePortfolioId data))
    (.build builder)))


(defn cfn-portfolio-product-association-props-builder
  "The cfn-portfolio-product-association-props-builder function buildes out new instances of 
CfnPortfolioProductAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `sourcePortfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-portfolio-id` |"
  [stack id config]
  (let [builder (CfnPortfolioProductAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :source-portfolio-id)]
      (. builder sourcePortfolioId data))
    (.build builder)))


(defn cfn-portfolio-props-builder
  "The cfn-portfolio-props-builder function buildes out new instances of 
CfnPortfolioProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPortfolioProps$Builder.)]
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
    (.build builder)))


(defn cfn-portfolio-share-builder
  "The cfn-portfolio-share-builder function buildes out new instances of 
CfnPortfolioShare$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |"
  [stack id config]
  (let [builder (CfnPortfolioShare$Builder/create stack id)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :share-tag-options)]
      (. builder shareTagOptions data))
    (.build builder)))


(defn cfn-portfolio-share-props-builder
  "The cfn-portfolio-share-props-builder function buildes out new instances of 
CfnPortfolioShareProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |"
  [stack id config]
  (let [builder (CfnPortfolioShareProps$Builder.)]
    (when-let [data (lookup-entry config id :accept-language)]
      (. builder acceptLanguage data))
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :portfolio-id)]
      (. builder portfolioId data))
    (when-let [data (lookup-entry config id :share-tag-options)]
      (. builder shareTagOptions data))
    (.build builder)))


(defn cfn-resource-update-constraint-builder
  "The cfn-resource-update-constraint-builder function buildes out new instances of 
CfnResourceUpdateConstraint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `tagUpdateOnProvisionedProduct` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-update-on-provisioned-product` |"
  [stack id config]
  (let [builder (CfnResourceUpdateConstraint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-resource-update-constraint-props-builder
  "The cfn-resource-update-constraint-props-builder function buildes out new instances of 
CfnResourceUpdateConstraintProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `portfolioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portfolio-id` |
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `tagUpdateOnProvisionedProduct` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-update-on-provisioned-product` |"
  [stack id config]
  (let [builder (CfnResourceUpdateConstraintProps$Builder.)]
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
    (.build builder)))


(defn cfn-service-action-association-builder
  "The cfn-service-action-association-builder function buildes out new instances of 
CfnServiceActionAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `serviceActionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-action-id` |"
  [stack id config]
  (let [builder (CfnServiceActionAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :provisioning-artifact-id)]
      (. builder provisioningArtifactId data))
    (when-let [data (lookup-entry config id :service-action-id)]
      (. builder serviceActionId data))
    (.build builder)))


(defn cfn-service-action-association-props-builder
  "The cfn-service-action-association-props-builder function buildes out new instances of 
CfnServiceActionAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `productId` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-id` |
| `provisioningArtifactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-artifact-id` |
| `serviceActionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-action-id` |"
  [stack id config]
  (let [builder (CfnServiceActionAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :product-id)]
      (. builder productId data))
    (when-let [data (lookup-entry config id :provisioning-artifact-id)]
      (. builder provisioningArtifactId data))
    (when-let [data (lookup-entry config id :service-action-id)]
      (. builder serviceActionId data))
    (.build builder)))


(defn cfn-service-action-builder
  "The cfn-service-action-builder function buildes out new instances of 
CfnServiceAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnServiceAction$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-service-action-definition-parameter-property-builder
  "The cfn-service-action-definition-parameter-property-builder function buildes out new instances of 
CfnServiceAction$DefinitionParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnServiceAction$DefinitionParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-service-action-props-builder
  "The cfn-service-action-props-builder function buildes out new instances of 
CfnServiceActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:accept-language` |
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnServiceActionProps$Builder.)]
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
    (.build builder)))


(defn cfn-stack-set-constraint-builder
  "The cfn-stack-set-constraint-builder function buildes out new instances of 
CfnStackSetConstraint$Builder using the provided configuration.  Each field is set as follows:

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
| `stackInstanceControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-instance-control` |"
  [stack id config]
  (let [builder (CfnStackSetConstraint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-stack-set-constraint-props-builder
  "The cfn-stack-set-constraint-props-builder function buildes out new instances of 
CfnStackSetConstraintProps$Builder using the provided configuration.  Each field is set as follows:

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
| `stackInstanceControl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-instance-control` |"
  [stack id config]
  (let [builder (CfnStackSetConstraintProps$Builder.)]
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
    (.build builder)))


(defn cfn-tag-option-association-builder
  "The cfn-tag-option-association-builder function buildes out new instances of 
CfnTagOptionAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tagOptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-option-id` |"
  [stack id config]
  (let [builder (CfnTagOptionAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :tag-option-id)]
      (. builder tagOptionId data))
    (.build builder)))


(defn cfn-tag-option-association-props-builder
  "The cfn-tag-option-association-props-builder function buildes out new instances of 
CfnTagOptionAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `tagOptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-option-id` |"
  [stack id config]
  (let [builder (CfnTagOptionAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :tag-option-id)]
      (. builder tagOptionId data))
    (.build builder)))


(defn cfn-tag-option-builder
  "The cfn-tag-option-builder function buildes out new instances of 
CfnTagOption$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTagOption$Builder/create stack id)]
    (when-let [data (lookup-entry config id :active)]
      (. builder active data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-tag-option-props-builder
  "The cfn-tag-option-props-builder function buildes out new instances of 
CfnTagOptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTagOptionProps$Builder.)]
    (when-let [data (lookup-entry config id :active)]
      (. builder active data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cloud-formation-product-builder
  "The cloud-formation-product-builder function buildes out new instances of 
CloudFormationProduct$Builder using the provided configuration.  Each field is set as follows:

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
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |"
  [stack id config]
  (let [builder (CloudFormationProduct$Builder/create stack id)]
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
    (.build builder)))


(defn cloud-formation-product-props-builder
  "The cloud-formation-product-props-builder function buildes out new instances of 
CloudFormationProductProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |"
  [stack id config]
  (let [builder (CloudFormationProductProps$Builder.)]
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
    (.build builder)))


(defn cloud-formation-product-version-builder
  "The cloud-formation-product-version-builder function buildes out new instances of 
CloudFormationProductVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFormationTemplate` | software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate | [[cdk.support/lookup-entry]] | `:cloud-formation-template` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `productVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:product-version-name` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |"
  [stack id config]
  (let [builder (CloudFormationProductVersion$Builder.)]
    (when-let [data (lookup-entry config id :cloud-formation-template)]
      (. builder cloudFormationTemplate data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :product-version-name)]
      (. builder productVersionName data))
    (when-let [data (lookup-entry config id :validate-template)]
      (. builder validateTemplate data))
    (.build builder)))


(defn cloud-formation-rule-constraint-options-builder
  "The cloud-formation-rule-constraint-options-builder function buildes out new instances of 
CloudFormationRuleConstraintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `rule` | software.amazon.awscdk.services.servicecatalog.TemplateRule | [[cdk.support/lookup-entry]] | `:rule` |"
  [stack id config]
  (let [builder (CloudFormationRuleConstraintOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (message-language config id :message-language)]
      (. builder messageLanguage data))
    (when-let [data (lookup-entry config id :rule)]
      (. builder rule data))
    (.build builder)))


(defn cloud-formation-template-config-builder
  "The cloud-formation-template-config-builder function buildes out new instances of 
CloudFormationTemplateConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `httpUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-url` |"
  [stack id config]
  (let [builder (CloudFormationTemplateConfig$Builder.)]
    (when-let [data (lookup-entry config id :asset-bucket)]
      (. builder assetBucket data))
    (when-let [data (lookup-entry config id :http-url)]
      (. builder httpUrl data))
    (.build builder)))


(defn common-constraint-options-builder
  "The common-constraint-options-builder function buildes out new instances of 
CommonConstraintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |"
  [stack id config]
  (let [builder (CommonConstraintOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (message-language config id :message-language)]
      (. builder messageLanguage data))
    (.build builder)))


(defn portfolio-builder
  "The portfolio-builder function buildes out new instances of 
Portfolio$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |"
  [stack id config]
  (let [builder (Portfolio$Builder/create stack id)]
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
    (.build builder)))


(defn portfolio-props-builder
  "The portfolio-props-builder function buildes out new instances of 
PortfolioProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `providerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-name` |
| `tagOptions` | software.amazon.awscdk.services.servicecatalog.TagOptions | [[cdk.support/lookup-entry]] | `:tag-options` |"
  [stack id config]
  (let [builder (PortfolioProps$Builder.)]
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
    (.build builder)))


(defn portfolio-share-options-builder
  "The portfolio-share-options-builder function buildes out new instances of 
PortfolioShareOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `shareTagOptions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:share-tag-options` |"
  [stack id config]
  (let [builder (PortfolioShareOptions$Builder.)]
    (when-let [data (message-language config id :message-language)]
      (. builder messageLanguage data))
    (when-let [data (lookup-entry config id :share-tag-options)]
      (. builder shareTagOptions data))
    (.build builder)))


(defn product-stack-builder
  "The product-stack-builder function buildes out new instances of 
ProductStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |"
  [stack id config]
  (let [builder (ProductStack$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-bucket)]
      (. builder assetBucket data))
    (when-let [data (lookup-entry config id :memory-limit)]
      (. builder memoryLimit data))
    (when-let [data (server-side-encryption config id :server-side-encryption)]
      (. builder serverSideEncryption data))
    (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
      (. builder serverSideEncryptionAwsKmsKeyId data))
    (.build builder)))


(defn product-stack-history-builder
  "The product-stack-history-builder function buildes out new instances of 
ProductStackHistory$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersionLocked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:current-version-locked` |
| `currentVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `productStack` | software.amazon.awscdk.services.servicecatalog.ProductStack | [[cdk.support/lookup-entry]] | `:product-stack` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |"
  [stack id config]
  (let [builder (ProductStackHistory$Builder/create stack id)]
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
    (.build builder)))


(defn product-stack-history-props-builder
  "The product-stack-history-props-builder function buildes out new instances of 
ProductStackHistoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersionLocked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:current-version-locked` |
| `currentVersionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `productStack` | software.amazon.awscdk.services.servicecatalog.ProductStack | [[cdk.support/lookup-entry]] | `:product-stack` |
| `validateTemplate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-template` |"
  [stack id config]
  (let [builder (ProductStackHistoryProps$Builder.)]
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
    (.build builder)))


(defn product-stack-props-builder
  "The product-stack-props-builder function buildes out new instances of 
ProductStackProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:asset-bucket` |
| `memoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit` |
| `serverSideEncryption` | software.amazon.awscdk.services.s3.deployment.ServerSideEncryption | [[cdk.api.services.s3.deployment/server-side-encryption]] | `:server-side-encryption` |
| `serverSideEncryptionAwsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-side-encryption-aws-kms-key-id` |"
  [stack id config]
  (let [builder (ProductStackProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-bucket)]
      (. builder assetBucket data))
    (when-let [data (lookup-entry config id :memory-limit)]
      (. builder memoryLimit data))
    (when-let [data (server-side-encryption config id :server-side-encryption)]
      (. builder serverSideEncryption data))
    (when-let [data (lookup-entry config id :server-side-encryption-aws-kms-key-id)]
      (. builder serverSideEncryptionAwsKmsKeyId data))
    (.build builder)))


(defn stack-sets-constraint-options-builder
  "The stack-sets-constraint-options-builder function buildes out new instances of 
StackSetsConstraintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `adminRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:admin-role` |
| `allowStackSetInstanceOperations` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-stack-set-instance-operations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-name` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |"
  [stack id config]
  (let [builder (StackSetsConstraintOptions$Builder.)]
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
    (.build builder)))


(defn tag-options-builder
  "The tag-options-builder function buildes out new instances of 
TagOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValuesForTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:allowed-values-for-tags` |"
  [stack id config]
  (let [builder (TagOptions$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-values-for-tags)]
      (. builder allowedValuesForTags data))
    (.build builder)))


(defn tag-options-props-builder
  "The tag-options-props-builder function buildes out new instances of 
TagOptionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValuesForTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:allowed-values-for-tags` |"
  [stack id config]
  (let [builder (TagOptionsProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-values-for-tags)]
      (. builder allowedValuesForTags data))
    (.build builder)))


(defn tag-update-constraint-options-builder
  "The tag-update-constraint-options-builder function buildes out new instances of 
TagUpdateConstraintOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `messageLanguage` | software.amazon.awscdk.services.servicecatalog.MessageLanguage | [[cdk.api.services.servicecatalog/message-language]] | `:message-language` |"
  [stack id config]
  (let [builder (TagUpdateConstraintOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow)]
      (. builder allow data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (message-language config id :message-language)]
      (. builder messageLanguage data))
    (.build builder)))


(defn template-rule-assertion-builder
  "The template-rule-assertion-builder function buildes out new instances of 
TemplateRuleAssertion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertValue` | software.amazon.awscdk.ICfnRuleConditionExpression | [[cdk.support/lookup-entry]] | `:assert-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (TemplateRuleAssertion$Builder.)]
    (when-let [data (lookup-entry config id :assert-value)]
      (. builder assertValue data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn template-rule-builder
  "The template-rule-builder function buildes out new instances of 
TemplateRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assertions` | java.util.List | [[cdk.support/lookup-entry]] | `:assertions` |
| `condition` | software.amazon.awscdk.ICfnRuleConditionExpression | [[cdk.support/lookup-entry]] | `:condition` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |"
  [stack id config]
  (let [builder (TemplateRule$Builder.)]
    (when-let [data (lookup-entry config id :assertions)]
      (. builder assertions data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (.build builder)))