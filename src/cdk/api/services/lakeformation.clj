(ns cdk.api.services.lakeformation
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lakeformation package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lakeformation CfnDataCellsFilter$Builder
                                                          CfnDataCellsFilter$ColumnWildcardProperty$Builder
                                                          CfnDataCellsFilter$RowFilterProperty$Builder
                                                          CfnDataCellsFilterProps$Builder
                                                          CfnDataLakeSettings$Builder
                                                          CfnDataLakeSettings$DataLakePrincipalProperty$Builder
                                                          CfnDataLakeSettings$PrincipalPermissionsProperty$Builder
                                                          CfnDataLakeSettingsProps$Builder
                                                          CfnPermissions$Builder
                                                          CfnPermissions$ColumnWildcardProperty$Builder
                                                          CfnPermissions$DataLakePrincipalProperty$Builder
                                                          CfnPermissions$DataLocationResourceProperty$Builder
                                                          CfnPermissions$DatabaseResourceProperty$Builder
                                                          CfnPermissions$ResourceProperty$Builder
                                                          CfnPermissions$TableResourceProperty$Builder
                                                          CfnPermissions$TableWildcardProperty$Builder
                                                          CfnPermissions$TableWithColumnsResourceProperty$Builder
                                                          CfnPermissionsProps$Builder
                                                          CfnPrincipalPermissions$Builder
                                                          CfnPrincipalPermissions$ColumnWildcardProperty$Builder
                                                          CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder
                                                          CfnPrincipalPermissions$DataLakePrincipalProperty$Builder
                                                          CfnPrincipalPermissions$DataLocationResourceProperty$Builder
                                                          CfnPrincipalPermissions$DatabaseResourceProperty$Builder
                                                          CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder
                                                          CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder
                                                          CfnPrincipalPermissions$LFTagProperty$Builder
                                                          CfnPrincipalPermissions$ResourceProperty$Builder
                                                          CfnPrincipalPermissions$TableResourceProperty$Builder
                                                          CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder
                                                          CfnPrincipalPermissionsProps$Builder
                                                          CfnResource$Builder
                                                          CfnResourceProps$Builder
                                                          CfnTag$Builder
                                                          CfnTagAssociation$Builder
                                                          CfnTagAssociation$DatabaseResourceProperty$Builder
                                                          CfnTagAssociation$LFTagPairProperty$Builder
                                                          CfnTagAssociation$ResourceProperty$Builder
                                                          CfnTagAssociation$TableResourceProperty$Builder
                                                          CfnTagAssociation$TableWithColumnsResourceProperty$Builder
                                                          CfnTagAssociationProps$Builder
                                                          CfnTagProps$Builder]))


(defn build-cfn-data-cells-filter-builder
  "The build-cfn-data-cells-filter-builder function updates a CfnDataCellsFilter$Builder instance using the provided configuration.
  The function takes the CfnDataCellsFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:row-filter` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDataCellsFilter$Builder builder id config]
  (when-let [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-let [data (lookup-entry config id :column-wildcard)]
    (. builder columnWildcard data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :row-filter)]
    (. builder rowFilter data))
  (when-let [data (lookup-entry config id :table-catalog-id)]
    (. builder tableCatalogId data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn build-cfn-data-cells-filter-column-wildcard-property-builder
  "The build-cfn-data-cells-filter-column-wildcard-property-builder function updates a CfnDataCellsFilter$ColumnWildcardProperty$Builder instance using the provided configuration.
  The function takes the CfnDataCellsFilter$ColumnWildcardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |
"
  [^CfnDataCellsFilter$ColumnWildcardProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded-column-names)]
    (. builder excludedColumnNames data))
  (.build builder))


(defn build-cfn-data-cells-filter-props-builder
  "The build-cfn-data-cells-filter-props-builder function updates a CfnDataCellsFilterProps$Builder instance using the provided configuration.
  The function takes the CfnDataCellsFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowFilter` | software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter$RowFilterProperty | [[cdk.support/lookup-entry]] | `:row-filter` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnDataCellsFilterProps$Builder builder id config]
  (when-let [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-let [data (lookup-entry config id :column-wildcard)]
    (. builder columnWildcard data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :row-filter)]
    (. builder rowFilter data))
  (when-let [data (lookup-entry config id :table-catalog-id)]
    (. builder tableCatalogId data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn build-cfn-data-cells-filter-row-filter-property-builder
  "The build-cfn-data-cells-filter-row-filter-property-builder function updates a CfnDataCellsFilter$RowFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnDataCellsFilter$RowFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allRowsWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all-rows-wildcard` |
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |
"
  [^CfnDataCellsFilter$RowFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all-rows-wildcard)]
    (. builder allRowsWildcard data))
  (when-let [data (lookup-entry config id :filter-expression)]
    (. builder filterExpression data))
  (.build builder))


