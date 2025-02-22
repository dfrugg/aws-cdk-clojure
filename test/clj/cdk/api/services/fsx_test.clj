(ns cdk.api.services.fsx-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.fsx package. "
  (:require [cdk.api.services.fsx :refer [lustre-auto-import-policy
                                          lustre-data-compression-type
                                          lustre-deployment-type
                                          weekday]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.fsx LustreAutoImportPolicy
                                                LustreDataCompressionType
                                                LustreDeploymentType
                                                Weekday]))


(deftest lustre-auto-import-policy-test
  (testing "Testing enum function lustre-auto-import-policy"
    (is (= LustreAutoImportPolicy/NEW_CHANGED_DELETED (lustre-auto-import-policy {:item LustreAutoImportPolicy/NEW_CHANGED_DELETED} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED_DELETED (lustre-auto-import-policy {:test/item LustreAutoImportPolicy/NEW_CHANGED_DELETED} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW (lustre-auto-import-policy {:item LustreAutoImportPolicy/NEW} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW (lustre-auto-import-policy {:test/item LustreAutoImportPolicy/NEW} "test" :item)))
    (is (= LustreAutoImportPolicy/NONE (lustre-auto-import-policy {:item LustreAutoImportPolicy/NONE} "test" :item)))
    (is (= LustreAutoImportPolicy/NONE (lustre-auto-import-policy {:test/item LustreAutoImportPolicy/NONE} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED (lustre-auto-import-policy {:item LustreAutoImportPolicy/NEW_CHANGED} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED (lustre-auto-import-policy {:test/item LustreAutoImportPolicy/NEW_CHANGED} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED_DELETED (lustre-auto-import-policy {:item :new-changed-deleted} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED_DELETED (lustre-auto-import-policy {:test/item :new-changed-deleted} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW (lustre-auto-import-policy {:item :new} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW (lustre-auto-import-policy {:test/item :new} "test" :item)))
    (is (= LustreAutoImportPolicy/NONE (lustre-auto-import-policy {:item :none} "test" :item)))
    (is (= LustreAutoImportPolicy/NONE (lustre-auto-import-policy {:test/item :none} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED (lustre-auto-import-policy {:item :new-changed} "test" :item)))
    (is (= LustreAutoImportPolicy/NEW_CHANGED (lustre-auto-import-policy {:test/item :new-changed} "test" :item)))))


(deftest lustre-data-compression-type-test
  (testing "Testing enum function lustre-data-compression-type"
    (is (= LustreDataCompressionType/LZ4 (lustre-data-compression-type {:item LustreDataCompressionType/LZ4} "test" :item)))
    (is (= LustreDataCompressionType/LZ4 (lustre-data-compression-type {:test/item LustreDataCompressionType/LZ4} "test" :item)))
    (is (= LustreDataCompressionType/NONE (lustre-data-compression-type {:item LustreDataCompressionType/NONE} "test" :item)))
    (is (= LustreDataCompressionType/NONE (lustre-data-compression-type {:test/item LustreDataCompressionType/NONE} "test" :item)))
    (is (= LustreDataCompressionType/LZ4 (lustre-data-compression-type {:item :lz4} "test" :item)))
    (is (= LustreDataCompressionType/LZ4 (lustre-data-compression-type {:test/item :lz4} "test" :item)))
    (is (= LustreDataCompressionType/NONE (lustre-data-compression-type {:item :none} "test" :item)))
    (is (= LustreDataCompressionType/NONE (lustre-data-compression-type {:test/item :none} "test" :item)))))


(deftest lustre-deployment-type-test
  (testing "Testing enum function lustre-deployment-type"
    (is (= LustreDeploymentType/PERSISTENT_2 (lustre-deployment-type {:item LustreDeploymentType/PERSISTENT_2} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_2 (lustre-deployment-type {:test/item LustreDeploymentType/PERSISTENT_2} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_1 (lustre-deployment-type {:item LustreDeploymentType/SCRATCH_1} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_1 (lustre-deployment-type {:test/item LustreDeploymentType/SCRATCH_1} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_2 (lustre-deployment-type {:item LustreDeploymentType/SCRATCH_2} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_2 (lustre-deployment-type {:test/item LustreDeploymentType/SCRATCH_2} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_1 (lustre-deployment-type {:item LustreDeploymentType/PERSISTENT_1} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_1 (lustre-deployment-type {:test/item LustreDeploymentType/PERSISTENT_1} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_2 (lustre-deployment-type {:item :persistent-2} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_2 (lustre-deployment-type {:test/item :persistent-2} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_1 (lustre-deployment-type {:item :scratch-1} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_1 (lustre-deployment-type {:test/item :scratch-1} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_2 (lustre-deployment-type {:item :scratch-2} "test" :item)))
    (is (= LustreDeploymentType/SCRATCH_2 (lustre-deployment-type {:test/item :scratch-2} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_1 (lustre-deployment-type {:item :persistent-1} "test" :item)))
    (is (= LustreDeploymentType/PERSISTENT_1 (lustre-deployment-type {:test/item :persistent-1} "test" :item)))))


(deftest weekday-test
  (testing "Testing enum function weekday"
    (is (= Weekday/SUNDAY (weekday {:item Weekday/SUNDAY} "test" :item)))
    (is (= Weekday/SUNDAY (weekday {:test/item Weekday/SUNDAY} "test" :item)))
    (is (= Weekday/THURSDAY (weekday {:item Weekday/THURSDAY} "test" :item)))
    (is (= Weekday/THURSDAY (weekday {:test/item Weekday/THURSDAY} "test" :item)))
    (is (= Weekday/TUESDAY (weekday {:item Weekday/TUESDAY} "test" :item)))
    (is (= Weekday/TUESDAY (weekday {:test/item Weekday/TUESDAY} "test" :item)))
    (is (= Weekday/WEDNESDAY (weekday {:item Weekday/WEDNESDAY} "test" :item)))
    (is (= Weekday/WEDNESDAY (weekday {:test/item Weekday/WEDNESDAY} "test" :item)))
    (is (= Weekday/MONDAY (weekday {:item Weekday/MONDAY} "test" :item)))
    (is (= Weekday/MONDAY (weekday {:test/item Weekday/MONDAY} "test" :item)))
    (is (= Weekday/FRIDAY (weekday {:item Weekday/FRIDAY} "test" :item)))
    (is (= Weekday/FRIDAY (weekday {:test/item Weekday/FRIDAY} "test" :item)))
    (is (= Weekday/SATURDAY (weekday {:item Weekday/SATURDAY} "test" :item)))
    (is (= Weekday/SATURDAY (weekday {:test/item Weekday/SATURDAY} "test" :item)))
    (is (= Weekday/SUNDAY (weekday {:item :sunday} "test" :item)))
    (is (= Weekday/SUNDAY (weekday {:test/item :sunday} "test" :item)))
    (is (= Weekday/THURSDAY (weekday {:item :thursday} "test" :item)))
    (is (= Weekday/THURSDAY (weekday {:test/item :thursday} "test" :item)))
    (is (= Weekday/TUESDAY (weekday {:item :tuesday} "test" :item)))
    (is (= Weekday/TUESDAY (weekday {:test/item :tuesday} "test" :item)))
    (is (= Weekday/WEDNESDAY (weekday {:item :wednesday} "test" :item)))
    (is (= Weekday/WEDNESDAY (weekday {:test/item :wednesday} "test" :item)))
    (is (= Weekday/MONDAY (weekday {:item :monday} "test" :item)))
    (is (= Weekday/MONDAY (weekday {:test/item :monday} "test" :item)))
    (is (= Weekday/FRIDAY (weekday {:item :friday} "test" :item)))
    (is (= Weekday/FRIDAY (weekday {:test/item :friday} "test" :item)))
    (is (= Weekday/SATURDAY (weekday {:item :saturday} "test" :item)))
    (is (= Weekday/SATURDAY (weekday {:test/item :saturday} "test" :item)))))