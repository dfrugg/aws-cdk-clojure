(ns cdk.api.services.refactorspaces
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.refactorspaces package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.refactorspaces CfnApplication$ApiGatewayProxyInputProperty$Builder
                                                           CfnApplication$Builder
                                                           CfnApplicationProps$Builder
                                                           CfnEnvironment$Builder
                                                           CfnEnvironmentProps$Builder
                                                           CfnRoute$Builder
                                                           CfnRoute$DefaultRouteInputProperty$Builder
                                                           CfnRoute$UriPathRouteInputProperty$Builder
                                                           CfnRouteProps$Builder
                                                           CfnService$Builder
                                                           CfnService$LambdaEndpointInputProperty$Builder
                                                           CfnService$UrlEndpointInputProperty$Builder
                                                           CfnServiceProps$Builder]))


(defn cfn-application-api-gateway-proxy-input-property-builder>
  "The cfn-application-api-gateway-proxy-input-property-builder> function updates a CfnApplication$ApiGatewayProxyInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApiGatewayProxyInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnApplication$ApiGatewayProxyInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-some [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn cfn-application-api-gateway-proxy-input-property-builder
  "Creates a  `CfnApplication$ApiGatewayProxyInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-api-gateway-proxy-input-property-builder> (new CfnApplication$ApiGatewayProxyInputProperty$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiGatewayProxy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-gateway-proxy` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `proxyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :api-gateway-proxy)]
    (. builder apiGatewayProxy data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :proxy-type)]
    (. builder proxyType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiGatewayProxy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-gateway-proxy` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `proxyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :api-gateway-proxy)]
    (. builder apiGatewayProxy data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :proxy-type)]
    (. builder proxyType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-environment-builder>
  "The cfn-environment-builder> function updates a CfnEnvironment$Builder instance using the provided configuration.
  The function takes the CfnEnvironment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFabricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-fabric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironment$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-fabric-type)]
    (. builder networkFabricType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-builder
  "Creates a  `CfnEnvironment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-builder> (CfnEnvironment$Builder/create scope (name id)) id config))


(defn cfn-environment-props-builder>
  "The cfn-environment-props-builder> function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFabricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-fabric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-fabric-type)]
    (. builder networkFabricType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-props-builder
  "Creates a  `CfnEnvironmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-environment-props-builder> (new CfnEnvironmentProps$Builder) id config))


(defn cfn-route-builder>
  "The cfn-route-builder> function updates a CfnRoute$Builder instance using the provided configuration.
  The function takes the CfnRoute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `defaultRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-route` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `routeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-type` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uriPathRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$UriPathRouteInputProperty | [[cdk.support/lookup-entry]] | `:uri-path-route` |
"
  [^CfnRoute$Builder builder id config]
  (when-some [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-some [data (lookup-entry config id :default-route)]
    (. builder defaultRoute data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :route-type)]
    (. builder routeType data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri-path-route)]
    (. builder uriPathRoute data))
  (.build builder))


(defn cfn-route-builder
  "Creates a  `CfnRoute$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-route-builder> (CfnRoute$Builder/create scope (name id)) id config))


(defn cfn-route-default-route-input-property-builder>
  "The cfn-route-default-route-input-property-builder> function updates a CfnRoute$DefaultRouteInputProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$DefaultRouteInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-state` |
"
  [^CfnRoute$DefaultRouteInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :activation-state)]
    (. builder activationState data))
  (.build builder))


(defn cfn-route-default-route-input-property-builder
  "Creates a  `CfnRoute$DefaultRouteInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-route-default-route-input-property-builder> (new CfnRoute$DefaultRouteInputProperty$Builder) id config))


(defn cfn-route-props-builder>
  "The cfn-route-props-builder> function updates a CfnRouteProps$Builder instance using the provided configuration.
  The function takes the CfnRouteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `defaultRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$DefaultRouteInputProperty | [[cdk.support/lookup-entry]] | `:default-route` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `routeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-type` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uriPathRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$UriPathRouteInputProperty | [[cdk.support/lookup-entry]] | `:uri-path-route` |
"
  [^CfnRouteProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-some [data (lookup-entry config id :default-route)]
    (. builder defaultRoute data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :route-type)]
    (. builder routeType data))
  (when-some [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :uri-path-route)]
    (. builder uriPathRoute data))
  (.build builder))


(defn cfn-route-props-builder
  "Creates a  `CfnRouteProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-route-props-builder> (new CfnRouteProps$Builder) id config))


(defn cfn-route-uri-path-route-input-property-builder>
  "The cfn-route-uri-path-route-input-property-builder> function updates a CfnRoute$UriPathRouteInputProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$UriPathRouteInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-state` |
| `appendSourcePath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:append-source-path` |
| `includeChildPaths` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-child-paths` |
| `methods` | java.util.List | [[cdk.support/lookup-entry]] | `:methods` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |
"
  [^CfnRoute$UriPathRouteInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :activation-state)]
    (. builder activationState data))
  (when-some [data (lookup-entry config id :append-source-path)]
    (. builder appendSourcePath data))
  (when-some [data (lookup-entry config id :include-child-paths)]
    (. builder includeChildPaths data))
  (when-some [data (lookup-entry config id :methods)]
    (. builder methods data))
  (when-some [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn cfn-route-uri-path-route-input-property-builder
  "Creates a  `CfnRoute$UriPathRouteInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-route-uri-path-route-input-property-builder> (new CfnRoute$UriPathRouteInputProperty$Builder) id config))


