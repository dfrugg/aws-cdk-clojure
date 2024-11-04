(ns cdk.api.services.route53-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53 package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.route53 :refer [caa-tag
                                              continent
                                              key-signing-key-status
                                              record-type]])
  (:import [software.amazon.awscdk.services.route53 CaaTag
                                                    Continent
                                                    KeySigningKeyStatus
                                                    RecordType]))


(deftest caa-tag-test
  (testing "Testing enum function caa-tag"
    (is (= CaaTag/ISSUEWILD (caa-tag {:item CaaTag/ISSUEWILD} "test" :item)))
    (is (= CaaTag/ISSUEWILD (caa-tag {:test/item CaaTag/ISSUEWILD} "test" :item)))
    (is (= CaaTag/ISSUE (caa-tag {:item CaaTag/ISSUE} "test" :item)))
    (is (= CaaTag/ISSUE (caa-tag {:test/item CaaTag/ISSUE} "test" :item)))
    (is (= CaaTag/IODEF (caa-tag {:item CaaTag/IODEF} "test" :item)))
    (is (= CaaTag/IODEF (caa-tag {:test/item CaaTag/IODEF} "test" :item)))
    (is (= CaaTag/ISSUEWILD (caa-tag {:item :issuewild} "test" :item)))
    (is (= CaaTag/ISSUEWILD (caa-tag {:test/item :issuewild} "test" :item)))
    (is (= CaaTag/ISSUE (caa-tag {:item :issue} "test" :item)))
    (is (= CaaTag/ISSUE (caa-tag {:test/item :issue} "test" :item)))
    (is (= CaaTag/IODEF (caa-tag {:item :iodef} "test" :item)))
    (is (= CaaTag/IODEF (caa-tag {:test/item :iodef} "test" :item)))))


(deftest continent-test
  (testing "Testing enum function continent"
    (is (= Continent/NORTH_AMERICA (continent {:item Continent/NORTH_AMERICA} "test" :item)))
    (is (= Continent/NORTH_AMERICA (continent {:test/item Continent/NORTH_AMERICA} "test" :item)))
    (is (= Continent/EUROPE (continent {:item Continent/EUROPE} "test" :item)))
    (is (= Continent/EUROPE (continent {:test/item Continent/EUROPE} "test" :item)))
    (is (= Continent/OCEANIA (continent {:item Continent/OCEANIA} "test" :item)))
    (is (= Continent/OCEANIA (continent {:test/item Continent/OCEANIA} "test" :item)))
    (is (= Continent/ANTARCTICA (continent {:item Continent/ANTARCTICA} "test" :item)))
    (is (= Continent/ANTARCTICA (continent {:test/item Continent/ANTARCTICA} "test" :item)))
    (is (= Continent/ASIA (continent {:item Continent/ASIA} "test" :item)))
    (is (= Continent/ASIA (continent {:test/item Continent/ASIA} "test" :item)))
    (is (= Continent/AFRICA (continent {:item Continent/AFRICA} "test" :item)))
    (is (= Continent/AFRICA (continent {:test/item Continent/AFRICA} "test" :item)))
    (is (= Continent/SOUTH_AMERICA (continent {:item Continent/SOUTH_AMERICA} "test" :item)))
    (is (= Continent/SOUTH_AMERICA (continent {:test/item Continent/SOUTH_AMERICA} "test" :item)))
    (is (= Continent/NORTH_AMERICA (continent {:item :north-america} "test" :item)))
    (is (= Continent/NORTH_AMERICA (continent {:test/item :north-america} "test" :item)))
    (is (= Continent/EUROPE (continent {:item :europe} "test" :item)))
    (is (= Continent/EUROPE (continent {:test/item :europe} "test" :item)))
    (is (= Continent/OCEANIA (continent {:item :oceania} "test" :item)))
    (is (= Continent/OCEANIA (continent {:test/item :oceania} "test" :item)))
    (is (= Continent/ANTARCTICA (continent {:item :antarctica} "test" :item)))
    (is (= Continent/ANTARCTICA (continent {:test/item :antarctica} "test" :item)))
    (is (= Continent/ASIA (continent {:item :asia} "test" :item)))
    (is (= Continent/ASIA (continent {:test/item :asia} "test" :item)))
    (is (= Continent/AFRICA (continent {:item :africa} "test" :item)))
    (is (= Continent/AFRICA (continent {:test/item :africa} "test" :item)))
    (is (= Continent/SOUTH_AMERICA (continent {:item :south-america} "test" :item)))
    (is (= Continent/SOUTH_AMERICA (continent {:test/item :south-america} "test" :item)))))


(deftest key-signing-key-status-test
  (testing "Testing enum function key-signing-key-status"
    (is (= KeySigningKeyStatus/ACTIVE (key-signing-key-status {:item KeySigningKeyStatus/ACTIVE} "test" :item)))
    (is (= KeySigningKeyStatus/ACTIVE (key-signing-key-status {:test/item KeySigningKeyStatus/ACTIVE} "test" :item)))
    (is (= KeySigningKeyStatus/INACTIVE (key-signing-key-status {:item KeySigningKeyStatus/INACTIVE} "test" :item)))
    (is (= KeySigningKeyStatus/INACTIVE (key-signing-key-status {:test/item KeySigningKeyStatus/INACTIVE} "test" :item)))
    (is (= KeySigningKeyStatus/ACTIVE (key-signing-key-status {:item :active} "test" :item)))
    (is (= KeySigningKeyStatus/ACTIVE (key-signing-key-status {:test/item :active} "test" :item)))
    (is (= KeySigningKeyStatus/INACTIVE (key-signing-key-status {:item :inactive} "test" :item)))
    (is (= KeySigningKeyStatus/INACTIVE (key-signing-key-status {:test/item :inactive} "test" :item)))))


