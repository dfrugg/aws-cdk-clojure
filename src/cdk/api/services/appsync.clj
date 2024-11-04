(ns cdk.api.services.appsync
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appsync package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]]
            [cdk.api.services.logs :refer [retention-days]])
  (:import [software.amazon.awscdk.services.appsync ApiKeyConfig$Builder
                                                    AppsyncFunction$Builder
                                                    AppsyncFunctionAttributes$Builder
                                                    AppsyncFunctionProps$Builder
                                                    AssetCode$Builder
                                                    AuthorizationConfig$Builder
                                                    AuthorizationMode$Builder
                                                    AuthorizationType
                                                    AwsIamConfig$Builder
                                                    BackedDataSourceProps$Builder
                                                    BaseAppsyncFunctionProps$Builder
                                                    BaseDataSourceProps$Builder
                                                    BaseResolverProps$Builder
                                                    CachingConfig$Builder
                                                    CfnApiCache$Builder
                                                    CfnApiCacheProps$Builder
                                                    CfnApiKey$Builder
                                                    CfnApiKeyProps$Builder
                                                    CfnDataSource$AuthorizationConfigProperty$Builder
                                                    CfnDataSource$AwsIamConfigProperty$Builder
                                                    CfnDataSource$Builder
                                                    CfnDataSource$DeltaSyncConfigProperty$Builder
                                                    CfnDataSource$DynamoDBConfigProperty$Builder
                                                    CfnDataSource$ElasticsearchConfigProperty$Builder
                                                    CfnDataSource$EventBridgeConfigProperty$Builder
                                                    CfnDataSource$HttpConfigProperty$Builder
                                                    CfnDataSource$LambdaConfigProperty$Builder
                                                    CfnDataSource$OpenSearchServiceConfigProperty$Builder
                                                    CfnDataSource$RdsHttpEndpointConfigProperty$Builder
                                                    CfnDataSource$RelationalDatabaseConfigProperty$Builder
                                                    CfnDataSourceProps$Builder
                                                    CfnDomainName$Builder
                                                    CfnDomainNameApiAssociation$Builder
                                                    CfnDomainNameApiAssociationProps$Builder
                                                    CfnDomainNameProps$Builder
                                                    CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder
                                                    CfnFunctionConfiguration$Builder
                                                    CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder
                                                    CfnFunctionConfiguration$SyncConfigProperty$Builder
                                                    CfnFunctionConfigurationProps$Builder
                                                    CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder
                                                    CfnGraphQLApi$Builder
                                                    CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder
                                                    CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder
                                                    CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder
                                                    CfnGraphQLApi$LogConfigProperty$Builder
                                                    CfnGraphQLApi$OpenIDConnectConfigProperty$Builder
                                                    CfnGraphQLApi$UserPoolConfigProperty$Builder
                                                    CfnGraphQLApiProps$Builder
                                                    CfnGraphQLSchema$Builder
                                                    CfnGraphQLSchemaProps$Builder
                                                    CfnResolver$AppSyncRuntimeProperty$Builder
                                                    CfnResolver$Builder
                                                    CfnResolver$CachingConfigProperty$Builder
                                                    CfnResolver$LambdaConflictHandlerConfigProperty$Builder
                                                    CfnResolver$PipelineConfigProperty$Builder
                                                    CfnResolver$SyncConfigProperty$Builder
                                                    CfnResolverProps$Builder
                                                    CfnSourceApiAssociation$Builder
                                                    CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder
                                                    CfnSourceApiAssociationProps$Builder
                                                    CodeConfig$Builder
                                                    DataSourceOptions$Builder
                                                    DomainOptions$Builder
                                                    DynamoDbDataSource$Builder
                                                    DynamoDbDataSourceProps$Builder
                                                    EventBridgeDataSource$Builder
                                                    EventBridgeDataSourceProps$Builder
                                                    ExtendedDataSourceProps$Builder
                                                    ExtendedResolverProps$Builder
                                                    FieldLogLevel
                                                    FunctionRuntimeFamily
                                                    GraphqlApi$Builder
                                                    GraphqlApiAttributes$Builder
                                                    GraphqlApiProps$Builder
                                                    HttpDataSource$Builder
                                                    HttpDataSourceOptions$Builder
                                                    HttpDataSourceProps$Builder
                                                    IntrospectionConfig
                                                    LambdaAuthorizerConfig$Builder
                                                    LambdaDataSource$Builder
                                                    LambdaDataSourceProps$Builder
                                                    LogConfig$Builder
                                                    MergeType
                                                    NoneDataSource$Builder
                                                    NoneDataSourceProps$Builder
                                                    OpenIdConnectConfig$Builder
                                                    OpenSearchDataSource$Builder
                                                    OpenSearchDataSourceProps$Builder
                                                    RdsDataSource$Builder
                                                    RdsDataSourceProps$Builder
                                                    RdsDataSourcePropsV2$Builder
                                                    Resolver$Builder
                                                    ResolverProps$Builder
                                                    RuntimeConfig$Builder
                                                    SchemaBindOptions$Builder
                                                    SchemaFile$Builder
                                                    SchemaProps$Builder
                                                    SourceApi$Builder
                                                    SourceApiAssociation$Builder
                                                    SourceApiAssociationAttributes$Builder
                                                    SourceApiAssociationProps$Builder
                                                    SourceApiOptions$Builder
                                                    UserPoolConfig$Builder
                                                    UserPoolDefaultAction
                                                    Visibility]))


(defn authorization-type
  "The `authorization-type` function data interprets values in the provided config data into a 
`AuthorizationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuthorizationType` - the value is returned.
* is `:lambda` - `AuthorizationType/LAMBDA` is returned
* is `:user-pool` - `AuthorizationType/USER_POOL` is returned
* is `:iam` - `AuthorizationType/IAM` is returned
* is `:oidc` - `AuthorizationType/OIDC` is returned
* is `:api-key` - `AuthorizationType/API_KEY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuthorizationType data) data
      (= :lambda data) AuthorizationType/LAMBDA
      (= :user-pool data) AuthorizationType/USER_POOL
      (= :iam data) AuthorizationType/IAM
      (= :oidc data) AuthorizationType/OIDC
      (= :api-key data) AuthorizationType/API_KEY)))


(defn field-log-level
  "The `field-log-level` function data interprets values in the provided config data into a 
`FieldLogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FieldLogLevel` - the value is returned.
* is `:all` - `FieldLogLevel/ALL` is returned
* is `:none` - `FieldLogLevel/NONE` is returned
* is `:error` - `FieldLogLevel/ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FieldLogLevel data) data
      (= :all data) FieldLogLevel/ALL
      (= :none data) FieldLogLevel/NONE
      (= :error data) FieldLogLevel/ERROR)))


(defn function-runtime-family
  "The `function-runtime-family` function data interprets values in the provided config data into a 
`FunctionRuntimeFamily` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FunctionRuntimeFamily` - the value is returned.
* is `:js` - `FunctionRuntimeFamily/JS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FunctionRuntimeFamily data) data
      (= :js data) FunctionRuntimeFamily/JS)))


