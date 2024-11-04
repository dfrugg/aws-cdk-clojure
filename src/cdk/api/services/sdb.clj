(ns cdk.api.services.sdb
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sdb package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sdb CfnDomain$Builder
                                                CfnDomainProps$Builder]))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))