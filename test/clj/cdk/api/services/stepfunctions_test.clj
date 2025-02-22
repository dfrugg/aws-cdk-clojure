(ns cdk.api.services.stepfunctions-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.stepfunctions package. "
  (:require [cdk.api.services.stepfunctions :refer [csv-header-location
                                                    input-type
                                                    integration-pattern
                                                    jitter-type
                                                    log-level
                                                    processor-mode
                                                    processor-type
                                                    service-integration-pattern
                                                    state-machine-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.stepfunctions CsvHeaderLocation
                                                          InputType
                                                          IntegrationPattern
                                                          JitterType
                                                          LogLevel
                                                          ProcessorMode
                                                          ProcessorType
                                                          ServiceIntegrationPattern
                                                          StateMachineType]))


(deftest csv-header-location-test
  (testing "Testing enum function csv-header-location"
    (is (= CsvHeaderLocation/FIRST_ROW (csv-header-location {:item CsvHeaderLocation/FIRST_ROW} "test" :item)))
    (is (= CsvHeaderLocation/FIRST_ROW (csv-header-location {:test/item CsvHeaderLocation/FIRST_ROW} "test" :item)))
    (is (= CsvHeaderLocation/GIVEN (csv-header-location {:item CsvHeaderLocation/GIVEN} "test" :item)))
    (is (= CsvHeaderLocation/GIVEN (csv-header-location {:test/item CsvHeaderLocation/GIVEN} "test" :item)))
    (is (= CsvHeaderLocation/FIRST_ROW (csv-header-location {:item :first-row} "test" :item)))
    (is (= CsvHeaderLocation/FIRST_ROW (csv-header-location {:test/item :first-row} "test" :item)))
    (is (= CsvHeaderLocation/GIVEN (csv-header-location {:item :given} "test" :item)))
    (is (= CsvHeaderLocation/GIVEN (csv-header-location {:test/item :given} "test" :item)))))


(deftest input-type-test
  (testing "Testing enum function input-type"
    (is (= InputType/OBJECT (input-type {:item InputType/OBJECT} "test" :item)))
    (is (= InputType/OBJECT (input-type {:test/item InputType/OBJECT} "test" :item)))
    (is (= InputType/TEXT (input-type {:item InputType/TEXT} "test" :item)))
    (is (= InputType/TEXT (input-type {:test/item InputType/TEXT} "test" :item)))
    (is (= InputType/OBJECT (input-type {:item :object} "test" :item)))
    (is (= InputType/OBJECT (input-type {:test/item :object} "test" :item)))
    (is (= InputType/TEXT (input-type {:item :text} "test" :item)))
    (is (= InputType/TEXT (input-type {:test/item :text} "test" :item)))))


(deftest integration-pattern-test
  (testing "Testing enum function integration-pattern"
    (is (= IntegrationPattern/RUN_JOB (integration-pattern {:item IntegrationPattern/RUN_JOB} "test" :item)))
    (is (= IntegrationPattern/RUN_JOB (integration-pattern {:test/item IntegrationPattern/RUN_JOB} "test" :item)))
    (is (= IntegrationPattern/WAIT_FOR_TASK_TOKEN (integration-pattern {:item IntegrationPattern/WAIT_FOR_TASK_TOKEN} "test" :item)))
    (is (= IntegrationPattern/WAIT_FOR_TASK_TOKEN (integration-pattern {:test/item IntegrationPattern/WAIT_FOR_TASK_TOKEN} "test" :item)))
    (is (= IntegrationPattern/REQUEST_RESPONSE (integration-pattern {:item IntegrationPattern/REQUEST_RESPONSE} "test" :item)))
    (is (= IntegrationPattern/REQUEST_RESPONSE (integration-pattern {:test/item IntegrationPattern/REQUEST_RESPONSE} "test" :item)))
    (is (= IntegrationPattern/RUN_JOB (integration-pattern {:item :run-job} "test" :item)))
    (is (= IntegrationPattern/RUN_JOB (integration-pattern {:test/item :run-job} "test" :item)))
    (is (= IntegrationPattern/WAIT_FOR_TASK_TOKEN (integration-pattern {:item :wait-for-task-token} "test" :item)))
    (is (= IntegrationPattern/WAIT_FOR_TASK_TOKEN (integration-pattern {:test/item :wait-for-task-token} "test" :item)))
    (is (= IntegrationPattern/REQUEST_RESPONSE (integration-pattern {:item :request-response} "test" :item)))
    (is (= IntegrationPattern/REQUEST_RESPONSE (integration-pattern {:test/item :request-response} "test" :item)))))


(deftest jitter-type-test
  (testing "Testing enum function jitter-type"
    (is (= JitterType/FULL (jitter-type {:item JitterType/FULL} "test" :item)))
    (is (= JitterType/FULL (jitter-type {:test/item JitterType/FULL} "test" :item)))
    (is (= JitterType/NONE (jitter-type {:item JitterType/NONE} "test" :item)))
    (is (= JitterType/NONE (jitter-type {:test/item JitterType/NONE} "test" :item)))
    (is (= JitterType/FULL (jitter-type {:item :full} "test" :item)))
    (is (= JitterType/FULL (jitter-type {:test/item :full} "test" :item)))
    (is (= JitterType/NONE (jitter-type {:item :none} "test" :item)))
    (is (= JitterType/NONE (jitter-type {:test/item :none} "test" :item)))))


(deftest log-level-test
  (testing "Testing enum function log-level"
    (is (= LogLevel/ALL (log-level {:item LogLevel/ALL} "test" :item)))
    (is (= LogLevel/ALL (log-level {:test/item LogLevel/ALL} "test" :item)))
    (is (= LogLevel/FATAL (log-level {:item LogLevel/FATAL} "test" :item)))
    (is (= LogLevel/FATAL (log-level {:test/item LogLevel/FATAL} "test" :item)))
    (is (= LogLevel/OFF (log-level {:item LogLevel/OFF} "test" :item)))
    (is (= LogLevel/OFF (log-level {:test/item LogLevel/OFF} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:item LogLevel/ERROR} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:test/item LogLevel/ERROR} "test" :item)))
    (is (= LogLevel/ALL (log-level {:item :all} "test" :item)))
    (is (= LogLevel/ALL (log-level {:test/item :all} "test" :item)))
    (is (= LogLevel/FATAL (log-level {:item :fatal} "test" :item)))
    (is (= LogLevel/FATAL (log-level {:test/item :fatal} "test" :item)))
    (is (= LogLevel/OFF (log-level {:item :off} "test" :item)))
    (is (= LogLevel/OFF (log-level {:test/item :off} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:item :error} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:test/item :error} "test" :item)))))