(defn introspection-config
  "The `introspection-config` function data interprets values in the provided config data into a 
`IntrospectionConfig` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IntrospectionConfig` - the value is returned.
* is `:enabled` - `IntrospectionConfig/ENABLED` is returned
* is `:disabled` - `IntrospectionConfig/DISABLED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IntrospectionConfig data) data
      (= :enabled data) IntrospectionConfig/ENABLED
      (= :disabled data) IntrospectionConfig/DISABLED)))


(defn merge-type
  "The `merge-type` function data interprets values in the provided config data into a 
`MergeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `MergeType` - the value is returned.
* is `:manual-merge` - `MergeType/MANUAL_MERGE` is returned
* is `:auto-merge` - `MergeType/AUTO_MERGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? MergeType data) data
      (= :manual-merge data) MergeType/MANUAL_MERGE
      (= :auto-merge data) MergeType/AUTO_MERGE)))


(defn user-pool-default-action
  "The `user-pool-default-action` function data interprets values in the provided config data into a 
`UserPoolDefaultAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `UserPoolDefaultAction` - the value is returned.
* is `:allow` - `UserPoolDefaultAction/ALLOW` is returned
* is `:deny` - `UserPoolDefaultAction/DENY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? UserPoolDefaultAction data) data
      (= :allow data) UserPoolDefaultAction/ALLOW
      (= :deny data) UserPoolDefaultAction/DENY)))


(defn visibility
  "The `visibility` function data interprets values in the provided config data into a 
`Visibility` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Visibility` - the value is returned.
* is `:global` - `Visibility/GLOBAL` is returned
* is `:private` - `Visibility/PRIVATE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Visibility data) data
      (= :global data) Visibility/GLOBAL
      (= :private data) Visibility/PRIVATE)))


(defn api-key-config-builder
  "The api-key-config-builder function buildes out new instances of 
ApiKeyConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | software.amazon.awscdk.Expiration | [[cdk.support/lookup-entry]] | `:expires` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (ApiKeyConfig$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expires)]
      (. builder expires data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn appsync-function-attributes-builder
  "The appsync-function-attributes-builder function buildes out new instances of 
AppsyncFunctionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |"
  [stack id config]
  (let [builder (AppsyncFunctionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (.build builder)))


(defn appsync-function-builder
  "The appsync-function-builder function buildes out new instances of 
AppsyncFunction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (AppsyncFunction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn appsync-function-props-builder
  "The appsync-function-props-builder function buildes out new instances of 
AppsyncFunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (AppsyncFunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn asset-code-builder
  "The asset-code-builder function buildes out new instances of 
AssetCode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config ^java.lang.String path]
  (let [builder (AssetCode$Builder/create ^java.lang.String path)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (.build builder)))


(defn authorization-config-builder
  "The authorization-config-builder function buildes out new instances of 
AuthorizationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAuthorizationModes` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-authorization-modes` |
| `defaultAuthorization` | software.amazon.awscdk.services.appsync.AuthorizationMode | [[cdk.support/lookup-entry]] | `:default-authorization` |"
  [stack id config]
  (let [builder (AuthorizationConfig$Builder.)]
    (when-let [data (lookup-entry config id :additional-authorization-modes)]
      (. builder additionalAuthorizationModes data))
    (when-let [data (lookup-entry config id :default-authorization)]
      (. builder defaultAuthorization data))
    (.build builder)))


(defn authorization-mode-builder
  "The authorization-mode-builder function buildes out new instances of 
AuthorizationMode$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyConfig` | software.amazon.awscdk.services.appsync.ApiKeyConfig | [[cdk.support/lookup-entry]] | `:api-key-config` |
| `authorizationType` | software.amazon.awscdk.services.appsync.AuthorizationType | [[cdk.api.services.appsync/authorization-type]] | `:authorization-type` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `openIdConnectConfig` | software.amazon.awscdk.services.appsync.OpenIdConnectConfig | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.UserPoolConfig | [[cdk.support/lookup-entry]] | `:user-pool-config` |"
  [stack id config]
  (let [builder (AuthorizationMode$Builder.)]
    (when-let [data (lookup-entry config id :api-key-config)]
      (. builder apiKeyConfig data))
    (when-let [data (authorization-type config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :lambda-authorizer-config)]
      (. builder lambdaAuthorizerConfig data))
    (when-let [data (lookup-entry config id :open-id-connect-config)]
      (. builder openIdConnectConfig data))
    (when-let [data (lookup-entry config id :user-pool-config)]
      (. builder userPoolConfig data))
    (.build builder)))


(defn aws-iam-config-builder
  "The aws-iam-config-builder function buildes out new instances of 
AwsIamConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |
| `signingServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-service-name` |"
  [stack id config]
  (let [builder (AwsIamConfig$Builder.)]
    (when-let [data (lookup-entry config id :signing-region)]
      (. builder signingRegion data))
    (when-let [data (lookup-entry config id :signing-service-name)]
      (. builder signingServiceName data))
    (.build builder)))


(defn backed-data-source-props-builder
  "The backed-data-source-props-builder function buildes out new instances of 
BackedDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (BackedDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn base-appsync-function-props-builder
  "The base-appsync-function-props-builder function buildes out new instances of 
BaseAppsyncFunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (BaseAppsyncFunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn base-data-source-props-builder
  "The base-data-source-props-builder function buildes out new instances of 
BaseDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (BaseDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn base-resolver-props-builder
  "The base-resolver-props-builder function buildes out new instances of 
BaseResolverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingConfig` | software.amazon.awscdk.services.appsync.CachingConfig | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `pipelineConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (BaseResolverProps$Builder.)]
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn caching-config-builder
  "The caching-config-builder function buildes out new instances of 
CachingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:caching-keys` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CachingConfig$Builder.)]
    (when-let [data (lookup-entry config id :caching-keys)]
      (. builder cachingKeys data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-api-cache-builder
  "The cfn-api-cache-builder function buildes out new instances of 
CfnApiCache$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiCachingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-caching-behavior` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `atRestEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `healthMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-metrics-config` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnApiCache$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-caching-behavior)]
      (. builder apiCachingBehavior data))
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :at-rest-encryption-enabled)]
      (. builder atRestEncryptionEnabled data))
    (when-let [data (lookup-entry config id :health-metrics-config)]
      (. builder healthMetricsConfig data))
    (when-let [data (lookup-entry config id :transit-encryption-enabled)]
      (. builder transitEncryptionEnabled data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-api-cache-props-builder
  "The cfn-api-cache-props-builder function buildes out new instances of 
CfnApiCacheProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiCachingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-caching-behavior` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `atRestEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `healthMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-metrics-config` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnApiCacheProps$Builder.)]
    (when-let [data (lookup-entry config id :api-caching-behavior)]
      (. builder apiCachingBehavior data))
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :at-rest-encryption-enabled)]
      (. builder atRestEncryptionEnabled data))
    (when-let [data (lookup-entry config id :health-metrics-config)]
      (. builder healthMetricsConfig data))
    (when-let [data (lookup-entry config id :transit-encryption-enabled)]
      (. builder transitEncryptionEnabled data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-api-key-builder
  "The cfn-api-key-builder function buildes out new instances of 
CfnApiKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires` |"
  [stack id config]
  (let [builder (CfnApiKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expires)]
      (. builder expires data))
    (.build builder)))


(defn cfn-api-key-props-builder
  "The cfn-api-key-props-builder function buildes out new instances of 
CfnApiKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires` |"
  [stack id config]
  (let [builder (CfnApiKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expires)]
      (. builder expires data))
    (.build builder)))


