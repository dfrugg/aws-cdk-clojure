(ns cdk.api.services.codeguruprofiler-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codeguruprofiler package. "
  (:require [cdk.api.services.codeguruprofiler :refer [compute-platform]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codeguruprofiler ComputePlatform]))


(deftest compute-platform-test
  (testing "Testing enum function compute-platform"
    (is (= ComputePlatform/AWS_LAMBDA (compute-platform {:item ComputePlatform/AWS_LAMBDA} "test" :item)))
    (is (= ComputePlatform/AWS_LAMBDA (compute-platform {:test/item ComputePlatform/AWS_LAMBDA} "test" :item)))
    (is (= ComputePlatform/DEFAULT (compute-platform {:item ComputePlatform/DEFAULT} "test" :item)))
    (is (= ComputePlatform/DEFAULT (compute-platform {:test/item ComputePlatform/DEFAULT} "test" :item)))
    (is (= ComputePlatform/AWS_LAMBDA (compute-platform {:item :aws-lambda} "test" :item)))
    (is (= ComputePlatform/AWS_LAMBDA (compute-platform {:test/item :aws-lambda} "test" :item)))
    (is (= ComputePlatform/DEFAULT (compute-platform {:item :default} "test" :item)))
    (is (= ComputePlatform/DEFAULT (compute-platform {:test/item :default} "test" :item)))))