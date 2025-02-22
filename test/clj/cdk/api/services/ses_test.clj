(ns cdk.api.services.ses-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ses package. "
  (:require [cdk.api.services.ses :refer [cloud-watch-dimension-source
                                          configuration-set-tls-policy
                                          easy-dkim-signing-key-length
                                          email-sending-event
                                          mail-from-behavior-on-mx-failure
                                          receipt-filter-policy
                                          scaling-mode
                                          suppression-reasons
                                          tls-policy]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.ses CloudWatchDimensionSource
                                                ConfigurationSetTlsPolicy
                                                EasyDkimSigningKeyLength
                                                EmailSendingEvent
                                                MailFromBehaviorOnMxFailure
                                                ReceiptFilterPolicy
                                                ScalingMode
                                                SuppressionReasons
                                                TlsPolicy]))


(deftest cloud-watch-dimension-source-test
  (testing "Testing enum function cloud-watch-dimension-source"
    (is (= CloudWatchDimensionSource/MESSAGE_TAG (cloud-watch-dimension-source {:item CloudWatchDimensionSource/MESSAGE_TAG} "test" :item)))
    (is (= CloudWatchDimensionSource/MESSAGE_TAG (cloud-watch-dimension-source {:test/item CloudWatchDimensionSource/MESSAGE_TAG} "test" :item)))
    (is (= CloudWatchDimensionSource/EMAIL_HEADER (cloud-watch-dimension-source {:item CloudWatchDimensionSource/EMAIL_HEADER} "test" :item)))
    (is (= CloudWatchDimensionSource/EMAIL_HEADER (cloud-watch-dimension-source {:test/item CloudWatchDimensionSource/EMAIL_HEADER} "test" :item)))
    (is (= CloudWatchDimensionSource/LINK_TAG (cloud-watch-dimension-source {:item CloudWatchDimensionSource/LINK_TAG} "test" :item)))
    (is (= CloudWatchDimensionSource/LINK_TAG (cloud-watch-dimension-source {:test/item CloudWatchDimensionSource/LINK_TAG} "test" :item)))
    (is (= CloudWatchDimensionSource/MESSAGE_TAG (cloud-watch-dimension-source {:item :message-tag} "test" :item)))
    (is (= CloudWatchDimensionSource/MESSAGE_TAG (cloud-watch-dimension-source {:test/item :message-tag} "test" :item)))
    (is (= CloudWatchDimensionSource/EMAIL_HEADER (cloud-watch-dimension-source {:item :email-header} "test" :item)))
    (is (= CloudWatchDimensionSource/EMAIL_HEADER (cloud-watch-dimension-source {:test/item :email-header} "test" :item)))
    (is (= CloudWatchDimensionSource/LINK_TAG (cloud-watch-dimension-source {:item :link-tag} "test" :item)))
    (is (= CloudWatchDimensionSource/LINK_TAG (cloud-watch-dimension-source {:test/item :link-tag} "test" :item)))))


