(ns cdk.api.services.appsync
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appsync package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
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


(defn build-api-key-config-builder
  "The build-api-key-config-builder function updates a ApiKeyConfig$Builder instance using the provided configuration.
  The function takes the ApiKeyConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | software.amazon.awscdk.Expiration | [[cdk.support/lookup-entry]] | `:expires` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^ApiKeyConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :expires)]
    (. builder expires data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn api-key-config-builder
  ""
  [id config]
  (build-api-key-config-builder (new ApiKeyConfig$Builder) id config))


(defn build-appsync-function-attributes-builder
  "The build-appsync-function-attributes-builder function updates a AppsyncFunctionAttributes$Builder instance using the provided configuration.
  The function takes the AppsyncFunctionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
"
  [^AppsyncFunctionAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (.build builder))


(defn appsync-function-attributes-builder
  ""
  [id config]
  (build-appsync-function-attributes-builder (new AppsyncFunctionAttributes$Builder) id config))


(defn build-appsync-function-builder
  "The build-appsync-function-builder function updates a AppsyncFunction$Builder instance using the provided configuration.
  The function takes the AppsyncFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^AppsyncFunction$Builder builder id config]
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
  (.build builder))


(defn appsync-function-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-appsync-function-builder (AppsyncFunction$Builder/create scope (name id)) id config))


(defn build-appsync-function-props-builder
  "The build-appsync-function-props-builder function updates a AppsyncFunctionProps$Builder instance using the provided configuration.
  The function takes the AppsyncFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `dataSource` | software.amazon.awscdk.services.appsync.BaseDataSource | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^AppsyncFunctionProps$Builder builder id config]
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
  (.build builder))


(defn appsync-function-props-builder
  ""
  [id config]
  (build-appsync-function-props-builder (new AppsyncFunctionProps$Builder) id config))


(defn build-asset-code-builder
  "The build-asset-code-builder function updates a AssetCode$Builder instance using the provided configuration.
  The function takes the AssetCode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^AssetCode$Builder builder id config]
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
  (.build builder))


(defn build-authorization-config-builder
  "The build-authorization-config-builder function updates a AuthorizationConfig$Builder instance using the provided configuration.
  The function takes the AuthorizationConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAuthorizationModes` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-authorization-modes` |
| `defaultAuthorization` | software.amazon.awscdk.services.appsync.AuthorizationMode | [[cdk.support/lookup-entry]] | `:default-authorization` |
"
  [^AuthorizationConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-authorization-modes)]
    (. builder additionalAuthorizationModes data))
  (when-let [data (lookup-entry config id :default-authorization)]
    (. builder defaultAuthorization data))
  (.build builder))


(defn authorization-config-builder
  ""
  [id config]
  (build-authorization-config-builder (new AuthorizationConfig$Builder) id config))


(defn build-authorization-mode-builder
  "The build-authorization-mode-builder function updates a AuthorizationMode$Builder instance using the provided configuration.
  The function takes the AuthorizationMode$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKeyConfig` | software.amazon.awscdk.services.appsync.ApiKeyConfig | [[cdk.support/lookup-entry]] | `:api-key-config` |
| `authorizationType` | software.amazon.awscdk.services.appsync.AuthorizationType | [[cdk.api.services.appsync/authorization-type]] | `:authorization-type` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `openIdConnectConfig` | software.amazon.awscdk.services.appsync.OpenIdConnectConfig | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.UserPoolConfig | [[cdk.support/lookup-entry]] | `:user-pool-config` |
"
  [^AuthorizationMode$Builder builder id config]
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
  (.build builder))


(defn authorization-mode-builder
  ""
  [id config]
  (build-authorization-mode-builder (new AuthorizationMode$Builder) id config))


(defn build-aws-iam-config-builder
  "The build-aws-iam-config-builder function updates a AwsIamConfig$Builder instance using the provided configuration.
  The function takes the AwsIamConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |
| `signingServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-service-name` |
"
  [^AwsIamConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :signing-region)]
    (. builder signingRegion data))
  (when-let [data (lookup-entry config id :signing-service-name)]
    (. builder signingServiceName data))
  (.build builder))


(defn aws-iam-config-builder
  ""
  [id config]
  (build-aws-iam-config-builder (new AwsIamConfig$Builder) id config))


(defn build-backed-data-source-props-builder
  "The build-backed-data-source-props-builder function updates a BackedDataSourceProps$Builder instance using the provided configuration.
  The function takes the BackedDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^BackedDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :service-role)]
    (. builder serviceRole data))
  (.build builder))


(defn backed-data-source-props-builder
  ""
  [id config]
  (build-backed-data-source-props-builder (new BackedDataSourceProps$Builder) id config))


(defn build-base-appsync-function-props-builder
  "The build-base-appsync-function-props-builder function updates a BaseAppsyncFunctionProps$Builder instance using the provided configuration.
  The function takes the BaseAppsyncFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.appsync.Code | [[cdk.support/lookup-entry]] | `:code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requestMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:request-mapping-template` |
| `responseMappingTemplate` | software.amazon.awscdk.services.appsync.MappingTemplate | [[cdk.support/lookup-entry]] | `:response-mapping-template` |
| `runtime` | software.amazon.awscdk.services.appsync.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^BaseAppsyncFunctionProps$Builder builder id config]
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
  (.build builder))


(defn base-appsync-function-props-builder
  ""
  [id config]
  (build-base-appsync-function-props-builder (new BaseAppsyncFunctionProps$Builder) id config))


(defn build-base-data-source-props-builder
  "The build-base-data-source-props-builder function updates a BaseDataSourceProps$Builder instance using the provided configuration.
  The function takes the BaseDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^BaseDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn base-data-source-props-builder
  ""
  [id config]
  (build-base-data-source-props-builder (new BaseDataSourceProps$Builder) id config))


(defn build-base-resolver-props-builder
  "The build-base-resolver-props-builder function updates a BaseResolverProps$Builder instance using the provided configuration.
  The function takes the BaseResolverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^BaseResolverProps$Builder builder id config]
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
  (.build builder))


(defn base-resolver-props-builder
  ""
  [id config]
  (build-base-resolver-props-builder (new BaseResolverProps$Builder) id config))


(defn build-caching-config-builder
  "The build-caching-config-builder function updates a CachingConfig$Builder instance using the provided configuration.
  The function takes the CachingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:caching-keys` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CachingConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :caching-keys)]
    (. builder cachingKeys data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn caching-config-builder
  ""
  [id config]
  (build-caching-config-builder (new CachingConfig$Builder) id config))


