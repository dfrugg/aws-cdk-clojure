(ns cdk.api.services.elasticloadbalancingv2.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancingv2.actions package. "
  (:require [cdk.api.services.elasticloadbalancingv2 :refer [unauthenticated-action]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticloadbalancingv2.actions AuthenticateCognitoAction$Builder
                                                                           AuthenticateCognitoActionProps$Builder]))


(defn authenticate-cognito-action-builder
  "The authenticate-cognito-action-builder function buildes out new instances of 
AuthenticateCognitoAction$Builder using the provided configuration.  Each field is set as follows:

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
| `userPoolDomain` | software.amazon.awscdk.services.cognito.IUserPoolDomain | [[cdk.support/lookup-entry]] | `:user-pool-domain` |"
  [stack id config]
  (let [builder (AuthenticateCognitoAction$Builder/create)]
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
    (.build builder)))


(defn authenticate-cognito-action-props-builder
  "The authenticate-cognito-action-props-builder function buildes out new instances of 
AuthenticateCognitoActionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `userPoolDomain` | software.amazon.awscdk.services.cognito.IUserPoolDomain | [[cdk.support/lookup-entry]] | `:user-pool-domain` |"
  [stack id config]
  (let [builder (AuthenticateCognitoActionProps$Builder.)]
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
    (.build builder)))