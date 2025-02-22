(ns cdk.api.services.sns-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sns package. "
  (:require [cdk.api.services.sns :refer [filter-or-policy-type
                                          logging-protocol
                                          subscription-protocol
                                          tracing-config]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.sns FilterOrPolicyType
                                                LoggingProtocol
                                                SubscriptionProtocol
                                                TracingConfig]))


(deftest filter-or-policy-type-test
  (testing "Testing enum function filter-or-policy-type"
    (is (= FilterOrPolicyType/POLICY (filter-or-policy-type {:item FilterOrPolicyType/POLICY} "test" :item)))
    (is (= FilterOrPolicyType/POLICY (filter-or-policy-type {:test/item FilterOrPolicyType/POLICY} "test" :item)))
    (is (= FilterOrPolicyType/FILTER (filter-or-policy-type {:item FilterOrPolicyType/FILTER} "test" :item)))
    (is (= FilterOrPolicyType/FILTER (filter-or-policy-type {:test/item FilterOrPolicyType/FILTER} "test" :item)))
    (is (= FilterOrPolicyType/POLICY (filter-or-policy-type {:item :policy} "test" :item)))
    (is (= FilterOrPolicyType/POLICY (filter-or-policy-type {:test/item :policy} "test" :item)))
    (is (= FilterOrPolicyType/FILTER (filter-or-policy-type {:item :filter} "test" :item)))
    (is (= FilterOrPolicyType/FILTER (filter-or-policy-type {:test/item :filter} "test" :item)))))


(deftest logging-protocol-test
  (testing "Testing enum function logging-protocol"
    (is (= LoggingProtocol/FIREHOSE (logging-protocol {:item LoggingProtocol/FIREHOSE} "test" :item)))
    (is (= LoggingProtocol/FIREHOSE (logging-protocol {:test/item LoggingProtocol/FIREHOSE} "test" :item)))
    (is (= LoggingProtocol/SQS (logging-protocol {:item LoggingProtocol/SQS} "test" :item)))
    (is (= LoggingProtocol/SQS (logging-protocol {:test/item LoggingProtocol/SQS} "test" :item)))
    (is (= LoggingProtocol/HTTP (logging-protocol {:item LoggingProtocol/HTTP} "test" :item)))
    (is (= LoggingProtocol/HTTP (logging-protocol {:test/item LoggingProtocol/HTTP} "test" :item)))
    (is (= LoggingProtocol/APPLICATION (logging-protocol {:item LoggingProtocol/APPLICATION} "test" :item)))
    (is (= LoggingProtocol/APPLICATION (logging-protocol {:test/item LoggingProtocol/APPLICATION} "test" :item)))
    (is (= LoggingProtocol/LAMBDA (logging-protocol {:item LoggingProtocol/LAMBDA} "test" :item)))
    (is (= LoggingProtocol/LAMBDA (logging-protocol {:test/item LoggingProtocol/LAMBDA} "test" :item)))
    (is (= LoggingProtocol/FIREHOSE (logging-protocol {:item :firehose} "test" :item)))
    (is (= LoggingProtocol/FIREHOSE (logging-protocol {:test/item :firehose} "test" :item)))
    (is (= LoggingProtocol/SQS (logging-protocol {:item :sqs} "test" :item)))
    (is (= LoggingProtocol/SQS (logging-protocol {:test/item :sqs} "test" :item)))
    (is (= LoggingProtocol/HTTP (logging-protocol {:item :http} "test" :item)))
    (is (= LoggingProtocol/HTTP (logging-protocol {:test/item :http} "test" :item)))
    (is (= LoggingProtocol/APPLICATION (logging-protocol {:item :application} "test" :item)))
    (is (= LoggingProtocol/APPLICATION (logging-protocol {:test/item :application} "test" :item)))
    (is (= LoggingProtocol/LAMBDA (logging-protocol {:item :lambda} "test" :item)))
    (is (= LoggingProtocol/LAMBDA (logging-protocol {:test/item :lambda} "test" :item)))))


