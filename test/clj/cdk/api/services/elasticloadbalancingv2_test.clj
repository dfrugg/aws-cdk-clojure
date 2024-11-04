(ns cdk.api.services.elasticloadbalancingv2-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancingv2 package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.elasticloadbalancingv2 :refer [alpn-policy
                                                             application-protocol
                                                             application-protocol-version
                                                             client-routing-policy
                                                             desync-mitigation-mode
                                                             http-code-elb
                                                             http-code-target
                                                             ip-address-type
                                                             protocol
                                                             ssl-policy
                                                             target-group-load-balancing-algorithm-type
                                                             target-type
                                                             unauthenticated-action
                                                             xff-header-processing-mode]])
  (:import [software.amazon.awscdk.services.elasticloadbalancingv2 AlpnPolicy
                                                                   ApplicationProtocol
                                                                   ApplicationProtocolVersion
                                                                   ClientRoutingPolicy
                                                                   DesyncMitigationMode
                                                                   HttpCodeElb
                                                                   HttpCodeTarget
                                                                   IpAddressType
                                                                   Protocol
                                                                   SslPolicy
                                                                   TargetGroupLoadBalancingAlgorithmType
                                                                   TargetType
                                                                   UnauthenticatedAction
                                                                   XffHeaderProcessingMode]))


(deftest alpn-policy-test
  (testing "Testing enum function alpn-policy"
    (is (= AlpnPolicy/HTTP2_OPTIONAL (alpn-policy {:item AlpnPolicy/HTTP2_OPTIONAL} "test" :item)))
    (is (= AlpnPolicy/HTTP2_OPTIONAL (alpn-policy {:test/item AlpnPolicy/HTTP2_OPTIONAL} "test" :item)))
    (is (= AlpnPolicy/HTTP2_ONLY (alpn-policy {:item AlpnPolicy/HTTP2_ONLY} "test" :item)))
    (is (= AlpnPolicy/HTTP2_ONLY (alpn-policy {:test/item AlpnPolicy/HTTP2_ONLY} "test" :item)))
    (is (= AlpnPolicy/HTTP2_PREFERRED (alpn-policy {:item AlpnPolicy/HTTP2_PREFERRED} "test" :item)))
    (is (= AlpnPolicy/HTTP2_PREFERRED (alpn-policy {:test/item AlpnPolicy/HTTP2_PREFERRED} "test" :item)))
    (is (= AlpnPolicy/NONE (alpn-policy {:item AlpnPolicy/NONE} "test" :item)))
    (is (= AlpnPolicy/NONE (alpn-policy {:test/item AlpnPolicy/NONE} "test" :item)))
    (is (= AlpnPolicy/HTTP1_ONLY (alpn-policy {:item AlpnPolicy/HTTP1_ONLY} "test" :item)))
    (is (= AlpnPolicy/HTTP1_ONLY (alpn-policy {:test/item AlpnPolicy/HTTP1_ONLY} "test" :item)))
    (is (= AlpnPolicy/HTTP2_OPTIONAL (alpn-policy {:item :http2-optional} "test" :item)))
    (is (= AlpnPolicy/HTTP2_OPTIONAL (alpn-policy {:test/item :http2-optional} "test" :item)))
    (is (= AlpnPolicy/HTTP2_ONLY (alpn-policy {:item :http2-only} "test" :item)))
    (is (= AlpnPolicy/HTTP2_ONLY (alpn-policy {:test/item :http2-only} "test" :item)))
    (is (= AlpnPolicy/HTTP2_PREFERRED (alpn-policy {:item :http2-preferred} "test" :item)))
    (is (= AlpnPolicy/HTTP2_PREFERRED (alpn-policy {:test/item :http2-preferred} "test" :item)))
    (is (= AlpnPolicy/NONE (alpn-policy {:item :none} "test" :item)))
    (is (= AlpnPolicy/NONE (alpn-policy {:test/item :none} "test" :item)))
    (is (= AlpnPolicy/HTTP1_ONLY (alpn-policy {:item :http1-only} "test" :item)))
    (is (= AlpnPolicy/HTTP1_ONLY (alpn-policy {:test/item :http1-only} "test" :item)))))