(defn cfn-data-source-authorization-config-property-builder
  "The cfn-data-source-authorization-config-property-builder function buildes out new instances of 
CfnDataSource$AuthorizationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `awsIamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-iam-config` |"
  [stack id config]
  (let [builder (CfnDataSource$AuthorizationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-type)]
      (. builder authorizationType data))
    (when-let [data (lookup-entry config id :aws-iam-config)]
      (. builder awsIamConfig data))
    (.build builder)))


(defn cfn-data-source-aws-iam-config-property-builder
  "The cfn-data-source-aws-iam-config-property-builder function buildes out new instances of 
CfnDataSource$AwsIamConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |
| `signingServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-service-name` |"
  [stack id config]
  (let [builder (CfnDataSource$AwsIamConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :signing-region)]
      (. builder signingRegion data))
    (when-let [data (lookup-entry config id :signing-service-name)]
      (. builder signingServiceName data))
    (.build builder)))


(defn cfn-data-source-builder
  "The cfn-data-source-builder function buildes out new instances of 
CfnDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamoDbConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db-config` |
| `elasticsearchConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elasticsearch-config` |
| `eventBridgeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-config` |
| `httpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-config` |
| `lambdaConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `metricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openSearchServiceConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$OpenSearchServiceConfigProperty | [[cdk.support/lookup-entry]] | `:open-search-service-config` |
| `relationalDatabaseConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$RelationalDatabaseConfigProperty | [[cdk.support/lookup-entry]] | `:relational-database-config` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dynamo-db-config)]
      (. builder dynamoDbConfig data))
    (when-let [data (lookup-entry config id :elasticsearch-config)]
      (. builder elasticsearchConfig data))
    (when-let [data (lookup-entry config id :event-bridge-config)]
      (. builder eventBridgeConfig data))
    (when-let [data (lookup-entry config id :http-config)]
      (. builder httpConfig data))
    (when-let [data (lookup-entry config id :lambda-config)]
      (. builder lambdaConfig data))
    (when-let [data (lookup-entry config id :metrics-config)]
      (. builder metricsConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :open-search-service-config)]
      (. builder openSearchServiceConfig data))
    (when-let [data (lookup-entry config id :relational-database-config)]
      (. builder relationalDatabaseConfig data))
    (when-let [data (lookup-entry config id :service-role-arn)]
      (. builder serviceRoleArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-delta-sync-config-property-builder
  "The cfn-data-source-delta-sync-config-property-builder function buildes out new instances of 
CfnDataSource$DeltaSyncConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseTableTtl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-table-ttl` |
| `deltaSyncTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delta-sync-table-name` |
| `deltaSyncTableTtl` | java.lang.String | [[cdk.support/lookup-entry]] | `:delta-sync-table-ttl` |"
  [stack id config]
  (let [builder (CfnDataSource$DeltaSyncConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-table-ttl)]
      (. builder baseTableTtl data))
    (when-let [data (lookup-entry config id :delta-sync-table-name)]
      (. builder deltaSyncTableName data))
    (when-let [data (lookup-entry config id :delta-sync-table-ttl)]
      (. builder deltaSyncTableTtl data))
    (.build builder)))


(defn cfn-data-source-dynamo-db-config-property-builder
  "The cfn-data-source-dynamo-db-config-property-builder function buildes out new instances of 
CfnDataSource$DynamoDBConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `deltaSyncConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$DeltaSyncConfigProperty | [[cdk.support/lookup-entry]] | `:delta-sync-config` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |
| `versioned` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:versioned` |"
  [stack id config]
  (let [builder (CfnDataSource$DynamoDBConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :delta-sync-config)]
      (. builder deltaSyncConfig data))
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (when-let [data (lookup-entry config id :use-caller-credentials)]
      (. builder useCallerCredentials data))
    (when-let [data (lookup-entry config id :versioned)]
      (. builder versioned data))
    (.build builder)))


(defn cfn-data-source-elasticsearch-config-property-builder
  "The cfn-data-source-elasticsearch-config-property-builder function buildes out new instances of 
CfnDataSource$ElasticsearchConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |"
  [stack id config]
  (let [builder (CfnDataSource$ElasticsearchConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (.build builder)))


(defn cfn-data-source-event-bridge-config-property-builder
  "The cfn-data-source-event-bridge-config-property-builder function buildes out new instances of 
CfnDataSource$EventBridgeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$EventBridgeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-bus-arn)]
      (. builder eventBusArn data))
    (.build builder)))


(defn cfn-data-source-http-config-property-builder
  "The cfn-data-source-http-config-property-builder function buildes out new instances of 
CfnDataSource$HttpConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |"
  [stack id config]
  (let [builder (CfnDataSource$HttpConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (.build builder)))


(defn cfn-data-source-lambda-config-property-builder
  "The cfn-data-source-lambda-config-property-builder function buildes out new instances of 
CfnDataSource$LambdaConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |"
  [stack id config]
  (let [builder (CfnDataSource$LambdaConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (.build builder)))


(defn cfn-data-source-open-search-service-config-property-builder
  "The cfn-data-source-open-search-service-config-property-builder function buildes out new instances of 
CfnDataSource$OpenSearchServiceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |"
  [stack id config]
  (let [builder (CfnDataSource$OpenSearchServiceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (.build builder)))


(defn cfn-data-source-props-builder
  "The cfn-data-source-props-builder function buildes out new instances of 
CfnDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dynamoDbConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$DynamoDBConfigProperty | [[cdk.support/lookup-entry]] | `:dynamo-db-config` |
| `elasticsearchConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$ElasticsearchConfigProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-config` |
| `eventBridgeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-config` |
| `httpConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$HttpConfigProperty | [[cdk.support/lookup-entry]] | `:http-config` |
| `lambdaConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$LambdaConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `metricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openSearchServiceConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$OpenSearchServiceConfigProperty | [[cdk.support/lookup-entry]] | `:open-search-service-config` |
| `relationalDatabaseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relational-database-config` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dynamo-db-config)]
      (. builder dynamoDbConfig data))
    (when-let [data (lookup-entry config id :elasticsearch-config)]
      (. builder elasticsearchConfig data))
    (when-let [data (lookup-entry config id :event-bridge-config)]
      (. builder eventBridgeConfig data))
    (when-let [data (lookup-entry config id :http-config)]
      (. builder httpConfig data))
    (when-let [data (lookup-entry config id :lambda-config)]
      (. builder lambdaConfig data))
    (when-let [data (lookup-entry config id :metrics-config)]
      (. builder metricsConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :open-search-service-config)]
      (. builder openSearchServiceConfig data))
    (when-let [data (lookup-entry config id :relational-database-config)]
      (. builder relationalDatabaseConfig data))
    (when-let [data (lookup-entry config id :service-role-arn)]
      (. builder serviceRoleArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-data-source-rds-http-endpoint-config-property-builder
  "The cfn-data-source-rds-http-endpoint-config-property-builder function buildes out new instances of 
CfnDataSource$RdsHttpEndpointConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `awsSecretStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-secret-store-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |"
  [stack id config]
  (let [builder (CfnDataSource$RdsHttpEndpointConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :aws-secret-store-arn)]
      (. builder awsSecretStoreArn data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (.build builder)))


(defn cfn-data-source-relational-database-config-property-builder
  "The cfn-data-source-relational-database-config-property-builder function buildes out new instances of 
CfnDataSource$RelationalDatabaseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rdsHttpEndpointConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$RdsHttpEndpointConfigProperty | [[cdk.support/lookup-entry]] | `:rds-http-endpoint-config` |
| `relationalDatabaseSourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-source-type` |"
  [stack id config]
  (let [builder (CfnDataSource$RelationalDatabaseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :rds-http-endpoint-config)]
      (. builder rdsHttpEndpointConfig data))
    (when-let [data (lookup-entry config id :relational-database-source-type)]
      (. builder relationalDatabaseSourceType data))
    (.build builder)))


(defn cfn-domain-name-api-association-builder
  "The cfn-domain-name-api-association-builder function buildes out new instances of 
CfnDomainNameApiAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CfnDomainNameApiAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cfn-domain-name-api-association-props-builder
  "The cfn-domain-name-api-association-props-builder function buildes out new instances of 
CfnDomainNameApiAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CfnDomainNameApiAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cfn-domain-name-builder
  "The cfn-domain-name-builder function buildes out new instances of 
CfnDomainName$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CfnDomainName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cfn-domain-name-props-builder
  "The cfn-domain-name-props-builder function buildes out new instances of 
CfnDomainNameProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CfnDomainNameProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cfn-function-configuration-app-sync-runtime-property-builder
  "The cfn-function-configuration-app-sync-runtime-property-builder function buildes out new instances of 
CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |"
  [stack id config]
  (let [builder (CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-version)]
      (. builder runtimeVersion data))
    (.build builder)))


(defn cfn-function-configuration-builder
  "The cfn-function-configuration-builder function buildes out new instances of 
CfnFunctionConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `codeS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-s3-location` |
| `dataSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `requestMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template-s3-location` |
| `responseMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `responseMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template-s3-location` |
| `runtime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime` |
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |"
  [stack id config]
  (let [builder (CfnFunctionConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-s3-location)]
      (. builder codeS3Location data))
    (when-let [data (lookup-entry config id :data-source-name)]
      (. builder dataSourceName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-version)]
      (. builder functionVersion data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :request-mapping-template-s3-location)]
      (. builder requestMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template-s3-location)]
      (. builder responseMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :sync-config)]
      (. builder syncConfig data))
    (.build builder)))


(defn cfn-function-configuration-lambda-conflict-handler-config-property-builder
  "The cfn-function-configuration-lambda-conflict-handler-config-property-builder function buildes out new instances of 
CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConflictHandlerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-arn` |"
  [stack id config]
  (let [builder (CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-conflict-handler-arn)]
      (. builder lambdaConflictHandlerArn data))
    (.build builder)))


