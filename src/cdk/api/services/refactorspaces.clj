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


(defn cfn-application-api-gateway-proxy-input-property-builder
  "The cfn-application-api-gateway-proxy-input-property-builder function buildes out new instances of 
CfnApplication$ApiGatewayProxyInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `stageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage-name` |"
  [stack id config]
  (let [builder (CfnApplication$ApiGatewayProxyInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :stage-name)]
      (. builder stageName data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiGatewayProxy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-gateway-proxy` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `proxyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiGatewayProxy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:api-gateway-proxy` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `proxyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
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
    (.build builder)))


(defn cfn-environment-builder
  "The cfn-environment-builder function buildes out new instances of 
CfnEnvironment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFabricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-fabric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-fabric-type)]
      (. builder networkFabricType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-props-builder
  "The cfn-environment-props-builder function buildes out new instances of 
CfnEnvironmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkFabricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-fabric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-fabric-type)]
      (. builder networkFabricType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-route-builder
  "The cfn-route-builder function buildes out new instances of 
CfnRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `defaultRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-route` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `routeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-type` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uriPathRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$UriPathRouteInputProperty | [[cdk.support/lookup-entry]] | `:uri-path-route` |"
  [stack id config]
  (let [builder (CfnRoute$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-route-default-route-input-property-builder
  "The cfn-route-default-route-input-property-builder function buildes out new instances of 
CfnRoute$DefaultRouteInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-state` |"
  [stack id config]
  (let [builder (CfnRoute$DefaultRouteInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :activation-state)]
      (. builder activationState data))
    (.build builder)))


(defn cfn-route-props-builder
  "The cfn-route-props-builder function buildes out new instances of 
CfnRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-identifier` |
| `defaultRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$DefaultRouteInputProperty | [[cdk.support/lookup-entry]] | `:default-route` |
| `environmentIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-identifier` |
| `routeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-type` |
| `serviceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `uriPathRoute` | software.amazon.awscdk.services.refactorspaces.CfnRoute$UriPathRouteInputProperty | [[cdk.support/lookup-entry]] | `:uri-path-route` |"
  [stack id config]
  (let [builder (CfnRouteProps$Builder.)]
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
    (.build builder)))


(defn cfn-route-uri-path-route-input-property-builder
  "The cfn-route-uri-path-route-input-property-builder function buildes out new instances of 
CfnRoute$UriPathRouteInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-state` |
| `appendSourcePath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:append-source-path` |
| `includeChildPaths` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-child-paths` |
| `methods` | java.util.List | [[cdk.support/lookup-entry]] | `:methods` |
| `sourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-path` |"
  [stack id config]
  (let [builder (CfnRoute$UriPathRouteInputProperty$Builder.)]
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
    (.build builder)))


(defn cfn-service-builder
  "The cfn-service-builder function buildes out new instances of 
CfnService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnService$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-service-lambda-endpoint-input-property-builder
  "The cfn-service-lambda-endpoint-input-property-builder function buildes out new instances of 
CfnService$LambdaEndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnService$LambdaEndpointInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-service-props-builder
  "The cfn-service-props-builder function buildes out new instances of 
CfnServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnServiceProps$Builder.)]
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
    (.build builder)))


(defn cfn-service-url-endpoint-input-property-builder
  "The cfn-service-url-endpoint-input-property-builder function buildes out new instances of 
CfnService$UrlEndpointInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-url` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnService$UrlEndpointInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :health-url)]
      (. builder healthUrl data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))