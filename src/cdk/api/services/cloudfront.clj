(ns cdk.api.services.cloudfront
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudfront package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloudfront AddBehaviorOptions$Builder
                                                       AssetImportSource$Builder
                                                       Behavior$Builder
                                                       BehaviorOptions$Builder
                                                       CachePolicy$Builder
                                                       CachePolicyProps$Builder
                                                       CfnCachePolicy$Builder
                                                       CfnCachePolicy$CachePolicyConfigProperty$Builder
                                                       CfnCachePolicy$CookiesConfigProperty$Builder
                                                       CfnCachePolicy$HeadersConfigProperty$Builder
                                                       CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder
                                                       CfnCachePolicy$QueryStringsConfigProperty$Builder
                                                       CfnCachePolicyProps$Builder
                                                       CfnCloudFrontOriginAccessIdentity$Builder
                                                       CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder
                                                       CfnCloudFrontOriginAccessIdentityProps$Builder
                                                       CfnContinuousDeploymentPolicy$Builder
                                                       CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder
                                                       CfnContinuousDeploymentPolicyProps$Builder
                                                       CfnDistribution$Builder
                                                       CfnDistribution$CacheBehaviorProperty$Builder
                                                       CfnDistribution$CookiesProperty$Builder
                                                       CfnDistribution$CustomErrorResponseProperty$Builder
                                                       CfnDistribution$CustomOriginConfigProperty$Builder
                                                       CfnDistribution$DefaultCacheBehaviorProperty$Builder
                                                       CfnDistribution$DistributionConfigProperty$Builder
                                                       CfnDistribution$ForwardedValuesProperty$Builder
                                                       CfnDistribution$FunctionAssociationProperty$Builder
                                                       CfnDistribution$GeoRestrictionProperty$Builder
                                                       CfnDistribution$LambdaFunctionAssociationProperty$Builder
                                                       CfnDistribution$LegacyCustomOriginProperty$Builder
                                                       CfnDistribution$LegacyS3OriginProperty$Builder
                                                       CfnDistribution$LoggingProperty$Builder
                                                       CfnDistribution$OriginCustomHeaderProperty$Builder
                                                       CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder
                                                       CfnDistribution$OriginGroupMemberProperty$Builder
                                                       CfnDistribution$OriginGroupMembersProperty$Builder
                                                       CfnDistribution$OriginGroupProperty$Builder
                                                       CfnDistribution$OriginGroupsProperty$Builder
                                                       CfnDistribution$OriginProperty$Builder
                                                       CfnDistribution$OriginShieldProperty$Builder
                                                       CfnDistribution$RestrictionsProperty$Builder
                                                       CfnDistribution$S3OriginConfigProperty$Builder
                                                       CfnDistribution$StatusCodesProperty$Builder
                                                       CfnDistribution$ViewerCertificateProperty$Builder
                                                       CfnDistributionProps$Builder
                                                       CfnFunction$Builder
                                                       CfnFunction$FunctionConfigProperty$Builder
                                                       CfnFunction$FunctionMetadataProperty$Builder
                                                       CfnFunction$KeyValueStoreAssociationProperty$Builder
                                                       CfnFunctionProps$Builder
                                                       CfnKeyGroup$Builder
                                                       CfnKeyGroup$KeyGroupConfigProperty$Builder
                                                       CfnKeyGroupProps$Builder
                                                       CfnKeyValueStore$Builder
                                                       CfnKeyValueStore$ImportSourceProperty$Builder
                                                       CfnKeyValueStoreProps$Builder
                                                       CfnMonitoringSubscription$Builder
                                                       CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder
                                                       CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder
                                                       CfnMonitoringSubscriptionProps$Builder
                                                       CfnOriginAccessControl$Builder
                                                       CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder
                                                       CfnOriginAccessControlProps$Builder
                                                       CfnOriginRequestPolicy$Builder
                                                       CfnOriginRequestPolicy$CookiesConfigProperty$Builder
                                                       CfnOriginRequestPolicy$HeadersConfigProperty$Builder
                                                       CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder
                                                       CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder
                                                       CfnOriginRequestPolicyProps$Builder
                                                       CfnPublicKey$Builder
                                                       CfnPublicKey$PublicKeyConfigProperty$Builder
                                                       CfnPublicKeyProps$Builder
                                                       CfnRealtimeLogConfig$Builder
                                                       CfnRealtimeLogConfig$EndPointProperty$Builder
                                                       CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder
                                                       CfnRealtimeLogConfigProps$Builder
                                                       CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder
                                                       CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder
                                                       CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder
                                                       CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder
                                                       CfnResponseHeadersPolicy$Builder
                                                       CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder
                                                       CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder
                                                       CfnResponseHeadersPolicy$CorsConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$CustomHeaderProperty$Builder
                                                       CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$FrameOptionsProperty$Builder
                                                       CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder
                                                       CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder
                                                       CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder
                                                       CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder
                                                       CfnResponseHeadersPolicy$XSSProtectionProperty$Builder
                                                       CfnResponseHeadersPolicyProps$Builder
                                                       CfnStreamingDistribution$Builder
                                                       CfnStreamingDistribution$LoggingProperty$Builder
                                                       CfnStreamingDistribution$S3OriginProperty$Builder
                                                       CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder
                                                       CfnStreamingDistribution$TrustedSignersProperty$Builder
                                                       CfnStreamingDistributionProps$Builder
                                                       CloudFrontAllowedCachedMethods
                                                       CloudFrontAllowedMethods
                                                       CloudFrontWebDistribution$Builder
                                                       CloudFrontWebDistributionAttributes$Builder
                                                       CloudFrontWebDistributionProps$Builder
                                                       CustomOriginConfig$Builder
                                                       Distribution$Builder
                                                       DistributionAttributes$Builder
                                                       DistributionProps$Builder
                                                       EdgeLambda$Builder
                                                       ErrorResponse$Builder
                                                       FailoverStatusCode
                                                       FileCodeOptions$Builder
                                                       Function$Builder
                                                       FunctionAssociation$Builder
                                                       FunctionAttributes$Builder
                                                       FunctionEventType
                                                       FunctionProps$Builder
                                                       HeadersFrameOption
                                                       HeadersReferrerPolicy
                                                       HttpVersion
                                                       KeyGroup$Builder
                                                       KeyGroupProps$Builder
                                                       KeyValueStore$Builder
                                                       KeyValueStoreProps$Builder
                                                       LambdaEdgeEventType
                                                       LambdaFunctionAssociation$Builder
                                                       LoggingConfiguration$Builder
                                                       OriginAccessIdentity$Builder
                                                       OriginAccessIdentityProps$Builder
                                                       OriginBindConfig$Builder
                                                       OriginBindOptions$Builder
                                                       OriginFailoverConfig$Builder
                                                       OriginOptions$Builder
                                                       OriginProps$Builder
                                                       OriginProtocolPolicy
                                                       OriginRequestPolicy$Builder
                                                       OriginRequestPolicyProps$Builder
                                                       OriginSslPolicy
                                                       PriceClass
                                                       PublicKey$Builder
                                                       PublicKeyProps$Builder
                                                       RealtimeLogConfig$Builder
                                                       RealtimeLogConfigProps$Builder
                                                       ResponseCustomHeader$Builder
                                                       ResponseCustomHeadersBehavior$Builder
                                                       ResponseHeadersContentSecurityPolicy$Builder
                                                       ResponseHeadersContentTypeOptions$Builder
                                                       ResponseHeadersCorsBehavior$Builder
                                                       ResponseHeadersFrameOptions$Builder
                                                       ResponseHeadersPolicy$Builder
                                                       ResponseHeadersPolicyProps$Builder
                                                       ResponseHeadersReferrerPolicy$Builder
                                                       ResponseHeadersStrictTransportSecurity$Builder
                                                       ResponseHeadersXSSProtection$Builder
                                                       ResponseSecurityHeadersBehavior$Builder
                                                       S3OriginConfig$Builder
                                                       SSLMethod
                                                       SecurityPolicyProtocol
                                                       SourceConfiguration$Builder
                                                       ViewerCertificateOptions$Builder
                                                       ViewerProtocolPolicy]))


(defn cloud-front-allowed-cached-methods
  "The `cloud-front-allowed-cached-methods` function data interprets values in the provided config data into a 
`CloudFrontAllowedCachedMethods` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CloudFrontAllowedCachedMethods` - the value is returned.
* is `:get-head` - `CloudFrontAllowedCachedMethods/GET_HEAD` is returned
* is `:get-head-options` - `CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CloudFrontAllowedCachedMethods data) data
      (= :get-head data) CloudFrontAllowedCachedMethods/GET_HEAD
      (= :get-head-options data) CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS)))


(defn cloud-front-allowed-methods
  "The `cloud-front-allowed-methods` function data interprets values in the provided config data into a 
`CloudFrontAllowedMethods` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CloudFrontAllowedMethods` - the value is returned.
* is `:all` - `CloudFrontAllowedMethods/ALL` is returned
* is `:get-head` - `CloudFrontAllowedMethods/GET_HEAD` is returned
* is `:get-head-options` - `CloudFrontAllowedMethods/GET_HEAD_OPTIONS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CloudFrontAllowedMethods data) data
      (= :all data) CloudFrontAllowedMethods/ALL
      (= :get-head data) CloudFrontAllowedMethods/GET_HEAD
      (= :get-head-options data) CloudFrontAllowedMethods/GET_HEAD_OPTIONS)))


(defn failover-status-code
  "The `failover-status-code` function data interprets values in the provided config data into a 
`FailoverStatusCode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FailoverStatusCode` - the value is returned.
* is `:service-unavailable` - `FailoverStatusCode/SERVICE_UNAVAILABLE` is returned
* is `:gateway-timeout` - `FailoverStatusCode/GATEWAY_TIMEOUT` is returned
* is `:forbidden` - `FailoverStatusCode/FORBIDDEN` is returned
* is `:not-found` - `FailoverStatusCode/NOT_FOUND` is returned
* is `:bad-gateway` - `FailoverStatusCode/BAD_GATEWAY` is returned
* is `:internal-server-error` - `FailoverStatusCode/INTERNAL_SERVER_ERROR` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FailoverStatusCode data) data
      (= :service-unavailable data) FailoverStatusCode/SERVICE_UNAVAILABLE
      (= :gateway-timeout data) FailoverStatusCode/GATEWAY_TIMEOUT
      (= :forbidden data) FailoverStatusCode/FORBIDDEN
      (= :not-found data) FailoverStatusCode/NOT_FOUND
      (= :bad-gateway data) FailoverStatusCode/BAD_GATEWAY
      (= :internal-server-error data) FailoverStatusCode/INTERNAL_SERVER_ERROR)))


(defn function-event-type
  "The `function-event-type` function data interprets values in the provided config data into a 
`FunctionEventType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FunctionEventType` - the value is returned.
* is `:viewer-response` - `FunctionEventType/VIEWER_RESPONSE` is returned
* is `:viewer-request` - `FunctionEventType/VIEWER_REQUEST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FunctionEventType data) data
      (= :viewer-response data) FunctionEventType/VIEWER_RESPONSE
      (= :viewer-request data) FunctionEventType/VIEWER_REQUEST)))


(defn headers-frame-option
  "The `headers-frame-option` function data interprets values in the provided config data into a 
`HeadersFrameOption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HeadersFrameOption` - the value is returned.
* is `:sameorigin` - `HeadersFrameOption/SAMEORIGIN` is returned
* is `:deny` - `HeadersFrameOption/DENY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HeadersFrameOption data) data
      (= :sameorigin data) HeadersFrameOption/SAMEORIGIN
      (= :deny data) HeadersFrameOption/DENY)))


(defn headers-referrer-policy
  "The `headers-referrer-policy` function data interprets values in the provided config data into a 
`HeadersReferrerPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HeadersReferrerPolicy` - the value is returned.
* is `:no-referrer-when-downgrade` - `HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE` is returned
* is `:strict-origin-when-cross-origin` - `HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN` is returned
* is `:unsafe-url` - `HeadersReferrerPolicy/UNSAFE_URL` is returned
* is `:no-referrer` - `HeadersReferrerPolicy/NO_REFERRER` is returned
* is `:origin-when-cross-origin` - `HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN` is returned
* is `:origin` - `HeadersReferrerPolicy/ORIGIN` is returned
* is `:same-origin` - `HeadersReferrerPolicy/SAME_ORIGIN` is returned
* is `:strict-origin` - `HeadersReferrerPolicy/STRICT_ORIGIN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HeadersReferrerPolicy data) data
      (= :no-referrer-when-downgrade data) HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE
      (= :strict-origin-when-cross-origin data) HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN
      (= :unsafe-url data) HeadersReferrerPolicy/UNSAFE_URL
      (= :no-referrer data) HeadersReferrerPolicy/NO_REFERRER
      (= :origin-when-cross-origin data) HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN
      (= :origin data) HeadersReferrerPolicy/ORIGIN
      (= :same-origin data) HeadersReferrerPolicy/SAME_ORIGIN
      (= :strict-origin data) HeadersReferrerPolicy/STRICT_ORIGIN)))


(defn http-version
  "The `http-version` function data interprets values in the provided config data into a 
`HttpVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HttpVersion` - the value is returned.
* is `:http3` - `HttpVersion/HTTP3` is returned
* is `:http2-and-3` - `HttpVersion/HTTP2_AND_3` is returned
* is `:http2` - `HttpVersion/HTTP2` is returned
* is `:http1-1` - `HttpVersion/HTTP1_1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HttpVersion data) data
      (= :http3 data) HttpVersion/HTTP3
      (= :http2-and-3 data) HttpVersion/HTTP2_AND_3
      (= :http2 data) HttpVersion/HTTP2
      (= :http1-1 data) HttpVersion/HTTP1_1)))