(defn cfn-function-configuration-props-builder
  "The cfn-function-configuration-props-builder function buildes out new instances of 
CfnFunctionConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `codeS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-s3-location` |
| `dataSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `functionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-version` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `requestMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template-s3-location` |
| `responseMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `responseMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template-s3-location` |
| `runtime` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$AppSyncRuntimeProperty | [[cdk.support/lookup-entry]] | `:runtime` |
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |"
  [stack id config]
  (let [builder (CfnFunctionConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-s3-location)]
      (. builder codeS3Location data))
    (when-let [data (lookup-entry config id :data-source-name)]
      (. builder dataSourceName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :function-version)]
      (. builder functionVersion data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :request-mapping-template-s3-location)]
      (. builder requestMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template-s3-location)]
      (. builder responseMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :sync-config)]
      (. builder syncConfig data))
    (.build builder)))


(defn cfn-function-configuration-sync-config-property-builder
  "The cfn-function-configuration-sync-config-property-builder function buildes out new instances of 
CfnFunctionConfiguration$SyncConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictDetection` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-detection` |
| `conflictHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-handler` |
| `lambdaConflictHandlerConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-config` |"
  [stack id config]
  (let [builder (CfnFunctionConfiguration$SyncConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :conflict-detection)]
      (. builder conflictDetection data))
    (when-let [data (lookup-entry config id :conflict-handler)]
      (. builder conflictHandler data))
    (when-let [data (lookup-entry config id :lambda-conflict-handler-config)]
      (. builder lambdaConflictHandlerConfig data))
    (.build builder)))


(defn cfn-graph-ql-api-additional-authentication-provider-property-builder
  "The cfn-graph-ql-api-additional-authentication-provider-property-builder function buildes out new instances of 
CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `openIdConnectConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$OpenIDConnectConfigProperty | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$CognitoUserPoolConfigProperty | [[cdk.support/lookup-entry]] | `:user-pool-config` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :lambda-authorizer-config)]
      (. builder lambdaAuthorizerConfig data))
    (when-let [data (lookup-entry config id :open-id-connect-config)]
      (. builder openIdConnectConfig data))
    (when-let [data (lookup-entry config id :user-pool-config)]
      (. builder userPoolConfig data))
    (.build builder)))


(defn cfn-graph-ql-api-builder
  "The cfn-graph-ql-api-builder function buildes out new instances of 
CfnGraphQLApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAuthenticationProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-authentication-providers` |
| `apiType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-type` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `enhancedMetricsConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$EnhancedMetricsConfigProperty | [[cdk.support/lookup-entry]] | `:enhanced-metrics-config` |
| `environmentVariables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `introspectionConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:introspection-config` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$LambdaAuthorizerConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `logConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$LogConfigProperty | [[cdk.support/lookup-entry]] | `:log-config` |
| `mergedApiExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-execution-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openIdConnectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `ownerContact` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-contact` |
| `queryDepthLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-depth-limit` |
| `resolverCountLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:resolver-count-limit` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$UserPoolConfigProperty | [[cdk.support/lookup-entry]] | `:user-pool-config` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-authentication-providers)]
      (. builder additionalAuthenticationProviders data))
    (when-let [data (lookup-entry config id :api-type)]
      (. builder apiType data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :enhanced-metrics-config)]
      (. builder enhancedMetricsConfig data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :introspection-config)]
      (. builder introspectionConfig data))
    (when-let [data (lookup-entry config id :lambda-authorizer-config)]
      (. builder lambdaAuthorizerConfig data))
    (when-let [data (lookup-entry config id :log-config)]
      (. builder logConfig data))
    (when-let [data (lookup-entry config id :merged-api-execution-role-arn)]
      (. builder mergedApiExecutionRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :open-id-connect-config)]
      (. builder openIdConnectConfig data))
    (when-let [data (lookup-entry config id :owner-contact)]
      (. builder ownerContact data))
    (when-let [data (lookup-entry config id :query-depth-limit)]
      (. builder queryDepthLimit data))
    (when-let [data (lookup-entry config id :resolver-count-limit)]
      (. builder resolverCountLimit data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-pool-config)]
      (. builder userPoolConfig data))
    (when-let [data (lookup-entry config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :xray-enabled)]
      (. builder xrayEnabled data))
    (.build builder)))


(defn cfn-graph-ql-api-cognito-user-pool-config-property-builder
  "The cfn-graph-ql-api-cognito-user-pool-config-property-builder function buildes out new instances of 
CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-id-client-regex)]
      (. builder appIdClientRegex data))
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :user-pool-id)]
      (. builder userPoolId data))
    (.build builder)))


(defn cfn-graph-ql-api-enhanced-metrics-config-property-builder
  "The cfn-graph-ql-api-enhanced-metrics-config-property-builder function buildes out new instances of 
CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceLevelMetricsBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-level-metrics-behavior` |
| `operationLevelMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-level-metrics-config` |
| `resolverLevelMetricsBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-level-metrics-behavior` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-source-level-metrics-behavior)]
      (. builder dataSourceLevelMetricsBehavior data))
    (when-let [data (lookup-entry config id :operation-level-metrics-config)]
      (. builder operationLevelMetricsConfig data))
    (when-let [data (lookup-entry config id :resolver-level-metrics-behavior)]
      (. builder resolverLevelMetricsBehavior data))
    (.build builder)))