(deftest subscription-protocol-test
  (testing "Testing enum function subscription-protocol"
    (is (= SubscriptionProtocol/HTTP (subscription-protocol {:item SubscriptionProtocol/HTTP} "test" :item)))
    (is (= SubscriptionProtocol/HTTP (subscription-protocol {:test/item SubscriptionProtocol/HTTP} "test" :item)))
    (is (= SubscriptionProtocol/APPLICATION (subscription-protocol {:item SubscriptionProtocol/APPLICATION} "test" :item)))
    (is (= SubscriptionProtocol/APPLICATION (subscription-protocol {:test/item SubscriptionProtocol/APPLICATION} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL_JSON (subscription-protocol {:item SubscriptionProtocol/EMAIL_JSON} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL_JSON (subscription-protocol {:test/item SubscriptionProtocol/EMAIL_JSON} "test" :item)))
    (is (= SubscriptionProtocol/SQS (subscription-protocol {:item SubscriptionProtocol/SQS} "test" :item)))
    (is (= SubscriptionProtocol/SQS (subscription-protocol {:test/item SubscriptionProtocol/SQS} "test" :item)))
    (is (= SubscriptionProtocol/SMS (subscription-protocol {:item SubscriptionProtocol/SMS} "test" :item)))
    (is (= SubscriptionProtocol/SMS (subscription-protocol {:test/item SubscriptionProtocol/SMS} "test" :item)))
    (is (= SubscriptionProtocol/HTTPS (subscription-protocol {:item SubscriptionProtocol/HTTPS} "test" :item)))
    (is (= SubscriptionProtocol/HTTPS (subscription-protocol {:test/item SubscriptionProtocol/HTTPS} "test" :item)))
    (is (= SubscriptionProtocol/LAMBDA (subscription-protocol {:item SubscriptionProtocol/LAMBDA} "test" :item)))
    (is (= SubscriptionProtocol/LAMBDA (subscription-protocol {:test/item SubscriptionProtocol/LAMBDA} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL (subscription-protocol {:item SubscriptionProtocol/EMAIL} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL (subscription-protocol {:test/item SubscriptionProtocol/EMAIL} "test" :item)))
    (is (= SubscriptionProtocol/FIREHOSE (subscription-protocol {:item SubscriptionProtocol/FIREHOSE} "test" :item)))
    (is (= SubscriptionProtocol/FIREHOSE (subscription-protocol {:test/item SubscriptionProtocol/FIREHOSE} "test" :item)))
    (is (= SubscriptionProtocol/HTTP (subscription-protocol {:item :http} "test" :item)))
    (is (= SubscriptionProtocol/HTTP (subscription-protocol {:test/item :http} "test" :item)))
    (is (= SubscriptionProtocol/APPLICATION (subscription-protocol {:item :application} "test" :item)))
    (is (= SubscriptionProtocol/APPLICATION (subscription-protocol {:test/item :application} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL_JSON (subscription-protocol {:item :email-json} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL_JSON (subscription-protocol {:test/item :email-json} "test" :item)))
    (is (= SubscriptionProtocol/SQS (subscription-protocol {:item :sqs} "test" :item)))
    (is (= SubscriptionProtocol/SQS (subscription-protocol {:test/item :sqs} "test" :item)))
    (is (= SubscriptionProtocol/SMS (subscription-protocol {:item :sms} "test" :item)))
    (is (= SubscriptionProtocol/SMS (subscription-protocol {:test/item :sms} "test" :item)))
    (is (= SubscriptionProtocol/HTTPS (subscription-protocol {:item :https} "test" :item)))
    (is (= SubscriptionProtocol/HTTPS (subscription-protocol {:test/item :https} "test" :item)))
    (is (= SubscriptionProtocol/LAMBDA (subscription-protocol {:item :lambda} "test" :item)))
    (is (= SubscriptionProtocol/LAMBDA (subscription-protocol {:test/item :lambda} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL (subscription-protocol {:item :email} "test" :item)))
    (is (= SubscriptionProtocol/EMAIL (subscription-protocol {:test/item :email} "test" :item)))
    (is (= SubscriptionProtocol/FIREHOSE (subscription-protocol {:item :firehose} "test" :item)))
    (is (= SubscriptionProtocol/FIREHOSE (subscription-protocol {:test/item :firehose} "test" :item)))))


(deftest tracing-config-test
  (testing "Testing enum function tracing-config"
    (is (= TracingConfig/ACTIVE (tracing-config {:item TracingConfig/ACTIVE} "test" :item)))
    (is (= TracingConfig/ACTIVE (tracing-config {:test/item TracingConfig/ACTIVE} "test" :item)))
    (is (= TracingConfig/PASS_THROUGH (tracing-config {:item TracingConfig/PASS_THROUGH} "test" :item)))
    (is (= TracingConfig/PASS_THROUGH (tracing-config {:test/item TracingConfig/PASS_THROUGH} "test" :item)))
    (is (= TracingConfig/ACTIVE (tracing-config {:item :active} "test" :item)))
    (is (= TracingConfig/ACTIVE (tracing-config {:test/item :active} "test" :item)))
    (is (= TracingConfig/PASS_THROUGH (tracing-config {:item :pass-through} "test" :item)))
    (is (= TracingConfig/PASS_THROUGH (tracing-config {:test/item :pass-through} "test" :item)))))