(ns cdk.api.services.cloudfront.origins
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudfront.origins package. "
  (:require [cdk.api.services.cloudfront :refer [origin-protocol-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.apigateway RestApiBase]
           [software.amazon.awscdk.services.cloudfront.origins FunctionUrlOrigin$Builder
                                                               FunctionUrlOriginProps$Builder
                                                               HttpOrigin$Builder
                                                               HttpOriginProps$Builder
                                                               LoadBalancerV2Origin$Builder
                                                               LoadBalancerV2OriginProps$Builder
                                                               OriginGroup$Builder
                                                               OriginGroupProps$Builder
                                                               RestApiOrigin$Builder
                                                               RestApiOriginProps$Builder
                                                               S3Origin$Builder
                                                               S3OriginProps$Builder]
           [software.amazon.awscdk.services.elasticloadbalancingv2 ILoadBalancerV2]
           [software.amazon.awscdk.services.lambda IFunctionUrl]
           [software.amazon.awscdk.services.s3 IBucket]))


(defn build-function-url-origin-builder
  "The build-function-url-origin-builder function updates a FunctionUrlOrigin$Builder instance using the provided configuration.
  The function takes the FunctionUrlOrigin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^FunctionUrlOrigin$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn function-url-origin-builder
  "Creates a  `FunctionUrlOrigin$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.lambda.IFunctionUrl]___
| Argument | DataType | Description |
|---|---|---|
| function-url | software.amazon.awscdk.services.lambda.IFunctionUrl |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IFunctionUrl function-url id config]
  (build-function-url-origin-builder (FunctionUrlOrigin$Builder/create function-url) id config))


