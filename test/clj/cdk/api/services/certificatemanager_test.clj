(ns cdk.api.services.certificatemanager-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.certificatemanager package. "
  (:require [cdk.api.services.certificatemanager :refer [validation-method]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.certificatemanager ValidationMethod]))


(deftest validation-method-test
  (testing "Testing enum function validation-method"
    (is (= ValidationMethod/EMAIL (validation-method {:item ValidationMethod/EMAIL} "test" :item)))
    (is (= ValidationMethod/EMAIL (validation-method {:test/item ValidationMethod/EMAIL} "test" :item)))
    (is (= ValidationMethod/DNS (validation-method {:item ValidationMethod/DNS} "test" :item)))
    (is (= ValidationMethod/DNS (validation-method {:test/item ValidationMethod/DNS} "test" :item)))
    (is (= ValidationMethod/EMAIL (validation-method {:item :email} "test" :item)))
    (is (= ValidationMethod/EMAIL (validation-method {:test/item :email} "test" :item)))
    (is (= ValidationMethod/DNS (validation-method {:item :dns} "test" :item)))
    (is (= ValidationMethod/DNS (validation-method {:test/item :dns} "test" :item)))))