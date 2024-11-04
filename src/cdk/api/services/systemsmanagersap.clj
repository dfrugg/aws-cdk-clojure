(ns cdk.api.services.systemsmanagersap
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.systemsmanagersap package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.systemsmanagersap CfnApplication$Builder
                                                              CfnApplication$CredentialProperty$Builder
                                                              CfnApplicationProps$Builder]))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `applicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-type` |
| `credentials` | java.util.List | [[cdk.support/lookup-entry]] | `:credentials` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `sapInstanceNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:sap-instance-number` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :application-type)]
      (. builder applicationType data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :sap-instance-number)]
      (. builder sapInstanceNumber data))
    (when-let [data (lookup-entry config id :sid)]
      (. builder sid data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-credential-property-builder
  "The cfn-application-credential-property-builder function buildes out new instances of 
CfnApplication$CredentialProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialType` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-type` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |"
  [stack id config]
  (let [builder (CfnApplication$CredentialProperty$Builder.)]
    (when-let [data (lookup-entry config id :credential-type)]
      (. builder credentialType data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `applicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-type` |
| `credentials` | java.util.List | [[cdk.support/lookup-entry]] | `:credentials` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `sapInstanceNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:sap-instance-number` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :application-type)]
      (. builder applicationType data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :sap-instance-number)]
      (. builder sapInstanceNumber data))
    (when-let [data (lookup-entry config id :sid)]
      (. builder sid data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))