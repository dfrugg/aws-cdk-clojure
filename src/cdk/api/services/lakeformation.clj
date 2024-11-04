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


(defn cfn-data-cells-filter-builder
  "The cfn-data-cells-filter-builder function buildes out new instances of 
CfnDataCellsFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:row-filter` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDataCellsFilter$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-cells-filter-column-wildcard-property-builder
  "The cfn-data-cells-filter-column-wildcard-property-builder function buildes out new instances of 
CfnDataCellsFilter$ColumnWildcardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |"
  [stack id config]
  (let [builder (CfnDataCellsFilter$ColumnWildcardProperty$Builder.)]
    (when-let [data (lookup-entry config id :excluded-column-names)]
      (. builder excludedColumnNames data))
    (.build builder)))


(defn cfn-data-cells-filter-props-builder
  "The cfn-data-cells-filter-props-builder function buildes out new instances of 
CfnDataCellsFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rowFilter` | software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter$RowFilterProperty | [[cdk.support/lookup-entry]] | `:row-filter` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnDataCellsFilterProps$Builder.)]
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
    (.build builder)))


(defn cfn-data-cells-filter-row-filter-property-builder
  "The cfn-data-cells-filter-row-filter-property-builder function buildes out new instances of 
CfnDataCellsFilter$RowFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allRowsWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all-rows-wildcard` |
| `filterExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-expression` |"
  [stack id config]
  (let [builder (CfnDataCellsFilter$RowFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :all-rows-wildcard)]
      (. builder allRowsWildcard data))
    (when-let [data (lookup-entry config id :filter-expression)]
      (. builder filterExpression data))
    (.build builder)))


(defn cfn-data-lake-settings-builder
  "The cfn-data-lake-settings-builder function buildes out new instances of 
CfnDataLakeSettings$Builder using the provided configuration.  Each field is set as follows:

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
| `trustedResourceOwners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-resource-owners` |"
  [stack id config]
  (let [builder (CfnDataLakeSettings$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-data-lake-settings-data-lake-principal-property-builder
  "The cfn-data-lake-settings-data-lake-principal-property-builder function buildes out new instances of 
CfnDataLakeSettings$DataLakePrincipalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |"
  [stack id config]
  (let [builder (CfnDataLakeSettings$DataLakePrincipalProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
      (. builder dataLakePrincipalIdentifier data))
    (.build builder)))


(defn cfn-data-lake-settings-principal-permissions-property-builder
  "The cfn-data-lake-settings-principal-permissions-property-builder function buildes out new instances of 
CfnDataLakeSettings$PrincipalPermissionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `principal` | software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnDataLakeSettings$PrincipalPermissionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-data-lake-settings-props-builder
  "The cfn-data-lake-settings-props-builder function buildes out new instances of 
CfnDataLakeSettingsProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trustedResourceOwners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-resource-owners` |"
  [stack id config]
  (let [builder (CfnDataLakeSettingsProps$Builder.)]
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
    (.build builder)))


