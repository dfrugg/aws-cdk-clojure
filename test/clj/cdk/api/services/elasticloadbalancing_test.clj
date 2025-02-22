(ns cdk.api.services.elasticloadbalancing-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancing package. "
  (:require [cdk.api.services.elasticloadbalancing :refer [load-balancing-protocol]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.elasticloadbalancing LoadBalancingProtocol]))


(deftest load-balancing-protocol-test
  (testing "Testing enum function load-balancing-protocol"
    (is (= LoadBalancingProtocol/HTTP (load-balancing-protocol {:item LoadBalancingProtocol/HTTP} "test" :item)))
    (is (= LoadBalancingProtocol/HTTP (load-balancing-protocol {:test/item LoadBalancingProtocol/HTTP} "test" :item)))
    (is (= LoadBalancingProtocol/TCP (load-balancing-protocol {:item LoadBalancingProtocol/TCP} "test" :item)))
    (is (= LoadBalancingProtocol/TCP (load-balancing-protocol {:test/item LoadBalancingProtocol/TCP} "test" :item)))
    (is (= LoadBalancingProtocol/HTTPS (load-balancing-protocol {:item LoadBalancingProtocol/HTTPS} "test" :item)))
    (is (= LoadBalancingProtocol/HTTPS (load-balancing-protocol {:test/item LoadBalancingProtocol/HTTPS} "test" :item)))
    (is (= LoadBalancingProtocol/SSL (load-balancing-protocol {:item LoadBalancingProtocol/SSL} "test" :item)))
    (is (= LoadBalancingProtocol/SSL (load-balancing-protocol {:test/item LoadBalancingProtocol/SSL} "test" :item)))
    (is (= LoadBalancingProtocol/HTTP (load-balancing-protocol {:item :http} "test" :item)))
    (is (= LoadBalancingProtocol/HTTP (load-balancing-protocol {:test/item :http} "test" :item)))
    (is (= LoadBalancingProtocol/TCP (load-balancing-protocol {:item :tcp} "test" :item)))
    (is (= LoadBalancingProtocol/TCP (load-balancing-protocol {:test/item :tcp} "test" :item)))
    (is (= LoadBalancingProtocol/HTTPS (load-balancing-protocol {:item :https} "test" :item)))
    (is (= LoadBalancingProtocol/HTTPS (load-balancing-protocol {:test/item :https} "test" :item)))
    (is (= LoadBalancingProtocol/SSL (load-balancing-protocol {:item :ssl} "test" :item)))
    (is (= LoadBalancingProtocol/SSL (load-balancing-protocol {:test/item :ssl} "test" :item)))))