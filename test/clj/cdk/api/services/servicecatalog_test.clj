(ns cdk.api.services.servicecatalog-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicecatalog package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.servicecatalog :refer [message-language]])
  (:import [software.amazon.awscdk.services.servicecatalog MessageLanguage]))


(deftest message-language-test
  (testing "Testing enum function message-language"
    (is (= MessageLanguage/EN (message-language {:item MessageLanguage/EN} "test" :item)))
    (is (= MessageLanguage/EN (message-language {:test/item MessageLanguage/EN} "test" :item)))
    (is (= MessageLanguage/ZH (message-language {:item MessageLanguage/ZH} "test" :item)))
    (is (= MessageLanguage/ZH (message-language {:test/item MessageLanguage/ZH} "test" :item)))
    (is (= MessageLanguage/JP (message-language {:item MessageLanguage/JP} "test" :item)))
    (is (= MessageLanguage/JP (message-language {:test/item MessageLanguage/JP} "test" :item)))
    (is (= MessageLanguage/EN (message-language {:item :en} "test" :item)))
    (is (= MessageLanguage/EN (message-language {:test/item :en} "test" :item)))
    (is (= MessageLanguage/ZH (message-language {:item :zh} "test" :item)))
    (is (= MessageLanguage/ZH (message-language {:test/item :zh} "test" :item)))
    (is (= MessageLanguage/JP (message-language {:item :jp} "test" :item)))
    (is (= MessageLanguage/JP (message-language {:test/item :jp} "test" :item)))))