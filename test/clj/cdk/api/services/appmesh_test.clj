(ns cdk.api.services.appmesh-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appmesh package. "
  (:require [cdk.api.services.appmesh :refer [dns-response-type
                                              grpc-retry-event
                                              http-retry-event
                                              http-route-method
                                              http-route-protocol
                                              ip-preference
                                              mesh-filter-type
                                              tcp-retry-event
                                              tls-mode]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.appmesh DnsResponseType
                                                    GrpcRetryEvent
                                                    HttpRetryEvent
                                                    HttpRouteMethod
                                                    HttpRouteProtocol
                                                    IpPreference
                                                    MeshFilterType
                                                    TcpRetryEvent
                                                    TlsMode]))


(deftest dns-response-type-test
  (testing "Testing enum function dns-response-type"
    (is (= DnsResponseType/ENDPOINTS (dns-response-type {:item DnsResponseType/ENDPOINTS} "test" :item)))
    (is (= DnsResponseType/ENDPOINTS (dns-response-type {:test/item DnsResponseType/ENDPOINTS} "test" :item)))
    (is (= DnsResponseType/LOAD_BALANCER (dns-response-type {:item DnsResponseType/LOAD_BALANCER} "test" :item)))
    (is (= DnsResponseType/LOAD_BALANCER (dns-response-type {:test/item DnsResponseType/LOAD_BALANCER} "test" :item)))
    (is (= DnsResponseType/ENDPOINTS (dns-response-type {:item :endpoints} "test" :item)))
    (is (= DnsResponseType/ENDPOINTS (dns-response-type {:test/item :endpoints} "test" :item)))
    (is (= DnsResponseType/LOAD_BALANCER (dns-response-type {:item :load-balancer} "test" :item)))
    (is (= DnsResponseType/LOAD_BALANCER (dns-response-type {:test/item :load-balancer} "test" :item)))))


(deftest grpc-retry-event-test
  (testing "Testing enum function grpc-retry-event"
    (is (= GrpcRetryEvent/UNAVAILABLE (grpc-retry-event {:item GrpcRetryEvent/UNAVAILABLE} "test" :item)))
    (is (= GrpcRetryEvent/UNAVAILABLE (grpc-retry-event {:test/item GrpcRetryEvent/UNAVAILABLE} "test" :item)))
    (is (= GrpcRetryEvent/RESOURCE_EXHAUSTED (grpc-retry-event {:item GrpcRetryEvent/RESOURCE_EXHAUSTED} "test" :item)))
    (is (= GrpcRetryEvent/RESOURCE_EXHAUSTED (grpc-retry-event {:test/item GrpcRetryEvent/RESOURCE_EXHAUSTED} "test" :item)))
    (is (= GrpcRetryEvent/DEADLINE_EXCEEDED (grpc-retry-event {:item GrpcRetryEvent/DEADLINE_EXCEEDED} "test" :item)))
    (is (= GrpcRetryEvent/DEADLINE_EXCEEDED (grpc-retry-event {:test/item GrpcRetryEvent/DEADLINE_EXCEEDED} "test" :item)))
    (is (= GrpcRetryEvent/INTERNAL_ERROR (grpc-retry-event {:item GrpcRetryEvent/INTERNAL_ERROR} "test" :item)))
    (is (= GrpcRetryEvent/INTERNAL_ERROR (grpc-retry-event {:test/item GrpcRetryEvent/INTERNAL_ERROR} "test" :item)))
    (is (= GrpcRetryEvent/CANCELLED (grpc-retry-event {:item GrpcRetryEvent/CANCELLED} "test" :item)))
    (is (= GrpcRetryEvent/CANCELLED (grpc-retry-event {:test/item GrpcRetryEvent/CANCELLED} "test" :item)))
    (is (= GrpcRetryEvent/UNAVAILABLE (grpc-retry-event {:item :unavailable} "test" :item)))
    (is (= GrpcRetryEvent/UNAVAILABLE (grpc-retry-event {:test/item :unavailable} "test" :item)))
    (is (= GrpcRetryEvent/RESOURCE_EXHAUSTED (grpc-retry-event {:item :resource-exhausted} "test" :item)))
    (is (= GrpcRetryEvent/RESOURCE_EXHAUSTED (grpc-retry-event {:test/item :resource-exhausted} "test" :item)))
    (is (= GrpcRetryEvent/DEADLINE_EXCEEDED (grpc-retry-event {:item :deadline-exceeded} "test" :item)))
    (is (= GrpcRetryEvent/DEADLINE_EXCEEDED (grpc-retry-event {:test/item :deadline-exceeded} "test" :item)))
    (is (= GrpcRetryEvent/INTERNAL_ERROR (grpc-retry-event {:item :internal-error} "test" :item)))
    (is (= GrpcRetryEvent/INTERNAL_ERROR (grpc-retry-event {:test/item :internal-error} "test" :item)))
    (is (= GrpcRetryEvent/CANCELLED (grpc-retry-event {:item :cancelled} "test" :item)))
    (is (= GrpcRetryEvent/CANCELLED (grpc-retry-event {:test/item :cancelled} "test" :item)))))