(defn lambda-edge-event-type
  "The `lambda-edge-event-type` function data interprets values in the provided config data into a 
`LambdaEdgeEventType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LambdaEdgeEventType` - the value is returned.
* is `:viewer-response` - `LambdaEdgeEventType/VIEWER_RESPONSE` is returned
* is `:viewer-request` - `LambdaEdgeEventType/VIEWER_REQUEST` is returned
* is `:origin-request` - `LambdaEdgeEventType/ORIGIN_REQUEST` is returned
* is `:origin-response` - `LambdaEdgeEventType/ORIGIN_RESPONSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LambdaEdgeEventType data) data
      (= :viewer-response data) LambdaEdgeEventType/VIEWER_RESPONSE
      (= :viewer-request data) LambdaEdgeEventType/VIEWER_REQUEST
      (= :origin-request data) LambdaEdgeEventType/ORIGIN_REQUEST
      (= :origin-response data) LambdaEdgeEventType/ORIGIN_RESPONSE)))


(defn origin-protocol-policy
  "The `origin-protocol-policy` function data interprets values in the provided config data into a 
`OriginProtocolPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OriginProtocolPolicy` - the value is returned.
* is `:match-viewer` - `OriginProtocolPolicy/MATCH_VIEWER` is returned
* is `:https-only` - `OriginProtocolPolicy/HTTPS_ONLY` is returned
* is `:http-only` - `OriginProtocolPolicy/HTTP_ONLY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OriginProtocolPolicy data) data
      (= :match-viewer data) OriginProtocolPolicy/MATCH_VIEWER
      (= :https-only data) OriginProtocolPolicy/HTTPS_ONLY
      (= :http-only data) OriginProtocolPolicy/HTTP_ONLY)))


(defn origin-ssl-policy
  "The `origin-ssl-policy` function data interprets values in the provided config data into a 
`OriginSslPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OriginSslPolicy` - the value is returned.
* is `:tls-v1-2` - `OriginSslPolicy/TLS_V1_2` is returned
* is `:tls-v1-1` - `OriginSslPolicy/TLS_V1_1` is returned
* is `:tls-v1` - `OriginSslPolicy/TLS_V1` is returned
* is `:ssl-v3` - `OriginSslPolicy/SSL_V3` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OriginSslPolicy data) data
      (= :tls-v1-2 data) OriginSslPolicy/TLS_V1_2
      (= :tls-v1-1 data) OriginSslPolicy/TLS_V1_1
      (= :tls-v1 data) OriginSslPolicy/TLS_V1
      (= :ssl-v3 data) OriginSslPolicy/SSL_V3)))


(defn price-class
  "The `price-class` function data interprets values in the provided config data into a 
`PriceClass` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PriceClass` - the value is returned.
* is `:price-class-200` - `PriceClass/PRICE_CLASS_200` is returned
* is `:price-class-100` - `PriceClass/PRICE_CLASS_100` is returned
* is `:price-class-all` - `PriceClass/PRICE_CLASS_ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PriceClass data) data
      (= :price-class-200 data) PriceClass/PRICE_CLASS_200
      (= :price-class-100 data) PriceClass/PRICE_CLASS_100
      (= :price-class-all data) PriceClass/PRICE_CLASS_ALL)))


(defn security-policy-protocol
  "The `security-policy-protocol` function data interprets values in the provided config data into a 
`SecurityPolicyProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SecurityPolicyProtocol` - the value is returned.
* is `:tls-v1-2-2018` - `SecurityPolicyProtocol/TLS_V1_2_2018` is returned
* is `:tls-v1-2016` - `SecurityPolicyProtocol/TLS_V1_2016` is returned
* is `:tls-v1` - `SecurityPolicyProtocol/TLS_V1` is returned
* is `:tls-v1-1-2016` - `SecurityPolicyProtocol/TLS_V1_1_2016` is returned
* is `:tls-v1-2-2019` - `SecurityPolicyProtocol/TLS_V1_2_2019` is returned
* is `:tls-v1-2-2021` - `SecurityPolicyProtocol/TLS_V1_2_2021` is returned
* is `:ssl-v3` - `SecurityPolicyProtocol/SSL_V3` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SecurityPolicyProtocol data) data
      (= :tls-v1-2-2018 data) SecurityPolicyProtocol/TLS_V1_2_2018
      (= :tls-v1-2016 data) SecurityPolicyProtocol/TLS_V1_2016
      (= :tls-v1 data) SecurityPolicyProtocol/TLS_V1
      (= :tls-v1-1-2016 data) SecurityPolicyProtocol/TLS_V1_1_2016
      (= :tls-v1-2-2019 data) SecurityPolicyProtocol/TLS_V1_2_2019
      (= :tls-v1-2-2021 data) SecurityPolicyProtocol/TLS_V1_2_2021
      (= :ssl-v3 data) SecurityPolicyProtocol/SSL_V3)))


(defn ssl-method
  "The `ssl-method` function data interprets values in the provided config data into a 
`SSLMethod` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SSLMethod` - the value is returned.
* is `:vip` - `SSLMethod/VIP` is returned
* is `:sni` - `SSLMethod/SNI` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SSLMethod data) data
      (= :vip data) SSLMethod/VIP
      (= :sni data) SSLMethod/SNI)))


(defn viewer-protocol-policy
  "The `viewer-protocol-policy` function data interprets values in the provided config data into a 
`ViewerProtocolPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ViewerProtocolPolicy` - the value is returned.
* is `:redirect-to-https` - `ViewerProtocolPolicy/REDIRECT_TO_HTTPS` is returned
* is `:https-only` - `ViewerProtocolPolicy/HTTPS_ONLY` is returned
* is `:allow-all` - `ViewerProtocolPolicy/ALLOW_ALL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ViewerProtocolPolicy data) data
      (= :redirect-to-https data) ViewerProtocolPolicy/REDIRECT_TO_HTTPS
      (= :https-only data) ViewerProtocolPolicy/HTTPS_ONLY
      (= :allow-all data) ViewerProtocolPolicy/ALLOW_ALL)))


(defn add-behavior-options-builder
  "The add-behavior-options-builder function buildes out new instances of 
AddBehaviorOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedMethods` | software.amazon.awscdk.services.cloudfront.AllowedMethods | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `cachePolicy` | software.amazon.awscdk.services.cloudfront.ICachePolicy | [[cdk.support/lookup-entry]] | `:cache-policy` |
| `cachedMethods` | software.amazon.awscdk.services.cloudfront.CachedMethods | [[cdk.support/lookup-entry]] | `:cached-methods` |
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `edgeLambdas` | java.util.List | [[cdk.support/lookup-entry]] | `:edge-lambdas` |
| `functionAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:function-associations` |
| `originRequestPolicy` | software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy | [[cdk.support/lookup-entry]] | `:origin-request-policy` |
| `realtimeLogConfig` | software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig | [[cdk.support/lookup-entry]] | `:realtime-log-config` |
| `responseHeadersPolicy` | software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy | [[cdk.support/lookup-entry]] | `:response-headers-policy` |
| `smoothStreaming` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:smooth-streaming` |
| `trustedKeyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-key-groups` |
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |"
  [stack id config]
  (let [builder (AddBehaviorOptions$Builder.)]
    (when-let [data (lookup-entry config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (lookup-entry config id :cache-policy)]
      (. builder cachePolicy data))
    (when-let [data (lookup-entry config id :cached-methods)]
      (. builder cachedMethods data))
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :edge-lambdas)]
      (. builder edgeLambdas data))
    (when-let [data (lookup-entry config id :function-associations)]
      (. builder functionAssociations data))
    (when-let [data (lookup-entry config id :origin-request-policy)]
      (. builder originRequestPolicy data))
    (when-let [data (lookup-entry config id :realtime-log-config)]
      (. builder realtimeLogConfig data))
    (when-let [data (lookup-entry config id :response-headers-policy)]
      (. builder responseHeadersPolicy data))
    (when-let [data (lookup-entry config id :smooth-streaming)]
      (. builder smoothStreaming data))
    (when-let [data (lookup-entry config id :trusted-key-groups)]
      (. builder trustedKeyGroups data))
    (when-let [data (viewer-protocol-policy config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (.build builder)))


(defn asset-import-source-builder
  "The asset-import-source-builder function buildes out new instances of 
AssetImportSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |"
  [stack id config ^java.lang.String path]
  (let [builder (AssetImportSource$Builder/create ^java.lang.String path)]
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
    (.build builder)))


(defn behavior-builder
  "The behavior-builder function buildes out new instances of 
Behavior$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedMethods` | software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods | [[cdk.api.services.cloudfront/cloud-front-allowed-methods]] | `:allowed-methods` |
| `cachedMethods` | software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods | [[cdk.api.services.cloudfront/cloud-front-allowed-cached-methods]] | `:cached-methods` |
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `defaultTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `forwardedValues` | software.amazon.awscdk.services.cloudfront.CfnDistribution$ForwardedValuesProperty | [[cdk.support/lookup-entry]] | `:forwarded-values` |
| `functionAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:function-associations` |
| `isDefaultBehavior` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-default-behavior` |
| `lambdaFunctionAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:lambda-function-associations` |
| `maxTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `pathPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-pattern` |
| `trustedKeyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-key-groups` |
| `trustedSigners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-signers` |
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |"
  [stack id config]
  (let [builder (Behavior$Builder.)]
    (when-let [data (cloud-front-allowed-methods config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (cloud-front-allowed-cached-methods config id :cached-methods)]
      (. builder cachedMethods data))
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :forwarded-values)]
      (. builder forwardedValues data))
    (when-let [data (lookup-entry config id :function-associations)]
      (. builder functionAssociations data))
    (when-let [data (lookup-entry config id :is-default-behavior)]
      (. builder isDefaultBehavior data))
    (when-let [data (lookup-entry config id :lambda-function-associations)]
      (. builder lambdaFunctionAssociations data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :path-pattern)]
      (. builder pathPattern data))
    (when-let [data (lookup-entry config id :trusted-key-groups)]
      (. builder trustedKeyGroups data))
    (when-let [data (lookup-entry config id :trusted-signers)]
      (. builder trustedSigners data))
    (when-let [data (viewer-protocol-policy config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (.build builder)))


(defn behavior-options-builder
  "The behavior-options-builder function buildes out new instances of 
BehaviorOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedMethods` | software.amazon.awscdk.services.cloudfront.AllowedMethods | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `cachePolicy` | software.amazon.awscdk.services.cloudfront.ICachePolicy | [[cdk.support/lookup-entry]] | `:cache-policy` |
| `cachedMethods` | software.amazon.awscdk.services.cloudfront.CachedMethods | [[cdk.support/lookup-entry]] | `:cached-methods` |
| `compress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:compress` |
| `edgeLambdas` | java.util.List | [[cdk.support/lookup-entry]] | `:edge-lambdas` |
| `functionAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:function-associations` |
| `origin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:origin` |
| `originRequestPolicy` | software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy | [[cdk.support/lookup-entry]] | `:origin-request-policy` |
| `realtimeLogConfig` | software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig | [[cdk.support/lookup-entry]] | `:realtime-log-config` |
| `responseHeadersPolicy` | software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy | [[cdk.support/lookup-entry]] | `:response-headers-policy` |
| `smoothStreaming` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:smooth-streaming` |
| `trustedKeyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-key-groups` |
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |"
  [stack id config]
  (let [builder (BehaviorOptions$Builder.)]
    (when-let [data (lookup-entry config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (lookup-entry config id :cache-policy)]
      (. builder cachePolicy data))
    (when-let [data (lookup-entry config id :cached-methods)]
      (. builder cachedMethods data))
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :edge-lambdas)]
      (. builder edgeLambdas data))
    (when-let [data (lookup-entry config id :function-associations)]
      (. builder functionAssociations data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (when-let [data (lookup-entry config id :origin-request-policy)]
      (. builder originRequestPolicy data))
    (when-let [data (lookup-entry config id :realtime-log-config)]
      (. builder realtimeLogConfig data))
    (when-let [data (lookup-entry config id :response-headers-policy)]
      (. builder responseHeadersPolicy data))
    (when-let [data (lookup-entry config id :smooth-streaming)]
      (. builder smoothStreaming data))
    (when-let [data (lookup-entry config id :trusted-key-groups)]
      (. builder trustedKeyGroups data))
    (when-let [data (viewer-protocol-policy config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (.build builder)))


(defn cache-policy-builder
  "The cache-policy-builder function buildes out new instances of 
CachePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-policy-name` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.CacheCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `defaultTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `enableAcceptEncodingBrotli` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-brotli` |
| `enableAcceptEncodingGzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-gzip` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `maxTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |"
  [stack id config]
  (let [builder (CachePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cache-policy-name)]
      (. builder cachePolicyName data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-brotli)]
      (. builder enableAcceptEncodingBrotli data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-gzip)]
      (. builder enableAcceptEncodingGzip data))
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (.build builder)))


(defn cache-policy-props-builder
  "The cache-policy-props-builder function buildes out new instances of 
CachePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-policy-name` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.CacheCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `defaultTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `enableAcceptEncodingBrotli` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-brotli` |
| `enableAcceptEncodingGzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-gzip` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `maxTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |"
  [stack id config]
  (let [builder (CachePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :cache-policy-name)]
      (. builder cachePolicyName data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-brotli)]
      (. builder enableAcceptEncodingBrotli data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-gzip)]
      (. builder enableAcceptEncodingGzip data))
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (.build builder)))


