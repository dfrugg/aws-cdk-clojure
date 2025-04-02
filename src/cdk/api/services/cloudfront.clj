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


(defn add-behavior-options-builder>
  "The add-behavior-options-builder> function updates a AddBehaviorOptions$Builder instance using the provided configuration.
  The function takes the AddBehaviorOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |
"
  [^AddBehaviorOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-some [data (lookup-entry config id :cache-policy)]
    (. builder cachePolicy data))
  (when-some [data (lookup-entry config id :cached-methods)]
    (. builder cachedMethods data))
  (when-some [data (lookup-entry config id :compress)]
    (. builder compress data))
  (when-some [data (lookup-entry config id :edge-lambdas)]
    (. builder edgeLambdas data))
  (when-some [data (lookup-entry config id :function-associations)]
    (. builder functionAssociations data))
  (when-some [data (lookup-entry config id :origin-request-policy)]
    (. builder originRequestPolicy data))
  (when-some [data (lookup-entry config id :realtime-log-config)]
    (. builder realtimeLogConfig data))
  (when-some [data (lookup-entry config id :response-headers-policy)]
    (. builder responseHeadersPolicy data))
  (when-some [data (lookup-entry config id :smooth-streaming)]
    (. builder smoothStreaming data))
  (when-some [data (lookup-entry config id :trusted-key-groups)]
    (. builder trustedKeyGroups data))
  (when-some [data (viewer-protocol-policy config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (.build builder))


(defn add-behavior-options-builder
  "Creates a  `AddBehaviorOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (add-behavior-options-builder> (new AddBehaviorOptions$Builder) id config))


(defn asset-import-source-builder>
  "The asset-import-source-builder> function updates a AssetImportSource$Builder instance using the provided configuration.
  The function takes the AssetImportSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
"
  [^AssetImportSource$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-some [data (asset-hash-type config id :asset-hash-type)]
    (. builder assetHashType data))
  (when-some [data (lookup-entry config id :bundling)]
    (. builder bundling data))
  (when-some [data (lookup-entry config id :deploy-time)]
    (. builder deployTime data))
  (when-some [data (lookup-entry config id :exclude)]
    (. builder exclude data))
  (when-some [data (symlink-follow-mode config id :follow-symlinks)]
    (. builder followSymlinks data))
  (when-some [data (ignore-mode config id :ignore-mode)]
    (. builder ignoreMode data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (.build builder))


(defn asset-import-source-builder
  "Creates a  `AssetImportSource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| path | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String path id config]
  (asset-import-source-builder> (AssetImportSource$Builder/create path) id config))


(defn behavior-builder>
  "The behavior-builder> function updates a Behavior$Builder instance using the provided configuration.
  The function takes the Behavior$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |
"
  [^Behavior$Builder builder id config]
  (when-some [data (cloud-front-allowed-methods config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-some [data (cloud-front-allowed-cached-methods config id :cached-methods)]
    (. builder cachedMethods data))
  (when-some [data (lookup-entry config id :compress)]
    (. builder compress data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :forwarded-values)]
    (. builder forwardedValues data))
  (when-some [data (lookup-entry config id :function-associations)]
    (. builder functionAssociations data))
  (when-some [data (lookup-entry config id :is-default-behavior)]
    (. builder isDefaultBehavior data))
  (when-some [data (lookup-entry config id :lambda-function-associations)]
    (. builder lambdaFunctionAssociations data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :path-pattern)]
    (. builder pathPattern data))
  (when-some [data (lookup-entry config id :trusted-key-groups)]
    (. builder trustedKeyGroups data))
  (when-some [data (lookup-entry config id :trusted-signers)]
    (. builder trustedSigners data))
  (when-some [data (viewer-protocol-policy config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (.build builder))


(defn behavior-builder
  "Creates a  `Behavior$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (behavior-builder> (new Behavior$Builder) id config))


(defn behavior-options-builder>
  "The behavior-options-builder> function updates a BehaviorOptions$Builder instance using the provided configuration.
  The function takes the BehaviorOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewerProtocolPolicy` | software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy | [[cdk.api.services.cloudfront/viewer-protocol-policy]] | `:viewer-protocol-policy` |
"
  [^BehaviorOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-some [data (lookup-entry config id :cache-policy)]
    (. builder cachePolicy data))
  (when-some [data (lookup-entry config id :cached-methods)]
    (. builder cachedMethods data))
  (when-some [data (lookup-entry config id :compress)]
    (. builder compress data))
  (when-some [data (lookup-entry config id :edge-lambdas)]
    (. builder edgeLambdas data))
  (when-some [data (lookup-entry config id :function-associations)]
    (. builder functionAssociations data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-some [data (lookup-entry config id :origin-request-policy)]
    (. builder originRequestPolicy data))
  (when-some [data (lookup-entry config id :realtime-log-config)]
    (. builder realtimeLogConfig data))
  (when-some [data (lookup-entry config id :response-headers-policy)]
    (. builder responseHeadersPolicy data))
  (when-some [data (lookup-entry config id :smooth-streaming)]
    (. builder smoothStreaming data))
  (when-some [data (lookup-entry config id :trusted-key-groups)]
    (. builder trustedKeyGroups data))
  (when-some [data (viewer-protocol-policy config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (.build builder))


(defn behavior-options-builder
  "Creates a  `BehaviorOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (behavior-options-builder> (new BehaviorOptions$Builder) id config))


(defn cache-policy-builder>
  "The cache-policy-builder> function updates a CachePolicy$Builder instance using the provided configuration.
  The function takes the CachePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
"
  [^CachePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :cache-policy-name)]
    (. builder cachePolicyName data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-brotli)]
    (. builder enableAcceptEncodingBrotli data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-gzip)]
    (. builder enableAcceptEncodingGzip data))
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (.build builder))


(defn cache-policy-builder
  "Creates a  `CachePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cache-policy-builder> (CachePolicy$Builder/create scope (name id)) id config))


(defn cache-policy-props-builder>
  "The cache-policy-props-builder> function updates a CachePolicyProps$Builder instance using the provided configuration.
  The function takes the CachePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
"
  [^CachePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cache-policy-name)]
    (. builder cachePolicyName data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-brotli)]
    (. builder enableAcceptEncodingBrotli data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-gzip)]
    (. builder enableAcceptEncodingGzip data))
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (.build builder))


(defn cache-policy-props-builder
  "Creates a  `CachePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cache-policy-props-builder> (new CachePolicyProps$Builder) id config))


(defn cfn-cache-policy-builder>
  "The cfn-cache-policy-builder> function updates a CfnCachePolicy$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-policy-config` |
"
  [^CfnCachePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :cache-policy-config)]
    (. builder cachePolicyConfig data))
  (.build builder))


(defn cfn-cache-policy-builder
  "Creates a  `CfnCachePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cache-policy-builder> (CfnCachePolicy$Builder/create scope (name id)) id config))


(defn cfn-cache-policy-cache-policy-config-property-builder>
  "The cfn-cache-policy-cache-policy-config-property-builder> function updates a CfnCachePolicy$CachePolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$CachePolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `maxTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-ttl` |
| `minTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-ttl` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parametersInCacheKeyAndForwardedToOrigin` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty | [[cdk.support/lookup-entry]] | `:parameters-in-cache-key-and-forwarded-to-origin` |
"
  [^CfnCachePolicy$CachePolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters-in-cache-key-and-forwarded-to-origin)]
    (. builder parametersInCacheKeyAndForwardedToOrigin data))
  (.build builder))


(defn cfn-cache-policy-cache-policy-config-property-builder
  "Creates a  `CfnCachePolicy$CachePolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-cache-policy-config-property-builder> (new CfnCachePolicy$CachePolicyConfigProperty$Builder) id config))


(defn cfn-cache-policy-cookies-config-property-builder>
  "The cfn-cache-policy-cookies-config-property-builder> function updates a CfnCachePolicy$CookiesConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$CookiesConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `cookies` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies` |
"
  [^CfnCachePolicy$CookiesConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :cookies)]
    (. builder cookies data))
  (.build builder))


(defn cfn-cache-policy-cookies-config-property-builder
  "Creates a  `CfnCachePolicy$CookiesConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-cookies-config-property-builder> (new CfnCachePolicy$CookiesConfigProperty$Builder) id config))


(defn cfn-cache-policy-headers-config-property-builder>
  "The cfn-cache-policy-headers-config-property-builder> function updates a CfnCachePolicy$HeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$HeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
"
  [^CfnCachePolicy$HeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (.build builder))


(defn cfn-cache-policy-headers-config-property-builder
  "Creates a  `CfnCachePolicy$HeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-headers-config-property-builder> (new CfnCachePolicy$HeadersConfigProperty$Builder) id config))


(defn cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder>
  "The cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder> function updates a CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookiesConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$CookiesConfigProperty | [[cdk.support/lookup-entry]] | `:cookies-config` |
| `enableAcceptEncodingBrotli` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-brotli` |
| `enableAcceptEncodingGzip` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-accept-encoding-gzip` |
| `headersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers-config` |
| `queryStringsConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$QueryStringsConfigProperty | [[cdk.support/lookup-entry]] | `:query-strings-config` |
"
  [^CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cookies-config)]
    (. builder cookiesConfig data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-brotli)]
    (. builder enableAcceptEncodingBrotli data))
  (when-some [data (lookup-entry config id :enable-accept-encoding-gzip)]
    (. builder enableAcceptEncodingGzip data))
  (when-some [data (lookup-entry config id :headers-config)]
    (. builder headersConfig data))
  (when-some [data (lookup-entry config id :query-strings-config)]
    (. builder queryStringsConfig data))
  (.build builder))


(defn cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder
  "Creates a  `CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-parameters-in-cache-key-and-forwarded-to-origin-property-builder> (new CfnCachePolicy$ParametersInCacheKeyAndForwardedToOriginProperty$Builder) id config))


(defn cfn-cache-policy-props-builder>
  "The cfn-cache-policy-props-builder> function updates a CfnCachePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnCachePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachePolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnCachePolicy$CachePolicyConfigProperty | [[cdk.support/lookup-entry]] | `:cache-policy-config` |
"
  [^CfnCachePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cache-policy-config)]
    (. builder cachePolicyConfig data))
  (.build builder))


(defn cfn-cache-policy-props-builder
  "Creates a  `CfnCachePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-props-builder> (new CfnCachePolicyProps$Builder) id config))


(defn cfn-cache-policy-query-strings-config-property-builder>
  "The cfn-cache-policy-query-strings-config-property-builder> function updates a CfnCachePolicy$QueryStringsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCachePolicy$QueryStringsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStringBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
| `queryStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings` |
"
  [^CfnCachePolicy$QueryStringsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (when-some [data (lookup-entry config id :query-strings)]
    (. builder queryStrings data))
  (.build builder))


(defn cfn-cache-policy-query-strings-config-property-builder
  "Creates a  `CfnCachePolicy$QueryStringsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cache-policy-query-strings-config-property-builder> (new CfnCachePolicy$QueryStringsConfigProperty$Builder) id config))


(defn cfn-cloud-front-origin-access-identity-builder>
  "The cfn-cloud-front-origin-access-identity-builder> function updates a CfnCloudFrontOriginAccessIdentity$Builder instance using the provided configuration.
  The function takes the CfnCloudFrontOriginAccessIdentity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFrontOriginAccessIdentityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-front-origin-access-identity-config` |
"
  [^CfnCloudFrontOriginAccessIdentity$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-front-origin-access-identity-config)]
    (. builder cloudFrontOriginAccessIdentityConfig data))
  (.build builder))


(defn cfn-cloud-front-origin-access-identity-builder
  "Creates a  `CfnCloudFrontOriginAccessIdentity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cloud-front-origin-access-identity-builder> (CfnCloudFrontOriginAccessIdentity$Builder/create scope (name id)) id config))


(defn cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder>
  "The cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder> function updates a CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder
  "Creates a  `CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cloud-front-origin-access-identity-cloud-front-origin-access-identity-config-property-builder> (new CfnCloudFrontOriginAccessIdentity$CloudFrontOriginAccessIdentityConfigProperty$Builder) id config))


(defn cfn-cloud-front-origin-access-identity-props-builder>
  "The cfn-cloud-front-origin-access-identity-props-builder> function updates a CfnCloudFrontOriginAccessIdentityProps$Builder instance using the provided configuration.
  The function takes the CfnCloudFrontOriginAccessIdentityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudFrontOriginAccessIdentityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-front-origin-access-identity-config` |
"
  [^CfnCloudFrontOriginAccessIdentityProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-front-origin-access-identity-config)]
    (. builder cloudFrontOriginAccessIdentityConfig data))
  (.build builder))


(defn cfn-cloud-front-origin-access-identity-props-builder
  "Creates a  `CfnCloudFrontOriginAccessIdentityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-cloud-front-origin-access-identity-props-builder> (new CfnCloudFrontOriginAccessIdentityProps$Builder) id config))


(defn cfn-continuous-deployment-policy-builder>
  "The cfn-continuous-deployment-policy-builder> function updates a CfnContinuousDeploymentPolicy$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continuousDeploymentPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-deployment-policy-config` |
"
  [^CfnContinuousDeploymentPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :continuous-deployment-policy-config)]
    (. builder continuousDeploymentPolicyConfig data))
  (.build builder))


