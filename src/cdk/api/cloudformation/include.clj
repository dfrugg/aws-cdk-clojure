(ns cdk.api.cloudformation.include
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cloudformation.include package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.cloudformation.include CfnInclude$Builder
                                                          CfnIncludeProps$Builder
                                                          IncludedNestedStack$Builder]))


(defn cfn-include-builder
  "The cfn-include-builder function buildes out new instances of 
CfnInclude$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCyclicalReferences` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cyclical-references` |
| `loadNestedStacks` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-nested-stacks` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `preserveLogicalIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-logical-ids` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |"
  [stack id config]
  (let [builder (CfnInclude$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-include-props-builder
  "The cfn-include-props-builder function buildes out new instances of 
CfnIncludeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowCyclicalReferences` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-cyclical-references` |
| `loadNestedStacks` | java.util.Map | [[cdk.support/lookup-entry]] | `:load-nested-stacks` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `preserveLogicalIds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-logical-ids` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |"
  [stack id config]
  (let [builder (CfnIncludeProps$Builder.)]
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
    (.build builder)))


(defn included-nested-stack-builder
  "The included-nested-stack-builder function buildes out new instances of 
IncludedNestedStack$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `includedTemplate` | software.amazon.awscdk.cloudformation.include.CfnInclude | [[cdk.support/lookup-entry]] | `:included-template` |
| `stack` | software.amazon.awscdk.NestedStack | [[cdk.support/lookup-entry]] | `:stack` |"
  [stack id config]
  (let [builder (IncludedNestedStack$Builder.)]
    (when-let [data (lookup-entry config id :included-template)]
      (. builder includedTemplate data))
    (when-let [data (lookup-entry config id :stack)]
      (. builder stack data))
    (.build builder)))