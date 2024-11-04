(ns cdk.api.services.synthetics-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.synthetics package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.synthetics :refer [cleanup
                                                 runtime-family]])
  (:import [software.amazon.awscdk.services.synthetics Cleanup
                                                       RuntimeFamily]))


(deftest cleanup-test
  (testing "Testing enum function cleanup"
    (is (= Cleanup/NOTHING (cleanup {:item Cleanup/NOTHING} "test" :item)))
    (is (= Cleanup/NOTHING (cleanup {:test/item Cleanup/NOTHING} "test" :item)))
    (is (= Cleanup/LAMBDA (cleanup {:item Cleanup/LAMBDA} "test" :item)))
    (is (= Cleanup/LAMBDA (cleanup {:test/item Cleanup/LAMBDA} "test" :item)))
    (is (= Cleanup/NOTHING (cleanup {:item :nothing} "test" :item)))
    (is (= Cleanup/NOTHING (cleanup {:test/item :nothing} "test" :item)))
    (is (= Cleanup/LAMBDA (cleanup {:item :lambda} "test" :item)))
    (is (= Cleanup/LAMBDA (cleanup {:test/item :lambda} "test" :item)))))


(deftest runtime-family-test
  (testing "Testing enum function runtime-family"
    (is (= RuntimeFamily/NODEJS (runtime-family {:item RuntimeFamily/NODEJS} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:test/item RuntimeFamily/NODEJS} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:item RuntimeFamily/PYTHON} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:test/item RuntimeFamily/PYTHON} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:item RuntimeFamily/OTHER} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:test/item RuntimeFamily/OTHER} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:item :nodejs} "test" :item)))
    (is (= RuntimeFamily/NODEJS (runtime-family {:test/item :nodejs} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:item :python} "test" :item)))
    (is (= RuntimeFamily/PYTHON (runtime-family {:test/item :python} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:item :other} "test" :item)))
    (is (= RuntimeFamily/OTHER (runtime-family {:test/item :other} "test" :item)))))