(deftest application-protocol-test
  (testing "Testing enum function application-protocol"
    (is (= ApplicationProtocol/HTTPS (application-protocol {:item ApplicationProtocol/HTTPS} "test" :item)))
    (is (= ApplicationProtocol/HTTPS (application-protocol {:test/item ApplicationProtocol/HTTPS} "test" :item)))
    (is (= ApplicationProtocol/HTTP (application-protocol {:item ApplicationProtocol/HTTP} "test" :item)))
    (is (= ApplicationProtocol/HTTP (application-protocol {:test/item ApplicationProtocol/HTTP} "test" :item)))
    (is (= ApplicationProtocol/HTTPS (application-protocol {:item :https} "test" :item)))
    (is (= ApplicationProtocol/HTTPS (application-protocol {:test/item :https} "test" :item)))
    (is (= ApplicationProtocol/HTTP (application-protocol {:item :http} "test" :item)))
    (is (= ApplicationProtocol/HTTP (application-protocol {:test/item :http} "test" :item)))))


(deftest application-protocol-version-test
  (testing "Testing enum function application-protocol-version"
    (is (= ApplicationProtocolVersion/GRPC (application-protocol-version {:item ApplicationProtocolVersion/GRPC} "test" :item)))
    (is (= ApplicationProtocolVersion/GRPC (application-protocol-version {:test/item ApplicationProtocolVersion/GRPC} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP1 (application-protocol-version {:item ApplicationProtocolVersion/HTTP1} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP1 (application-protocol-version {:test/item ApplicationProtocolVersion/HTTP1} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP2 (application-protocol-version {:item ApplicationProtocolVersion/HTTP2} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP2 (application-protocol-version {:test/item ApplicationProtocolVersion/HTTP2} "test" :item)))
    (is (= ApplicationProtocolVersion/GRPC (application-protocol-version {:item :grpc} "test" :item)))
    (is (= ApplicationProtocolVersion/GRPC (application-protocol-version {:test/item :grpc} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP1 (application-protocol-version {:item :http1} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP1 (application-protocol-version {:test/item :http1} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP2 (application-protocol-version {:item :http2} "test" :item)))
    (is (= ApplicationProtocolVersion/HTTP2 (application-protocol-version {:test/item :http2} "test" :item)))))


(deftest client-routing-policy-test
  (testing "Testing enum function client-routing-policy"
    (is (= ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:item ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY} "test" :item)))
    (is (= ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:test/item ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY} "test" :item)))
    (is (= ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:item ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY} "test" :item)))
    (is (= ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:test/item ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY} "test" :item)))
    (is (= ClientRoutingPolicy/ANY_AVAILABILITY_ZONE (client-routing-policy {:item ClientRoutingPolicy/ANY_AVAILABILITY_ZONE} "test" :item)))
    (is (= ClientRoutingPolicy/ANY_AVAILABILITY_ZONE (client-routing-policy {:test/item ClientRoutingPolicy/ANY_AVAILABILITY_ZONE} "test" :item)))
    (is (= ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:item :availability-zone-affinity} "test" :item)))
    (is (= ClientRoutingPolicy/AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:test/item :availability-zone-affinity} "test" :item)))
    (is (= ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:item :partial-availability-zone-affinity} "test" :item)))
    (is (= ClientRoutingPolicy/PARTIAL_AVAILABILITY_ZONE_AFFINITY (client-routing-policy {:test/item :partial-availability-zone-affinity} "test" :item)))
    (is (= ClientRoutingPolicy/ANY_AVAILABILITY_ZONE (client-routing-policy {:item :any-availability-zone} "test" :item)))
    (is (= ClientRoutingPolicy/ANY_AVAILABILITY_ZONE (client-routing-policy {:test/item :any-availability-zone} "test" :item)))))


