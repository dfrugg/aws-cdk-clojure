(ns cdk.api.services.accessanalyzer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.accessanalyzer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.accessanalyzer CfnAnalyzer$AnalyzerConfigurationProperty$Builder
                                                           CfnAnalyzer$ArchiveRuleProperty$Builder
                                                           CfnAnalyzer$Builder
                                                           CfnAnalyzer$FilterProperty$Builder
                                                           CfnAnalyzer$UnusedAccessConfigurationProperty$Builder
                                                           CfnAnalyzerProps$Builder]))


(defn cfn-analyzer-analyzer-configuration-property-builder
  "The cfn-analyzer-analyzer-configuration-property-builder function buildes out new instances of 
CfnAnalyzer$AnalyzerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unused-access-configuration` |"
  [stack id config]
  (let [builder (CfnAnalyzer$AnalyzerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :unused-access-configuration)]
      (. builder unusedAccessConfiguration data))
    (.build builder)))


(defn cfn-analyzer-archive-rule-property-builder
  "The cfn-analyzer-archive-rule-property-builder function buildes out new instances of 
CfnAnalyzer$ArchiveRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.util.List | [[cdk.support/lookup-entry]] | `:filter` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |"
  [stack id config]
  (let [builder (CfnAnalyzer$ArchiveRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter)]
      (. builder filter data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (.build builder)))


(defn cfn-analyzer-builder
  "The cfn-analyzer-builder function buildes out new instances of 
CfnAnalyzer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyzerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analyzer-configuration` |
| `analyzerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:analyzer-name` |
| `archiveRules` | java.util.List | [[cdk.support/lookup-entry]] | `:archive-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAnalyzer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :analyzer-configuration)]
      (. builder analyzerConfiguration data))
    (when-let [data (lookup-entry config id :analyzer-name)]
      (. builder analyzerName data))
    (when-let [data (lookup-entry config id :archive-rules)]
      (. builder archiveRules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-analyzer-filter-property-builder
  "The cfn-analyzer-filter-property-builder function buildes out new instances of 
CfnAnalyzer$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contains` | java.util.List | [[cdk.support/lookup-entry]] | `:contains` |
| `eq` | java.util.List | [[cdk.support/lookup-entry]] | `:eq` |
| `exists` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exists` |
| `neq` | java.util.List | [[cdk.support/lookup-entry]] | `:neq` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |"
  [stack id config]
  (let [builder (CfnAnalyzer$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :contains)]
      (. builder contains data))
    (when-let [data (lookup-entry config id :eq)]
      (. builder eq data))
    (when-let [data (lookup-entry config id :exists)]
      (. builder exists data))
    (when-let [data (lookup-entry config id :neq)]
      (. builder neq data))
    (when-let [data (lookup-entry config id :property)]
      (. builder property data))
    (.build builder)))


(defn cfn-analyzer-props-builder
  "The cfn-analyzer-props-builder function buildes out new instances of 
CfnAnalyzerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyzerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analyzer-configuration` |
| `analyzerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:analyzer-name` |
| `archiveRules` | java.util.List | [[cdk.support/lookup-entry]] | `:archive-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAnalyzerProps$Builder.)]
    (when-let [data (lookup-entry config id :analyzer-configuration)]
      (. builder analyzerConfiguration data))
    (when-let [data (lookup-entry config id :analyzer-name)]
      (. builder analyzerName data))
    (when-let [data (lookup-entry config id :archive-rules)]
      (. builder archiveRules data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-analyzer-unused-access-configuration-property-builder
  "The cfn-analyzer-unused-access-configuration-property-builder function buildes out new instances of 
CfnAnalyzer$UnusedAccessConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unused-access-age` |"
  [stack id config]
  (let [builder (CfnAnalyzer$UnusedAccessConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :unused-access-age)]
      (. builder unusedAccessAge data))
    (.build builder)))