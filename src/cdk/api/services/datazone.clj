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


(defn build-cfn-data-source-builder
  "The build-cfn-data-source-builder function updates a CfnDataSource$Builder instance using the provided configuration.
  The function takes the CfnDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSource$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-data-source-builder (CfnDataSource$Builder/create scope (name id)) id config))


(defn build-cfn-data-source-data-source-configuration-input-property-builder
  "The build-cfn-data-source-data-source-configuration-input-property-builder function updates a CfnDataSource$DataSourceConfigurationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DataSourceConfigurationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `glueRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:glue-run-configuration` |
| `redshiftRunConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redshift-run-configuration` |
"
  [^CfnDataSource$DataSourceConfigurationInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :glue-run-configuration)]
    (. builder glueRunConfiguration data))
  (when-let [data (lookup-entry config id :redshift-run-configuration)]
    (. builder redshiftRunConfiguration data))
  (.build builder))


(defn cfn-data-source-data-source-configuration-input-property-builder
  ""
  [id config]
  (build-cfn-data-source-data-source-configuration-input-property-builder (new CfnDataSource$DataSourceConfigurationInputProperty$Builder) id config))


(defn build-cfn-data-source-filter-expression-property-builder
  "The build-cfn-data-source-filter-expression-property-builder function updates a CfnDataSource$FilterExpressionProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$FilterExpressionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSource$FilterExpressionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-data-source-filter-expression-property-builder
  ""
  [id config]
  (build-cfn-data-source-filter-expression-property-builder (new CfnDataSource$FilterExpressionProperty$Builder) id config))


(defn build-cfn-data-source-form-input-property-builder
  "The build-cfn-data-source-form-input-property-builder function updates a CfnDataSource$FormInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$FormInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `formName` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-name` |
| `typeIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-identifier` |
| `typeRevision` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-revision` |
"
  [^CfnDataSource$FormInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :form-name)]
    (. builder formName data))
  (when-let [data (lookup-entry config id :type-identifier)]
    (. builder typeIdentifier data))
  (when-let [data (lookup-entry config id :type-revision)]
    (. builder typeRevision data))
  (.build builder))


(defn cfn-data-source-form-input-property-builder
  ""
  [id config]
  (build-cfn-data-source-form-input-property-builder (new CfnDataSource$FormInputProperty$Builder) id config))


(defn build-cfn-data-source-glue-run-configuration-input-property-builder
  "The build-cfn-data-source-glue-run-configuration-input-property-builder function updates a CfnDataSource$GlueRunConfigurationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$GlueRunConfigurationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoImportDataQualityResult` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-import-data-quality-result` |
| `dataAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role` |
| `relationalFilterConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:relational-filter-configurations` |
"
  [^CfnDataSource$GlueRunConfigurationInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-import-data-quality-result)]
    (. builder autoImportDataQualityResult data))
  (when-let [data (lookup-entry config id :data-access-role)]
    (. builder dataAccessRole data))
  (when-let [data (lookup-entry config id :relational-filter-configurations)]
    (. builder relationalFilterConfigurations data))
  (.build builder))


(defn cfn-data-source-glue-run-configuration-input-property-builder
  ""
  [id config]
  (build-cfn-data-source-glue-run-configuration-input-property-builder (new CfnDataSource$GlueRunConfigurationInputProperty$Builder) id config))


(defn build-cfn-data-source-props-builder
  "The build-cfn-data-source-props-builder function updates a CfnDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-props-builder
  ""
  [id config]
  (build-cfn-data-source-props-builder (new CfnDataSourceProps$Builder) id config))


(defn build-cfn-data-source-recommendation-configuration-property-builder
  "The build-cfn-data-source-recommendation-configuration-property-builder function updates a CfnDataSource$RecommendationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RecommendationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableBusinessNameGeneration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-business-name-generation` |
"
  [^CfnDataSource$RecommendationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-business-name-generation)]
    (. builder enableBusinessNameGeneration data))
  (.build builder))


(defn cfn-data-source-recommendation-configuration-property-builder
  ""
  [id config]
  (build-cfn-data-source-recommendation-configuration-property-builder (new CfnDataSource$RecommendationConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-redshift-cluster-storage-property-builder
  "The build-cfn-data-source-redshift-cluster-storage-property-builder function updates a CfnDataSource$RedshiftClusterStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RedshiftClusterStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-name` |
"
  [^CfnDataSource$RedshiftClusterStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cluster-name)]
    (. builder clusterName data))
  (.build builder))


