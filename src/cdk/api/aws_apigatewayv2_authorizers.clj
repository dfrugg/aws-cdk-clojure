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


(defn http-jwt-authorizer-builder
  "The http-jwt-authorizer-builder function buildes out new instances of 
HttpJwtAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |"
  [stack id config ^java.lang.String jwt-issuer]
  (let [builder (HttpJwtAuthorizer$Builder/create ^java.lang.String id ^java.lang.String jwt-issuer)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :jwt-audience)]
      (. builder jwtAudience data))
    (.build builder)))


(defn http-jwt-authorizer-props-builder
  "The http-jwt-authorizer-props-builder function buildes out new instances of 
HttpJwtAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `jwtAudience` | java.util.List | [[cdk.support/lookup-entry]] | `:jwt-audience` |"
  [stack id config]
  (let [builder (HttpJwtAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :jwt-audience)]
      (. builder jwtAudience data))
    (.build builder)))


(defn http-lambda-authorizer-builder
  "The http-lambda-authorizer-builder function buildes out new instances of 
HttpLambdaAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `responseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:response-types` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (HttpLambdaAuthorizer$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :response-types)]
      (. builder responseTypes data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn http-lambda-authorizer-props-builder
  "The http-lambda-authorizer-props-builder function buildes out new instances of 
HttpLambdaAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `responseTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:response-types` |
| `resultsCacheTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:results-cache-ttl` |"
  [stack id config]
  (let [builder (HttpLambdaAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :response-types)]
      (. builder responseTypes data))
    (when-let [data (lookup-entry config id :results-cache-ttl)]
      (. builder resultsCacheTtl data))
    (.build builder)))


(defn http-user-pool-authorizer-builder
  "The http-user-pool-authorizer-builder function buildes out new instances of 
HttpUserPoolAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `userPoolClients` | java.util.List | [[cdk.support/lookup-entry]] | `:user-pool-clients` |
| `userPoolRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-region` |"
  [stack id config ^software.amazon.awscdk.services.cognito.IUserPool user-pool]
  (let [builder (HttpUserPoolAuthorizer$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.cognito.IUserPool user-pool)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :user-pool-clients)]
      (. builder userPoolClients data))
    (when-let [data (lookup-entry config id :user-pool-region)]
      (. builder userPoolRegion data))
    (.build builder)))


(defn http-user-pool-authorizer-props-builder
  "The http-user-pool-authorizer-props-builder function buildes out new instances of 
HttpUserPoolAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |
| `userPoolClients` | java.util.List | [[cdk.support/lookup-entry]] | `:user-pool-clients` |
| `userPoolRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-region` |"
  [stack id config]
  (let [builder (HttpUserPoolAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (when-let [data (lookup-entry config id :user-pool-clients)]
      (. builder userPoolClients data))
    (when-let [data (lookup-entry config id :user-pool-region)]
      (. builder userPoolRegion data))
    (.build builder)))


(defn web-socket-lambda-authorizer-builder
  "The web-socket-lambda-authorizer-builder function buildes out new instances of 
WebSocketLambdaAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunction handler-function]
  (let [builder (WebSocketLambdaAuthorizer$Builder/create ^java.lang.String id ^software.amazon.awscdk.services.lambda.IFunction handler-function)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (.build builder)))


(defn web-socket-lambda-authorizer-props-builder
  "The web-socket-lambda-authorizer-props-builder function buildes out new instances of 
WebSocketLambdaAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `identitySource` | java.util.List | [[cdk.support/lookup-entry]] | `:identity-source` |"
  [stack id config]
  (let [builder (WebSocketLambdaAuthorizerProps$Builder.)]
    (when-let [data (lookup-entry config id :authorizer-name)]
      (. builder authorizerName data))
    (when-let [data (lookup-entry config id :identity-source)]
      (. builder identitySource data))
    (.build builder)))