(ns cdk.api.triggers-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.triggers package. "
  (:require [cdk.api.triggers :refer [invocation-type
                                      trigger-invalidation]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.triggers InvocationType
                                            TriggerInvalidation]))


(deftest invocation-type-test
  (testing "Testing enum function invocation-type"
    (is (= InvocationType/DRY_RUN (invocation-type {:item InvocationType/DRY_RUN} "test" :item)))
    (is (= InvocationType/DRY_RUN (invocation-type {:test/item InvocationType/DRY_RUN} "test" :item)))
    (is (= InvocationType/EVENT (invocation-type {:item InvocationType/EVENT} "test" :item)))
    (is (= InvocationType/EVENT (invocation-type {:test/item InvocationType/EVENT} "test" :item)))
    (is (= InvocationType/REQUEST_RESPONSE (invocation-type {:item InvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= InvocationType/REQUEST_RESPONSE (invocation-type {:test/item InvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= InvocationType/DRY_RUN (invocation-type {:item :dry-run} "test" :item)))
    (is (= InvocationType/DRY_RUN (invocation-type {:test/item :dry-run} "test" :item)))
    (is (= InvocationType/EVENT (invocation-type {:item :event} "test" :item)))
    (is (= InvocationType/EVENT (invocation-type {:test/item :event} "test" :item)))
    (is (= InvocationType/REQUEST_RESPONSE (invocation-type {:item :request-response} "test" :item)))
    (is (= InvocationType/REQUEST_RESPONSE (invocation-type {:test/item :request-response} "test" :item)))))


(deftest trigger-invalidation-test
  (testing "Testing enum function trigger-invalidation"
    (is (= TriggerInvalidation/HANDLER_CHANGE (trigger-invalidation {:item TriggerInvalidation/HANDLER_CHANGE} "test" :item)))
    (is (= TriggerInvalidation/HANDLER_CHANGE (trigger-invalidation {:test/item TriggerInvalidation/HANDLER_CHANGE} "test" :item)))
    (is (= TriggerInvalidation/HANDLER_CHANGE (trigger-invalidation {:item :handler-change} "test" :item)))
    (is (= TriggerInvalidation/HANDLER_CHANGE (trigger-invalidation {:test/item :handler-change} "test" :item)))))