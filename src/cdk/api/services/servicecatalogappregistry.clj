(ns cdk.api.services.servicecatalogappregistry
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicecatalogappregistry package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.servicecatalogappregistry CfnApplication$Builder
                                                                      CfnApplicationProps$Builder
                                                                      CfnAttributeGroup$Builder
                                                                      CfnAttributeGroupAssociation$Builder
                                                                      CfnAttributeGroupAssociationProps$Builder
                                                                      CfnAttributeGroupProps$Builder
                                                                      CfnResourceAssociation$Builder
                                                                      CfnResourceAssociationProps$Builder]))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-attribute-group-association-builder
  "The cfn-attribute-group-association-builder function buildes out new instances of 
CfnAttributeGroupAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `attributeGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-group` |"
  [stack id config]
  (let [builder (CfnAttributeGroupAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :attribute-group)]
      (. builder attributeGroup data))
    (.build builder)))


(defn cfn-attribute-group-association-props-builder
  "The cfn-attribute-group-association-props-builder function buildes out new instances of 
CfnAttributeGroupAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `attributeGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-group` |"
  [stack id config]
  (let [builder (CfnAttributeGroupAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :attribute-group)]
      (. builder attributeGroup data))
    (.build builder)))


(defn cfn-attribute-group-builder
  "The cfn-attribute-group-builder function buildes out new instances of 
CfnAttributeGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAttributeGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-attribute-group-props-builder
  "The cfn-attribute-group-props-builder function buildes out new instances of 
CfnAttributeGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAttributeGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-association-builder
  "The cfn-resource-association-builder function buildes out new instances of 
CfnResourceAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |"
  [stack id config]
  (let [builder (CfnResourceAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (.build builder)))


(defn cfn-resource-association-props-builder
  "The cfn-resource-association-props-builder function buildes out new instances of 
CfnResourceAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |"
  [stack id config]
  (let [builder (CfnResourceAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (.build builder)))