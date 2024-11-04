(ns cdk.api.cxapi-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cxapi package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.cxapi :refer [load-balancer-ip-address-type
                                   synthesis-message-level
                                   vpc-subnet-group-type]])
  (:import [software.amazon.awscdk.cxapi LoadBalancerIpAddressType
                                         SynthesisMessageLevel
                                         VpcSubnetGroupType]))


(deftest load-balancer-ip-address-type-test
  (testing "Testing enum function load-balancer-ip-address-type"
    (is (= LoadBalancerIpAddressType/DUAL_STACK (load-balancer-ip-address-type {:item LoadBalancerIpAddressType/DUAL_STACK} "test" :item)))
    (is (= LoadBalancerIpAddressType/DUAL_STACK (load-balancer-ip-address-type {:test/item LoadBalancerIpAddressType/DUAL_STACK} "test" :item)))
    (is (= LoadBalancerIpAddressType/IPV4 (load-balancer-ip-address-type {:item LoadBalancerIpAddressType/IPV4} "test" :item)))
    (is (= LoadBalancerIpAddressType/IPV4 (load-balancer-ip-address-type {:test/item LoadBalancerIpAddressType/IPV4} "test" :item)))
    (is (= LoadBalancerIpAddressType/DUAL_STACK (load-balancer-ip-address-type {:item :dual-stack} "test" :item)))
    (is (= LoadBalancerIpAddressType/DUAL_STACK (load-balancer-ip-address-type {:test/item :dual-stack} "test" :item)))
    (is (= LoadBalancerIpAddressType/IPV4 (load-balancer-ip-address-type {:item :ipv4} "test" :item)))
    (is (= LoadBalancerIpAddressType/IPV4 (load-balancer-ip-address-type {:test/item :ipv4} "test" :item)))))


(deftest synthesis-message-level-test
  (testing "Testing enum function synthesis-message-level"
    (is (= SynthesisMessageLevel/ERROR (synthesis-message-level {:item SynthesisMessageLevel/ERROR} "test" :item)))
    (is (= SynthesisMessageLevel/ERROR (synthesis-message-level {:test/item SynthesisMessageLevel/ERROR} "test" :item)))
    (is (= SynthesisMessageLevel/INFO (synthesis-message-level {:item SynthesisMessageLevel/INFO} "test" :item)))
    (is (= SynthesisMessageLevel/INFO (synthesis-message-level {:test/item SynthesisMessageLevel/INFO} "test" :item)))
    (is (= SynthesisMessageLevel/WARNING (synthesis-message-level {:item SynthesisMessageLevel/WARNING} "test" :item)))
    (is (= SynthesisMessageLevel/WARNING (synthesis-message-level {:test/item SynthesisMessageLevel/WARNING} "test" :item)))
    (is (= SynthesisMessageLevel/ERROR (synthesis-message-level {:item :error} "test" :item)))
    (is (= SynthesisMessageLevel/ERROR (synthesis-message-level {:test/item :error} "test" :item)))
    (is (= SynthesisMessageLevel/INFO (synthesis-message-level {:item :info} "test" :item)))
    (is (= SynthesisMessageLevel/INFO (synthesis-message-level {:test/item :info} "test" :item)))
    (is (= SynthesisMessageLevel/WARNING (synthesis-message-level {:item :warning} "test" :item)))
    (is (= SynthesisMessageLevel/WARNING (synthesis-message-level {:test/item :warning} "test" :item)))))


(deftest vpc-subnet-group-type-test
  (testing "Testing enum function vpc-subnet-group-type"
    (is (= VpcSubnetGroupType/ISOLATED (vpc-subnet-group-type {:item VpcSubnetGroupType/ISOLATED} "test" :item)))
    (is (= VpcSubnetGroupType/ISOLATED (vpc-subnet-group-type {:test/item VpcSubnetGroupType/ISOLATED} "test" :item)))
    (is (= VpcSubnetGroupType/PUBLIC (vpc-subnet-group-type {:item VpcSubnetGroupType/PUBLIC} "test" :item)))
    (is (= VpcSubnetGroupType/PUBLIC (vpc-subnet-group-type {:test/item VpcSubnetGroupType/PUBLIC} "test" :item)))
    (is (= VpcSubnetGroupType/PRIVATE (vpc-subnet-group-type {:item VpcSubnetGroupType/PRIVATE} "test" :item)))
    (is (= VpcSubnetGroupType/PRIVATE (vpc-subnet-group-type {:test/item VpcSubnetGroupType/PRIVATE} "test" :item)))
    (is (= VpcSubnetGroupType/ISOLATED (vpc-subnet-group-type {:item :isolated} "test" :item)))
    (is (= VpcSubnetGroupType/ISOLATED (vpc-subnet-group-type {:test/item :isolated} "test" :item)))
    (is (= VpcSubnetGroupType/PUBLIC (vpc-subnet-group-type {:item :public} "test" :item)))
    (is (= VpcSubnetGroupType/PUBLIC (vpc-subnet-group-type {:test/item :public} "test" :item)))
    (is (= VpcSubnetGroupType/PRIVATE (vpc-subnet-group-type {:item :private} "test" :item)))
    (is (= VpcSubnetGroupType/PRIVATE (vpc-subnet-group-type {:test/item :private} "test" :item)))))