(ns cdk.api.services.appintegrations
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appintegrations package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.appintegrations CfnApplication$ApplicationSourceConfigProperty$Builder
                                                            CfnApplication$Builder
                                                            CfnApplication$ExternalUrlConfigProperty$Builder
                                                            CfnApplicationProps$Builder
                                                            CfnDataIntegration$Builder
                                                            CfnDataIntegration$FileConfigurationProperty$Builder
                                                            CfnDataIntegration$ScheduleConfigProperty$Builder
                                                            CfnDataIntegrationProps$Builder
                                                            CfnEventIntegration$Builder
                                                            CfnEventIntegration$EventFilterProperty$Builder
                                                            CfnEventIntegrationProps$Builder]))


(defn cfn-application-application-source-config-property-builder
  "The cfn-application-application-source-config-property-builder function buildes out new instances of 
CfnApplication$ApplicationSourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalUrlConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:external-url-config` |"
  [stack id config]
  (let [builder (CfnApplication$ApplicationSourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :external-url-config)]
      (. builder externalUrlConfig data))
    (.build builder)))


(defn cfn-application-builder
  "The cfn-application-builder function buildes out new instances of 
CfnApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSourceConfig` | software.amazon.awscdk.services.appintegrations.CfnApplication$ApplicationSourceConfigProperty | [[cdk.support/lookup-entry]] | `:application-source-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-source-config)]
      (. builder applicationSourceConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-external-url-config-property-builder
  "The cfn-application-external-url-config-property-builder function buildes out new instances of 
CfnApplication$ExternalUrlConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-url` |
| `approvedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:approved-origins` |"
  [stack id config]
  (let [builder (CfnApplication$ExternalUrlConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-url)]
      (. builder accessUrl data))
    (when-let [data (lookup-entry config id :approved-origins)]
      (. builder approvedOrigins data))
    (.build builder)))


(defn cfn-application-props-builder
  "The cfn-application-props-builder function buildes out new instances of 
CfnApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :application-source-config)]
      (. builder applicationSourceConfig data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-integration-builder
  "The cfn-data-integration-builder function buildes out new instances of 
CfnDataIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-configuration` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:object-configuration` |
| `scheduleConfig` | software.amazon.awscdk.services.appintegrations.CfnDataIntegration$ScheduleConfigProperty | [[cdk.support/lookup-entry]] | `:schedule-config` |
| `sourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataIntegration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :file-configuration)]
      (. builder fileConfiguration data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-configuration)]
      (. builder objectConfiguration data))
    (when-let [data (lookup-entry config id :schedule-config)]
      (. builder scheduleConfig data))
    (when-let [data (lookup-entry config id :source-uri)]
      (. builder sourceUri data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-integration-file-configuration-property-builder
  "The cfn-data-integration-file-configuration-property-builder function buildes out new instances of 
CfnDataIntegration$FileConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filters` |
| `folders` | java.util.List | [[cdk.support/lookup-entry]] | `:folders` |"
  [stack id config]
  (let [builder (CfnDataIntegration$FileConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :folders)]
      (. builder folders data))
    (.build builder)))


(defn cfn-data-integration-props-builder
  "The cfn-data-integration-props-builder function buildes out new instances of 
CfnDataIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileConfiguration` | software.amazon.awscdk.services.appintegrations.CfnDataIntegration$FileConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-configuration` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:object-configuration` |
| `scheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule-config` |
| `sourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :file-configuration)]
      (. builder fileConfiguration data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :object-configuration)]
      (. builder objectConfiguration data))
    (when-let [data (lookup-entry config id :schedule-config)]
      (. builder scheduleConfig data))
    (when-let [data (lookup-entry config id :source-uri)]
      (. builder sourceUri data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-data-integration-schedule-config-property-builder
  "The cfn-data-integration-schedule-config-property-builder function buildes out new instances of 
CfnDataIntegration$ScheduleConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstExecutionFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnDataIntegration$ScheduleConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :first-execution-from)]
      (. builder firstExecutionFrom data))
    (when-let [data (lookup-entry config id :object)]
      (. builder object data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-event-integration-builder
  "The cfn-event-integration-builder function buildes out new instances of 
CfnEventIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeBus` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bridge-bus` |
| `eventFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventIntegration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bridge-bus)]
      (. builder eventBridgeBus data))
    (when-let [data (lookup-entry config id :event-filter)]
      (. builder eventFilter data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-integration-event-filter-property-builder
  "The cfn-event-integration-event-filter-property-builder function buildes out new instances of 
CfnEventIntegration$EventFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnEventIntegration$EventFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-event-integration-props-builder
  "The cfn-event-integration-props-builder function buildes out new instances of 
CfnEventIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeBus` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bridge-bus` |
| `eventFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bridge-bus)]
      (. builder eventBridgeBus data))
    (when-let [data (lookup-entry config id :event-filter)]
      (. builder eventFilter data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))