(defn build-cfn-data-lake-settings-builder
  "The build-cfn-data-lake-settings-builder function updates a CfnDataLakeSettings$Builder instance using the provided configuration.
  The function takes the CfnDataLakeSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admins` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:admins` |
| `allowExternalDataFiltering` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-external-data-filtering` |
| `allowFullTableExternalDataAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-full-table-external-data-access` |
| `authorizedSessionTagValueList` | java.util.List | [[cdk.support/lookup-entry]] | `:authorized-session-tag-value-list` |
| `createDatabaseDefaultPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-database-default-permissions` |
| `createTableDefaultPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-table-default-permissions` |
| `externalDataFilteringAllowList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:external-data-filtering-allow-list` |
| `mutationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-type` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `trustedResourceOwners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-resource-owners` |
"
  [^CfnDataLakeSettings$Builder builder id config]
  (when-let [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-let [data (lookup-entry config id :allow-external-data-filtering)]
    (. builder allowExternalDataFiltering data))
  (when-let [data (lookup-entry config id :allow-full-table-external-data-access)]
    (. builder allowFullTableExternalDataAccess data))
  (when-let [data (lookup-entry config id :authorized-session-tag-value-list)]
    (. builder authorizedSessionTagValueList data))
  (when-let [data (lookup-entry config id :create-database-default-permissions)]
    (. builder createDatabaseDefaultPermissions data))
  (when-let [data (lookup-entry config id :create-table-default-permissions)]
    (. builder createTableDefaultPermissions data))
  (when-let [data (lookup-entry config id :external-data-filtering-allow-list)]
    (. builder externalDataFilteringAllowList data))
  (when-let [data (lookup-entry config id :mutation-type)]
    (. builder mutationType data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :trusted-resource-owners)]
    (. builder trustedResourceOwners data))
  (.build builder))


(defn build-cfn-data-lake-settings-data-lake-principal-property-builder
  "The build-cfn-data-lake-settings-data-lake-principal-property-builder function updates a CfnDataLakeSettings$DataLakePrincipalProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLakeSettings$DataLakePrincipalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |
"
  [^CfnDataLakeSettings$DataLakePrincipalProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
    (. builder dataLakePrincipalIdentifier data))
  (.build builder))


(defn build-cfn-data-lake-settings-principal-permissions-property-builder
  "The build-cfn-data-lake-settings-principal-permissions-property-builder function updates a CfnDataLakeSettings$PrincipalPermissionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataLakeSettings$PrincipalPermissionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `principal` | software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnDataLakeSettings$PrincipalPermissionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn build-cfn-data-lake-settings-props-builder
  "The build-cfn-data-lake-settings-props-builder function updates a CfnDataLakeSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnDataLakeSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admins` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:admins` |
| `allowExternalDataFiltering` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-external-data-filtering` |
| `allowFullTableExternalDataAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-full-table-external-data-access` |
| `authorizedSessionTagValueList` | java.util.List | [[cdk.support/lookup-entry]] | `:authorized-session-tag-value-list` |
| `createDatabaseDefaultPermissions` | java.util.List | [[cdk.support/lookup-entry]] | `:create-database-default-permissions` |
| `createTableDefaultPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:create-table-default-permissions` |
| `externalDataFilteringAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:external-data-filtering-allow-list` |
| `mutationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-type` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `trustedResourceOwners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-resource-owners` |
"
  [^CfnDataLakeSettingsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :admins)]
    (. builder admins data))
  (when-let [data (lookup-entry config id :allow-external-data-filtering)]
    (. builder allowExternalDataFiltering data))
  (when-let [data (lookup-entry config id :allow-full-table-external-data-access)]
    (. builder allowFullTableExternalDataAccess data))
  (when-let [data (lookup-entry config id :authorized-session-tag-value-list)]
    (. builder authorizedSessionTagValueList data))
  (when-let [data (lookup-entry config id :create-database-default-permissions)]
    (. builder createDatabaseDefaultPermissions data))
  (when-let [data (lookup-entry config id :create-table-default-permissions)]
    (. builder createTableDefaultPermissions data))
  (when-let [data (lookup-entry config id :external-data-filtering-allow-list)]
    (. builder externalDataFilteringAllowList data))
  (when-let [data (lookup-entry config id :mutation-type)]
    (. builder mutationType data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :trusted-resource-owners)]
    (. builder trustedResourceOwners data))
  (.build builder))


