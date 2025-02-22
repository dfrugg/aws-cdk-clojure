(ns cdk.api.services.globalaccelerator-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.globalaccelerator package. "
  (:require [cdk.api.services.globalaccelerator :refer [client-affinity
                                                        connection-protocol
                                                        health-check-protocol
                                                        ip-address-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.globalaccelerator ClientAffinity
                                                              ConnectionProtocol
                                                              HealthCheckProtocol
                                                              IpAddressType]))


(deftest client-affinity-test
  (testing "Testing enum function client-affinity"
    (is (= ClientAffinity/NONE (client-affinity {:item ClientAffinity/NONE} "test" :item)))
    (is (= ClientAffinity/NONE (client-affinity {:test/item ClientAffinity/NONE} "test" :item)))
    (is (= ClientAffinity/SOURCE_IP (client-affinity {:item ClientAffinity/SOURCE_IP} "test" :item)))
    (is (= ClientAffinity/SOURCE_IP (client-affinity {:test/item ClientAffinity/SOURCE_IP} "test" :item)))
    (is (= ClientAffinity/NONE (client-affinity {:item :none} "test" :item)))
    (is (= ClientAffinity/NONE (client-affinity {:test/item :none} "test" :item)))
    (is (= ClientAffinity/SOURCE_IP (client-affinity {:item :source-ip} "test" :item)))
    (is (= ClientAffinity/SOURCE_IP (client-affinity {:test/item :source-ip} "test" :item)))))


(deftest connection-protocol-test
  (testing "Testing enum function connection-protocol"
    (is (= ConnectionProtocol/UDP (connection-protocol {:item ConnectionProtocol/UDP} "test" :item)))
    (is (= ConnectionProtocol/UDP (connection-protocol {:test/item ConnectionProtocol/UDP} "test" :item)))
    (is (= ConnectionProtocol/TCP (connection-protocol {:item ConnectionProtocol/TCP} "test" :item)))
    (is (= ConnectionProtocol/TCP (connection-protocol {:test/item ConnectionProtocol/TCP} "test" :item)))
    (is (= ConnectionProtocol/UDP (connection-protocol {:item :udp} "test" :item)))
    (is (= ConnectionProtocol/UDP (connection-protocol {:test/item :udp} "test" :item)))
    (is (= ConnectionProtocol/TCP (connection-protocol {:item :tcp} "test" :item)))
    (is (= ConnectionProtocol/TCP (connection-protocol {:test/item :tcp} "test" :item)))))


(deftest health-check-protocol-test
  (testing "Testing enum function health-check-protocol"
    (is (= HealthCheckProtocol/HTTP (health-check-protocol {:item HealthCheckProtocol/HTTP} "test" :item)))
    (is (= HealthCheckProtocol/HTTP (health-check-protocol {:test/item HealthCheckProtocol/HTTP} "test" :item)))
    (is (= HealthCheckProtocol/TCP (health-check-protocol {:item HealthCheckProtocol/TCP} "test" :item)))
    (is (= HealthCheckProtocol/TCP (health-check-protocol {:test/item HealthCheckProtocol/TCP} "test" :item)))
    (is (= HealthCheckProtocol/HTTPS (health-check-protocol {:item HealthCheckProtocol/HTTPS} "test" :item)))
    (is (= HealthCheckProtocol/HTTPS (health-check-protocol {:test/item HealthCheckProtocol/HTTPS} "test" :item)))
    (is (= HealthCheckProtocol/HTTP (health-check-protocol {:item :http} "test" :item)))
    (is (= HealthCheckProtocol/HTTP (health-check-protocol {:test/item :http} "test" :item)))
    (is (= HealthCheckProtocol/TCP (health-check-protocol {:item :tcp} "test" :item)))
    (is (= HealthCheckProtocol/TCP (health-check-protocol {:test/item :tcp} "test" :item)))
    (is (= HealthCheckProtocol/HTTPS (health-check-protocol {:item :https} "test" :item)))
    (is (= HealthCheckProtocol/HTTPS (health-check-protocol {:test/item :https} "test" :item)))))


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