(deftest http-retry-event-test
  (testing "Testing enum function http-retry-event"
    (is (= HttpRetryEvent/STREAM_ERROR (http-retry-event {:item HttpRetryEvent/STREAM_ERROR} "test" :item)))
    (is (= HttpRetryEvent/STREAM_ERROR (http-retry-event {:test/item HttpRetryEvent/STREAM_ERROR} "test" :item)))
    (is (= HttpRetryEvent/SERVER_ERROR (http-retry-event {:item HttpRetryEvent/SERVER_ERROR} "test" :item)))
    (is (= HttpRetryEvent/SERVER_ERROR (http-retry-event {:test/item HttpRetryEvent/SERVER_ERROR} "test" :item)))
    (is (= HttpRetryEvent/GATEWAY_ERROR (http-retry-event {:item HttpRetryEvent/GATEWAY_ERROR} "test" :item)))
    (is (= HttpRetryEvent/GATEWAY_ERROR (http-retry-event {:test/item HttpRetryEvent/GATEWAY_ERROR} "test" :item)))
    (is (= HttpRetryEvent/CLIENT_ERROR (http-retry-event {:item HttpRetryEvent/CLIENT_ERROR} "test" :item)))
    (is (= HttpRetryEvent/CLIENT_ERROR (http-retry-event {:test/item HttpRetryEvent/CLIENT_ERROR} "test" :item)))
    (is (= HttpRetryEvent/STREAM_ERROR (http-retry-event {:item :stream-error} "test" :item)))
    (is (= HttpRetryEvent/STREAM_ERROR (http-retry-event {:test/item :stream-error} "test" :item)))
    (is (= HttpRetryEvent/SERVER_ERROR (http-retry-event {:item :server-error} "test" :item)))
    (is (= HttpRetryEvent/SERVER_ERROR (http-retry-event {:test/item :server-error} "test" :item)))
    (is (= HttpRetryEvent/GATEWAY_ERROR (http-retry-event {:item :gateway-error} "test" :item)))
    (is (= HttpRetryEvent/GATEWAY_ERROR (http-retry-event {:test/item :gateway-error} "test" :item)))
    (is (= HttpRetryEvent/CLIENT_ERROR (http-retry-event {:item :client-error} "test" :item)))
    (is (= HttpRetryEvent/CLIENT_ERROR (http-retry-event {:test/item :client-error} "test" :item)))))