(deftest processor-mode-test
  (testing "Testing enum function processor-mode"
    (is (= ProcessorMode/INLINE (processor-mode {:item ProcessorMode/INLINE} "test" :item)))
    (is (= ProcessorMode/INLINE (processor-mode {:test/item ProcessorMode/INLINE} "test" :item)))
    (is (= ProcessorMode/DISTRIBUTED (processor-mode {:item ProcessorMode/DISTRIBUTED} "test" :item)))
    (is (= ProcessorMode/DISTRIBUTED (processor-mode {:test/item ProcessorMode/DISTRIBUTED} "test" :item)))
    (is (= ProcessorMode/INLINE (processor-mode {:item :inline} "test" :item)))
    (is (= ProcessorMode/INLINE (processor-mode {:test/item :inline} "test" :item)))
    (is (= ProcessorMode/DISTRIBUTED (processor-mode {:item :distributed} "test" :item)))
    (is (= ProcessorMode/DISTRIBUTED (processor-mode {:test/item :distributed} "test" :item)))))


(deftest processor-type-test
  (testing "Testing enum function processor-type"
    (is (= ProcessorType/STANDARD (processor-type {:item ProcessorType/STANDARD} "test" :item)))
    (is (= ProcessorType/STANDARD (processor-type {:test/item ProcessorType/STANDARD} "test" :item)))
    (is (= ProcessorType/EXPRESS (processor-type {:item ProcessorType/EXPRESS} "test" :item)))
    (is (= ProcessorType/EXPRESS (processor-type {:test/item ProcessorType/EXPRESS} "test" :item)))
    (is (= ProcessorType/STANDARD (processor-type {:item :standard} "test" :item)))
    (is (= ProcessorType/STANDARD (processor-type {:test/item :standard} "test" :item)))
    (is (= ProcessorType/EXPRESS (processor-type {:item :express} "test" :item)))
    (is (= ProcessorType/EXPRESS (processor-type {:test/item :express} "test" :item)))))


(deftest service-integration-pattern-test
  (testing "Testing enum function service-integration-pattern"
    (is (= ServiceIntegrationPattern/FIRE_AND_FORGET (service-integration-pattern {:item ServiceIntegrationPattern/FIRE_AND_FORGET} "test" :item)))
    (is (= ServiceIntegrationPattern/FIRE_AND_FORGET (service-integration-pattern {:test/item ServiceIntegrationPattern/FIRE_AND_FORGET} "test" :item)))
    (is (= ServiceIntegrationPattern/SYNC (service-integration-pattern {:item ServiceIntegrationPattern/SYNC} "test" :item)))
    (is (= ServiceIntegrationPattern/SYNC (service-integration-pattern {:test/item ServiceIntegrationPattern/SYNC} "test" :item)))
    (is (= ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN (service-integration-pattern {:item ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN} "test" :item)))
    (is (= ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN (service-integration-pattern {:test/item ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN} "test" :item)))
    (is (= ServiceIntegrationPattern/FIRE_AND_FORGET (service-integration-pattern {:item :fire-and-forget} "test" :item)))
    (is (= ServiceIntegrationPattern/FIRE_AND_FORGET (service-integration-pattern {:test/item :fire-and-forget} "test" :item)))
    (is (= ServiceIntegrationPattern/SYNC (service-integration-pattern {:item :sync} "test" :item)))
    (is (= ServiceIntegrationPattern/SYNC (service-integration-pattern {:test/item :sync} "test" :item)))
    (is (= ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN (service-integration-pattern {:item :wait-for-task-token} "test" :item)))
    (is (= ServiceIntegrationPattern/WAIT_FOR_TASK_TOKEN (service-integration-pattern {:test/item :wait-for-task-token} "test" :item)))))


(deftest state-machine-type-test
  (testing "Testing enum function state-machine-type"
    (is (= StateMachineType/EXPRESS (state-machine-type {:item StateMachineType/EXPRESS} "test" :item)))
    (is (= StateMachineType/EXPRESS (state-machine-type {:test/item StateMachineType/EXPRESS} "test" :item)))
    (is (= StateMachineType/STANDARD (state-machine-type {:item StateMachineType/STANDARD} "test" :item)))
    (is (= StateMachineType/STANDARD (state-machine-type {:test/item StateMachineType/STANDARD} "test" :item)))
    (is (= StateMachineType/EXPRESS (state-machine-type {:item :express} "test" :item)))
    (is (= StateMachineType/EXPRESS (state-machine-type {:test/item :express} "test" :item)))
    (is (= StateMachineType/STANDARD (state-machine-type {:item :standard} "test" :item)))
    (is (= StateMachineType/STANDARD (state-machine-type {:test/item :standard} "test" :item)))))