(deftest record-type-test
  (testing "Testing enum function record-type"
    (is (= RecordType/PTR (record-type {:item RecordType/PTR} "test" :item)))
    (is (= RecordType/PTR (record-type {:test/item RecordType/PTR} "test" :item)))
    (is (= RecordType/DS (record-type {:item RecordType/DS} "test" :item)))
    (is (= RecordType/DS (record-type {:test/item RecordType/DS} "test" :item)))
    (is (= RecordType/SPF (record-type {:item RecordType/SPF} "test" :item)))
    (is (= RecordType/SPF (record-type {:test/item RecordType/SPF} "test" :item)))
    (is (= RecordType/NS (record-type {:item RecordType/NS} "test" :item)))
    (is (= RecordType/NS (record-type {:test/item RecordType/NS} "test" :item)))
    (is (= RecordType/CAA (record-type {:item RecordType/CAA} "test" :item)))
    (is (= RecordType/CAA (record-type {:test/item RecordType/CAA} "test" :item)))
    (is (= RecordType/NAPTR (record-type {:item RecordType/NAPTR} "test" :item)))
    (is (= RecordType/NAPTR (record-type {:test/item RecordType/NAPTR} "test" :item)))
    (is (= RecordType/A (record-type {:item RecordType/A} "test" :item)))
    (is (= RecordType/A (record-type {:test/item RecordType/A} "test" :item)))
    (is (= RecordType/CNAME (record-type {:item RecordType/CNAME} "test" :item)))
    (is (= RecordType/CNAME (record-type {:test/item RecordType/CNAME} "test" :item)))
    (is (= RecordType/SOA (record-type {:item RecordType/SOA} "test" :item)))
    (is (= RecordType/SOA (record-type {:test/item RecordType/SOA} "test" :item)))
    (is (= RecordType/SRV (record-type {:item RecordType/SRV} "test" :item)))
    (is (= RecordType/SRV (record-type {:test/item RecordType/SRV} "test" :item)))
    (is (= RecordType/MX (record-type {:item RecordType/MX} "test" :item)))
    (is (= RecordType/MX (record-type {:test/item RecordType/MX} "test" :item)))
    (is (= RecordType/AAAA (record-type {:item RecordType/AAAA} "test" :item)))
    (is (= RecordType/AAAA (record-type {:test/item RecordType/AAAA} "test" :item)))
    (is (= RecordType/TXT (record-type {:item RecordType/TXT} "test" :item)))
    (is (= RecordType/TXT (record-type {:test/item RecordType/TXT} "test" :item)))
    (is (= RecordType/PTR (record-type {:item :ptr} "test" :item)))
    (is (= RecordType/PTR (record-type {:test/item :ptr} "test" :item)))
    (is (= RecordType/DS (record-type {:item :ds} "test" :item)))
    (is (= RecordType/DS (record-type {:test/item :ds} "test" :item)))
    (is (= RecordType/SPF (record-type {:item :spf} "test" :item)))
    (is (= RecordType/SPF (record-type {:test/item :spf} "test" :item)))
    (is (= RecordType/NS (record-type {:item :ns} "test" :item)))
    (is (= RecordType/NS (record-type {:test/item :ns} "test" :item)))
    (is (= RecordType/CAA (record-type {:item :caa} "test" :item)))
    (is (= RecordType/CAA (record-type {:test/item :caa} "test" :item)))
    (is (= RecordType/NAPTR (record-type {:item :naptr} "test" :item)))
    (is (= RecordType/NAPTR (record-type {:test/item :naptr} "test" :item)))
    (is (= RecordType/A (record-type {:item :a} "test" :item)))
    (is (= RecordType/A (record-type {:test/item :a} "test" :item)))
    (is (= RecordType/CNAME (record-type {:item :cname} "test" :item)))
    (is (= RecordType/CNAME (record-type {:test/item :cname} "test" :item)))
    (is (= RecordType/SOA (record-type {:item :soa} "test" :item)))
    (is (= RecordType/SOA (record-type {:test/item :soa} "test" :item)))
    (is (= RecordType/SRV (record-type {:item :srv} "test" :item)))
    (is (= RecordType/SRV (record-type {:test/item :srv} "test" :item)))
    (is (= RecordType/MX (record-type {:item :mx} "test" :item)))
    (is (= RecordType/MX (record-type {:test/item :mx} "test" :item)))
    (is (= RecordType/AAAA (record-type {:item :aaaa} "test" :item)))
    (is (= RecordType/AAAA (record-type {:test/item :aaaa} "test" :item)))
    (is (= RecordType/TXT (record-type {:item :txt} "test" :item)))
    (is (= RecordType/TXT (record-type {:test/item :txt} "test" :item)))))