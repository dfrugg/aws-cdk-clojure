(ns cdk.api.services.cloudfront-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudfront package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.cloudfront :refer [cloud-front-allowed-cached-methods
                                                 cloud-front-allowed-methods
                                                 failover-status-code
                                                 function-event-type
                                                 headers-frame-option
                                                 headers-referrer-policy
                                                 http-version
                                                 lambda-edge-event-type
                                                 origin-protocol-policy
                                                 origin-ssl-policy
                                                 price-class
                                                 security-policy-protocol
                                                 ssl-method
                                                 viewer-protocol-policy]])
  (:import [software.amazon.awscdk.services.cloudfront CloudFrontAllowedCachedMethods
                                                       CloudFrontAllowedMethods
                                                       FailoverStatusCode
                                                       FunctionEventType
                                                       HeadersFrameOption
                                                       HeadersReferrerPolicy
                                                       HttpVersion
                                                       LambdaEdgeEventType
                                                       OriginProtocolPolicy
                                                       OriginSslPolicy
                                                       PriceClass
                                                       SSLMethod
                                                       SecurityPolicyProtocol
                                                       ViewerProtocolPolicy]))


(deftest cloud-front-allowed-cached-methods-test
  (testing "Testing enum function cloud-front-allowed-cached-methods"
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD (cloud-front-allowed-cached-methods {:item CloudFrontAllowedCachedMethods/GET_HEAD} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD (cloud-front-allowed-cached-methods {:test/item CloudFrontAllowedCachedMethods/GET_HEAD} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-cached-methods {:item CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-cached-methods {:test/item CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD (cloud-front-allowed-cached-methods {:item :get-head} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD (cloud-front-allowed-cached-methods {:test/item :get-head} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-cached-methods {:item :get-head-options} "test" :item)))
    (is (= CloudFrontAllowedCachedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-cached-methods {:test/item :get-head-options} "test" :item)))))


(deftest cloud-front-allowed-methods-test
  (testing "Testing enum function cloud-front-allowed-methods"
    (is (= CloudFrontAllowedMethods/ALL (cloud-front-allowed-methods {:item CloudFrontAllowedMethods/ALL} "test" :item)))
    (is (= CloudFrontAllowedMethods/ALL (cloud-front-allowed-methods {:test/item CloudFrontAllowedMethods/ALL} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD (cloud-front-allowed-methods {:item CloudFrontAllowedMethods/GET_HEAD} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD (cloud-front-allowed-methods {:test/item CloudFrontAllowedMethods/GET_HEAD} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-methods {:item CloudFrontAllowedMethods/GET_HEAD_OPTIONS} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-methods {:test/item CloudFrontAllowedMethods/GET_HEAD_OPTIONS} "test" :item)))
    (is (= CloudFrontAllowedMethods/ALL (cloud-front-allowed-methods {:item :all} "test" :item)))
    (is (= CloudFrontAllowedMethods/ALL (cloud-front-allowed-methods {:test/item :all} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD (cloud-front-allowed-methods {:item :get-head} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD (cloud-front-allowed-methods {:test/item :get-head} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-methods {:item :get-head-options} "test" :item)))
    (is (= CloudFrontAllowedMethods/GET_HEAD_OPTIONS (cloud-front-allowed-methods {:test/item :get-head-options} "test" :item)))))


(deftest failover-status-code-test
  (testing "Testing enum function failover-status-code"
    (is (= FailoverStatusCode/SERVICE_UNAVAILABLE (failover-status-code {:item FailoverStatusCode/SERVICE_UNAVAILABLE} "test" :item)))
    (is (= FailoverStatusCode/SERVICE_UNAVAILABLE (failover-status-code {:test/item FailoverStatusCode/SERVICE_UNAVAILABLE} "test" :item)))
    (is (= FailoverStatusCode/GATEWAY_TIMEOUT (failover-status-code {:item FailoverStatusCode/GATEWAY_TIMEOUT} "test" :item)))
    (is (= FailoverStatusCode/GATEWAY_TIMEOUT (failover-status-code {:test/item FailoverStatusCode/GATEWAY_TIMEOUT} "test" :item)))
    (is (= FailoverStatusCode/FORBIDDEN (failover-status-code {:item FailoverStatusCode/FORBIDDEN} "test" :item)))
    (is (= FailoverStatusCode/FORBIDDEN (failover-status-code {:test/item FailoverStatusCode/FORBIDDEN} "test" :item)))
    (is (= FailoverStatusCode/NOT_FOUND (failover-status-code {:item FailoverStatusCode/NOT_FOUND} "test" :item)))
    (is (= FailoverStatusCode/NOT_FOUND (failover-status-code {:test/item FailoverStatusCode/NOT_FOUND} "test" :item)))
    (is (= FailoverStatusCode/BAD_GATEWAY (failover-status-code {:item FailoverStatusCode/BAD_GATEWAY} "test" :item)))
    (is (= FailoverStatusCode/BAD_GATEWAY (failover-status-code {:test/item FailoverStatusCode/BAD_GATEWAY} "test" :item)))
    (is (= FailoverStatusCode/INTERNAL_SERVER_ERROR (failover-status-code {:item FailoverStatusCode/INTERNAL_SERVER_ERROR} "test" :item)))
    (is (= FailoverStatusCode/INTERNAL_SERVER_ERROR (failover-status-code {:test/item FailoverStatusCode/INTERNAL_SERVER_ERROR} "test" :item)))
    (is (= FailoverStatusCode/SERVICE_UNAVAILABLE (failover-status-code {:item :service-unavailable} "test" :item)))
    (is (= FailoverStatusCode/SERVICE_UNAVAILABLE (failover-status-code {:test/item :service-unavailable} "test" :item)))
    (is (= FailoverStatusCode/GATEWAY_TIMEOUT (failover-status-code {:item :gateway-timeout} "test" :item)))
    (is (= FailoverStatusCode/GATEWAY_TIMEOUT (failover-status-code {:test/item :gateway-timeout} "test" :item)))
    (is (= FailoverStatusCode/FORBIDDEN (failover-status-code {:item :forbidden} "test" :item)))
    (is (= FailoverStatusCode/FORBIDDEN (failover-status-code {:test/item :forbidden} "test" :item)))
    (is (= FailoverStatusCode/NOT_FOUND (failover-status-code {:item :not-found} "test" :item)))
    (is (= FailoverStatusCode/NOT_FOUND (failover-status-code {:test/item :not-found} "test" :item)))
    (is (= FailoverStatusCode/BAD_GATEWAY (failover-status-code {:item :bad-gateway} "test" :item)))
    (is (= FailoverStatusCode/BAD_GATEWAY (failover-status-code {:test/item :bad-gateway} "test" :item)))
    (is (= FailoverStatusCode/INTERNAL_SERVER_ERROR (failover-status-code {:item :internal-server-error} "test" :item)))
    (is (= FailoverStatusCode/INTERNAL_SERVER_ERROR (failover-status-code {:test/item :internal-server-error} "test" :item)))))


(deftest function-event-type-test
  (testing "Testing enum function function-event-type"
    (is (= FunctionEventType/VIEWER_RESPONSE (function-event-type {:item FunctionEventType/VIEWER_RESPONSE} "test" :item)))
    (is (= FunctionEventType/VIEWER_RESPONSE (function-event-type {:test/item FunctionEventType/VIEWER_RESPONSE} "test" :item)))
    (is (= FunctionEventType/VIEWER_REQUEST (function-event-type {:item FunctionEventType/VIEWER_REQUEST} "test" :item)))
    (is (= FunctionEventType/VIEWER_REQUEST (function-event-type {:test/item FunctionEventType/VIEWER_REQUEST} "test" :item)))
    (is (= FunctionEventType/VIEWER_RESPONSE (function-event-type {:item :viewer-response} "test" :item)))
    (is (= FunctionEventType/VIEWER_RESPONSE (function-event-type {:test/item :viewer-response} "test" :item)))
    (is (= FunctionEventType/VIEWER_REQUEST (function-event-type {:item :viewer-request} "test" :item)))
    (is (= FunctionEventType/VIEWER_REQUEST (function-event-type {:test/item :viewer-request} "test" :item)))))


(deftest headers-frame-option-test
  (testing "Testing enum function headers-frame-option"
    (is (= HeadersFrameOption/SAMEORIGIN (headers-frame-option {:item HeadersFrameOption/SAMEORIGIN} "test" :item)))
    (is (= HeadersFrameOption/SAMEORIGIN (headers-frame-option {:test/item HeadersFrameOption/SAMEORIGIN} "test" :item)))
    (is (= HeadersFrameOption/DENY (headers-frame-option {:item HeadersFrameOption/DENY} "test" :item)))
    (is (= HeadersFrameOption/DENY (headers-frame-option {:test/item HeadersFrameOption/DENY} "test" :item)))
    (is (= HeadersFrameOption/SAMEORIGIN (headers-frame-option {:item :sameorigin} "test" :item)))
    (is (= HeadersFrameOption/SAMEORIGIN (headers-frame-option {:test/item :sameorigin} "test" :item)))
    (is (= HeadersFrameOption/DENY (headers-frame-option {:item :deny} "test" :item)))
    (is (= HeadersFrameOption/DENY (headers-frame-option {:test/item :deny} "test" :item)))))


(deftest headers-referrer-policy-test
  (testing "Testing enum function headers-referrer-policy"
    (is (= HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE (headers-referrer-policy {:item HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE (headers-referrer-policy {:test/item HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:item HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:test/item HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/UNSAFE_URL (headers-referrer-policy {:item HeadersReferrerPolicy/UNSAFE_URL} "test" :item)))
    (is (= HeadersReferrerPolicy/UNSAFE_URL (headers-referrer-policy {:test/item HeadersReferrerPolicy/UNSAFE_URL} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER (headers-referrer-policy {:item HeadersReferrerPolicy/NO_REFERRER} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER (headers-referrer-policy {:test/item HeadersReferrerPolicy/NO_REFERRER} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:item HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:test/item HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN (headers-referrer-policy {:item HeadersReferrerPolicy/ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN (headers-referrer-policy {:test/item HeadersReferrerPolicy/ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/SAME_ORIGIN (headers-referrer-policy {:item HeadersReferrerPolicy/SAME_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/SAME_ORIGIN (headers-referrer-policy {:test/item HeadersReferrerPolicy/SAME_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN (headers-referrer-policy {:item HeadersReferrerPolicy/STRICT_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN (headers-referrer-policy {:test/item HeadersReferrerPolicy/STRICT_ORIGIN} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE (headers-referrer-policy {:item :no-referrer-when-downgrade} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER_WHEN_DOWNGRADE (headers-referrer-policy {:test/item :no-referrer-when-downgrade} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:item :strict-origin-when-cross-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:test/item :strict-origin-when-cross-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/UNSAFE_URL (headers-referrer-policy {:item :unsafe-url} "test" :item)))
    (is (= HeadersReferrerPolicy/UNSAFE_URL (headers-referrer-policy {:test/item :unsafe-url} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER (headers-referrer-policy {:item :no-referrer} "test" :item)))
    (is (= HeadersReferrerPolicy/NO_REFERRER (headers-referrer-policy {:test/item :no-referrer} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:item :origin-when-cross-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN_WHEN_CROSS_ORIGIN (headers-referrer-policy {:test/item :origin-when-cross-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN (headers-referrer-policy {:item :origin} "test" :item)))
    (is (= HeadersReferrerPolicy/ORIGIN (headers-referrer-policy {:test/item :origin} "test" :item)))
    (is (= HeadersReferrerPolicy/SAME_ORIGIN (headers-referrer-policy {:item :same-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/SAME_ORIGIN (headers-referrer-policy {:test/item :same-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN (headers-referrer-policy {:item :strict-origin} "test" :item)))
    (is (= HeadersReferrerPolicy/STRICT_ORIGIN (headers-referrer-policy {:test/item :strict-origin} "test" :item)))))


(deftest http-version-test
  (testing "Testing enum function http-version"
    (is (= HttpVersion/HTTP3 (http-version {:item HttpVersion/HTTP3} "test" :item)))
    (is (= HttpVersion/HTTP3 (http-version {:test/item HttpVersion/HTTP3} "test" :item)))
    (is (= HttpVersion/HTTP2_AND_3 (http-version {:item HttpVersion/HTTP2_AND_3} "test" :item)))
    (is (= HttpVersion/HTTP2_AND_3 (http-version {:test/item HttpVersion/HTTP2_AND_3} "test" :item)))
    (is (= HttpVersion/HTTP2 (http-version {:item HttpVersion/HTTP2} "test" :item)))
    (is (= HttpVersion/HTTP2 (http-version {:test/item HttpVersion/HTTP2} "test" :item)))
    (is (= HttpVersion/HTTP1_1 (http-version {:item HttpVersion/HTTP1_1} "test" :item)))
    (is (= HttpVersion/HTTP1_1 (http-version {:test/item HttpVersion/HTTP1_1} "test" :item)))
    (is (= HttpVersion/HTTP3 (http-version {:item :http3} "test" :item)))
    (is (= HttpVersion/HTTP3 (http-version {:test/item :http3} "test" :item)))
    (is (= HttpVersion/HTTP2_AND_3 (http-version {:item :http2-and-3} "test" :item)))
    (is (= HttpVersion/HTTP2_AND_3 (http-version {:test/item :http2-and-3} "test" :item)))
    (is (= HttpVersion/HTTP2 (http-version {:item :http2} "test" :item)))
    (is (= HttpVersion/HTTP2 (http-version {:test/item :http2} "test" :item)))
    (is (= HttpVersion/HTTP1_1 (http-version {:item :http1-1} "test" :item)))
    (is (= HttpVersion/HTTP1_1 (http-version {:test/item :http1-1} "test" :item)))))


(deftest lambda-edge-event-type-test
  (testing "Testing enum function lambda-edge-event-type"
    (is (= LambdaEdgeEventType/VIEWER_RESPONSE (lambda-edge-event-type {:item LambdaEdgeEventType/VIEWER_RESPONSE} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_RESPONSE (lambda-edge-event-type {:test/item LambdaEdgeEventType/VIEWER_RESPONSE} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_REQUEST (lambda-edge-event-type {:item LambdaEdgeEventType/VIEWER_REQUEST} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_REQUEST (lambda-edge-event-type {:test/item LambdaEdgeEventType/VIEWER_REQUEST} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_REQUEST (lambda-edge-event-type {:item LambdaEdgeEventType/ORIGIN_REQUEST} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_REQUEST (lambda-edge-event-type {:test/item LambdaEdgeEventType/ORIGIN_REQUEST} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_RESPONSE (lambda-edge-event-type {:item LambdaEdgeEventType/ORIGIN_RESPONSE} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_RESPONSE (lambda-edge-event-type {:test/item LambdaEdgeEventType/ORIGIN_RESPONSE} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_RESPONSE (lambda-edge-event-type {:item :viewer-response} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_RESPONSE (lambda-edge-event-type {:test/item :viewer-response} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_REQUEST (lambda-edge-event-type {:item :viewer-request} "test" :item)))
    (is (= LambdaEdgeEventType/VIEWER_REQUEST (lambda-edge-event-type {:test/item :viewer-request} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_REQUEST (lambda-edge-event-type {:item :origin-request} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_REQUEST (lambda-edge-event-type {:test/item :origin-request} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_RESPONSE (lambda-edge-event-type {:item :origin-response} "test" :item)))
    (is (= LambdaEdgeEventType/ORIGIN_RESPONSE (lambda-edge-event-type {:test/item :origin-response} "test" :item)))))


(deftest origin-protocol-policy-test
  (testing "Testing enum function origin-protocol-policy"
    (is (= OriginProtocolPolicy/MATCH_VIEWER (origin-protocol-policy {:item OriginProtocolPolicy/MATCH_VIEWER} "test" :item)))
    (is (= OriginProtocolPolicy/MATCH_VIEWER (origin-protocol-policy {:test/item OriginProtocolPolicy/MATCH_VIEWER} "test" :item)))
    (is (= OriginProtocolPolicy/HTTPS_ONLY (origin-protocol-policy {:item OriginProtocolPolicy/HTTPS_ONLY} "test" :item)))
    (is (= OriginProtocolPolicy/HTTPS_ONLY (origin-protocol-policy {:test/item OriginProtocolPolicy/HTTPS_ONLY} "test" :item)))
    (is (= OriginProtocolPolicy/HTTP_ONLY (origin-protocol-policy {:item OriginProtocolPolicy/HTTP_ONLY} "test" :item)))
    (is (= OriginProtocolPolicy/HTTP_ONLY (origin-protocol-policy {:test/item OriginProtocolPolicy/HTTP_ONLY} "test" :item)))
    (is (= OriginProtocolPolicy/MATCH_VIEWER (origin-protocol-policy {:item :match-viewer} "test" :item)))
    (is (= OriginProtocolPolicy/MATCH_VIEWER (origin-protocol-policy {:test/item :match-viewer} "test" :item)))
    (is (= OriginProtocolPolicy/HTTPS_ONLY (origin-protocol-policy {:item :https-only} "test" :item)))
    (is (= OriginProtocolPolicy/HTTPS_ONLY (origin-protocol-policy {:test/item :https-only} "test" :item)))
    (is (= OriginProtocolPolicy/HTTP_ONLY (origin-protocol-policy {:item :http-only} "test" :item)))
    (is (= OriginProtocolPolicy/HTTP_ONLY (origin-protocol-policy {:test/item :http-only} "test" :item)))))


(deftest origin-ssl-policy-test
  (testing "Testing enum function origin-ssl-policy"
    (is (= OriginSslPolicy/TLS_V1_2 (origin-ssl-policy {:item OriginSslPolicy/TLS_V1_2} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_2 (origin-ssl-policy {:test/item OriginSslPolicy/TLS_V1_2} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_1 (origin-ssl-policy {:item OriginSslPolicy/TLS_V1_1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_1 (origin-ssl-policy {:test/item OriginSslPolicy/TLS_V1_1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1 (origin-ssl-policy {:item OriginSslPolicy/TLS_V1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1 (origin-ssl-policy {:test/item OriginSslPolicy/TLS_V1} "test" :item)))
    (is (= OriginSslPolicy/SSL_V3 (origin-ssl-policy {:item OriginSslPolicy/SSL_V3} "test" :item)))
    (is (= OriginSslPolicy/SSL_V3 (origin-ssl-policy {:test/item OriginSslPolicy/SSL_V3} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_2 (origin-ssl-policy {:item :tls-v1-2} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_2 (origin-ssl-policy {:test/item :tls-v1-2} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_1 (origin-ssl-policy {:item :tls-v1-1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1_1 (origin-ssl-policy {:test/item :tls-v1-1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1 (origin-ssl-policy {:item :tls-v1} "test" :item)))
    (is (= OriginSslPolicy/TLS_V1 (origin-ssl-policy {:test/item :tls-v1} "test" :item)))
    (is (= OriginSslPolicy/SSL_V3 (origin-ssl-policy {:item :ssl-v3} "test" :item)))
    (is (= OriginSslPolicy/SSL_V3 (origin-ssl-policy {:test/item :ssl-v3} "test" :item)))))


(deftest price-class-test
  (testing "Testing enum function price-class"
    (is (= PriceClass/PRICE_CLASS_200 (price-class {:item PriceClass/PRICE_CLASS_200} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_200 (price-class {:test/item PriceClass/PRICE_CLASS_200} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_100 (price-class {:item PriceClass/PRICE_CLASS_100} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_100 (price-class {:test/item PriceClass/PRICE_CLASS_100} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_ALL (price-class {:item PriceClass/PRICE_CLASS_ALL} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_ALL (price-class {:test/item PriceClass/PRICE_CLASS_ALL} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_200 (price-class {:item :price-class-200} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_200 (price-class {:test/item :price-class-200} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_100 (price-class {:item :price-class-100} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_100 (price-class {:test/item :price-class-100} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_ALL (price-class {:item :price-class-all} "test" :item)))
    (is (= PriceClass/PRICE_CLASS_ALL (price-class {:test/item :price-class-all} "test" :item)))))


(deftest security-policy-protocol-test
  (testing "Testing enum function security-policy-protocol"
    (is (= SecurityPolicyProtocol/TLS_V1_2_2018 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1_2_2018} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2018 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1_2_2018} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2016 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1_2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2016 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1_2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_1_2016 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1_1_2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_1_2016 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1_1_2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2019 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1_2_2019} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2019 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1_2_2019} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2021 (security-policy-protocol {:item SecurityPolicyProtocol/TLS_V1_2_2021} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2021 (security-policy-protocol {:test/item SecurityPolicyProtocol/TLS_V1_2_2021} "test" :item)))
    (is (= SecurityPolicyProtocol/SSL_V3 (security-policy-protocol {:item SecurityPolicyProtocol/SSL_V3} "test" :item)))
    (is (= SecurityPolicyProtocol/SSL_V3 (security-policy-protocol {:test/item SecurityPolicyProtocol/SSL_V3} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2018 (security-policy-protocol {:item :tls-v1-2-2018} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2018 (security-policy-protocol {:test/item :tls-v1-2-2018} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2016 (security-policy-protocol {:item :tls-v1-2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2016 (security-policy-protocol {:test/item :tls-v1-2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1 (security-policy-protocol {:item :tls-v1} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1 (security-policy-protocol {:test/item :tls-v1} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_1_2016 (security-policy-protocol {:item :tls-v1-1-2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_1_2016 (security-policy-protocol {:test/item :tls-v1-1-2016} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2019 (security-policy-protocol {:item :tls-v1-2-2019} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2019 (security-policy-protocol {:test/item :tls-v1-2-2019} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2021 (security-policy-protocol {:item :tls-v1-2-2021} "test" :item)))
    (is (= SecurityPolicyProtocol/TLS_V1_2_2021 (security-policy-protocol {:test/item :tls-v1-2-2021} "test" :item)))
    (is (= SecurityPolicyProtocol/SSL_V3 (security-policy-protocol {:item :ssl-v3} "test" :item)))
    (is (= SecurityPolicyProtocol/SSL_V3 (security-policy-protocol {:test/item :ssl-v3} "test" :item)))))


(deftest ssl-method-test
  (testing "Testing enum function ssl-method"
    (is (= SSLMethod/VIP (ssl-method {:item SSLMethod/VIP} "test" :item)))
    (is (= SSLMethod/VIP (ssl-method {:test/item SSLMethod/VIP} "test" :item)))
    (is (= SSLMethod/SNI (ssl-method {:item SSLMethod/SNI} "test" :item)))
    (is (= SSLMethod/SNI (ssl-method {:test/item SSLMethod/SNI} "test" :item)))
    (is (= SSLMethod/VIP (ssl-method {:item :vip} "test" :item)))
    (is (= SSLMethod/VIP (ssl-method {:test/item :vip} "test" :item)))
    (is (= SSLMethod/SNI (ssl-method {:item :sni} "test" :item)))
    (is (= SSLMethod/SNI (ssl-method {:test/item :sni} "test" :item)))))


(deftest viewer-protocol-policy-test
  (testing "Testing enum function viewer-protocol-policy"
    (is (= ViewerProtocolPolicy/REDIRECT_TO_HTTPS (viewer-protocol-policy {:item ViewerProtocolPolicy/REDIRECT_TO_HTTPS} "test" :item)))
    (is (= ViewerProtocolPolicy/REDIRECT_TO_HTTPS (viewer-protocol-policy {:test/item ViewerProtocolPolicy/REDIRECT_TO_HTTPS} "test" :item)))
    (is (= ViewerProtocolPolicy/HTTPS_ONLY (viewer-protocol-policy {:item ViewerProtocolPolicy/HTTPS_ONLY} "test" :item)))
    (is (= ViewerProtocolPolicy/HTTPS_ONLY (viewer-protocol-policy {:test/item ViewerProtocolPolicy/HTTPS_ONLY} "test" :item)))
    (is (= ViewerProtocolPolicy/ALLOW_ALL (viewer-protocol-policy {:item ViewerProtocolPolicy/ALLOW_ALL} "test" :item)))
    (is (= ViewerProtocolPolicy/ALLOW_ALL (viewer-protocol-policy {:test/item ViewerProtocolPolicy/ALLOW_ALL} "test" :item)))
    (is (= ViewerProtocolPolicy/REDIRECT_TO_HTTPS (viewer-protocol-policy {:item :redirect-to-https} "test" :item)))
    (is (= ViewerProtocolPolicy/REDIRECT_TO_HTTPS (viewer-protocol-policy {:test/item :redirect-to-https} "test" :item)))
    (is (= ViewerProtocolPolicy/HTTPS_ONLY (viewer-protocol-policy {:item :https-only} "test" :item)))
    (is (= ViewerProtocolPolicy/HTTPS_ONLY (viewer-protocol-policy {:test/item :https-only} "test" :item)))
    (is (= ViewerProtocolPolicy/ALLOW_ALL (viewer-protocol-policy {:item :allow-all} "test" :item)))
    (is (= ViewerProtocolPolicy/ALLOW_ALL (viewer-protocol-policy {:test/item :allow-all} "test" :item)))))