(defn cfn-cache-policy-builder
  "The cfn-cache-policy-builder function buildes out new instances of 
CfnCachePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-policy-config` |"
  [stack id config]
  (let [builder (CfnCachePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cache-policy-config)]
      (. builder cachePolicyConfig data))
    (.build builder)))


(defn cfn-cache-policy-cache-policy-config-property-builder
  "The cfn-cache-policy-cache-policy-config-property-builder function buildes out new instances of 
CfnCachePolicy$CachePolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `maxTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parametersInCacheKeyAndForwardedToOrigin` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty | [[cdk.support/lookup-entry]] | `:parameters-in-cache-key-and-forwarded-to-origin` |"
  [stack id config]
  (let [builder (CfnCachePolicy$CachePolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters-in-cache-key-and-forwarded-to-origin)]
      (. builder parametersInCacheKeyAndForwardedToOrigin data))
    (.build builder)))


(defn cfn-cache-policy-cookies-config-property-builder
  "The cfn-cache-policy-cookies-config-property-builder function buildes out new instances of 
CfnCachePolicy$CookiesConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `cookies` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies` |"
  [stack id config]
  (let [builder (CfnCachePolicy$CookiesConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :cookies)]
      (. builder cookies data))
    (.build builder)))


(defn cfn-cache-policy-headers-config-property-builder
  "The cfn-cache-policy-headers-config-property-builder function buildes out new instances of 
CfnCachePolicy$HeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |"
  [stack id config]
  (let [builder (CfnCachePolicy$HeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (.build builder)))


(defn cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder
  "The cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder function buildes out new instances of 
CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookiesConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$CookiesConfigProperty | [[cdk.support/lookup-entry]] | `:cookies-config` |
| `enableAcceptEncodingBrotli` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-brotli` |
| `enableAcceptEncodingGzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-gzip` |
| `headersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers-config` |
| `queryStringsConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$QueryStringsConfigProperty | [[cdk.support/lookup-entry]] | `:query-strings-config` |"
  [stack id config]
  (let [builder (CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookies-config)]
      (. builder cookiesConfig data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-brotli)]
      (. builder enableAcceptEncodingBrotli data))
    (when-let [data (lookup-entry config id :enable-accept-encoding-gzip)]
      (. builder enableAcceptEncodingGzip data))
    (when-let [data (lookup-entry config id :headers-config)]
      (. builder headersConfig data))
    (when-let [data (lookup-entry config id :query-strings-config)]
      (. builder queryStringsConfig data))
    (.build builder)))


(defn cfn-cache-policy-props-builder
  "The cfn-cache-policy-props-builder function buildes out new instances of 
CfnCachePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$CachePolicyConfigProperty | [[cdk.support/lookup-entry]] | `:cache-policy-config` |"
  [stack id config]
  (let [builder (CfnCachePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :cache-policy-config)]
      (. builder cachePolicyConfig data))
    (.build builder)))


(defn cfn-cache-policy-query-strings-config-property-builder
  "The cfn-cache-policy-query-strings-config-property-builder function buildes out new instances of 
CfnCachePolicy$QueryStringsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStringBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
| `queryStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings` |"
  [stack id config]
  (let [builder (CfnCachePolicy$QueryStringsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (when-let [data (lookup-entry config id :query-strings)]
      (. builder queryStrings data))
    (.build builder)))


(defn cfn-cloud-front-origin-access-identity-builder
  "The cfn-cloud-front-origin-access-identity-builder function buildes out new instances of 
CfnCloudFrontOriginAccessIdentity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFrontOriginAccessIdentityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-front-origin-access-identity-config` |"
  [stack id config]
  (let [builder (CfnCloudFrontOriginAccessIdentity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cloud-front-origin-access-identity-config)]
      (. builder cloudFrontOriginAccessIdentityConfig data))
    (.build builder)))


(defn cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder
  "The cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder function buildes out new instances of 
CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn cfn-cloud-front-origin-access-identity-props-builder
  "The cfn-cloud-front-origin-access-identity-props-builder function buildes out new instances of 
CfnCloudFrontOriginAccessIdentityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFrontOriginAccessIdentityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-front-origin-access-identity-config` |"
  [stack id config]
  (let [builder (CfnCloudFrontOriginAccessIdentityProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-front-origin-access-identity-config)]
      (. builder cloudFrontOriginAccessIdentityConfig data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-builder
  "The cfn-continuous-deployment-policy-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continuousDeploymentPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-deployment-policy-config` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :continuous-deployment-policy-config)]
      (. builder continuousDeploymentPolicyConfig data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder
  "The cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `singleHeaderPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:single-header-policy-config` |
| `singleWeightPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:single-weight-policy-config` |
| `stagingDistributionDnsNames` | java.util.List | [[cdk.support/lookup-entry]] | `:staging-distribution-dns-names` |
| `trafficConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$TrafficConfigProperty | [[cdk.support/lookup-entry]] | `:traffic-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :single-header-policy-config)]
      (. builder singleHeaderPolicyConfig data))
    (when-let [data (lookup-entry config id :single-weight-policy-config)]
      (. builder singleWeightPolicyConfig data))
    (when-let [data (lookup-entry config id :staging-distribution-dns-names)]
      (. builder stagingDistributionDnsNames data))
    (when-let [data (lookup-entry config id :traffic-config)]
      (. builder trafficConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-props-builder
  "The cfn-continuous-deployment-policy-props-builder function buildes out new instances of 
CfnContinuousDeploymentPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continuousDeploymentPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-deployment-policy-config` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :continuous-deployment-policy-config)]
      (. builder continuousDeploymentPolicyConfig data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-session-stickiness-config-property-builder
  "The cfn-continuous-deployment-policy-session-stickiness-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-ttl` |
| `maximumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ttl` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle-ttl)]
      (. builder idleTtl data))
    (when-let [data (lookup-entry config id :maximum-ttl)]
      (. builder maximumTtl data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-single-header-config-property-builder
  "The cfn-continuous-deployment-policy-single-header-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-single-header-policy-config-property-builder
  "The cfn-continuous-deployment-policy-single-header-policy-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-single-weight-config-property-builder
  "The cfn-continuous-deployment-policy-single-weight-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sessionStickinessConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:session-stickiness-config` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :session-stickiness-config)]
      (. builder sessionStickinessConfig data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-single-weight-policy-config-property-builder
  "The cfn-continuous-deployment-policy-single-weight-policy-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sessionStickinessConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:session-stickiness-config` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :session-stickiness-config)]
      (. builder sessionStickinessConfig data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-continuous-deployment-policy-traffic-config-property-builder
  "The cfn-continuous-deployment-policy-traffic-config-property-builder function buildes out new instances of 
CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `singleHeaderConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty | [[cdk.support/lookup-entry]] | `:single-header-config` |
| `singleWeightConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-weight-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :single-header-config)]
      (. builder singleHeaderConfig data))
    (when-let [data (lookup-entry config id :single-weight-config)]
      (. builder singleWeightConfig data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-distribution-builder
  "The cfn-distribution-builder function buildes out new instances of 
CfnDistribution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$DistributionConfigProperty | [[cdk.support/lookup-entry]] | `:distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistribution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :distribution-config)]
      (. builder distributionConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-cache-behavior-property-builder
  "The cfn-distribution-cache-behavior-property-builder function buildes out new instances of 
CfnDistribution$CacheBehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `cachePolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-policy-id` |
| `cachedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:cached-methods` |
| `compress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compress` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `fieldLevelEncryptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-level-encryption-id` |
| `forwardedValues` | software.amazon.awscdk.services.cloudfront.CfnDistribution$ForwardedValuesProperty | [[cdk.support/lookup-entry]] | `:forwarded-values` |
| `functionAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-associations` |
| `lambdaFunctionAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:lambda-function-associations` |
| `maxTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `originRequestPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-id` |
| `pathPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-pattern` |
| `realtimeLogConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-arn` |
| `responseHeadersPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-id` |
| `smoothStreaming` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:smooth-streaming` |
| `targetOriginId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-origin-id` |
| `trustedKeyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-key-groups` |
| `trustedSigners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-signers` |
| `viewerProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:viewer-protocol-policy` |"
  [stack id config]
  (let [builder (CfnDistribution$CacheBehaviorProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (lookup-entry config id :cache-policy-id)]
      (. builder cachePolicyId data))
    (when-let [data (lookup-entry config id :cached-methods)]
      (. builder cachedMethods data))
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :field-level-encryption-id)]
      (. builder fieldLevelEncryptionId data))
    (when-let [data (lookup-entry config id :forwarded-values)]
      (. builder forwardedValues data))
    (when-let [data (lookup-entry config id :function-associations)]
      (. builder functionAssociations data))
    (when-let [data (lookup-entry config id :lambda-function-associations)]
      (. builder lambdaFunctionAssociations data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :origin-request-policy-id)]
      (. builder originRequestPolicyId data))
    (when-let [data (lookup-entry config id :path-pattern)]
      (. builder pathPattern data))
    (when-let [data (lookup-entry config id :realtime-log-config-arn)]
      (. builder realtimeLogConfigArn data))
    (when-let [data (lookup-entry config id :response-headers-policy-id)]
      (. builder responseHeadersPolicyId data))
    (when-let [data (lookup-entry config id :smooth-streaming)]
      (. builder smoothStreaming data))
    (when-let [data (lookup-entry config id :target-origin-id)]
      (. builder targetOriginId data))
    (when-let [data (lookup-entry config id :trusted-key-groups)]
      (. builder trustedKeyGroups data))
    (when-let [data (lookup-entry config id :trusted-signers)]
      (. builder trustedSigners data))
    (when-let [data (lookup-entry config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (.build builder)))


(defn cfn-distribution-cookies-property-builder
  "The cfn-distribution-cookies-property-builder function buildes out new instances of 
CfnDistribution$CookiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forward` | java.lang.String | [[cdk.support/lookup-entry]] | `:forward` |
| `whitelistedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelisted-names` |"
  [stack id config]
  (let [builder (CfnDistribution$CookiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :forward)]
      (. builder forward data))
    (when-let [data (lookup-entry config id :whitelisted-names)]
      (. builder whitelistedNames data))
    (.build builder)))


(defn cfn-distribution-custom-error-response-property-builder
  "The cfn-distribution-custom-error-response-property-builder function buildes out new instances of 
CfnDistribution$CustomErrorResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorCachingMinTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-caching-min-ttl` |
| `errorCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-code` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responsePagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-page-path` |"
  [stack id config]
  (let [builder (CfnDistribution$CustomErrorResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :error-caching-min-ttl)]
      (. builder errorCachingMinTtl data))
    (when-let [data (lookup-entry config id :error-code)]
      (. builder errorCode data))
    (when-let [data (lookup-entry config id :response-code)]
      (. builder responseCode data))
    (when-let [data (lookup-entry config id :response-page-path)]
      (. builder responsePagePath data))
    (.build builder)))


(defn cfn-distribution-custom-origin-config-property-builder
  "The cfn-distribution-custom-origin-config-property-builder function buildes out new instances of 
CfnDistribution$CustomOriginConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `originKeepaliveTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:origin-keepalive-timeout` |
| `originProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-protocol-policy` |
| `originReadTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:origin-read-timeout` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |"
  [stack id config]
  (let [builder (CfnDistribution$CustomOriginConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :origin-keepalive-timeout)]
      (. builder originKeepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-protocol-policy)]
      (. builder originProtocolPolicy data))
    (when-let [data (lookup-entry config id :origin-read-timeout)]
      (. builder originReadTimeout data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (.build builder)))


(defn cfn-distribution-default-cache-behavior-property-builder
  "The cfn-distribution-default-cache-behavior-property-builder function buildes out new instances of 
CfnDistribution$DefaultCacheBehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `cachePolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:cache-policy-id` |
| `cachedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:cached-methods` |
| `compress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compress` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `fieldLevelEncryptionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:field-level-encryption-id` |
| `forwardedValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-values` |
| `functionAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-associations` |
| `lambdaFunctionAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-function-associations` |
| `maxTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `originRequestPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-id` |
| `realtimeLogConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-arn` |
| `responseHeadersPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-id` |
| `smoothStreaming` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:smooth-streaming` |
| `targetOriginId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-origin-id` |
| `trustedKeyGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-key-groups` |
| `trustedSigners` | java.util.List | [[cdk.support/lookup-entry]] | `:trusted-signers` |
| `viewerProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:viewer-protocol-policy` |"
  [stack id config]
  (let [builder (CfnDistribution$DefaultCacheBehaviorProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (lookup-entry config id :cache-policy-id)]
      (. builder cachePolicyId data))
    (when-let [data (lookup-entry config id :cached-methods)]
      (. builder cachedMethods data))
    (when-let [data (lookup-entry config id :compress)]
      (. builder compress data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :field-level-encryption-id)]
      (. builder fieldLevelEncryptionId data))
    (when-let [data (lookup-entry config id :forwarded-values)]
      (. builder forwardedValues data))
    (when-let [data (lookup-entry config id :function-associations)]
      (. builder functionAssociations data))
    (when-let [data (lookup-entry config id :lambda-function-associations)]
      (. builder lambdaFunctionAssociations data))
    (when-let [data (lookup-entry config id :max-ttl)]
      (. builder maxTtl data))
    (when-let [data (lookup-entry config id :min-ttl)]
      (. builder minTtl data))
    (when-let [data (lookup-entry config id :origin-request-policy-id)]
      (. builder originRequestPolicyId data))
    (when-let [data (lookup-entry config id :realtime-log-config-arn)]
      (. builder realtimeLogConfigArn data))
    (when-let [data (lookup-entry config id :response-headers-policy-id)]
      (. builder responseHeadersPolicyId data))
    (when-let [data (lookup-entry config id :smooth-streaming)]
      (. builder smoothStreaming data))
    (when-let [data (lookup-entry config id :target-origin-id)]
      (. builder targetOriginId data))
    (when-let [data (lookup-entry config id :trusted-key-groups)]
      (. builder trustedKeyGroups data))
    (when-let [data (lookup-entry config id :trusted-signers)]
      (. builder trustedSigners data))
    (when-let [data (lookup-entry config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (.build builder)))


(defn cfn-distribution-distribution-config-property-builder
  "The cfn-distribution-distribution-config-property-builder function buildes out new instances of 
CfnDistribution$DistributionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `cacheBehaviors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-behaviors` |
| `cnamEs` | java.util.List | [[cdk.support/lookup-entry]] | `:cnam-es` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `continuousDeploymentPolicyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:continuous-deployment-policy-id` |
| `customErrorResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-error-responses` |
| `customOrigin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-origin` |
| `defaultCacheBehavior` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-cache-behavior` |
| `defaultRootObject` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-object` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `httpVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-version` |
| `ipv6Enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-enabled` |
| `logging` | software.amazon.awscdk.services.cloudfront.CfnDistribution$LoggingProperty | [[cdk.support/lookup-entry]] | `:logging` |
| `originGroups` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginGroupsProperty | [[cdk.support/lookup-entry]] | `:origin-groups` |
| `origins` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origins` |
| `priceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:price-class` |
| `restrictions` | software.amazon.awscdk.services.cloudfront.CfnDistribution$RestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
| `s3Origin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-origin` |
| `staging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:staging` |
| `viewerCertificate` | software.amazon.awscdk.services.cloudfront.CfnDistribution$ViewerCertificateProperty | [[cdk.support/lookup-entry]] | `:viewer-certificate` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |"
  [stack id config]
  (let [builder (CfnDistribution$DistributionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aliases)]
      (. builder aliases data))
    (when-let [data (lookup-entry config id :cache-behaviors)]
      (. builder cacheBehaviors data))
    (when-let [data (lookup-entry config id :cnam-es)]
      (. builder cnamEs data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :continuous-deployment-policy-id)]
      (. builder continuousDeploymentPolicyId data))
    (when-let [data (lookup-entry config id :custom-error-responses)]
      (. builder customErrorResponses data))
    (when-let [data (lookup-entry config id :custom-origin)]
      (. builder customOrigin data))
    (when-let [data (lookup-entry config id :default-cache-behavior)]
      (. builder defaultCacheBehavior data))
    (when-let [data (lookup-entry config id :default-root-object)]
      (. builder defaultRootObject data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :http-version)]
      (. builder httpVersion data))
    (when-let [data (lookup-entry config id :ipv6-enabled)]
      (. builder ipv6Enabled data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :origin-groups)]
      (. builder originGroups data))
    (when-let [data (lookup-entry config id :origins)]
      (. builder origins data))
    (when-let [data (lookup-entry config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :restrictions)]
      (. builder restrictions data))
    (when-let [data (lookup-entry config id :s3-origin)]
      (. builder s3Origin data))
    (when-let [data (lookup-entry config id :staging)]
      (. builder staging data))
    (when-let [data (lookup-entry config id :viewer-certificate)]
      (. builder viewerCertificate data))
    (when-let [data (lookup-entry config id :web-acl-id)]
      (. builder webAclId data))
    (.build builder)))


(defn cfn-distribution-forwarded-values-property-builder
  "The cfn-distribution-forwarded-values-property-builder function buildes out new instances of 
CfnDistribution$ForwardedValuesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookies` | software.amazon.awscdk.services.cloudfront.CfnDistribution$CookiesProperty | [[cdk.support/lookup-entry]] | `:cookies` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `queryString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string` |
| `queryStringCacheKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:query-string-cache-keys` |"
  [stack id config]
  (let [builder (CfnDistribution$ForwardedValuesProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookies)]
      (. builder cookies data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :query-string)]
      (. builder queryString data))
    (when-let [data (lookup-entry config id :query-string-cache-keys)]
      (. builder queryStringCacheKeys data))
    (.build builder)))


(defn cfn-distribution-function-association-property-builder
  "The cfn-distribution-function-association-property-builder function buildes out new instances of 
CfnDistribution$FunctionAssociationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |"
  [stack id config]
  (let [builder (CfnDistribution$FunctionAssociationProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (.build builder)))


(defn cfn-distribution-geo-restriction-property-builder
  "The cfn-distribution-geo-restriction-property-builder function buildes out new instances of 
CfnDistribution$GeoRestrictionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `restrictionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restriction-type` |"
  [stack id config]
  (let [builder (CfnDistribution$GeoRestrictionProperty$Builder.)]
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :restriction-type)]
      (. builder restrictionType data))
    (.build builder)))


(defn cfn-distribution-lambda-function-association-property-builder
  "The cfn-distribution-lambda-function-association-property-builder function buildes out new instances of 
CfnDistribution$LambdaFunctionAssociationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `includeBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-body` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |"
  [stack id config]
  (let [builder (CfnDistribution$LambdaFunctionAssociationProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :include-body)]
      (. builder includeBody data))
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (.build builder)))


