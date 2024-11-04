(ns cdk.api.services.resourceexplorer2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.resourceexplorer2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.resourceexplorer2 CfnDefaultViewAssociation$Builder
                                                              CfnDefaultViewAssociationProps$Builder
                                                              CfnIndex$Builder
                                                              CfnIndexProps$Builder
                                                              CfnView$Builder
                                                              CfnView$FiltersProperty$Builder
                                                              CfnView$IncludedPropertyProperty$Builder
                                                              CfnView$SearchFilterProperty$Builder
                                                              CfnViewProps$Builder]))


(defn cfn-default-view-association-builder
  "The cfn-default-view-association-builder function buildes out new instances of 
CfnDefaultViewAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |"
  [stack id config]
  (let [builder (CfnDefaultViewAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :view-arn)]
      (. builder viewArn data))
    (.build builder)))


(defn cfn-default-view-association-props-builder
  "The cfn-default-view-association-props-builder function buildes out new instances of 
CfnDefaultViewAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |"
  [stack id config]
  (let [builder (CfnDefaultViewAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :view-arn)]
      (. builder viewArn data))
    (.build builder)))


(defn cfn-index-builder
  "The cfn-index-builder function buildes out new instances of 
CfnIndex$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndex$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-index-props-builder
  "The cfn-index-props-builder function buildes out new instances of 
CfnIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnIndexProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-view-builder
  "The cfn-view-builder function buildes out new instances of 
CfnView$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `includedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:included-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `viewName` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-name` |"
  [stack id config]
  (let [builder (CfnView$Builder/create stack id)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :included-properties)]
      (. builder includedProperties data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :view-name)]
      (. builder viewName data))
    (.build builder)))


(defn cfn-view-filters-property-builder
  "The cfn-view-filters-property-builder function buildes out new instances of 
CfnView$FiltersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-string` |"
  [stack id config]
  (let [builder (CfnView$FiltersProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter-string)]
      (. builder filterString data))
    (.build builder)))


(defn cfn-view-included-property-property-builder
  "The cfn-view-included-property-property-builder function buildes out new instances of 
CfnView$IncludedPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnView$IncludedPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-view-props-builder
  "The cfn-view-props-builder function buildes out new instances of 
CfnViewProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
| `includedProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:included-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `viewName` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-name` |"
  [stack id config]
  (let [builder (CfnViewProps$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :included-properties)]
      (. builder includedProperties data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :view-name)]
      (. builder viewName data))
    (.build builder)))


(defn cfn-view-search-filter-property-builder
  "The cfn-view-search-filter-property-builder function buildes out new instances of 
CfnView$SearchFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-string` |"
  [stack id config]
  (let [builder (CfnView$SearchFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter-string)]
      (. builder filterString data))
    (.build builder)))