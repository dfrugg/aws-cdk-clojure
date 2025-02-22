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


(defn build-cfn-application-api-gateway-proxy-input-property-builder
  "The build-cfn-application-api-gateway-proxy-input-property-builder function updates a CfnApplication$ApiGatewayProxyInputProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApiGatewayProxyInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |
"
  [^CfnApplication$ApiGatewayProxyInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :stage-name)]
    (. builder stageName data))
  (.build builder))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :api-gateway-proxy)]
    (. builder apiGatewayProxy data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :proxy-type)]
    (. builder proxyType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :api-gateway-proxy)]
    (. builder apiGatewayProxy data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :proxy-type)]
    (. builder proxyType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-environment-builder
  "The build-cfn-environment-builder function updates a CfnEnvironment$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :network-fabric-type)]
    (. builder networkFabricType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-environment-props-builder
  "The build-cfn-environment-props-builder function updates a CfnEnvironmentProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :network-fabric-type)]
    (. builder networkFabricType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-route-builder
  "The build-cfn-route-builder function updates a CfnRoute$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :default-route)]
    (. builder defaultRoute data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :route-type)]
    (. builder routeType data))
  (when-let [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :uri-path-route)]
    (. builder uriPathRoute data))
  (.build builder))


(defn build-cfn-route-default-route-input-property-builder
  "The build-cfn-route-default-route-input-property-builder function updates a CfnRoute$DefaultRouteInputProperty$Builder instance using the provided configuration.
  The function takes the CfnRoute$DefaultRouteInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-state` |
"
  [^CfnRoute$DefaultRouteInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :activation-state)]
    (. builder activationState data))
  (.build builder))


(defn build-cfn-route-props-builder
  "The build-cfn-route-props-builder function updates a CfnRouteProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :default-route)]
    (. builder defaultRoute data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :route-type)]
    (. builder routeType data))
  (when-let [data (lookup-entry config id :service-identifier)]
    (. builder serviceIdentifier data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :uri-path-route)]
    (. builder uriPathRoute data))
  (.build builder))


(defn build-cfn-route-uri-path-route-input-property-builder
  "The build-cfn-route-uri-path-route-input-property-builder function updates a CfnRoute$UriPathRouteInputProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :activation-state)]
    (. builder activationState data))
  (when-let [data (lookup-entry config id :append-source-path)]
    (. builder appendSourcePath data))
  (when-let [data (lookup-entry config id :include-child-paths)]
    (. builder includeChildPaths data))
  (when-let [data (lookup-entry config id :methods)]
    (. builder methods data))
  (when-let [data (lookup-entry config id :source-path)]
    (. builder sourcePath data))
  (.build builder))


(defn build-cfn-service-builder
  "The build-cfn-service-builder function updates a CfnService$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :lambda-endpoint)]
    (. builder lambdaEndpoint data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :url-endpoint)]
    (. builder urlEndpoint data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-service-lambda-endpoint-input-property-builder
  "The build-cfn-service-lambda-endpoint-input-property-builder function updates a CfnService$LambdaEndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnService$LambdaEndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnService$LambdaEndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn build-cfn-service-props-builder
  "The build-cfn-service-props-builder function updates a CfnServiceProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :application-identifier)]
    (. builder applicationIdentifier data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :endpoint-type)]
    (. builder endpointType data))
  (when-let [data (lookup-entry config id :environment-identifier)]
    (. builder environmentIdentifier data))
  (when-let [data (lookup-entry config id :lambda-endpoint)]
    (. builder lambdaEndpoint data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :url-endpoint)]
    (. builder urlEndpoint data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-service-url-endpoint-input-property-builder
  "The build-cfn-service-url-endpoint-input-property-builder function updates a CfnService$UrlEndpointInputProperty$Builder instance using the provided configuration.
  The function takes the CfnService$UrlEndpointInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-url` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnService$UrlEndpointInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :health-url)]
    (. builder healthUrl data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))