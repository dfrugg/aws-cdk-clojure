(ns cdk.api.services.codestar
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestar package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codestar CfnGitHubRepository$Builder
                                                     CfnGitHubRepository$CodeProperty$Builder
                                                     CfnGitHubRepository$S3Property$Builder
                                                     CfnGitHubRepositoryProps$Builder]))


(defn cfn-git-hub-repository-builder
  "The cfn-git-hub-repository-builder function buildes out new instances of 
CfnGitHubRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.codestar.CfnGitHubRepository$CodeProperty | [[cdk.support/lookup-entry]] | `:code` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `enableIssues` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-issues` |
| `isPrivate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-private` |
| `repositoryAccessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-token` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-owner` |"
  [stack id config]
  (let [builder (CfnGitHubRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :enable-issues)]
      (. builder enableIssues data))
    (when-let [data (lookup-entry config id :is-private)]
      (. builder isPrivate data))
    (when-let [data (lookup-entry config id :repository-access-token)]
      (. builder repositoryAccessToken data))
    (when-let [data (lookup-entry config id :repository-description)]
      (. builder repositoryDescription data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-owner)]
      (. builder repositoryOwner data))
    (.build builder)))


(defn cfn-git-hub-repository-code-property-builder
  "The cfn-git-hub-repository-code-property-builder function buildes out new instances of 
CfnGitHubRepository$CodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnGitHubRepository$CodeProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-git-hub-repository-props-builder
  "The cfn-git-hub-repository-props-builder function buildes out new instances of 
CfnGitHubRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `enableIssues` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-issues` |
| `isPrivate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-private` |
| `repositoryAccessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-token` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-owner` |"
  [stack id config]
  (let [builder (CfnGitHubRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (when-let [data (lookup-entry config id :enable-issues)]
      (. builder enableIssues data))
    (when-let [data (lookup-entry config id :is-private)]
      (. builder isPrivate data))
    (when-let [data (lookup-entry config id :repository-access-token)]
      (. builder repositoryAccessToken data))
    (when-let [data (lookup-entry config id :repository-description)]
      (. builder repositoryDescription data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :repository-owner)]
      (. builder repositoryOwner data))
    (.build builder)))


(defn cfn-git-hub-repository-s3-property-builder
  "The cfn-git-hub-repository-s3-property-builder function buildes out new instances of 
CfnGitHubRepository$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |"
  [stack id config]
  (let [builder (CfnGitHubRepository$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (.build builder)))