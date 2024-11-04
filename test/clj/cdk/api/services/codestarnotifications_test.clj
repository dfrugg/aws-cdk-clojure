(ns cdk.api.services.codestarnotifications-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestarnotifications package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.codestarnotifications :refer [detail-type]])
  (:import [software.amazon.awscdk.services.codestarnotifications DetailType]))


(deftest detail-type-test
  (testing "Testing enum function detail-type"
    (is (= DetailType/BASIC (detail-type {:item DetailType/BASIC} "test" :item)))
    (is (= DetailType/BASIC (detail-type {:test/item DetailType/BASIC} "test" :item)))
    (is (= DetailType/FULL (detail-type {:item DetailType/FULL} "test" :item)))
    (is (= DetailType/FULL (detail-type {:test/item DetailType/FULL} "test" :item)))
    (is (= DetailType/BASIC (detail-type {:item :basic} "test" :item)))
    (is (= DetailType/BASIC (detail-type {:test/item :basic} "test" :item)))
    (is (= DetailType/FULL (detail-type {:item :full} "test" :item)))
    (is (= DetailType/FULL (detail-type {:test/item :full} "test" :item)))))