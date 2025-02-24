(ns cdk.api.services.cur
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cur package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cur CfnReportDefinition$Builder
                                                CfnReportDefinitionProps$Builder]))


(defn build-cfn-report-definition-builder
  "The build-cfn-report-definition-builder function updates a CfnReportDefinition$Builder instance using the provided configuration.
  The function takes the CfnReportDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-artifacts` |
| `additionalSchemaElements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-schema-elements` |
| `billingViewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-view-arn` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `refreshClosedReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:refresh-closed-reports` |
| `reportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-name` |
| `reportVersioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-versioning` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
| `s3Region` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-region` |
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |
"
  [^CfnReportDefinition$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-artifacts)]
    (. builder additionalArtifacts data))
  (when-let [data (lookup-entry config id :additional-schema-elements)]
    (. builder additionalSchemaElements data))
  (when-let [data (lookup-entry config id :billing-view-arn)]
    (. builder billingViewArn data))
  (when-let [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :refresh-closed-reports)]
    (. builder refreshClosedReports data))
  (when-let [data (lookup-entry config id :report-name)]
    (. builder reportName data))
  (when-let [data (lookup-entry config id :report-versioning)]
    (. builder reportVersioning data))
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-prefix)]
    (. builder s3Prefix data))
  (when-let [data (lookup-entry config id :s3-region)]
    (. builder s3Region data))
  (when-let [data (lookup-entry config id :time-unit)]
    (. builder timeUnit data))
  (.build builder))


(defn cfn-report-definition-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-report-definition-builder (CfnReportDefinition$Builder/create scope (name id)) id config))


(defn build-cfn-report-definition-props-builder
  "The build-cfn-report-definition-props-builder function updates a CfnReportDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnReportDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalArtifacts` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-artifacts` |
| `additionalSchemaElements` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-schema-elements` |
| `billingViewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-view-arn` |
| `compression` | java.lang.String | [[cdk.support/lookup-entry]] | `:compression` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `refreshClosedReports` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:refresh-closed-reports` |
| `reportName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-name` |
| `reportVersioning` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-versioning` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
| `s3Region` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-region` |
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |
"
  [^CfnReportDefinitionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :additional-artifacts)]
    (. builder additionalArtifacts data))
  (when-let [data (lookup-entry config id :additional-schema-elements)]
    (. builder additionalSchemaElements data))
  (when-let [data (lookup-entry config id :billing-view-arn)]
    (. builder billingViewArn data))
  (when-let [data (lookup-entry config id :compression)]
    (. builder compression data))
  (when-let [data (lookup-entry config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :refresh-closed-reports)]
    (. builder refreshClosedReports data))
  (when-let [data (lookup-entry config id :report-name)]
    (. builder reportName data))
  (when-let [data (lookup-entry config id :report-versioning)]
    (. builder reportVersioning data))
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-prefix)]
    (. builder s3Prefix data))
  (when-let [data (lookup-entry config id :s3-region)]
    (. builder s3Region data))
  (when-let [data (lookup-entry config id :time-unit)]
    (. builder timeUnit data))
  (.build builder))


(defn cfn-report-definition-props-builder
  ""
  [id config]
  (build-cfn-report-definition-props-builder (new CfnReportDefinitionProps$Builder) id config))