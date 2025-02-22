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
  (when-let [data (lookup-entry config id :compatible-namespace-version)]
    (. builder compatibleNamespaceVersion data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


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
  (when-let [data (lookup-entry config id :language)]
    (. builder language data))
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


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
  (when-let [data (lookup-entry config id :compatible-namespace-version)]
    (. builder compatibleNamespaceVersion data))
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))