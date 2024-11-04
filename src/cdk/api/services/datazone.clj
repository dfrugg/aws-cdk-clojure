(ns cdk.api.services.datazone
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.datazone package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.datazone CfnDataSource$Builder
                                                     CfnDataSource$DataSourceConfigurationInputProperty$Builder
                                                     CfnDataSource$FilterExpressionProperty$Builder
                                                     CfnDataSource$FormInputProperty$Builder
                                                     CfnDataSource$GlueRunConfigurationInputProperty$Builder
                                                     CfnDataSource$RecommendationConfigurationProperty$Builder
                                                     CfnDataSource$RedshiftClusterStorageProperty$Builder
                                                     CfnDataSource$RedshiftCredentialConfigurationProperty$Builder
                                                     CfnDataSource$RedshiftRunConfigurationInputProperty$Builder
                                                     CfnDataSource$RedshiftServerlessStorageProperty$Builder
                                                     CfnDataSource$RedshiftStorageProperty$Builder
                                                     CfnDataSource$RelationalFilterConfigurationProperty$Builder
                                                     CfnDataSource$ScheduleConfigurationProperty$Builder
                                                     CfnDataSourceProps$Builder
                                                     CfnDomain$Builder
                                                     CfnDomain$SingleSignOnProperty$Builder
                                                     CfnDomainProps$Builder
                                                     CfnEnvironment$Builder
                                                     CfnEnvironment$EnvironmentParameterProperty$Builder
                                                     CfnEnvironmentBlueprintConfiguration$Builder
                                                     CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder
                                                     CfnEnvironmentBlueprintConfigurationProps$Builder
                                                     CfnEnvironmentProfile$Builder
                                                     CfnEnvironmentProfile$EnvironmentParameterProperty$Builder
                                                     CfnEnvironmentProfileProps$Builder
                                                     CfnEnvironmentProps$Builder
                                                     CfnGroupProfile$Builder
                                                     CfnGroupProfileProps$Builder
                                                     CfnProject$Builder
                                                     CfnProjectMembership$Builder
                                                     CfnProjectMembership$MemberProperty$Builder
                                                     CfnProjectMembershipProps$Builder
                                                     CfnProjectProps$Builder
                                                     CfnSubscriptionTarget$Builder
                                                     CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder
                                                     CfnSubscriptionTargetProps$Builder
                                                     CfnUserProfile$Builder
                                                     CfnUserProfile$IamUserProfileDetailsProperty$Builder
                                                     CfnUserProfile$SsoUserProfileDetailsProperty$Builder
                                                     CfnUserProfile$UserProfileDetailsProperty$Builder
                                                     CfnUserProfileProps$Builder]))