(defn build-cfn-permissions-builder
  "The build-cfn-permissions-builder function updates a CfnPermissions$Builder instance using the provided configuration.
  The function takes the CfnPermissions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-lake-principal` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnPermissions$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-principal)]
    (. builder dataLakePrincipal data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-let [data (lookup-entry config id :permissions-with-grant-option)]
    (. builder permissionsWithGrantOption data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-permissions-column-wildcard-property-builder
  "The build-cfn-permissions-column-wildcard-property-builder function updates a CfnPermissions$ColumnWildcardProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$ColumnWildcardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |
"
  [^CfnPermissions$ColumnWildcardProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded-column-names)]
    (. builder excludedColumnNames data))
  (.build builder))


(defn build-cfn-permissions-data-lake-principal-property-builder
  "The build-cfn-permissions-data-lake-principal-property-builder function updates a CfnPermissions$DataLakePrincipalProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$DataLakePrincipalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |
"
  [^CfnPermissions$DataLakePrincipalProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
    (. builder dataLakePrincipalIdentifier data))
  (.build builder))


(defn build-cfn-permissions-data-location-resource-property-builder
  "The build-cfn-permissions-data-location-resource-property-builder function updates a CfnPermissions$DataLocationResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$DataLocationResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `s3Resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-resource` |
"
  [^CfnPermissions$DataLocationResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :s3-resource)]
    (. builder s3Resource data))
  (.build builder))


(defn build-cfn-permissions-database-resource-property-builder
  "The build-cfn-permissions-database-resource-property-builder function updates a CfnPermissions$DatabaseResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$DatabaseResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPermissions$DatabaseResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-permissions-props-builder
  "The build-cfn-permissions-props-builder function updates a CfnPermissionsProps$Builder instance using the provided configuration.
  The function takes the CfnPermissionsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipal` | software.amazon.awscdk.services.lakeformation.CfnPermissions$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:data-lake-principal` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnPermissionsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-principal)]
    (. builder dataLakePrincipal data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-let [data (lookup-entry config id :permissions-with-grant-option)]
    (. builder permissionsWithGrantOption data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-permissions-resource-property-builder
  "The build-cfn-permissions-resource-property-builder function updates a CfnPermissions$ResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$ResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationResource` | software.amazon.awscdk.services.lakeformation.CfnPermissions$DataLocationResourceProperty | [[cdk.support/lookup-entry]] | `:data-location-resource` |
| `databaseResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-resource` |
| `tableResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-resource` |
| `tableWithColumnsResource` | software.amazon.awscdk.services.lakeformation.CfnPermissions$TableWithColumnsResourceProperty | [[cdk.support/lookup-entry]] | `:table-with-columns-resource` |
"
  [^CfnPermissions$ResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-location-resource)]
    (. builder dataLocationResource data))
  (when-let [data (lookup-entry config id :database-resource)]
    (. builder databaseResource data))
  (when-let [data (lookup-entry config id :table-resource)]
    (. builder tableResource data))
  (when-let [data (lookup-entry config id :table-with-columns-resource)]
    (. builder tableWithColumnsResource data))
  (.build builder))


(defn build-cfn-permissions-table-resource-property-builder
  "The build-cfn-permissions-table-resource-property-builder function updates a CfnPermissions$TableResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$TableResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | software.amazon.awscdk.services.lakeformation.CfnPermissions$TableWildcardProperty | [[cdk.support/lookup-entry]] | `:table-wildcard` |
"
  [^CfnPermissions$TableResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :table-wildcard)]
    (. builder tableWildcard data))
  (.build builder))


(defn build-cfn-permissions-table-wildcard-property-builder
  "The build-cfn-permissions-table-wildcard-property-builder function updates a CfnPermissions$TableWildcardProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$TableWildcardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^CfnPermissions$TableWildcardProperty$Builder builder id config]
  (.build builder))