(defn cfn-continuous-deployment-policy-builder
  "Creates a  `CfnContinuousDeploymentPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-continuous-deployment-policy-builder> (CfnContinuousDeploymentPolicy$Builder/create scope (name id)) id config))


(defn cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder>
  "The cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder> function updates a CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `singleHeaderPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:single-header-policy-config` |
| `singleWeightPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:single-weight-policy-config` |
| `stagingDistributionDnsNames` | java.util.List | [[cdk.support/lookup-entry]] | `:staging-distribution-dns-names` |
| `trafficConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$TrafficConfigProperty | [[cdk.support/lookup-entry]] | `:traffic-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :single-header-policy-config)]
    (. builder singleHeaderPolicyConfig data))
  (when-some [data (lookup-entry config id :single-weight-policy-config)]
    (. builder singleWeightPolicyConfig data))
  (when-some [data (lookup-entry config id :staging-distribution-dns-names)]
    (. builder stagingDistributionDnsNames data))
  (when-some [data (lookup-entry config id :traffic-config)]
    (. builder trafficConfig data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-continuous-deployment-policy-config-property-builder> (new CfnContinuousDeploymentPolicy$ContinuousDeploymentPolicyConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-props-builder>
  "The cfn-continuous-deployment-policy-props-builder> function updates a CfnContinuousDeploymentPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continuousDeploymentPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:continuous-deployment-policy-config` |
"
  [^CfnContinuousDeploymentPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :continuous-deployment-policy-config)]
    (. builder continuousDeploymentPolicyConfig data))
  (.build builder))


(defn cfn-continuous-deployment-policy-props-builder
  "Creates a  `CfnContinuousDeploymentPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-props-builder> (new CfnContinuousDeploymentPolicyProps$Builder) id config))


(defn cfn-continuous-deployment-policy-session-stickiness-config-property-builder>
  "The cfn-continuous-deployment-policy-session-stickiness-config-property-builder> function updates a CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-ttl` |
| `maximumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ttl` |
"
  [^CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :idle-ttl)]
    (. builder idleTtl data))
  (when-some [data (lookup-entry config id :maximum-ttl)]
    (. builder maximumTtl data))
  (.build builder))


(defn cfn-continuous-deployment-policy-session-stickiness-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-session-stickiness-config-property-builder> (new CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-single-header-config-property-builder>
  "The cfn-continuous-deployment-policy-single-header-config-property-builder> function updates a CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-continuous-deployment-policy-single-header-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-single-header-config-property-builder> (new CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-single-header-policy-config-property-builder>
  "The cfn-continuous-deployment-policy-single-header-policy-config-property-builder> function updates a CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-continuous-deployment-policy-single-header-policy-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-single-header-policy-config-property-builder> (new CfnContinuousDeploymentPolicy$SingleHeaderPolicyConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-single-weight-config-property-builder>
  "The cfn-continuous-deployment-policy-single-weight-config-property-builder> function updates a CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sessionStickinessConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:session-stickiness-config` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :session-stickiness-config)]
    (. builder sessionStickinessConfig data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-continuous-deployment-policy-single-weight-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-single-weight-config-property-builder> (new CfnContinuousDeploymentPolicy$SingleWeightConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-single-weight-policy-config-property-builder>
  "The cfn-continuous-deployment-policy-single-weight-policy-config-property-builder> function updates a CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sessionStickinessConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SessionStickinessConfigProperty | [[cdk.support/lookup-entry]] | `:session-stickiness-config` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :session-stickiness-config)]
    (. builder sessionStickinessConfig data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-continuous-deployment-policy-single-weight-policy-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-single-weight-policy-config-property-builder> (new CfnContinuousDeploymentPolicy$SingleWeightPolicyConfigProperty$Builder) id config))


(defn cfn-continuous-deployment-policy-traffic-config-property-builder>
  "The cfn-continuous-deployment-policy-traffic-config-property-builder> function updates a CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `singleHeaderConfig` | software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy$SingleHeaderConfigProperty | [[cdk.support/lookup-entry]] | `:single-header-config` |
| `singleWeightConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-weight-config` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :single-header-config)]
    (. builder singleHeaderConfig data))
  (when-some [data (lookup-entry config id :single-weight-config)]
    (. builder singleWeightConfig data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-continuous-deployment-policy-traffic-config-property-builder
  "Creates a  `CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-continuous-deployment-policy-traffic-config-property-builder> (new CfnContinuousDeploymentPolicy$TrafficConfigProperty$Builder) id config))


(defn cfn-distribution-builder>
  "The cfn-distribution-builder> function updates a CfnDistribution$Builder instance using the provided configuration.
  The function takes the CfnDistribution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$DistributionConfigProperty | [[cdk.support/lookup-entry]] | `:distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistribution$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-config)]
    (. builder distributionConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-builder
  "Creates a  `CfnDistribution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-distribution-builder> (CfnDistribution$Builder/create scope (name id)) id config))


(defn cfn-distribution-cache-behavior-property-builder>
  "The cfn-distribution-cache-behavior-property-builder> function updates a CfnDistribution$CacheBehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CacheBehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewerProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:viewer-protocol-policy` |
"
  [^CfnDistribution$CacheBehaviorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-some [data (lookup-entry config id :cache-policy-id)]
    (. builder cachePolicyId data))
  (when-some [data (lookup-entry config id :cached-methods)]
    (. builder cachedMethods data))
  (when-some [data (lookup-entry config id :compress)]
    (. builder compress data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :field-level-encryption-id)]
    (. builder fieldLevelEncryptionId data))
  (when-some [data (lookup-entry config id :forwarded-values)]
    (. builder forwardedValues data))
  (when-some [data (lookup-entry config id :function-associations)]
    (. builder functionAssociations data))
  (when-some [data (lookup-entry config id :lambda-function-associations)]
    (. builder lambdaFunctionAssociations data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :origin-request-policy-id)]
    (. builder originRequestPolicyId data))
  (when-some [data (lookup-entry config id :path-pattern)]
    (. builder pathPattern data))
  (when-some [data (lookup-entry config id :realtime-log-config-arn)]
    (. builder realtimeLogConfigArn data))
  (when-some [data (lookup-entry config id :response-headers-policy-id)]
    (. builder responseHeadersPolicyId data))
  (when-some [data (lookup-entry config id :smooth-streaming)]
    (. builder smoothStreaming data))
  (when-some [data (lookup-entry config id :target-origin-id)]
    (. builder targetOriginId data))
  (when-some [data (lookup-entry config id :trusted-key-groups)]
    (. builder trustedKeyGroups data))
  (when-some [data (lookup-entry config id :trusted-signers)]
    (. builder trustedSigners data))
  (when-some [data (lookup-entry config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (.build builder))


(defn cfn-distribution-cache-behavior-property-builder
  "Creates a  `CfnDistribution$CacheBehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cache-behavior-property-builder> (new CfnDistribution$CacheBehaviorProperty$Builder) id config))


(defn cfn-distribution-cookies-property-builder>
  "The cfn-distribution-cookies-property-builder> function updates a CfnDistribution$CookiesProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CookiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forward` | java.lang.String | [[cdk.support/lookup-entry]] | `:forward` |
| `whitelistedNames` | java.util.List | [[cdk.support/lookup-entry]] | `:whitelisted-names` |
"
  [^CfnDistribution$CookiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :forward)]
    (. builder forward data))
  (when-some [data (lookup-entry config id :whitelisted-names)]
    (. builder whitelistedNames data))
  (.build builder))


(defn cfn-distribution-cookies-property-builder
  "Creates a  `CfnDistribution$CookiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cookies-property-builder> (new CfnDistribution$CookiesProperty$Builder) id config))


(defn cfn-distribution-custom-error-response-property-builder>
  "The cfn-distribution-custom-error-response-property-builder> function updates a CfnDistribution$CustomErrorResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CustomErrorResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `errorCachingMinTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-caching-min-ttl` |
| `errorCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:error-code` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responsePagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-page-path` |
"
  [^CfnDistribution$CustomErrorResponseProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :error-caching-min-ttl)]
    (. builder errorCachingMinTtl data))
  (when-some [data (lookup-entry config id :error-code)]
    (. builder errorCode data))
  (when-some [data (lookup-entry config id :response-code)]
    (. builder responseCode data))
  (when-some [data (lookup-entry config id :response-page-path)]
    (. builder responsePagePath data))
  (.build builder))


(defn cfn-distribution-custom-error-response-property-builder
  "Creates a  `CfnDistribution$CustomErrorResponseProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-custom-error-response-property-builder> (new CfnDistribution$CustomErrorResponseProperty$Builder) id config))


(defn cfn-distribution-custom-origin-config-property-builder>
  "The cfn-distribution-custom-origin-config-property-builder> function updates a CfnDistribution$CustomOriginConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CustomOriginConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `originKeepaliveTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:origin-keepalive-timeout` |
| `originProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-protocol-policy` |
| `originReadTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:origin-read-timeout` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
"
  [^CfnDistribution$CustomOriginConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :origin-keepalive-timeout)]
    (. builder originKeepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-protocol-policy)]
    (. builder originProtocolPolicy data))
  (when-some [data (lookup-entry config id :origin-read-timeout)]
    (. builder originReadTimeout data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (.build builder))


(defn cfn-distribution-custom-origin-config-property-builder
  "Creates a  `CfnDistribution$CustomOriginConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-custom-origin-config-property-builder> (new CfnDistribution$CustomOriginConfigProperty$Builder) id config))


(defn cfn-distribution-default-cache-behavior-property-builder>
  "The cfn-distribution-default-cache-behavior-property-builder> function updates a CfnDistribution$DefaultCacheBehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$DefaultCacheBehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `viewerProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:viewer-protocol-policy` |
"
  [^CfnDistribution$DefaultCacheBehaviorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-methods)]
    (. builder allowedMethods data))
  (when-some [data (lookup-entry config id :cache-policy-id)]
    (. builder cachePolicyId data))
  (when-some [data (lookup-entry config id :cached-methods)]
    (. builder cachedMethods data))
  (when-some [data (lookup-entry config id :compress)]
    (. builder compress data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :field-level-encryption-id)]
    (. builder fieldLevelEncryptionId data))
  (when-some [data (lookup-entry config id :forwarded-values)]
    (. builder forwardedValues data))
  (when-some [data (lookup-entry config id :function-associations)]
    (. builder functionAssociations data))
  (when-some [data (lookup-entry config id :lambda-function-associations)]
    (. builder lambdaFunctionAssociations data))
  (when-some [data (lookup-entry config id :max-ttl)]
    (. builder maxTtl data))
  (when-some [data (lookup-entry config id :min-ttl)]
    (. builder minTtl data))
  (when-some [data (lookup-entry config id :origin-request-policy-id)]
    (. builder originRequestPolicyId data))
  (when-some [data (lookup-entry config id :realtime-log-config-arn)]
    (. builder realtimeLogConfigArn data))
  (when-some [data (lookup-entry config id :response-headers-policy-id)]
    (. builder responseHeadersPolicyId data))
  (when-some [data (lookup-entry config id :smooth-streaming)]
    (. builder smoothStreaming data))
  (when-some [data (lookup-entry config id :target-origin-id)]
    (. builder targetOriginId data))
  (when-some [data (lookup-entry config id :trusted-key-groups)]
    (. builder trustedKeyGroups data))
  (when-some [data (lookup-entry config id :trusted-signers)]
    (. builder trustedSigners data))
  (when-some [data (lookup-entry config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (.build builder))


(defn cfn-distribution-default-cache-behavior-property-builder
  "Creates a  `CfnDistribution$DefaultCacheBehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-default-cache-behavior-property-builder> (new CfnDistribution$DefaultCacheBehaviorProperty$Builder) id config))


(defn cfn-distribution-distribution-config-property-builder>
  "The cfn-distribution-distribution-config-property-builder> function updates a CfnDistribution$DistributionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$DistributionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^CfnDistribution$DistributionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-some [data (lookup-entry config id :cache-behaviors)]
    (. builder cacheBehaviors data))
  (when-some [data (lookup-entry config id :cnam-es)]
    (. builder cnamEs data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :continuous-deployment-policy-id)]
    (. builder continuousDeploymentPolicyId data))
  (when-some [data (lookup-entry config id :custom-error-responses)]
    (. builder customErrorResponses data))
  (when-some [data (lookup-entry config id :custom-origin)]
    (. builder customOrigin data))
  (when-some [data (lookup-entry config id :default-cache-behavior)]
    (. builder defaultCacheBehavior data))
  (when-some [data (lookup-entry config id :default-root-object)]
    (. builder defaultRootObject data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :http-version)]
    (. builder httpVersion data))
  (when-some [data (lookup-entry config id :ipv6-enabled)]
    (. builder ipv6Enabled data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :origin-groups)]
    (. builder originGroups data))
  (when-some [data (lookup-entry config id :origins)]
    (. builder origins data))
  (when-some [data (lookup-entry config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :restrictions)]
    (. builder restrictions data))
  (when-some [data (lookup-entry config id :s3-origin)]
    (. builder s3Origin data))
  (when-some [data (lookup-entry config id :staging)]
    (. builder staging data))
  (when-some [data (lookup-entry config id :viewer-certificate)]
    (. builder viewerCertificate data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn cfn-distribution-distribution-config-property-builder
  "Creates a  `CfnDistribution$DistributionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-distribution-config-property-builder> (new CfnDistribution$DistributionConfigProperty$Builder) id config))


(defn cfn-distribution-forwarded-values-property-builder>
  "The cfn-distribution-forwarded-values-property-builder> function updates a CfnDistribution$ForwardedValuesProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$ForwardedValuesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookies` | software.amazon.awscdk.services.cloudfront.CfnDistribution$CookiesProperty | [[cdk.support/lookup-entry]] | `:cookies` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `queryString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string` |
| `queryStringCacheKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:query-string-cache-keys` |
"
  [^CfnDistribution$ForwardedValuesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cookies)]
    (. builder cookies data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :query-string-cache-keys)]
    (. builder queryStringCacheKeys data))
  (.build builder))


