(ns cdk.api.services.autoscaling-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.autoscaling package. "
  (:require [cdk.api.services.autoscaling :refer [adjustment-type
                                                  default-result
                                                  ebs-device-volume-type
                                                  lifecycle-transition
                                                  metric-aggregation-type
                                                  monitoring
                                                  on-demand-allocation-strategy
                                                  pool-state
                                                  predefined-metric
                                                  scaling-event
                                                  scaling-process
                                                  spot-allocation-strategy
                                                  termination-policy]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.autoscaling AdjustmentType
                                                        DefaultResult
                                                        EbsDeviceVolumeType
                                                        LifecycleTransition
                                                        MetricAggregationType
                                                        Monitoring
                                                        OnDemandAllocationStrategy
                                                        PoolState
                                                        PredefinedMetric
                                                        ScalingEvent
                                                        ScalingProcess
                                                        SpotAllocationStrategy
                                                        TerminationPolicy]))


(deftest adjustment-type-test
  (testing "Testing enum function adjustment-type"
    (is (= AdjustmentType/CHANGE_IN_CAPACITY (adjustment-type {:item AdjustmentType/CHANGE_IN_CAPACITY} "test" :item)))
    (is (= AdjustmentType/CHANGE_IN_CAPACITY (adjustment-type {:test/item AdjustmentType/CHANGE_IN_CAPACITY} "test" :item)))
    (is (= AdjustmentType/PERCENT_CHANGE_IN_CAPACITY (adjustment-type {:item AdjustmentType/PERCENT_CHANGE_IN_CAPACITY} "test" :item)))
    (is (= AdjustmentType/PERCENT_CHANGE_IN_CAPACITY (adjustment-type {:test/item AdjustmentType/PERCENT_CHANGE_IN_CAPACITY} "test" :item)))
    (is (= AdjustmentType/EXACT_CAPACITY (adjustment-type {:item AdjustmentType/EXACT_CAPACITY} "test" :item)))
    (is (= AdjustmentType/EXACT_CAPACITY (adjustment-type {:test/item AdjustmentType/EXACT_CAPACITY} "test" :item)))
    (is (= AdjustmentType/CHANGE_IN_CAPACITY (adjustment-type {:item :change-in-capacity} "test" :item)))
    (is (= AdjustmentType/CHANGE_IN_CAPACITY (adjustment-type {:test/item :change-in-capacity} "test" :item)))
    (is (= AdjustmentType/PERCENT_CHANGE_IN_CAPACITY (adjustment-type {:item :percent-change-in-capacity} "test" :item)))
    (is (= AdjustmentType/PERCENT_CHANGE_IN_CAPACITY (adjustment-type {:test/item :percent-change-in-capacity} "test" :item)))
    (is (= AdjustmentType/EXACT_CAPACITY (adjustment-type {:item :exact-capacity} "test" :item)))
    (is (= AdjustmentType/EXACT_CAPACITY (adjustment-type {:test/item :exact-capacity} "test" :item)))))


(deftest default-result-test
  (testing "Testing enum function default-result"
    (is (= DefaultResult/CONTINUE (default-result {:item DefaultResult/CONTINUE} "test" :item)))
    (is (= DefaultResult/CONTINUE (default-result {:test/item DefaultResult/CONTINUE} "test" :item)))
    (is (= DefaultResult/ABANDON (default-result {:item DefaultResult/ABANDON} "test" :item)))
    (is (= DefaultResult/ABANDON (default-result {:test/item DefaultResult/ABANDON} "test" :item)))
    (is (= DefaultResult/CONTINUE (default-result {:item :continue} "test" :item)))
    (is (= DefaultResult/CONTINUE (default-result {:test/item :continue} "test" :item)))
    (is (= DefaultResult/ABANDON (default-result {:item :abandon} "test" :item)))
    (is (= DefaultResult/ABANDON (default-result {:test/item :abandon} "test" :item)))))


