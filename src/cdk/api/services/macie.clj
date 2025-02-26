(ns cdk.api.services.macie
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.macie package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.macie CfnAllowList$Builder
                                                  CfnAllowList$CriteriaProperty$Builder
                                                  CfnAllowList$S3WordsListProperty$Builder
                                                  CfnAllowListProps$Builder
                                                  CfnCustomDataIdentifier$Builder
                                                  CfnCustomDataIdentifierProps$Builder
                                                  CfnFindingsFilter$Builder
                                                  CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder
                                                  CfnFindingsFilter$FindingCriteriaProperty$Builder
                                                  CfnFindingsFilter$FindingsFilterListItemProperty$Builder
                                                  CfnFindingsFilterProps$Builder
                                                  CfnSession$Builder
                                                  CfnSessionProps$Builder]))


(defn build-cfn-allow-list-builder
  "The build-cfn-allow-list-builder function updates a CfnAllowList$Builder instance using the provided configuration.
  The function takes the CfnAllowList$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.services.macie.CfnAllowList$CriteriaProperty | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAllowList$Builder builder id config]
  (when-some [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-allow-list-builder
  "Creates a  `CfnAllowList$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-allow-list-builder (CfnAllowList$Builder/create scope (name id)) id config))


(defn build-cfn-allow-list-criteria-property-builder
  "The build-cfn-allow-list-criteria-property-builder function updates a CfnAllowList$CriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnAllowList$CriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `s3WordsList` | software.amazon.awscdk.services.macie.CfnAllowList$S3WordsListProperty | [[cdk.support/lookup-entry]] | `:s3-words-list` |
"
  [^CfnAllowList$CriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-some [data (lookup-entry config id :s3-words-list)]
    (. builder s3WordsList data))
  (.build builder))


(defn cfn-allow-list-criteria-property-builder
  "Creates a  `CfnAllowList$CriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-allow-list-criteria-property-builder (new CfnAllowList$CriteriaProperty$Builder) id config))


(defn build-cfn-allow-list-props-builder
  "The build-cfn-allow-list-props-builder function updates a CfnAllowListProps$Builder instance using the provided configuration.
  The function takes the CfnAllowListProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.services.macie.CfnAllowList$CriteriaProperty | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAllowListProps$Builder builder id config]
  (when-some [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-allow-list-props-builder
  "Creates a  `CfnAllowListProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-allow-list-props-builder (new CfnAllowListProps$Builder) id config))


(defn build-cfn-allow-list-s3-words-list-property-builder
  "The build-cfn-allow-list-s3-words-list-property-builder function updates a CfnAllowList$S3WordsListProperty$Builder instance using the provided configuration.
  The function takes the CfnAllowList$S3WordsListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
"
  [^CfnAllowList$S3WordsListProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (.build builder))


(defn cfn-allow-list-s3-words-list-property-builder
  "Creates a  `CfnAllowList$S3WordsListProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-allow-list-s3-words-list-property-builder (new CfnAllowList$S3WordsListProperty$Builder) id config))


(defn build-cfn-custom-data-identifier-builder
  "The build-cfn-custom-data-identifier-builder function updates a CfnCustomDataIdentifier$Builder instance using the provided configuration.
  The function takes the CfnCustomDataIdentifier$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreWords` | java.util.List | [[cdk.support/lookup-entry]] | `:ignore-words` |
| `keywords` | java.util.List | [[cdk.support/lookup-entry]] | `:keywords` |
| `maximumMatchDistance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-match-distance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomDataIdentifier$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ignore-words)]
    (. builder ignoreWords data))
  (when-some [data (lookup-entry config id :keywords)]
    (. builder keywords data))
  (when-some [data (lookup-entry config id :maximum-match-distance)]
    (. builder maximumMatchDistance data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-data-identifier-builder
  "Creates a  `CfnCustomDataIdentifier$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-custom-data-identifier-builder (CfnCustomDataIdentifier$Builder/create scope (name id)) id config))


(defn build-cfn-custom-data-identifier-props-builder
  "The build-cfn-custom-data-identifier-props-builder function updates a CfnCustomDataIdentifierProps$Builder instance using the provided configuration.
  The function takes the CfnCustomDataIdentifierProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreWords` | java.util.List | [[cdk.support/lookup-entry]] | `:ignore-words` |
| `keywords` | java.util.List | [[cdk.support/lookup-entry]] | `:keywords` |
| `maximumMatchDistance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-match-distance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomDataIdentifierProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ignore-words)]
    (. builder ignoreWords data))
  (when-some [data (lookup-entry config id :keywords)]
    (. builder keywords data))
  (when-some [data (lookup-entry config id :maximum-match-distance)]
    (. builder maximumMatchDistance data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex)]
    (. builder regex data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-data-identifier-props-builder
  "Creates a  `CfnCustomDataIdentifierProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-custom-data-identifier-props-builder (new CfnCustomDataIdentifierProps$Builder) id config))


(defn build-cfn-findings-filter-builder
  "The build-cfn-findings-filter-builder function updates a CfnFindingsFilter$Builder instance using the provided configuration.
  The function takes the CfnFindingsFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `position` | java.lang.Number | [[cdk.support/lookup-entry]] | `:position` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFindingsFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :finding-criteria)]
    (. builder findingCriteria data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :position)]
    (. builder position data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-findings-filter-builder
  "Creates a  `CfnFindingsFilter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-findings-filter-builder (CfnFindingsFilter$Builder/create scope (name id)) id config))


(defn build-cfn-findings-filter-criterion-additional-properties-property-builder
  "The build-cfn-findings-filter-criterion-additional-properties-property-builder function updates a CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eq` | java.util.List | [[cdk.support/lookup-entry]] | `:eq` |
| `gt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gt` |
| `gte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gte` |
| `lt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lt` |
| `lte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lte` |
| `neq` | java.util.List | [[cdk.support/lookup-entry]] | `:neq` |
"
  [^CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eq)]
    (. builder eq data))
  (when-some [data (lookup-entry config id :gt)]
    (. builder gt data))
  (when-some [data (lookup-entry config id :gte)]
    (. builder gte data))
  (when-some [data (lookup-entry config id :lt)]
    (. builder lt data))
  (when-some [data (lookup-entry config id :lte)]
    (. builder lte data))
  (when-some [data (lookup-entry config id :neq)]
    (. builder neq data))
  (.build builder))


(defn cfn-findings-filter-criterion-additional-properties-property-builder
  "Creates a  `CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-findings-filter-criterion-additional-properties-property-builder (new CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder) id config))


(defn build-cfn-findings-filter-finding-criteria-property-builder
  "The build-cfn-findings-filter-finding-criteria-property-builder function updates a CfnFindingsFilter$FindingCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnFindingsFilter$FindingCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criterion` | java.util.Map | [[cdk.support/lookup-entry]] | `:criterion` |
"
  [^CfnFindingsFilter$FindingCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :criterion)]
    (. builder criterion data))
  (.build builder))


(defn cfn-findings-filter-finding-criteria-property-builder
  "Creates a  `CfnFindingsFilter$FindingCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-findings-filter-finding-criteria-property-builder (new CfnFindingsFilter$FindingCriteriaProperty$Builder) id config))


(defn build-cfn-findings-filter-findings-filter-list-item-property-builder
  "The build-cfn-findings-filter-findings-filter-list-item-property-builder function updates a CfnFindingsFilter$FindingsFilterListItemProperty$Builder instance using the provided configuration.
  The function takes the CfnFindingsFilter$FindingsFilterListItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFindingsFilter$FindingsFilterListItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-findings-filter-findings-filter-list-item-property-builder
  "Creates a  `CfnFindingsFilter$FindingsFilterListItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-findings-filter-findings-filter-list-item-property-builder (new CfnFindingsFilter$FindingsFilterListItemProperty$Builder) id config))


(defn build-cfn-findings-filter-props-builder
  "The build-cfn-findings-filter-props-builder function updates a CfnFindingsFilterProps$Builder instance using the provided configuration.
  The function takes the CfnFindingsFilterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `position` | java.lang.Number | [[cdk.support/lookup-entry]] | `:position` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFindingsFilterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :finding-criteria)]
    (. builder findingCriteria data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :position)]
    (. builder position data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-findings-filter-props-builder
  "Creates a  `CfnFindingsFilterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-findings-filter-props-builder (new CfnFindingsFilterProps$Builder) id config))


(defn build-cfn-session-builder
  "The build-cfn-session-builder function updates a CfnSession$Builder instance using the provided configuration.
  The function takes the CfnSession$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnSession$Builder builder id config]
  (when-some [data (lookup-entry config id :finding-publishing-frequency)]
    (. builder findingPublishingFrequency data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-session-builder
  "Creates a  `CfnSession$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-session-builder (CfnSession$Builder/create scope (name id)) id config))


(defn build-cfn-session-props-builder
  "The build-cfn-session-props-builder function updates a CfnSessionProps$Builder instance using the provided configuration.
  The function takes the CfnSessionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnSessionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :finding-publishing-frequency)]
    (. builder findingPublishingFrequency data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-session-props-builder
  "Creates a  `CfnSessionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-session-props-builder (new CfnSessionProps$Builder) id config))