(defn cfn-distribution-forwarded-values-property-builder
  "Creates a  `CfnDistribution$ForwardedValuesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-forwarded-values-property-builder> (new CfnDistribution$ForwardedValuesProperty$Builder) id config))


(defn cfn-distribution-function-association-property-builder>
  "The cfn-distribution-function-association-property-builder> function updates a CfnDistribution$FunctionAssociationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$FunctionAssociationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
"
  [^CfnDistribution$FunctionAssociationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (.build builder))


(defn cfn-distribution-function-association-property-builder
  "Creates a  `CfnDistribution$FunctionAssociationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-function-association-property-builder> (new CfnDistribution$FunctionAssociationProperty$Builder) id config))


(defn cfn-distribution-geo-restriction-property-builder>
  "The cfn-distribution-geo-restriction-property-builder> function updates a CfnDistribution$GeoRestrictionProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$GeoRestrictionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `restrictionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restriction-type` |
"
  [^CfnDistribution$GeoRestrictionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-some [data (lookup-entry config id :restriction-type)]
    (. builder restrictionType data))
  (.build builder))


(defn cfn-distribution-geo-restriction-property-builder
  "Creates a  `CfnDistribution$GeoRestrictionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-geo-restriction-property-builder> (new CfnDistribution$GeoRestrictionProperty$Builder) id config))


(defn cfn-distribution-lambda-function-association-property-builder>
  "The cfn-distribution-lambda-function-association-property-builder> function updates a CfnDistribution$LambdaFunctionAssociationProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$LambdaFunctionAssociationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `includeBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-body` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
"
  [^CfnDistribution$LambdaFunctionAssociationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :include-body)]
    (. builder includeBody data))
  (when-some [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (.build builder))


(defn cfn-distribution-lambda-function-association-property-builder
  "Creates a  `CfnDistribution$LambdaFunctionAssociationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-lambda-function-association-property-builder> (new CfnDistribution$LambdaFunctionAssociationProperty$Builder) id config))


(defn cfn-distribution-legacy-custom-origin-property-builder>
  "The cfn-distribution-legacy-custom-origin-property-builder> function updates a CfnDistribution$LegacyCustomOriginProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$LegacyCustomOriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `httpPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-port` |
| `httpsPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:https-port` |
| `originProtocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-protocol-policy` |
| `originSslProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:origin-ssl-protocols` |
"
  [^CfnDistribution$LegacyCustomOriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :origin-protocol-policy)]
    (. builder originProtocolPolicy data))
  (when-some [data (lookup-entry config id :origin-ssl-protocols)]
    (. builder originSslProtocols data))
  (.build builder))


(defn cfn-distribution-legacy-custom-origin-property-builder
  "Creates a  `CfnDistribution$LegacyCustomOriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-legacy-custom-origin-property-builder> (new CfnDistribution$LegacyCustomOriginProperty$Builder) id config))


(defn cfn-distribution-legacy-s3-origin-property-builder>
  "The cfn-distribution-legacy-s3-origin-property-builder> function updates a CfnDistribution$LegacyS3OriginProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$LegacyS3OriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
"
  [^CfnDistribution$LegacyS3OriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (.build builder))


(defn cfn-distribution-legacy-s3-origin-property-builder
  "Creates a  `CfnDistribution$LegacyS3OriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-legacy-s3-origin-property-builder> (new CfnDistribution$LegacyS3OriginProperty$Builder) id config))


(defn cfn-distribution-logging-property-builder>
  "The cfn-distribution-logging-property-builder> function updates a CfnDistribution$LoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$LoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `includeCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-cookies` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnDistribution$LoggingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :include-cookies)]
    (. builder includeCookies data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-distribution-logging-property-builder
  "Creates a  `CfnDistribution$LoggingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-logging-property-builder> (new CfnDistribution$LoggingProperty$Builder) id config))


(defn cfn-distribution-origin-custom-header-property-builder>
  "The cfn-distribution-origin-custom-header-property-builder> function updates a CfnDistribution$OriginCustomHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginCustomHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `headerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-value` |
"
  [^CfnDistribution$OriginCustomHeaderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-some [data (lookup-entry config id :header-value)]
    (. builder headerValue data))
  (.build builder))


(defn cfn-distribution-origin-custom-header-property-builder
  "Creates a  `CfnDistribution$OriginCustomHeaderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-custom-header-property-builder> (new CfnDistribution$OriginCustomHeaderProperty$Builder) id config))


(defn cfn-distribution-origin-group-failover-criteria-property-builder>
  "The cfn-distribution-origin-group-failover-criteria-property-builder> function updates a CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statusCodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:status-codes` |
"
  [^CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status-codes)]
    (. builder statusCodes data))
  (.build builder))


(defn cfn-distribution-origin-group-failover-criteria-property-builder
  "Creates a  `CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-group-failover-criteria-property-builder> (new CfnDistribution$OriginGroupFailoverCriteriaProperty$Builder) id config))


(defn cfn-distribution-origin-group-member-property-builder>
  "The cfn-distribution-origin-group-member-property-builder> function updates a CfnDistribution$OriginGroupMemberProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginGroupMemberProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
"
  [^CfnDistribution$OriginGroupMemberProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (.build builder))


(defn cfn-distribution-origin-group-member-property-builder
  "Creates a  `CfnDistribution$OriginGroupMemberProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-group-member-property-builder> (new CfnDistribution$OriginGroupMemberProperty$Builder) id config))


(defn cfn-distribution-origin-group-members-property-builder>
  "The cfn-distribution-origin-group-members-property-builder> function updates a CfnDistribution$OriginGroupMembersProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginGroupMembersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |
"
  [^CfnDistribution$OriginGroupMembersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :quantity)]
    (. builder quantity data))
  (.build builder))


(defn cfn-distribution-origin-group-members-property-builder
  "Creates a  `CfnDistribution$OriginGroupMembersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-group-members-property-builder> (new CfnDistribution$OriginGroupMembersProperty$Builder) id config))


(defn cfn-distribution-origin-group-property-builder>
  "The cfn-distribution-origin-group-property-builder> function updates a CfnDistribution$OriginGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverCriteria` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginGroupFailoverCriteriaProperty | [[cdk.support/lookup-entry]] | `:failover-criteria` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `members` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginGroupMembersProperty | [[cdk.support/lookup-entry]] | `:members` |
"
  [^CfnDistribution$OriginGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failover-criteria)]
    (. builder failoverCriteria data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :members)]
    (. builder members data))
  (.build builder))


(defn cfn-distribution-origin-group-property-builder
  "Creates a  `CfnDistribution$OriginGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-group-property-builder> (new CfnDistribution$OriginGroupProperty$Builder) id config))


(defn cfn-distribution-origin-groups-property-builder>
  "The cfn-distribution-origin-groups-property-builder> function updates a CfnDistribution$OriginGroupsProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginGroupsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |
"
  [^CfnDistribution$OriginGroupsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :quantity)]
    (. builder quantity data))
  (.build builder))


(defn cfn-distribution-origin-groups-property-builder
  "Creates a  `CfnDistribution$OriginGroupsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-groups-property-builder> (new CfnDistribution$OriginGroupsProperty$Builder) id config))


(defn cfn-distribution-origin-property-builder>
  "The cfn-distribution-origin-property-builder> function updates a CfnDistribution$OriginProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `s3OriginConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$S3OriginConfigProperty | [[cdk.support/lookup-entry]] | `:s3-origin-config` |
"
  [^CfnDistribution$OriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-origin-config)]
    (. builder customOriginConfig data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :origin-access-control-id)]
    (. builder originAccessControlId data))
  (when-some [data (lookup-entry config id :origin-custom-headers)]
    (. builder originCustomHeaders data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield)]
    (. builder originShield data))
  (when-some [data (lookup-entry config id :s3-origin-config)]
    (. builder s3OriginConfig data))
  (.build builder))


(defn cfn-distribution-origin-property-builder
  "Creates a  `CfnDistribution$OriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-property-builder> (new CfnDistribution$OriginProperty$Builder) id config))


(defn cfn-distribution-origin-shield-property-builder>
  "The cfn-distribution-origin-shield-property-builder> function updates a CfnDistribution$OriginShieldProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$OriginShieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^CfnDistribution$OriginShieldProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn cfn-distribution-origin-shield-property-builder
  "Creates a  `CfnDistribution$OriginShieldProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-origin-shield-property-builder> (new CfnDistribution$OriginShieldProperty$Builder) id config))


(defn cfn-distribution-props-builder>
  "The cfn-distribution-props-builder> function updates a CfnDistributionProps$Builder instance using the provided configuration.
  The function takes the CfnDistributionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionConfig` | software.amazon.awscdk.services.cloudfront.CfnDistribution$DistributionConfigProperty | [[cdk.support/lookup-entry]] | `:distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistributionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-config)]
    (. builder distributionConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-props-builder
  "Creates a  `CfnDistributionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-props-builder> (new CfnDistributionProps$Builder) id config))


(defn cfn-distribution-restrictions-property-builder>
  "The cfn-distribution-restrictions-property-builder> function updates a CfnDistribution$RestrictionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$RestrictionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `geoRestriction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-restriction` |
"
  [^CfnDistribution$RestrictionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :geo-restriction)]
    (. builder geoRestriction data))
  (.build builder))


(defn cfn-distribution-restrictions-property-builder
  "Creates a  `CfnDistribution$RestrictionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-restrictions-property-builder> (new CfnDistribution$RestrictionsProperty$Builder) id config))


(defn cfn-distribution-s3-origin-config-property-builder>
  "The cfn-distribution-s3-origin-config-property-builder> function updates a CfnDistribution$S3OriginConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$S3OriginConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
"
  [^CfnDistribution$S3OriginConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (.build builder))


(defn cfn-distribution-s3-origin-config-property-builder
  "Creates a  `CfnDistribution$S3OriginConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-s3-origin-config-property-builder> (new CfnDistribution$S3OriginConfigProperty$Builder) id config))


(defn cfn-distribution-status-codes-property-builder>
  "The cfn-distribution-status-codes-property-builder> function updates a CfnDistribution$StatusCodesProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$StatusCodesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `quantity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:quantity` |
"
  [^CfnDistribution$StatusCodesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :quantity)]
    (. builder quantity data))
  (.build builder))


(defn cfn-distribution-status-codes-property-builder
  "Creates a  `CfnDistribution$StatusCodesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-status-codes-property-builder> (new CfnDistribution$StatusCodesProperty$Builder) id config))


(defn cfn-distribution-viewer-certificate-property-builder>
  "The cfn-distribution-viewer-certificate-property-builder> function updates a CfnDistribution$ViewerCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$ViewerCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acmCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:acm-certificate-arn` |
| `cloudFrontDefaultCertificate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-front-default-certificate` |
| `iamCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-certificate-id` |
| `minimumProtocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:minimum-protocol-version` |
| `sslSupportMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-support-method` |
"
  [^CfnDistribution$ViewerCertificateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :acm-certificate-arn)]
    (. builder acmCertificateArn data))
  (when-some [data (lookup-entry config id :cloud-front-default-certificate)]
    (. builder cloudFrontDefaultCertificate data))
  (when-some [data (lookup-entry config id :iam-certificate-id)]
    (. builder iamCertificateId data))
  (when-some [data (lookup-entry config id :minimum-protocol-version)]
    (. builder minimumProtocolVersion data))
  (when-some [data (lookup-entry config id :ssl-support-method)]
    (. builder sslSupportMethod data))
  (.build builder))


(defn cfn-distribution-viewer-certificate-property-builder
  "Creates a  `CfnDistribution$ViewerCertificateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-viewer-certificate-property-builder> (new CfnDistribution$ViewerCertificateProperty$Builder) id config))


(defn cfn-function-builder>
  "The cfn-function-builder> function updates a CfnFunction$Builder instance using the provided configuration.
  The function takes the CfnFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `functionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-code` |
| `functionConfig` | software.amazon.awscdk.services.cloudfront.CfnFunction$FunctionConfigProperty | [[cdk.support/lookup-entry]] | `:function-config` |
| `functionMetadata` | software.amazon.awscdk.services.cloudfront.CfnFunction$FunctionMetadataProperty | [[cdk.support/lookup-entry]] | `:function-metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFunction$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-publish)]
    (. builder autoPublish data))
  (when-some [data (lookup-entry config id :function-code)]
    (. builder functionCode data))
  (when-some [data (lookup-entry config id :function-config)]
    (. builder functionConfig data))
  (when-some [data (lookup-entry config id :function-metadata)]
    (. builder functionMetadata data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-function-builder
  "Creates a  `CfnFunction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-function-builder> (CfnFunction$Builder/create scope (name id)) id config))


(defn cfn-function-function-config-property-builder>
  "The cfn-function-function-config-property-builder> function updates a CfnFunction$FunctionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FunctionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:key-value-store-associations` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^CfnFunction$FunctionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :key-value-store-associations)]
    (. builder keyValueStoreAssociations data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (.build builder))


(defn cfn-function-function-config-property-builder
  "Creates a  `CfnFunction$FunctionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-function-function-config-property-builder> (new CfnFunction$FunctionConfigProperty$Builder) id config))


(defn cfn-function-function-metadata-property-builder>
  "The cfn-function-function-metadata-property-builder> function updates a CfnFunction$FunctionMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$FunctionMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
"
  [^CfnFunction$FunctionMetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (.build builder))


(defn cfn-function-function-metadata-property-builder
  "Creates a  `CfnFunction$FunctionMetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-function-function-metadata-property-builder> (new CfnFunction$FunctionMetadataProperty$Builder) id config))


(defn cfn-function-key-value-store-association-property-builder>
  "The cfn-function-key-value-store-association-property-builder> function updates a CfnFunction$KeyValueStoreAssociationProperty$Builder instance using the provided configuration.
  The function takes the CfnFunction$KeyValueStoreAssociationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyValueStoreArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-arn` |
"
  [^CfnFunction$KeyValueStoreAssociationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-value-store-arn)]
    (. builder keyValueStoreArn data))
  (.build builder))


(defn cfn-function-key-value-store-association-property-builder
  "Creates a  `CfnFunction$KeyValueStoreAssociationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-function-key-value-store-association-property-builder> (new CfnFunction$KeyValueStoreAssociationProperty$Builder) id config))


(defn cfn-function-props-builder>
  "The cfn-function-props-builder> function updates a CfnFunctionProps$Builder instance using the provided configuration.
  The function takes the CfnFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `functionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-code` |
| `functionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-config` |
| `functionMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:function-metadata` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFunctionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-publish)]
    (. builder autoPublish data))
  (when-some [data (lookup-entry config id :function-code)]
    (. builder functionCode data))
  (when-some [data (lookup-entry config id :function-config)]
    (. builder functionConfig data))
  (when-some [data (lookup-entry config id :function-metadata)]
    (. builder functionMetadata data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-function-props-builder
  "Creates a  `CfnFunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-function-props-builder> (new CfnFunctionProps$Builder) id config))


(defn cfn-key-group-builder>
  "The cfn-key-group-builder> function updates a CfnKeyGroup$Builder instance using the provided configuration.
  The function takes the CfnKeyGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyGroupConfig` | software.amazon.awscdk.services.cloudfront.CfnKeyGroup$KeyGroupConfigProperty | [[cdk.support/lookup-entry]] | `:key-group-config` |
"
  [^CfnKeyGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :key-group-config)]
    (. builder keyGroupConfig data))
  (.build builder))


(defn cfn-key-group-builder
  "Creates a  `CfnKeyGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-key-group-builder> (CfnKeyGroup$Builder/create scope (name id)) id config))


(defn cfn-key-group-key-group-config-property-builder>
  "The cfn-key-group-key-group-config-property-builder> function updates a CfnKeyGroup$KeyGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnKeyGroup$KeyGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnKeyGroup$KeyGroupConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-key-group-key-group-config-property-builder
  "Creates a  `CfnKeyGroup$KeyGroupConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-key-group-key-group-config-property-builder> (new CfnKeyGroup$KeyGroupConfigProperty$Builder) id config))


(defn cfn-key-group-props-builder>
  "The cfn-key-group-props-builder> function updates a CfnKeyGroupProps$Builder instance using the provided configuration.
  The function takes the CfnKeyGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyGroupConfig` | software.amazon.awscdk.services.cloudfront.CfnKeyGroup$KeyGroupConfigProperty | [[cdk.support/lookup-entry]] | `:key-group-config` |
"
  [^CfnKeyGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :key-group-config)]
    (. builder keyGroupConfig data))
  (.build builder))


(defn cfn-key-group-props-builder
  "Creates a  `CfnKeyGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-key-group-props-builder> (new CfnKeyGroupProps$Builder) id config))


(defn cfn-key-value-store-builder>
  "The cfn-key-value-store-builder> function updates a CfnKeyValueStore$Builder instance using the provided configuration.
  The function takes the CfnKeyValueStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `importSource` | software.amazon.awscdk.services.cloudfront.CfnKeyValueStore$ImportSourceProperty | [[cdk.support/lookup-entry]] | `:import-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnKeyValueStore$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :import-source)]
    (. builder importSource data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-key-value-store-builder
  "Creates a  `CfnKeyValueStore$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-key-value-store-builder> (CfnKeyValueStore$Builder/create scope (name id)) id config))


(defn cfn-key-value-store-import-source-property-builder>
  "The cfn-key-value-store-import-source-property-builder> function updates a CfnKeyValueStore$ImportSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnKeyValueStore$ImportSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
"
  [^CfnKeyValueStore$ImportSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (.build builder))


(defn cfn-key-value-store-import-source-property-builder
  "Creates a  `CfnKeyValueStore$ImportSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-key-value-store-import-source-property-builder> (new CfnKeyValueStore$ImportSourceProperty$Builder) id config))


(defn cfn-key-value-store-props-builder>
  "The cfn-key-value-store-props-builder> function updates a CfnKeyValueStoreProps$Builder instance using the provided configuration.
  The function takes the CfnKeyValueStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `importSource` | software.amazon.awscdk.services.cloudfront.CfnKeyValueStore$ImportSourceProperty | [[cdk.support/lookup-entry]] | `:import-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnKeyValueStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :import-source)]
    (. builder importSource data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-key-value-store-props-builder
  "Creates a  `CfnKeyValueStoreProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-key-value-store-props-builder> (new CfnKeyValueStoreProps$Builder) id config))


(defn cfn-monitoring-subscription-builder>
  "The cfn-monitoring-subscription-builder> function updates a CfnMonitoringSubscription$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `monitoringSubscription` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring-subscription` |
"
  [^CfnMonitoringSubscription$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-id)]
    (. builder distributionId data))
  (when-some [data (lookup-entry config id :monitoring-subscription)]
    (. builder monitoringSubscription data))
  (.build builder))


(defn cfn-monitoring-subscription-builder
  "Creates a  `CfnMonitoringSubscription$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-monitoring-subscription-builder> (CfnMonitoringSubscription$Builder/create scope (name id)) id config))


(defn cfn-monitoring-subscription-monitoring-subscription-property-builder>
  "The cfn-monitoring-subscription-monitoring-subscription-property-builder> function updates a CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `realtimeMetricsSubscriptionConfig` | software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty | [[cdk.support/lookup-entry]] | `:realtime-metrics-subscription-config` |
"
  [^CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :realtime-metrics-subscription-config)]
    (. builder realtimeMetricsSubscriptionConfig data))
  (.build builder))


(defn cfn-monitoring-subscription-monitoring-subscription-property-builder
  "Creates a  `CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitoring-subscription-monitoring-subscription-property-builder> (new CfnMonitoringSubscription$MonitoringSubscriptionProperty$Builder) id config))


(defn cfn-monitoring-subscription-props-builder>
  "The cfn-monitoring-subscription-props-builder> function updates a CfnMonitoringSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `monitoringSubscription` | software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription$MonitoringSubscriptionProperty | [[cdk.support/lookup-entry]] | `:monitoring-subscription` |
"
  [^CfnMonitoringSubscriptionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-id)]
    (. builder distributionId data))
  (when-some [data (lookup-entry config id :monitoring-subscription)]
    (. builder monitoringSubscription data))
  (.build builder))


