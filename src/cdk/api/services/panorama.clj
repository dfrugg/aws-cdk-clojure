(ns cdk.api.services.panorama
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.panorama package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.panorama CfnApplicationInstance$Builder
                                                     CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder
                                                     CfnApplicationInstance$ManifestPayloadProperty$Builder
                                                     CfnApplicationInstanceProps$Builder
                                                     CfnPackage$Builder
                                                     CfnPackage$StorageLocationProperty$Builder
                                                     CfnPackageProps$Builder
                                                     CfnPackageVersion$Builder
                                                     CfnPackageVersionProps$Builder]))


(defn cfn-application-instance-builder>
  "The cfn-application-instance-builder> function updates a CfnApplicationInstance$Builder instance using the provided configuration.
  The function takes the CfnApplicationInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationInstanceIdToReplace` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-instance-id-to-replace` |
| `defaultRuntimeContextDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-runtime-context-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `manifestOverridesPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestOverridesPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-overrides-payload` |
| `manifestPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-payload` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :application-instance-id-to-replace)]
    (. builder applicationInstanceIdToReplace data))
  (when-some [data (lookup-entry config id :default-runtime-context-device)]
    (. builder defaultRuntimeContextDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :manifest-overrides-payload)]
    (. builder manifestOverridesPayload data))
  (when-some [data (lookup-entry config id :manifest-payload)]
    (. builder manifestPayload data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :runtime-role-arn)]
    (. builder runtimeRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-instance-builder
  "Creates a  `CfnApplicationInstance$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-application-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-instance-builder> (CfnApplicationInstance$Builder/create scope (name id)) id config))


(defn cfn-application-instance-manifest-overrides-payload-property-builder>
  "The cfn-application-instance-manifest-overrides-payload-property-builder> function updates a CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadData` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-data` |
"
  [^CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :payload-data)]
    (. builder payloadData data))
  (.build builder))


(defn cfn-application-instance-manifest-overrides-payload-property-builder
  "Creates a  `CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-instance-manifest-overrides-payload-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-instance-manifest-overrides-payload-property-builder> (new CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder) id config))


(defn cfn-application-instance-manifest-payload-property-builder>
  "The cfn-application-instance-manifest-payload-property-builder> function updates a CfnApplicationInstance$ManifestPayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationInstance$ManifestPayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadData` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-data` |
"
  [^CfnApplicationInstance$ManifestPayloadProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :payload-data)]
    (. builder payloadData data))
  (.build builder))


(defn cfn-application-instance-manifest-payload-property-builder
  "Creates a  `CfnApplicationInstance$ManifestPayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-instance-manifest-payload-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-instance-manifest-payload-property-builder> (new CfnApplicationInstance$ManifestPayloadProperty$Builder) id config))


(defn cfn-application-instance-props-builder>
  "The cfn-application-instance-props-builder> function updates a CfnApplicationInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationInstanceIdToReplace` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-instance-id-to-replace` |
| `defaultRuntimeContextDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-runtime-context-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `manifestOverridesPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestOverridesPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-overrides-payload` |
| `manifestPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-payload` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-instance-id-to-replace)]
    (. builder applicationInstanceIdToReplace data))
  (when-some [data (lookup-entry config id :default-runtime-context-device)]
    (. builder defaultRuntimeContextDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :manifest-overrides-payload)]
    (. builder manifestOverridesPayload data))
  (when-some [data (lookup-entry config id :manifest-payload)]
    (. builder manifestPayload data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :runtime-role-arn)]
    (. builder runtimeRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-instance-props-builder
  "Creates a  `CfnApplicationInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-instance-props-builder> (new CfnApplicationInstanceProps$Builder) id config))


(defn cfn-package-builder>
  "The cfn-package-builder> function updates a CfnPackage$Builder instance using the provided configuration.
  The function takes the CfnPackage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackage$Builder builder id config]
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-package-builder
  "Creates a  `CfnPackage$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-package-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-package-builder> (CfnPackage$Builder/create scope (name id)) id config))


(defn cfn-package-props-builder>
  "The cfn-package-props-builder> function updates a CfnPackageProps$Builder instance using the provided configuration.
  The function takes the CfnPackageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `storageLocation` | software.amazon.awscdk.services.panorama.CfnPackage$StorageLocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPackageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-package-props-builder
  "Creates a  `CfnPackageProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-package-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-package-props-builder> (new CfnPackageProps$Builder) id config))


(defn cfn-package-storage-location-property-builder>
  "The cfn-package-storage-location-property-builder> function updates a CfnPackage$StorageLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnPackage$StorageLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `binaryPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:binary-prefix-location` |
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `generatedPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-prefix-location` |
| `manifestPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-prefix-location` |
| `repoPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo-prefix-location` |
"
  [^CfnPackage$StorageLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :binary-prefix-location)]
    (. builder binaryPrefixLocation data))
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :generated-prefix-location)]
    (. builder generatedPrefixLocation data))
  (when-some [data (lookup-entry config id :manifest-prefix-location)]
    (. builder manifestPrefixLocation data))
  (when-some [data (lookup-entry config id :repo-prefix-location)]
    (. builder repoPrefixLocation data))
  (.build builder))


(defn cfn-package-storage-location-property-builder
  "Creates a  `CfnPackage$StorageLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-package-storage-location-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-package-storage-location-property-builder> (new CfnPackage$StorageLocationProperty$Builder) id config))


(defn cfn-package-version-builder>
  "The cfn-package-version-builder> function updates a CfnPackageVersion$Builder instance using the provided configuration.
  The function takes the CfnPackageVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `markLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mark-latest` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `packageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-id` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `patchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:patch-version` |
| `updatedLatestPatchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:updated-latest-patch-version` |
"
  [^CfnPackageVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :mark-latest)]
    (. builder markLatest data))
  (when-some [data (lookup-entry config id :owner-account)]
    (. builder ownerAccount data))
  (when-some [data (lookup-entry config id :package-id)]
    (. builder packageId data))
  (when-some [data (lookup-entry config id :package-version)]
    (. builder packageVersion data))
  (when-some [data (lookup-entry config id :patch-version)]
    (. builder patchVersion data))
  (when-some [data (lookup-entry config id :updated-latest-patch-version)]
    (. builder updatedLatestPatchVersion data))
  (.build builder))


(defn cfn-package-version-builder
  "Creates a  `CfnPackageVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-package-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-package-version-builder> (CfnPackageVersion$Builder/create scope (name id)) id config))


(defn cfn-package-version-props-builder>
  "The cfn-package-version-props-builder> function updates a CfnPackageVersionProps$Builder instance using the provided configuration.
  The function takes the CfnPackageVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `markLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mark-latest` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `packageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-id` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `patchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:patch-version` |
| `updatedLatestPatchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:updated-latest-patch-version` |
"
  [^CfnPackageVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :mark-latest)]
    (. builder markLatest data))
  (when-some [data (lookup-entry config id :owner-account)]
    (. builder ownerAccount data))
  (when-some [data (lookup-entry config id :package-id)]
    (. builder packageId data))
  (when-some [data (lookup-entry config id :package-version)]
    (. builder packageVersion data))
  (when-some [data (lookup-entry config id :patch-version)]
    (. builder patchVersion data))
  (when-some [data (lookup-entry config id :updated-latest-patch-version)]
    (. builder updatedLatestPatchVersion data))
  (.build builder))


(defn cfn-package-version-props-builder
  "Creates a  `CfnPackageVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-package-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-package-version-props-builder> (new CfnPackageVersionProps$Builder) id config))