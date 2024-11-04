(ns cdk.api.services.ses.actions-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ses.actions package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.ses.actions :refer [email-encoding
                                                  lambda-invocation-type]])
  (:import [software.amazon.awscdk.services.ses.actions EmailEncoding
                                                        LambdaInvocationType]))


(deftest email-encoding-test
  (testing "Testing enum function email-encoding"
    (is (= EmailEncoding/BASE64 (email-encoding {:item EmailEncoding/BASE64} "test" :item)))
    (is (= EmailEncoding/BASE64 (email-encoding {:test/item EmailEncoding/BASE64} "test" :item)))
    (is (= EmailEncoding/UTF8 (email-encoding {:item EmailEncoding/UTF8} "test" :item)))
    (is (= EmailEncoding/UTF8 (email-encoding {:test/item EmailEncoding/UTF8} "test" :item)))
    (is (= EmailEncoding/BASE64 (email-encoding {:item :base64} "test" :item)))
    (is (= EmailEncoding/BASE64 (email-encoding {:test/item :base64} "test" :item)))
    (is (= EmailEncoding/UTF8 (email-encoding {:item :utf8} "test" :item)))
    (is (= EmailEncoding/UTF8 (email-encoding {:test/item :utf8} "test" :item)))))


(deftest lambda-invocation-type-test
  (testing "Testing enum function lambda-invocation-type"
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:item LambdaInvocationType/EVENT} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:test/item LambdaInvocationType/EVENT} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:item LambdaInvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:test/item LambdaInvocationType/REQUEST_RESPONSE} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:item :event} "test" :item)))
    (is (= LambdaInvocationType/EVENT (lambda-invocation-type {:test/item :event} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:item :request-response} "test" :item)))
    (is (= LambdaInvocationType/REQUEST_RESPONSE (lambda-invocation-type {:test/item :request-response} "test" :item)))))