(defn cfn-monitoring-subscription-props-builder
  "Creates a  `CfnMonitoringSubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitoring-subscription-props-builder> (new CfnMonitoringSubscriptionProps$Builder) id config))


(defn cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder>
  "The cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder> function updates a CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `realtimeMetricsSubscriptionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-metrics-subscription-status` |
"
  [^CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :realtime-metrics-subscription-status)]
    (. builder realtimeMetricsSubscriptionStatus data))
  (.build builder))


(defn cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder
  "Creates a  `CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-monitoring-subscription-realtime-metrics-subscription-config-property-builder> (new CfnMonitoringSubscription$RealtimeMetricsSubscriptionConfigProperty$Builder) id config))


(defn cfn-origin-access-control-builder>
  "The cfn-origin-access-control-builder> function updates a CfnOriginAccessControl$Builder instance using the provided configuration.
  The function takes the CfnOriginAccessControl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessControlConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl$OriginAccessControlConfigProperty | [[cdk.support/lookup-entry]] | `:origin-access-control-config` |
"
  [^CfnOriginAccessControl$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-access-control-config)]
    (. builder originAccessControlConfig data))
  (.build builder))


(defn cfn-origin-access-control-builder
  "Creates a  `CfnOriginAccessControl$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-origin-access-control-builder> (CfnOriginAccessControl$Builder/create scope (name id)) id config))


(defn cfn-origin-access-control-origin-access-control-config-property-builder>
  "The cfn-origin-access-control-origin-access-control-config-property-builder> function updates a CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `originAccessControlOriginType` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-control-origin-type` |
| `signingBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-behavior` |
| `signingProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-protocol` |
"
  [^CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :origin-access-control-origin-type)]
    (. builder originAccessControlOriginType data))
  (when-some [data (lookup-entry config id :signing-behavior)]
    (. builder signingBehavior data))
  (when-some [data (lookup-entry config id :signing-protocol)]
    (. builder signingProtocol data))
  (.build builder))


(defn cfn-origin-access-control-origin-access-control-config-property-builder
  "Creates a  `CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-access-control-origin-access-control-config-property-builder> (new CfnOriginAccessControl$OriginAccessControlConfigProperty$Builder) id config))


(defn cfn-origin-access-control-props-builder>
  "The cfn-origin-access-control-props-builder> function updates a CfnOriginAccessControlProps$Builder instance using the provided configuration.
  The function takes the CfnOriginAccessControlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessControlConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl$OriginAccessControlConfigProperty | [[cdk.support/lookup-entry]] | `:origin-access-control-config` |
"
  [^CfnOriginAccessControlProps$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-access-control-config)]
    (. builder originAccessControlConfig data))
  (.build builder))


(defn cfn-origin-access-control-props-builder
  "Creates a  `CfnOriginAccessControlProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-access-control-props-builder> (new CfnOriginAccessControlProps$Builder) id config))


(defn cfn-origin-request-policy-builder>
  "The cfn-origin-request-policy-builder> function updates a CfnOriginRequestPolicy$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originRequestPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:origin-request-policy-config` |
"
  [^CfnOriginRequestPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-request-policy-config)]
    (. builder originRequestPolicyConfig data))
  (.build builder))


(defn cfn-origin-request-policy-builder
  "Creates a  `CfnOriginRequestPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-origin-request-policy-builder> (CfnOriginRequestPolicy$Builder/create scope (name id)) id config))


(defn cfn-origin-request-policy-cookies-config-property-builder>
  "The cfn-origin-request-policy-cookies-config-property-builder> function updates a CfnOriginRequestPolicy$CookiesConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicy$CookiesConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `cookies` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies` |
"
  [^CfnOriginRequestPolicy$CookiesConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :cookies)]
    (. builder cookies data))
  (.build builder))


(defn cfn-origin-request-policy-cookies-config-property-builder
  "Creates a  `CfnOriginRequestPolicy$CookiesConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-request-policy-cookies-config-property-builder> (new CfnOriginRequestPolicy$CookiesConfigProperty$Builder) id config))


(defn cfn-origin-request-policy-headers-config-property-builder>
  "The cfn-origin-request-policy-headers-config-property-builder> function updates a CfnOriginRequestPolicy$HeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicy$HeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headerBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
"
  [^CfnOriginRequestPolicy$HeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (.build builder))


(defn cfn-origin-request-policy-headers-config-property-builder
  "Creates a  `CfnOriginRequestPolicy$HeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-request-policy-headers-config-property-builder> (new CfnOriginRequestPolicy$HeadersConfigProperty$Builder) id config))


(defn cfn-origin-request-policy-origin-request-policy-config-property-builder>
  "The cfn-origin-request-policy-origin-request-policy-config-property-builder> function updates a CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookiesConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookies-config` |
| `headersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryStringsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-strings-config` |
"
  [^CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cookies-config)]
    (. builder cookiesConfig data))
  (when-some [data (lookup-entry config id :headers-config)]
    (. builder headersConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :query-strings-config)]
    (. builder queryStringsConfig data))
  (.build builder))


(defn cfn-origin-request-policy-origin-request-policy-config-property-builder
  "Creates a  `CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-request-policy-origin-request-policy-config-property-builder> (new CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty$Builder) id config))


(defn cfn-origin-request-policy-props-builder>
  "The cfn-origin-request-policy-props-builder> function updates a CfnOriginRequestPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originRequestPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy$OriginRequestPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:origin-request-policy-config` |
"
  [^CfnOriginRequestPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-request-policy-config)]
    (. builder originRequestPolicyConfig data))
  (.build builder))