(defn build-cfn-api-cache-builder
  "The build-cfn-api-cache-builder function updates a CfnApiCache$Builder instance using the provided configuration.
  The function takes the CfnApiCache$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiCachingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-caching-behavior` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `atRestEncryptionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `healthMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-metrics-config` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApiCache$Builder builder id config]
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
  (.build builder))


(defn cfn-api-cache-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-api-cache-builder (CfnApiCache$Builder/create scope (name id)) id config))


(defn build-cfn-api-cache-props-builder
  "The build-cfn-api-cache-props-builder function updates a CfnApiCacheProps$Builder instance using the provided configuration.
  The function takes the CfnApiCacheProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiCachingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-caching-behavior` |
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `atRestEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:at-rest-encryption-enabled` |
| `healthMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-metrics-config` |
| `transitEncryptionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:transit-encryption-enabled` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApiCacheProps$Builder builder id config]
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
  (.build builder))


(defn cfn-api-cache-props-builder
  ""
  [id config]
  (build-cfn-api-cache-props-builder (new CfnApiCacheProps$Builder) id config))


(defn build-cfn-api-key-builder
  "The build-cfn-api-key-builder function updates a CfnApiKey$Builder instance using the provided configuration.
  The function takes the CfnApiKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires` |
"
  [^CfnApiKey$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :expires)]
    (. builder expires data))
  (.build builder))


(defn cfn-api-key-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-api-key-builder (CfnApiKey$Builder/create scope (name id)) id config))


(defn build-cfn-api-key-props-builder
  "The build-cfn-api-key-props-builder function updates a CfnApiKeyProps$Builder instance using the provided configuration.
  The function takes the CfnApiKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expires` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires` |
"
  [^CfnApiKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :expires)]
    (. builder expires data))
  (.build builder))


(defn cfn-api-key-props-builder
  ""
  [id config]
  (build-cfn-api-key-props-builder (new CfnApiKeyProps$Builder) id config))


(defn build-cfn-data-source-authorization-config-property-builder
  "The build-cfn-data-source-authorization-config-property-builder function updates a CfnDataSource$AuthorizationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$AuthorizationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-type` |
| `awsIamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-iam-config` |
"
  [^CfnDataSource$AuthorizationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-type)]
    (. builder authorizationType data))
  (when-let [data (lookup-entry config id :aws-iam-config)]
    (. builder awsIamConfig data))
  (.build builder))


(defn cfn-data-source-authorization-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-authorization-config-property-builder (new CfnDataSource$AuthorizationConfigProperty$Builder) id config))


(defn build-cfn-data-source-aws-iam-config-property-builder
  "The build-cfn-data-source-aws-iam-config-property-builder function updates a CfnDataSource$AwsIamConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$AwsIamConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |
| `signingServiceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-service-name` |
"
  [^CfnDataSource$AwsIamConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :signing-region)]
    (. builder signingRegion data))
  (when-let [data (lookup-entry config id :signing-service-name)]
    (. builder signingServiceName data))
  (.build builder))


(defn cfn-data-source-aws-iam-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-aws-iam-config-property-builder (new CfnDataSource$AwsIamConfigProperty$Builder) id config))


(defn build-cfn-data-source-builder
  "The build-cfn-data-source-builder function updates a CfnDataSource$Builder instance using the provided configuration.
  The function takes the CfnDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSource$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-data-source-builder (CfnDataSource$Builder/create scope (name id)) id config))


(defn build-cfn-data-source-delta-sync-config-property-builder
  "The build-cfn-data-source-delta-sync-config-property-builder function updates a CfnDataSource$DeltaSyncConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DeltaSyncConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseTableTtl` | java.lang.String | [[cdk.support/lookup-entry]] | `:base-table-ttl` |
| `deltaSyncTableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delta-sync-table-name` |
| `deltaSyncTableTtl` | java.lang.String | [[cdk.support/lookup-entry]] | `:delta-sync-table-ttl` |
"
  [^CfnDataSource$DeltaSyncConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :base-table-ttl)]
    (. builder baseTableTtl data))
  (when-let [data (lookup-entry config id :delta-sync-table-name)]
    (. builder deltaSyncTableName data))
  (when-let [data (lookup-entry config id :delta-sync-table-ttl)]
    (. builder deltaSyncTableTtl data))
  (.build builder))


(defn cfn-data-source-delta-sync-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-delta-sync-config-property-builder (new CfnDataSource$DeltaSyncConfigProperty$Builder) id config))


(defn build-cfn-data-source-dynamo-db-config-property-builder
  "The build-cfn-data-source-dynamo-db-config-property-builder function updates a CfnDataSource$DynamoDBConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$DynamoDBConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `deltaSyncConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$DeltaSyncConfigProperty | [[cdk.support/lookup-entry]] | `:delta-sync-config` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |
| `versioned` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:versioned` |
"
  [^CfnDataSource$DynamoDBConfigProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-dynamo-db-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-dynamo-db-config-property-builder (new CfnDataSource$DynamoDBConfigProperty$Builder) id config))


(defn build-cfn-data-source-elasticsearch-config-property-builder
  "The build-cfn-data-source-elasticsearch-config-property-builder function updates a CfnDataSource$ElasticsearchConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$ElasticsearchConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
"
  [^CfnDataSource$ElasticsearchConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (.build builder))


(defn cfn-data-source-elasticsearch-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-elasticsearch-config-property-builder (new CfnDataSource$ElasticsearchConfigProperty$Builder) id config))


(defn build-cfn-data-source-event-bridge-config-property-builder
  "The build-cfn-data-source-event-bridge-config-property-builder function updates a CfnDataSource$EventBridgeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$EventBridgeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventBusArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bus-arn` |
"
  [^CfnDataSource$EventBridgeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :event-bus-arn)]
    (. builder eventBusArn data))
  (.build builder))


(defn cfn-data-source-event-bridge-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-event-bridge-config-property-builder (new CfnDataSource$EventBridgeConfigProperty$Builder) id config))


(defn build-cfn-data-source-http-config-property-builder
  "The build-cfn-data-source-http-config-property-builder function updates a CfnDataSource$HttpConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$HttpConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
"
  [^CfnDataSource$HttpConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-config)]
    (. builder authorizationConfig data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (.build builder))


(defn cfn-data-source-http-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-http-config-property-builder (new CfnDataSource$HttpConfigProperty$Builder) id config))


(defn build-cfn-data-source-lambda-config-property-builder
  "The build-cfn-data-source-lambda-config-property-builder function updates a CfnDataSource$LambdaConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$LambdaConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
"
  [^CfnDataSource$LambdaConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (.build builder))


(defn cfn-data-source-lambda-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-lambda-config-property-builder (new CfnDataSource$LambdaConfigProperty$Builder) id config))


