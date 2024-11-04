(ns cdk.api.services.iotthingsgraph
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotthingsgraph package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotthingsgraph CfnFlowTemplate$Builder
                                                           CfnFlowTemplate$DefinitionDocumentProperty$Builder
                                                           CfnFlowTemplateProps$Builder]))


(defn cfn-flow-template-builder
  "The cfn-flow-template-builder function buildes out new instances of 
CfnFlowTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleNamespaceVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compatible-namespace-version` |
| `definition` | software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate$DefinitionDocumentProperty | [[cdk.support/lookup-entry]] | `:definition` |"
  [stack id config]
  (let [builder (CfnFlowTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :compatible-namespace-version)]
      (. builder compatibleNamespaceVersion data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (.build builder)))


(defn cfn-flow-template-definition-document-property-builder
  "The cfn-flow-template-definition-document-property-builder function buildes out new instances of 
CfnFlowTemplate$DefinitionDocumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `language` | java.lang.String | [[cdk.support/lookup-entry]] | `:language` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnFlowTemplate$DefinitionDocumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :language)]
      (. builder language data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-flow-template-props-builder
  "The cfn-flow-template-props-builder function buildes out new instances of 
CfnFlowTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compatibleNamespaceVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compatible-namespace-version` |
| `definition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:definition` |"
  [stack id config]
  (let [builder (CfnFlowTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :compatible-namespace-version)]
      (. builder compatibleNamespaceVersion data))
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (.build builder)))