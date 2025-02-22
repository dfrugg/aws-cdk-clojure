(ns cdk.api.services.cloudfront.origins
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudfront.origins package. "
  (:require [cdk.api.services.cloudfront :refer [origin-protocol-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloudfront.origins FunctionUrlOrigin$Builder
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
                                                               S3OriginProps$Builder]))


(defn function-url-origin-builder
  "The function-url-origin-builder function buildes out new instances of 
FunctionUrlOrigin$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config ^software.amazon.awscdk.services.lambda.IFunctionUrl function-url]
  (let [builder (FunctionUrlOrigin$Builder/create ^software.amazon.awscdk.services.lambda.IFunctionUrl function-url)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn function-url-origin-props-builder
  "The function-url-origin-props-builder function buildes out new instances of 
FunctionUrlOriginProps$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config]
  (let [builder (FunctionUrlOriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn http-origin-builder
  "The http-origin-builder function buildes out new instances of 
HttpOrigin$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config ^java.lang.String domain-name]
  (let [builder (HttpOrigin$Builder/create ^java.lang.String domain-name)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (when-let [data (origin-protocol-policy config id :protocol-policy)]
      (. builder protocolPolicy data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn http-origin-props-builder
  "The http-origin-props-builder function buildes out new instances of 
HttpOriginProps$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config]
  (let [builder (HttpOriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (when-let [data (origin-protocol-policy config id :protocol-policy)]
      (. builder protocolPolicy data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn load-balancer-v2-origin-builder
  "The load-balancer-v2-origin-builder function buildes out new instances of 
LoadBalancerV2Origin$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config ^software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 load-balancer]
  (let [builder (LoadBalancerV2Origin$Builder/create ^software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 load-balancer)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (when-let [data (origin-protocol-policy config id :protocol-policy)]
      (. builder protocolPolicy data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn load-balancer-v2-origin-props-builder
  "The load-balancer-v2-origin-props-builder function buildes out new instances of 
LoadBalancerV2OriginProps$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config]
  (let [builder (LoadBalancerV2OriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (when-let [data (origin-protocol-policy config id :protocol-policy)]
      (. builder protocolPolicy data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn origin-group-builder
  "The origin-group-builder function buildes out new instances of 
OriginGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:fallback-origin` |
| `fallbackStatusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:fallback-status-codes` |
| `primaryOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:primary-origin` |"
  [stack id config]
  (let [builder (OriginGroup$Builder/create)]
    (when-let [data (lookup-entry config id :fallback-origin)]
      (. builder fallbackOrigin data))
    (when-let [data (lookup-entry config id :fallback-status-codes)]
      (. builder fallbackStatusCodes data))
    (when-let [data (lookup-entry config id :primary-origin)]
      (. builder primaryOrigin data))
    (.build builder)))


(defn origin-group-props-builder
  "The origin-group-props-builder function buildes out new instances of 
OriginGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:fallback-origin` |
| `fallbackStatusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:fallback-status-codes` |
| `primaryOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:primary-origin` |"
  [stack id config]
  (let [builder (OriginGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :fallback-origin)]
      (. builder fallbackOrigin data))
    (when-let [data (lookup-entry config id :fallback-status-codes)]
      (. builder fallbackStatusCodes data))
    (when-let [data (lookup-entry config id :primary-origin)]
      (. builder primaryOrigin data))
    (.build builder)))


(defn rest-api-origin-builder
  "The rest-api-origin-builder function buildes out new instances of 
RestApiOrigin$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config ^software.amazon.awscdk.services.apigateway.RestApiBase rest-api]
  (let [builder (RestApiOrigin$Builder/create ^software.amazon.awscdk.services.apigateway.RestApiBase rest-api)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn rest-api-origin-props-builder
  "The rest-api-origin-props-builder function buildes out new instances of 
RestApiOriginProps$Builder using the provided configuration.  Each field is set as follows:

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
| `readTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:read-timeout` |"
  [stack id config]
  (let [builder (RestApiOriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :keepalive-timeout)]
      (. builder keepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :read-timeout)]
      (. builder readTimeout data))
    (.build builder)))


(defn s3-origin-builder
  "The s3-origin-builder function buildes out new instances of 
S3Origin$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config ^software.amazon.awscdk.services.s3.IBucket bucket]
  (let [builder (S3Origin$Builder/create ^software.amazon.awscdk.services.s3.IBucket bucket)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))


(defn s3-origin-props-builder
  "The s3-origin-props-builder function buildes out new instances of 
S3OriginProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config]
  (let [builder (S3OriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))