(defn build-cfn-data-source-open-search-service-config-property-builder
  "The build-cfn-data-source-open-search-service-config-property-builder function updates a CfnDataSource$OpenSearchServiceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$OpenSearchServiceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
"
  [^CfnDataSource$OpenSearchServiceConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (.build builder))


(defn cfn-data-source-open-search-service-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-open-search-service-config-property-builder (new CfnDataSource$OpenSearchServiceConfigProperty$Builder) id config))


(defn build-cfn-data-source-props-builder
  "The build-cfn-data-source-props-builder function updates a CfnDataSourceProps$Builder instance using the provided configuration.
  The function takes the CfnDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-props-builder
  ""
  [id config]
  (build-cfn-data-source-props-builder (new CfnDataSourceProps$Builder) id config))


(defn build-cfn-data-source-rds-http-endpoint-config-property-builder
  "The build-cfn-data-source-rds-http-endpoint-config-property-builder function updates a CfnDataSource$RdsHttpEndpointConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RdsHttpEndpointConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `awsSecretStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-secret-store-arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `schema` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema` |
"
  [^CfnDataSource$RdsHttpEndpointConfigProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-data-source-rds-http-endpoint-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-rds-http-endpoint-config-property-builder (new CfnDataSource$RdsHttpEndpointConfigProperty$Builder) id config))


(defn build-cfn-data-source-relational-database-config-property-builder
  "The build-cfn-data-source-relational-database-config-property-builder function updates a CfnDataSource$RelationalDatabaseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataSource$RelationalDatabaseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rdsHttpEndpointConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$RdsHttpEndpointConfigProperty | [[cdk.support/lookup-entry]] | `:rds-http-endpoint-config` |
| `relationalDatabaseSourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-source-type` |
"
  [^CfnDataSource$RelationalDatabaseConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rds-http-endpoint-config)]
    (. builder rdsHttpEndpointConfig data))
  (when-let [data (lookup-entry config id :relational-database-source-type)]
    (. builder relationalDatabaseSourceType data))
  (.build builder))


(defn cfn-data-source-relational-database-config-property-builder
  ""
  [id config]
  (build-cfn-data-source-relational-database-config-property-builder (new CfnDataSource$RelationalDatabaseConfigProperty$Builder) id config))


(defn build-cfn-domain-name-api-association-builder
  "The build-cfn-domain-name-api-association-builder function updates a CfnDomainNameApiAssociation$Builder instance using the provided configuration.
  The function takes the CfnDomainNameApiAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CfnDomainNameApiAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cfn-domain-name-api-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-name-api-association-builder (CfnDomainNameApiAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-domain-name-api-association-props-builder
  "The build-cfn-domain-name-api-association-props-builder function updates a CfnDomainNameApiAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnDomainNameApiAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CfnDomainNameApiAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cfn-domain-name-api-association-props-builder
  ""
  [id config]
  (build-cfn-domain-name-api-association-props-builder (new CfnDomainNameApiAssociationProps$Builder) id config))


(defn build-cfn-domain-name-builder
  "The build-cfn-domain-name-builder function updates a CfnDomainName$Builder instance using the provided configuration.
  The function takes the CfnDomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CfnDomainName$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cfn-domain-name-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-name-builder (CfnDomainName$Builder/create scope (name id)) id config))


(defn build-cfn-domain-name-props-builder
  "The build-cfn-domain-name-props-builder function updates a CfnDomainNameProps$Builder instance using the provided configuration.
  The function takes the CfnDomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CfnDomainNameProps$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-arn)]
    (. builder certificateArn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cfn-domain-name-props-builder
  ""
  [id config]
  (build-cfn-domain-name-props-builder (new CfnDomainNameProps$Builder) id config))


(defn build-cfn-function-configuration-app-sync-runtime-property-builder
  "The build-cfn-function-configuration-app-sync-runtime-property-builder function updates a CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |
"
  [^CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :runtime-version)]
    (. builder runtimeVersion data))
  (.build builder))


(defn cfn-function-configuration-app-sync-runtime-property-builder
  ""
  [id config]
  (build-cfn-function-configuration-app-sync-runtime-property-builder (new CfnFunctionConfiguration$AppSyncRuntimeProperty$Builder) id config))


(defn build-cfn-function-configuration-builder
  "The build-cfn-function-configuration-builder function updates a CfnFunctionConfiguration$Builder instance using the provided configuration.
  The function takes the CfnFunctionConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |
"
  [^CfnFunctionConfiguration$Builder builder id config]
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
  (.build builder))


(defn cfn-function-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-function-configuration-builder (CfnFunctionConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-function-configuration-lambda-conflict-handler-config-property-builder
  "The build-cfn-function-configuration-lambda-conflict-handler-config-property-builder function updates a CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConflictHandlerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-arn` |
"
  [^CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-conflict-handler-arn)]
    (. builder lambdaConflictHandlerArn data))
  (.build builder))


(defn cfn-function-configuration-lambda-conflict-handler-config-property-builder
  ""
  [id config]
  (build-cfn-function-configuration-lambda-conflict-handler-config-property-builder (new CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty$Builder) id config))


(defn build-cfn-function-configuration-props-builder
  "The build-cfn-function-configuration-props-builder function updates a CfnFunctionConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `syncConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$SyncConfigProperty | [[cdk.support/lookup-entry]] | `:sync-config` |
"
  [^CfnFunctionConfigurationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-function-configuration-props-builder
  ""
  [id config]
  (build-cfn-function-configuration-props-builder (new CfnFunctionConfigurationProps$Builder) id config))


(defn build-cfn-function-configuration-sync-config-property-builder
  "The build-cfn-function-configuration-sync-config-property-builder function updates a CfnFunctionConfiguration$SyncConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunctionConfiguration$SyncConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictDetection` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-detection` |
| `conflictHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-handler` |
| `lambdaConflictHandlerConfig` | software.amazon.awscdk.services.appsync.CfnFunctionConfiguration$LambdaConflictHandlerConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-config` |
"
  [^CfnFunctionConfiguration$SyncConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :conflict-detection)]
    (. builder conflictDetection data))
  (when-let [data (lookup-entry config id :conflict-handler)]
    (. builder conflictHandler data))
  (when-let [data (lookup-entry config id :lambda-conflict-handler-config)]
    (. builder lambdaConflictHandlerConfig data))
  (.build builder))


(defn cfn-function-configuration-sync-config-property-builder
  ""
  [id config]
  (build-cfn-function-configuration-sync-config-property-builder (new CfnFunctionConfiguration$SyncConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-additional-authentication-provider-property-builder
  "The build-cfn-graph-ql-api-additional-authentication-provider-property-builder function updates a CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `lambdaAuthorizerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-authorizer-config` |
| `openIdConnectConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$OpenIDConnectConfigProperty | [[cdk.support/lookup-entry]] | `:open-id-connect-config` |
| `userPoolConfig` | software.amazon.awscdk.services.appsync.CfnGraphQLApi$CognitoUserPoolConfigProperty | [[cdk.support/lookup-entry]] | `:user-pool-config` |
"
  [^CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-let [data (lookup-entry config id :lambda-authorizer-config)]
    (. builder lambdaAuthorizerConfig data))
  (when-let [data (lookup-entry config id :open-id-connect-config)]
    (. builder openIdConnectConfig data))
  (when-let [data (lookup-entry config id :user-pool-config)]
    (. builder userPoolConfig data))
  (.build builder))


(defn cfn-graph-ql-api-additional-authentication-provider-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-additional-authentication-provider-property-builder (new CfnGraphQLApi$AdditionalAuthenticationProviderProperty$Builder) id config))


