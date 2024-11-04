(ns cdk.api.services.lambda.nodejs-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.nodejs package. "
  (:require [clojure.test :refer [deftest
                                  is
                                  testing]]
            [cdk.api.services.lambda.nodejs :refer [charset
                                                    log-level
                                                    output-format
                                                    source-map-mode]])
  (:import [software.amazon.awscdk.services.lambda.nodejs Charset
                                                          LogLevel
                                                          OutputFormat
                                                          SourceMapMode]))


(deftest charset-test
  (testing "Testing enum function charset"
    (is (= Charset/ASCII (charset {:item Charset/ASCII} "test" :item)))
    (is (= Charset/ASCII (charset {:test/item Charset/ASCII} "test" :item)))
    (is (= Charset/UTF8 (charset {:item Charset/UTF8} "test" :item)))
    (is (= Charset/UTF8 (charset {:test/item Charset/UTF8} "test" :item)))
    (is (= Charset/ASCII (charset {:item :ascii} "test" :item)))
    (is (= Charset/ASCII (charset {:test/item :ascii} "test" :item)))
    (is (= Charset/UTF8 (charset {:item :utf8} "test" :item)))
    (is (= Charset/UTF8 (charset {:test/item :utf8} "test" :item)))))


(deftest log-level-test
  (testing "Testing enum function log-level"
    (is (= LogLevel/INFO (log-level {:item LogLevel/INFO} "test" :item)))
    (is (= LogLevel/INFO (log-level {:test/item LogLevel/INFO} "test" :item)))
    (is (= LogLevel/WARNING (log-level {:item LogLevel/WARNING} "test" :item)))
    (is (= LogLevel/WARNING (log-level {:test/item LogLevel/WARNING} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:item LogLevel/ERROR} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:test/item LogLevel/ERROR} "test" :item)))
    (is (= LogLevel/VERBOSE (log-level {:item LogLevel/VERBOSE} "test" :item)))
    (is (= LogLevel/VERBOSE (log-level {:test/item LogLevel/VERBOSE} "test" :item)))
    (is (= LogLevel/SILENT (log-level {:item LogLevel/SILENT} "test" :item)))
    (is (= LogLevel/SILENT (log-level {:test/item LogLevel/SILENT} "test" :item)))
    (is (= LogLevel/DEBUG (log-level {:item LogLevel/DEBUG} "test" :item)))
    (is (= LogLevel/DEBUG (log-level {:test/item LogLevel/DEBUG} "test" :item)))
    (is (= LogLevel/INFO (log-level {:item :info} "test" :item)))
    (is (= LogLevel/INFO (log-level {:test/item :info} "test" :item)))
    (is (= LogLevel/WARNING (log-level {:item :warning} "test" :item)))
    (is (= LogLevel/WARNING (log-level {:test/item :warning} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:item :error} "test" :item)))
    (is (= LogLevel/ERROR (log-level {:test/item :error} "test" :item)))
    (is (= LogLevel/VERBOSE (log-level {:item :verbose} "test" :item)))
    (is (= LogLevel/VERBOSE (log-level {:test/item :verbose} "test" :item)))
    (is (= LogLevel/SILENT (log-level {:item :silent} "test" :item)))
    (is (= LogLevel/SILENT (log-level {:test/item :silent} "test" :item)))
    (is (= LogLevel/DEBUG (log-level {:item :debug} "test" :item)))
    (is (= LogLevel/DEBUG (log-level {:test/item :debug} "test" :item)))))


(deftest output-format-test
  (testing "Testing enum function output-format"
    (is (= OutputFormat/ESM (output-format {:item OutputFormat/ESM} "test" :item)))
    (is (= OutputFormat/ESM (output-format {:test/item OutputFormat/ESM} "test" :item)))
    (is (= OutputFormat/CJS (output-format {:item OutputFormat/CJS} "test" :item)))
    (is (= OutputFormat/CJS (output-format {:test/item OutputFormat/CJS} "test" :item)))
    (is (= OutputFormat/ESM (output-format {:item :esm} "test" :item)))
    (is (= OutputFormat/ESM (output-format {:test/item :esm} "test" :item)))
    (is (= OutputFormat/CJS (output-format {:item :cjs} "test" :item)))
    (is (= OutputFormat/CJS (output-format {:test/item :cjs} "test" :item)))))


(deftest source-map-mode-test
  (testing "Testing enum function source-map-mode"
    (is (= SourceMapMode/EXTERNAL (source-map-mode {:item SourceMapMode/EXTERNAL} "test" :item)))
    (is (= SourceMapMode/EXTERNAL (source-map-mode {:test/item SourceMapMode/EXTERNAL} "test" :item)))
    (is (= SourceMapMode/DEFAULT (source-map-mode {:item SourceMapMode/DEFAULT} "test" :item)))
    (is (= SourceMapMode/DEFAULT (source-map-mode {:test/item SourceMapMode/DEFAULT} "test" :item)))
    (is (= SourceMapMode/INLINE (source-map-mode {:item SourceMapMode/INLINE} "test" :item)))
    (is (= SourceMapMode/INLINE (source-map-mode {:test/item SourceMapMode/INLINE} "test" :item)))
    (is (= SourceMapMode/BOTH (source-map-mode {:item SourceMapMode/BOTH} "test" :item)))
    (is (= SourceMapMode/BOTH (source-map-mode {:test/item SourceMapMode/BOTH} "test" :item)))
    (is (= SourceMapMode/EXTERNAL (source-map-mode {:item :external} "test" :item)))
    (is (= SourceMapMode/EXTERNAL (source-map-mode {:test/item :external} "test" :item)))
    (is (= SourceMapMode/DEFAULT (source-map-mode {:item :default} "test" :item)))
    (is (= SourceMapMode/DEFAULT (source-map-mode {:test/item :default} "test" :item)))
    (is (= SourceMapMode/INLINE (source-map-mode {:item :inline} "test" :item)))
    (is (= SourceMapMode/INLINE (source-map-mode {:test/item :inline} "test" :item)))
    (is (= SourceMapMode/BOTH (source-map-mode {:item :both} "test" :item)))
    (is (= SourceMapMode/BOTH (source-map-mode {:test/item :both} "test" :item)))))