(ns cdk.api.services.config-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.config package. "
  (:require [cdk.api.services.config :refer [maximum-execution-frequency]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.config MaximumExecutionFrequency]))


(deftest maximum-execution-frequency-test
  (testing "Testing enum function maximum-execution-frequency"
    (is (= MaximumExecutionFrequency/TWELVE_HOURS (maximum-execution-frequency {:item MaximumExecutionFrequency/TWELVE_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/TWELVE_HOURS (maximum-execution-frequency {:test/item MaximumExecutionFrequency/TWELVE_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/TWENTY_FOUR_HOURS (maximum-execution-frequency {:item MaximumExecutionFrequency/TWENTY_FOUR_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/TWENTY_FOUR_HOURS (maximum-execution-frequency {:test/item MaximumExecutionFrequency/TWENTY_FOUR_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/ONE_HOUR (maximum-execution-frequency {:item MaximumExecutionFrequency/ONE_HOUR} "test" :item)))
    (is (= MaximumExecutionFrequency/ONE_HOUR (maximum-execution-frequency {:test/item MaximumExecutionFrequency/ONE_HOUR} "test" :item)))
    (is (= MaximumExecutionFrequency/THREE_HOURS (maximum-execution-frequency {:item MaximumExecutionFrequency/THREE_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/THREE_HOURS (maximum-execution-frequency {:test/item MaximumExecutionFrequency/THREE_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/SIX_HOURS (maximum-execution-frequency {:item MaximumExecutionFrequency/SIX_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/SIX_HOURS (maximum-execution-frequency {:test/item MaximumExecutionFrequency/SIX_HOURS} "test" :item)))
    (is (= MaximumExecutionFrequency/TWELVE_HOURS (maximum-execution-frequency {:item :twelve-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/TWELVE_HOURS (maximum-execution-frequency {:test/item :twelve-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/TWENTY_FOUR_HOURS (maximum-execution-frequency {:item :twenty-four-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/TWENTY_FOUR_HOURS (maximum-execution-frequency {:test/item :twenty-four-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/ONE_HOUR (maximum-execution-frequency {:item :one-hour} "test" :item)))
    (is (= MaximumExecutionFrequency/ONE_HOUR (maximum-execution-frequency {:test/item :one-hour} "test" :item)))
    (is (= MaximumExecutionFrequency/THREE_HOURS (maximum-execution-frequency {:item :three-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/THREE_HOURS (maximum-execution-frequency {:test/item :three-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/SIX_HOURS (maximum-execution-frequency {:item :six-hours} "test" :item)))
    (is (= MaximumExecutionFrequency/SIX_HOURS (maximum-execution-frequency {:test/item :six-hours} "test" :item)))))