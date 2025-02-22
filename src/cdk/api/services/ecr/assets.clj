(ns cdk.api.services.ecr.assets
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecr.assets package. "
  (:require [cdk.api :refer [ignore-mode
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ecr.assets DockerCacheOption$Builder
                                                       DockerImageAsset$Builder
                                                       DockerImageAssetInvalidationOptions$Builder
                                                       DockerImageAssetOptions$Builder
                                                       DockerImageAssetProps$Builder
                                                       TarballImageAsset$Builder
                                                       TarballImageAssetProps$Builder]))


(defn build-docker-cache-option-builder
  "The build-docker-cache-option-builder function updates a DockerCacheOption$Builder instance using the provided configuration.
  The function takes the DockerCacheOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^DockerCacheOption$Builder builder id config]
  (when-let [data (lookup-entry config id :params)]
    (. builder params data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-docker-image-asset-builder
  "The build-docker-image-asset-builder function updates a DockerImageAsset$Builder instance using the provided configuration.
  The function takes the DockerImageAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^DockerImageAsset$Builder builder id config]
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
  (.build builder))


(defn build-docker-image-asset-invalidation-options-builder
  "The build-docker-image-asset-invalidation-options-builder function updates a DockerImageAssetInvalidationOptions$Builder instance using the provided configuration.
  The function takes the DockerImageAssetInvalidationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:target` |
"
  [^DockerImageAssetInvalidationOptions$Builder builder id config]
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
  (.build builder))


(defn build-docker-image-asset-options-builder
  "The build-docker-image-asset-options-builder function updates a DockerImageAssetOptions$Builder instance using the provided configuration.
  The function takes the DockerImageAssetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^DockerImageAssetOptions$Builder builder id config]
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
  (.build builder))


(defn build-docker-image-asset-props-builder
  "The build-docker-image-asset-props-builder function updates a DockerImageAssetProps$Builder instance using the provided configuration.
  The function takes the DockerImageAssetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^DockerImageAssetProps$Builder builder id config]
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
  (.build builder))


(defn build-tarball-image-asset-builder
  "The build-tarball-image-asset-builder function updates a TarballImageAsset$Builder instance using the provided configuration.
  The function takes the TarballImageAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tarballFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:tarball-file` |
"
  [^TarballImageAsset$Builder builder id config]
  (when-let [data (lookup-entry config id :tarball-file)]
    (. builder tarballFile data))
  (.build builder))


(defn build-tarball-image-asset-props-builder
  "The build-tarball-image-asset-props-builder function updates a TarballImageAssetProps$Builder instance using the provided configuration.
  The function takes the TarballImageAssetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tarballFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:tarball-file` |
"
  [^TarballImageAssetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :tarball-file)]
    (. builder tarballFile data))
  (.build builder))