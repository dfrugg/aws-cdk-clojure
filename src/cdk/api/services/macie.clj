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


(defn cfn-allow-list-builder
  "The cfn-allow-list-builder function buildes out new instances of 
CfnAllowList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.services.macie.CfnAllowList$CriteriaProperty | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAllowList$Builder/create stack id)]
    (when-let [data (lookup-entry config id :criteria)]
      (. builder criteria data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-allow-list-criteria-property-builder
  "The cfn-allow-list-criteria-property-builder function buildes out new instances of 
CfnAllowList$CriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `s3WordsList` | software.amazon.awscdk.services.macie.CfnAllowList$S3WordsListProperty | [[cdk.support/lookup-entry]] | `:s3-words-list` |"
  [stack id config]
  (let [builder (CfnAllowList$CriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (when-let [data (lookup-entry config id :s3-words-list)]
      (. builder s3WordsList data))
    (.build builder)))


(defn cfn-allow-list-props-builder
  "The cfn-allow-list-props-builder function buildes out new instances of 
CfnAllowListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.services.macie.CfnAllowList$CriteriaProperty | [[cdk.support/lookup-entry]] | `:criteria` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAllowListProps$Builder.)]
    (when-let [data (lookup-entry config id :criteria)]
      (. builder criteria data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-allow-list-s3-words-list-property-builder
  "The cfn-allow-list-s3-words-list-property-builder function buildes out new instances of 
CfnAllowList$S3WordsListProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |"
  [stack id config]
  (let [builder (CfnAllowList$S3WordsListProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :object-key)]
      (. builder objectKey data))
    (.build builder)))


(defn cfn-custom-data-identifier-builder
  "The cfn-custom-data-identifier-builder function buildes out new instances of 
CfnCustomDataIdentifier$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreWords` | java.util.List | [[cdk.support/lookup-entry]] | `:ignore-words` |
| `keywords` | java.util.List | [[cdk.support/lookup-entry]] | `:keywords` |
| `maximumMatchDistance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-match-distance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomDataIdentifier$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ignore-words)]
      (. builder ignoreWords data))
    (when-let [data (lookup-entry config id :keywords)]
      (. builder keywords data))
    (when-let [data (lookup-entry config id :maximum-match-distance)]
      (. builder maximumMatchDistance data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-data-identifier-props-builder
  "The cfn-custom-data-identifier-props-builder function buildes out new instances of 
CfnCustomDataIdentifierProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ignoreWords` | java.util.List | [[cdk.support/lookup-entry]] | `:ignore-words` |
| `keywords` | java.util.List | [[cdk.support/lookup-entry]] | `:keywords` |
| `maximumMatchDistance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-match-distance` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regex` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomDataIdentifierProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ignore-words)]
      (. builder ignoreWords data))
    (when-let [data (lookup-entry config id :keywords)]
      (. builder keywords data))
    (when-let [data (lookup-entry config id :maximum-match-distance)]
      (. builder maximumMatchDistance data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :regex)]
      (. builder regex data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-findings-filter-builder
  "The cfn-findings-filter-builder function buildes out new instances of 
CfnFindingsFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `position` | java.lang.Number | [[cdk.support/lookup-entry]] | `:position` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFindingsFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :finding-criteria)]
      (. builder findingCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :position)]
      (. builder position data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-findings-filter-criterion-additional-properties-property-builder
  "The cfn-findings-filter-criterion-additional-properties-property-builder function buildes out new instances of 
CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eq` | java.util.List | [[cdk.support/lookup-entry]] | `:eq` |
| `gt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gt` |
| `gte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gte` |
| `lt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lt` |
| `lte` | java.lang.Number | [[cdk.support/lookup-entry]] | `:lte` |
| `neq` | java.util.List | [[cdk.support/lookup-entry]] | `:neq` |"
  [stack id config]
  (let [builder (CfnFindingsFilter$CriterionAdditionalPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :eq)]
      (. builder eq data))
    (when-let [data (lookup-entry config id :gt)]
      (. builder gt data))
    (when-let [data (lookup-entry config id :gte)]
      (. builder gte data))
    (when-let [data (lookup-entry config id :lt)]
      (. builder lt data))
    (when-let [data (lookup-entry config id :lte)]
      (. builder lte data))
    (when-let [data (lookup-entry config id :neq)]
      (. builder neq data))
    (.build builder)))


(defn cfn-findings-filter-finding-criteria-property-builder
  "The cfn-findings-filter-finding-criteria-property-builder function buildes out new instances of 
CfnFindingsFilter$FindingCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criterion` | java.util.Map | [[cdk.support/lookup-entry]] | `:criterion` |"
  [stack id config]
  (let [builder (CfnFindingsFilter$FindingCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :criterion)]
      (. builder criterion data))
    (.build builder)))


(defn cfn-findings-filter-findings-filter-list-item-property-builder
  "The cfn-findings-filter-findings-filter-list-item-property-builder function buildes out new instances of 
CfnFindingsFilter$FindingsFilterListItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFindingsFilter$FindingsFilterListItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-findings-filter-props-builder
  "The cfn-findings-filter-props-builder function buildes out new instances of 
CfnFindingsFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `findingCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:finding-criteria` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `position` | java.lang.Number | [[cdk.support/lookup-entry]] | `:position` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFindingsFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :finding-criteria)]
      (. builder findingCriteria data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :position)]
      (. builder position data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-session-builder
  "The cfn-session-builder function buildes out new instances of 
CfnSession$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnSession$Builder/create stack id)]
    (when-let [data (lookup-entry config id :finding-publishing-frequency)]
      (. builder findingPublishingFrequency data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-session-props-builder
  "The cfn-session-props-builder function buildes out new instances of 
CfnSessionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `findingPublishingFrequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:finding-publishing-frequency` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnSessionProps$Builder.)]
    (when-let [data (lookup-entry config id :finding-publishing-frequency)]
      (. builder findingPublishingFrequency data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))