(defn build-cfn-graph-ql-api-builder
  "The build-cfn-graph-ql-api-builder function updates a CfnGraphQLApi$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |
"
  [^CfnGraphQLApi$Builder builder id config]
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
  (.build builder))


(defn cfn-graph-ql-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-graph-ql-api-builder (CfnGraphQLApi$Builder/create scope (name id)) id config))


(defn build-cfn-graph-ql-api-cognito-user-pool-config-property-builder
  "The build-cfn-graph-ql-api-cognito-user-pool-config-property-builder function updates a CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id-client-regex)]
    (. builder appIdClientRegex data))
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-graph-ql-api-cognito-user-pool-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-cognito-user-pool-config-property-builder (new CfnGraphQLApi$CognitoUserPoolConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-enhanced-metrics-config-property-builder
  "The build-cfn-graph-ql-api-enhanced-metrics-config-property-builder function updates a CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceLevelMetricsBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-level-metrics-behavior` |
| `operationLevelMetricsConfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:operation-level-metrics-config` |
| `resolverLevelMetricsBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-level-metrics-behavior` |
"
  [^CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-level-metrics-behavior)]
    (. builder dataSourceLevelMetricsBehavior data))
  (when-let [data (lookup-entry config id :operation-level-metrics-config)]
    (. builder operationLevelMetricsConfig data))
  (when-let [data (lookup-entry config id :resolver-level-metrics-behavior)]
    (. builder resolverLevelMetricsBehavior data))
  (.build builder))


(defn cfn-graph-ql-api-enhanced-metrics-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-enhanced-metrics-config-property-builder (new CfnGraphQLApi$EnhancedMetricsConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-lambda-authorizer-config-property-builder
  "The build-cfn-graph-ql-api-lambda-authorizer-config-property-builder function updates a CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerResultTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:authorizer-result-ttl-in-seconds` |
| `authorizerUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-uri` |
| `identityValidationExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-validation-expression` |
"
  [^CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-result-ttl-in-seconds)]
    (. builder authorizerResultTtlInSeconds data))
  (when-let [data (lookup-entry config id :authorizer-uri)]
    (. builder authorizerUri data))
  (when-let [data (lookup-entry config id :identity-validation-expression)]
    (. builder identityValidationExpression data))
  (.build builder))


(defn cfn-graph-ql-api-lambda-authorizer-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-lambda-authorizer-config-property-builder (new CfnGraphQLApi$LambdaAuthorizerConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-log-config-property-builder
  "The build-cfn-graph-ql-api-log-config-property-builder function updates a CfnGraphQLApi$LogConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$LogConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-role-arn` |
| `excludeVerboseContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-verbose-content` |
| `fieldLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-log-level` |
"
  [^CfnGraphQLApi$LogConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-role-arn)]
    (. builder cloudWatchLogsRoleArn data))
  (when-let [data (lookup-entry config id :exclude-verbose-content)]
    (. builder excludeVerboseContent data))
  (when-let [data (lookup-entry config id :field-log-level)]
    (. builder fieldLogLevel data))
  (.build builder))


(defn cfn-graph-ql-api-log-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-log-config-property-builder (new CfnGraphQLApi$LogConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-open-id-connect-config-property-builder
  "The build-cfn-graph-ql-api-open-id-connect-config-property-builder function updates a CfnGraphQLApi$OpenIDConnectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$OpenIDConnectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:auth-ttl` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `iatTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iat-ttl` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
"
  [^CfnGraphQLApi$OpenIDConnectConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :auth-ttl)]
    (. builder authTtl data))
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :iat-ttl)]
    (. builder iatTtl data))
  (when-let [data (lookup-entry config id :issuer)]
    (. builder issuer data))
  (.build builder))


(defn cfn-graph-ql-api-open-id-connect-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-open-id-connect-config-property-builder (new CfnGraphQLApi$OpenIDConnectConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-api-props-builder
  "The build-cfn-graph-ql-api-props-builder function updates a CfnGraphQLApiProps$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `xrayEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xray-enabled` |
"
  [^CfnGraphQLApiProps$Builder builder id config]
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
  (.build builder))


(defn cfn-graph-ql-api-props-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-props-builder (new CfnGraphQLApiProps$Builder) id config))


(defn build-cfn-graph-ql-api-user-pool-config-property-builder
  "The build-cfn-graph-ql-api-user-pool-config-property-builder function updates a CfnGraphQLApi$UserPoolConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnGraphQLApi$UserPoolConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `defaultAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-action` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnGraphQLApi$UserPoolConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id-client-regex)]
    (. builder appIdClientRegex data))
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-let [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-graph-ql-api-user-pool-config-property-builder
  ""
  [id config]
  (build-cfn-graph-ql-api-user-pool-config-property-builder (new CfnGraphQLApi$UserPoolConfigProperty$Builder) id config))


(defn build-cfn-graph-ql-schema-builder
  "The build-cfn-graph-ql-schema-builder function updates a CfnGraphQLSchema$Builder instance using the provided configuration.
  The function takes the CfnGraphQLSchema$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
"
  [^CfnGraphQLSchema$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-s3-location)]
    (. builder definitionS3Location data))
  (.build builder))


(defn cfn-graph-ql-schema-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-graph-ql-schema-builder (CfnGraphQLSchema$Builder/create scope (name id)) id config))