(defn cfn-distribution-legacy-custom-origin-property-builder
  "The cfn-distribution-legacy-custom-origin-property-builder function buildes out new instances of 
CfnDistribution$LegacyCustomOriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `originProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-protocol-policy` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |"
  [stack id config]
  (let [builder (CfnDistribution$LegacyCustomOriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :origin-protocol-policy)]
      (. builder originProtocolPolicy data))
    (when-let [data (lookup-entry config id :origin-ssl-protocols)]
      (. builder originSslProtocols data))
    (.build builder)))


(defn cfn-distribution-legacy-s3-origin-property-builder
  "The cfn-distribution-legacy-s3-origin-property-builder function buildes out new instances of 
CfnDistribution$LegacyS3OriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |"
  [stack id config]
  (let [builder (CfnDistribution$LegacyS3OriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (.build builder)))


(defn cfn-distribution-logging-property-builder
  "The cfn-distribution-logging-property-builder function buildes out new instances of 
CfnDistribution$LoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `includeCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-cookies` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnDistribution$LoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :include-cookies)]
      (. builder includeCookies data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-distribution-origin-custom-header-property-builder
  "The cfn-distribution-origin-custom-header-property-builder function buildes out new instances of 
CfnDistribution$OriginCustomHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginCustomHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :header-value)]
      (. builder headerValue data))
    (.build builder)))


(defn cfn-distribution-origin-group-failover-criteria-property-builder
  "The cfn-distribution-origin-group-failover-criteria-property-builder function buildes out new instances of 
CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:status-codes` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :status-codes)]
      (. builder statusCodes data))
    (.build builder)))


(defn cfn-distribution-origin-group-member-property-builder
  "The cfn-distribution-origin-group-member-property-builder function buildes out new instances of 
CfnDistribution$OriginGroupMemberProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginGroupMemberProperty$Builder.)]
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (.build builder)))


(defn cfn-distribution-origin-group-members-property-builder
  "The cfn-distribution-origin-group-members-property-builder function buildes out new instances of 
CfnDistribution$OriginGroupMembersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginGroupMembersProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :quantity)]
      (. builder quantity data))
    (.build builder)))


(defn cfn-distribution-origin-group-property-builder
  "The cfn-distribution-origin-group-property-builder function buildes out new instances of 
CfnDistribution$OriginGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverCriteria` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginGroupFailoverCriteriaProperty | [[cdk.support/lookup-entry]] | `:failover-criteria` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `members` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginGroupMembersProperty | [[cdk.support/lookup-entry]] | `:members` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :failover-criteria)]
      (. builder failoverCriteria data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :members)]
      (. builder members data))
    (.build builder)))


(defn cfn-distribution-origin-groups-property-builder
  "The cfn-distribution-origin-groups-property-builder function buildes out new instances of 
CfnDistribution$OriginGroupsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginGroupsProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :quantity)]
      (. builder quantity data))
    (.build builder)))


(defn cfn-distribution-origin-property-builder
  "The cfn-distribution-origin-property-builder function buildes out new instances of 
CfnDistribution$OriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customOriginConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$CustomOriginConfigProperty | [[cdk.support/lookup-entry]] | `:custom-origin-config` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `originAccessControlId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-control-id` |
| `originCustomHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origin-custom-headers` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShield` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origin-shield` |
| `s3OriginConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$S3OriginConfigProperty | [[cdk.support/lookup-entry]] | `:s3-origin-config` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-origin-config)]
      (. builder customOriginConfig data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :origin-access-control-id)]
      (. builder originAccessControlId data))
    (when-let [data (lookup-entry config id :origin-custom-headers)]
      (. builder originCustomHeaders data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield)]
      (. builder originShield data))
    (when-let [data (lookup-entry config id :s3-origin-config)]
      (. builder s3OriginConfig data))
    (.build builder)))


(defn cfn-distribution-origin-shield-property-builder
  "The cfn-distribution-origin-shield-property-builder function buildes out new instances of 
CfnDistribution$OriginShieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config]
  (let [builder (CfnDistribution$OriginShieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))


(defn cfn-distribution-props-builder
  "The cfn-distribution-props-builder function buildes out new instances of 
CfnDistributionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$DistributionConfigProperty | [[cdk.support/lookup-entry]] | `:distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistributionProps$Builder.)]
    (when-let [data (lookup-entry config id :distribution-config)]
      (. builder distributionConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-restrictions-property-builder
  "The cfn-distribution-restrictions-property-builder function buildes out new instances of 
CfnDistribution$RestrictionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `geoRestriction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-restriction` |"
  [stack id config]
  (let [builder (CfnDistribution$RestrictionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :geo-restriction)]
      (. builder geoRestriction data))
    (.build builder)))


(defn cfn-distribution-s3-origin-config-property-builder
  "The cfn-distribution-s3-origin-config-property-builder function buildes out new instances of 
CfnDistribution$S3OriginConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |"
  [stack id config]
  (let [builder (CfnDistribution$S3OriginConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (.build builder)))


(defn cfn-distribution-status-codes-property-builder
  "The cfn-distribution-status-codes-property-builder function buildes out new instances of 
CfnDistribution$StatusCodesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |"
  [stack id config]
  (let [builder (CfnDistribution$StatusCodesProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :quantity)]
      (. builder quantity data))
    (.build builder)))


(defn cfn-distribution-viewer-certificate-property-builder
  "The cfn-distribution-viewer-certificate-property-builder function buildes out new instances of 
CfnDistribution$ViewerCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acmCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:acm-certificate-arn` |
| `cloudFrontDefaultCertificate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-front-default-certificate` |
| `iamCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-certificate-id` |
| `minimumProtocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:minimum-protocol-version` |
| `sslSupportMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-support-method` |"
  [stack id config]
  (let [builder (CfnDistribution$ViewerCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :acm-certificate-arn)]
      (. builder acmCertificateArn data))
    (when-let [data (lookup-entry config id :cloud-front-default-certificate)]
      (. builder cloudFrontDefaultCertificate data))
    (when-let [data (lookup-entry config id :iam-certificate-id)]
      (. builder iamCertificateId data))
    (when-let [data (lookup-entry config id :minimum-protocol-version)]
      (. builder minimumProtocolVersion data))
    (when-let [data (lookup-entry config id :ssl-support-method)]
      (. builder sslSupportMethod data))
    (.build builder)))


(defn cfn-function-builder
  "The cfn-function-builder function buildes out new instances of 
CfnFunction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `functionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-code` |
| `functionConfig` | software.amazon.awscdk.services.cloudfront.CfnFunction$FunctionConfigProperty | [[cdk.support/lookup-entry]] | `:function-config` |
| `functionMetadata` | software.amazon.awscdk.services.cloudfront.CfnFunction$FunctionMetadataProperty | [[cdk.support/lookup-entry]] | `:function-metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFunction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-publish)]
      (. builder autoPublish data))
    (when-let [data (lookup-entry config id :function-code)]
      (. builder functionCode data))
    (when-let [data (lookup-entry config id :function-config)]
      (. builder functionConfig data))
    (when-let [data (lookup-entry config id :function-metadata)]
      (. builder functionMetadata data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-function-function-config-property-builder
  "The cfn-function-function-config-property-builder function buildes out new instances of 
CfnFunction$FunctionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-value-store-associations` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (CfnFunction$FunctionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :key-value-store-associations)]
      (. builder keyValueStoreAssociations data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn cfn-function-function-metadata-property-builder
  "The cfn-function-function-metadata-property-builder function buildes out new instances of 
CfnFunction$FunctionMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |"
  [stack id config]
  (let [builder (CfnFunction$FunctionMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (.build builder)))


(defn cfn-function-key-value-store-association-property-builder
  "The cfn-function-key-value-store-association-property-builder function buildes out new instances of 
CfnFunction$KeyValueStoreAssociationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyValueStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-arn` |"
  [stack id config]
  (let [builder (CfnFunction$KeyValueStoreAssociationProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-value-store-arn)]
      (. builder keyValueStoreArn data))
    (.build builder)))