(defn cfn-data-source-redshift-cluster-storage-property-builder
  ""
  [id config]
  (build-cfn-data-source-redshift-cluster-storage-property-builder (new CfnDataSource$RedshiftClusterStorageProperty$Builder) id config))


(defn build-cfn-data-source-redshift-credential-configuration-property-builder
  "The build-cfn-data-source-redshift-credential-configuration-property-builder function updates a CfnDataSource$RedshiftCredentialConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RedshiftCredentialConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretManagerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-manager-arn` |
"
  [^CfnDataSource$RedshiftCredentialConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :secret-manager-arn)]
    (. builder secretManagerArn data))
  (.build builder))


(defn cfn-data-source-redshift-credential-configuration-property-builder
  ""
  [id config]
  (build-cfn-data-source-redshift-credential-configuration-property-builder (new CfnDataSource$RedshiftCredentialConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-redshift-run-configuration-input-property-builder
  "The build-cfn-data-source-redshift-run-configuration-input-property-builder function updates a CfnDataSource$RedshiftRunConfigurationInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RedshiftRunConfigurationInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataAccessRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-access-role` |
| `redshiftCredentialConfiguration` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftCredentialConfigurationProperty | [[cdk.support/lookup-entry]] | `:redshift-credential-configuration` |
| `redshiftStorage` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-storage` |
| `relationalFilterConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:relational-filter-configurations` |
"
  [^CfnDataSource$RedshiftRunConfigurationInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-access-role)]
    (. builder dataAccessRole data))
  (when-let [data (lookup-entry config id :redshift-credential-configuration)]
    (. builder redshiftCredentialConfiguration data))
  (when-let [data (lookup-entry config id :redshift-storage)]
    (. builder redshiftStorage data))
  (when-let [data (lookup-entry config id :relational-filter-configurations)]
    (. builder relationalFilterConfigurations data))
  (.build builder))


(defn cfn-data-source-redshift-run-configuration-input-property-builder
  ""
  [id config]
  (build-cfn-data-source-redshift-run-configuration-input-property-builder (new CfnDataSource$RedshiftRunConfigurationInputProperty$Builder) id config))


(defn build-cfn-data-source-redshift-serverless-storage-property-builder
  "The build-cfn-data-source-redshift-serverless-storage-property-builder function updates a CfnDataSource$RedshiftServerlessStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RedshiftServerlessStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |
"
  [^CfnDataSource$RedshiftServerlessStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :workgroup-name)]
    (. builder workgroupName data))
  (.build builder))


(defn cfn-data-source-redshift-serverless-storage-property-builder
  ""
  [id config]
  (build-cfn-data-source-redshift-serverless-storage-property-builder (new CfnDataSource$RedshiftServerlessStorageProperty$Builder) id config))


(defn build-cfn-data-source-redshift-storage-property-builder
  "The build-cfn-data-source-redshift-storage-property-builder function updates a CfnDataSource$RedshiftStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RedshiftStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `redshiftClusterSource` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftClusterStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-cluster-source` |
| `redshiftServerlessSource` | software.amazon.awscdk.services.datazone.CfnDataSource$RedshiftServerlessStorageProperty | [[cdk.support/lookup-entry]] | `:redshift-serverless-source` |
"
  [^CfnDataSource$RedshiftStorageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :redshift-cluster-source)]
    (. builder redshiftClusterSource data))
  (when-let [data (lookup-entry config id :redshift-serverless-source)]
    (. builder redshiftServerlessSource data))
  (.build builder))


(defn cfn-data-source-redshift-storage-property-builder
  ""
  [id config]
  (build-cfn-data-source-redshift-storage-property-builder (new CfnDataSource$RedshiftStorageProperty$Builder) id config))


(defn build-cfn-data-source-relational-filter-configuration-property-builder
  "The build-cfn-data-source-relational-filter-configuration-property-builder function updates a CfnDataSource$RelationalFilterConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RelationalFilterConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `filterExpressions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-expressions` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
"
  [^CfnDataSource$RelationalFilterConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :filter-expressions)]
    (. builder filterExpressions data))
  (when-let [data (lookup-entry config id :schema-name)]
    (. builder schemaName data))
  (.build builder))


(defn cfn-data-source-relational-filter-configuration-property-builder
  ""
  [id config]
  (build-cfn-data-source-relational-filter-configuration-property-builder (new CfnDataSource$RelationalFilterConfigurationProperty$Builder) id config))


