(ns cdk.api.services.chatbot-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.chatbot package. "
  (:require [cdk.api.services.chatbot :refer [logging-level]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.chatbot LoggingLevel]))


(deftest logging-level-test
  (testing "Testing enum function logging-level"
    (is (= LoggingLevel/ERROR (logging-level {:item LoggingLevel/ERROR} "test" :item)))
    (is (= LoggingLevel/ERROR (logging-level {:test/item LoggingLevel/ERROR} "test" :item)))
    (is (= LoggingLevel/NONE (logging-level {:item LoggingLevel/NONE} "test" :item)))
    (is (= LoggingLevel/NONE (logging-level {:test/item LoggingLevel/NONE} "test" :item)))
    (is (= LoggingLevel/INFO (logging-level {:item LoggingLevel/INFO} "test" :item)))
    (is (= LoggingLevel/INFO (logging-level {:test/item LoggingLevel/INFO} "test" :item)))
    (is (= LoggingLevel/ERROR (logging-level {:item :error} "test" :item)))
    (is (= LoggingLevel/ERROR (logging-level {:test/item :error} "test" :item)))
    (is (= LoggingLevel/NONE (logging-level {:item :none} "test" :item)))
    (is (= LoggingLevel/NONE (logging-level {:test/item :none} "test" :item)))
    (is (= LoggingLevel/INFO (logging-level {:item :info} "test" :item)))
    (is (= LoggingLevel/INFO (logging-level {:test/item :info} "test" :item)))))