(defn cfn-function-props-builder
  "The cfn-function-props-builder function buildes out new instances of 
CfnFunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `functionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-code` |
| `functionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-config` |
| `functionMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-publish)]
      (. builder autoPublish data))
    (when-let [data (lookup-entry config id :function-code)]
      (. builder functionCode data))
    (when-let [data (lookup-entry config id :function-config)]
      (. builder functionConfig data))
    (when-let [data (lookup-entry config id :function-metadata)]
      (. builder functionMetadata data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-key-group-builder
  "The cfn-key-group-builder function buildes out new instances of 
CfnKeyGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyGroupConfig` | software.amazon.awscdk.services.cloudfront.CfnKeyGroup$KeyGroupConfigProperty | [[cdk.support/lookup-entry]] | `:key-group-config` |"
  [stack id config]
  (let [builder (CfnKeyGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :key-group-config)]
      (. builder keyGroupConfig data))
    (.build builder)))


(defn cfn-key-group-key-group-config-property-builder
  "The cfn-key-group-key-group-config-property-builder function buildes out new instances of 
CfnKeyGroup$KeyGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnKeyGroup$KeyGroupConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-key-group-props-builder
  "The cfn-key-group-props-builder function buildes out new instances of 
CfnKeyGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyGroupConfig` | software.amazon.awscdk.services.cloudfront.CfnKeyGroup$KeyGroupConfigProperty | [[cdk.support/lookup-entry]] | `:key-group-config` |"
  [stack id config]
  (let [builder (CfnKeyGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :key-group-config)]
      (. builder keyGroupConfig data))
    (.build builder)))


(defn cfn-key-value-store-builder
  "The cfn-key-value-store-builder function buildes out new instances of 
CfnKeyValueStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `importSource` | software.amazon.awscdk.services.cloudfront.CfnKeyValueStore$ImportSourceProperty | [[cdk.support/lookup-entry]] | `:import-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnKeyValueStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :import-source)]
      (. builder importSource data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-key-value-store-import-source-property-builder
  "The cfn-key-value-store-import-source-property-builder function buildes out new instances of 
CfnKeyValueStore$ImportSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |"
  [stack id config]
  (let [builder (CfnKeyValueStore$ImportSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (.build builder)))


(defn cfn-key-value-store-props-builder
  "The cfn-key-value-store-props-builder function buildes out new instances of 
CfnKeyValueStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `importSource` | software.amazon.awscdk.services.cloudfront.CfnKeyValueStore$ImportSourceProperty | [[cdk.support/lookup-entry]] | `:import-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnKeyValueStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :import-source)]
      (. builder importSource data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-monitoring-subscription-builder
  "The cfn-monitoring-subscription-builder function buildes out new instances of 
CfnMonitoringSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `monitoringSubscription` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-subscription` |"
  [stack id config]
  (let [builder (CfnMonitoringSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :distribution-id)]
      (. builder distributionId data))
    (when-let [data (lookup-entry config id :monitoring-subscription)]
      (. builder monitoringSubscription data))
    (.build builder)))


(defn cfn-monitoring-subscription-monitoring-subscription-property-builder
  "The cfn-monitoring-subscription-monitoring-subscription-property-builder function buildes out new instances of 
CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `realtimeMetricsSubscriptionConfig` | software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty | [[cdk.support/lookup-entry]] | `:realtime-metrics-subscription-config` |"
  [stack id config]
  (let [builder (CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :realtime-metrics-subscription-config)]
      (. builder realtimeMetricsSubscriptionConfig data))
    (.build builder)))


(defn cfn-monitoring-subscription-props-builder
  "The cfn-monitoring-subscription-props-builder function buildes out new instances of 
CfnMonitoringSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `monitoringSubscription` | software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription$MonitoringSubscriptionProperty | [[cdk.support/lookup-entry]] | `:monitoring-subscription` |"
  [stack id config]
  (let [builder (CfnMonitoringSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :distribution-id)]
      (. builder distributionId data))
    (when-let [data (lookup-entry config id :monitoring-subscription)]
      (. builder monitoringSubscription data))
    (.build builder)))


(defn cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder
  "The cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder function buildes out new instances of 
CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `realtimeMetricsSubscriptionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-metrics-subscription-status` |"
  [stack id config]
  (let [builder (CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :realtime-metrics-subscription-status)]
      (. builder realtimeMetricsSubscriptionStatus data))
    (.build builder)))


(defn cfn-origin-access-control-builder
  "The cfn-origin-access-control-builder function buildes out new instances of 
CfnOriginAccessControl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessControlConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl$OriginAccessControlConfigProperty | [[cdk.support/lookup-entry]] | `:origin-access-control-config` |"
  [stack id config]
  (let [builder (CfnOriginAccessControl$Builder/create stack id)]
    (when-let [data (lookup-entry config id :origin-access-control-config)]
      (. builder originAccessControlConfig data))
    (.build builder)))


(defn cfn-origin-access-control-origin-access-control-config-property-builder
  "The cfn-origin-access-control-origin-access-control-config-property-builder function buildes out new instances of 
CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `originAccessControlOriginType` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-control-origin-type` |
| `signingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-behavior` |
| `signingProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-protocol` |"
  [stack id config]
  (let [builder (CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :origin-access-control-origin-type)]
      (. builder originAccessControlOriginType data))
    (when-let [data (lookup-entry config id :signing-behavior)]
      (. builder signingBehavior data))
    (when-let [data (lookup-entry config id :signing-protocol)]
      (. builder signingProtocol data))
    (.build builder)))


(defn cfn-origin-access-control-props-builder
  "The cfn-origin-access-control-props-builder function buildes out new instances of 
CfnOriginAccessControlProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessControlConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl$OriginAccessControlConfigProperty | [[cdk.support/lookup-entry]] | `:origin-access-control-config` |"
  [stack id config]
  (let [builder (CfnOriginAccessControlProps$Builder.)]
    (when-let [data (lookup-entry config id :origin-access-control-config)]
      (. builder originAccessControlConfig data))
    (.build builder)))


(defn cfn-origin-request-policy-builder
  "The cfn-origin-request-policy-builder function buildes out new instances of 
CfnOriginRequestPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originRequestPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:origin-request-policy-config` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :origin-request-policy-config)]
      (. builder originRequestPolicyConfig data))
    (.build builder)))


(defn cfn-origin-request-policy-cookies-config-property-builder
  "The cfn-origin-request-policy-cookies-config-property-builder function buildes out new instances of 
CfnOriginRequestPolicy$CookiesConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `cookies` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicy$CookiesConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :cookies)]
      (. builder cookies data))
    (.build builder)))


(defn cfn-origin-request-policy-headers-config-property-builder
  "The cfn-origin-request-policy-headers-config-property-builder function buildes out new instances of 
CfnOriginRequestPolicy$HeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicy$HeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (.build builder)))


(defn cfn-origin-request-policy-origin-request-policy-config-property-builder
  "The cfn-origin-request-policy-origin-request-policy-config-property-builder function buildes out new instances of 
CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookiesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookies-config` |
| `headersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryStringsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-strings-config` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cookies-config)]
      (. builder cookiesConfig data))
    (when-let [data (lookup-entry config id :headers-config)]
      (. builder headersConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :query-strings-config)]
      (. builder queryStringsConfig data))
    (.build builder)))


(defn cfn-origin-request-policy-props-builder
  "The cfn-origin-request-policy-props-builder function buildes out new instances of 
CfnOriginRequestPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originRequestPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:origin-request-policy-config` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :origin-request-policy-config)]
      (. builder originRequestPolicyConfig data))
    (.build builder)))


(defn cfn-origin-request-policy-query-strings-config-property-builder
  "The cfn-origin-request-policy-query-strings-config-property-builder function buildes out new instances of 
CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStringBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
| `queryStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings` |"
  [stack id config]
  (let [builder (CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (when-let [data (lookup-entry config id :query-strings)]
      (. builder queryStrings data))
    (.build builder)))


(defn cfn-public-key-builder
  "The cfn-public-key-builder function buildes out new instances of 
CfnPublicKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicKeyConfig` | software.amazon.awscdk.services.cloudfront.CfnPublicKey$PublicKeyConfigProperty | [[cdk.support/lookup-entry]] | `:public-key-config` |"
  [stack id config]
  (let [builder (CfnPublicKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :public-key-config)]
      (. builder publicKeyConfig data))
    (.build builder)))


(defn cfn-public-key-props-builder
  "The cfn-public-key-props-builder function buildes out new instances of 
CfnPublicKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicKeyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-key-config` |"
  [stack id config]
  (let [builder (CfnPublicKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :public-key-config)]
      (. builder publicKeyConfig data))
    (.build builder)))


(defn cfn-public-key-public-key-config-property-builder
  "The cfn-public-key-public-key-config-property-builder function buildes out new instances of 
CfnPublicKey$PublicKeyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `callerReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:caller-reference` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnPublicKey$PublicKeyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :caller-reference)]
      (. builder callerReference data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :encoded-key)]
      (. builder encodedKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-realtime-log-config-builder
  "The cfn-realtime-log-config-builder function buildes out new instances of 
CfnRealtimeLogConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |"
  [stack id config]
  (let [builder (CfnRealtimeLogConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :end-points)]
      (. builder endPoints data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sampling-rate)]
      (. builder samplingRate data))
    (.build builder)))


(defn cfn-realtime-log-config-end-point-property-builder
  "The cfn-realtime-log-config-end-point-property-builder function buildes out new instances of 
CfnRealtimeLogConfig$EndPointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `streamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-type` |"
  [stack id config]
  (let [builder (CfnRealtimeLogConfig$EndPointProperty$Builder.)]
    (when-let [data (lookup-entry config id :kinesis-stream-config)]
      (. builder kinesisStreamConfig data))
    (when-let [data (lookup-entry config id :stream-type)]
      (. builder streamType data))
    (.build builder)))


(defn cfn-realtime-log-config-kinesis-stream-config-property-builder
  "The cfn-realtime-log-config-kinesis-stream-config-property-builder function buildes out new instances of 
CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-realtime-log-config-props-builder
  "The cfn-realtime-log-config-props-builder function buildes out new instances of 
CfnRealtimeLogConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |"
  [stack id config]
  (let [builder (CfnRealtimeLogConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :end-points)]
      (. builder endPoints data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sampling-rate)]
      (. builder samplingRate data))
    (.build builder)))


(defn cfn-response-headers-policy-access-control-allow-headers-property-builder
  "The cfn-response-headers-policy-access-control-allow-headers-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-access-control-allow-methods-property-builder
  "The cfn-response-headers-policy-access-control-allow-methods-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-access-control-allow-origins-property-builder
  "The cfn-response-headers-policy-access-control-allow-origins-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-access-control-expose-headers-property-builder
  "The cfn-response-headers-policy-access-control-expose-headers-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-builder
  "The cfn-response-headers-policy-builder function buildes out new instances of 
CfnResponseHeadersPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeadersPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers-policy-config` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :response-headers-policy-config)]
      (. builder responseHeadersPolicyConfig data))
    (.build builder)))


(defn cfn-response-headers-policy-content-security-policy-property-builder
  "The cfn-response-headers-policy-content-security-policy-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-security-policy)]
      (. builder contentSecurityPolicy data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn cfn-response-headers-policy-content-type-options-property-builder
  "The cfn-response-headers-policy-content-type-options-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn cfn-response-headers-policy-cors-config-property-builder
  "The cfn-response-headers-policy-cors-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$CorsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAllowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-allow-credentials` |
| `accessControlAllowHeaders` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty | [[cdk.support/lookup-entry]] | `:access-control-allow-headers` |
| `accessControlAllowMethods` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty | [[cdk.support/lookup-entry]] | `:access-control-allow-methods` |
| `accessControlAllowOrigins` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-allow-origins` |
| `accessControlExposeHeaders` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty | [[cdk.support/lookup-entry]] | `:access-control-expose-headers` |
| `accessControlMaxAgeSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-control-max-age-sec` |
| `originOverride` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origin-override` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$CorsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-control-allow-credentials)]
      (. builder accessControlAllowCredentials data))
    (when-let [data (lookup-entry config id :access-control-allow-headers)]
      (. builder accessControlAllowHeaders data))
    (when-let [data (lookup-entry config id :access-control-allow-methods)]
      (. builder accessControlAllowMethods data))
    (when-let [data (lookup-entry config id :access-control-allow-origins)]
      (. builder accessControlAllowOrigins data))
    (when-let [data (lookup-entry config id :access-control-expose-headers)]
      (. builder accessControlExposeHeaders data))
    (when-let [data (lookup-entry config id :access-control-max-age-sec)]
      (. builder accessControlMaxAgeSec data))
    (when-let [data (lookup-entry config id :origin-override)]
      (. builder originOverride data))
    (.build builder)))