(defn cfn-permissions-builder
  "The cfn-permissions-builder function buildes out new instances of 
CfnPermissions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-lake-principal` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnPermissions$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-lake-principal)]
      (. builder dataLakePrincipal data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :permissions-with-grant-option)]
      (. builder permissionsWithGrantOption data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn cfn-permissions-column-wildcard-property-builder
  "The cfn-permissions-column-wildcard-property-builder function buildes out new instances of 
CfnPermissions$ColumnWildcardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |"
  [stack id config]
  (let [builder (CfnPermissions$ColumnWildcardProperty$Builder.)]
    (when-let [data (lookup-entry config id :excluded-column-names)]
      (. builder excludedColumnNames data))
    (.build builder)))


(defn cfn-permissions-data-lake-principal-property-builder
  "The cfn-permissions-data-lake-principal-property-builder function buildes out new instances of 
CfnPermissions$DataLakePrincipalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |"
  [stack id config]
  (let [builder (CfnPermissions$DataLakePrincipalProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
      (. builder dataLakePrincipalIdentifier data))
    (.build builder)))


(defn cfn-permissions-data-location-resource-property-builder
  "The cfn-permissions-data-location-resource-property-builder function buildes out new instances of 
CfnPermissions$DataLocationResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `s3Resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-resource` |"
  [stack id config]
  (let [builder (CfnPermissions$DataLocationResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :s3-resource)]
      (. builder s3Resource data))
    (.build builder)))


(defn cfn-permissions-database-resource-property-builder
  "The cfn-permissions-database-resource-property-builder function buildes out new instances of 
CfnPermissions$DatabaseResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPermissions$DatabaseResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-permissions-props-builder
  "The cfn-permissions-props-builder function buildes out new instances of 
CfnPermissionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipal` | software.amazon.awscdk.services.lakeformation.CfnPermissions$DataLakePrincipalProperty | [[cdk.support/lookup-entry]] | `:data-lake-principal` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnPermissionsProps$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-principal)]
      (. builder dataLakePrincipal data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :permissions-with-grant-option)]
      (. builder permissionsWithGrantOption data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn cfn-permissions-resource-property-builder
  "The cfn-permissions-resource-property-builder function buildes out new instances of 
CfnPermissions$ResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationResource` | software.amazon.awscdk.services.lakeformation.CfnPermissions$DataLocationResourceProperty | [[cdk.support/lookup-entry]] | `:data-location-resource` |
| `databaseResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:database-resource` |
| `tableResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-resource` |
| `tableWithColumnsResource` | software.amazon.awscdk.services.lakeformation.CfnPermissions$TableWithColumnsResourceProperty | [[cdk.support/lookup-entry]] | `:table-with-columns-resource` |"
  [stack id config]
  (let [builder (CfnPermissions$ResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-location-resource)]
      (. builder dataLocationResource data))
    (when-let [data (lookup-entry config id :database-resource)]
      (. builder databaseResource data))
    (when-let [data (lookup-entry config id :table-resource)]
      (. builder tableResource data))
    (when-let [data (lookup-entry config id :table-with-columns-resource)]
      (. builder tableWithColumnsResource data))
    (.build builder)))


(defn cfn-permissions-table-resource-property-builder
  "The cfn-permissions-table-resource-property-builder function buildes out new instances of 
CfnPermissions$TableResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | software.amazon.awscdk.services.lakeformation.CfnPermissions$TableWildcardProperty | [[cdk.support/lookup-entry]] | `:table-wildcard` |"
  [stack id config]
  (let [builder (CfnPermissions$TableResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-wildcard)]
      (. builder tableWildcard data))
    (.build builder)))


(defn cfn-permissions-table-wildcard-property-builder
  "The cfn-permissions-table-wildcard-property-builder function buildes out new instances of 
CfnPermissions$TableWildcardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnPermissions$TableWildcardProperty$Builder.)]
    (.build builder)))


(defn cfn-permissions-table-with-columns-resource-property-builder
  "The cfn-permissions-table-with-columns-resource-property-builder function buildes out new instances of 
CfnPermissions$TableWithColumnsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPermissions$TableWithColumnsResourceProperty$Builder.)]
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
    (.build builder)))


(defn cfn-principal-permissions-builder
  "The cfn-principal-permissions-builder function buildes out new instances of 
CfnPrincipalPermissions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-principal-permissions-column-wildcard-property-builder
  "The cfn-principal-permissions-column-wildcard-property-builder function buildes out new instances of 
CfnPrincipalPermissions$ColumnWildcardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedColumnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-column-names` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$ColumnWildcardProperty$Builder.)]
    (when-let [data (lookup-entry config id :excluded-column-names)]
      (. builder excludedColumnNames data))
    (.build builder)))


(defn cfn-principal-permissions-data-cells-filter-resource-property-builder
  "The cfn-principal-permissions-data-cells-filter-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableCatalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-catalog-id` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$DataCellsFilterResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-catalog-id)]
      (. builder tableCatalogId data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-principal-permissions-data-lake-principal-property-builder
  "The cfn-principal-permissions-data-lake-principal-property-builder function buildes out new instances of 
CfnPrincipalPermissions$DataLakePrincipalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLakePrincipalIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-lake-principal-identifier` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$DataLakePrincipalProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-lake-principal-identifier)]
      (. builder dataLakePrincipalIdentifier data))
    (.build builder)))


(defn cfn-principal-permissions-data-location-resource-property-builder
  "The cfn-principal-permissions-data-location-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$DataLocationResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$DataLocationResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-principal-permissions-database-resource-property-builder
  "The cfn-principal-permissions-database-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$DatabaseResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$DatabaseResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-principal-permissions-lf-tag-key-resource-property-builder
  "The cfn-principal-permissions-lf-tag-key-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$LFTagKeyResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))


(defn cfn-principal-permissions-lf-tag-policy-resource-property-builder
  "The cfn-principal-permissions-lf-tag-policy-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `expression` | java.util.List | [[cdk.support/lookup-entry]] | `:expression` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$LFTagPolicyResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (.build builder)))


(defn cfn-principal-permissions-lf-tag-property-builder
  "The cfn-principal-permissions-lf-tag-property-builder function buildes out new instances of 
CfnPrincipalPermissions$LFTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$LFTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))


(defn cfn-principal-permissions-props-builder
  "The cfn-principal-permissions-props-builder function buildes out new instances of 
CfnPrincipalPermissionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `permissionsWithGrantOption` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions-with-grant-option` |
| `principal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:principal` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissionsProps$Builder.)]
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
    (.build builder)))


(defn cfn-principal-permissions-resource-property-builder
  "The cfn-principal-permissions-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$ResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.Object | [[cdk.support/lookup-entry]] | `:catalog` |
| `dataCellsFilter` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$DataCellsFilterResourceProperty | [[cdk.support/lookup-entry]] | `:data-cells-filter` |
| `dataLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-location` |
| `database` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$DatabaseResourceProperty | [[cdk.support/lookup-entry]] | `:database` |
| `lfTag` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tag` |
| `lfTagPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tag-policy` |
| `table` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$TableResourceProperty | [[cdk.support/lookup-entry]] | `:table` |
| `tableWithColumns` | software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions$TableWithColumnsResourceProperty | [[cdk.support/lookup-entry]] | `:table-with-columns` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$ResourceProperty$Builder.)]
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
    (.build builder)))


(defn cfn-principal-permissions-table-resource-property-builder
  "The cfn-principal-permissions-table-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$TableResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-wildcard` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$TableResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-wildcard)]
      (. builder tableWildcard data))
    (.build builder)))