(defn build-cfn-permissions-table-with-columns-resource-property-builder
  "The build-cfn-permissions-table-with-columns-resource-property-builder function updates a CfnPermissions$TableWithColumnsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissions$TableWithColumnsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPermissions$TableWithColumnsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-let [data (lookup-entry config id :column-wildcard)]
    (. builder columnWildcard data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-principal-permissions-builder
  "The build-cfn-principal-permissions-builder function updates a CfnPrincipalPermissions$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnPrincipalPermissions$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog)]
    (. builder catalog data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-let [data (lookup-entry config id :permissions-with-grant-option)]
    (. builder permissionsWithGrantOption data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-principal-permissions-column-wildcard-property-builder
  "The build-cfn-principal-permissions-column-wildcard-property-builder function updates a CfnPrincipalPermissions$ColumnWildcardProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$ColumnWildcardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |
"
  [^CfnPrincipalPermissions$ColumnWildcardProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded-column-names)]
    (. builder excludedColumnNames data))
  (.build builder))


(defn build-cfn-principal-permissions-data-cells-filter-resource-property-builder
  "The build-cfn-principal-permissions-data-cells-filter-resource-property-builder function updates a CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :table-catalog-id)]
    (. builder tableCatalogId data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn build-cfn-principal-permissions-data-lake-principal-property-builder
  "The build-cfn-principal-permissions-data-lake-principal-property-builder function updates a CfnPrincipalPermissions$DataLakePrincipalProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$DataLakePrincipalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |
"
  [^CfnPrincipalPermissions$DataLakePrincipalProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
    (. builder dataLakePrincipalIdentifier data))
  (.build builder))


(defn build-cfn-principal-permissions-data-location-resource-property-builder
  "The build-cfn-principal-permissions-data-location-resource-property-builder function updates a CfnPrincipalPermissions$DataLocationResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$DataLocationResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnPrincipalPermissions$DataLocationResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn build-cfn-principal-permissions-database-resource-property-builder
  "The build-cfn-principal-permissions-database-resource-property-builder function updates a CfnPrincipalPermissions$DatabaseResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$DatabaseResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPrincipalPermissions$DatabaseResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-principal-permissions-lf-tag-key-resource-property-builder
  "The build-cfn-principal-permissions-lf-tag-key-resource-property-builder function updates a CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))


(defn build-cfn-principal-permissions-lf-tag-policy-resource-property-builder
  "The build-cfn-principal-permissions-lf-tag-policy-resource-property-builder function updates a CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `expression` | java.util.List | [[cdk.support/lookup-entry]] | `:expression` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
"
  [^CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (.build builder))


(defn build-cfn-principal-permissions-lf-tag-property-builder
  "The build-cfn-principal-permissions-lf-tag-property-builder function updates a CfnPrincipalPermissions$LFTagProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$LFTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnPrincipalPermissions$LFTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))


(defn build-cfn-principal-permissions-props-builder
  "The build-cfn-principal-permissions-props-builder function updates a CfnPrincipalPermissionsProps$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissionsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnPrincipalPermissionsProps$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog)]
    (. builder catalog data))
  (when-let [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-let [data (lookup-entry config id :permissions-with-grant-option)]
    (. builder permissionsWithGrantOption data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-principal-permissions-resource-property-builder
  "The build-cfn-principal-permissions-resource-property-builder function updates a CfnPrincipalPermissions$ResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$ResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.Object | [[cdk.support/lookup-entry]] | `:catalog` |
| `dataCellsFilter` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$DataCellsFilterResourceProperty | [[cdk.support/lookup-entry]] | `:data-cells-filter` |
| `dataLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-location` |
| `database` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$DatabaseResourceProperty | [[cdk.support/lookup-entry]] | `:database` |
| `lfTag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tag` |
| `lfTagPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tag-policy` |
| `table` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$TableResourceProperty | [[cdk.support/lookup-entry]] | `:table` |
| `tableWithColumns` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$TableWithColumnsResourceProperty | [[cdk.support/lookup-entry]] | `:table-with-columns` |
"
  [^CfnPrincipalPermissions$ResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog)]
    (. builder catalog data))
  (when-let [data (lookup-entry config id :data-cells-filter)]
    (. builder dataCellsFilter data))
  (when-let [data (lookup-entry config id :data-location)]
    (. builder dataLocation data))
  (when-let [data (lookup-entry config id :database)]
    (. builder database data))
  (when-let [data (lookup-entry config id :lf-tag)]
    (. builder lfTag data))
  (when-let [data (lookup-entry config id :lf-tag-policy)]
    (. builder lfTagPolicy data))
  (when-let [data (lookup-entry config id :table)]
    (. builder table data))
  (when-let [data (lookup-entry config id :table-with-columns)]
    (. builder tableWithColumns data))
  (.build builder))


(defn build-cfn-principal-permissions-table-resource-property-builder
  "The build-cfn-principal-permissions-table-resource-property-builder function updates a CfnPrincipalPermissions$TableResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$TableResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-wildcard` |
"
  [^CfnPrincipalPermissions$TableResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :table-wildcard)]
    (. builder tableWildcard data))
  (.build builder))


(defn build-cfn-principal-permissions-table-with-columns-resource-property-builder
  "The build-cfn-principal-permissions-table-with-columns-resource-property-builder function updates a CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-let [data (lookup-entry config id :column-wildcard)]
    (. builder columnWildcard data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-resource-builder
  "The build-cfn-resource-builder function updates a CfnResource$Builder instance using the provided configuration.
  The function takes the CfnResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hybridAccessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hybrid-access-enabled` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useServiceLinkedRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-service-linked-role` |
| `withFederation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:with-federation` |
"
  [^CfnResource$Builder builder id config]
  (when-let [data (lookup-entry config id :hybrid-access-enabled)]
    (. builder hybridAccessEnabled data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :use-service-linked-role)]
    (. builder useServiceLinkedRole data))
  (when-let [data (lookup-entry config id :with-federation)]
    (. builder withFederation data))
  (.build builder))


(defn build-cfn-resource-props-builder
  "The build-cfn-resource-props-builder function updates a CfnResourceProps$Builder instance using the provided configuration.
  The function takes the CfnResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hybridAccessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hybrid-access-enabled` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useServiceLinkedRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-service-linked-role` |
| `withFederation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-federation` |
"
  [^CfnResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hybrid-access-enabled)]
    (. builder hybridAccessEnabled data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :use-service-linked-role)]
    (. builder useServiceLinkedRole data))
  (when-let [data (lookup-entry config id :with-federation)]
    (. builder withFederation data))
  (.build builder))