(defn cfn-response-headers-policy-custom-header-property-builder
  "The cfn-response-headers-policy-custom-header-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$CustomHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$CustomHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-response-headers-policy-custom-headers-config-property-builder
  "The cfn-response-headers-policy-custom-headers-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-frame-options-property-builder
  "The cfn-response-headers-policy-frame-options-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$FrameOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:frame-option` |
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$FrameOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :frame-option)]
      (. builder frameOption data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn cfn-response-headers-policy-props-builder
  "The cfn-response-headers-policy-props-builder function buildes out new instances of 
CfnResponseHeadersPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeadersPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:response-headers-policy-config` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :response-headers-policy-config)]
      (. builder responseHeadersPolicyConfig data))
    (.build builder)))


(defn cfn-response-headers-policy-referrer-policy-property-builder
  "The cfn-response-headers-policy-referrer-policy-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |
| `referrerPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:referrer-policy` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :referrer-policy)]
      (. builder referrerPolicy data))
    (.build builder)))


(defn cfn-response-headers-policy-remove-header-property-builder
  "The cfn-response-headers-policy-remove-header-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (.build builder)))


(defn cfn-response-headers-policy-remove-headers-config-property-builder
  "The cfn-response-headers-policy-remove-headers-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (.build builder)))


(defn cfn-response-headers-policy-response-headers-policy-config-property-builder
  "The cfn-response-headers-policy-response-headers-policy-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$CorsConfigProperty | [[cdk.support/lookup-entry]] | `:cors-config` |
| `customHeadersConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$CustomHeadersConfigProperty | [[cdk.support/lookup-entry]] | `:custom-headers-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `removeHeadersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-headers-config` |
| `securityHeadersConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$SecurityHeadersConfigProperty | [[cdk.support/lookup-entry]] | `:security-headers-config` |
| `serverTimingHeadersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-timing-headers-config` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cors-config)]
      (. builder corsConfig data))
    (when-let [data (lookup-entry config id :custom-headers-config)]
      (. builder customHeadersConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :remove-headers-config)]
      (. builder removeHeadersConfig data))
    (when-let [data (lookup-entry config id :security-headers-config)]
      (. builder securityHeadersConfig data))
    (when-let [data (lookup-entry config id :server-timing-headers-config)]
      (. builder serverTimingHeadersConfig data))
    (.build builder)))


(defn cfn-response-headers-policy-security-headers-config-property-builder
  "The cfn-response-headers-policy-security-headers-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$ContentSecurityPolicyProperty | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `contentTypeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-type-options` |
| `frameOptions` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$FrameOptionsProperty | [[cdk.support/lookup-entry]] | `:frame-options` |
| `referrerPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:referrer-policy` |
| `strictTransportSecurity` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$StrictTransportSecurityProperty | [[cdk.support/lookup-entry]] | `:strict-transport-security` |
| `xssProtection` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$XSSProtectionProperty | [[cdk.support/lookup-entry]] | `:xss-protection` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :content-security-policy)]
      (. builder contentSecurityPolicy data))
    (when-let [data (lookup-entry config id :content-type-options)]
      (. builder contentTypeOptions data))
    (when-let [data (lookup-entry config id :frame-options)]
      (. builder frameOptions data))
    (when-let [data (lookup-entry config id :referrer-policy)]
      (. builder referrerPolicy data))
    (when-let [data (lookup-entry config id :strict-transport-security)]
      (. builder strictTransportSecurity data))
    (when-let [data (lookup-entry config id :xss-protection)]
      (. builder xssProtection data))
    (.build builder)))


(defn cfn-response-headers-policy-server-timing-headers-config-property-builder
  "The cfn-response-headers-policy-server-timing-headers-config-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :sampling-rate)]
      (. builder samplingRate data))
    (.build builder)))


(defn cfn-response-headers-policy-strict-transport-security-property-builder
  "The cfn-response-headers-policy-strict-transport-security-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlMaxAgeSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-control-max-age-sec` |
| `includeSubdomains` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-subdomains` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `preload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preload` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-control-max-age-sec)]
      (. builder accessControlMaxAgeSec data))
    (when-let [data (lookup-entry config id :include-subdomains)]
      (. builder includeSubdomains data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :preload)]
      (. builder preload data))
    (.build builder)))


(defn cfn-response-headers-policy-xss-protection-property-builder
  "The cfn-response-headers-policy-xss-protection-property-builder function buildes out new instances of 
CfnResponseHeadersPolicy$XSSProtectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modeBlock` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mode-block` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `protection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protection` |
| `reportUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-uri` |"
  [stack id config]
  (let [builder (CfnResponseHeadersPolicy$XSSProtectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode-block)]
      (. builder modeBlock data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :protection)]
      (. builder protection data))
    (when-let [data (lookup-entry config id :report-uri)]
      (. builder reportUri data))
    (.build builder)))


(defn cfn-streaming-distribution-builder
  "The cfn-streaming-distribution-builder function buildes out new instances of 
CfnStreamingDistribution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamingDistributionConfig` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$StreamingDistributionConfigProperty | [[cdk.support/lookup-entry]] | `:streaming-distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamingDistribution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :streaming-distribution-config)]
      (. builder streamingDistributionConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-streaming-distribution-logging-property-builder
  "The cfn-streaming-distribution-logging-property-builder function buildes out new instances of 
CfnStreamingDistribution$LoggingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnStreamingDistribution$LoggingProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-streaming-distribution-props-builder
  "The cfn-streaming-distribution-props-builder function buildes out new instances of 
CfnStreamingDistributionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamingDistributionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:streaming-distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamingDistributionProps$Builder.)]
    (when-let [data (lookup-entry config id :streaming-distribution-config)]
      (. builder streamingDistributionConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-streaming-distribution-s3-origin-property-builder
  "The cfn-streaming-distribution-s3-origin-property-builder function buildes out new instances of 
CfnStreamingDistribution$S3OriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |"
  [stack id config]
  (let [builder (CfnStreamingDistribution$S3OriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (.build builder)))


(defn cfn-streaming-distribution-streaming-distribution-config-property-builder
  "The cfn-streaming-distribution-streaming-distribution-config-property-builder function buildes out new instances of 
CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logging` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$LoggingProperty | [[cdk.support/lookup-entry]] | `:logging` |
| `priceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:price-class` |
| `s3Origin` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$S3OriginProperty | [[cdk.support/lookup-entry]] | `:s3-origin` |
| `trustedSigners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trusted-signers` |"
  [stack id config]
  (let [builder (CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :aliases)]
      (. builder aliases data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :s3-origin)]
      (. builder s3Origin data))
    (when-let [data (lookup-entry config id :trusted-signers)]
      (. builder trustedSigners data))
    (.build builder)))


(defn cfn-streaming-distribution-trusted-signers-property-builder
  "The cfn-streaming-distribution-trusted-signers-property-builder function buildes out new instances of 
CfnStreamingDistribution$TrustedSignersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountNumbers` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-numbers` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnStreamingDistribution$TrustedSignersProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-account-numbers)]
      (. builder awsAccountNumbers data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cloud-front-web-distribution-attributes-builder
  "The cloud-front-web-distribution-attributes-builder function buildes out new instances of 
CloudFrontWebDistributionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (CloudFrontWebDistributionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :distribution-id)]
      (. builder distributionId data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn cloud-front-web-distribution-builder
  "The cloud-front-web-distribution-builder function buildes out new instances of 
CloudFrontWebDistribution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultRootObject` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-object` |
| `enableIpV6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ip-v6` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `errorConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:error-configurations` |
| `geoRestriction` | software.amazon.awscdk.services.cloudfront.GeoRestriction | [[cdk.support/lookup-entry]] | `:geo-restriction` |
| `httpVersion` | software.amazon.awscdk.services.cloudfront.HttpVersion | [[cdk.api.services.cloudfront/http-version]] | `:http-version` |
| `loggingConfig` | software.amazon.awscdk.services.cloudfront.LoggingConfiguration | [[cdk.support/lookup-entry]] | `:logging-config` |
| `originConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-configs` |
| `priceClass` | software.amazon.awscdk.services.cloudfront.PriceClass | [[cdk.api.services.cloudfront/price-class]] | `:price-class` |
| `viewerCertificate` | software.amazon.awscdk.services.cloudfront.ViewerCertificate | [[cdk.support/lookup-entry]] | `:viewer-certificate` |
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |"
  [stack id config]
  (let [builder (CloudFrontWebDistribution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :default-root-object)]
      (. builder defaultRootObject data))
    (when-let [data (lookup-entry config id :enable-ip-v6)]
      (. builder enableIpV6 data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :error-configurations)]
      (. builder errorConfigurations data))
    (when-let [data (lookup-entry config id :geo-restriction)]
      (. builder geoRestriction data))
    (when-let [data (http-version config id :http-version)]
      (. builder httpVersion data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :origin-configs)]
      (. builder originConfigs data))
    (when-let [data (price-class config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :viewer-certificate)]
      (. builder viewerCertificate data))
    (when-let [data (viewer-protocol-policy config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (when-let [data (lookup-entry config id :web-acl-id)]
      (. builder webAclId data))
    (.build builder)))


(defn cloud-front-web-distribution-props-builder
  "The cloud-front-web-distribution-props-builder function buildes out new instances of 
CloudFrontWebDistributionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultRootObject` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-object` |
| `enableIpV6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ip-v6` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `errorConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:error-configurations` |
| `geoRestriction` | software.amazon.awscdk.services.cloudfront.GeoRestriction | [[cdk.support/lookup-entry]] | `:geo-restriction` |
| `httpVersion` | software.amazon.awscdk.services.cloudfront.HttpVersion | [[cdk.api.services.cloudfront/http-version]] | `:http-version` |
| `loggingConfig` | software.amazon.awscdk.services.cloudfront.LoggingConfiguration | [[cdk.support/lookup-entry]] | `:logging-config` |
| `originConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-configs` |
| `priceClass` | software.amazon.awscdk.services.cloudfront.PriceClass | [[cdk.api.services.cloudfront/price-class]] | `:price-class` |
| `viewerCertificate` | software.amazon.awscdk.services.cloudfront.ViewerCertificate | [[cdk.support/lookup-entry]] | `:viewer-certificate` |
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |"
  [stack id config]
  (let [builder (CloudFrontWebDistributionProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :default-root-object)]
      (. builder defaultRootObject data))
    (when-let [data (lookup-entry config id :enable-ip-v6)]
      (. builder enableIpV6 data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :error-configurations)]
      (. builder errorConfigurations data))
    (when-let [data (lookup-entry config id :geo-restriction)]
      (. builder geoRestriction data))
    (when-let [data (http-version config id :http-version)]
      (. builder httpVersion data))
    (when-let [data (lookup-entry config id :logging-config)]
      (. builder loggingConfig data))
    (when-let [data (lookup-entry config id :origin-configs)]
      (. builder originConfigs data))
    (when-let [data (price-class config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :viewer-certificate)]
      (. builder viewerCertificate data))
    (when-let [data (viewer-protocol-policy config id :viewer-protocol-policy)]
      (. builder viewerProtocolPolicy data))
    (when-let [data (lookup-entry config id :web-acl-id)]
      (. builder webAclId data))
    (.build builder)))


(defn custom-origin-config-builder
  "The custom-origin-config-builder function buildes out new instances of 
CustomOriginConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedOriginSslVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origin-ssl-versions` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `originHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:origin-headers` |
| `originKeepaliveTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:origin-keepalive-timeout` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originProtocolPolicy` | software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy | [[cdk.api.services.cloudfront/origin-protocol-policy]] | `:origin-protocol-policy` |
| `originReadTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:origin-read-timeout` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config]
  (let [builder (CustomOriginConfig$Builder.)]
    (when-let [data (lookup-entry config id :allowed-origin-ssl-versions)]
      (. builder allowedOriginSslVersions data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :http-port)]
      (. builder httpPort data))
    (when-let [data (lookup-entry config id :https-port)]
      (. builder httpsPort data))
    (when-let [data (lookup-entry config id :origin-headers)]
      (. builder originHeaders data))
    (when-let [data (lookup-entry config id :origin-keepalive-timeout)]
      (. builder originKeepaliveTimeout data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (origin-protocol-policy config id :origin-protocol-policy)]
      (. builder originProtocolPolicy data))
    (when-let [data (lookup-entry config id :origin-read-timeout)]
      (. builder originReadTimeout data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))


