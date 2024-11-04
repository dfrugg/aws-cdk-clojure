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


(defn cfn-export-builder
  "The cfn-export-builder function buildes out new instances of 
CfnExport$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `export` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExport$Builder/create stack id)]
    (when-let [data (lookup-entry config id :export)]
      (. builder export data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-export-data-query-property-builder
  "The cfn-export-data-query-property-builder function buildes out new instances of 
CfnExport$DataQueryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queryStatement` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-statement` |
| `tableConfigurations` | java.util.Map | [[cdk.support/lookup-entry]] | `:table-configurations` |"
  [stack id config]
  (let [builder (CfnExport$DataQueryProperty$Builder.)]
    (when-let [data (lookup-entry config id :query-statement)]
      (. builder queryStatement data))
    (when-let [data (lookup-entry config id :table-configurations)]
      (. builder tableConfigurations data))
    (.build builder)))


(defn cfn-export-destination-configurations-property-builder
  "The cfn-export-destination-configurations-property-builder function buildes out new instances of 
CfnExport$DestinationConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Destination` | software.amazon.awscdk.services.bcmdataexports.CfnExport$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |"
  [stack id config]
  (let [builder (CfnExport$DestinationConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-destination)]
      (. builder s3Destination data))
    (.build builder)))


(defn cfn-export-export-property-builder
  "The cfn-export-export-property-builder function buildes out new instances of 
CfnExport$ExportProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataQuery` | software.amazon.awscdk.services.bcmdataexports.CfnExport$DataQueryProperty | [[cdk.support/lookup-entry]] | `:data-query` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configurations` |
| `exportArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:export-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `refreshCadence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:refresh-cadence` |"
  [stack id config]
  (let [builder (CfnExport$ExportProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-query)]
      (. builder dataQuery data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-configurations)]
      (. builder destinationConfigurations data))
    (when-let [data (lookup-entry config id :export-arn)]
      (. builder exportArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :refresh-cadence)]
      (. builder refreshCadence data))
    (.build builder)))


(defn cfn-export-props-builder
  "The cfn-export-props-builder function buildes out new instances of 
CfnExportProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `export` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnExportProps$Builder.)]
    (when-let [data (lookup-entry config id :export)]
      (. builder export data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-export-refresh-cadence-property-builder
  "The cfn-export-refresh-cadence-property-builder function buildes out new instances of 
CfnExport$RefreshCadenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |"
  [stack id config]
  (let [builder (CfnExport$RefreshCadenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :frequency)]
      (. builder frequency data))
    (.build builder)))


(defn cfn-export-resource-tag-property-builder
  "The cfn-export-resource-tag-property-builder function buildes out new instances of 
CfnExport$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnExport$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-export-s3-destination-property-builder
  "The cfn-export-s3-destination-property-builder function buildes out new instances of 
CfnExport$S3DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3OutputConfigurations` | software.amazon.awscdk.services.bcmdataexports.CfnExport$S3OutputConfigurationsProperty | [[cdk.support/lookup-entry]] | `:s3-output-configurations` |
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
| `s3Region` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-region` |"
  [stack id config]
  (let [builder (CfnExport$S3DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-output-configurations)]
      (. builder s3OutputConfigurations data))
    (when-let [data (lookup-entry config id :s3-prefix)]
      (. builder s3Prefix data))
    (when-let [data (lookup-entry config id :s3-region)]
      (. builder s3Region data))
    (.build builder)))


(defn cfn-export-s3-output-configurations-property-builder
  "The cfn-export-s3-output-configurations-property-builder function buildes out new instances of 
CfnExport$S3OutputConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `outputType` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-type` |
| `overwrite` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite` |"
  [stack id config]
  (let [builder (CfnExport$S3OutputConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :compression)]
      (. builder compression data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :output-type)]
      (. builder outputType data))
    (when-let [data (lookup-entry config id :overwrite)]
      (. builder overwrite data))
    (.build builder)))