(deftest configuration-set-tls-policy-test
  (testing "Testing enum function configuration-set-tls-policy"
    (is (= ConfigurationSetTlsPolicy/OPTIONAL (configuration-set-tls-policy {:item ConfigurationSetTlsPolicy/OPTIONAL} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/OPTIONAL (configuration-set-tls-policy {:test/item ConfigurationSetTlsPolicy/OPTIONAL} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/REQUIRE (configuration-set-tls-policy {:item ConfigurationSetTlsPolicy/REQUIRE} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/REQUIRE (configuration-set-tls-policy {:test/item ConfigurationSetTlsPolicy/REQUIRE} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/OPTIONAL (configuration-set-tls-policy {:item :optional} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/OPTIONAL (configuration-set-tls-policy {:test/item :optional} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/REQUIRE (configuration-set-tls-policy {:item :require} "test" :item)))
    (is (= ConfigurationSetTlsPolicy/REQUIRE (configuration-set-tls-policy {:test/item :require} "test" :item)))))


(deftest easy-dkim-signing-key-length-test
  (testing "Testing enum function easy-dkim-signing-key-length"
    (is (= EasyDkimSigningKeyLength/RSA_2048_BIT (easy-dkim-signing-key-length {:item EasyDkimSigningKeyLength/RSA_2048_BIT} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_2048_BIT (easy-dkim-signing-key-length {:test/item EasyDkimSigningKeyLength/RSA_2048_BIT} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_1024_BIT (easy-dkim-signing-key-length {:item EasyDkimSigningKeyLength/RSA_1024_BIT} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_1024_BIT (easy-dkim-signing-key-length {:test/item EasyDkimSigningKeyLength/RSA_1024_BIT} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_2048_BIT (easy-dkim-signing-key-length {:item :rsa-2048-bit} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_2048_BIT (easy-dkim-signing-key-length {:test/item :rsa-2048-bit} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_1024_BIT (easy-dkim-signing-key-length {:item :rsa-1024-bit} "test" :item)))
    (is (= EasyDkimSigningKeyLength/RSA_1024_BIT (easy-dkim-signing-key-length {:test/item :rsa-1024-bit} "test" :item)))))


(deftest email-sending-event-test
  (testing "Testing enum function email-sending-event"
    (is (= EmailSendingEvent/SEND (email-sending-event {:item EmailSendingEvent/SEND} "test" :item)))
    (is (= EmailSendingEvent/SEND (email-sending-event {:test/item EmailSendingEvent/SEND} "test" :item)))
    (is (= EmailSendingEvent/OPEN (email-sending-event {:item EmailSendingEvent/OPEN} "test" :item)))
    (is (= EmailSendingEvent/OPEN (email-sending-event {:test/item EmailSendingEvent/OPEN} "test" :item)))
    (is (= EmailSendingEvent/COMPLAINT (email-sending-event {:item EmailSendingEvent/COMPLAINT} "test" :item)))
    (is (= EmailSendingEvent/COMPLAINT (email-sending-event {:test/item EmailSendingEvent/COMPLAINT} "test" :item)))
    (is (= EmailSendingEvent/REJECT (email-sending-event {:item EmailSendingEvent/REJECT} "test" :item)))
    (is (= EmailSendingEvent/REJECT (email-sending-event {:test/item EmailSendingEvent/REJECT} "test" :item)))
    (is (= EmailSendingEvent/SUBSCRIPTION (email-sending-event {:item EmailSendingEvent/SUBSCRIPTION} "test" :item)))
    (is (= EmailSendingEvent/SUBSCRIPTION (email-sending-event {:test/item EmailSendingEvent/SUBSCRIPTION} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY (email-sending-event {:item EmailSendingEvent/DELIVERY} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY (email-sending-event {:test/item EmailSendingEvent/DELIVERY} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY_DELAY (email-sending-event {:item EmailSendingEvent/DELIVERY_DELAY} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY_DELAY (email-sending-event {:test/item EmailSendingEvent/DELIVERY_DELAY} "test" :item)))
    (is (= EmailSendingEvent/CLICK (email-sending-event {:item EmailSendingEvent/CLICK} "test" :item)))
    (is (= EmailSendingEvent/CLICK (email-sending-event {:test/item EmailSendingEvent/CLICK} "test" :item)))
    (is (= EmailSendingEvent/BOUNCE (email-sending-event {:item EmailSendingEvent/BOUNCE} "test" :item)))
    (is (= EmailSendingEvent/BOUNCE (email-sending-event {:test/item EmailSendingEvent/BOUNCE} "test" :item)))
    (is (= EmailSendingEvent/RENDERING_FAILURE (email-sending-event {:item EmailSendingEvent/RENDERING_FAILURE} "test" :item)))
    (is (= EmailSendingEvent/RENDERING_FAILURE (email-sending-event {:test/item EmailSendingEvent/RENDERING_FAILURE} "test" :item)))
    (is (= EmailSendingEvent/SEND (email-sending-event {:item :send} "test" :item)))
    (is (= EmailSendingEvent/SEND (email-sending-event {:test/item :send} "test" :item)))
    (is (= EmailSendingEvent/OPEN (email-sending-event {:item :open} "test" :item)))
    (is (= EmailSendingEvent/OPEN (email-sending-event {:test/item :open} "test" :item)))
    (is (= EmailSendingEvent/COMPLAINT (email-sending-event {:item :complaint} "test" :item)))
    (is (= EmailSendingEvent/COMPLAINT (email-sending-event {:test/item :complaint} "test" :item)))
    (is (= EmailSendingEvent/REJECT (email-sending-event {:item :reject} "test" :item)))
    (is (= EmailSendingEvent/REJECT (email-sending-event {:test/item :reject} "test" :item)))
    (is (= EmailSendingEvent/SUBSCRIPTION (email-sending-event {:item :subscription} "test" :item)))
    (is (= EmailSendingEvent/SUBSCRIPTION (email-sending-event {:test/item :subscription} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY (email-sending-event {:item :delivery} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY (email-sending-event {:test/item :delivery} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY_DELAY (email-sending-event {:item :delivery-delay} "test" :item)))
    (is (= EmailSendingEvent/DELIVERY_DELAY (email-sending-event {:test/item :delivery-delay} "test" :item)))
    (is (= EmailSendingEvent/CLICK (email-sending-event {:item :click} "test" :item)))
    (is (= EmailSendingEvent/CLICK (email-sending-event {:test/item :click} "test" :item)))
    (is (= EmailSendingEvent/BOUNCE (email-sending-event {:item :bounce} "test" :item)))
    (is (= EmailSendingEvent/BOUNCE (email-sending-event {:test/item :bounce} "test" :item)))
    (is (= EmailSendingEvent/RENDERING_FAILURE (email-sending-event {:item :rendering-failure} "test" :item)))
    (is (= EmailSendingEvent/RENDERING_FAILURE (email-sending-event {:test/item :rendering-failure} "test" :item)))))


(deftest mail-from-behavior-on-mx-failure-test
  (testing "Testing enum function mail-from-behavior-on-mx-failure"
    (is (= MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE (mail-from-behavior-on-mx-failure {:item MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE (mail-from-behavior-on-mx-failure {:test/item MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/REJECT_MESSAGE (mail-from-behavior-on-mx-failure {:item MailFromBehaviorOnMxFailure/REJECT_MESSAGE} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/REJECT_MESSAGE (mail-from-behavior-on-mx-failure {:test/item MailFromBehaviorOnMxFailure/REJECT_MESSAGE} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE (mail-from-behavior-on-mx-failure {:item :use-default-value} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/USE_DEFAULT_VALUE (mail-from-behavior-on-mx-failure {:test/item :use-default-value} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/REJECT_MESSAGE (mail-from-behavior-on-mx-failure {:item :reject-message} "test" :item)))
    (is (= MailFromBehaviorOnMxFailure/REJECT_MESSAGE (mail-from-behavior-on-mx-failure {:test/item :reject-message} "test" :item)))))


(deftest receipt-filter-policy-test
  (testing "Testing enum function receipt-filter-policy"
    (is (= ReceiptFilterPolicy/ALLOW (receipt-filter-policy {:item ReceiptFilterPolicy/ALLOW} "test" :item)))
    (is (= ReceiptFilterPolicy/ALLOW (receipt-filter-policy {:test/item ReceiptFilterPolicy/ALLOW} "test" :item)))
    (is (= ReceiptFilterPolicy/BLOCK (receipt-filter-policy {:item ReceiptFilterPolicy/BLOCK} "test" :item)))
    (is (= ReceiptFilterPolicy/BLOCK (receipt-filter-policy {:test/item ReceiptFilterPolicy/BLOCK} "test" :item)))
    (is (= ReceiptFilterPolicy/ALLOW (receipt-filter-policy {:item :allow} "test" :item)))
    (is (= ReceiptFilterPolicy/ALLOW (receipt-filter-policy {:test/item :allow} "test" :item)))
    (is (= ReceiptFilterPolicy/BLOCK (receipt-filter-policy {:item :block} "test" :item)))
    (is (= ReceiptFilterPolicy/BLOCK (receipt-filter-policy {:test/item :block} "test" :item)))))


(deftest scaling-mode-test
  (testing "Testing enum function scaling-mode"
    (is (= ScalingMode/STANDARD (scaling-mode {:item ScalingMode/STANDARD} "test" :item)))
    (is (= ScalingMode/STANDARD (scaling-mode {:test/item ScalingMode/STANDARD} "test" :item)))
    (is (= ScalingMode/MANAGED (scaling-mode {:item ScalingMode/MANAGED} "test" :item)))
    (is (= ScalingMode/MANAGED (scaling-mode {:test/item ScalingMode/MANAGED} "test" :item)))
    (is (= ScalingMode/STANDARD (scaling-mode {:item :standard} "test" :item)))
    (is (= ScalingMode/STANDARD (scaling-mode {:test/item :standard} "test" :item)))
    (is (= ScalingMode/MANAGED (scaling-mode {:item :managed} "test" :item)))
    (is (= ScalingMode/MANAGED (scaling-mode {:test/item :managed} "test" :item)))))


(deftest suppression-reasons-test
  (testing "Testing enum function suppression-reasons"
    (is (= SuppressionReasons/BOUNCES_ONLY (suppression-reasons {:item SuppressionReasons/BOUNCES_ONLY} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_ONLY (suppression-reasons {:test/item SuppressionReasons/BOUNCES_ONLY} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_AND_COMPLAINTS (suppression-reasons {:item SuppressionReasons/BOUNCES_AND_COMPLAINTS} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_AND_COMPLAINTS (suppression-reasons {:test/item SuppressionReasons/BOUNCES_AND_COMPLAINTS} "test" :item)))
    (is (= SuppressionReasons/COMPLAINTS_ONLY (suppression-reasons {:item SuppressionReasons/COMPLAINTS_ONLY} "test" :item)))
    (is (= SuppressionReasons/COMPLAINTS_ONLY (suppression-reasons {:test/item SuppressionReasons/COMPLAINTS_ONLY} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_ONLY (suppression-reasons {:item :bounces-only} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_ONLY (suppression-reasons {:test/item :bounces-only} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_AND_COMPLAINTS (suppression-reasons {:item :bounces-and-complaints} "test" :item)))
    (is (= SuppressionReasons/BOUNCES_AND_COMPLAINTS (suppression-reasons {:test/item :bounces-and-complaints} "test" :item)))
    (is (= SuppressionReasons/COMPLAINTS_ONLY (suppression-reasons {:item :complaints-only} "test" :item)))
    (is (= SuppressionReasons/COMPLAINTS_ONLY (suppression-reasons {:test/item :complaints-only} "test" :item)))))


(deftest tls-policy-test
  (testing "Testing enum function tls-policy"
    (is (= TlsPolicy/REQUIRE (tls-policy {:item TlsPolicy/REQUIRE} "test" :item)))
    (is (= TlsPolicy/REQUIRE (tls-policy {:test/item TlsPolicy/REQUIRE} "test" :item)))
    (is (= TlsPolicy/OPTIONAL (tls-policy {:item TlsPolicy/OPTIONAL} "test" :item)))
    (is (= TlsPolicy/OPTIONAL (tls-policy {:test/item TlsPolicy/OPTIONAL} "test" :item)))
    (is (= TlsPolicy/REQUIRE (tls-policy {:item :require} "test" :item)))
    (is (= TlsPolicy/REQUIRE (tls-policy {:test/item :require} "test" :item)))
    (is (= TlsPolicy/OPTIONAL (tls-policy {:item :optional} "test" :item)))
    (is (= TlsPolicy/OPTIONAL (tls-policy {:test/item :optional} "test" :item)))))