(defn build-cfn-graph-ql-schema-props-builder
  "The build-cfn-graph-ql-schema-props-builder function updates a CfnGraphQLSchemaProps$Builder instance using the provided configuration.
  The function takes the CfnGraphQLSchemaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-id` |
| `definition` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition` |
| `definitionS3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:definition-s3-location` |
"
  [^CfnGraphQLSchemaProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-id)]
    (. builder apiId data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :definition-s3-location)]
    (. builder definitionS3Location data))
  (.build builder))


(defn cfn-graph-ql-schema-props-builder
  ""
  [id config]
  (build-cfn-graph-ql-schema-props-builder (new CfnGraphQLSchemaProps$Builder) id config))


(defn build-cfn-resolver-app-sync-runtime-property-builder
  "The build-cfn-resolver-app-sync-runtime-property-builder function updates a CfnResolver$AppSyncRuntimeProperty$Builder instance using the provided configuration.
  The function takes the CfnResolver$AppSyncRuntimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |
"
  [^CfnResolver$AppSyncRuntimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :runtime-version)]
    (. builder runtimeVersion data))
  (.build builder))


(defn cfn-resolver-app-sync-runtime-property-builder
  ""
  [id config]
  (build-cfn-resolver-app-sync-runtime-property-builder (new CfnResolver$AppSyncRuntimeProperty$Builder) id config))


(defn build-cfn-resolver-builder
  "The build-cfn-resolver-builder function updates a CfnResolver$Builder instance using the provided configuration.
  The function takes the CfnResolver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResolver$Builder builder id config]
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
  (.build builder))


(defn cfn-resolver-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-builder (CfnResolver$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-caching-config-property-builder
  "The build-cfn-resolver-caching-config-property-builder function updates a CfnResolver$CachingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResolver$CachingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachingKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:caching-keys` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CfnResolver$CachingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :caching-keys)]
    (. builder cachingKeys data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cfn-resolver-caching-config-property-builder
  ""
  [id config]
  (build-cfn-resolver-caching-config-property-builder (new CfnResolver$CachingConfigProperty$Builder) id config))


(defn build-cfn-resolver-lambda-conflict-handler-config-property-builder
  "The build-cfn-resolver-lambda-conflict-handler-config-property-builder function updates a CfnResolver$LambdaConflictHandlerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResolver$LambdaConflictHandlerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaConflictHandlerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-arn` |
"
  [^CfnResolver$LambdaConflictHandlerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-conflict-handler-arn)]
    (. builder lambdaConflictHandlerArn data))
  (.build builder))


(defn cfn-resolver-lambda-conflict-handler-config-property-builder
  ""
  [id config]
  (build-cfn-resolver-lambda-conflict-handler-config-property-builder (new CfnResolver$LambdaConflictHandlerConfigProperty$Builder) id config))


(defn build-cfn-resolver-pipeline-config-property-builder
  "The build-cfn-resolver-pipeline-config-property-builder function updates a CfnResolver$PipelineConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResolver$PipelineConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functions` | java.util.List | [[cdk.support/lookup-entry]] | `:functions` |
"
  [^CfnResolver$PipelineConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :functions)]
    (. builder functions data))
  (.build builder))


(defn cfn-resolver-pipeline-config-property-builder
  ""
  [id config]
  (build-cfn-resolver-pipeline-config-property-builder (new CfnResolver$PipelineConfigProperty$Builder) id config))


(defn build-cfn-resolver-props-builder
  "The build-cfn-resolver-props-builder function updates a CfnResolverProps$Builder instance using the provided configuration.
  The function takes the CfnResolverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnResolverProps$Builder builder id config]
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
  (.build builder))


(defn cfn-resolver-props-builder
  ""
  [id config]
  (build-cfn-resolver-props-builder (new CfnResolverProps$Builder) id config))


(defn build-cfn-resolver-sync-config-property-builder
  "The build-cfn-resolver-sync-config-property-builder function updates a CfnResolver$SyncConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResolver$SyncConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conflictDetection` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-detection` |
| `conflictHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:conflict-handler` |
| `lambdaConflictHandlerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-conflict-handler-config` |
"
  [^CfnResolver$SyncConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :conflict-detection)]
    (. builder conflictDetection data))
  (when-let [data (lookup-entry config id :conflict-handler)]
    (. builder conflictHandler data))
  (when-let [data (lookup-entry config id :lambda-conflict-handler-config)]
    (. builder lambdaConflictHandlerConfig data))
  (.build builder))


(defn cfn-resolver-sync-config-property-builder
  ""
  [id config]
  (build-cfn-resolver-sync-config-property-builder (new CfnResolver$SyncConfigProperty$Builder) id config))


(defn build-cfn-source-api-association-builder
  "The build-cfn-source-api-association-builder function updates a CfnSourceApiAssociation$Builder instance using the provided configuration.
  The function takes the CfnSourceApiAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergedApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-identifier` |
| `sourceApiAssociationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-api-association-config` |
| `sourceApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-api-identifier` |
"
  [^CfnSourceApiAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :merged-api-identifier)]
    (. builder mergedApiIdentifier data))
  (when-let [data (lookup-entry config id :source-api-association-config)]
    (. builder sourceApiAssociationConfig data))
  (when-let [data (lookup-entry config id :source-api-identifier)]
    (. builder sourceApiIdentifier data))
  (.build builder))


(defn cfn-source-api-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-source-api-association-builder (CfnSourceApiAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-source-api-association-props-builder
  "The build-cfn-source-api-association-props-builder function updates a CfnSourceApiAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnSourceApiAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergedApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:merged-api-identifier` |
| `sourceApiAssociationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-api-association-config` |
| `sourceApiIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-api-identifier` |
"
  [^CfnSourceApiAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :merged-api-identifier)]
    (. builder mergedApiIdentifier data))
  (when-let [data (lookup-entry config id :source-api-association-config)]
    (. builder sourceApiAssociationConfig data))
  (when-let [data (lookup-entry config id :source-api-identifier)]
    (. builder sourceApiIdentifier data))
  (.build builder))


(defn cfn-source-api-association-props-builder
  ""
  [id config]
  (build-cfn-source-api-association-props-builder (new CfnSourceApiAssociationProps$Builder) id config))


(defn build-cfn-source-api-association-source-api-association-config-property-builder
  "The build-cfn-source-api-association-source-api-association-config-property-builder function updates a CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mergeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:merge-type` |
"
  [^CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :merge-type)]
    (. builder mergeType data))
  (.build builder))


