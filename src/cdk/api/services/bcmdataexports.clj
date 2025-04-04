(ns cdk.api.services.bcmdataexports
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.bcmdataexports package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.bcmdataexports CfnExport$Builder
                                                           CfnExport$DataQueryProperty$Builder
                                                           CfnExport$DestinationConfigurationsProperty$Builder
                                                           CfnExport$ExportProperty$Builder
                                                           CfnExport$RefreshCadenceProperty$Builder
                                                           CfnExport$ResourceTagProperty$Builder
                                                           CfnExport$S3DestinationProperty$Builder
                                                           CfnExport$S3OutputConfigurationsProperty$Builder
                                                           CfnExportProps$Builder]))


(defn cfn-export-builder>
  "The cfn-export-builder> function updates a CfnExport$Builder instance using the provided configuration.
  The function takes the CfnExport$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `export` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExport$Builder builder id config]
  (when-some [data (lookup-entry config id :export)]
    (. builder export data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-export-builder
  "Creates a  `CfnExport$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-export-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-export-builder> (CfnExport$Builder/create scope (name id)) id config))


(defn cfn-export-data-query-property-builder>
  "The cfn-export-data-query-property-builder> function updates a CfnExport$DataQueryProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$DataQueryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `tableConfigurations` | java.util.Map | [[cdk.support/lookup-entry]] | `:table-configurations` |
"
  [^CfnExport$DataQueryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :query-statement)]
    (. builder queryStatement data))
  (when-some [data (lookup-entry config id :table-configurations)]
    (. builder tableConfigurations data))
  (.build builder))


(defn cfn-export-data-query-property-builder
  "Creates a  `CfnExport$DataQueryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-data-query-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-data-query-property-builder> (new CfnExport$DataQueryProperty$Builder) id config))


(defn cfn-export-destination-configurations-property-builder>
  "The cfn-export-destination-configurations-property-builder> function updates a CfnExport$DestinationConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$DestinationConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Destination` | software.amazon.awscdk.services.bcmdataexports.CfnExport$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |
"
  [^CfnExport$DestinationConfigurationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (.build builder))


(defn cfn-export-destination-configurations-property-builder
  "Creates a  `CfnExport$DestinationConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-destination-configurations-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-destination-configurations-property-builder> (new CfnExport$DestinationConfigurationsProperty$Builder) id config))


(defn cfn-export-export-property-builder>
  "The cfn-export-export-property-builder> function updates a CfnExport$ExportProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$ExportProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataQuery` | software.amazon.awscdk.services.bcmdataexports.CfnExport$DataQueryProperty | [[cdk.support/lookup-entry]] | `:data-query` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configurations` |
| `exportArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `refreshCadence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:refresh-cadence` |
"
  [^CfnExport$ExportProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-query)]
    (. builder dataQuery data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-configurations)]
    (. builder destinationConfigurations data))
  (when-some [data (lookup-entry config id :export-arn)]
    (. builder exportArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :refresh-cadence)]
    (. builder refreshCadence data))
  (.build builder))


(defn cfn-export-export-property-builder
  "Creates a  `CfnExport$ExportProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-export-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-export-property-builder> (new CfnExport$ExportProperty$Builder) id config))


(defn cfn-export-props-builder>
  "The cfn-export-props-builder> function updates a CfnExportProps$Builder instance using the provided configuration.
  The function takes the CfnExportProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `export` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnExportProps$Builder builder id config]
  (when-some [data (lookup-entry config id :export)]
    (. builder export data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-export-props-builder
  "Creates a  `CfnExportProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-props-builder> (new CfnExportProps$Builder) id config))


(defn cfn-export-refresh-cadence-property-builder>
  "The cfn-export-refresh-cadence-property-builder> function updates a CfnExport$RefreshCadenceProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$RefreshCadenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
"
  [^CfnExport$RefreshCadenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (.build builder))


(defn cfn-export-refresh-cadence-property-builder
  "Creates a  `CfnExport$RefreshCadenceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-refresh-cadence-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-refresh-cadence-property-builder> (new CfnExport$RefreshCadenceProperty$Builder) id config))


(defn cfn-export-resource-tag-property-builder>
  "The cfn-export-resource-tag-property-builder> function updates a CfnExport$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnExport$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-export-resource-tag-property-builder
  "Creates a  `CfnExport$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-resource-tag-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-resource-tag-property-builder> (new CfnExport$ResourceTagProperty$Builder) id config))


(defn cfn-export-s3-destination-property-builder>
  "The cfn-export-s3-destination-property-builder> function updates a CfnExport$S3DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$S3DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3OutputConfigurations` | software.amazon.awscdk.services.bcmdataexports.CfnExport$S3OutputConfigurationsProperty | [[cdk.support/lookup-entry]] | `:s3-output-configurations` |
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
| `s3Region` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-region` |
"
  [^CfnExport$S3DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-output-configurations)]
    (. builder s3OutputConfigurations data))
  (when-some [data (lookup-entry config id :s3-prefix)]
    (. builder s3Prefix data))
  (when-some [data (lookup-entry config id :s3-region)]
    (. builder s3Region data))
  (.build builder))


(defn cfn-export-s3-destination-property-builder
  "Creates a  `CfnExport$S3DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-s3-destination-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-s3-destination-property-builder> (new CfnExport$S3DestinationProperty$Builder) id config))


(defn cfn-export-s3-output-configurations-property-builder>
  "The cfn-export-s3-output-configurations-property-builder> function updates a CfnExport$S3OutputConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnExport$S3OutputConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `outputType` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-type` |
| `overwrite` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite` |
"
  [^CfnExport$S3OutputConfigurationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :output-type)]
    (. builder outputType data))
  (when-some [data (lookup-entry config id :overwrite)]
    (. builder overwrite data))
  (.build builder))


(defn cfn-export-s3-output-configurations-property-builder
  "Creates a  `CfnExport$S3OutputConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-export-s3-output-configurations-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-export-s3-output-configurations-property-builder> (new CfnExport$S3OutputConfigurationsProperty$Builder) id config))