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


(defn cfn-application-instance-builder
  "The cfn-application-instance-builder function buildes out new instances of 
CfnApplicationInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationInstanceIdToReplace` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-instance-id-to-replace` |
| `defaultRuntimeContextDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-runtime-context-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `manifestOverridesPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestOverridesPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-overrides-payload` |
| `manifestPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-payload` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-instance-id-to-replace)]
      (. builder applicationInstanceIdToReplace data))
    (when-let [data (lookup-entry config id :default-runtime-context-device)]
      (. builder defaultRuntimeContextDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :manifest-overrides-payload)]
      (. builder manifestOverridesPayload data))
    (when-let [data (lookup-entry config id :manifest-payload)]
      (. builder manifestPayload data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-role-arn)]
      (. builder runtimeRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-instance-manifest-overrides-payload-property-builder
  "The cfn-application-instance-manifest-overrides-payload-property-builder function buildes out new instances of 
CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadData` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-data` |"
  [stack id config]
  (let [builder (CfnApplicationInstance$ManifestOverridesPayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload-data)]
      (. builder payloadData data))
    (.build builder)))


(defn cfn-application-instance-manifest-payload-property-builder
  "The cfn-application-instance-manifest-payload-property-builder function buildes out new instances of 
CfnApplicationInstance$ManifestPayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadData` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-data` |"
  [stack id config]
  (let [builder (CfnApplicationInstance$ManifestPayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload-data)]
      (. builder payloadData data))
    (.build builder)))


(defn cfn-application-instance-props-builder
  "The cfn-application-instance-props-builder function buildes out new instances of 
CfnApplicationInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationInstanceIdToReplace` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-instance-id-to-replace` |
| `defaultRuntimeContextDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-runtime-context-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `manifestOverridesPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestOverridesPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-overrides-payload` |
| `manifestPayload` | software.amazon.awscdk.services.panorama.CfnApplicationInstance$ManifestPayloadProperty | [[cdk.support/lookup-entry]] | `:manifest-payload` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :application-instance-id-to-replace)]
      (. builder applicationInstanceIdToReplace data))
    (when-let [data (lookup-entry config id :default-runtime-context-device)]
      (. builder defaultRuntimeContextDevice data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :manifest-overrides-payload)]
      (. builder manifestOverridesPayload data))
    (when-let [data (lookup-entry config id :manifest-payload)]
      (. builder manifestPayload data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-role-arn)]
      (. builder runtimeRoleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-builder
  "The cfn-package-builder function buildes out new instances of 
CfnPackage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :package-name)]
      (. builder packageName data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-props-builder
  "The cfn-package-props-builder function buildes out new instances of 
CfnPackageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `storageLocation` | software.amazon.awscdk.services.panorama.CfnPackage$StorageLocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPackageProps$Builder.)]
    (when-let [data (lookup-entry config id :package-name)]
      (. builder packageName data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-package-storage-location-property-builder
  "The cfn-package-storage-location-property-builder function buildes out new instances of 
CfnPackage$StorageLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `binaryPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:binary-prefix-location` |
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `generatedPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-prefix-location` |
| `manifestPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-prefix-location` |
| `repoPrefixLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:repo-prefix-location` |"
  [stack id config]
  (let [builder (CfnPackage$StorageLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :binary-prefix-location)]
      (. builder binaryPrefixLocation data))
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :generated-prefix-location)]
      (. builder generatedPrefixLocation data))
    (when-let [data (lookup-entry config id :manifest-prefix-location)]
      (. builder manifestPrefixLocation data))
    (when-let [data (lookup-entry config id :repo-prefix-location)]
      (. builder repoPrefixLocation data))
    (.build builder)))


(defn cfn-package-version-builder
  "The cfn-package-version-builder function buildes out new instances of 
CfnPackageVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `markLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mark-latest` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `packageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-id` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `patchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:patch-version` |
| `updatedLatestPatchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:updated-latest-patch-version` |"
  [stack id config]
  (let [builder (CfnPackageVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :mark-latest)]
      (. builder markLatest data))
    (when-let [data (lookup-entry config id :owner-account)]
      (. builder ownerAccount data))
    (when-let [data (lookup-entry config id :package-id)]
      (. builder packageId data))
    (when-let [data (lookup-entry config id :package-version)]
      (. builder packageVersion data))
    (when-let [data (lookup-entry config id :patch-version)]
      (. builder patchVersion data))
    (when-let [data (lookup-entry config id :updated-latest-patch-version)]
      (. builder updatedLatestPatchVersion data))
    (.build builder)))


(defn cfn-package-version-props-builder
  "The cfn-package-version-props-builder function buildes out new instances of 
CfnPackageVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `markLatest` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mark-latest` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `packageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-id` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `patchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:patch-version` |
| `updatedLatestPatchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:updated-latest-patch-version` |"
  [stack id config]
  (let [builder (CfnPackageVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :mark-latest)]
      (. builder markLatest data))
    (when-let [data (lookup-entry config id :owner-account)]
      (. builder ownerAccount data))
    (when-let [data (lookup-entry config id :package-id)]
      (. builder packageId data))
    (when-let [data (lookup-entry config id :package-version)]
      (. builder packageVersion data))
    (when-let [data (lookup-entry config id :patch-version)]
      (. builder patchVersion data))
    (when-let [data (lookup-entry config id :updated-latest-patch-version)]
      (. builder updatedLatestPatchVersion data))
    (.build builder)))