(defn distribution-attributes-builder
  "The distribution-attributes-builder function buildes out new instances of 
DistributionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |"
  [stack id config]
  (let [builder (DistributionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :distribution-id)]
      (. builder distributionId data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (.build builder)))


(defn distribution-builder
  "The distribution-builder function buildes out new instances of 
Distribution$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalBehaviors` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-behaviors` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultBehavior` | software.amazon.awscdk.services.cloudfront.BehaviorOptions | [[cdk.support/lookup-entry]] | `:default-behavior` |
| `defaultRootObject` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-object` |
| `domainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-names` |
| `enableIpv6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ipv6` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `errorResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:error-responses` |
| `geoRestriction` | software.amazon.awscdk.services.cloudfront.GeoRestriction | [[cdk.support/lookup-entry]] | `:geo-restriction` |
| `httpVersion` | software.amazon.awscdk.services.cloudfront.HttpVersion | [[cdk.api.services.cloudfront/http-version]] | `:http-version` |
| `logBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:log-bucket` |
| `logFilePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-file-prefix` |
| `logIncludesCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:log-includes-cookies` |
| `minimumProtocolVersion` | software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol | [[cdk.api.services.cloudfront/security-policy-protocol]] | `:minimum-protocol-version` |
| `priceClass` | software.amazon.awscdk.services.cloudfront.PriceClass | [[cdk.api.services.cloudfront/price-class]] | `:price-class` |
| `publishAdditionalMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-additional-metrics` |
| `sslSupportMethod` | software.amazon.awscdk.services.cloudfront.SSLMethod | [[cdk.api.services.cloudfront/ssl-method]] | `:ssl-support-method` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |"
  [stack id config]
  (let [builder (Distribution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-behaviors)]
      (. builder additionalBehaviors data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :default-behavior)]
      (. builder defaultBehavior data))
    (when-let [data (lookup-entry config id :default-root-object)]
      (. builder defaultRootObject data))
    (when-let [data (lookup-entry config id :domain-names)]
      (. builder domainNames data))
    (when-let [data (lookup-entry config id :enable-ipv6)]
      (. builder enableIpv6 data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :error-responses)]
      (. builder errorResponses data))
    (when-let [data (lookup-entry config id :geo-restriction)]
      (. builder geoRestriction data))
    (when-let [data (http-version config id :http-version)]
      (. builder httpVersion data))
    (when-let [data (lookup-entry config id :log-bucket)]
      (. builder logBucket data))
    (when-let [data (lookup-entry config id :log-file-prefix)]
      (. builder logFilePrefix data))
    (when-let [data (lookup-entry config id :log-includes-cookies)]
      (. builder logIncludesCookies data))
    (when-let [data (security-policy-protocol config id :minimum-protocol-version)]
      (. builder minimumProtocolVersion data))
    (when-let [data (price-class config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :publish-additional-metrics)]
      (. builder publishAdditionalMetrics data))
    (when-let [data (ssl-method config id :ssl-support-method)]
      (. builder sslSupportMethod data))
    (when-let [data (lookup-entry config id :web-acl-id)]
      (. builder webAclId data))
    (.build builder)))


(defn distribution-props-builder
  "The distribution-props-builder function buildes out new instances of 
DistributionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalBehaviors` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-behaviors` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultBehavior` | software.amazon.awscdk.services.cloudfront.BehaviorOptions | [[cdk.support/lookup-entry]] | `:default-behavior` |
| `defaultRootObject` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-object` |
| `domainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-names` |
| `enableIpv6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ipv6` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `errorResponses` | java.util.List | [[cdk.support/lookup-entry]] | `:error-responses` |
| `geoRestriction` | software.amazon.awscdk.services.cloudfront.GeoRestriction | [[cdk.support/lookup-entry]] | `:geo-restriction` |
| `httpVersion` | software.amazon.awscdk.services.cloudfront.HttpVersion | [[cdk.api.services.cloudfront/http-version]] | `:http-version` |
| `logBucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:log-bucket` |
| `logFilePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-file-prefix` |
| `logIncludesCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:log-includes-cookies` |
| `minimumProtocolVersion` | software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol | [[cdk.api.services.cloudfront/security-policy-protocol]] | `:minimum-protocol-version` |
| `priceClass` | software.amazon.awscdk.services.cloudfront.PriceClass | [[cdk.api.services.cloudfront/price-class]] | `:price-class` |
| `publishAdditionalMetrics` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publish-additional-metrics` |
| `sslSupportMethod` | software.amazon.awscdk.services.cloudfront.SSLMethod | [[cdk.api.services.cloudfront/ssl-method]] | `:ssl-support-method` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |"
  [stack id config]
  (let [builder (DistributionProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-behaviors)]
      (. builder additionalBehaviors data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :default-behavior)]
      (. builder defaultBehavior data))
    (when-let [data (lookup-entry config id :default-root-object)]
      (. builder defaultRootObject data))
    (when-let [data (lookup-entry config id :domain-names)]
      (. builder domainNames data))
    (when-let [data (lookup-entry config id :enable-ipv6)]
      (. builder enableIpv6 data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :error-responses)]
      (. builder errorResponses data))
    (when-let [data (lookup-entry config id :geo-restriction)]
      (. builder geoRestriction data))
    (when-let [data (http-version config id :http-version)]
      (. builder httpVersion data))
    (when-let [data (lookup-entry config id :log-bucket)]
      (. builder logBucket data))
    (when-let [data (lookup-entry config id :log-file-prefix)]
      (. builder logFilePrefix data))
    (when-let [data (lookup-entry config id :log-includes-cookies)]
      (. builder logIncludesCookies data))
    (when-let [data (security-policy-protocol config id :minimum-protocol-version)]
      (. builder minimumProtocolVersion data))
    (when-let [data (price-class config id :price-class)]
      (. builder priceClass data))
    (when-let [data (lookup-entry config id :publish-additional-metrics)]
      (. builder publishAdditionalMetrics data))
    (when-let [data (ssl-method config id :ssl-support-method)]
      (. builder sslSupportMethod data))
    (when-let [data (lookup-entry config id :web-acl-id)]
      (. builder webAclId data))
    (.build builder)))


(defn edge-lambda-builder
  "The edge-lambda-builder function buildes out new instances of 
EdgeLambda$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType | [[cdk.api.services.cloudfront/lambda-edge-event-type]] | `:event-type` |
| `functionVersion` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:function-version` |
| `includeBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-body` |"
  [stack id config]
  (let [builder (EdgeLambda$Builder.)]
    (when-let [data (lambda-edge-event-type config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :function-version)]
      (. builder functionVersion data))
    (when-let [data (lookup-entry config id :include-body)]
      (. builder includeBody data))
    (.build builder)))


(defn error-response-builder
  "The error-response-builder function buildes out new instances of 
ErrorResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpStatus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-status` |
| `responseHttpStatus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-http-status` |
| `responsePagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-page-path` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (ErrorResponse$Builder.)]
    (when-let [data (lookup-entry config id :http-status)]
      (. builder httpStatus data))
    (when-let [data (lookup-entry config id :response-http-status)]
      (. builder responseHttpStatus data))
    (when-let [data (lookup-entry config id :response-page-path)]
      (. builder responsePagePath data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn file-code-options-builder
  "The file-code-options-builder function buildes out new instances of 
FileCodeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |"
  [stack id config]
  (let [builder (FileCodeOptions$Builder.)]
    (when-let [data (lookup-entry config id :file-path)]
      (. builder filePath data))
    (.build builder)))


(defn function-association-builder
  "The function-association-builder function buildes out new instances of 
FunctionAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.FunctionEventType | [[cdk.api.services.cloudfront/function-event-type]] | `:event-type` |
| `function` | software.amazon.awscdk.services.cloudfront.IFunction | [[cdk.support/lookup-entry]] | `:function` |"
  [stack id config]
  (let [builder (FunctionAssociation$Builder.)]
    (when-let [data (function-event-type config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (.build builder)))


(defn function-attributes-builder
  "The function-attributes-builder function buildes out new instances of 
FunctionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionRuntime` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-runtime` |"
  [stack id config]
  (let [builder (FunctionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :function-runtime)]
      (. builder functionRuntime data))
    (.build builder)))


(defn function-builder
  "The function-builder function buildes out new instances of 
Function$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `code` | software.amazon.awscdk.services.cloudfront.FunctionCode | [[cdk.support/lookup-entry]] | `:code` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `keyValueStore` | software.amazon.awscdk.services.cloudfront.IKeyValueStore | [[cdk.support/lookup-entry]] | `:key-value-store` |
| `runtime` | software.amazon.awscdk.services.cloudfront.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (Function$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-publish)]
      (. builder autoPublish data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :key-value-store)]
      (. builder keyValueStore data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn function-props-builder
  "The function-props-builder function buildes out new instances of 
FunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `code` | software.amazon.awscdk.services.cloudfront.FunctionCode | [[cdk.support/lookup-entry]] | `:code` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `keyValueStore` | software.amazon.awscdk.services.cloudfront.IKeyValueStore | [[cdk.support/lookup-entry]] | `:key-value-store` |
| `runtime` | software.amazon.awscdk.services.cloudfront.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |"
  [stack id config]
  (let [builder (FunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-publish)]
      (. builder autoPublish data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :key-value-store)]
      (. builder keyValueStore data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (.build builder)))


(defn key-group-builder
  "The key-group-builder function buildes out new instances of 
KeyGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `keyGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-group-name` |"
  [stack id config]
  (let [builder (KeyGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :key-group-name)]
      (. builder keyGroupName data))
    (.build builder)))


(defn key-group-props-builder
  "The key-group-props-builder function buildes out new instances of 
KeyGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `keyGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-group-name` |"
  [stack id config]
  (let [builder (KeyGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :key-group-name)]
      (. builder keyGroupName data))
    (.build builder)))


(defn key-value-store-builder
  "The key-value-store-builder function buildes out new instances of 
KeyValueStore$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-name` |
| `source` | software.amazon.awscdk.services.cloudfront.ImportSource | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (KeyValueStore$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :key-value-store-name)]
      (. builder keyValueStoreName data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn key-value-store-props-builder
  "The key-value-store-props-builder function buildes out new instances of 
KeyValueStoreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-name` |
| `source` | software.amazon.awscdk.services.cloudfront.ImportSource | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (KeyValueStoreProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :key-value-store-name)]
      (. builder keyValueStoreName data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn lambda-function-association-builder
  "The lambda-function-association-builder function buildes out new instances of 
LambdaFunctionAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType | [[cdk.api.services.cloudfront/lambda-edge-event-type]] | `:event-type` |
| `includeBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-body` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:lambda-function` |"
  [stack id config]
  (let [builder (LambdaFunctionAssociation$Builder.)]
    (when-let [data (lambda-edge-event-type config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :include-body)]
      (. builder includeBody data))
    (when-let [data (lookup-entry config id :lambda-function)]
      (. builder lambdaFunction data))
    (.build builder)))


(defn logging-configuration-builder
  "The logging-configuration-builder function buildes out new instances of 
LoggingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `includeCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-cookies` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (LoggingConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :include-cookies)]
      (. builder includeCookies data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn origin-access-identity-builder
  "The origin-access-identity-builder function buildes out new instances of 
OriginAccessIdentity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (OriginAccessIdentity$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn origin-access-identity-props-builder
  "The origin-access-identity-props-builder function buildes out new instances of 
OriginAccessIdentityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (OriginAccessIdentityProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn origin-bind-config-builder
  "The origin-bind-config-builder function buildes out new instances of 
OriginBindConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverConfig` | software.amazon.awscdk.services.cloudfront.OriginFailoverConfig | [[cdk.support/lookup-entry]] | `:failover-config` |
| `originProperty` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginProperty | [[cdk.support/lookup-entry]] | `:origin-property` |"
  [stack id config]
  (let [builder (OriginBindConfig$Builder.)]
    (when-let [data (lookup-entry config id :failover-config)]
      (. builder failoverConfig data))
    (when-let [data (lookup-entry config id :origin-property)]
      (. builder originProperty data))
    (.build builder)))


(defn origin-bind-options-builder
  "The origin-bind-options-builder function buildes out new instances of 
OriginBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |"
  [stack id config]
  (let [builder (OriginBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (.build builder)))


(defn origin-failover-config-builder
  "The origin-failover-config-builder function buildes out new instances of 
OriginFailoverConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:failover-origin` |
| `statusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:status-codes` |"
  [stack id config]
  (let [builder (OriginFailoverConfig$Builder.)]
    (when-let [data (lookup-entry config id :failover-origin)]
      (. builder failoverOrigin data))
    (when-let [data (lookup-entry config id :status-codes)]
      (. builder statusCodes data))
    (.build builder)))


(defn origin-options-builder
  "The origin-options-builder function buildes out new instances of 
OriginOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config]
  (let [builder (OriginOptions$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))


(defn origin-props-builder
  "The origin-props-builder function buildes out new instances of 
OriginProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |"
  [stack id config]
  (let [builder (OriginProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :origin-id)]
      (. builder originId data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-enabled)]
      (. builder originShieldEnabled data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (.build builder)))


(defn origin-request-policy-builder
  "The origin-request-policy-builder function buildes out new instances of 
OriginRequestPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `originRequestPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-name` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |"
  [stack id config]
  (let [builder (OriginRequestPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :origin-request-policy-name)]
      (. builder originRequestPolicyName data))
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (.build builder)))


(defn origin-request-policy-props-builder
  "The origin-request-policy-props-builder function buildes out new instances of 
OriginRequestPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `originRequestPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-name` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |"
  [stack id config]
  (let [builder (OriginRequestPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cookie-behavior)]
      (. builder cookieBehavior data))
    (when-let [data (lookup-entry config id :header-behavior)]
      (. builder headerBehavior data))
    (when-let [data (lookup-entry config id :origin-request-policy-name)]
      (. builder originRequestPolicyName data))
    (when-let [data (lookup-entry config id :query-string-behavior)]
      (. builder queryStringBehavior data))
    (.build builder)))


(defn public-key-builder
  "The public-key-builder function buildes out new instances of 
PublicKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `publicKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-name` |"
  [stack id config]
  (let [builder (PublicKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :encoded-key)]
      (. builder encodedKey data))
    (when-let [data (lookup-entry config id :public-key-name)]
      (. builder publicKeyName data))
    (.build builder)))


