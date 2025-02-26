(ns cdk.api.services.iotthingsgraph
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotthingsgraph package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotthingsgraph CfnFlowTemplate$Builder
                                                           CfnFlowTemplate$DefinitionDocumentProperty$Builder
                                                           CfnFlowTemplateProps$Builder]))


(defn build-cfn-flow-template-builder
  "The build-cfn-flow-template-builder function updates a CfnFlowTemplate$Builder instance using the provided configuration.
  The function takes the CfnFlowTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleNamespaceVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compatible-namespace-version` |
| `definition` | software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate$DefinitionDocumentProperty | [[cdk.support/lookup-entry]] | `:definition` |
"
  [^CfnFlowTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :compatible-namespace-version)]
    (. builder compatibleNamespaceVersion data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


(defn cfn-flow-template-builder
  "Creates a  `CfnFlowTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-flow-template-builder (CfnFlowTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-flow-template-definition-document-property-builder
  "The build-cfn-flow-template-definition-document-property-builder function updates a CfnFlowTemplate$DefinitionDocumentProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowTemplate$DefinitionDocumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `language` | java.lang.String | [[cdk.support/lookup-entry]] | `:language` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnFlowTemplate$DefinitionDocumentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :language)]
    (. builder language data))
  (when-some [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-flow-template-definition-document-property-builder
  "Creates a  `CfnFlowTemplate$DefinitionDocumentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-flow-template-definition-document-property-builder (new CfnFlowTemplate$DefinitionDocumentProperty$Builder) id config))


(defn build-cfn-flow-template-props-builder
  "The build-cfn-flow-template-props-builder function updates a CfnFlowTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnFlowTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleNamespaceVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compatible-namespace-version` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |
"
  [^CfnFlowTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :compatible-namespace-version)]
    (. builder compatibleNamespaceVersion data))
  (when-some [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


(defn cfn-flow-template-props-builder
  "Creates a  `CfnFlowTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-flow-template-props-builder (new CfnFlowTemplateProps$Builder) id config))