(deftest desync-mitigation-mode-test
  (testing "Testing enum function desync-mitigation-mode"
    (is (= DesyncMitigationMode/STRICTEST (desync-mitigation-mode {:item DesyncMitigationMode/STRICTEST} "test" :item)))
    (is (= DesyncMitigationMode/STRICTEST (desync-mitigation-mode {:test/item DesyncMitigationMode/STRICTEST} "test" :item)))
    (is (= DesyncMitigationMode/MONITOR (desync-mitigation-mode {:item DesyncMitigationMode/MONITOR} "test" :item)))
    (is (= DesyncMitigationMode/MONITOR (desync-mitigation-mode {:test/item DesyncMitigationMode/MONITOR} "test" :item)))
    (is (= DesyncMitigationMode/DEFENSIVE (desync-mitigation-mode {:item DesyncMitigationMode/DEFENSIVE} "test" :item)))
    (is (= DesyncMitigationMode/DEFENSIVE (desync-mitigation-mode {:test/item DesyncMitigationMode/DEFENSIVE} "test" :item)))
    (is (= DesyncMitigationMode/STRICTEST (desync-mitigation-mode {:item :strictest} "test" :item)))
    (is (= DesyncMitigationMode/STRICTEST (desync-mitigation-mode {:test/item :strictest} "test" :item)))
    (is (= DesyncMitigationMode/MONITOR (desync-mitigation-mode {:item :monitor} "test" :item)))
    (is (= DesyncMitigationMode/MONITOR (desync-mitigation-mode {:test/item :monitor} "test" :item)))
    (is (= DesyncMitigationMode/DEFENSIVE (desync-mitigation-mode {:item :defensive} "test" :item)))
    (is (= DesyncMitigationMode/DEFENSIVE (desync-mitigation-mode {:test/item :defensive} "test" :item)))))


