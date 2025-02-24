(ns cdk.api.services.codestar
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestar package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codestar CfnGitHubRepository$Builder
                                                     CfnGitHubRepository$CodeProperty$Builder
                                                     CfnGitHubRepository$S3Property$Builder
                                                     CfnGitHubRepositoryProps$Builder]))


(defn build-cfn-git-hub-repository-builder
  "The build-cfn-git-hub-repository-builder function updates a CfnGitHubRepository$Builder instance using the provided configuration.
  The function takes the CfnGitHubRepository$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.codestar.CfnGitHubRepository$CodeProperty | [[cdk.support/lookup-entry]] | `:code` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `enableIssues` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-issues` |
| `isPrivate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-private` |
| `repositoryAccessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-token` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-owner` |
"
  [^CfnGitHubRepository$Builder builder id config]
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
  (.build builder))


(defn cfn-git-hub-repository-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-git-hub-repository-builder (CfnGitHubRepository$Builder/create scope (name id)) id config))


(defn build-cfn-git-hub-repository-code-property-builder
  "The build-cfn-git-hub-repository-code-property-builder function updates a CfnGitHubRepository$CodeProperty$Builder instance using the provided configuration.
  The function takes the CfnGitHubRepository$CodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnGitHubRepository$CodeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-git-hub-repository-code-property-builder
  ""
  [id config]
  (build-cfn-git-hub-repository-code-property-builder (new CfnGitHubRepository$CodeProperty$Builder) id config))


(defn build-cfn-git-hub-repository-props-builder
  "The build-cfn-git-hub-repository-props-builder function updates a CfnGitHubRepositoryProps$Builder instance using the provided configuration.
  The function takes the CfnGitHubRepositoryProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
| `enableIssues` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-issues` |
| `isPrivate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-private` |
| `repositoryAccessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-access-token` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `repositoryOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-owner` |
"
  [^CfnGitHubRepositoryProps$Builder builder id config]
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
  (.build builder))


(defn cfn-git-hub-repository-props-builder
  ""
  [id config]
  (build-cfn-git-hub-repository-props-builder (new CfnGitHubRepositoryProps$Builder) id config))


(defn build-cfn-git-hub-repository-s3-property-builder
  "The build-cfn-git-hub-repository-s3-property-builder function updates a CfnGitHubRepository$S3Property$Builder instance using the provided configuration.
  The function takes the CfnGitHubRepository$S3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
"
  [^CfnGitHubRepository$S3Property$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (.build builder))


(defn cfn-git-hub-repository-s3-property-builder
  ""
  [id config]
  (build-cfn-git-hub-repository-s3-property-builder (new CfnGitHubRepository$S3Property$Builder) id config))