(defn cfn-graph-ql-api-lambda-authorizer-config-property-builder
  "The cfn-graph-ql-api-lambda-authorizer-config-property-builder function buildes out new instances of 
CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
      (. builder authorizerResultTtlInSeconds data))
    (when-let [data (lookup-entry config id :authorizer-uri)]
      (. builder authorizerUri data))
    (when-let [data (lookup-entry config id :identity-validation-expression)]
      (. builder identityValidationExpression data))
    (.build builder)))


(defn cfn-graph-ql-api-log-config-property-builder
  "The cfn-graph-ql-api-log-config-property-builder function buildes out new instances of 
CfnGraphQLApi$LogConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-role-arn` |
| `excludeVerboseContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-verbose-content` |
| `fieldLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-log-level` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$LogConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs-role-arn)]
      (. builder cloudWatchLogsRoleArn data))
    (when-let [data (lookup-entry config id :exclude-verbose-content)]
      (. builder excludeVerboseContent data))
    (when-let [data (lookup-entry config id :field-log-level)]
      (. builder fieldLogLevel data))
    (.build builder)))


(defn cfn-graph-ql-api-open-id-connect-config-property-builder
  "The cfn-graph-ql-api-open-id-connect-config-property-builder function buildes out new instances of 
CfnGraphQLApi$OpenIDConnectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:auth-ttl` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `iatTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iat-ttl` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$OpenIDConnectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-ttl)]
      (. builder authTtl data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :iat-ttl)]
      (. builder iatTtl data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (.build builder)))


(defn cfn-graph-ql-api-props-builder
  "The cfn-graph-ql-api-props-builder function buildes out new instances of 
CfnGraphQLApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAuthenticationProviders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-authentication-providers` |
| `apiType` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-type` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `enhancedMetricsConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$EnhancedMetricsConfigProperty | [[cdk.support/lookup-entry]] | `:enhanced-metrics-config` |
| `environmentVariables` | java.lang.Object | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `introspectionConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:introspection-config` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$LambdaAuthorizerConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `logConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-config` |
| `mergedApiExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-execution-role-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `openIdConnectConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$OpenIDConnectConfigProperty | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `ownerContact` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-contact` |
| `queryDepthLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-depth-limit` |
| `resolverCountLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:resolver-count-limit` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$UserPoolConfigProperty | [[cdk.support/lookup-entry]] | `:user-pool-config` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |
| `xrayEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xray-enabled` |"
  [stack id config]
  (let [builder (CfnGraphQLApiProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-authentication-providers)]
      (. builder additionalAuthenticationProviders data))
    (when-let [data (lookup-entry config id :api-type)]
      (. builder apiType data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :enhanced-metrics-config)]
      (. builder enhancedMetricsConfig data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :introspection-config)]
      (. builder introspectionConfig data))
    (when-let [data (lookup-entry config id :lambda-authorizer-config)]
      (. builder lambdaAuthorizerConfig data))
    (when-let [data (lookup-entry config id :log-config)]
      (. builder logConfig data))
    (when-let [data (lookup-entry config id :merged-api-execution-role-arn)]
      (. builder mergedApiExecutionRoleArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :open-id-connect-config)]
      (. builder openIdConnectConfig data))
    (when-let [data (lookup-entry config id :owner-contact)]
      (. builder ownerContact data))
    (when-let [data (lookup-entry config id :query-depth-limit)]
      (. builder queryDepthLimit data))
    (when-let [data (lookup-entry config id :resolver-count-limit)]
      (. builder resolverCountLimit data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-pool-config)]
      (. builder userPoolConfig data))
    (when-let [data (lookup-entry config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :xray-enabled)]
      (. builder xrayEnabled data))
    (.build builder)))


(defn cfn-graph-ql-api-user-pool-config-property-builder
  "The cfn-graph-ql-api-user-pool-config-property-builder function buildes out new instances of 
CfnGraphQLApi$UserPoolConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `defaultAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-action` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |"
  [stack id config]
  (let [builder (CfnGraphQLApi$UserPoolConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-id-client-regex)]
      (. builder appIdClientRegex data))
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :user-pool-id)]
      (. builder userPoolId data))
    (.build builder)))


(defn cfn-graph-ql-schema-builder
  "The cfn-graph-ql-schema-builder function buildes out new instances of 
CfnGraphQLSchema$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-s3-location` |"
  [stack id config]
  (let [builder (CfnGraphQLSchema$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-s3-location)]
      (. builder definitionS3Location data))
    (.build builder)))


(defn cfn-graph-ql-schema-props-builder
  "The cfn-graph-ql-schema-props-builder function buildes out new instances of 
CfnGraphQLSchemaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-s3-location` |"
  [stack id config]
  (let [builder (CfnGraphQLSchemaProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :definition-s3-location)]
      (. builder definitionS3Location data))
    (.build builder)))


(defn cfn-resolver-app-sync-runtime-property-builder
  "The cfn-resolver-app-sync-runtime-property-builder function buildes out new instances of 
CfnResolver$AppSyncRuntimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |"
  [stack id config]
  (let [builder (CfnResolver$AppSyncRuntimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-version)]
      (. builder runtimeVersion data))
    (.build builder)))


(defn cfn-resolver-builder
  "The cfn-resolver-builder function buildes out new instances of 
CfnResolver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `cachingConfig` | software.amazon.awscdk.services.appsync.CfnResolver$CachingConfigProperty | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `codeS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-s3-location` |
| `dataSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-name` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `kind` | java.lang.String | [[cdk.support/lookup-entry]] | `:kind` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `metricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-config` |
| `pipelineConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `requestMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template-s3-location` |
| `responseMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `responseMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template-s3-location` |
| `runtime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime` |
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnResolver$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResolver$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-s3-location)]
      (. builder codeS3Location data))
    (when-let [data (lookup-entry config id :data-source-name)]
      (. builder dataSourceName data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :kind)]
      (. builder kind data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :metrics-config)]
      (. builder metricsConfig data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :request-mapping-template-s3-location)]
      (. builder requestMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template-s3-location)]
      (. builder responseMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :sync-config)]
      (. builder syncConfig data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-resolver-caching-config-property-builder
  "The cfn-resolver-caching-config-property-builder function buildes out new instances of 
CfnResolver$CachingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:caching-keys` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CfnResolver$CachingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :caching-keys)]
      (. builder cachingKeys data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-resolver-lambda-conflict-handler-config-property-builder
  "The cfn-resolver-lambda-conflict-handler-config-property-builder function buildes out new instances of 
CfnResolver$LambdaConflictHandlerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConflictHandlerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-arn` |"
  [stack id config]
  (let [builder (CfnResolver$LambdaConflictHandlerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-conflict-handler-arn)]
      (. builder lambdaConflictHandlerArn data))
    (.build builder)))


