(ns cdk.api.services.elasticloadbalancingv2.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancingv2.actions package. "
  (:require [cdk.api.services.elasticloadbalancingv2 :refer [unauthenticated-action]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticloadbalancingv2.actions AuthenticateCognitoAction$Builder
                                                                           AuthenticateCognitoActionProps$Builder]))


(defn build-authenticate-cognito-action-builder
  "The build-authenticate-cognito-action-builder function updates a AuthenticateCognitoAction$Builder instance using the provided configuration.
  The function takes the AuthenticateCognitoAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowHttpsOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-https-outbound` |
| `authenticationRequestExtraParams` | java.util.Map | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `next` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:next` |
| `onUnauthenticatedRequest` | software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction | [[cdk.api.services.elasticloadbalancingv2/unauthenticated-action]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolClient` | software.amazon.awscdk.services.cognito.IUserPoolClient | [[cdk.support/lookup-entry]] | `:user-pool-client` |
| `userPoolDomain` | software.amazon.awscdk.services.cognito.IUserPoolDomain | [[cdk.support/lookup-entry]] | `:user-pool-domain` |
"
  [^AuthenticateCognitoAction$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-https-outbound)]
    (. builder allowHttpsOutbound data))
  (when-let [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-let [data (lookup-entry config id :next)]
    (. builder next data))
  (when-let [data (unauthenticated-action config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-let [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-let [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-let [data (lookup-entry config id :user-pool-client)]
    (. builder userPoolClient data))
  (when-let [data (lookup-entry config id :user-pool-domain)]
    (. builder userPoolDomain data))
  (.build builder))


(defn authenticate-cognito-action-builder
  "Creates a  `AuthenticateCognitoAction$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-authenticate-cognito-action-builder (AuthenticateCognitoAction$Builder/create) id config))


(defn build-authenticate-cognito-action-props-builder
  "The build-authenticate-cognito-action-props-builder function updates a AuthenticateCognitoActionProps$Builder instance using the provided configuration.
  The function takes the AuthenticateCognitoActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowHttpsOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-https-outbound` |
| `authenticationRequestExtraParams` | java.util.Map | [[cdk.support/lookup-entry]] | `:authentication-request-extra-params` |
| `next` | software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction | [[cdk.support/lookup-entry]] | `:next` |
| `onUnauthenticatedRequest` | software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction | [[cdk.api.services.elasticloadbalancingv2/unauthenticated-action]] | `:on-unauthenticated-request` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `sessionCookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-cookie-name` |
| `sessionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userPool` | software.amazon.awscdk.services.cognito.IUserPool | [[cdk.support/lookup-entry]] | `:user-pool` |
| `userPoolClient` | software.amazon.awscdk.services.cognito.IUserPoolClient | [[cdk.support/lookup-entry]] | `:user-pool-client` |
| `userPoolDomain` | software.amazon.awscdk.services.cognito.IUserPoolDomain | [[cdk.support/lookup-entry]] | `:user-pool-domain` |
"
  [^AuthenticateCognitoActionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-https-outbound)]
    (. builder allowHttpsOutbound data))
  (when-let [data (lookup-entry config id :authentication-request-extra-params)]
    (. builder authenticationRequestExtraParams data))
  (when-let [data (lookup-entry config id :next)]
    (. builder next data))
  (when-let [data (unauthenticated-action config id :on-unauthenticated-request)]
    (. builder onUnauthenticatedRequest data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :session-cookie-name)]
    (. builder sessionCookieName data))
  (when-let [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-let [data (lookup-entry config id :user-pool)]
    (. builder userPool data))
  (when-let [data (lookup-entry config id :user-pool-client)]
    (. builder userPoolClient data))
  (when-let [data (lookup-entry config id :user-pool-domain)]
    (. builder userPoolDomain data))
  (.build builder))


(defn authenticate-cognito-action-props-builder
  "Creates a  `AuthenticateCognitoActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-authenticate-cognito-action-props-builder (new AuthenticateCognitoActionProps$Builder) id config))