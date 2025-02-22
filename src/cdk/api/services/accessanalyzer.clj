(ns cdk.api.services.accessanalyzer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.accessanalyzer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.accessanalyzer CfnAnalyzer$AnalyzerConfigurationProperty$Builder
                                                           CfnAnalyzer$ArchiveRuleProperty$Builder
                                                           CfnAnalyzer$Builder
                                                           CfnAnalyzer$FilterProperty$Builder
                                                           CfnAnalyzer$UnusedAccessConfigurationProperty$Builder
                                                           CfnAnalyzerProps$Builder]))


(defn build-cfn-analyzer-analyzer-configuration-property-builder
  "The build-cfn-analyzer-analyzer-configuration-property-builder function updates a CfnAnalyzer$AnalyzerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$AnalyzerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unused-access-configuration` |
"
  [^CfnAnalyzer$AnalyzerConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unused-access-configuration)]
    (. builder unusedAccessConfiguration data))
  (.build builder))


(defn build-cfn-analyzer-archive-rule-property-builder
  "The build-cfn-analyzer-archive-rule-property-builder function updates a CfnAnalyzer$ArchiveRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$ArchiveRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.util.List | [[cdk.support/lookup-entry]] | `:filter` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^CfnAnalyzer$ArchiveRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))


(defn build-cfn-analyzer-builder
  "The build-cfn-analyzer-builder function updates a CfnAnalyzer$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyzerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analyzer-configuration` |
| `analyzerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:analyzer-name` |
| `archiveRules` | java.util.List | [[cdk.support/lookup-entry]] | `:archive-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAnalyzer$Builder builder id config]
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
  (.build builder))


(defn build-cfn-analyzer-filter-property-builder
  "The build-cfn-analyzer-filter-property-builder function updates a CfnAnalyzer$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contains` | java.util.List | [[cdk.support/lookup-entry]] | `:contains` |
| `eq` | java.util.List | [[cdk.support/lookup-entry]] | `:eq` |
| `exists` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exists` |
| `neq` | java.util.List | [[cdk.support/lookup-entry]] | `:neq` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
"
  [^CfnAnalyzer$FilterProperty$Builder builder id config]
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
  (.build builder))


(defn build-cfn-analyzer-props-builder
  "The build-cfn-analyzer-props-builder function updates a CfnAnalyzerProps$Builder instance using the provided configuration.
  The function takes the CfnAnalyzerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analyzerConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:analyzer-configuration` |
| `analyzerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:analyzer-name` |
| `archiveRules` | java.util.List | [[cdk.support/lookup-entry]] | `:archive-rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAnalyzerProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-analyzer-unused-access-configuration-property-builder
  "The build-cfn-analyzer-unused-access-configuration-property-builder function updates a CfnAnalyzer$UnusedAccessConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$UnusedAccessConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unused-access-age` |
"
  [^CfnAnalyzer$UnusedAccessConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unused-access-age)]
    (. builder unusedAccessAge data))
  (.build builder))