(defn cfn-resolver-pipeline-config-property-builder
  "The cfn-resolver-pipeline-config-property-builder function buildes out new instances of 
CfnResolver$PipelineConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |"
  [stack id config]
  (let [builder (CfnResolver$PipelineConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :functions)]
      (. builder functions data))
    (.build builder)))


(defn cfn-resolver-props-builder
  "The cfn-resolver-props-builder function buildes out new instances of 
CfnResolverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `cachingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `codeS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-s3-location` |
| `dataSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-name` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `kind` | java.lang.String | [[cdk.support/lookup-entry]] | `:kind` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `metricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:metrics-config` |
| `pipelineConfig` | software.amazon.awscdk.services.appsync.CfnResolver$PipelineConfigProperty | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `requestMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:request-mapping-template-s3-location` |
| `responseMappingTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `responseMappingTemplateS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-mapping-template-s3-location` |
| `runtime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime` |
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnResolver$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnResolverProps$Builder.)]
    (when-let [data (lookup-entry config id :api-id)]
      (. builder apiId data))
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-s3-location)]
      (. builder codeS3Location data))
    (when-let [data (lookup-entry config id :data-source-name)]
      (. builder dataSourceName data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :kind)]
      (. builder kind data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :metrics-config)]
      (. builder metricsConfig data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :request-mapping-template-s3-location)]
      (. builder requestMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template-s3-location)]
      (. builder responseMappingTemplateS3Location data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :sync-config)]
      (. builder syncConfig data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-resolver-sync-config-property-builder
  "The cfn-resolver-sync-config-property-builder function buildes out new instances of 
CfnResolver$SyncConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictDetection` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-detection` |
| `conflictHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-handler` |
| `lambdaConflictHandlerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-config` |"
  [stack id config]
  (let [builder (CfnResolver$SyncConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :conflict-detection)]
      (. builder conflictDetection data))
    (when-let [data (lookup-entry config id :conflict-handler)]
      (. builder conflictHandler data))
    (when-let [data (lookup-entry config id :lambda-conflict-handler-config)]
      (. builder lambdaConflictHandlerConfig data))
    (.build builder)))


(defn cfn-source-api-association-builder
  "The cfn-source-api-association-builder function buildes out new instances of 
CfnSourceApiAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergedApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-identifier` |
| `sourceApiAssociationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-api-association-config` |
| `sourceApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-api-identifier` |"
  [stack id config]
  (let [builder (CfnSourceApiAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :merged-api-identifier)]
      (. builder mergedApiIdentifier data))
    (when-let [data (lookup-entry config id :source-api-association-config)]
      (. builder sourceApiAssociationConfig data))
    (when-let [data (lookup-entry config id :source-api-identifier)]
      (. builder sourceApiIdentifier data))
    (.build builder)))


(defn cfn-source-api-association-props-builder
  "The cfn-source-api-association-props-builder function buildes out new instances of 
CfnSourceApiAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergedApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-identifier` |
| `sourceApiAssociationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-api-association-config` |
| `sourceApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-api-identifier` |"
  [stack id config]
  (let [builder (CfnSourceApiAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :merged-api-identifier)]
      (. builder mergedApiIdentifier data))
    (when-let [data (lookup-entry config id :source-api-association-config)]
      (. builder sourceApiAssociationConfig data))
    (when-let [data (lookup-entry config id :source-api-identifier)]
      (. builder sourceApiIdentifier data))
    (.build builder)))


(defn cfn-source-api-association-source-api-association-config-property-builder
  "The cfn-source-api-association-source-api-association-config-property-builder function buildes out new instances of 
CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mergeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:merge-type` |"
  [stack id config]
  (let [builder (CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :merge-type)]
      (. builder mergeType data))
    (.build builder)))


(defn code-config-builder
  "The code-config-builder function buildes out new instances of 
CodeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |"
  [stack id config]
  (let [builder (CodeConfig$Builder.)]
    (when-let [data (lookup-entry config id :inline-code)]
      (. builder inlineCode data))
    (when-let [data (lookup-entry config id :s3-location)]
      (. builder s3Location data))
    (.build builder)))


(defn data-source-options-builder
  "The data-source-options-builder function buildes out new instances of 
DataSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (DataSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn domain-options-builder
  "The domain-options-builder function buildes out new instances of 
DomainOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (DomainOptions$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn dynamo-db-data-source-builder
  "The dynamo-db-data-source-builder function buildes out new instances of 
DynamoDbDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnlyAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-access` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |"
  [stack id config]
  (let [builder (DynamoDbDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :read-only-access)]
      (. builder readOnlyAccess data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :use-caller-credentials)]
      (. builder useCallerCredentials data))
    (.build builder)))