(defn build-cfn-tag-association-builder
  "The build-cfn-tag-association-builder function updates a CfnTagAssociation$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lfTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tags` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnTagAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :lf-tags)]
    (. builder lfTags data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-tag-association-database-resource-property-builder
  "The build-cfn-tag-association-database-resource-property-builder function updates a CfnTagAssociation$DatabaseResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$DatabaseResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnTagAssociation$DatabaseResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-tag-association-lf-tag-pair-property-builder
  "The build-cfn-tag-association-lf-tag-pair-property-builder function updates a CfnTagAssociation$LFTagPairProperty$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$LFTagPairProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnTagAssociation$LFTagPairProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))


(defn build-cfn-tag-association-props-builder
  "The build-cfn-tag-association-props-builder function updates a CfnTagAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnTagAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lfTags` | java.util.List | [[cdk.support/lookup-entry]] | `:lf-tags` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnTagAssociation$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |
"
  [^CfnTagAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :lf-tags)]
    (. builder lfTags data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (.build builder))


(defn build-cfn-tag-association-resource-property-builder
  "The build-cfn-tag-association-resource-property-builder function updates a CfnTagAssociation$ResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$ResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.Object | [[cdk.support/lookup-entry]] | `:catalog` |
| `database` | software.amazon.awscdk.services.lakeformation.CfnTagAssociation$DatabaseResourceProperty | [[cdk.support/lookup-entry]] | `:database` |
| `table` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table` |
| `tableWithColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-with-columns` |
"
  [^CfnTagAssociation$ResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog)]
    (. builder catalog data))
  (when-let [data (lookup-entry config id :database)]
    (. builder database data))
  (when-let [data (lookup-entry config id :table)]
    (. builder table data))
  (when-let [data (lookup-entry config id :table-with-columns)]
    (. builder tableWithColumns data))
  (.build builder))


(defn build-cfn-tag-association-table-resource-property-builder
  "The build-cfn-tag-association-table-resource-property-builder function updates a CfnTagAssociation$TableResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$TableResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-wildcard` |
"
  [^CfnTagAssociation$TableResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :table-wildcard)]
    (. builder tableWildcard data))
  (.build builder))


(defn build-cfn-tag-association-table-with-columns-resource-property-builder
  "The build-cfn-tag-association-table-with-columns-resource-property-builder function updates a CfnTagAssociation$TableWithColumnsResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTagAssociation$TableWithColumnsResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnTagAssociation$TableWithColumnsResourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :column-names)]
    (. builder columnNames data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn build-cfn-tag-builder
  "The build-cfn-tag-builder function updates a CfnTag$Builder instance using the provided configuration.
  The function takes the CfnTag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnTag$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))


(defn build-cfn-tag-props-builder
  "The build-cfn-tag-props-builder function updates a CfnTagProps$Builder instance using the provided configuration.
  The function takes the CfnTagProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |
"
  [^CfnTagProps$Builder builder id config]
  (when-let [data (lookup-entry config id :catalog-id)]
    (. builder catalogId data))
  (when-let [data (lookup-entry config id :tag-key)]
    (. builder tagKey data))
  (when-let [data (lookup-entry config id :tag-values)]
    (. builder tagValues data))
  (.build builder))