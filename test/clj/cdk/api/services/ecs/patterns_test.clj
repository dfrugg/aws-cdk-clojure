(ns cdk.api.services.ecs.patterns-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs.patterns package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.ecs.patterns :refer [application-load-balanced-service-record-type
                                                   network-load-balanced-service-record-type]])
  (:import [software.amazon.awscdk.services.ecs.patterns ApplicationLoadBalancedServiceRecordType
                                                         NetworkLoadBalancedServiceRecordType]))


(deftest application-load-balanced-service-record-type-test
  (testing "Testing enum function application-load-balanced-service-record-type"
    (is (= ApplicationLoadBalancedServiceRecordType/ALIAS (application-load-balanced-service-record-type {:item ApplicationLoadBalancedServiceRecordType/ALIAS} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/ALIAS (application-load-balanced-service-record-type {:test/item ApplicationLoadBalancedServiceRecordType/ALIAS} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/CNAME (application-load-balanced-service-record-type {:item ApplicationLoadBalancedServiceRecordType/CNAME} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/CNAME (application-load-balanced-service-record-type {:test/item ApplicationLoadBalancedServiceRecordType/CNAME} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/NONE (application-load-balanced-service-record-type {:item ApplicationLoadBalancedServiceRecordType/NONE} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/NONE (application-load-balanced-service-record-type {:test/item ApplicationLoadBalancedServiceRecordType/NONE} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/ALIAS (application-load-balanced-service-record-type {:item :alias} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/ALIAS (application-load-balanced-service-record-type {:test/item :alias} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/CNAME (application-load-balanced-service-record-type {:item :cname} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/CNAME (application-load-balanced-service-record-type {:test/item :cname} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/NONE (application-load-balanced-service-record-type {:item :none} "test" :item)))
    (is (= ApplicationLoadBalancedServiceRecordType/NONE (application-load-balanced-service-record-type {:test/item :none} "test" :item)))))


(deftest network-load-balanced-service-record-type-test
  (testing "Testing enum function network-load-balanced-service-record-type"
    (is (= NetworkLoadBalancedServiceRecordType/NONE (network-load-balanced-service-record-type {:item NetworkLoadBalancedServiceRecordType/NONE} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/NONE (network-load-balanced-service-record-type {:test/item NetworkLoadBalancedServiceRecordType/NONE} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/CNAME (network-load-balanced-service-record-type {:item NetworkLoadBalancedServiceRecordType/CNAME} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/CNAME (network-load-balanced-service-record-type {:test/item NetworkLoadBalancedServiceRecordType/CNAME} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/ALIAS (network-load-balanced-service-record-type {:item NetworkLoadBalancedServiceRecordType/ALIAS} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/ALIAS (network-load-balanced-service-record-type {:test/item NetworkLoadBalancedServiceRecordType/ALIAS} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/NONE (network-load-balanced-service-record-type {:item :none} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/NONE (network-load-balanced-service-record-type {:test/item :none} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/CNAME (network-load-balanced-service-record-type {:item :cname} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/CNAME (network-load-balanced-service-record-type {:test/item :cname} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/ALIAS (network-load-balanced-service-record-type {:item :alias} "test" :item)))
    (is (= NetworkLoadBalancedServiceRecordType/ALIAS (network-load-balanced-service-record-type {:test/item :alias} "test" :item)))))