(defn dynamo-db-data-source-props-builder
  "The dynamo-db-data-source-props-builder function buildes out new instances of 
DynamoDbDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnlyAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-access` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |"
  [stack id config]
  (let [builder (DynamoDbDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :read-only-access)]
      (. builder readOnlyAccess data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (when-let [data (lookup-entry config id :table)]
      (. builder table data))
    (when-let [data (lookup-entry config id :use-caller-credentials)]
      (. builder useCallerCredentials data))
    (.build builder)))


(defn event-bridge-data-source-builder
  "The event-bridge-data-source-builder function buildes out new instances of 
EventBridgeDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (EventBridgeDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn event-bridge-data-source-props-builder
  "The event-bridge-data-source-props-builder function buildes out new instances of 
EventBridgeDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (EventBridgeDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bus)]
      (. builder eventBus data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn extended-data-source-props-builder
  "The extended-data-source-props-builder function buildes out new instances of 
ExtendedDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dynamoDbConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db-config` |
| `elasticsearchConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$ElasticsearchConfigProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-config` |
| `eventBridgeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-config` |
| `httpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-config` |
| `lambdaConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$LambdaConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `openSearchServiceConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$OpenSearchServiceConfigProperty | [[cdk.support/lookup-entry]] | `:open-search-service-config` |
| `relationalDatabaseConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$RelationalDatabaseConfigProperty | [[cdk.support/lookup-entry]] | `:relational-database-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (ExtendedDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :dynamo-db-config)]
      (. builder dynamoDbConfig data))
    (when-let [data (lookup-entry config id :elasticsearch-config)]
      (. builder elasticsearchConfig data))
    (when-let [data (lookup-entry config id :event-bridge-config)]
      (. builder eventBridgeConfig data))
    (when-let [data (lookup-entry config id :http-config)]
      (. builder httpConfig data))
    (when-let [data (lookup-entry config id :lambda-config)]
      (. builder lambdaConfig data))
    (when-let [data (lookup-entry config id :open-search-service-config)]
      (. builder openSearchServiceConfig data))
    (when-let [data (lookup-entry config id :relational-database-config)]
      (. builder relationalDatabaseConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn extended-resolver-props-builder
  "The extended-resolver-props-builder function buildes out new instances of 
ExtendedResolverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingConfig` | software.amazon.awscdk.services.appsync.CachingConfig | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `pipelineConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (ExtendedResolverProps$Builder.)]
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn graphql-api-attributes-builder
  "The graphql-api-attributes-builder function buildes out new instances of 
GraphqlApiAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphQlEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-endpoint-arn` |
| `graphqlApiArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graphql-api-arn` |
| `graphqlApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:graphql-api-id` |
| `modes` | java.util.List | [[cdk.support/lookup-entry]] | `:modes` |
| `visibility` | software.amazon.awscdk.services.appsync.Visibility | [[cdk.api.services.appsync/visibility]] | `:visibility` |"
  [stack id config]
  (let [builder (GraphqlApiAttributes$Builder.)]
    (when-let [data (lookup-entry config id :graph-ql-endpoint-arn)]
      (. builder graphQlEndpointArn data))
    (when-let [data (lookup-entry config id :graphql-api-arn)]
      (. builder graphqlApiArn data))
    (when-let [data (lookup-entry config id :graphql-api-id)]
      (. builder graphqlApiId data))
    (when-let [data (lookup-entry config id :modes)]
      (. builder modes data))
    (when-let [data (visibility config id :visibility)]
      (. builder visibility data))
    (.build builder)))


(defn graphql-api-builder
  "The graphql-api-builder function buildes out new instances of 
GraphqlApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AuthorizationConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `definition` | software.amazon.awscdk.services.appsync.Definition | [[cdk.support/lookup-entry]] | `:definition` |
| `domainName` | software.amazon.awscdk.services.appsync.DomainOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `introspectionConfig` | software.amazon.awscdk.services.appsync.IntrospectionConfig | [[cdk.api.services.appsync/introspection-config]] | `:introspection-config` |
| `logConfig` | software.amazon.awscdk.services.appsync.LogConfig | [[cdk.support/lookup-entry]] | `:log-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryDepthLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-depth-limit` |
| `resolverCountLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:resolver-count-limit` |
| `schema` | software.amazon.awscdk.services.appsync.ISchema | [[cdk.support/lookup-entry]] | `:schema` |
| `visibility` | software.amazon.awscdk.services.appsync.Visibility | [[cdk.api.services.appsync/visibility]] | `:visibility` |
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |"
  [stack id config]
  (let [builder (GraphqlApi$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (introspection-config config id :introspection-config)]
      (. builder introspectionConfig data))
    (when-let [data (lookup-entry config id :log-config)]
      (. builder logConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-depth-limit)]
      (. builder queryDepthLimit data))
    (when-let [data (lookup-entry config id :resolver-count-limit)]
      (. builder resolverCountLimit data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (visibility config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :xray-enabled)]
      (. builder xrayEnabled data))
    (.build builder)))


(defn graphql-api-props-builder
  "The graphql-api-props-builder function buildes out new instances of 
GraphqlApiProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AuthorizationConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `definition` | software.amazon.awscdk.services.appsync.Definition | [[cdk.support/lookup-entry]] | `:definition` |
| `domainName` | software.amazon.awscdk.services.appsync.DomainOptions | [[cdk.support/lookup-entry]] | `:domain-name` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `introspectionConfig` | software.amazon.awscdk.services.appsync.IntrospectionConfig | [[cdk.api.services.appsync/introspection-config]] | `:introspection-config` |
| `logConfig` | software.amazon.awscdk.services.appsync.LogConfig | [[cdk.support/lookup-entry]] | `:log-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryDepthLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:query-depth-limit` |
| `resolverCountLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:resolver-count-limit` |
| `schema` | software.amazon.awscdk.services.appsync.ISchema | [[cdk.support/lookup-entry]] | `:schema` |
| `visibility` | software.amazon.awscdk.services.appsync.Visibility | [[cdk.api.services.appsync/visibility]] | `:visibility` |
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |"
  [stack id config]
  (let [builder (GraphqlApiProps$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (introspection-config config id :introspection-config)]
      (. builder introspectionConfig data))
    (when-let [data (lookup-entry config id :log-config)]
      (. builder logConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-depth-limit)]
      (. builder queryDepthLimit data))
    (when-let [data (lookup-entry config id :resolver-count-limit)]
      (. builder resolverCountLimit data))
    (when-let [data (lookup-entry config id :schema)]
      (. builder schema data))
    (when-let [data (visibility config id :visibility)]
      (. builder visibility data))
    (when-let [data (lookup-entry config id :xray-enabled)]
      (. builder xrayEnabled data))
    (.build builder)))


(defn http-data-source-builder
  "The http-data-source-builder function buildes out new instances of 
HttpDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (HttpDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn http-data-source-options-builder
  "The http-data-source-options-builder function buildes out new instances of 
HttpDataSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (HttpDataSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn http-data-source-props-builder
  "The http-data-source-props-builder function buildes out new instances of 
HttpDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (HttpDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :authorization-config)]
      (. builder authorizationConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn lambda-authorizer-config-builder
  "The lambda-authorizer-config-builder function buildes out new instances of 
LambdaAuthorizerConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |"
  [stack id config]
  (let [builder (LambdaAuthorizerConfig$Builder.)]
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (when-let [data (lookup-entry config id :validation-regex)]
      (. builder validationRegex data))
    (.build builder)))


(defn lambda-data-source-builder
  "The lambda-data-source-builder function buildes out new instances of 
LambdaDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (LambdaDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn lambda-data-source-props-builder
  "The lambda-data-source-props-builder function buildes out new instances of 
LambdaDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (LambdaDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn log-config-builder
  "The log-config-builder function buildes out new instances of 
LogConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeVerboseContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-verbose-content` |
| `fieldLogLevel` | software.amazon.awscdk.services.appsync.FieldLogLevel | [[cdk.api.services.appsync/field-log-level]] | `:field-log-level` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (LogConfig$Builder.)]
    (when-let [data (lookup-entry config id :exclude-verbose-content)]
      (. builder excludeVerboseContent data))
    (when-let [data (field-log-level config id :field-log-level)]
      (. builder fieldLogLevel data))
    (when-let [data (retention-days config id :retention)]
      (. builder retention data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn none-data-source-builder
  "The none-data-source-builder function buildes out new instances of 
NoneDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (NoneDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn none-data-source-props-builder
  "The none-data-source-props-builder function buildes out new instances of 
NoneDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (NoneDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn open-id-connect-config-builder
  "The open-id-connect-config-builder function buildes out new instances of 
OpenIdConnectConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `oidcProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:oidc-provider` |
| `tokenExpiryFromAuth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:token-expiry-from-auth` |
| `tokenExpiryFromIssue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:token-expiry-from-issue` |"
  [stack id config]
  (let [builder (OpenIdConnectConfig$Builder.)]
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :oidc-provider)]
      (. builder oidcProvider data))
    (when-let [data (lookup-entry config id :token-expiry-from-auth)]
      (. builder tokenExpiryFromAuth data))
    (when-let [data (lookup-entry config id :token-expiry-from-issue)]
      (. builder tokenExpiryFromIssue data))
    (.build builder)))


