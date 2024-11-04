(ns cdk.api.services.servicediscovery-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicediscovery package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.servicediscovery :refer [discovery-type
                                                       dns-record-type
                                                       health-check-type
                                                       namespace-type
                                                       routing-policy]])
  (:import [software.amazon.awscdk.services.servicediscovery DiscoveryType
                                                             DnsRecordType
                                                             HealthCheckType
                                                             NamespaceType
                                                             RoutingPolicy]))


(deftest discovery-type-test
  (testing "Testing enum function discovery-type"
    (is (= DiscoveryType/DNS_AND_API (discovery-type {:item DiscoveryType/DNS_AND_API} "test" :item)))
    (is (= DiscoveryType/DNS_AND_API (discovery-type {:test/item DiscoveryType/DNS_AND_API} "test" :item)))
    (is (= DiscoveryType/API (discovery-type {:item DiscoveryType/API} "test" :item)))
    (is (= DiscoveryType/API (discovery-type {:test/item DiscoveryType/API} "test" :item)))
    (is (= DiscoveryType/DNS_AND_API (discovery-type {:item :dns-and-api} "test" :item)))
    (is (= DiscoveryType/DNS_AND_API (discovery-type {:test/item :dns-and-api} "test" :item)))
    (is (= DiscoveryType/API (discovery-type {:item :api} "test" :item)))
    (is (= DiscoveryType/API (discovery-type {:test/item :api} "test" :item)))))


(deftest dns-record-type-test
  (testing "Testing enum function dns-record-type"
    (is (= DnsRecordType/SRV (dns-record-type {:item DnsRecordType/SRV} "test" :item)))
    (is (= DnsRecordType/SRV (dns-record-type {:test/item DnsRecordType/SRV} "test" :item)))
    (is (= DnsRecordType/CNAME (dns-record-type {:item DnsRecordType/CNAME} "test" :item)))
    (is (= DnsRecordType/CNAME (dns-record-type {:test/item DnsRecordType/CNAME} "test" :item)))
    (is (= DnsRecordType/A (dns-record-type {:item DnsRecordType/A} "test" :item)))
    (is (= DnsRecordType/A (dns-record-type {:test/item DnsRecordType/A} "test" :item)))
    (is (= DnsRecordType/AAAA (dns-record-type {:item DnsRecordType/AAAA} "test" :item)))
    (is (= DnsRecordType/AAAA (dns-record-type {:test/item DnsRecordType/AAAA} "test" :item)))
    (is (= DnsRecordType/A_AAAA (dns-record-type {:item DnsRecordType/A_AAAA} "test" :item)))
    (is (= DnsRecordType/A_AAAA (dns-record-type {:test/item DnsRecordType/A_AAAA} "test" :item)))
    (is (= DnsRecordType/SRV (dns-record-type {:item :srv} "test" :item)))
    (is (= DnsRecordType/SRV (dns-record-type {:test/item :srv} "test" :item)))
    (is (= DnsRecordType/CNAME (dns-record-type {:item :cname} "test" :item)))
    (is (= DnsRecordType/CNAME (dns-record-type {:test/item :cname} "test" :item)))
    (is (= DnsRecordType/A (dns-record-type {:item :a} "test" :item)))
    (is (= DnsRecordType/A (dns-record-type {:test/item :a} "test" :item)))
    (is (= DnsRecordType/AAAA (dns-record-type {:item :aaaa} "test" :item)))
    (is (= DnsRecordType/AAAA (dns-record-type {:test/item :aaaa} "test" :item)))
    (is (= DnsRecordType/A_AAAA (dns-record-type {:item :a-aaaa} "test" :item)))
    (is (= DnsRecordType/A_AAAA (dns-record-type {:test/item :a-aaaa} "test" :item)))))


