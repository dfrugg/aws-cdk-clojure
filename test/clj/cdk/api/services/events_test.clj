(ns cdk.api.services.events-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.events package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.events :refer [http-method]])
  (:import [software.amazon.awscdk.services.events HttpMethod]))


(deftest http-method-test
  (testing "Testing enum function http-method"
    (is (= HttpMethod/GET (http-method {:item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item HttpMethod/GET} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item HttpMethod/PATCH} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item HttpMethod/PUT} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item HttpMethod/POST} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item HttpMethod/HEAD} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item HttpMethod/DELETE} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item HttpMethod/OPTIONS} "test" :item)))
    (is (= HttpMethod/GET (http-method {:item :get} "test" :item)))
    (is (= HttpMethod/GET (http-method {:test/item :get} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:item :patch} "test" :item)))
    (is (= HttpMethod/PATCH (http-method {:test/item :patch} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:item :put} "test" :item)))
    (is (= HttpMethod/PUT (http-method {:test/item :put} "test" :item)))
    (is (= HttpMethod/POST (http-method {:item :post} "test" :item)))
    (is (= HttpMethod/POST (http-method {:test/item :post} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:item :head} "test" :item)))
    (is (= HttpMethod/HEAD (http-method {:test/item :head} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:item :delete} "test" :item)))
    (is (= HttpMethod/DELETE (http-method {:test/item :delete} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:item :options} "test" :item)))
    (is (= HttpMethod/OPTIONS (http-method {:test/item :options} "test" :item)))))