(defn public-key-props-builder
  "The public-key-props-builder function buildes out new instances of 
PublicKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `publicKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-name` |"
  [stack id config]
  (let [builder (PublicKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :encoded-key)]
      (. builder encodedKey data))
    (when-let [data (lookup-entry config id :public-key-name)]
      (. builder publicKeyName data))
    (.build builder)))


(defn realtime-log-config-builder
  "The realtime-log-config-builder function buildes out new instances of 
RealtimeLogConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `realtimeLogConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |"
  [stack id config]
  (let [builder (RealtimeLogConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :end-points)]
      (. builder endPoints data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :realtime-log-config-name)]
      (. builder realtimeLogConfigName data))
    (when-let [data (lookup-entry config id :sampling-rate)]
      (. builder samplingRate data))
    (.build builder)))


(defn realtime-log-config-props-builder
  "The realtime-log-config-props-builder function buildes out new instances of 
RealtimeLogConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `realtimeLogConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |"
  [stack id config]
  (let [builder (RealtimeLogConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :end-points)]
      (. builder endPoints data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :realtime-log-config-name)]
      (. builder realtimeLogConfigName data))
    (when-let [data (lookup-entry config id :sampling-rate)]
      (. builder samplingRate data))
    (.build builder)))


(defn response-custom-header-builder
  "The response-custom-header-builder function buildes out new instances of 
ResponseCustomHeader$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (ResponseCustomHeader$Builder.)]
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn response-custom-headers-behavior-builder
  "The response-custom-headers-behavior-builder function buildes out new instances of 
ResponseCustomHeadersBehavior$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-headers` |"
  [stack id config]
  (let [builder (ResponseCustomHeadersBehavior$Builder.)]
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (.build builder)))


(defn response-headers-content-security-policy-builder
  "The response-headers-content-security-policy-builder function buildes out new instances of 
ResponseHeadersContentSecurityPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (ResponseHeadersContentSecurityPolicy$Builder.)]
    (when-let [data (lookup-entry config id :content-security-policy)]
      (. builder contentSecurityPolicy data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn response-headers-content-type-options-builder
  "The response-headers-content-type-options-builder function buildes out new instances of 
ResponseHeadersContentTypeOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (ResponseHeadersContentTypeOptions$Builder.)]
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn response-headers-cors-behavior-builder
  "The response-headers-cors-behavior-builder function buildes out new instances of 
ResponseHeadersCorsBehavior$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAllowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-control-allow-credentials` |
| `accessControlAllowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-headers` |
| `accessControlAllowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-methods` |
| `accessControlAllowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-origins` |
| `accessControlExposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-expose-headers` |
| `accessControlMaxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-control-max-age` |
| `originOverride` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-override` |"
  [stack id config]
  (let [builder (ResponseHeadersCorsBehavior$Builder.)]
    (when-let [data (lookup-entry config id :access-control-allow-credentials)]
      (. builder accessControlAllowCredentials data))
    (when-let [data (lookup-entry config id :access-control-allow-headers)]
      (. builder accessControlAllowHeaders data))
    (when-let [data (lookup-entry config id :access-control-allow-methods)]
      (. builder accessControlAllowMethods data))
    (when-let [data (lookup-entry config id :access-control-allow-origins)]
      (. builder accessControlAllowOrigins data))
    (when-let [data (lookup-entry config id :access-control-expose-headers)]
      (. builder accessControlExposeHeaders data))
    (when-let [data (lookup-entry config id :access-control-max-age)]
      (. builder accessControlMaxAge data))
    (when-let [data (lookup-entry config id :origin-override)]
      (. builder originOverride data))
    (.build builder)))


(defn response-headers-frame-options-builder
  "The response-headers-frame-options-builder function buildes out new instances of 
ResponseHeadersFrameOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameOption` | software.amazon.awscdk.services.cloudfront.HeadersFrameOption | [[cdk.api.services.cloudfront/headers-frame-option]] | `:frame-option` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |"
  [stack id config]
  (let [builder (ResponseHeadersFrameOptions$Builder.)]
    (when-let [data (headers-frame-option config id :frame-option)]
      (. builder frameOption data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (.build builder)))


(defn response-headers-policy-builder
  "The response-headers-policy-builder function buildes out new instances of 
ResponseHeadersPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsBehavior` | software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior | [[cdk.support/lookup-entry]] | `:cors-behavior` |
| `customHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior | [[cdk.support/lookup-entry]] | `:custom-headers-behavior` |
| `removeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-headers` |
| `responseHeadersPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-name` |
| `securityHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior | [[cdk.support/lookup-entry]] | `:security-headers-behavior` |
| `serverTimingSamplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-timing-sampling-rate` |"
  [stack id config]
  (let [builder (ResponseHeadersPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cors-behavior)]
      (. builder corsBehavior data))
    (when-let [data (lookup-entry config id :custom-headers-behavior)]
      (. builder customHeadersBehavior data))
    (when-let [data (lookup-entry config id :remove-headers)]
      (. builder removeHeaders data))
    (when-let [data (lookup-entry config id :response-headers-policy-name)]
      (. builder responseHeadersPolicyName data))
    (when-let [data (lookup-entry config id :security-headers-behavior)]
      (. builder securityHeadersBehavior data))
    (when-let [data (lookup-entry config id :server-timing-sampling-rate)]
      (. builder serverTimingSamplingRate data))
    (.build builder)))


(defn response-headers-policy-props-builder
  "The response-headers-policy-props-builder function buildes out new instances of 
ResponseHeadersPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsBehavior` | software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior | [[cdk.support/lookup-entry]] | `:cors-behavior` |
| `customHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior | [[cdk.support/lookup-entry]] | `:custom-headers-behavior` |
| `removeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-headers` |
| `responseHeadersPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-name` |
| `securityHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior | [[cdk.support/lookup-entry]] | `:security-headers-behavior` |
| `serverTimingSamplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-timing-sampling-rate` |"
  [stack id config]
  (let [builder (ResponseHeadersPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :cors-behavior)]
      (. builder corsBehavior data))
    (when-let [data (lookup-entry config id :custom-headers-behavior)]
      (. builder customHeadersBehavior data))
    (when-let [data (lookup-entry config id :remove-headers)]
      (. builder removeHeaders data))
    (when-let [data (lookup-entry config id :response-headers-policy-name)]
      (. builder responseHeadersPolicyName data))
    (when-let [data (lookup-entry config id :security-headers-behavior)]
      (. builder securityHeadersBehavior data))
    (when-let [data (lookup-entry config id :server-timing-sampling-rate)]
      (. builder serverTimingSamplingRate data))
    (.build builder)))


(defn response-headers-referrer-policy-builder
  "The response-headers-referrer-policy-builder function buildes out new instances of 
ResponseHeadersReferrerPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `referrerPolicy` | software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy | [[cdk.api.services.cloudfront/headers-referrer-policy]] | `:referrer-policy` |"
  [stack id config]
  (let [builder (ResponseHeadersReferrerPolicy$Builder.)]
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (headers-referrer-policy config id :referrer-policy)]
      (. builder referrerPolicy data))
    (.build builder)))


(defn response-headers-strict-transport-security-builder
  "The response-headers-strict-transport-security-builder function buildes out new instances of 
ResponseHeadersStrictTransportSecurity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlMaxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-control-max-age` |
| `includeSubdomains` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-subdomains` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `preload` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preload` |"
  [stack id config]
  (let [builder (ResponseHeadersStrictTransportSecurity$Builder.)]
    (when-let [data (lookup-entry config id :access-control-max-age)]
      (. builder accessControlMaxAge data))
    (when-let [data (lookup-entry config id :include-subdomains)]
      (. builder includeSubdomains data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :preload)]
      (. builder preload data))
    (.build builder)))


(defn response-headers-xss-protection-builder
  "The response-headers-xss-protection-builder function buildes out new instances of 
ResponseHeadersXSSProtection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modeBlock` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mode-block` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `protection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:protection` |
| `reportUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-uri` |"
  [stack id config]
  (let [builder (ResponseHeadersXSSProtection$Builder.)]
    (when-let [data (lookup-entry config id :mode-block)]
      (. builder modeBlock data))
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :protection)]
      (. builder protection data))
    (when-let [data (lookup-entry config id :report-uri)]
      (. builder reportUri data))
    (.build builder)))


(defn response-security-headers-behavior-builder
  "The response-security-headers-behavior-builder function buildes out new instances of 
ResponseSecurityHeadersBehavior$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `contentTypeOptions` | software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions | [[cdk.support/lookup-entry]] | `:content-type-options` |
| `frameOptions` | software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions | [[cdk.support/lookup-entry]] | `:frame-options` |
| `referrerPolicy` | software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy | [[cdk.support/lookup-entry]] | `:referrer-policy` |
| `strictTransportSecurity` | software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity | [[cdk.support/lookup-entry]] | `:strict-transport-security` |
| `xssProtection` | software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection | [[cdk.support/lookup-entry]] | `:xss-protection` |"
  [stack id config]
  (let [builder (ResponseSecurityHeadersBehavior$Builder.)]
    (when-let [data (lookup-entry config id :content-security-policy)]
      (. builder contentSecurityPolicy data))
    (when-let [data (lookup-entry config id :content-type-options)]
      (. builder contentTypeOptions data))
    (when-let [data (lookup-entry config id :frame-options)]
      (. builder frameOptions data))
    (when-let [data (lookup-entry config id :referrer-policy)]
      (. builder referrerPolicy data))
    (when-let [data (lookup-entry config id :strict-transport-security)]
      (. builder strictTransportSecurity data))
    (when-let [data (lookup-entry config id :xss-protection)]
      (. builder xssProtection data))
    (.build builder)))


(defn s3-origin-config-builder
  "The s3-origin-config-builder function buildes out new instances of 
S3OriginConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:origin-headers` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `s3BucketSource` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-source` |"
  [stack id config]
  (let [builder (S3OriginConfig$Builder.)]
    (when-let [data (lookup-entry config id :origin-access-identity)]
      (. builder originAccessIdentity data))
    (when-let [data (lookup-entry config id :origin-headers)]
      (. builder originHeaders data))
    (when-let [data (lookup-entry config id :origin-path)]
      (. builder originPath data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :s3-bucket-source)]
      (. builder s3BucketSource data))
    (.build builder)))


(defn source-configuration-builder
  "The source-configuration-builder function buildes out new instances of 
SourceConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:behaviors` |
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customOriginSource` | software.amazon.awscdk.services.cloudfront.CustomOriginConfig | [[cdk.support/lookup-entry]] | `:custom-origin-source` |
| `failoverCriteriaStatusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:failover-criteria-status-codes` |
| `failoverCustomOriginSource` | software.amazon.awscdk.services.cloudfront.CustomOriginConfig | [[cdk.support/lookup-entry]] | `:failover-custom-origin-source` |
| `failoverS3OriginSource` | software.amazon.awscdk.services.cloudfront.S3OriginConfig | [[cdk.support/lookup-entry]] | `:failover-s3-origin-source` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `s3OriginSource` | software.amazon.awscdk.services.cloudfront.S3OriginConfig | [[cdk.support/lookup-entry]] | `:s3-origin-source` |"
  [stack id config]
  (let [builder (SourceConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :behaviors)]
      (. builder behaviors data))
    (when-let [data (lookup-entry config id :connection-attempts)]
      (. builder connectionAttempts data))
    (when-let [data (lookup-entry config id :connection-timeout)]
      (. builder connectionTimeout data))
    (when-let [data (lookup-entry config id :custom-origin-source)]
      (. builder customOriginSource data))
    (when-let [data (lookup-entry config id :failover-criteria-status-codes)]
      (. builder failoverCriteriaStatusCodes data))
    (when-let [data (lookup-entry config id :failover-custom-origin-source)]
      (. builder failoverCustomOriginSource data))
    (when-let [data (lookup-entry config id :failover-s3-origin-source)]
      (. builder failoverS3OriginSource data))
    (when-let [data (lookup-entry config id :origin-shield-region)]
      (. builder originShieldRegion data))
    (when-let [data (lookup-entry config id :s3-origin-source)]
      (. builder s3OriginSource data))
    (.build builder)))


(defn viewer-certificate-options-builder
  "The viewer-certificate-options-builder function buildes out new instances of 
ViewerCertificateOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `securityPolicy` | software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol | [[cdk.api.services.cloudfront/security-policy-protocol]] | `:security-policy` |
| `sslMethod` | software.amazon.awscdk.services.cloudfront.SSLMethod | [[cdk.api.services.cloudfront/ssl-method]] | `:ssl-method` |"
  [stack id config]
  (let [builder (ViewerCertificateOptions$Builder.)]
    (when-let [data (lookup-entry config id :aliases)]
      (. builder aliases data))
    (when-let [data (security-policy-protocol config id :security-policy)]
      (. builder securityPolicy data))
    (when-let [data (ssl-method config id :ssl-method)]
      (. builder sslMethod data))
    (.build builder)))