(deftest http-code-elb-test
  (testing "Testing enum function http-code-elb"
    (is (= HttpCodeElb/ELB_3XX_COUNT (http-code-elb {:item HttpCodeElb/ELB_3XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_3XX_COUNT (http-code-elb {:test/item HttpCodeElb/ELB_3XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_4XX_COUNT (http-code-elb {:item HttpCodeElb/ELB_4XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_4XX_COUNT (http-code-elb {:test/item HttpCodeElb/ELB_4XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_5XX_COUNT (http-code-elb {:item HttpCodeElb/ELB_5XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_5XX_COUNT (http-code-elb {:test/item HttpCodeElb/ELB_5XX_COUNT} "test" :item)))
    (is (= HttpCodeElb/ELB_3XX_COUNT (http-code-elb {:item :elb-3xx-count} "test" :item)))
    (is (= HttpCodeElb/ELB_3XX_COUNT (http-code-elb {:test/item :elb-3xx-count} "test" :item)))
    (is (= HttpCodeElb/ELB_4XX_COUNT (http-code-elb {:item :elb-4xx-count} "test" :item)))
    (is (= HttpCodeElb/ELB_4XX_COUNT (http-code-elb {:test/item :elb-4xx-count} "test" :item)))
    (is (= HttpCodeElb/ELB_5XX_COUNT (http-code-elb {:item :elb-5xx-count} "test" :item)))
    (is (= HttpCodeElb/ELB_5XX_COUNT (http-code-elb {:test/item :elb-5xx-count} "test" :item)))))


(deftest http-code-target-test
  (testing "Testing enum function http-code-target"
    (is (= HttpCodeTarget/TARGET_2XX_COUNT (http-code-target {:item HttpCodeTarget/TARGET_2XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_2XX_COUNT (http-code-target {:test/item HttpCodeTarget/TARGET_2XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_3XX_COUNT (http-code-target {:item HttpCodeTarget/TARGET_3XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_3XX_COUNT (http-code-target {:test/item HttpCodeTarget/TARGET_3XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_4XX_COUNT (http-code-target {:item HttpCodeTarget/TARGET_4XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_4XX_COUNT (http-code-target {:test/item HttpCodeTarget/TARGET_4XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_5XX_COUNT (http-code-target {:item HttpCodeTarget/TARGET_5XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_5XX_COUNT (http-code-target {:test/item HttpCodeTarget/TARGET_5XX_COUNT} "test" :item)))
    (is (= HttpCodeTarget/TARGET_2XX_COUNT (http-code-target {:item :target-2xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_2XX_COUNT (http-code-target {:test/item :target-2xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_3XX_COUNT (http-code-target {:item :target-3xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_3XX_COUNT (http-code-target {:test/item :target-3xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_4XX_COUNT (http-code-target {:item :target-4xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_4XX_COUNT (http-code-target {:test/item :target-4xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_5XX_COUNT (http-code-target {:item :target-5xx-count} "test" :item)))
    (is (= HttpCodeTarget/TARGET_5XX_COUNT (http-code-target {:test/item :target-5xx-count} "test" :item)))))


(deftest ip-address-type-test
  (testing "Testing enum function ip-address-type"
    (is (= IpAddressType/IPV4 (ip-address-type {:item IpAddressType/IPV4} "test" :item)))
    (is (= IpAddressType/IPV4 (ip-address-type {:test/item IpAddressType/IPV4} "test" :item)))
    (is (= IpAddressType/DUAL_STACK (ip-address-type {:item IpAddressType/DUAL_STACK} "test" :item)))
    (is (= IpAddressType/DUAL_STACK (ip-address-type {:test/item IpAddressType/DUAL_STACK} "test" :item)))
    (is (= IpAddressType/IPV4 (ip-address-type {:item :ipv4} "test" :item)))
    (is (= IpAddressType/IPV4 (ip-address-type {:test/item :ipv4} "test" :item)))
    (is (= IpAddressType/DUAL_STACK (ip-address-type {:item :dual-stack} "test" :item)))
    (is (= IpAddressType/DUAL_STACK (ip-address-type {:test/item :dual-stack} "test" :item)))))


(deftest protocol-test
  (testing "Testing enum function protocol"
    (is (= Protocol/TCP_UDP (protocol {:item Protocol/TCP_UDP} "test" :item)))
    (is (= Protocol/TCP_UDP (protocol {:test/item Protocol/TCP_UDP} "test" :item)))
    (is (= Protocol/HTTP (protocol {:item Protocol/HTTP} "test" :item)))
    (is (= Protocol/HTTP (protocol {:test/item Protocol/HTTP} "test" :item)))
    (is (= Protocol/TLS (protocol {:item Protocol/TLS} "test" :item)))
    (is (= Protocol/TLS (protocol {:test/item Protocol/TLS} "test" :item)))
    (is (= Protocol/TCP (protocol {:item Protocol/TCP} "test" :item)))
    (is (= Protocol/TCP (protocol {:test/item Protocol/TCP} "test" :item)))
    (is (= Protocol/HTTPS (protocol {:item Protocol/HTTPS} "test" :item)))
    (is (= Protocol/HTTPS (protocol {:test/item Protocol/HTTPS} "test" :item)))
    (is (= Protocol/UDP (protocol {:item Protocol/UDP} "test" :item)))
    (is (= Protocol/UDP (protocol {:test/item Protocol/UDP} "test" :item)))
    (is (= Protocol/TCP_UDP (protocol {:item :tcp-udp} "test" :item)))
    (is (= Protocol/TCP_UDP (protocol {:test/item :tcp-udp} "test" :item)))
    (is (= Protocol/HTTP (protocol {:item :http} "test" :item)))
    (is (= Protocol/HTTP (protocol {:test/item :http} "test" :item)))
    (is (= Protocol/TLS (protocol {:item :tls} "test" :item)))
    (is (= Protocol/TLS (protocol {:test/item :tls} "test" :item)))
    (is (= Protocol/TCP (protocol {:item :tcp} "test" :item)))
    (is (= Protocol/TCP (protocol {:test/item :tcp} "test" :item)))
    (is (= Protocol/HTTPS (protocol {:item :https} "test" :item)))
    (is (= Protocol/HTTPS (protocol {:test/item :https} "test" :item)))
    (is (= Protocol/UDP (protocol {:item :udp} "test" :item)))
    (is (= Protocol/UDP (protocol {:test/item :udp} "test" :item)))))


(deftest ssl-policy-test
  (testing "Testing enum function ssl-policy"
    (is (= SslPolicy/FORWARD_SECRECY_TLS11 (ssl-policy {:item SslPolicy/FORWARD_SECRECY_TLS11} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS11 (ssl-policy {:test/item SslPolicy/FORWARD_SECRECY_TLS11} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT2 (ssl-policy {:item SslPolicy/FIPS_TLS13_12_EXT2} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT2 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_12_EXT2} "test" :item)))
    (is (= SslPolicy/TLS13_EXT2 (ssl-policy {:item SslPolicy/TLS13_EXT2} "test" :item)))
    (is (= SslPolicy/TLS13_EXT2 (ssl-policy {:test/item SslPolicy/TLS13_EXT2} "test" :item)))
    (is (= SslPolicy/LEGACY (ssl-policy {:item SslPolicy/LEGACY} "test" :item)))
    (is (= SslPolicy/LEGACY (ssl-policy {:test/item SslPolicy/LEGACY} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12 (ssl-policy {:item SslPolicy/FIPS_TLS13_12} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM (ssl-policy {:item SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM (ssl-policy {:test/item SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM} "test" :item)))
    (is (= SslPolicy/RECOMMENDED_TLS (ssl-policy {:item SslPolicy/RECOMMENDED_TLS} "test" :item)))
    (is (= SslPolicy/RECOMMENDED_TLS (ssl-policy {:test/item SslPolicy/RECOMMENDED_TLS} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY (ssl-policy {:item SslPolicy/FORWARD_SECRECY} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY (ssl-policy {:test/item SslPolicy/FORWARD_SECRECY} "test" :item)))
    (is (= SslPolicy/TLS13_10 (ssl-policy {:item SslPolicy/TLS13_10} "test" :item)))
    (is (= SslPolicy/TLS13_10 (ssl-policy {:test/item SslPolicy/TLS13_10} "test" :item)))
    (is (= SslPolicy/TLS12 (ssl-policy {:item SslPolicy/TLS12} "test" :item)))
    (is (= SslPolicy/TLS12 (ssl-policy {:test/item SslPolicy/TLS12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES (ssl-policy {:item SslPolicy/FORWARD_SECRECY_TLS12_RES} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES (ssl-policy {:test/item SslPolicy/FORWARD_SECRECY_TLS12_RES} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT0 (ssl-policy {:item SslPolicy/FIPS_TLS13_12_EXT0} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT0 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_12_EXT0} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_10 (ssl-policy {:item SslPolicy/FIPS_TLS13_10} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_10 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_10} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT1 (ssl-policy {:item SslPolicy/FIPS_TLS13_12_EXT1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT1 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_12_EXT1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_13 (ssl-policy {:item SslPolicy/FIPS_TLS13_13} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_13 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_13} "test" :item)))
    (is (= SslPolicy/TLS13_RES (ssl-policy {:item SslPolicy/TLS13_RES} "test" :item)))
    (is (= SslPolicy/TLS13_RES (ssl-policy {:test/item SslPolicy/TLS13_RES} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_11 (ssl-policy {:item SslPolicy/FIPS_TLS13_11} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_11 (ssl-policy {:test/item SslPolicy/FIPS_TLS13_11} "test" :item)))
    (is (= SslPolicy/TLS13_11 (ssl-policy {:item SslPolicy/TLS13_11} "test" :item)))
    (is (= SslPolicy/TLS13_11 (ssl-policy {:test/item SslPolicy/TLS13_11} "test" :item)))
    (is (= SslPolicy/TLS12_EXT (ssl-policy {:item SslPolicy/TLS12_EXT} "test" :item)))
    (is (= SslPolicy/TLS12_EXT (ssl-policy {:test/item SslPolicy/TLS12_EXT} "test" :item)))
    (is (= SslPolicy/TLS11 (ssl-policy {:item SslPolicy/TLS11} "test" :item)))
    (is (= SslPolicy/TLS11 (ssl-policy {:test/item SslPolicy/TLS11} "test" :item)))
    (is (= SslPolicy/TLS13_EXT1 (ssl-policy {:item SslPolicy/TLS13_EXT1} "test" :item)))
    (is (= SslPolicy/TLS13_EXT1 (ssl-policy {:test/item SslPolicy/TLS13_EXT1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_RES (ssl-policy {:item SslPolicy/FIPS_TLS13_12_RES} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_RES (ssl-policy {:test/item SslPolicy/FIPS_TLS13_12_RES} "test" :item)))
    (is (= SslPolicy/TLS13_13 (ssl-policy {:item SslPolicy/TLS13_13} "test" :item)))
    (is (= SslPolicy/TLS13_13 (ssl-policy {:test/item SslPolicy/TLS13_13} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12 (ssl-policy {:item SslPolicy/FORWARD_SECRECY_TLS12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12 (ssl-policy {:test/item SslPolicy/FORWARD_SECRECY_TLS12} "test" :item)))
    (is (= SslPolicy/RECOMMENDED (ssl-policy {:item SslPolicy/RECOMMENDED} "test" :item)))
    (is (= SslPolicy/RECOMMENDED (ssl-policy {:test/item SslPolicy/RECOMMENDED} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS11 (ssl-policy {:item :forward-secrecy-tls11} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS11 (ssl-policy {:test/item :forward-secrecy-tls11} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT2 (ssl-policy {:item :fips-tls13-12-ext2} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT2 (ssl-policy {:test/item :fips-tls13-12-ext2} "test" :item)))
    (is (= SslPolicy/TLS13_EXT2 (ssl-policy {:item :tls13-ext2} "test" :item)))
    (is (= SslPolicy/TLS13_EXT2 (ssl-policy {:test/item :tls13-ext2} "test" :item)))
    (is (= SslPolicy/LEGACY (ssl-policy {:item :legacy} "test" :item)))
    (is (= SslPolicy/LEGACY (ssl-policy {:test/item :legacy} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12 (ssl-policy {:item :fips-tls13-12} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12 (ssl-policy {:test/item :fips-tls13-12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM (ssl-policy {:item :forward-secrecy-tls12-res-gcm} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES_GCM (ssl-policy {:test/item :forward-secrecy-tls12-res-gcm} "test" :item)))
    (is (= SslPolicy/RECOMMENDED_TLS (ssl-policy {:item :recommended-tls} "test" :item)))
    (is (= SslPolicy/RECOMMENDED_TLS (ssl-policy {:test/item :recommended-tls} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY (ssl-policy {:item :forward-secrecy} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY (ssl-policy {:test/item :forward-secrecy} "test" :item)))
    (is (= SslPolicy/TLS13_10 (ssl-policy {:item :tls13-10} "test" :item)))
    (is (= SslPolicy/TLS13_10 (ssl-policy {:test/item :tls13-10} "test" :item)))
    (is (= SslPolicy/TLS12 (ssl-policy {:item :tls12} "test" :item)))
    (is (= SslPolicy/TLS12 (ssl-policy {:test/item :tls12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES (ssl-policy {:item :forward-secrecy-tls12-res} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12_RES (ssl-policy {:test/item :forward-secrecy-tls12-res} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT0 (ssl-policy {:item :fips-tls13-12-ext0} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT0 (ssl-policy {:test/item :fips-tls13-12-ext0} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_10 (ssl-policy {:item :fips-tls13-10} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_10 (ssl-policy {:test/item :fips-tls13-10} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT1 (ssl-policy {:item :fips-tls13-12-ext1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_EXT1 (ssl-policy {:test/item :fips-tls13-12-ext1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_13 (ssl-policy {:item :fips-tls13-13} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_13 (ssl-policy {:test/item :fips-tls13-13} "test" :item)))
    (is (= SslPolicy/TLS13_RES (ssl-policy {:item :tls13-res} "test" :item)))
    (is (= SslPolicy/TLS13_RES (ssl-policy {:test/item :tls13-res} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_11 (ssl-policy {:item :fips-tls13-11} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_11 (ssl-policy {:test/item :fips-tls13-11} "test" :item)))
    (is (= SslPolicy/TLS13_11 (ssl-policy {:item :tls13-11} "test" :item)))
    (is (= SslPolicy/TLS13_11 (ssl-policy {:test/item :tls13-11} "test" :item)))
    (is (= SslPolicy/TLS12_EXT (ssl-policy {:item :tls12-ext} "test" :item)))
    (is (= SslPolicy/TLS12_EXT (ssl-policy {:test/item :tls12-ext} "test" :item)))
    (is (= SslPolicy/TLS11 (ssl-policy {:item :tls11} "test" :item)))
    (is (= SslPolicy/TLS11 (ssl-policy {:test/item :tls11} "test" :item)))
    (is (= SslPolicy/TLS13_EXT1 (ssl-policy {:item :tls13-ext1} "test" :item)))
    (is (= SslPolicy/TLS13_EXT1 (ssl-policy {:test/item :tls13-ext1} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_RES (ssl-policy {:item :fips-tls13-12-res} "test" :item)))
    (is (= SslPolicy/FIPS_TLS13_12_RES (ssl-policy {:test/item :fips-tls13-12-res} "test" :item)))
    (is (= SslPolicy/TLS13_13 (ssl-policy {:item :tls13-13} "test" :item)))
    (is (= SslPolicy/TLS13_13 (ssl-policy {:test/item :tls13-13} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12 (ssl-policy {:item :forward-secrecy-tls12} "test" :item)))
    (is (= SslPolicy/FORWARD_SECRECY_TLS12 (ssl-policy {:test/item :forward-secrecy-tls12} "test" :item)))
    (is (= SslPolicy/RECOMMENDED (ssl-policy {:item :recommended} "test" :item)))
    (is (= SslPolicy/RECOMMENDED (ssl-policy {:test/item :recommended} "test" :item)))))


(deftest target-group-load-balancing-algorithm-type-test
  (testing "Testing enum function target-group-load-balancing-algorithm-type"
    (is (= TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN (target-group-load-balancing-algorithm-type {:item TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN (target-group-load-balancing-algorithm-type {:test/item TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS (target-group-load-balancing-algorithm-type {:item TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS (target-group-load-balancing-algorithm-type {:test/item TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN (target-group-load-balancing-algorithm-type {:item :round-robin} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/ROUND_ROBIN (target-group-load-balancing-algorithm-type {:test/item :round-robin} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS (target-group-load-balancing-algorithm-type {:item :least-outstanding-requests} "test" :item)))
    (is (= TargetGroupLoadBalancingAlgorithmType/LEAST_OUTSTANDING_REQUESTS (target-group-load-balancing-algorithm-type {:test/item :least-outstanding-requests} "test" :item)))))


(deftest target-type-test
  (testing "Testing enum function target-type"
    (is (= TargetType/ALB (target-type {:item TargetType/ALB} "test" :item)))
    (is (= TargetType/ALB (target-type {:test/item TargetType/ALB} "test" :item)))
    (is (= TargetType/LAMBDA (target-type {:item TargetType/LAMBDA} "test" :item)))
    (is (= TargetType/LAMBDA (target-type {:test/item TargetType/LAMBDA} "test" :item)))
    (is (= TargetType/INSTANCE (target-type {:item TargetType/INSTANCE} "test" :item)))
    (is (= TargetType/INSTANCE (target-type {:test/item TargetType/INSTANCE} "test" :item)))
    (is (= TargetType/IP (target-type {:item TargetType/IP} "test" :item)))
    (is (= TargetType/IP (target-type {:test/item TargetType/IP} "test" :item)))
    (is (= TargetType/ALB (target-type {:item :alb} "test" :item)))
    (is (= TargetType/ALB (target-type {:test/item :alb} "test" :item)))
    (is (= TargetType/LAMBDA (target-type {:item :lambda} "test" :item)))
    (is (= TargetType/LAMBDA (target-type {:test/item :lambda} "test" :item)))
    (is (= TargetType/INSTANCE (target-type {:item :instance} "test" :item)))
    (is (= TargetType/INSTANCE (target-type {:test/item :instance} "test" :item)))
    (is (= TargetType/IP (target-type {:item :ip} "test" :item)))
    (is (= TargetType/IP (target-type {:test/item :ip} "test" :item)))))


(deftest unauthenticated-action-test
  (testing "Testing enum function unauthenticated-action"
    (is (= UnauthenticatedAction/ALLOW (unauthenticated-action {:item UnauthenticatedAction/ALLOW} "test" :item)))
    (is (= UnauthenticatedAction/ALLOW (unauthenticated-action {:test/item UnauthenticatedAction/ALLOW} "test" :item)))
    (is (= UnauthenticatedAction/AUTHENTICATE (unauthenticated-action {:item UnauthenticatedAction/AUTHENTICATE} "test" :item)))
    (is (= UnauthenticatedAction/AUTHENTICATE (unauthenticated-action {:test/item UnauthenticatedAction/AUTHENTICATE} "test" :item)))
    (is (= UnauthenticatedAction/DENY (unauthenticated-action {:item UnauthenticatedAction/DENY} "test" :item)))
    (is (= UnauthenticatedAction/DENY (unauthenticated-action {:test/item UnauthenticatedAction/DENY} "test" :item)))
    (is (= UnauthenticatedAction/ALLOW (unauthenticated-action {:item :allow} "test" :item)))
    (is (= UnauthenticatedAction/ALLOW (unauthenticated-action {:test/item :allow} "test" :item)))
    (is (= UnauthenticatedAction/AUTHENTICATE (unauthenticated-action {:item :authenticate} "test" :item)))
    (is (= UnauthenticatedAction/AUTHENTICATE (unauthenticated-action {:test/item :authenticate} "test" :item)))
    (is (= UnauthenticatedAction/DENY (unauthenticated-action {:item :deny} "test" :item)))
    (is (= UnauthenticatedAction/DENY (unauthenticated-action {:test/item :deny} "test" :item)))))


(deftest xff-header-processing-mode-test
  (testing "Testing enum function xff-header-processing-mode"
    (is (= XffHeaderProcessingMode/REMOVE (xff-header-processing-mode {:item XffHeaderProcessingMode/REMOVE} "test" :item)))
    (is (= XffHeaderProcessingMode/REMOVE (xff-header-processing-mode {:test/item XffHeaderProcessingMode/REMOVE} "test" :item)))
    (is (= XffHeaderProcessingMode/PRESERVE (xff-header-processing-mode {:item XffHeaderProcessingMode/PRESERVE} "test" :item)))
    (is (= XffHeaderProcessingMode/PRESERVE (xff-header-processing-mode {:test/item XffHeaderProcessingMode/PRESERVE} "test" :item)))
    (is (= XffHeaderProcessingMode/APPEND (xff-header-processing-mode {:item XffHeaderProcessingMode/APPEND} "test" :item)))
    (is (= XffHeaderProcessingMode/APPEND (xff-header-processing-mode {:test/item XffHeaderProcessingMode/APPEND} "test" :item)))
    (is (= XffHeaderProcessingMode/REMOVE (xff-header-processing-mode {:item :remove} "test" :item)))
    (is (= XffHeaderProcessingMode/REMOVE (xff-header-processing-mode {:test/item :remove} "test" :item)))
    (is (= XffHeaderProcessingMode/PRESERVE (xff-header-processing-mode {:item :preserve} "test" :item)))
    (is (= XffHeaderProcessingMode/PRESERVE (xff-header-processing-mode {:test/item :preserve} "test" :item)))
    (is (= XffHeaderProcessingMode/APPEND (xff-header-processing-mode {:item :append} "test" :item)))
    (is (= XffHeaderProcessingMode/APPEND (xff-header-processing-mode {:test/item :append} "test" :item)))))