(defn build-cfn-data-source-schedule-configuration-property-builder
  "The build-cfn-data-source-schedule-configuration-property-builder function updates a CfnDataSource$ScheduleConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ScheduleConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^CfnDataSource$ScheduleConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-let [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn cfn-data-source-schedule-configuration-property-builder
  ""
  [id config]
  (build-cfn-data-source-schedule-configuration-property-builder (new CfnDataSource$ScheduleConfigurationProperty$Builder) id config))


(defn build-cfn-domain-builder
  "The build-cfn-domain-builder function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `singleSignOn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-sign-on` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomain$Builder builder id config]
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
  (.build builder))


(defn cfn-domain-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-builder (CfnDomain$Builder/create scope (name id)) id config))


(defn build-cfn-domain-props-builder
  "The build-cfn-domain-props-builder function updates a CfnDomainProps$Builder instance using the provided configuration.
  The function takes the CfnDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainExecutionRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-execution-role` |
| `kmsKeyIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `singleSignOn` | software.amazon.awscdk.services.datazone.CfnDomain$SingleSignOnProperty | [[cdk.support/lookup-entry]] | `:single-sign-on` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDomainProps$Builder builder id config]
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
  (.build builder))


(defn cfn-domain-props-builder
  ""
  [id config]
  (build-cfn-domain-props-builder (new CfnDomainProps$Builder) id config))


(defn build-cfn-domain-single-sign-on-property-builder
  "The build-cfn-domain-single-sign-on-property-builder function updates a CfnDomain$SingleSignOnProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$SingleSignOnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `userAssignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-assignment` |
"
  [^CfnDomain$SingleSignOnProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :user-assignment)]
    (. builder userAssignment data))
  (.build builder))


(defn cfn-domain-single-sign-on-property-builder
  ""
  [id config]
  (build-cfn-domain-single-sign-on-property-builder (new CfnDomain$SingleSignOnProperty$Builder) id config))