(deftest ebs-device-volume-type-test
  (testing "Testing enum function ebs-device-volume-type"
    (is (= EbsDeviceVolumeType/IO1 (ebs-device-volume-type {:item EbsDeviceVolumeType/IO1} "test" :item)))
    (is (= EbsDeviceVolumeType/IO1 (ebs-device-volume-type {:test/item EbsDeviceVolumeType/IO1} "test" :item)))
    (is (= EbsDeviceVolumeType/GP2 (ebs-device-volume-type {:item EbsDeviceVolumeType/GP2} "test" :item)))
    (is (= EbsDeviceVolumeType/GP2 (ebs-device-volume-type {:test/item EbsDeviceVolumeType/GP2} "test" :item)))
    (is (= EbsDeviceVolumeType/GP3 (ebs-device-volume-type {:item EbsDeviceVolumeType/GP3} "test" :item)))
    (is (= EbsDeviceVolumeType/GP3 (ebs-device-volume-type {:test/item EbsDeviceVolumeType/GP3} "test" :item)))
    (is (= EbsDeviceVolumeType/SC1 (ebs-device-volume-type {:item EbsDeviceVolumeType/SC1} "test" :item)))
    (is (= EbsDeviceVolumeType/SC1 (ebs-device-volume-type {:test/item EbsDeviceVolumeType/SC1} "test" :item)))
    (is (= EbsDeviceVolumeType/STANDARD (ebs-device-volume-type {:item EbsDeviceVolumeType/STANDARD} "test" :item)))
    (is (= EbsDeviceVolumeType/STANDARD (ebs-device-volume-type {:test/item EbsDeviceVolumeType/STANDARD} "test" :item)))
    (is (= EbsDeviceVolumeType/ST1 (ebs-device-volume-type {:item EbsDeviceVolumeType/ST1} "test" :item)))
    (is (= EbsDeviceVolumeType/ST1 (ebs-device-volume-type {:test/item EbsDeviceVolumeType/ST1} "test" :item)))
    (is (= EbsDeviceVolumeType/IO1 (ebs-device-volume-type {:item :io1} "test" :item)))
    (is (= EbsDeviceVolumeType/IO1 (ebs-device-volume-type {:test/item :io1} "test" :item)))
    (is (= EbsDeviceVolumeType/GP2 (ebs-device-volume-type {:item :gp2} "test" :item)))
    (is (= EbsDeviceVolumeType/GP2 (ebs-device-volume-type {:test/item :gp2} "test" :item)))
    (is (= EbsDeviceVolumeType/GP3 (ebs-device-volume-type {:item :gp3} "test" :item)))
    (is (= EbsDeviceVolumeType/GP3 (ebs-device-volume-type {:test/item :gp3} "test" :item)))
    (is (= EbsDeviceVolumeType/SC1 (ebs-device-volume-type {:item :sc1} "test" :item)))
    (is (= EbsDeviceVolumeType/SC1 (ebs-device-volume-type {:test/item :sc1} "test" :item)))
    (is (= EbsDeviceVolumeType/STANDARD (ebs-device-volume-type {:item :standard} "test" :item)))
    (is (= EbsDeviceVolumeType/STANDARD (ebs-device-volume-type {:test/item :standard} "test" :item)))
    (is (= EbsDeviceVolumeType/ST1 (ebs-device-volume-type {:item :st1} "test" :item)))
    (is (= EbsDeviceVolumeType/ST1 (ebs-device-volume-type {:test/item :st1} "test" :item)))))