(deftest http-route-method-test
  (testing "Testing enum function http-route-method"
    (is (= HttpRouteMethod/PUT (http-route-method {:item HttpRouteMethod/PUT} "test" :item)))
    (is (= HttpRouteMethod/PUT (http-route-method {:test/item HttpRouteMethod/PUT} "test" :item)))
    (is (= HttpRouteMethod/POST (http-route-method {:item HttpRouteMethod/POST} "test" :item)))
    (is (= HttpRouteMethod/POST (http-route-method {:test/item HttpRouteMethod/POST} "test" :item)))
    (is (= HttpRouteMethod/CONNECT (http-route-method {:item HttpRouteMethod/CONNECT} "test" :item)))
    (is (= HttpRouteMethod/CONNECT (http-route-method {:test/item HttpRouteMethod/CONNECT} "test" :item)))
    (is (= HttpRouteMethod/DELETE (http-route-method {:item HttpRouteMethod/DELETE} "test" :item)))
    (is (= HttpRouteMethod/DELETE (http-route-method {:test/item HttpRouteMethod/DELETE} "test" :item)))
    (is (= HttpRouteMethod/GET (http-route-method {:item HttpRouteMethod/GET} "test" :item)))
    (is (= HttpRouteMethod/GET (http-route-method {:test/item HttpRouteMethod/GET} "test" :item)))
    (is (= HttpRouteMethod/HEAD (http-route-method {:item HttpRouteMethod/HEAD} "test" :item)))
    (is (= HttpRouteMethod/HEAD (http-route-method {:test/item HttpRouteMethod/HEAD} "test" :item)))
    (is (= HttpRouteMethod/TRACE (http-route-method {:item HttpRouteMethod/TRACE} "test" :item)))
    (is (= HttpRouteMethod/TRACE (http-route-method {:test/item HttpRouteMethod/TRACE} "test" :item)))
    (is (= HttpRouteMethod/PATCH (http-route-method {:item HttpRouteMethod/PATCH} "test" :item)))
    (is (= HttpRouteMethod/PATCH (http-route-method {:test/item HttpRouteMethod/PATCH} "test" :item)))
    (is (= HttpRouteMethod/OPTIONS (http-route-method {:item HttpRouteMethod/OPTIONS} "test" :item)))
    (is (= HttpRouteMethod/OPTIONS (http-route-method {:test/item HttpRouteMethod/OPTIONS} "test" :item)))
    (is (= HttpRouteMethod/PUT (http-route-method {:item :put} "test" :item)))
    (is (= HttpRouteMethod/PUT (http-route-method {:test/item :put} "test" :item)))
    (is (= HttpRouteMethod/POST (http-route-method {:item :post} "test" :item)))
    (is (= HttpRouteMethod/POST (http-route-method {:test/item :post} "test" :item)))
    (is (= HttpRouteMethod/CONNECT (http-route-method {:item :connect} "test" :item)))
    (is (= HttpRouteMethod/CONNECT (http-route-method {:test/item :connect} "test" :item)))
    (is (= HttpRouteMethod/DELETE (http-route-method {:item :delete} "test" :item)))
    (is (= HttpRouteMethod/DELETE (http-route-method {:test/item :delete} "test" :item)))
    (is (= HttpRouteMethod/GET (http-route-method {:item :get} "test" :item)))
    (is (= HttpRouteMethod/GET (http-route-method {:test/item :get} "test" :item)))
    (is (= HttpRouteMethod/HEAD (http-route-method {:item :head} "test" :item)))
    (is (= HttpRouteMethod/HEAD (http-route-method {:test/item :head} "test" :item)))
    (is (= HttpRouteMethod/TRACE (http-route-method {:item :trace} "test" :item)))
    (is (= HttpRouteMethod/TRACE (http-route-method {:test/item :trace} "test" :item)))
    (is (= HttpRouteMethod/PATCH (http-route-method {:item :patch} "test" :item)))
    (is (= HttpRouteMethod/PATCH (http-route-method {:test/item :patch} "test" :item)))
    (is (= HttpRouteMethod/OPTIONS (http-route-method {:item :options} "test" :item)))
    (is (= HttpRouteMethod/OPTIONS (http-route-method {:test/item :options} "test" :item)))))


(deftest http-route-protocol-test
  (testing "Testing enum function http-route-protocol"
    (is (= HttpRouteProtocol/HTTP (http-route-protocol {:item HttpRouteProtocol/HTTP} "test" :item)))
    (is (= HttpRouteProtocol/HTTP (http-route-protocol {:test/item HttpRouteProtocol/HTTP} "test" :item)))
    (is (= HttpRouteProtocol/HTTPS (http-route-protocol {:item HttpRouteProtocol/HTTPS} "test" :item)))
    (is (= HttpRouteProtocol/HTTPS (http-route-protocol {:test/item HttpRouteProtocol/HTTPS} "test" :item)))
    (is (= HttpRouteProtocol/HTTP (http-route-protocol {:item :http} "test" :item)))
    (is (= HttpRouteProtocol/HTTP (http-route-protocol {:test/item :http} "test" :item)))
    (is (= HttpRouteProtocol/HTTPS (http-route-protocol {:item :https} "test" :item)))
    (is (= HttpRouteProtocol/HTTPS (http-route-protocol {:test/item :https} "test" :item)))))