(defn build-cfn-environment-blueprint-configuration-builder
  "The build-cfn-environment-blueprint-configuration-builder function updates a CfnEnvironmentBlueprintConfiguration$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentBlueprintConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enabledRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-regions` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `manageAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role-arn` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `regionalParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regional-parameters` |
"
  [^CfnEnvironmentBlueprintConfiguration$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-blueprint-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-blueprint-configuration-builder (CfnEnvironmentBlueprintConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-environment-blueprint-configuration-props-builder
  "The build-cfn-environment-blueprint-configuration-props-builder function updates a CfnEnvironmentBlueprintConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentBlueprintConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `enabledRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:enabled-regions` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `manageAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:manage-access-role-arn` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `regionalParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:regional-parameters` |
"
  [^CfnEnvironmentBlueprintConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-blueprint-configuration-props-builder
  ""
  [id config]
  (build-cfn-environment-blueprint-configuration-props-builder (new CfnEnvironmentBlueprintConfigurationProps$Builder) id config))


(defn build-cfn-environment-blueprint-configuration-regional-parameter-property-builder
  "The build-cfn-environment-blueprint-configuration-regional-parameter-property-builder function updates a CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-environment-blueprint-configuration-regional-parameter-property-builder
  ""
  [id config]
  (build-cfn-environment-blueprint-configuration-regional-parameter-property-builder (new CfnEnvironmentBlueprintConfiguration$RegionalParameterProperty$Builder) id config))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-profile-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |
"
  [^CfnEnvironment$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-builder (CfnEnvironment$Builder/create scope (name id)) id config))


(defn build-cfn-environment-environment-parameter-property-builder
  "The build-cfn-environment-environment-parameter-property-builder function updates a CfnEnvironment$EnvironmentParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$EnvironmentParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnvironment$EnvironmentParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-environment-environment-parameter-property-builder
  ""
  [id config]
  (build-cfn-environment-environment-parameter-property-builder (new CfnEnvironment$EnvironmentParameterProperty$Builder) id config))


(defn build-cfn-environment-profile-builder
  "The build-cfn-environment-profile-builder function updates a CfnEnvironmentProfile$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsAccountRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-region` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:user-parameters` |
"
  [^CfnEnvironmentProfile$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-environment-profile-builder (CfnEnvironmentProfile$Builder/create scope (name id)) id config))


(defn build-cfn-environment-profile-environment-parameter-property-builder
  "The build-cfn-environment-profile-environment-parameter-property-builder function updates a CfnEnvironmentProfile$EnvironmentParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProfile$EnvironmentParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnvironmentProfile$EnvironmentParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-environment-profile-environment-parameter-property-builder
  ""
  [id config]
  (build-cfn-environment-profile-environment-parameter-property-builder (new CfnEnvironmentProfile$EnvironmentParameterProperty$Builder) id config))


(defn build-cfn-environment-profile-props-builder
  "The build-cfn-environment-profile-props-builder function updates a CfnEnvironmentProfileProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsAccountRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-region` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentBlueprintIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-blueprint-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |
"
  [^CfnEnvironmentProfileProps$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-profile-props-builder
  ""
  [id config]
  (build-cfn-environment-profile-props-builder (new CfnEnvironmentProfileProps$Builder) id config))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `environmentProfileIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-profile-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
| `userParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-parameters` |
"
  [^CfnEnvironmentProps$Builder builder id config]
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
  (.build builder))


(defn cfn-environment-props-builder
  ""
  [id config]
  (build-cfn-environment-props-builder (new CfnEnvironmentProps$Builder) id config))


(defn build-cfn-group-profile-builder
  "The build-cfn-group-profile-builder function updates a CfnGroupProfile$Builder instance using the provided configuration.
  The function takes the CfnGroupProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnGroupProfile$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :group-identifier)]
    (. builder groupIdentifier data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-group-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-group-profile-builder (CfnGroupProfile$Builder/create scope (name id)) id config))


(defn build-cfn-group-profile-props-builder
  "The build-cfn-group-profile-props-builder function updates a CfnGroupProfileProps$Builder instance using the provided configuration.
  The function takes the CfnGroupProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnGroupProfileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :group-identifier)]
    (. builder groupIdentifier data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-group-profile-props-builder
  ""
  [id config]
  (build-cfn-group-profile-props-builder (new CfnGroupProfileProps$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnProject$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :glossary-terms)]
    (. builder glossaryTerms data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-project-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-membership-builder
  "The build-cfn-project-membership-builder function updates a CfnProjectMembership$Builder instance using the provided configuration.
  The function takes the CfnProjectMembership$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `designation` | java.lang.String | [[cdk.support/lookup-entry]] | `:designation` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `member` | software.amazon.awscdk.services.datazone.CfnProjectMembership$MemberProperty | [[cdk.support/lookup-entry]] | `:member` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
"
  [^CfnProjectMembership$Builder builder id config]
  (when-let [data (lookup-entry config id :designation)]
    (. builder designation data))
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :member)]
    (. builder member data))
  (when-let [data (lookup-entry config id :project-identifier)]
    (. builder projectIdentifier data))
  (.build builder))


(defn cfn-project-membership-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-project-membership-builder (CfnProjectMembership$Builder/create scope (name id)) id config))


(defn build-cfn-project-membership-member-property-builder
  "The build-cfn-project-membership-member-property-builder function updates a CfnProjectMembership$MemberProperty$Builder instance using the provided configuration.
  The function takes the CfnProjectMembership$MemberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-identifier` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |
"
  [^CfnProjectMembership$MemberProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-identifier)]
    (. builder groupIdentifier data))
  (when-let [data (lookup-entry config id :user-identifier)]
    (. builder userIdentifier data))
  (.build builder))


(defn cfn-project-membership-member-property-builder
  ""
  [id config]
  (build-cfn-project-membership-member-property-builder (new CfnProjectMembership$MemberProperty$Builder) id config))


