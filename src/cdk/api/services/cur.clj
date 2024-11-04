(ns cdk.api.services.cur
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cur package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cur CfnReportDefinition$Builder
                                                CfnReportDefinitionProps$Builder]))


(defn cfn-report-definition-builder
  "The cfn-report-definition-builder function buildes out new instances of 
CfnReportDefinition$Builder using the provided configuration.  Each field is set as follows:

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
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |"
  [stack id config]
  (let [builder (CfnReportDefinition$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-report-definition-props-builder
  "The cfn-report-definition-props-builder function buildes out new instances of 
CfnReportDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-unit` |"
  [stack id config]
  (let [builder (CfnReportDefinitionProps$Builder.)]
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
    (.build builder)))