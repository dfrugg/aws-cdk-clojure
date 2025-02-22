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


(defn build-cfn-discoverer-builder
  "The build-cfn-discoverer-builder function updates a CfnDiscoverer$Builder instance using the provided configuration.
  The function takes the CfnDiscoverer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccount` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDiscoverer$Builder builder id config]
  (when-let [data (lookup-entry config id :cross-account)]
    (. builder crossAccount data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-discoverer-props-builder
  "The build-cfn-discoverer-props-builder function updates a CfnDiscovererProps$Builder instance using the provided configuration.
  The function takes the CfnDiscovererProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccount` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-account` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDiscovererProps$Builder builder id config]
  (when-let [data (lookup-entry config id :cross-account)]
    (. builder crossAccount data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-discoverer-tags-entry-property-builder
  "The build-cfn-discoverer-tags-entry-property-builder function updates a CfnDiscoverer$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnDiscoverer$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDiscoverer$TagsEntryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-registry-builder
  "The build-cfn-registry-builder function updates a CfnRegistry$Builder instance using the provided configuration.
  The function takes the CfnRegistry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegistry$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-registry-policy-builder
  "The build-cfn-registry-policy-builder function updates a CfnRegistryPolicy$Builder instance using the provided configuration.
  The function takes the CfnRegistryPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `revisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-id` |
"
  [^CfnRegistryPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-let [data (lookup-entry config id :revision-id)]
    (. builder revisionId data))
  (.build builder))


(defn build-cfn-registry-policy-props-builder
  "The build-cfn-registry-policy-props-builder function updates a CfnRegistryPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnRegistryPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `revisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-id` |
"
  [^CfnRegistryPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-let [data (lookup-entry config id :revision-id)]
    (. builder revisionId data))
  (.build builder))


(defn build-cfn-registry-props-builder
  "The build-cfn-registry-props-builder function updates a CfnRegistryProps$Builder instance using the provided configuration.
  The function takes the CfnRegistryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegistryProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :registry-name)]
    (. builder registryName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-registry-tags-entry-property-builder
  "The build-cfn-registry-tags-entry-property-builder function updates a CfnRegistry$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnRegistry$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRegistry$TagsEntryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-schema-builder
  "The build-cfn-schema-builder function updates a CfnSchema$Builder instance using the provided configuration.
  The function takes the CfnSchema$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSchema$Builder builder id config]
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
  (.build builder))


(defn build-cfn-schema-props-builder
  "The build-cfn-schema-props-builder function updates a CfnSchemaProps$Builder instance using the provided configuration.
  The function takes the CfnSchemaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `registryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:registry-name` |
| `schemaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSchemaProps$Builder builder id config]
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
  (.build builder))


(defn build-cfn-schema-tags-entry-property-builder
  "The build-cfn-schema-tags-entry-property-builder function updates a CfnSchema$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnSchema$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSchema$TagsEntryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))