(defn cfn-principal-permissions-table-with-columns-resource-property-builder
  "The cfn-principal-permissions-table-with-columns-resource-property-builder function buildes out new instances of 
CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `columnWildcard` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:column-wildcard` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPrincipalPermissions$TableWithColumnsResourceProperty$Builder.)]
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
    (.build builder)))


(defn cfn-resource-builder
  "The cfn-resource-builder function buildes out new instances of 
CfnResource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hybridAccessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hybrid-access-enabled` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useServiceLinkedRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-service-linked-role` |
| `withFederation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:with-federation` |"
  [stack id config]
  (let [builder (CfnResource$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-resource-props-builder
  "The cfn-resource-props-builder function buildes out new instances of 
CfnResourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hybridAccessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hybrid-access-enabled` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useServiceLinkedRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-service-linked-role` |
| `withFederation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:with-federation` |"
  [stack id config]
  (let [builder (CfnResourceProps$Builder.)]
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
    (.build builder)))


(defn cfn-tag-association-builder
  "The cfn-tag-association-builder function buildes out new instances of 
CfnTagAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lfTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lf-tags` |
| `resource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnTagAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :lf-tags)]
      (. builder lfTags data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn cfn-tag-association-database-resource-property-builder
  "The cfn-tag-association-database-resource-property-builder function buildes out new instances of 
CfnTagAssociation$DatabaseResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnTagAssociation$DatabaseResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-tag-association-lf-tag-pair-property-builder
  "The cfn-tag-association-lf-tag-pair-property-builder function buildes out new instances of 
CfnTagAssociation$LFTagPairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnTagAssociation$LFTagPairProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))


(defn cfn-tag-association-props-builder
  "The cfn-tag-association-props-builder function buildes out new instances of 
CfnTagAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lfTags` | java.util.List | [[cdk.support/lookup-entry]] | `:lf-tags` |
| `resource` | software.amazon.awscdk.services.lakeformation.CfnTagAssociation$ResourceProperty | [[cdk.support/lookup-entry]] | `:resource` |"
  [stack id config]
  (let [builder (CfnTagAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :lf-tags)]
      (. builder lfTags data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (.build builder)))


(defn cfn-tag-association-resource-property-builder
  "The cfn-tag-association-resource-property-builder function buildes out new instances of 
CfnTagAssociation$ResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalog` | java.lang.Object | [[cdk.support/lookup-entry]] | `:catalog` |
| `database` | software.amazon.awscdk.services.lakeformation.CfnTagAssociation$DatabaseResourceProperty | [[cdk.support/lookup-entry]] | `:database` |
| `table` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table` |
| `tableWithColumns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:table-with-columns` |"
  [stack id config]
  (let [builder (CfnTagAssociation$ResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog)]
      (. builder catalog data))
    (when-let [data (lookup-entry config id :database)]
      (. builder database data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :table-with-columns)]
      (. builder tableWithColumns data))
    (.build builder)))


(defn cfn-tag-association-table-resource-property-builder
  "The cfn-tag-association-table-resource-property-builder function buildes out new instances of 
CfnTagAssociation$TableResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tableWildcard` | java.lang.Object | [[cdk.support/lookup-entry]] | `:table-wildcard` |"
  [stack id config]
  (let [builder (CfnTagAssociation$TableResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :table-wildcard)]
      (. builder tableWildcard data))
    (.build builder)))


(defn cfn-tag-association-table-with-columns-resource-property-builder
  "The cfn-tag-association-table-with-columns-resource-property-builder function buildes out new instances of 
CfnTagAssociation$TableWithColumnsResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `columnNames` | java.util.List | [[cdk.support/lookup-entry]] | `:column-names` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnTagAssociation$TableWithColumnsResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :column-names)]
      (. builder columnNames data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-tag-builder
  "The cfn-tag-builder function buildes out new instances of 
CfnTag$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnTag$Builder/create stack id)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))


(defn cfn-tag-props-builder
  "The cfn-tag-props-builder function buildes out new instances of 
CfnTagProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `catalogId` | java.lang.String | [[cdk.support/lookup-entry]] | `:catalog-id` |
| `tagKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:tag-key` |
| `tagValues` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-values` |"
  [stack id config]
  (let [builder (CfnTagProps$Builder.)]
    (when-let [data (lookup-entry config id :catalog-id)]
      (. builder catalogId data))
    (when-let [data (lookup-entry config id :tag-key)]
      (. builder tagKey data))
    (when-let [data (lookup-entry config id :tag-values)]
      (. builder tagValues data))
    (.build builder)))