(defn cfn-source-api-association-source-api-association-config-property-builder
  ""
  [id config]
  (build-cfn-source-api-association-source-api-association-config-property-builder (new CfnSourceApiAssociation$SourceApiAssociationConfigProperty$Builder) id config))


(defn build-code-config-builder
  "The build-code-config-builder function updates a CodeConfig$Builder instance using the provided configuration.
  The function takes the CodeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inlineCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:inline-code` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CodeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :inline-code)]
    (. builder inlineCode data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn code-config-builder
  ""
  [id config]
  (build-code-config-builder (new CodeConfig$Builder) id config))


(defn build-data-source-options-builder
  "The build-data-source-options-builder function updates a DataSourceOptions$Builder instance using the provided configuration.
  The function takes the DataSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^DataSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn data-source-options-builder
  ""
  [id config]
  (build-data-source-options-builder (new DataSourceOptions$Builder) id config))


(defn build-domain-options-builder
  "The build-domain-options-builder function updates a DomainOptions$Builder instance using the provided configuration.
  The function takes the DomainOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^DomainOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn domain-options-builder
  ""
  [id config]
  (build-domain-options-builder (new DomainOptions$Builder) id config))


(defn build-dynamo-db-data-source-builder
  "The build-dynamo-db-data-source-builder function updates a DynamoDbDataSource$Builder instance using the provided configuration.
  The function takes the DynamoDbDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnlyAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-access` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |
"
  [^DynamoDbDataSource$Builder builder id config]
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
  (.build builder))


(defn dynamo-db-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-dynamo-db-data-source-builder (DynamoDbDataSource$Builder/create scope (name id)) id config))


(defn build-dynamo-db-data-source-props-builder
  "The build-dynamo-db-data-source-props-builder function updates a DynamoDbDataSourceProps$Builder instance using the provided configuration.
  The function takes the DynamoDbDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `readOnlyAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only-access` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
| `table` | software.amazon.awscdk.services.dynamodb.ITable | [[cdk.support/lookup-entry]] | `:table` |
| `useCallerCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-caller-credentials` |
"
  [^DynamoDbDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn dynamo-db-data-source-props-builder
  ""
  [id config]
  (build-dynamo-db-data-source-props-builder (new DynamoDbDataSourceProps$Builder) id config))


(defn build-event-bridge-data-source-builder
  "The build-event-bridge-data-source-builder function updates a EventBridgeDataSource$Builder instance using the provided configuration.
  The function takes the EventBridgeDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^EventBridgeDataSource$Builder builder id config]
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
  (.build builder))


(defn event-bridge-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-event-bridge-data-source-builder (EventBridgeDataSource$Builder/create scope (name id)) id config))


(defn build-event-bridge-data-source-props-builder
  "The build-event-bridge-data-source-props-builder function updates a EventBridgeDataSourceProps$Builder instance using the provided configuration.
  The function takes the EventBridgeDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBus` | software.amazon.awscdk.services.events.IEventBus | [[cdk.support/lookup-entry]] | `:event-bus` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^EventBridgeDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn event-bridge-data-source-props-builder
  ""
  [id config]
  (build-event-bridge-data-source-props-builder (new EventBridgeDataSourceProps$Builder) id config))


(defn build-extended-data-source-props-builder
  "The build-extended-data-source-props-builder function updates a ExtendedDataSourceProps$Builder instance using the provided configuration.
  The function takes the ExtendedDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dynamoDbConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db-config` |
| `elasticsearchConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$ElasticsearchConfigProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-config` |
| `eventBridgeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-config` |
| `httpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-config` |
| `lambdaConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$LambdaConfigProperty | [[cdk.support/lookup-entry]] | `:lambda-config` |
| `openSearchServiceConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$OpenSearchServiceConfigProperty | [[cdk.support/lookup-entry]] | `:open-search-service-config` |
| `relationalDatabaseConfig` | software.amazon.awscdk.services.appsync.CfnDataSource$RelationalDatabaseConfigProperty | [[cdk.support/lookup-entry]] | `:relational-database-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^ExtendedDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn extended-data-source-props-builder
  ""
  [id config]
  (build-extended-data-source-props-builder (new ExtendedDataSourceProps$Builder) id config))


(defn build-extended-resolver-props-builder
  "The build-extended-resolver-props-builder function updates a ExtendedResolverProps$Builder instance using the provided configuration.
  The function takes the ExtendedResolverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^ExtendedResolverProps$Builder builder id config]
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
  (.build builder))


(defn extended-resolver-props-builder
  ""
  [id config]
  (build-extended-resolver-props-builder (new ExtendedResolverProps$Builder) id config))


(defn build-graphql-api-attributes-builder
  "The build-graphql-api-attributes-builder function updates a GraphqlApiAttributes$Builder instance using the provided configuration.
  The function takes the GraphqlApiAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `graphQlEndpointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graph-ql-endpoint-arn` |
| `graphqlApiArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:graphql-api-arn` |
| `graphqlApiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:graphql-api-id` |
| `modes` | java.util.List | [[cdk.support/lookup-entry]] | `:modes` |
| `visibility` | software.amazon.awscdk.services.appsync.Visibility | [[cdk.api.services.appsync/visibility]] | `:visibility` |
"
  [^GraphqlApiAttributes$Builder builder id config]
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
  (.build builder))


(defn graphql-api-attributes-builder
  ""
  [id config]
  (build-graphql-api-attributes-builder (new GraphqlApiAttributes$Builder) id config))


(defn build-graphql-api-builder
  "The build-graphql-api-builder function updates a GraphqlApi$Builder instance using the provided configuration.
  The function takes the GraphqlApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |
"
  [^GraphqlApi$Builder builder id config]
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
  (.build builder))


(defn graphql-api-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-graphql-api-builder (GraphqlApi$Builder/create scope (name id)) id config))


(defn build-graphql-api-props-builder
  "The build-graphql-api-props-builder function updates a GraphqlApiProps$Builder instance using the provided configuration.
  The function takes the GraphqlApiProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `xrayEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:xray-enabled` |
"
  [^GraphqlApiProps$Builder builder id config]
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
  (.build builder))


(defn graphql-api-props-builder
  ""
  [id config]
  (build-graphql-api-props-builder (new GraphqlApiProps$Builder) id config))


(defn build-http-data-source-builder
  "The build-http-data-source-builder function updates a HttpDataSource$Builder instance using the provided configuration.
  The function takes the HttpDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^HttpDataSource$Builder builder id config]
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
  (.build builder))


(defn http-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-http-data-source-builder (HttpDataSource$Builder/create scope (name id)) id config))


(defn build-http-data-source-options-builder
  "The build-http-data-source-options-builder function updates a HttpDataSourceOptions$Builder instance using the provided configuration.
  The function takes the HttpDataSourceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^HttpDataSourceOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :authorization-config)]
    (. builder authorizationConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn http-data-source-options-builder
  ""
  [id config]
  (build-http-data-source-options-builder (new HttpDataSourceOptions$Builder) id config))


(defn build-http-data-source-props-builder
  "The build-http-data-source-props-builder function updates a HttpDataSourceProps$Builder instance using the provided configuration.
  The function takes the HttpDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `authorizationConfig` | software.amazon.awscdk.services.appsync.AwsIamConfig | [[cdk.support/lookup-entry]] | `:authorization-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^HttpDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn http-data-source-props-builder
  ""
  [id config]
  (build-http-data-source-props-builder (new HttpDataSourceProps$Builder) id config))


