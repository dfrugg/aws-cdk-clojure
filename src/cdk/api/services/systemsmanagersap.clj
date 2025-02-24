(ns cdk.api.services.systemsmanagersap
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.systemsmanagersap package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.systemsmanagersap CfnApplication$Builder
                                                              CfnApplication$CredentialProperty$Builder
                                                              CfnApplicationProps$Builder]))


(defn build-cfn-application-builder
  "The build-cfn-application-builder function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `applicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-type` |
| `credentials` | java.util.List | [[cdk.support/lookup-entry]] | `:credentials` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `sapInstanceNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:sap-instance-number` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
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
  (.build builder))


(defn cfn-application-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-application-builder (CfnApplication$Builder/create scope (name id)) id config))


(defn build-cfn-application-credential-property-builder
  "The build-cfn-application-credential-property-builder function updates a CfnApplication$CredentialProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$CredentialProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialType` | java.lang.String | [[cdk.support/lookup-entry]] | `:credential-type` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnApplication$CredentialProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :credential-type)]
    (. builder credentialType data))
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn cfn-application-credential-property-builder
  ""
  [id config]
  (build-cfn-application-credential-property-builder (new CfnApplication$CredentialProperty$Builder) id config))


(defn build-cfn-application-props-builder
  "The build-cfn-application-props-builder function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `applicationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-type` |
| `credentials` | java.util.List | [[cdk.support/lookup-entry]] | `:credentials` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `sapInstanceNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:sap-instance-number` |
| `sid` | java.lang.String | [[cdk.support/lookup-entry]] | `:sid` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-application-props-builder
  ""
  [id config]
  (build-cfn-application-props-builder (new CfnApplicationProps$Builder) id config))