(defn cfn-data-source-builder
  "The cfn-data-source-builder function buildes out new instances of 
CfnDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetFormsInput` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-forms-input` |
| `configuration` | software.amazon.awscdk.services.datazone.CfnDataSource$DataSourceConfigurationInputProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enableSetting` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-setting` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `publishOnImport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish-on-import` |
| `recommendation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recommendation` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-forms-input)]
      (. builder assetFormsInput data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :enable-setting)]
      (. builder enableSetting data))
    (when-let [data (lookup-entry config id :environment-identifier)]
      (. builder environmentIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :publish-on-import)]
      (. builder publishOnImport data))
    (when-let [data (lookup-entry config id :recommendation)]
      (. builder recommendation data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-data-source-configuration-input-property-builder
  "The cfn-data-source-data-source-configuration-input-property-builder function buildes out new instances of 
CfnDataSource$DataSourceConfigurationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-run-configuration` |
| `redshiftRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-run-configuration` |"
  [stack id config]
  (let [builder (CfnDataSource$DataSourceConfigurationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :glue-run-configuration)]
      (. builder glueRunConfiguration data))
    (when-let [data (lookup-entry config id :redshift-run-configuration)]
      (. builder redshiftRunConfiguration data))
    (.build builder)))


(defn cfn-data-source-filter-expression-property-builder
  "The cfn-data-source-filter-expression-property-builder function buildes out new instances of 
CfnDataSource$FilterExpressionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSource$FilterExpressionProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-form-input-property-builder
  "The cfn-data-source-form-input-property-builder function buildes out new instances of 
CfnDataSource$FormInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `formName` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-name` |
| `typeIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-identifier` |
| `typeRevision` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-revision` |"
  [stack id config]
  (let [builder (CfnDataSource$FormInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :form-name)]
      (. builder formName data))
    (when-let [data (lookup-entry config id :type-identifier)]
      (. builder typeIdentifier data))
    (when-let [data (lookup-entry config id :type-revision)]
      (. builder typeRevision data))
    (.build builder)))


(defn cfn-data-source-glue-run-configuration-input-property-builder
  "The cfn-data-source-glue-run-configuration-input-property-builder function buildes out new instances of 
CfnDataSource$GlueRunConfigurationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoImportDataQualityResult` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-import-data-quality-result` |
| `dataAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role` |
| `relationalFilterConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:relational-filter-configurations` |"
  [stack id config]
  (let [builder (CfnDataSource$GlueRunConfigurationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-import-data-quality-result)]
      (. builder autoImportDataQualityResult data))
    (when-let [data (lookup-entry config id :data-access-role)]
      (. builder dataAccessRole data))
    (when-let [data (lookup-entry config id :relational-filter-configurations)]
      (. builder relationalFilterConfigurations data))
    (.build builder)))


(defn cfn-data-source-props-builder
  "The cfn-data-source-props-builder function buildes out new instances of 
CfnDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetFormsInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-forms-input` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enableSetting` | java.lang.String | [[cdk.support/lookup-entry]] | `:enable-setting` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `publishOnImport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-on-import` |
| `recommendation` | software.amazon.awscdk.services.datazone.CfnDataSource$RecommendationConfigurationProperty | [[cdk.support/lookup-entry]] | `:recommendation` |
| `schedule` | software.amazon.awscdk.services.datazone.CfnDataSource$ScheduleConfigurationProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-forms-input)]
      (. builder assetFormsInput data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :enable-setting)]
      (. builder enableSetting data))
    (when-let [data (lookup-entry config id :environment-identifier)]
      (. builder environmentIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :publish-on-import)]
      (. builder publishOnImport data))
    (when-let [data (lookup-entry config id :recommendation)]
      (. builder recommendation data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-recommendation-configuration-property-builder
  "The cfn-data-source-recommendation-configuration-property-builder function buildes out new instances of 
CfnDataSource$RecommendationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableBusinessNameGeneration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-business-name-generation` |"
  [stack id config]
  (let [builder (CfnDataSource$RecommendationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-business-name-generation)]
      (. builder enableBusinessNameGeneration data))
    (.build builder)))


(defn cfn-data-source-redshift-cluster-storage-property-builder
  "The cfn-data-source-redshift-cluster-storage-property-builder function buildes out new instances of 
CfnDataSource$RedshiftClusterStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |"
  [stack id config]
  (let [builder (CfnDataSource$RedshiftClusterStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-name)]
      (. builder clusterName data))
    (.build builder)))


(defn cfn-data-source-redshift-credential-configuration-property-builder
  "The cfn-data-source-redshift-credential-configuration-property-builder function buildes out new instances of 
CfnDataSource$RedshiftCredentialConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$RedshiftCredentialConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :secret-manager-arn)]
      (. builder secretManagerArn data))
    (.build builder)))


(defn cfn-data-source-redshift-run-configuration-input-property-builder
  "The cfn-data-source-redshift-run-configuration-input-property-builder function buildes out new instances of 
CfnDataSource$RedshiftRunConfigurationInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role` |
| `redshiftCredentialConfiguration` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftCredentialConfigurationProperty | [[cdk.support/lookup-entry]] | `:redshift-credential-configuration` |
| `redshiftStorage` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-storage` |
| `relationalFilterConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:relational-filter-configurations` |"
  [stack id config]
  (let [builder (CfnDataSource$RedshiftRunConfigurationInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-access-role)]
      (. builder dataAccessRole data))
    (when-let [data (lookup-entry config id :redshift-credential-configuration)]
      (. builder redshiftCredentialConfiguration data))
    (when-let [data (lookup-entry config id :redshift-storage)]
      (. builder redshiftStorage data))
    (when-let [data (lookup-entry config id :relational-filter-configurations)]
      (. builder relationalFilterConfigurations data))
    (.build builder)))