(deftest health-check-type-test
  (testing "Testing enum function health-check-type"
    (is (= HealthCheckType/HTTP (health-check-type {:item HealthCheckType/HTTP} "test" :item)))
    (is (= HealthCheckType/HTTP (health-check-type {:test/item HealthCheckType/HTTP} "test" :item)))
    (is (= HealthCheckType/HTTPS (health-check-type {:item HealthCheckType/HTTPS} "test" :item)))
    (is (= HealthCheckType/HTTPS (health-check-type {:test/item HealthCheckType/HTTPS} "test" :item)))
    (is (= HealthCheckType/TCP (health-check-type {:item HealthCheckType/TCP} "test" :item)))
    (is (= HealthCheckType/TCP (health-check-type {:test/item HealthCheckType/TCP} "test" :item)))
    (is (= HealthCheckType/HTTP (health-check-type {:item :http} "test" :item)))
    (is (= HealthCheckType/HTTP (health-check-type {:test/item :http} "test" :item)))
    (is (= HealthCheckType/HTTPS (health-check-type {:item :https} "test" :item)))
    (is (= HealthCheckType/HTTPS (health-check-type {:test/item :https} "test" :item)))
    (is (= HealthCheckType/TCP (health-check-type {:item :tcp} "test" :item)))
    (is (= HealthCheckType/TCP (health-check-type {:test/item :tcp} "test" :item)))))


(deftest namespace-type-test
  (testing "Testing enum function namespace-type"
    (is (= NamespaceType/DNS_PRIVATE (namespace-type {:item NamespaceType/DNS_PRIVATE} "test" :item)))
    (is (= NamespaceType/DNS_PRIVATE (namespace-type {:test/item NamespaceType/DNS_PRIVATE} "test" :item)))
    (is (= NamespaceType/HTTP (namespace-type {:item NamespaceType/HTTP} "test" :item)))
    (is (= NamespaceType/HTTP (namespace-type {:test/item NamespaceType/HTTP} "test" :item)))
    (is (= NamespaceType/DNS_PUBLIC (namespace-type {:item NamespaceType/DNS_PUBLIC} "test" :item)))
    (is (= NamespaceType/DNS_PUBLIC (namespace-type {:test/item NamespaceType/DNS_PUBLIC} "test" :item)))
    (is (= NamespaceType/DNS_PRIVATE (namespace-type {:item :dns-private} "test" :item)))
    (is (= NamespaceType/DNS_PRIVATE (namespace-type {:test/item :dns-private} "test" :item)))
    (is (= NamespaceType/HTTP (namespace-type {:item :http} "test" :item)))
    (is (= NamespaceType/HTTP (namespace-type {:test/item :http} "test" :item)))
    (is (= NamespaceType/DNS_PUBLIC (namespace-type {:item :dns-public} "test" :item)))
    (is (= NamespaceType/DNS_PUBLIC (namespace-type {:test/item :dns-public} "test" :item)))))


(deftest routing-policy-test
  (testing "Testing enum function routing-policy"
    (is (= RoutingPolicy/MULTIVALUE (routing-policy {:item RoutingPolicy/MULTIVALUE} "test" :item)))
    (is (= RoutingPolicy/MULTIVALUE (routing-policy {:test/item RoutingPolicy/MULTIVALUE} "test" :item)))
    (is (= RoutingPolicy/WEIGHTED (routing-policy {:item RoutingPolicy/WEIGHTED} "test" :item)))
    (is (= RoutingPolicy/WEIGHTED (routing-policy {:test/item RoutingPolicy/WEIGHTED} "test" :item)))
    (is (= RoutingPolicy/MULTIVALUE (routing-policy {:item :multivalue} "test" :item)))
    (is (= RoutingPolicy/MULTIVALUE (routing-policy {:test/item :multivalue} "test" :item)))
    (is (= RoutingPolicy/WEIGHTED (routing-policy {:item :weighted} "test" :item)))
    (is (= RoutingPolicy/WEIGHTED (routing-policy {:test/item :weighted} "test" :item)))))