(deftest ip-preference-test
  (testing "Testing enum function ip-preference"
    (is (= IpPreference/IPV4_ONLY (ip-preference {:item IpPreference/IPV4_ONLY} "test" :item)))
    (is (= IpPreference/IPV4_ONLY (ip-preference {:test/item IpPreference/IPV4_ONLY} "test" :item)))
    (is (= IpPreference/IPV6_ONLY (ip-preference {:item IpPreference/IPV6_ONLY} "test" :item)))
    (is (= IpPreference/IPV6_ONLY (ip-preference {:test/item IpPreference/IPV6_ONLY} "test" :item)))
    (is (= IpPreference/IPV6_PREFERRED (ip-preference {:item IpPreference/IPV6_PREFERRED} "test" :item)))
    (is (= IpPreference/IPV6_PREFERRED (ip-preference {:test/item IpPreference/IPV6_PREFERRED} "test" :item)))
    (is (= IpPreference/IPV4_PREFERRED (ip-preference {:item IpPreference/IPV4_PREFERRED} "test" :item)))
    (is (= IpPreference/IPV4_PREFERRED (ip-preference {:test/item IpPreference/IPV4_PREFERRED} "test" :item)))
    (is (= IpPreference/IPV4_ONLY (ip-preference {:item :ipv4-only} "test" :item)))
    (is (= IpPreference/IPV4_ONLY (ip-preference {:test/item :ipv4-only} "test" :item)))
    (is (= IpPreference/IPV6_ONLY (ip-preference {:item :ipv6-only} "test" :item)))
    (is (= IpPreference/IPV6_ONLY (ip-preference {:test/item :ipv6-only} "test" :item)))
    (is (= IpPreference/IPV6_PREFERRED (ip-preference {:item :ipv6-preferred} "test" :item)))
    (is (= IpPreference/IPV6_PREFERRED (ip-preference {:test/item :ipv6-preferred} "test" :item)))
    (is (= IpPreference/IPV4_PREFERRED (ip-preference {:item :ipv4-preferred} "test" :item)))
    (is (= IpPreference/IPV4_PREFERRED (ip-preference {:test/item :ipv4-preferred} "test" :item)))))


(deftest mesh-filter-type-test
  (testing "Testing enum function mesh-filter-type"
    (is (= MeshFilterType/DROP_ALL (mesh-filter-type {:item MeshFilterType/DROP_ALL} "test" :item)))
    (is (= MeshFilterType/DROP_ALL (mesh-filter-type {:test/item MeshFilterType/DROP_ALL} "test" :item)))
    (is (= MeshFilterType/ALLOW_ALL (mesh-filter-type {:item MeshFilterType/ALLOW_ALL} "test" :item)))
    (is (= MeshFilterType/ALLOW_ALL (mesh-filter-type {:test/item MeshFilterType/ALLOW_ALL} "test" :item)))
    (is (= MeshFilterType/DROP_ALL (mesh-filter-type {:item :drop-all} "test" :item)))
    (is (= MeshFilterType/DROP_ALL (mesh-filter-type {:test/item :drop-all} "test" :item)))
    (is (= MeshFilterType/ALLOW_ALL (mesh-filter-type {:item :allow-all} "test" :item)))
    (is (= MeshFilterType/ALLOW_ALL (mesh-filter-type {:test/item :allow-all} "test" :item)))))


(deftest tcp-retry-event-test
  (testing "Testing enum function tcp-retry-event"
    (is (= TcpRetryEvent/CONNECTION_ERROR (tcp-retry-event {:item TcpRetryEvent/CONNECTION_ERROR} "test" :item)))
    (is (= TcpRetryEvent/CONNECTION_ERROR (tcp-retry-event {:test/item TcpRetryEvent/CONNECTION_ERROR} "test" :item)))
    (is (= TcpRetryEvent/CONNECTION_ERROR (tcp-retry-event {:item :connection-error} "test" :item)))
    (is (= TcpRetryEvent/CONNECTION_ERROR (tcp-retry-event {:test/item :connection-error} "test" :item)))))


(deftest tls-mode-test
  (testing "Testing enum function tls-mode"
    (is (= TlsMode/PERMISSIVE (tls-mode {:item TlsMode/PERMISSIVE} "test" :item)))
    (is (= TlsMode/PERMISSIVE (tls-mode {:test/item TlsMode/PERMISSIVE} "test" :item)))
    (is (= TlsMode/STRICT (tls-mode {:item TlsMode/STRICT} "test" :item)))
    (is (= TlsMode/STRICT (tls-mode {:test/item TlsMode/STRICT} "test" :item)))
    (is (= TlsMode/DISABLED (tls-mode {:item TlsMode/DISABLED} "test" :item)))
    (is (= TlsMode/DISABLED (tls-mode {:test/item TlsMode/DISABLED} "test" :item)))
    (is (= TlsMode/PERMISSIVE (tls-mode {:item :permissive} "test" :item)))
    (is (= TlsMode/PERMISSIVE (tls-mode {:test/item :permissive} "test" :item)))
    (is (= TlsMode/STRICT (tls-mode {:item :strict} "test" :item)))
    (is (= TlsMode/STRICT (tls-mode {:test/item :strict} "test" :item)))
    (is (= TlsMode/DISABLED (tls-mode {:item :disabled} "test" :item)))
    (is (= TlsMode/DISABLED (tls-mode {:test/item :disabled} "test" :item)))))