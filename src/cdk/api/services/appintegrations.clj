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


(defn cfn-application-application-source-config-property-builder>
  "The cfn-application-application-source-config-property-builder> function updates a CfnApplication$ApplicationSourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ApplicationSourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `externalUrlConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:external-url-config` |
"
  [^CfnApplication$ApplicationSourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :external-url-config)]
    (. builder externalUrlConfig data))
  (.build builder))


(defn cfn-application-application-source-config-property-builder
  "Creates a  `CfnApplication$ApplicationSourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-application-source-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-application-source-config-property-builder> (new CfnApplication$ApplicationSourceConfigProperty$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSourceConfig` | software.amazon.awscdk.services.appintegrations.CfnApplication$ApplicationSourceConfigProperty | [[cdk.support/lookup-entry]] | `:application-source-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-source-config)]
    (. builder applicationSourceConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-application-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-external-url-config-property-builder>
  "The cfn-application-external-url-config-property-builder> function updates a CfnApplication$ExternalUrlConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$ExternalUrlConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-url` |
| `approvedOrigins` | java.util.List | [[cdk.support/lookup-entry]] | `:approved-origins` |
"
  [^CfnApplication$ExternalUrlConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-url)]
    (. builder accessUrl data))
  (when-some [data (lookup-entry config id :approved-origins)]
    (. builder approvedOrigins data))
  (.build builder))


(defn cfn-application-external-url-config-property-builder
  "Creates a  `CfnApplication$ExternalUrlConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-external-url-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-external-url-config-property-builder> (new CfnApplication$ExternalUrlConfigProperty$Builder) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationSourceConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-source-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-source-config)]
    (. builder applicationSourceConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-application-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-data-integration-builder>
  "The cfn-data-integration-builder> function updates a CfnDataIntegration$Builder instance using the provided configuration.
  The function takes the CfnDataIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-configuration` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:object-configuration` |
| `scheduleConfig` | software.amazon.awscdk.services.appintegrations.CfnDataIntegration$ScheduleConfigProperty | [[cdk.support/lookup-entry]] | `:schedule-config` |
| `sourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataIntegration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :file-configuration)]
    (. builder fileConfiguration data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :object-configuration)]
    (. builder objectConfiguration data))
  (when-some [data (lookup-entry config id :schedule-config)]
    (. builder scheduleConfig data))
  (when-some [data (lookup-entry config id :source-uri)]
    (. builder sourceUri data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-integration-builder
  "Creates a  `CfnDataIntegration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-data-integration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-data-integration-builder> (CfnDataIntegration$Builder/create scope (name id)) id config))


(defn cfn-data-integration-file-configuration-property-builder>
  "The cfn-data-integration-file-configuration-property-builder> function updates a CfnDataIntegration$FileConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDataIntegration$FileConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:filters` |
| `folders` | java.util.List | [[cdk.support/lookup-entry]] | `:folders` |
"
  [^CfnDataIntegration$FileConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :folders)]
    (. builder folders data))
  (.build builder))


(defn cfn-data-integration-file-configuration-property-builder
  "Creates a  `CfnDataIntegration$FileConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-data-integration-file-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-data-integration-file-configuration-property-builder> (new CfnDataIntegration$FileConfigurationProperty$Builder) id config))


(defn cfn-data-integration-props-builder>
  "The cfn-data-integration-props-builder> function updates a CfnDataIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnDataIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fileConfiguration` | software.amazon.awscdk.services.appintegrations.CfnDataIntegration$FileConfigurationProperty | [[cdk.support/lookup-entry]] | `:file-configuration` |
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `objectConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:object-configuration` |
| `scheduleConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule-config` |
| `sourceUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataIntegrationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :file-configuration)]
    (. builder fileConfiguration data))
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :object-configuration)]
    (. builder objectConfiguration data))
  (when-some [data (lookup-entry config id :schedule-config)]
    (. builder scheduleConfig data))
  (when-some [data (lookup-entry config id :source-uri)]
    (. builder sourceUri data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-data-integration-props-builder
  "Creates a  `CfnDataIntegrationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-data-integration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-data-integration-props-builder> (new CfnDataIntegrationProps$Builder) id config))


(defn cfn-data-integration-schedule-config-property-builder>
  "The cfn-data-integration-schedule-config-property-builder> function updates a CfnDataIntegration$ScheduleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDataIntegration$ScheduleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firstExecutionFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-execution-from` |
| `object` | java.lang.String | [[cdk.support/lookup-entry]] | `:object` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnDataIntegration$ScheduleConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :first-execution-from)]
    (. builder firstExecutionFrom data))
  (when-some [data (lookup-entry config id :object)]
    (. builder object data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-data-integration-schedule-config-property-builder
  "Creates a  `CfnDataIntegration$ScheduleConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-data-integration-schedule-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-data-integration-schedule-config-property-builder> (new CfnDataIntegration$ScheduleConfigProperty$Builder) id config))


(defn cfn-event-integration-builder>
  "The cfn-event-integration-builder> function updates a CfnEventIntegration$Builder instance using the provided configuration.
  The function takes the CfnEventIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeBus` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bridge-bus` |
| `eventFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventIntegration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-bridge-bus)]
    (. builder eventBridgeBus data))
  (when-some [data (lookup-entry config id :event-filter)]
    (. builder eventFilter data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-integration-builder
  "Creates a  `CfnEventIntegration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-event-integration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-event-integration-builder> (CfnEventIntegration$Builder/create scope (name id)) id config))


(defn cfn-event-integration-event-filter-property-builder>
  "The cfn-event-integration-event-filter-property-builder> function updates a CfnEventIntegration$EventFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnEventIntegration$EventFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnEventIntegration$EventFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-event-integration-event-filter-property-builder
  "Creates a  `CfnEventIntegration$EventFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-integration-event-filter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-integration-event-filter-property-builder> (new CfnEventIntegration$EventFilterProperty$Builder) id config))


(defn cfn-event-integration-props-builder>
  "The cfn-event-integration-props-builder> function updates a CfnEventIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnEventIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeBus` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-bridge-bus` |
| `eventFilter` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-filter` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventIntegrationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-bridge-bus)]
    (. builder eventBridgeBus data))
  (when-some [data (lookup-entry config id :event-filter)]
    (. builder eventFilter data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-integration-props-builder
  "Creates a  `CfnEventIntegrationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-integration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-integration-props-builder> (new CfnEventIntegrationProps$Builder) id config))