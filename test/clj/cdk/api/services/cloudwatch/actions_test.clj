(ns cdk.api.services.cloudwatch.actions-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudwatch.actions package. "
  (:require [cdk.api.services.cloudwatch.actions :refer [ec2-instance-action
                                                         ops-item-category
                                                         ops-item-severity]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.cloudwatch.actions Ec2InstanceAction
                                                               OpsItemCategory
                                                               OpsItemSeverity]))


(deftest ec2-instance-action-test
  (testing "Testing enum function ec2-instance-action"
    (is (= Ec2InstanceAction/TERMINATE (ec2-instance-action {:item Ec2InstanceAction/TERMINATE} "test" :item)))
    (is (= Ec2InstanceAction/TERMINATE (ec2-instance-action {:test/item Ec2InstanceAction/TERMINATE} "test" :item)))
    (is (= Ec2InstanceAction/STOP (ec2-instance-action {:item Ec2InstanceAction/STOP} "test" :item)))
    (is (= Ec2InstanceAction/STOP (ec2-instance-action {:test/item Ec2InstanceAction/STOP} "test" :item)))
    (is (= Ec2InstanceAction/REBOOT (ec2-instance-action {:item Ec2InstanceAction/REBOOT} "test" :item)))
    (is (= Ec2InstanceAction/REBOOT (ec2-instance-action {:test/item Ec2InstanceAction/REBOOT} "test" :item)))
    (is (= Ec2InstanceAction/RECOVER (ec2-instance-action {:item Ec2InstanceAction/RECOVER} "test" :item)))
    (is (= Ec2InstanceAction/RECOVER (ec2-instance-action {:test/item Ec2InstanceAction/RECOVER} "test" :item)))
    (is (= Ec2InstanceAction/TERMINATE (ec2-instance-action {:item :terminate} "test" :item)))
    (is (= Ec2InstanceAction/TERMINATE (ec2-instance-action {:test/item :terminate} "test" :item)))
    (is (= Ec2InstanceAction/STOP (ec2-instance-action {:item :stop} "test" :item)))
    (is (= Ec2InstanceAction/STOP (ec2-instance-action {:test/item :stop} "test" :item)))
    (is (= Ec2InstanceAction/REBOOT (ec2-instance-action {:item :reboot} "test" :item)))
    (is (= Ec2InstanceAction/REBOOT (ec2-instance-action {:test/item :reboot} "test" :item)))
    (is (= Ec2InstanceAction/RECOVER (ec2-instance-action {:item :recover} "test" :item)))
    (is (= Ec2InstanceAction/RECOVER (ec2-instance-action {:test/item :recover} "test" :item)))))


(deftest ops-item-category-test
  (testing "Testing enum function ops-item-category"
    (is (= OpsItemCategory/RECOVERY (ops-item-category {:item OpsItemCategory/RECOVERY} "test" :item)))
    (is (= OpsItemCategory/RECOVERY (ops-item-category {:test/item OpsItemCategory/RECOVERY} "test" :item)))
    (is (= OpsItemCategory/AVAILABILITY (ops-item-category {:item OpsItemCategory/AVAILABILITY} "test" :item)))
    (is (= OpsItemCategory/AVAILABILITY (ops-item-category {:test/item OpsItemCategory/AVAILABILITY} "test" :item)))
    (is (= OpsItemCategory/SECURITY (ops-item-category {:item OpsItemCategory/SECURITY} "test" :item)))
    (is (= OpsItemCategory/SECURITY (ops-item-category {:test/item OpsItemCategory/SECURITY} "test" :item)))
    (is (= OpsItemCategory/COST (ops-item-category {:item OpsItemCategory/COST} "test" :item)))
    (is (= OpsItemCategory/COST (ops-item-category {:test/item OpsItemCategory/COST} "test" :item)))
    (is (= OpsItemCategory/PERFORMANCE (ops-item-category {:item OpsItemCategory/PERFORMANCE} "test" :item)))
    (is (= OpsItemCategory/PERFORMANCE (ops-item-category {:test/item OpsItemCategory/PERFORMANCE} "test" :item)))
    (is (= OpsItemCategory/RECOVERY (ops-item-category {:item :recovery} "test" :item)))
    (is (= OpsItemCategory/RECOVERY (ops-item-category {:test/item :recovery} "test" :item)))
    (is (= OpsItemCategory/AVAILABILITY (ops-item-category {:item :availability} "test" :item)))
    (is (= OpsItemCategory/AVAILABILITY (ops-item-category {:test/item :availability} "test" :item)))
    (is (= OpsItemCategory/SECURITY (ops-item-category {:item :security} "test" :item)))
    (is (= OpsItemCategory/SECURITY (ops-item-category {:test/item :security} "test" :item)))
    (is (= OpsItemCategory/COST (ops-item-category {:item :cost} "test" :item)))
    (is (= OpsItemCategory/COST (ops-item-category {:test/item :cost} "test" :item)))
    (is (= OpsItemCategory/PERFORMANCE (ops-item-category {:item :performance} "test" :item)))
    (is (= OpsItemCategory/PERFORMANCE (ops-item-category {:test/item :performance} "test" :item)))))


(deftest ops-item-severity-test
  (testing "Testing enum function ops-item-severity"
    (is (= OpsItemSeverity/MEDIUM (ops-item-severity {:item OpsItemSeverity/MEDIUM} "test" :item)))
    (is (= OpsItemSeverity/MEDIUM (ops-item-severity {:test/item OpsItemSeverity/MEDIUM} "test" :item)))
    (is (= OpsItemSeverity/CRITICAL (ops-item-severity {:item OpsItemSeverity/CRITICAL} "test" :item)))
    (is (= OpsItemSeverity/CRITICAL (ops-item-severity {:test/item OpsItemSeverity/CRITICAL} "test" :item)))
    (is (= OpsItemSeverity/LOW (ops-item-severity {:item OpsItemSeverity/LOW} "test" :item)))
    (is (= OpsItemSeverity/LOW (ops-item-severity {:test/item OpsItemSeverity/LOW} "test" :item)))
    (is (= OpsItemSeverity/HIGH (ops-item-severity {:item OpsItemSeverity/HIGH} "test" :item)))
    (is (= OpsItemSeverity/HIGH (ops-item-severity {:test/item OpsItemSeverity/HIGH} "test" :item)))
    (is (= OpsItemSeverity/MEDIUM (ops-item-severity {:item :medium} "test" :item)))
    (is (= OpsItemSeverity/MEDIUM (ops-item-severity {:test/item :medium} "test" :item)))
    (is (= OpsItemSeverity/CRITICAL (ops-item-severity {:item :critical} "test" :item)))
    (is (= OpsItemSeverity/CRITICAL (ops-item-severity {:test/item :critical} "test" :item)))
    (is (= OpsItemSeverity/LOW (ops-item-severity {:item :low} "test" :item)))
    (is (= OpsItemSeverity/LOW (ops-item-severity {:test/item :low} "test" :item)))
    (is (= OpsItemSeverity/HIGH (ops-item-severity {:item :high} "test" :item)))
    (is (= OpsItemSeverity/HIGH (ops-item-severity {:test/item :high} "test" :item)))))