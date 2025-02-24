(ns cdk.api.services.ram
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ram package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ram CfnPermission$Builder
                                                CfnPermissionProps$Builder
                                                CfnResourceShare$Builder
                                                CfnResourceShareProps$Builder]))


(defn build-cfn-permission-builder
  "The build-cfn-permission-builder function updates a CfnPermission$Builder instance using the provided configuration.
  The function takes the CfnPermission$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyTemplate` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-template` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPermission$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy-template)]
    (. builder policyTemplate data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-permission-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-permission-builder (CfnPermission$Builder/create scope (name id)) id config))


(defn build-cfn-permission-props-builder
  "The build-cfn-permission-props-builder function updates a CfnPermissionProps$Builder instance using the provided configuration.
  The function takes the CfnPermissionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyTemplate` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-template` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPermissionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :policy-template)]
    (. builder policyTemplate data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-permission-props-builder
  ""
  [id config]
  (build-cfn-permission-props-builder (new CfnPermissionProps$Builder) id config))


(defn build-cfn-resource-share-builder
  "The build-cfn-resource-share-builder function updates a CfnResourceShare$Builder instance using the provided configuration.
  The function takes the CfnResourceShare$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowExternalPrincipals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-external-principals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:permission-arns` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceShare$Builder builder id config]
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
  (.build builder))


(defn cfn-resource-share-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-share-builder (CfnResourceShare$Builder/create scope (name id)) id config))


(defn build-cfn-resource-share-props-builder
  "The build-cfn-resource-share-props-builder function updates a CfnResourceShareProps$Builder instance using the provided configuration.
  The function takes the CfnResourceShareProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowExternalPrincipals` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-external-principals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionArns` | java.util.List | [[cdk.support/lookup-entry]] | `:permission-arns` |
| `principals` | java.util.List | [[cdk.support/lookup-entry]] | `:principals` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceShareProps$Builder builder id config]
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
  (.build builder))


(defn cfn-resource-share-props-builder
  ""
  [id config]
  (build-cfn-resource-share-props-builder (new CfnResourceShareProps$Builder) id config))