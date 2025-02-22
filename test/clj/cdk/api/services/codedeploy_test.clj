(ns cdk.api.services.codedeploy-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codedeploy package. "
  (:require [cdk.api.services.codedeploy :refer [compute-platform
                                                 load-balancer-generation]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codedeploy ComputePlatform
                                                       LoadBalancerGeneration]))


(deftest compute-platform-test
  (testing "Testing enum function compute-platform"
    (is (= ComputePlatform/LAMBDA (compute-platform {:item ComputePlatform/LAMBDA} "test" :item)))
    (is (= ComputePlatform/LAMBDA (compute-platform {:test/item ComputePlatform/LAMBDA} "test" :item)))
    (is (= ComputePlatform/SERVER (compute-platform {:item ComputePlatform/SERVER} "test" :item)))
    (is (= ComputePlatform/SERVER (compute-platform {:test/item ComputePlatform/SERVER} "test" :item)))
    (is (= ComputePlatform/ECS (compute-platform {:item ComputePlatform/ECS} "test" :item)))
    (is (= ComputePlatform/ECS (compute-platform {:test/item ComputePlatform/ECS} "test" :item)))
    (is (= ComputePlatform/LAMBDA (compute-platform {:item :lambda} "test" :item)))
    (is (= ComputePlatform/LAMBDA (compute-platform {:test/item :lambda} "test" :item)))
    (is (= ComputePlatform/SERVER (compute-platform {:item :server} "test" :item)))
    (is (= ComputePlatform/SERVER (compute-platform {:test/item :server} "test" :item)))
    (is (= ComputePlatform/ECS (compute-platform {:item :ecs} "test" :item)))
    (is (= ComputePlatform/ECS (compute-platform {:test/item :ecs} "test" :item)))))


(deftest load-balancer-generation-test
  (testing "Testing enum function load-balancer-generation"
    (is (= LoadBalancerGeneration/SECOND (load-balancer-generation {:item LoadBalancerGeneration/SECOND} "test" :item)))
    (is (= LoadBalancerGeneration/SECOND (load-balancer-generation {:test/item LoadBalancerGeneration/SECOND} "test" :item)))
    (is (= LoadBalancerGeneration/FIRST (load-balancer-generation {:item LoadBalancerGeneration/FIRST} "test" :item)))
    (is (= LoadBalancerGeneration/FIRST (load-balancer-generation {:test/item LoadBalancerGeneration/FIRST} "test" :item)))
    (is (= LoadBalancerGeneration/SECOND (load-balancer-generation {:item :second} "test" :item)))
    (is (= LoadBalancerGeneration/SECOND (load-balancer-generation {:test/item :second} "test" :item)))
    (is (= LoadBalancerGeneration/FIRST (load-balancer-generation {:item :first} "test" :item)))
    (is (= LoadBalancerGeneration/FIRST (load-balancer-generation {:test/item :first} "test" :item)))))