(defn build-function-url-origin-props-builder
  "The build-function-url-origin-props-builder function updates a FunctionUrlOriginProps$Builder instance using the provided configuration.
  The function takes the FunctionUrlOriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^FunctionUrlOriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn function-url-origin-props-builder
  "Creates a  `FunctionUrlOriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-function-url-origin-props-builder (new FunctionUrlOriginProps$Builder) id config))


(defn build-http-origin-builder
  "The build-http-origin-builder function updates a HttpOrigin$Builder instance using the provided configuration.
  The function takes the HttpOrigin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
| `protocolPolicy` | software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy | [[cdk.api.services.cloudfront/origin-protocol-policy]] | `:protocol-policy` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^HttpOrigin$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (when-some [data (origin-protocol-policy config id :protocol-policy)]
    (. builder protocolPolicy data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn http-origin-builder
  "Creates a  `HttpOrigin$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| domain-name | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String domain-name id config]
  (build-http-origin-builder (HttpOrigin$Builder/create domain-name) id config))


(defn build-http-origin-props-builder
  "The build-http-origin-props-builder function updates a HttpOriginProps$Builder instance using the provided configuration.
  The function takes the HttpOriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
| `protocolPolicy` | software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy | [[cdk.api.services.cloudfront/origin-protocol-policy]] | `:protocol-policy` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^HttpOriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (when-some [data (origin-protocol-policy config id :protocol-policy)]
    (. builder protocolPolicy data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn http-origin-props-builder
  "Creates a  `HttpOriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-http-origin-props-builder (new HttpOriginProps$Builder) id config))


(defn build-load-balancer-v2-origin-builder
  "The build-load-balancer-v2-origin-builder function updates a LoadBalancerV2Origin$Builder instance using the provided configuration.
  The function takes the LoadBalancerV2Origin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
| `protocolPolicy` | software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy | [[cdk.api.services.cloudfront/origin-protocol-policy]] | `:protocol-policy` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^LoadBalancerV2Origin$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (when-some [data (origin-protocol-policy config id :protocol-policy)]
    (. builder protocolPolicy data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn load-balancer-v2-origin-builder
  "Creates a  `LoadBalancerV2Origin$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2]___
| Argument | DataType | Description |
|---|---|---|
| load-balancer | software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^ILoadBalancerV2 load-balancer id config]
  (build-load-balancer-v2-origin-builder (LoadBalancerV2Origin$Builder/create load-balancer) id config))


(defn build-load-balancer-v2-origin-props-builder
  "The build-load-balancer-v2-origin-props-builder function updates a LoadBalancerV2OriginProps$Builder instance using the provided configuration.
  The function takes the LoadBalancerV2OriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
| `protocolPolicy` | software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy | [[cdk.api.services.cloudfront/origin-protocol-policy]] | `:protocol-policy` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^LoadBalancerV2OriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (when-some [data (origin-protocol-policy config id :protocol-policy)]
    (. builder protocolPolicy data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn load-balancer-v2-origin-props-builder
  "Creates a  `LoadBalancerV2OriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-load-balancer-v2-origin-props-builder (new LoadBalancerV2OriginProps$Builder) id config))


(defn build-origin-group-builder
  "The build-origin-group-builder function updates a OriginGroup$Builder instance using the provided configuration.
  The function takes the OriginGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:fallback-origin` |
| `fallbackStatusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:fallback-status-codes` |
| `primaryOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:primary-origin` |
"
  [^OriginGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :fallback-origin)]
    (. builder fallbackOrigin data))
  (when-some [data (lookup-entry config id :fallback-status-codes)]
    (. builder fallbackStatusCodes data))
  (when-some [data (lookup-entry config id :primary-origin)]
    (. builder primaryOrigin data))
  (.build builder))


(defn origin-group-builder
  "Creates a  `OriginGroup$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-origin-group-builder (OriginGroup$Builder/create) id config))


(defn build-origin-group-props-builder
  "The build-origin-group-props-builder function updates a OriginGroupProps$Builder instance using the provided configuration.
  The function takes the OriginGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:fallback-origin` |
| `fallbackStatusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:fallback-status-codes` |
| `primaryOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:primary-origin` |
"
  [^OriginGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :fallback-origin)]
    (. builder fallbackOrigin data))
  (when-some [data (lookup-entry config id :fallback-status-codes)]
    (. builder fallbackStatusCodes data))
  (when-some [data (lookup-entry config id :primary-origin)]
    (. builder primaryOrigin data))
  (.build builder))


(defn origin-group-props-builder
  "Creates a  `OriginGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-origin-group-props-builder (new OriginGroupProps$Builder) id config))


(defn build-rest-api-origin-builder
  "The build-rest-api-origin-builder function updates a RestApiOrigin$Builder instance using the provided configuration.
  The function takes the RestApiOrigin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^RestApiOrigin$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn rest-api-origin-builder
  "Creates a  `RestApiOrigin$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.apigateway.RestApiBase]___
| Argument | DataType | Description |
|---|---|---|
| rest-api | software.amazon.awscdk.services.apigateway.RestApiBase |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^RestApiBase rest-api id config]
  (build-rest-api-origin-builder (RestApiOrigin$Builder/create rest-api) id config))


(defn build-rest-api-origin-props-builder
  "The build-rest-api-origin-props-builder function updates a RestApiOriginProps$Builder instance using the provided configuration.
  The function takes the RestApiOriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `keepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:keepalive-timeout` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |
"
  [^RestApiOriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :keepalive-timeout)]
    (. builder keepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :read-timeout)]
    (. builder readTimeout data))
  (.build builder))


(defn rest-api-origin-props-builder
  "Creates a  `RestApiOriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-rest-api-origin-props-builder (new RestApiOriginProps$Builder) id config))


(defn build-s3-origin-builder
  "The build-s3-origin-builder function updates a S3Origin$Builder instance using the provided configuration.
  The function takes the S3Origin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^S3Origin$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn s3-origin-builder
  "Creates a  `S3Origin$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.services.s3.IBucket]___
| Argument | DataType | Description |
|---|---|---|
| bucket | software.amazon.awscdk.services.s3.IBucket |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^IBucket bucket id config]
  (build-s3-origin-builder (S3Origin$Builder/create bucket) id config))


(defn build-s3-origin-props-builder
  "The build-s3-origin-props-builder function updates a S3OriginProps$Builder instance using the provided configuration.
  The function takes the S3OriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^S3OriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn s3-origin-props-builder
  "Creates a  `S3OriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-s3-origin-props-builder (new S3OriginProps$Builder) id config))