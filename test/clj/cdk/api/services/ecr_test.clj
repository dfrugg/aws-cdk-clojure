(ns cdk.api.services.ecr-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecr package. "
  (:require [cdk.api.services.ecr :refer [tag-mutability
                                          tag-status]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.ecr TagMutability
                                                TagStatus]))


(deftest tag-mutability-test
  (testing "Testing enum function tag-mutability"
    (is (= TagMutability/MUTABLE (tag-mutability {:item TagMutability/MUTABLE} "test" :item)))
    (is (= TagMutability/MUTABLE (tag-mutability {:test/item TagMutability/MUTABLE} "test" :item)))
    (is (= TagMutability/IMMUTABLE (tag-mutability {:item TagMutability/IMMUTABLE} "test" :item)))
    (is (= TagMutability/IMMUTABLE (tag-mutability {:test/item TagMutability/IMMUTABLE} "test" :item)))
    (is (= TagMutability/MUTABLE (tag-mutability {:item :mutable} "test" :item)))
    (is (= TagMutability/MUTABLE (tag-mutability {:test/item :mutable} "test" :item)))
    (is (= TagMutability/IMMUTABLE (tag-mutability {:item :immutable} "test" :item)))
    (is (= TagMutability/IMMUTABLE (tag-mutability {:test/item :immutable} "test" :item)))))


(deftest tag-status-test
  (testing "Testing enum function tag-status"
    (is (= TagStatus/TAGGED (tag-status {:item TagStatus/TAGGED} "test" :item)))
    (is (= TagStatus/TAGGED (tag-status {:test/item TagStatus/TAGGED} "test" :item)))
    (is (= TagStatus/UNTAGGED (tag-status {:item TagStatus/UNTAGGED} "test" :item)))
    (is (= TagStatus/UNTAGGED (tag-status {:test/item TagStatus/UNTAGGED} "test" :item)))
    (is (= TagStatus/ANY (tag-status {:item TagStatus/ANY} "test" :item)))
    (is (= TagStatus/ANY (tag-status {:test/item TagStatus/ANY} "test" :item)))
    (is (= TagStatus/TAGGED (tag-status {:item :tagged} "test" :item)))
    (is (= TagStatus/TAGGED (tag-status {:test/item :tagged} "test" :item)))
    (is (= TagStatus/UNTAGGED (tag-status {:item :untagged} "test" :item)))
    (is (= TagStatus/UNTAGGED (tag-status {:test/item :untagged} "test" :item)))
    (is (= TagStatus/ANY (tag-status {:item :any} "test" :item)))
    (is (= TagStatus/ANY (tag-status {:test/item :any} "test" :item)))))