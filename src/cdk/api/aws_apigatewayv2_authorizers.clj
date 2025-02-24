(ns cdk.api.aws-apigatewayv2-authorizers
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.aws_apigatewayv2_authorizers package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.aws_apigatewayv2_authorizers HttpJwtAuthorizer$Builder
                                                                HttpJwtAuthorizerProps$Builder
                                                                HttpLambdaAuthorizer$Builder
                                                                HttpLambdaAuthorizerProps$Builder
                                                                HttpLambdaResponseType
                                                                HttpUserPoolAuthorizer$Builder
                                                                HttpUserPoolAuthorizerProps$Builder
                                                                WebSocketLambdaAuthorizer$Builder
                                                                WebSocketLambdaAuthorizerProps$Builder]))


(defn http-lambda-response-type
  "The `http-lambda-response-type` function data interprets values in the provided config data into a 
`HttpLambdaResponseType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpLambdaResponseType` - the value is returned.
* is `:simple` - `HttpLambdaResponseType/SIMPLE` is returned
* is `:iam` - `HttpLambdaResponseType/IAM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpLambdaResponseType data) data
      (= :simple data) HttpLambdaResponseType/SIMPLE
      (= :iam data) HttpLambdaResponseType/IAM)))


(defn build-http-jwt-authorizer-builder
  "The build-http-jwt-authorizer-builder function updates a HttpJwtAuthorizer$Builder instance using the provided configuration.
  The function takes the HttpJwtAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |
"
  [^HttpJwtAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :jwt-audience)]
    (. builder jwtAudience data))
  (.build builder))


(defn build-http-jwt-authorizer-props-builder
  "The build-http-jwt-authorizer-props-builder function updates a HttpJwtAuthorizerProps$Builder instance using the provided configuration.
  The function takes the HttpJwtAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |
"
  [^HttpJwtAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :jwt-audience)]
    (. builder jwtAudience data))
  (.build builder))


(defn http-jwt-authorizer-props-builder
  ""
  [id config]
  (build-http-jwt-authorizer-props-builder (new HttpJwtAuthorizerProps$Builder) id config))


(defn build-http-lambda-authorizer-builder
  "The build-http-lambda-authorizer-builder function updates a HttpLambdaAuthorizer$Builder instance using the provided configuration.
  The function takes the HttpLambdaAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `responseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:response-types` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^HttpLambdaAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :response-types)]
    (. builder responseTypes data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (.build builder))


(defn build-http-lambda-authorizer-props-builder
  "The build-http-lambda-authorizer-props-builder function updates a HttpLambdaAuthorizerProps$Builder instance using the provided configuration.
  The function takes the HttpLambdaAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `responseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:response-types` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |
"
  [^HttpLambdaAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :response-types)]
    (. builder responseTypes data))
  (when-let [data (lookup-entry config id :results-cache-ttl)]
    (. builder resultsCacheTtl data))
  (.build builder))


(defn http-lambda-authorizer-props-builder
  ""
  [id config]
  (build-http-lambda-authorizer-props-builder (new HttpLambdaAuthorizerProps$Builder) id config))


(defn build-http-user-pool-authorizer-builder
  "The build-http-user-pool-authorizer-builder function updates a HttpUserPoolAuthorizer$Builder instance using the provided configuration.
  The function takes the HttpUserPoolAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `userPoolClients` | java.util.List | [[cdk.support/lookup-entry]] | `:user-pool-clients` |
| `userPoolRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-region` |
"
  [^HttpUserPoolAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :user-pool-clients)]
    (. builder userPoolClients data))
  (when-let [data (lookup-entry config id :user-pool-region)]
    (. builder userPoolRegion data))
  (.build builder))


(defn build-http-user-pool-authorizer-props-builder
  "The build-http-user-pool-authorizer-props-builder function updates a HttpUserPoolAuthorizerProps$Builder instance using the provided configuration.
  The function takes the HttpUserPoolAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `userPoolClients` | java.util.List | [[cdk.support/lookup-entry]] | `:user-pool-clients` |
| `userPoolRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-region` |
"
  [^HttpUserPoolAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (when-let [data (lookup-entry config id :user-pool-clients)]
    (. builder userPoolClients data))
  (when-let [data (lookup-entry config id :user-pool-region)]
    (. builder userPoolRegion data))
  (.build builder))


(defn http-user-pool-authorizer-props-builder
  ""
  [id config]
  (build-http-user-pool-authorizer-props-builder (new HttpUserPoolAuthorizerProps$Builder) id config))


(defn build-web-socket-lambda-authorizer-builder
  "The build-web-socket-lambda-authorizer-builder function updates a WebSocketLambdaAuthorizer$Builder instance using the provided configuration.
  The function takes the WebSocketLambdaAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
"
  [^WebSocketLambdaAuthorizer$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (.build builder))


(defn build-web-socket-lambda-authorizer-props-builder
  "The build-web-socket-lambda-authorizer-props-builder function updates a WebSocketLambdaAuthorizerProps$Builder instance using the provided configuration.
  The function takes the WebSocketLambdaAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
"
  [^WebSocketLambdaAuthorizerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :identity-source)]
    (. builder identitySource data))
  (.build builder))


(defn web-socket-lambda-authorizer-props-builder
  ""
  [id config]
  (build-web-socket-lambda-authorizer-props-builder (new WebSocketLambdaAuthorizerProps$Builder) id config))