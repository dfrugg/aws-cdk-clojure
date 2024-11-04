(ns cdk.api.services.lookoutvision
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lookoutvision package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lookoutvision CfnProject$Builder
                                                          CfnProjectProps$Builder]))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (.build builder)))