(ns cdk.api.services.lookoutvision
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lookoutvision package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lookoutvision CfnProject$Builder
                                                          CfnProjectProps$Builder]))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProject$Builder builder id config]
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (.build builder))


(defn cfn-project-props-builder
  ""
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))