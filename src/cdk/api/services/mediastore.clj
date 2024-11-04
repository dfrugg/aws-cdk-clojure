(ns cdk.api.services.mediastore
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediastore package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediastore CfnContainer$Builder
                                                       CfnContainer$CorsRuleProperty$Builder
                                                       CfnContainer$MetricPolicyProperty$Builder
                                                       CfnContainer$MetricPolicyRuleProperty$Builder
                                                       CfnContainerProps$Builder]))


(defn cfn-container-builder
  "The cfn-container-builder function buildes out new instances of 
CfnContainer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-logging-enabled` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `corsPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors-policy` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `metricPolicy` | software.amazon.awscdk.services.mediastore.CfnContainer$MetricPolicyProperty | [[cdk.support/lookup-entry]] | `:metric-policy` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContainer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-logging-enabled)]
      (. builder accessLoggingEnabled data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cors-policy)]
      (. builder corsPolicy data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :metric-policy)]
      (. builder metricPolicy data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-container-cors-rule-property-builder
  "The cfn-container-cors-rule-property-builder function buildes out new instances of 
CfnContainer$CorsRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-headers` |
| `allowedMethods` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-methods` |
| `allowedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-origins` |
| `exposeHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:expose-headers` |
| `maxAgeSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-age-seconds` |"
  [stack id config]
  (let [builder (CfnContainer$CorsRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-headers)]
      (. builder allowedHeaders data))
    (when-let [data (lookup-entry config id :allowed-methods)]
      (. builder allowedMethods data))
    (when-let [data (lookup-entry config id :allowed-origins)]
      (. builder allowedOrigins data))
    (when-let [data (lookup-entry config id :expose-headers)]
      (. builder exposeHeaders data))
    (when-let [data (lookup-entry config id :max-age-seconds)]
      (. builder maxAgeSeconds data))
    (.build builder)))


(defn cfn-container-metric-policy-property-builder
  "The cfn-container-metric-policy-property-builder function buildes out new instances of 
CfnContainer$MetricPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerLevelMetrics` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-level-metrics` |
| `metricPolicyRules` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-policy-rules` |"
  [stack id config]
  (let [builder (CfnContainer$MetricPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-level-metrics)]
      (. builder containerLevelMetrics data))
    (when-let [data (lookup-entry config id :metric-policy-rules)]
      (. builder metricPolicyRules data))
    (.build builder)))


(defn cfn-container-metric-policy-rule-property-builder
  "The cfn-container-metric-policy-rule-property-builder function buildes out new instances of 
CfnContainer$MetricPolicyRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `objectGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-group` |
| `objectGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-group-name` |"
  [stack id config]
  (let [builder (CfnContainer$MetricPolicyRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :object-group)]
      (. builder objectGroup data))
    (when-let [data (lookup-entry config id :object-group-name)]
      (. builder objectGroupName data))
    (.build builder)))


(defn cfn-container-props-builder
  "The cfn-container-props-builder function buildes out new instances of 
CfnContainerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:access-logging-enabled` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `corsPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cors-policy` |
| `lifecyclePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:lifecycle-policy` |
| `metricPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-policy` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContainerProps$Builder.)]
    (when-let [data (lookup-entry config id :access-logging-enabled)]
      (. builder accessLoggingEnabled data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cors-policy)]
      (. builder corsPolicy data))
    (when-let [data (lookup-entry config id :lifecycle-policy)]
      (. builder lifecyclePolicy data))
    (when-let [data (lookup-entry config id :metric-policy)]
      (. builder metricPolicy data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))