(defn cfn-data-source-redshift-serverless-storage-property-builder
  "The cfn-data-source-redshift-serverless-storage-property-builder function buildes out new instances of 
CfnDataSource$RedshiftServerlessStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |"
  [stack id config]
  (let [builder (CfnDataSource$RedshiftServerlessStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :workgroup-name)]
      (. builder workgroupName data))
    (.build builder)))


(defn cfn-data-source-redshift-storage-property-builder
  "The cfn-data-source-redshift-storage-property-builder function buildes out new instances of 
CfnDataSource$RedshiftStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `redshiftClusterSource` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftClusterStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-cluster-source` |
| `redshiftServerlessSource` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftServerlessStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-serverless-source` |"
  [stack id config]
  (let [builder (CfnDataSource$RedshiftStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :redshift-cluster-source)]
      (. builder redshiftClusterSource data))
    (when-let [data (lookup-entry config id :redshift-serverless-source)]
      (. builder redshiftServerlessSource data))
    (.build builder)))


(defn cfn-data-source-relational-filter-configuration-property-builder
  "The cfn-data-source-relational-filter-configuration-property-builder function buildes out new instances of 
CfnDataSource$RelationalFilterConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `filterExpressions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-expressions` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |"
  [stack id config]
  (let [builder (CfnDataSource$RelationalFilterConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :filter-expressions)]
      (. builder filterExpressions data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (.build builder)))


(defn cfn-data-source-schedule-configuration-property-builder
  "The cfn-data-source-schedule-configuration-property-builder function buildes out new instances of 
CfnDataSource$ScheduleConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |"
  [stack id config]
  (let [builder (CfnDataSource$ScheduleConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `singleSignOn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-sign-on` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-execution-role)]
      (. builder domainExecutionRole data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :single-sign-on)]
      (. builder singleSignOn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `singleSignOn` | software.amazon.awscdk.services.datazone.CfnDomain$SingleSignOnProperty | [[cdk.support/lookup-entry]] | `:single-sign-on` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-execution-role)]
      (. builder domainExecutionRole data))
    (when-let [data (lookup-entry config id :kms-key-identifier)]
      (. builder kmsKeyIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :single-sign-on)]
      (. builder singleSignOn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-single-sign-on-property-builder
  "The cfn-domain-single-sign-on-property-builder function buildes out new instances of 
CfnDomain$SingleSignOnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `userAssignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-assignment` |"
  [stack id config]
  (let [builder (CfnDomain$SingleSignOnProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :user-assignment)]
      (. builder userAssignment data))
    (.build builder)))


(defn cfn-environment-blueprint-configuration-builder
  "The cfn-environment-blueprint-configuration-builder function buildes out new instances of 
CfnEnvironmentBlueprintConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enabledRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-regions` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `manageAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role-arn` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `regionalParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regional-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironmentBlueprintConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :enabled-regions)]
      (. builder enabledRegions data))
    (when-let [data (lookup-entry config id :environment-blueprint-identifier)]
      (. builder environmentBlueprintIdentifier data))
    (when-let [data (lookup-entry config id :manage-access-role-arn)]
      (. builder manageAccessRoleArn data))
    (when-let [data (lookup-entry config id :provisioning-role-arn)]
      (. builder provisioningRoleArn data))
    (when-let [data (lookup-entry config id :regional-parameters)]
      (. builder regionalParameters data))
    (.build builder)))


