(ns cdk.api.services.lambda.eventsources-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.eventsources package. "
  (:require [cdk.api.services.lambda.eventsources :refer [authentication-method]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.lambda.eventsources AuthenticationMethod]))


(deftest authentication-method-test
  (testing "Testing enum function authentication-method"
    (is (= AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH (authentication-method {:item AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH} "test" :item)))
    (is (= AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH (authentication-method {:test/item AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_512_AUTH (authentication-method {:item AuthenticationMethod/SASL_SCRAM_512_AUTH} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_512_AUTH (authentication-method {:test/item AuthenticationMethod/SASL_SCRAM_512_AUTH} "test" :item)))
    (is (= AuthenticationMethod/BASIC_AUTH (authentication-method {:item AuthenticationMethod/BASIC_AUTH} "test" :item)))
    (is (= AuthenticationMethod/BASIC_AUTH (authentication-method {:test/item AuthenticationMethod/BASIC_AUTH} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_256_AUTH (authentication-method {:item AuthenticationMethod/SASL_SCRAM_256_AUTH} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_256_AUTH (authentication-method {:test/item AuthenticationMethod/SASL_SCRAM_256_AUTH} "test" :item)))
    (is (= AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH (authentication-method {:item :client-certificate-tls-auth} "test" :item)))
    (is (= AuthenticationMethod/CLIENT_CERTIFICATE_TLS_AUTH (authentication-method {:test/item :client-certificate-tls-auth} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_512_AUTH (authentication-method {:item :sasl-scram-512-auth} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_512_AUTH (authentication-method {:test/item :sasl-scram-512-auth} "test" :item)))
    (is (= AuthenticationMethod/BASIC_AUTH (authentication-method {:item :basic-auth} "test" :item)))
    (is (= AuthenticationMethod/BASIC_AUTH (authentication-method {:test/item :basic-auth} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_256_AUTH (authentication-method {:item :sasl-scram-256-auth} "test" :item)))
    (is (= AuthenticationMethod/SASL_SCRAM_256_AUTH (authentication-method {:test/item :sasl-scram-256-auth} "test" :item)))))