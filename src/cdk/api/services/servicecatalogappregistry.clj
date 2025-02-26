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


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))


(defn build-cfn-attribute-group-association-builder
  "The build-cfn-attribute-group-association-builder function updates a CfnAttributeGroupAssociation$Builder instance using the provided configuration.
  The function takes the CfnAttributeGroupAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `attributeGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-group` |
"
  [^CfnAttributeGroupAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :attribute-group)]
    (. builder attributeGroup data))
  (.build builder))


(defn cfn-attribute-group-association-builder
  "Creates a  `CfnAttributeGroupAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-attribute-group-association-builder (CfnAttributeGroupAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-attribute-group-association-props-builder
  "The build-cfn-attribute-group-association-props-builder function updates a CfnAttributeGroupAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnAttributeGroupAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `attributeGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-group` |
"
  [^CfnAttributeGroupAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :attribute-group)]
    (. builder attributeGroup data))
  (.build builder))


(defn cfn-attribute-group-association-props-builder
  "Creates a  `CfnAttributeGroupAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-attribute-group-association-props-builder (new CfnAttributeGroupAssociationProps$Builder) id config))


(defn build-cfn-attribute-group-builder
  "The build-cfn-attribute-group-builder function updates a CfnAttributeGroup$Builder instance using the provided configuration.
  The function takes the CfnAttributeGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAttributeGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-attribute-group-builder
  "Creates a  `CfnAttributeGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-attribute-group-builder (CfnAttributeGroup$Builder/create scope (name id)) id config))


(defn build-cfn-attribute-group-props-builder
  "The build-cfn-attribute-group-props-builder function updates a CfnAttributeGroupProps$Builder instance using the provided configuration.
  The function takes the CfnAttributeGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAttributeGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-attribute-group-props-builder
  "Creates a  `CfnAttributeGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-attribute-group-props-builder (new CfnAttributeGroupProps$Builder) id config))


(defn build-cfn-resource-association-builder
  "The build-cfn-resource-association-builder function updates a CfnResourceAssociation$Builder instance using the provided configuration.
  The function takes the CfnResourceAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
"
  [^CfnResourceAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (.build builder))


(defn cfn-resource-association-builder
  "Creates a  `CfnResourceAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-association-builder (CfnResourceAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-resource-association-props-builder
  "The build-cfn-resource-association-props-builder function updates a CfnResourceAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnResourceAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
"
  [^CfnResourceAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application)]
    (. builder application data))
  (when-let [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (.build builder))


(defn cfn-resource-association-props-builder
  "Creates a  `CfnResourceAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-association-props-builder (new CfnResourceAssociationProps$Builder) id config))