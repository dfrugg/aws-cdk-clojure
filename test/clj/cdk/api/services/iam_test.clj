(ns cdk.api.services.iam-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iam package. "
  (:require [cdk.api.services.iam :refer [access-key-status
                                          effect]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.iam AccessKeyStatus
                                                Effect]))


(deftest access-key-status-test
  (testing "Testing enum function access-key-status"
    (is (= AccessKeyStatus/INACTIVE (access-key-status {:item AccessKeyStatus/INACTIVE} "test" :item)))
    (is (= AccessKeyStatus/INACTIVE (access-key-status {:test/item AccessKeyStatus/INACTIVE} "test" :item)))
    (is (= AccessKeyStatus/ACTIVE (access-key-status {:item AccessKeyStatus/ACTIVE} "test" :item)))
    (is (= AccessKeyStatus/ACTIVE (access-key-status {:test/item AccessKeyStatus/ACTIVE} "test" :item)))
    (is (= AccessKeyStatus/INACTIVE (access-key-status {:item :inactive} "test" :item)))
    (is (= AccessKeyStatus/INACTIVE (access-key-status {:test/item :inactive} "test" :item)))
    (is (= AccessKeyStatus/ACTIVE (access-key-status {:item :active} "test" :item)))
    (is (= AccessKeyStatus/ACTIVE (access-key-status {:test/item :active} "test" :item)))))


(deftest effect-test
  (testing "Testing enum function effect"
    (is (= Effect/ALLOW (effect {:item Effect/ALLOW} "test" :item)))
    (is (= Effect/ALLOW (effect {:test/item Effect/ALLOW} "test" :item)))
    (is (= Effect/DENY (effect {:item Effect/DENY} "test" :item)))
    (is (= Effect/DENY (effect {:test/item Effect/DENY} "test" :item)))
    (is (= Effect/ALLOW (effect {:item :allow} "test" :item)))
    (is (= Effect/ALLOW (effect {:test/item :allow} "test" :item)))
    (is (= Effect/DENY (effect {:item :deny} "test" :item)))
    (is (= Effect/DENY (effect {:test/item :deny} "test" :item)))))