(defn open-search-data-source-builder
  "The open-search-data-source-builder function buildes out new instances of 
OpenSearchDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domain` | software.amazon.awscdk.services.opensearchservice.IDomain | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (OpenSearchDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn open-search-data-source-props-builder
  "The open-search-data-source-props-builder function buildes out new instances of 
OpenSearchDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domain` | software.amazon.awscdk.services.opensearchservice.IDomain | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (OpenSearchDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn rds-data-source-builder
  "The rds-data-source-builder function buildes out new instances of 
RdsDataSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IServerlessCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (RdsDataSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :secret-store)]
      (. builder secretStore data))
    (when-let [data (lookup-entry config id :serverless-cluster)]
      (. builder serverlessCluster data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn rds-data-source-props-builder
  "The rds-data-source-props-builder function buildes out new instances of 
RdsDataSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IServerlessCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (RdsDataSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :secret-store)]
      (. builder secretStore data))
    (when-let [data (lookup-entry config id :serverless-cluster)]
      (. builder serverlessCluster data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn rds-data-source-props-v2-builder
  "The rds-data-source-props-v2-builder function buildes out new instances of 
RdsDataSourcePropsV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IDatabaseCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |"
  [stack id config]
  (let [builder (RdsDataSourcePropsV2$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :secret-store)]
      (. builder secretStore data))
    (when-let [data (lookup-entry config id :serverless-cluster)]
      (. builder serverlessCluster data))
    (when-let [data (lookup-entry config id :service-role)]
      (. builder serviceRole data))
    (.build builder)))


(defn resolver-builder
  "The resolver-builder function buildes out new instances of 
Resolver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `cachingConfig` | software.amazon.awscdk.services.appsync.CachingConfig | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `pipelineConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (Resolver$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn resolver-props-builder
  "The resolver-props-builder function buildes out new instances of 
ResolverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `cachingConfig` | software.amazon.awscdk.services.appsync.CachingConfig | [[cdk.support/lookup-entry]] | `:caching-config` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `fieldName` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-name` |
| `maxBatchSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-batch-size` |
| `pipelineConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:pipeline-config` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (ResolverProps$Builder.)]
    (when-let [data (lookup-entry config id :api)]
      (. builder api data))
    (when-let [data (lookup-entry config id :caching-config)]
      (. builder cachingConfig data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :field-name)]
      (. builder fieldName data))
    (when-let [data (lookup-entry config id :max-batch-size)]
      (. builder maxBatchSize data))
    (when-let [data (lookup-entry config id :pipeline-config)]
      (. builder pipelineConfig data))
    (when-let [data (lookup-entry config id :request-mapping-template)]
      (. builder requestMappingTemplate data))
    (when-let [data (lookup-entry config id :response-mapping-template)]
      (. builder responseMappingTemplate data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn runtime-config-builder
  "The runtime-config-builder function buildes out new instances of 
RuntimeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |"
  [stack id config]
  (let [builder (RuntimeConfig$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-version)]
      (. builder runtimeVersion data))
    (.build builder)))


(defn schema-bind-options-builder
  "The schema-bind-options-builder function buildes out new instances of 
SchemaBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (SchemaBindOptions$Builder.)]
    (.build builder)))


(defn schema-file-builder
  "The schema-file-builder function buildes out new instances of 
SchemaFile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |"
  [stack id config]
  (let [builder (SchemaFile$Builder/create)]
    (when-let [data (lookup-entry config id :file-path)]
      (. builder filePath data))
    (.build builder)))


(defn schema-props-builder
  "The schema-props-builder function buildes out new instances of 
SchemaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |"
  [stack id config]
  (let [builder (SchemaProps$Builder.)]
    (when-let [data (lookup-entry config id :file-path)]
      (. builder filePath data))
    (.build builder)))


(defn source-api-association-attributes-builder
  "The source-api-association-attributes-builder function buildes out new instances of 
SourceApiAssociationAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-arn` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |"
  [stack id config]
  (let [builder (SourceApiAssociationAttributes$Builder.)]
    (when-let [data (lookup-entry config id :association-arn)]
      (. builder associationArn data))
    (when-let [data (lookup-entry config id :merged-api)]
      (. builder mergedApi data))
    (when-let [data (lookup-entry config id :source-api)]
      (. builder sourceApi data))
    (.build builder)))


(defn source-api-association-builder
  "The source-api-association-builder function buildes out new instances of 
SourceApiAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |"
  [stack id config]
  (let [builder (SourceApiAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (merge-type config id :merge-type)]
      (. builder mergeType data))
    (when-let [data (lookup-entry config id :merged-api)]
      (. builder mergedApi data))
    (when-let [data (lookup-entry config id :merged-api-execution-role)]
      (. builder mergedApiExecutionRole data))
    (when-let [data (lookup-entry config id :source-api)]
      (. builder sourceApi data))
    (.build builder)))


(defn source-api-association-props-builder
  "The source-api-association-props-builder function buildes out new instances of 
SourceApiAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |"
  [stack id config]
  (let [builder (SourceApiAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (merge-type config id :merge-type)]
      (. builder mergeType data))
    (when-let [data (lookup-entry config id :merged-api)]
      (. builder mergedApi data))
    (when-let [data (lookup-entry config id :merged-api-execution-role)]
      (. builder mergedApiExecutionRole data))
    (when-let [data (lookup-entry config id :source-api)]
      (. builder sourceApi data))
    (.build builder)))


(defn source-api-builder
  "The source-api-builder function buildes out new instances of 
SourceApi$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |"
  [stack id config]
  (let [builder (SourceApi$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (merge-type config id :merge-type)]
      (. builder mergeType data))
    (when-let [data (lookup-entry config id :source-api)]
      (. builder sourceApi data))
    (.build builder)))


(defn source-api-options-builder
  "The source-api-options-builder function buildes out new instances of 
SourceApiOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.Role | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApis` | java.util.List | [[cdk.support/lookup-entry]] | `:source-apis` |"
  [stack id config]
  (let [builder (SourceApiOptions$Builder.)]
    (when-let [data (lookup-entry config id :merged-api-execution-role)]
      (. builder mergedApiExecutionRole data))
    (when-let [data (lookup-entry config id :source-apis)]
      (. builder sourceApis data))
    (.build builder)))


(defn user-pool-config-builder
  "The user-pool-config-builder function buildes out new instances of 
UserPoolConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `defaultAction` | software.amazon.awscdk.services.appsync.UserPoolDefaultAction | [[cdk.api.services.appsync/user-pool-default-action]] | `:default-action` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |"
  [stack id config]
  (let [builder (UserPoolConfig$Builder.)]
    (when-let [data (lookup-entry config id :app-id-client-regex)]
      (. builder appIdClientRegex data))
    (when-let [data (user-pool-default-action config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :user-pool)]
      (. builder userPool data))
    (.build builder)))