(defn build-lambda-authorizer-config-builder
  "The build-lambda-authorizer-config-builder function updates a LambdaAuthorizerConfig$Builder instance using the provided configuration.
  The function takes the LambdaAuthorizerConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `handler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:handler` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
| `validationRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-regex` |
"
  [^LambdaAuthorizerConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :handler)]
    (. builder handler data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (when-let [data (lookup-entry config id :validation-regex)]
    (. builder validationRegex data))
  (.build builder))


(defn lambda-authorizer-config-builder
  ""
  [id config]
  (build-lambda-authorizer-config-builder (new LambdaAuthorizerConfig$Builder) id config))


(defn build-lambda-data-source-builder
  "The build-lambda-data-source-builder function updates a LambdaDataSource$Builder instance using the provided configuration.
  The function takes the LambdaDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^LambdaDataSource$Builder builder id config]
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
  (.build builder))


(defn lambda-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-lambda-data-source-builder (LambdaDataSource$Builder/create scope (name id)) id config))


(defn build-lambda-data-source-props-builder
  "The build-lambda-data-source-props-builder function updates a LambdaDataSourceProps$Builder instance using the provided configuration.
  The function takes the LambdaDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:lambda-function` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^LambdaDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn lambda-data-source-props-builder
  ""
  [id config]
  (build-lambda-data-source-props-builder (new LambdaDataSourceProps$Builder) id config))


(defn build-log-config-builder
  "The build-log-config-builder function updates a LogConfig$Builder instance using the provided configuration.
  The function takes the LogConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeVerboseContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-verbose-content` |
| `fieldLogLevel` | software.amazon.awscdk.services.appsync.FieldLogLevel | [[cdk.api.services.appsync/field-log-level]] | `:field-log-level` |
| `retention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:retention` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^LogConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :exclude-verbose-content)]
    (. builder excludeVerboseContent data))
  (when-let [data (field-log-level config id :field-log-level)]
    (. builder fieldLogLevel data))
  (when-let [data (retention-days config id :retention)]
    (. builder retention data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn log-config-builder
  ""
  [id config]
  (build-log-config-builder (new LogConfig$Builder) id config))


(defn build-none-data-source-builder
  "The build-none-data-source-builder function updates a NoneDataSource$Builder instance using the provided configuration.
  The function takes the NoneDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^NoneDataSource$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn none-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-none-data-source-builder (NoneDataSource$Builder/create scope (name id)) id config))


(defn build-none-data-source-props-builder
  "The build-none-data-source-props-builder function updates a NoneDataSourceProps$Builder instance using the provided configuration.
  The function takes the NoneDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^NoneDataSourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api)]
    (. builder api data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn none-data-source-props-builder
  ""
  [id config]
  (build-none-data-source-props-builder (new NoneDataSourceProps$Builder) id config))


(defn build-open-id-connect-config-builder
  "The build-open-id-connect-config-builder function updates a OpenIdConnectConfig$Builder instance using the provided configuration.
  The function takes the OpenIdConnectConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `oidcProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:oidc-provider` |
| `tokenExpiryFromAuth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:token-expiry-from-auth` |
| `tokenExpiryFromIssue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:token-expiry-from-issue` |
"
  [^OpenIdConnectConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :oidc-provider)]
    (. builder oidcProvider data))
  (when-let [data (lookup-entry config id :token-expiry-from-auth)]
    (. builder tokenExpiryFromAuth data))
  (when-let [data (lookup-entry config id :token-expiry-from-issue)]
    (. builder tokenExpiryFromIssue data))
  (.build builder))


(defn open-id-connect-config-builder
  ""
  [id config]
  (build-open-id-connect-config-builder (new OpenIdConnectConfig$Builder) id config))


(defn build-open-search-data-source-builder
  "The build-open-search-data-source-builder function updates a OpenSearchDataSource$Builder instance using the provided configuration.
  The function takes the OpenSearchDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domain` | software.amazon.awscdk.services.opensearchservice.IDomain | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^OpenSearchDataSource$Builder builder id config]
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
  (.build builder))


(defn open-search-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-open-search-data-source-builder (OpenSearchDataSource$Builder/create scope (name id)) id config))


(defn build-open-search-data-source-props-builder
  "The build-open-search-data-source-props-builder function updates a OpenSearchDataSourceProps$Builder instance using the provided configuration.
  The function takes the OpenSearchDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domain` | software.amazon.awscdk.services.opensearchservice.IDomain | [[cdk.support/lookup-entry]] | `:domain` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^OpenSearchDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn open-search-data-source-props-builder
  ""
  [id config]
  (build-open-search-data-source-props-builder (new OpenSearchDataSourceProps$Builder) id config))


(defn build-rds-data-source-builder
  "The build-rds-data-source-builder function updates a RdsDataSource$Builder instance using the provided configuration.
  The function takes the RdsDataSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IServerlessCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^RdsDataSource$Builder builder id config]
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
  (.build builder))


(defn rds-data-source-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-rds-data-source-builder (RdsDataSource$Builder/create scope (name id)) id config))


(defn build-rds-data-source-props-builder
  "The build-rds-data-source-props-builder function updates a RdsDataSourceProps$Builder instance using the provided configuration.
  The function takes the RdsDataSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IServerlessCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^RdsDataSourceProps$Builder builder id config]
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
  (.build builder))


(defn rds-data-source-props-builder
  ""
  [id config]
  (build-rds-data-source-props-builder (new RdsDataSourceProps$Builder) id config))


(defn build-rds-data-source-props-v2-builder
  "The build-rds-data-source-props-v2-builder function updates a RdsDataSourcePropsV2$Builder instance using the provided configuration.
  The function takes the RdsDataSourcePropsV2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `api` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:api` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `secretStore` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret-store` |
| `serverlessCluster` | software.amazon.awscdk.services.rds.IDatabaseCluster | [[cdk.support/lookup-entry]] | `:serverless-cluster` |
| `serviceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:service-role` |
"
  [^RdsDataSourcePropsV2$Builder builder id config]
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
  (.build builder))


