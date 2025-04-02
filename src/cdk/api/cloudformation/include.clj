(ns cdk.api.cloudformation.include
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cloudformation.include package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.cloudformation.include CfnInclude$Builder
                                                          CfnIncludeProps$Builder
                                                          IncludedNestedStack$Builder]))


(defn cfn-include-builder>
  "The cfn-include-builder> function updates a CfnInclude$Builder instance using the provided configuration.
  The function takes the CfnInclude$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCyclicalReferences` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cyclical-references` |
| `loadNestedStacks` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-nested-stacks` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `preserveLogicalIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-logical-ids` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |
"
  [^CfnInclude$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-cyclical-references)]
    (. builder allowCyclicalReferences data))
  (when-some [data (lookup-entry config id :load-nested-stacks)]
    (. builder loadNestedStacks data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :preserve-logical-ids)]
    (. builder preserveLogicalIds data))
  (when-some [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (.build builder))


(defn cfn-include-builder
  "Creates a  `CfnInclude$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-include-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-include-builder> (CfnInclude$Builder/create scope (name id)) id config))


(defn cfn-include-props-builder>
  "The cfn-include-props-builder> function updates a CfnIncludeProps$Builder instance using the provided configuration.
  The function takes the CfnIncludeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCyclicalReferences` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cyclical-references` |
| `loadNestedStacks` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-nested-stacks` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `preserveLogicalIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-logical-ids` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |
"
  [^CfnIncludeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-cyclical-references)]
    (. builder allowCyclicalReferences data))
  (when-some [data (lookup-entry config id :load-nested-stacks)]
    (. builder loadNestedStacks data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :preserve-logical-ids)]
    (. builder preserveLogicalIds data))
  (when-some [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (.build builder))


(defn cfn-include-props-builder
  "Creates a  `CfnIncludeProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-include-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-include-props-builder> (new CfnIncludeProps$Builder) id config))


(defn included-nested-stack-builder>
  "The included-nested-stack-builder> function updates a IncludedNestedStack$Builder instance using the provided configuration.
  The function takes the IncludedNestedStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includedTemplate` | software.amazon.awscdk.cloudformation.include.CfnInclude | [[cdk.support/lookup-entry]] | `:included-template` |
| `stack` | software.amazon.awscdk.NestedStack | [[cdk.support/lookup-entry]] | `:stack` |
"
  [^IncludedNestedStack$Builder builder id config]
  (when-some [data (lookup-entry config id :included-template)]
    (. builder includedTemplate data))
  (when-some [data (lookup-entry config id :stack)]
    (. builder stack data))
  (.build builder))


(defn included-nested-stack-builder
  "Creates a  `IncludedNestedStack$Builder` instance using a no-argument constructor, applies the data configuration using the [[included-nested-stack-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (included-nested-stack-builder> (new IncludedNestedStack$Builder) id config))