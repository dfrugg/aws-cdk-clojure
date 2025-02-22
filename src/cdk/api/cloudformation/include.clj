(ns cdk.api.cloudformation.include
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cloudformation.include package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.cloudformation.include CfnInclude$Builder
                                                          CfnIncludeProps$Builder
                                                          IncludedNestedStack$Builder]))


(defn build-cfn-include-builder
  "The build-cfn-include-builder function updates a CfnInclude$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :allow-cyclical-references)]
    (. builder allowCyclicalReferences data))
  (when-let [data (lookup-entry config id :load-nested-stacks)]
    (. builder loadNestedStacks data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :preserve-logical-ids)]
    (. builder preserveLogicalIds data))
  (when-let [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (.build builder))


(defn build-cfn-include-props-builder
  "The build-cfn-include-props-builder function updates a CfnIncludeProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :allow-cyclical-references)]
    (. builder allowCyclicalReferences data))
  (when-let [data (lookup-entry config id :load-nested-stacks)]
    (. builder loadNestedStacks data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :preserve-logical-ids)]
    (. builder preserveLogicalIds data))
  (when-let [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (.build builder))


(defn build-included-nested-stack-builder
  "The build-included-nested-stack-builder function updates a IncludedNestedStack$Builder instance using the provided configuration.
  The function takes the IncludedNestedStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includedTemplate` | software.amazon.awscdk.cloudformation.include.CfnInclude | [[cdk.support/lookup-entry]] | `:included-template` |
| `stack` | software.amazon.awscdk.NestedStack | [[cdk.support/lookup-entry]] | `:stack` |
"
  [^IncludedNestedStack$Builder builder id config]
  (when-let [data (lookup-entry config id :included-template)]
    (. builder includedTemplate data))
  (when-let [data (lookup-entry config id :stack)]
    (. builder stack data))
  (.build builder))