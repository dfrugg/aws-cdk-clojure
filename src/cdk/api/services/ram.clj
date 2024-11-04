(ns cdk.api.services.ram
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ram package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ram CfnPermission$Builder
                                                CfnPermissionProps$Builder
                                                CfnResourceShare$Builder
                                                CfnResourceShareProps$Builder]))


(defn cfn-permission-builder
  "The cfn-permission-builder function buildes out new instances of 
CfnPermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyTemplate` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-template` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPermission$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy-template)]
      (. builder policyTemplate data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-permission-props-builder
  "The cfn-permission-props-builder function buildes out new instances of 
CfnPermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyTemplate` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-template` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPermissionProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy-template)]
      (. builder policyTemplate data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-share-builder
  "The cfn-resource-share-builder function buildes out new instances of 
CfnResourceShare$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowExternalPrincipals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-external-principals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:permission-arns` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceShare$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-external-principals)]
      (. builder allowExternalPrincipals data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permission-arns)]
      (. builder permissionArns data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-share-props-builder
  "The cfn-resource-share-props-builder function buildes out new instances of 
CfnResourceShareProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowExternalPrincipals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-external-principals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:permission-arns` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceShareProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-external-principals)]
      (. builder allowExternalPrincipals data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permission-arns)]
      (. builder permissionArns data))
    (when-let [data (lookup-entry config id :principals)]
      (. builder principals data))
    (when-let [data (lookup-entry config id :resource-arns)]
      (. builder resourceArns data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))