(defn rds-data-source-props-v2-builder
  ""
  [id config]
  (build-rds-data-source-props-v2-builder (new RdsDataSourcePropsV2$Builder) id config))


(defn build-resolver-builder
  "The build-resolver-builder function updates a Resolver$Builder instance using the provided configuration.
  The function takes the Resolver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^Resolver$Builder builder id config]
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
  (.build builder))


(defn resolver-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-resolver-builder (Resolver$Builder/create scope (name id)) id config))


(defn build-resolver-props-builder
  "The build-resolver-props-builder function updates a ResolverProps$Builder instance using the provided configuration.
  The function takes the ResolverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^ResolverProps$Builder builder id config]
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
  (.build builder))


(defn resolver-props-builder
  ""
  [id config]
  (build-resolver-props-builder (new ResolverProps$Builder) id config))


(defn build-runtime-config-builder
  "The build-runtime-config-builder function updates a RuntimeConfig$Builder instance using the provided configuration.
  The function takes the RuntimeConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-version` |
"
  [^RuntimeConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :runtime-version)]
    (. builder runtimeVersion data))
  (.build builder))


(defn runtime-config-builder
  ""
  [id config]
  (build-runtime-config-builder (new RuntimeConfig$Builder) id config))


(defn build-schema-bind-options-builder
  "The build-schema-bind-options-builder function updates a SchemaBindOptions$Builder instance using the provided configuration.
  The function takes the SchemaBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
"
  [^SchemaBindOptions$Builder builder id config]
  (.build builder))


(defn schema-bind-options-builder
  ""
  [id config]
  (build-schema-bind-options-builder (new SchemaBindOptions$Builder) id config))


(defn build-schema-file-builder
  "The build-schema-file-builder function updates a SchemaFile$Builder instance using the provided configuration.
  The function takes the SchemaFile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |
"
  [^SchemaFile$Builder builder id config]
  (when-let [data (lookup-entry config id :file-path)]
    (. builder filePath data))
  (.build builder))


(defn schema-file-builder
  ""
  [id config]
  (build-schema-file-builder (SchemaFile$Builder/create) id config))


(defn build-schema-props-builder
  "The build-schema-props-builder function updates a SchemaProps$Builder instance using the provided configuration.
  The function takes the SchemaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |
"
  [^SchemaProps$Builder builder id config]
  (when-let [data (lookup-entry config id :file-path)]
    (. builder filePath data))
  (.build builder))


(defn schema-props-builder
  ""
  [id config]
  (build-schema-props-builder (new SchemaProps$Builder) id config))


(defn build-source-api-association-attributes-builder
  "The build-source-api-association-attributes-builder function updates a SourceApiAssociationAttributes$Builder instance using the provided configuration.
  The function takes the SourceApiAssociationAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-arn` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |
"
  [^SourceApiAssociationAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :association-arn)]
    (. builder associationArn data))
  (when-let [data (lookup-entry config id :merged-api)]
    (. builder mergedApi data))
  (when-let [data (lookup-entry config id :source-api)]
    (. builder sourceApi data))
  (.build builder))


(defn source-api-association-attributes-builder
  ""
  [id config]
  (build-source-api-association-attributes-builder (new SourceApiAssociationAttributes$Builder) id config))


(defn build-source-api-association-builder
  "The build-source-api-association-builder function updates a SourceApiAssociation$Builder instance using the provided configuration.
  The function takes the SourceApiAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |
"
  [^SourceApiAssociation$Builder builder id config]
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
  (.build builder))


(defn source-api-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-source-api-association-builder (SourceApiAssociation$Builder/create scope (name id)) id config))


(defn build-source-api-association-props-builder
  "The build-source-api-association-props-builder function updates a SourceApiAssociationProps$Builder instance using the provided configuration.
  The function takes the SourceApiAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `mergedApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:merged-api` |
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |
"
  [^SourceApiAssociationProps$Builder builder id config]
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
  (.build builder))


(defn source-api-association-props-builder
  ""
  [id config]
  (build-source-api-association-props-builder (new SourceApiAssociationProps$Builder) id config))


(defn build-source-api-builder
  "The build-source-api-builder function updates a SourceApi$Builder instance using the provided configuration.
  The function takes the SourceApi$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mergeType` | software.amazon.awscdk.services.appsync.MergeType | [[cdk.api.services.appsync/merge-type]] | `:merge-type` |
| `sourceApi` | software.amazon.awscdk.services.appsync.IGraphqlApi | [[cdk.support/lookup-entry]] | `:source-api` |
"
  [^SourceApi$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (merge-type config id :merge-type)]
    (. builder mergeType data))
  (when-let [data (lookup-entry config id :source-api)]
    (. builder sourceApi data))
  (.build builder))


(defn source-api-builder
  ""
  [id config]
  (build-source-api-builder (new SourceApi$Builder) id config))


(defn build-source-api-options-builder
  "The build-source-api-options-builder function updates a SourceApiOptions$Builder instance using the provided configuration.
  The function takes the SourceApiOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mergedApiExecutionRole` | software.amazon.awscdk.services.iam.Role | [[cdk.support/lookup-entry]] | `:merged-api-execution-role` |
| `sourceApis` | java.util.List | [[cdk.support/lookup-entry]] | `:source-apis` |
"
  [^SourceApiOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :merged-api-execution-role)]
    (. builder mergedApiExecutionRole data))
  (when-let [data (lookup-entry config id :source-apis)]
    (. builder sourceApis data))
  (.build builder))


(defn source-api-options-builder
  ""
  [id config]
  (build-source-api-options-builder (new SourceApiOptions$Builder) id config))


(defn build-user-pool-config-builder
  "The build-user-pool-config-builder function updates a UserPoolConfig$Builder instance using the provided configuration.
  The function takes the UserPoolConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appIdClientRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id-client-regex` |
| `defaultAction` | software.amazon.awscdk.services.appsync.UserPoolDefaultAction | [[cdk.api.services.appsync/user-pool-default-action]] | `:default-action` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
"
  [^UserPoolConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id-client-regex)]
    (. builder appIdClientRegex data))
  (when-let [data (user-pool-default-action config id :default-action)]
    (. builder defaultAction data))
  (when-let [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (.build builder))


(defn user-pool-config-builder
  ""
  [id config]
  (build-user-pool-config-builder (new UserPoolConfig$Builder) id config))