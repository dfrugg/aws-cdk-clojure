(ns cdk.api.services.ecr.assets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecr.assets package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [ignore-mode
                             symlink-follow-mode]])
  (:import [software.amazon.awscdk.services.ecr.assets DockerCacheOption$Builder
                                                       DockerImageAsset$Builder
                                                       DockerImageAssetInvalidationOptions$Builder
                                                       DockerImageAssetOptions$Builder
                                                       DockerImageAssetProps$Builder
                                                       TarballImageAsset$Builder
                                                       TarballImageAssetProps$Builder]))


(defn docker-cache-option-builder
  "The docker-cache-option-builder function buildes out new instances of 
DockerCacheOption$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (DockerCacheOption$Builder.)]
    (when-let [data (lookup-entry config id :params)]
      (. builder params data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn docker-image-asset-builder
  "The docker-image-asset-builder function buildes out new instances of 
DockerImageAsset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (DockerImageAsset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :cache-disabled)]
      (. builder cacheDisabled data))
    (when-let [data (lookup-entry config id :cache-from)]
      (. builder cacheFrom data))
    (when-let [data (lookup-entry config id :cache-to)]
      (. builder cacheTo data))
    (when-let [data (lookup-entry config id :directory)]
      (. builder directory data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :invalidation)]
      (. builder invalidation data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn docker-image-asset-invalidation-options-builder
  "The docker-image-asset-invalidation-options-builder function buildes out new instances of 
DockerImageAssetInvalidationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildArgs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `extraHash` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:file` |
| `networkMode` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:platform` |
| `repositoryName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:repository-name` |
| `target` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (DockerImageAssetInvalidationOptions$Builder.)]
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn docker-image-asset-options-builder
  "The docker-image-asset-options-builder function buildes out new instances of 
DockerImageAssetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (DockerImageAssetOptions$Builder.)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :cache-disabled)]
      (. builder cacheDisabled data))
    (when-let [data (lookup-entry config id :cache-from)]
      (. builder cacheFrom data))
    (when-let [data (lookup-entry config id :cache-to)]
      (. builder cacheTo data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :invalidation)]
      (. builder invalidation data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn docker-image-asset-props-builder
  "The docker-image-asset-props-builder function buildes out new instances of 
DockerImageAssetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.services.ecr.assets.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `extraHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:extra-hash` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `invalidation` | software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions | [[cdk.support/lookup-entry]] | `:invalidation` |
| `networkMode` | software.amazon.awscdk.services.ecr.assets.NetworkMode | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `platform` | software.amazon.awscdk.services.ecr.assets.Platform | [[cdk.support/lookup-entry]] | `:platform` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (DockerImageAssetProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :build-args)]
      (. builder buildArgs data))
    (when-let [data (lookup-entry config id :build-secrets)]
      (. builder buildSecrets data))
    (when-let [data (lookup-entry config id :build-ssh)]
      (. builder buildSsh data))
    (when-let [data (lookup-entry config id :cache-disabled)]
      (. builder cacheDisabled data))
    (when-let [data (lookup-entry config id :cache-from)]
      (. builder cacheFrom data))
    (when-let [data (lookup-entry config id :cache-to)]
      (. builder cacheTo data))
    (when-let [data (lookup-entry config id :directory)]
      (. builder directory data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (lookup-entry config id :extra-hash)]
      (. builder extraHash data))
    (when-let [data (lookup-entry config id :file)]
      (. builder file data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :invalidation)]
      (. builder invalidation data))
    (when-let [data (lookup-entry config id :network-mode)]
      (. builder networkMode data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn tarball-image-asset-builder
  "The tarball-image-asset-builder function buildes out new instances of 
TarballImageAsset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tarballFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:tarball-file` |"
  [stack id config]
  (let [builder (TarballImageAsset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tarball-file)]
      (. builder tarballFile data))
    (.build builder)))


(defn tarball-image-asset-props-builder
  "The tarball-image-asset-props-builder function buildes out new instances of 
TarballImageAssetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tarballFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:tarball-file` |"
  [stack id config]
  (let [builder (TarballImageAssetProps$Builder.)]
    (when-let [data (lookup-entry config id :tarball-file)]
      (. builder tarballFile data))
    (.build builder)))