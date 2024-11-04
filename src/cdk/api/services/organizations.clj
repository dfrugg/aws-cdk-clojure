(ns cdk.api.services.organizations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.organizations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.organizations CfnAccount$Builder
                                                          CfnAccountProps$Builder
                                                          CfnOrganization$Builder
                                                          CfnOrganizationProps$Builder
                                                          CfnOrganizationalUnit$Builder
                                                          CfnOrganizationalUnitProps$Builder
                                                          CfnPolicy$Builder
                                                          CfnPolicyProps$Builder
                                                          CfnResourcePolicy$Builder
                                                          CfnResourcePolicyProps$Builder]))


(defn cfn-account-builder
  "The cfn-account-builder function buildes out new instances of 
CfnAccount$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `parentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:parent-ids` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccount$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-name)]
      (. builder accountName data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :parent-ids)]
      (. builder parentIds data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-account-props-builder
  "The cfn-account-props-builder function buildes out new instances of 
CfnAccountProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountName` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-name` |
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `parentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:parent-ids` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAccountProps$Builder.)]
    (when-let [data (lookup-entry config id :account-name)]
      (. builder accountName data))
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :parent-ids)]
      (. builder parentIds data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-organization-builder
  "The cfn-organization-builder function buildes out new instances of 
CfnOrganization$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-set` |"
  [stack id config]
  (let [builder (CfnOrganization$Builder/create stack id)]
    (when-let [data (lookup-entry config id :feature-set)]
      (. builder featureSet data))
    (.build builder)))


(defn cfn-organization-props-builder
  "The cfn-organization-props-builder function buildes out new instances of 
CfnOrganizationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-set` |"
  [stack id config]
  (let [builder (CfnOrganizationProps$Builder.)]
    (when-let [data (lookup-entry config id :feature-set)]
      (. builder featureSet data))
    (.build builder)))


(defn cfn-organizational-unit-builder
  "The cfn-organizational-unit-builder function buildes out new instances of 
CfnOrganizationalUnit$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOrganizationalUnit$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-id)]
      (. builder parentId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-organizational-unit-props-builder
  "The cfn-organizational-unit-props-builder function buildes out new instances of 
CfnOrganizationalUnitProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOrganizationalUnitProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-id)]
      (. builder parentId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-policy-builder
  "The cfn-policy-builder function buildes out new instances of 
CfnPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-ids)]
      (. builder targetIds data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-policy-props-builder
  "The cfn-policy-props-builder function buildes out new instances of 
CfnPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:target-ids` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-ids)]
      (. builder targetIds data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))