(defn cfn-service-builder>
  "The cfn-service-builder> function updates a CfnService$Builder instance using the provided configuration.
  The function takes the CfnService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `lambdaEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `urlEndpoint` | software.amazon.awscdk.services.refactorspaces.CfnService$UrlEndpointInputProperty | [[cdk.support/lookup-entry]] | `:url-endpoint` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnService$Builder builder id config]
  (when-some [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :lambda-endpoint)]
    (. builder lambdaEndpoint data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :url-endpoint)]
    (. builder urlEndpoint data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-service-builder
  "Creates a  `CfnService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-builder> (CfnService$Builder/create scope (name id)) id config))


(defn cfn-service-lambda-endpoint-input-property-builder>
  "The cfn-service-lambda-endpoint-input-property-builder> function updates a CfnService$LambdaEndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnService$LambdaEndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnService$LambdaEndpointInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-service-lambda-endpoint-input-property-builder
  "Creates a  `CfnService$LambdaEndpointInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-lambda-endpoint-input-property-builder> (new CfnService$LambdaEndpointInputProperty$Builder) id config))


(defn cfn-service-props-builder>
  "The cfn-service-props-builder> function updates a CfnServiceProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `lambdaEndpoint` | software.amazon.awscdk.services.refactorspaces.CfnService$LambdaEndpointInputProperty | [[cdk.support/lookup-entry]] | `:lambda-endpoint` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `urlEndpoint` | software.amazon.awscdk.services.refactorspaces.CfnService$UrlEndpointInputProperty | [[cdk.support/lookup-entry]] | `:url-endpoint` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-some [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-some [data (lookup-entry config id :lambda-endpoint)]
    (. builder lambdaEndpoint data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :url-endpoint)]
    (. builder urlEndpoint data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-service-props-builder
  "Creates a  `CfnServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-props-builder> (new CfnServiceProps$Builder) id config))


(defn cfn-service-url-endpoint-input-property-builder>
  "The cfn-service-url-endpoint-input-property-builder> function updates a CfnService$UrlEndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnService$UrlEndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-url` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnService$UrlEndpointInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :health-url)]
    (. builder healthUrl data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-service-url-endpoint-input-property-builder
  "Creates a  `CfnService$UrlEndpointInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-service-url-endpoint-input-property-builder> (new CfnService$UrlEndpointInputProperty$Builder) id config))