(defn cfn-origin-request-policy-props-builder
  "Creates a  `CfnOriginRequestPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-request-policy-props-builder> (new CfnOriginRequestPolicyProps$Builder) id config))


(defn cfn-origin-request-policy-query-strings-config-property-builder>
  "The cfn-origin-request-policy-query-strings-config-property-builder> function updates a CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStringBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
| `queryStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings` |
"
  [^CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (when-some [data (lookup-entry config id :query-strings)]
    (. builder queryStrings data))
  (.build builder))


(defn cfn-origin-request-policy-query-strings-config-property-builder
  "Creates a  `CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-origin-request-policy-query-strings-config-property-builder> (new CfnOriginRequestPolicy$QueryStringsConfigProperty$Builder) id config))


(defn cfn-public-key-builder>
  "The cfn-public-key-builder> function updates a CfnPublicKey$Builder instance using the provided configuration.
  The function takes the CfnPublicKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicKeyConfig` | software.amazon.awscdk.services.cloudfront.CfnPublicKey$PublicKeyConfigProperty | [[cdk.support/lookup-entry]] | `:public-key-config` |
"
  [^CfnPublicKey$Builder builder id config]
  (when-some [data (lookup-entry config id :public-key-config)]
    (. builder publicKeyConfig data))
  (.build builder))


(defn cfn-public-key-builder
  "Creates a  `CfnPublicKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-public-key-builder> (CfnPublicKey$Builder/create scope (name id)) id config))


(defn cfn-public-key-props-builder>
  "The cfn-public-key-props-builder> function updates a CfnPublicKeyProps$Builder instance using the provided configuration.
  The function takes the CfnPublicKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicKeyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-key-config` |
"
  [^CfnPublicKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :public-key-config)]
    (. builder publicKeyConfig data))
  (.build builder))


(defn cfn-public-key-props-builder
  "Creates a  `CfnPublicKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-public-key-props-builder> (new CfnPublicKeyProps$Builder) id config))


(defn cfn-public-key-public-key-config-property-builder>
  "The cfn-public-key-public-key-config-property-builder> function updates a CfnPublicKey$PublicKeyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnPublicKey$PublicKeyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `callerReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:caller-reference` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnPublicKey$PublicKeyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :caller-reference)]
    (. builder callerReference data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :encoded-key)]
    (. builder encodedKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-public-key-public-key-config-property-builder
  "Creates a  `CfnPublicKey$PublicKeyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-public-key-public-key-config-property-builder> (new CfnPublicKey$PublicKeyConfigProperty$Builder) id config))


(defn cfn-realtime-log-config-builder>
  "The cfn-realtime-log-config-builder> function updates a CfnRealtimeLogConfig$Builder instance using the provided configuration.
  The function takes the CfnRealtimeLogConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
"
  [^CfnRealtimeLogConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :end-points)]
    (. builder endPoints data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (.build builder))


(defn cfn-realtime-log-config-builder
  "Creates a  `CfnRealtimeLogConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-realtime-log-config-builder> (CfnRealtimeLogConfig$Builder/create scope (name id)) id config))


(defn cfn-realtime-log-config-end-point-property-builder>
  "The cfn-realtime-log-config-end-point-property-builder> function updates a CfnRealtimeLogConfig$EndPointProperty$Builder instance using the provided configuration.
  The function takes the CfnRealtimeLogConfig$EndPointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kinesisStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `streamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-type` |
"
  [^CfnRealtimeLogConfig$EndPointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kinesis-stream-config)]
    (. builder kinesisStreamConfig data))
  (when-some [data (lookup-entry config id :stream-type)]
    (. builder streamType data))
  (.build builder))


(defn cfn-realtime-log-config-end-point-property-builder
  "Creates a  `CfnRealtimeLogConfig$EndPointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-realtime-log-config-end-point-property-builder> (new CfnRealtimeLogConfig$EndPointProperty$Builder) id config))


(defn cfn-realtime-log-config-kinesis-stream-config-property-builder>
  "The cfn-realtime-log-config-kinesis-stream-config-property-builder> function updates a CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn cfn-realtime-log-config-kinesis-stream-config-property-builder
  "Creates a  `CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-realtime-log-config-kinesis-stream-config-property-builder> (new CfnRealtimeLogConfig$KinesisStreamConfigProperty$Builder) id config))


(defn cfn-realtime-log-config-props-builder>
  "The cfn-realtime-log-config-props-builder> function updates a CfnRealtimeLogConfigProps$Builder instance using the provided configuration.
  The function takes the CfnRealtimeLogConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
"
  [^CfnRealtimeLogConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :end-points)]
    (. builder endPoints data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (.build builder))


(defn cfn-realtime-log-config-props-builder
  "Creates a  `CfnRealtimeLogConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-realtime-log-config-props-builder> (new CfnRealtimeLogConfigProps$Builder) id config))


(defn cfn-response-headers-policy-access-control-allow-headers-property-builder>
  "The cfn-response-headers-policy-access-control-allow-headers-property-builder> function updates a CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-access-control-allow-headers-property-builder
  "Creates a  `CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-access-control-allow-headers-property-builder> (new CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty$Builder) id config))


(defn cfn-response-headers-policy-access-control-allow-methods-property-builder>
  "The cfn-response-headers-policy-access-control-allow-methods-property-builder> function updates a CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-access-control-allow-methods-property-builder
  "Creates a  `CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-access-control-allow-methods-property-builder> (new CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty$Builder) id config))


(defn cfn-response-headers-policy-access-control-allow-origins-property-builder>
  "The cfn-response-headers-policy-access-control-allow-origins-property-builder> function updates a CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-access-control-allow-origins-property-builder
  "Creates a  `CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-access-control-allow-origins-property-builder> (new CfnResponseHeadersPolicy$AccessControlAllowOriginsProperty$Builder) id config))


(defn cfn-response-headers-policy-access-control-expose-headers-property-builder>
  "The cfn-response-headers-policy-access-control-expose-headers-property-builder> function updates a CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-access-control-expose-headers-property-builder
  "Creates a  `CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-access-control-expose-headers-property-builder> (new CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty$Builder) id config))


(defn cfn-response-headers-policy-builder>
  "The cfn-response-headers-policy-builder> function updates a CfnResponseHeadersPolicy$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeadersPolicyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers-policy-config` |
"
  [^CfnResponseHeadersPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :response-headers-policy-config)]
    (. builder responseHeadersPolicyConfig data))
  (.build builder))


(defn cfn-response-headers-policy-builder
  "Creates a  `CfnResponseHeadersPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-response-headers-policy-builder> (CfnResponseHeadersPolicy$Builder/create scope (name id)) id config))


(defn cfn-response-headers-policy-content-security-policy-property-builder>
  "The cfn-response-headers-policy-content-security-policy-property-builder> function updates a CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |
"
  [^CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-security-policy)]
    (. builder contentSecurityPolicy data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn cfn-response-headers-policy-content-security-policy-property-builder
  "Creates a  `CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-content-security-policy-property-builder> (new CfnResponseHeadersPolicy$ContentSecurityPolicyProperty$Builder) id config))


(defn cfn-response-headers-policy-content-type-options-property-builder>
  "The cfn-response-headers-policy-content-type-options-property-builder> function updates a CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |
"
  [^CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn cfn-response-headers-policy-content-type-options-property-builder
  "Creates a  `CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-content-type-options-property-builder> (new CfnResponseHeadersPolicy$ContentTypeOptionsProperty$Builder) id config))


(defn cfn-response-headers-policy-cors-config-property-builder>
  "The cfn-response-headers-policy-cors-config-property-builder> function updates a CfnResponseHeadersPolicy$CorsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$CorsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAllowCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-allow-credentials` |
| `accessControlAllowHeaders` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlAllowHeadersProperty | [[cdk.support/lookup-entry]] | `:access-control-allow-headers` |
| `accessControlAllowMethods` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlAllowMethodsProperty | [[cdk.support/lookup-entry]] | `:access-control-allow-methods` |
| `accessControlAllowOrigins` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-allow-origins` |
| `accessControlExposeHeaders` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$AccessControlExposeHeadersProperty | [[cdk.support/lookup-entry]] | `:access-control-expose-headers` |
| `accessControlMaxAgeSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-control-max-age-sec` |
| `originOverride` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:origin-override` |
"
  [^CfnResponseHeadersPolicy$CorsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-allow-credentials)]
    (. builder accessControlAllowCredentials data))
  (when-some [data (lookup-entry config id :access-control-allow-headers)]
    (. builder accessControlAllowHeaders data))
  (when-some [data (lookup-entry config id :access-control-allow-methods)]
    (. builder accessControlAllowMethods data))
  (when-some [data (lookup-entry config id :access-control-allow-origins)]
    (. builder accessControlAllowOrigins data))
  (when-some [data (lookup-entry config id :access-control-expose-headers)]
    (. builder accessControlExposeHeaders data))
  (when-some [data (lookup-entry config id :access-control-max-age-sec)]
    (. builder accessControlMaxAgeSec data))
  (when-some [data (lookup-entry config id :origin-override)]
    (. builder originOverride data))
  (.build builder))


(defn cfn-response-headers-policy-cors-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$CorsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-cors-config-property-builder> (new CfnResponseHeadersPolicy$CorsConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-custom-header-property-builder>
  "The cfn-response-headers-policy-custom-header-property-builder> function updates a CfnResponseHeadersPolicy$CustomHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$CustomHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnResponseHeadersPolicy$CustomHeaderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-response-headers-policy-custom-header-property-builder
  "Creates a  `CfnResponseHeadersPolicy$CustomHeaderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-custom-header-property-builder> (new CfnResponseHeadersPolicy$CustomHeaderProperty$Builder) id config))


(defn cfn-response-headers-policy-custom-headers-config-property-builder>
  "The cfn-response-headers-policy-custom-headers-config-property-builder> function updates a CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-custom-headers-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-custom-headers-config-property-builder> (new CfnResponseHeadersPolicy$CustomHeadersConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-frame-options-property-builder>
  "The cfn-response-headers-policy-frame-options-property-builder> function updates a CfnResponseHeadersPolicy$FrameOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$FrameOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:frame-option` |
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |
"
  [^CfnResponseHeadersPolicy$FrameOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :frame-option)]
    (. builder frameOption data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn cfn-response-headers-policy-frame-options-property-builder
  "Creates a  `CfnResponseHeadersPolicy$FrameOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-frame-options-property-builder> (new CfnResponseHeadersPolicy$FrameOptionsProperty$Builder) id config))


(defn cfn-response-headers-policy-props-builder>
  "The cfn-response-headers-policy-props-builder> function updates a CfnResponseHeadersPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `responseHeadersPolicyConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty | [[cdk.support/lookup-entry]] | `:response-headers-policy-config` |
"
  [^CfnResponseHeadersPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :response-headers-policy-config)]
    (. builder responseHeadersPolicyConfig data))
  (.build builder))


(defn cfn-response-headers-policy-props-builder
  "Creates a  `CfnResponseHeadersPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-props-builder> (new CfnResponseHeadersPolicyProps$Builder) id config))


(defn cfn-response-headers-policy-referrer-policy-property-builder>
  "The cfn-response-headers-policy-referrer-policy-property-builder> function updates a CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:override` |
| `referrerPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:referrer-policy` |
"
  [^CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :referrer-policy)]
    (. builder referrerPolicy data))
  (.build builder))


(defn cfn-response-headers-policy-referrer-policy-property-builder
  "Creates a  `CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-referrer-policy-property-builder> (new CfnResponseHeadersPolicy$ReferrerPolicyProperty$Builder) id config))


(defn cfn-response-headers-policy-remove-header-property-builder>
  "The cfn-response-headers-policy-remove-header-property-builder> function updates a CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
"
  [^CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (.build builder))


(defn cfn-response-headers-policy-remove-header-property-builder
  "Creates a  `CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-remove-header-property-builder> (new CfnResponseHeadersPolicy$RemoveHeaderProperty$Builder) id config))


(defn cfn-response-headers-policy-remove-headers-config-property-builder>
  "The cfn-response-headers-policy-remove-headers-config-property-builder> function updates a CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
"
  [^CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (.build builder))


(defn cfn-response-headers-policy-remove-headers-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-remove-headers-config-property-builder> (new CfnResponseHeadersPolicy$RemoveHeadersConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-response-headers-policy-config-property-builder>
  "The cfn-response-headers-policy-response-headers-policy-config-property-builder> function updates a CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$CorsConfigProperty | [[cdk.support/lookup-entry]] | `:cors-config` |
| `customHeadersConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$CustomHeadersConfigProperty | [[cdk.support/lookup-entry]] | `:custom-headers-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `removeHeadersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-headers-config` |
| `securityHeadersConfig` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$SecurityHeadersConfigProperty | [[cdk.support/lookup-entry]] | `:security-headers-config` |
| `serverTimingHeadersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-timing-headers-config` |
"
  [^CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cors-config)]
    (. builder corsConfig data))
  (when-some [data (lookup-entry config id :custom-headers-config)]
    (. builder customHeadersConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :remove-headers-config)]
    (. builder removeHeadersConfig data))
  (when-some [data (lookup-entry config id :security-headers-config)]
    (. builder securityHeadersConfig data))
  (when-some [data (lookup-entry config id :server-timing-headers-config)]
    (. builder serverTimingHeadersConfig data))
  (.build builder))


(defn cfn-response-headers-policy-response-headers-policy-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-response-headers-policy-config-property-builder> (new CfnResponseHeadersPolicy$ResponseHeadersPolicyConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-security-headers-config-property-builder>
  "The cfn-response-headers-policy-security-headers-config-property-builder> function updates a CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$ContentSecurityPolicyProperty | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `contentTypeOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content-type-options` |
| `frameOptions` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$FrameOptionsProperty | [[cdk.support/lookup-entry]] | `:frame-options` |
| `referrerPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:referrer-policy` |
| `strictTransportSecurity` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$StrictTransportSecurityProperty | [[cdk.support/lookup-entry]] | `:strict-transport-security` |
| `xssProtection` | software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy$XSSProtectionProperty | [[cdk.support/lookup-entry]] | `:xss-protection` |
"
  [^CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-security-policy)]
    (. builder contentSecurityPolicy data))
  (when-some [data (lookup-entry config id :content-type-options)]
    (. builder contentTypeOptions data))
  (when-some [data (lookup-entry config id :frame-options)]
    (. builder frameOptions data))
  (when-some [data (lookup-entry config id :referrer-policy)]
    (. builder referrerPolicy data))
  (when-some [data (lookup-entry config id :strict-transport-security)]
    (. builder strictTransportSecurity data))
  (when-some [data (lookup-entry config id :xss-protection)]
    (. builder xssProtection data))
  (.build builder))


(defn cfn-response-headers-policy-security-headers-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-security-headers-config-property-builder> (new CfnResponseHeadersPolicy$SecurityHeadersConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-server-timing-headers-config-property-builder>
  "The cfn-response-headers-policy-server-timing-headers-config-property-builder> function updates a CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
"
  [^CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (.build builder))


(defn cfn-response-headers-policy-server-timing-headers-config-property-builder
  "Creates a  `CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-server-timing-headers-config-property-builder> (new CfnResponseHeadersPolicy$ServerTimingHeadersConfigProperty$Builder) id config))


(defn cfn-response-headers-policy-strict-transport-security-property-builder>
  "The cfn-response-headers-policy-strict-transport-security-property-builder> function updates a CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlMaxAgeSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:access-control-max-age-sec` |
| `includeSubdomains` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-subdomains` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `preload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preload` |
"
  [^CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-max-age-sec)]
    (. builder accessControlMaxAgeSec data))
  (when-some [data (lookup-entry config id :include-subdomains)]
    (. builder includeSubdomains data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :preload)]
    (. builder preload data))
  (.build builder))


(defn cfn-response-headers-policy-strict-transport-security-property-builder
  "Creates a  `CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-strict-transport-security-property-builder> (new CfnResponseHeadersPolicy$StrictTransportSecurityProperty$Builder) id config))


(defn cfn-response-headers-policy-xss-protection-property-builder>
  "The cfn-response-headers-policy-xss-protection-property-builder> function updates a CfnResponseHeadersPolicy$XSSProtectionProperty$Builder instance using the provided configuration.
  The function takes the CfnResponseHeadersPolicy$XSSProtectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modeBlock` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mode-block` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `protection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protection` |
| `reportUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-uri` |
"
  [^CfnResponseHeadersPolicy$XSSProtectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode-block)]
    (. builder modeBlock data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :protection)]
    (. builder protection data))
  (when-some [data (lookup-entry config id :report-uri)]
    (. builder reportUri data))
  (.build builder))


(defn cfn-response-headers-policy-xss-protection-property-builder
  "Creates a  `CfnResponseHeadersPolicy$XSSProtectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-response-headers-policy-xss-protection-property-builder> (new CfnResponseHeadersPolicy$XSSProtectionProperty$Builder) id config))


(defn cfn-streaming-distribution-builder>
  "The cfn-streaming-distribution-builder> function updates a CfnStreamingDistribution$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistribution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamingDistributionConfig` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$StreamingDistributionConfigProperty | [[cdk.support/lookup-entry]] | `:streaming-distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamingDistribution$Builder builder id config]
  (when-some [data (lookup-entry config id :streaming-distribution-config)]
    (. builder streamingDistributionConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-streaming-distribution-builder
  "Creates a  `CfnStreamingDistribution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-streaming-distribution-builder> (CfnStreamingDistribution$Builder/create scope (name id)) id config))


(defn cfn-streaming-distribution-logging-property-builder>
  "The cfn-streaming-distribution-logging-property-builder> function updates a CfnStreamingDistribution$LoggingProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistribution$LoggingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnStreamingDistribution$LoggingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-streaming-distribution-logging-property-builder
  "Creates a  `CfnStreamingDistribution$LoggingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-streaming-distribution-logging-property-builder> (new CfnStreamingDistribution$LoggingProperty$Builder) id config))


(defn cfn-streaming-distribution-props-builder>
  "The cfn-streaming-distribution-props-builder> function updates a CfnStreamingDistributionProps$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistributionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamingDistributionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:streaming-distribution-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamingDistributionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :streaming-distribution-config)]
    (. builder streamingDistributionConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-streaming-distribution-props-builder
  "Creates a  `CfnStreamingDistributionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-streaming-distribution-props-builder> (new CfnStreamingDistributionProps$Builder) id config))


(defn cfn-streaming-distribution-s3-origin-property-builder>
  "The cfn-streaming-distribution-s3-origin-property-builder> function updates a CfnStreamingDistribution$S3OriginProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistribution$S3OriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `originAccessIdentity` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
"
  [^CfnStreamingDistribution$S3OriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (.build builder))


(defn cfn-streaming-distribution-s3-origin-property-builder
  "Creates a  `CfnStreamingDistribution$S3OriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-streaming-distribution-s3-origin-property-builder> (new CfnStreamingDistribution$S3OriginProperty$Builder) id config))


(defn cfn-streaming-distribution-streaming-distribution-config-property-builder>
  "The cfn-streaming-distribution-streaming-distribution-config-property-builder> function updates a CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logging` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$LoggingProperty | [[cdk.support/lookup-entry]] | `:logging` |
| `priceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:price-class` |
| `s3Origin` | software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution$S3OriginProperty | [[cdk.support/lookup-entry]] | `:s3-origin` |
| `trustedSigners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trusted-signers` |
"
  [^CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-some [data (lookup-entry config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :s3-origin)]
    (. builder s3Origin data))
  (when-some [data (lookup-entry config id :trusted-signers)]
    (. builder trustedSigners data))
  (.build builder))


(defn cfn-streaming-distribution-streaming-distribution-config-property-builder
  "Creates a  `CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-streaming-distribution-streaming-distribution-config-property-builder> (new CfnStreamingDistribution$StreamingDistributionConfigProperty$Builder) id config))


(defn cfn-streaming-distribution-trusted-signers-property-builder>
  "The cfn-streaming-distribution-trusted-signers-property-builder> function updates a CfnStreamingDistribution$TrustedSignersProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamingDistribution$TrustedSignersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountNumbers` | java.util.List | [[cdk.support/lookup-entry]] | `:aws-account-numbers` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnStreamingDistribution$TrustedSignersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-account-numbers)]
    (. builder awsAccountNumbers data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-streaming-distribution-trusted-signers-property-builder
  "Creates a  `CfnStreamingDistribution$TrustedSignersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-streaming-distribution-trusted-signers-property-builder> (new CfnStreamingDistribution$TrustedSignersProperty$Builder) id config))


(defn cloud-front-web-distribution-attributes-builder>
  "The cloud-front-web-distribution-attributes-builder> function updates a CloudFrontWebDistributionAttributes$Builder instance using the provided configuration.
  The function takes the CloudFrontWebDistributionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^CloudFrontWebDistributionAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-id)]
    (. builder distributionId data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn cloud-front-web-distribution-attributes-builder
  "Creates a  `CloudFrontWebDistributionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-front-web-distribution-attributes-builder> (new CloudFrontWebDistributionAttributes$Builder) id config))


(defn cloud-front-web-distribution-builder>
  "The cloud-front-web-distribution-builder> function updates a CloudFrontWebDistribution$Builder instance using the provided configuration.
  The function takes the CloudFrontWebDistribution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^CloudFrontWebDistribution$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :default-root-object)]
    (. builder defaultRootObject data))
  (when-some [data (lookup-entry config id :enable-ip-v6)]
    (. builder enableIpV6 data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :error-configurations)]
    (. builder errorConfigurations data))
  (when-some [data (lookup-entry config id :geo-restriction)]
    (. builder geoRestriction data))
  (when-some [data (http-version config id :http-version)]
    (. builder httpVersion data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :origin-configs)]
    (. builder originConfigs data))
  (when-some [data (price-class config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :viewer-certificate)]
    (. builder viewerCertificate data))
  (when-some [data (viewer-protocol-policy config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn cloud-front-web-distribution-builder
  "Creates a  `CloudFrontWebDistribution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cloud-front-web-distribution-builder> (CloudFrontWebDistribution$Builder/create scope (name id)) id config))


(defn cloud-front-web-distribution-props-builder>
  "The cloud-front-web-distribution-props-builder> function updates a CloudFrontWebDistributionProps$Builder instance using the provided configuration.
  The function takes the CloudFrontWebDistributionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^CloudFrontWebDistributionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :default-root-object)]
    (. builder defaultRootObject data))
  (when-some [data (lookup-entry config id :enable-ip-v6)]
    (. builder enableIpV6 data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :error-configurations)]
    (. builder errorConfigurations data))
  (when-some [data (lookup-entry config id :geo-restriction)]
    (. builder geoRestriction data))
  (when-some [data (http-version config id :http-version)]
    (. builder httpVersion data))
  (when-some [data (lookup-entry config id :logging-config)]
    (. builder loggingConfig data))
  (when-some [data (lookup-entry config id :origin-configs)]
    (. builder originConfigs data))
  (when-some [data (price-class config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :viewer-certificate)]
    (. builder viewerCertificate data))
  (when-some [data (viewer-protocol-policy config id :viewer-protocol-policy)]
    (. builder viewerProtocolPolicy data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn cloud-front-web-distribution-props-builder
  "Creates a  `CloudFrontWebDistributionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cloud-front-web-distribution-props-builder> (new CloudFrontWebDistributionProps$Builder) id config))


(defn custom-origin-config-builder>
  "The custom-origin-config-builder> function updates a CustomOriginConfig$Builder instance using the provided configuration.
  The function takes the CustomOriginConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^CustomOriginConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-origin-ssl-versions)]
    (. builder allowedOriginSslVersions data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :http-port)]
    (. builder httpPort data))
  (when-some [data (lookup-entry config id :https-port)]
    (. builder httpsPort data))
  (when-some [data (lookup-entry config id :origin-headers)]
    (. builder originHeaders data))
  (when-some [data (lookup-entry config id :origin-keepalive-timeout)]
    (. builder originKeepaliveTimeout data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (origin-protocol-policy config id :origin-protocol-policy)]
    (. builder originProtocolPolicy data))
  (when-some [data (lookup-entry config id :origin-read-timeout)]
    (. builder originReadTimeout data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn custom-origin-config-builder
  "Creates a  `CustomOriginConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (custom-origin-config-builder> (new CustomOriginConfig$Builder) id config))


(defn distribution-attributes-builder>
  "The distribution-attributes-builder> function updates a DistributionAttributes$Builder instance using the provided configuration.
  The function takes the DistributionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `distributionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-id` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
"
  [^DistributionAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :distribution-id)]
    (. builder distributionId data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (.build builder))


(defn distribution-attributes-builder
  "Creates a  `DistributionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (distribution-attributes-builder> (new DistributionAttributes$Builder) id config))


(defn distribution-builder>
  "The distribution-builder> function updates a Distribution$Builder instance using the provided configuration.
  The function takes the Distribution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^Distribution$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-behaviors)]
    (. builder additionalBehaviors data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :default-behavior)]
    (. builder defaultBehavior data))
  (when-some [data (lookup-entry config id :default-root-object)]
    (. builder defaultRootObject data))
  (when-some [data (lookup-entry config id :domain-names)]
    (. builder domainNames data))
  (when-some [data (lookup-entry config id :enable-ipv6)]
    (. builder enableIpv6 data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :error-responses)]
    (. builder errorResponses data))
  (when-some [data (lookup-entry config id :geo-restriction)]
    (. builder geoRestriction data))
  (when-some [data (http-version config id :http-version)]
    (. builder httpVersion data))
  (when-some [data (lookup-entry config id :log-bucket)]
    (. builder logBucket data))
  (when-some [data (lookup-entry config id :log-file-prefix)]
    (. builder logFilePrefix data))
  (when-some [data (lookup-entry config id :log-includes-cookies)]
    (. builder logIncludesCookies data))
  (when-some [data (security-policy-protocol config id :minimum-protocol-version)]
    (. builder minimumProtocolVersion data))
  (when-some [data (price-class config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :publish-additional-metrics)]
    (. builder publishAdditionalMetrics data))
  (when-some [data (ssl-method config id :ssl-support-method)]
    (. builder sslSupportMethod data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn distribution-builder
  "Creates a  `Distribution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (distribution-builder> (Distribution$Builder/create scope (name id)) id config))


(defn distribution-props-builder>
  "The distribution-props-builder> function updates a DistributionProps$Builder instance using the provided configuration.
  The function takes the DistributionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^DistributionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-behaviors)]
    (. builder additionalBehaviors data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :default-behavior)]
    (. builder defaultBehavior data))
  (when-some [data (lookup-entry config id :default-root-object)]
    (. builder defaultRootObject data))
  (when-some [data (lookup-entry config id :domain-names)]
    (. builder domainNames data))
  (when-some [data (lookup-entry config id :enable-ipv6)]
    (. builder enableIpv6 data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :error-responses)]
    (. builder errorResponses data))
  (when-some [data (lookup-entry config id :geo-restriction)]
    (. builder geoRestriction data))
  (when-some [data (http-version config id :http-version)]
    (. builder httpVersion data))
  (when-some [data (lookup-entry config id :log-bucket)]
    (. builder logBucket data))
  (when-some [data (lookup-entry config id :log-file-prefix)]
    (. builder logFilePrefix data))
  (when-some [data (lookup-entry config id :log-includes-cookies)]
    (. builder logIncludesCookies data))
  (when-some [data (security-policy-protocol config id :minimum-protocol-version)]
    (. builder minimumProtocolVersion data))
  (when-some [data (price-class config id :price-class)]
    (. builder priceClass data))
  (when-some [data (lookup-entry config id :publish-additional-metrics)]
    (. builder publishAdditionalMetrics data))
  (when-some [data (ssl-method config id :ssl-support-method)]
    (. builder sslSupportMethod data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn distribution-props-builder
  "Creates a  `DistributionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (distribution-props-builder> (new DistributionProps$Builder) id config))


(defn edge-lambda-builder>
  "The edge-lambda-builder> function updates a EdgeLambda$Builder instance using the provided configuration.
  The function takes the EdgeLambda$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType | [[cdk.api.services.cloudfront/lambda-edge-event-type]] | `:event-type` |
| `functionVersion` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:function-version` |
| `includeBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-body` |
"
  [^EdgeLambda$Builder builder id config]
  (when-some [data (lambda-edge-event-type config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :function-version)]
    (. builder functionVersion data))
  (when-some [data (lookup-entry config id :include-body)]
    (. builder includeBody data))
  (.build builder))


(defn edge-lambda-builder
  "Creates a  `EdgeLambda$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (edge-lambda-builder> (new EdgeLambda$Builder) id config))


(defn error-response-builder>
  "The error-response-builder> function updates a ErrorResponse$Builder instance using the provided configuration.
  The function takes the ErrorResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpStatus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-status` |
| `responseHttpStatus` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-http-status` |
| `responsePagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-page-path` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^ErrorResponse$Builder builder id config]
  (when-some [data (lookup-entry config id :http-status)]
    (. builder httpStatus data))
  (when-some [data (lookup-entry config id :response-http-status)]
    (. builder responseHttpStatus data))
  (when-some [data (lookup-entry config id :response-page-path)]
    (. builder responsePagePath data))
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn error-response-builder
  "Creates a  `ErrorResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (error-response-builder> (new ErrorResponse$Builder) id config))


(defn file-code-options-builder>
  "The file-code-options-builder> function updates a FileCodeOptions$Builder instance using the provided configuration.
  The function takes the FileCodeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |
"
  [^FileCodeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :file-path)]
    (. builder filePath data))
  (.build builder))


(defn file-code-options-builder
  "Creates a  `FileCodeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (file-code-options-builder> (new FileCodeOptions$Builder) id config))


(defn function-association-builder>
  "The function-association-builder> function updates a FunctionAssociation$Builder instance using the provided configuration.
  The function takes the FunctionAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.FunctionEventType | [[cdk.api.services.cloudfront/function-event-type]] | `:event-type` |
| `function` | software.amazon.awscdk.services.cloudfront.IFunction | [[cdk.support/lookup-entry]] | `:function` |
"
  [^FunctionAssociation$Builder builder id config]
  (when-some [data (function-event-type config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (.build builder))


(defn function-association-builder
  "Creates a  `FunctionAssociation$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (function-association-builder> (new FunctionAssociation$Builder) id config))


(defn function-attributes-builder>
  "The function-attributes-builder> function updates a FunctionAttributes$Builder instance using the provided configuration.
  The function takes the FunctionAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `functionRuntime` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-runtime` |
"
  [^FunctionAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :function-runtime)]
    (. builder functionRuntime data))
  (.build builder))


(defn function-attributes-builder
  "Creates a  `FunctionAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (function-attributes-builder> (new FunctionAttributes$Builder) id config))


(defn function-builder>
  "The function-builder> function updates a Function$Builder instance using the provided configuration.
  The function takes the Function$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `code` | software.amazon.awscdk.services.cloudfront.FunctionCode | [[cdk.support/lookup-entry]] | `:code` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `keyValueStore` | software.amazon.awscdk.services.cloudfront.IKeyValueStore | [[cdk.support/lookup-entry]] | `:key-value-store` |
| `runtime` | software.amazon.awscdk.services.cloudfront.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^Function$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-publish)]
    (. builder autoPublish data))
  (when-some [data (lookup-entry config id :code)]
    (. builder code data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :key-value-store)]
    (. builder keyValueStore data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (.build builder))


(defn function-builder
  "Creates a  `Function$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (function-builder> (Function$Builder/create scope (name id)) id config))


(defn function-props-builder>
  "The function-props-builder> function updates a FunctionProps$Builder instance using the provided configuration.
  The function takes the FunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPublish` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-publish` |
| `code` | software.amazon.awscdk.services.cloudfront.FunctionCode | [[cdk.support/lookup-entry]] | `:code` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `keyValueStore` | software.amazon.awscdk.services.cloudfront.IKeyValueStore | [[cdk.support/lookup-entry]] | `:key-value-store` |
| `runtime` | software.amazon.awscdk.services.cloudfront.FunctionRuntime | [[cdk.support/lookup-entry]] | `:runtime` |
"
  [^FunctionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-publish)]
    (. builder autoPublish data))
  (when-some [data (lookup-entry config id :code)]
    (. builder code data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :key-value-store)]
    (. builder keyValueStore data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (.build builder))


(defn function-props-builder
  "Creates a  `FunctionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (function-props-builder> (new FunctionProps$Builder) id config))


(defn key-group-builder>
  "The key-group-builder> function updates a KeyGroup$Builder instance using the provided configuration.
  The function takes the KeyGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `keyGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-group-name` |
"
  [^KeyGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :key-group-name)]
    (. builder keyGroupName data))
  (.build builder))


(defn key-group-builder
  "Creates a  `KeyGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (key-group-builder> (KeyGroup$Builder/create scope (name id)) id config))


(defn key-group-props-builder>
  "The key-group-props-builder> function updates a KeyGroupProps$Builder instance using the provided configuration.
  The function takes the KeyGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `keyGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-group-name` |
"
  [^KeyGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :key-group-name)]
    (. builder keyGroupName data))
  (.build builder))


(defn key-group-props-builder
  "Creates a  `KeyGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (key-group-props-builder> (new KeyGroupProps$Builder) id config))


(defn key-value-store-builder>
  "The key-value-store-builder> function updates a KeyValueStore$Builder instance using the provided configuration.
  The function takes the KeyValueStore$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-name` |
| `source` | software.amazon.awscdk.services.cloudfront.ImportSource | [[cdk.support/lookup-entry]] | `:source` |
"
  [^KeyValueStore$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :key-value-store-name)]
    (. builder keyValueStoreName data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn key-value-store-builder
  "Creates a  `KeyValueStore$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (key-value-store-builder> (KeyValueStore$Builder/create scope (name id)) id config))


(defn key-value-store-props-builder>
  "The key-value-store-props-builder> function updates a KeyValueStoreProps$Builder instance using the provided configuration.
  The function takes the KeyValueStoreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `keyValueStoreName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-value-store-name` |
| `source` | software.amazon.awscdk.services.cloudfront.ImportSource | [[cdk.support/lookup-entry]] | `:source` |
"
  [^KeyValueStoreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :key-value-store-name)]
    (. builder keyValueStoreName data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn key-value-store-props-builder
  "Creates a  `KeyValueStoreProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (key-value-store-props-builder> (new KeyValueStoreProps$Builder) id config))


(defn lambda-function-association-builder>
  "The lambda-function-association-builder> function updates a LambdaFunctionAssociation$Builder instance using the provided configuration.
  The function takes the LambdaFunctionAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType | [[cdk.api.services.cloudfront/lambda-edge-event-type]] | `:event-type` |
| `includeBody` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-body` |
| `lambdaFunction` | software.amazon.awscdk.services.lambda.IVersion | [[cdk.support/lookup-entry]] | `:lambda-function` |
"
  [^LambdaFunctionAssociation$Builder builder id config]
  (when-some [data (lambda-edge-event-type config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :include-body)]
    (. builder includeBody data))
  (when-some [data (lookup-entry config id :lambda-function)]
    (. builder lambdaFunction data))
  (.build builder))


(defn lambda-function-association-builder
  "Creates a  `LambdaFunctionAssociation$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lambda-function-association-builder> (new LambdaFunctionAssociation$Builder) id config))


(defn logging-configuration-builder>
  "The logging-configuration-builder> function updates a LoggingConfiguration$Builder instance using the provided configuration.
  The function takes the LoggingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `includeCookies` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-cookies` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^LoggingConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :include-cookies)]
    (. builder includeCookies data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn logging-configuration-builder
  "Creates a  `LoggingConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (logging-configuration-builder> (new LoggingConfiguration$Builder) id config))


(defn origin-access-identity-builder>
  "The origin-access-identity-builder> function updates a OriginAccessIdentity$Builder instance using the provided configuration.
  The function takes the OriginAccessIdentity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^OriginAccessIdentity$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn origin-access-identity-builder
  "Creates a  `OriginAccessIdentity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (origin-access-identity-builder> (OriginAccessIdentity$Builder/create scope (name id)) id config))


(defn origin-access-identity-props-builder>
  "The origin-access-identity-props-builder> function updates a OriginAccessIdentityProps$Builder instance using the provided configuration.
  The function takes the OriginAccessIdentityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^OriginAccessIdentityProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn origin-access-identity-props-builder
  "Creates a  `OriginAccessIdentityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-access-identity-props-builder> (new OriginAccessIdentityProps$Builder) id config))


(defn origin-bind-config-builder>
  "The origin-bind-config-builder> function updates a OriginBindConfig$Builder instance using the provided configuration.
  The function takes the OriginBindConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverConfig` | software.amazon.awscdk.services.cloudfront.OriginFailoverConfig | [[cdk.support/lookup-entry]] | `:failover-config` |
| `originProperty` | software.amazon.awscdk.services.cloudfront.CfnDistribution$OriginProperty | [[cdk.support/lookup-entry]] | `:origin-property` |
"
  [^OriginBindConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :failover-config)]
    (. builder failoverConfig data))
  (when-some [data (lookup-entry config id :origin-property)]
    (. builder originProperty data))
  (.build builder))


(defn origin-bind-config-builder
  "Creates a  `OriginBindConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-bind-config-builder> (new OriginBindConfig$Builder) id config))


(defn origin-bind-options-builder>
  "The origin-bind-options-builder> function updates a OriginBindOptions$Builder instance using the provided configuration.
  The function takes the OriginBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
"
  [^OriginBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (.build builder))


(defn origin-bind-options-builder
  "Creates a  `OriginBindOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-bind-options-builder> (new OriginBindOptions$Builder) id config))


(defn origin-failover-config-builder>
  "The origin-failover-config-builder> function updates a OriginFailoverConfig$Builder instance using the provided configuration.
  The function takes the OriginFailoverConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverOrigin` | software.amazon.awscdk.services.cloudfront.IOrigin | [[cdk.support/lookup-entry]] | `:failover-origin` |
| `statusCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:status-codes` |
"
  [^OriginFailoverConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :failover-origin)]
    (. builder failoverOrigin data))
  (when-some [data (lookup-entry config id :status-codes)]
    (. builder statusCodes data))
  (.build builder))


(defn origin-failover-config-builder
  "Creates a  `OriginFailoverConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-failover-config-builder> (new OriginFailoverConfig$Builder) id config))


(defn origin-options-builder>
  "The origin-options-builder> function updates a OriginOptions$Builder instance using the provided configuration.
  The function takes the OriginOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^OriginOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn origin-options-builder
  "Creates a  `OriginOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-options-builder> (new OriginOptions$Builder) id config))


(defn origin-props-builder>
  "The origin-props-builder> function updates a OriginProps$Builder instance using the provided configuration.
  The function takes the OriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-attempts` |
| `connectionTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:connection-timeout` |
| `customHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `originId` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-id` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-shield-enabled` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
"
  [^OriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (when-some [data (lookup-entry config id :origin-id)]
    (. builder originId data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-enabled)]
    (. builder originShieldEnabled data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (.build builder))


(defn origin-props-builder
  "Creates a  `OriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-props-builder> (new OriginProps$Builder) id config))


(defn origin-request-policy-builder>
  "The origin-request-policy-builder> function updates a OriginRequestPolicy$Builder instance using the provided configuration.
  The function takes the OriginRequestPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `originRequestPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-name` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
"
  [^OriginRequestPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :origin-request-policy-name)]
    (. builder originRequestPolicyName data))
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (.build builder))


(defn origin-request-policy-builder
  "Creates a  `OriginRequestPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (origin-request-policy-builder> (OriginRequestPolicy$Builder/create scope (name id)) id config))


(defn origin-request-policy-props-builder>
  "The origin-request-policy-props-builder> function updates a OriginRequestPolicyProps$Builder instance using the provided configuration.
  The function takes the OriginRequestPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `cookieBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior | [[cdk.support/lookup-entry]] | `:cookie-behavior` |
| `headerBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior | [[cdk.support/lookup-entry]] | `:header-behavior` |
| `originRequestPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-request-policy-name` |
| `queryStringBehavior` | software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior | [[cdk.support/lookup-entry]] | `:query-string-behavior` |
"
  [^OriginRequestPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cookie-behavior)]
    (. builder cookieBehavior data))
  (when-some [data (lookup-entry config id :header-behavior)]
    (. builder headerBehavior data))
  (when-some [data (lookup-entry config id :origin-request-policy-name)]
    (. builder originRequestPolicyName data))
  (when-some [data (lookup-entry config id :query-string-behavior)]
    (. builder queryStringBehavior data))
  (.build builder))


(defn origin-request-policy-props-builder
  "Creates a  `OriginRequestPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (origin-request-policy-props-builder> (new OriginRequestPolicyProps$Builder) id config))


(defn public-key-builder>
  "The public-key-builder> function updates a PublicKey$Builder instance using the provided configuration.
  The function takes the PublicKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `publicKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-name` |
"
  [^PublicKey$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :encoded-key)]
    (. builder encodedKey data))
  (when-some [data (lookup-entry config id :public-key-name)]
    (. builder publicKeyName data))
  (.build builder))


(defn public-key-builder
  "Creates a  `PublicKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (public-key-builder> (PublicKey$Builder/create scope (name id)) id config))


(defn public-key-props-builder>
  "The public-key-props-builder> function updates a PublicKeyProps$Builder instance using the provided configuration.
  The function takes the PublicKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `encodedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoded-key` |
| `publicKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-name` |
"
  [^PublicKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :encoded-key)]
    (. builder encodedKey data))
  (when-some [data (lookup-entry config id :public-key-name)]
    (. builder publicKeyName data))
  (.build builder))


(defn public-key-props-builder
  "Creates a  `PublicKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (public-key-props-builder> (new PublicKeyProps$Builder) id config))


(defn realtime-log-config-builder>
  "The realtime-log-config-builder> function updates a RealtimeLogConfig$Builder instance using the provided configuration.
  The function takes the RealtimeLogConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `realtimeLogConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
"
  [^RealtimeLogConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :end-points)]
    (. builder endPoints data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :realtime-log-config-name)]
    (. builder realtimeLogConfigName data))
  (when-some [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (.build builder))


(defn realtime-log-config-builder
  "Creates a  `RealtimeLogConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (realtime-log-config-builder> (RealtimeLogConfig$Builder/create scope (name id)) id config))


(defn realtime-log-config-props-builder>
  "The realtime-log-config-props-builder> function updates a RealtimeLogConfigProps$Builder instance using the provided configuration.
  The function takes the RealtimeLogConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endPoints` | java.util.List | [[cdk.support/lookup-entry]] | `:end-points` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `realtimeLogConfigName` | java.lang.String | [[cdk.support/lookup-entry]] | `:realtime-log-config-name` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
"
  [^RealtimeLogConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :end-points)]
    (. builder endPoints data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :realtime-log-config-name)]
    (. builder realtimeLogConfigName data))
  (when-some [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (.build builder))


(defn realtime-log-config-props-builder
  "Creates a  `RealtimeLogConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (realtime-log-config-props-builder> (new RealtimeLogConfigProps$Builder) id config))


(defn response-custom-header-builder>
  "The response-custom-header-builder> function updates a ResponseCustomHeader$Builder instance using the provided configuration.
  The function takes the ResponseCustomHeader$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^ResponseCustomHeader$Builder builder id config]
  (when-some [data (lookup-entry config id :header)]
    (. builder header data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn response-custom-header-builder
  "Creates a  `ResponseCustomHeader$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-custom-header-builder> (new ResponseCustomHeader$Builder) id config))


(defn response-custom-headers-behavior-builder>
  "The response-custom-headers-behavior-builder> function updates a ResponseCustomHeadersBehavior$Builder instance using the provided configuration.
  The function takes the ResponseCustomHeadersBehavior$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-headers` |
"
  [^ResponseCustomHeadersBehavior$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-headers)]
    (. builder customHeaders data))
  (.build builder))


(defn response-custom-headers-behavior-builder
  "Creates a  `ResponseCustomHeadersBehavior$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-custom-headers-behavior-builder> (new ResponseCustomHeadersBehavior$Builder) id config))


(defn response-headers-content-security-policy-builder>
  "The response-headers-content-security-policy-builder> function updates a ResponseHeadersContentSecurityPolicy$Builder instance using the provided configuration.
  The function takes the ResponseHeadersContentSecurityPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
"
  [^ResponseHeadersContentSecurityPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :content-security-policy)]
    (. builder contentSecurityPolicy data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn response-headers-content-security-policy-builder
  "Creates a  `ResponseHeadersContentSecurityPolicy$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-content-security-policy-builder> (new ResponseHeadersContentSecurityPolicy$Builder) id config))


(defn response-headers-content-type-options-builder>
  "The response-headers-content-type-options-builder> function updates a ResponseHeadersContentTypeOptions$Builder instance using the provided configuration.
  The function takes the ResponseHeadersContentTypeOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
"
  [^ResponseHeadersContentTypeOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn response-headers-content-type-options-builder
  "Creates a  `ResponseHeadersContentTypeOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-content-type-options-builder> (new ResponseHeadersContentTypeOptions$Builder) id config))


(defn response-headers-cors-behavior-builder>
  "The response-headers-cors-behavior-builder> function updates a ResponseHeadersCorsBehavior$Builder instance using the provided configuration.
  The function takes the ResponseHeadersCorsBehavior$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAllowCredentials` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-control-allow-credentials` |
| `accessControlAllowHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-headers` |
| `accessControlAllowMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-methods` |
| `accessControlAllowOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-allow-origins` |
| `accessControlExposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-expose-headers` |
| `accessControlMaxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-control-max-age` |
| `originOverride` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:origin-override` |
"
  [^ResponseHeadersCorsBehavior$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-allow-credentials)]
    (. builder accessControlAllowCredentials data))
  (when-some [data (lookup-entry config id :access-control-allow-headers)]
    (. builder accessControlAllowHeaders data))
  (when-some [data (lookup-entry config id :access-control-allow-methods)]
    (. builder accessControlAllowMethods data))
  (when-some [data (lookup-entry config id :access-control-allow-origins)]
    (. builder accessControlAllowOrigins data))
  (when-some [data (lookup-entry config id :access-control-expose-headers)]
    (. builder accessControlExposeHeaders data))
  (when-some [data (lookup-entry config id :access-control-max-age)]
    (. builder accessControlMaxAge data))
  (when-some [data (lookup-entry config id :origin-override)]
    (. builder originOverride data))
  (.build builder))


(defn response-headers-cors-behavior-builder
  "Creates a  `ResponseHeadersCorsBehavior$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-cors-behavior-builder> (new ResponseHeadersCorsBehavior$Builder) id config))


(defn response-headers-frame-options-builder>
  "The response-headers-frame-options-builder> function updates a ResponseHeadersFrameOptions$Builder instance using the provided configuration.
  The function takes the ResponseHeadersFrameOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameOption` | software.amazon.awscdk.services.cloudfront.HeadersFrameOption | [[cdk.api.services.cloudfront/headers-frame-option]] | `:frame-option` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
"
  [^ResponseHeadersFrameOptions$Builder builder id config]
  (when-some [data (headers-frame-option config id :frame-option)]
    (. builder frameOption data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (.build builder))


(defn response-headers-frame-options-builder
  "Creates a  `ResponseHeadersFrameOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-frame-options-builder> (new ResponseHeadersFrameOptions$Builder) id config))


(defn response-headers-policy-builder>
  "The response-headers-policy-builder> function updates a ResponseHeadersPolicy$Builder instance using the provided configuration.
  The function takes the ResponseHeadersPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsBehavior` | software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior | [[cdk.support/lookup-entry]] | `:cors-behavior` |
| `customHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior | [[cdk.support/lookup-entry]] | `:custom-headers-behavior` |
| `removeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-headers` |
| `responseHeadersPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-name` |
| `securityHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior | [[cdk.support/lookup-entry]] | `:security-headers-behavior` |
| `serverTimingSamplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-timing-sampling-rate` |
"
  [^ResponseHeadersPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cors-behavior)]
    (. builder corsBehavior data))
  (when-some [data (lookup-entry config id :custom-headers-behavior)]
    (. builder customHeadersBehavior data))
  (when-some [data (lookup-entry config id :remove-headers)]
    (. builder removeHeaders data))
  (when-some [data (lookup-entry config id :response-headers-policy-name)]
    (. builder responseHeadersPolicyName data))
  (when-some [data (lookup-entry config id :security-headers-behavior)]
    (. builder securityHeadersBehavior data))
  (when-some [data (lookup-entry config id :server-timing-sampling-rate)]
    (. builder serverTimingSamplingRate data))
  (.build builder))


(defn response-headers-policy-builder
  "Creates a  `ResponseHeadersPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (response-headers-policy-builder> (ResponseHeadersPolicy$Builder/create scope (name id)) id config))


(defn response-headers-policy-props-builder>
  "The response-headers-policy-props-builder> function updates a ResponseHeadersPolicyProps$Builder instance using the provided configuration.
  The function takes the ResponseHeadersPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `corsBehavior` | software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior | [[cdk.support/lookup-entry]] | `:cors-behavior` |
| `customHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior | [[cdk.support/lookup-entry]] | `:custom-headers-behavior` |
| `removeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-headers` |
| `responseHeadersPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-headers-policy-name` |
| `securityHeadersBehavior` | software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior | [[cdk.support/lookup-entry]] | `:security-headers-behavior` |
| `serverTimingSamplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-timing-sampling-rate` |
"
  [^ResponseHeadersPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :cors-behavior)]
    (. builder corsBehavior data))
  (when-some [data (lookup-entry config id :custom-headers-behavior)]
    (. builder customHeadersBehavior data))
  (when-some [data (lookup-entry config id :remove-headers)]
    (. builder removeHeaders data))
  (when-some [data (lookup-entry config id :response-headers-policy-name)]
    (. builder responseHeadersPolicyName data))
  (when-some [data (lookup-entry config id :security-headers-behavior)]
    (. builder securityHeadersBehavior data))
  (when-some [data (lookup-entry config id :server-timing-sampling-rate)]
    (. builder serverTimingSamplingRate data))
  (.build builder))


(defn response-headers-policy-props-builder
  "Creates a  `ResponseHeadersPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-policy-props-builder> (new ResponseHeadersPolicyProps$Builder) id config))


(defn response-headers-referrer-policy-builder>
  "The response-headers-referrer-policy-builder> function updates a ResponseHeadersReferrerPolicy$Builder instance using the provided configuration.
  The function takes the ResponseHeadersReferrerPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `referrerPolicy` | software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy | [[cdk.api.services.cloudfront/headers-referrer-policy]] | `:referrer-policy` |
"
  [^ResponseHeadersReferrerPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (headers-referrer-policy config id :referrer-policy)]
    (. builder referrerPolicy data))
  (.build builder))


(defn response-headers-referrer-policy-builder
  "Creates a  `ResponseHeadersReferrerPolicy$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-referrer-policy-builder> (new ResponseHeadersReferrerPolicy$Builder) id config))


(defn response-headers-strict-transport-security-builder>
  "The response-headers-strict-transport-security-builder> function updates a ResponseHeadersStrictTransportSecurity$Builder instance using the provided configuration.
  The function takes the ResponseHeadersStrictTransportSecurity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlMaxAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:access-control-max-age` |
| `includeSubdomains` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-subdomains` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `preload` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preload` |
"
  [^ResponseHeadersStrictTransportSecurity$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-max-age)]
    (. builder accessControlMaxAge data))
  (when-some [data (lookup-entry config id :include-subdomains)]
    (. builder includeSubdomains data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :preload)]
    (. builder preload data))
  (.build builder))


(defn response-headers-strict-transport-security-builder
  "Creates a  `ResponseHeadersStrictTransportSecurity$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-strict-transport-security-builder> (new ResponseHeadersStrictTransportSecurity$Builder) id config))


(defn response-headers-xss-protection-builder>
  "The response-headers-xss-protection-builder> function updates a ResponseHeadersXSSProtection$Builder instance using the provided configuration.
  The function takes the ResponseHeadersXSSProtection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `modeBlock` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mode-block` |
| `override` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override` |
| `protection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:protection` |
| `reportUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-uri` |
"
  [^ResponseHeadersXSSProtection$Builder builder id config]
  (when-some [data (lookup-entry config id :mode-block)]
    (. builder modeBlock data))
  (when-some [data (lookup-entry config id :override)]
    (. builder override data))
  (when-some [data (lookup-entry config id :protection)]
    (. builder protection data))
  (when-some [data (lookup-entry config id :report-uri)]
    (. builder reportUri data))
  (.build builder))


(defn response-headers-xss-protection-builder
  "Creates a  `ResponseHeadersXSSProtection$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-headers-xss-protection-builder> (new ResponseHeadersXSSProtection$Builder) id config))


(defn response-security-headers-behavior-builder>
  "The response-security-headers-behavior-builder> function updates a ResponseSecurityHeadersBehavior$Builder instance using the provided configuration.
  The function takes the ResponseSecurityHeadersBehavior$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentSecurityPolicy` | software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy | [[cdk.support/lookup-entry]] | `:content-security-policy` |
| `contentTypeOptions` | software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions | [[cdk.support/lookup-entry]] | `:content-type-options` |
| `frameOptions` | software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions | [[cdk.support/lookup-entry]] | `:frame-options` |
| `referrerPolicy` | software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy | [[cdk.support/lookup-entry]] | `:referrer-policy` |
| `strictTransportSecurity` | software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity | [[cdk.support/lookup-entry]] | `:strict-transport-security` |
| `xssProtection` | software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection | [[cdk.support/lookup-entry]] | `:xss-protection` |
"
  [^ResponseSecurityHeadersBehavior$Builder builder id config]
  (when-some [data (lookup-entry config id :content-security-policy)]
    (. builder contentSecurityPolicy data))
  (when-some [data (lookup-entry config id :content-type-options)]
    (. builder contentTypeOptions data))
  (when-some [data (lookup-entry config id :frame-options)]
    (. builder frameOptions data))
  (when-some [data (lookup-entry config id :referrer-policy)]
    (. builder referrerPolicy data))
  (when-some [data (lookup-entry config id :strict-transport-security)]
    (. builder strictTransportSecurity data))
  (when-some [data (lookup-entry config id :xss-protection)]
    (. builder xssProtection data))
  (.build builder))


(defn response-security-headers-behavior-builder
  "Creates a  `ResponseSecurityHeadersBehavior$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (response-security-headers-behavior-builder> (new ResponseSecurityHeadersBehavior$Builder) id config))


(defn s3-origin-config-builder>
  "The s3-origin-config-builder> function updates a S3OriginConfig$Builder instance using the provided configuration.
  The function takes the S3OriginConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `originAccessIdentity` | software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity | [[cdk.support/lookup-entry]] | `:origin-access-identity` |
| `originHeaders` | java.util.Map | [[cdk.support/lookup-entry]] | `:origin-headers` |
| `originPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-path` |
| `originShieldRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin-shield-region` |
| `s3BucketSource` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket-source` |
"
  [^S3OriginConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :origin-access-identity)]
    (. builder originAccessIdentity data))
  (when-some [data (lookup-entry config id :origin-headers)]
    (. builder originHeaders data))
  (when-some [data (lookup-entry config id :origin-path)]
    (. builder originPath data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :s3-bucket-source)]
    (. builder s3BucketSource data))
  (.build builder))


(defn s3-origin-config-builder
  "Creates a  `S3OriginConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (s3-origin-config-builder> (new S3OriginConfig$Builder) id config))


(defn source-configuration-builder>
  "The source-configuration-builder> function updates a SourceConfiguration$Builder instance using the provided configuration.
  The function takes the SourceConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `s3OriginSource` | software.amazon.awscdk.services.cloudfront.S3OriginConfig | [[cdk.support/lookup-entry]] | `:s3-origin-source` |
"
  [^SourceConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :behaviors)]
    (. builder behaviors data))
  (when-some [data (lookup-entry config id :connection-attempts)]
    (. builder connectionAttempts data))
  (when-some [data (lookup-entry config id :connection-timeout)]
    (. builder connectionTimeout data))
  (when-some [data (lookup-entry config id :custom-origin-source)]
    (. builder customOriginSource data))
  (when-some [data (lookup-entry config id :failover-criteria-status-codes)]
    (. builder failoverCriteriaStatusCodes data))
  (when-some [data (lookup-entry config id :failover-custom-origin-source)]
    (. builder failoverCustomOriginSource data))
  (when-some [data (lookup-entry config id :failover-s3-origin-source)]
    (. builder failoverS3OriginSource data))
  (when-some [data (lookup-entry config id :origin-shield-region)]
    (. builder originShieldRegion data))
  (when-some [data (lookup-entry config id :s3-origin-source)]
    (. builder s3OriginSource data))
  (.build builder))


(defn source-configuration-builder
  "Creates a  `SourceConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (source-configuration-builder> (new SourceConfiguration$Builder) id config))


(defn viewer-certificate-options-builder>
  "The viewer-certificate-options-builder> function updates a ViewerCertificateOptions$Builder instance using the provided configuration.
  The function takes the ViewerCertificateOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliases` | java.util.List | [[cdk.support/lookup-entry]] | `:aliases` |
| `securityPolicy` | software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol | [[cdk.api.services.cloudfront/security-policy-protocol]] | `:security-policy` |
| `sslMethod` | software.amazon.awscdk.services.cloudfront.SSLMethod | [[cdk.api.services.cloudfront/ssl-method]] | `:ssl-method` |
"
  [^ViewerCertificateOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :aliases)]
    (. builder aliases data))
  (when-some [data (security-policy-protocol config id :security-policy)]
    (. builder securityPolicy data))
  (when-some [data (ssl-method config id :ssl-method)]
    (. builder sslMethod data))
  (.build builder))


(defn viewer-certificate-options-builder
  "Creates a  `ViewerCertificateOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (viewer-certificate-options-builder> (new ViewerCertificateOptions$Builder) id config))