(defn cfn-environment-blueprint-configuration-props-builder
  "The cfn-environment-blueprint-configuration-props-builder function buildes out new instances of 
CfnEnvironmentBlueprintConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enabledRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-regions` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `manageAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role-arn` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `regionalParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:regional-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironmentBlueprintConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :enabled-regions)]
      (. builder enabledRegions data))
    (when-let [data (lookup-entry config id :environment-blueprint-identifier)]
      (. builder environmentBlueprintIdentifier data))
    (when-let [data (lookup-entry config id :manage-access-role-arn)]
      (. builder manageAccessRoleArn data))
    (when-let [data (lookup-entry config id :provisioning-role-arn)]
      (. builder provisioningRoleArn data))
    (when-let [data (lookup-entry config id :regional-parameters)]
      (. builder regionalParameters data))
    (.build builder)))


(defn cfn-environment-blueprint-configuration-regional-parameter-property-builder
  "The cfn-environment-blueprint-configuration-regional-parameter-property-builder function buildes out new instances of 
CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-profile-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-profile-identifier)]
      (. builder environmentProfileIdentifier data))
    (when-let [data (lookup-entry config id :glossary-terms)]
      (. builder glossaryTerms data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (.build builder)))


(defn cfn-environment-environment-parameter-property-builder
  "The cfn-environment-environment-parameter-property-builder function buildes out new instances of 
CfnEnvironment$EnvironmentParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEnvironment$EnvironmentParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-environment-profile-builder
  "The cfn-environment-profile-builder function buildes out new instances of 
CfnEnvironmentProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsAccountRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-region` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:user-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironmentProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :aws-account-region)]
      (. builder awsAccountRegion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-blueprint-identifier)]
      (. builder environmentBlueprintIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (.build builder)))


(defn cfn-environment-profile-environment-parameter-property-builder
  "The cfn-environment-profile-environment-parameter-property-builder function buildes out new instances of 
CfnEnvironmentProfile$EnvironmentParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEnvironmentProfile$EnvironmentParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-environment-profile-props-builder
  "The cfn-environment-profile-props-builder function buildes out new instances of 
CfnEnvironmentProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsAccountRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-region` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironmentProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :aws-account-region)]
      (. builder awsAccountRegion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-blueprint-identifier)]
      (. builder environmentBlueprintIdentifier data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-profile-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-profile-identifier)]
      (. builder environmentProfileIdentifier data))
    (when-let [data (lookup-entry config id :glossary-terms)]
      (. builder glossaryTerms data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (when-let [data (lookup-entry config id :user-parameters)]
      (. builder userParameters data))
    (.build builder)))


(defn cfn-group-profile-builder
  "The cfn-group-profile-builder function buildes out new instances of 
CfnGroupProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnGroupProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :group-identifier)]
      (. builder groupIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-group-profile-props-builder
  "The cfn-group-profile-props-builder function buildes out new instances of 
CfnGroupProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnGroupProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :group-identifier)]
      (. builder groupIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :glossary-terms)]
      (. builder glossaryTerms data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-project-membership-builder
  "The cfn-project-membership-builder function buildes out new instances of 
CfnProjectMembership$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `designation` | java.lang.String | [[cdk.support/lookup-entry]] | `:designation` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `member` | software.amazon.awscdk.services.datazone.CfnProjectMembership$MemberProperty | [[cdk.support/lookup-entry]] | `:member` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |"
  [stack id config]
  (let [builder (CfnProjectMembership$Builder/create stack id)]
    (when-let [data (lookup-entry config id :designation)]
      (. builder designation data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :member)]
      (. builder member data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (.build builder)))


(defn cfn-project-membership-member-property-builder
  "The cfn-project-membership-member-property-builder function buildes out new instances of 
CfnProjectMembership$MemberProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |"
  [stack id config]
  (let [builder (CfnProjectMembership$MemberProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-identifier)]
      (. builder groupIdentifier data))
    (when-let [data (lookup-entry config id :user-identifier)]
      (. builder userIdentifier data))
    (.build builder)))


