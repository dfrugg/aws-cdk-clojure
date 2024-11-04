(ns cdk.api.services.opensearchservice-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opensearchservice package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.opensearchservice :refer [ip-address-type
                                                        tls-security-policy]])
  (:import [software.amazon.awscdk.services.opensearchservice IpAddressType
                                                              TLSSecurityPolicy]))


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


(deftest tls-security-policy-test
  (testing "Testing enum function tls-security-policy"
    (is (= TLSSecurityPolicy/TLS_1_2_PFS (tls-security-policy {:item TLSSecurityPolicy/TLS_1_2_PFS} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2_PFS (tls-security-policy {:test/item TLSSecurityPolicy/TLS_1_2_PFS} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2 (tls-security-policy {:item TLSSecurityPolicy/TLS_1_2} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2 (tls-security-policy {:test/item TLSSecurityPolicy/TLS_1_2} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_0 (tls-security-policy {:item TLSSecurityPolicy/TLS_1_0} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_0 (tls-security-policy {:test/item TLSSecurityPolicy/TLS_1_0} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2_PFS (tls-security-policy {:item :tls-1-2-pfs} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2_PFS (tls-security-policy {:test/item :tls-1-2-pfs} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2 (tls-security-policy {:item :tls-1-2} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_2 (tls-security-policy {:test/item :tls-1-2} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_0 (tls-security-policy {:item :tls-1-0} "test" :item)))
    (is (= TLSSecurityPolicy/TLS_1_0 (tls-security-policy {:test/item :tls-1-0} "test" :item)))))