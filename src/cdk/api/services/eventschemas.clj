(ns cdk.api.services.eventschemas
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.eventschemas package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.eventschemas CfnDiscoverer$Builder
                                                         CfnDiscoverer$TagsEntryProperty$Builder
                                                         CfnDiscovererProps$Builder
                                                         CfnRegistry$Builder
                                                         CfnRegistry$TagsEntryProperty$Builder
                                                         CfnRegistryPolicy$Builder
                                                         CfnRegistryPolicyProps$Builder
                                                         CfnRegistryProps$Builder
                                                         CfnSchema$Builder
                                                         CfnSchema$TagsEntryProperty$Builder
                                                         CfnSchemaProps$Builder]))


(defn cfn-discoverer-builder
  "The cfn-discoverer-builder function buildes out new instances of 
CfnDiscoverer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccount` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDiscoverer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cross-account)]
      (. builder crossAccount data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-discoverer-props-builder
  "The cfn-discoverer-props-builder function buildes out new instances of 
CfnDiscovererProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccount` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDiscovererProps$Builder.)]
    (when-let [data (lookup-entry config id :cross-account)]
      (. builder crossAccount data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-discoverer-tags-entry-property-builder
  "The cfn-discoverer-tags-entry-property-builder function buildes out new instances of 
CfnDiscoverer$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDiscoverer$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-registry-builder
  "The cfn-registry-builder function buildes out new instances of 
CfnRegistry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegistry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-registry-policy-builder
  "The cfn-registry-policy-builder function buildes out new instances of 
CfnRegistryPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `revisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-id` |"
  [stack id config]
  (let [builder (CfnRegistryPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :revision-id)]
      (. builder revisionId data))
    (.build builder)))


(defn cfn-registry-policy-props-builder
  "The cfn-registry-policy-props-builder function buildes out new instances of 
CfnRegistryPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `revisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-id` |"
  [stack id config]
  (let [builder (CfnRegistryPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :revision-id)]
      (. builder revisionId data))
    (.build builder)))


(defn cfn-registry-props-builder
  "The cfn-registry-props-builder function buildes out new instances of 
CfnRegistryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegistryProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-registry-tags-entry-property-builder
  "The cfn-registry-tags-entry-property-builder function buildes out new instances of 
CfnRegistry$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRegistry$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-schema-builder
  "The cfn-schema-builder function buildes out new instances of 
CfnSchema$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSchema$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-schema-props-builder
  "The cfn-schema-props-builder function buildes out new instances of 
CfnSchemaProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSchemaProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :registry-name)]
      (. builder registryName data))
    (when-let [data (lookup-entry config id :schema-name)]
      (. builder schemaName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-schema-tags-entry-property-builder
  "The cfn-schema-tags-entry-property-builder function buildes out new instances of 
CfnSchema$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSchema$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))