(defn cfn-project-membership-props-builder
  "The cfn-project-membership-props-builder function buildes out new instances of 
CfnProjectMembershipProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `designation` | java.lang.String | [[cdk.support/lookup-entry]] | `:designation` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `member` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |"
  [stack id config]
  (let [builder (CfnProjectMembershipProps$Builder.)]
    (when-let [data (lookup-entry config id :designation)]
      (. builder designation data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :member)]
      (. builder member data))
    (when-let [data (lookup-entry config id :project-identifier)]
      (. builder projectIdentifier data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :glossary-terms)]
      (. builder glossaryTerms data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-subscription-target-builder
  "The cfn-subscription-target-builder function buildes out new instances of 
CfnSubscriptionTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicableAssetTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:applicable-asset-types` |
| `authorizedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:authorized-principals` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `manageAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `subscriptionTargetConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:subscription-target-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSubscriptionTarget$Builder/create stack id)]
    (when-let [data (lookup-entry config id :applicable-asset-types)]
      (. builder applicableAssetTypes data))
    (when-let [data (lookup-entry config id :authorized-principals)]
      (. builder authorizedPrincipals data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-identifier)]
      (. builder environmentIdentifier data))
    (when-let [data (lookup-entry config id :manage-access-role)]
      (. builder manageAccessRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :subscription-target-config)]
      (. builder subscriptionTargetConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-subscription-target-props-builder
  "The cfn-subscription-target-props-builder function buildes out new instances of 
CfnSubscriptionTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicableAssetTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:applicable-asset-types` |
| `authorizedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:authorized-principals` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `manageAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `subscriptionTargetConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:subscription-target-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSubscriptionTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :applicable-asset-types)]
      (. builder applicableAssetTypes data))
    (when-let [data (lookup-entry config id :authorized-principals)]
      (. builder authorizedPrincipals data))
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :environment-identifier)]
      (. builder environmentIdentifier data))
    (when-let [data (lookup-entry config id :manage-access-role)]
      (. builder manageAccessRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :provider)]
      (. builder provider data))
    (when-let [data (lookup-entry config id :subscription-target-config)]
      (. builder subscriptionTargetConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-subscription-target-subscription-target-form-property-builder
  "The cfn-subscription-target-subscription-target-form-property-builder function buildes out new instances of 
CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `formName` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-name` |"
  [stack id config]
  (let [builder (CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :form-name)]
      (. builder formName data))
    (.build builder)))


(defn cfn-user-profile-builder
  "The cfn-user-profile-builder function buildes out new instances of 
CfnUserProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |
| `userType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-type` |"
  [stack id config]
  (let [builder (CfnUserProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user-identifier)]
      (. builder userIdentifier data))
    (when-let [data (lookup-entry config id :user-type)]
      (. builder userType data))
    (.build builder)))


(defn cfn-user-profile-iam-user-profile-details-property-builder
  "The cfn-user-profile-iam-user-profile-details-property-builder function buildes out new instances of 
CfnUserProfile$IamUserProfileDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnUserProfile$IamUserProfileDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-user-profile-props-builder
  "The cfn-user-profile-props-builder function buildes out new instances of 
CfnUserProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |
| `userType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-type` |"
  [stack id config]
  (let [builder (CfnUserProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-identifier)]
      (. builder domainIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :user-identifier)]
      (. builder userIdentifier data))
    (when-let [data (lookup-entry config id :user-type)]
      (. builder userType data))
    (.build builder)))


(defn cfn-user-profile-sso-user-profile-details-property-builder
  "The cfn-user-profile-sso-user-profile-details-property-builder function buildes out new instances of 
CfnUserProfile$SsoUserProfileDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnUserProfile$SsoUserProfileDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :first-name)]
      (. builder firstName data))
    (when-let [data (lookup-entry config id :last-name)]
      (. builder lastName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-user-profile-user-profile-details-property-builder
  "The cfn-user-profile-user-profile-details-property-builder function buildes out new instances of 
CfnUserProfile$UserProfileDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam` |
| `sso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sso` |"
  [stack id config]
  (let [builder (CfnUserProfile$UserProfileDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam)]
      (. builder iam data))
    (when-let [data (lookup-entry config id :sso)]
      (. builder sso data))
    (.build builder)))