(defn build-cfn-project-membership-props-builder
  "The build-cfn-project-membership-props-builder function updates a CfnProjectMembershipProps$Builder instance using the provided configuration.
  The function takes the CfnProjectMembershipProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `designation` | java.lang.String | [[cdk.support/lookup-entry]] | `:designation` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `member` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:member` |
| `projectIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-identifier` |
"
  [^CfnProjectMembershipProps$Builder builder id config]
  (when-let [data (lookup-entry config id :designation)]
    (. builder designation data))
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :member)]
    (. builder member data))
  (when-let [data (lookup-entry config id :project-identifier)]
    (. builder projectIdentifier data))
  (.build builder))


(defn cfn-project-membership-props-builder
  ""
  [id config]
  (build-cfn-project-membership-props-builder (new CfnProjectMembershipProps$Builder) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `glossaryTerms` | java.util.List | [[cdk.support/lookup-entry]] | `:glossary-terms` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :glossary-terms)]
    (. builder glossaryTerms data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-project-props-builder
  ""
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))


(defn build-cfn-subscription-target-builder
  "The build-cfn-subscription-target-builder function updates a CfnSubscriptionTarget$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSubscriptionTarget$Builder builder id config]
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
  (.build builder))


(defn cfn-subscription-target-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-subscription-target-builder (CfnSubscriptionTarget$Builder/create scope (name id)) id config))


(defn build-cfn-subscription-target-props-builder
  "The build-cfn-subscription-target-props-builder function updates a CfnSubscriptionTargetProps$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSubscriptionTargetProps$Builder builder id config]
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
  (.build builder))


(defn cfn-subscription-target-props-builder
  ""
  [id config]
  (build-cfn-subscription-target-props-builder (new CfnSubscriptionTargetProps$Builder) id config))


(defn build-cfn-subscription-target-subscription-target-form-property-builder
  "The build-cfn-subscription-target-subscription-target-form-property-builder function updates a CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder instance using the provided configuration.
  The function takes the CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `formName` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-name` |
"
  [^CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :form-name)]
    (. builder formName data))
  (.build builder))


(defn cfn-subscription-target-subscription-target-form-property-builder
  ""
  [id config]
  (build-cfn-subscription-target-subscription-target-form-property-builder (new CfnSubscriptionTarget$SubscriptionTargetFormProperty$Builder) id config))


(defn build-cfn-user-profile-builder
  "The build-cfn-user-profile-builder function updates a CfnUserProfile$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |
| `userType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-type` |
"
  [^CfnUserProfile$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :user-identifier)]
    (. builder userIdentifier data))
  (when-let [data (lookup-entry config id :user-type)]
    (. builder userType data))
  (.build builder))


(defn cfn-user-profile-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-user-profile-builder (CfnUserProfile$Builder/create scope (name id)) id config))


(defn build-cfn-user-profile-iam-user-profile-details-property-builder
  "The build-cfn-user-profile-iam-user-profile-details-property-builder function updates a CfnUserProfile$IamUserProfileDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$IamUserProfileDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnUserProfile$IamUserProfileDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-user-profile-iam-user-profile-details-property-builder
  ""
  [id config]
  (build-cfn-user-profile-iam-user-profile-details-property-builder (new CfnUserProfile$IamUserProfileDetailsProperty$Builder) id config))


(defn build-cfn-user-profile-props-builder
  "The build-cfn-user-profile-props-builder function updates a CfnUserProfileProps$Builder instance using the provided configuration.
  The function takes the CfnUserProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `userIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-identifier` |
| `userType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-type` |
"
  [^CfnUserProfileProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-identifier)]
    (. builder domainIdentifier data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :user-identifier)]
    (. builder userIdentifier data))
  (when-let [data (lookup-entry config id :user-type)]
    (. builder userType data))
  (.build builder))


(defn cfn-user-profile-props-builder
  ""
  [id config]
  (build-cfn-user-profile-props-builder (new CfnUserProfileProps$Builder) id config))


(defn build-cfn-user-profile-sso-user-profile-details-property-builder
  "The build-cfn-user-profile-sso-user-profile-details-property-builder function updates a CfnUserProfile$SsoUserProfileDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$SsoUserProfileDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnUserProfile$SsoUserProfileDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :first-name)]
    (. builder firstName data))
  (when-let [data (lookup-entry config id :last-name)]
    (. builder lastName data))
  (when-let [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-user-profile-sso-user-profile-details-property-builder
  ""
  [id config]
  (build-cfn-user-profile-sso-user-profile-details-property-builder (new CfnUserProfile$SsoUserProfileDetailsProperty$Builder) id config))


(defn build-cfn-user-profile-user-profile-details-property-builder
  "The build-cfn-user-profile-user-profile-details-property-builder function updates a CfnUserProfile$UserProfileDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$UserProfileDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iam` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam` |
| `sso` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sso` |
"
  [^CfnUserProfile$UserProfileDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :iam)]
    (. builder iam data))
  (when-let [data (lookup-entry config id :sso)]
    (. builder sso data))
  (.build builder))


(defn cfn-user-profile-user-profile-details-property-builder
  ""
  [id config]
  (build-cfn-user-profile-user-profile-details-property-builder (new CfnUserProfile$UserProfileDetailsProperty$Builder) id config))