(ns cdk.api.services.accessanalyzer
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.accessanalyzer package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.accessanalyzer CfnAnalyzer$AnalyzerConfigurationProperty$Builder
                                                           CfnAnalyzer$ArchiveRuleProperty$Builder
                                                           CfnAnalyzer$Builder
                                                           CfnAnalyzer$FilterProperty$Builder
                                                           CfnAnalyzer$UnusedAccessConfigurationProperty$Builder
                                                           CfnAnalyzerProps$Builder]))


(defn cfn-analyzer-analyzer-configuration-property-builder>
  "The cfn-analyzer-analyzer-configuration-property-builder> function updates a CfnAnalyzer$AnalyzerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$AnalyzerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unused-access-configuration` |
"
  [^CfnAnalyzer$AnalyzerConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unused-access-configuration)]
    (. builder unusedAccessConfiguration data))
  (.build builder))


(defn cfn-analyzer-analyzer-configuration-property-builder
  "Creates a  `CfnAnalyzer$AnalyzerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-analyzer-analyzer-configuration-property-builder> (new CfnAnalyzer$AnalyzerConfigurationProperty$Builder) id config))


(defn cfn-analyzer-archive-rule-property-builder>
  "The cfn-analyzer-archive-rule-property-builder> function updates a CfnAnalyzer$ArchiveRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$ArchiveRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filter` | java.util.List | [[cdk.support/lookup-entry]] | `:filter` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
"
  [^CfnAnalyzer$ArchiveRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (.build builder))


(defn cfn-analyzer-archive-rule-property-builder
  "Creates a  `CfnAnalyzer$ArchiveRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-analyzer-archive-rule-property-builder> (new CfnAnalyzer$ArchiveRuleProperty$Builder) id config))


(defn cfn-analyzer-builder>
  "The cfn-analyzer-builder> function updates a CfnAnalyzer$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analyzer-configuration)]
    (. builder analyzerConfiguration data))
  (when-some [data (lookup-entry config id :analyzer-name)]
    (. builder analyzerName data))
  (when-some [data (lookup-entry config id :archive-rules)]
    (. builder archiveRules data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-analyzer-builder
  "Creates a  `CfnAnalyzer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-analyzer-builder> (CfnAnalyzer$Builder/create scope (name id)) id config))


(defn cfn-analyzer-filter-property-builder>
  "The cfn-analyzer-filter-property-builder> function updates a CfnAnalyzer$FilterProperty$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :contains)]
    (. builder contains data))
  (when-some [data (lookup-entry config id :eq)]
    (. builder eq data))
  (when-some [data (lookup-entry config id :exists)]
    (. builder exists data))
  (when-some [data (lookup-entry config id :neq)]
    (. builder neq data))
  (when-some [data (lookup-entry config id :property)]
    (. builder property data))
  (.build builder))


(defn cfn-analyzer-filter-property-builder
  "Creates a  `CfnAnalyzer$FilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-analyzer-filter-property-builder> (new CfnAnalyzer$FilterProperty$Builder) id config))


(defn cfn-analyzer-props-builder>
  "The cfn-analyzer-props-builder> function updates a CfnAnalyzerProps$Builder instance using the provided configuration.
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
  (when-some [data (lookup-entry config id :analyzer-configuration)]
    (. builder analyzerConfiguration data))
  (when-some [data (lookup-entry config id :analyzer-name)]
    (. builder analyzerName data))
  (when-some [data (lookup-entry config id :archive-rules)]
    (. builder archiveRules data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-analyzer-props-builder
  "Creates a  `CfnAnalyzerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-analyzer-props-builder> (new CfnAnalyzerProps$Builder) id config))


(defn cfn-analyzer-unused-access-configuration-property-builder>
  "The cfn-analyzer-unused-access-configuration-property-builder> function updates a CfnAnalyzer$UnusedAccessConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAnalyzer$UnusedAccessConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unusedAccessAge` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unused-access-age` |
"
  [^CfnAnalyzer$UnusedAccessConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unused-access-age)]
    (. builder unusedAccessAge data))
  (.build builder))


(defn cfn-analyzer-unused-access-configuration-property-builder
  "Creates a  `CfnAnalyzer$UnusedAccessConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-analyzer-unused-access-configuration-property-builder> (new CfnAnalyzer$UnusedAccessConfigurationProperty$Builder) id config))