(deftest lifecycle-transition-test
  (testing "Testing enum function lifecycle-transition"
    (is (= LifecycleTransition/INSTANCE_LAUNCHING (lifecycle-transition {:item LifecycleTransition/INSTANCE_LAUNCHING} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_LAUNCHING (lifecycle-transition {:test/item LifecycleTransition/INSTANCE_LAUNCHING} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_TERMINATING (lifecycle-transition {:item LifecycleTransition/INSTANCE_TERMINATING} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_TERMINATING (lifecycle-transition {:test/item LifecycleTransition/INSTANCE_TERMINATING} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_LAUNCHING (lifecycle-transition {:item :instance-launching} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_LAUNCHING (lifecycle-transition {:test/item :instance-launching} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_TERMINATING (lifecycle-transition {:item :instance-terminating} "test" :item)))
    (is (= LifecycleTransition/INSTANCE_TERMINATING (lifecycle-transition {:test/item :instance-terminating} "test" :item)))))


(deftest metric-aggregation-type-test
  (testing "Testing enum function metric-aggregation-type"
    (is (= MetricAggregationType/MAXIMUM (metric-aggregation-type {:item MetricAggregationType/MAXIMUM} "test" :item)))
    (is (= MetricAggregationType/MAXIMUM (metric-aggregation-type {:test/item MetricAggregationType/MAXIMUM} "test" :item)))
    (is (= MetricAggregationType/MINIMUM (metric-aggregation-type {:item MetricAggregationType/MINIMUM} "test" :item)))
    (is (= MetricAggregationType/MINIMUM (metric-aggregation-type {:test/item MetricAggregationType/MINIMUM} "test" :item)))
    (is (= MetricAggregationType/AVERAGE (metric-aggregation-type {:item MetricAggregationType/AVERAGE} "test" :item)))
    (is (= MetricAggregationType/AVERAGE (metric-aggregation-type {:test/item MetricAggregationType/AVERAGE} "test" :item)))
    (is (= MetricAggregationType/MAXIMUM (metric-aggregation-type {:item :maximum} "test" :item)))
    (is (= MetricAggregationType/MAXIMUM (metric-aggregation-type {:test/item :maximum} "test" :item)))
    (is (= MetricAggregationType/MINIMUM (metric-aggregation-type {:item :minimum} "test" :item)))
    (is (= MetricAggregationType/MINIMUM (metric-aggregation-type {:test/item :minimum} "test" :item)))
    (is (= MetricAggregationType/AVERAGE (metric-aggregation-type {:item :average} "test" :item)))
    (is (= MetricAggregationType/AVERAGE (metric-aggregation-type {:test/item :average} "test" :item)))))


(deftest monitoring-test
  (testing "Testing enum function monitoring"
    (is (= Monitoring/BASIC (monitoring {:item Monitoring/BASIC} "test" :item)))
    (is (= Monitoring/BASIC (monitoring {:test/item Monitoring/BASIC} "test" :item)))
    (is (= Monitoring/DETAILED (monitoring {:item Monitoring/DETAILED} "test" :item)))
    (is (= Monitoring/DETAILED (monitoring {:test/item Monitoring/DETAILED} "test" :item)))
    (is (= Monitoring/BASIC (monitoring {:item :basic} "test" :item)))
    (is (= Monitoring/BASIC (monitoring {:test/item :basic} "test" :item)))
    (is (= Monitoring/DETAILED (monitoring {:item :detailed} "test" :item)))
    (is (= Monitoring/DETAILED (monitoring {:test/item :detailed} "test" :item)))))


(deftest on-demand-allocation-strategy-test
  (testing "Testing enum function on-demand-allocation-strategy"
    (is (= OnDemandAllocationStrategy/PRIORITIZED (on-demand-allocation-strategy {:item OnDemandAllocationStrategy/PRIORITIZED} "test" :item)))
    (is (= OnDemandAllocationStrategy/PRIORITIZED (on-demand-allocation-strategy {:test/item OnDemandAllocationStrategy/PRIORITIZED} "test" :item)))
    (is (= OnDemandAllocationStrategy/LOWEST_PRICE (on-demand-allocation-strategy {:item OnDemandAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= OnDemandAllocationStrategy/LOWEST_PRICE (on-demand-allocation-strategy {:test/item OnDemandAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= OnDemandAllocationStrategy/PRIORITIZED (on-demand-allocation-strategy {:item :prioritized} "test" :item)))
    (is (= OnDemandAllocationStrategy/PRIORITIZED (on-demand-allocation-strategy {:test/item :prioritized} "test" :item)))
    (is (= OnDemandAllocationStrategy/LOWEST_PRICE (on-demand-allocation-strategy {:item :lowest-price} "test" :item)))
    (is (= OnDemandAllocationStrategy/LOWEST_PRICE (on-demand-allocation-strategy {:test/item :lowest-price} "test" :item)))))


(deftest pool-state-test
  (testing "Testing enum function pool-state"
    (is (= PoolState/STOPPED (pool-state {:item PoolState/STOPPED} "test" :item)))
    (is (= PoolState/STOPPED (pool-state {:test/item PoolState/STOPPED} "test" :item)))
    (is (= PoolState/HIBERNATED (pool-state {:item PoolState/HIBERNATED} "test" :item)))
    (is (= PoolState/HIBERNATED (pool-state {:test/item PoolState/HIBERNATED} "test" :item)))
    (is (= PoolState/RUNNING (pool-state {:item PoolState/RUNNING} "test" :item)))
    (is (= PoolState/RUNNING (pool-state {:test/item PoolState/RUNNING} "test" :item)))
    (is (= PoolState/STOPPED (pool-state {:item :stopped} "test" :item)))
    (is (= PoolState/STOPPED (pool-state {:test/item :stopped} "test" :item)))
    (is (= PoolState/HIBERNATED (pool-state {:item :hibernated} "test" :item)))
    (is (= PoolState/HIBERNATED (pool-state {:test/item :hibernated} "test" :item)))
    (is (= PoolState/RUNNING (pool-state {:item :running} "test" :item)))
    (is (= PoolState/RUNNING (pool-state {:test/item :running} "test" :item)))))


(deftest predefined-metric-test
  (testing "Testing enum function predefined-metric"
    (is (= PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET (predefined-metric {:item PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET} "test" :item)))
    (is (= PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET (predefined-metric {:test/item PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_IN (predefined-metric {:item PredefinedMetric/ASG_AVERAGE_NETWORK_IN} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_IN (predefined-metric {:test/item PredefinedMetric/ASG_AVERAGE_NETWORK_IN} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_OUT (predefined-metric {:item PredefinedMetric/ASG_AVERAGE_NETWORK_OUT} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_OUT (predefined-metric {:test/item PredefinedMetric/ASG_AVERAGE_NETWORK_OUT} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION (predefined-metric {:item PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION (predefined-metric {:test/item PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION} "test" :item)))
    (is (= PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET (predefined-metric {:item :alb-request-count-per-target} "test" :item)))
    (is (= PredefinedMetric/ALB_REQUEST_COUNT_PER_TARGET (predefined-metric {:test/item :alb-request-count-per-target} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_IN (predefined-metric {:item :asg-average-network-in} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_IN (predefined-metric {:test/item :asg-average-network-in} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_OUT (predefined-metric {:item :asg-average-network-out} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_NETWORK_OUT (predefined-metric {:test/item :asg-average-network-out} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION (predefined-metric {:item :asg-average-cpu-utilization} "test" :item)))
    (is (= PredefinedMetric/ASG_AVERAGE_CPU_UTILIZATION (predefined-metric {:test/item :asg-average-cpu-utilization} "test" :item)))))


(deftest scaling-event-test
  (testing "Testing enum function scaling-event"
    (is (= ScalingEvent/INSTANCE_LAUNCH (scaling-event {:item ScalingEvent/INSTANCE_LAUNCH} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH (scaling-event {:test/item ScalingEvent/INSTANCE_LAUNCH} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE_ERROR (scaling-event {:item ScalingEvent/INSTANCE_TERMINATE_ERROR} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE_ERROR (scaling-event {:test/item ScalingEvent/INSTANCE_TERMINATE_ERROR} "test" :item)))
    (is (= ScalingEvent/TEST_NOTIFICATION (scaling-event {:item ScalingEvent/TEST_NOTIFICATION} "test" :item)))
    (is (= ScalingEvent/TEST_NOTIFICATION (scaling-event {:test/item ScalingEvent/TEST_NOTIFICATION} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE (scaling-event {:item ScalingEvent/INSTANCE_TERMINATE} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE (scaling-event {:test/item ScalingEvent/INSTANCE_TERMINATE} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH_ERROR (scaling-event {:item ScalingEvent/INSTANCE_LAUNCH_ERROR} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH_ERROR (scaling-event {:test/item ScalingEvent/INSTANCE_LAUNCH_ERROR} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH (scaling-event {:item :instance-launch} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH (scaling-event {:test/item :instance-launch} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE_ERROR (scaling-event {:item :instance-terminate-error} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE_ERROR (scaling-event {:test/item :instance-terminate-error} "test" :item)))
    (is (= ScalingEvent/TEST_NOTIFICATION (scaling-event {:item :test-notification} "test" :item)))
    (is (= ScalingEvent/TEST_NOTIFICATION (scaling-event {:test/item :test-notification} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE (scaling-event {:item :instance-terminate} "test" :item)))
    (is (= ScalingEvent/INSTANCE_TERMINATE (scaling-event {:test/item :instance-terminate} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH_ERROR (scaling-event {:item :instance-launch-error} "test" :item)))
    (is (= ScalingEvent/INSTANCE_LAUNCH_ERROR (scaling-event {:test/item :instance-launch-error} "test" :item)))))


(deftest scaling-process-test
  (testing "Testing enum function scaling-process"
    (is (= ScalingProcess/TERMINATE (scaling-process {:item ScalingProcess/TERMINATE} "test" :item)))
    (is (= ScalingProcess/TERMINATE (scaling-process {:test/item ScalingProcess/TERMINATE} "test" :item)))
    (is (= ScalingProcess/ALARM_NOTIFICATION (scaling-process {:item ScalingProcess/ALARM_NOTIFICATION} "test" :item)))
    (is (= ScalingProcess/ALARM_NOTIFICATION (scaling-process {:test/item ScalingProcess/ALARM_NOTIFICATION} "test" :item)))
    (is (= ScalingProcess/LAUNCH (scaling-process {:item ScalingProcess/LAUNCH} "test" :item)))
    (is (= ScalingProcess/LAUNCH (scaling-process {:test/item ScalingProcess/LAUNCH} "test" :item)))
    (is (= ScalingProcess/ADD_TO_LOAD_BALANCER (scaling-process {:item ScalingProcess/ADD_TO_LOAD_BALANCER} "test" :item)))
    (is (= ScalingProcess/ADD_TO_LOAD_BALANCER (scaling-process {:test/item ScalingProcess/ADD_TO_LOAD_BALANCER} "test" :item)))
    (is (= ScalingProcess/SCHEDULED_ACTIONS (scaling-process {:item ScalingProcess/SCHEDULED_ACTIONS} "test" :item)))
    (is (= ScalingProcess/SCHEDULED_ACTIONS (scaling-process {:test/item ScalingProcess/SCHEDULED_ACTIONS} "test" :item)))
    (is (= ScalingProcess/INSTANCE_REFRESH (scaling-process {:item ScalingProcess/INSTANCE_REFRESH} "test" :item)))
    (is (= ScalingProcess/INSTANCE_REFRESH (scaling-process {:test/item ScalingProcess/INSTANCE_REFRESH} "test" :item)))
    (is (= ScalingProcess/HEALTH_CHECK (scaling-process {:item ScalingProcess/HEALTH_CHECK} "test" :item)))
    (is (= ScalingProcess/HEALTH_CHECK (scaling-process {:test/item ScalingProcess/HEALTH_CHECK} "test" :item)))
    (is (= ScalingProcess/AZ_REBALANCE (scaling-process {:item ScalingProcess/AZ_REBALANCE} "test" :item)))
    (is (= ScalingProcess/AZ_REBALANCE (scaling-process {:test/item ScalingProcess/AZ_REBALANCE} "test" :item)))
    (is (= ScalingProcess/REPLACE_UNHEALTHY (scaling-process {:item ScalingProcess/REPLACE_UNHEALTHY} "test" :item)))
    (is (= ScalingProcess/REPLACE_UNHEALTHY (scaling-process {:test/item ScalingProcess/REPLACE_UNHEALTHY} "test" :item)))
    (is (= ScalingProcess/TERMINATE (scaling-process {:item :terminate} "test" :item)))
    (is (= ScalingProcess/TERMINATE (scaling-process {:test/item :terminate} "test" :item)))
    (is (= ScalingProcess/ALARM_NOTIFICATION (scaling-process {:item :alarm-notification} "test" :item)))
    (is (= ScalingProcess/ALARM_NOTIFICATION (scaling-process {:test/item :alarm-notification} "test" :item)))
    (is (= ScalingProcess/LAUNCH (scaling-process {:item :launch} "test" :item)))
    (is (= ScalingProcess/LAUNCH (scaling-process {:test/item :launch} "test" :item)))
    (is (= ScalingProcess/ADD_TO_LOAD_BALANCER (scaling-process {:item :add-to-load-balancer} "test" :item)))
    (is (= ScalingProcess/ADD_TO_LOAD_BALANCER (scaling-process {:test/item :add-to-load-balancer} "test" :item)))
    (is (= ScalingProcess/SCHEDULED_ACTIONS (scaling-process {:item :scheduled-actions} "test" :item)))
    (is (= ScalingProcess/SCHEDULED_ACTIONS (scaling-process {:test/item :scheduled-actions} "test" :item)))
    (is (= ScalingProcess/INSTANCE_REFRESH (scaling-process {:item :instance-refresh} "test" :item)))
    (is (= ScalingProcess/INSTANCE_REFRESH (scaling-process {:test/item :instance-refresh} "test" :item)))
    (is (= ScalingProcess/HEALTH_CHECK (scaling-process {:item :health-check} "test" :item)))
    (is (= ScalingProcess/HEALTH_CHECK (scaling-process {:test/item :health-check} "test" :item)))
    (is (= ScalingProcess/AZ_REBALANCE (scaling-process {:item :az-rebalance} "test" :item)))
    (is (= ScalingProcess/AZ_REBALANCE (scaling-process {:test/item :az-rebalance} "test" :item)))
    (is (= ScalingProcess/REPLACE_UNHEALTHY (scaling-process {:item :replace-unhealthy} "test" :item)))
    (is (= ScalingProcess/REPLACE_UNHEALTHY (scaling-process {:test/item :replace-unhealthy} "test" :item)))))


(deftest spot-allocation-strategy-test
  (testing "Testing enum function spot-allocation-strategy"
    (is (= SpotAllocationStrategy/LOWEST_PRICE (spot-allocation-strategy {:item SpotAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= SpotAllocationStrategy/LOWEST_PRICE (spot-allocation-strategy {:test/item SpotAllocationStrategy/LOWEST_PRICE} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED (spot-allocation-strategy {:item SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED (spot-allocation-strategy {:test/item SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED} "test" :item)))
    (is (= SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (spot-allocation-strategy {:item SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (spot-allocation-strategy {:test/item SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED (spot-allocation-strategy {:item SpotAllocationStrategy/CAPACITY_OPTIMIZED} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED (spot-allocation-strategy {:test/item SpotAllocationStrategy/CAPACITY_OPTIMIZED} "test" :item)))
    (is (= SpotAllocationStrategy/LOWEST_PRICE (spot-allocation-strategy {:item :lowest-price} "test" :item)))
    (is (= SpotAllocationStrategy/LOWEST_PRICE (spot-allocation-strategy {:test/item :lowest-price} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED (spot-allocation-strategy {:item :capacity-optimized-prioritized} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED_PRIORITIZED (spot-allocation-strategy {:test/item :capacity-optimized-prioritized} "test" :item)))
    (is (= SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (spot-allocation-strategy {:item :price-capacity-optimized} "test" :item)))
    (is (= SpotAllocationStrategy/PRICE_CAPACITY_OPTIMIZED (spot-allocation-strategy {:test/item :price-capacity-optimized} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED (spot-allocation-strategy {:item :capacity-optimized} "test" :item)))
    (is (= SpotAllocationStrategy/CAPACITY_OPTIMIZED (spot-allocation-strategy {:test/item :capacity-optimized} "test" :item)))))


(deftest termination-policy-test
  (testing "Testing enum function termination-policy"
    (is (= TerminationPolicy/CUSTOM_LAMBDA_FUNCTION (termination-policy {:item TerminationPolicy/CUSTOM_LAMBDA_FUNCTION} "test" :item)))
    (is (= TerminationPolicy/CUSTOM_LAMBDA_FUNCTION (termination-policy {:test/item TerminationPolicy/CUSTOM_LAMBDA_FUNCTION} "test" :item)))
    (is (= TerminationPolicy/DEFAULT (termination-policy {:item TerminationPolicy/DEFAULT} "test" :item)))
    (is (= TerminationPolicy/DEFAULT (termination-policy {:test/item TerminationPolicy/DEFAULT} "test" :item)))
    (is (= TerminationPolicy/OLDEST_INSTANCE (termination-policy {:item TerminationPolicy/OLDEST_INSTANCE} "test" :item)))
    (is (= TerminationPolicy/OLDEST_INSTANCE (termination-policy {:test/item TerminationPolicy/OLDEST_INSTANCE} "test" :item)))
    (is (= TerminationPolicy/ALLOCATION_STRATEGY (termination-policy {:item TerminationPolicy/ALLOCATION_STRATEGY} "test" :item)))
    (is (= TerminationPolicy/ALLOCATION_STRATEGY (termination-policy {:test/item TerminationPolicy/ALLOCATION_STRATEGY} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_TEMPLATE (termination-policy {:item TerminationPolicy/OLDEST_LAUNCH_TEMPLATE} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_TEMPLATE (termination-policy {:test/item TerminationPolicy/OLDEST_LAUNCH_TEMPLATE} "test" :item)))
    (is (= TerminationPolicy/NEWEST_INSTANCE (termination-policy {:item TerminationPolicy/NEWEST_INSTANCE} "test" :item)))
    (is (= TerminationPolicy/NEWEST_INSTANCE (termination-policy {:test/item TerminationPolicy/NEWEST_INSTANCE} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION (termination-policy {:item TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION (termination-policy {:test/item TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION} "test" :item)))
    (is (= TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR (termination-policy {:item TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR} "test" :item)))
    (is (= TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR (termination-policy {:test/item TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR} "test" :item)))
    (is (= TerminationPolicy/CUSTOM_LAMBDA_FUNCTION (termination-policy {:item :custom-lambda-function} "test" :item)))
    (is (= TerminationPolicy/CUSTOM_LAMBDA_FUNCTION (termination-policy {:test/item :custom-lambda-function} "test" :item)))
    (is (= TerminationPolicy/DEFAULT (termination-policy {:item :default} "test" :item)))
    (is (= TerminationPolicy/DEFAULT (termination-policy {:test/item :default} "test" :item)))
    (is (= TerminationPolicy/OLDEST_INSTANCE (termination-policy {:item :oldest-instance} "test" :item)))
    (is (= TerminationPolicy/OLDEST_INSTANCE (termination-policy {:test/item :oldest-instance} "test" :item)))
    (is (= TerminationPolicy/ALLOCATION_STRATEGY (termination-policy {:item :allocation-strategy} "test" :item)))
    (is (= TerminationPolicy/ALLOCATION_STRATEGY (termination-policy {:test/item :allocation-strategy} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_TEMPLATE (termination-policy {:item :oldest-launch-template} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_TEMPLATE (termination-policy {:test/item :oldest-launch-template} "test" :item)))
    (is (= TerminationPolicy/NEWEST_INSTANCE (termination-policy {:item :newest-instance} "test" :item)))
    (is (= TerminationPolicy/NEWEST_INSTANCE (termination-policy {:test/item :newest-instance} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION (termination-policy {:item :oldest-launch-configuration} "test" :item)))
    (is (= TerminationPolicy/OLDEST_LAUNCH_CONFIGURATION (termination-policy {:test/item :oldest-launch-configuration} "test" :item)))
    (is (= TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR (termination-policy {:item :closest-to-next-instance-hour} "test" :item)))
    (is (= TerminationPolicy/CLOSEST_TO_NEXT_INSTANCE_HOUR (termination-policy {:test/item :closest-to-next-instance-hour} "test" :item)))))